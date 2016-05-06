package com.pascalwelsch.compositeandroid.core;

import com.pascalwelsch.compositeandroid.activity.ActivityPlugin;
import com.pascalwelsch.compositeandroid.core.NamedSuperCall;

public interface PluginCall<R> {

    R call(NamedSuperCall<R> superCall, ActivityPlugin plugin, Object... args);
}
