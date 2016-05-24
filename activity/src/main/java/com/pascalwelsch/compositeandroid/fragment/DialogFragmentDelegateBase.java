package com.pascalwelsch.compositeandroid.fragment;

import com.pascalwelsch.compositeandroid.core.AbstractDelegate;

public class DialogFragmentDelegateBase
        extends AbstractDelegate<CompositeDialogFragment, DialogFragmentPlugin> {

    public DialogFragmentDelegateBase(final CompositeDialogFragment original) {
        super(original);
    }

/*
    public CompositeDialogFragment getDialogFragment() {
        return (CompositeDialogFragment) getOriginal();
    }
*/

/*    protected <R> R callDialogFunction(final String methodName,
            final PluginCall<DialogFragmentPlugin, R> methodCall,
            final SuperCall<R> activitySuper, final Object... args) {
        return callFunction(methodName, new PluginCall<FragmentPlugin, R>() {
            @Override
            public R call(final NamedSuperCall<R> superCall, final FragmentPlugin plugin,
                    final Object... args) {
                return methodCall.call(superCall, (DialogFragmentPlugin) plugin, args);
            }
        }, activitySuper, args);
    }*/
}