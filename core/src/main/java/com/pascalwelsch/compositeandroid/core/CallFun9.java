package com.pascalwelsch.compositeandroid.core;

public abstract class CallFun9<R, T1, T2, T3, T4, T5, T6, T7, T8, T9> extends NamedSuperCall {

    public CallFun9(final String methodName) {
        super(methodName);
    }

    public abstract R call(final T1 p1, final T2 p2, final T3 p3, final T4 p4, T5 p5, T6 p6, T7 p7,
            T8 p8, T9 p9);
}
