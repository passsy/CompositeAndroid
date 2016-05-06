package com.pascalwelsch.compositeandroid.activity;

public interface PluginMethodFunction<R> {

    R call(ActivitySuperFunction<R> superCall, ActivityPlugin plugin, Object... args);
}
