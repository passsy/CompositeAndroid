package com.pascalwelsch.compositeandroid.fragment;

import com.pascalwelsch.compositeandroid.core.AbstractPlugin;
import com.pascalwelsch.compositeandroid.core.NamedSuperCall;

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

@SuppressWarnings("unused")
public class FragmentPlugin extends AbstractPlugin<Fragment, FragmentDelegate> {

    public void dump(final String prefix, final FileDescriptor fd, final PrintWriter writer,
            final String[] args) {
        verifyMethodCalledFromDelegate("dump(String, FileDescriptor, PrintWriter, String[])");
        mSuperListeners.pop().call(prefix, fd, writer, args);
    }

    public boolean getAllowEnterTransitionOverlap() {
        verifyMethodCalledFromDelegate("getAllowEnterTransitionOverlap()");
        return (Boolean) mSuperListeners.pop().call();
    }

    public boolean getAllowReturnTransitionOverlap() {
        verifyMethodCalledFromDelegate("getAllowReturnTransitionOverlap()");
        return (Boolean) mSuperListeners.pop().call();
    }

    public Context getContext() {
        verifyMethodCalledFromDelegate("getContext()");
        return (Context) mSuperListeners.pop().call();
    }

    public Object getEnterTransition() {
        verifyMethodCalledFromDelegate("getEnterTransition()");
        return (Object) mSuperListeners.pop().call();
    }

    public Object getExitTransition() {
        verifyMethodCalledFromDelegate("getExitTransition()");
        return (Object) mSuperListeners.pop().call();
    }

    public LayoutInflater getLayoutInflater(final Bundle savedInstanceState) {
        verifyMethodCalledFromDelegate("getLayoutInflater(Bundle)");
        return (LayoutInflater) mSuperListeners.pop().call(savedInstanceState);
    }

    public LoaderManager getLoaderManager() {
        verifyMethodCalledFromDelegate("getLoaderManager()");
        return (LoaderManager) mSuperListeners.pop().call();
    }

    public Object getReenterTransition() {
        verifyMethodCalledFromDelegate("getReenterTransition()");
        return (Object) mSuperListeners.pop().call();
    }

    public Object getReturnTransition() {
        verifyMethodCalledFromDelegate("getReturnTransition()");
        return (Object) mSuperListeners.pop().call();
    }

    public Object getSharedElementEnterTransition() {
        verifyMethodCalledFromDelegate("getSharedElementEnterTransition()");
        return (Object) mSuperListeners.pop().call();
    }

    public Object getSharedElementReturnTransition() {
        verifyMethodCalledFromDelegate("getSharedElementReturnTransition()");
        return (Object) mSuperListeners.pop().call();
    }

    public boolean getUserVisibleHint() {
        verifyMethodCalledFromDelegate("getUserVisibleHint()");
        return (Boolean) mSuperListeners.pop().call();
    }

    public View getView() {
        verifyMethodCalledFromDelegate("getView()");
        return (View) mSuperListeners.pop().call();
    }

    public void onActivityCreated(@Nullable final Bundle savedInstanceState) {
        verifyMethodCalledFromDelegate("onActivityCreated(Bundle)");
        mSuperListeners.pop().call(savedInstanceState);
    }

