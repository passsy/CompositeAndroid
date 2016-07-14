package com.pascalwelsch.compositeandroid.core;

import java.util.Stack;

public class AbstractPlugin<T, D> {

    final public Stack<NamedSuperCall<?>> mSuperListeners = new Stack<>();

    private D mDelegate;

    private T mOriginal;

    public final void addToDelegate(final D delegate, final T original) {
        mDelegate = delegate;
        mOriginal = original;
        onAddedToDelegate();
    }

    public D getCompositeDelegate() {
        return mDelegate;
    }

    public T getOriginal() {
        return mOriginal;
    }

    public final void removeFromDelegate() {
        mDelegate = null;
        mOriginal = null;
        onRemovedFromDelegated();
    }

    public void verifyMethodCalledFromDelegate(final String method) {
        if (mSuperListeners.isEmpty()) {
            throw new IllegalStateException("Do not call " + method
                    + " on a ActivityPlugin directly. You have to call mDelegate." + method
                    + " or the call order of the plugins would be mixed up.");
        }
        final String superListener = mSuperListeners.peek().getMethodName();
        if (!superListener.equals(method)) {
            throw new IllegalStateException("You may have called "
                    + method + " from " + superListener + " instead of calling getOriginal()."
                    + method + ". Do not call " + method
                    + " on a ActivityPlugin directly. You have to call mDelegate." + method
                    + " or the call order of the plugins would be mixed up.");
        }
    }

    /**
     * callback when this plugin was added to a delegate. {@link #getOriginal()} and {@link
     * #getCompositeDelegate()} are now set
     */
    protected void onAddedToDelegate() {

    }

    /**
     * callback when this plugin was removed from the delegate. {@link #getOriginal()} and {@link
     * #getCompositeDelegate()} are now {@code null}
     */
    protected void onRemovedFromDelegated() {

    }
}
