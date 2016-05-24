package com.pascalwelsch.compositeandroid.fragment;

import com.pascalwelsch.compositeandroid.core.Removable;

import android.support.v4.app.DialogFragment;

public abstract class CompositeDialogFragmentBase extends DialogFragment implements ICompositeFragment{

    protected DialogFragmentDelegate delegate = new DialogFragmentDelegate(this);

    public Removable addPlugin(final FragmentPlugin plugin) {
        return delegate.addPlugin(plugin);
    }
}
