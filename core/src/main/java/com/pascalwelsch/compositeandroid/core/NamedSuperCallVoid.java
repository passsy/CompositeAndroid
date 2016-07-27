package com.pascalwelsch.compositeandroid.core;

public abstract class NamedSuperCallVoid implements SuperCall {

    private final String mMethodName;

    public NamedSuperCallVoid(final String methodName) {
        mMethodName = methodName;
    }

    public String getMethodName() {
        return mMethodName;
    }
}
