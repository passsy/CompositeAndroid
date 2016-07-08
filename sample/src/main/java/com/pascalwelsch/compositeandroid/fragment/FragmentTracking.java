package com.pascalwelsch.compositeandroid.fragment;

import android.util.Log;

public class FragmentTracking extends FragmentPlugin {

    private static final String TAG = FragmentTracking.class.getSimpleName();

    @Override
    public void onResume() {
        super.onResume();

        Log.v(TAG, "#1 onResume()");
    }

    @Override
    public void onStart() {
        super.onStart();

        Log.v(TAG, "#1 onStart()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.v(TAG, "#1 onStop()");
    }
}
