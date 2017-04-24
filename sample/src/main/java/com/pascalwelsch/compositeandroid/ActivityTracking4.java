package com.pascalwelsch.compositeandroid;

import android.util.Log;

import com.pascalwelsch.compositeandroid.activity.ActivityPlugin;

public class ActivityTracking4 extends ActivityPlugin {

    private static final String TAG = ActivityTracking4.class.getSimpleName();

    @Override
    public void onResume() {
        super.onResume();
        Log.v(TAG, "#4 onResume()");
    }
}
