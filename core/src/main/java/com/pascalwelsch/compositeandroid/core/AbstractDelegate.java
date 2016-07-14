package com.pascalwelsch.compositeandroid.core;

import android.support.annotation.NonNull;

import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @param <T> what should be delegated
 * @param <P> plugin where delegated to
 */
public class AbstractDelegate<T, P extends AbstractPlugin> {

    public static abstract class ObjectPool<O> {

        private int mMaxSize;

        private Stack<O> pool = new Stack<>();

        public ObjectPool(final int maxSize) {
            mMaxSize = maxSize;
        }

        public void clear() {
            pool.clear();
        }

        public O get() {
            if (pool.isEmpty()) {
                return newItem();
            } else {
                return pool.pop();
            }
        }

        public void returnItem(final O iterator) {
            if (pool.size() < mMaxSize) {
                pool.push(iterator);
            }
        }

        protected abstract O newItem();
    }


    protected final T mOriginal;

    protected List<P> mPlugins = new CopyOnWriteArrayList<>();

/*    protected IteratorPool<ListIterator<P>> mIteratorPool = new IteratorPool<ListIterator<P>>(10) {

        @Override
        protected ListIterator<P> newItem() {
            return mPlugins.listIterator(mPlugins.size());
        }
    };*/
/*    private IteratorPool<CachedNamedSuperCall> mSuperPool = new IteratorPool<CachedNamedSuperCall>(10){

        @Override
        protected CachedNamedSuperCall newItem() {
            return new CachedNamedSuperCall();
        }

        @Override
        public void returnItem(final CachedNamedSuperCall iterator) {
            super.returnItem(iterator);
            iterator.unbind();
        }
    };*/

/*    private class CachedNamedSuperCall<R> extends NamedSuperCall<R> {

        private SuperCall<R> mActivitySuper;

        private PluginCall<P, R> mMethodCall;

        public CachedNamedSuperCall() {
            super(null);
        }

        public void bind(final String methodName,
                final PluginCall<P, R> methodCall, final SuperCall<R> activitySuper){
            setMethodName(methodName);
            mMethodCall = methodCall;
            mActivitySuper = activitySuper;
        }

        public void unbind(){
            setMethodName(null);
            mMethodCall = null;
            mActivitySuper = null;
        }

        @Override
        public R call(final Object... args) {
            return callFunction(getMethodName(), mMethodCall, mActivitySuper, args);
        }
    }*/

    public AbstractDelegate(final T original) {
        mOriginal = original;
    }

    @SuppressWarnings("unchecked")
    public Removable addPlugin(final P plugin) {
        plugin.addToDelegate(this, mOriginal);
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
        if (mPlugins.isEmpty()) {
            return activitySuper.call(args);
        }

        final ListIterator<P> iterator = mPlugins.listIterator(mPlugins.size());
        final R r = callFunction(iterator, methodName, methodCall, activitySuper, args);
        return r;
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
        if (mPlugins.isEmpty()) {
            activitySuper.call(args);
            return;
        }

        final ListIterator<P> iterator = mPlugins.listIterator(mPlugins.size());
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
