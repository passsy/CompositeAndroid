package com.pascalwelsch.compositeandroid.activity;

public class SuppressedException extends RuntimeException {

    /**
     * Constructs a new {@code RuntimeException} with the current stack trace
     * and the specified cause.
     *
     * @param throwable the cause of this exception.
     */
    public SuppressedException(final Throwable throwable) {
        super(throwable);
    }
}
