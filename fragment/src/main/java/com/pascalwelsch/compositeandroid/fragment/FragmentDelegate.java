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
import com.pascalwelsch.compositeandroid.core.Removable;
import com.pascalwelsch.compositeandroid.core.SuppressedException;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;

public class FragmentDelegate extends AbstractDelegate<ICompositeFragment, FragmentPlugin> {

    @VisibleForTesting
    int CALL_COUNT_OPTIMIZATION_THRESHOLD = 100;

    private int mCallCount_dumpSgFrPrSg = 0;

    private int mCallCount_getAllowEnterTransitionOverlap = 0;

    private int mCallCount_getAllowReturnTransitionOverlap = 0;

    private int mCallCount_getContext = 0;

    private int mCallCount_getEnterTransition = 0;

    private int mCallCount_getExitTransition = 0;

    private int mCallCount_getLayoutInflaterBe = 0;

    private int mCallCount_getLoaderManager = 0;

    private int mCallCount_getReenterTransition = 0;

    private int mCallCount_getReturnTransition = 0;

    private int mCallCount_getSharedElementEnterTransition = 0;

    private int mCallCount_getSharedElementReturnTransition = 0;

    private int mCallCount_getUserVisibleHint = 0;

    private int mCallCount_getView = 0;

    private int mCallCount_onActivityCreatedBe = 0;

    private int mCallCount_onActivityResultIrIrIt = 0;

    private int mCallCount_onAttachAy = 0;

    private int mCallCount_onAttachCt = 0;

    private int mCallCount_onAttachFragmentFt = 0;

    private int mCallCount_onConfigurationChangedCn = 0;

    private int mCallCount_onContextItemSelectedMm = 0;

    private int mCallCount_onCreateAnimationIrBnIr = 0;

    private int mCallCount_onCreateBe = 0;

    private int mCallCount_onCreateContextMenuCuVwCo = 0;

    private int mCallCount_onCreateOptionsMenuMuMr = 0;

    private int mCallCount_onCreateViewLrVpBe = 0;

    private int mCallCount_onDestroy = 0;

    private int mCallCount_onDestroyOptionsMenu = 0;

    private int mCallCount_onDestroyView = 0;

    private int mCallCount_onDetach = 0;

    private int mCallCount_onHiddenChangedBn = 0;

    private int mCallCount_onInflateAyAtBe = 0;

    private int mCallCount_onInflateCtAtBe = 0;

    private int mCallCount_onLowMemory = 0;

    private int mCallCount_onMultiWindowModeChangedBn = 0;

    private int mCallCount_onOptionsItemSelectedMm = 0;

    private int mCallCount_onOptionsMenuClosedMu = 0;

    private int mCallCount_onPause = 0;

    private int mCallCount_onPictureInPictureModeChangedBn = 0;

    private int mCallCount_onPrepareOptionsMenuMu = 0;

    private int mCallCount_onRequestPermissionsResultIrSgit = 0;

    private int mCallCount_onResume = 0;

    private int mCallCount_onSaveInstanceStateBe = 0;

    private int mCallCount_onStart = 0;

    private int mCallCount_onStop = 0;

    private int mCallCount_onViewCreatedVwBe = 0;

    private int mCallCount_onViewStateRestoredBe = 0;

    private int mCallCount_registerForContextMenuVw = 0;

    private int mCallCount_setAllowEnterTransitionOverlapBn = 0;

    private int mCallCount_setAllowReturnTransitionOverlapBn = 0;

    private int mCallCount_setArgumentsBe = 0;

    private int mCallCount_setEnterSharedElementCallbackSk = 0;

    private int mCallCount_setEnterTransitionOt = 0;

    private int mCallCount_setExitSharedElementCallbackSk = 0;

    private int mCallCount_setExitTransitionOt = 0;

    private int mCallCount_setHasOptionsMenuBn = 0;

    private int mCallCount_setInitialSavedStateSe = 0;

    private int mCallCount_setMenuVisibilityBn = 0;

    private int mCallCount_setReenterTransitionOt = 0;

    private int mCallCount_setRetainInstanceBn = 0;

    private int mCallCount_setReturnTransitionOt = 0;

    private int mCallCount_setSharedElementEnterTransitionOt = 0;

    private int mCallCount_setSharedElementReturnTransitionOt = 0;

    private int mCallCount_setTargetFragmentFtIr = 0;

    private int mCallCount_setUserVisibleHintBn = 0;

    private int mCallCount_shouldShowRequestPermissionRationaleSg = 0;

    private int mCallCount_startActivityForResultItIr = 0;

    private int mCallCount_startActivityForResultItIrBe = 0;

    private int mCallCount_startActivityIt = 0;

    private int mCallCount_startActivityItBe = 0;

    private int mCallCount_startIntentSenderForResultIrIrItIrIrIrBe = 0;

    private int mCallCount_toString = 0;

    private int mCallCount_unregisterForContextMenuVw = 0;

    private boolean mIsOverridden_dumpSgFrPrSg = false;

    private boolean mIsOverridden_getAllowEnterTransitionOverlap = false;

    private boolean mIsOverridden_getAllowReturnTransitionOverlap = false;

    private boolean mIsOverridden_getContext = false;

    private boolean mIsOverridden_getEnterTransition = false;

    private boolean mIsOverridden_getExitTransition = false;

    private boolean mIsOverridden_getLayoutInflaterBe = false;

    private boolean mIsOverridden_getLoaderManager = false;

    private boolean mIsOverridden_getReenterTransition = false;

    private boolean mIsOverridden_getReturnTransition = false;

    private boolean mIsOverridden_getSharedElementEnterTransition = false;

