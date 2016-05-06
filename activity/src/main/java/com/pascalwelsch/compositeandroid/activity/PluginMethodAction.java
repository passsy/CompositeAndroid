package com.pascalwelsch.compositeandroid.activity;

public interface PluginMethodAction {

    void call(ActivitySuperFunction superCall, ActivityPlugin plugin, Object... args);
}
