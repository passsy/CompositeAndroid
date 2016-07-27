package com.pascalwelsch.compositeandroid.core;

public abstract class CallVoid3<T1, T2, T3> extends NamedSuperCall {

    public CallVoid3(final String methodName) {
        super(methodName);
    }

    public abstract void call(final T1 p1, final T2 p2, final T3 p3);
}
