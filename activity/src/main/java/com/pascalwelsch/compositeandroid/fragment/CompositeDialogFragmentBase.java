package com.pascalwelsch.compositeandroid.fragment;

import com.pascalwelsch.compositeandroid.core.Removable;
import com.pascalwelsch.compositeandroid.fragment.CompositeDialogFragment;
import com.pascalwelsch.compositeandroid.fragment.DialogFragmentDelegate;
import com.pascalwelsch.compositeandroid.fragment.DialogFragmentPlugin;
import com.pascalwelsch.compositeandroid.fragment.FragmentPlugin;
import com.pascalwelsch.compositeandroid.fragment.IFragment;

import android.support.v4.app.DialogFragment;

public abstract class CompositeDialogFragmentBase extends DialogFragment implements IFragment {

    protected DialogFragmentDelegate delegate = new DialogFragmentDelegate(
            (CompositeDialogFragment) this);

    public Removable addPlugin(final FragmentPlugin plugin) {
        return delegate.addPlugin(plugin);
    }

    public Removable addPlugin(final DialogFragmentPlugin plugin) {
        return delegate.addPlugin(plugin);
    }
}
