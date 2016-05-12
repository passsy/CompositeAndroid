package com.pascalwelsch.compositeandroid.dialogfragment;

import com.pascalwelsch.compositeandroid.core.AbstractPlugin;
import com.pascalwelsch.compositeandroid.fragment.FragmentDelegate;

import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;

public class DialogFragmentPluginBase extends AbstractPlugin<Fragment, FragmentDelegate> {

    public DialogFragment getFragment() {
        return (DialogFragment) getOriginal();
    }
}