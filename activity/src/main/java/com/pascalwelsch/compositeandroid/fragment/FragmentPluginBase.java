package com.pascalwelsch.compositeandroid.fragment;

import com.pascalwelsch.compositeandroid.core.AbstractPlugin;

public class FragmentPluginBase extends AbstractPlugin<CompositeFragment, FragmentDelegate> {

    public CompositeFragment getFragment() {
        return getOriginal();
    }
}
