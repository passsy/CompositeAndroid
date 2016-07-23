package com.pascalwelsch.compositeandroid.fragment;

import com.pascalwelsch.compositeandroid.core.CallFun0;
import com.pascalwelsch.compositeandroid.core.CallFun1;
import com.pascalwelsch.compositeandroid.core.CallFun2;
import com.pascalwelsch.compositeandroid.core.CallVoid0;
import com.pascalwelsch.compositeandroid.core.CallVoid1;
import com.pascalwelsch.compositeandroid.core.CallVoid2;

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

import java.lang.reflect.Method;


@SuppressWarnings("unused")
public class DialogFragmentPlugin extends FragmentPlugin {

    public void dismiss() {
        verifyMethodCalledFromDelegate("dismiss()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void dismissAllowingStateLoss() {
        verifyMethodCalledFromDelegate("dismissAllowingStateLoss()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public Dialog getDialog() {
        verifyMethodCalledFromDelegate("getDialog()");
        return ((CallFun0<Dialog>) mSuperListeners.pop()).call();
    }

    public DialogFragment getDialogFragment() {
        return (DialogFragment) getOriginal();
    }

    public LayoutInflater getLayoutInflater(final Bundle savedInstanceState) {
        verifyMethodCalledFromDelegate("getLayoutInflater(Bundle)");
        return ((CallFun1<LayoutInflater, Bundle>) mSuperListeners.pop()).call(savedInstanceState);
    }

    public boolean getShowsDialog() {
        verifyMethodCalledFromDelegate("getShowsDialog()");
        return ((CallFun0<Boolean>) mSuperListeners.pop()).call();
    }

    public int getTheme() {
        verifyMethodCalledFromDelegate("getTheme()");
        return ((CallFun0<Integer>) mSuperListeners.pop()).call();
    }

    public boolean isCancelable() {
        verifyMethodCalledFromDelegate("isCancelable()");
        return ((CallFun0<Boolean>) mSuperListeners.pop()).call();
    }

    public void onActivityCreated(final Bundle savedInstanceState) {
        verifyMethodCalledFromDelegate("onActivityCreated(Bundle)");
        ((CallVoid1<Bundle>) mSuperListeners.pop()).call(savedInstanceState);
    }

    public void onAttach(final Activity activity) {
        verifyMethodCalledFromDelegate("onAttach(Activity)");
        ((CallVoid1<Activity>) mSuperListeners.pop()).call(activity);
    }

    public void onCancel(final DialogInterface dialog) {
        verifyMethodCalledFromDelegate("onCancel(DialogInterface)");
        ((CallVoid1<DialogInterface>) mSuperListeners.pop()).call(dialog);
    }

    public void onCreate(@Nullable final Bundle savedInstanceState) {
        verifyMethodCalledFromDelegate("onCreate(Bundle)");
        ((CallVoid1<Bundle>) mSuperListeners.pop()).call(savedInstanceState);
    }

    public Dialog onCreateDialog(final Bundle savedInstanceState) {
        verifyMethodCalledFromDelegate("onCreateDialog(Bundle)");
        return ((CallFun1<Dialog, Bundle>) mSuperListeners.pop()).call(savedInstanceState);
    }

    public void onDestroyView() {
        verifyMethodCalledFromDelegate("onDestroyView()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void onDetach() {
        verifyMethodCalledFromDelegate("onDetach()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void onDismiss(final DialogInterface dialog) {
        verifyMethodCalledFromDelegate("onDismiss(DialogInterface)");
        ((CallVoid1<DialogInterface>) mSuperListeners.pop()).call(dialog);
    }

    public void onSaveInstanceState(final Bundle outState) {
        verifyMethodCalledFromDelegate("onSaveInstanceState(Bundle)");
        ((CallVoid1<Bundle>) mSuperListeners.pop()).call(outState);
    }

    public void onStart() {
        verifyMethodCalledFromDelegate("onStart()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void onStop() {
        verifyMethodCalledFromDelegate("onStop()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void setCancelable(final boolean cancelable) {
        verifyMethodCalledFromDelegate("setCancelable(Boolean)");
        ((CallVoid1<Boolean>) mSuperListeners.pop()).call(cancelable);
    }

    public void setShowsDialog(final boolean showsDialog) {
        verifyMethodCalledFromDelegate("setShowsDialog(Boolean)");
        ((CallVoid1<Boolean>) mSuperListeners.pop()).call(showsDialog);
    }

    public void setStyle(final int style, @StyleRes final int theme) {
        verifyMethodCalledFromDelegate("setStyle(Integer, Integer)");
        ((CallVoid2<Integer, Integer>) mSuperListeners.pop()).call(style, theme);
    }

    public void setupDialog(final Dialog dialog, final int style) {
        verifyMethodCalledFromDelegate("setupDialog(Dialog, Integer)");
        ((CallVoid2<Dialog, Integer>) mSuperListeners.pop()).call(dialog, style);
    }

    public void show(final FragmentManager manager, final String tag) {
        verifyMethodCalledFromDelegate("show(FragmentManager, String)");
        ((CallVoid2<FragmentManager, String>) mSuperListeners.pop()).call(manager, tag);
    }

    public int show(final FragmentTransaction transaction, final String tag) {
        verifyMethodCalledFromDelegate("show(FragmentTransaction, String)");
        return ((CallFun2<Integer, FragmentTransaction, String>) mSuperListeners.pop())
                .call(transaction, tag);
    }

    void dismiss(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            dismiss();
        }
    }

    void dismissAllowingStateLoss(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            dismissAllowingStateLoss();
        }
    }

    Dialog getDialog(final CallFun0<Dialog> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getDialog();
        }
    }

    LayoutInflater getLayoutInflater(final CallFun1<LayoutInflater, Bundle> superCall,
            final Bundle savedInstanceState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getLayoutInflater(savedInstanceState);
        }
    }

    boolean getShowsDialog(final CallFun0<Boolean> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getShowsDialog();
        }
    }

    int getTheme(final CallFun0<Integer> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getTheme();
        }
    }

