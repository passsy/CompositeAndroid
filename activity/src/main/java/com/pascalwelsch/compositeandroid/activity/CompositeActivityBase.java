package com.pascalwelsch.compositeandroid.activity;

import com.pascalwelsch.compositeandroid.core.Removable;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

abstract class CompositeActivityBase extends AppCompatActivity {

    protected ActivityDelegate delegate = new ActivityDelegate((CompositeActivity) this);

    public Removable addPlugin(final ActivityPlugin plugin) {
        return delegate.addPlugin(plugin);
    }

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
