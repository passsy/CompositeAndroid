
package com.pascalwelsch.compositeandroid.dialogfragment;

import com.pascalwelsch.compositeandroid.core.NamedSuperCall;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
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
public class DialogFragmentPlugin extends DialogFragmentPluginBase {
    
    public void dismiss()  {
        verifyMethodCalledFromDelegate("dismiss()");
        mSuperListeners.pop().call();
    }

    void dismiss(final NamedSuperCall<Void> superCall )  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            dismiss();
        }
    }
    
    public void dismissAllowingStateLoss()  {
        verifyMethodCalledFromDelegate("dismissAllowingStateLoss()");
        mSuperListeners.pop().call();
    }

    void dismissAllowingStateLoss(final NamedSuperCall<Void> superCall )  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            dismissAllowingStateLoss();
        }
    }
    
    public void dump(final String prefix, final FileDescriptor fd, final PrintWriter writer,             final String[] args)  {
        verifyMethodCalledFromDelegate("dump(String, FileDescriptor, PrintWriter, String[])");
        mSuperListeners.pop().call(prefix, fd, writer, args);
    }

    void dump(final NamedSuperCall<Void> superCall , final String prefix, final FileDescriptor fd, final PrintWriter writer,             final String[] args)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            dump(prefix, fd, writer, args);
        }
    }
    
    public boolean getAllowEnterTransitionOverlap()  {
        verifyMethodCalledFromDelegate("getAllowEnterTransitionOverlap()");
        return (Boolean) mSuperListeners.pop().call();
    }

    boolean getAllowEnterTransitionOverlap(final NamedSuperCall<Boolean> superCall )  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getAllowEnterTransitionOverlap();
        }
    }
    
    public boolean getAllowReturnTransitionOverlap()  {
        verifyMethodCalledFromDelegate("getAllowReturnTransitionOverlap()");
        return (Boolean) mSuperListeners.pop().call();
    }

    boolean getAllowReturnTransitionOverlap(final NamedSuperCall<Boolean> superCall )  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getAllowReturnTransitionOverlap();
        }
    }
    
    public Context getContext()  {
        verifyMethodCalledFromDelegate("getContext()");
        return (Context) mSuperListeners.pop().call();
    }

    Context getContext(final NamedSuperCall<Context> superCall )  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getContext();
        }
    }
    
    public Dialog getDialog()  {
        verifyMethodCalledFromDelegate("getDialog()");
        return (Dialog) mSuperListeners.pop().call();
    }

    Dialog getDialog(final NamedSuperCall<Dialog> superCall )  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getDialog();
        }
    }
    
    public Object getEnterTransition()  {
        verifyMethodCalledFromDelegate("getEnterTransition()");
        return (Object) mSuperListeners.pop().call();
    }

    Object getEnterTransition(final NamedSuperCall<Object> superCall )  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getEnterTransition();
        }
    }
    
    public Object getExitTransition()  {
        verifyMethodCalledFromDelegate("getExitTransition()");
        return (Object) mSuperListeners.pop().call();
    }

    Object getExitTransition(final NamedSuperCall<Object> superCall )  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getExitTransition();
        }
    }
    
    public LayoutInflater getLayoutInflater(final Bundle savedInstanceState)  {
        verifyMethodCalledFromDelegate("getLayoutInflater(Bundle)");
        return (LayoutInflater) mSuperListeners.pop().call(savedInstanceState);
    }

    LayoutInflater getLayoutInflater(final NamedSuperCall<LayoutInflater> superCall , final Bundle savedInstanceState)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getLayoutInflater(savedInstanceState);
        }
    }
    
    public LoaderManager getLoaderManager()  {
        verifyMethodCalledFromDelegate("getLoaderManager()");
        return (LoaderManager) mSuperListeners.pop().call();
    }

    LoaderManager getLoaderManager(final NamedSuperCall<LoaderManager> superCall )  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getLoaderManager();
        }
    }
    
    public Object getReenterTransition()  {
        verifyMethodCalledFromDelegate("getReenterTransition()");
        return (Object) mSuperListeners.pop().call();
    }

    Object getReenterTransition(final NamedSuperCall<Object> superCall )  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getReenterTransition();
        }
    }
    
    public Object getReturnTransition()  {
        verifyMethodCalledFromDelegate("getReturnTransition()");
        return (Object) mSuperListeners.pop().call();
    }

    Object getReturnTransition(final NamedSuperCall<Object> superCall )  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getReturnTransition();
        }
    }
    
    public Object getSharedElementEnterTransition()  {
        verifyMethodCalledFromDelegate("getSharedElementEnterTransition()");
        return (Object) mSuperListeners.pop().call();
    }

    Object getSharedElementEnterTransition(final NamedSuperCall<Object> superCall )  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getSharedElementEnterTransition();
        }
    }
    
    public Object getSharedElementReturnTransition()  {
        verifyMethodCalledFromDelegate("getSharedElementReturnTransition()");
        return (Object) mSuperListeners.pop().call();
    }

    Object getSharedElementReturnTransition(final NamedSuperCall<Object> superCall )  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getSharedElementReturnTransition();
        }
    }
    
    public boolean getShowsDialog()  {
        verifyMethodCalledFromDelegate("getShowsDialog()");
        return (Boolean) mSuperListeners.pop().call();
    }

    boolean getShowsDialog(final NamedSuperCall<Boolean> superCall )  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getShowsDialog();
        }
    }
    
    public int getTheme()  {
        verifyMethodCalledFromDelegate("getTheme()");
        return (Integer) mSuperListeners.pop().call();
    }

    int getTheme(final NamedSuperCall<Integer> superCall )  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getTheme();
        }
    }
    
    public boolean getUserVisibleHint()  {
        verifyMethodCalledFromDelegate("getUserVisibleHint()");
        return (Boolean) mSuperListeners.pop().call();
    }

    boolean getUserVisibleHint(final NamedSuperCall<Boolean> superCall )  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getUserVisibleHint();
        }
    }
    
    public View getView()  {
        verifyMethodCalledFromDelegate("getView()");
        return (View) mSuperListeners.pop().call();
    }

    View getView(final NamedSuperCall<View> superCall )  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getView();
        }
    }
    
    public boolean isCancelable()  {
        verifyMethodCalledFromDelegate("isCancelable()");
        return (Boolean) mSuperListeners.pop().call();
    }

    boolean isCancelable(final NamedSuperCall<Boolean> superCall )  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return isCancelable();
        }
    }
    
    public void onActivityCreated(final Bundle savedInstanceState)  {
        verifyMethodCalledFromDelegate("onActivityCreated(Bundle)");
        mSuperListeners.pop().call(savedInstanceState);
    }

    void onActivityCreated(final NamedSuperCall<Void> superCall , final Bundle savedInstanceState)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onActivityCreated(savedInstanceState);
        }
    }
    
    public void onActivityResult(final int requestCode, final int resultCode, final Intent data)  {
        verifyMethodCalledFromDelegate("onActivityResult(int, int, Intent)");
        mSuperListeners.pop().call(requestCode, resultCode, data);
    }

    void onActivityResult(final NamedSuperCall<Void> superCall , final int requestCode, final int resultCode, final Intent data)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onActivityResult(requestCode, resultCode, data);
        }
    }
    
    public void onAttach(final Activity activity)  {
        verifyMethodCalledFromDelegate("onAttach(Activity)");
        mSuperListeners.pop().call(activity);
    }

    void onAttach(final NamedSuperCall<Void> superCall , final Activity activity)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onAttach(activity);
        }
    }
    
    public void onAttach(final Context context)  {
        verifyMethodCalledFromDelegate("onAttach(Context)");
        mSuperListeners.pop().call(context);
    }

    void onAttach(final NamedSuperCall<Void> superCall , final Context context)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onAttach(context);
        }
    }
    
    public void onCancel(final DialogInterface dialog)  {
        verifyMethodCalledFromDelegate("onCancel(DialogInterface)");
        mSuperListeners.pop().call(dialog);
    }

    void onCancel(final NamedSuperCall<Void> superCall , final DialogInterface dialog)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onCancel(dialog);
        }
    }
    
    public void onConfigurationChanged(final Configuration newConfig)  {
        verifyMethodCalledFromDelegate("onConfigurationChanged(Configuration)");
        mSuperListeners.pop().call(newConfig);
    }

    void onConfigurationChanged(final NamedSuperCall<Void> superCall , final Configuration newConfig)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onConfigurationChanged(newConfig);
        }
    }
    
    public boolean onContextItemSelected(final MenuItem item)  {
        verifyMethodCalledFromDelegate("onContextItemSelected(MenuItem)");
        return (Boolean) mSuperListeners.pop().call(item);
    }

    boolean onContextItemSelected(final NamedSuperCall<Boolean> superCall , final MenuItem item)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onContextItemSelected(item);
        }
    }
    
    public void onCreate(@Nullable final Bundle savedInstanceState)  {
        verifyMethodCalledFromDelegate("onCreate(Bundle)");
        mSuperListeners.pop().call(savedInstanceState);
    }

    void onCreate(final NamedSuperCall<Void> superCall , @Nullable final Bundle savedInstanceState)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onCreate(savedInstanceState);
        }
    }
    
    public Animation onCreateAnimation(final int transit, final boolean enter, final int nextAnim)  {
        verifyMethodCalledFromDelegate("onCreateAnimation(int, boolean, int)");
        return (Animation) mSuperListeners.pop().call(transit, enter, nextAnim);
    }

    Animation onCreateAnimation(final NamedSuperCall<Animation> superCall , final int transit, final boolean enter, final int nextAnim)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onCreateAnimation(transit, enter, nextAnim);
        }
    }
    
    public void onCreateContextMenu(final ContextMenu menu, final View v,             final ContextMenu.ContextMenuInfo menuInfo)  {
        verifyMethodCalledFromDelegate("onCreateContextMenu(ContextMenu, View, ContextMenu.ContextMenuInfo)");
        mSuperListeners.pop().call(menu, v, menuInfo);
    }

    void onCreateContextMenu(final NamedSuperCall<Void> superCall , final ContextMenu menu, final View v,             final ContextMenu.ContextMenuInfo menuInfo)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onCreateContextMenu(menu, v, menuInfo);
        }
    }
    
    public Dialog onCreateDialog(final Bundle savedInstanceState)  {
        verifyMethodCalledFromDelegate("onCreateDialog(Bundle)");
        return (Dialog) mSuperListeners.pop().call(savedInstanceState);
    }

    Dialog onCreateDialog(final NamedSuperCall<Dialog> superCall , final Bundle savedInstanceState)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onCreateDialog(savedInstanceState);
        }
    }
    
    public void onCreateOptionsMenu(final Menu menu, final MenuInflater inflater)  {
        verifyMethodCalledFromDelegate("onCreateOptionsMenu(Menu, MenuInflater)");
        mSuperListeners.pop().call(menu, inflater);
    }

    void onCreateOptionsMenu(final NamedSuperCall<Void> superCall , final Menu menu, final MenuInflater inflater)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onCreateOptionsMenu(menu, inflater);
        }
    }
    
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container,             @Nullable final Bundle savedInstanceState)  {
        verifyMethodCalledFromDelegate("onCreateView(LayoutInflater, ViewGroup, Bundle)");
        return (View) mSuperListeners.pop().call(inflater, container, savedInstanceState);
    }

    View onCreateView(final NamedSuperCall<View> superCall , final LayoutInflater inflater, @Nullable final ViewGroup container,             @Nullable final Bundle savedInstanceState)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onCreateView(inflater, container, savedInstanceState);
        }
    }
    
    public void onDestroy()  {
        verifyMethodCalledFromDelegate("onDestroy()");
        mSuperListeners.pop().call();
    }

    void onDestroy(final NamedSuperCall<Void> superCall )  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onDestroy();
        }
    }
    
    public void onDestroyOptionsMenu()  {
        verifyMethodCalledFromDelegate("onDestroyOptionsMenu()");
        mSuperListeners.pop().call();
    }

    void onDestroyOptionsMenu(final NamedSuperCall<Void> superCall )  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onDestroyOptionsMenu();
        }
    }
    
    public void onDestroyView()  {
        verifyMethodCalledFromDelegate("onDestroyView()");
        mSuperListeners.pop().call();
    }

    void onDestroyView(final NamedSuperCall<Void> superCall )  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onDestroyView();
        }
    }
    
    public void onDetach()  {
        verifyMethodCalledFromDelegate("onDetach()");
        mSuperListeners.pop().call();
    }

    void onDetach(final NamedSuperCall<Void> superCall )  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onDetach();
        }
    }
    
    public void onDismiss(final DialogInterface dialog)  {
        verifyMethodCalledFromDelegate("onDismiss(DialogInterface)");
        mSuperListeners.pop().call(dialog);
    }

    void onDismiss(final NamedSuperCall<Void> superCall , final DialogInterface dialog)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onDismiss(dialog);
        }
    }
    
    public void onHiddenChanged(final boolean hidden)  {
        verifyMethodCalledFromDelegate("onHiddenChanged(boolean)");
        mSuperListeners.pop().call(hidden);
    }

    void onHiddenChanged(final NamedSuperCall<Void> superCall , final boolean hidden)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onHiddenChanged(hidden);
        }
    }
    
    public void onInflate(final Context context, final AttributeSet attrs,             final Bundle savedInstanceState)  {
        verifyMethodCalledFromDelegate("onInflate(Context, AttributeSet, Bundle)");
        mSuperListeners.pop().call(context, attrs, savedInstanceState);
    }

    void onInflate(final NamedSuperCall<Void> superCall , final Context context, final AttributeSet attrs,             final Bundle savedInstanceState)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onInflate(context, attrs, savedInstanceState);
        }
    }
    
    public void onInflate(final Activity activity, final AttributeSet attrs,             final Bundle savedInstanceState)  {
        verifyMethodCalledFromDelegate("onInflate(Activity, AttributeSet, Bundle)");
        mSuperListeners.pop().call(activity, attrs, savedInstanceState);
    }

    void onInflate(final NamedSuperCall<Void> superCall , final Activity activity, final AttributeSet attrs,             final Bundle savedInstanceState)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onInflate(activity, attrs, savedInstanceState);
        }
    }
    
    public void onLowMemory()  {
        verifyMethodCalledFromDelegate("onLowMemory()");
        mSuperListeners.pop().call();
    }

    void onLowMemory(final NamedSuperCall<Void> superCall )  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onLowMemory();
        }
    }
    
    public boolean onOptionsItemSelected(final MenuItem item)  {
        verifyMethodCalledFromDelegate("onOptionsItemSelected(MenuItem)");
        return (Boolean) mSuperListeners.pop().call(item);
    }

    boolean onOptionsItemSelected(final NamedSuperCall<Boolean> superCall , final MenuItem item)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onOptionsItemSelected(item);
        }
    }
    
    public void onOptionsMenuClosed(final Menu menu)  {
        verifyMethodCalledFromDelegate("onOptionsMenuClosed(Menu)");
        mSuperListeners.pop().call(menu);
    }

    void onOptionsMenuClosed(final NamedSuperCall<Void> superCall , final Menu menu)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onOptionsMenuClosed(menu);
        }
    }
    
    public void onPause()  {
        verifyMethodCalledFromDelegate("onPause()");
        mSuperListeners.pop().call();
    }

    void onPause(final NamedSuperCall<Void> superCall )  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onPause();
        }
    }
    
    public void onPrepareOptionsMenu(final Menu menu)  {
        verifyMethodCalledFromDelegate("onPrepareOptionsMenu(Menu)");
        mSuperListeners.pop().call(menu);
    }

    void onPrepareOptionsMenu(final NamedSuperCall<Void> superCall , final Menu menu)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onPrepareOptionsMenu(menu);
        }
    }
    
    public void onRequestPermissionsResult(final int requestCode,             @NonNull final String[] permissions,             @NonNull final int[] grantResults)  {
        verifyMethodCalledFromDelegate("onRequestPermissionsResult(int, String[], int[])");
        mSuperListeners.pop().call(requestCode, permissions, grantResults);
    }

    void onRequestPermissionsResult(final NamedSuperCall<Void> superCall , final int requestCode,             @NonNull final String[] permissions,             @NonNull final int[] grantResults)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }
    
    public void onResume()  {
        verifyMethodCalledFromDelegate("onResume()");
        mSuperListeners.pop().call();
    }

    void onResume(final NamedSuperCall<Void> superCall )  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onResume();
        }
    }
    
    public void onSaveInstanceState(final Bundle outState)  {
        verifyMethodCalledFromDelegate("onSaveInstanceState(Bundle)");
        mSuperListeners.pop().call(outState);
    }

    void onSaveInstanceState(final NamedSuperCall<Void> superCall , final Bundle outState)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onSaveInstanceState(outState);
        }
    }
    
    public void onStart()  {
        verifyMethodCalledFromDelegate("onStart()");
        mSuperListeners.pop().call();
    }

    void onStart(final NamedSuperCall<Void> superCall )  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onStart();
        }
    }
    
    public void onStop()  {
        verifyMethodCalledFromDelegate("onStop()");
        mSuperListeners.pop().call();
    }

    void onStop(final NamedSuperCall<Void> superCall )  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onStop();
        }
    }
    
    public void onViewCreated(final View view, @Nullable final Bundle savedInstanceState)  {
        verifyMethodCalledFromDelegate("onViewCreated(View, Bundle)");
        mSuperListeners.pop().call(view, savedInstanceState);
    }

    void onViewCreated(final NamedSuperCall<Void> superCall , final View view, @Nullable final Bundle savedInstanceState)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onViewCreated(view, savedInstanceState);
        }
    }
    
    public void onViewStateRestored(@Nullable final Bundle savedInstanceState)  {
        verifyMethodCalledFromDelegate("onViewStateRestored(Bundle)");
        mSuperListeners.pop().call(savedInstanceState);
    }

    void onViewStateRestored(final NamedSuperCall<Void> superCall , @Nullable final Bundle savedInstanceState)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onViewStateRestored(savedInstanceState);
        }
    }
    
    public void registerForContextMenu(final View view)  {
        verifyMethodCalledFromDelegate("registerForContextMenu(View)");
        mSuperListeners.pop().call(view);
    }

    void registerForContextMenu(final NamedSuperCall<Void> superCall , final View view)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            registerForContextMenu(view);
        }
    }
    
    public void setAllowEnterTransitionOverlap(final boolean allow)  {
        verifyMethodCalledFromDelegate("setAllowEnterTransitionOverlap(boolean)");
        mSuperListeners.pop().call(allow);
    }

    void setAllowEnterTransitionOverlap(final NamedSuperCall<Void> superCall , final boolean allow)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setAllowEnterTransitionOverlap(allow);
        }
    }
    
    public void setAllowReturnTransitionOverlap(final boolean allow)  {
        verifyMethodCalledFromDelegate("setAllowReturnTransitionOverlap(boolean)");
        mSuperListeners.pop().call(allow);
    }

    void setAllowReturnTransitionOverlap(final NamedSuperCall<Void> superCall , final boolean allow)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setAllowReturnTransitionOverlap(allow);
        }
    }
    
    public void setArguments(final Bundle args)  {
        verifyMethodCalledFromDelegate("setArguments(Bundle)");
        mSuperListeners.pop().call(args);
    }

    void setArguments(final NamedSuperCall<Void> superCall , final Bundle args)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setArguments(args);
        }
    }
    
    public void setCancelable(final boolean cancelable)  {
        verifyMethodCalledFromDelegate("setCancelable(boolean)");
        mSuperListeners.pop().call(cancelable);
    }

    void setCancelable(final NamedSuperCall<Void> superCall , final boolean cancelable)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setCancelable(cancelable);
        }
    }
    
    public void setEnterSharedElementCallback(final SharedElementCallback callback)  {
        verifyMethodCalledFromDelegate("setEnterSharedElementCallback(SharedElementCallback)");
        mSuperListeners.pop().call(callback);
    }

    void setEnterSharedElementCallback(final NamedSuperCall<Void> superCall , final SharedElementCallback callback)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setEnterSharedElementCallback(callback);
        }
    }
    
    public void setEnterTransition(final Object transition)  {
        verifyMethodCalledFromDelegate("setEnterTransition(Object)");
        mSuperListeners.pop().call(transition);
    }

    void setEnterTransition(final NamedSuperCall<Void> superCall , final Object transition)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setEnterTransition(transition);
        }
    }
    
    public void setExitSharedElementCallback(final SharedElementCallback callback)  {
        verifyMethodCalledFromDelegate("setExitSharedElementCallback(SharedElementCallback)");
        mSuperListeners.pop().call(callback);
    }

    void setExitSharedElementCallback(final NamedSuperCall<Void> superCall , final SharedElementCallback callback)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setExitSharedElementCallback(callback);
        }
    }
    
    public void setExitTransition(final Object transition)  {
        verifyMethodCalledFromDelegate("setExitTransition(Object)");
        mSuperListeners.pop().call(transition);
    }

    void setExitTransition(final NamedSuperCall<Void> superCall , final Object transition)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setExitTransition(transition);
        }
    }
    
    public void setHasOptionsMenu(final boolean hasMenu)  {
        verifyMethodCalledFromDelegate("setHasOptionsMenu(boolean)");
        mSuperListeners.pop().call(hasMenu);
    }

    void setHasOptionsMenu(final NamedSuperCall<Void> superCall , final boolean hasMenu)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setHasOptionsMenu(hasMenu);
        }
    }
    
    public void setInitialSavedState(final Fragment.SavedState state)  {
        verifyMethodCalledFromDelegate("setInitialSavedState(Fragment.SavedState)");
        mSuperListeners.pop().call(state);
    }

    void setInitialSavedState(final NamedSuperCall<Void> superCall , final Fragment.SavedState state)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setInitialSavedState(state);
        }
    }
    
    public void setMenuVisibility(final boolean menuVisible)  {
        verifyMethodCalledFromDelegate("setMenuVisibility(boolean)");
        mSuperListeners.pop().call(menuVisible);
    }

    void setMenuVisibility(final NamedSuperCall<Void> superCall , final boolean menuVisible)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setMenuVisibility(menuVisible);
        }
    }
    
    public void setReenterTransition(final Object transition)  {
        verifyMethodCalledFromDelegate("setReenterTransition(Object)");
        mSuperListeners.pop().call(transition);
    }

    void setReenterTransition(final NamedSuperCall<Void> superCall , final Object transition)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setReenterTransition(transition);
        }
    }
    
    public void setRetainInstance(final boolean retain)  {
        verifyMethodCalledFromDelegate("setRetainInstance(boolean)");
        mSuperListeners.pop().call(retain);
    }

    void setRetainInstance(final NamedSuperCall<Void> superCall , final boolean retain)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setRetainInstance(retain);
        }
    }
    
    public void setReturnTransition(final Object transition)  {
        verifyMethodCalledFromDelegate("setReturnTransition(Object)");
        mSuperListeners.pop().call(transition);
    }

    void setReturnTransition(final NamedSuperCall<Void> superCall , final Object transition)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setReturnTransition(transition);
        }
    }
    
    public void setSharedElementEnterTransition(final Object transition)  {
        verifyMethodCalledFromDelegate("setSharedElementEnterTransition(Object)");
        mSuperListeners.pop().call(transition);
    }

    void setSharedElementEnterTransition(final NamedSuperCall<Void> superCall , final Object transition)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setSharedElementEnterTransition(transition);
        }
    }
    
    public void setSharedElementReturnTransition(final Object transition)  {
        verifyMethodCalledFromDelegate("setSharedElementReturnTransition(Object)");
        mSuperListeners.pop().call(transition);
    }

    void setSharedElementReturnTransition(final NamedSuperCall<Void> superCall , final Object transition)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setSharedElementReturnTransition(transition);
        }
    }
    
    public void setShowsDialog(final boolean showsDialog)  {
        verifyMethodCalledFromDelegate("setShowsDialog(boolean)");
        mSuperListeners.pop().call(showsDialog);
    }

    void setShowsDialog(final NamedSuperCall<Void> superCall , final boolean showsDialog)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setShowsDialog(showsDialog);
        }
    }
    
    public void setStyle(final int style, @StyleRes final int theme)  {
        verifyMethodCalledFromDelegate("setStyle(int, int)");
        mSuperListeners.pop().call(style, theme);
    }

    void setStyle(final NamedSuperCall<Void> superCall , final int style, @StyleRes final int theme)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setStyle(style, theme);
        }
    }
    
    public void setTargetFragment(final Fragment fragment, final int requestCode)  {
        verifyMethodCalledFromDelegate("setTargetFragment(Fragment, int)");
        mSuperListeners.pop().call(fragment, requestCode);
    }

    void setTargetFragment(final NamedSuperCall<Void> superCall , final Fragment fragment, final int requestCode)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setTargetFragment(fragment, requestCode);
        }
    }
    
    public void setUserVisibleHint(final boolean isVisibleToUser)  {
        verifyMethodCalledFromDelegate("setUserVisibleHint(boolean)");
        mSuperListeners.pop().call(isVisibleToUser);
    }

    void setUserVisibleHint(final NamedSuperCall<Void> superCall , final boolean isVisibleToUser)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setUserVisibleHint(isVisibleToUser);
        }
    }
    
    public void setupDialog(final Dialog dialog, final int style)  {
        verifyMethodCalledFromDelegate("setupDialog(Dialog, int)");
        mSuperListeners.pop().call(dialog, style);
    }

    void setupDialog(final NamedSuperCall<Void> superCall , final Dialog dialog, final int style)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setupDialog(dialog, style);
        }
    }
    
    public boolean shouldShowRequestPermissionRationale(@NonNull final String permission)  {
        verifyMethodCalledFromDelegate("shouldShowRequestPermissionRationale(String)");
        return (Boolean) mSuperListeners.pop().call(permission);
    }

    boolean shouldShowRequestPermissionRationale(final NamedSuperCall<Boolean> superCall , @NonNull final String permission)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return shouldShowRequestPermissionRationale(permission);
        }
    }
    
    public void show(final FragmentManager manager, final String tag)  {
        verifyMethodCalledFromDelegate("show(FragmentManager, String)");
        mSuperListeners.pop().call(manager, tag);
    }

    void show(final NamedSuperCall<Void> superCall , final FragmentManager manager, final String tag)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            show(manager, tag);
        }
    }
    
    public int show(final FragmentTransaction transaction, final String tag)  {
        verifyMethodCalledFromDelegate("show(FragmentTransaction, String)");
        return (Integer) mSuperListeners.pop().call(transaction, tag);
    }

    int show(final NamedSuperCall<Integer> superCall , final FragmentTransaction transaction, final String tag)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return show(transaction, tag);
        }
    }
    
    public void startActivity(final Intent intent)  {
        verifyMethodCalledFromDelegate("startActivity(Intent)");
        mSuperListeners.pop().call(intent);
    }

    void startActivity(final NamedSuperCall<Void> superCall , final Intent intent)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startActivity(intent);
        }
    }
    
    public void startActivity(final Intent intent, @Nullable final Bundle options)  {
        verifyMethodCalledFromDelegate("startActivity(Intent, Bundle)");
        mSuperListeners.pop().call(intent, options);
    }

    void startActivity(final NamedSuperCall<Void> superCall , final Intent intent, @Nullable final Bundle options)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startActivity(intent, options);
        }
    }
    
    public void startActivityForResult(final Intent intent, final int requestCode)  {
        verifyMethodCalledFromDelegate("startActivityForResult(Intent, int)");
        mSuperListeners.pop().call(intent, requestCode);
    }

    void startActivityForResult(final NamedSuperCall<Void> superCall , final Intent intent, final int requestCode)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startActivityForResult(intent, requestCode);
        }
    }
    
    public void startActivityForResult(final Intent intent, final int requestCode,             @Nullable final Bundle options)  {
        verifyMethodCalledFromDelegate("startActivityForResult(Intent, int, Bundle)");
        mSuperListeners.pop().call(intent, requestCode, options);
    }

    void startActivityForResult(final NamedSuperCall<Void> superCall , final Intent intent, final int requestCode,             @Nullable final Bundle options)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startActivityForResult(intent, requestCode, options);
        }
    }
    
    public String toString()  {
        verifyMethodCalledFromDelegate("toString()");
        return (String) mSuperListeners.pop().call();
    }

    String toString(final NamedSuperCall<String> superCall )  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return toString();
        }
    }
    
    public void unregisterForContextMenu(final View view)  {
        verifyMethodCalledFromDelegate("unregisterForContextMenu(View)");
        mSuperListeners.pop().call(view);
    }

    void unregisterForContextMenu(final NamedSuperCall<Void> superCall , final View view)  {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            unregisterForContextMenu(view);
        }
    }
    
}
    