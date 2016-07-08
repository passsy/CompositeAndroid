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

    void dump__super(final String prefix, final FileDescriptor fd, final PrintWriter writer,
            final String[] args);

    boolean getAllowEnterTransitionOverlap();

    boolean getAllowEnterTransitionOverlap__super();

    boolean getAllowReturnTransitionOverlap();

    boolean getAllowReturnTransitionOverlap__super();

    Context getContext();

    Context getContext__super();

    Object getEnterTransition();

    Object getEnterTransition__super();

    Object getExitTransition();

    Object getExitTransition__super();

    LayoutInflater getLayoutInflater(final Bundle savedInstanceState);

    LayoutInflater getLayoutInflater__super(final Bundle savedInstanceState);

    LoaderManager getLoaderManager();

    LoaderManager getLoaderManager__super();

    Object getReenterTransition();

    Object getReenterTransition__super();

    Object getReturnTransition();

    Object getReturnTransition__super();

    Object getSharedElementEnterTransition();

    Object getSharedElementEnterTransition__super();

    Object getSharedElementReturnTransition();

    Object getSharedElementReturnTransition__super();

    boolean getUserVisibleHint();

    boolean getUserVisibleHint__super();

    View getView();

    View getView__super();

    void onActivityCreated(@Nullable final Bundle savedInstanceState);

    void onActivityCreated__super(@Nullable final Bundle savedInstanceState);

    void onActivityResult(final int requestCode, final int resultCode, final Intent data);

    void onActivityResult__super(final int requestCode, final int resultCode, final Intent data);

    void onAttach(final Context context);

    void onAttach(final Activity activity);

    void onAttach__super(final Context context);

    void onAttach__super(final Activity activity);

    void onConfigurationChanged(final Configuration newConfig);

    void onConfigurationChanged__super(final Configuration newConfig);

    boolean onContextItemSelected(final MenuItem item);

    boolean onContextItemSelected__super(final MenuItem item);

    void onCreate(@Nullable final Bundle savedInstanceState);

    Animation onCreateAnimation(final int transit, final boolean enter, final int nextAnim);

    Animation onCreateAnimation__super(final int transit, final boolean enter, final int nextAnim);

    void onCreateContextMenu(final ContextMenu menu, final View v,
            final ContextMenu.ContextMenuInfo menuInfo);

    void onCreateContextMenu__super(final ContextMenu menu, final View v,
            final ContextMenu.ContextMenuInfo menuInfo);

    void onCreateOptionsMenu(final Menu menu, final MenuInflater inflater);

    void onCreateOptionsMenu__super(final Menu menu, final MenuInflater inflater);

    View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container,
            @Nullable final Bundle savedInstanceState);

    View onCreateView__super(final LayoutInflater inflater, @Nullable final ViewGroup container,
            @Nullable final Bundle savedInstanceState);

    void onCreate__super(@Nullable final Bundle savedInstanceState);

    void onDestroy();

    void onDestroyOptionsMenu();

    void onDestroyOptionsMenu__super();

    void onDestroyView();

    void onDestroyView__super();

    void onDestroy__super();

    void onDetach();

    void onDetach__super();

    void onHiddenChanged(final boolean hidden);

    void onHiddenChanged__super(final boolean hidden);

    void onInflate(final Context context, final AttributeSet attrs,
            final Bundle savedInstanceState);

    void onInflate(final Activity activity, final AttributeSet attrs,
            final Bundle savedInstanceState);

    void onInflate__super(final Context context, final AttributeSet attrs,
            final Bundle savedInstanceState);

    void onInflate__super(final Activity activity, final AttributeSet attrs,
            final Bundle savedInstanceState);

    void onLowMemory();

    void onLowMemory__super();

    boolean onOptionsItemSelected(final MenuItem item);

    boolean onOptionsItemSelected__super(final MenuItem item);

    void onOptionsMenuClosed(final Menu menu);

    void onOptionsMenuClosed__super(final Menu menu);

    void onPause();

    void onPause__super();

    void onPrepareOptionsMenu(final Menu menu);

    void onPrepareOptionsMenu__super(final Menu menu);

    void onRequestPermissionsResult(final int requestCode, @NonNull final String[] permissions,
            @NonNull final int[] grantResults);

    void onRequestPermissionsResult__super(final int requestCode,
            @NonNull final String[] permissions, @NonNull final int[] grantResults);

    void onResume();

    void onResume__super();

    void onSaveInstanceState(final Bundle outState);

    void onSaveInstanceState__super(final Bundle outState);

    void onStart();

    void onStart__super();

    void onStop();

    void onStop__super();

    void onViewCreated(final View view, @Nullable final Bundle savedInstanceState);

    void onViewCreated__super(final View view, @Nullable final Bundle savedInstanceState);

    void onViewStateRestored(@Nullable final Bundle savedInstanceState);

    void onViewStateRestored__super(@Nullable final Bundle savedInstanceState);

    void registerForContextMenu(final View view);

    void registerForContextMenu__super(final View view);

    void setAllowEnterTransitionOverlap(final boolean allow);

    void setAllowEnterTransitionOverlap__super(final boolean allow);

    void setAllowReturnTransitionOverlap(final boolean allow);

    void setAllowReturnTransitionOverlap__super(final boolean allow);

    void setArguments(final Bundle args);

    void setArguments__super(final Bundle args);

    void setEnterSharedElementCallback(final SharedElementCallback callback);

    void setEnterSharedElementCallback__super(final SharedElementCallback callback);

    void setEnterTransition(final Object transition);

    void setEnterTransition__super(final Object transition);

    void setExitSharedElementCallback(final SharedElementCallback callback);

    void setExitSharedElementCallback__super(final SharedElementCallback callback);

    void setExitTransition(final Object transition);

    void setExitTransition__super(final Object transition);

    void setHasOptionsMenu(final boolean hasMenu);

    void setHasOptionsMenu__super(final boolean hasMenu);

    void setInitialSavedState(final Fragment.SavedState state);

    void setInitialSavedState__super(final Fragment.SavedState state);

    void setMenuVisibility(final boolean menuVisible);

    void setMenuVisibility__super(final boolean menuVisible);

    void setReenterTransition(final Object transition);

    void setReenterTransition__super(final Object transition);

    void setRetainInstance(final boolean retain);

    void setRetainInstance__super(final boolean retain);

    void setReturnTransition(final Object transition);

    void setReturnTransition__super(final Object transition);

    void setSharedElementEnterTransition(final Object transition);

    void setSharedElementEnterTransition__super(final Object transition);

    void setSharedElementReturnTransition(final Object transition);

    void setSharedElementReturnTransition__super(final Object transition);

    void setTargetFragment(final Fragment fragment, final int requestCode);

    void setTargetFragment__super(final Fragment fragment, final int requestCode);

    void setUserVisibleHint(final boolean isVisibleToUser);

    void setUserVisibleHint__super(final boolean isVisibleToUser);

    boolean shouldShowRequestPermissionRationale(@NonNull final String permission);

    boolean shouldShowRequestPermissionRationale__super(@NonNull final String permission);

    void startActivity(final Intent intent);

    void startActivity(final Intent intent, @Nullable final Bundle options);

    void startActivityForResult(final Intent intent, final int requestCode);

    void startActivityForResult(final Intent intent, final int requestCode,
            @Nullable final Bundle options);

    void startActivityForResult__super(final Intent intent, final int requestCode);

    void startActivityForResult__super(final Intent intent, final int requestCode,
            @Nullable final Bundle options);

    void startActivity__super(final Intent intent);

    void startActivity__super(final Intent intent, @Nullable final Bundle options);

    String toString();

    String toString__super();

    void unregisterForContextMenu(final View view);

    void unregisterForContextMenu__super(final View view);
}
