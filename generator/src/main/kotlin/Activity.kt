import java.io.File



fun main(args: Array<String>) {
    var activity = parseJavaFile(File("$inPath/Activity.java"))

    // filter methods with special implementations
    val filteredMethods = activity.methods
            .filterNot { it.name.contains("NonConfigurationInstance") }
    activity = activity.copy(methods = filteredMethods)


    writeComposite(activity, "activity", "CompositeActivity")
    writeDelegate(activity, "activity", "ActivityDelegate", "CompositeActivity", "ActivityPlugin", "getCompositeActivity()")
    writePlugin(activity, "activity", "ActivityPlugin")
}
