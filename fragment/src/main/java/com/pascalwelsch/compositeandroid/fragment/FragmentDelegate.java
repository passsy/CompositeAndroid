package com.pascalwelsch.compositeandroid.fragment;

import com.pascalwelsch.compositeandroid.core.AbstractDelegate;
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "dump(String, FileDescriptor, PrintWriter, String[])") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().dump(this, (String) args[0], (FileDescriptor) args[1],
                            (PrintWriter) args[2], (String[]) args[3]);
                    return null;
                } else {
                    getOriginal().super_dump((String) args[0], (FileDescriptor) args[1],
                            (PrintWriter) args[2], (String[]) args[3]);
                    return null;
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

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "getAllowEnterTransitionOverlap()") {

            @Override
            public Boolean call(final Object... args) {
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

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "getAllowReturnTransitionOverlap()") {

            @Override
            public Boolean call(final Object... args) {
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

        final NamedSuperCall<Context> superCall = new NamedSuperCall<Context>("getContext()") {

            @Override
            public Context call(final Object... args) {
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

        final NamedSuperCall<Object> superCall = new NamedSuperCall<Object>(
                "getEnterTransition()") {

            @Override
            public Object call(final Object... args) {
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

        final NamedSuperCall<Object> superCall = new NamedSuperCall<Object>("getExitTransition()") {

            @Override
            public Object call(final Object... args) {
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

        final NamedSuperCall<LayoutInflater> superCall = new NamedSuperCall<LayoutInflater>(
                "getLayoutInflater(Bundle)") {

            @Override
            public LayoutInflater call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getLayoutInflater(this, (Bundle) args[0]);
                } else {
                    return getOriginal().super_getLayoutInflater((Bundle) args[0]);
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

        final NamedSuperCall<LoaderManager> superCall = new NamedSuperCall<LoaderManager>(
                "getLoaderManager()") {

            @Override
            public LoaderManager call(final Object... args) {
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

        final NamedSuperCall<Object> superCall = new NamedSuperCall<Object>(
                "getReenterTransition()") {

            @Override
            public Object call(final Object... args) {
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

        final NamedSuperCall<Object> superCall = new NamedSuperCall<Object>(
                "getReturnTransition()") {

            @Override
            public Object call(final Object... args) {
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

        final NamedSuperCall<Object> superCall = new NamedSuperCall<Object>(
                "getSharedElementEnterTransition()") {

            @Override
            public Object call(final Object... args) {
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

        final NamedSuperCall<Object> superCall = new NamedSuperCall<Object>(
                "getSharedElementReturnTransition()") {

            @Override
            public Object call(final Object... args) {
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

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "getUserVisibleHint()") {

            @Override
            public Boolean call(final Object... args) {
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

        final NamedSuperCall<View> superCall = new NamedSuperCall<View>("getView()") {

            @Override
            public View call(final Object... args) {
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onActivityCreated(Bundle)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onActivityCreated(this, (Bundle) args[0]);
                    return null;
                } else {
                    getOriginal().super_onActivityCreated((Bundle) args[0]);
                    return null;
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onActivityResult(int, int, Intent)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .onActivityResult(this, (int) args[0], (int) args[1], (Intent) args[2]);
                    return null;
                } else {
                    getOriginal()
                            .super_onActivityResult((int) args[0], (int) args[1], (Intent) args[2]);
                    return null;
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("onAttach(Context)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onAttach(this, (Context) args[0]);
                    return null;
                } else {
                    getOriginal().super_onAttach((Context) args[0]);
                    return null;
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("onAttach(Activity)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onAttach(this, (Activity) args[0]);
                    return null;
                } else {
                    getOriginal().super_onAttach((Activity) args[0]);
                    return null;
                }
            }
        };
        superCall.call(activity);
    }

    public void onConfigurationChanged(final Configuration newConfig) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onConfigurationChanged(newConfig);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onConfigurationChanged(Configuration)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onConfigurationChanged(this, (Configuration) args[0]);
                    return null;
                } else {
                    getOriginal().super_onConfigurationChanged((Configuration) args[0]);
                    return null;
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

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "onContextItemSelected(MenuItem)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onContextItemSelected(this, (MenuItem) args[0]);
                } else {
                    return getOriginal().super_onContextItemSelected((MenuItem) args[0]);
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("onCreate(Bundle)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onCreate(this, (Bundle) args[0]);
                    return null;
                } else {
                    getOriginal().super_onCreate((Bundle) args[0]);
                    return null;
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

        final NamedSuperCall<Animation> superCall = new NamedSuperCall<Animation>(
                "onCreateAnimation(int, boolean, int)") {

            @Override
            public Animation call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .onCreateAnimation(this, (int) args[0], (boolean) args[1],
                                    (int) args[2]);
                } else {
                    return getOriginal().super_onCreateAnimation((int) args[0], (boolean) args[1],
                            (int) args[2]);
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onCreateContextMenu(ContextMenu, View, ContextMenu.ContextMenuInfo)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .onCreateContextMenu(this, (ContextMenu) args[0], (View) args[1],
                                    (ContextMenu.ContextMenuInfo) args[2]);
                    return null;
                } else {
                    getOriginal().super_onCreateContextMenu((ContextMenu) args[0], (View) args[1],
                            (ContextMenu.ContextMenuInfo) args[2]);
                    return null;
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onCreateOptionsMenu(Menu, MenuInflater)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .onCreateOptionsMenu(this, (Menu) args[0], (MenuInflater) args[1]);
                    return null;
                } else {
                    getOriginal().super_onCreateOptionsMenu((Menu) args[0], (MenuInflater) args[1]);
                    return null;
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

        final NamedSuperCall<View> superCall = new NamedSuperCall<View>(
                "onCreateView(LayoutInflater, ViewGroup, Bundle)") {

            @Override
            public View call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .onCreateView(this, (LayoutInflater) args[0], (ViewGroup) args[1],
                                    (Bundle) args[2]);
                } else {
                    return getOriginal()
                            .super_onCreateView((LayoutInflater) args[0], (ViewGroup) args[1],
                                    (Bundle) args[2]);
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("onDestroy()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onDestroy(this);
                    return null;
                } else {
                    getOriginal().super_onDestroy();
                    return null;
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("onDestroyOptionsMenu()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onDestroyOptionsMenu(this);
                    return null;
                } else {
                    getOriginal().super_onDestroyOptionsMenu();
                    return null;
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("onDestroyView()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onDestroyView(this);
                    return null;
                } else {
                    getOriginal().super_onDestroyView();
                    return null;
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("onDetach()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onDetach(this);
                    return null;
                } else {
                    getOriginal().super_onDetach();
                    return null;
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onHiddenChanged(boolean)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onHiddenChanged(this, (boolean) args[0]);
                    return null;
                } else {
                    getOriginal().super_onHiddenChanged((boolean) args[0]);
                    return null;
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onInflate(Context, AttributeSet, Bundle)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onInflate(this, (Context) args[0], (AttributeSet) args[1],
                            (Bundle) args[2]);
                    return null;
                } else {
                    getOriginal().super_onInflate((Context) args[0], (AttributeSet) args[1],
                            (Bundle) args[2]);
                    return null;
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onInflate(Activity, AttributeSet, Bundle)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onInflate(this, (Activity) args[0], (AttributeSet) args[1],
                            (Bundle) args[2]);
                    return null;
                } else {
                    getOriginal().super_onInflate((Activity) args[0], (AttributeSet) args[1],
                            (Bundle) args[2]);
                    return null;
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("onLowMemory()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onLowMemory(this);
                    return null;
                } else {
                    getOriginal().super_onLowMemory();
                    return null;
                }
            }
        };
        superCall.call();
    }

    public boolean onOptionsItemSelected(final MenuItem item) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_onOptionsItemSelected(item);
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "onOptionsItemSelected(MenuItem)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onOptionsItemSelected(this, (MenuItem) args[0]);
                } else {
                    return getOriginal().super_onOptionsItemSelected((MenuItem) args[0]);
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onOptionsMenuClosed(Menu)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onOptionsMenuClosed(this, (Menu) args[0]);
                    return null;
                } else {
                    getOriginal().super_onOptionsMenuClosed((Menu) args[0]);
                    return null;
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("onPause()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onPause(this);
                    return null;
                } else {
                    getOriginal().super_onPause();
                    return null;
                }
            }
        };
        superCall.call();
    }

    public void onPrepareOptionsMenu(final Menu menu) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onPrepareOptionsMenu(menu);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onPrepareOptionsMenu(Menu)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onPrepareOptionsMenu(this, (Menu) args[0]);
                    return null;
                } else {
                    getOriginal().super_onPrepareOptionsMenu((Menu) args[0]);
                    return null;
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onRequestPermissionsResult(int, String[], int[])") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .onRequestPermissionsResult(this, (int) args[0], (String[]) args[1],
                                    (int[]) args[2]);
                    return null;
                } else {
                    getOriginal()
                            .super_onRequestPermissionsResult((int) args[0], (String[]) args[1],
                                    (int[]) args[2]);
                    return null;
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("onResume()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onResume(this);
                    return null;
                } else {
                    getOriginal().super_onResume();
                    return null;
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onSaveInstanceState(Bundle)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onSaveInstanceState(this, (Bundle) args[0]);
                    return null;
                } else {
                    getOriginal().super_onSaveInstanceState((Bundle) args[0]);
                    return null;
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("onStart()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onStart(this);
                    return null;
                } else {
                    getOriginal().super_onStart();
                    return null;
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("onStop()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onStop(this);
                    return null;
                } else {
                    getOriginal().super_onStop();
                    return null;
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onViewCreated(View, Bundle)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onViewCreated(this, (View) args[0], (Bundle) args[1]);
                    return null;
                } else {
                    getOriginal().super_onViewCreated((View) args[0], (Bundle) args[1]);
                    return null;
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onViewStateRestored(Bundle)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onViewStateRestored(this, (Bundle) args[0]);
                    return null;
                } else {
                    getOriginal().super_onViewStateRestored((Bundle) args[0]);
                    return null;
                }
            }
        };
        superCall.call(savedInstanceState);
    }

    public void registerForContextMenu(final View view) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_registerForContextMenu(view);
            return;
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "registerForContextMenu(View)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().registerForContextMenu(this, (View) args[0]);
                    return null;
                } else {
                    getOriginal().super_registerForContextMenu((View) args[0]);
                    return null;
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "setAllowEnterTransitionOverlap(boolean)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setAllowEnterTransitionOverlap(this, (boolean) args[0]);
                    return null;
                } else {
                    getOriginal().super_setAllowEnterTransitionOverlap((boolean) args[0]);
                    return null;
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "setAllowReturnTransitionOverlap(boolean)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setAllowReturnTransitionOverlap(this, (boolean) args[0]);
                    return null;
                } else {
                    getOriginal().super_setAllowReturnTransitionOverlap((boolean) args[0]);
                    return null;
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("setArguments(Bundle)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setArguments(this, (Bundle) args[0]);
                    return null;
                } else {
                    getOriginal().super_setArguments((Bundle) args[0]);
                    return null;
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "setEnterSharedElementCallback(SharedElementCallback)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .setEnterSharedElementCallback(this, (SharedElementCallback) args[0]);
                    return null;
                } else {
                    getOriginal()
                            .super_setEnterSharedElementCallback((SharedElementCallback) args[0]);
                    return null;
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "setEnterTransition(Object)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setEnterTransition(this, (Object) args[0]);
                    return null;
                } else {
                    getOriginal().super_setEnterTransition((Object) args[0]);
                    return null;
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "setExitSharedElementCallback(SharedElementCallback)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .setExitSharedElementCallback(this, (SharedElementCallback) args[0]);
                    return null;
                } else {
                    getOriginal()
                            .super_setExitSharedElementCallback((SharedElementCallback) args[0]);
                    return null;
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "setExitTransition(Object)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setExitTransition(this, (Object) args[0]);
                    return null;
                } else {
                    getOriginal().super_setExitTransition((Object) args[0]);
                    return null;
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "setHasOptionsMenu(boolean)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setHasOptionsMenu(this, (boolean) args[0]);
                    return null;
                } else {
                    getOriginal().super_setHasOptionsMenu((boolean) args[0]);
                    return null;
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "setInitialSavedState(Fragment.SavedState)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setInitialSavedState(this, (Fragment.SavedState) args[0]);
                    return null;
                } else {
                    getOriginal().super_setInitialSavedState((Fragment.SavedState) args[0]);
                    return null;
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "setMenuVisibility(boolean)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setMenuVisibility(this, (boolean) args[0]);
                    return null;
                } else {
                    getOriginal().super_setMenuVisibility((boolean) args[0]);
                    return null;
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "setReenterTransition(Object)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setReenterTransition(this, (Object) args[0]);
                    return null;
                } else {
                    getOriginal().super_setReenterTransition((Object) args[0]);
                    return null;
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "setRetainInstance(boolean)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setRetainInstance(this, (boolean) args[0]);
                    return null;
                } else {
                    getOriginal().super_setRetainInstance((boolean) args[0]);
                    return null;
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "setReturnTransition(Object)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setReturnTransition(this, (Object) args[0]);
                    return null;
                } else {
                    getOriginal().super_setReturnTransition((Object) args[0]);
                    return null;
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "setSharedElementEnterTransition(Object)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setSharedElementEnterTransition(this, (Object) args[0]);
                    return null;
                } else {
                    getOriginal().super_setSharedElementEnterTransition((Object) args[0]);
                    return null;
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "setSharedElementReturnTransition(Object)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setSharedElementReturnTransition(this, (Object) args[0]);
                    return null;
                } else {
                    getOriginal().super_setSharedElementReturnTransition((Object) args[0]);
                    return null;
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "setTargetFragment(Fragment, int)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setTargetFragment(this, (Fragment) args[0], (int) args[1]);
                    return null;
                } else {
                    getOriginal().super_setTargetFragment((Fragment) args[0], (int) args[1]);
                    return null;
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "setUserVisibleHint(boolean)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setUserVisibleHint(this, (boolean) args[0]);
                    return null;
                } else {
                    getOriginal().super_setUserVisibleHint((boolean) args[0]);
                    return null;
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

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "shouldShowRequestPermissionRationale(String)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .shouldShowRequestPermissionRationale(this, (String) args[0]);
                } else {
                    return getOriginal()
                            .super_shouldShowRequestPermissionRationale((String) args[0]);
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("startActivity(Intent)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().startActivity(this, (Intent) args[0]);
                    return null;
                } else {
                    getOriginal().super_startActivity((Intent) args[0]);
                    return null;
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "startActivity(Intent, Bundle)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().startActivity(this, (Intent) args[0], (Bundle) args[1]);
                    return null;
                } else {
                    getOriginal().super_startActivity((Intent) args[0], (Bundle) args[1]);
                    return null;
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "startActivityForResult(Intent, int)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .startActivityForResult(this, (Intent) args[0], (int) args[1]);
                    return null;
                } else {
                    getOriginal().super_startActivityForResult((Intent) args[0], (int) args[1]);
                    return null;
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "startActivityForResult(Intent, int, Bundle)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .startActivityForResult(this, (Intent) args[0], (int) args[1],
                                    (Bundle) args[2]);
                    return null;
                } else {
                    getOriginal().super_startActivityForResult((Intent) args[0], (int) args[1],
                            (Bundle) args[2]);
                    return null;
                }
            }
        };
        superCall.call(intent, requestCode, options);
    }

    public String toString() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_toString();
        }

        final ListIterator<FragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<String> superCall = new NamedSuperCall<String>("toString()") {

            @Override
            public String call(final Object... args) {
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

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "unregisterForContextMenu(View)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().unregisterForContextMenu(this, (View) args[0]);
                    return null;
                } else {
                    getOriginal().super_unregisterForContextMenu((View) args[0]);
                    return null;
                }
            }
        };
        superCall.call(view);
    }


}