package com.pascalwelsch.compositeandroid.fragment;

import com.pascalwelsch.compositeandroid.core.AbstractDelegate;

public class FragmentDelegateBase extends AbstractDelegate<IFragment, FragmentPlugin> {

    public FragmentDelegateBase(final IFragment original) {
        super(original);
    }
}
