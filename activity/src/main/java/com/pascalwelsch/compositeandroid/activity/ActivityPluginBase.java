package com.pascalwelsch.compositeandroid.activity;

import java.util.Stack;

abstract class ActivityPluginBase {

    ActivityDelegate mActivityDelegate;

    CompositeActivity mCompositeActivity;

    Stack<ActivitySuperFunction<?>> mSuperListeners = new Stack<>();

    public CompositeActivity getActivity() {
        return mCompositeActivity;
    }

    public Object getLastNonConfigurationInstance(final String key) {
        return mActivityDelegate.getLastNonConfigurationInstance(key);
    }

    public CompositeNonConfigurationInstance onRetainNonConfigurationInstance() {
        return null;
    }

    public void popSuperCallListener() {
        mSuperListeners.pop();
    }

    public <T> void pushSuperCallListener(ActivitySuperFunction<T> listener) {
        mSuperListeners.push(listener);
    }

    public void setActivity(
            final CompositeActivity compositeActivity) {
        mCompositeActivity = compositeActivity;
    }

    public void setActivityDelegate(final ActivityDelegate activityDelegate) {
        mActivityDelegate = activityDelegate;
    }

    void verifyMethodCalledFromDelegate(final String method) {
        if (mSuperListeners.isEmpty()) {
            throw new IllegalStateException("Do not call " + method
                    + " on a ActivityPlugin directly. You have to call mDelegate." + method
                    + " or the call order of the plugins would be mixed up.");
        }
        final String superListener = mSuperListeners.peek().getMethodName();
        if (!superListener.equals(method)) {
            throw new IllegalStateException("You may have called "
                    + method + " from " + superListener + " instead of calling getActivity()."
                    + method + ". Do not call " + method
                    + " on a ActivityPlugin directly. You have to call mDelegate." + method
                    + " or the call order of the plugins would be mixed up.");
        }
    }
}
