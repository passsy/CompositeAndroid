package com.pascalwelsch.compositeandroid.fragment;

import android.util.Log;

import androidx.fragment.app.FragmentManager;

public class DialogTracking extends DialogFragmentPlugin {

    private static final String TAG = DialogTracking.class.getSimpleName();

    private String mName;

    public DialogTracking(final String name) {

        mName = name;
    }

    @Override
    public void onResume() {
        super.onResume();

        Log.v(TAG, mName + " onResume()");
    }

    @Override
    public void onStart() {
        super.onStart();

        Log.v(TAG, mName + " onStart()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.v(TAG, mName + " onStop()");
    }

    @Override
    public void show(final FragmentManager manager, final String tag) {
        super.show(manager, tag);
        Log.v(TAG, mName + "show(fm, tag)");
    }
}
