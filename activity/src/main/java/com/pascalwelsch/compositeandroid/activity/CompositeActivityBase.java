package com.pascalwelsch.compositeandroid.activity;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

abstract class CompositeActivityBase extends AppCompatActivity {

    private CompositeActivity realThis = (CompositeActivity) this;

    protected ActivityDelegate delegate = new ActivityDelegate(realThis);

    @Nullable
    @Override
    final public Object getLastNonConfigurationInstance() {
        return super.getLastNonConfigurationInstance();
    }

    public void mixin(ActivityPlugin plugin) {
        plugin.setActivity(realThis);
        delegate.addPlugin(plugin);
    }

    @Override
    public Object onRetainCustomNonConfigurationInstance() {
        return super.onRetainCustomNonConfigurationInstance();
    }
}
