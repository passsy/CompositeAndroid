package com.pascalwelsch.compositeandroid.activity;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

abstract class CompositeActivityBase extends AppCompatActivity {

    @Nullable
    @Override
    final public Object getLastNonConfigurationInstance() {
        return super.getLastNonConfigurationInstance();
    }

    @Override
    public Object onRetainCustomNonConfigurationInstance() {
        return super.onRetainCustomNonConfigurationInstance();
    }
}
