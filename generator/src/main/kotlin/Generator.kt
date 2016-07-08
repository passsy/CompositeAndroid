import types.generateActivity
import types.generateFragments

const val outPath = "../activity/src/main/java/com/pascalwelsch/compositeandroid/"
const val inPath = "input/"

fun main(args: Array<String>) {
    generateActivity()
    generateFragments()
}