    boolean isCancelable(final CallFun0<Boolean> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return isCancelable();
        }
    }

    boolean isMethodOverridden(final String methodName, final Class<?>... parameterTypes) {
        try {
            final Class<? extends DialogFragmentPlugin> myClass = this.getClass();
            final Method method = myClass.getMethod(methodName, parameterTypes);
            if (method.getDeclaringClass() == DialogFragmentPlugin.class) {
                return false;
            }
        } catch (NoSuchMethodException ignore) {
        }
        return true;
    }

    void onActivityCreated(final CallVoid1<Bundle> superCall, final Bundle savedInstanceState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onActivityCreated(savedInstanceState);
        }
    }

    void onAttach(final CallVoid1<Activity> superCall, final Activity activity) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onAttach(activity);
        }
    }

    void onCancel(final CallVoid1<DialogInterface> superCall, final DialogInterface dialog) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onCancel(dialog);
        }
    }

    void onCreate(final CallVoid1<Bundle> superCall, @Nullable final Bundle savedInstanceState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onCreate(savedInstanceState);
        }
    }

    Dialog onCreateDialog(final CallFun1<Dialog, Bundle> superCall,
            final Bundle savedInstanceState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onCreateDialog(savedInstanceState);
        }
    }

    void onDestroyView(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onDestroyView();
        }
    }

    void onDetach(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onDetach();
        }
    }

    void onDismiss(final CallVoid1<DialogInterface> superCall, final DialogInterface dialog) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onDismiss(dialog);
        }
    }

    void onSaveInstanceState(final CallVoid1<Bundle> superCall, final Bundle outState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onSaveInstanceState(outState);
        }
    }

    void onStart(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onStart();
        }
    }

    void onStop(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onStop();
        }
    }

    void setCancelable(final CallVoid1<Boolean> superCall, final boolean cancelable) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setCancelable(cancelable);
        }
    }

    void setShowsDialog(final CallVoid1<Boolean> superCall, final boolean showsDialog) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setShowsDialog(showsDialog);
        }
    }

    void setStyle(final CallVoid2<Integer, Integer> superCall, final int style,
            @StyleRes final int theme) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setStyle(style, theme);
        }
    }

    void setupDialog(final CallVoid2<Dialog, Integer> superCall, final Dialog dialog,
            final int style) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setupDialog(dialog, style);
        }
    }

    void show(final CallVoid2<FragmentManager, String> superCall, final FragmentManager manager,
            final String tag) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            show(manager, tag);
        }
    }

    int show(final CallFun2<Integer, FragmentTransaction, String> superCall,
            final FragmentTransaction transaction, final String tag) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return show(transaction, tag);
        }
    }


}