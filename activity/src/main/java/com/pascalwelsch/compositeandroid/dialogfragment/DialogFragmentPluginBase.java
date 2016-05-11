package com.pascalwelsch.compositeandroid.dialogfragment;

import com.pascalwelsch.compositeandroid.core.AbstractPlugin;
import com.pascalwelsch.compositeandroid.fragment.FragmentDelegate;

import android.support.v4.app.DialogFragment;

public class DialogFragmentPluginBase extends AbstractPlugin<DialogFragment, FragmentDelegate> {

    public DialogFragment getFragment() {
        return getOriginal();
    }
}