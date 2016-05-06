package com.pascalwelsch.compositeandroid.core;

public interface PluginCall<P, R> {

    R call(NamedSuperCall<R> superCall, P plugin, Object... args);
}
