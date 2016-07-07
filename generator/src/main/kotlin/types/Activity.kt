package types

import inPath
import parse.parseJavaFile
import writer.writeComposite
import writer.writeDelegate
import writer.writePlugin
import java.io.File


fun main(args: Array<String>) {
    generateActivity()
}

fun generateActivity() {
    var activity = parseJavaFile(File("$inPath/Activity.java"))

    // filter methods with special implementations
    val filteredMethods = activity.methods
            .filterNot { it.name.contains("NonConfigurationInstance") }
    activity = activity.copy(methods = filteredMethods)


    writeComposite(activity,
            "activity",
            "CompositeActivity",
            "CompositeActivityBase",
            delegateClassName = "ActivityDelegate",
            pluginClassName = "ActivityPlugin")
    writeDelegate(activity,
            "activity",
            "ActivityDelegate",
            "CompositeActivity",
            "ActivityPlugin",
            "getCompositeActivity()",
            extends = "ActivityDelegateBase")
    writePlugin(activity,
            "activity",
            "ActivityPlugin",
            extends = "ActivityPluginBase")
}
