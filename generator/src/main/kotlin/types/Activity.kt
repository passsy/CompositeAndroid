package types

import inPath
import parse.parseJavaFile
import writer.writeComposite
import writer.writeDelegate
import writer.writeInterface
import writer.writePlugin
import java.io.File


private val outPath = "../activity/src/main/java/com/pascalwelsch/compositeandroid/"

fun main(args: Array<String>) {
    generateActivity()
}

fun generateActivity() {
    var activity = parseJavaFile(File("$inPath/BlueprintActivity.java"))

    // filter methods with special implementations
    val filteredMethods = activity.methods
            .filterNot { it.name.contains("NonConfigurationInstance") }
    activity = activity.copy(methods = filteredMethods)

    writeComposite(outPath,
            activity,
            "activity",
            "CompositeActivity",
            "AppCompatActivity implements ICompositeActivity",
            delegateClassName = "ActivityDelegate",
            pluginClassName = "ActivityPlugin",
            transform = replaceExtraData,
            additionalImports = """
            |import android.support.v4.app.SupportActivity;
            """.replaceIndentByMargin(),
            addCodeToClass = activity_custom_nonConfigurationInstance_handling)

    writeDelegate(outPath,
            activity,
            "activity",
            "ActivityDelegate",
            "ICompositeActivity",
            "ActivityPlugin",
            extends = "AbstractDelegate<ICompositeActivity, ActivityPlugin>",
            transform = replaceExtraData,
            additionalImports = """
            |import java.util.ListIterator;
            |import android.support.v4.app.SupportActivity;
            """.replaceIndentByMargin(),
            addCodeToClass = delegate_custom_nonConfigurationInstance_handling)

    writePlugin(outPath,
            "Activity",
            activity,
            "activity",
            "ActivityPlugin",
            extends = "AbstractPlugin<CompositeActivity, ActivityDelegate>",
            transform = replaceExtraData,
            additionalImports = """
            |import android.support.v4.app.SupportActivity;
            """.replaceIndentByMargin(),
            addCodeToClass = plugin_custom_nonConfigurationInstance_handling)

    writeInterface(outPath,
            activity,
            "activity",
            "ICompositeActivity",
            "LayoutInflater.Factory2, Window.Callback, KeyEvent.Callback, View.OnCreateContextMenuListener, ComponentCallbacks2, ActivityCompat.OnRequestPermissionsResultCallback, AppCompatCallback, ActionBarDrawerToggle.DelegateProvider",
            addCodeToClass = interface_custom_nonConfigurationInstance_handling,
            transform = replaceExtraData,
            additionalImports = """
            |import android.content.*;
            |import android.support.v4.app.*;
            |import android.support.v7.app.*;
            |import android.support.v4.app.SupportActivity;
            """.replaceIndentByMargin())
}
val replaceExtraData: (String) -> String = {
    it.replace(" ExtraData", " SupportActivity.ExtraData")
            .replace("(ExtraData)", "(SupportActivity.ExtraData)")
            .replace("<ExtraData", "<SupportActivity.ExtraData")
}

val interface_custom_nonConfigurationInstance_handling = """
        |Object getLastNonConfigurationInstance();
        |
        |Object getLastCustomNonConfigurationInstance();
        |
        |Object onRetainCustomNonConfigurationInstance();
        |
        |Object getLastCompositeCustomNonConfigurationInstance();
        |
        |Object onRetainCompositeCustomNonConfigurationInstance();
        """.replaceIndentByMargin("    ")

val activity_custom_nonConfigurationInstance_handling = """
        |/**
        | * Use {@link #getLastCompositeCustomNonConfigurationInstance()} instead. This is used internally
        | * @see AppCompatActivity#getLastNonConfigurationInstance()
        | */
        |@Nullable
        |@Override
        |final public Object getLastNonConfigurationInstance() {
        |    return super.getLastNonConfigurationInstance();
        |}
        |
        |/**
        | * Use {@link #getLastCompositeCustomNonConfigurationInstance()} instead. This is used internally
        | * @see AppCompatActivity#getLastCustomNonConfigurationInstance()
        | */
        |@Override
        |final public Object getLastCustomNonConfigurationInstance() {
        |    return super.getLastCustomNonConfigurationInstance();
        |}
        |
        |/**
        | * use {@link #onRetainCompositeCustomNonConfigurationInstance()} instead. This is used integrally
        | */
        |@Override
        |final public Object onRetainCustomNonConfigurationInstance() {
        |    return delegate.onRetainNonConfigurationInstance();
        |}
        |
        |/**
        | * @return see {@link #AppCompatActivity#getLastCustomNonConfigurationInstance()}
        | */
        |public Object getLastCompositeCustomNonConfigurationInstance() {
        |    return delegate.getLastCompositeCustomNonConfigurationInstance();
        |}
        |
        |/**
        | * save any object over configuration changes, get it with {@link #getLastCompositeCustomNonConfigurationInstance()}
        | * @return see {@link #AppCompatActivity#onRetainCustomNonConfigurationInstance()}
        | */
        |public Object onRetainCompositeCustomNonConfigurationInstance() {
        |    return null;
        |}
        """.replaceIndentByMargin("    ")

val delegate_custom_nonConfigurationInstance_handling = """
        |
        |public Object getLastCompositeCustomNonConfigurationInstance() {
        |    final Object nci = getOriginal().getLastCustomNonConfigurationInstance();
        |    if (nci instanceof NonConfigurationInstanceWrapper) {
        |        final NonConfigurationInstanceWrapper all = (NonConfigurationInstanceWrapper) nci;
        |        return all.getSuperNonConfigurationInstance();
        |    }
        |    return null;
        |}
        |
        |public Object getLastNonConfigurationInstance(final String key) {
        |    final Object nci = getOriginal().getLastCustomNonConfigurationInstance();
        |    if (nci instanceof NonConfigurationInstanceWrapper) {
        |        final NonConfigurationInstanceWrapper all = (NonConfigurationInstanceWrapper) nci;
        |        return all.getPluginNonConfigurationInstance(key);
        |    }
        |    return null;
        |}
        |
        |public Object onRetainNonConfigurationInstance() {
        |    final NonConfigurationInstanceWrapper all = new NonConfigurationInstanceWrapper(
        |            getOriginal().onRetainCompositeCustomNonConfigurationInstance());
        |    for (final ActivityPlugin plugin : mPlugins) {
        |        final CompositeNonConfigurationInstance pluginNci = plugin
        |                .onRetainNonConfigurationInstance();
        |        if (pluginNci != null) {
        |            all.putPluginNonConfigurationInstance(pluginNci);
        |        }
        |    }
        |    return all;
        |}
        """.replaceIndentByMargin("    ")

val plugin_custom_nonConfigurationInstance_handling = """
        |
        |public Object getLastNonConfigurationInstance(final String key) {
        |    return getCompositeDelegate().getLastNonConfigurationInstance(key);
        |}
        |
        |public CompositeNonConfigurationInstance onRetainNonConfigurationInstance() {
        |    return null;
        |}
        """.replaceIndentByMargin("    ")