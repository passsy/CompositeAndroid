package com.pascalwelsch.compositeandroid.fragment;

import com.pascalwelsch.compositeandroid.core.AbstractDelegate;
import com.pascalwelsch.compositeandroid.core.CallFun0;
import com.pascalwelsch.compositeandroid.core.CallFun1;
import com.pascalwelsch.compositeandroid.core.CallFun3;
import com.pascalwelsch.compositeandroid.core.CallVoid0;
import com.pascalwelsch.compositeandroid.core.CallVoid1;
import com.pascalwelsch.compositeandroid.core.CallVoid2;
import com.pascalwelsch.compositeandroid.core.CallVoid3;
import com.pascalwelsch.compositeandroid.core.CallVoid4;
import com.pascalwelsch.compositeandroid.core.CallVoid7;
import com.pascalwelsch.compositeandroid.core.SuppressedException;

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
import java.util.ListIterator;

public class FragmentDelegate extends AbstractDelegate<ICompositeFragment, FragmentPlugin> {


    public FragmentDelegate(final ICompositeFragment icompositefragment) {
        super(icompositefragment);

    }


    public void dump(final String prefix, final FileDescriptor fd, final PrintWriter writer,
            final String[] args) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_dump(prefix, fd, writer, args);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid4<String, FileDescriptor, PrintWriter, String[]> superCall
                = new CallVoid4<String, FileDescriptor, PrintWriter, String[]>(
                "dump(String, FileDescriptor, PrintWriter, String[])") {

            @Override
            public void call(final String prefix, final FileDescriptor fd, final PrintWriter writer,
                    final String[] args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().dump(this, prefix, fd, writer, args);
                } else {
                    getOriginal().super_dump(prefix, fd, writer, args);
                }
            }
        };
        superCall.call(prefix, fd, writer, args);
    }

    public boolean getAllowEnterTransitionOverlap() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getAllowEnterTransitionOverlap();
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallFun0<Boolean> superCall = new CallFun0<Boolean>(
                "getAllowEnterTransitionOverlap()") {

            @Override
            public Boolean call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getAllowEnterTransitionOverlap(this);
                } else {
                    return getOriginal().super_getAllowEnterTransitionOverlap();
                }
            }
        };
        return superCall.call();
    }

    public boolean getAllowReturnTransitionOverlap() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getAllowReturnTransitionOverlap();
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallFun0<Boolean> superCall = new CallFun0<Boolean>(
                "getAllowReturnTransitionOverlap()") {

            @Override
            public Boolean call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getAllowReturnTransitionOverlap(this);
                } else {
                    return getOriginal().super_getAllowReturnTransitionOverlap();
                }
            }
        };
        return superCall.call();
    }

    public Context getContext() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getContext();
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallFun0<Context> superCall = new CallFun0<Context>("getContext()") {

            @Override
            public Context call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getContext(this);
                } else {
                    return getOriginal().super_getContext();
                }
            }
        };
        return superCall.call();
    }

    public Object getEnterTransition() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getEnterTransition();
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallFun0<Object> superCall = new CallFun0<Object>("getEnterTransition()") {

            @Override
            public Object call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getEnterTransition(this);
                } else {
                    return getOriginal().super_getEnterTransition();
                }
            }
        };
        return superCall.call();
    }

    public Object getExitTransition() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getExitTransition();
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallFun0<Object> superCall = new CallFun0<Object>("getExitTransition()") {

            @Override
            public Object call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getExitTransition(this);
                } else {
                    return getOriginal().super_getExitTransition();
                }
            }
        };
        return superCall.call();
    }

    public LayoutInflater getLayoutInflater(final Bundle savedInstanceState) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getLayoutInflater(savedInstanceState);
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallFun1<LayoutInflater, Bundle> superCall = new CallFun1<LayoutInflater, Bundle>(
                "getLayoutInflater(Bundle)") {

            @Override
            public LayoutInflater call(final Bundle savedInstanceState) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getLayoutInflater(this, savedInstanceState);
                } else {
                    return getOriginal().super_getLayoutInflater(savedInstanceState);
                }
            }
        };
        return superCall.call(savedInstanceState);
    }

    public LoaderManager getLoaderManager() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getLoaderManager();
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallFun0<LoaderManager> superCall = new CallFun0<LoaderManager>(
                "getLoaderManager()") {

            @Override
            public LoaderManager call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getLoaderManager(this);
                } else {
                    return getOriginal().super_getLoaderManager();
                }
            }
        };
        return superCall.call();
    }

    public Object getReenterTransition() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getReenterTransition();
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallFun0<Object> superCall = new CallFun0<Object>("getReenterTransition()") {

            @Override
            public Object call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getReenterTransition(this);
                } else {
                    return getOriginal().super_getReenterTransition();
                }
            }
        };
        return superCall.call();
    }

    public Object getReturnTransition() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getReturnTransition();
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallFun0<Object> superCall = new CallFun0<Object>("getReturnTransition()") {

            @Override
            public Object call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getReturnTransition(this);
                } else {
                    return getOriginal().super_getReturnTransition();
                }
            }
        };
        return superCall.call();
    }

    public Object getSharedElementEnterTransition() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getSharedElementEnterTransition();
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallFun0<Object> superCall = new CallFun0<Object>(
                "getSharedElementEnterTransition()") {

            @Override
            public Object call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getSharedElementEnterTransition(this);
                } else {
                    return getOriginal().super_getSharedElementEnterTransition();
                }
            }
        };
        return superCall.call();
    }

    public Object getSharedElementReturnTransition() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getSharedElementReturnTransition();
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallFun0<Object> superCall = new CallFun0<Object>(
                "getSharedElementReturnTransition()") {

            @Override
            public Object call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getSharedElementReturnTransition(this);
                } else {
                    return getOriginal().super_getSharedElementReturnTransition();
                }
            }
        };
        return superCall.call();
    }

    public boolean getUserVisibleHint() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getUserVisibleHint();
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallFun0<Boolean> superCall = new CallFun0<Boolean>("getUserVisibleHint()") {

            @Override
            public Boolean call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getUserVisibleHint(this);
                } else {
                    return getOriginal().super_getUserVisibleHint();
                }
            }
        };
        return superCall.call();
    }

    public View getView() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getView();
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallFun0<View> superCall = new CallFun0<View>("getView()") {

            @Override
            public View call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getView(this);
                } else {
                    return getOriginal().super_getView();
                }
            }
        };
        return superCall.call();
    }

    public void onActivityCreated(@Nullable final Bundle savedInstanceState) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onActivityCreated(savedInstanceState);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid1<Bundle> superCall = new CallVoid1<Bundle>("onActivityCreated(Bundle)") {

            @Override
            public void call(final Bundle savedInstanceState) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onActivityCreated(this, savedInstanceState);
                } else {
                    getOriginal().super_onActivityCreated(savedInstanceState);
                }
            }
        };
        superCall.call(savedInstanceState);
    }

    public void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onActivityResult(requestCode, resultCode, data);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid3<Integer, Integer, Intent> superCall
                = new CallVoid3<Integer, Integer, Intent>(
                "onActivityResult(Integer, Integer, Intent)") {

            @Override
            public void call(final Integer requestCode, final Integer resultCode,
                    final Intent data) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onActivityResult(this, requestCode, resultCode, data);
                } else {
                    getOriginal().super_onActivityResult(requestCode, resultCode, data);
                }
            }
        };
        superCall.call(requestCode, resultCode, data);
    }

    public void onAttach(final Context context) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onAttach(context);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid1<Context> superCall = new CallVoid1<Context>("onAttach(Context)") {

            @Override
            public void call(final Context context) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onAttach(this, context);
                } else {
                    getOriginal().super_onAttach(context);
                }
            }
        };
        superCall.call(context);
    }

    public void onAttach(final Activity activity) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onAttach(activity);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid1<Activity> superCall = new CallVoid1<Activity>("onAttach(Activity)") {

            @Override
            public void call(final Activity activity) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onAttach(this, activity);
                } else {
                    getOriginal().super_onAttach(activity);
                }
            }
        };
        superCall.call(activity);
    }

    public void onAttachFragment(final Fragment childFragment) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onAttachFragment(childFragment);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid1<Fragment> superCall = new CallVoid1<Fragment>(
                "onAttachFragment(Fragment)") {

            @Override
            public void call(final Fragment childFragment) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onAttachFragment(this, childFragment);
                } else {
                    getOriginal().super_onAttachFragment(childFragment);
                }
            }
        };
        superCall.call(childFragment);
    }

    public void onConfigurationChanged(final Configuration newConfig) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onConfigurationChanged(newConfig);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid1<Configuration> superCall = new CallVoid1<Configuration>(
                "onConfigurationChanged(Configuration)") {

            @Override
            public void call(final Configuration newConfig) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onConfigurationChanged(this, newConfig);
                } else {
                    getOriginal().super_onConfigurationChanged(newConfig);
                }
            }
        };
        superCall.call(newConfig);
    }

    public boolean onContextItemSelected(final MenuItem item) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_onContextItemSelected(item);
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallFun1<Boolean, MenuItem> superCall = new CallFun1<Boolean, MenuItem>(
                "onContextItemSelected(MenuItem)") {

            @Override
            public Boolean call(final MenuItem item) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onContextItemSelected(this, item);
                } else {
                    return getOriginal().super_onContextItemSelected(item);
                }
            }
        };
        return superCall.call(item);
    }

    public void onCreate(@Nullable final Bundle savedInstanceState) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onCreate(savedInstanceState);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid1<Bundle> superCall = new CallVoid1<Bundle>("onCreate(Bundle)") {

            @Override
            public void call(final Bundle savedInstanceState) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onCreate(this, savedInstanceState);
                } else {
                    getOriginal().super_onCreate(savedInstanceState);
                }
            }
        };
        superCall.call(savedInstanceState);
    }

    public Animation onCreateAnimation(final int transit, final boolean enter, final int nextAnim) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_onCreateAnimation(transit, enter, nextAnim);
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallFun3<Animation, Integer, Boolean, Integer> superCall
                = new CallFun3<Animation, Integer, Boolean, Integer>(
                "onCreateAnimation(Integer, Boolean, Integer)") {

            @Override
            public Animation call(final Integer transit, final Boolean enter,
                    final Integer nextAnim) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onCreateAnimation(this, transit, enter, nextAnim);
                } else {
                    return getOriginal().super_onCreateAnimation(transit, enter, nextAnim);
                }
            }
        };
        return superCall.call(transit, enter, nextAnim);
    }

    public void onCreateContextMenu(final ContextMenu menu, final View v,
            final ContextMenu.ContextMenuInfo menuInfo) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onCreateContextMenu(menu, v, menuInfo);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid3<ContextMenu, View, ContextMenu.ContextMenuInfo> superCall
                = new CallVoid3<ContextMenu, View, ContextMenu.ContextMenuInfo>(
                "onCreateContextMenu(ContextMenu, View, ContextMenu.ContextMenuInfo)") {

            @Override
            public void call(final ContextMenu menu, final View v,
                    final ContextMenu.ContextMenuInfo menuInfo) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onCreateContextMenu(this, menu, v, menuInfo);
                } else {
                    getOriginal().super_onCreateContextMenu(menu, v, menuInfo);
                }
            }
        };
        superCall.call(menu, v, menuInfo);
    }

    public void onCreateOptionsMenu(final Menu menu, final MenuInflater inflater) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onCreateOptionsMenu(menu, inflater);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid2<Menu, MenuInflater> superCall = new CallVoid2<Menu, MenuInflater>(
                "onCreateOptionsMenu(Menu, MenuInflater)") {

            @Override
            public void call(final Menu menu, final MenuInflater inflater) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onCreateOptionsMenu(this, menu, inflater);
                } else {
                    getOriginal().super_onCreateOptionsMenu(menu, inflater);
                }
            }
        };
        superCall.call(menu, inflater);
    }

    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container,
            @Nullable final Bundle savedInstanceState) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_onCreateView(inflater, container, savedInstanceState);
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallFun3<View, LayoutInflater, ViewGroup, Bundle> superCall
                = new CallFun3<View, LayoutInflater, ViewGroup, Bundle>(
                "onCreateView(LayoutInflater, ViewGroup, Bundle)") {

            @Override
            public View call(final LayoutInflater inflater, final ViewGroup container,
                    final Bundle savedInstanceState) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .onCreateView(this, inflater, container, savedInstanceState);
                } else {
                    return getOriginal()
                            .super_onCreateView(inflater, container, savedInstanceState);
                }
            }
        };
        return superCall.call(inflater, container, savedInstanceState);
    }

    public void onDestroy() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onDestroy();
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid0 superCall = new CallVoid0("onDestroy()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().onDestroy(this);
                } else {
                    getOriginal().super_onDestroy();
                }
            }
        };
        superCall.call();
    }

    public void onDestroyOptionsMenu() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onDestroyOptionsMenu();
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid0 superCall = new CallVoid0("onDestroyOptionsMenu()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().onDestroyOptionsMenu(this);
                } else {
                    getOriginal().super_onDestroyOptionsMenu();
                }
            }
        };
        superCall.call();
    }

    public void onDestroyView() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onDestroyView();
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid0 superCall = new CallVoid0("onDestroyView()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().onDestroyView(this);
                } else {
                    getOriginal().super_onDestroyView();
                }
            }
        };
        superCall.call();
    }

    public void onDetach() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onDetach();
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid0 superCall = new CallVoid0("onDetach()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().onDetach(this);
                } else {
                    getOriginal().super_onDetach();
                }
            }
        };
        superCall.call();
    }

    public void onHiddenChanged(final boolean hidden) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onHiddenChanged(hidden);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid1<Boolean> superCall = new CallVoid1<Boolean>("onHiddenChanged(Boolean)") {

            @Override
            public void call(final Boolean hidden) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onHiddenChanged(this, hidden);
                } else {
                    getOriginal().super_onHiddenChanged(hidden);
                }
            }
        };
        superCall.call(hidden);
    }

    public void onInflate(final Context context, final AttributeSet attrs,
            final Bundle savedInstanceState) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onInflate(context, attrs, savedInstanceState);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid3<Context, AttributeSet, Bundle> superCall
                = new CallVoid3<Context, AttributeSet, Bundle>(
                "onInflate(Context, AttributeSet, Bundle)") {

            @Override
            public void call(final Context context, final AttributeSet attrs,
                    final Bundle savedInstanceState) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onInflate(this, context, attrs, savedInstanceState);
                } else {
                    getOriginal().super_onInflate(context, attrs, savedInstanceState);
                }
            }
        };
        superCall.call(context, attrs, savedInstanceState);
    }

    public void onInflate(final Activity activity, final AttributeSet attrs,
            final Bundle savedInstanceState) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onInflate(activity, attrs, savedInstanceState);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid3<Activity, AttributeSet, Bundle> superCall
                = new CallVoid3<Activity, AttributeSet, Bundle>(
                "onInflate(Activity, AttributeSet, Bundle)") {

            @Override
            public void call(final Activity activity, final AttributeSet attrs,
                    final Bundle savedInstanceState) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onInflate(this, activity, attrs, savedInstanceState);
                } else {
                    getOriginal().super_onInflate(activity, attrs, savedInstanceState);
                }
            }
        };
        superCall.call(activity, attrs, savedInstanceState);
    }

    public void onLowMemory() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onLowMemory();
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid0 superCall = new CallVoid0("onLowMemory()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().onLowMemory(this);
                } else {
                    getOriginal().super_onLowMemory();
                }
            }
        };
        superCall.call();
    }

    public void onMultiWindowModeChanged(final boolean isInMultiWindowMode) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onMultiWindowModeChanged(isInMultiWindowMode);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid1<Boolean> superCall = new CallVoid1<Boolean>(
                "onMultiWindowModeChanged(Boolean)") {

            @Override
            public void call(final Boolean isInMultiWindowMode) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onMultiWindowModeChanged(this, isInMultiWindowMode);
                } else {
                    getOriginal().super_onMultiWindowModeChanged(isInMultiWindowMode);
                }
            }
        };
        superCall.call(isInMultiWindowMode);
    }

    public boolean onOptionsItemSelected(final MenuItem item) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_onOptionsItemSelected(item);
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallFun1<Boolean, MenuItem> superCall = new CallFun1<Boolean, MenuItem>(
                "onOptionsItemSelected(MenuItem)") {

            @Override
            public Boolean call(final MenuItem item) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onOptionsItemSelected(this, item);
                } else {
                    return getOriginal().super_onOptionsItemSelected(item);
                }
            }
        };
        return superCall.call(item);
    }

    public void onOptionsMenuClosed(final Menu menu) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onOptionsMenuClosed(menu);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid1<Menu> superCall = new CallVoid1<Menu>("onOptionsMenuClosed(Menu)") {

            @Override
            public void call(final Menu menu) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onOptionsMenuClosed(this, menu);
                } else {
                    getOriginal().super_onOptionsMenuClosed(menu);
                }
            }
        };
        superCall.call(menu);
    }

    public void onPause() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onPause();
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid0 superCall = new CallVoid0("onPause()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().onPause(this);
                } else {
                    getOriginal().super_onPause();
                }
            }
        };
        superCall.call();
    }

    public void onPictureInPictureModeChanged(final boolean isInPictureInPictureMode) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onPictureInPictureModeChanged(isInPictureInPictureMode);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid1<Boolean> superCall = new CallVoid1<Boolean>(
                "onPictureInPictureModeChanged(Boolean)") {

            @Override
            public void call(final Boolean isInPictureInPictureMode) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .onPictureInPictureModeChanged(this, isInPictureInPictureMode);
                } else {
                    getOriginal().super_onPictureInPictureModeChanged(isInPictureInPictureMode);
                }
            }
        };
        superCall.call(isInPictureInPictureMode);
    }

    public void onPrepareOptionsMenu(final Menu menu) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onPrepareOptionsMenu(menu);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid1<Menu> superCall = new CallVoid1<Menu>("onPrepareOptionsMenu(Menu)") {

            @Override
            public void call(final Menu menu) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onPrepareOptionsMenu(this, menu);
                } else {
                    getOriginal().super_onPrepareOptionsMenu(menu);
                }
            }
        };
        superCall.call(menu);
    }

    public void onRequestPermissionsResult(final int requestCode,
            @NonNull final String[] permissions, @NonNull final int[] grantResults) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onRequestPermissionsResult(requestCode, permissions, grantResults);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid3<Integer, String[], int[]> superCall
                = new CallVoid3<Integer, String[], int[]>(
                "onRequestPermissionsResult(Integer, String[], int[])") {

            @Override
            public void call(final Integer requestCode, final String[] permissions,
                    final int[] grantResults) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onRequestPermissionsResult(this, requestCode, permissions,
                            grantResults);
                } else {
                    getOriginal().super_onRequestPermissionsResult(requestCode, permissions,
                            grantResults);
                }
            }
        };
        superCall.call(requestCode, permissions, grantResults);
    }

    public void onResume() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onResume();
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid0 superCall = new CallVoid0("onResume()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().onResume(this);
                } else {
                    getOriginal().super_onResume();
                }
            }
        };
        superCall.call();
    }

    public void onSaveInstanceState(final Bundle outState) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onSaveInstanceState(outState);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid1<Bundle> superCall = new CallVoid1<Bundle>("onSaveInstanceState(Bundle)") {

            @Override
            public void call(final Bundle outState) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onSaveInstanceState(this, outState);
                } else {
                    getOriginal().super_onSaveInstanceState(outState);
                }
            }
        };
        superCall.call(outState);
    }

    public void onStart() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onStart();
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid0 superCall = new CallVoid0("onStart()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().onStart(this);
                } else {
                    getOriginal().super_onStart();
                }
            }
        };
        superCall.call();
    }

    public void onStop() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onStop();
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid0 superCall = new CallVoid0("onStop()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().onStop(this);
                } else {
                    getOriginal().super_onStop();
                }
            }
        };
        superCall.call();
    }

    public void onViewCreated(final View view, @Nullable final Bundle savedInstanceState) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onViewCreated(view, savedInstanceState);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid2<View, Bundle> superCall = new CallVoid2<View, Bundle>(
                "onViewCreated(View, Bundle)") {

            @Override
            public void call(final View view, final Bundle savedInstanceState) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onViewCreated(this, view, savedInstanceState);
                } else {
                    getOriginal().super_onViewCreated(view, savedInstanceState);
                }
            }
        };
        superCall.call(view, savedInstanceState);
    }

    public void onViewStateRestored(@Nullable final Bundle savedInstanceState) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onViewStateRestored(savedInstanceState);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid1<Bundle> superCall = new CallVoid1<Bundle>("onViewStateRestored(Bundle)") {

            @Override
            public void call(final Bundle savedInstanceState) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onViewStateRestored(this, savedInstanceState);
                } else {
                    getOriginal().super_onViewStateRestored(savedInstanceState);
                }
            }
        };
        superCall.call(savedInstanceState);
    }

    public void postponeEnterTransition() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_postponeEnterTransition();
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid0 superCall = new CallVoid0("postponeEnterTransition()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().postponeEnterTransition(this);
                } else {
                    getOriginal().super_postponeEnterTransition();
                }
            }
        };
        superCall.call();
    }

    public void registerForContextMenu(final View view) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_registerForContextMenu(view);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid1<View> superCall = new CallVoid1<View>("registerForContextMenu(View)") {

            @Override
            public void call(final View view) {
                if (iterator.hasPrevious()) {
                    iterator.previous().registerForContextMenu(this, view);
                } else {
                    getOriginal().super_registerForContextMenu(view);
                }
            }
        };
        superCall.call(view);
    }

    public void setAllowEnterTransitionOverlap(final boolean allow) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setAllowEnterTransitionOverlap(allow);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid1<Boolean> superCall = new CallVoid1<Boolean>(
                "setAllowEnterTransitionOverlap(Boolean)") {

            @Override
            public void call(final Boolean allow) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setAllowEnterTransitionOverlap(this, allow);
                } else {
                    getOriginal().super_setAllowEnterTransitionOverlap(allow);
                }
            }
        };
        superCall.call(allow);
    }

    public void setAllowReturnTransitionOverlap(final boolean allow) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setAllowReturnTransitionOverlap(allow);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid1<Boolean> superCall = new CallVoid1<Boolean>(
                "setAllowReturnTransitionOverlap(Boolean)") {

            @Override
            public void call(final Boolean allow) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setAllowReturnTransitionOverlap(this, allow);
                } else {
                    getOriginal().super_setAllowReturnTransitionOverlap(allow);
                }
            }
        };
        superCall.call(allow);
    }

    public void setArguments(final Bundle args) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setArguments(args);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid1<Bundle> superCall = new CallVoid1<Bundle>("setArguments(Bundle)") {

            @Override
            public void call(final Bundle args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setArguments(this, args);
                } else {
                    getOriginal().super_setArguments(args);
                }
            }
        };
        superCall.call(args);
    }

    public void setEnterSharedElementCallback(final SharedElementCallback callback) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setEnterSharedElementCallback(callback);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid1<SharedElementCallback> superCall = new CallVoid1<SharedElementCallback>(
                "setEnterSharedElementCallback(SharedElementCallback)") {

            @Override
            public void call(final SharedElementCallback callback) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setEnterSharedElementCallback(this, callback);
                } else {
                    getOriginal().super_setEnterSharedElementCallback(callback);
                }
            }
        };
        superCall.call(callback);
    }

    public void setEnterTransition(final Object transition) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setEnterTransition(transition);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid1<Object> superCall = new CallVoid1<Object>("setEnterTransition(Object)") {

            @Override
            public void call(final Object transition) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setEnterTransition(this, transition);
                } else {
                    getOriginal().super_setEnterTransition(transition);
                }
            }
        };
        superCall.call(transition);
    }

    public void setExitSharedElementCallback(final SharedElementCallback callback) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setExitSharedElementCallback(callback);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid1<SharedElementCallback> superCall = new CallVoid1<SharedElementCallback>(
                "setExitSharedElementCallback(SharedElementCallback)") {

            @Override
            public void call(final SharedElementCallback callback) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setExitSharedElementCallback(this, callback);
                } else {
                    getOriginal().super_setExitSharedElementCallback(callback);
                }
            }
        };
        superCall.call(callback);
    }

    public void setExitTransition(final Object transition) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setExitTransition(transition);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid1<Object> superCall = new CallVoid1<Object>("setExitTransition(Object)") {

            @Override
            public void call(final Object transition) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setExitTransition(this, transition);
                } else {
                    getOriginal().super_setExitTransition(transition);
                }
            }
        };
        superCall.call(transition);
    }

    public void setHasOptionsMenu(final boolean hasMenu) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setHasOptionsMenu(hasMenu);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid1<Boolean> superCall = new CallVoid1<Boolean>("setHasOptionsMenu(Boolean)") {

            @Override
            public void call(final Boolean hasMenu) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setHasOptionsMenu(this, hasMenu);
                } else {
                    getOriginal().super_setHasOptionsMenu(hasMenu);
                }
            }
        };
        superCall.call(hasMenu);
    }

    public void setInitialSavedState(final Fragment.SavedState state) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setInitialSavedState(state);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid1<Fragment.SavedState> superCall = new CallVoid1<Fragment.SavedState>(
                "setInitialSavedState(Fragment.SavedState)") {

            @Override
            public void call(final Fragment.SavedState state) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setInitialSavedState(this, state);
                } else {
                    getOriginal().super_setInitialSavedState(state);
                }
            }
        };
        superCall.call(state);
    }

    public void setMenuVisibility(final boolean menuVisible) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setMenuVisibility(menuVisible);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid1<Boolean> superCall = new CallVoid1<Boolean>("setMenuVisibility(Boolean)") {

            @Override
            public void call(final Boolean menuVisible) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setMenuVisibility(this, menuVisible);
                } else {
                    getOriginal().super_setMenuVisibility(menuVisible);
                }
            }
        };
        superCall.call(menuVisible);
    }

    public void setReenterTransition(final Object transition) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setReenterTransition(transition);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid1<Object> superCall = new CallVoid1<Object>("setReenterTransition(Object)") {

            @Override
            public void call(final Object transition) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setReenterTransition(this, transition);
                } else {
                    getOriginal().super_setReenterTransition(transition);
                }
            }
        };
        superCall.call(transition);
    }

    public void setRetainInstance(final boolean retain) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setRetainInstance(retain);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid1<Boolean> superCall = new CallVoid1<Boolean>("setRetainInstance(Boolean)") {

            @Override
            public void call(final Boolean retain) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setRetainInstance(this, retain);
                } else {
                    getOriginal().super_setRetainInstance(retain);
                }
            }
        };
        superCall.call(retain);
    }

    public void setReturnTransition(final Object transition) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setReturnTransition(transition);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid1<Object> superCall = new CallVoid1<Object>("setReturnTransition(Object)") {

            @Override
            public void call(final Object transition) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setReturnTransition(this, transition);
                } else {
                    getOriginal().super_setReturnTransition(transition);
                }
            }
        };
        superCall.call(transition);
    }

    public void setSharedElementEnterTransition(final Object transition) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setSharedElementEnterTransition(transition);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid1<Object> superCall = new CallVoid1<Object>(
                "setSharedElementEnterTransition(Object)") {

            @Override
            public void call(final Object transition) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setSharedElementEnterTransition(this, transition);
                } else {
                    getOriginal().super_setSharedElementEnterTransition(transition);
                }
            }
        };
        superCall.call(transition);
    }

    public void setSharedElementReturnTransition(final Object transition) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setSharedElementReturnTransition(transition);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid1<Object> superCall = new CallVoid1<Object>(
                "setSharedElementReturnTransition(Object)") {

            @Override
            public void call(final Object transition) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setSharedElementReturnTransition(this, transition);
                } else {
                    getOriginal().super_setSharedElementReturnTransition(transition);
                }
            }
        };
        superCall.call(transition);
    }

    public void setTargetFragment(final Fragment fragment, final int requestCode) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setTargetFragment(fragment, requestCode);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid2<Fragment, Integer> superCall = new CallVoid2<Fragment, Integer>(
                "setTargetFragment(Fragment, Integer)") {

            @Override
            public void call(final Fragment fragment, final Integer requestCode) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setTargetFragment(this, fragment, requestCode);
                } else {
                    getOriginal().super_setTargetFragment(fragment, requestCode);
                }
            }
        };
        superCall.call(fragment, requestCode);
    }

    public void setUserVisibleHint(final boolean isVisibleToUser) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setUserVisibleHint(isVisibleToUser);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid1<Boolean> superCall = new CallVoid1<Boolean>("setUserVisibleHint(Boolean)") {

            @Override
            public void call(final Boolean isVisibleToUser) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setUserVisibleHint(this, isVisibleToUser);
                } else {
                    getOriginal().super_setUserVisibleHint(isVisibleToUser);
                }
            }
        };
        superCall.call(isVisibleToUser);
    }

    public boolean shouldShowRequestPermissionRationale(@NonNull final String permission) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_shouldShowRequestPermissionRationale(permission);
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallFun1<Boolean, String> superCall = new CallFun1<Boolean, String>(
                "shouldShowRequestPermissionRationale(String)") {

            @Override
            public Boolean call(final String permission) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .shouldShowRequestPermissionRationale(this, permission);
                } else {
                    return getOriginal().super_shouldShowRequestPermissionRationale(permission);
                }
            }
        };
        return superCall.call(permission);
    }

    public void startActivity(final Intent intent) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_startActivity(intent);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid1<Intent> superCall = new CallVoid1<Intent>("startActivity(Intent)") {

            @Override
            public void call(final Intent intent) {
                if (iterator.hasPrevious()) {
                    iterator.previous().startActivity(this, intent);
                } else {
                    getOriginal().super_startActivity(intent);
                }
            }
        };
        superCall.call(intent);
    }

    public void startActivity(final Intent intent, @Nullable final Bundle options) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_startActivity(intent, options);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid2<Intent, Bundle> superCall = new CallVoid2<Intent, Bundle>(
                "startActivity(Intent, Bundle)") {

            @Override
            public void call(final Intent intent, final Bundle options) {
                if (iterator.hasPrevious()) {
                    iterator.previous().startActivity(this, intent, options);
                } else {
                    getOriginal().super_startActivity(intent, options);
                }
            }
        };
        superCall.call(intent, options);
    }

    public void startActivityForResult(final Intent intent, final int requestCode) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_startActivityForResult(intent, requestCode);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid2<Intent, Integer> superCall = new CallVoid2<Intent, Integer>(
                "startActivityForResult(Intent, Integer)") {

            @Override
            public void call(final Intent intent, final Integer requestCode) {
                if (iterator.hasPrevious()) {
                    iterator.previous().startActivityForResult(this, intent, requestCode);
                } else {
                    getOriginal().super_startActivityForResult(intent, requestCode);
                }
            }
        };
        superCall.call(intent, requestCode);
    }

    public void startActivityForResult(final Intent intent, final int requestCode,
            @Nullable final Bundle options) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_startActivityForResult(intent, requestCode, options);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid3<Intent, Integer, Bundle> superCall = new CallVoid3<Intent, Integer, Bundle>(
                "startActivityForResult(Intent, Integer, Bundle)") {

            @Override
            public void call(final Intent intent, final Integer requestCode, final Bundle options) {
                if (iterator.hasPrevious()) {
                    iterator.previous().startActivityForResult(this, intent, requestCode, options);
                } else {
                    getOriginal().super_startActivityForResult(intent, requestCode, options);
                }
            }
        };
        superCall.call(intent, requestCode, options);
    }

    public void startIntentSenderForResult(final IntentSender intent, final int requestCode,
            @Nullable final Intent fillInIntent, final int flagsMask, final int flagsValues,
            final int extraFlags, final Bundle options) throws IntentSender.SendIntentException {
        if (mPlugins.isEmpty()) {
            try {
                getOriginal().super_startIntentSenderForResult(intent, requestCode, fillInIntent,
                        flagsMask, flagsValues, extraFlags, options);
            } catch (IntentSender.SendIntentException e) {
                throw new SuppressedException(e);
            }
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid7<IntentSender, Integer, Intent, Integer, Integer, Integer, Bundle> superCall
                = new CallVoid7<IntentSender, Integer, Intent, Integer, Integer, Integer, Bundle>(
                "startIntentSenderForResult(IntentSender, Integer, Intent, Integer, Integer, Integer, Bundle)") {

            @Override
            public void call(final IntentSender intent, final Integer requestCode,
                    final Intent fillInIntent, final Integer flagsMask, final Integer flagsValues,
                    final Integer extraFlags, final Bundle options) {
                if (iterator.hasPrevious()) {
                    try {
                        iterator.previous()
                                .startIntentSenderForResult(this, intent, requestCode, fillInIntent,
                                        flagsMask, flagsValues, extraFlags, options);
                    } catch (IntentSender.SendIntentException e) {
                        throw new SuppressedException(e);
                    }
                } else {
                    try {
                        getOriginal()
                                .super_startIntentSenderForResult(intent, requestCode, fillInIntent,
                                        flagsMask, flagsValues, extraFlags, options);
                    } catch (IntentSender.SendIntentException e) {
                        throw new SuppressedException(e);
                    }
                }
            }
        };
        superCall.call(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags,
                options);
    }

    public void startPostponedEnterTransition() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_startPostponedEnterTransition();
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid0 superCall = new CallVoid0("startPostponedEnterTransition()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().startPostponedEnterTransition(this);
                } else {
                    getOriginal().super_startPostponedEnterTransition();
                }
            }
        };
        superCall.call();
    }

    public String toString() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_toString();
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallFun0<String> superCall = new CallFun0<String>("toString()") {

            @Override
            public String call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().toString(this);
                } else {
                    return getOriginal().super_toString();
                }
            }
        };
        return superCall.call();
    }

    public void unregisterForContextMenu(final View view) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_unregisterForContextMenu(view);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final CallVoid1<View> superCall = new CallVoid1<View>("unregisterForContextMenu(View)") {

            @Override
            public void call(final View view) {
                if (iterator.hasPrevious()) {
                    iterator.previous().unregisterForContextMenu(this, view);
                } else {
                    getOriginal().super_unregisterForContextMenu(view);
                }
            }
        };
        superCall.call(view);
    }


}