package com.pascalwelsch.compositeandroid.activity;

import com.pascalwelsch.compositeandroid.core.AbstractDelegate;

import android.app.Activity;

abstract class ActivityDelegateBase extends AbstractDelegate<Activity, ActivityPlugin> {

    public ActivityDelegateBase(final CompositeActivity original) {
        super(original);
    }

    public Object getLastNonConfigurationInstance(final String key) {
        final Object nci = getCompositeActivity().getLastCustomNonConfigurationInstance();
        if (nci instanceof NonConfigurationInstanceWrapper) {
            final NonConfigurationInstanceWrapper all = (NonConfigurationInstanceWrapper) nci;
            return all.getPluginNonConfigurationInstance(key);
        }
        return null;
    }

    public Object onRetainNonConfigurationInstance() {
        final NonConfigurationInstanceWrapper all = new NonConfigurationInstanceWrapper(
                getCompositeActivity().onRetainCustomNonConfigurationInstance());
        for (final ActivityPlugin plugin : mPlugins) {
            final CompositeNonConfigurationInstance pluginNci = plugin
                    .onRetainNonConfigurationInstance();
            if (pluginNci != null) {
                all.putPluginNonConfigurationInstance(pluginNci);
            }
        }
        return all;
    }

    CompositeActivity getCompositeActivity() {
        return (CompositeActivity) getOriginal();
    }
}
