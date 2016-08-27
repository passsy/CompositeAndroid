package com.pascalwelsch.compositeandroid.core;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @param <T> what should be delegated
 * @param <P> plugin where delegated to
 */
public class AbstractDelegate<T, P extends AbstractPlugin> {

    protected final T mOriginal;

    protected final List<P> mPlugins = new CopyOnWriteArrayList<>();

    public AbstractDelegate(final T original) {
        mOriginal = original;
    }

    @SuppressWarnings("unchecked")
    public Removable addPlugin(final P plugin) {
        synchronized (mPlugins) {
            plugin.addToDelegate(this, mOriginal);
            mPlugins.add(plugin);
        }

        return new Removable() {
            @Override
            public void remove() {
                synchronized (mPlugins) {
                    mPlugins.remove(plugin);
                    plugin.removeFromDelegate();
                }
            }
        };
    }

    public T getOriginal() {
        return mOriginal;
    }

}
