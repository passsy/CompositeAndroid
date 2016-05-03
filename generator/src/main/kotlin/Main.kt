import java.io.File


const val outPath = "../activity/src/main/java/com/pascalwelsch/compositeandroid/activity/"

fun main(args: Array<String>) {
    var activity = readActivity()

    // filter methods with special implementations
    val filteredMethods = activity.methods
            .filterNot { it.name.contains("NonConfigurationInstance") }
    activity = activity.copy(methods = filteredMethods)


    createCompositeActivity(activity)
    createActivityDelegate(activity)
    createActivityPlugin(activity)
}

fun createActivityPlugin(activity: AnalyzedJavaFile) {

    val sb = StringBuilder()
    sb.appendln("package com.pascalwelsch.compositeandroid.activity;")
    sb.appendln("")
    sb.appendln(activity.imports)
    sb.appendln("")
    sb.appendln("@SuppressWarnings(\"unused\")")
    sb.appendln("public class ActivityPlugin extends ActivityPluginBase{")
    sb.appendln("")

    for (method in activity.methods) with(method) {
        when (returnType) {
            "void" -> sb.append(method.callListener())
            else -> sb.append(method.returnSuperListener())
        }
    }

    sb.appendln("}")

    val out = File(outPath + "ActivityPlugin.java")
    out.parentFile.mkdirs()
    out.printWriter().use { it.write(sb.toString()) }
    System.out.println("wrote ${out.absolutePath}")
}

fun AnalyzedJavaMethod.returnSuperListener(): String {
    return """
    public $returnType $name($rawParameters) {
        if (mSuperListener != null) {
            return ($boxedReturnType) mSuperListener.call(${parameterNames.joinToString()});
        } else {
            mActivityDelegate.callingPlugin(this);
            final $returnType result = mActivityDelegate
                    .$name(${parameterNames.joinToString()});
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }
    """
}

fun AnalyzedJavaMethod.callListener(): String {
    return """
    public void $name($rawParameters) $exceptions{
        if (mSuperListener != null) {
            mSuperListener.call(${parameterNames.joinToString()});
        } else {
            mActivityDelegate.callingPlugin(this); ${if (throws) "\ntry{" else ""}
            mActivityDelegate.$name(${parameterNames.joinToString()}); ${if (throws) "\n} catch(SuppressedException e){\n throw ($exceptionType) e.getCause();\n}" else ""}
            mActivityDelegate.callingPlugin(null);
        }
    }
    """
}

fun createActivityDelegate(activity: AnalyzedJavaFile) {

    val methodsSb = StringBuilder()

    for (method in activity.methods) with(method) {
        when (returnType) {
            "void" -> methodsSb.appendln(method.hook())
            else -> methodsSb.appendln(method.callFunction())
        }
    }

    val activityDelegate = """
package com.pascalwelsch.compositeandroid.activity;

${activity.imports}

public class ActivityDelegate extends ActivityDelegateBase {

    public ActivityDelegate(final CompositeActivity compositeActivity) {
        super(compositeActivity);
    }

    ${methodsSb.toString()}

}
"""

    val out = File(outPath + "ActivityDelegate.java")
    out.parentFile.mkdirs()
    out.printWriter().use { it.write(activityDelegate) }
    System.out.println("wrote ${out.absolutePath}")
}

fun AnalyzedJavaMethod.callFunction(): String {
    val typedArgs = parameterTypes
            .mapIndexed { i, type -> "($type) args[$i]" }
            .joinToString()

    val varargs = if (parameterNames.size == 1 && parameterNames[0].contains("[]")) {
        "new Object[]{${parameterNames[0]}}"
    } else parameterNames.joinToString()

    return """
    public $returnType $name($rawParameters) {
        return callFunction(new PluginMethodFunction<$boxedReturnType>() {
            @Override
            public $boxedReturnType call(final ActivityPlugin plugin, final Object... args) {
                return plugin.$name($typedArgs);
            }
        }, new ActivitySuperFunction<$boxedReturnType>() {
            @Override
            public $boxedReturnType call(final Object... args) { ${if (throws) "\ntry {" else ""}
                return mActivity.${name}_super($typedArgs); ${if (throws) "\n} catch ($exceptionType e) {\n throw new SuppressedException(e);\n }" else ""}
            }
        }${if (parameterNames.size > 0) ", " else ""}$varargs);
    }
    """
}

fun AnalyzedJavaMethod.notImplemented(): String {
    val sb = StringBuilder()
    sb.appendln("    public $returnType $name($rawParameters) {")
    sb.appendln("        //TODO not implemented")
    sb.appendln("        return null;")
    sb.appendln("    }")
    return sb.toString();
}

