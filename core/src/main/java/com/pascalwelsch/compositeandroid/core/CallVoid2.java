package com.pascalwelsch.compositeandroid.core;

public abstract class CallVoid2<T1, T2> extends NamedSuperCall {

    public CallVoid2(final String methodName) {
        super(methodName);
    }

    public abstract void call(final T1 p1, final T2 p2);
}
