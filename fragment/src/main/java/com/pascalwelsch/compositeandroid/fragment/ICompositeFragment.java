package com.pascalwelsch.compositeandroid.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.Fragment.SavedState;
import android.support.v4.app.LoaderManager;
import android.support.v4.app.SharedElementCallback;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

import java.io.FileDescriptor;
import java.io.PrintWriter;

public interface ICompositeFragment {


    void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args);

    boolean getAllowEnterTransitionOverlap();

    boolean getAllowReturnTransitionOverlap();

    Context getContext();

    Object getEnterTransition();

    Object getExitTransition();

    LayoutInflater getLayoutInflater(Bundle savedInstanceState);

    LoaderManager getLoaderManager();

    Object getReenterTransition();

    Object getReturnTransition();

    Object getSharedElementEnterTransition();

    Object getSharedElementReturnTransition();

    boolean getUserVisibleHint();

    View getView();

    void onActivityCreated(@Nullable Bundle savedInstanceState);

    void onActivityResult(int requestCode, int resultCode, Intent data);

    void onAttach(Context context);

    void onAttach(Activity activity);

    void onAttachFragment(Fragment childFragment);

    void onConfigurationChanged(Configuration newConfig);

    boolean onContextItemSelected(MenuItem item);

    void onCreate(@Nullable Bundle savedInstanceState);

    Animation onCreateAnimation(int transit, boolean enter, int nextAnim);

    void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo);

    void onCreateOptionsMenu(Menu menu, MenuInflater inflater);

    View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState);

    void onDestroy();

    void onDestroyOptionsMenu();

    void onDestroyView();

    void onDetach();

    void onHiddenChanged(boolean hidden);

    void onInflate(Context context, AttributeSet attrs, Bundle savedInstanceState);

    void onInflate(Activity activity, AttributeSet attrs, Bundle savedInstanceState);

    void onLowMemory();

    void onMultiWindowModeChanged(boolean isInMultiWindowMode);

    boolean onOptionsItemSelected(MenuItem item);

    void onOptionsMenuClosed(Menu menu);

    void onPause();

    void onPictureInPictureModeChanged(boolean isInPictureInPictureMode);

    void onPrepareOptionsMenu(Menu menu);

    void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
            @NonNull int[] grantResults);

    void onResume();

    void onSaveInstanceState(Bundle outState);

    void onStart();

    void onStop();

    void onViewCreated(View view, @Nullable Bundle savedInstanceState);

    void onViewStateRestored(@Nullable Bundle savedInstanceState);

    void registerForContextMenu(View view);

    void setAllowEnterTransitionOverlap(boolean allow);

    void setAllowReturnTransitionOverlap(boolean allow);

    void setArguments(Bundle args);

    void setEnterSharedElementCallback(SharedElementCallback callback);

    void setEnterTransition(Object transition);

    void setExitSharedElementCallback(SharedElementCallback callback);

    void setExitTransition(Object transition);

    void setHasOptionsMenu(boolean hasMenu);

    void setInitialSavedState(SavedState state);

    void setMenuVisibility(boolean menuVisible);

    void setReenterTransition(Object transition);

    void setRetainInstance(boolean retain);

    void setReturnTransition(Object transition);

    void setSharedElementEnterTransition(Object transition);

    void setSharedElementReturnTransition(Object transition);

    void setTargetFragment(Fragment fragment, int requestCode);

    void setUserVisibleHint(boolean isVisibleToUser);

    boolean shouldShowRequestPermissionRationale(@NonNull String permission);

    void startActivity(Intent intent);

    void startActivity(Intent intent, @Nullable Bundle options);

    void startActivityForResult(Intent intent, int requestCode);

    void startActivityForResult(Intent intent, int requestCode, @Nullable Bundle options);

    void startIntentSenderForResult(IntentSender intent, int requestCode,
            @Nullable Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags,
            Bundle options) throws IntentSender.SendIntentException;

    void super_dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args);

    boolean super_getAllowEnterTransitionOverlap();

    boolean super_getAllowReturnTransitionOverlap();

    Context super_getContext();

    Object super_getEnterTransition();

    Object super_getExitTransition();

    LayoutInflater super_getLayoutInflater(Bundle savedInstanceState);

    LoaderManager super_getLoaderManager();

    Object super_getReenterTransition();

    Object super_getReturnTransition();

    Object super_getSharedElementEnterTransition();

    Object super_getSharedElementReturnTransition();

    boolean super_getUserVisibleHint();

    View super_getView();

    void super_onActivityCreated(@Nullable Bundle savedInstanceState);

    void super_onActivityResult(int requestCode, int resultCode, Intent data);

    void super_onAttach(Context context);

    void super_onAttach(Activity activity);

    void super_onAttachFragment(Fragment childFragment);

    void super_onConfigurationChanged(Configuration newConfig);

    boolean super_onContextItemSelected(MenuItem item);

    void super_onCreate(@Nullable Bundle savedInstanceState);

    Animation super_onCreateAnimation(int transit, boolean enter, int nextAnim);

    void super_onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo);

    void super_onCreateOptionsMenu(Menu menu, MenuInflater inflater);

    View super_onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState);

    void super_onDestroy();

    void super_onDestroyOptionsMenu();

    void super_onDestroyView();

    void super_onDetach();

    void super_onHiddenChanged(boolean hidden);

    void super_onInflate(Context context, AttributeSet attrs, Bundle savedInstanceState);

    void super_onInflate(Activity activity, AttributeSet attrs, Bundle savedInstanceState);

    void super_onLowMemory();

    void super_onMultiWindowModeChanged(boolean isInMultiWindowMode);

    boolean super_onOptionsItemSelected(MenuItem item);

    void super_onOptionsMenuClosed(Menu menu);

    void super_onPause();

    void super_onPictureInPictureModeChanged(boolean isInPictureInPictureMode);

    void super_onPrepareOptionsMenu(Menu menu);

    void super_onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
            @NonNull int[] grantResults);

    void super_onResume();

    void super_onSaveInstanceState(Bundle outState);

    void super_onStart();

    void super_onStop();

    void super_onViewCreated(View view, @Nullable Bundle savedInstanceState);

    void super_onViewStateRestored(@Nullable Bundle savedInstanceState);

    void super_registerForContextMenu(View view);

    void super_setAllowEnterTransitionOverlap(boolean allow);

    void super_setAllowReturnTransitionOverlap(boolean allow);

    void super_setArguments(Bundle args);

    void super_setEnterSharedElementCallback(SharedElementCallback callback);

    void super_setEnterTransition(Object transition);

    void super_setExitSharedElementCallback(SharedElementCallback callback);

    void super_setExitTransition(Object transition);

    void super_setHasOptionsMenu(boolean hasMenu);

    void super_setInitialSavedState(SavedState state);

    void super_setMenuVisibility(boolean menuVisible);

    void super_setReenterTransition(Object transition);

    void super_setRetainInstance(boolean retain);

    void super_setReturnTransition(Object transition);

    void super_setSharedElementEnterTransition(Object transition);

    void super_setSharedElementReturnTransition(Object transition);

    void super_setTargetFragment(Fragment fragment, int requestCode);

    void super_setUserVisibleHint(boolean isVisibleToUser);

    boolean super_shouldShowRequestPermissionRationale(@NonNull String permission);

    void super_startActivity(Intent intent);

    void super_startActivity(Intent intent, @Nullable Bundle options);

    void super_startActivityForResult(Intent intent, int requestCode);

    void super_startActivityForResult(Intent intent, int requestCode, @Nullable Bundle options);

    void super_startIntentSenderForResult(IntentSender intent, int requestCode,
            @Nullable Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags,
            Bundle options) throws IntentSender.SendIntentException;

    String super_toString();

    void super_unregisterForContextMenu(View view);

    String toString();

    void unregisterForContextMenu(View view);
}
