package com.pascalwelsch.compositeandroid.activity;

public class CompositeNonConfigurationInstance {

    private String mId;

    private Object mObject;

    public CompositeNonConfigurationInstance(final String id, final Object object) {
        mId = id;
        mObject = object;
    }

    public String getId() {
        return mId;
    }

    public Object getNonConfigurationInstance() {
        return mObject;
    }
}
