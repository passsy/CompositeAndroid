import java.io.File

fun main(args: Array<String>) {
    var fragment = parseJavaFile(File("$inPath/Fragment.java"))

    val replaceSavedState: (String) -> String = {
        it.replace(" SavedState", " Fragment.SavedState")
                .replace("(SavedState)", "(Fragment.SavedState)")
    }

    writeComposite(fragment, "fragment", "CompositeFragment",
            """
            import android.support.v4.app.Fragment;
            import android.support.v4.app.FragmentActivity;
            import android.support.v4.app.FragmentHostCallback;
            import android.support.v4.app.SharedElementCallback;
            """, transform = replaceSavedState)
    writeDelegate(fragment, "fragment", "FragmentDelegate", "CompositeFragment", "FragmentPlugin",
            "getFragment()", transform = replaceSavedState)
    writePlugin(fragment, "fragment", "FragmentPlugin", transform = replaceSavedState)
}