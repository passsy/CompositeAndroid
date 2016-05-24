package com.pascalwelsch.compositeandroid.fragment;

import com.pascalwelsch.compositeandroid.core.Removable;

import android.support.v4.app.Fragment;

public abstract class CompositeFragmentBase extends Fragment implements ICompositeFragment{

    protected FragmentDelegate delegate = new FragmentDelegate((CompositeFragment) this);

    public Removable addPlugin(final FragmentPlugin plugin) {
        return delegate.addPlugin(plugin);
    }

}
