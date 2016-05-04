package com.pascalwelsch.compositeandroid.activity;

public abstract class ActivitySuperFunction<R> {

    private final String mMethodName;

    public ActivitySuperFunction(final String methodName) {
        mMethodName = methodName;
    }

    public String getMethodName() {
        return mMethodName;
    }

    abstract R call(Object... args);
}
