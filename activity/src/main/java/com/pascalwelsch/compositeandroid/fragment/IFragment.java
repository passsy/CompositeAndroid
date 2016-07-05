package com.pascalwelsch.compositeandroid.fragment;

import android.app.Activity;
import android.content.ComponentCallbacks;
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

public interface IFragment extends ComponentCallbacks, View.OnCreateContextMenuListener {

    void dump(String prefix, FileDescriptor fd, PrintWriter writer,
            String[] args);

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

    @Nullable
    View getView();

    void onActivityCreated(@Nullable Bundle savedInstanceState);

    void onActivityResult(int requestCode, int resultCode, Intent data);

    void onAttach(Context context);

    void onAttach(Activity activity);

    @Override
    void onConfigurationChanged(Configuration newConfig);

    boolean onContextItemSelected(MenuItem item);

    void onCreate(@Nullable Bundle savedInstanceState);

    Animation onCreateAnimation(int transit, boolean enter, int nextAnim);

    @Override
    void onCreateContextMenu(ContextMenu menu, View v,
            ContextMenu.ContextMenuInfo menuInfo);

    void onCreateOptionsMenu(Menu menu, MenuInflater inflater);

    @Nullable
    View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState);

    void onDestroy();

    void onDestroyOptionsMenu();

    void onDestroyView();

    void onDetach();

    void onHiddenChanged(boolean hidden);

    void onInflate(Context context, AttributeSet attrs,
            Bundle savedInstanceState);

    void onInflate(Activity activity, AttributeSet attrs,
            Bundle savedInstanceState);

    @Override
    void onLowMemory();

    boolean onOptionsItemSelected(MenuItem item);

    void onOptionsMenuClosed(Menu menu);

    void onPause();

    void onPrepareOptionsMenu(Menu menu);

    void onRequestPermissionsResult(int requestCode,
            @NonNull String[] permissions, @NonNull int[] grantResults);

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

    void setInitialSavedState(Fragment.SavedState state);

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

    void startActivityForResult(Intent intent, int requestCode,
            @Nullable Bundle options);

    @Override
    String toString();

    void unregisterForContextMenu(View view);

    void dump__super(String prefix, FileDescriptor fd,
            PrintWriter writer, String[] args);

    boolean getAllowEnterTransitionOverlap__super();

    boolean getAllowReturnTransitionOverlap__super();

    Context getContext__super();

    Object getEnterTransition__super();

    Object getExitTransition__super();

    LayoutInflater getLayoutInflater__super(Bundle savedInstanceState);

    LoaderManager getLoaderManager__super();

    Object getReenterTransition__super();

    Object getReturnTransition__super();

    Object getSharedElementEnterTransition__super();

    Object getSharedElementReturnTransition__super();

    boolean getUserVisibleHint__super();

    @Nullable
    View getView__super();

    void onActivityCreated__super(@Nullable Bundle savedInstanceState);

    void onActivityResult__super(int requestCode, int resultCode,
            Intent data);

    void onAttach__super(Context context);

    void onAttach__super(Activity activity);

    void onConfigurationChanged__super(Configuration newConfig);

    boolean onContextItemSelected__super(MenuItem item);

    Animation onCreateAnimation__super(int transit, boolean enter,
            int nextAnim);

    void onCreateContextMenu__super(ContextMenu menu, View v,
            ContextMenu.ContextMenuInfo menuInfo);

    void onCreateOptionsMenu__super(Menu menu, MenuInflater inflater);

    @Nullable
    View onCreateView__super(LayoutInflater inflater,
            @Nullable ViewGroup container, @Nullable Bundle savedInstanceState);

    void onCreate__super(@Nullable Bundle savedInstanceState);

    void onDestroyOptionsMenu__super();

    void onDestroyView__super();

    void onDestroy__super();

    void onDetach__super();

    void onHiddenChanged__super(boolean hidden);

    void onInflate__super(Context context, AttributeSet attrs,
            Bundle savedInstanceState);

    void onInflate__super(Activity activity, AttributeSet attrs,
            Bundle savedInstanceState);

    void onLowMemory__super();

    boolean onOptionsItemSelected__super(MenuItem item);

    void onOptionsMenuClosed__super(Menu menu);

    void onPause__super();

    void onPrepareOptionsMenu__super(Menu menu);

    void onRequestPermissionsResult__super(int requestCode,
            @NonNull String[] permissions, @NonNull int[] grantResults);

    void onResume__super();

    void onSaveInstanceState__super(Bundle outState);

    void onStart__super();

    void onStop__super();

    void onViewCreated__super(View view,
            @Nullable Bundle savedInstanceState);

    void onViewStateRestored__super(@Nullable Bundle savedInstanceState);

    void registerForContextMenu__super(View view);

    void setAllowEnterTransitionOverlap__super(boolean allow);

    void setAllowReturnTransitionOverlap__super(boolean allow);

    void setArguments__super(Bundle args);

    void setEnterSharedElementCallback__super(SharedElementCallback callback);

    void setEnterTransition__super(Object transition);

    void setExitSharedElementCallback__super(SharedElementCallback callback);

    void setExitTransition__super(Object transition);

    void setHasOptionsMenu__super(boolean hasMenu);

    void setInitialSavedState__super(Fragment.SavedState state);

    void setMenuVisibility__super(boolean menuVisible);

    void setReenterTransition__super(Object transition);

    void setRetainInstance__super(boolean retain);

    void setReturnTransition__super(Object transition);

    void setSharedElementEnterTransition__super(Object transition);

    void setSharedElementReturnTransition__super(Object transition);

    void setTargetFragment__super(Fragment fragment, int requestCode);

    void setUserVisibleHint__super(boolean isVisibleToUser);

    boolean shouldShowRequestPermissionRationale__super(
            @NonNull String permission);

    void startActivityForResult__super(Intent intent, int requestCode);

    void startActivityForResult__super(Intent intent, int requestCode,
            @Nullable Bundle options);

    void startActivity__super(Intent intent);

    void startActivity__super(Intent intent, @Nullable Bundle options);

    String toString__super();

    void unregisterForContextMenu__super(View view);
}
