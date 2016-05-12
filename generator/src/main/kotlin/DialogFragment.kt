import java.io.File

fun main(args: Array<String>) {
    var fragment = parseJavaFile(File("$inPath/DialogFragment.java"))

    val replaceSavedState: (String) -> String = {
        it.replace(" SavedState", " Fragment.SavedState")
                .replace("(SavedState)", "(Fragment.SavedState)")
    }

    writeComposite(fragment, "dialogfragment", "CompositeDialogFragment",
            """
            import android.support.v4.app.DialogFragment;
            import android.support.v4.app.FragmentActivity;
            import android.support.v4.app.FragmentHostCallback;
            import android.support.v4.app.SharedElementCallback;
            """, transform = replaceSavedState)
    writeDelegate(fragment, "dialogfragment", "DialogFragmentDelegate", "CompositeDialogFragment", "DialogFragmentPlugin",
            "getFragment()", transform = replaceSavedState)
    writePlugin(fragment, "dialogfragment", "DialogFragmentPlugin", transform = replaceSavedState)
}