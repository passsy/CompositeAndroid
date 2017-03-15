package com.pascalwelsch.compositeandroid;

import android.util.Log;

import com.pascalwelsch.compositeandroid.activity.ActivityPlugin;

public class ActivityTracking3 extends ActivityPlugin {

    private static final String TAG = ActivityTracking3.class.getSimpleName();

    @Override
    public void onResume() {
        super.onResume();
        Log.v(TAG, "#3 onResume()");
    }
}
