package writer

import parse.AnalyzedJavaFile
import parse.AnalyzedJavaMethod
import java.io.File

fun writePlugin(outPath: String,
                normalClassName: String,
                javaFile: AnalyzedJavaFile,
                javaPackage: String,
                javaClassName: String,
                extends: String,
                additionalImports: String? = null,
                transform: ((String) -> String)? = null,
                superClassInputFile: AnalyzedJavaFile? = null,
                addCodeToClass: String? = null) {

    val sb = StringBuilder()
    for (method in javaFile.methods) with(method) {
        when (returnType) {
            "void" -> sb.append(method.callListener())
            else -> sb.append(method.returnSuperListener())
        }
    }
    val methods = sb.toString()


    val niceGetter: String = """
        |public $normalClassName get$normalClassName() {
        |    return ($normalClassName) getOriginal();
        |}
        """.replaceIndentByMargin("    ")


    var code = """
        |package com.pascalwelsch.compositeandroid.$javaPackage;
        |
        |import com.pascalwelsch.compositeandroid.core.*;
        |
        |${javaFile.imports}
        |
        |${additionalImports ?: ""}
        |
        |@SuppressWarnings("unused")
        |public class $javaClassName extends $extends {
        |$methods
        |
        |$niceGetter
        |
        |${addCodeToClass ?: ""}
        |}
        """.replaceIndentByMargin()

    if (transform != null) {
        code = transform(code)
    }

    val out = File("$outPath${javaPackage.replace('.', '/')}/$javaClassName.java")
    out.parentFile.mkdirs()
    out.printWriter().use { it.write(code) }
    System.out.println("wrote ${out.absolutePath}")
}

fun AnalyzedJavaMethod.returnSuperListener(): String {
    return """
    public $returnType $name($rawParameters) $exceptions{
        verifyMethodCalledFromDelegate("$name(${parameterTypes.joinToString()})");
        return ($boxedReturnType) mSuperListeners.pop().call(${parameterNames.joinToString()});
    }

    $returnType $name(final NamedSuperCall<$boxedReturnType> superCall ${if (parameterNames.isNotEmpty()) ", " else ""}$rawParameters) $exceptions{
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return $name(${parameterNames.joinToString()});
        }
    }
    """
}

fun AnalyzedJavaMethod.callListener(): String {
    return """
    public void $name($rawParameters) $exceptions{
        verifyMethodCalledFromDelegate("$name(${parameterTypes.joinToString()})");
        mSuperListeners.pop().call(${parameterNames.joinToString()});
    }

    void $name(final NamedSuperCall<Void> superCall ${if (parameterNames.isNotEmpty()) ", " else ""}$rawParameters) $exceptions{
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            $name(${parameterNames.joinToString()});
        }
    }
    """
}
