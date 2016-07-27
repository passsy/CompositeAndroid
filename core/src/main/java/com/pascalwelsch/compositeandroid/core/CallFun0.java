package com.pascalwelsch.compositeandroid.core;

public abstract class CallFun0<R> extends NamedSuperCall {

    public CallFun0(final String methodName) {
        super(methodName);
    }

    public abstract R call();
}
