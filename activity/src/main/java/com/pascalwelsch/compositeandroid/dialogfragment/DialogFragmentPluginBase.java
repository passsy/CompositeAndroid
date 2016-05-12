package com.pascalwelsch.compositeandroid.dialogfragment;

import com.pascalwelsch.compositeandroid.core.AbstractPlugin;

public class DialogFragmentPluginBase
        extends AbstractPlugin<CompositeDialogFragment, DialogFragmentDelegate> {

    public CompositeDialogFragment getFragment() {
        return getOriginal();
    }
}