package com.pascalwelsch.compositeandroid.fragment;

import com.pascalwelsch.compositeandroid.core.AbstractDelegate;
import com.pascalwelsch.compositeandroid.core.NamedSuperCall;
import com.pascalwelsch.compositeandroid.core.Removable;

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
import java.util.ListIterator;

public class DialogFragmentDelegate
        extends AbstractDelegate<ICompositeDialogFragment, DialogFragmentPlugin> {

    private final FragmentDelegate mFragmentDelegate;

    public DialogFragmentDelegate(final ICompositeDialogFragment icompositedialogfragment) {
        super(icompositedialogfragment);
        mFragmentDelegate = new FragmentDelegate(icompositedialogfragment);
    }

    public Removable addPlugin(final FragmentPlugin plugin) {
        return mFragmentDelegate.addPlugin(plugin);
    }

    @Override
    public Removable addPlugin(final DialogFragmentPlugin plugin) {
        final Removable removable = super.addPlugin(plugin);
        final Removable superRemovable = mFragmentDelegate.addPlugin(plugin);
        return new Removable() {
            @Override
            public void remove() {
                removable.remove();
                superRemovable.remove();
            }
        };
    }

    public void dismiss() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_dismiss();
            return;
        }

        final ListIterator<DialogFragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("dismiss()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().dismiss(this);
                    return null;
                } else {
                    getOriginal().super_dismiss();
                    return null;
                }
            }
        };
        superCall.call();
    }

    public void dismissAllowingStateLoss() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_dismissAllowingStateLoss();
            return;
        }

        final ListIterator<DialogFragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "dismissAllowingStateLoss()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().dismissAllowingStateLoss(this);
                    return null;
                } else {
                    getOriginal().super_dismissAllowingStateLoss();
                    return null;
                }
            }
        };
        superCall.call();
    }

    public void dump(final String prefix, final FileDescriptor fd, final PrintWriter writer,
            final String[] args) {
        mFragmentDelegate.dump(prefix, fd, writer, args);
    }

    public boolean getAllowEnterTransitionOverlap() {
        return mFragmentDelegate.getAllowEnterTransitionOverlap();
    }

    public boolean getAllowReturnTransitionOverlap() {
        return mFragmentDelegate.getAllowReturnTransitionOverlap();
    }

    public Context getContext() {
        return mFragmentDelegate.getContext();
    }

    public Dialog getDialog() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getDialog();
        }

        final ListIterator<DialogFragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Dialog> superCall = new NamedSuperCall<Dialog>("getDialog()") {

            @Override
            public Dialog call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getDialog(this);
                } else {
                    return getOriginal().super_getDialog();
                }
            }
        };
        return superCall.call();
    }

    public Object getEnterTransition() {
        return mFragmentDelegate.getEnterTransition();
    }

    public Object getExitTransition() {
        return mFragmentDelegate.getExitTransition();
    }

    public LayoutInflater getLayoutInflater(final Bundle savedInstanceState) {
        return mFragmentDelegate.getLayoutInflater(savedInstanceState);
    }

    public LoaderManager getLoaderManager() {
        return mFragmentDelegate.getLoaderManager();
    }

    public Object getReenterTransition() {
        return mFragmentDelegate.getReenterTransition();
    }

    public Object getReturnTransition() {
        return mFragmentDelegate.getReturnTransition();
    }

    public Object getSharedElementEnterTransition() {
        return mFragmentDelegate.getSharedElementEnterTransition();
    }

    public Object getSharedElementReturnTransition() {
        return mFragmentDelegate.getSharedElementReturnTransition();
    }

    public boolean getShowsDialog() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getShowsDialog();
        }

        final ListIterator<DialogFragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>("getShowsDialog()") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getShowsDialog(this);
                } else {
                    return getOriginal().super_getShowsDialog();
                }
            }
        };
        return superCall.call();
    }

    public int getTheme() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getTheme();
        }

        final ListIterator<DialogFragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Integer> superCall = new NamedSuperCall<Integer>("getTheme()") {

            @Override
            public Integer call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getTheme(this);
                } else {
                    return getOriginal().super_getTheme();
                }
            }
        };
        return superCall.call();
    }

    public boolean getUserVisibleHint() {
        return mFragmentDelegate.getUserVisibleHint();
    }

    public View getView() {
        return mFragmentDelegate.getView();
    }

    public boolean isCancelable() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_isCancelable();
        }

        final ListIterator<DialogFragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>("isCancelable()") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().isCancelable(this);
                } else {
                    return getOriginal().super_isCancelable();
                }
            }
        };
        return superCall.call();
    }

    public void onActivityCreated(@Nullable final Bundle savedInstanceState) {
        mFragmentDelegate.onActivityCreated(savedInstanceState);
    }

    public void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        mFragmentDelegate.onActivityResult(requestCode, resultCode, data);
    }

    public void onAttach(final Context context) {
        mFragmentDelegate.onAttach(context);
    }

    public void onAttach(final Activity activity) {
        mFragmentDelegate.onAttach(activity);
    }

    public void onCancel(final DialogInterface dialog) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onCancel(dialog);
            return;
        }

        final ListIterator<DialogFragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onCancel(DialogInterface)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onCancel(this, (DialogInterface) args[0]);
                    return null;
                } else {
                    getOriginal().super_onCancel((DialogInterface) args[0]);
                    return null;
                }
            }
        };
        superCall.call(dialog);
    }

    public void onConfigurationChanged(final Configuration newConfig) {
        mFragmentDelegate.onConfigurationChanged(newConfig);
    }

    public boolean onContextItemSelected(final MenuItem item) {
        return mFragmentDelegate.onContextItemSelected(item);
    }

    public void onCreate(@Nullable final Bundle savedInstanceState) {
        mFragmentDelegate.onCreate(savedInstanceState);
    }

    public Animation onCreateAnimation(final int transit, final boolean enter, final int nextAnim) {
        return mFragmentDelegate.onCreateAnimation(transit, enter, nextAnim);
    }

    public void onCreateContextMenu(final ContextMenu menu, final View v,
            final ContextMenu.ContextMenuInfo menuInfo) {
        mFragmentDelegate.onCreateContextMenu(menu, v, menuInfo);
    }

    public Dialog onCreateDialog(final Bundle savedInstanceState) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_onCreateDialog(savedInstanceState);
        }

        final ListIterator<DialogFragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Dialog> superCall = new NamedSuperCall<Dialog>(
                "onCreateDialog(Bundle)") {

            @Override
            public Dialog call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onCreateDialog(this, (Bundle) args[0]);
                } else {
                    return getOriginal().super_onCreateDialog((Bundle) args[0]);
                }
            }
        };
        return superCall.call(savedInstanceState);
    }

    public void onCreateOptionsMenu(final Menu menu, final MenuInflater inflater) {
        mFragmentDelegate.onCreateOptionsMenu(menu, inflater);
    }

    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container,
            @Nullable final Bundle savedInstanceState) {
        return mFragmentDelegate.onCreateView(inflater, container, savedInstanceState);
    }

    public void onDestroy() {
        mFragmentDelegate.onDestroy();
    }

    public void onDestroyOptionsMenu() {
        mFragmentDelegate.onDestroyOptionsMenu();
    }

    public void onDestroyView() {
        mFragmentDelegate.onDestroyView();
    }

    public void onDetach() {
        mFragmentDelegate.onDetach();
    }

    public void onDismiss(final DialogInterface dialog) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onDismiss(dialog);
            return;
        }

        final ListIterator<DialogFragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onDismiss(DialogInterface)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onDismiss(this, (DialogInterface) args[0]);
                    return null;
                } else {
                    getOriginal().super_onDismiss((DialogInterface) args[0]);
                    return null;
                }
            }
        };
        superCall.call(dialog);
    }

    public void onHiddenChanged(final boolean hidden) {
        mFragmentDelegate.onHiddenChanged(hidden);
    }

    public void onInflate(final Context context, final AttributeSet attrs,
            final Bundle savedInstanceState) {
        mFragmentDelegate.onInflate(context, attrs, savedInstanceState);
    }

    public void onInflate(final Activity activity, final AttributeSet attrs,
            final Bundle savedInstanceState) {
        mFragmentDelegate.onInflate(activity, attrs, savedInstanceState);
    }

    public void onLowMemory() {
        mFragmentDelegate.onLowMemory();
    }

    public boolean onOptionsItemSelected(final MenuItem item) {
        return mFragmentDelegate.onOptionsItemSelected(item);
    }

    public void onOptionsMenuClosed(final Menu menu) {
        mFragmentDelegate.onOptionsMenuClosed(menu);
    }

    public void onPause() {
        mFragmentDelegate.onPause();
    }

    public void onPrepareOptionsMenu(final Menu menu) {
        mFragmentDelegate.onPrepareOptionsMenu(menu);
    }

    public void onRequestPermissionsResult(final int requestCode,
            @NonNull final String[] permissions, @NonNull final int[] grantResults) {
        mFragmentDelegate.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    public void onResume() {
        mFragmentDelegate.onResume();
    }

    public void onSaveInstanceState(final Bundle outState) {
        mFragmentDelegate.onSaveInstanceState(outState);
    }

    public void onStart() {
        mFragmentDelegate.onStart();
    }

    public void onStop() {
        mFragmentDelegate.onStop();
    }

    public void onViewCreated(final View view, @Nullable final Bundle savedInstanceState) {
        mFragmentDelegate.onViewCreated(view, savedInstanceState);
    }

    public void onViewStateRestored(@Nullable final Bundle savedInstanceState) {
        mFragmentDelegate.onViewStateRestored(savedInstanceState);
    }

    public void registerForContextMenu(final View view) {
        mFragmentDelegate.registerForContextMenu(view);
    }

    public void setAllowEnterTransitionOverlap(final boolean allow) {
        mFragmentDelegate.setAllowEnterTransitionOverlap(allow);
    }

    public void setAllowReturnTransitionOverlap(final boolean allow) {
        mFragmentDelegate.setAllowReturnTransitionOverlap(allow);
    }

    public void setArguments(final Bundle args) {
        mFragmentDelegate.setArguments(args);
    }

    public void setCancelable(final boolean cancelable) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setCancelable(cancelable);
            return;
        }

        final ListIterator<DialogFragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("setCancelable(boolean)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setCancelable(this, (boolean) args[0]);
                    return null;
                } else {
                    getOriginal().super_setCancelable((boolean) args[0]);
                    return null;
                }
            }
        };
        superCall.call(cancelable);
    }

    public void setEnterSharedElementCallback(final SharedElementCallback callback) {
        mFragmentDelegate.setEnterSharedElementCallback(callback);
    }

    public void setEnterTransition(final Object transition) {
        mFragmentDelegate.setEnterTransition(transition);
    }

    public void setExitSharedElementCallback(final SharedElementCallback callback) {
        mFragmentDelegate.setExitSharedElementCallback(callback);
    }

    public void setExitTransition(final Object transition) {
        mFragmentDelegate.setExitTransition(transition);
    }

    public void setHasOptionsMenu(final boolean hasMenu) {
        mFragmentDelegate.setHasOptionsMenu(hasMenu);
    }

    public void setInitialSavedState(final Fragment.SavedState state) {
        mFragmentDelegate.setInitialSavedState(state);
    }

    public void setMenuVisibility(final boolean menuVisible) {
        mFragmentDelegate.setMenuVisibility(menuVisible);
    }

    public void setReenterTransition(final Object transition) {
        mFragmentDelegate.setReenterTransition(transition);
    }

    public void setRetainInstance(final boolean retain) {
        mFragmentDelegate.setRetainInstance(retain);
    }

    public void setReturnTransition(final Object transition) {
        mFragmentDelegate.setReturnTransition(transition);
    }

    public void setSharedElementEnterTransition(final Object transition) {
        mFragmentDelegate.setSharedElementEnterTransition(transition);
    }

    public void setSharedElementReturnTransition(final Object transition) {
        mFragmentDelegate.setSharedElementReturnTransition(transition);
    }

    public void setShowsDialog(final boolean showsDialog) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setShowsDialog(showsDialog);
            return;
        }

        final ListIterator<DialogFragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("setShowsDialog(boolean)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setShowsDialog(this, (boolean) args[0]);
                    return null;
                } else {
                    getOriginal().super_setShowsDialog((boolean) args[0]);
                    return null;
                }
            }
        };
        superCall.call(showsDialog);
    }

    public void setStyle(final int style, @StyleRes final int theme) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setStyle(style, theme);
            return;
        }

        final ListIterator<DialogFragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("setStyle(int, int)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setStyle(this, (int) args[0], (int) args[1]);
                    return null;
                } else {
                    getOriginal().super_setStyle((int) args[0], (int) args[1]);
                    return null;
                }
            }
        };
        superCall.call(style, theme);
    }

    public void setTargetFragment(final Fragment fragment, final int requestCode) {
        mFragmentDelegate.setTargetFragment(fragment, requestCode);
    }

    public void setUserVisibleHint(final boolean isVisibleToUser) {
        mFragmentDelegate.setUserVisibleHint(isVisibleToUser);
    }

    public void setupDialog(final Dialog dialog, final int style) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setupDialog(dialog, style);
            return;
        }

        final ListIterator<DialogFragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "setupDialog(Dialog, int)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setupDialog(this, (Dialog) args[0], (int) args[1]);
                    return null;
                } else {
                    getOriginal().super_setupDialog((Dialog) args[0], (int) args[1]);
                    return null;
                }
            }
        };
        superCall.call(dialog, style);
    }

    public boolean shouldShowRequestPermissionRationale(@NonNull final String permission) {
        return mFragmentDelegate.shouldShowRequestPermissionRationale(permission);
    }

    public void show(final FragmentManager manager, final String tag) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_show(manager, tag);
            return;
        }

        final ListIterator<DialogFragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "show(FragmentManager, String)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().show(this, (FragmentManager) args[0], (String) args[1]);
                    return null;
                } else {
                    getOriginal().super_show((FragmentManager) args[0], (String) args[1]);
                    return null;
                }
            }
        };
        superCall.call(manager, tag);
    }

    public int show(final FragmentTransaction transaction, final String tag) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_show(transaction, tag);
        }

        final ListIterator<DialogFragmentPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Integer> superCall = new NamedSuperCall<Integer>(
                "show(FragmentTransaction, String)") {

            @Override
            public Integer call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .show(this, (FragmentTransaction) args[0], (String) args[1]);
                } else {
                    return getOriginal()
                            .super_show((FragmentTransaction) args[0], (String) args[1]);
                }
            }
        };
        return superCall.call(transaction, tag);
    }

    public void startActivity(final Intent intent) {
        mFragmentDelegate.startActivity(intent);
    }

    public void startActivity(final Intent intent, @Nullable final Bundle options) {
        mFragmentDelegate.startActivity(intent, options);
    }

    public void startActivityForResult(final Intent intent, final int requestCode) {
        mFragmentDelegate.startActivityForResult(intent, requestCode);
    }

    public void startActivityForResult(final Intent intent, final int requestCode,
            @Nullable final Bundle options) {
        mFragmentDelegate.startActivityForResult(intent, requestCode, options);
    }

    public String toString() {
        return mFragmentDelegate.toString();
    }

    public void unregisterForContextMenu(final View view) {
        mFragmentDelegate.unregisterForContextMenu(view);
    }


}