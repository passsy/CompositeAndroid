package com.pascalwelsch.compositeandroid.fragment;

import com.pascalwelsch.compositeandroid.core.NamedSuperCall;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;


@SuppressWarnings("unused")
public class DialogFragmentPlugin extends FragmentPlugin {

    public void dismiss() {
        verifyMethodCalledFromDelegate("dismiss()");
        mSuperListeners.pop().call();
    }

    public void dismissAllowingStateLoss() {
        verifyMethodCalledFromDelegate("dismissAllowingStateLoss()");
        mSuperListeners.pop().call();
    }

    public Dialog getDialog() {
        verifyMethodCalledFromDelegate("getDialog()");
        return (Dialog) mSuperListeners.pop().call();
    }

    public DialogFragment getDialogFragment() {
        return (DialogFragment) getOriginal();
    }

    public LayoutInflater getLayoutInflater(final Bundle savedInstanceState) {
        verifyMethodCalledFromDelegate("getLayoutInflater(Bundle)");
        return (LayoutInflater) mSuperListeners.pop().call(savedInstanceState);
    }

    public boolean getShowsDialog() {
        verifyMethodCalledFromDelegate("getShowsDialog()");
        return (Boolean) mSuperListeners.pop().call();
    }

    public int getTheme() {
        verifyMethodCalledFromDelegate("getTheme()");
        return (Integer) mSuperListeners.pop().call();
    }

    public boolean isCancelable() {
        verifyMethodCalledFromDelegate("isCancelable()");
        return (Boolean) mSuperListeners.pop().call();
    }

    public void onActivityCreated(final Bundle savedInstanceState) {
        verifyMethodCalledFromDelegate("onActivityCreated(Bundle)");
        mSuperListeners.pop().call(savedInstanceState);
    }

    public void onAttach(final Activity activity) {
        verifyMethodCalledFromDelegate("onAttach(Activity)");
        mSuperListeners.pop().call(activity);
    }

    public void onCancel(final DialogInterface dialog) {
        verifyMethodCalledFromDelegate("onCancel(DialogInterface)");
        mSuperListeners.pop().call(dialog);
    }

    public void onCreate(@Nullable final Bundle savedInstanceState) {
        verifyMethodCalledFromDelegate("onCreate(Bundle)");
        mSuperListeners.pop().call(savedInstanceState);
    }

    public Dialog onCreateDialog(final Bundle savedInstanceState) {
        verifyMethodCalledFromDelegate("onCreateDialog(Bundle)");
        return (Dialog) mSuperListeners.pop().call(savedInstanceState);
    }

    public void onDestroyView() {
        verifyMethodCalledFromDelegate("onDestroyView()");
        mSuperListeners.pop().call();
    }

    public void onDetach() {
        verifyMethodCalledFromDelegate("onDetach()");
        mSuperListeners.pop().call();
    }

    public void onDismiss(final DialogInterface dialog) {
        verifyMethodCalledFromDelegate("onDismiss(DialogInterface)");
        mSuperListeners.pop().call(dialog);
    }

    public void onSaveInstanceState(final Bundle outState) {
        verifyMethodCalledFromDelegate("onSaveInstanceState(Bundle)");
        mSuperListeners.pop().call(outState);
    }

    public void onStart() {
        verifyMethodCalledFromDelegate("onStart()");
        mSuperListeners.pop().call();
    }

    public void onStop() {
        verifyMethodCalledFromDelegate("onStop()");
        mSuperListeners.pop().call();
    }

    public void setCancelable(final boolean cancelable) {
        verifyMethodCalledFromDelegate("setCancelable(boolean)");
        mSuperListeners.pop().call(cancelable);
    }

    public void setShowsDialog(final boolean showsDialog) {
        verifyMethodCalledFromDelegate("setShowsDialog(boolean)");
        mSuperListeners.pop().call(showsDialog);
    }

    public void setStyle(final int style, @StyleRes final int theme) {
        verifyMethodCalledFromDelegate("setStyle(int, int)");
        mSuperListeners.pop().call(style, theme);
    }

    public void setupDialog(final Dialog dialog, final int style) {
        verifyMethodCalledFromDelegate("setupDialog(Dialog, int)");
        mSuperListeners.pop().call(dialog, style);
    }

    public void show(final FragmentManager manager, final String tag) {
        verifyMethodCalledFromDelegate("show(FragmentManager, String)");
        mSuperListeners.pop().call(manager, tag);
    }

    public int show(final FragmentTransaction transaction, final String tag) {
        verifyMethodCalledFromDelegate("show(FragmentTransaction, String)");
        return (Integer) mSuperListeners.pop().call(transaction, tag);
    }

    void dismiss(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            dismiss();
        }
    }

    void dismissAllowingStateLoss(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            dismissAllowingStateLoss();
        }
    }

    Dialog getDialog(final NamedSuperCall<Dialog> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getDialog();
        }
    }

    LayoutInflater getLayoutInflater(final NamedSuperCall<LayoutInflater> superCall,
            final Bundle savedInstanceState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getLayoutInflater(savedInstanceState);
        }
    }

    boolean getShowsDialog(final NamedSuperCall<Boolean> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getShowsDialog();
        }
    }

    int getTheme(final NamedSuperCall<Integer> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getTheme();
        }
    }

    boolean isCancelable(final NamedSuperCall<Boolean> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return isCancelable();
        }
    }

    void onActivityCreated(final NamedSuperCall<Void> superCall, final Bundle savedInstanceState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onActivityCreated(savedInstanceState);
        }
    }

    void onAttach(final NamedSuperCall<Void> superCall, final Activity activity) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onAttach(activity);
        }
    }

    void onCancel(final NamedSuperCall<Void> superCall, final DialogInterface dialog) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onCancel(dialog);
        }
    }

    void onCreate(final NamedSuperCall<Void> superCall, @Nullable final Bundle savedInstanceState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onCreate(savedInstanceState);
        }
    }

    Dialog onCreateDialog(final NamedSuperCall<Dialog> superCall, final Bundle savedInstanceState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onCreateDialog(savedInstanceState);
        }
    }

    void onDestroyView(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onDestroyView();
        }
    }

    void onDetach(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onDetach();
        }
    }

    void onDismiss(final NamedSuperCall<Void> superCall, final DialogInterface dialog) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onDismiss(dialog);
        }
    }

    void onSaveInstanceState(final NamedSuperCall<Void> superCall, final Bundle outState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onSaveInstanceState(outState);
        }
    }

    void onStart(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onStart();
        }
    }

    void onStop(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onStop();
        }
    }

    void setCancelable(final NamedSuperCall<Void> superCall, final boolean cancelable) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setCancelable(cancelable);
        }
    }

    void setShowsDialog(final NamedSuperCall<Void> superCall, final boolean showsDialog) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setShowsDialog(showsDialog);
        }
    }

    void setStyle(final NamedSuperCall<Void> superCall, final int style,
            @StyleRes final int theme) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setStyle(style, theme);
        }
    }

    void setupDialog(final NamedSuperCall<Void> superCall, final Dialog dialog, final int style) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setupDialog(dialog, style);
        }
    }

    void show(final NamedSuperCall<Void> superCall, final FragmentManager manager,
            final String tag) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            show(manager, tag);
        }
    }

    int show(final NamedSuperCall<Integer> superCall, final FragmentTransaction transaction,
            final String tag) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return show(transaction, tag);
        }
    }


}