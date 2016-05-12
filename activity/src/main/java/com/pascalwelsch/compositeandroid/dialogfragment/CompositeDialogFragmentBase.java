package com.pascalwelsch.compositeandroid.dialogfragment;

import com.pascalwelsch.compositeandroid.core.Removable;

import android.support.v4.app.DialogFragment;

public class CompositeDialogFragmentBase extends DialogFragment {

    protected DialogFragmentDelegate delegate = new DialogFragmentDelegate(
            (CompositeDialogFragment) this);

    public Removable addPlugin(final DialogFragmentPlugin plugin) {
        return delegate.addPlugin(plugin);
    }
}
