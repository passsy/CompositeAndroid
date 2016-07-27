package com.pascalwelsch.compositeandroid.core;

public abstract class CallFun1<R, T1> extends NamedSuperCall {

    public CallFun1(final String methodName) {
        super(methodName);
    }

    public abstract R call(final T1 p1);
}
