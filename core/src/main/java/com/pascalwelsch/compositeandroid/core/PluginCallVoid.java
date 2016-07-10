package com.pascalwelsch.compositeandroid.core;

public interface PluginCallVoid<P> {

    void call(NamedSuperCall<Void> superCall, P plugin, Object... args);
}
