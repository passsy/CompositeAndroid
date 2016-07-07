package com.pascalwelsch.compositeandroid.fragment;

import com.pascalwelsch.compositeandroid.core.Removable;

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

    Removable addPlugin(FragmentPlugin plugin);

    void dump(String prefix, FileDescriptor fd, PrintWriter writer,
            String[] args);

    void dump__super(String prefix, FileDescriptor fd, PrintWriter writer,
            String[] args);

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

    LayoutInflater getLayoutInflater(Bundle savedInstanceState);

    LayoutInflater getLayoutInflater__super(Bundle savedInstanceState);

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

    @Nullable
    View getView();

    @Nullable
    View getView__super();

    void onActivityCreated(@Nullable Bundle savedInstanceState);

    void onActivityCreated__super(@Nullable Bundle savedInstanceState);

    void onActivityResult(int requestCode, int resultCode, Intent data);

    void onActivityResult__super(int requestCode, int resultCode,
            Intent data);

    void onAttach(Context context);

    void onAttach(Activity activity);

    void onAttach__super(Context context);

    void onAttach__super(Activity activity);

    @Override
    void onConfigurationChanged(Configuration newConfig);

    void onConfigurationChanged__super(Configuration newConfig);

    boolean onContextItemSelected(MenuItem item);

    boolean onContextItemSelected__super(MenuItem item);

    void onCreate(@Nullable Bundle savedInstanceState);

    Animation onCreateAnimation(int transit, boolean enter, int nextAnim);

    Animation onCreateAnimation__super(int transit, boolean enter,
            int nextAnim);

    @Override
    void onCreateContextMenu(ContextMenu menu, View v,
            ContextMenu.ContextMenuInfo menuInfo);

    void onCreateContextMenu__super(ContextMenu menu, View v,
            ContextMenu.ContextMenuInfo menuInfo);

    void onCreateOptionsMenu(Menu menu, MenuInflater inflater);

    void onCreateOptionsMenu__super(Menu menu, MenuInflater inflater);

    @Nullable
    View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState);

    @Nullable
    View onCreateView__super(LayoutInflater inflater,
            @Nullable ViewGroup container, @Nullable Bundle savedInstanceState);

    void onCreate__super(@Nullable Bundle savedInstanceState);

    void onDestroy();

    void onDestroyOptionsMenu();

    void onDestroyOptionsMenu__super();

    void onDestroyView();

    void onDestroyView__super();

    void onDestroy__super();

    void onDetach();

    void onDetach__super();

    void onHiddenChanged(boolean hidden);

    void onHiddenChanged__super(boolean hidden);

    void onInflate(Context context, AttributeSet attrs,
            Bundle savedInstanceState);

    void onInflate(Activity activity, AttributeSet attrs,
            Bundle savedInstanceState);

    void onInflate__super(Context context, AttributeSet attrs,
            Bundle savedInstanceState);

    void onInflate__super(Activity activity, AttributeSet attrs,
            Bundle savedInstanceState);

    @Override
    void onLowMemory();

    void onLowMemory__super();

    boolean onOptionsItemSelected(MenuItem item);

    boolean onOptionsItemSelected__super(MenuItem item);

    void onOptionsMenuClosed(Menu menu);

    void onOptionsMenuClosed__super(Menu menu);

    void onPause();

    void onPause__super();

    void onPrepareOptionsMenu(Menu menu);

    void onPrepareOptionsMenu__super(Menu menu);

    void onRequestPermissionsResult(int requestCode,
            @NonNull String[] permissions, @NonNull int[] grantResults);

    void onRequestPermissionsResult__super(int requestCode,
            @NonNull String[] permissions, @NonNull int[] grantResults);

    void onResume();

    void onResume__super();

    void onSaveInstanceState(Bundle outState);

    void onSaveInstanceState__super(Bundle outState);

    void onStart();

    void onStart__super();

    void onStop();

    void onStop__super();

    void onViewCreated(View view, @Nullable Bundle savedInstanceState);

    void onViewCreated__super(View view, @Nullable Bundle savedInstanceState);

    void onViewStateRestored(@Nullable Bundle savedInstanceState);

    void onViewStateRestored__super(@Nullable Bundle savedInstanceState);

    void registerForContextMenu(View view);

    void registerForContextMenu__super(View view);

    void setAllowEnterTransitionOverlap(boolean allow);

    void setAllowEnterTransitionOverlap__super(boolean allow);

    void setAllowReturnTransitionOverlap(boolean allow);

    void setAllowReturnTransitionOverlap__super(boolean allow);

    void setArguments(Bundle args);

    void setArguments__super(Bundle args);

    void setEnterSharedElementCallback(SharedElementCallback callback);

    void setEnterSharedElementCallback__super(SharedElementCallback callback);

    void setEnterTransition(Object transition);

    void setEnterTransition__super(Object transition);

    void setExitSharedElementCallback(SharedElementCallback callback);

    void setExitSharedElementCallback__super(SharedElementCallback callback);

    void setExitTransition(Object transition);

    void setExitTransition__super(Object transition);

    void setHasOptionsMenu(boolean hasMenu);

    void setHasOptionsMenu__super(boolean hasMenu);

    void setInitialSavedState(Fragment.SavedState state);

    void setInitialSavedState__super(Fragment.SavedState state);

    void setMenuVisibility(boolean menuVisible);

    void setMenuVisibility__super(boolean menuVisible);

    void setReenterTransition(Object transition);

    void setReenterTransition__super(Object transition);

    void setRetainInstance(boolean retain);

    void setRetainInstance__super(boolean retain);

    void setReturnTransition(Object transition);

    void setReturnTransition__super(Object transition);

    void setSharedElementEnterTransition(Object transition);

    void setSharedElementEnterTransition__super(Object transition);

    void setSharedElementReturnTransition(Object transition);

    void setSharedElementReturnTransition__super(Object transition);

    void setTargetFragment(Fragment fragment, int requestCode);

    void setTargetFragment__super(Fragment fragment, int requestCode);

    void setUserVisibleHint(boolean isVisibleToUser);

    void setUserVisibleHint__super(boolean isVisibleToUser);

    boolean shouldShowRequestPermissionRationale(@NonNull String permission);

    boolean shouldShowRequestPermissionRationale__super(@NonNull String permission);

    void startActivity(Intent intent);

    void startActivity(Intent intent, @Nullable Bundle options);

    void startActivityForResult(Intent intent, int requestCode);

    void startActivityForResult(Intent intent, int requestCode,
            @Nullable Bundle options);

    void startActivityForResult__super(Intent intent, int requestCode);

    void startActivityForResult__super(Intent intent, int requestCode,
            @Nullable Bundle options);

    void startActivity__super(Intent intent);

    void startActivity__super(Intent intent, @Nullable Bundle options);

    @Override
    String toString();

    String toString__super();

    void unregisterForContextMenu(View view);

    void unregisterForContextMenu__super(View view);
}
