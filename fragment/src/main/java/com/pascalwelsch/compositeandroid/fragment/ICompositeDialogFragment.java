package com.pascalwelsch.compositeandroid.fragment;

import android.app.Dialog;
import android.content.Context;
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

    Dialog getDialog();

    LayoutInflater getLayoutInflater(Bundle savedInstanceState);

    boolean getShowsDialog();

    int getTheme();

    boolean isCancelable();

    void onActivityCreated(Bundle savedInstanceState);

    void onAttach(Context context);

    void onCancel(DialogInterface dialog);

    void onCreate(@Nullable Bundle savedInstanceState);

    Dialog onCreateDialog(Bundle savedInstanceState);

    void onDestroyView();

    void onDetach();

    void onDismiss(DialogInterface dialog);

    void onSaveInstanceState(Bundle outState);

    void onStart();

    void onStop();

    void setCancelable(boolean cancelable);

    void setShowsDialog(boolean showsDialog);

    void setStyle(int style, @StyleRes int theme);

    void setupDialog(Dialog dialog, int style);

    void show(FragmentManager manager, String tag);

    int show(FragmentTransaction transaction, String tag);

    void super_dismiss();

    void super_dismissAllowingStateLoss();

    Dialog super_getDialog();

    LayoutInflater super_getLayoutInflater(Bundle savedInstanceState);

    boolean super_getShowsDialog();

    int super_getTheme();

    boolean super_isCancelable();

    void super_onActivityCreated(Bundle savedInstanceState);

    void super_onAttach(Context context);

    void super_onCancel(DialogInterface dialog);

    void super_onCreate(@Nullable Bundle savedInstanceState);

    Dialog super_onCreateDialog(Bundle savedInstanceState);

    void super_onDestroyView();

    void super_onDetach();

    void super_onDismiss(DialogInterface dialog);

    void super_onSaveInstanceState(Bundle outState);

    void super_onStart();

    void super_onStop();

    void super_setCancelable(boolean cancelable);

    void super_setShowsDialog(boolean showsDialog);

    void super_setStyle(int style, @StyleRes int theme);

    void super_setupDialog(Dialog dialog, int style);

    void super_show(FragmentManager manager, String tag);

    int super_show(FragmentTransaction transaction, String tag);
}
