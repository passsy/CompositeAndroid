package com.pascalwelsch.compositeandroid.blueprints;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;

// 27.0.0
@SuppressWarnings("ALL")
public class BlueprintDialogFragment extends DialogFragment {

    @Override
    public void dismiss() {
        super.dismiss();
    }

    @Override
    public void dismissAllowingStateLoss() {
        super.dismissAllowingStateLoss();
    }

    @Override
    public Dialog getDialog() {
        return super.getDialog();
    }

    @Override
    public boolean getShowsDialog() {
        return super.getShowsDialog();
    }

    @Override
    public int getTheme() {
        return super.getTheme();
    }

    @Override
    public boolean isCancelable() {
        return super.isCancelable();
    }

    @Override
    public void onActivityCreated(final Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onAttach(final Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCancel(final DialogInterface dialog) {
        super.onCancel(dialog);
    }

    @Override
    public void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(final Bundle savedInstanceState) {
        return super.onCreateDialog(savedInstanceState);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onDismiss(final DialogInterface dialog) {
        super.onDismiss(dialog);
    }

    @Override
    public LayoutInflater onGetLayoutInflater(final Bundle savedInstanceState) {
        return super.onGetLayoutInflater(savedInstanceState);
    }

    @Override
    public void onSaveInstanceState(final Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void setCancelable(final boolean cancelable) {
        super.setCancelable(cancelable);
    }

    @Override
    public void setShowsDialog(final boolean showsDialog) {
        super.setShowsDialog(showsDialog);
    }

    @Override
    public void setStyle(final int style, @StyleRes final int theme) {
        super.setStyle(style, theme);
    }

    @Override
    public void setupDialog(final Dialog dialog, final int style) {
        super.setupDialog(dialog, style);
    }

    @Override
    public void show(final FragmentManager manager, final String tag) {
        super.show(manager, tag);
    }

    @Override
    public int show(final FragmentTransaction transaction, final String tag) {
        return super.show(transaction, tag);
    }
}
