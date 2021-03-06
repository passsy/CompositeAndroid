package com.pascalwelsch.compositeandroid.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;


/**
 * This code was auto-generated by the <a href="https://github.com/passsy/CompositeAndroid">CompositeAndroid</a>
 * generator
 *
 * @author Pascal Welsch
 */
public interface ICompositeDialogFragment extends ICompositeFragment {


    void onAttach(Context context);

    void onCreate(@Nullable Bundle savedInstanceState);

    void onActivityCreated(@Nullable Bundle savedInstanceState);

    void onStart();

    void onStop();

    void onSaveInstanceState(@NonNull Bundle outState);

    void onDestroyView();

    void onDetach();

    void dismiss();

    void dismissAllowingStateLoss();

    Dialog getDialog();

    boolean getShowsDialog();

    void setShowsDialog(boolean showsDialog);

    int getTheme();

    boolean isCancelable();

    void setCancelable(boolean cancelable);

    void onCancel(DialogInterface dialog);

    Dialog onCreateDialog(@Nullable Bundle savedInstanceState);

    void onDismiss(DialogInterface dialog);

    LayoutInflater onGetLayoutInflater(@Nullable Bundle savedInstanceState);

    void setStyle(int style, int theme);

    void setupDialog(Dialog dialog, int style);

    void show(FragmentManager manager, String tag);

    int show(FragmentTransaction transaction, String tag);

    void showNow(FragmentManager manager, String tag);

    void super_dismiss();

    void super_dismissAllowingStateLoss();

    Dialog super_getDialog();

    boolean super_getShowsDialog();

    int super_getTheme();

    boolean super_isCancelable();

    void super_onActivityCreated(@Nullable Bundle savedInstanceState);

    void super_onAttach(Context context);

    void super_onCancel(DialogInterface dialog);

    void super_onCreate(@Nullable Bundle savedInstanceState);

    Dialog super_onCreateDialog(@Nullable Bundle savedInstanceState);

    void super_onDestroyView();

    void super_onDetach();

    void super_onDismiss(DialogInterface dialog);

    LayoutInflater super_onGetLayoutInflater(@Nullable Bundle savedInstanceState);

    void super_onSaveInstanceState(@NonNull Bundle outState);

    void super_onStart();

    void super_onStop();

    void super_setCancelable(boolean cancelable);

    void super_setShowsDialog(boolean showsDialog);

    void super_setStyle(int style, int theme);

    void super_setupDialog(Dialog dialog, int style);

    void super_show(FragmentManager manager, String tag);

    int super_show(FragmentTransaction transaction, String tag);

    void super_showNow(FragmentManager manager, String tag);
}
