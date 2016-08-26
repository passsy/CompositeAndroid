package com.pascalwelsch.compositeandroid.fragment;

import com.pascalwelsch.compositeandroid.core.AbstractDelegate;
import com.pascalwelsch.compositeandroid.core.CallFun0;
import com.pascalwelsch.compositeandroid.core.CallFun1;
import com.pascalwelsch.compositeandroid.core.CallFun2;
import com.pascalwelsch.compositeandroid.core.CallVoid0;
import com.pascalwelsch.compositeandroid.core.CallVoid1;
import com.pascalwelsch.compositeandroid.core.CallVoid2;
import com.pascalwelsch.compositeandroid.core.Removable;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.support.annotation.VisibleForTesting;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;

public class DialogFragmentDelegate
        extends AbstractDelegate<ICompositeDialogFragment, DialogFragmentPlugin> {

    @VisibleForTesting
    static final int CALL_COUNT_OPTIMIZATION_THRESHOLD = 100;

    private int mCallCount_dismiss = 0;

    private int mCallCount_dismissAllowingStateLoss = 0;

    private int mCallCount_getDialog = 0;

    private int mCallCount_getShowsDialog = 0;

    private int mCallCount_getTheme = 0;

    private int mCallCount_isCancelable = 0;

    private int mCallCount_onCancelDe = 0;

    private int mCallCount_onCreateDialogBe = 0;

    private int mCallCount_onDismissDe = 0;

    private int mCallCount_setCancelableBn = 0;

    private int mCallCount_setShowsDialogBn = 0;

    private int mCallCount_setStyleIrIr = 0;

    private int mCallCount_setupDialogDgIr = 0;

    private int mCallCount_showFnSg = 0;

    private int mCallCount_showFrSg = 0;

    private final FragmentDelegate mFragmentDelegate;

    private boolean mIsOverridden_dismiss = false;

    private boolean mIsOverridden_dismissAllowingStateLoss = false;

    private boolean mIsOverridden_getDialog = false;

    private boolean mIsOverridden_getShowsDialog = false;

    private boolean mIsOverridden_getTheme = false;

    private boolean mIsOverridden_isCancelable = false;

    private boolean mIsOverridden_onCancelDe = false;

    private boolean mIsOverridden_onCreateDialogBe = false;

    private boolean mIsOverridden_onDismissDe = false;

    private boolean mIsOverridden_setCancelableBn = false;

    private boolean mIsOverridden_setShowsDialogBn = false;

    private boolean mIsOverridden_setStyleIrIr = false;

    private boolean mIsOverridden_setupDialogDgIr = false;

    private boolean mIsOverridden_showFnSg = false;

    private boolean mIsOverridden_showFrSg = false;

    private final HashMap<String, List<DialogFragmentPlugin>> mMethodImplementingPlugins
            = new HashMap<>();

    public DialogFragmentDelegate(final ICompositeDialogFragment icompositedialogfragment) {
        super(icompositedialogfragment);
        mFragmentDelegate = new FragmentDelegate(icompositedialogfragment);
    }

    public Removable addPlugin(final FragmentPlugin plugin) {
        return mFragmentDelegate.addPlugin(plugin);
    }

    @Override
    public Removable addPlugin(final DialogFragmentPlugin plugin) {
        mMethodImplementingPlugins.clear();
        mIsOverridden_setStyleIrIr = true;
        mIsOverridden_showFrSg = true;
        mIsOverridden_showFnSg = true;
        mIsOverridden_dismiss = true;
        mIsOverridden_dismissAllowingStateLoss = true;
        mIsOverridden_getDialog = true;
        mIsOverridden_getTheme = true;
        mIsOverridden_setCancelableBn = true;
        mIsOverridden_isCancelable = true;
        mIsOverridden_setShowsDialogBn = true;
        mIsOverridden_getShowsDialog = true;
        mIsOverridden_setupDialogDgIr = true;
        mIsOverridden_onCreateDialogBe = true;
        mIsOverridden_onCancelDe = true;
        mIsOverridden_onDismissDe = true;

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
        if (!mIsOverridden_dismiss) {
            getOriginal().super_dismiss();
            return;
        }

        final ListIterator<DialogFragmentPlugin> iterator;
        if (mCallCount_dismiss < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_dismiss++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<DialogFragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("dismiss()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("dismiss");
                mMethodImplementingPlugins.put("dismiss()", implementingPlugins);
                mIsOverridden_dismiss = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid0 superCall = new CallVoid0("dismiss()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().dismiss(this);
                } else {
                    getOriginal().super_dismiss();
                }
            }
        };
        superCall.call();
    }

    public void dismissAllowingStateLoss() {
        if (!mIsOverridden_dismissAllowingStateLoss) {
            getOriginal().super_dismissAllowingStateLoss();
            return;
        }

        final ListIterator<DialogFragmentPlugin> iterator;
        if (mCallCount_dismissAllowingStateLoss < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_dismissAllowingStateLoss++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<DialogFragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("dismissAllowingStateLoss()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("dismissAllowingStateLoss");
                mMethodImplementingPlugins.put("dismissAllowingStateLoss()", implementingPlugins);
                mIsOverridden_dismissAllowingStateLoss = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid0 superCall = new CallVoid0("dismissAllowingStateLoss()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().dismissAllowingStateLoss(this);
                } else {
                    getOriginal().super_dismissAllowingStateLoss();
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
        if (!mIsOverridden_getDialog) {
            return getOriginal().super_getDialog();
        }

        final ListIterator<DialogFragmentPlugin> iterator;
        if (mCallCount_getDialog < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getDialog++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<DialogFragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getDialog()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getDialog");
                mMethodImplementingPlugins.put("getDialog()", implementingPlugins);
                mIsOverridden_getDialog = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<Dialog> superCall = new CallFun0<Dialog>("getDialog()") {

            @Override
            public Dialog call() {
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
        if (!mIsOverridden_getShowsDialog) {
            return getOriginal().super_getShowsDialog();
        }

        final ListIterator<DialogFragmentPlugin> iterator;
        if (mCallCount_getShowsDialog < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getShowsDialog++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<DialogFragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getShowsDialog()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getShowsDialog");
                mMethodImplementingPlugins.put("getShowsDialog()", implementingPlugins);
                mIsOverridden_getShowsDialog = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<Boolean> superCall = new CallFun0<Boolean>("getShowsDialog()") {

            @Override
            public Boolean call() {
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
        if (!mIsOverridden_getTheme) {
            return getOriginal().super_getTheme();
        }

        final ListIterator<DialogFragmentPlugin> iterator;
        if (mCallCount_getTheme < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getTheme++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<DialogFragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getTheme()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getTheme");
                mMethodImplementingPlugins.put("getTheme()", implementingPlugins);
                mIsOverridden_getTheme = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<Integer> superCall = new CallFun0<Integer>("getTheme()") {

            @Override
            public Integer call() {
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
        if (!mIsOverridden_isCancelable) {
            return getOriginal().super_isCancelable();
        }

        final ListIterator<DialogFragmentPlugin> iterator;
        if (mCallCount_isCancelable < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_isCancelable++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<DialogFragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("isCancelable()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("isCancelable");
                mMethodImplementingPlugins.put("isCancelable()", implementingPlugins);
                mIsOverridden_isCancelable = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<Boolean> superCall = new CallFun0<Boolean>("isCancelable()") {

            @Override
            public Boolean call() {
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

    public void onAttachFragment(final Fragment childFragment) {
        mFragmentDelegate.onAttachFragment(childFragment);
    }

    public void onCancel(final DialogInterface dialog) {
        if (!mIsOverridden_onCancelDe) {
            getOriginal().super_onCancel(dialog);
            return;
        }

        final ListIterator<DialogFragmentPlugin> iterator;
        if (mCallCount_onCancelDe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onCancelDe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<DialogFragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onCancel(DialogInterface)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onCancel", DialogInterface.class);
                mMethodImplementingPlugins.put("onCancel(DialogInterface)", implementingPlugins);
                mIsOverridden_onCancelDe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<DialogInterface> superCall = new CallVoid1<DialogInterface>(
                "onCancel(DialogInterface)") {

            @Override
            public void call(final DialogInterface dialog) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onCancel(this, dialog);
                } else {
                    getOriginal().super_onCancel(dialog);
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
        if (!mIsOverridden_onCreateDialogBe) {
            return getOriginal().super_onCreateDialog(savedInstanceState);
        }

        final ListIterator<DialogFragmentPlugin> iterator;
        if (mCallCount_onCreateDialogBe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onCreateDialogBe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<DialogFragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onCreateDialog(Bundle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onCreateDialog", Bundle.class);
                mMethodImplementingPlugins.put("onCreateDialog(Bundle)", implementingPlugins);
                mIsOverridden_onCreateDialogBe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<Dialog, Bundle> superCall = new CallFun1<Dialog, Bundle>(
                "onCreateDialog(Bundle)") {

            @Override
            public Dialog call(final Bundle savedInstanceState) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onCreateDialog(this, savedInstanceState);
                } else {
                    return getOriginal().super_onCreateDialog(savedInstanceState);
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
        if (!mIsOverridden_onDismissDe) {
            getOriginal().super_onDismiss(dialog);
            return;
        }

        final ListIterator<DialogFragmentPlugin> iterator;
        if (mCallCount_onDismissDe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onDismissDe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<DialogFragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onDismiss(DialogInterface)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onDismiss", DialogInterface.class);
                mMethodImplementingPlugins.put("onDismiss(DialogInterface)", implementingPlugins);
                mIsOverridden_onDismissDe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<DialogInterface> superCall = new CallVoid1<DialogInterface>(
                "onDismiss(DialogInterface)") {

            @Override
            public void call(final DialogInterface dialog) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onDismiss(this, dialog);
                } else {
                    getOriginal().super_onDismiss(dialog);
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

    public void onMultiWindowModeChanged(final boolean isInMultiWindowMode) {
        mFragmentDelegate.onMultiWindowModeChanged(isInMultiWindowMode);
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

    public void onPictureInPictureModeChanged(final boolean isInPictureInPictureMode) {
        mFragmentDelegate.onPictureInPictureModeChanged(isInPictureInPictureMode);
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
        if (!mIsOverridden_setCancelableBn) {
            getOriginal().super_setCancelable(cancelable);
            return;
        }

        final ListIterator<DialogFragmentPlugin> iterator;
        if (mCallCount_setCancelableBn < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setCancelableBn++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<DialogFragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setCancelable(Boolean)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setCancelable", Boolean.class);
                mMethodImplementingPlugins.put("setCancelable(Boolean)", implementingPlugins);
                mIsOverridden_setCancelableBn = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<Boolean> superCall = new CallVoid1<Boolean>("setCancelable(Boolean)") {

            @Override
            public void call(final Boolean cancelable) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setCancelable(this, cancelable);
                } else {
                    getOriginal().super_setCancelable(cancelable);
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
        if (!mIsOverridden_setShowsDialogBn) {
            getOriginal().super_setShowsDialog(showsDialog);
            return;
        }

        final ListIterator<DialogFragmentPlugin> iterator;
        if (mCallCount_setShowsDialogBn < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setShowsDialogBn++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<DialogFragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setShowsDialog(Boolean)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setShowsDialog", Boolean.class);
                mMethodImplementingPlugins.put("setShowsDialog(Boolean)", implementingPlugins);
                mIsOverridden_setShowsDialogBn = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<Boolean> superCall = new CallVoid1<Boolean>("setShowsDialog(Boolean)") {

            @Override
            public void call(final Boolean showsDialog) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setShowsDialog(this, showsDialog);
                } else {
                    getOriginal().super_setShowsDialog(showsDialog);
                }
            }
        };
        superCall.call(showsDialog);
    }

    public void setStyle(final int style, @StyleRes final int theme) {
        if (!mIsOverridden_setStyleIrIr) {
            getOriginal().super_setStyle(style, theme);
            return;
        }

        final ListIterator<DialogFragmentPlugin> iterator;
        if (mCallCount_setStyleIrIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setStyleIrIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<DialogFragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setStyle(Integer, Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setStyle", Integer.class,
                        Integer.class);
                mMethodImplementingPlugins.put("setStyle(Integer, Integer)", implementingPlugins);
                mIsOverridden_setStyleIrIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid2<Integer, Integer> superCall = new CallVoid2<Integer, Integer>(
                "setStyle(Integer, Integer)") {

            @Override
            public void call(final Integer style, final Integer theme) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setStyle(this, style, theme);
                } else {
                    getOriginal().super_setStyle(style, theme);
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
        if (!mIsOverridden_setupDialogDgIr) {
            getOriginal().super_setupDialog(dialog, style);
            return;
        }

        final ListIterator<DialogFragmentPlugin> iterator;
        if (mCallCount_setupDialogDgIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setupDialogDgIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<DialogFragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setupDialog(Dialog, Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setupDialog", Dialog.class,
                        Integer.class);
                mMethodImplementingPlugins.put("setupDialog(Dialog, Integer)", implementingPlugins);
                mIsOverridden_setupDialogDgIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid2<Dialog, Integer> superCall = new CallVoid2<Dialog, Integer>(
                "setupDialog(Dialog, Integer)") {

            @Override
            public void call(final Dialog dialog, final Integer style) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setupDialog(this, dialog, style);
                } else {
                    getOriginal().super_setupDialog(dialog, style);
                }
            }
        };
        superCall.call(dialog, style);
    }

    public boolean shouldShowRequestPermissionRationale(@NonNull final String permission) {
        return mFragmentDelegate.shouldShowRequestPermissionRationale(permission);
    }

    public void show(final FragmentManager manager, final String tag) {
        if (!mIsOverridden_showFrSg) {
            getOriginal().super_show(manager, tag);
            return;
        }

        final ListIterator<DialogFragmentPlugin> iterator;
        if (mCallCount_showFrSg < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_showFrSg++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<DialogFragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("show(FragmentManager, String)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("show", FragmentManager.class,
                        String.class);
                mMethodImplementingPlugins
                        .put("show(FragmentManager, String)", implementingPlugins);
                mIsOverridden_showFrSg = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid2<FragmentManager, String> superCall = new CallVoid2<FragmentManager, String>(
                "show(FragmentManager, String)") {

            @Override
            public void call(final FragmentManager manager, final String tag) {
                if (iterator.hasPrevious()) {
                    iterator.previous().show(this, manager, tag);
                } else {
                    getOriginal().super_show(manager, tag);
                }
            }
        };
        superCall.call(manager, tag);
    }

    public int show(final FragmentTransaction transaction, final String tag) {
        if (!mIsOverridden_showFnSg) {
            return getOriginal().super_show(transaction, tag);
        }

        final ListIterator<DialogFragmentPlugin> iterator;
        if (mCallCount_showFnSg < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_showFnSg++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<DialogFragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("show(FragmentTransaction, String)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("show", FragmentTransaction.class,
                        String.class);
                mMethodImplementingPlugins
                        .put("show(FragmentTransaction, String)", implementingPlugins);
                mIsOverridden_showFnSg = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun2<Integer, FragmentTransaction, String> superCall
                = new CallFun2<Integer, FragmentTransaction, String>(
                "show(FragmentTransaction, String)") {

            @Override
            public Integer call(final FragmentTransaction transaction, final String tag) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().show(this, transaction, tag);
                } else {
                    return getOriginal().super_show(transaction, tag);
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

    public void startIntentSenderForResult(final IntentSender intent, final int requestCode,
            @Nullable final Intent fillInIntent, final int flagsMask, final int flagsValues,
            final int extraFlags, final Bundle options) throws IntentSender.SendIntentException {
        mFragmentDelegate.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask,
                flagsValues, extraFlags, options);
    }

    public String toString() {
        return mFragmentDelegate.toString();
    }

    public void unregisterForContextMenu(final View view) {
        mFragmentDelegate.unregisterForContextMenu(view);
    }

    private List<DialogFragmentPlugin> getImplementingPlugins(final String methodName,
            final Class<?>... parameterTypes) {
        synchronized (mPlugins) {
            final ArrayList<DialogFragmentPlugin> implementingPlugins = new ArrayList<>();
            for (int i = 0; i < mPlugins.size(); i++) {
                final DialogFragmentPlugin plugin = mPlugins.get(i);
                if (plugin.isMethodOverridden(methodName, parameterTypes)) {
                    implementingPlugins.add(plugin);
                }
            }
            return implementingPlugins;
        }
    }


}