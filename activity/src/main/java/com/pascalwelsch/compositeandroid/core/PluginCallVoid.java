package com.pascalwelsch.compositeandroid.core;

import com.pascalwelsch.compositeandroid.activity.ActivityPlugin;
import com.pascalwelsch.compositeandroid.core.NamedSuperCall;

public interface PluginCallVoid {

    void call(NamedSuperCall<Void> superCall, ActivityPlugin plugin, Object... args);
}
