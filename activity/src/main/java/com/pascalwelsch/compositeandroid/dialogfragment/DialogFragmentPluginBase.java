package com.pascalwelsch.compositeandroid.dialogfragment;

import com.pascalwelsch.compositeandroid.core.AbstractPlugin;
import com.pascalwelsch.compositeandroid.fragment.FragmentDelegate;

public class DialogFragmentPluginBase extends AbstractPlugin<CompositeDialogFragment, FragmentDelegate> {

    public CompositeDialogFragment getFragment() {
        return getOriginal();
    }
}