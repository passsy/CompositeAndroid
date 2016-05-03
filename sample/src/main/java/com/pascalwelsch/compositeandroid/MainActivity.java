package com.pascalwelsch.compositeandroid;

import com.pascalwelsch.compositeandroid.activity.CompositeActivity;

import android.os.Bundle;

public class MainActivity extends CompositeActivity {

    public MainActivity() {
        mixin(new Tracking());
        mixin(new Tracking2());
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
