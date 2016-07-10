package types

import inPath
import parse.AnalyzedJavaFile
import parse.parseJavaFile
import writer.writeComposite
import writer.writeDelegate
import writer.writeInterface
import writer.writePlugin
import java.io.File

private val outPackage = "fragment"

fun main(args: Array<String>) {
    generateFragments()
}

fun generateFragments() {

    val fragment = parseJavaFile(File("$inPath/BlueprintFragment.java"))

    generateFragment(fragment)

    generateDialogFragment(fragment)
}


val replaceSavedState: (String) -> String = {
    it.replace(" SavedState", " Fragment.SavedState")
            .replace("(SavedState)", "(Fragment.SavedState)")
}

private fun generateDialogFragment(fragment: AnalyzedJavaFile) {
    val dialogfragment = parseJavaFile(File("$inPath/BlueprintDialogFragment.java"))

    writeComposite(dialogfragment,
            outPackage,
            "CompositeDialogFragment",
            "DialogFragment implements ICompositeDialogFragment",
            additionalImports = """
            |import android.support.v4.app.*;
            |import java.io.*;
            |import android.content.*;
            |import android.view.*;
            |import android.view.animation.*;
            |import android.util.*;
            |import android.content.res.*;
            """.replaceIndentByMargin(),
            transform = replaceSavedState,
            superClassPluginNames = listOf("FragmentPlugin"),
            superClassDelegateName = "FragmentDelegate",
            pluginClassName = "DialogFragmentPlugin",
            delegateClassName = "DialogFragmentDelegate",
            superClassInputFile = fragment)

    writeDelegate(dialogfragment,
            outPackage,
            "DialogFragmentDelegate",
            "ICompositeDialogFragment",
            "DialogFragmentPlugin",
            "getOriginal()",
            additionalImports = """
            |import android.support.v4.app.*;
            |import java.io.*;
            |import android.content.*;
            |import android.view.*;
            |import android.view.animation.*;
            |import android.util.*;
            |import android.content.res.*;
            """.replaceIndentByMargin(),
            transform = replaceSavedState,
            extends = "AbstractDelegate<ICompositeDialogFragment, DialogFragmentPlugin>",
            superClassPluginName = "FragmentPlugin",
            superClassDelegateName = "FragmentDelegate",
            superClassInputFile = fragment)

    writePlugin("DialogFragment",
            dialogfragment,
            outPackage,
            "DialogFragmentPlugin",
            transform = replaceSavedState,
            superClassInputFile = fragment,
            extends = "FragmentPlugin")

    writeInterface(dialogfragment,
            outPackage,
            "ICompositeDialogFragment",
            "ICompositeFragment",
            transform = replaceSavedState)
}

private fun generateFragment(fragment: AnalyzedJavaFile) {
    writeComposite(fragment,
            outPackage,
            "CompositeFragment",
            "Fragment implements ICompositeFragment",
            """
            |import android.support.v4.app.*;
            """.replaceIndentByMargin(),
            transform = replaceSavedState,
            delegateClassName = "FragmentDelegate",
            pluginClassName = "FragmentPlugin", superClassInputFile = fragment)

    writeDelegate(fragment,
            outPackage,
            "FragmentDelegate",
            "ICompositeFragment",
            "FragmentPlugin",
            "getOriginal()",
            additionalImports =
            """
            |import android.support.v4.app.*;
            """.replaceIndentByMargin(),
            extends = "AbstractDelegate<ICompositeFragment, FragmentPlugin>",
            transform = replaceSavedState)

    writePlugin("Fragment",
            fragment,
            outPackage,
            "FragmentPlugin",
            additionalImports =
            """
            |import android.support.v4.app.*;
            """.replaceIndentByMargin(),
            transform = replaceSavedState,
            superClassInputFile = fragment,
            extends = "AbstractPlugin<Fragment, FragmentDelegate>")

    writeInterface(fragment,
            outPackage,
            "ICompositeFragment",
            transform = replaceSavedState)
}