package com.pascalwelsch.compositeandroid.fragment;

import com.pascalwelsch.compositeandroid.core.AbstractPlugin;
import com.pascalwelsch.compositeandroid.core.CallFun0;
import com.pascalwelsch.compositeandroid.core.CallFun1;
import com.pascalwelsch.compositeandroid.core.CallFun3;
import com.pascalwelsch.compositeandroid.core.CallVoid0;
import com.pascalwelsch.compositeandroid.core.CallVoid1;
import com.pascalwelsch.compositeandroid.core.CallVoid2;
import com.pascalwelsch.compositeandroid.core.CallVoid3;
import com.pascalwelsch.compositeandroid.core.CallVoid4;
import com.pascalwelsch.compositeandroid.core.CallVoid7;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
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
import java.lang.reflect.Method;

@SuppressWarnings("unused")
public class FragmentPlugin extends AbstractPlugin<Fragment, FragmentDelegate> {

    public void dump(final String prefix, final FileDescriptor fd, final PrintWriter writer,
            final String[] args) {
        verifyMethodCalledFromDelegate("dump(String, FileDescriptor, PrintWriter, String[])");
        ((CallVoid4<String, FileDescriptor, PrintWriter, String[]>) mSuperListeners.pop())
                .call(prefix, fd, writer, args);
    }

    public boolean getAllowEnterTransitionOverlap() {
        verifyMethodCalledFromDelegate("getAllowEnterTransitionOverlap()");
        return ((CallFun0<Boolean>) mSuperListeners.pop()).call();
    }

    public boolean getAllowReturnTransitionOverlap() {
        verifyMethodCalledFromDelegate("getAllowReturnTransitionOverlap()");
        return ((CallFun0<Boolean>) mSuperListeners.pop()).call();
    }

    public Context getContext() {
        verifyMethodCalledFromDelegate("getContext()");
        return ((CallFun0<Context>) mSuperListeners.pop()).call();
    }

    public Object getEnterTransition() {
        verifyMethodCalledFromDelegate("getEnterTransition()");
        return ((CallFun0<Object>) mSuperListeners.pop()).call();
    }

    public Object getExitTransition() {
        verifyMethodCalledFromDelegate("getExitTransition()");
        return ((CallFun0<Object>) mSuperListeners.pop()).call();
    }

    public Fragment getFragment() {
        return (Fragment) getOriginal();
    }

    public LayoutInflater getLayoutInflater(final Bundle savedInstanceState) {
        verifyMethodCalledFromDelegate("getLayoutInflater(Bundle)");
        return ((CallFun1<LayoutInflater, Bundle>) mSuperListeners.pop()).call(savedInstanceState);
    }

    public LoaderManager getLoaderManager() {
        verifyMethodCalledFromDelegate("getLoaderManager()");
        return ((CallFun0<LoaderManager>) mSuperListeners.pop()).call();
    }

    public Object getReenterTransition() {
        verifyMethodCalledFromDelegate("getReenterTransition()");
        return ((CallFun0<Object>) mSuperListeners.pop()).call();
    }

    public Object getReturnTransition() {
        verifyMethodCalledFromDelegate("getReturnTransition()");
        return ((CallFun0<Object>) mSuperListeners.pop()).call();
    }

    public Object getSharedElementEnterTransition() {
        verifyMethodCalledFromDelegate("getSharedElementEnterTransition()");
        return ((CallFun0<Object>) mSuperListeners.pop()).call();
    }

    public Object getSharedElementReturnTransition() {
        verifyMethodCalledFromDelegate("getSharedElementReturnTransition()");
        return ((CallFun0<Object>) mSuperListeners.pop()).call();
    }

    public boolean getUserVisibleHint() {
        verifyMethodCalledFromDelegate("getUserVisibleHint()");
        return ((CallFun0<Boolean>) mSuperListeners.pop()).call();
    }

    public View getView() {
        verifyMethodCalledFromDelegate("getView()");
        return ((CallFun0<View>) mSuperListeners.pop()).call();
    }

    public void onActivityCreated(@Nullable final Bundle savedInstanceState) {
        verifyMethodCalledFromDelegate("onActivityCreated(Bundle)");
        ((CallVoid1<Bundle>) mSuperListeners.pop()).call(savedInstanceState);
    }