fun AnalyzedJavaMethod.hook(): String {
    val typedArgs = parameterTypes.mapIndexed { i, type -> "($type) args[$i]" }.joinToString()

    val varargs = if (parameterTypes.size == 1
            && parameterTypes[0].contains("[]")) {
        "new Object[]{${parameterNames[0]}}"
    } else parameterNames.joinToString()

    val sb = StringBuilder()
    sb.appendln("    public void $name($rawParameters) $exceptions {")
    sb.appendln("        callHook(new PluginMethodAction() {")
    sb.appendln("            @Override")
    sb.appendln("            public void call(final ActivityPlugin plugin, final Object... args) {")
    if (throws) sb.appendln("                try {")
    sb.appendln("                plugin.$name($typedArgs);")
    if (throws) {
        sb.appendln("            } catch ($exceptionType e) {")
        sb.appendln("                throw new SuppressedException(e);")
        sb.appendln("            }")
    }
    sb.appendln("            }")
    sb.appendln("        }, new ActivitySuperAction() {")
    sb.appendln("            @Override")
    sb.appendln("            public void call(final Object... args) {")
    if (throws) sb.appendln("                try {")
    sb.appendln("                mActivity.${name}_super($typedArgs);")
    if (throws) {
        sb.appendln("            } catch ($exceptionType e) {")
        sb.appendln("                throw new SuppressedException(e);")
        sb.appendln("            }")
    }
    sb.appendln("            }")
    sb.appendln(
            "        }${if (parameterNames.size > 0) ", " else ""}$varargs);")
    sb.appendln("    }")

    return sb.toString();
}


fun createCompositeActivity(activity: AnalyzedJavaFile) {

    val sb = StringBuilder()
    sb.appendln("package com.pascalwelsch.compositeandroid.activity;")
    sb.appendln("")
    sb.appendln("import android.annotation.SuppressLint;")
    sb.appendln(activity.imports)
    sb.appendln("")
    sb.appendln(
            "@SuppressWarnings({\"unused\", \"deprecation\", \"JavadocReference\", \"WrongConstant\"})")
    sb.appendln("@SuppressLint({\"MissingSuperCall\", \"NewApi\"})")
    sb.appendln("public class CompositeActivity extends CompositeActivityBase {")
    sb.appendln("")
    sb.appendln("    final ActivityDelegate delegate = new ActivityDelegate(this);")

    for (method in activity.methods) with(method) {
        if (visibility.isNullOrBlank() && !visibility.contains("private")) {
            // (package-) private methods cannot be overridden
        } else {

            javadoc?.let { sb.appendln(it) }

            val returnWhenNotVoid = if (returnType != "void") "return " else ""

            // override
            sb.appendln("    ${annotations.joinToString("\n")}")
            sb.appendln("    public $returnType $name($rawParameters) $exceptions{")

            if (throws) sb.appendln("        try{")
            sb.appendln("        ${returnWhenNotVoid}delegate.$name(" +
                    "${parameterNames.joinToString()});")

            if (throws) {
                sb.appendln("        } catch(SuppressedException e){")
                sb.appendln("            throw ($exceptionType) e.getCause();")
                sb.appendln("        }")
            }
            sb.appendln("    }\n")

            // super method
            sb.appendln(
                    "    ${annotations.filter { !it.contains("Override") }.joinToString("\n")}")
            sb.appendln(
                    "    public $returnType ${name}_super($rawParameters) $exceptions{")

            sb.appendln("        ${returnWhenNotVoid}super.$name(" +
                    "${parameterNames.joinToString()});")
            sb.appendln("    }\n")
        }
    }
    sb.appendln("}")


    val out = File(outPath + "CompositeActivity.java")
    out.parentFile.mkdirs()
    out.printWriter().use { it.write(sb.toString()) }
    System.out.println("wrote ${out.absolutePath}")
}

private fun readActivity(): AnalyzedJavaFile {
    val file = File("input/Activity.java")
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

/*

private fun delegate(): JavaFile {

    val builder = TypeSpec.classBuilder("ActivityDelegate")

    val classFile = with(builder) {
        addModifiers(Modifier.PUBLIC)

    }.build()

    return JavaFile.builder("com.pascalwelsch.compositeandroid.activity", classFile).build();
}

private fun testMain(): JavaFile {
    val main = MethodSpec.methodBuilder("main")
            .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
            .returns(Void.TYPE.javaClass)
            .addParameter(ArrayTypeName.of(String::class.java), "args")
            .addStatement("\$T.out.println(\$S)", System::class.java, "Hello, JavaPoet!")
            .build()

    val helloWorld = TypeSpec.classBuilder("HelloWorld")
            .addModifiers(Modifier.PUBLIC, Modifier.FINAL)
            .addMethod(main)
            .build()

    val javaFile = JavaFile.builder("com.example.helloworld", helloWorld)
            .build()
    return javaFile
}
*/
