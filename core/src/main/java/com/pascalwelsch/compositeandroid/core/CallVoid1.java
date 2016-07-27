package com.pascalwelsch.compositeandroid.core;

public abstract class CallVoid1<T1> extends NamedSuperCall {

    public CallVoid1(final String methodName) {
        super(methodName);
    }

    public abstract void call(final T1 p1);
}
