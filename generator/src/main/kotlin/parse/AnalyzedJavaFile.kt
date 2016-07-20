package parse

data class AnalyzedJavaFile(
        val imports: String,
        var methods: List<AnalyzedJavaMethod>
)

data class AnalyzedJavaMethod(
        val name: String,
        val visibility: String,
        val returnType: String,
        val javadoc: String? = null,
        private val rawAnnotations: String? = null,
        val rawParameters: String?,
        val exceptions: String? = null) {

    val parameterTypes: List<String> by lazy {
        val paramTypes = mutableListOf<String>();
        if (rawParameters != null && !rawParameters.trim().isEmpty()) {
            rawParameters.split(',').forEach {
                it.trim()
                val split = it.split(' ')
                val type = split.elementAt(split.size - 2).trim()
                paramTypes.add(type.toBoxedType())
            }
        }
        paramTypes.toList()
    }

    val parameterNames: List<String> by lazy {
        val paramNames = mutableListOf<String>();
        if (rawParameters != null && !rawParameters.trim().isEmpty()) {
            rawParameters.split(',').forEach {
                it.trim()
                val split = it.split(' ')
                paramNames.add(split.last())
            }
        }
        paramNames.toList()
    }

    val annotations: List<String> by lazy {
        rawAnnotations?.let {
            it.split("\n")
                    .map { it.trim() }
                    .filter { it.isNotEmpty() }
        } ?: emptyList()
    }

    val boxedReturnType: String by lazy {
        returnType.toBoxedType()
    }

    private fun String.toBoxedType(): String {
        return when (this) {
            "boolean" -> "Boolean"
            "int" -> "Integer"
            "void" -> "Void"
        // add others when needed
            else -> this
        }
    }


    val exceptionType: String? by lazy {
        var result: String? = null
        if (!exceptions.isNullOrBlank()) {
            result = exceptions!!.substringAfterLast("throws").trim().split(" ")[0]
        }
        result
    }

    val throws: Boolean = exceptionType != null
    val signature: String = "#$name($rawParameters):$returnType"

    val rawParametersBoxed: List<String> by lazy {
        if (rawParameters != null && !rawParameters.trim().isEmpty()) {
            rawParameters.split(',').map {
                it.trim()
                val split = it.split(' ')
                val type = split.elementAt(split.size - 2).trim()
                val name = split.elementAt(split.size - 1).trim()
                "final ${type.toBoxedType()} $name"
            }.toList()
        } else {
            emptyList()
        }
    }
}