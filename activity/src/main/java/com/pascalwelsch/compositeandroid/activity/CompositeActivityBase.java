package com.pascalwelsch.compositeandroid.activity;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class CompositeActivityBase extends AppCompatActivity {

    protected ActivityDelegate delegate = new ActivityDelegate((CompositeActivity) this);

    @Nullable
    @Override
    final public Object getLastNonConfigurationInstance() {
        return super.getLastNonConfigurationInstance();
    }

    public void mixin(ActivityPlugin plugin) {
        delegate.addPlugin(plugin);
    }

    @Override
    public Object onRetainCustomNonConfigurationInstance() {
        return super.onRetainCustomNonConfigurationInstance();
    }
}
