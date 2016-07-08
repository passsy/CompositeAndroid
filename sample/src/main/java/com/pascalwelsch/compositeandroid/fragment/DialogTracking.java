package com.pascalwelsch.compositeandroid.fragment;

import android.support.v4.app.FragmentManager;
import android.util.Log;

public class DialogTracking extends DialogFragmentPlugin {

    private static final String TAG = DialogTracking.class.getSimpleName();

    @Override
    public void onResume() {
        super.onResume();

        Log.v(TAG, "#2 onResume()");
    }

    @Override
    public void onStart() {
        super.onStart();

        Log.v(TAG, "#2 onStart()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.v(TAG, "#2 onStop()");
    }

    @Override
    public void show(final FragmentManager manager, final String tag) {
        super.show(manager, tag);
        Log.v(TAG, "show(fm, tag)");
    }
}
