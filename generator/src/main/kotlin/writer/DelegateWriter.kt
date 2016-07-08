package writer

import outPath
import parse.AnalyzedJavaFile
import parse.AnalyzedJavaMethod
import java.io.File


fun writeDelegate(javaFile: AnalyzedJavaFile,
                  javaPackage: String,
                  javaClassName: String,
                  compositeName: String,
                  pluginName: String,
                  originalGetterName: String = "getOriginal()",
                  extends: String,
                  additionalImports: String? = null,
                  transform: ((String) -> String)? = null,
                  superClassPluginName: String = "",
                  superClassDelegateName: String = "",
                  superClassInputFile: AnalyzedJavaFile? = null,
                  addCodeToClass: String? = null
) {


    val methodsSb = StringBuilder()


    val allMethods = mutableListOf<AnalyzedJavaMethod>()
    if (superClassInputFile != null) {
        allMethods.addAll(superClassInputFile.methods)
    }
    allMethods.addAll(javaFile.methods)
    val distinctMethods = allMethods.distinctBy { "${it.name} ${it.parameterTypes}" }.toMutableList()

    for (method in distinctMethods) {

        val isSameMethod: (AnalyzedJavaMethod) -> Boolean = { method.name == it.name && method.parameterTypes == it.parameterTypes }
        val definedInSuperComposite = superClassInputFile?.methods
                ?.filter(isSameMethod)?.isNotEmpty() ?: false
        val definedInComposite = javaFile.methods.filter(isSameMethod).isNotEmpty()
        val isVoid = method.returnType == "void"


        //methodsSb.appendln(
        //        "//${method.signature} inSuperComposite: $definedInSuperComposite, inComposite: $definedInComposite")
        methodsSb.appendln(when {
            definedInComposite && !definedInSuperComposite && isVoid ->
                method.hook(originalGetterName, pluginName)
            definedInComposite && !definedInSuperComposite && !isVoid ->
                method.callFunction(originalGetterName, pluginName)

            definedInSuperComposite && isVoid ->
                method.forwardToDelegate(superClassDelegateName)
            definedInSuperComposite && !isVoid ->
                method.forwardToDelegateWithReturn(superClassDelegateName)

            else -> "// TODO ${method.signature} inSuperComposite: $definedInSuperComposite, inComposite: $definedInComposite"
        })
    }

    fun superDelegateInitialization(): String {
        return if (superClassDelegateName.isEmpty()) "" else
            "m$superClassDelegateName = new $superClassDelegateName(${compositeName.toLowerCase()});"
    }

    fun superDelegateDeclaration(): String {
        return if (superClassDelegateName.isEmpty()) "" else
            "private final $superClassDelegateName m$superClassDelegateName;"
    }

    fun addSuperDelegatePlugin(): String {
        return if (superClassDelegateName.isEmpty()) "" else """
        |public Removable addPlugin(final $superClassPluginName plugin) {
        |    return m$superClassDelegateName.addPlugin(plugin);
        |}
        """.replaceIndentByMargin()
    }

    fun addPlugin(): String {
        return if (superClassDelegateName.isEmpty()) "" else """
        |@Override
        |public Removable addPlugin(final $pluginName plugin) {
        |    final Removable removable = super.addPlugin(plugin);
        |    final Removable superRemovable = m$superClassDelegateName.addPlugin(plugin);
        |    return new Removable() {
        |        @Override
        |        public void remove() {
        |            removable.remove();
        |            superRemovable.remove();
        |        }
        |    };
        |}
        """.replaceIndentByMargin()
    }

    var activityDelegate = """
        |package com.pascalwelsch.compositeandroid.$javaPackage;
        |
        |import com.pascalwelsch.compositeandroid.core.*;
        |
        |${javaFile.imports}
        |
        |${additionalImports ?: ""}
        |
        |public class $javaClassName extends $extends {
        |
        |    ${superDelegateDeclaration()}
        |
        |    public $javaClassName(final $compositeName ${compositeName.toLowerCase()}) {
        |        super(${compositeName.toLowerCase()});
        |        ${superDelegateInitialization()}
        |    }
        |
        |${addSuperDelegatePlugin().prependIndent()}
        |${addPlugin().prependIndent()}
        |
        |${methodsSb.toString()}
        |
        |${addCodeToClass ?: ""}
        |
        |}
        """.replaceIndentByMargin()

    if (transform != null) {
        activityDelegate = transform(activityDelegate)
    }

    val out = File("${outPath}${javaPackage.replace('.', '/')}/$javaClassName.java")
    out.parentFile.mkdirs()
    out.printWriter().use { it.write(activityDelegate) }
    System.out.println("wrote ${out.absolutePath}")
}

