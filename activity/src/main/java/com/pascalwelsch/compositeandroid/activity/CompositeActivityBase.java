package com.pascalwelsch.compositeandroid.activity;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

abstract class CompositeActivityBase extends AppCompatActivity {

    private CompositeActivity realThis = (CompositeActivity) this;

    protected ActivityDelegate delegate = new ActivityDelegate(realThis);

    public Removable addPlugin(final ActivityPlugin plugin) {
        plugin.setActivity(realThis);
        final Removable delegateRemovable = delegate.addPlugin(plugin);

        return new Removable() {
            @Override
            public void remove() {
                delegateRemovable.remove();
                plugin.setActivity(null);
            }
        };
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
