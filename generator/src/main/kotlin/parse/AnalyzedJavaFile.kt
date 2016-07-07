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
                paramTypes.add(split.elementAt(split.size - 2))
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
        when (returnType) {
            "boolean" -> "Boolean"
            "int" -> "Integer"
            else -> returnType
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
}