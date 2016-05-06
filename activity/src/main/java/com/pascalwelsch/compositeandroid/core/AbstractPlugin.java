package com.pascalwelsch.compositeandroid.core;

import java.util.Stack;

public class AbstractPlugin<T, D> {

    final public Stack<NamedSuperCall<?>> mSuperListeners = new Stack<>();

    private D mDelegate;

    private T mOriginal;

    public D getCompositeDelegate() {
        return mDelegate;
    }

    public T getOriginal() {
        return mOriginal;
    }

    public void setDelegate(final D delegate) {
        mDelegate = delegate;
    }

    public void setOriginal(final T original) {
        mOriginal = original;
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
                    + method + " from " + superListener + " instead of calling getActivity()."
                    + method + ". Do not call " + method
                    + " on a ActivityPlugin directly. You have to call mDelegate." + method
                    + " or the call order of the plugins would be mixed up.");
        }
    }
}