    public void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        verifyMethodCalledFromDelegate("onActivityResult(int, int, Intent)");
        mSuperListeners.pop().call(requestCode, resultCode, data);
    }

    public void onAttach(final Context context) {
        verifyMethodCalledFromDelegate("onAttach(Context)");
        mSuperListeners.pop().call(context);
    }

    public void onAttach(final Activity activity) {
        verifyMethodCalledFromDelegate("onAttach(Activity)");
        mSuperListeners.pop().call(activity);
    }

    public void onConfigurationChanged(final Configuration newConfig) {
        verifyMethodCalledFromDelegate("onConfigurationChanged(Configuration)");
        mSuperListeners.pop().call(newConfig);
    }

    public boolean onContextItemSelected(final MenuItem item) {
        verifyMethodCalledFromDelegate("onContextItemSelected(MenuItem)");
        return (Boolean) mSuperListeners.pop().call(item);
    }

    public void onCreate(@Nullable final Bundle savedInstanceState) {
        verifyMethodCalledFromDelegate("onCreate(Bundle)");
        mSuperListeners.pop().call(savedInstanceState);
    }

    public Animation onCreateAnimation(final int transit, final boolean enter, final int nextAnim) {
        verifyMethodCalledFromDelegate("onCreateAnimation(int, boolean, int)");
        return (Animation) mSuperListeners.pop().call(transit, enter, nextAnim);
    }

    public void onCreateContextMenu(final ContextMenu menu, final View v,
            final ContextMenu.ContextMenuInfo menuInfo) {
        verifyMethodCalledFromDelegate(
                "onCreateContextMenu(ContextMenu, View, ContextMenu.ContextMenuInfo)");
        mSuperListeners.pop().call(menu, v, menuInfo);
    }

    public void onCreateOptionsMenu(final Menu menu, final MenuInflater inflater) {
        verifyMethodCalledFromDelegate("onCreateOptionsMenu(Menu, MenuInflater)");
        mSuperListeners.pop().call(menu, inflater);
    }

    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container,
            @Nullable final Bundle savedInstanceState) {
        verifyMethodCalledFromDelegate("onCreateView(LayoutInflater, ViewGroup, Bundle)");
        return (View) mSuperListeners.pop().call(inflater, container, savedInstanceState);
    }

    public void onDestroy() {
        verifyMethodCalledFromDelegate("onDestroy()");
        mSuperListeners.pop().call();
    }

    public void onDestroyOptionsMenu() {
        verifyMethodCalledFromDelegate("onDestroyOptionsMenu()");
        mSuperListeners.pop().call();
    }

    public void onDestroyView() {
        verifyMethodCalledFromDelegate("onDestroyView()");
        mSuperListeners.pop().call();
    }

    public void onDetach() {
        verifyMethodCalledFromDelegate("onDetach()");
        mSuperListeners.pop().call();
    }

    public void onHiddenChanged(final boolean hidden) {
        verifyMethodCalledFromDelegate("onHiddenChanged(boolean)");
        mSuperListeners.pop().call(hidden);
    }

    public void onInflate(final Context context, final AttributeSet attrs,
            final Bundle savedInstanceState) {
        verifyMethodCalledFromDelegate("onInflate(Context, AttributeSet, Bundle)");
        mSuperListeners.pop().call(context, attrs, savedInstanceState);
    }

    public void onInflate(final Activity activity, final AttributeSet attrs,
            final Bundle savedInstanceState) {
        verifyMethodCalledFromDelegate("onInflate(Activity, AttributeSet, Bundle)");
        mSuperListeners.pop().call(activity, attrs, savedInstanceState);
    }

    public void onLowMemory() {
        verifyMethodCalledFromDelegate("onLowMemory()");
        mSuperListeners.pop().call();
    }

    public boolean onOptionsItemSelected(final MenuItem item) {
        verifyMethodCalledFromDelegate("onOptionsItemSelected(MenuItem)");
        return (Boolean) mSuperListeners.pop().call(item);
    }

    public void onOptionsMenuClosed(final Menu menu) {
        verifyMethodCalledFromDelegate("onOptionsMenuClosed(Menu)");
        mSuperListeners.pop().call(menu);
    }

    public void onPause() {
        verifyMethodCalledFromDelegate("onPause()");
        mSuperListeners.pop().call();
    }

    public void onPrepareOptionsMenu(final Menu menu) {
        verifyMethodCalledFromDelegate("onPrepareOptionsMenu(Menu)");
        mSuperListeners.pop().call(menu);
    }

    public void onRequestPermissionsResult(final int requestCode,
            @NonNull final String[] permissions, @NonNull final int[] grantResults) {
        verifyMethodCalledFromDelegate("onRequestPermissionsResult(int, String[], int[])");
        mSuperListeners.pop().call(requestCode, permissions, grantResults);
    }

    public void onResume() {
        verifyMethodCalledFromDelegate("onResume()");
        mSuperListeners.pop().call();
    }

    public void onSaveInstanceState(final Bundle outState) {
        verifyMethodCalledFromDelegate("onSaveInstanceState(Bundle)");
        mSuperListeners.pop().call(outState);
    }

    public void onStart() {
        verifyMethodCalledFromDelegate("onStart()");
        mSuperListeners.pop().call();
    }

    public void onStop() {
        verifyMethodCalledFromDelegate("onStop()");
        mSuperListeners.pop().call();
    }

    public void onViewCreated(final View view, @Nullable final Bundle savedInstanceState) {
        verifyMethodCalledFromDelegate("onViewCreated(View, Bundle)");
        mSuperListeners.pop().call(view, savedInstanceState);
    }

    public void onViewStateRestored(@Nullable final Bundle savedInstanceState) {
        verifyMethodCalledFromDelegate("onViewStateRestored(Bundle)");
        mSuperListeners.pop().call(savedInstanceState);
    }

    public void registerForContextMenu(final View view) {
        verifyMethodCalledFromDelegate("registerForContextMenu(View)");
        mSuperListeners.pop().call(view);
    }

    public void setAllowEnterTransitionOverlap(final boolean allow) {
        verifyMethodCalledFromDelegate("setAllowEnterTransitionOverlap(boolean)");
        mSuperListeners.pop().call(allow);
    }

    public void setAllowReturnTransitionOverlap(final boolean allow) {
        verifyMethodCalledFromDelegate("setAllowReturnTransitionOverlap(boolean)");
        mSuperListeners.pop().call(allow);
    }

    public void setArguments(final Bundle args) {
        verifyMethodCalledFromDelegate("setArguments(Bundle)");
        mSuperListeners.pop().call(args);
    }

    public void setEnterSharedElementCallback(final SharedElementCallback callback) {
        verifyMethodCalledFromDelegate("setEnterSharedElementCallback(SharedElementCallback)");
        mSuperListeners.pop().call(callback);
    }

    public void setEnterTransition(final Object transition) {
        verifyMethodCalledFromDelegate("setEnterTransition(Object)");
        mSuperListeners.pop().call(transition);
    }

    public void setExitSharedElementCallback(final SharedElementCallback callback) {
        verifyMethodCalledFromDelegate("setExitSharedElementCallback(SharedElementCallback)");
        mSuperListeners.pop().call(callback);
    }

    public void setExitTransition(final Object transition) {
        verifyMethodCalledFromDelegate("setExitTransition(Object)");
        mSuperListeners.pop().call(transition);
    }

    public void setHasOptionsMenu(final boolean hasMenu) {
        verifyMethodCalledFromDelegate("setHasOptionsMenu(boolean)");
        mSuperListeners.pop().call(hasMenu);
    }

    public void setInitialSavedState(final Fragment.SavedState state) {
        verifyMethodCalledFromDelegate("setInitialSavedState(Fragment.SavedState)");
        mSuperListeners.pop().call(state);
    }

    public void setMenuVisibility(final boolean menuVisible) {
        verifyMethodCalledFromDelegate("setMenuVisibility(boolean)");
        mSuperListeners.pop().call(menuVisible);
    }

    public void setReenterTransition(final Object transition) {
        verifyMethodCalledFromDelegate("setReenterTransition(Object)");
        mSuperListeners.pop().call(transition);
    }

    public void setRetainInstance(final boolean retain) {
        verifyMethodCalledFromDelegate("setRetainInstance(boolean)");
        mSuperListeners.pop().call(retain);
    }

    public void setReturnTransition(final Object transition) {
        verifyMethodCalledFromDelegate("setReturnTransition(Object)");
        mSuperListeners.pop().call(transition);
    }

    public void setSharedElementEnterTransition(final Object transition) {
        verifyMethodCalledFromDelegate("setSharedElementEnterTransition(Object)");
        mSuperListeners.pop().call(transition);
    }

    public void setSharedElementReturnTransition(final Object transition) {
        verifyMethodCalledFromDelegate("setSharedElementReturnTransition(Object)");
        mSuperListeners.pop().call(transition);
    }

    public void setTargetFragment(final Fragment fragment, final int requestCode) {
        verifyMethodCalledFromDelegate("setTargetFragment(Fragment, int)");
        mSuperListeners.pop().call(fragment, requestCode);
    }

    public void setUserVisibleHint(final boolean isVisibleToUser) {
        verifyMethodCalledFromDelegate("setUserVisibleHint(boolean)");
        mSuperListeners.pop().call(isVisibleToUser);
    }

    public boolean shouldShowRequestPermissionRationale(@NonNull final String permission) {
        verifyMethodCalledFromDelegate("shouldShowRequestPermissionRationale(String)");
        return (Boolean) mSuperListeners.pop().call(permission);
    }

    public void startActivity(final Intent intent) {
        verifyMethodCalledFromDelegate("startActivity(Intent)");
        mSuperListeners.pop().call(intent);
    }

    public void startActivity(final Intent intent, @Nullable final Bundle options) {
        verifyMethodCalledFromDelegate("startActivity(Intent, Bundle)");
        mSuperListeners.pop().call(intent, options);
    }

    public void startActivityForResult(final Intent intent, final int requestCode) {
        verifyMethodCalledFromDelegate("startActivityForResult(Intent, int)");
        mSuperListeners.pop().call(intent, requestCode);
    }

    public void startActivityForResult(final Intent intent, final int requestCode,
            @Nullable final Bundle options) {
        verifyMethodCalledFromDelegate("startActivityForResult(Intent, int, Bundle)");
        mSuperListeners.pop().call(intent, requestCode, options);
    }

    public String toString() {
        verifyMethodCalledFromDelegate("toString()");
        return (String) mSuperListeners.pop().call();
    }

    public void unregisterForContextMenu(final View view) {
        verifyMethodCalledFromDelegate("unregisterForContextMenu(View)");
        mSuperListeners.pop().call(view);
    }

    void dump(final NamedSuperCall<Void> superCall, final String prefix, final FileDescriptor fd,
            final PrintWriter writer, final String[] args) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            dump(prefix, fd, writer, args);
        }
    }

    boolean getAllowEnterTransitionOverlap(final NamedSuperCall<Boolean> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getAllowEnterTransitionOverlap();
        }
    }

    boolean getAllowReturnTransitionOverlap(final NamedSuperCall<Boolean> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getAllowReturnTransitionOverlap();
        }
    }

    Context getContext(final NamedSuperCall<Context> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getContext();
        }
    }

    Object getEnterTransition(final NamedSuperCall<Object> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getEnterTransition();
        }
    }

    Object getExitTransition(final NamedSuperCall<Object> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getExitTransition();
        }
    }

    LayoutInflater getLayoutInflater(final NamedSuperCall<LayoutInflater> superCall,
            final Bundle savedInstanceState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getLayoutInflater(savedInstanceState);
        }
    }

    LoaderManager getLoaderManager(final NamedSuperCall<LoaderManager> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getLoaderManager();
        }
    }

    Object getReenterTransition(final NamedSuperCall<Object> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getReenterTransition();
        }
    }

    Object getReturnTransition(final NamedSuperCall<Object> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getReturnTransition();
        }
    }

    Object getSharedElementEnterTransition(final NamedSuperCall<Object> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getSharedElementEnterTransition();
        }
    }

    Object getSharedElementReturnTransition(final NamedSuperCall<Object> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getSharedElementReturnTransition();
        }
    }

    boolean getUserVisibleHint(final NamedSuperCall<Boolean> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getUserVisibleHint();
        }
    }

    View getView(final NamedSuperCall<View> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getView();
        }
    }

    void onActivityCreated(final NamedSuperCall<Void> superCall,
            @Nullable final Bundle savedInstanceState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onActivityCreated(savedInstanceState);
        }
    }

    void onActivityResult(final NamedSuperCall<Void> superCall, final int requestCode,
            final int resultCode, final Intent data) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onActivityResult(requestCode, resultCode, data);
        }
    }

    void onAttach(final NamedSuperCall<Void> superCall, final Context context) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onAttach(context);
        }
    }

    void onAttach(final NamedSuperCall<Void> superCall, final Activity activity) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onAttach(activity);
        }
    }

    void onConfigurationChanged(final NamedSuperCall<Void> superCall,
            final Configuration newConfig) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onConfigurationChanged(newConfig);
        }
    }

    boolean onContextItemSelected(final NamedSuperCall<Boolean> superCall, final MenuItem item) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onContextItemSelected(item);
        }
    }

    void onCreate(final NamedSuperCall<Void> superCall, @Nullable final Bundle savedInstanceState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onCreate(savedInstanceState);
        }
    }

    Animation onCreateAnimation(final NamedSuperCall<Animation> superCall, final int transit,
            final boolean enter, final int nextAnim) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onCreateAnimation(transit, enter, nextAnim);
        }
    }

    void onCreateContextMenu(final NamedSuperCall<Void> superCall, final ContextMenu menu,
            final View v, final ContextMenu.ContextMenuInfo menuInfo) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onCreateContextMenu(menu, v, menuInfo);
        }
    }

    void onCreateOptionsMenu(final NamedSuperCall<Void> superCall, final Menu menu,
            final MenuInflater inflater) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onCreateOptionsMenu(menu, inflater);
        }
    }

    View onCreateView(final NamedSuperCall<View> superCall, final LayoutInflater inflater,
            @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onCreateView(inflater, container, savedInstanceState);
        }
    }

    void onDestroy(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onDestroy();
        }
    }

    void onDestroyOptionsMenu(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onDestroyOptionsMenu();
        }
    }

    void onDestroyView(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onDestroyView();
        }
    }

    void onDetach(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onDetach();
        }
    }

    void onHiddenChanged(final NamedSuperCall<Void> superCall, final boolean hidden) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onHiddenChanged(hidden);
        }
    }

    void onInflate(final NamedSuperCall<Void> superCall, final Context context,
            final AttributeSet attrs, final Bundle savedInstanceState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onInflate(context, attrs, savedInstanceState);
        }
    }

    void onInflate(final NamedSuperCall<Void> superCall, final Activity activity,
            final AttributeSet attrs, final Bundle savedInstanceState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onInflate(activity, attrs, savedInstanceState);
        }
    }

    void onLowMemory(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onLowMemory();
        }
    }

    boolean onOptionsItemSelected(final NamedSuperCall<Boolean> superCall, final MenuItem item) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onOptionsItemSelected(item);
        }
    }

    void onOptionsMenuClosed(final NamedSuperCall<Void> superCall, final Menu menu) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onOptionsMenuClosed(menu);
        }
    }

    void onPause(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onPause();
        }
    }

    void onPrepareOptionsMenu(final NamedSuperCall<Void> superCall, final Menu menu) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onPrepareOptionsMenu(menu);
        }
    }

    void onRequestPermissionsResult(final NamedSuperCall<Void> superCall, final int requestCode,
            @NonNull final String[] permissions, @NonNull final int[] grantResults) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }

    void onResume(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onResume();
        }
    }

    void onSaveInstanceState(final NamedSuperCall<Void> superCall, final Bundle outState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onSaveInstanceState(outState);
        }
    }

    void onStart(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onStart();
        }
    }

    void onStop(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onStop();
        }
    }

    void onViewCreated(final NamedSuperCall<Void> superCall, final View view,
            @Nullable final Bundle savedInstanceState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onViewCreated(view, savedInstanceState);
        }
    }

    void onViewStateRestored(final NamedSuperCall<Void> superCall,
            @Nullable final Bundle savedInstanceState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onViewStateRestored(savedInstanceState);
        }
    }

    void registerForContextMenu(final NamedSuperCall<Void> superCall, final View view) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            registerForContextMenu(view);
        }
    }

    void setAllowEnterTransitionOverlap(final NamedSuperCall<Void> superCall, final boolean allow) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setAllowEnterTransitionOverlap(allow);
        }
    }

    void setAllowReturnTransitionOverlap(final NamedSuperCall<Void> superCall,
            final boolean allow) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setAllowReturnTransitionOverlap(allow);
        }
    }

    void setArguments(final NamedSuperCall<Void> superCall, final Bundle args) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setArguments(args);
        }
    }

    void setEnterSharedElementCallback(final NamedSuperCall<Void> superCall,
            final SharedElementCallback callback) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setEnterSharedElementCallback(callback);
        }
    }

    void setEnterTransition(final NamedSuperCall<Void> superCall, final Object transition) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setEnterTransition(transition);
        }
    }

    void setExitSharedElementCallback(final NamedSuperCall<Void> superCall,
            final SharedElementCallback callback) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setExitSharedElementCallback(callback);
        }
    }

    void setExitTransition(final NamedSuperCall<Void> superCall, final Object transition) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setExitTransition(transition);
        }
    }

    void setHasOptionsMenu(final NamedSuperCall<Void> superCall, final boolean hasMenu) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setHasOptionsMenu(hasMenu);
        }
    }

    void setInitialSavedState(final NamedSuperCall<Void> superCall,
            final Fragment.SavedState state) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setInitialSavedState(state);
        }
    }

    void setMenuVisibility(final NamedSuperCall<Void> superCall, final boolean menuVisible) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setMenuVisibility(menuVisible);
        }
    }

    void setReenterTransition(final NamedSuperCall<Void> superCall, final Object transition) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setReenterTransition(transition);
        }
    }

    void setRetainInstance(final NamedSuperCall<Void> superCall, final boolean retain) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setRetainInstance(retain);
        }
    }

    void setReturnTransition(final NamedSuperCall<Void> superCall, final Object transition) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setReturnTransition(transition);
        }
    }

    void setSharedElementEnterTransition(final NamedSuperCall<Void> superCall,
            final Object transition) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setSharedElementEnterTransition(transition);
        }
    }

    void setSharedElementReturnTransition(final NamedSuperCall<Void> superCall,
            final Object transition) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setSharedElementReturnTransition(transition);
        }
    }

    void setTargetFragment(final NamedSuperCall<Void> superCall, final Fragment fragment,
            final int requestCode) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setTargetFragment(fragment, requestCode);
        }
    }

    void setUserVisibleHint(final NamedSuperCall<Void> superCall, final boolean isVisibleToUser) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setUserVisibleHint(isVisibleToUser);
        }
    }

    boolean shouldShowRequestPermissionRationale(final NamedSuperCall<Boolean> superCall,
            @NonNull final String permission) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return shouldShowRequestPermissionRationale(permission);
        }
    }

    void startActivity(final NamedSuperCall<Void> superCall, final Intent intent) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startActivity(intent);
        }
    }

    void startActivity(final NamedSuperCall<Void> superCall, final Intent intent,
            @Nullable final Bundle options) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startActivity(intent, options);
        }
    }

    void startActivityForResult(final NamedSuperCall<Void> superCall, final Intent intent,
            final int requestCode) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startActivityForResult(intent, requestCode);
        }
    }

    void startActivityForResult(final NamedSuperCall<Void> superCall, final Intent intent,
            final int requestCode, @Nullable final Bundle options) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startActivityForResult(intent, requestCode, options);
        }
    }

    String toString(final NamedSuperCall<String> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return toString();
        }
    }

    void unregisterForContextMenu(final NamedSuperCall<Void> superCall, final View view) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            unregisterForContextMenu(view);
        }
    }


}