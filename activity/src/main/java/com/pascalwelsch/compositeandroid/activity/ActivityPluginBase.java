package com.pascalwelsch.compositeandroid.activity;

import com.pascalwelsch.compositeandroid.core.AbstractPlugin;

import android.app.Activity;

abstract class ActivityPluginBase extends AbstractPlugin<Activity, ActivityDelegate> {

    public CompositeActivity getActivity() {
        return (CompositeActivity) getOriginal();
    }

    public Object getLastNonConfigurationInstance(final String key) {
        return getCompositeDelegate().getLastNonConfigurationInstance(key);
    }

    public CompositeNonConfigurationInstance onRetainNonConfigurationInstance() {
        return null;
    }

}