    public void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        verifyMethodCalledFromDelegate("onActivityResult(Integer, Integer, Intent)");
        ((CallVoid3<Integer, Integer, Intent>) mSuperListeners.pop())
                .call(requestCode, resultCode, data);
    }

    public void onAttach(final Context context) {
        verifyMethodCalledFromDelegate("onAttach(Context)");
        ((CallVoid1<Context>) mSuperListeners.pop()).call(context);
    }

    public void onAttach(final Activity activity) {
        verifyMethodCalledFromDelegate("onAttach(Activity)");
        ((CallVoid1<Activity>) mSuperListeners.pop()).call(activity);
    }

    public void onAttachFragment(final Fragment childFragment) {
        verifyMethodCalledFromDelegate("onAttachFragment(Fragment)");
        ((CallVoid1<Fragment>) mSuperListeners.pop()).call(childFragment);
    }

    public void onConfigurationChanged(final Configuration newConfig) {
        verifyMethodCalledFromDelegate("onConfigurationChanged(Configuration)");
        ((CallVoid1<Configuration>) mSuperListeners.pop()).call(newConfig);
    }

    public boolean onContextItemSelected(final MenuItem item) {
        verifyMethodCalledFromDelegate("onContextItemSelected(MenuItem)");
        return ((CallFun1<Boolean, MenuItem>) mSuperListeners.pop()).call(item);
    }

    public void onCreate(@Nullable final Bundle savedInstanceState) {
        verifyMethodCalledFromDelegate("onCreate(Bundle)");
        ((CallVoid1<Bundle>) mSuperListeners.pop()).call(savedInstanceState);
    }

    public Animation onCreateAnimation(final int transit, final boolean enter, final int nextAnim) {
        verifyMethodCalledFromDelegate("onCreateAnimation(Integer, Boolean, Integer)");
        return ((CallFun3<Animation, Integer, Boolean, Integer>) mSuperListeners.pop())
                .call(transit, enter, nextAnim);
    }

    public void onCreateContextMenu(final ContextMenu menu, final View v,
            final ContextMenu.ContextMenuInfo menuInfo) {
        verifyMethodCalledFromDelegate(
                "onCreateContextMenu(ContextMenu, View, ContextMenu.ContextMenuInfo)");
        ((CallVoid3<ContextMenu, View, ContextMenu.ContextMenuInfo>) mSuperListeners.pop())
                .call(menu, v, menuInfo);
    }

    public void onCreateOptionsMenu(final Menu menu, final MenuInflater inflater) {
        verifyMethodCalledFromDelegate("onCreateOptionsMenu(Menu, MenuInflater)");
        ((CallVoid2<Menu, MenuInflater>) mSuperListeners.pop()).call(menu, inflater);
    }

    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container,
            @Nullable final Bundle savedInstanceState) {
        verifyMethodCalledFromDelegate("onCreateView(LayoutInflater, ViewGroup, Bundle)");
        return ((CallFun3<View, LayoutInflater, ViewGroup, Bundle>) mSuperListeners.pop())
                .call(inflater, container, savedInstanceState);
    }

    public void onDestroy() {
        verifyMethodCalledFromDelegate("onDestroy()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void onDestroyOptionsMenu() {
        verifyMethodCalledFromDelegate("onDestroyOptionsMenu()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void onDestroyView() {
        verifyMethodCalledFromDelegate("onDestroyView()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void onDetach() {
        verifyMethodCalledFromDelegate("onDetach()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void onHiddenChanged(final boolean hidden) {
        verifyMethodCalledFromDelegate("onHiddenChanged(Boolean)");
        ((CallVoid1<Boolean>) mSuperListeners.pop()).call(hidden);
    }

    public void onInflate(final Context context, final AttributeSet attrs,
            final Bundle savedInstanceState) {
        verifyMethodCalledFromDelegate("onInflate(Context, AttributeSet, Bundle)");
        ((CallVoid3<Context, AttributeSet, Bundle>) mSuperListeners.pop())
                .call(context, attrs, savedInstanceState);
    }

    public void onInflate(final Activity activity, final AttributeSet attrs,
            final Bundle savedInstanceState) {
        verifyMethodCalledFromDelegate("onInflate(Activity, AttributeSet, Bundle)");
        ((CallVoid3<Activity, AttributeSet, Bundle>) mSuperListeners.pop())
                .call(activity, attrs, savedInstanceState);
    }

    public void onLowMemory() {
        verifyMethodCalledFromDelegate("onLowMemory()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void onMultiWindowModeChanged(final boolean isInMultiWindowMode) {
        verifyMethodCalledFromDelegate("onMultiWindowModeChanged(Boolean)");
        ((CallVoid1<Boolean>) mSuperListeners.pop()).call(isInMultiWindowMode);
    }

    public boolean onOptionsItemSelected(final MenuItem item) {
        verifyMethodCalledFromDelegate("onOptionsItemSelected(MenuItem)");
        return ((CallFun1<Boolean, MenuItem>) mSuperListeners.pop()).call(item);
    }

    public void onOptionsMenuClosed(final Menu menu) {
        verifyMethodCalledFromDelegate("onOptionsMenuClosed(Menu)");
        ((CallVoid1<Menu>) mSuperListeners.pop()).call(menu);
    }

    public void onPause() {
        verifyMethodCalledFromDelegate("onPause()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void onPictureInPictureModeChanged(final boolean isInPictureInPictureMode) {
        verifyMethodCalledFromDelegate("onPictureInPictureModeChanged(Boolean)");
        ((CallVoid1<Boolean>) mSuperListeners.pop()).call(isInPictureInPictureMode);
    }

    public void onPrepareOptionsMenu(final Menu menu) {
        verifyMethodCalledFromDelegate("onPrepareOptionsMenu(Menu)");
        ((CallVoid1<Menu>) mSuperListeners.pop()).call(menu);
    }

    public void onRequestPermissionsResult(final int requestCode,
            @NonNull final String[] permissions, @NonNull final int[] grantResults) {
        verifyMethodCalledFromDelegate("onRequestPermissionsResult(Integer, String[], int[])");
        ((CallVoid3<Integer, String[], int[]>) mSuperListeners.pop())
                .call(requestCode, permissions, grantResults);
    }

    public void onResume() {
        verifyMethodCalledFromDelegate("onResume()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void onSaveInstanceState(final Bundle outState) {
        verifyMethodCalledFromDelegate("onSaveInstanceState(Bundle)");
        ((CallVoid1<Bundle>) mSuperListeners.pop()).call(outState);
    }

    public void onStart() {
        verifyMethodCalledFromDelegate("onStart()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void onStop() {
        verifyMethodCalledFromDelegate("onStop()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void onViewCreated(final View view, @Nullable final Bundle savedInstanceState) {
        verifyMethodCalledFromDelegate("onViewCreated(View, Bundle)");
        ((CallVoid2<View, Bundle>) mSuperListeners.pop()).call(view, savedInstanceState);
    }

    public void onViewStateRestored(@Nullable final Bundle savedInstanceState) {
        verifyMethodCalledFromDelegate("onViewStateRestored(Bundle)");
        ((CallVoid1<Bundle>) mSuperListeners.pop()).call(savedInstanceState);
    }

    public void registerForContextMenu(final View view) {
        verifyMethodCalledFromDelegate("registerForContextMenu(View)");
        ((CallVoid1<View>) mSuperListeners.pop()).call(view);
    }

    public void setAllowEnterTransitionOverlap(final boolean allow) {
        verifyMethodCalledFromDelegate("setAllowEnterTransitionOverlap(Boolean)");
        ((CallVoid1<Boolean>) mSuperListeners.pop()).call(allow);
    }

    public void setAllowReturnTransitionOverlap(final boolean allow) {
        verifyMethodCalledFromDelegate("setAllowReturnTransitionOverlap(Boolean)");
        ((CallVoid1<Boolean>) mSuperListeners.pop()).call(allow);
    }

    public void setArguments(final Bundle args) {
        verifyMethodCalledFromDelegate("setArguments(Bundle)");
        ((CallVoid1<Bundle>) mSuperListeners.pop()).call(args);
    }

    public void setEnterSharedElementCallback(final SharedElementCallback callback) {
        verifyMethodCalledFromDelegate("setEnterSharedElementCallback(SharedElementCallback)");
        ((CallVoid1<SharedElementCallback>) mSuperListeners.pop()).call(callback);
    }

    public void setEnterTransition(final Object transition) {
        verifyMethodCalledFromDelegate("setEnterTransition(Object)");
        ((CallVoid1<Object>) mSuperListeners.pop()).call(transition);
    }

    public void setExitSharedElementCallback(final SharedElementCallback callback) {
        verifyMethodCalledFromDelegate("setExitSharedElementCallback(SharedElementCallback)");
        ((CallVoid1<SharedElementCallback>) mSuperListeners.pop()).call(callback);
    }

    public void setExitTransition(final Object transition) {
        verifyMethodCalledFromDelegate("setExitTransition(Object)");
        ((CallVoid1<Object>) mSuperListeners.pop()).call(transition);
    }

    public void setHasOptionsMenu(final boolean hasMenu) {
        verifyMethodCalledFromDelegate("setHasOptionsMenu(Boolean)");
        ((CallVoid1<Boolean>) mSuperListeners.pop()).call(hasMenu);
    }

    public void setInitialSavedState(final Fragment.SavedState state) {
        verifyMethodCalledFromDelegate("setInitialSavedState(Fragment.SavedState)");
        ((CallVoid1<Fragment.SavedState>) mSuperListeners.pop()).call(state);
    }

    public void setMenuVisibility(final boolean menuVisible) {
        verifyMethodCalledFromDelegate("setMenuVisibility(Boolean)");
        ((CallVoid1<Boolean>) mSuperListeners.pop()).call(menuVisible);
    }

    public void setReenterTransition(final Object transition) {
        verifyMethodCalledFromDelegate("setReenterTransition(Object)");
        ((CallVoid1<Object>) mSuperListeners.pop()).call(transition);
    }

    public void setRetainInstance(final boolean retain) {
        verifyMethodCalledFromDelegate("setRetainInstance(Boolean)");
        ((CallVoid1<Boolean>) mSuperListeners.pop()).call(retain);
    }

    public void setReturnTransition(final Object transition) {
        verifyMethodCalledFromDelegate("setReturnTransition(Object)");
        ((CallVoid1<Object>) mSuperListeners.pop()).call(transition);
    }

    public void setSharedElementEnterTransition(final Object transition) {
        verifyMethodCalledFromDelegate("setSharedElementEnterTransition(Object)");
        ((CallVoid1<Object>) mSuperListeners.pop()).call(transition);
    }

    public void setSharedElementReturnTransition(final Object transition) {
        verifyMethodCalledFromDelegate("setSharedElementReturnTransition(Object)");
        ((CallVoid1<Object>) mSuperListeners.pop()).call(transition);
    }

    public void setTargetFragment(final Fragment fragment, final int requestCode) {
        verifyMethodCalledFromDelegate("setTargetFragment(Fragment, Integer)");
        ((CallVoid2<Fragment, Integer>) mSuperListeners.pop()).call(fragment, requestCode);
    }

    public void setUserVisibleHint(final boolean isVisibleToUser) {
        verifyMethodCalledFromDelegate("setUserVisibleHint(Boolean)");
        ((CallVoid1<Boolean>) mSuperListeners.pop()).call(isVisibleToUser);
    }

    public boolean shouldShowRequestPermissionRationale(@NonNull final String permission) {
        verifyMethodCalledFromDelegate("shouldShowRequestPermissionRationale(String)");
        return ((CallFun1<Boolean, String>) mSuperListeners.pop()).call(permission);
    }

    public void startActivity(final Intent intent) {
        verifyMethodCalledFromDelegate("startActivity(Intent)");
        ((CallVoid1<Intent>) mSuperListeners.pop()).call(intent);
    }

    public void startActivity(final Intent intent, @Nullable final Bundle options) {
        verifyMethodCalledFromDelegate("startActivity(Intent, Bundle)");
        ((CallVoid2<Intent, Bundle>) mSuperListeners.pop()).call(intent, options);
    }

    public void startActivityForResult(final Intent intent, final int requestCode) {
        verifyMethodCalledFromDelegate("startActivityForResult(Intent, Integer)");
        ((CallVoid2<Intent, Integer>) mSuperListeners.pop()).call(intent, requestCode);
    }

    public void startActivityForResult(final Intent intent, final int requestCode,
            @Nullable final Bundle options) {
        verifyMethodCalledFromDelegate("startActivityForResult(Intent, Integer, Bundle)");
        ((CallVoid3<Intent, Integer, Bundle>) mSuperListeners.pop())
                .call(intent, requestCode, options);
    }

    public void startIntentSenderForResult(final IntentSender intent, final int requestCode,
            @Nullable final Intent fillInIntent, final int flagsMask, final int flagsValues,
            final int extraFlags, final Bundle options) throws IntentSender.SendIntentException {
        verifyMethodCalledFromDelegate(
                "startIntentSenderForResult(IntentSender, Integer, Intent, Integer, Integer, Integer, Bundle)");
        ((CallVoid7<IntentSender, Integer, Intent, Integer, Integer, Integer, Bundle>) mSuperListeners
                .pop()).call(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags,
                options);
    }

    public String toString() {
        verifyMethodCalledFromDelegate("toString()");
        return ((CallFun0<String>) mSuperListeners.pop()).call();
    }

    public void unregisterForContextMenu(final View view) {
        verifyMethodCalledFromDelegate("unregisterForContextMenu(View)");
        ((CallVoid1<View>) mSuperListeners.pop()).call(view);
    }

    void dump(final CallVoid4<String, FileDescriptor, PrintWriter, String[]> superCall,
            final String prefix, final FileDescriptor fd, final PrintWriter writer,
            final String[] args) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            dump(prefix, fd, writer, args);
        }
    }

    boolean getAllowEnterTransitionOverlap(final CallFun0<Boolean> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getAllowEnterTransitionOverlap();
        }
    }

    boolean getAllowReturnTransitionOverlap(final CallFun0<Boolean> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getAllowReturnTransitionOverlap();
        }
    }

    Context getContext(final CallFun0<Context> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getContext();
        }
    }

    Object getEnterTransition(final CallFun0<Object> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getEnterTransition();
        }
    }

    Object getExitTransition(final CallFun0<Object> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getExitTransition();
        }
    }

    LayoutInflater getLayoutInflater(final CallFun1<LayoutInflater, Bundle> superCall,
            final Bundle savedInstanceState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getLayoutInflater(savedInstanceState);
        }
    }

    LoaderManager getLoaderManager(final CallFun0<LoaderManager> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getLoaderManager();
        }
    }

    Object getReenterTransition(final CallFun0<Object> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getReenterTransition();
        }
    }

    Object getReturnTransition(final CallFun0<Object> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getReturnTransition();
        }
    }

    Object getSharedElementEnterTransition(final CallFun0<Object> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getSharedElementEnterTransition();
        }
    }

    Object getSharedElementReturnTransition(final CallFun0<Object> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getSharedElementReturnTransition();
        }
    }

    boolean getUserVisibleHint(final CallFun0<Boolean> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getUserVisibleHint();
        }
    }

    View getView(final CallFun0<View> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getView();
        }
    }

    boolean isMethodOverridden(final String methodName, final Class<?>... parameterTypes) {
        try {
            final Class<? extends FragmentPlugin> myClass = this.getClass();
            final Method method = myClass.getMethod(methodName, parameterTypes);
            return method.getDeclaringClass() != FragmentPlugin.class;
        } catch (NoSuchMethodException ignore) {
            return false;
        }
    }

    void onActivityCreated(final CallVoid1<Bundle> superCall,
            @Nullable final Bundle savedInstanceState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onActivityCreated(savedInstanceState);
        }
    }

    void onActivityResult(final CallVoid3<Integer, Integer, Intent> superCall,
            final int requestCode, final int resultCode, final Intent data) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onActivityResult(requestCode, resultCode, data);
        }
    }

    void onAttach(final CallVoid1<Context> superCall, final Context context) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onAttach(context);
        }
    }

    void onAttach(final CallVoid1<Activity> superCall, final Activity activity) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onAttach(activity);
        }
    }

    void onAttachFragment(final CallVoid1<Fragment> superCall, final Fragment childFragment) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onAttachFragment(childFragment);
        }
    }

    void onConfigurationChanged(final CallVoid1<Configuration> superCall,
            final Configuration newConfig) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onConfigurationChanged(newConfig);
        }
    }

    boolean onContextItemSelected(final CallFun1<Boolean, MenuItem> superCall,
            final MenuItem item) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onContextItemSelected(item);
        }
    }

    void onCreate(final CallVoid1<Bundle> superCall, @Nullable final Bundle savedInstanceState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onCreate(savedInstanceState);
        }
    }

    Animation onCreateAnimation(final CallFun3<Animation, Integer, Boolean, Integer> superCall,
            final int transit, final boolean enter, final int nextAnim) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onCreateAnimation(transit, enter, nextAnim);
        }
    }

    void onCreateContextMenu(
            final CallVoid3<ContextMenu, View, ContextMenu.ContextMenuInfo> superCall,
            final ContextMenu menu, final View v, final ContextMenu.ContextMenuInfo menuInfo) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onCreateContextMenu(menu, v, menuInfo);
        }
    }

    void onCreateOptionsMenu(final CallVoid2<Menu, MenuInflater> superCall, final Menu menu,
            final MenuInflater inflater) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onCreateOptionsMenu(menu, inflater);
        }
    }

    View onCreateView(final CallFun3<View, LayoutInflater, ViewGroup, Bundle> superCall,
            final LayoutInflater inflater, @Nullable final ViewGroup container,
            @Nullable final Bundle savedInstanceState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onCreateView(inflater, container, savedInstanceState);
        }
    }

    void onDestroy(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onDestroy();
        }
    }

    void onDestroyOptionsMenu(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onDestroyOptionsMenu();
        }
    }

    void onDestroyView(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onDestroyView();
        }
    }

    void onDetach(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onDetach();
        }
    }

    void onHiddenChanged(final CallVoid1<Boolean> superCall, final boolean hidden) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onHiddenChanged(hidden);
        }
    }

    void onInflate(final CallVoid3<Context, AttributeSet, Bundle> superCall, final Context context,
            final AttributeSet attrs, final Bundle savedInstanceState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onInflate(context, attrs, savedInstanceState);
        }
    }

    void onInflate(final CallVoid3<Activity, AttributeSet, Bundle> superCall,
            final Activity activity, final AttributeSet attrs, final Bundle savedInstanceState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onInflate(activity, attrs, savedInstanceState);
        }
    }

    void onLowMemory(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onLowMemory();
        }
    }

    void onMultiWindowModeChanged(final CallVoid1<Boolean> superCall,
            final boolean isInMultiWindowMode) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onMultiWindowModeChanged(isInMultiWindowMode);
        }
    }

    boolean onOptionsItemSelected(final CallFun1<Boolean, MenuItem> superCall,
            final MenuItem item) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onOptionsItemSelected(item);
        }
    }

    void onOptionsMenuClosed(final CallVoid1<Menu> superCall, final Menu menu) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onOptionsMenuClosed(menu);
        }
    }

    void onPause(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onPause();
        }
    }

    void onPictureInPictureModeChanged(final CallVoid1<Boolean> superCall,
            final boolean isInPictureInPictureMode) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onPictureInPictureModeChanged(isInPictureInPictureMode);
        }
    }

    void onPrepareOptionsMenu(final CallVoid1<Menu> superCall, final Menu menu) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onPrepareOptionsMenu(menu);
        }
    }

    void onRequestPermissionsResult(final CallVoid3<Integer, String[], int[]> superCall,
            final int requestCode, @NonNull final String[] permissions,
            @NonNull final int[] grantResults) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }

    void onResume(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onResume();
        }
    }

    void onSaveInstanceState(final CallVoid1<Bundle> superCall, final Bundle outState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onSaveInstanceState(outState);
        }
    }

    void onStart(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onStart();
        }
    }

    void onStop(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onStop();
        }
    }

    void onViewCreated(final CallVoid2<View, Bundle> superCall, final View view,
            @Nullable final Bundle savedInstanceState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onViewCreated(view, savedInstanceState);
        }
    }

    void onViewStateRestored(final CallVoid1<Bundle> superCall,
            @Nullable final Bundle savedInstanceState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onViewStateRestored(savedInstanceState);
        }
    }

    void registerForContextMenu(final CallVoid1<View> superCall, final View view) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            registerForContextMenu(view);
        }
    }

    void setAllowEnterTransitionOverlap(final CallVoid1<Boolean> superCall, final boolean allow) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setAllowEnterTransitionOverlap(allow);
        }
    }

    void setAllowReturnTransitionOverlap(final CallVoid1<Boolean> superCall, final boolean allow) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setAllowReturnTransitionOverlap(allow);
        }
    }

    void setArguments(final CallVoid1<Bundle> superCall, final Bundle args) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setArguments(args);
        }
    }

    void setEnterSharedElementCallback(final CallVoid1<SharedElementCallback> superCall,
            final SharedElementCallback callback) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setEnterSharedElementCallback(callback);
        }
    }

    void setEnterTransition(final CallVoid1<Object> superCall, final Object transition) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setEnterTransition(transition);
        }
    }

    void setExitSharedElementCallback(final CallVoid1<SharedElementCallback> superCall,
            final SharedElementCallback callback) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setExitSharedElementCallback(callback);
        }
    }

    void setExitTransition(final CallVoid1<Object> superCall, final Object transition) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setExitTransition(transition);
        }
    }

    void setHasOptionsMenu(final CallVoid1<Boolean> superCall, final boolean hasMenu) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setHasOptionsMenu(hasMenu);
        }
    }

    void setInitialSavedState(final CallVoid1<Fragment.SavedState> superCall,
            final Fragment.SavedState state) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setInitialSavedState(state);
        }
    }

    void setMenuVisibility(final CallVoid1<Boolean> superCall, final boolean menuVisible) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setMenuVisibility(menuVisible);
        }
    }

    void setReenterTransition(final CallVoid1<Object> superCall, final Object transition) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setReenterTransition(transition);
        }
    }

    void setRetainInstance(final CallVoid1<Boolean> superCall, final boolean retain) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setRetainInstance(retain);
        }
    }

    void setReturnTransition(final CallVoid1<Object> superCall, final Object transition) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setReturnTransition(transition);
        }
    }

    void setSharedElementEnterTransition(final CallVoid1<Object> superCall,
            final Object transition) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setSharedElementEnterTransition(transition);
        }
    }

    void setSharedElementReturnTransition(final CallVoid1<Object> superCall,
            final Object transition) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setSharedElementReturnTransition(transition);
        }
    }

    void setTargetFragment(final CallVoid2<Fragment, Integer> superCall, final Fragment fragment,
            final int requestCode) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setTargetFragment(fragment, requestCode);
        }
    }

    void setUserVisibleHint(final CallVoid1<Boolean> superCall, final boolean isVisibleToUser) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setUserVisibleHint(isVisibleToUser);
        }
    }

    boolean shouldShowRequestPermissionRationale(final CallFun1<Boolean, String> superCall,
            @NonNull final String permission) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return shouldShowRequestPermissionRationale(permission);
        }
    }

    void startActivity(final CallVoid1<Intent> superCall, final Intent intent) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startActivity(intent);
        }
    }

    void startActivity(final CallVoid2<Intent, Bundle> superCall, final Intent intent,
            @Nullable final Bundle options) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startActivity(intent, options);
        }
    }

    void startActivityForResult(final CallVoid2<Intent, Integer> superCall, final Intent intent,
            final int requestCode) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startActivityForResult(intent, requestCode);
        }
    }

    void startActivityForResult(final CallVoid3<Intent, Integer, Bundle> superCall,
            final Intent intent, final int requestCode, @Nullable final Bundle options) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startActivityForResult(intent, requestCode, options);
        }
    }

    void startIntentSenderForResult(
            final CallVoid7<IntentSender, Integer, Intent, Integer, Integer, Integer, Bundle> superCall,
            final IntentSender intent, final int requestCode, @Nullable final Intent fillInIntent,
            final int flagsMask, final int flagsValues, final int extraFlags, final Bundle options)
            throws IntentSender.SendIntentException {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues,
                    extraFlags, options);
        }
    }

    String toString(final CallFun0<String> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return toString();
        }
    }

    void unregisterForContextMenu(final CallVoid1<View> superCall, final View view) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            unregisterForContextMenu(view);
        }
    }


}