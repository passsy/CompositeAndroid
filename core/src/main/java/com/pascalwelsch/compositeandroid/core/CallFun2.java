package com.pascalwelsch.compositeandroid.core;

public abstract class CallFun2<R, T1, T2> extends NamedSuperCall {

    public CallFun2(final String methodName) {
        super(methodName);
    }

    public abstract R call(final T1 p1, final T2 p2);
}