    private boolean mIsOverridden_getSharedElementReturnTransition = false;

    private boolean mIsOverridden_getUserVisibleHint = false;

    private boolean mIsOverridden_getView = false;

    private boolean mIsOverridden_onActivityCreatedBe = false;

    private boolean mIsOverridden_onActivityResultIrIrIt = false;

    private boolean mIsOverridden_onAttachAy = false;

    private boolean mIsOverridden_onAttachCt = false;

    private boolean mIsOverridden_onAttachFragmentFt = false;

    private boolean mIsOverridden_onConfigurationChangedCn = false;

    private boolean mIsOverridden_onContextItemSelectedMm = false;

    private boolean mIsOverridden_onCreateAnimationIrBnIr = false;

    private boolean mIsOverridden_onCreateBe = false;

    private boolean mIsOverridden_onCreateContextMenuCuVwCo = false;

    private boolean mIsOverridden_onCreateOptionsMenuMuMr = false;

    private boolean mIsOverridden_onCreateViewLrVpBe = false;

    private boolean mIsOverridden_onDestroy = false;

    private boolean mIsOverridden_onDestroyOptionsMenu = false;

    private boolean mIsOverridden_onDestroyView = false;

    private boolean mIsOverridden_onDetach = false;

    private boolean mIsOverridden_onHiddenChangedBn = false;

    private boolean mIsOverridden_onInflateAyAtBe = false;

    private boolean mIsOverridden_onInflateCtAtBe = false;

    private boolean mIsOverridden_onLowMemory = false;

    private boolean mIsOverridden_onMultiWindowModeChangedBn = false;

    private boolean mIsOverridden_onOptionsItemSelectedMm = false;

    private boolean mIsOverridden_onOptionsMenuClosedMu = false;

    private boolean mIsOverridden_onPause = false;

    private boolean mIsOverridden_onPictureInPictureModeChangedBn = false;

    private boolean mIsOverridden_onPrepareOptionsMenuMu = false;

    private boolean mIsOverridden_onRequestPermissionsResultIrSgit = false;

    private boolean mIsOverridden_onResume = false;

    private boolean mIsOverridden_onSaveInstanceStateBe = false;

    private boolean mIsOverridden_onStart = false;

    private boolean mIsOverridden_onStop = false;

    private boolean mIsOverridden_onViewCreatedVwBe = false;

    private boolean mIsOverridden_onViewStateRestoredBe = false;

    private boolean mIsOverridden_registerForContextMenuVw = false;

    private boolean mIsOverridden_setAllowEnterTransitionOverlapBn = false;

    private boolean mIsOverridden_setAllowReturnTransitionOverlapBn = false;

    private boolean mIsOverridden_setArgumentsBe = false;

    private boolean mIsOverridden_setEnterSharedElementCallbackSk = false;

    private boolean mIsOverridden_setEnterTransitionOt = false;

    private boolean mIsOverridden_setExitSharedElementCallbackSk = false;

    private boolean mIsOverridden_setExitTransitionOt = false;

    private boolean mIsOverridden_setHasOptionsMenuBn = false;

    private boolean mIsOverridden_setInitialSavedStateSe = false;

    private boolean mIsOverridden_setMenuVisibilityBn = false;

    private boolean mIsOverridden_setReenterTransitionOt = false;

    private boolean mIsOverridden_setRetainInstanceBn = false;

    private boolean mIsOverridden_setReturnTransitionOt = false;

    private boolean mIsOverridden_setSharedElementEnterTransitionOt = false;

    private boolean mIsOverridden_setSharedElementReturnTransitionOt = false;

    private boolean mIsOverridden_setTargetFragmentFtIr = false;

    private boolean mIsOverridden_setUserVisibleHintBn = false;

    private boolean mIsOverridden_shouldShowRequestPermissionRationaleSg = false;

    private boolean mIsOverridden_startActivityForResultItIr = false;

    private boolean mIsOverridden_startActivityForResultItIrBe = false;

    private boolean mIsOverridden_startActivityIt = false;

    private boolean mIsOverridden_startActivityItBe = false;

    private boolean mIsOverridden_startIntentSenderForResultIrIrItIrIrIrBe = false;

    private boolean mIsOverridden_toString = false;

    private boolean mIsOverridden_unregisterForContextMenuVw = false;

    private final HashMap<String, List<FragmentPlugin>> mMethodImplementingPlugins
            = new HashMap<>();

    public FragmentDelegate(final ICompositeFragment icompositefragment) {
        super(icompositefragment);

    }

