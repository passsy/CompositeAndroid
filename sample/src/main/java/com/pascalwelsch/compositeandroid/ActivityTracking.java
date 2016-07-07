package com.pascalwelsch.compositeandroid;

import com.pascalwelsch.compositeandroid.activity.ActivityPlugin;

import android.util.Log;

public class ActivityTracking extends ActivityPlugin {

    private static final String TAG = ActivityTracking.class.getSimpleName();

    @Override
    public void onResume() {
        super.onResume();
        Log.v(TAG, "#1 onResume()");
    }
}
