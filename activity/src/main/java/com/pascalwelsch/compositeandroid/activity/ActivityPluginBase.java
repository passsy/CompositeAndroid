package com.pascalwelsch.compositeandroid.activity;

public abstract class ActivityPluginBase {

    ActivityDelegate mActivityDelegate;

    ActivityDelegate.ActivitySuperFunction<?> mSuperListener;

    public Object getLastNonConfigurationInstance(final String key) {
        return mActivityDelegate.getLastNonConfigurationInstance(key);
    }

    public CompositeNonConfigurationInstance onRetainNonConfigurationInstance() {
        return null;
    }

    public void setActivityDelegate(final ActivityDelegate activityDelegate) {
        mActivityDelegate = activityDelegate;
    }

    public <T> void setSuperCallListener(ActivityDelegate.ActivitySuperFunction<T> listener) {
        mSuperListener = listener;
    }
}
