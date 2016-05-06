import java.io.File


fun writeComposite(javaFile: AnalyzedJavaFile,
                   javaPackage: String,
                   javaClassName: String,
                   additionalImports: String? = null,
                   transform: ((String) -> String)? = null) {

    val sb = StringBuilder()
    sb.appendln("package com.pascalwelsch.compositeandroid.$javaPackage;")
    sb.appendln("")
    sb.appendln("import android.annotation.SuppressLint;")
    sb.appendln(javaFile.imports)
    sb.appendln("")
    sb.appendln(additionalImports ?: "")
    sb.appendln(
            "@SuppressWarnings({\"unused\", \"deprecation\", \"JavadocReference\", \"WrongConstant\"})")
    sb.appendln("@SuppressLint({\"MissingSuperCall\", \"NewApi\"})")
    sb.appendln("public class $javaClassName extends ${javaClassName}Base {")
    sb.appendln("")

    for (method in javaFile.methods) with(method) {
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
                    "    protected $returnType ${name}__super($rawParameters) $exceptions{")

            sb.appendln("        ${returnWhenNotVoid}super.$name(" +
                    "${parameterNames.joinToString()});")
            sb.appendln("    }\n")
        }
    }
    sb.appendln("}")

    var output = sb.toString();
    if (transform != null) {
        output = transform(output)
    }

    val out = File("${outPath}${javaPackage.replace('.', '/')}/$javaClassName.java")
    out.parentFile.mkdirs()
    out.printWriter().use { it.write(output) }
    System.out.println("wrote ${out.absolutePath}")
}
