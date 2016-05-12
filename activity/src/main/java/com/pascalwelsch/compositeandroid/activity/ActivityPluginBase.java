package com.pascalwelsch.compositeandroid.activity;

import com.pascalwelsch.compositeandroid.core.AbstractPlugin;

abstract class ActivityPluginBase extends AbstractPlugin<CompositeActivity, ActivityDelegate> {

    public CompositeActivity getActivity() {
        return getOriginal();
    }

    public Object getLastNonConfigurationInstance(final String key) {
        return getCompositeDelegate().getLastNonConfigurationInstance(key);
    }

    public CompositeNonConfigurationInstance onRetainNonConfigurationInstance() {
        return null;
    }

}