    @Override
    public Removable addPlugin(final FragmentPlugin plugin) {
        mMethodImplementingPlugins.clear();
        mIsOverridden_dumpSgFrPrSg = true;
        mIsOverridden_getAllowEnterTransitionOverlap = true;
        mIsOverridden_getAllowReturnTransitionOverlap = true;
        mIsOverridden_getContext = true;
        mIsOverridden_getEnterTransition = true;
        mIsOverridden_getExitTransition = true;
        mIsOverridden_getLayoutInflaterBe = true;
        mIsOverridden_getLoaderManager = true;
        mIsOverridden_getReenterTransition = true;
        mIsOverridden_getReturnTransition = true;
        mIsOverridden_getSharedElementEnterTransition = true;
        mIsOverridden_getSharedElementReturnTransition = true;
        mIsOverridden_getUserVisibleHint = true;
        mIsOverridden_getView = true;
        mIsOverridden_onActivityCreatedBe = true;
        mIsOverridden_onActivityResultIrIrIt = true;
        mIsOverridden_onAttachCt = true;
        mIsOverridden_onAttachAy = true;
        mIsOverridden_onAttachFragmentFt = true;
        mIsOverridden_onConfigurationChangedCn = true;
        mIsOverridden_onContextItemSelectedMm = true;
        mIsOverridden_onCreateBe = true;
        mIsOverridden_onCreateAnimationIrBnIr = true;
        mIsOverridden_onCreateContextMenuCuVwCo = true;
        mIsOverridden_onCreateOptionsMenuMuMr = true;
        mIsOverridden_onCreateViewLrVpBe = true;
        mIsOverridden_onDestroy = true;
        mIsOverridden_onDestroyOptionsMenu = true;
        mIsOverridden_onDestroyView = true;
        mIsOverridden_onDetach = true;
        mIsOverridden_onHiddenChangedBn = true;
        mIsOverridden_onInflateCtAtBe = true;
        mIsOverridden_onInflateAyAtBe = true;
        mIsOverridden_onLowMemory = true;
        mIsOverridden_onMultiWindowModeChangedBn = true;
        mIsOverridden_onOptionsItemSelectedMm = true;
        mIsOverridden_onOptionsMenuClosedMu = true;
        mIsOverridden_onPause = true;
        mIsOverridden_onPictureInPictureModeChangedBn = true;
        mIsOverridden_onPrepareOptionsMenuMu = true;
        mIsOverridden_onRequestPermissionsResultIrSgit = true;
        mIsOverridden_onResume = true;
        mIsOverridden_onSaveInstanceStateBe = true;
        mIsOverridden_onStart = true;
        mIsOverridden_onStop = true;
        mIsOverridden_onViewCreatedVwBe = true;
        mIsOverridden_onViewStateRestoredBe = true;
        mIsOverridden_registerForContextMenuVw = true;
        mIsOverridden_setAllowEnterTransitionOverlapBn = true;
        mIsOverridden_setAllowReturnTransitionOverlapBn = true;
        mIsOverridden_setArgumentsBe = true;
        mIsOverridden_setEnterSharedElementCallbackSk = true;
        mIsOverridden_setEnterTransitionOt = true;
        mIsOverridden_setExitSharedElementCallbackSk = true;
        mIsOverridden_setExitTransitionOt = true;
        mIsOverridden_setHasOptionsMenuBn = true;
        mIsOverridden_setInitialSavedStateSe = true;
        mIsOverridden_setMenuVisibilityBn = true;
        mIsOverridden_setReenterTransitionOt = true;
        mIsOverridden_setRetainInstanceBn = true;
        mIsOverridden_setReturnTransitionOt = true;
        mIsOverridden_setSharedElementEnterTransitionOt = true;
        mIsOverridden_setSharedElementReturnTransitionOt = true;
        mIsOverridden_setTargetFragmentFtIr = true;
        mIsOverridden_setUserVisibleHintBn = true;
        mIsOverridden_shouldShowRequestPermissionRationaleSg = true;
        mIsOverridden_startActivityIt = true;
        mIsOverridden_startActivityItBe = true;
        mIsOverridden_startActivityForResultItIr = true;
        mIsOverridden_startActivityForResultItIrBe = true;
        mIsOverridden_startIntentSenderForResultIrIrItIrIrIrBe = true;
        mIsOverridden_toString = true;
        mIsOverridden_unregisterForContextMenuVw = true;

        return super.addPlugin(plugin);
    }

