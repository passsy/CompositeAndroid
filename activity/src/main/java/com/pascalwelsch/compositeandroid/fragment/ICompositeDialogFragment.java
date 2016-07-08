package com.pascalwelsch.compositeandroid.fragment;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;


public interface ICompositeDialogFragment extends ICompositeFragment {


    void dismiss();

    void dismissAllowingStateLoss();

    void dismissAllowingStateLoss__super();

    void dismiss__super();

    Dialog getDialog();

    Dialog getDialog__super();

    LayoutInflater getLayoutInflater(final Bundle savedInstanceState);

    LayoutInflater getLayoutInflater__super(final Bundle savedInstanceState);

    boolean getShowsDialog();

    boolean getShowsDialog__super();

    int getTheme();

    int getTheme__super();

    boolean isCancelable();

    boolean isCancelable__super();

    void onActivityCreated(final Bundle savedInstanceState);

    void onActivityCreated__super(final Bundle savedInstanceState);

    void onAttach(final Activity activity);

    void onAttach__super(final Activity activity);

    void onCancel(final DialogInterface dialog);

    void onCancel__super(final DialogInterface dialog);

    void onCreate(@Nullable final Bundle savedInstanceState);

    Dialog onCreateDialog(final Bundle savedInstanceState);

    Dialog onCreateDialog__super(final Bundle savedInstanceState);

    void onCreate__super(@Nullable final Bundle savedInstanceState);

    void onDestroyView();

    void onDestroyView__super();

    void onDetach();

    void onDetach__super();

    void onDismiss(final DialogInterface dialog);

    void onDismiss__super(final DialogInterface dialog);

    void onSaveInstanceState(final Bundle outState);

    void onSaveInstanceState__super(final Bundle outState);

    void onStart();

    void onStart__super();

    void onStop();

    void onStop__super();

    void setCancelable(final boolean cancelable);

    void setCancelable__super(final boolean cancelable);

    void setShowsDialog(final boolean showsDialog);

    void setShowsDialog__super(final boolean showsDialog);

    void setStyle(final int style, @StyleRes final int theme);

    void setStyle__super(final int style, @StyleRes final int theme);

    void setupDialog(final Dialog dialog, final int style);

    void setupDialog__super(final Dialog dialog, final int style);

    void show(final FragmentManager manager, final String tag);

    int show(final FragmentTransaction transaction, final String tag);

    void show__super(final FragmentManager manager, final String tag);

    int show__super(final FragmentTransaction transaction, final String tag);
}