fun AnalyzedJavaMethod.forwardToDelegate(delegateName: String): String {
    return """
    |
    |public void $name($rawParameters) $exceptions {
    |    m$delegateName.$name(${parameterNames.joinToString()});
    |}
    """.replaceIndentByMargin("    ")
}

fun AnalyzedJavaMethod.forwardToDelegateWithReturn(delegateName: String): String {
    return """
    |
    |public $returnType $name($rawParameters) $exceptions {
    |    return m$delegateName.$name(${parameterNames.joinToString()});
    |}
    """.replaceIndentByMargin("    ")
}


fun AnalyzedJavaMethod.hook(originalGetterName: String = "getOriginal()",
                            pluginType: String = "Plugin"): String {


    val typedArgs = parameterTypes.mapIndexed { i, type -> "($type) args[$i]" }

    val varargs = if (parameterTypes.size == 1
            && parameterTypes[0].contains("[]")) {
        "new Object[]{${parameterNames[0]}}"
    } else parameterNames.joinToString()


    val sb = StringBuilder()
    sb.appendln("    public void $name($rawParameters) $exceptions {")
    sb.appendln(
            "        callHook(\"$name(${parameterTypes.joinToString()})\", new PluginCallVoid<$pluginType>() {")
    sb.appendln("            @Override")
    sb.appendln(
            "            public void call(final NamedSuperCall<Void> superCall, final $pluginType plugin, final Object... args) {")
    if (throws) sb.appendln("                try {")
    sb.appendln("                plugin.$name(${listOf("superCall").plus(
            typedArgs).joinToString()});")
    if (throws) {
        sb.appendln("            } catch ($exceptionType e) {")
        sb.appendln("                throw new SuppressedException(e);")
        sb.appendln("            }")
    }
    sb.appendln("            }")
    sb.appendln("        }, new SuperCallVoid() {")
    sb.appendln("            @Override")
    sb.appendln("            public void call(final Object... args) {")
    if (throws) sb.appendln("                try {")
    sb.appendln("                $originalGetterName.super_$name(${typedArgs.joinToString()});")
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


fun AnalyzedJavaMethod.callFunction(originalGetterName: String = "getOriginal()",
                                    pluginType: String = "Plugin"): String {
    val typedArgs = parameterTypes.mapIndexed { i, type -> "($type) args[$i]" }

    val varargs = if (parameterNames.size == 1 && parameterNames[0].contains("[]")) {
        "new Object[]{${parameterNames[0]}}"
    } else parameterNames.joinToString()

    return """
    public $returnType $name($rawParameters) {
        return callFunction("$name(${parameterTypes.joinToString()})", new PluginCall<$pluginType, $boxedReturnType>() {
            @Override
            public $boxedReturnType call(final NamedSuperCall<$boxedReturnType> superCall, final $pluginType plugin, final Object... args) {
            ${if (throws) "                try {" else ""}
                return plugin.$name(${listOf("superCall").plus(typedArgs).joinToString()});
                ${if (throws) {
        val sb = StringBuilder()
        sb.appendln("            } catch ($exceptionType e) {")
        sb.appendln("                throw new SuppressedException(e);")
        sb.appendln("            }").toString()
    } else ""}
            }
        }, new SuperCall<$boxedReturnType>() {
            @Override
            public $boxedReturnType call(final Object... args) { ${if (throws) "\ntry {" else ""}
                return $originalGetterName.super_${name}(${typedArgs.joinToString()}); ${if (throws) "\n} catch ($exceptionType e) {\n throw new SuppressedException(e);\n }" else ""}
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

