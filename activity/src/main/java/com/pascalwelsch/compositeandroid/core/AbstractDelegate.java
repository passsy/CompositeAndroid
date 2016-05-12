package com.pascalwelsch.compositeandroid.core;

import android.support.annotation.NonNull;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @param <T> what should be delegated
 * @param <P> plugin where delegated to
 */
public class AbstractDelegate<T, P extends AbstractPlugin> {

    protected final T mOriginal;

    protected List<P> mPlugins = new CopyOnWriteArrayList<>();

    public AbstractDelegate(final T original) {
        mOriginal = original;
    }

    @SuppressWarnings("unchecked")
    public Removable addPlugin(final P plugin) {
        plugin.addToDelegate(this, plugin);
        mPlugins.add(plugin);
        return new Removable() {
            @Override
            public void remove() {
                mPlugins.remove(plugin);
                plugin.removeFromDelegate();
            }
        };
    }

    public T getOriginal() {
        return mOriginal;
    }

    @NonNull
    protected <R> R callFunction(final String methodName,
            final PluginCall<P, R> methodCall, final SuperCall<R> activitySuper,
            final Object... args) {

        final LinkedList<P> plugins = new LinkedList<>(mPlugins);

        final ListIterator<P> iterator = plugins.listIterator(plugins.size());
        return callFunction(iterator, methodName, methodCall, activitySuper, args);
    }

    @NonNull
    protected <R> R callFunction(final ListIterator<P> iterator,
            final String methodName,
            final PluginCall<P, R> methodCall, final SuperCall<R> activitySuper,
            final Object... args) {

        if (iterator.hasPrevious()) {
            P plugin = iterator.previous();
            final NamedSuperCall<R> listener = new NamedSuperCall<R>(methodName) {
                @Override
                public R call(final Object... args) {
                    return callFunction(iterator, methodName, methodCall, activitySuper, args);
                }
            };
            final R result = methodCall.call(listener, plugin, args);
            return result;

        } else {
            return activitySuper.call(args);
        }
    }

    protected void callHook(final String methodName,
            final PluginCallVoid methodCall, final SuperCallVoid activitySuper,
            final Object... args) {

        final LinkedList<P> plugins = new LinkedList<>(mPlugins);

        final ListIterator<P> iterator = plugins.listIterator(plugins.size());
        callHook(iterator, methodName, methodCall, activitySuper, args);
    }

    void callHook(final ListIterator<P> iterator, final String methodName,
            final PluginCallVoid methodCall, final SuperCallVoid activitySuper,
            final Object... args) {

        if (iterator.hasPrevious()) {
            final P plugin = iterator.previous();
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
