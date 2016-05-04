package com.pascalwelsch.compositeandroid.activity;

public interface PluginMethodFunction<R> {

    R call(ActivityPlugin plugin, Object... args);
}
