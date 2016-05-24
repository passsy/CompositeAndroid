package com.pascalwelsch.compositeandroid.fragment;

import com.pascalwelsch.compositeandroid.core.AbstractPlugin;

import android.support.v4.app.Fragment;

public class FragmentPluginBase extends AbstractPlugin<Fragment, FragmentDelegate> {

    public ICompositeFragment getFragment() {
        return (ICompositeFragment) getOriginal();
    }
}