    public void dump(final String prefix, final FileDescriptor fd, final PrintWriter writer,
            final String[] args) {
        if (!mIsOverridden_dumpSgFrPrSg) {
            getOriginal().super_dump(prefix, fd, writer, args);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_dumpSgFrPrSg < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_dumpSgFrPrSg++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("dump(String, FileDescriptor, PrintWriter, String[])");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("dump", String.class,
                        FileDescriptor.class, PrintWriter.class, String[].class);
                mMethodImplementingPlugins
                        .put("dump(String, FileDescriptor, PrintWriter, String[])",
                                implementingPlugins);
                mIsOverridden_dumpSgFrPrSg = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_getAllowEnterTransitionOverlap) {
            return getOriginal().super_getAllowEnterTransitionOverlap();
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_getAllowEnterTransitionOverlap < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getAllowEnterTransitionOverlap++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getAllowEnterTransitionOverlap()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getAllowEnterTransitionOverlap");
                mMethodImplementingPlugins
                        .put("getAllowEnterTransitionOverlap()", implementingPlugins);
                mIsOverridden_getAllowEnterTransitionOverlap = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_getAllowReturnTransitionOverlap) {
            return getOriginal().super_getAllowReturnTransitionOverlap();
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_getAllowReturnTransitionOverlap < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getAllowReturnTransitionOverlap++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getAllowReturnTransitionOverlap()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getAllowReturnTransitionOverlap");
                mMethodImplementingPlugins
                        .put("getAllowReturnTransitionOverlap()", implementingPlugins);
                mIsOverridden_getAllowReturnTransitionOverlap = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_getContext) {
            return getOriginal().super_getContext();
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_getContext < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getContext++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getContext()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getContext");
                mMethodImplementingPlugins.put("getContext()", implementingPlugins);
                mIsOverridden_getContext = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_getEnterTransition) {
            return getOriginal().super_getEnterTransition();
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_getEnterTransition < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getEnterTransition++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getEnterTransition()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getEnterTransition");
                mMethodImplementingPlugins.put("getEnterTransition()", implementingPlugins);
                mIsOverridden_getEnterTransition = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_getExitTransition) {
            return getOriginal().super_getExitTransition();
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_getExitTransition < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getExitTransition++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getExitTransition()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getExitTransition");
                mMethodImplementingPlugins.put("getExitTransition()", implementingPlugins);
                mIsOverridden_getExitTransition = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_getLayoutInflaterBe) {
            return getOriginal().super_getLayoutInflater(savedInstanceState);
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_getLayoutInflaterBe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getLayoutInflaterBe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getLayoutInflater(Bundle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getLayoutInflater", Bundle.class);
                mMethodImplementingPlugins.put("getLayoutInflater(Bundle)", implementingPlugins);
                mIsOverridden_getLayoutInflaterBe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_getLoaderManager) {
            return getOriginal().super_getLoaderManager();
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_getLoaderManager < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getLoaderManager++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getLoaderManager()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getLoaderManager");
                mMethodImplementingPlugins.put("getLoaderManager()", implementingPlugins);
                mIsOverridden_getLoaderManager = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_getReenterTransition) {
            return getOriginal().super_getReenterTransition();
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_getReenterTransition < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getReenterTransition++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getReenterTransition()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getReenterTransition");
                mMethodImplementingPlugins.put("getReenterTransition()", implementingPlugins);
                mIsOverridden_getReenterTransition = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_getReturnTransition) {
            return getOriginal().super_getReturnTransition();
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_getReturnTransition < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getReturnTransition++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getReturnTransition()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getReturnTransition");
                mMethodImplementingPlugins.put("getReturnTransition()", implementingPlugins);
                mIsOverridden_getReturnTransition = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_getSharedElementEnterTransition) {
            return getOriginal().super_getSharedElementEnterTransition();
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_getSharedElementEnterTransition < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getSharedElementEnterTransition++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getSharedElementEnterTransition()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getSharedElementEnterTransition");
                mMethodImplementingPlugins
                        .put("getSharedElementEnterTransition()", implementingPlugins);
                mIsOverridden_getSharedElementEnterTransition = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_getSharedElementReturnTransition) {
            return getOriginal().super_getSharedElementReturnTransition();
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_getSharedElementReturnTransition < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getSharedElementReturnTransition++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getSharedElementReturnTransition()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getSharedElementReturnTransition");
                mMethodImplementingPlugins
                        .put("getSharedElementReturnTransition()", implementingPlugins);
                mIsOverridden_getSharedElementReturnTransition = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_getUserVisibleHint) {
            return getOriginal().super_getUserVisibleHint();
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_getUserVisibleHint < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getUserVisibleHint++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getUserVisibleHint()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getUserVisibleHint");
                mMethodImplementingPlugins.put("getUserVisibleHint()", implementingPlugins);
                mIsOverridden_getUserVisibleHint = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_getView) {
            return getOriginal().super_getView();
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_getView < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getView++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins.get("getView()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getView");
                mMethodImplementingPlugins.put("getView()", implementingPlugins);
                mIsOverridden_getView = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_onActivityCreatedBe) {
            getOriginal().super_onActivityCreated(savedInstanceState);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_onActivityCreatedBe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onActivityCreatedBe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onActivityCreated(Bundle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onActivityCreated", Bundle.class);
                mMethodImplementingPlugins.put("onActivityCreated(Bundle)", implementingPlugins);
                mIsOverridden_onActivityCreatedBe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_onActivityResultIrIrIt) {
            getOriginal().super_onActivityResult(requestCode, resultCode, data);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_onActivityResultIrIrIt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onActivityResultIrIrIt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onActivityResult(Integer, Integer, Intent)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onActivityResult", Integer.class,
                        Integer.class, Intent.class);
                mMethodImplementingPlugins
                        .put("onActivityResult(Integer, Integer, Intent)", implementingPlugins);
                mIsOverridden_onActivityResultIrIrIt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_onAttachCt) {
            getOriginal().super_onAttach(context);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_onAttachCt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onAttachCt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onAttach(Context)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onAttach", Context.class);
                mMethodImplementingPlugins.put("onAttach(Context)", implementingPlugins);
                mIsOverridden_onAttachCt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_onAttachAy) {
            getOriginal().super_onAttach(activity);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_onAttachAy < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onAttachAy++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onAttach(Activity)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onAttach", Activity.class);
                mMethodImplementingPlugins.put("onAttach(Activity)", implementingPlugins);
                mIsOverridden_onAttachAy = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_onAttachFragmentFt) {
            getOriginal().super_onAttachFragment(childFragment);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_onAttachFragmentFt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onAttachFragmentFt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onAttachFragment(Fragment)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onAttachFragment", Fragment.class);
                mMethodImplementingPlugins.put("onAttachFragment(Fragment)", implementingPlugins);
                mIsOverridden_onAttachFragmentFt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_onConfigurationChangedCn) {
            getOriginal().super_onConfigurationChanged(newConfig);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_onConfigurationChangedCn < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onConfigurationChangedCn++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onConfigurationChanged(Configuration)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onConfigurationChanged",
                        Configuration.class);
                mMethodImplementingPlugins
                        .put("onConfigurationChanged(Configuration)", implementingPlugins);
                mIsOverridden_onConfigurationChangedCn = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_onContextItemSelectedMm) {
            return getOriginal().super_onContextItemSelected(item);
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_onContextItemSelectedMm < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onContextItemSelectedMm++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onContextItemSelected(MenuItem)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onContextItemSelected",
                        MenuItem.class);
                mMethodImplementingPlugins
                        .put("onContextItemSelected(MenuItem)", implementingPlugins);
                mIsOverridden_onContextItemSelectedMm = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_onCreateBe) {
            getOriginal().super_onCreate(savedInstanceState);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_onCreateBe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onCreateBe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onCreate(Bundle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onCreate", Bundle.class);
                mMethodImplementingPlugins.put("onCreate(Bundle)", implementingPlugins);
                mIsOverridden_onCreateBe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_onCreateAnimationIrBnIr) {
            return getOriginal().super_onCreateAnimation(transit, enter, nextAnim);
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_onCreateAnimationIrBnIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onCreateAnimationIrBnIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onCreateAnimation(Integer, Boolean, Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onCreateAnimation", Integer.TYPE,
                        Boolean.TYPE, Integer.TYPE);
                mMethodImplementingPlugins
                        .put("onCreateAnimation(Integer, Boolean, Integer)", implementingPlugins);
                mIsOverridden_onCreateAnimationIrBnIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_onCreateContextMenuCuVwCo) {
            getOriginal().super_onCreateContextMenu(menu, v, menuInfo);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_onCreateContextMenuCuVwCo < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onCreateContextMenuCuVwCo++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onCreateContextMenu(ContextMenu, View, ContextMenu.ContextMenuInfo)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onCreateContextMenu",
                        ContextMenu.class, View.class, ContextMenu.ContextMenuInfo.class);
                mMethodImplementingPlugins
                        .put("onCreateContextMenu(ContextMenu, View, ContextMenu.ContextMenuInfo)",
                                implementingPlugins);
                mIsOverridden_onCreateContextMenuCuVwCo = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_onCreateOptionsMenuMuMr) {
            getOriginal().super_onCreateOptionsMenu(menu, inflater);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_onCreateOptionsMenuMuMr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onCreateOptionsMenuMuMr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onCreateOptionsMenu(Menu, MenuInflater)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onCreateOptionsMenu", Menu.class,
                        MenuInflater.class);
                mMethodImplementingPlugins
                        .put("onCreateOptionsMenu(Menu, MenuInflater)", implementingPlugins);
                mIsOverridden_onCreateOptionsMenuMuMr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_onCreateViewLrVpBe) {
            return getOriginal().super_onCreateView(inflater, container, savedInstanceState);
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_onCreateViewLrVpBe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onCreateViewLrVpBe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onCreateView(LayoutInflater, ViewGroup, Bundle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onCreateView", LayoutInflater.class,
                        ViewGroup.class, Bundle.class);
                mMethodImplementingPlugins.put("onCreateView(LayoutInflater, ViewGroup, Bundle)",
                        implementingPlugins);
                mIsOverridden_onCreateViewLrVpBe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_onDestroy) {
            getOriginal().super_onDestroy();
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_onDestroy < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onDestroy++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onDestroy()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onDestroy");
                mMethodImplementingPlugins.put("onDestroy()", implementingPlugins);
                mIsOverridden_onDestroy = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_onDestroyOptionsMenu) {
            getOriginal().super_onDestroyOptionsMenu();
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_onDestroyOptionsMenu < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onDestroyOptionsMenu++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onDestroyOptionsMenu()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onDestroyOptionsMenu");
                mMethodImplementingPlugins.put("onDestroyOptionsMenu()", implementingPlugins);
                mIsOverridden_onDestroyOptionsMenu = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_onDestroyView) {
            getOriginal().super_onDestroyView();
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_onDestroyView < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onDestroyView++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onDestroyView()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onDestroyView");
                mMethodImplementingPlugins.put("onDestroyView()", implementingPlugins);
                mIsOverridden_onDestroyView = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_onDetach) {
            getOriginal().super_onDetach();
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_onDetach < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onDetach++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins.get("onDetach()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onDetach");
                mMethodImplementingPlugins.put("onDetach()", implementingPlugins);
                mIsOverridden_onDetach = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_onHiddenChangedBn) {
            getOriginal().super_onHiddenChanged(hidden);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_onHiddenChangedBn < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onHiddenChangedBn++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onHiddenChanged(Boolean)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onHiddenChanged", Boolean.class);
                mMethodImplementingPlugins.put("onHiddenChanged(Boolean)", implementingPlugins);
                mIsOverridden_onHiddenChangedBn = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_onInflateCtAtBe) {
            getOriginal().super_onInflate(context, attrs, savedInstanceState);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_onInflateCtAtBe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onInflateCtAtBe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onInflate(Context, AttributeSet, Bundle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onInflate", Context.class,
                        AttributeSet.class, Bundle.class);
                mMethodImplementingPlugins
                        .put("onInflate(Context, AttributeSet, Bundle)", implementingPlugins);
                mIsOverridden_onInflateCtAtBe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_onInflateAyAtBe) {
            getOriginal().super_onInflate(activity, attrs, savedInstanceState);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_onInflateAyAtBe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onInflateAyAtBe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onInflate(Activity, AttributeSet, Bundle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onInflate", Activity.class,
                        AttributeSet.class, Bundle.class);
                mMethodImplementingPlugins
                        .put("onInflate(Activity, AttributeSet, Bundle)", implementingPlugins);
                mIsOverridden_onInflateAyAtBe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_onLowMemory) {
            getOriginal().super_onLowMemory();
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_onLowMemory < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onLowMemory++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onLowMemory()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onLowMemory");
                mMethodImplementingPlugins.put("onLowMemory()", implementingPlugins);
                mIsOverridden_onLowMemory = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_onMultiWindowModeChangedBn) {
            getOriginal().super_onMultiWindowModeChanged(isInMultiWindowMode);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_onMultiWindowModeChangedBn < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onMultiWindowModeChangedBn++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onMultiWindowModeChanged(Boolean)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onMultiWindowModeChanged",
                        Boolean.class);
                mMethodImplementingPlugins
                        .put("onMultiWindowModeChanged(Boolean)", implementingPlugins);
                mIsOverridden_onMultiWindowModeChangedBn = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_onOptionsItemSelectedMm) {
            return getOriginal().super_onOptionsItemSelected(item);
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_onOptionsItemSelectedMm < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onOptionsItemSelectedMm++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onOptionsItemSelected(MenuItem)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onOptionsItemSelected",
                        MenuItem.class);
                mMethodImplementingPlugins
                        .put("onOptionsItemSelected(MenuItem)", implementingPlugins);
                mIsOverridden_onOptionsItemSelectedMm = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_onOptionsMenuClosedMu) {
            getOriginal().super_onOptionsMenuClosed(menu);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_onOptionsMenuClosedMu < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onOptionsMenuClosedMu++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onOptionsMenuClosed(Menu)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onOptionsMenuClosed", Menu.class);
                mMethodImplementingPlugins.put("onOptionsMenuClosed(Menu)", implementingPlugins);
                mIsOverridden_onOptionsMenuClosedMu = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_onPause) {
            getOriginal().super_onPause();
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_onPause < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onPause++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins.get("onPause()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onPause");
                mMethodImplementingPlugins.put("onPause()", implementingPlugins);
                mIsOverridden_onPause = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_onPictureInPictureModeChangedBn) {
            getOriginal().super_onPictureInPictureModeChanged(isInPictureInPictureMode);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_onPictureInPictureModeChangedBn < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onPictureInPictureModeChangedBn++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onPictureInPictureModeChanged(Boolean)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onPictureInPictureModeChanged",
                        Boolean.class);
                mMethodImplementingPlugins
                        .put("onPictureInPictureModeChanged(Boolean)", implementingPlugins);
                mIsOverridden_onPictureInPictureModeChangedBn = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_onPrepareOptionsMenuMu) {
            getOriginal().super_onPrepareOptionsMenu(menu);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_onPrepareOptionsMenuMu < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onPrepareOptionsMenuMu++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onPrepareOptionsMenu(Menu)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onPrepareOptionsMenu", Menu.class);
                mMethodImplementingPlugins.put("onPrepareOptionsMenu(Menu)", implementingPlugins);
                mIsOverridden_onPrepareOptionsMenuMu = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_onRequestPermissionsResultIrSgit) {
            getOriginal().super_onRequestPermissionsResult(requestCode, permissions, grantResults);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_onRequestPermissionsResultIrSgit < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onRequestPermissionsResultIrSgit++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onRequestPermissionsResult(Integer, String[], int[])");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onRequestPermissionsResult",
                        Integer.class, String[].class, int[].class);
                mMethodImplementingPlugins
                        .put("onRequestPermissionsResult(Integer, String[], int[])",
                                implementingPlugins);
                mIsOverridden_onRequestPermissionsResultIrSgit = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_onResume) {
            getOriginal().super_onResume();
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_onResume < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onResume++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins.get("onResume()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onResume");
                mMethodImplementingPlugins.put("onResume()", implementingPlugins);
                mIsOverridden_onResume = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_onSaveInstanceStateBe) {
            getOriginal().super_onSaveInstanceState(outState);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_onSaveInstanceStateBe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onSaveInstanceStateBe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onSaveInstanceState(Bundle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onSaveInstanceState", Bundle.class);
                mMethodImplementingPlugins.put("onSaveInstanceState(Bundle)", implementingPlugins);
                mIsOverridden_onSaveInstanceStateBe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_onStart) {
            getOriginal().super_onStart();
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_onStart < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onStart++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins.get("onStart()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onStart");
                mMethodImplementingPlugins.put("onStart()", implementingPlugins);
                mIsOverridden_onStart = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_onStop) {
            getOriginal().super_onStop();
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_onStop < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onStop++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins.get("onStop()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onStop");
                mMethodImplementingPlugins.put("onStop()", implementingPlugins);
                mIsOverridden_onStop = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_onViewCreatedVwBe) {
            getOriginal().super_onViewCreated(view, savedInstanceState);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_onViewCreatedVwBe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onViewCreatedVwBe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onViewCreated(View, Bundle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onViewCreated", View.class,
                        Bundle.class);
                mMethodImplementingPlugins.put("onViewCreated(View, Bundle)", implementingPlugins);
                mIsOverridden_onViewCreatedVwBe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_onViewStateRestoredBe) {
            getOriginal().super_onViewStateRestored(savedInstanceState);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_onViewStateRestoredBe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onViewStateRestoredBe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onViewStateRestored(Bundle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onViewStateRestored", Bundle.class);
                mMethodImplementingPlugins.put("onViewStateRestored(Bundle)", implementingPlugins);
                mIsOverridden_onViewStateRestoredBe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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

    public void registerForContextMenu(final View view) {
        if (!mIsOverridden_registerForContextMenuVw) {
            getOriginal().super_registerForContextMenu(view);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_registerForContextMenuVw < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_registerForContextMenuVw++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("registerForContextMenu(View)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("registerForContextMenu", View.class);
                mMethodImplementingPlugins.put("registerForContextMenu(View)", implementingPlugins);
                mIsOverridden_registerForContextMenuVw = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_setAllowEnterTransitionOverlapBn) {
            getOriginal().super_setAllowEnterTransitionOverlap(allow);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_setAllowEnterTransitionOverlapBn < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setAllowEnterTransitionOverlapBn++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setAllowEnterTransitionOverlap(Boolean)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setAllowEnterTransitionOverlap",
                        Boolean.class);
                mMethodImplementingPlugins
                        .put("setAllowEnterTransitionOverlap(Boolean)", implementingPlugins);
                mIsOverridden_setAllowEnterTransitionOverlapBn = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_setAllowReturnTransitionOverlapBn) {
            getOriginal().super_setAllowReturnTransitionOverlap(allow);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_setAllowReturnTransitionOverlapBn < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setAllowReturnTransitionOverlapBn++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setAllowReturnTransitionOverlap(Boolean)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setAllowReturnTransitionOverlap",
                        Boolean.class);
                mMethodImplementingPlugins
                        .put("setAllowReturnTransitionOverlap(Boolean)", implementingPlugins);
                mIsOverridden_setAllowReturnTransitionOverlapBn = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_setArgumentsBe) {
            getOriginal().super_setArguments(args);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_setArgumentsBe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setArgumentsBe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setArguments(Bundle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setArguments", Bundle.class);
                mMethodImplementingPlugins.put("setArguments(Bundle)", implementingPlugins);
                mIsOverridden_setArgumentsBe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_setEnterSharedElementCallbackSk) {
            getOriginal().super_setEnterSharedElementCallback(callback);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_setEnterSharedElementCallbackSk < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setEnterSharedElementCallbackSk++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setEnterSharedElementCallback(SharedElementCallback)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setEnterSharedElementCallback",
                        SharedElementCallback.class);
                mMethodImplementingPlugins
                        .put("setEnterSharedElementCallback(SharedElementCallback)",
                                implementingPlugins);
                mIsOverridden_setEnterSharedElementCallbackSk = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_setEnterTransitionOt) {
            getOriginal().super_setEnterTransition(transition);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_setEnterTransitionOt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setEnterTransitionOt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setEnterTransition(Object)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setEnterTransition", Object.class);
                mMethodImplementingPlugins.put("setEnterTransition(Object)", implementingPlugins);
                mIsOverridden_setEnterTransitionOt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_setExitSharedElementCallbackSk) {
            getOriginal().super_setExitSharedElementCallback(callback);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_setExitSharedElementCallbackSk < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setExitSharedElementCallbackSk++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setExitSharedElementCallback(SharedElementCallback)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setExitSharedElementCallback",
                        SharedElementCallback.class);
                mMethodImplementingPlugins
                        .put("setExitSharedElementCallback(SharedElementCallback)",
                                implementingPlugins);
                mIsOverridden_setExitSharedElementCallbackSk = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_setExitTransitionOt) {
            getOriginal().super_setExitTransition(transition);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_setExitTransitionOt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setExitTransitionOt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setExitTransition(Object)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setExitTransition", Object.class);
                mMethodImplementingPlugins.put("setExitTransition(Object)", implementingPlugins);
                mIsOverridden_setExitTransitionOt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_setHasOptionsMenuBn) {
            getOriginal().super_setHasOptionsMenu(hasMenu);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_setHasOptionsMenuBn < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setHasOptionsMenuBn++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setHasOptionsMenu(Boolean)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setHasOptionsMenu", Boolean.class);
                mMethodImplementingPlugins.put("setHasOptionsMenu(Boolean)", implementingPlugins);
                mIsOverridden_setHasOptionsMenuBn = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_setInitialSavedStateSe) {
            getOriginal().super_setInitialSavedState(state);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_setInitialSavedStateSe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setInitialSavedStateSe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setInitialSavedState(Fragment.SavedState)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setInitialSavedState",
                        Fragment.SavedState.class);
                mMethodImplementingPlugins
                        .put("setInitialSavedState(Fragment.SavedState)", implementingPlugins);
                mIsOverridden_setInitialSavedStateSe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_setMenuVisibilityBn) {
            getOriginal().super_setMenuVisibility(menuVisible);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_setMenuVisibilityBn < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setMenuVisibilityBn++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setMenuVisibility(Boolean)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setMenuVisibility", Boolean.class);
                mMethodImplementingPlugins.put("setMenuVisibility(Boolean)", implementingPlugins);
                mIsOverridden_setMenuVisibilityBn = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_setReenterTransitionOt) {
            getOriginal().super_setReenterTransition(transition);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_setReenterTransitionOt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setReenterTransitionOt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setReenterTransition(Object)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setReenterTransition", Object.class);
                mMethodImplementingPlugins.put("setReenterTransition(Object)", implementingPlugins);
                mIsOverridden_setReenterTransitionOt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_setRetainInstanceBn) {
            getOriginal().super_setRetainInstance(retain);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_setRetainInstanceBn < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setRetainInstanceBn++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setRetainInstance(Boolean)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setRetainInstance", Boolean.class);
                mMethodImplementingPlugins.put("setRetainInstance(Boolean)", implementingPlugins);
                mIsOverridden_setRetainInstanceBn = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_setReturnTransitionOt) {
            getOriginal().super_setReturnTransition(transition);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_setReturnTransitionOt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setReturnTransitionOt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setReturnTransition(Object)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setReturnTransition", Object.class);
                mMethodImplementingPlugins.put("setReturnTransition(Object)", implementingPlugins);
                mIsOverridden_setReturnTransitionOt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_setSharedElementEnterTransitionOt) {
            getOriginal().super_setSharedElementEnterTransition(transition);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_setSharedElementEnterTransitionOt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setSharedElementEnterTransitionOt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setSharedElementEnterTransition(Object)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setSharedElementEnterTransition",
                        Object.class);
                mMethodImplementingPlugins
                        .put("setSharedElementEnterTransition(Object)", implementingPlugins);
                mIsOverridden_setSharedElementEnterTransitionOt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_setSharedElementReturnTransitionOt) {
            getOriginal().super_setSharedElementReturnTransition(transition);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_setSharedElementReturnTransitionOt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setSharedElementReturnTransitionOt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setSharedElementReturnTransition(Object)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setSharedElementReturnTransition",
                        Object.class);
                mMethodImplementingPlugins
                        .put("setSharedElementReturnTransition(Object)", implementingPlugins);
                mIsOverridden_setSharedElementReturnTransitionOt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_setTargetFragmentFtIr) {
            getOriginal().super_setTargetFragment(fragment, requestCode);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_setTargetFragmentFtIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setTargetFragmentFtIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setTargetFragment(Fragment, Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setTargetFragment", Fragment.class,
                        Integer.class);
                mMethodImplementingPlugins
                        .put("setTargetFragment(Fragment, Integer)", implementingPlugins);
                mIsOverridden_setTargetFragmentFtIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_setUserVisibleHintBn) {
            getOriginal().super_setUserVisibleHint(isVisibleToUser);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_setUserVisibleHintBn < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setUserVisibleHintBn++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setUserVisibleHint(Boolean)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setUserVisibleHint", Boolean.class);
                mMethodImplementingPlugins.put("setUserVisibleHint(Boolean)", implementingPlugins);
                mIsOverridden_setUserVisibleHintBn = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_shouldShowRequestPermissionRationaleSg) {
            return getOriginal().super_shouldShowRequestPermissionRationale(permission);
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_shouldShowRequestPermissionRationaleSg < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_shouldShowRequestPermissionRationaleSg++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("shouldShowRequestPermissionRationale(String)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("shouldShowRequestPermissionRationale",
                        String.class);
                mMethodImplementingPlugins
                        .put("shouldShowRequestPermissionRationale(String)", implementingPlugins);
                mIsOverridden_shouldShowRequestPermissionRationaleSg = implementingPlugins.size()
                        > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_startActivityIt) {
            getOriginal().super_startActivity(intent);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_startActivityIt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_startActivityIt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("startActivity(Intent)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("startActivity", Intent.class);
                mMethodImplementingPlugins.put("startActivity(Intent)", implementingPlugins);
                mIsOverridden_startActivityIt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_startActivityItBe) {
            getOriginal().super_startActivity(intent, options);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_startActivityItBe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_startActivityItBe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("startActivity(Intent, Bundle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("startActivity", Intent.class,
                        Bundle.class);
                mMethodImplementingPlugins
                        .put("startActivity(Intent, Bundle)", implementingPlugins);
                mIsOverridden_startActivityItBe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_startActivityForResultItIr) {
            getOriginal().super_startActivityForResult(intent, requestCode);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_startActivityForResultItIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_startActivityForResultItIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("startActivityForResult(Intent, Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("startActivityForResult", Intent.class,
                        Integer.class);
                mMethodImplementingPlugins
                        .put("startActivityForResult(Intent, Integer)", implementingPlugins);
                mIsOverridden_startActivityForResultItIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_startActivityForResultItIrBe) {
            getOriginal().super_startActivityForResult(intent, requestCode, options);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_startActivityForResultItIrBe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_startActivityForResultItIrBe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("startActivityForResult(Intent, Integer, Bundle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("startActivityForResult", Intent.class,
                        Integer.class, Bundle.class);
                mMethodImplementingPlugins.put("startActivityForResult(Intent, Integer, Bundle)",
                        implementingPlugins);
                mIsOverridden_startActivityForResultItIrBe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_startIntentSenderForResultIrIrItIrIrIrBe) {
            getOriginal()
                    .super_startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask,
                            flagsValues, extraFlags, options);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_startIntentSenderForResultIrIrItIrIrIrBe
                < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_startIntentSenderForResultIrIrItIrIrIrBe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("startIntentSenderForResult(IntentSender, Integer, Intent, Integer, Integer, Integer, Bundle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("startIntentSenderForResult",
                        IntentSender.class, Integer.class, Intent.class, Integer.class,
                        Integer.class, Integer.class, Bundle.class);
                mMethodImplementingPlugins
                        .put("startIntentSenderForResult(IntentSender, Integer, Intent, Integer, Integer, Integer, Bundle)",
                                implementingPlugins);
                mIsOverridden_startIntentSenderForResultIrIrItIrIrIrBe = implementingPlugins.size()
                        > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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

    public String toString() {
        if (!mIsOverridden_toString) {
            return getOriginal().super_toString();
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_toString < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_toString++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins.get("toString()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("toString");
                mMethodImplementingPlugins.put("toString()", implementingPlugins);
                mIsOverridden_toString = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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
        if (!mIsOverridden_unregisterForContextMenuVw) {
            getOriginal().super_unregisterForContextMenu(view);
            return;
        }

        final ListIterator<FragmentPlugin> iterator;
        if (mCallCount_unregisterForContextMenuVw < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_unregisterForContextMenuVw++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<FragmentPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("unregisterForContextMenu(View)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("unregisterForContextMenu",
                        View.class);
                mMethodImplementingPlugins
                        .put("unregisterForContextMenu(View)", implementingPlugins);
                mIsOverridden_unregisterForContextMenuVw = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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


    private List<FragmentPlugin> getImplementingPlugins(final String methodName,
            final Class<?>... parameterTypes) {
        synchronized (mPlugins) {
            final ArrayList<FragmentPlugin> implementingPlugins = new ArrayList<>();
            for (int i = 0; i < mPlugins.size(); i++) {
                final FragmentPlugin plugin = mPlugins.get(i);
                if (plugin.isMethodOverridden(methodName, parameterTypes)) {
                    implementingPlugins.add(plugin);
                }
            }
            return implementingPlugins;
        }
    }


}