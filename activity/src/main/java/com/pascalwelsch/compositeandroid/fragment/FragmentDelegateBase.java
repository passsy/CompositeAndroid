package com.pascalwelsch.compositeandroid.fragment;

import com.pascalwelsch.compositeandroid.core.AbstractDelegate;

public class FragmentDelegateBase extends AbstractDelegate<ICompositeFragment, FragmentPlugin> {

    public FragmentDelegateBase(final ICompositeFragment original) {
        super(original);
    }
}
