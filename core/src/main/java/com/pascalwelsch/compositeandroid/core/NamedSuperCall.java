package com.pascalwelsch.compositeandroid.core;

public abstract class NamedSuperCall<R> implements SuperCall<R> {

    private final String mMethodName;

    public NamedSuperCall(final String methodName) {
        mMethodName = methodName;
    }

    public String getMethodName() {
        return mMethodName;
    }
}
