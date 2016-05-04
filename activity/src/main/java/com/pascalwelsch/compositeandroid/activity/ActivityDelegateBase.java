package com.pascalwelsch.compositeandroid.activity;

import android.support.annotation.NonNull;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

abstract class ActivityDelegateBase {

    protected final CompositeActivity mActivity;

    protected ActivityPluginBase mCallingPlugin;

    protected List<ActivityPlugin> mPlugins = new CopyOnWriteArrayList<>();

    public ActivityDelegateBase(final CompositeActivity compositeActivity) {
        mActivity = compositeActivity;
    }

    public void addPlugin(final ActivityPlugin plugin) {
        plugin.setActivityDelegate((ActivityDelegate) this);
        mPlugins.add(plugin);
    }

    public void callingPlugin(final ActivityPluginBase plugin) {
        mCallingPlugin = plugin;
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

    public void removePlugin(final ActivityPluginBase plugin) {
        mPlugins.remove(plugin);
    }

    @NonNull
    protected <T> T callForwardFunction(final String methodName,
            final PluginMethodFunction<T> methodCall, final ActivitySuperFunction<T> activitySuper,
            final Object... args) {

        final LinkedList<ActivityPlugin> plugins = new LinkedList<>(mPlugins);
        plugins.remove(mCallingPlugin);

        final ListIterator<ActivityPlugin> iterator = plugins.listIterator();
        return callForwardFunction(iterator, methodName, methodCall, activitySuper, args);
    }

    @NonNull
    protected <T> T callForwardFunction(final Iterator<ActivityPlugin> iterator,
            final String methodName,
            final PluginMethodFunction<T> methodCall, final ActivitySuperFunction<T> activitySuper,
            final Object... args) {

        if (iterator.hasNext()) {
            final ActivityPlugin plugin = iterator.next();
            final ActivitySuperFunction<T> listener = new ActivitySuperFunction<T>(methodName) {
                @Override
                public T call(final Object... args) {
                    return callForwardFunction(iterator, methodName, methodCall, activitySuper,
                            args);
                }
            };
            plugin.pushSuperCallListener(listener);
            final T result = methodCall.call(plugin, args);
            plugin.popSuperCallListener();
            return result;
        } else {
            return activitySuper.call(args);
        }
    }

    @NonNull
    protected <T> T callFunction(final String methodName,
            final PluginMethodFunction<T> methodCall, final ActivitySuperFunction<T> activitySuper,
            final Object... args) {

        final LinkedList<ActivityPlugin> plugins = new LinkedList<>(mPlugins);
        plugins.remove(mCallingPlugin);

        final ListIterator<ActivityPlugin> iterator = plugins.listIterator(plugins.size());
        return callFunction(iterator, methodName, methodCall, activitySuper, args);
    }

    @NonNull
    protected <T> T callFunction(final ListIterator<ActivityPlugin> iterator,
            final String methodName,
            final PluginMethodFunction<T> methodCall, final ActivitySuperFunction<T> activitySuper,
            final Object... args) {

        if (iterator.hasPrevious()) {
            ActivityPlugin plugin = iterator.previous();
            final ActivitySuperFunction<T> listener = new ActivitySuperFunction<T>(methodName) {
                @Override
                public T call(final Object... args) {
                    return callFunction(iterator, methodName, methodCall, activitySuper, args);
                }
            };
            plugin.pushSuperCallListener(listener);
            final T result = methodCall.call(plugin, args);
            plugin.popSuperCallListener();
            return result;
        } else {
            return activitySuper.call(args);
        }
    }

    protected void callHook(final String methodName,
            final PluginMethodAction methodCall, final ActivitySuperAction activitySuper,
            final Object... args) {

        final LinkedList<ActivityPlugin> plugins = new LinkedList<>(mPlugins);
        plugins.remove(mCallingPlugin);

        final ListIterator<ActivityPlugin> iterator = plugins.listIterator(plugins.size());
        callHook(iterator, methodName, methodCall, activitySuper, args);
    }

    void callHook(final ListIterator<ActivityPlugin> iterator, final String methodName,
            final PluginMethodAction methodCall, final ActivitySuperAction activitySuper,
            final Object... args) {

        if (iterator.hasPrevious()) {
            final ActivityPlugin plugin = iterator.previous();
            final ActivitySuperFunction<Void> listener = new ActivitySuperFunction<Void>(
                    methodName) {
                @Override
                public Void call(final Object... args) {
                    callHook(iterator, methodName, methodCall, activitySuper, args);
                    return null;
                }
            };
            plugin.pushSuperCallListener(listener);
            methodCall.call(plugin, args);
            plugin.popSuperCallListener();
        } else {
            activitySuper.call(args);
        }
    }
}
