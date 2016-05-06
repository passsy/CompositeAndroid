import java.io.File


fun parseJavaFile(file: File): AnalyzedJavaFile {
    val source = file.readText()

    val importMatches = "(?:import.*;)"
            .toRegex(RegexOption.MULTILINE)
            .findAll(source)

    val builder = StringBuilder();
    for (match in importMatches.iterator()) {
        val groups = match.groups
        if (groups.size > 0) {
            builder.append(groups[0]?.value?.trim())
            builder.append("\n")
        }
    }
    val imports = builder.toString()


    // findAll runs out of memory
    val matches = mutableListOf<MatchResult>();
    var pos = 0
    while (true) {
        val methodsMatch = "(?:\n*?((?:\\h*?\\/\\*\\*\\h*[\\w@]*\n*){1}(?:\\h*\\*.*\n*)*?(?:\\h*\\*\\/){1})\n)*((?:^\\h*\\@.*\n)*?)?\\h*((?:\\w* )*)([\\w\\.]*(?:\\[\\])?) (\\w*)\\(((?:\n*[^\\)]*)*)\\)([^\\{]*)\\{((?:.*\n)(?:\n*(?:        .*\n))*)\\    \\}\n*"
                .toRegex(RegexOption.MULTILINE)
                .find(source, pos);

        if (methodsMatch == null) {
            break;
        }
        matches.add(methodsMatch);
        pos = methodsMatch.range.last
    }


    val methods = mutableListOf<AnalyzedJavaMethod>();

    for (match in matches) {
        val groups = match.groups

        val javadoc = groups[1]?.value
        val annotations = groups[2]?.value
        val visibility = groups[3]?.value ?: ""
        val returnType = groups[4]?.value!!
        val name = groups[5]?.value!!
        val parameters = groups[6]?.value?.replace("\n", " ")
        val throws = groups[7]?.value?.replace("\n", " ")

        val paramNames = mutableListOf<String>()
        val paramType = mutableListOf<String>()
        if (parameters != null) {
            if (!parameters.trim().isEmpty()) {
                parameters.split(',').forEach {
                    it.trim()
                    val split = it.split(' ')
                    paramNames.add(split.last())
                    paramType.add(split.elementAt(split.size - 2))
                }
            }
        }

        methods.add(AnalyzedJavaMethod(name, visibility, returnType,
                javadoc, annotations, parameters, throws))
    }


    return AnalyzedJavaFile(imports, methods);
}
