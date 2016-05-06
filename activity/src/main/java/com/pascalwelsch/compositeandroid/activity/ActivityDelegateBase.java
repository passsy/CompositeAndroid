package com.pascalwelsch.compositeandroid.activity;

import com.pascalwelsch.compositeandroid.core.NamedSuperCall;
import com.pascalwelsch.compositeandroid.core.PluginCall;
import com.pascalwelsch.compositeandroid.core.PluginCallVoid;
import com.pascalwelsch.compositeandroid.core.Removable;
import com.pascalwelsch.compositeandroid.core.SuperCall;
import com.pascalwelsch.compositeandroid.core.SuperCallVoid;

import android.support.annotation.NonNull;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

abstract class ActivityDelegateBase {

    protected final CompositeActivity mActivity;

    protected List<ActivityPlugin> mPlugins = new CopyOnWriteArrayList<>();

    private final ActivityDelegate realThis = (ActivityDelegate) this;

    public ActivityDelegateBase(final CompositeActivity compositeActivity) {
        mActivity = compositeActivity;
    }

    public Removable addPlugin(final ActivityPlugin plugin) {
        plugin.setActivityDelegate(realThis);
        mPlugins.add(plugin);
        return new Removable() {
            @Override
            public void remove() {
                mPlugins.remove(plugin);
                plugin.setActivityDelegate(null);
            }
        };
    }

    public Object getLastNonConfigurationInstance(final String key) {
        final Object nci = mActivity.getLastCustomNonConfigurationInstance();
        if (nci instanceof NonConfigurationInstanceWrapper) {
            final NonConfigurationInstanceWrapper all = (NonConfigurationInstanceWrapper) nci;
            return all.getPluginNonConfigurationInstance(key);
        }
        return null;
    }

    public Object onRetainNonConfigurationInstance() {
        final NonConfigurationInstanceWrapper all = new NonConfigurationInstanceWrapper(
                mActivity.onRetainCustomNonConfigurationInstance());
        for (final ActivityPlugin plugin : mPlugins) {
            final CompositeNonConfigurationInstance pluginNci = plugin
                    .onRetainNonConfigurationInstance();
            if (pluginNci != null) {
                all.putPluginNonConfigurationInstance(pluginNci);
            }
        }

        return all;
    }

    @NonNull
    protected <T> T callForwardFunction(final String methodName,
            final PluginCall<T> methodCall, final SuperCall<T> activitySuper,
            final Object... args) {

        final LinkedList<ActivityPlugin> plugins = new LinkedList<>(mPlugins);

        final ListIterator<ActivityPlugin> iterator = plugins.listIterator();
        return callForwardFunction(iterator, methodName, methodCall, activitySuper, args);
    }

    @NonNull
    protected <T> T callForwardFunction(final Iterator<ActivityPlugin> iterator,
            final String methodName,
            final PluginCall<T> methodCall, final SuperCall<T> activitySuper,
            final Object... args) {

        if (iterator.hasNext()) {
            final ActivityPlugin plugin = iterator.next();
            final NamedSuperCall<T> listener = new NamedSuperCall<T>(methodName) {
                @Override
                public T call(final Object... args) {
                    return callForwardFunction(iterator, methodName, methodCall, activitySuper,
                            args);
                }
            };
            final T result = methodCall.call(listener, plugin, args);
            return result;
        } else {
            return activitySuper.call(args);
        }
    }

    @NonNull
    protected <T> T callFunction(final String methodName,
            final PluginCall<T> methodCall, final SuperCall<T> activitySuper,
            final Object... args) {

        final LinkedList<ActivityPlugin> plugins = new LinkedList<>(mPlugins);

        final ListIterator<ActivityPlugin> iterator = plugins.listIterator(plugins.size());
        return callFunction(iterator, methodName, methodCall, activitySuper, args);
    }

    @NonNull
    protected <T> T callFunction(final ListIterator<ActivityPlugin> iterator,
            final String methodName,
            final PluginCall<T> methodCall, final SuperCall<T> activitySuper,
            final Object... args) {

        if (iterator.hasPrevious()) {
            ActivityPlugin plugin = iterator.previous();
            final NamedSuperCall<T> listener = new NamedSuperCall<T>(methodName) {
                @Override
                public T call(final Object... args) {
                    return callFunction(iterator, methodName, methodCall, activitySuper, args);
                }
            };
            final T result = methodCall.call(listener, plugin, args);
            return result;

        } else {
            return activitySuper.call(args);
        }
    }

    protected void callHook(final String methodName,
            final PluginCallVoid methodCall, final SuperCallVoid activitySuper,
            final Object... args) {

        final LinkedList<ActivityPlugin> plugins = new LinkedList<>(mPlugins);

        final ListIterator<ActivityPlugin> iterator = plugins.listIterator(plugins.size());
        callHook(iterator, methodName, methodCall, activitySuper, args);
    }

    void callHook(final ListIterator<ActivityPlugin> iterator, final String methodName,
            final PluginCallVoid methodCall, final SuperCallVoid activitySuper,
            final Object... args) {

        if (iterator.hasPrevious()) {
            final ActivityPlugin plugin = iterator.previous();
            final NamedSuperCall<Void> listener = new NamedSuperCall<Void>(methodName) {
                @Override
                public Void call(final Object... args) {
                    callHook(iterator, methodName, methodCall, activitySuper, args);
                    return null;
                }
            };
            methodCall.call(listener, plugin, args);
        } else {
            activitySuper.call(args);
        }
    }
}
