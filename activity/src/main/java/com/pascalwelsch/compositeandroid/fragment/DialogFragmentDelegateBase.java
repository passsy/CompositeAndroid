package com.pascalwelsch.compositeandroid.fragment;

import com.pascalwelsch.compositeandroid.core.NamedSuperCall;
import com.pascalwelsch.compositeandroid.core.PluginCall;
import com.pascalwelsch.compositeandroid.core.PluginCallVoid;
import com.pascalwelsch.compositeandroid.core.SuperCall;
import com.pascalwelsch.compositeandroid.core.SuperCallVoid;

public class DialogFragmentDelegateBase
        extends FragmentDelegate {

    public DialogFragmentDelegateBase(final CompositeDialogFragmentBase original) {
        super(original);
    }

    public CompositeDialogFragment getDialogFragment() {
        return (CompositeDialogFragment) getOriginal();
    }

    protected <R> R callDialogFunction(final String methodName,
            final PluginCall<DialogFragmentPlugin, R> methodCall,
            final SuperCall<R> activitySuper, final Object... args) {
        return callFunction(methodName, new PluginCall<FragmentPlugin, R>() {
            @Override
            public R call(final NamedSuperCall<R> superCall, final FragmentPlugin plugin,
                    final Object... args) {
                return methodCall.call(superCall, (DialogFragmentPlugin) plugin, args);
            }
        }, activitySuper, args);
    }

    protected void callDialogHook(final String methodName,
            final PluginCallVoid methodCall, final SuperCallVoid activitySuper,
            final Object... args) {
        callHook(methodName, new PluginCallVoid<FragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall superCall, final FragmentPlugin plugin,
                    final Object... args) {
                methodCall.call(superCall, plugin, args);
            }
        }, activitySuper, args);
    }
}