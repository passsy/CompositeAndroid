package com.pascalwelsch.compositeandroid.fragment;

public class DialogFragmentPluginBase
        extends FragmentPlugin {

    public CompositeDialogFragment getDialogFragment() {
        return (CompositeDialogFragment) getOriginal();
    }
}