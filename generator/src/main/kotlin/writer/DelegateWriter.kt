package writer

import parse.AnalyzedJavaFile
import parse.AnalyzedJavaMethod
import java.io.File


fun writeDelegate(outPath: String,
                  javaFile: AnalyzedJavaFile,
                  javaPackage: String,
                  javaClassName: String,
                  compositeName: String,
                  pluginName: String,
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
                method.hook(pluginName)
            definedInComposite && !definedInSuperComposite && !isVoid ->
                method.callFunction(pluginName)

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


    fun resetOptimizations(): String {
        val sb = StringBuilder()
        sb.appendln("    mMethodImplementingPlugins.clear();")
        for (method in distinctMethods) {
            val isSameMethod: (AnalyzedJavaMethod) -> Boolean = { method.name == it.name && method.parameterTypes == it.parameterTypes }
            val definedInSuperComposite = superClassInputFile?.methods
                    ?.filter(isSameMethod)?.isNotEmpty() ?: false

            if (!definedInSuperComposite)
                sb.appendln("        mIsOverridden_${method.uniqueName} = true;")
        }

        return sb.toString()
    }

    fun addPluginSuper(): String =
            if (superClassDelegateName.isEmpty()) "return super.addPlugin(plugin);"
            else """
            |    final Removable removable = super.addPlugin(plugin);
            |    final Removable superRemovable = m$superClassDelegateName.addPlugin(plugin);
            |    return new Removable() {
            |        @Override
            |        public void remove() {
            |            removable.remove();
            |            superRemovable.remove();
            |        }
            |    };
            """.replaceIndentByMargin()


    var activityDelegate = """
        |package com.pascalwelsch.compositeandroid.$javaPackage;
        |
        |import com.pascalwelsch.compositeandroid.core.*;
        |import java.util.ArrayList;
        |import java.util.List;
        |import java.util.ListIterator;
        |import java.util.HashMap;
        |import android.support.annotation.VisibleForTesting;
        |
        |${javaFile.imports}
        |
        |${additionalImports ?: ""}
        |
        |public class $javaClassName extends $extends {
        |
        |    @VisibleForTesting
        |    int CALL_COUNT_OPTIMIZATION_THRESHOLD = 100;
        |
        |    private final HashMap<String, List<$pluginName>> mMethodImplementingPlugins
            = new HashMap<>();
        |
        |    ${superDelegateDeclaration()}
        |
        |    public $javaClassName(final $compositeName ${compositeName.toLowerCase()}) {
        |        super(${compositeName.toLowerCase()});
        |        ${superDelegateInitialization()}
        |    }
        |
        |${addSuperDelegatePlugin().prependIndent()}
        |
        |    @Override
        |    public Removable addPlugin(final $pluginName plugin) {
        |${resetOptimizations()}
        |${addPluginSuper().prependIndent()}
        |    }
        |
        |${methodsSb.toString()}
        |
        |    private List<$pluginName> getImplementingPlugins(final String methodName, final Class<?>... parameterTypes) {
        |        synchronized (mPlugins) {
        |            final ArrayList<$pluginName> implementingPlugins = new ArrayList<>();
        |            for (int i = 0; i < mPlugins.size(); i++) {
        |                final $pluginName plugin = mPlugins.get(i);
        |                if (plugin.isMethodOverridden(methodName, parameterTypes)) {
        |                    implementingPlugins.add(plugin);
        |                }
        |            }
        |            return implementingPlugins;
        |        }
        |    }
        |
        |${addCodeToClass ?: ""}
        |
        |}
        """.replaceIndentByMargin()

    if (transform != null) {
        activityDelegate = transform(activityDelegate)
    }

    val out = File("$outPath${javaPackage.replace('.', '/')}/$javaClassName.java")
    out.parentFile.mkdirs()
    out.printWriter().use {
        it.write(activityDelegate)
    }
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

fun AnalyzedJavaMethod.hook(pluginType: String = "Plugin"): String {

    val varargs = if (parameterNames.size == 1 && parameterNames[0].contains("[]")) {
        "new Object[]{${parameterNames[0]}}"
    } else parameterNames.joinToString()

    val genericTypeCallType = if (parameterTypes.size == 0) "" else "<${parameterTypes.joinToString()}>"

    return """
    |
    |private int mCallCount_$uniqueName = 0;
    |
    |private boolean mIsOverridden_$uniqueName = false;
    |
    |public void $name($rawParameters) $exceptions {
    |    if (!mIsOverridden_$uniqueName) {
    |        getOriginal().super_$name($varargs);
    |        return;
    |    }
    |
    |    final ListIterator<$pluginType> iterator;
    |    if (mCallCount_$uniqueName < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
    |        mCallCount_$uniqueName++;
    |        iterator = mPlugins.listIterator(mPlugins.size());
    |    } else {
    |        List<$pluginType> implementingPlugins = mMethodImplementingPlugins.get("$identifier");
    |        if (implementingPlugins == null) {
    |            implementingPlugins = getImplementingPlugins("$name"${if (parameterTypes.isEmpty()) "" else ", "}${parameterTypes.map {
        it.removeSuffix("<?>")
    }.map { "$it.class" }.joinToString()});
    |            mMethodImplementingPlugins.put("$identifier", implementingPlugins);
    |            mIsOverridden_$uniqueName = implementingPlugins.size() > 0;
    |        }
    |
    |        iterator = implementingPlugins.listIterator(implementingPlugins.size());
    |    }
    |
    |    final CallVoid${parameterNames.size}$genericTypeCallType superCall = new CallVoid${parameterNames.size}$genericTypeCallType("$name(${parameterTypes.joinToString()})") {
    |
    |        @Override
    |        public void call(${rawParametersBoxed.joinToString()}) {
    |            if (iterator.hasPrevious()) {
    |${"iterator.previous().$name(this${if (parameterNames.size > 0) ", " else ""}$varargs);"
            .wrapWithTryCatch(exceptionType).prependIndent("                    ")}
    |            } else {
    |${"getOriginal().super_$name($varargs);"
            .wrapWithTryCatch(exceptionType).prependIndent("                    ")}
    |            }
    |        }
    |    };
    |    superCall.call($varargs);
    |}
    """.replaceIndentByMargin("    ")
}

fun AnalyzedJavaMethod.callFunction(pluginType: String = "Plugin"): String {

    val varargs = if (parameterNames.size == 1 && parameterNames[0].contains("[]")) {
        "new Object[]{${parameterNames[0]}}"
    } else parameterNames.joinToString()

    val genericTypes = mutableListOf<String>().apply {
        add(boxedReturnType)
        addAll(parameterTypes)
    }
    val genericTypeCallType = "<${genericTypes.joinToString()}>"

    return """
    |
    |private int mCallCount_$uniqueName = 0;
    |
    |private boolean mIsOverridden_$uniqueName = false;
    |
    |public $returnType $name($rawParameters) $exceptions {
    |    if (!mIsOverridden_$uniqueName) {
    |        return getOriginal().super_$name($varargs);
    |    }
    |
    |    final ListIterator<$pluginType> iterator;
    |    if (mCallCount_$uniqueName < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
    |        mCallCount_$uniqueName++;
    |        iterator = mPlugins.listIterator(mPlugins.size());
    |    } else {
    |        List<$pluginType> implementingPlugins = mMethodImplementingPlugins.get("$identifier");
    |        if (implementingPlugins == null) {
    |            implementingPlugins = getImplementingPlugins("$name"${if (parameterTypes.isEmpty()) "" else ", "}${parameterTypeClasses()});
    |            mMethodImplementingPlugins.put("$identifier", implementingPlugins);
    |            mIsOverridden_$uniqueName = implementingPlugins.size() > 0;
    |        }
    |
    |        iterator = implementingPlugins.listIterator(implementingPlugins.size());
    |    }
    |
    |    final CallFun${parameterNames.size}$genericTypeCallType superCall = new CallFun${parameterNames.size}$genericTypeCallType("$identifier") {
    |
    |        @Override
    |        public $boxedReturnType call(${rawParametersBoxed.joinToString()}) {
    |            if (iterator.hasPrevious()) {
    |${"return iterator.previous().$name(this${if (parameterNames.size > 0) ", " else ""}$varargs);"
            .wrapWithTryCatch(exceptionType).prependIndent("                    ")}
    |            } else {
    |${"return getOriginal().super_$name($varargs);"
            .wrapWithTryCatch(exceptionType).prependIndent("                    ")}
    |            }
    |        }
    |    };
    |    return superCall.call($varargs);
    |}
    """.replaceIndentByMargin("    ")
}

private fun AnalyzedJavaMethod.parameterTypeClasses() = parameterTypes
        .map { it.removeSuffix("<?>") }
        .map { "$it.class" }
        .map {
            // replace primitive types
            when (it) {
                "Boolean.class" -> "Boolean.TYPE"
                "Byte.class" -> "Byte.TYPE"
                "Char.class" -> "Char.TYPE"
                "Double.class" -> "Double.TYPE"
                "Float.class" -> "Float.TYPE"
                "Integer.class" -> "Integer.TYPE"
                "Long.class" -> "Long.TYPE"
                "Short.class" -> "Short.TYPE"
                "Void.class" -> "Void.TYPE"
                else -> it
            }
        }
        .joinToString()

fun String.wrapWithTryCatch(exceptionType: String?): String =
        if (exceptionType == null) this else """
            |try{
            |    $this
            |} catch ($exceptionType e) {
            |    throw new SuppressedException(e);
            |}
            """.replaceIndentByMargin()


fun AnalyzedJavaMethod.notImplemented(): String {
    val sb = StringBuilder()
    sb.appendln("    public $returnType $name($rawParameters) {")
    sb.appendln("        //TODO not implemented")
    sb.appendln("        return null;")
    sb.appendln("    }")
    return sb.toString();
}

