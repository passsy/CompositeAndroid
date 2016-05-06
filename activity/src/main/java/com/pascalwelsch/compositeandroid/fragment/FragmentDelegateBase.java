package com.pascalwelsch.compositeandroid.fragment;

import com.pascalwelsch.compositeandroid.core.AbstractDelegate;

import android.support.v4.app.Fragment;

public class FragmentDelegateBase extends AbstractDelegate<Fragment, FragmentPlugin> {

    public FragmentDelegateBase(final Fragment original) {
        super(original);
    }

    public CompositeFragment getFragment() {
        return (CompositeFragment) getOriginal();
    }
}
