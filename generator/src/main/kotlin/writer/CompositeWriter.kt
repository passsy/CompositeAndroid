package writer

import outPath
import parse.AnalyzedJavaFile
import parse.AnalyzedJavaMethod
import java.io.File


fun writeComposite(javaFile: AnalyzedJavaFile,
                   javaPackage: String,
                   javaClassName: String,
                   extends: String,
                   additionalImports: String = "",
                   transform: ((String) -> String)? = null,
                   superClassPluginNames: List<String> = listOf(),
                   superClassDelegateName: String = "",
                   delegateClassName: String,
                   pluginClassName: String,
                   superClassInfputFile: AnalyzedJavaFile? = null) {


    fun addPlugins(): String {
        val allPluginTypes = mutableListOf(pluginClassName)
        allPluginTypes.addAll(superClassPluginNames)

        return allPluginTypes
                .map {
                    """
                    |
                    |public Removable addPlugin(final $it plugin) {
                    |    return delegate.addPlugin(plugin);
                    |}
                    """.replaceIndentByMargin("    ")
                }.reduce { s1, s2 -> "$s1\n$s2" }
    }

    val sb = StringBuilder("""
    |package com.pascalwelsch.compositeandroid.$javaPackage;
    |
    |import android.annotation.SuppressLint;
    |
    |import com.pascalwelsch.compositeandroid.core.*;
    |
    |${javaFile.imports}
    |
    |$additionalImports
    |
    |@SuppressWarnings({"unused", "deprecation", "JavadocReference", "WrongConstant"})
    |@SuppressLint({"MissingSuperCall", "NewApi"})
    |
    |public class $javaClassName extends $extends {
    |
    |    protected $delegateClassName delegate = new $delegateClassName(this);
    |
    |${addPlugins()}
    |
    """.replaceIndentByMargin())

    for (method in javaFile.methods) with(method) {
        // override method, calling delegate
        sb.appendln(callDelegate())

        // super method
        sb.appendln(callSuper())
    }

    if (superClassInfputFile != null) {
        for (method in superClassInfputFile.methods) {
            val isSameMethod: (AnalyzedJavaMethod) -> Boolean = { method.name == it.name && method.parameterTypes == it.parameterTypes }
            if (javaFile.methods.filter(isSameMethod).isEmpty()) {
                sb.appendln(method.callSuper())
            }
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

private fun AnalyzedJavaMethod.callSuper(): String {

    val returnWhenNotVoid = if (returnType != "void") "return " else ""
    val formattedAnnotations = annotations
            .filter { !it.contains("Override") }
            .joinToString("\n")

    return """
            |$formattedAnnotations
            |public $returnType ${name}__super($rawParameters) $exceptions{
            |    ${returnWhenNotVoid}super.$name(${parameterNames.joinToString()});
            |}
            """.replaceIndentByMargin("    ")
}

private fun AnalyzedJavaMethod.callDelegate(): String {

    val returnWhenNotVoid = if (returnType != "void") "return " else ""
    return """
            |
            |${javadoc?.trim() ?: ""}
            |${annotations.joinToString("\n")}
            |public $returnType $name($rawParameters) $exceptions{
            |${"""
            |    ${returnWhenNotVoid}delegate.$name(${parameterNames.joinToString()});
            """.replaceIndentByMargin().let { it: String ->
        if (throws) """
            |    try {
            |        $it
            |    } catch(SuppressedException e){
            |        throw ($exceptionType) e.getCause();
            |    }
            """.replaceIndentByMargin() else it
    }}
            |}
            """.replaceIndentByMargin("    ")
}

