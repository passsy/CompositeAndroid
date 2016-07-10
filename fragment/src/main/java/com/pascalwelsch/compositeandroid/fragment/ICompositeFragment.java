package com.pascalwelsch.compositeandroid.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
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


    void dump(final String prefix, final FileDescriptor fd, final PrintWriter writer,
            final String[] args);

    boolean getAllowEnterTransitionOverlap();

    boolean getAllowReturnTransitionOverlap();

    Context getContext();

    Object getEnterTransition();

    Object getExitTransition();

    LayoutInflater getLayoutInflater(final Bundle savedInstanceState);

    LoaderManager getLoaderManager();

    Object getReenterTransition();

    Object getReturnTransition();

    Object getSharedElementEnterTransition();

    Object getSharedElementReturnTransition();

    boolean getUserVisibleHint();

    View getView();

    void onActivityCreated(@Nullable final Bundle savedInstanceState);

    void onActivityResult(final int requestCode, final int resultCode, final Intent data);

    void onAttach(final Context context);

    void onAttach(final Activity activity);

    void onConfigurationChanged(final Configuration newConfig);

    boolean onContextItemSelected(final MenuItem item);

    void onCreate(@Nullable final Bundle savedInstanceState);

    Animation onCreateAnimation(final int transit, final boolean enter, final int nextAnim);

    void onCreateContextMenu(final ContextMenu menu, final View v,
            final ContextMenu.ContextMenuInfo menuInfo);

    void onCreateOptionsMenu(final Menu menu, final MenuInflater inflater);

    View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container,
            @Nullable final Bundle savedInstanceState);

    void onDestroy();

    void onDestroyOptionsMenu();

    void onDestroyView();

    void onDetach();

    void onHiddenChanged(final boolean hidden);

    void onInflate(final Context context, final AttributeSet attrs,
            final Bundle savedInstanceState);

    void onInflate(final Activity activity, final AttributeSet attrs,
            final Bundle savedInstanceState);

    void onLowMemory();

    boolean onOptionsItemSelected(final MenuItem item);

    void onOptionsMenuClosed(final Menu menu);

    void onPause();

    void onPrepareOptionsMenu(final Menu menu);

    void onRequestPermissionsResult(final int requestCode, @NonNull final String[] permissions,
            @NonNull final int[] grantResults);

    void onResume();

    void onSaveInstanceState(final Bundle outState);

    void onStart();

    void onStop();

    void onViewCreated(final View view, @Nullable final Bundle savedInstanceState);

    void onViewStateRestored(@Nullable final Bundle savedInstanceState);

    void registerForContextMenu(final View view);

    void setAllowEnterTransitionOverlap(final boolean allow);

    void setAllowReturnTransitionOverlap(final boolean allow);

    void setArguments(final Bundle args);

    void setEnterSharedElementCallback(final SharedElementCallback callback);

    void setEnterTransition(final Object transition);

    void setExitSharedElementCallback(final SharedElementCallback callback);

    void setExitTransition(final Object transition);

    void setHasOptionsMenu(final boolean hasMenu);

    void setInitialSavedState(final Fragment.SavedState state);

    void setMenuVisibility(final boolean menuVisible);

    void setReenterTransition(final Object transition);

    void setRetainInstance(final boolean retain);

    void setReturnTransition(final Object transition);

    void setSharedElementEnterTransition(final Object transition);

    void setSharedElementReturnTransition(final Object transition);

    void setTargetFragment(final Fragment fragment, final int requestCode);

    void setUserVisibleHint(final boolean isVisibleToUser);

    boolean shouldShowRequestPermissionRationale(@NonNull final String permission);

    void startActivity(final Intent intent);

    void startActivity(final Intent intent, @Nullable final Bundle options);

    void startActivityForResult(final Intent intent, final int requestCode);

    void startActivityForResult(final Intent intent, final int requestCode,
            @Nullable final Bundle options);

    void super_dump(final String prefix, final FileDescriptor fd, final PrintWriter writer,
            final String[] args);

    boolean super_getAllowEnterTransitionOverlap();

    boolean super_getAllowReturnTransitionOverlap();

    Context super_getContext();

    Object super_getEnterTransition();

    Object super_getExitTransition();

    LayoutInflater super_getLayoutInflater(final Bundle savedInstanceState);

    LoaderManager super_getLoaderManager();

    Object super_getReenterTransition();

    Object super_getReturnTransition();

    Object super_getSharedElementEnterTransition();

    Object super_getSharedElementReturnTransition();

    boolean super_getUserVisibleHint();

    View super_getView();

    void super_onActivityCreated(@Nullable final Bundle savedInstanceState);

    void super_onActivityResult(final int requestCode, final int resultCode, final Intent data);

    void super_onAttach(final Context context);

    void super_onAttach(final Activity activity);

    void super_onConfigurationChanged(final Configuration newConfig);

    boolean super_onContextItemSelected(final MenuItem item);

    void super_onCreate(@Nullable final Bundle savedInstanceState);

    Animation super_onCreateAnimation(final int transit, final boolean enter, final int nextAnim);

    void super_onCreateContextMenu(final ContextMenu menu, final View v,
            final ContextMenu.ContextMenuInfo menuInfo);

    void super_onCreateOptionsMenu(final Menu menu, final MenuInflater inflater);

    View super_onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container,
            @Nullable final Bundle savedInstanceState);

    void super_onDestroy();

    void super_onDestroyOptionsMenu();

    void super_onDestroyView();

    void super_onDetach();

    void super_onHiddenChanged(final boolean hidden);

    void super_onInflate(final Context context, final AttributeSet attrs,
            final Bundle savedInstanceState);

    void super_onInflate(final Activity activity, final AttributeSet attrs,
            final Bundle savedInstanceState);

    void super_onLowMemory();

    boolean super_onOptionsItemSelected(final MenuItem item);

    void super_onOptionsMenuClosed(final Menu menu);

    void super_onPause();

    void super_onPrepareOptionsMenu(final Menu menu);

    void super_onRequestPermissionsResult(final int requestCode,
            @NonNull final String[] permissions, @NonNull final int[] grantResults);

    void super_onResume();

    void super_onSaveInstanceState(final Bundle outState);

    void super_onStart();

    void super_onStop();

    void super_onViewCreated(final View view, @Nullable final Bundle savedInstanceState);

    void super_onViewStateRestored(@Nullable final Bundle savedInstanceState);

    void super_registerForContextMenu(final View view);

    void super_setAllowEnterTransitionOverlap(final boolean allow);

    void super_setAllowReturnTransitionOverlap(final boolean allow);

    void super_setArguments(final Bundle args);

    void super_setEnterSharedElementCallback(final SharedElementCallback callback);

    void super_setEnterTransition(final Object transition);

    void super_setExitSharedElementCallback(final SharedElementCallback callback);

    void super_setExitTransition(final Object transition);

    void super_setHasOptionsMenu(final boolean hasMenu);

    void super_setInitialSavedState(final Fragment.SavedState state);

    void super_setMenuVisibility(final boolean menuVisible);

    void super_setReenterTransition(final Object transition);

    void super_setRetainInstance(final boolean retain);

    void super_setReturnTransition(final Object transition);

    void super_setSharedElementEnterTransition(final Object transition);

    void super_setSharedElementReturnTransition(final Object transition);

    void super_setTargetFragment(final Fragment fragment, final int requestCode);

    void super_setUserVisibleHint(final boolean isVisibleToUser);

    boolean super_shouldShowRequestPermissionRationale(@NonNull final String permission);

    void super_startActivity(final Intent intent);

    void super_startActivity(final Intent intent, @Nullable final Bundle options);

    void super_startActivityForResult(final Intent intent, final int requestCode);

    void super_startActivityForResult(final Intent intent, final int requestCode,
            @Nullable final Bundle options);

    String super_toString();

    void super_unregisterForContextMenu(final View view);

    String toString();

    void unregisterForContextMenu(final View view);
}
