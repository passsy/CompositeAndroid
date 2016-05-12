package com.pascalwelsch.compositeandroid.dialogfragment;

import com.pascalwelsch.compositeandroid.core.AbstractDelegate;

import android.support.v4.app.DialogFragment;

public class DialogFragmentDelegateBase extends AbstractDelegate<DialogFragment, DialogFragmentPlugin> {

    public DialogFragmentDelegateBase(final CompositeDialogFragment original) {
        super(original);
    }

    public CompositeDialogFragment getFragment() {
        return (CompositeDialogFragment) getOriginal();
    }
}