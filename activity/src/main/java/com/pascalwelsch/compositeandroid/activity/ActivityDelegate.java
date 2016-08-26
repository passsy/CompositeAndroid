package com.pascalwelsch.compositeandroid.activity;

import com.pascalwelsch.compositeandroid.core.AbstractDelegate;
import com.pascalwelsch.compositeandroid.core.CallFun0;
import com.pascalwelsch.compositeandroid.core.CallFun1;
import com.pascalwelsch.compositeandroid.core.CallFun2;
import com.pascalwelsch.compositeandroid.core.CallFun3;
import com.pascalwelsch.compositeandroid.core.CallFun4;
import com.pascalwelsch.compositeandroid.core.CallFun6;
import com.pascalwelsch.compositeandroid.core.CallVoid0;
import com.pascalwelsch.compositeandroid.core.CallVoid1;
import com.pascalwelsch.compositeandroid.core.CallVoid2;
import com.pascalwelsch.compositeandroid.core.CallVoid3;
import com.pascalwelsch.compositeandroid.core.CallVoid4;
import com.pascalwelsch.compositeandroid.core.CallVoid5;
import com.pascalwelsch.compositeandroid.core.CallVoid6;
import com.pascalwelsch.compositeandroid.core.CallVoid7;
import com.pascalwelsch.compositeandroid.core.CallVoid8;
import com.pascalwelsch.compositeandroid.core.Removable;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Dialog;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.app.VoiceInteractor;
import android.app.assist.AssistContent;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.support.annotation.VisibleForTesting;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.LoaderManager;
import android.support.v4.app.SharedElementCallback;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.view.ActionMode;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Toolbar;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;

public class ActivityDelegate extends AbstractDelegate<ICompositeActivity, ActivityPlugin> {

    @VisibleForTesting
    static final int CALL_COUNT_OPTIMIZATION_THRESHOLD = 100;

    private int mCallCount_addContentViewVwVs = 0;

    private int mCallCount_applyOverrideConfigurationCn = 0;

    private int mCallCount_attachBaseContextCt = 0;

    private int mCallCount_bindServiceItSnIr = 0;

    private int mCallCount_checkCallingOrSelfPermissionSg = 0;

    private int mCallCount_checkCallingOrSelfUriPermissionUiIr = 0;

    private int mCallCount_checkCallingPermissionSg = 0;

    private int mCallCount_checkCallingUriPermissionUiIr = 0;

    private int mCallCount_checkPermissionSgIrIr = 0;

    private int mCallCount_checkSelfPermissionSg = 0;

    private int mCallCount_checkUriPermissionUiIrIrIr = 0;

    private int mCallCount_checkUriPermissionUiSgSgIrIrIr = 0;

    private int mCallCount_clearWallpaper = 0;

    private int mCallCount_closeContextMenu = 0;

    private int mCallCount_closeOptionsMenu = 0;

    private int mCallCount_createConfigurationContextCn = 0;

    private int mCallCount_createDisplayContextDy = 0;

    private int mCallCount_createPackageContextSgIr = 0;

    private int mCallCount_createPendingResultIrItIr = 0;

    private int mCallCount_databaseList = 0;

    private int mCallCount_deleteDatabaseSg = 0;

    private int mCallCount_deleteFileSg = 0;

    private int mCallCount_dispatchGenericMotionEventMt = 0;

    private int mCallCount_dispatchKeyEventKt = 0;

    private int mCallCount_dispatchKeyShortcutEventKt = 0;

    private int mCallCount_dispatchPopulateAccessibilityEventAt = 0;

    private int mCallCount_dispatchTouchEventMt = 0;

    private int mCallCount_dispatchTrackballEventMt = 0;

    private int mCallCount_dumpSgFrPrSg = 0;

    private int mCallCount_enforceCallingOrSelfPermissionSgSg = 0;

    private int mCallCount_enforceCallingOrSelfUriPermissionUiIrSg = 0;

    private int mCallCount_enforceCallingPermissionSgSg = 0;

    private int mCallCount_enforceCallingUriPermissionUiIrSg = 0;

    private int mCallCount_enforcePermissionSgIrIrSg = 0;

    private int mCallCount_enforceUriPermissionUiIrIrIrSg = 0;

    private int mCallCount_enforceUriPermissionUiSgSgIrIrIrSg = 0;

    private int mCallCount_fileList = 0;

    private int mCallCount_findViewByIdIr = 0;

    private int mCallCount_finish = 0;

    private int mCallCount_finishActivityFromChildAyIr = 0;

    private int mCallCount_finishActivityIr = 0;

    private int mCallCount_finishAffinity = 0;

    private int mCallCount_finishAfterTransition = 0;

    private int mCallCount_finishAndRemoveTask = 0;

    private int mCallCount_finishFromChildAy = 0;

    private int mCallCount_getActionBar = 0;

    private int mCallCount_getApplicationContext = 0;

    private int mCallCount_getApplicationInfo = 0;

    private int mCallCount_getAssets = 0;

    private int mCallCount_getBaseContext = 0;

    private int mCallCount_getCacheDir = 0;

    private int mCallCount_getCallingActivity = 0;

    private int mCallCount_getCallingPackage = 0;

    private int mCallCount_getChangingConfigurations = 0;

    private int mCallCount_getClassLoader = 0;

    private int mCallCount_getCodeCacheDir = 0;

    private int mCallCount_getComponentName = 0;

    private int mCallCount_getContentResolver = 0;

    private int mCallCount_getContentScene = 0;

    private int mCallCount_getContentTransitionManager = 0;

    private int mCallCount_getCurrentFocus = 0;

    private int mCallCount_getDatabasePathSg = 0;

    private int mCallCount_getDelegate = 0;

    private int mCallCount_getDirSgIr = 0;

    private int mCallCount_getDrawerToggleDelegate = 0;

    private int mCallCount_getExternalCacheDir = 0;

    private int mCallCount_getExternalCacheDirs = 0;

    private int mCallCount_getExternalFilesDirSg = 0;

    private int mCallCount_getExternalFilesDirsSg = 0;

    private int mCallCount_getExternalMediaDirs = 0;

    private int mCallCount_getFileStreamPathSg = 0;

    private int mCallCount_getFilesDir = 0;

    private int mCallCount_getFragmentManager = 0;

    private int mCallCount_getIntent = 0;

    private int mCallCount_getLayoutInflater = 0;

    private int mCallCount_getLoaderManager = 0;

    private int mCallCount_getLocalClassName = 0;

    private int mCallCount_getMainLooper = 0;

    private int mCallCount_getMenuInflater = 0;

    private int mCallCount_getNoBackupFilesDir = 0;

    private int mCallCount_getObbDir = 0;

    private int mCallCount_getObbDirs = 0;

    private int mCallCount_getPackageCodePath = 0;

    private int mCallCount_getPackageManager = 0;

    private int mCallCount_getPackageName = 0;

    private int mCallCount_getPackageResourcePath = 0;

    private int mCallCount_getParentActivityIntent = 0;

    private int mCallCount_getPreferencesIr = 0;

    private int mCallCount_getReferrer = 0;

    private int mCallCount_getRequestedOrientation = 0;

    private int mCallCount_getResources = 0;

    private int mCallCount_getSharedPreferencesSgIr = 0;

    private int mCallCount_getSupportActionBar = 0;

    private int mCallCount_getSupportFragmentManager = 0;

    private int mCallCount_getSupportLoaderManager = 0;

    private int mCallCount_getSupportParentActivityIntent = 0;

    private int mCallCount_getSystemServiceNameCs = 0;

    private int mCallCount_getSystemServiceSg = 0;

    private int mCallCount_getTaskId = 0;

    private int mCallCount_getTheme = 0;

    private int mCallCount_getVoiceInteractor = 0;

    private int mCallCount_getWallpaper = 0;

    private int mCallCount_getWallpaperDesiredMinimumHeight = 0;

    private int mCallCount_getWallpaperDesiredMinimumWidth = 0;

    private int mCallCount_getWindow = 0;

    private int mCallCount_getWindowManager = 0;

    private int mCallCount_grantUriPermissionSgUiIr = 0;

    private int mCallCount_hasWindowFocus = 0;

    private int mCallCount_invalidateOptionsMenu = 0;

    private int mCallCount_isChangingConfigurations = 0;

    private int mCallCount_isDestroyed = 0;

    private int mCallCount_isFinishing = 0;

    private int mCallCount_isImmersive = 0;

    private int mCallCount_isRestricted = 0;

    private int mCallCount_isTaskRoot = 0;

    private int mCallCount_isVoiceInteraction = 0;

    private int mCallCount_isVoiceInteractionRoot = 0;

    private int mCallCount_moveTaskToBackBn = 0;

    private int mCallCount_navigateUpToFromChildAyIt = 0;

    private int mCallCount_navigateUpToIt = 0;

    private int mCallCount_onActionModeFinishedae = 0;

    private int mCallCount_onActionModeStartedae = 0;

    private int mCallCount_onActivityReenterIrIt = 0;

    private int mCallCount_onActivityResultIrIrIt = 0;

    private int mCallCount_onApplyThemeResourceReIrBn = 0;

    private int mCallCount_onAttachFragmentFt = 0;

    private int mCallCount_onAttachFragmentat = 0;

    private int mCallCount_onAttachedToWindow = 0;

    private int mCallCount_onBackPressed = 0;

    private int mCallCount_onChildTitleChangedAyCe = 0;

    private int mCallCount_onConfigurationChangedCn = 0;

    private int mCallCount_onContentChanged = 0;

    private int mCallCount_onContextItemSelectedMm = 0;

    private int mCallCount_onContextMenuClosedMu = 0;

    private int mCallCount_onCreateBe = 0;

    private int mCallCount_onCreateBePe = 0;

    private int mCallCount_onCreateContextMenuCuVwCo = 0;

    private int mCallCount_onCreateDescription = 0;

    private int mCallCount_onCreateDialogIr = 0;

    private int mCallCount_onCreateDialogIrBe = 0;

    private int mCallCount_onCreateNavigateUpTaskStackTr = 0;

    private int mCallCount_onCreateOptionsMenuMu = 0;

    private int mCallCount_onCreatePanelMenuIrMu = 0;

    private int mCallCount_onCreatePanelViewIr = 0;

    private int mCallCount_onCreateSupportNavigateUpTaskStackar = 0;

    private int mCallCount_onCreateThumbnailBpCs = 0;

    private int mCallCount_onCreateViewSgCtAt = 0;

    private int mCallCount_onCreateViewVwSgCtAt = 0;

    private int mCallCount_onDestroy = 0;

    private int mCallCount_onDetachedFromWindow = 0;

    private int mCallCount_onEnterAnimationComplete = 0;

    private int mCallCount_onGenericMotionEventMt = 0;

    private int mCallCount_onKeyDownIrKt = 0;

    private int mCallCount_onKeyLongPressIrKt = 0;

    private int mCallCount_onKeyMultipleIrIrKt = 0;

    private int mCallCount_onKeyShortcutIrKt = 0;

    private int mCallCount_onKeyUpIrKt = 0;

    private int mCallCount_onLowMemory = 0;

    private int mCallCount_onMenuOpenedIrMu = 0;

    private int mCallCount_onMultiWindowModeChangedBn = 0;

    private int mCallCount_onNavigateUp = 0;

    private int mCallCount_onNavigateUpFromChildAy = 0;

    private int mCallCount_onNewIntentIt = 0;

    private int mCallCount_onOptionsItemSelectedMm = 0;

    private int mCallCount_onOptionsMenuClosedMu = 0;

    private int mCallCount_onPanelClosedIrMu = 0;

    private int mCallCount_onPause = 0;

    private int mCallCount_onPictureInPictureModeChangedBn = 0;

    private int mCallCount_onPostCreateBe = 0;

    private int mCallCount_onPostCreateBePe = 0;

    private int mCallCount_onPostResume = 0;

    private int mCallCount_onPrepareDialogIrDg = 0;

    private int mCallCount_onPrepareDialogIrDgBe = 0;

    private int mCallCount_onPrepareNavigateUpTaskStackTr = 0;

    private int mCallCount_onPrepareOptionsMenuMu = 0;

    private int mCallCount_onPrepareOptionsPanelVwMu = 0;

    private int mCallCount_onPreparePanelIrVwMu = 0;

    private int mCallCount_onPrepareSupportNavigateUpTaskStackar = 0;

    private int mCallCount_onProvideAssistContentAt = 0;

    private int mCallCount_onProvideAssistDataBe = 0;

    private int mCallCount_onProvideReferrer = 0;

    private int mCallCount_onRequestPermissionsResultIrSgit = 0;

    private int mCallCount_onRestart = 0;

    private int mCallCount_onRestoreInstanceStateBe = 0;

    private int mCallCount_onRestoreInstanceStateBePe = 0;

    private int mCallCount_onResume = 0;

    private int mCallCount_onResumeFragments = 0;

    private int mCallCount_onSaveInstanceStateBe = 0;

    private int mCallCount_onSaveInstanceStateBePe = 0;

    private int mCallCount_onSearchRequested = 0;

    private int mCallCount_onSearchRequestedSt = 0;

    private int mCallCount_onStart = 0;

    private int mCallCount_onStateNotSaved = 0;

    private int mCallCount_onStop = 0;

    private int mCallCount_onSupportActionModeFinishedAe = 0;

    private int mCallCount_onSupportActionModeStartedAe = 0;

    private int mCallCount_onSupportContentChanged = 0;

    private int mCallCount_onSupportNavigateUp = 0;

    private int mCallCount_onTitleChangedCeIr = 0;

    private int mCallCount_onTouchEventMt = 0;

    private int mCallCount_onTrackballEventMt = 0;

    private int mCallCount_onTrimMemoryIr = 0;

    private int mCallCount_onUserInteraction = 0;

    private int mCallCount_onUserLeaveHint = 0;

    private int mCallCount_onVisibleBehindCanceled = 0;

    private int mCallCount_onWindowAttributesChangedWs = 0;

    private int mCallCount_onWindowFocusChangedBn = 0;

    private int mCallCount_onWindowStartingActionModeak = 0;

    private int mCallCount_onWindowStartingActionModeakIr = 0;

    private int mCallCount_onWindowStartingSupportActionModeAk = 0;

    private int mCallCount_openContextMenuVw = 0;

    private int mCallCount_openFileInputSg = 0;

    private int mCallCount_openFileOutputSgIr = 0;

    private int mCallCount_openOptionsMenu = 0;

    private int mCallCount_openOrCreateDatabaseSgIrSy = 0;

    private int mCallCount_openOrCreateDatabaseSgIrSyDr = 0;

    private int mCallCount_overridePendingTransitionIrIr = 0;

    private int mCallCount_peekWallpaper = 0;

    private int mCallCount_postponeEnterTransition = 0;

    private int mCallCount_recreate = 0;

    private int mCallCount_registerComponentCallbacksCs = 0;

    private int mCallCount_registerForContextMenuVw = 0;

    private int mCallCount_registerReceiverBrIr = 0;

    private int mCallCount_registerReceiverBrIrSgHr = 0;

    private int mCallCount_releaseInstance = 0;

    private int mCallCount_removeStickyBroadcastAsUserItUe = 0;

    private int mCallCount_removeStickyBroadcastIt = 0;

    private int mCallCount_reportFullyDrawn = 0;

    private int mCallCount_requestVisibleBehindBn = 0;

    private int mCallCount_revokeUriPermissionUiIr = 0;

    private int mCallCount_sendBroadcastAsUserItUe = 0;

    private int mCallCount_sendBroadcastAsUserItUeSg = 0;

    private int mCallCount_sendBroadcastIt = 0;

    private int mCallCount_sendBroadcastItSg = 0;

    private int mCallCount_sendOrderedBroadcastAsUserItUeSgBrHrIrSgBe = 0;

    private int mCallCount_sendOrderedBroadcastItSg = 0;

    private int mCallCount_sendOrderedBroadcastItSgBrHrIrSgBe = 0;

    private int mCallCount_sendStickyBroadcastAsUserItUe = 0;

    private int mCallCount_sendStickyBroadcastIt = 0;

    private int mCallCount_sendStickyOrderedBroadcastAsUserItUeBrHrIrSgBe = 0;

    private int mCallCount_sendStickyOrderedBroadcastItBrHrIrSgBe = 0;

    private int mCallCount_setActionBarTr = 0;

    private int mCallCount_setContentTransitionManagerTr = 0;

    private int mCallCount_setContentViewIr = 0;

    private int mCallCount_setContentViewVw = 0;

    private int mCallCount_setContentViewVwVs = 0;

    private int mCallCount_setEnterSharedElementCallbackSk = 0;

    private int mCallCount_setEnterSharedElementCallbackak = 0;

    private int mCallCount_setExitSharedElementCallbackSk = 0;

    private int mCallCount_setExitSharedElementCallbackak = 0;

    private int mCallCount_setFinishOnTouchOutsideBn = 0;

    private int mCallCount_setImmersiveBn = 0;

    private int mCallCount_setIntentIt = 0;

    private int mCallCount_setRequestedOrientationIr = 0;

    private int mCallCount_setSupportActionBarar = 0;

    private int mCallCount_setSupportProgressBarIndeterminateBn = 0;

    private int mCallCount_setSupportProgressBarIndeterminateVisibilityBn = 0;

    private int mCallCount_setSupportProgressBarVisibilityBn = 0;

    private int mCallCount_setSupportProgressIr = 0;

    private int mCallCount_setTaskDescriptionAn = 0;

    private int mCallCount_setThemeIr = 0;

    private int mCallCount_setTitleCe = 0;

    private int mCallCount_setTitleColorIr = 0;

    private int mCallCount_setTitleIr = 0;

    private int mCallCount_setVisibleBn = 0;

    private int mCallCount_setWallpaperBp = 0;

    private int mCallCount_setWallpaperIm = 0;

    private int mCallCount_shouldShowRequestPermissionRationaleSg = 0;

    private int mCallCount_shouldUpRecreateTaskIt = 0;

    private int mCallCount_showAssistBe = 0;

    private int mCallCount_showLockTaskEscapeMessage = 0;

    private int mCallCount_startActionModeak = 0;

    private int mCallCount_startActionModeakIr = 0;

    private int mCallCount_startActivitiesIt = 0;

    private int mCallCount_startActivitiesItBe = 0;

    private int mCallCount_startActivityForResultItIr = 0;

    private int mCallCount_startActivityForResultItIrBe = 0;

    private int mCallCount_startActivityFromChildAyItIr = 0;

    private int mCallCount_startActivityFromChildAyItIrBe = 0;

    private int mCallCount_startActivityFromFragmentFtItIr = 0;

    private int mCallCount_startActivityFromFragmentFtItIrBe = 0;

    private int mCallCount_startActivityFromFragmentatItIr = 0;

    private int mCallCount_startActivityFromFragmentatItIrBe = 0;

    private int mCallCount_startActivityIfNeededItIr = 0;

    private int mCallCount_startActivityIfNeededItIrBe = 0;

    private int mCallCount_startActivityIt = 0;

    private int mCallCount_startActivityItBe = 0;

    private int mCallCount_startInstrumentationCeSgBe = 0;

    private int mCallCount_startIntentSenderForResultIrIrItIrIrIr = 0;

    private int mCallCount_startIntentSenderForResultIrIrItIrIrIrBe = 0;

    private int mCallCount_startIntentSenderFromChildAyIrIrItIrIrIr = 0;

    private int mCallCount_startIntentSenderFromChildAyIrIrItIrIrIrBe = 0;

    private int mCallCount_startIntentSenderFromFragmentFtIrIrItIrIrIrBe = 0;

    private int mCallCount_startIntentSenderIrItIrIrIr = 0;

    private int mCallCount_startIntentSenderIrItIrIrIrBe = 0;

    private int mCallCount_startLockTask = 0;

    private int mCallCount_startManagingCursorCr = 0;

    private int mCallCount_startNextMatchingActivityIt = 0;

    private int mCallCount_startNextMatchingActivityItBe = 0;

    private int mCallCount_startPostponedEnterTransition = 0;

    private int mCallCount_startSearchSgBnBeBn = 0;

    private int mCallCount_startServiceIt = 0;

    private int mCallCount_startSupportActionModeAk = 0;

    private int mCallCount_stopLockTask = 0;

    private int mCallCount_stopManagingCursorCr = 0;

    private int mCallCount_stopServiceIt = 0;

    private int mCallCount_supportFinishAfterTransition = 0;

    private int mCallCount_supportInvalidateOptionsMenu = 0;

    private int mCallCount_supportNavigateUpToIt = 0;

    private int mCallCount_supportPostponeEnterTransition = 0;

    private int mCallCount_supportRequestWindowFeatureIr = 0;

    private int mCallCount_supportShouldUpRecreateTaskIt = 0;

    private int mCallCount_supportStartPostponedEnterTransition = 0;

    private int mCallCount_takeKeyEventsBn = 0;

    private int mCallCount_triggerSearchSgBe = 0;

    private int mCallCount_unbindServiceSn = 0;

    private int mCallCount_unregisterComponentCallbacksCs = 0;

    private int mCallCount_unregisterForContextMenuVw = 0;

    private int mCallCount_unregisterReceiverBr = 0;

    private boolean mIsOverridden_addContentViewVwVs = false;

    private boolean mIsOverridden_applyOverrideConfigurationCn = false;

    private boolean mIsOverridden_attachBaseContextCt = false;

    private boolean mIsOverridden_bindServiceItSnIr = false;

    private boolean mIsOverridden_checkCallingOrSelfPermissionSg = false;

    private boolean mIsOverridden_checkCallingOrSelfUriPermissionUiIr = false;

    private boolean mIsOverridden_checkCallingPermissionSg = false;

    private boolean mIsOverridden_checkCallingUriPermissionUiIr = false;

    private boolean mIsOverridden_checkPermissionSgIrIr = false;

    private boolean mIsOverridden_checkSelfPermissionSg = false;

    private boolean mIsOverridden_checkUriPermissionUiIrIrIr = false;

    private boolean mIsOverridden_checkUriPermissionUiSgSgIrIrIr = false;

    private boolean mIsOverridden_clearWallpaper = false;

    private boolean mIsOverridden_closeContextMenu = false;

    private boolean mIsOverridden_closeOptionsMenu = false;

    private boolean mIsOverridden_createConfigurationContextCn = false;

    private boolean mIsOverridden_createDisplayContextDy = false;

    private boolean mIsOverridden_createPackageContextSgIr = false;

    private boolean mIsOverridden_createPendingResultIrItIr = false;

    private boolean mIsOverridden_databaseList = false;

    private boolean mIsOverridden_deleteDatabaseSg = false;

    private boolean mIsOverridden_deleteFileSg = false;

    private boolean mIsOverridden_dispatchGenericMotionEventMt = false;

    private boolean mIsOverridden_dispatchKeyEventKt = false;

    private boolean mIsOverridden_dispatchKeyShortcutEventKt = false;

    private boolean mIsOverridden_dispatchPopulateAccessibilityEventAt = false;

    private boolean mIsOverridden_dispatchTouchEventMt = false;

    private boolean mIsOverridden_dispatchTrackballEventMt = false;

    private boolean mIsOverridden_dumpSgFrPrSg = false;

    private boolean mIsOverridden_enforceCallingOrSelfPermissionSgSg = false;

    private boolean mIsOverridden_enforceCallingOrSelfUriPermissionUiIrSg = false;

    private boolean mIsOverridden_enforceCallingPermissionSgSg = false;

    private boolean mIsOverridden_enforceCallingUriPermissionUiIrSg = false;

    private boolean mIsOverridden_enforcePermissionSgIrIrSg = false;

    private boolean mIsOverridden_enforceUriPermissionUiIrIrIrSg = false;

    private boolean mIsOverridden_enforceUriPermissionUiSgSgIrIrIrSg = false;

    private boolean mIsOverridden_fileList = false;

    private boolean mIsOverridden_findViewByIdIr = false;

    private boolean mIsOverridden_finish = false;

    private boolean mIsOverridden_finishActivityFromChildAyIr = false;

    private boolean mIsOverridden_finishActivityIr = false;

    private boolean mIsOverridden_finishAffinity = false;

    private boolean mIsOverridden_finishAfterTransition = false;

    private boolean mIsOverridden_finishAndRemoveTask = false;

    private boolean mIsOverridden_finishFromChildAy = false;

    private boolean mIsOverridden_getActionBar = false;

    private boolean mIsOverridden_getApplicationContext = false;

    private boolean mIsOverridden_getApplicationInfo = false;

    private boolean mIsOverridden_getAssets = false;

    private boolean mIsOverridden_getBaseContext = false;

    private boolean mIsOverridden_getCacheDir = false;

    private boolean mIsOverridden_getCallingActivity = false;

    private boolean mIsOverridden_getCallingPackage = false;

    private boolean mIsOverridden_getChangingConfigurations = false;

    private boolean mIsOverridden_getClassLoader = false;

    private boolean mIsOverridden_getCodeCacheDir = false;

    private boolean mIsOverridden_getComponentName = false;

    private boolean mIsOverridden_getContentResolver = false;

    private boolean mIsOverridden_getContentScene = false;

    private boolean mIsOverridden_getContentTransitionManager = false;

    private boolean mIsOverridden_getCurrentFocus = false;

    private boolean mIsOverridden_getDatabasePathSg = false;

    private boolean mIsOverridden_getDelegate = false;

    private boolean mIsOverridden_getDirSgIr = false;

    private boolean mIsOverridden_getDrawerToggleDelegate = false;

    private boolean mIsOverridden_getExternalCacheDir = false;

    private boolean mIsOverridden_getExternalCacheDirs = false;

    private boolean mIsOverridden_getExternalFilesDirSg = false;

    private boolean mIsOverridden_getExternalFilesDirsSg = false;

    private boolean mIsOverridden_getExternalMediaDirs = false;

    private boolean mIsOverridden_getFileStreamPathSg = false;

    private boolean mIsOverridden_getFilesDir = false;

    private boolean mIsOverridden_getFragmentManager = false;

    private boolean mIsOverridden_getIntent = false;

    private boolean mIsOverridden_getLayoutInflater = false;

    private boolean mIsOverridden_getLoaderManager = false;

    private boolean mIsOverridden_getLocalClassName = false;

    private boolean mIsOverridden_getMainLooper = false;

    private boolean mIsOverridden_getMenuInflater = false;

    private boolean mIsOverridden_getNoBackupFilesDir = false;

    private boolean mIsOverridden_getObbDir = false;

    private boolean mIsOverridden_getObbDirs = false;

    private boolean mIsOverridden_getPackageCodePath = false;

    private boolean mIsOverridden_getPackageManager = false;

    private boolean mIsOverridden_getPackageName = false;

    private boolean mIsOverridden_getPackageResourcePath = false;

    private boolean mIsOverridden_getParentActivityIntent = false;

    private boolean mIsOverridden_getPreferencesIr = false;

    private boolean mIsOverridden_getReferrer = false;

    private boolean mIsOverridden_getRequestedOrientation = false;

    private boolean mIsOverridden_getResources = false;

    private boolean mIsOverridden_getSharedPreferencesSgIr = false;

    private boolean mIsOverridden_getSupportActionBar = false;

    private boolean mIsOverridden_getSupportFragmentManager = false;

    private boolean mIsOverridden_getSupportLoaderManager = false;

    private boolean mIsOverridden_getSupportParentActivityIntent = false;

    private boolean mIsOverridden_getSystemServiceNameCs = false;

    private boolean mIsOverridden_getSystemServiceSg = false;

    private boolean mIsOverridden_getTaskId = false;

    private boolean mIsOverridden_getTheme = false;

    private boolean mIsOverridden_getVoiceInteractor = false;

    private boolean mIsOverridden_getWallpaper = false;

    private boolean mIsOverridden_getWallpaperDesiredMinimumHeight = false;

    private boolean mIsOverridden_getWallpaperDesiredMinimumWidth = false;

    private boolean mIsOverridden_getWindow = false;

    private boolean mIsOverridden_getWindowManager = false;

    private boolean mIsOverridden_grantUriPermissionSgUiIr = false;

    private boolean mIsOverridden_hasWindowFocus = false;

    private boolean mIsOverridden_invalidateOptionsMenu = false;

    private boolean mIsOverridden_isChangingConfigurations = false;

    private boolean mIsOverridden_isDestroyed = false;

    private boolean mIsOverridden_isFinishing = false;

    private boolean mIsOverridden_isImmersive = false;

    private boolean mIsOverridden_isRestricted = false;

    private boolean mIsOverridden_isTaskRoot = false;

    private boolean mIsOverridden_isVoiceInteraction = false;

    private boolean mIsOverridden_isVoiceInteractionRoot = false;

    private boolean mIsOverridden_moveTaskToBackBn = false;

    private boolean mIsOverridden_navigateUpToFromChildAyIt = false;

    private boolean mIsOverridden_navigateUpToIt = false;

    private boolean mIsOverridden_onActionModeFinishedae = false;

    private boolean mIsOverridden_onActionModeStartedae = false;

    private boolean mIsOverridden_onActivityReenterIrIt = false;

    private boolean mIsOverridden_onActivityResultIrIrIt = false;

    private boolean mIsOverridden_onApplyThemeResourceReIrBn = false;

    private boolean mIsOverridden_onAttachFragmentFt = false;

    private boolean mIsOverridden_onAttachFragmentat = false;

    private boolean mIsOverridden_onAttachedToWindow = false;

    private boolean mIsOverridden_onBackPressed = false;

    private boolean mIsOverridden_onChildTitleChangedAyCe = false;

    private boolean mIsOverridden_onConfigurationChangedCn = false;

    private boolean mIsOverridden_onContentChanged = false;

    private boolean mIsOverridden_onContextItemSelectedMm = false;

    private boolean mIsOverridden_onContextMenuClosedMu = false;

    private boolean mIsOverridden_onCreateBe = false;

    private boolean mIsOverridden_onCreateBePe = false;

    private boolean mIsOverridden_onCreateContextMenuCuVwCo = false;

    private boolean mIsOverridden_onCreateDescription = false;

    private boolean mIsOverridden_onCreateDialogIr = false;

    private boolean mIsOverridden_onCreateDialogIrBe = false;

    private boolean mIsOverridden_onCreateNavigateUpTaskStackTr = false;

    private boolean mIsOverridden_onCreateOptionsMenuMu = false;

    private boolean mIsOverridden_onCreatePanelMenuIrMu = false;

    private boolean mIsOverridden_onCreatePanelViewIr = false;

    private boolean mIsOverridden_onCreateSupportNavigateUpTaskStackar = false;

    private boolean mIsOverridden_onCreateThumbnailBpCs = false;

    private boolean mIsOverridden_onCreateViewSgCtAt = false;

    private boolean mIsOverridden_onCreateViewVwSgCtAt = false;

    private boolean mIsOverridden_onDestroy = false;

    private boolean mIsOverridden_onDetachedFromWindow = false;

    private boolean mIsOverridden_onEnterAnimationComplete = false;

    private boolean mIsOverridden_onGenericMotionEventMt = false;

    private boolean mIsOverridden_onKeyDownIrKt = false;

    private boolean mIsOverridden_onKeyLongPressIrKt = false;

    private boolean mIsOverridden_onKeyMultipleIrIrKt = false;

    private boolean mIsOverridden_onKeyShortcutIrKt = false;

    private boolean mIsOverridden_onKeyUpIrKt = false;

    private boolean mIsOverridden_onLowMemory = false;

    private boolean mIsOverridden_onMenuOpenedIrMu = false;

    private boolean mIsOverridden_onMultiWindowModeChangedBn = false;

    private boolean mIsOverridden_onNavigateUp = false;

    private boolean mIsOverridden_onNavigateUpFromChildAy = false;

    private boolean mIsOverridden_onNewIntentIt = false;

    private boolean mIsOverridden_onOptionsItemSelectedMm = false;

    private boolean mIsOverridden_onOptionsMenuClosedMu = false;

    private boolean mIsOverridden_onPanelClosedIrMu = false;

    private boolean mIsOverridden_onPause = false;

    private boolean mIsOverridden_onPictureInPictureModeChangedBn = false;

    private boolean mIsOverridden_onPostCreateBe = false;

    private boolean mIsOverridden_onPostCreateBePe = false;

    private boolean mIsOverridden_onPostResume = false;

    private boolean mIsOverridden_onPrepareDialogIrDg = false;

    private boolean mIsOverridden_onPrepareDialogIrDgBe = false;

    private boolean mIsOverridden_onPrepareNavigateUpTaskStackTr = false;

    private boolean mIsOverridden_onPrepareOptionsMenuMu = false;

    private boolean mIsOverridden_onPrepareOptionsPanelVwMu = false;

    private boolean mIsOverridden_onPreparePanelIrVwMu = false;

    private boolean mIsOverridden_onPrepareSupportNavigateUpTaskStackar = false;

    private boolean mIsOverridden_onProvideAssistContentAt = false;

    private boolean mIsOverridden_onProvideAssistDataBe = false;

    private boolean mIsOverridden_onProvideReferrer = false;

    private boolean mIsOverridden_onRequestPermissionsResultIrSgit = false;

    private boolean mIsOverridden_onRestart = false;

    private boolean mIsOverridden_onRestoreInstanceStateBe = false;

    private boolean mIsOverridden_onRestoreInstanceStateBePe = false;

    private boolean mIsOverridden_onResume = false;

    private boolean mIsOverridden_onResumeFragments = false;

    private boolean mIsOverridden_onSaveInstanceStateBe = false;

    private boolean mIsOverridden_onSaveInstanceStateBePe = false;

    private boolean mIsOverridden_onSearchRequested = false;

    private boolean mIsOverridden_onSearchRequestedSt = false;

    private boolean mIsOverridden_onStart = false;

    private boolean mIsOverridden_onStateNotSaved = false;

    private boolean mIsOverridden_onStop = false;

    private boolean mIsOverridden_onSupportActionModeFinishedAe = false;

    private boolean mIsOverridden_onSupportActionModeStartedAe = false;

    private boolean mIsOverridden_onSupportContentChanged = false;

    private boolean mIsOverridden_onSupportNavigateUp = false;

    private boolean mIsOverridden_onTitleChangedCeIr = false;

    private boolean mIsOverridden_onTouchEventMt = false;

    private boolean mIsOverridden_onTrackballEventMt = false;

    private boolean mIsOverridden_onTrimMemoryIr = false;

    private boolean mIsOverridden_onUserInteraction = false;

    private boolean mIsOverridden_onUserLeaveHint = false;

    private boolean mIsOverridden_onVisibleBehindCanceled = false;

    private boolean mIsOverridden_onWindowAttributesChangedWs = false;

    private boolean mIsOverridden_onWindowFocusChangedBn = false;

    private boolean mIsOverridden_onWindowStartingActionModeak = false;

    private boolean mIsOverridden_onWindowStartingActionModeakIr = false;

    private boolean mIsOverridden_onWindowStartingSupportActionModeAk = false;

    private boolean mIsOverridden_openContextMenuVw = false;

    private boolean mIsOverridden_openFileInputSg = false;

    private boolean mIsOverridden_openFileOutputSgIr = false;

    private boolean mIsOverridden_openOptionsMenu = false;

    private boolean mIsOverridden_openOrCreateDatabaseSgIrSy = false;

    private boolean mIsOverridden_openOrCreateDatabaseSgIrSyDr = false;

    private boolean mIsOverridden_overridePendingTransitionIrIr = false;

    private boolean mIsOverridden_peekWallpaper = false;

    private boolean mIsOverridden_postponeEnterTransition = false;

    private boolean mIsOverridden_recreate = false;

    private boolean mIsOverridden_registerComponentCallbacksCs = false;

    private boolean mIsOverridden_registerForContextMenuVw = false;

    private boolean mIsOverridden_registerReceiverBrIr = false;

    private boolean mIsOverridden_registerReceiverBrIrSgHr = false;

    private boolean mIsOverridden_releaseInstance = false;

    private boolean mIsOverridden_removeStickyBroadcastAsUserItUe = false;

    private boolean mIsOverridden_removeStickyBroadcastIt = false;

    private boolean mIsOverridden_reportFullyDrawn = false;

    private boolean mIsOverridden_requestVisibleBehindBn = false;

    private boolean mIsOverridden_revokeUriPermissionUiIr = false;

    private boolean mIsOverridden_sendBroadcastAsUserItUe = false;

    private boolean mIsOverridden_sendBroadcastAsUserItUeSg = false;

    private boolean mIsOverridden_sendBroadcastIt = false;

    private boolean mIsOverridden_sendBroadcastItSg = false;

    private boolean mIsOverridden_sendOrderedBroadcastAsUserItUeSgBrHrIrSgBe = false;

    private boolean mIsOverridden_sendOrderedBroadcastItSg = false;

    private boolean mIsOverridden_sendOrderedBroadcastItSgBrHrIrSgBe = false;

    private boolean mIsOverridden_sendStickyBroadcastAsUserItUe = false;

    private boolean mIsOverridden_sendStickyBroadcastIt = false;

    private boolean mIsOverridden_sendStickyOrderedBroadcastAsUserItUeBrHrIrSgBe = false;

    private boolean mIsOverridden_sendStickyOrderedBroadcastItBrHrIrSgBe = false;

    private boolean mIsOverridden_setActionBarTr = false;

    private boolean mIsOverridden_setContentTransitionManagerTr = false;

    private boolean mIsOverridden_setContentViewIr = false;

    private boolean mIsOverridden_setContentViewVw = false;

    private boolean mIsOverridden_setContentViewVwVs = false;

    private boolean mIsOverridden_setEnterSharedElementCallbackSk = false;

    private boolean mIsOverridden_setEnterSharedElementCallbackak = false;

    private boolean mIsOverridden_setExitSharedElementCallbackSk = false;

    private boolean mIsOverridden_setExitSharedElementCallbackak = false;

    private boolean mIsOverridden_setFinishOnTouchOutsideBn = false;

    private boolean mIsOverridden_setImmersiveBn = false;

    private boolean mIsOverridden_setIntentIt = false;

    private boolean mIsOverridden_setRequestedOrientationIr = false;

    private boolean mIsOverridden_setSupportActionBarar = false;

    private boolean mIsOverridden_setSupportProgressBarIndeterminateBn = false;

    private boolean mIsOverridden_setSupportProgressBarIndeterminateVisibilityBn = false;

    private boolean mIsOverridden_setSupportProgressBarVisibilityBn = false;

    private boolean mIsOverridden_setSupportProgressIr = false;

    private boolean mIsOverridden_setTaskDescriptionAn = false;

    private boolean mIsOverridden_setThemeIr = false;

    private boolean mIsOverridden_setTitleCe = false;

    private boolean mIsOverridden_setTitleColorIr = false;

    private boolean mIsOverridden_setTitleIr = false;

    private boolean mIsOverridden_setVisibleBn = false;

    private boolean mIsOverridden_setWallpaperBp = false;

    private boolean mIsOverridden_setWallpaperIm = false;

    private boolean mIsOverridden_shouldShowRequestPermissionRationaleSg = false;

    private boolean mIsOverridden_shouldUpRecreateTaskIt = false;

    private boolean mIsOverridden_showAssistBe = false;

    private boolean mIsOverridden_showLockTaskEscapeMessage = false;

    private boolean mIsOverridden_startActionModeak = false;

    private boolean mIsOverridden_startActionModeakIr = false;

    private boolean mIsOverridden_startActivitiesIt = false;

    private boolean mIsOverridden_startActivitiesItBe = false;

    private boolean mIsOverridden_startActivityForResultItIr = false;

    private boolean mIsOverridden_startActivityForResultItIrBe = false;

    private boolean mIsOverridden_startActivityFromChildAyItIr = false;

    private boolean mIsOverridden_startActivityFromChildAyItIrBe = false;

    private boolean mIsOverridden_startActivityFromFragmentFtItIr = false;

    private boolean mIsOverridden_startActivityFromFragmentFtItIrBe = false;

    private boolean mIsOverridden_startActivityFromFragmentatItIr = false;

    private boolean mIsOverridden_startActivityFromFragmentatItIrBe = false;

    private boolean mIsOverridden_startActivityIfNeededItIr = false;

    private boolean mIsOverridden_startActivityIfNeededItIrBe = false;

    private boolean mIsOverridden_startActivityIt = false;

    private boolean mIsOverridden_startActivityItBe = false;

    private boolean mIsOverridden_startInstrumentationCeSgBe = false;

    private boolean mIsOverridden_startIntentSenderForResultIrIrItIrIrIr = false;

    private boolean mIsOverridden_startIntentSenderForResultIrIrItIrIrIrBe = false;

    private boolean mIsOverridden_startIntentSenderFromChildAyIrIrItIrIrIr = false;

    private boolean mIsOverridden_startIntentSenderFromChildAyIrIrItIrIrIrBe = false;

    private boolean mIsOverridden_startIntentSenderFromFragmentFtIrIrItIrIrIrBe = false;

    private boolean mIsOverridden_startIntentSenderIrItIrIrIr = false;

    private boolean mIsOverridden_startIntentSenderIrItIrIrIrBe = false;

    private boolean mIsOverridden_startLockTask = false;

    private boolean mIsOverridden_startManagingCursorCr = false;

    private boolean mIsOverridden_startNextMatchingActivityIt = false;

    private boolean mIsOverridden_startNextMatchingActivityItBe = false;

    private boolean mIsOverridden_startPostponedEnterTransition = false;

    private boolean mIsOverridden_startSearchSgBnBeBn = false;

    private boolean mIsOverridden_startServiceIt = false;

    private boolean mIsOverridden_startSupportActionModeAk = false;

    private boolean mIsOverridden_stopLockTask = false;

    private boolean mIsOverridden_stopManagingCursorCr = false;

    private boolean mIsOverridden_stopServiceIt = false;

    private boolean mIsOverridden_supportFinishAfterTransition = false;

    private boolean mIsOverridden_supportInvalidateOptionsMenu = false;

    private boolean mIsOverridden_supportNavigateUpToIt = false;

    private boolean mIsOverridden_supportPostponeEnterTransition = false;

    private boolean mIsOverridden_supportRequestWindowFeatureIr = false;

    private boolean mIsOverridden_supportShouldUpRecreateTaskIt = false;

    private boolean mIsOverridden_supportStartPostponedEnterTransition = false;

    private boolean mIsOverridden_takeKeyEventsBn = false;

    private boolean mIsOverridden_triggerSearchSgBe = false;

    private boolean mIsOverridden_unbindServiceSn = false;

    private boolean mIsOverridden_unregisterComponentCallbacksCs = false;

    private boolean mIsOverridden_unregisterForContextMenuVw = false;

    private boolean mIsOverridden_unregisterReceiverBr = false;

    private final HashMap<String, List<ActivityPlugin>> mMethodImplementingPlugins
            = new HashMap<>();

    public ActivityDelegate(final ICompositeActivity icompositeactivity) {
        super(icompositeactivity);

    }

    public void addContentView(final View view, final ViewGroup.LayoutParams params) {
        if (!mIsOverridden_addContentViewVwVs) {
            getOriginal().super_addContentView(view, params);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_addContentViewVwVs < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_addContentViewVwVs++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("addContentView(View, ViewGroup.LayoutParams)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("addContentView", View.class,
                        ViewGroup.LayoutParams.class);
                mMethodImplementingPlugins
                        .put("addContentView(View, ViewGroup.LayoutParams)", implementingPlugins);
                mIsOverridden_addContentViewVwVs = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid2<View, ViewGroup.LayoutParams> superCall
                = new CallVoid2<View, ViewGroup.LayoutParams>(
                "addContentView(View, ViewGroup.LayoutParams)") {

            @Override
            public void call(final View view, final ViewGroup.LayoutParams params) {
                if (iterator.hasPrevious()) {
                    iterator.previous().addContentView(this, view, params);
                } else {
                    getOriginal().super_addContentView(view, params);
                }
            }
        };
        superCall.call(view, params);
    }

    @Override
    public Removable addPlugin(final ActivityPlugin plugin) {
        mMethodImplementingPlugins.clear();
        mIsOverridden_addContentViewVwVs = true;
        mIsOverridden_applyOverrideConfigurationCn = true;
        mIsOverridden_bindServiceItSnIr = true;
        mIsOverridden_checkCallingOrSelfPermissionSg = true;
        mIsOverridden_checkCallingOrSelfUriPermissionUiIr = true;
        mIsOverridden_checkCallingPermissionSg = true;
        mIsOverridden_checkCallingUriPermissionUiIr = true;
        mIsOverridden_checkPermissionSgIrIr = true;
        mIsOverridden_checkSelfPermissionSg = true;
        mIsOverridden_checkUriPermissionUiIrIrIr = true;
        mIsOverridden_checkUriPermissionUiSgSgIrIrIr = true;
        mIsOverridden_clearWallpaper = true;
        mIsOverridden_closeContextMenu = true;
        mIsOverridden_closeOptionsMenu = true;
        mIsOverridden_createConfigurationContextCn = true;
        mIsOverridden_createDisplayContextDy = true;
        mIsOverridden_createPackageContextSgIr = true;
        mIsOverridden_createPendingResultIrItIr = true;
        mIsOverridden_databaseList = true;
        mIsOverridden_deleteDatabaseSg = true;
        mIsOverridden_deleteFileSg = true;
        mIsOverridden_dispatchGenericMotionEventMt = true;
        mIsOverridden_dispatchKeyEventKt = true;
        mIsOverridden_dispatchKeyShortcutEventKt = true;
        mIsOverridden_dispatchPopulateAccessibilityEventAt = true;
        mIsOverridden_dispatchTouchEventMt = true;
        mIsOverridden_dispatchTrackballEventMt = true;
        mIsOverridden_dumpSgFrPrSg = true;
        mIsOverridden_enforceCallingOrSelfPermissionSgSg = true;
        mIsOverridden_enforceCallingOrSelfUriPermissionUiIrSg = true;
        mIsOverridden_enforceCallingPermissionSgSg = true;
        mIsOverridden_enforceCallingUriPermissionUiIrSg = true;
        mIsOverridden_enforcePermissionSgIrIrSg = true;
        mIsOverridden_enforceUriPermissionUiIrIrIrSg = true;
        mIsOverridden_enforceUriPermissionUiSgSgIrIrIrSg = true;
        mIsOverridden_fileList = true;
        mIsOverridden_findViewByIdIr = true;
        mIsOverridden_finish = true;
        mIsOverridden_finishActivityIr = true;
        mIsOverridden_finishActivityFromChildAyIr = true;
        mIsOverridden_finishAffinity = true;
        mIsOverridden_finishAfterTransition = true;
        mIsOverridden_finishAndRemoveTask = true;
        mIsOverridden_finishFromChildAy = true;
        mIsOverridden_getActionBar = true;
        mIsOverridden_getApplicationContext = true;
        mIsOverridden_getApplicationInfo = true;
        mIsOverridden_getAssets = true;
        mIsOverridden_getBaseContext = true;
        mIsOverridden_getCacheDir = true;
        mIsOverridden_getCallingActivity = true;
        mIsOverridden_getCallingPackage = true;
        mIsOverridden_getChangingConfigurations = true;
        mIsOverridden_getClassLoader = true;
        mIsOverridden_getCodeCacheDir = true;
        mIsOverridden_getComponentName = true;
        mIsOverridden_getContentResolver = true;
        mIsOverridden_getContentScene = true;
        mIsOverridden_getContentTransitionManager = true;
        mIsOverridden_getCurrentFocus = true;
        mIsOverridden_getDatabasePathSg = true;
        mIsOverridden_getDelegate = true;
        mIsOverridden_getDirSgIr = true;
        mIsOverridden_getDrawerToggleDelegate = true;
        mIsOverridden_getExternalCacheDir = true;
        mIsOverridden_getExternalCacheDirs = true;
        mIsOverridden_getExternalFilesDirSg = true;
        mIsOverridden_getExternalFilesDirsSg = true;
        mIsOverridden_getExternalMediaDirs = true;
        mIsOverridden_getFileStreamPathSg = true;
        mIsOverridden_getFilesDir = true;
        mIsOverridden_getFragmentManager = true;
        mIsOverridden_getIntent = true;
        mIsOverridden_getLayoutInflater = true;
        mIsOverridden_getLoaderManager = true;
        mIsOverridden_getLocalClassName = true;
        mIsOverridden_getMainLooper = true;
        mIsOverridden_getMenuInflater = true;
        mIsOverridden_getNoBackupFilesDir = true;
        mIsOverridden_getObbDir = true;
        mIsOverridden_getObbDirs = true;
        mIsOverridden_getPackageCodePath = true;
        mIsOverridden_getPackageManager = true;
        mIsOverridden_getPackageName = true;
        mIsOverridden_getPackageResourcePath = true;
        mIsOverridden_getParentActivityIntent = true;
        mIsOverridden_getPreferencesIr = true;
        mIsOverridden_getReferrer = true;
        mIsOverridden_getRequestedOrientation = true;
        mIsOverridden_getResources = true;
        mIsOverridden_getSharedPreferencesSgIr = true;
        mIsOverridden_getSupportActionBar = true;
        mIsOverridden_getSupportFragmentManager = true;
        mIsOverridden_getSupportLoaderManager = true;
        mIsOverridden_getSupportParentActivityIntent = true;
        mIsOverridden_getSystemServiceSg = true;
        mIsOverridden_getSystemServiceNameCs = true;
        mIsOverridden_getTaskId = true;
        mIsOverridden_getTheme = true;
        mIsOverridden_getVoiceInteractor = true;
        mIsOverridden_getWallpaper = true;
        mIsOverridden_getWallpaperDesiredMinimumHeight = true;
        mIsOverridden_getWallpaperDesiredMinimumWidth = true;
        mIsOverridden_getWindow = true;
        mIsOverridden_getWindowManager = true;
        mIsOverridden_grantUriPermissionSgUiIr = true;
        mIsOverridden_hasWindowFocus = true;
        mIsOverridden_invalidateOptionsMenu = true;
        mIsOverridden_isChangingConfigurations = true;
        mIsOverridden_isDestroyed = true;
        mIsOverridden_isFinishing = true;
        mIsOverridden_isImmersive = true;
        mIsOverridden_isRestricted = true;
        mIsOverridden_isTaskRoot = true;
        mIsOverridden_isVoiceInteraction = true;
        mIsOverridden_isVoiceInteractionRoot = true;
        mIsOverridden_moveTaskToBackBn = true;
        mIsOverridden_navigateUpToIt = true;
        mIsOverridden_navigateUpToFromChildAyIt = true;
        mIsOverridden_onActionModeFinishedae = true;
        mIsOverridden_onActionModeStartedae = true;
        mIsOverridden_onActivityReenterIrIt = true;
        mIsOverridden_onAttachFragmentFt = true;
        mIsOverridden_onAttachFragmentat = true;
        mIsOverridden_onAttachedToWindow = true;
        mIsOverridden_onBackPressed = true;
        mIsOverridden_onConfigurationChangedCn = true;
        mIsOverridden_onContentChanged = true;
        mIsOverridden_onContextItemSelectedMm = true;
        mIsOverridden_onContextMenuClosedMu = true;
        mIsOverridden_onCreateBePe = true;
        mIsOverridden_onCreateContextMenuCuVwCo = true;
        mIsOverridden_onCreateDescription = true;
        mIsOverridden_onCreateNavigateUpTaskStackTr = true;
        mIsOverridden_onCreateOptionsMenuMu = true;
        mIsOverridden_onCreatePanelMenuIrMu = true;
        mIsOverridden_onCreatePanelViewIr = true;
        mIsOverridden_onCreateSupportNavigateUpTaskStackar = true;
        mIsOverridden_onCreateThumbnailBpCs = true;
        mIsOverridden_onCreateViewVwSgCtAt = true;
        mIsOverridden_onCreateViewSgCtAt = true;
        mIsOverridden_onDetachedFromWindow = true;
        mIsOverridden_onEnterAnimationComplete = true;
        mIsOverridden_onGenericMotionEventMt = true;
        mIsOverridden_onKeyDownIrKt = true;
        mIsOverridden_onKeyLongPressIrKt = true;
        mIsOverridden_onKeyMultipleIrIrKt = true;
        mIsOverridden_onKeyShortcutIrKt = true;
        mIsOverridden_onKeyUpIrKt = true;
        mIsOverridden_onLowMemory = true;
        mIsOverridden_onMenuOpenedIrMu = true;
        mIsOverridden_onMultiWindowModeChangedBn = true;
        mIsOverridden_onNavigateUp = true;
        mIsOverridden_onNavigateUpFromChildAy = true;
        mIsOverridden_onOptionsItemSelectedMm = true;
        mIsOverridden_onOptionsMenuClosedMu = true;
        mIsOverridden_onPanelClosedIrMu = true;
        mIsOverridden_onPictureInPictureModeChangedBn = true;
        mIsOverridden_onPostCreateBePe = true;
        mIsOverridden_onPrepareNavigateUpTaskStackTr = true;
        mIsOverridden_onPrepareOptionsMenuMu = true;
        mIsOverridden_onPreparePanelIrVwMu = true;
        mIsOverridden_onPrepareSupportNavigateUpTaskStackar = true;
        mIsOverridden_onProvideAssistContentAt = true;
        mIsOverridden_onProvideAssistDataBe = true;
        mIsOverridden_onProvideReferrer = true;
        mIsOverridden_onRequestPermissionsResultIrSgit = true;
        mIsOverridden_onRestoreInstanceStateBePe = true;
        mIsOverridden_onSaveInstanceStateBePe = true;
        mIsOverridden_onSearchRequestedSt = true;
        mIsOverridden_onSearchRequested = true;
        mIsOverridden_onStateNotSaved = true;
        mIsOverridden_onSupportActionModeFinishedAe = true;
        mIsOverridden_onSupportActionModeStartedAe = true;
        mIsOverridden_onSupportContentChanged = true;
        mIsOverridden_onSupportNavigateUp = true;
        mIsOverridden_onTouchEventMt = true;
        mIsOverridden_onTrackballEventMt = true;
        mIsOverridden_onTrimMemoryIr = true;
        mIsOverridden_onUserInteraction = true;
        mIsOverridden_onVisibleBehindCanceled = true;
        mIsOverridden_onWindowAttributesChangedWs = true;
        mIsOverridden_onWindowFocusChangedBn = true;
        mIsOverridden_onWindowStartingActionModeak = true;
        mIsOverridden_onWindowStartingActionModeakIr = true;
        mIsOverridden_onWindowStartingSupportActionModeAk = true;
        mIsOverridden_openContextMenuVw = true;
        mIsOverridden_openFileInputSg = true;
        mIsOverridden_openFileOutputSgIr = true;
        mIsOverridden_openOptionsMenu = true;
        mIsOverridden_openOrCreateDatabaseSgIrSy = true;
        mIsOverridden_openOrCreateDatabaseSgIrSyDr = true;
        mIsOverridden_overridePendingTransitionIrIr = true;
        mIsOverridden_peekWallpaper = true;
        mIsOverridden_postponeEnterTransition = true;
        mIsOverridden_recreate = true;
        mIsOverridden_registerComponentCallbacksCs = true;
        mIsOverridden_registerForContextMenuVw = true;
        mIsOverridden_registerReceiverBrIr = true;
        mIsOverridden_registerReceiverBrIrSgHr = true;
        mIsOverridden_releaseInstance = true;
        mIsOverridden_removeStickyBroadcastIt = true;
        mIsOverridden_removeStickyBroadcastAsUserItUe = true;
        mIsOverridden_reportFullyDrawn = true;
        mIsOverridden_requestVisibleBehindBn = true;
        mIsOverridden_revokeUriPermissionUiIr = true;
        mIsOverridden_sendBroadcastIt = true;
        mIsOverridden_sendBroadcastItSg = true;
        mIsOverridden_sendBroadcastAsUserItUe = true;
        mIsOverridden_sendBroadcastAsUserItUeSg = true;
        mIsOverridden_sendOrderedBroadcastItSg = true;
        mIsOverridden_sendOrderedBroadcastItSgBrHrIrSgBe = true;
        mIsOverridden_sendOrderedBroadcastAsUserItUeSgBrHrIrSgBe = true;
        mIsOverridden_sendStickyBroadcastIt = true;
        mIsOverridden_sendStickyBroadcastAsUserItUe = true;
        mIsOverridden_sendStickyOrderedBroadcastItBrHrIrSgBe = true;
        mIsOverridden_sendStickyOrderedBroadcastAsUserItUeBrHrIrSgBe = true;
        mIsOverridden_setActionBarTr = true;
        mIsOverridden_setContentTransitionManagerTr = true;
        mIsOverridden_setContentViewIr = true;
        mIsOverridden_setContentViewVw = true;
        mIsOverridden_setContentViewVwVs = true;
        mIsOverridden_setEnterSharedElementCallbackSk = true;
        mIsOverridden_setEnterSharedElementCallbackak = true;
        mIsOverridden_setExitSharedElementCallbackSk = true;
        mIsOverridden_setExitSharedElementCallbackak = true;
        mIsOverridden_setFinishOnTouchOutsideBn = true;
        mIsOverridden_setImmersiveBn = true;
        mIsOverridden_setIntentIt = true;
        mIsOverridden_setRequestedOrientationIr = true;
        mIsOverridden_setSupportActionBarar = true;
        mIsOverridden_setSupportProgressIr = true;
        mIsOverridden_setSupportProgressBarIndeterminateBn = true;
        mIsOverridden_setSupportProgressBarIndeterminateVisibilityBn = true;
        mIsOverridden_setSupportProgressBarVisibilityBn = true;
        mIsOverridden_setTaskDescriptionAn = true;
        mIsOverridden_setThemeIr = true;
        mIsOverridden_setTitleCe = true;
        mIsOverridden_setTitleIr = true;
        mIsOverridden_setTitleColorIr = true;
        mIsOverridden_setVisibleBn = true;
        mIsOverridden_setWallpaperBp = true;
        mIsOverridden_setWallpaperIm = true;
        mIsOverridden_shouldShowRequestPermissionRationaleSg = true;
        mIsOverridden_shouldUpRecreateTaskIt = true;
        mIsOverridden_showAssistBe = true;
        mIsOverridden_showLockTaskEscapeMessage = true;
        mIsOverridden_startActionModeak = true;
        mIsOverridden_startActionModeakIr = true;
        mIsOverridden_startActivitiesIt = true;
        mIsOverridden_startActivitiesItBe = true;
        mIsOverridden_startActivityIt = true;
        mIsOverridden_startActivityItBe = true;
        mIsOverridden_startActivityForResultItIr = true;
        mIsOverridden_startActivityForResultItIrBe = true;
        mIsOverridden_startActivityFromChildAyItIr = true;
        mIsOverridden_startActivityFromChildAyItIrBe = true;
        mIsOverridden_startActivityFromFragmentFtItIr = true;
        mIsOverridden_startActivityFromFragmentFtItIrBe = true;
        mIsOverridden_startActivityFromFragmentatItIr = true;
        mIsOverridden_startActivityFromFragmentatItIrBe = true;
        mIsOverridden_startActivityIfNeededItIr = true;
        mIsOverridden_startActivityIfNeededItIrBe = true;
        mIsOverridden_startInstrumentationCeSgBe = true;
        mIsOverridden_startIntentSenderIrItIrIrIr = true;
        mIsOverridden_startIntentSenderIrItIrIrIrBe = true;
        mIsOverridden_startIntentSenderForResultIrIrItIrIrIrBe = true;
        mIsOverridden_startIntentSenderForResultIrIrItIrIrIr = true;
        mIsOverridden_startIntentSenderFromChildAyIrIrItIrIrIr = true;
        mIsOverridden_startIntentSenderFromChildAyIrIrItIrIrIrBe = true;
        mIsOverridden_startIntentSenderFromFragmentFtIrIrItIrIrIrBe = true;
        mIsOverridden_startLockTask = true;
        mIsOverridden_startManagingCursorCr = true;
        mIsOverridden_startNextMatchingActivityIt = true;
        mIsOverridden_startNextMatchingActivityItBe = true;
        mIsOverridden_startPostponedEnterTransition = true;
        mIsOverridden_startSearchSgBnBeBn = true;
        mIsOverridden_startServiceIt = true;
        mIsOverridden_startSupportActionModeAk = true;
        mIsOverridden_stopLockTask = true;
        mIsOverridden_stopManagingCursorCr = true;
        mIsOverridden_stopServiceIt = true;
        mIsOverridden_supportFinishAfterTransition = true;
        mIsOverridden_supportInvalidateOptionsMenu = true;
        mIsOverridden_supportNavigateUpToIt = true;
        mIsOverridden_supportPostponeEnterTransition = true;
        mIsOverridden_supportRequestWindowFeatureIr = true;
        mIsOverridden_supportShouldUpRecreateTaskIt = true;
        mIsOverridden_supportStartPostponedEnterTransition = true;
        mIsOverridden_takeKeyEventsBn = true;
        mIsOverridden_triggerSearchSgBe = true;
        mIsOverridden_unbindServiceSn = true;
        mIsOverridden_unregisterComponentCallbacksCs = true;
        mIsOverridden_unregisterForContextMenuVw = true;
        mIsOverridden_unregisterReceiverBr = true;
        mIsOverridden_attachBaseContextCt = true;
        mIsOverridden_onActivityResultIrIrIt = true;
        mIsOverridden_onApplyThemeResourceReIrBn = true;
        mIsOverridden_onChildTitleChangedAyCe = true;
        mIsOverridden_onCreateBe = true;
        mIsOverridden_onCreateDialogIr = true;
        mIsOverridden_onCreateDialogIrBe = true;
        mIsOverridden_onDestroy = true;
        mIsOverridden_onNewIntentIt = true;
        mIsOverridden_onPause = true;
        mIsOverridden_onPostCreateBe = true;
        mIsOverridden_onPostResume = true;
        mIsOverridden_onPrepareDialogIrDg = true;
        mIsOverridden_onPrepareDialogIrDgBe = true;
        mIsOverridden_onPrepareOptionsPanelVwMu = true;
        mIsOverridden_onRestart = true;
        mIsOverridden_onRestoreInstanceStateBe = true;
        mIsOverridden_onResume = true;
        mIsOverridden_onResumeFragments = true;
        mIsOverridden_onSaveInstanceStateBe = true;
        mIsOverridden_onStart = true;
        mIsOverridden_onStop = true;
        mIsOverridden_onTitleChangedCeIr = true;
        mIsOverridden_onUserLeaveHint = true;

        return super.addPlugin(plugin);
    }

    public void applyOverrideConfiguration(final Configuration overrideConfiguration) {
        if (!mIsOverridden_applyOverrideConfigurationCn) {
            getOriginal().super_applyOverrideConfiguration(overrideConfiguration);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_applyOverrideConfigurationCn < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_applyOverrideConfigurationCn++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("applyOverrideConfiguration(Configuration)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("applyOverrideConfiguration",
                        Configuration.class);
                mMethodImplementingPlugins
                        .put("applyOverrideConfiguration(Configuration)", implementingPlugins);
                mIsOverridden_applyOverrideConfigurationCn = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<Configuration> superCall = new CallVoid1<Configuration>(
                "applyOverrideConfiguration(Configuration)") {

            @Override
            public void call(final Configuration overrideConfiguration) {
                if (iterator.hasPrevious()) {
                    iterator.previous().applyOverrideConfiguration(this, overrideConfiguration);
                } else {
                    getOriginal().super_applyOverrideConfiguration(overrideConfiguration);
                }
            }
        };
        superCall.call(overrideConfiguration);
    }

    public void attachBaseContext(final Context newBase) {
        if (!mIsOverridden_attachBaseContextCt) {
            getOriginal().super_attachBaseContext(newBase);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_attachBaseContextCt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_attachBaseContextCt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("attachBaseContext(Context)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("attachBaseContext", Context.class);
                mMethodImplementingPlugins.put("attachBaseContext(Context)", implementingPlugins);
                mIsOverridden_attachBaseContextCt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<Context> superCall = new CallVoid1<Context>("attachBaseContext(Context)") {

            @Override
            public void call(final Context newBase) {
                if (iterator.hasPrevious()) {
                    iterator.previous().attachBaseContext(this, newBase);
                } else {
                    getOriginal().super_attachBaseContext(newBase);
                }
            }
        };
        superCall.call(newBase);
    }

    public boolean bindService(final Intent service, final ServiceConnection conn,
            final int flags) {
        if (!mIsOverridden_bindServiceItSnIr) {
            return getOriginal().super_bindService(service, conn, flags);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_bindServiceItSnIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_bindServiceItSnIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("bindService(Intent, ServiceConnection, Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("bindService", Intent.class,
                        ServiceConnection.class, Integer.class);
                mMethodImplementingPlugins.put("bindService(Intent, ServiceConnection, Integer)",
                        implementingPlugins);
                mIsOverridden_bindServiceItSnIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun3<Boolean, Intent, ServiceConnection, Integer> superCall
                = new CallFun3<Boolean, Intent, ServiceConnection, Integer>(
                "bindService(Intent, ServiceConnection, Integer)") {

            @Override
            public Boolean call(final Intent service, final ServiceConnection conn,
                    final Integer flags) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().bindService(this, service, conn, flags);
                } else {
                    return getOriginal().super_bindService(service, conn, flags);
                }
            }
        };
        return superCall.call(service, conn, flags);
    }

    public int checkCallingOrSelfPermission(final String permission) {
        if (!mIsOverridden_checkCallingOrSelfPermissionSg) {
            return getOriginal().super_checkCallingOrSelfPermission(permission);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_checkCallingOrSelfPermissionSg < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_checkCallingOrSelfPermissionSg++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("checkCallingOrSelfPermission(String)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("checkCallingOrSelfPermission",
                        String.class);
                mMethodImplementingPlugins
                        .put("checkCallingOrSelfPermission(String)", implementingPlugins);
                mIsOverridden_checkCallingOrSelfPermissionSg = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<Integer, String> superCall = new CallFun1<Integer, String>(
                "checkCallingOrSelfPermission(String)") {

            @Override
            public Integer call(final String permission) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().checkCallingOrSelfPermission(this, permission);
                } else {
                    return getOriginal().super_checkCallingOrSelfPermission(permission);
                }
            }
        };
        return superCall.call(permission);
    }

    public int checkCallingOrSelfUriPermission(final Uri uri, final int modeFlags) {
        if (!mIsOverridden_checkCallingOrSelfUriPermissionUiIr) {
            return getOriginal().super_checkCallingOrSelfUriPermission(uri, modeFlags);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_checkCallingOrSelfUriPermissionUiIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_checkCallingOrSelfUriPermissionUiIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("checkCallingOrSelfUriPermission(Uri, Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("checkCallingOrSelfUriPermission",
                        Uri.class, Integer.class);
                mMethodImplementingPlugins
                        .put("checkCallingOrSelfUriPermission(Uri, Integer)", implementingPlugins);
                mIsOverridden_checkCallingOrSelfUriPermissionUiIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun2<Integer, Uri, Integer> superCall = new CallFun2<Integer, Uri, Integer>(
                "checkCallingOrSelfUriPermission(Uri, Integer)") {

            @Override
            public Integer call(final Uri uri, final Integer modeFlags) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .checkCallingOrSelfUriPermission(this, uri, modeFlags);
                } else {
                    return getOriginal().super_checkCallingOrSelfUriPermission(uri, modeFlags);
                }
            }
        };
        return superCall.call(uri, modeFlags);
    }

    public int checkCallingPermission(final String permission) {
        if (!mIsOverridden_checkCallingPermissionSg) {
            return getOriginal().super_checkCallingPermission(permission);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_checkCallingPermissionSg < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_checkCallingPermissionSg++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("checkCallingPermission(String)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("checkCallingPermission",
                        String.class);
                mMethodImplementingPlugins
                        .put("checkCallingPermission(String)", implementingPlugins);
                mIsOverridden_checkCallingPermissionSg = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<Integer, String> superCall = new CallFun1<Integer, String>(
                "checkCallingPermission(String)") {

            @Override
            public Integer call(final String permission) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().checkCallingPermission(this, permission);
                } else {
                    return getOriginal().super_checkCallingPermission(permission);
                }
            }
        };
        return superCall.call(permission);
    }

    public int checkCallingUriPermission(final Uri uri, final int modeFlags) {
        if (!mIsOverridden_checkCallingUriPermissionUiIr) {
            return getOriginal().super_checkCallingUriPermission(uri, modeFlags);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_checkCallingUriPermissionUiIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_checkCallingUriPermissionUiIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("checkCallingUriPermission(Uri, Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("checkCallingUriPermission", Uri.class,
                        Integer.class);
                mMethodImplementingPlugins
                        .put("checkCallingUriPermission(Uri, Integer)", implementingPlugins);
                mIsOverridden_checkCallingUriPermissionUiIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun2<Integer, Uri, Integer> superCall = new CallFun2<Integer, Uri, Integer>(
                "checkCallingUriPermission(Uri, Integer)") {

            @Override
            public Integer call(final Uri uri, final Integer modeFlags) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().checkCallingUriPermission(this, uri, modeFlags);
                } else {
                    return getOriginal().super_checkCallingUriPermission(uri, modeFlags);
                }
            }
        };
        return superCall.call(uri, modeFlags);
    }

    public int checkPermission(final String permission, final int pid, final int uid) {
        if (!mIsOverridden_checkPermissionSgIrIr) {
            return getOriginal().super_checkPermission(permission, pid, uid);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_checkPermissionSgIrIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_checkPermissionSgIrIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("checkPermission(String, Integer, Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("checkPermission", String.class,
                        Integer.class, Integer.class);
                mMethodImplementingPlugins
                        .put("checkPermission(String, Integer, Integer)", implementingPlugins);
                mIsOverridden_checkPermissionSgIrIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun3<Integer, String, Integer, Integer> superCall
                = new CallFun3<Integer, String, Integer, Integer>(
                "checkPermission(String, Integer, Integer)") {

            @Override
            public Integer call(final String permission, final Integer pid, final Integer uid) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().checkPermission(this, permission, pid, uid);
                } else {
                    return getOriginal().super_checkPermission(permission, pid, uid);
                }
            }
        };
        return superCall.call(permission, pid, uid);
    }

    public int checkSelfPermission(final String permission) {
        if (!mIsOverridden_checkSelfPermissionSg) {
            return getOriginal().super_checkSelfPermission(permission);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_checkSelfPermissionSg < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_checkSelfPermissionSg++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("checkSelfPermission(String)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("checkSelfPermission", String.class);
                mMethodImplementingPlugins.put("checkSelfPermission(String)", implementingPlugins);
                mIsOverridden_checkSelfPermissionSg = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<Integer, String> superCall = new CallFun1<Integer, String>(
                "checkSelfPermission(String)") {

            @Override
            public Integer call(final String permission) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().checkSelfPermission(this, permission);
                } else {
                    return getOriginal().super_checkSelfPermission(permission);
                }
            }
        };
        return superCall.call(permission);
    }

    public int checkUriPermission(final Uri uri, final int pid, final int uid,
            final int modeFlags) {
        if (!mIsOverridden_checkUriPermissionUiIrIrIr) {
            return getOriginal().super_checkUriPermission(uri, pid, uid, modeFlags);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_checkUriPermissionUiIrIrIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_checkUriPermissionUiIrIrIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("checkUriPermission(Uri, Integer, Integer, Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("checkUriPermission", Uri.class,
                        Integer.class, Integer.class, Integer.class);
                mMethodImplementingPlugins.put("checkUriPermission(Uri, Integer, Integer, Integer)",
                        implementingPlugins);
                mIsOverridden_checkUriPermissionUiIrIrIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun4<Integer, Uri, Integer, Integer, Integer> superCall
                = new CallFun4<Integer, Uri, Integer, Integer, Integer>(
                "checkUriPermission(Uri, Integer, Integer, Integer)") {

            @Override
            public Integer call(final Uri uri, final Integer pid, final Integer uid,
                    final Integer modeFlags) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().checkUriPermission(this, uri, pid, uid, modeFlags);
                } else {
                    return getOriginal().super_checkUriPermission(uri, pid, uid, modeFlags);
                }
            }
        };
        return superCall.call(uri, pid, uid, modeFlags);
    }

    public int checkUriPermission(final Uri uri, final String readPermission,
            final String writePermission, final int pid, final int uid, final int modeFlags) {
        if (!mIsOverridden_checkUriPermissionUiSgSgIrIrIr) {
            return getOriginal()
                    .super_checkUriPermission(uri, readPermission, writePermission, pid, uid,
                            modeFlags);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_checkUriPermissionUiSgSgIrIrIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_checkUriPermissionUiSgSgIrIrIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("checkUriPermission(Uri, String, String, Integer, Integer, Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("checkUriPermission", Uri.class,
                        String.class, String.class, Integer.class, Integer.class, Integer.class);
                mMethodImplementingPlugins
                        .put("checkUriPermission(Uri, String, String, Integer, Integer, Integer)",
                                implementingPlugins);
                mIsOverridden_checkUriPermissionUiSgSgIrIrIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun6<Integer, Uri, String, String, Integer, Integer, Integer> superCall
                = new CallFun6<Integer, Uri, String, String, Integer, Integer, Integer>(
                "checkUriPermission(Uri, String, String, Integer, Integer, Integer)") {

            @Override
            public Integer call(final Uri uri, final String readPermission,
                    final String writePermission, final Integer pid, final Integer uid,
                    final Integer modeFlags) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .checkUriPermission(this, uri, readPermission, writePermission, pid,
                                    uid, modeFlags);
                } else {
                    return getOriginal()
                            .super_checkUriPermission(uri, readPermission, writePermission, pid,
                                    uid, modeFlags);
                }
            }
        };
        return superCall.call(uri, readPermission, writePermission, pid, uid, modeFlags);
    }

    public void clearWallpaper() throws IOException {
        if (!mIsOverridden_clearWallpaper) {
            getOriginal().super_clearWallpaper();
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_clearWallpaper < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_clearWallpaper++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("clearWallpaper()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("clearWallpaper");
                mMethodImplementingPlugins.put("clearWallpaper()", implementingPlugins);
                mIsOverridden_clearWallpaper = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid0 superCall = new CallVoid0("clearWallpaper()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    try {
                        iterator.previous().clearWallpaper(this);
                    } catch (IOException e) {
                        throw new SuppressedException(e);
                    }
                } else {
                    try {
                        getOriginal().super_clearWallpaper();
                    } catch (IOException e) {
                        throw new SuppressedException(e);
                    }
                }
            }
        };
        superCall.call();
    }

    public void closeContextMenu() {
        if (!mIsOverridden_closeContextMenu) {
            getOriginal().super_closeContextMenu();
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_closeContextMenu < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_closeContextMenu++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("closeContextMenu()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("closeContextMenu");
                mMethodImplementingPlugins.put("closeContextMenu()", implementingPlugins);
                mIsOverridden_closeContextMenu = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid0 superCall = new CallVoid0("closeContextMenu()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().closeContextMenu(this);
                } else {
                    getOriginal().super_closeContextMenu();
                }
            }
        };
        superCall.call();
    }

    public void closeOptionsMenu() {
        if (!mIsOverridden_closeOptionsMenu) {
            getOriginal().super_closeOptionsMenu();
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_closeOptionsMenu < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_closeOptionsMenu++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("closeOptionsMenu()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("closeOptionsMenu");
                mMethodImplementingPlugins.put("closeOptionsMenu()", implementingPlugins);
                mIsOverridden_closeOptionsMenu = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid0 superCall = new CallVoid0("closeOptionsMenu()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().closeOptionsMenu(this);
                } else {
                    getOriginal().super_closeOptionsMenu();
                }
            }
        };
        superCall.call();
    }

    public Context createConfigurationContext(final Configuration overrideConfiguration) {
        if (!mIsOverridden_createConfigurationContextCn) {
            return getOriginal().super_createConfigurationContext(overrideConfiguration);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_createConfigurationContextCn < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_createConfigurationContextCn++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("createConfigurationContext(Configuration)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("createConfigurationContext",
                        Configuration.class);
                mMethodImplementingPlugins
                        .put("createConfigurationContext(Configuration)", implementingPlugins);
                mIsOverridden_createConfigurationContextCn = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<Context, Configuration> superCall = new CallFun1<Context, Configuration>(
                "createConfigurationContext(Configuration)") {

            @Override
            public Context call(final Configuration overrideConfiguration) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .createConfigurationContext(this, overrideConfiguration);
                } else {
                    return getOriginal().super_createConfigurationContext(overrideConfiguration);
                }
            }
        };
        return superCall.call(overrideConfiguration);
    }

    public Context createDisplayContext(final Display display) {
        if (!mIsOverridden_createDisplayContextDy) {
            return getOriginal().super_createDisplayContext(display);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_createDisplayContextDy < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_createDisplayContextDy++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("createDisplayContext(Display)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("createDisplayContext", Display.class);
                mMethodImplementingPlugins
                        .put("createDisplayContext(Display)", implementingPlugins);
                mIsOverridden_createDisplayContextDy = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<Context, Display> superCall = new CallFun1<Context, Display>(
                "createDisplayContext(Display)") {

            @Override
            public Context call(final Display display) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().createDisplayContext(this, display);
                } else {
                    return getOriginal().super_createDisplayContext(display);
                }
            }
        };
        return superCall.call(display);
    }

    public Context createPackageContext(final String packageName, final int flags)
            throws PackageManager.NameNotFoundException {
        if (!mIsOverridden_createPackageContextSgIr) {
            return getOriginal().super_createPackageContext(packageName, flags);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_createPackageContextSgIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_createPackageContextSgIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("createPackageContext(String, Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("createPackageContext", String.class,
                        Integer.class);
                mMethodImplementingPlugins
                        .put("createPackageContext(String, Integer)", implementingPlugins);
                mIsOverridden_createPackageContextSgIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun2<Context, String, Integer> superCall = new CallFun2<Context, String, Integer>(
                "createPackageContext(String, Integer)") {

            @Override
            public Context call(final String packageName, final Integer flags) {
                if (iterator.hasPrevious()) {
                    try {
                        return iterator.previous().createPackageContext(this, packageName, flags);
                    } catch (PackageManager.NameNotFoundException e) {
                        throw new SuppressedException(e);
                    }
                } else {
                    try {
                        return getOriginal().super_createPackageContext(packageName, flags);
                    } catch (PackageManager.NameNotFoundException e) {
                        throw new SuppressedException(e);
                    }
                }
            }
        };
        return superCall.call(packageName, flags);
    }

    public PendingIntent createPendingResult(final int requestCode, final Intent data,
            final int flags) {
        if (!mIsOverridden_createPendingResultIrItIr) {
            return getOriginal().super_createPendingResult(requestCode, data, flags);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_createPendingResultIrItIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_createPendingResultIrItIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("createPendingResult(Integer, Intent, Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("createPendingResult", Integer.class,
                        Intent.class, Integer.class);
                mMethodImplementingPlugins
                        .put("createPendingResult(Integer, Intent, Integer)", implementingPlugins);
                mIsOverridden_createPendingResultIrItIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun3<PendingIntent, Integer, Intent, Integer> superCall
                = new CallFun3<PendingIntent, Integer, Intent, Integer>(
                "createPendingResult(Integer, Intent, Integer)") {

            @Override
            public PendingIntent call(final Integer requestCode, final Intent data,
                    final Integer flags) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().createPendingResult(this, requestCode, data, flags);
                } else {
                    return getOriginal().super_createPendingResult(requestCode, data, flags);
                }
            }
        };
        return superCall.call(requestCode, data, flags);
    }

    public String[] databaseList() {
        if (!mIsOverridden_databaseList) {
            return getOriginal().super_databaseList();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_databaseList < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_databaseList++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("databaseList()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("databaseList");
                mMethodImplementingPlugins.put("databaseList()", implementingPlugins);
                mIsOverridden_databaseList = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<String[]> superCall = new CallFun0<String[]>("databaseList()") {

            @Override
            public String[] call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().databaseList(this);
                } else {
                    return getOriginal().super_databaseList();
                }
            }
        };
        return superCall.call();
    }

    public boolean deleteDatabase(final String name) {
        if (!mIsOverridden_deleteDatabaseSg) {
            return getOriginal().super_deleteDatabase(name);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_deleteDatabaseSg < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_deleteDatabaseSg++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("deleteDatabase(String)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("deleteDatabase", String.class);
                mMethodImplementingPlugins.put("deleteDatabase(String)", implementingPlugins);
                mIsOverridden_deleteDatabaseSg = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<Boolean, String> superCall = new CallFun1<Boolean, String>(
                "deleteDatabase(String)") {

            @Override
            public Boolean call(final String name) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().deleteDatabase(this, name);
                } else {
                    return getOriginal().super_deleteDatabase(name);
                }
            }
        };
        return superCall.call(name);
    }

    public boolean deleteFile(final String name) {
        if (!mIsOverridden_deleteFileSg) {
            return getOriginal().super_deleteFile(name);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_deleteFileSg < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_deleteFileSg++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("deleteFile(String)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("deleteFile", String.class);
                mMethodImplementingPlugins.put("deleteFile(String)", implementingPlugins);
                mIsOverridden_deleteFileSg = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<Boolean, String> superCall = new CallFun1<Boolean, String>(
                "deleteFile(String)") {

            @Override
            public Boolean call(final String name) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().deleteFile(this, name);
                } else {
                    return getOriginal().super_deleteFile(name);
                }
            }
        };
        return superCall.call(name);
    }

    public boolean dispatchGenericMotionEvent(final MotionEvent ev) {
        if (!mIsOverridden_dispatchGenericMotionEventMt) {
            return getOriginal().super_dispatchGenericMotionEvent(ev);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_dispatchGenericMotionEventMt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_dispatchGenericMotionEventMt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("dispatchGenericMotionEvent(MotionEvent)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("dispatchGenericMotionEvent",
                        MotionEvent.class);
                mMethodImplementingPlugins
                        .put("dispatchGenericMotionEvent(MotionEvent)", implementingPlugins);
                mIsOverridden_dispatchGenericMotionEventMt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<Boolean, MotionEvent> superCall = new CallFun1<Boolean, MotionEvent>(
                "dispatchGenericMotionEvent(MotionEvent)") {

            @Override
            public Boolean call(final MotionEvent ev) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().dispatchGenericMotionEvent(this, ev);
                } else {
                    return getOriginal().super_dispatchGenericMotionEvent(ev);
                }
            }
        };
        return superCall.call(ev);
    }

    public boolean dispatchKeyEvent(final KeyEvent event) {
        if (!mIsOverridden_dispatchKeyEventKt) {
            return getOriginal().super_dispatchKeyEvent(event);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_dispatchKeyEventKt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_dispatchKeyEventKt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("dispatchKeyEvent(KeyEvent)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("dispatchKeyEvent", KeyEvent.class);
                mMethodImplementingPlugins.put("dispatchKeyEvent(KeyEvent)", implementingPlugins);
                mIsOverridden_dispatchKeyEventKt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<Boolean, KeyEvent> superCall = new CallFun1<Boolean, KeyEvent>(
                "dispatchKeyEvent(KeyEvent)") {

            @Override
            public Boolean call(final KeyEvent event) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().dispatchKeyEvent(this, event);
                } else {
                    return getOriginal().super_dispatchKeyEvent(event);
                }
            }
        };
        return superCall.call(event);
    }

    public boolean dispatchKeyShortcutEvent(final KeyEvent event) {
        if (!mIsOverridden_dispatchKeyShortcutEventKt) {
            return getOriginal().super_dispatchKeyShortcutEvent(event);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_dispatchKeyShortcutEventKt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_dispatchKeyShortcutEventKt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("dispatchKeyShortcutEvent(KeyEvent)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("dispatchKeyShortcutEvent",
                        KeyEvent.class);
                mMethodImplementingPlugins
                        .put("dispatchKeyShortcutEvent(KeyEvent)", implementingPlugins);
                mIsOverridden_dispatchKeyShortcutEventKt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<Boolean, KeyEvent> superCall = new CallFun1<Boolean, KeyEvent>(
                "dispatchKeyShortcutEvent(KeyEvent)") {

            @Override
            public Boolean call(final KeyEvent event) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().dispatchKeyShortcutEvent(this, event);
                } else {
                    return getOriginal().super_dispatchKeyShortcutEvent(event);
                }
            }
        };
        return superCall.call(event);
    }

    public boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent event) {
        if (!mIsOverridden_dispatchPopulateAccessibilityEventAt) {
            return getOriginal().super_dispatchPopulateAccessibilityEvent(event);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_dispatchPopulateAccessibilityEventAt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_dispatchPopulateAccessibilityEventAt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("dispatchPopulateAccessibilityEvent(AccessibilityEvent)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("dispatchPopulateAccessibilityEvent",
                        AccessibilityEvent.class);
                mMethodImplementingPlugins
                        .put("dispatchPopulateAccessibilityEvent(AccessibilityEvent)",
                                implementingPlugins);
                mIsOverridden_dispatchPopulateAccessibilityEventAt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<Boolean, AccessibilityEvent> superCall
                = new CallFun1<Boolean, AccessibilityEvent>(
                "dispatchPopulateAccessibilityEvent(AccessibilityEvent)") {

            @Override
            public Boolean call(final AccessibilityEvent event) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().dispatchPopulateAccessibilityEvent(this, event);
                } else {
                    return getOriginal().super_dispatchPopulateAccessibilityEvent(event);
                }
            }
        };
        return superCall.call(event);
    }

    public boolean dispatchTouchEvent(final MotionEvent ev) {
        if (!mIsOverridden_dispatchTouchEventMt) {
            return getOriginal().super_dispatchTouchEvent(ev);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_dispatchTouchEventMt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_dispatchTouchEventMt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("dispatchTouchEvent(MotionEvent)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("dispatchTouchEvent",
                        MotionEvent.class);
                mMethodImplementingPlugins
                        .put("dispatchTouchEvent(MotionEvent)", implementingPlugins);
                mIsOverridden_dispatchTouchEventMt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<Boolean, MotionEvent> superCall = new CallFun1<Boolean, MotionEvent>(
                "dispatchTouchEvent(MotionEvent)") {

            @Override
            public Boolean call(final MotionEvent ev) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().dispatchTouchEvent(this, ev);
                } else {
                    return getOriginal().super_dispatchTouchEvent(ev);
                }
            }
        };
        return superCall.call(ev);
    }

    public boolean dispatchTrackballEvent(final MotionEvent ev) {
        if (!mIsOverridden_dispatchTrackballEventMt) {
            return getOriginal().super_dispatchTrackballEvent(ev);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_dispatchTrackballEventMt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_dispatchTrackballEventMt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("dispatchTrackballEvent(MotionEvent)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("dispatchTrackballEvent",
                        MotionEvent.class);
                mMethodImplementingPlugins
                        .put("dispatchTrackballEvent(MotionEvent)", implementingPlugins);
                mIsOverridden_dispatchTrackballEventMt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<Boolean, MotionEvent> superCall = new CallFun1<Boolean, MotionEvent>(
                "dispatchTrackballEvent(MotionEvent)") {

            @Override
            public Boolean call(final MotionEvent ev) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().dispatchTrackballEvent(this, ev);
                } else {
                    return getOriginal().super_dispatchTrackballEvent(ev);
                }
            }
        };
        return superCall.call(ev);
    }

    public void dump(final String prefix, final FileDescriptor fd, final PrintWriter writer,
            final String[] args) {
        if (!mIsOverridden_dumpSgFrPrSg) {
            getOriginal().super_dump(prefix, fd, writer, args);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_dumpSgFrPrSg < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_dumpSgFrPrSg++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
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

    public void enforceCallingOrSelfPermission(final String permission, final String message) {
        if (!mIsOverridden_enforceCallingOrSelfPermissionSgSg) {
            getOriginal().super_enforceCallingOrSelfPermission(permission, message);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_enforceCallingOrSelfPermissionSgSg < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_enforceCallingOrSelfPermissionSgSg++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("enforceCallingOrSelfPermission(String, String)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("enforceCallingOrSelfPermission",
                        String.class, String.class);
                mMethodImplementingPlugins
                        .put("enforceCallingOrSelfPermission(String, String)", implementingPlugins);
                mIsOverridden_enforceCallingOrSelfPermissionSgSg = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid2<String, String> superCall = new CallVoid2<String, String>(
                "enforceCallingOrSelfPermission(String, String)") {

            @Override
            public void call(final String permission, final String message) {
                if (iterator.hasPrevious()) {
                    iterator.previous().enforceCallingOrSelfPermission(this, permission, message);
                } else {
                    getOriginal().super_enforceCallingOrSelfPermission(permission, message);
                }
            }
        };
        superCall.call(permission, message);
    }

    public void enforceCallingOrSelfUriPermission(final Uri uri, final int modeFlags,
            final String message) {
        if (!mIsOverridden_enforceCallingOrSelfUriPermissionUiIrSg) {
            getOriginal().super_enforceCallingOrSelfUriPermission(uri, modeFlags, message);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_enforceCallingOrSelfUriPermissionUiIrSg
                < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_enforceCallingOrSelfUriPermissionUiIrSg++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("enforceCallingOrSelfUriPermission(Uri, Integer, String)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("enforceCallingOrSelfUriPermission",
                        Uri.class, Integer.class, String.class);
                mMethodImplementingPlugins
                        .put("enforceCallingOrSelfUriPermission(Uri, Integer, String)",
                                implementingPlugins);
                mIsOverridden_enforceCallingOrSelfUriPermissionUiIrSg = implementingPlugins.size()
                        > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid3<Uri, Integer, String> superCall = new CallVoid3<Uri, Integer, String>(
                "enforceCallingOrSelfUriPermission(Uri, Integer, String)") {

            @Override
            public void call(final Uri uri, final Integer modeFlags, final String message) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .enforceCallingOrSelfUriPermission(this, uri, modeFlags, message);
                } else {
                    getOriginal().super_enforceCallingOrSelfUriPermission(uri, modeFlags, message);
                }
            }
        };
        superCall.call(uri, modeFlags, message);
    }

    public void enforceCallingPermission(final String permission, final String message) {
        if (!mIsOverridden_enforceCallingPermissionSgSg) {
            getOriginal().super_enforceCallingPermission(permission, message);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_enforceCallingPermissionSgSg < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_enforceCallingPermissionSgSg++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("enforceCallingPermission(String, String)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("enforceCallingPermission",
                        String.class, String.class);
                mMethodImplementingPlugins
                        .put("enforceCallingPermission(String, String)", implementingPlugins);
                mIsOverridden_enforceCallingPermissionSgSg = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid2<String, String> superCall = new CallVoid2<String, String>(
                "enforceCallingPermission(String, String)") {

            @Override
            public void call(final String permission, final String message) {
                if (iterator.hasPrevious()) {
                    iterator.previous().enforceCallingPermission(this, permission, message);
                } else {
                    getOriginal().super_enforceCallingPermission(permission, message);
                }
            }
        };
        superCall.call(permission, message);
    }

    public void enforceCallingUriPermission(final Uri uri, final int modeFlags,
            final String message) {
        if (!mIsOverridden_enforceCallingUriPermissionUiIrSg) {
            getOriginal().super_enforceCallingUriPermission(uri, modeFlags, message);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_enforceCallingUriPermissionUiIrSg < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_enforceCallingUriPermissionUiIrSg++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("enforceCallingUriPermission(Uri, Integer, String)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("enforceCallingUriPermission",
                        Uri.class, Integer.class, String.class);
                mMethodImplementingPlugins.put("enforceCallingUriPermission(Uri, Integer, String)",
                        implementingPlugins);
                mIsOverridden_enforceCallingUriPermissionUiIrSg = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid3<Uri, Integer, String> superCall = new CallVoid3<Uri, Integer, String>(
                "enforceCallingUriPermission(Uri, Integer, String)") {

            @Override
            public void call(final Uri uri, final Integer modeFlags, final String message) {
                if (iterator.hasPrevious()) {
                    iterator.previous().enforceCallingUriPermission(this, uri, modeFlags, message);
                } else {
                    getOriginal().super_enforceCallingUriPermission(uri, modeFlags, message);
                }
            }
        };
        superCall.call(uri, modeFlags, message);
    }

    public void enforcePermission(final String permission, final int pid, final int uid,
            final String message) {
        if (!mIsOverridden_enforcePermissionSgIrIrSg) {
            getOriginal().super_enforcePermission(permission, pid, uid, message);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_enforcePermissionSgIrIrSg < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_enforcePermissionSgIrIrSg++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("enforcePermission(String, Integer, Integer, String)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("enforcePermission", String.class,
                        Integer.class, Integer.class, String.class);
                mMethodImplementingPlugins
                        .put("enforcePermission(String, Integer, Integer, String)",
                                implementingPlugins);
                mIsOverridden_enforcePermissionSgIrIrSg = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid4<String, Integer, Integer, String> superCall
                = new CallVoid4<String, Integer, Integer, String>(
                "enforcePermission(String, Integer, Integer, String)") {

            @Override
            public void call(final String permission, final Integer pid, final Integer uid,
                    final String message) {
                if (iterator.hasPrevious()) {
                    iterator.previous().enforcePermission(this, permission, pid, uid, message);
                } else {
                    getOriginal().super_enforcePermission(permission, pid, uid, message);
                }
            }
        };
        superCall.call(permission, pid, uid, message);
    }

    public void enforceUriPermission(final Uri uri, final int pid, final int uid,
            final int modeFlags, final String message) {
        if (!mIsOverridden_enforceUriPermissionUiIrIrIrSg) {
            getOriginal().super_enforceUriPermission(uri, pid, uid, modeFlags, message);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_enforceUriPermissionUiIrIrIrSg < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_enforceUriPermissionUiIrIrIrSg++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("enforceUriPermission(Uri, Integer, Integer, Integer, String)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("enforceUriPermission", Uri.class,
                        Integer.class, Integer.class, Integer.class, String.class);
                mMethodImplementingPlugins
                        .put("enforceUriPermission(Uri, Integer, Integer, Integer, String)",
                                implementingPlugins);
                mIsOverridden_enforceUriPermissionUiIrIrIrSg = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid5<Uri, Integer, Integer, Integer, String> superCall
                = new CallVoid5<Uri, Integer, Integer, Integer, String>(
                "enforceUriPermission(Uri, Integer, Integer, Integer, String)") {

            @Override
            public void call(final Uri uri, final Integer pid, final Integer uid,
                    final Integer modeFlags, final String message) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .enforceUriPermission(this, uri, pid, uid, modeFlags, message);
                } else {
                    getOriginal().super_enforceUriPermission(uri, pid, uid, modeFlags, message);
                }
            }
        };
        superCall.call(uri, pid, uid, modeFlags, message);
    }

    public void enforceUriPermission(final Uri uri, final String readPermission,
            final String writePermission, final int pid, final int uid, final int modeFlags,
            final String message) {
        if (!mIsOverridden_enforceUriPermissionUiSgSgIrIrIrSg) {
            getOriginal().super_enforceUriPermission(uri, readPermission, writePermission, pid, uid,
                    modeFlags, message);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_enforceUriPermissionUiSgSgIrIrIrSg < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_enforceUriPermissionUiSgSgIrIrIrSg++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("enforceUriPermission(Uri, String, String, Integer, Integer, Integer, String)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("enforceUriPermission", Uri.class,
                        String.class, String.class, Integer.class, Integer.class, Integer.class,
                        String.class);
                mMethodImplementingPlugins
                        .put("enforceUriPermission(Uri, String, String, Integer, Integer, Integer, String)",
                                implementingPlugins);
                mIsOverridden_enforceUriPermissionUiSgSgIrIrIrSg = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid7<Uri, String, String, Integer, Integer, Integer, String> superCall
                = new CallVoid7<Uri, String, String, Integer, Integer, Integer, String>(
                "enforceUriPermission(Uri, String, String, Integer, Integer, Integer, String)") {

            @Override
            public void call(final Uri uri, final String readPermission,
                    final String writePermission, final Integer pid, final Integer uid,
                    final Integer modeFlags, final String message) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .enforceUriPermission(this, uri, readPermission, writePermission, pid,
                                    uid, modeFlags, message);
                } else {
                    getOriginal()
                            .super_enforceUriPermission(uri, readPermission, writePermission, pid,
                                    uid, modeFlags, message);
                }
            }
        };
        superCall.call(uri, readPermission, writePermission, pid, uid, modeFlags, message);
    }

    public String[] fileList() {
        if (!mIsOverridden_fileList) {
            return getOriginal().super_fileList();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_fileList < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_fileList++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins.get("fileList()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("fileList");
                mMethodImplementingPlugins.put("fileList()", implementingPlugins);
                mIsOverridden_fileList = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<String[]> superCall = new CallFun0<String[]>("fileList()") {

            @Override
            public String[] call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().fileList(this);
                } else {
                    return getOriginal().super_fileList();
                }
            }
        };
        return superCall.call();
    }

    public View findViewById(@IdRes final int id) {
        if (!mIsOverridden_findViewByIdIr) {
            return getOriginal().super_findViewById(id);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_findViewByIdIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_findViewByIdIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("findViewById(Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("findViewById", Integer.class);
                mMethodImplementingPlugins.put("findViewById(Integer)", implementingPlugins);
                mIsOverridden_findViewByIdIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<View, Integer> superCall = new CallFun1<View, Integer>(
                "findViewById(Integer)") {

            @Override
            public View call(final Integer id) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().findViewById(this, id);
                } else {
                    return getOriginal().super_findViewById(id);
                }
            }
        };
        return superCall.call(id);
    }

    public void finish() {
        if (!mIsOverridden_finish) {
            getOriginal().super_finish();
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_finish < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_finish++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins.get("finish()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("finish");
                mMethodImplementingPlugins.put("finish()", implementingPlugins);
                mIsOverridden_finish = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid0 superCall = new CallVoid0("finish()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().finish(this);
                } else {
                    getOriginal().super_finish();
                }
            }
        };
        superCall.call();
    }

    public void finishActivity(final int requestCode) {
        if (!mIsOverridden_finishActivityIr) {
            getOriginal().super_finishActivity(requestCode);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_finishActivityIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_finishActivityIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("finishActivity(Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("finishActivity", Integer.class);
                mMethodImplementingPlugins.put("finishActivity(Integer)", implementingPlugins);
                mIsOverridden_finishActivityIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<Integer> superCall = new CallVoid1<Integer>("finishActivity(Integer)") {

            @Override
            public void call(final Integer requestCode) {
                if (iterator.hasPrevious()) {
                    iterator.previous().finishActivity(this, requestCode);
                } else {
                    getOriginal().super_finishActivity(requestCode);
                }
            }
        };
        superCall.call(requestCode);
    }

    public void finishActivityFromChild(final Activity child, final int requestCode) {
        if (!mIsOverridden_finishActivityFromChildAyIr) {
            getOriginal().super_finishActivityFromChild(child, requestCode);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_finishActivityFromChildAyIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_finishActivityFromChildAyIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("finishActivityFromChild(Activity, Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("finishActivityFromChild",
                        Activity.class, Integer.class);
                mMethodImplementingPlugins
                        .put("finishActivityFromChild(Activity, Integer)", implementingPlugins);
                mIsOverridden_finishActivityFromChildAyIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid2<Activity, Integer> superCall = new CallVoid2<Activity, Integer>(
                "finishActivityFromChild(Activity, Integer)") {

            @Override
            public void call(final Activity child, final Integer requestCode) {
                if (iterator.hasPrevious()) {
                    iterator.previous().finishActivityFromChild(this, child, requestCode);
                } else {
                    getOriginal().super_finishActivityFromChild(child, requestCode);
                }
            }
        };
        superCall.call(child, requestCode);
    }

    public void finishAffinity() {
        if (!mIsOverridden_finishAffinity) {
            getOriginal().super_finishAffinity();
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_finishAffinity < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_finishAffinity++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("finishAffinity()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("finishAffinity");
                mMethodImplementingPlugins.put("finishAffinity()", implementingPlugins);
                mIsOverridden_finishAffinity = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid0 superCall = new CallVoid0("finishAffinity()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().finishAffinity(this);
                } else {
                    getOriginal().super_finishAffinity();
                }
            }
        };
        superCall.call();
    }

    public void finishAfterTransition() {
        if (!mIsOverridden_finishAfterTransition) {
            getOriginal().super_finishAfterTransition();
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_finishAfterTransition < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_finishAfterTransition++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("finishAfterTransition()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("finishAfterTransition");
                mMethodImplementingPlugins.put("finishAfterTransition()", implementingPlugins);
                mIsOverridden_finishAfterTransition = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid0 superCall = new CallVoid0("finishAfterTransition()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().finishAfterTransition(this);
                } else {
                    getOriginal().super_finishAfterTransition();
                }
            }
        };
        superCall.call();
    }

    public void finishAndRemoveTask() {
        if (!mIsOverridden_finishAndRemoveTask) {
            getOriginal().super_finishAndRemoveTask();
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_finishAndRemoveTask < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_finishAndRemoveTask++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("finishAndRemoveTask()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("finishAndRemoveTask");
                mMethodImplementingPlugins.put("finishAndRemoveTask()", implementingPlugins);
                mIsOverridden_finishAndRemoveTask = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid0 superCall = new CallVoid0("finishAndRemoveTask()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().finishAndRemoveTask(this);
                } else {
                    getOriginal().super_finishAndRemoveTask();
                }
            }
        };
        superCall.call();
    }

    public void finishFromChild(final Activity child) {
        if (!mIsOverridden_finishFromChildAy) {
            getOriginal().super_finishFromChild(child);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_finishFromChildAy < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_finishFromChildAy++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("finishFromChild(Activity)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("finishFromChild", Activity.class);
                mMethodImplementingPlugins.put("finishFromChild(Activity)", implementingPlugins);
                mIsOverridden_finishFromChildAy = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<Activity> superCall = new CallVoid1<Activity>("finishFromChild(Activity)") {

            @Override
            public void call(final Activity child) {
                if (iterator.hasPrevious()) {
                    iterator.previous().finishFromChild(this, child);
                } else {
                    getOriginal().super_finishFromChild(child);
                }
            }
        };
        superCall.call(child);
    }

    public android.app.ActionBar getActionBar() {
        if (!mIsOverridden_getActionBar) {
            return getOriginal().super_getActionBar();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getActionBar < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getActionBar++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getActionBar()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getActionBar");
                mMethodImplementingPlugins.put("getActionBar()", implementingPlugins);
                mIsOverridden_getActionBar = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<android.app.ActionBar> superCall = new CallFun0<android.app.ActionBar>(
                "getActionBar()") {

            @Override
            public android.app.ActionBar call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getActionBar(this);
                } else {
                    return getOriginal().super_getActionBar();
                }
            }
        };
        return superCall.call();
    }

    public Context getApplicationContext() {
        if (!mIsOverridden_getApplicationContext) {
            return getOriginal().super_getApplicationContext();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getApplicationContext < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getApplicationContext++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getApplicationContext()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getApplicationContext");
                mMethodImplementingPlugins.put("getApplicationContext()", implementingPlugins);
                mIsOverridden_getApplicationContext = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<Context> superCall = new CallFun0<Context>("getApplicationContext()") {

            @Override
            public Context call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getApplicationContext(this);
                } else {
                    return getOriginal().super_getApplicationContext();
                }
            }
        };
        return superCall.call();
    }

    public ApplicationInfo getApplicationInfo() {
        if (!mIsOverridden_getApplicationInfo) {
            return getOriginal().super_getApplicationInfo();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getApplicationInfo < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getApplicationInfo++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getApplicationInfo()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getApplicationInfo");
                mMethodImplementingPlugins.put("getApplicationInfo()", implementingPlugins);
                mIsOverridden_getApplicationInfo = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<ApplicationInfo> superCall = new CallFun0<ApplicationInfo>(
                "getApplicationInfo()") {

            @Override
            public ApplicationInfo call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getApplicationInfo(this);
                } else {
                    return getOriginal().super_getApplicationInfo();
                }
            }
        };
        return superCall.call();
    }

    public AssetManager getAssets() {
        if (!mIsOverridden_getAssets) {
            return getOriginal().super_getAssets();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getAssets < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getAssets++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getAssets()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getAssets");
                mMethodImplementingPlugins.put("getAssets()", implementingPlugins);
                mIsOverridden_getAssets = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<AssetManager> superCall = new CallFun0<AssetManager>("getAssets()") {

            @Override
            public AssetManager call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getAssets(this);
                } else {
                    return getOriginal().super_getAssets();
                }
            }
        };
        return superCall.call();
    }

    public Context getBaseContext() {
        if (!mIsOverridden_getBaseContext) {
            return getOriginal().super_getBaseContext();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getBaseContext < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getBaseContext++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getBaseContext()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getBaseContext");
                mMethodImplementingPlugins.put("getBaseContext()", implementingPlugins);
                mIsOverridden_getBaseContext = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<Context> superCall = new CallFun0<Context>("getBaseContext()") {

            @Override
            public Context call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getBaseContext(this);
                } else {
                    return getOriginal().super_getBaseContext();
                }
            }
        };
        return superCall.call();
    }

    public File getCacheDir() {
        if (!mIsOverridden_getCacheDir) {
            return getOriginal().super_getCacheDir();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getCacheDir < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getCacheDir++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getCacheDir()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getCacheDir");
                mMethodImplementingPlugins.put("getCacheDir()", implementingPlugins);
                mIsOverridden_getCacheDir = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<File> superCall = new CallFun0<File>("getCacheDir()") {

            @Override
            public File call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getCacheDir(this);
                } else {
                    return getOriginal().super_getCacheDir();
                }
            }
        };
        return superCall.call();
    }

    public ComponentName getCallingActivity() {
        if (!mIsOverridden_getCallingActivity) {
            return getOriginal().super_getCallingActivity();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getCallingActivity < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getCallingActivity++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getCallingActivity()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getCallingActivity");
                mMethodImplementingPlugins.put("getCallingActivity()", implementingPlugins);
                mIsOverridden_getCallingActivity = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<ComponentName> superCall = new CallFun0<ComponentName>(
                "getCallingActivity()") {

            @Override
            public ComponentName call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getCallingActivity(this);
                } else {
                    return getOriginal().super_getCallingActivity();
                }
            }
        };
        return superCall.call();
    }

    public String getCallingPackage() {
        if (!mIsOverridden_getCallingPackage) {
            return getOriginal().super_getCallingPackage();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getCallingPackage < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getCallingPackage++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getCallingPackage()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getCallingPackage");
                mMethodImplementingPlugins.put("getCallingPackage()", implementingPlugins);
                mIsOverridden_getCallingPackage = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<String> superCall = new CallFun0<String>("getCallingPackage()") {

            @Override
            public String call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getCallingPackage(this);
                } else {
                    return getOriginal().super_getCallingPackage();
                }
            }
        };
        return superCall.call();
    }

    public int getChangingConfigurations() {
        if (!mIsOverridden_getChangingConfigurations) {
            return getOriginal().super_getChangingConfigurations();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getChangingConfigurations < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getChangingConfigurations++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getChangingConfigurations()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getChangingConfigurations");
                mMethodImplementingPlugins.put("getChangingConfigurations()", implementingPlugins);
                mIsOverridden_getChangingConfigurations = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<Integer> superCall = new CallFun0<Integer>("getChangingConfigurations()") {

            @Override
            public Integer call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getChangingConfigurations(this);
                } else {
                    return getOriginal().super_getChangingConfigurations();
                }
            }
        };
        return superCall.call();
    }

    public ClassLoader getClassLoader() {
        if (!mIsOverridden_getClassLoader) {
            return getOriginal().super_getClassLoader();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getClassLoader < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getClassLoader++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getClassLoader()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getClassLoader");
                mMethodImplementingPlugins.put("getClassLoader()", implementingPlugins);
                mIsOverridden_getClassLoader = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<ClassLoader> superCall = new CallFun0<ClassLoader>("getClassLoader()") {

            @Override
            public ClassLoader call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getClassLoader(this);
                } else {
                    return getOriginal().super_getClassLoader();
                }
            }
        };
        return superCall.call();
    }

    public File getCodeCacheDir() {
        if (!mIsOverridden_getCodeCacheDir) {
            return getOriginal().super_getCodeCacheDir();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getCodeCacheDir < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getCodeCacheDir++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getCodeCacheDir()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getCodeCacheDir");
                mMethodImplementingPlugins.put("getCodeCacheDir()", implementingPlugins);
                mIsOverridden_getCodeCacheDir = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<File> superCall = new CallFun0<File>("getCodeCacheDir()") {

            @Override
            public File call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getCodeCacheDir(this);
                } else {
                    return getOriginal().super_getCodeCacheDir();
                }
            }
        };
        return superCall.call();
    }

    public ComponentName getComponentName() {
        if (!mIsOverridden_getComponentName) {
            return getOriginal().super_getComponentName();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getComponentName < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getComponentName++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getComponentName()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getComponentName");
                mMethodImplementingPlugins.put("getComponentName()", implementingPlugins);
                mIsOverridden_getComponentName = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<ComponentName> superCall = new CallFun0<ComponentName>(
                "getComponentName()") {

            @Override
            public ComponentName call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getComponentName(this);
                } else {
                    return getOriginal().super_getComponentName();
                }
            }
        };
        return superCall.call();
    }

    public ContentResolver getContentResolver() {
        if (!mIsOverridden_getContentResolver) {
            return getOriginal().super_getContentResolver();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getContentResolver < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getContentResolver++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getContentResolver()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getContentResolver");
                mMethodImplementingPlugins.put("getContentResolver()", implementingPlugins);
                mIsOverridden_getContentResolver = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<ContentResolver> superCall = new CallFun0<ContentResolver>(
                "getContentResolver()") {

            @Override
            public ContentResolver call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getContentResolver(this);
                } else {
                    return getOriginal().super_getContentResolver();
                }
            }
        };
        return superCall.call();
    }

    public Scene getContentScene() {
        if (!mIsOverridden_getContentScene) {
            return getOriginal().super_getContentScene();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getContentScene < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getContentScene++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getContentScene()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getContentScene");
                mMethodImplementingPlugins.put("getContentScene()", implementingPlugins);
                mIsOverridden_getContentScene = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<Scene> superCall = new CallFun0<Scene>("getContentScene()") {

            @Override
            public Scene call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getContentScene(this);
                } else {
                    return getOriginal().super_getContentScene();
                }
            }
        };
        return superCall.call();
    }

    public TransitionManager getContentTransitionManager() {
        if (!mIsOverridden_getContentTransitionManager) {
            return getOriginal().super_getContentTransitionManager();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getContentTransitionManager < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getContentTransitionManager++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getContentTransitionManager()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getContentTransitionManager");
                mMethodImplementingPlugins
                        .put("getContentTransitionManager()", implementingPlugins);
                mIsOverridden_getContentTransitionManager = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<TransitionManager> superCall = new CallFun0<TransitionManager>(
                "getContentTransitionManager()") {

            @Override
            public TransitionManager call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getContentTransitionManager(this);
                } else {
                    return getOriginal().super_getContentTransitionManager();
                }
            }
        };
        return superCall.call();
    }

    public View getCurrentFocus() {
        if (!mIsOverridden_getCurrentFocus) {
            return getOriginal().super_getCurrentFocus();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getCurrentFocus < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getCurrentFocus++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getCurrentFocus()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getCurrentFocus");
                mMethodImplementingPlugins.put("getCurrentFocus()", implementingPlugins);
                mIsOverridden_getCurrentFocus = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<View> superCall = new CallFun0<View>("getCurrentFocus()") {

            @Override
            public View call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getCurrentFocus(this);
                } else {
                    return getOriginal().super_getCurrentFocus();
                }
            }
        };
        return superCall.call();
    }

    public File getDatabasePath(final String name) {
        if (!mIsOverridden_getDatabasePathSg) {
            return getOriginal().super_getDatabasePath(name);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getDatabasePathSg < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getDatabasePathSg++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getDatabasePath(String)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getDatabasePath", String.class);
                mMethodImplementingPlugins.put("getDatabasePath(String)", implementingPlugins);
                mIsOverridden_getDatabasePathSg = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<File, String> superCall = new CallFun1<File, String>(
                "getDatabasePath(String)") {

            @Override
            public File call(final String name) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getDatabasePath(this, name);
                } else {
                    return getOriginal().super_getDatabasePath(name);
                }
            }
        };
        return superCall.call(name);
    }

    public AppCompatDelegate getDelegate() {
        if (!mIsOverridden_getDelegate) {
            return getOriginal().super_getDelegate();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getDelegate < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getDelegate++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getDelegate()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getDelegate");
                mMethodImplementingPlugins.put("getDelegate()", implementingPlugins);
                mIsOverridden_getDelegate = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<AppCompatDelegate> superCall = new CallFun0<AppCompatDelegate>(
                "getDelegate()") {

            @Override
            public AppCompatDelegate call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getDelegate(this);
                } else {
                    return getOriginal().super_getDelegate();
                }
            }
        };
        return superCall.call();
    }

    public File getDir(final String name, final int mode) {
        if (!mIsOverridden_getDirSgIr) {
            return getOriginal().super_getDir(name, mode);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getDirSgIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getDirSgIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getDir(String, Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getDir", String.class, Integer.class);
                mMethodImplementingPlugins.put("getDir(String, Integer)", implementingPlugins);
                mIsOverridden_getDirSgIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun2<File, String, Integer> superCall = new CallFun2<File, String, Integer>(
                "getDir(String, Integer)") {

            @Override
            public File call(final String name, final Integer mode) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getDir(this, name, mode);
                } else {
                    return getOriginal().super_getDir(name, mode);
                }
            }
        };
        return superCall.call(name, mode);
    }

    public ActionBarDrawerToggle.Delegate getDrawerToggleDelegate() {
        if (!mIsOverridden_getDrawerToggleDelegate) {
            return getOriginal().super_getDrawerToggleDelegate();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getDrawerToggleDelegate < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getDrawerToggleDelegate++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getDrawerToggleDelegate()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getDrawerToggleDelegate");
                mMethodImplementingPlugins.put("getDrawerToggleDelegate()", implementingPlugins);
                mIsOverridden_getDrawerToggleDelegate = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<ActionBarDrawerToggle.Delegate> superCall
                = new CallFun0<ActionBarDrawerToggle.Delegate>("getDrawerToggleDelegate()") {

            @Override
            public ActionBarDrawerToggle.Delegate call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getDrawerToggleDelegate(this);
                } else {
                    return getOriginal().super_getDrawerToggleDelegate();
                }
            }
        };
        return superCall.call();
    }

    public File getExternalCacheDir() {
        if (!mIsOverridden_getExternalCacheDir) {
            return getOriginal().super_getExternalCacheDir();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getExternalCacheDir < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getExternalCacheDir++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getExternalCacheDir()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getExternalCacheDir");
                mMethodImplementingPlugins.put("getExternalCacheDir()", implementingPlugins);
                mIsOverridden_getExternalCacheDir = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<File> superCall = new CallFun0<File>("getExternalCacheDir()") {

            @Override
            public File call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getExternalCacheDir(this);
                } else {
                    return getOriginal().super_getExternalCacheDir();
                }
            }
        };
        return superCall.call();
    }

    public File[] getExternalCacheDirs() {
        if (!mIsOverridden_getExternalCacheDirs) {
            return getOriginal().super_getExternalCacheDirs();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getExternalCacheDirs < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getExternalCacheDirs++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getExternalCacheDirs()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getExternalCacheDirs");
                mMethodImplementingPlugins.put("getExternalCacheDirs()", implementingPlugins);
                mIsOverridden_getExternalCacheDirs = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<File[]> superCall = new CallFun0<File[]>("getExternalCacheDirs()") {

            @Override
            public File[] call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getExternalCacheDirs(this);
                } else {
                    return getOriginal().super_getExternalCacheDirs();
                }
            }
        };
        return superCall.call();
    }

    public File getExternalFilesDir(final String type) {
        if (!mIsOverridden_getExternalFilesDirSg) {
            return getOriginal().super_getExternalFilesDir(type);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getExternalFilesDirSg < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getExternalFilesDirSg++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getExternalFilesDir(String)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getExternalFilesDir", String.class);
                mMethodImplementingPlugins.put("getExternalFilesDir(String)", implementingPlugins);
                mIsOverridden_getExternalFilesDirSg = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<File, String> superCall = new CallFun1<File, String>(
                "getExternalFilesDir(String)") {

            @Override
            public File call(final String type) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getExternalFilesDir(this, type);
                } else {
                    return getOriginal().super_getExternalFilesDir(type);
                }
            }
        };
        return superCall.call(type);
    }

    public File[] getExternalFilesDirs(final String type) {
        if (!mIsOverridden_getExternalFilesDirsSg) {
            return getOriginal().super_getExternalFilesDirs(type);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getExternalFilesDirsSg < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getExternalFilesDirsSg++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getExternalFilesDirs(String)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getExternalFilesDirs", String.class);
                mMethodImplementingPlugins.put("getExternalFilesDirs(String)", implementingPlugins);
                mIsOverridden_getExternalFilesDirsSg = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<File[], String> superCall = new CallFun1<File[], String>(
                "getExternalFilesDirs(String)") {

            @Override
            public File[] call(final String type) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getExternalFilesDirs(this, type);
                } else {
                    return getOriginal().super_getExternalFilesDirs(type);
                }
            }
        };
        return superCall.call(type);
    }

    public File[] getExternalMediaDirs() {
        if (!mIsOverridden_getExternalMediaDirs) {
            return getOriginal().super_getExternalMediaDirs();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getExternalMediaDirs < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getExternalMediaDirs++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getExternalMediaDirs()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getExternalMediaDirs");
                mMethodImplementingPlugins.put("getExternalMediaDirs()", implementingPlugins);
                mIsOverridden_getExternalMediaDirs = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<File[]> superCall = new CallFun0<File[]>("getExternalMediaDirs()") {

            @Override
            public File[] call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getExternalMediaDirs(this);
                } else {
                    return getOriginal().super_getExternalMediaDirs();
                }
            }
        };
        return superCall.call();
    }

    public File getFileStreamPath(final String name) {
        if (!mIsOverridden_getFileStreamPathSg) {
            return getOriginal().super_getFileStreamPath(name);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getFileStreamPathSg < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getFileStreamPathSg++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getFileStreamPath(String)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getFileStreamPath", String.class);
                mMethodImplementingPlugins.put("getFileStreamPath(String)", implementingPlugins);
                mIsOverridden_getFileStreamPathSg = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<File, String> superCall = new CallFun1<File, String>(
                "getFileStreamPath(String)") {

            @Override
            public File call(final String name) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getFileStreamPath(this, name);
                } else {
                    return getOriginal().super_getFileStreamPath(name);
                }
            }
        };
        return superCall.call(name);
    }

    public File getFilesDir() {
        if (!mIsOverridden_getFilesDir) {
            return getOriginal().super_getFilesDir();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getFilesDir < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getFilesDir++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getFilesDir()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getFilesDir");
                mMethodImplementingPlugins.put("getFilesDir()", implementingPlugins);
                mIsOverridden_getFilesDir = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<File> superCall = new CallFun0<File>("getFilesDir()") {

            @Override
            public File call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getFilesDir(this);
                } else {
                    return getOriginal().super_getFilesDir();
                }
            }
        };
        return superCall.call();
    }

    public android.app.FragmentManager getFragmentManager() {
        if (!mIsOverridden_getFragmentManager) {
            return getOriginal().super_getFragmentManager();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getFragmentManager < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getFragmentManager++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getFragmentManager()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getFragmentManager");
                mMethodImplementingPlugins.put("getFragmentManager()", implementingPlugins);
                mIsOverridden_getFragmentManager = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<android.app.FragmentManager> superCall
                = new CallFun0<android.app.FragmentManager>("getFragmentManager()") {

            @Override
            public android.app.FragmentManager call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getFragmentManager(this);
                } else {
                    return getOriginal().super_getFragmentManager();
                }
            }
        };
        return superCall.call();
    }

    public Intent getIntent() {
        if (!mIsOverridden_getIntent) {
            return getOriginal().super_getIntent();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getIntent < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getIntent++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getIntent()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getIntent");
                mMethodImplementingPlugins.put("getIntent()", implementingPlugins);
                mIsOverridden_getIntent = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<Intent> superCall = new CallFun0<Intent>("getIntent()") {

            @Override
            public Intent call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getIntent(this);
                } else {
                    return getOriginal().super_getIntent();
                }
            }
        };
        return superCall.call();
    }

    public Object getLastCompositeCustomNonConfigurationInstance() {
        final Object nci = getOriginal().getLastCustomNonConfigurationInstance();
        if (nci instanceof NonConfigurationInstanceWrapper) {
            final NonConfigurationInstanceWrapper all = (NonConfigurationInstanceWrapper) nci;
            return all.getSuperNonConfigurationInstance();
        }
        return null;
    }

    public Object getLastNonConfigurationInstance(final String key) {
        final Object nci = getOriginal().getLastCustomNonConfigurationInstance();
        if (nci instanceof NonConfigurationInstanceWrapper) {
            final NonConfigurationInstanceWrapper all = (NonConfigurationInstanceWrapper) nci;
            return all.getPluginNonConfigurationInstance(key);
        }
        return null;
    }

    public LayoutInflater getLayoutInflater() {
        if (!mIsOverridden_getLayoutInflater) {
            return getOriginal().super_getLayoutInflater();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getLayoutInflater < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getLayoutInflater++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getLayoutInflater()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getLayoutInflater");
                mMethodImplementingPlugins.put("getLayoutInflater()", implementingPlugins);
                mIsOverridden_getLayoutInflater = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<LayoutInflater> superCall = new CallFun0<LayoutInflater>(
                "getLayoutInflater()") {

            @Override
            public LayoutInflater call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getLayoutInflater(this);
                } else {
                    return getOriginal().super_getLayoutInflater();
                }
            }
        };
        return superCall.call();
    }

    public android.app.LoaderManager getLoaderManager() {
        if (!mIsOverridden_getLoaderManager) {
            return getOriginal().super_getLoaderManager();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getLoaderManager < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getLoaderManager++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getLoaderManager()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getLoaderManager");
                mMethodImplementingPlugins.put("getLoaderManager()", implementingPlugins);
                mIsOverridden_getLoaderManager = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<android.app.LoaderManager> superCall
                = new CallFun0<android.app.LoaderManager>("getLoaderManager()") {

            @Override
            public android.app.LoaderManager call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getLoaderManager(this);
                } else {
                    return getOriginal().super_getLoaderManager();
                }
            }
        };
        return superCall.call();
    }

    public String getLocalClassName() {
        if (!mIsOverridden_getLocalClassName) {
            return getOriginal().super_getLocalClassName();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getLocalClassName < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getLocalClassName++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getLocalClassName()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getLocalClassName");
                mMethodImplementingPlugins.put("getLocalClassName()", implementingPlugins);
                mIsOverridden_getLocalClassName = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<String> superCall = new CallFun0<String>("getLocalClassName()") {

            @Override
            public String call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getLocalClassName(this);
                } else {
                    return getOriginal().super_getLocalClassName();
                }
            }
        };
        return superCall.call();
    }

    public Looper getMainLooper() {
        if (!mIsOverridden_getMainLooper) {
            return getOriginal().super_getMainLooper();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getMainLooper < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getMainLooper++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getMainLooper()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getMainLooper");
                mMethodImplementingPlugins.put("getMainLooper()", implementingPlugins);
                mIsOverridden_getMainLooper = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<Looper> superCall = new CallFun0<Looper>("getMainLooper()") {

            @Override
            public Looper call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getMainLooper(this);
                } else {
                    return getOriginal().super_getMainLooper();
                }
            }
        };
        return superCall.call();
    }

    public MenuInflater getMenuInflater() {
        if (!mIsOverridden_getMenuInflater) {
            return getOriginal().super_getMenuInflater();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getMenuInflater < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getMenuInflater++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getMenuInflater()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getMenuInflater");
                mMethodImplementingPlugins.put("getMenuInflater()", implementingPlugins);
                mIsOverridden_getMenuInflater = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<MenuInflater> superCall = new CallFun0<MenuInflater>("getMenuInflater()") {

            @Override
            public MenuInflater call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getMenuInflater(this);
                } else {
                    return getOriginal().super_getMenuInflater();
                }
            }
        };
        return superCall.call();
    }

    public File getNoBackupFilesDir() {
        if (!mIsOverridden_getNoBackupFilesDir) {
            return getOriginal().super_getNoBackupFilesDir();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getNoBackupFilesDir < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getNoBackupFilesDir++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getNoBackupFilesDir()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getNoBackupFilesDir");
                mMethodImplementingPlugins.put("getNoBackupFilesDir()", implementingPlugins);
                mIsOverridden_getNoBackupFilesDir = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<File> superCall = new CallFun0<File>("getNoBackupFilesDir()") {

            @Override
            public File call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getNoBackupFilesDir(this);
                } else {
                    return getOriginal().super_getNoBackupFilesDir();
                }
            }
        };
        return superCall.call();
    }

    public File getObbDir() {
        if (!mIsOverridden_getObbDir) {
            return getOriginal().super_getObbDir();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getObbDir < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getObbDir++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getObbDir()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getObbDir");
                mMethodImplementingPlugins.put("getObbDir()", implementingPlugins);
                mIsOverridden_getObbDir = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<File> superCall = new CallFun0<File>("getObbDir()") {

            @Override
            public File call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getObbDir(this);
                } else {
                    return getOriginal().super_getObbDir();
                }
            }
        };
        return superCall.call();
    }

    public File[] getObbDirs() {
        if (!mIsOverridden_getObbDirs) {
            return getOriginal().super_getObbDirs();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getObbDirs < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getObbDirs++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getObbDirs()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getObbDirs");
                mMethodImplementingPlugins.put("getObbDirs()", implementingPlugins);
                mIsOverridden_getObbDirs = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<File[]> superCall = new CallFun0<File[]>("getObbDirs()") {

            @Override
            public File[] call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getObbDirs(this);
                } else {
                    return getOriginal().super_getObbDirs();
                }
            }
        };
        return superCall.call();
    }

    public String getPackageCodePath() {
        if (!mIsOverridden_getPackageCodePath) {
            return getOriginal().super_getPackageCodePath();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getPackageCodePath < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getPackageCodePath++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getPackageCodePath()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getPackageCodePath");
                mMethodImplementingPlugins.put("getPackageCodePath()", implementingPlugins);
                mIsOverridden_getPackageCodePath = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<String> superCall = new CallFun0<String>("getPackageCodePath()") {

            @Override
            public String call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getPackageCodePath(this);
                } else {
                    return getOriginal().super_getPackageCodePath();
                }
            }
        };
        return superCall.call();
    }

    public PackageManager getPackageManager() {
        if (!mIsOverridden_getPackageManager) {
            return getOriginal().super_getPackageManager();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getPackageManager < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getPackageManager++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getPackageManager()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getPackageManager");
                mMethodImplementingPlugins.put("getPackageManager()", implementingPlugins);
                mIsOverridden_getPackageManager = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<PackageManager> superCall = new CallFun0<PackageManager>(
                "getPackageManager()") {

            @Override
            public PackageManager call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getPackageManager(this);
                } else {
                    return getOriginal().super_getPackageManager();
                }
            }
        };
        return superCall.call();
    }

    public String getPackageName() {
        if (!mIsOverridden_getPackageName) {
            return getOriginal().super_getPackageName();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getPackageName < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getPackageName++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getPackageName()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getPackageName");
                mMethodImplementingPlugins.put("getPackageName()", implementingPlugins);
                mIsOverridden_getPackageName = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<String> superCall = new CallFun0<String>("getPackageName()") {

            @Override
            public String call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getPackageName(this);
                } else {
                    return getOriginal().super_getPackageName();
                }
            }
        };
        return superCall.call();
    }

    public String getPackageResourcePath() {
        if (!mIsOverridden_getPackageResourcePath) {
            return getOriginal().super_getPackageResourcePath();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getPackageResourcePath < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getPackageResourcePath++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getPackageResourcePath()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getPackageResourcePath");
                mMethodImplementingPlugins.put("getPackageResourcePath()", implementingPlugins);
                mIsOverridden_getPackageResourcePath = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<String> superCall = new CallFun0<String>("getPackageResourcePath()") {

            @Override
            public String call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getPackageResourcePath(this);
                } else {
                    return getOriginal().super_getPackageResourcePath();
                }
            }
        };
        return superCall.call();
    }

    public Intent getParentActivityIntent() {
        if (!mIsOverridden_getParentActivityIntent) {
            return getOriginal().super_getParentActivityIntent();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getParentActivityIntent < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getParentActivityIntent++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getParentActivityIntent()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getParentActivityIntent");
                mMethodImplementingPlugins.put("getParentActivityIntent()", implementingPlugins);
                mIsOverridden_getParentActivityIntent = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<Intent> superCall = new CallFun0<Intent>("getParentActivityIntent()") {

            @Override
            public Intent call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getParentActivityIntent(this);
                } else {
                    return getOriginal().super_getParentActivityIntent();
                }
            }
        };
        return superCall.call();
    }

    public SharedPreferences getPreferences(final int mode) {
        if (!mIsOverridden_getPreferencesIr) {
            return getOriginal().super_getPreferences(mode);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getPreferencesIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getPreferencesIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getPreferences(Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getPreferences", Integer.class);
                mMethodImplementingPlugins.put("getPreferences(Integer)", implementingPlugins);
                mIsOverridden_getPreferencesIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<SharedPreferences, Integer> superCall
                = new CallFun1<SharedPreferences, Integer>("getPreferences(Integer)") {

            @Override
            public SharedPreferences call(final Integer mode) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getPreferences(this, mode);
                } else {
                    return getOriginal().super_getPreferences(mode);
                }
            }
        };
        return superCall.call(mode);
    }

    public Uri getReferrer() {
        if (!mIsOverridden_getReferrer) {
            return getOriginal().super_getReferrer();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getReferrer < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getReferrer++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getReferrer()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getReferrer");
                mMethodImplementingPlugins.put("getReferrer()", implementingPlugins);
                mIsOverridden_getReferrer = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<Uri> superCall = new CallFun0<Uri>("getReferrer()") {

            @Override
            public Uri call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getReferrer(this);
                } else {
                    return getOriginal().super_getReferrer();
                }
            }
        };
        return superCall.call();
    }

    public int getRequestedOrientation() {
        if (!mIsOverridden_getRequestedOrientation) {
            return getOriginal().super_getRequestedOrientation();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getRequestedOrientation < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getRequestedOrientation++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getRequestedOrientation()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getRequestedOrientation");
                mMethodImplementingPlugins.put("getRequestedOrientation()", implementingPlugins);
                mIsOverridden_getRequestedOrientation = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<Integer> superCall = new CallFun0<Integer>("getRequestedOrientation()") {

            @Override
            public Integer call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getRequestedOrientation(this);
                } else {
                    return getOriginal().super_getRequestedOrientation();
                }
            }
        };
        return superCall.call();
    }

    public Resources getResources() {
        if (!mIsOverridden_getResources) {
            return getOriginal().super_getResources();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getResources < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getResources++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getResources()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getResources");
                mMethodImplementingPlugins.put("getResources()", implementingPlugins);
                mIsOverridden_getResources = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<Resources> superCall = new CallFun0<Resources>("getResources()") {

            @Override
            public Resources call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getResources(this);
                } else {
                    return getOriginal().super_getResources();
                }
            }
        };
        return superCall.call();
    }

    public SharedPreferences getSharedPreferences(final String name, final int mode) {
        if (!mIsOverridden_getSharedPreferencesSgIr) {
            return getOriginal().super_getSharedPreferences(name, mode);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getSharedPreferencesSgIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getSharedPreferencesSgIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getSharedPreferences(String, Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getSharedPreferences", String.class,
                        Integer.class);
                mMethodImplementingPlugins
                        .put("getSharedPreferences(String, Integer)", implementingPlugins);
                mIsOverridden_getSharedPreferencesSgIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun2<SharedPreferences, String, Integer> superCall
                = new CallFun2<SharedPreferences, String, Integer>(
                "getSharedPreferences(String, Integer)") {

            @Override
            public SharedPreferences call(final String name, final Integer mode) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getSharedPreferences(this, name, mode);
                } else {
                    return getOriginal().super_getSharedPreferences(name, mode);
                }
            }
        };
        return superCall.call(name, mode);
    }

    public ActionBar getSupportActionBar() {
        if (!mIsOverridden_getSupportActionBar) {
            return getOriginal().super_getSupportActionBar();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getSupportActionBar < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getSupportActionBar++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getSupportActionBar()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getSupportActionBar");
                mMethodImplementingPlugins.put("getSupportActionBar()", implementingPlugins);
                mIsOverridden_getSupportActionBar = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<ActionBar> superCall = new CallFun0<ActionBar>("getSupportActionBar()") {

            @Override
            public ActionBar call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getSupportActionBar(this);
                } else {
                    return getOriginal().super_getSupportActionBar();
                }
            }
        };
        return superCall.call();
    }

    public FragmentManager getSupportFragmentManager() {
        if (!mIsOverridden_getSupportFragmentManager) {
            return getOriginal().super_getSupportFragmentManager();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getSupportFragmentManager < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getSupportFragmentManager++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getSupportFragmentManager()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getSupportFragmentManager");
                mMethodImplementingPlugins.put("getSupportFragmentManager()", implementingPlugins);
                mIsOverridden_getSupportFragmentManager = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<FragmentManager> superCall = new CallFun0<FragmentManager>(
                "getSupportFragmentManager()") {

            @Override
            public FragmentManager call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getSupportFragmentManager(this);
                } else {
                    return getOriginal().super_getSupportFragmentManager();
                }
            }
        };
        return superCall.call();
    }

    public LoaderManager getSupportLoaderManager() {
        if (!mIsOverridden_getSupportLoaderManager) {
            return getOriginal().super_getSupportLoaderManager();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getSupportLoaderManager < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getSupportLoaderManager++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getSupportLoaderManager()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getSupportLoaderManager");
                mMethodImplementingPlugins.put("getSupportLoaderManager()", implementingPlugins);
                mIsOverridden_getSupportLoaderManager = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<LoaderManager> superCall = new CallFun0<LoaderManager>(
                "getSupportLoaderManager()") {

            @Override
            public LoaderManager call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getSupportLoaderManager(this);
                } else {
                    return getOriginal().super_getSupportLoaderManager();
                }
            }
        };
        return superCall.call();
    }

    public Intent getSupportParentActivityIntent() {
        if (!mIsOverridden_getSupportParentActivityIntent) {
            return getOriginal().super_getSupportParentActivityIntent();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getSupportParentActivityIntent < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getSupportParentActivityIntent++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getSupportParentActivityIntent()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getSupportParentActivityIntent");
                mMethodImplementingPlugins
                        .put("getSupportParentActivityIntent()", implementingPlugins);
                mIsOverridden_getSupportParentActivityIntent = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<Intent> superCall = new CallFun0<Intent>(
                "getSupportParentActivityIntent()") {

            @Override
            public Intent call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getSupportParentActivityIntent(this);
                } else {
                    return getOriginal().super_getSupportParentActivityIntent();
                }
            }
        };
        return superCall.call();
    }

    public Object getSystemService(final String name) {
        if (!mIsOverridden_getSystemServiceSg) {
            return getOriginal().super_getSystemService(name);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getSystemServiceSg < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getSystemServiceSg++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getSystemService(String)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getSystemService", String.class);
                mMethodImplementingPlugins.put("getSystemService(String)", implementingPlugins);
                mIsOverridden_getSystemServiceSg = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<Object, String> superCall = new CallFun1<Object, String>(
                "getSystemService(String)") {

            @Override
            public Object call(final String name) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getSystemService(this, name);
                } else {
                    return getOriginal().super_getSystemService(name);
                }
            }
        };
        return superCall.call(name);
    }

    public String getSystemServiceName(final Class<?> serviceClass) {
        if (!mIsOverridden_getSystemServiceNameCs) {
            return getOriginal().super_getSystemServiceName(serviceClass);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getSystemServiceNameCs < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getSystemServiceNameCs++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getSystemServiceName(Class<?>)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getSystemServiceName", Class.class);
                mMethodImplementingPlugins
                        .put("getSystemServiceName(Class<?>)", implementingPlugins);
                mIsOverridden_getSystemServiceNameCs = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<String, Class<?>> superCall = new CallFun1<String, Class<?>>(
                "getSystemServiceName(Class<?>)") {

            @Override
            public String call(final Class<?> serviceClass) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getSystemServiceName(this, serviceClass);
                } else {
                    return getOriginal().super_getSystemServiceName(serviceClass);
                }
            }
        };
        return superCall.call(serviceClass);
    }

    public int getTaskId() {
        if (!mIsOverridden_getTaskId) {
            return getOriginal().super_getTaskId();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getTaskId < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getTaskId++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getTaskId()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getTaskId");
                mMethodImplementingPlugins.put("getTaskId()", implementingPlugins);
                mIsOverridden_getTaskId = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<Integer> superCall = new CallFun0<Integer>("getTaskId()") {

            @Override
            public Integer call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getTaskId(this);
                } else {
                    return getOriginal().super_getTaskId();
                }
            }
        };
        return superCall.call();
    }

    public Resources.Theme getTheme() {
        if (!mIsOverridden_getTheme) {
            return getOriginal().super_getTheme();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getTheme < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getTheme++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins.get("getTheme()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getTheme");
                mMethodImplementingPlugins.put("getTheme()", implementingPlugins);
                mIsOverridden_getTheme = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<Resources.Theme> superCall = new CallFun0<Resources.Theme>("getTheme()") {

            @Override
            public Resources.Theme call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getTheme(this);
                } else {
                    return getOriginal().super_getTheme();
                }
            }
        };
        return superCall.call();
    }

    public VoiceInteractor getVoiceInteractor() {
        if (!mIsOverridden_getVoiceInteractor) {
            return getOriginal().super_getVoiceInteractor();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getVoiceInteractor < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getVoiceInteractor++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getVoiceInteractor()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getVoiceInteractor");
                mMethodImplementingPlugins.put("getVoiceInteractor()", implementingPlugins);
                mIsOverridden_getVoiceInteractor = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<VoiceInteractor> superCall = new CallFun0<VoiceInteractor>(
                "getVoiceInteractor()") {

            @Override
            public VoiceInteractor call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getVoiceInteractor(this);
                } else {
                    return getOriginal().super_getVoiceInteractor();
                }
            }
        };
        return superCall.call();
    }

    public Drawable getWallpaper() {
        if (!mIsOverridden_getWallpaper) {
            return getOriginal().super_getWallpaper();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getWallpaper < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getWallpaper++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getWallpaper()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getWallpaper");
                mMethodImplementingPlugins.put("getWallpaper()", implementingPlugins);
                mIsOverridden_getWallpaper = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<Drawable> superCall = new CallFun0<Drawable>("getWallpaper()") {

            @Override
            public Drawable call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getWallpaper(this);
                } else {
                    return getOriginal().super_getWallpaper();
                }
            }
        };
        return superCall.call();
    }

    public int getWallpaperDesiredMinimumHeight() {
        if (!mIsOverridden_getWallpaperDesiredMinimumHeight) {
            return getOriginal().super_getWallpaperDesiredMinimumHeight();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getWallpaperDesiredMinimumHeight < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getWallpaperDesiredMinimumHeight++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getWallpaperDesiredMinimumHeight()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getWallpaperDesiredMinimumHeight");
                mMethodImplementingPlugins
                        .put("getWallpaperDesiredMinimumHeight()", implementingPlugins);
                mIsOverridden_getWallpaperDesiredMinimumHeight = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<Integer> superCall = new CallFun0<Integer>(
                "getWallpaperDesiredMinimumHeight()") {

            @Override
            public Integer call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getWallpaperDesiredMinimumHeight(this);
                } else {
                    return getOriginal().super_getWallpaperDesiredMinimumHeight();
                }
            }
        };
        return superCall.call();
    }

    public int getWallpaperDesiredMinimumWidth() {
        if (!mIsOverridden_getWallpaperDesiredMinimumWidth) {
            return getOriginal().super_getWallpaperDesiredMinimumWidth();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getWallpaperDesiredMinimumWidth < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getWallpaperDesiredMinimumWidth++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getWallpaperDesiredMinimumWidth()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getWallpaperDesiredMinimumWidth");
                mMethodImplementingPlugins
                        .put("getWallpaperDesiredMinimumWidth()", implementingPlugins);
                mIsOverridden_getWallpaperDesiredMinimumWidth = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<Integer> superCall = new CallFun0<Integer>(
                "getWallpaperDesiredMinimumWidth()") {

            @Override
            public Integer call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getWallpaperDesiredMinimumWidth(this);
                } else {
                    return getOriginal().super_getWallpaperDesiredMinimumWidth();
                }
            }
        };
        return superCall.call();
    }

    public Window getWindow() {
        if (!mIsOverridden_getWindow) {
            return getOriginal().super_getWindow();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getWindow < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getWindow++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getWindow()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getWindow");
                mMethodImplementingPlugins.put("getWindow()", implementingPlugins);
                mIsOverridden_getWindow = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<Window> superCall = new CallFun0<Window>("getWindow()") {

            @Override
            public Window call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getWindow(this);
                } else {
                    return getOriginal().super_getWindow();
                }
            }
        };
        return superCall.call();
    }

    public WindowManager getWindowManager() {
        if (!mIsOverridden_getWindowManager) {
            return getOriginal().super_getWindowManager();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_getWindowManager < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_getWindowManager++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("getWindowManager()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("getWindowManager");
                mMethodImplementingPlugins.put("getWindowManager()", implementingPlugins);
                mIsOverridden_getWindowManager = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<WindowManager> superCall = new CallFun0<WindowManager>(
                "getWindowManager()") {

            @Override
            public WindowManager call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getWindowManager(this);
                } else {
                    return getOriginal().super_getWindowManager();
                }
            }
        };
        return superCall.call();
    }

    public void grantUriPermission(final String toPackage, final Uri uri, final int modeFlags) {
        if (!mIsOverridden_grantUriPermissionSgUiIr) {
            getOriginal().super_grantUriPermission(toPackage, uri, modeFlags);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_grantUriPermissionSgUiIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_grantUriPermissionSgUiIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("grantUriPermission(String, Uri, Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("grantUriPermission", String.class,
                        Uri.class, Integer.class);
                mMethodImplementingPlugins
                        .put("grantUriPermission(String, Uri, Integer)", implementingPlugins);
                mIsOverridden_grantUriPermissionSgUiIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid3<String, Uri, Integer> superCall = new CallVoid3<String, Uri, Integer>(
                "grantUriPermission(String, Uri, Integer)") {

            @Override
            public void call(final String toPackage, final Uri uri, final Integer modeFlags) {
                if (iterator.hasPrevious()) {
                    iterator.previous().grantUriPermission(this, toPackage, uri, modeFlags);
                } else {
                    getOriginal().super_grantUriPermission(toPackage, uri, modeFlags);
                }
            }
        };
        superCall.call(toPackage, uri, modeFlags);
    }

    public boolean hasWindowFocus() {
        if (!mIsOverridden_hasWindowFocus) {
            return getOriginal().super_hasWindowFocus();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_hasWindowFocus < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_hasWindowFocus++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("hasWindowFocus()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("hasWindowFocus");
                mMethodImplementingPlugins.put("hasWindowFocus()", implementingPlugins);
                mIsOverridden_hasWindowFocus = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<Boolean> superCall = new CallFun0<Boolean>("hasWindowFocus()") {

            @Override
            public Boolean call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().hasWindowFocus(this);
                } else {
                    return getOriginal().super_hasWindowFocus();
                }
            }
        };
        return superCall.call();
    }

    public void invalidateOptionsMenu() {
        if (!mIsOverridden_invalidateOptionsMenu) {
            getOriginal().super_invalidateOptionsMenu();
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_invalidateOptionsMenu < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_invalidateOptionsMenu++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("invalidateOptionsMenu()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("invalidateOptionsMenu");
                mMethodImplementingPlugins.put("invalidateOptionsMenu()", implementingPlugins);
                mIsOverridden_invalidateOptionsMenu = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid0 superCall = new CallVoid0("invalidateOptionsMenu()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().invalidateOptionsMenu(this);
                } else {
                    getOriginal().super_invalidateOptionsMenu();
                }
            }
        };
        superCall.call();
    }

    public boolean isChangingConfigurations() {
        if (!mIsOverridden_isChangingConfigurations) {
            return getOriginal().super_isChangingConfigurations();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_isChangingConfigurations < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_isChangingConfigurations++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("isChangingConfigurations()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("isChangingConfigurations");
                mMethodImplementingPlugins.put("isChangingConfigurations()", implementingPlugins);
                mIsOverridden_isChangingConfigurations = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<Boolean> superCall = new CallFun0<Boolean>("isChangingConfigurations()") {

            @Override
            public Boolean call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().isChangingConfigurations(this);
                } else {
                    return getOriginal().super_isChangingConfigurations();
                }
            }
        };
        return superCall.call();
    }

    public boolean isDestroyed() {
        if (!mIsOverridden_isDestroyed) {
            return getOriginal().super_isDestroyed();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_isDestroyed < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_isDestroyed++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("isDestroyed()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("isDestroyed");
                mMethodImplementingPlugins.put("isDestroyed()", implementingPlugins);
                mIsOverridden_isDestroyed = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<Boolean> superCall = new CallFun0<Boolean>("isDestroyed()") {

            @Override
            public Boolean call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().isDestroyed(this);
                } else {
                    return getOriginal().super_isDestroyed();
                }
            }
        };
        return superCall.call();
    }

    public boolean isFinishing() {
        if (!mIsOverridden_isFinishing) {
            return getOriginal().super_isFinishing();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_isFinishing < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_isFinishing++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("isFinishing()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("isFinishing");
                mMethodImplementingPlugins.put("isFinishing()", implementingPlugins);
                mIsOverridden_isFinishing = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<Boolean> superCall = new CallFun0<Boolean>("isFinishing()") {

            @Override
            public Boolean call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().isFinishing(this);
                } else {
                    return getOriginal().super_isFinishing();
                }
            }
        };
        return superCall.call();
    }

    public boolean isImmersive() {
        if (!mIsOverridden_isImmersive) {
            return getOriginal().super_isImmersive();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_isImmersive < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_isImmersive++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("isImmersive()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("isImmersive");
                mMethodImplementingPlugins.put("isImmersive()", implementingPlugins);
                mIsOverridden_isImmersive = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<Boolean> superCall = new CallFun0<Boolean>("isImmersive()") {

            @Override
            public Boolean call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().isImmersive(this);
                } else {
                    return getOriginal().super_isImmersive();
                }
            }
        };
        return superCall.call();
    }

    public boolean isRestricted() {
        if (!mIsOverridden_isRestricted) {
            return getOriginal().super_isRestricted();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_isRestricted < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_isRestricted++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("isRestricted()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("isRestricted");
                mMethodImplementingPlugins.put("isRestricted()", implementingPlugins);
                mIsOverridden_isRestricted = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<Boolean> superCall = new CallFun0<Boolean>("isRestricted()") {

            @Override
            public Boolean call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().isRestricted(this);
                } else {
                    return getOriginal().super_isRestricted();
                }
            }
        };
        return superCall.call();
    }

    public boolean isTaskRoot() {
        if (!mIsOverridden_isTaskRoot) {
            return getOriginal().super_isTaskRoot();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_isTaskRoot < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_isTaskRoot++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("isTaskRoot()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("isTaskRoot");
                mMethodImplementingPlugins.put("isTaskRoot()", implementingPlugins);
                mIsOverridden_isTaskRoot = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<Boolean> superCall = new CallFun0<Boolean>("isTaskRoot()") {

            @Override
            public Boolean call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().isTaskRoot(this);
                } else {
                    return getOriginal().super_isTaskRoot();
                }
            }
        };
        return superCall.call();
    }

    public boolean isVoiceInteraction() {
        if (!mIsOverridden_isVoiceInteraction) {
            return getOriginal().super_isVoiceInteraction();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_isVoiceInteraction < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_isVoiceInteraction++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("isVoiceInteraction()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("isVoiceInteraction");
                mMethodImplementingPlugins.put("isVoiceInteraction()", implementingPlugins);
                mIsOverridden_isVoiceInteraction = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<Boolean> superCall = new CallFun0<Boolean>("isVoiceInteraction()") {

            @Override
            public Boolean call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().isVoiceInteraction(this);
                } else {
                    return getOriginal().super_isVoiceInteraction();
                }
            }
        };
        return superCall.call();
    }

    public boolean isVoiceInteractionRoot() {
        if (!mIsOverridden_isVoiceInteractionRoot) {
            return getOriginal().super_isVoiceInteractionRoot();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_isVoiceInteractionRoot < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_isVoiceInteractionRoot++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("isVoiceInteractionRoot()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("isVoiceInteractionRoot");
                mMethodImplementingPlugins.put("isVoiceInteractionRoot()", implementingPlugins);
                mIsOverridden_isVoiceInteractionRoot = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<Boolean> superCall = new CallFun0<Boolean>("isVoiceInteractionRoot()") {

            @Override
            public Boolean call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().isVoiceInteractionRoot(this);
                } else {
                    return getOriginal().super_isVoiceInteractionRoot();
                }
            }
        };
        return superCall.call();
    }

    public boolean moveTaskToBack(final boolean nonRoot) {
        if (!mIsOverridden_moveTaskToBackBn) {
            return getOriginal().super_moveTaskToBack(nonRoot);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_moveTaskToBackBn < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_moveTaskToBackBn++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("moveTaskToBack(Boolean)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("moveTaskToBack", Boolean.class);
                mMethodImplementingPlugins.put("moveTaskToBack(Boolean)", implementingPlugins);
                mIsOverridden_moveTaskToBackBn = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<Boolean, Boolean> superCall = new CallFun1<Boolean, Boolean>(
                "moveTaskToBack(Boolean)") {

            @Override
            public Boolean call(final Boolean nonRoot) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().moveTaskToBack(this, nonRoot);
                } else {
                    return getOriginal().super_moveTaskToBack(nonRoot);
                }
            }
        };
        return superCall.call(nonRoot);
    }

    public boolean navigateUpTo(final Intent upIntent) {
        if (!mIsOverridden_navigateUpToIt) {
            return getOriginal().super_navigateUpTo(upIntent);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_navigateUpToIt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_navigateUpToIt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("navigateUpTo(Intent)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("navigateUpTo", Intent.class);
                mMethodImplementingPlugins.put("navigateUpTo(Intent)", implementingPlugins);
                mIsOverridden_navigateUpToIt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<Boolean, Intent> superCall = new CallFun1<Boolean, Intent>(
                "navigateUpTo(Intent)") {

            @Override
            public Boolean call(final Intent upIntent) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().navigateUpTo(this, upIntent);
                } else {
                    return getOriginal().super_navigateUpTo(upIntent);
                }
            }
        };
        return superCall.call(upIntent);
    }

    public boolean navigateUpToFromChild(final Activity child, final Intent upIntent) {
        if (!mIsOverridden_navigateUpToFromChildAyIt) {
            return getOriginal().super_navigateUpToFromChild(child, upIntent);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_navigateUpToFromChildAyIt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_navigateUpToFromChildAyIt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("navigateUpToFromChild(Activity, Intent)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("navigateUpToFromChild",
                        Activity.class, Intent.class);
                mMethodImplementingPlugins
                        .put("navigateUpToFromChild(Activity, Intent)", implementingPlugins);
                mIsOverridden_navigateUpToFromChildAyIt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun2<Boolean, Activity, Intent> superCall
                = new CallFun2<Boolean, Activity, Intent>(
                "navigateUpToFromChild(Activity, Intent)") {

            @Override
            public Boolean call(final Activity child, final Intent upIntent) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().navigateUpToFromChild(this, child, upIntent);
                } else {
                    return getOriginal().super_navigateUpToFromChild(child, upIntent);
                }
            }
        };
        return superCall.call(child, upIntent);
    }

    public void onActionModeFinished(final android.view.ActionMode mode) {
        if (!mIsOverridden_onActionModeFinishedae) {
            getOriginal().super_onActionModeFinished(mode);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onActionModeFinishedae < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onActionModeFinishedae++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onActionModeFinished(android.view.ActionMode)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onActionModeFinished",
                        android.view.ActionMode.class);
                mMethodImplementingPlugins
                        .put("onActionModeFinished(android.view.ActionMode)", implementingPlugins);
                mIsOverridden_onActionModeFinishedae = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<android.view.ActionMode> superCall = new CallVoid1<android.view.ActionMode>(
                "onActionModeFinished(android.view.ActionMode)") {

            @Override
            public void call(final android.view.ActionMode mode) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onActionModeFinished(this, mode);
                } else {
                    getOriginal().super_onActionModeFinished(mode);
                }
            }
        };
        superCall.call(mode);
    }

    public void onActionModeStarted(final android.view.ActionMode mode) {
        if (!mIsOverridden_onActionModeStartedae) {
            getOriginal().super_onActionModeStarted(mode);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onActionModeStartedae < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onActionModeStartedae++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onActionModeStarted(android.view.ActionMode)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onActionModeStarted",
                        android.view.ActionMode.class);
                mMethodImplementingPlugins
                        .put("onActionModeStarted(android.view.ActionMode)", implementingPlugins);
                mIsOverridden_onActionModeStartedae = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<android.view.ActionMode> superCall = new CallVoid1<android.view.ActionMode>(
                "onActionModeStarted(android.view.ActionMode)") {

            @Override
            public void call(final android.view.ActionMode mode) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onActionModeStarted(this, mode);
                } else {
                    getOriginal().super_onActionModeStarted(mode);
                }
            }
        };
        superCall.call(mode);
    }

    public void onActivityReenter(final int resultCode, final Intent data) {
        if (!mIsOverridden_onActivityReenterIrIt) {
            getOriginal().super_onActivityReenter(resultCode, data);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onActivityReenterIrIt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onActivityReenterIrIt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onActivityReenter(Integer, Intent)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onActivityReenter", Integer.class,
                        Intent.class);
                mMethodImplementingPlugins
                        .put("onActivityReenter(Integer, Intent)", implementingPlugins);
                mIsOverridden_onActivityReenterIrIt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid2<Integer, Intent> superCall = new CallVoid2<Integer, Intent>(
                "onActivityReenter(Integer, Intent)") {

            @Override
            public void call(final Integer resultCode, final Intent data) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onActivityReenter(this, resultCode, data);
                } else {
                    getOriginal().super_onActivityReenter(resultCode, data);
                }
            }
        };
        superCall.call(resultCode, data);
    }

    public void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        if (!mIsOverridden_onActivityResultIrIrIt) {
            getOriginal().super_onActivityResult(requestCode, resultCode, data);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onActivityResultIrIrIt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onActivityResultIrIrIt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
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

    public void onApplyThemeResource(final Resources.Theme theme, final int resid,
            final boolean first) {
        if (!mIsOverridden_onApplyThemeResourceReIrBn) {
            getOriginal().super_onApplyThemeResource(theme, resid, first);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onApplyThemeResourceReIrBn < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onApplyThemeResourceReIrBn++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onApplyThemeResource(Resources.Theme, Integer, Boolean)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onApplyThemeResource",
                        Resources.Theme.class, Integer.class, Boolean.class);
                mMethodImplementingPlugins
                        .put("onApplyThemeResource(Resources.Theme, Integer, Boolean)",
                                implementingPlugins);
                mIsOverridden_onApplyThemeResourceReIrBn = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid3<Resources.Theme, Integer, Boolean> superCall
                = new CallVoid3<Resources.Theme, Integer, Boolean>(
                "onApplyThemeResource(Resources.Theme, Integer, Boolean)") {

            @Override
            public void call(final Resources.Theme theme, final Integer resid,
                    final Boolean first) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onApplyThemeResource(this, theme, resid, first);
                } else {
                    getOriginal().super_onApplyThemeResource(theme, resid, first);
                }
            }
        };
        superCall.call(theme, resid, first);
    }

    public void onAttachFragment(final Fragment fragment) {
        if (!mIsOverridden_onAttachFragmentFt) {
            getOriginal().super_onAttachFragment(fragment);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onAttachFragmentFt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onAttachFragmentFt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
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
            public void call(final Fragment fragment) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onAttachFragment(this, fragment);
                } else {
                    getOriginal().super_onAttachFragment(fragment);
                }
            }
        };
        superCall.call(fragment);
    }

    public void onAttachFragment(final android.app.Fragment fragment) {
        if (!mIsOverridden_onAttachFragmentat) {
            getOriginal().super_onAttachFragment(fragment);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onAttachFragmentat < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onAttachFragmentat++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onAttachFragment(android.app.Fragment)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onAttachFragment",
                        android.app.Fragment.class);
                mMethodImplementingPlugins
                        .put("onAttachFragment(android.app.Fragment)", implementingPlugins);
                mIsOverridden_onAttachFragmentat = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<android.app.Fragment> superCall = new CallVoid1<android.app.Fragment>(
                "onAttachFragment(android.app.Fragment)") {

            @Override
            public void call(final android.app.Fragment fragment) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onAttachFragment(this, fragment);
                } else {
                    getOriginal().super_onAttachFragment(fragment);
                }
            }
        };
        superCall.call(fragment);
    }

    public void onAttachedToWindow() {
        if (!mIsOverridden_onAttachedToWindow) {
            getOriginal().super_onAttachedToWindow();
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onAttachedToWindow < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onAttachedToWindow++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onAttachedToWindow()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onAttachedToWindow");
                mMethodImplementingPlugins.put("onAttachedToWindow()", implementingPlugins);
                mIsOverridden_onAttachedToWindow = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid0 superCall = new CallVoid0("onAttachedToWindow()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().onAttachedToWindow(this);
                } else {
                    getOriginal().super_onAttachedToWindow();
                }
            }
        };
        superCall.call();
    }

    public void onBackPressed() {
        if (!mIsOverridden_onBackPressed) {
            getOriginal().super_onBackPressed();
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onBackPressed < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onBackPressed++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onBackPressed()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onBackPressed");
                mMethodImplementingPlugins.put("onBackPressed()", implementingPlugins);
                mIsOverridden_onBackPressed = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid0 superCall = new CallVoid0("onBackPressed()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().onBackPressed(this);
                } else {
                    getOriginal().super_onBackPressed();
                }
            }
        };
        superCall.call();
    }

    public void onChildTitleChanged(final Activity childActivity, final CharSequence title) {
        if (!mIsOverridden_onChildTitleChangedAyCe) {
            getOriginal().super_onChildTitleChanged(childActivity, title);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onChildTitleChangedAyCe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onChildTitleChangedAyCe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onChildTitleChanged(Activity, CharSequence)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onChildTitleChanged", Activity.class,
                        CharSequence.class);
                mMethodImplementingPlugins
                        .put("onChildTitleChanged(Activity, CharSequence)", implementingPlugins);
                mIsOverridden_onChildTitleChangedAyCe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid2<Activity, CharSequence> superCall = new CallVoid2<Activity, CharSequence>(
                "onChildTitleChanged(Activity, CharSequence)") {

            @Override
            public void call(final Activity childActivity, final CharSequence title) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onChildTitleChanged(this, childActivity, title);
                } else {
                    getOriginal().super_onChildTitleChanged(childActivity, title);
                }
            }
        };
        superCall.call(childActivity, title);
    }

    public void onConfigurationChanged(final Configuration newConfig) {
        if (!mIsOverridden_onConfigurationChangedCn) {
            getOriginal().super_onConfigurationChanged(newConfig);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onConfigurationChangedCn < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onConfigurationChangedCn++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
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

    public void onContentChanged() {
        if (!mIsOverridden_onContentChanged) {
            getOriginal().super_onContentChanged();
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onContentChanged < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onContentChanged++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onContentChanged()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onContentChanged");
                mMethodImplementingPlugins.put("onContentChanged()", implementingPlugins);
                mIsOverridden_onContentChanged = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid0 superCall = new CallVoid0("onContentChanged()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().onContentChanged(this);
                } else {
                    getOriginal().super_onContentChanged();
                }
            }
        };
        superCall.call();
    }

    public boolean onContextItemSelected(final MenuItem item) {
        if (!mIsOverridden_onContextItemSelectedMm) {
            return getOriginal().super_onContextItemSelected(item);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onContextItemSelectedMm < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onContextItemSelectedMm++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
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

    public void onContextMenuClosed(final Menu menu) {
        if (!mIsOverridden_onContextMenuClosedMu) {
            getOriginal().super_onContextMenuClosed(menu);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onContextMenuClosedMu < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onContextMenuClosedMu++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onContextMenuClosed(Menu)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onContextMenuClosed", Menu.class);
                mMethodImplementingPlugins.put("onContextMenuClosed(Menu)", implementingPlugins);
                mIsOverridden_onContextMenuClosedMu = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<Menu> superCall = new CallVoid1<Menu>("onContextMenuClosed(Menu)") {

            @Override
            public void call(final Menu menu) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onContextMenuClosed(this, menu);
                } else {
                    getOriginal().super_onContextMenuClosed(menu);
                }
            }
        };
        superCall.call(menu);
    }

    public void onCreate(final Bundle savedInstanceState, final PersistableBundle persistentState) {
        if (!mIsOverridden_onCreateBePe) {
            getOriginal().super_onCreate(savedInstanceState, persistentState);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onCreateBePe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onCreateBePe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onCreate(Bundle, PersistableBundle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onCreate", Bundle.class,
                        PersistableBundle.class);
                mMethodImplementingPlugins
                        .put("onCreate(Bundle, PersistableBundle)", implementingPlugins);
                mIsOverridden_onCreateBePe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid2<Bundle, PersistableBundle> superCall
                = new CallVoid2<Bundle, PersistableBundle>("onCreate(Bundle, PersistableBundle)") {

            @Override
            public void call(final Bundle savedInstanceState,
                    final PersistableBundle persistentState) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onCreate(this, savedInstanceState, persistentState);
                } else {
                    getOriginal().super_onCreate(savedInstanceState, persistentState);
                }
            }
        };
        superCall.call(savedInstanceState, persistentState);
    }

    public void onCreate(@Nullable final Bundle savedInstanceState) {
        if (!mIsOverridden_onCreateBe) {
            getOriginal().super_onCreate(savedInstanceState);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onCreateBe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onCreateBe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
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

    public void onCreateContextMenu(final ContextMenu menu, final View v,
            final ContextMenu.ContextMenuInfo menuInfo) {
        if (!mIsOverridden_onCreateContextMenuCuVwCo) {
            getOriginal().super_onCreateContextMenu(menu, v, menuInfo);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onCreateContextMenuCuVwCo < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onCreateContextMenuCuVwCo++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
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

    public CharSequence onCreateDescription() {
        if (!mIsOverridden_onCreateDescription) {
            return getOriginal().super_onCreateDescription();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onCreateDescription < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onCreateDescription++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onCreateDescription()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onCreateDescription");
                mMethodImplementingPlugins.put("onCreateDescription()", implementingPlugins);
                mIsOverridden_onCreateDescription = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<CharSequence> superCall = new CallFun0<CharSequence>(
                "onCreateDescription()") {

            @Override
            public CharSequence call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onCreateDescription(this);
                } else {
                    return getOriginal().super_onCreateDescription();
                }
            }
        };
        return superCall.call();
    }

    public Dialog onCreateDialog(final int id) {
        if (!mIsOverridden_onCreateDialogIr) {
            return getOriginal().super_onCreateDialog(id);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onCreateDialogIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onCreateDialogIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onCreateDialog(Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onCreateDialog", Integer.class);
                mMethodImplementingPlugins.put("onCreateDialog(Integer)", implementingPlugins);
                mIsOverridden_onCreateDialogIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<Dialog, Integer> superCall = new CallFun1<Dialog, Integer>(
                "onCreateDialog(Integer)") {

            @Override
            public Dialog call(final Integer id) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onCreateDialog(this, id);
                } else {
                    return getOriginal().super_onCreateDialog(id);
                }
            }
        };
        return superCall.call(id);
    }

    public Dialog onCreateDialog(final int id, final Bundle args) {
        if (!mIsOverridden_onCreateDialogIrBe) {
            return getOriginal().super_onCreateDialog(id, args);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onCreateDialogIrBe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onCreateDialogIrBe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onCreateDialog(Integer, Bundle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onCreateDialog", Integer.class,
                        Bundle.class);
                mMethodImplementingPlugins
                        .put("onCreateDialog(Integer, Bundle)", implementingPlugins);
                mIsOverridden_onCreateDialogIrBe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun2<Dialog, Integer, Bundle> superCall = new CallFun2<Dialog, Integer, Bundle>(
                "onCreateDialog(Integer, Bundle)") {

            @Override
            public Dialog call(final Integer id, final Bundle args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onCreateDialog(this, id, args);
                } else {
                    return getOriginal().super_onCreateDialog(id, args);
                }
            }
        };
        return superCall.call(id, args);
    }

    public void onCreateNavigateUpTaskStack(final TaskStackBuilder builder) {
        if (!mIsOverridden_onCreateNavigateUpTaskStackTr) {
            getOriginal().super_onCreateNavigateUpTaskStack(builder);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onCreateNavigateUpTaskStackTr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onCreateNavigateUpTaskStackTr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onCreateNavigateUpTaskStack(TaskStackBuilder)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onCreateNavigateUpTaskStack",
                        TaskStackBuilder.class);
                mMethodImplementingPlugins
                        .put("onCreateNavigateUpTaskStack(TaskStackBuilder)", implementingPlugins);
                mIsOverridden_onCreateNavigateUpTaskStackTr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<TaskStackBuilder> superCall = new CallVoid1<TaskStackBuilder>(
                "onCreateNavigateUpTaskStack(TaskStackBuilder)") {

            @Override
            public void call(final TaskStackBuilder builder) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onCreateNavigateUpTaskStack(this, builder);
                } else {
                    getOriginal().super_onCreateNavigateUpTaskStack(builder);
                }
            }
        };
        superCall.call(builder);
    }

    public boolean onCreateOptionsMenu(final Menu menu) {
        if (!mIsOverridden_onCreateOptionsMenuMu) {
            return getOriginal().super_onCreateOptionsMenu(menu);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onCreateOptionsMenuMu < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onCreateOptionsMenuMu++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onCreateOptionsMenu(Menu)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onCreateOptionsMenu", Menu.class);
                mMethodImplementingPlugins.put("onCreateOptionsMenu(Menu)", implementingPlugins);
                mIsOverridden_onCreateOptionsMenuMu = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<Boolean, Menu> superCall = new CallFun1<Boolean, Menu>(
                "onCreateOptionsMenu(Menu)") {

            @Override
            public Boolean call(final Menu menu) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onCreateOptionsMenu(this, menu);
                } else {
                    return getOriginal().super_onCreateOptionsMenu(menu);
                }
            }
        };
        return superCall.call(menu);
    }

    public boolean onCreatePanelMenu(final int featureId, final Menu menu) {
        if (!mIsOverridden_onCreatePanelMenuIrMu) {
            return getOriginal().super_onCreatePanelMenu(featureId, menu);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onCreatePanelMenuIrMu < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onCreatePanelMenuIrMu++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onCreatePanelMenu(Integer, Menu)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onCreatePanelMenu", Integer.class,
                        Menu.class);
                mMethodImplementingPlugins
                        .put("onCreatePanelMenu(Integer, Menu)", implementingPlugins);
                mIsOverridden_onCreatePanelMenuIrMu = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun2<Boolean, Integer, Menu> superCall = new CallFun2<Boolean, Integer, Menu>(
                "onCreatePanelMenu(Integer, Menu)") {

            @Override
            public Boolean call(final Integer featureId, final Menu menu) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onCreatePanelMenu(this, featureId, menu);
                } else {
                    return getOriginal().super_onCreatePanelMenu(featureId, menu);
                }
            }
        };
        return superCall.call(featureId, menu);
    }

    public View onCreatePanelView(final int featureId) {
        if (!mIsOverridden_onCreatePanelViewIr) {
            return getOriginal().super_onCreatePanelView(featureId);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onCreatePanelViewIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onCreatePanelViewIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onCreatePanelView(Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onCreatePanelView", Integer.class);
                mMethodImplementingPlugins.put("onCreatePanelView(Integer)", implementingPlugins);
                mIsOverridden_onCreatePanelViewIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<View, Integer> superCall = new CallFun1<View, Integer>(
                "onCreatePanelView(Integer)") {

            @Override
            public View call(final Integer featureId) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onCreatePanelView(this, featureId);
                } else {
                    return getOriginal().super_onCreatePanelView(featureId);
                }
            }
        };
        return superCall.call(featureId);
    }

    public void onCreateSupportNavigateUpTaskStack(
            @NonNull final android.support.v4.app.TaskStackBuilder builder) {
        if (!mIsOverridden_onCreateSupportNavigateUpTaskStackar) {
            getOriginal().super_onCreateSupportNavigateUpTaskStack(builder);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onCreateSupportNavigateUpTaskStackar < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onCreateSupportNavigateUpTaskStackar++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onCreateSupportNavigateUpTaskStack(android.support.v4.app.TaskStackBuilder)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onCreateSupportNavigateUpTaskStack",
                        android.support.v4.app.TaskStackBuilder.class);
                mMethodImplementingPlugins
                        .put("onCreateSupportNavigateUpTaskStack(android.support.v4.app.TaskStackBuilder)",
                                implementingPlugins);
                mIsOverridden_onCreateSupportNavigateUpTaskStackar = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<android.support.v4.app.TaskStackBuilder> superCall
                = new CallVoid1<android.support.v4.app.TaskStackBuilder>(
                "onCreateSupportNavigateUpTaskStack(android.support.v4.app.TaskStackBuilder)") {

            @Override
            public void call(final android.support.v4.app.TaskStackBuilder builder) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onCreateSupportNavigateUpTaskStack(this, builder);
                } else {
                    getOriginal().super_onCreateSupportNavigateUpTaskStack(builder);
                }
            }
        };
        superCall.call(builder);
    }

    public boolean onCreateThumbnail(final Bitmap outBitmap, final Canvas canvas) {
        if (!mIsOverridden_onCreateThumbnailBpCs) {
            return getOriginal().super_onCreateThumbnail(outBitmap, canvas);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onCreateThumbnailBpCs < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onCreateThumbnailBpCs++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onCreateThumbnail(Bitmap, Canvas)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onCreateThumbnail", Bitmap.class,
                        Canvas.class);
                mMethodImplementingPlugins
                        .put("onCreateThumbnail(Bitmap, Canvas)", implementingPlugins);
                mIsOverridden_onCreateThumbnailBpCs = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun2<Boolean, Bitmap, Canvas> superCall = new CallFun2<Boolean, Bitmap, Canvas>(
                "onCreateThumbnail(Bitmap, Canvas)") {

            @Override
            public Boolean call(final Bitmap outBitmap, final Canvas canvas) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onCreateThumbnail(this, outBitmap, canvas);
                } else {
                    return getOriginal().super_onCreateThumbnail(outBitmap, canvas);
                }
            }
        };
        return superCall.call(outBitmap, canvas);
    }

    public View onCreateView(final View parent, final String name, final Context context,
            final AttributeSet attrs) {
        if (!mIsOverridden_onCreateViewVwSgCtAt) {
            return getOriginal().super_onCreateView(parent, name, context, attrs);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onCreateViewVwSgCtAt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onCreateViewVwSgCtAt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onCreateView(View, String, Context, AttributeSet)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onCreateView", View.class,
                        String.class, Context.class, AttributeSet.class);
                mMethodImplementingPlugins.put("onCreateView(View, String, Context, AttributeSet)",
                        implementingPlugins);
                mIsOverridden_onCreateViewVwSgCtAt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun4<View, View, String, Context, AttributeSet> superCall
                = new CallFun4<View, View, String, Context, AttributeSet>(
                "onCreateView(View, String, Context, AttributeSet)") {

            @Override
            public View call(final View parent, final String name, final Context context,
                    final AttributeSet attrs) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onCreateView(this, parent, name, context, attrs);
                } else {
                    return getOriginal().super_onCreateView(parent, name, context, attrs);
                }
            }
        };
        return superCall.call(parent, name, context, attrs);
    }

    public View onCreateView(final String name, final Context context, final AttributeSet attrs) {
        if (!mIsOverridden_onCreateViewSgCtAt) {
            return getOriginal().super_onCreateView(name, context, attrs);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onCreateViewSgCtAt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onCreateViewSgCtAt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onCreateView(String, Context, AttributeSet)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onCreateView", String.class,
                        Context.class, AttributeSet.class);
                mMethodImplementingPlugins
                        .put("onCreateView(String, Context, AttributeSet)", implementingPlugins);
                mIsOverridden_onCreateViewSgCtAt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun3<View, String, Context, AttributeSet> superCall
                = new CallFun3<View, String, Context, AttributeSet>(
                "onCreateView(String, Context, AttributeSet)") {

            @Override
            public View call(final String name, final Context context, final AttributeSet attrs) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onCreateView(this, name, context, attrs);
                } else {
                    return getOriginal().super_onCreateView(name, context, attrs);
                }
            }
        };
        return superCall.call(name, context, attrs);
    }

    public void onDestroy() {
        if (!mIsOverridden_onDestroy) {
            getOriginal().super_onDestroy();
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onDestroy < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onDestroy++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
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

    public void onDetachedFromWindow() {
        if (!mIsOverridden_onDetachedFromWindow) {
            getOriginal().super_onDetachedFromWindow();
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onDetachedFromWindow < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onDetachedFromWindow++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onDetachedFromWindow()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onDetachedFromWindow");
                mMethodImplementingPlugins.put("onDetachedFromWindow()", implementingPlugins);
                mIsOverridden_onDetachedFromWindow = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid0 superCall = new CallVoid0("onDetachedFromWindow()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().onDetachedFromWindow(this);
                } else {
                    getOriginal().super_onDetachedFromWindow();
                }
            }
        };
        superCall.call();
    }

    public void onEnterAnimationComplete() {
        if (!mIsOverridden_onEnterAnimationComplete) {
            getOriginal().super_onEnterAnimationComplete();
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onEnterAnimationComplete < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onEnterAnimationComplete++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onEnterAnimationComplete()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onEnterAnimationComplete");
                mMethodImplementingPlugins.put("onEnterAnimationComplete()", implementingPlugins);
                mIsOverridden_onEnterAnimationComplete = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid0 superCall = new CallVoid0("onEnterAnimationComplete()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().onEnterAnimationComplete(this);
                } else {
                    getOriginal().super_onEnterAnimationComplete();
                }
            }
        };
        superCall.call();
    }

    public boolean onGenericMotionEvent(final MotionEvent event) {
        if (!mIsOverridden_onGenericMotionEventMt) {
            return getOriginal().super_onGenericMotionEvent(event);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onGenericMotionEventMt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onGenericMotionEventMt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onGenericMotionEvent(MotionEvent)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onGenericMotionEvent",
                        MotionEvent.class);
                mMethodImplementingPlugins
                        .put("onGenericMotionEvent(MotionEvent)", implementingPlugins);
                mIsOverridden_onGenericMotionEventMt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<Boolean, MotionEvent> superCall = new CallFun1<Boolean, MotionEvent>(
                "onGenericMotionEvent(MotionEvent)") {

            @Override
            public Boolean call(final MotionEvent event) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onGenericMotionEvent(this, event);
                } else {
                    return getOriginal().super_onGenericMotionEvent(event);
                }
            }
        };
        return superCall.call(event);
    }

    public boolean onKeyDown(final int keyCode, final KeyEvent event) {
        if (!mIsOverridden_onKeyDownIrKt) {
            return getOriginal().super_onKeyDown(keyCode, event);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onKeyDownIrKt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onKeyDownIrKt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onKeyDown(Integer, KeyEvent)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onKeyDown", Integer.class,
                        KeyEvent.class);
                mMethodImplementingPlugins.put("onKeyDown(Integer, KeyEvent)", implementingPlugins);
                mIsOverridden_onKeyDownIrKt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun2<Boolean, Integer, KeyEvent> superCall
                = new CallFun2<Boolean, Integer, KeyEvent>("onKeyDown(Integer, KeyEvent)") {

            @Override
            public Boolean call(final Integer keyCode, final KeyEvent event) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onKeyDown(this, keyCode, event);
                } else {
                    return getOriginal().super_onKeyDown(keyCode, event);
                }
            }
        };
        return superCall.call(keyCode, event);
    }

    public boolean onKeyLongPress(final int keyCode, final KeyEvent event) {
        if (!mIsOverridden_onKeyLongPressIrKt) {
            return getOriginal().super_onKeyLongPress(keyCode, event);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onKeyLongPressIrKt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onKeyLongPressIrKt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onKeyLongPress(Integer, KeyEvent)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onKeyLongPress", Integer.class,
                        KeyEvent.class);
                mMethodImplementingPlugins
                        .put("onKeyLongPress(Integer, KeyEvent)", implementingPlugins);
                mIsOverridden_onKeyLongPressIrKt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun2<Boolean, Integer, KeyEvent> superCall
                = new CallFun2<Boolean, Integer, KeyEvent>("onKeyLongPress(Integer, KeyEvent)") {

            @Override
            public Boolean call(final Integer keyCode, final KeyEvent event) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onKeyLongPress(this, keyCode, event);
                } else {
                    return getOriginal().super_onKeyLongPress(keyCode, event);
                }
            }
        };
        return superCall.call(keyCode, event);
    }

    public boolean onKeyMultiple(final int keyCode, final int repeatCount, final KeyEvent event) {
        if (!mIsOverridden_onKeyMultipleIrIrKt) {
            return getOriginal().super_onKeyMultiple(keyCode, repeatCount, event);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onKeyMultipleIrIrKt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onKeyMultipleIrIrKt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onKeyMultiple(Integer, Integer, KeyEvent)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onKeyMultiple", Integer.class,
                        Integer.class, KeyEvent.class);
                mMethodImplementingPlugins
                        .put("onKeyMultiple(Integer, Integer, KeyEvent)", implementingPlugins);
                mIsOverridden_onKeyMultipleIrIrKt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun3<Boolean, Integer, Integer, KeyEvent> superCall
                = new CallFun3<Boolean, Integer, Integer, KeyEvent>(
                "onKeyMultiple(Integer, Integer, KeyEvent)") {

            @Override
            public Boolean call(final Integer keyCode, final Integer repeatCount,
                    final KeyEvent event) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onKeyMultiple(this, keyCode, repeatCount, event);
                } else {
                    return getOriginal().super_onKeyMultiple(keyCode, repeatCount, event);
                }
            }
        };
        return superCall.call(keyCode, repeatCount, event);
    }

    public boolean onKeyShortcut(final int keyCode, final KeyEvent event) {
        if (!mIsOverridden_onKeyShortcutIrKt) {
            return getOriginal().super_onKeyShortcut(keyCode, event);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onKeyShortcutIrKt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onKeyShortcutIrKt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onKeyShortcut(Integer, KeyEvent)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onKeyShortcut", Integer.class,
                        KeyEvent.class);
                mMethodImplementingPlugins
                        .put("onKeyShortcut(Integer, KeyEvent)", implementingPlugins);
                mIsOverridden_onKeyShortcutIrKt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun2<Boolean, Integer, KeyEvent> superCall
                = new CallFun2<Boolean, Integer, KeyEvent>("onKeyShortcut(Integer, KeyEvent)") {

            @Override
            public Boolean call(final Integer keyCode, final KeyEvent event) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onKeyShortcut(this, keyCode, event);
                } else {
                    return getOriginal().super_onKeyShortcut(keyCode, event);
                }
            }
        };
        return superCall.call(keyCode, event);
    }

    public boolean onKeyUp(final int keyCode, final KeyEvent event) {
        if (!mIsOverridden_onKeyUpIrKt) {
            return getOriginal().super_onKeyUp(keyCode, event);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onKeyUpIrKt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onKeyUpIrKt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onKeyUp(Integer, KeyEvent)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onKeyUp", Integer.class,
                        KeyEvent.class);
                mMethodImplementingPlugins.put("onKeyUp(Integer, KeyEvent)", implementingPlugins);
                mIsOverridden_onKeyUpIrKt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun2<Boolean, Integer, KeyEvent> superCall
                = new CallFun2<Boolean, Integer, KeyEvent>("onKeyUp(Integer, KeyEvent)") {

            @Override
            public Boolean call(final Integer keyCode, final KeyEvent event) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onKeyUp(this, keyCode, event);
                } else {
                    return getOriginal().super_onKeyUp(keyCode, event);
                }
            }
        };
        return superCall.call(keyCode, event);
    }

    public void onLowMemory() {
        if (!mIsOverridden_onLowMemory) {
            getOriginal().super_onLowMemory();
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onLowMemory < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onLowMemory++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
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

    public boolean onMenuOpened(final int featureId, final Menu menu) {
        if (!mIsOverridden_onMenuOpenedIrMu) {
            return getOriginal().super_onMenuOpened(featureId, menu);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onMenuOpenedIrMu < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onMenuOpenedIrMu++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onMenuOpened(Integer, Menu)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onMenuOpened", Integer.class,
                        Menu.class);
                mMethodImplementingPlugins.put("onMenuOpened(Integer, Menu)", implementingPlugins);
                mIsOverridden_onMenuOpenedIrMu = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun2<Boolean, Integer, Menu> superCall = new CallFun2<Boolean, Integer, Menu>(
                "onMenuOpened(Integer, Menu)") {

            @Override
            public Boolean call(final Integer featureId, final Menu menu) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onMenuOpened(this, featureId, menu);
                } else {
                    return getOriginal().super_onMenuOpened(featureId, menu);
                }
            }
        };
        return superCall.call(featureId, menu);
    }

    public void onMultiWindowModeChanged(final boolean isInMultiWindowMode) {
        if (!mIsOverridden_onMultiWindowModeChangedBn) {
            getOriginal().super_onMultiWindowModeChanged(isInMultiWindowMode);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onMultiWindowModeChangedBn < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onMultiWindowModeChangedBn++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
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

    public boolean onNavigateUp() {
        if (!mIsOverridden_onNavigateUp) {
            return getOriginal().super_onNavigateUp();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onNavigateUp < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onNavigateUp++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onNavigateUp()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onNavigateUp");
                mMethodImplementingPlugins.put("onNavigateUp()", implementingPlugins);
                mIsOverridden_onNavigateUp = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<Boolean> superCall = new CallFun0<Boolean>("onNavigateUp()") {

            @Override
            public Boolean call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onNavigateUp(this);
                } else {
                    return getOriginal().super_onNavigateUp();
                }
            }
        };
        return superCall.call();
    }

    public boolean onNavigateUpFromChild(final Activity child) {
        if (!mIsOverridden_onNavigateUpFromChildAy) {
            return getOriginal().super_onNavigateUpFromChild(child);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onNavigateUpFromChildAy < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onNavigateUpFromChildAy++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onNavigateUpFromChild(Activity)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onNavigateUpFromChild",
                        Activity.class);
                mMethodImplementingPlugins
                        .put("onNavigateUpFromChild(Activity)", implementingPlugins);
                mIsOverridden_onNavigateUpFromChildAy = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<Boolean, Activity> superCall = new CallFun1<Boolean, Activity>(
                "onNavigateUpFromChild(Activity)") {

            @Override
            public Boolean call(final Activity child) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onNavigateUpFromChild(this, child);
                } else {
                    return getOriginal().super_onNavigateUpFromChild(child);
                }
            }
        };
        return superCall.call(child);
    }

    public void onNewIntent(final Intent intent) {
        if (!mIsOverridden_onNewIntentIt) {
            getOriginal().super_onNewIntent(intent);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onNewIntentIt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onNewIntentIt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onNewIntent(Intent)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onNewIntent", Intent.class);
                mMethodImplementingPlugins.put("onNewIntent(Intent)", implementingPlugins);
                mIsOverridden_onNewIntentIt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<Intent> superCall = new CallVoid1<Intent>("onNewIntent(Intent)") {

            @Override
            public void call(final Intent intent) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onNewIntent(this, intent);
                } else {
                    getOriginal().super_onNewIntent(intent);
                }
            }
        };
        superCall.call(intent);
    }

    public boolean onOptionsItemSelected(final MenuItem item) {
        if (!mIsOverridden_onOptionsItemSelectedMm) {
            return getOriginal().super_onOptionsItemSelected(item);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onOptionsItemSelectedMm < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onOptionsItemSelectedMm++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
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

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onOptionsMenuClosedMu < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onOptionsMenuClosedMu++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
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

    public void onPanelClosed(final int featureId, final Menu menu) {
        if (!mIsOverridden_onPanelClosedIrMu) {
            getOriginal().super_onPanelClosed(featureId, menu);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onPanelClosedIrMu < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onPanelClosedIrMu++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onPanelClosed(Integer, Menu)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onPanelClosed", Integer.class,
                        Menu.class);
                mMethodImplementingPlugins.put("onPanelClosed(Integer, Menu)", implementingPlugins);
                mIsOverridden_onPanelClosedIrMu = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid2<Integer, Menu> superCall = new CallVoid2<Integer, Menu>(
                "onPanelClosed(Integer, Menu)") {

            @Override
            public void call(final Integer featureId, final Menu menu) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onPanelClosed(this, featureId, menu);
                } else {
                    getOriginal().super_onPanelClosed(featureId, menu);
                }
            }
        };
        superCall.call(featureId, menu);
    }

    public void onPause() {
        if (!mIsOverridden_onPause) {
            getOriginal().super_onPause();
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onPause < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onPause++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins.get("onPause()");
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

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onPictureInPictureModeChangedBn < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onPictureInPictureModeChangedBn++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
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

    public void onPostCreate(final Bundle savedInstanceState,
            final PersistableBundle persistentState) {
        if (!mIsOverridden_onPostCreateBePe) {
            getOriginal().super_onPostCreate(savedInstanceState, persistentState);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onPostCreateBePe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onPostCreateBePe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onPostCreate(Bundle, PersistableBundle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onPostCreate", Bundle.class,
                        PersistableBundle.class);
                mMethodImplementingPlugins
                        .put("onPostCreate(Bundle, PersistableBundle)", implementingPlugins);
                mIsOverridden_onPostCreateBePe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid2<Bundle, PersistableBundle> superCall
                = new CallVoid2<Bundle, PersistableBundle>(
                "onPostCreate(Bundle, PersistableBundle)") {

            @Override
            public void call(final Bundle savedInstanceState,
                    final PersistableBundle persistentState) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onPostCreate(this, savedInstanceState, persistentState);
                } else {
                    getOriginal().super_onPostCreate(savedInstanceState, persistentState);
                }
            }
        };
        superCall.call(savedInstanceState, persistentState);
    }

    public void onPostCreate(@Nullable final Bundle savedInstanceState) {
        if (!mIsOverridden_onPostCreateBe) {
            getOriginal().super_onPostCreate(savedInstanceState);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onPostCreateBe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onPostCreateBe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onPostCreate(Bundle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onPostCreate", Bundle.class);
                mMethodImplementingPlugins.put("onPostCreate(Bundle)", implementingPlugins);
                mIsOverridden_onPostCreateBe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<Bundle> superCall = new CallVoid1<Bundle>("onPostCreate(Bundle)") {

            @Override
            public void call(final Bundle savedInstanceState) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onPostCreate(this, savedInstanceState);
                } else {
                    getOriginal().super_onPostCreate(savedInstanceState);
                }
            }
        };
        superCall.call(savedInstanceState);
    }

    public void onPostResume() {
        if (!mIsOverridden_onPostResume) {
            getOriginal().super_onPostResume();
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onPostResume < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onPostResume++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onPostResume()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onPostResume");
                mMethodImplementingPlugins.put("onPostResume()", implementingPlugins);
                mIsOverridden_onPostResume = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid0 superCall = new CallVoid0("onPostResume()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().onPostResume(this);
                } else {
                    getOriginal().super_onPostResume();
                }
            }
        };
        superCall.call();
    }

    public void onPrepareDialog(final int id, final Dialog dialog) {
        if (!mIsOverridden_onPrepareDialogIrDg) {
            getOriginal().super_onPrepareDialog(id, dialog);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onPrepareDialogIrDg < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onPrepareDialogIrDg++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onPrepareDialog(Integer, Dialog)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onPrepareDialog", Integer.class,
                        Dialog.class);
                mMethodImplementingPlugins
                        .put("onPrepareDialog(Integer, Dialog)", implementingPlugins);
                mIsOverridden_onPrepareDialogIrDg = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid2<Integer, Dialog> superCall = new CallVoid2<Integer, Dialog>(
                "onPrepareDialog(Integer, Dialog)") {

            @Override
            public void call(final Integer id, final Dialog dialog) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onPrepareDialog(this, id, dialog);
                } else {
                    getOriginal().super_onPrepareDialog(id, dialog);
                }
            }
        };
        superCall.call(id, dialog);
    }

    public void onPrepareDialog(final int id, final Dialog dialog, final Bundle args) {
        if (!mIsOverridden_onPrepareDialogIrDgBe) {
            getOriginal().super_onPrepareDialog(id, dialog, args);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onPrepareDialogIrDgBe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onPrepareDialogIrDgBe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onPrepareDialog(Integer, Dialog, Bundle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onPrepareDialog", Integer.class,
                        Dialog.class, Bundle.class);
                mMethodImplementingPlugins
                        .put("onPrepareDialog(Integer, Dialog, Bundle)", implementingPlugins);
                mIsOverridden_onPrepareDialogIrDgBe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid3<Integer, Dialog, Bundle> superCall = new CallVoid3<Integer, Dialog, Bundle>(
                "onPrepareDialog(Integer, Dialog, Bundle)") {

            @Override
            public void call(final Integer id, final Dialog dialog, final Bundle args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onPrepareDialog(this, id, dialog, args);
                } else {
                    getOriginal().super_onPrepareDialog(id, dialog, args);
                }
            }
        };
        superCall.call(id, dialog, args);
    }

    public void onPrepareNavigateUpTaskStack(final TaskStackBuilder builder) {
        if (!mIsOverridden_onPrepareNavigateUpTaskStackTr) {
            getOriginal().super_onPrepareNavigateUpTaskStack(builder);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onPrepareNavigateUpTaskStackTr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onPrepareNavigateUpTaskStackTr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onPrepareNavigateUpTaskStack(TaskStackBuilder)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onPrepareNavigateUpTaskStack",
                        TaskStackBuilder.class);
                mMethodImplementingPlugins
                        .put("onPrepareNavigateUpTaskStack(TaskStackBuilder)", implementingPlugins);
                mIsOverridden_onPrepareNavigateUpTaskStackTr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<TaskStackBuilder> superCall = new CallVoid1<TaskStackBuilder>(
                "onPrepareNavigateUpTaskStack(TaskStackBuilder)") {

            @Override
            public void call(final TaskStackBuilder builder) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onPrepareNavigateUpTaskStack(this, builder);
                } else {
                    getOriginal().super_onPrepareNavigateUpTaskStack(builder);
                }
            }
        };
        superCall.call(builder);
    }

    public boolean onPrepareOptionsMenu(final Menu menu) {
        if (!mIsOverridden_onPrepareOptionsMenuMu) {
            return getOriginal().super_onPrepareOptionsMenu(menu);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onPrepareOptionsMenuMu < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onPrepareOptionsMenuMu++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onPrepareOptionsMenu(Menu)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onPrepareOptionsMenu", Menu.class);
                mMethodImplementingPlugins.put("onPrepareOptionsMenu(Menu)", implementingPlugins);
                mIsOverridden_onPrepareOptionsMenuMu = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<Boolean, Menu> superCall = new CallFun1<Boolean, Menu>(
                "onPrepareOptionsMenu(Menu)") {

            @Override
            public Boolean call(final Menu menu) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onPrepareOptionsMenu(this, menu);
                } else {
                    return getOriginal().super_onPrepareOptionsMenu(menu);
                }
            }
        };
        return superCall.call(menu);
    }

    public boolean onPrepareOptionsPanel(final View view, final Menu menu) {
        if (!mIsOverridden_onPrepareOptionsPanelVwMu) {
            return getOriginal().super_onPrepareOptionsPanel(view, menu);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onPrepareOptionsPanelVwMu < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onPrepareOptionsPanelVwMu++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onPrepareOptionsPanel(View, Menu)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onPrepareOptionsPanel", View.class,
                        Menu.class);
                mMethodImplementingPlugins
                        .put("onPrepareOptionsPanel(View, Menu)", implementingPlugins);
                mIsOverridden_onPrepareOptionsPanelVwMu = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun2<Boolean, View, Menu> superCall = new CallFun2<Boolean, View, Menu>(
                "onPrepareOptionsPanel(View, Menu)") {

            @Override
            public Boolean call(final View view, final Menu menu) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onPrepareOptionsPanel(this, view, menu);
                } else {
                    return getOriginal().super_onPrepareOptionsPanel(view, menu);
                }
            }
        };
        return superCall.call(view, menu);
    }

    public boolean onPreparePanel(final int featureId, final View view, final Menu menu) {
        if (!mIsOverridden_onPreparePanelIrVwMu) {
            return getOriginal().super_onPreparePanel(featureId, view, menu);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onPreparePanelIrVwMu < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onPreparePanelIrVwMu++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onPreparePanel(Integer, View, Menu)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onPreparePanel", Integer.class,
                        View.class, Menu.class);
                mMethodImplementingPlugins
                        .put("onPreparePanel(Integer, View, Menu)", implementingPlugins);
                mIsOverridden_onPreparePanelIrVwMu = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun3<Boolean, Integer, View, Menu> superCall
                = new CallFun3<Boolean, Integer, View, Menu>(
                "onPreparePanel(Integer, View, Menu)") {

            @Override
            public Boolean call(final Integer featureId, final View view, final Menu menu) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onPreparePanel(this, featureId, view, menu);
                } else {
                    return getOriginal().super_onPreparePanel(featureId, view, menu);
                }
            }
        };
        return superCall.call(featureId, view, menu);
    }

    public void onPrepareSupportNavigateUpTaskStack(
            @NonNull final android.support.v4.app.TaskStackBuilder builder) {
        if (!mIsOverridden_onPrepareSupportNavigateUpTaskStackar) {
            getOriginal().super_onPrepareSupportNavigateUpTaskStack(builder);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onPrepareSupportNavigateUpTaskStackar < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onPrepareSupportNavigateUpTaskStackar++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onPrepareSupportNavigateUpTaskStack(android.support.v4.app.TaskStackBuilder)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onPrepareSupportNavigateUpTaskStack",
                        android.support.v4.app.TaskStackBuilder.class);
                mMethodImplementingPlugins
                        .put("onPrepareSupportNavigateUpTaskStack(android.support.v4.app.TaskStackBuilder)",
                                implementingPlugins);
                mIsOverridden_onPrepareSupportNavigateUpTaskStackar = implementingPlugins.size()
                        > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<android.support.v4.app.TaskStackBuilder> superCall
                = new CallVoid1<android.support.v4.app.TaskStackBuilder>(
                "onPrepareSupportNavigateUpTaskStack(android.support.v4.app.TaskStackBuilder)") {

            @Override
            public void call(final android.support.v4.app.TaskStackBuilder builder) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onPrepareSupportNavigateUpTaskStack(this, builder);
                } else {
                    getOriginal().super_onPrepareSupportNavigateUpTaskStack(builder);
                }
            }
        };
        superCall.call(builder);
    }

    public void onProvideAssistContent(final AssistContent outContent) {
        if (!mIsOverridden_onProvideAssistContentAt) {
            getOriginal().super_onProvideAssistContent(outContent);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onProvideAssistContentAt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onProvideAssistContentAt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onProvideAssistContent(AssistContent)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onProvideAssistContent",
                        AssistContent.class);
                mMethodImplementingPlugins
                        .put("onProvideAssistContent(AssistContent)", implementingPlugins);
                mIsOverridden_onProvideAssistContentAt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<AssistContent> superCall = new CallVoid1<AssistContent>(
                "onProvideAssistContent(AssistContent)") {

            @Override
            public void call(final AssistContent outContent) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onProvideAssistContent(this, outContent);
                } else {
                    getOriginal().super_onProvideAssistContent(outContent);
                }
            }
        };
        superCall.call(outContent);
    }

    public void onProvideAssistData(final Bundle data) {
        if (!mIsOverridden_onProvideAssistDataBe) {
            getOriginal().super_onProvideAssistData(data);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onProvideAssistDataBe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onProvideAssistDataBe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onProvideAssistData(Bundle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onProvideAssistData", Bundle.class);
                mMethodImplementingPlugins.put("onProvideAssistData(Bundle)", implementingPlugins);
                mIsOverridden_onProvideAssistDataBe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<Bundle> superCall = new CallVoid1<Bundle>("onProvideAssistData(Bundle)") {

            @Override
            public void call(final Bundle data) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onProvideAssistData(this, data);
                } else {
                    getOriginal().super_onProvideAssistData(data);
                }
            }
        };
        superCall.call(data);
    }

    public Uri onProvideReferrer() {
        if (!mIsOverridden_onProvideReferrer) {
            return getOriginal().super_onProvideReferrer();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onProvideReferrer < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onProvideReferrer++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onProvideReferrer()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onProvideReferrer");
                mMethodImplementingPlugins.put("onProvideReferrer()", implementingPlugins);
                mIsOverridden_onProvideReferrer = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<Uri> superCall = new CallFun0<Uri>("onProvideReferrer()") {

            @Override
            public Uri call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onProvideReferrer(this);
                } else {
                    return getOriginal().super_onProvideReferrer();
                }
            }
        };
        return superCall.call();
    }

    public void onRequestPermissionsResult(final int requestCode,
            @NonNull final String[] permissions, @NonNull final int[] grantResults) {
        if (!mIsOverridden_onRequestPermissionsResultIrSgit) {
            getOriginal().super_onRequestPermissionsResult(requestCode, permissions, grantResults);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onRequestPermissionsResultIrSgit < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onRequestPermissionsResultIrSgit++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
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

    public void onRestart() {
        if (!mIsOverridden_onRestart) {
            getOriginal().super_onRestart();
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onRestart < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onRestart++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onRestart()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onRestart");
                mMethodImplementingPlugins.put("onRestart()", implementingPlugins);
                mIsOverridden_onRestart = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid0 superCall = new CallVoid0("onRestart()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().onRestart(this);
                } else {
                    getOriginal().super_onRestart();
                }
            }
        };
        superCall.call();
    }

    public void onRestoreInstanceState(final Bundle savedInstanceState,
            final PersistableBundle persistentState) {
        if (!mIsOverridden_onRestoreInstanceStateBePe) {
            getOriginal().super_onRestoreInstanceState(savedInstanceState, persistentState);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onRestoreInstanceStateBePe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onRestoreInstanceStateBePe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onRestoreInstanceState(Bundle, PersistableBundle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onRestoreInstanceState", Bundle.class,
                        PersistableBundle.class);
                mMethodImplementingPlugins.put("onRestoreInstanceState(Bundle, PersistableBundle)",
                        implementingPlugins);
                mIsOverridden_onRestoreInstanceStateBePe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid2<Bundle, PersistableBundle> superCall
                = new CallVoid2<Bundle, PersistableBundle>(
                "onRestoreInstanceState(Bundle, PersistableBundle)") {

            @Override
            public void call(final Bundle savedInstanceState,
                    final PersistableBundle persistentState) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .onRestoreInstanceState(this, savedInstanceState, persistentState);
                } else {
                    getOriginal().super_onRestoreInstanceState(savedInstanceState, persistentState);
                }
            }
        };
        superCall.call(savedInstanceState, persistentState);
    }

    public void onRestoreInstanceState(final Bundle savedInstanceState) {
        if (!mIsOverridden_onRestoreInstanceStateBe) {
            getOriginal().super_onRestoreInstanceState(savedInstanceState);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onRestoreInstanceStateBe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onRestoreInstanceStateBe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onRestoreInstanceState(Bundle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onRestoreInstanceState",
                        Bundle.class);
                mMethodImplementingPlugins
                        .put("onRestoreInstanceState(Bundle)", implementingPlugins);
                mIsOverridden_onRestoreInstanceStateBe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<Bundle> superCall = new CallVoid1<Bundle>(
                "onRestoreInstanceState(Bundle)") {

            @Override
            public void call(final Bundle savedInstanceState) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onRestoreInstanceState(this, savedInstanceState);
                } else {
                    getOriginal().super_onRestoreInstanceState(savedInstanceState);
                }
            }
        };
        superCall.call(savedInstanceState);
    }

    public void onResume() {
        if (!mIsOverridden_onResume) {
            getOriginal().super_onResume();
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onResume < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onResume++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins.get("onResume()");
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

    public void onResumeFragments() {
        if (!mIsOverridden_onResumeFragments) {
            getOriginal().super_onResumeFragments();
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onResumeFragments < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onResumeFragments++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onResumeFragments()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onResumeFragments");
                mMethodImplementingPlugins.put("onResumeFragments()", implementingPlugins);
                mIsOverridden_onResumeFragments = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid0 superCall = new CallVoid0("onResumeFragments()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().onResumeFragments(this);
                } else {
                    getOriginal().super_onResumeFragments();
                }
            }
        };
        superCall.call();
    }

    public Object onRetainNonConfigurationInstance() {
        final NonConfigurationInstanceWrapper all = new NonConfigurationInstanceWrapper(
                getOriginal().onRetainCompositeCustomNonConfigurationInstance());
        for (final ActivityPlugin plugin : mPlugins) {
            final CompositeNonConfigurationInstance pluginNci = plugin
                    .onRetainNonConfigurationInstance();
            if (pluginNci != null) {
                all.putPluginNonConfigurationInstance(pluginNci);
            }
        }
        return all;
    }

    public void onSaveInstanceState(final Bundle outState,
            final PersistableBundle outPersistentState) {
        if (!mIsOverridden_onSaveInstanceStateBePe) {
            getOriginal().super_onSaveInstanceState(outState, outPersistentState);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onSaveInstanceStateBePe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onSaveInstanceStateBePe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onSaveInstanceState(Bundle, PersistableBundle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onSaveInstanceState", Bundle.class,
                        PersistableBundle.class);
                mMethodImplementingPlugins
                        .put("onSaveInstanceState(Bundle, PersistableBundle)", implementingPlugins);
                mIsOverridden_onSaveInstanceStateBePe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid2<Bundle, PersistableBundle> superCall
                = new CallVoid2<Bundle, PersistableBundle>(
                "onSaveInstanceState(Bundle, PersistableBundle)") {

            @Override
            public void call(final Bundle outState, final PersistableBundle outPersistentState) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onSaveInstanceState(this, outState, outPersistentState);
                } else {
                    getOriginal().super_onSaveInstanceState(outState, outPersistentState);
                }
            }
        };
        superCall.call(outState, outPersistentState);
    }

    public void onSaveInstanceState(final Bundle outState) {
        if (!mIsOverridden_onSaveInstanceStateBe) {
            getOriginal().super_onSaveInstanceState(outState);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onSaveInstanceStateBe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onSaveInstanceStateBe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
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

    public boolean onSearchRequested(final SearchEvent searchEvent) {
        if (!mIsOverridden_onSearchRequestedSt) {
            return getOriginal().super_onSearchRequested(searchEvent);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onSearchRequestedSt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onSearchRequestedSt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onSearchRequested(SearchEvent)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onSearchRequested",
                        SearchEvent.class);
                mMethodImplementingPlugins
                        .put("onSearchRequested(SearchEvent)", implementingPlugins);
                mIsOverridden_onSearchRequestedSt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<Boolean, SearchEvent> superCall = new CallFun1<Boolean, SearchEvent>(
                "onSearchRequested(SearchEvent)") {

            @Override
            public Boolean call(final SearchEvent searchEvent) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onSearchRequested(this, searchEvent);
                } else {
                    return getOriginal().super_onSearchRequested(searchEvent);
                }
            }
        };
        return superCall.call(searchEvent);
    }

    public boolean onSearchRequested() {
        if (!mIsOverridden_onSearchRequested) {
            return getOriginal().super_onSearchRequested();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onSearchRequested < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onSearchRequested++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onSearchRequested()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onSearchRequested");
                mMethodImplementingPlugins.put("onSearchRequested()", implementingPlugins);
                mIsOverridden_onSearchRequested = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<Boolean> superCall = new CallFun0<Boolean>("onSearchRequested()") {

            @Override
            public Boolean call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onSearchRequested(this);
                } else {
                    return getOriginal().super_onSearchRequested();
                }
            }
        };
        return superCall.call();
    }

    public void onStart() {
        if (!mIsOverridden_onStart) {
            getOriginal().super_onStart();
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onStart < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onStart++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins.get("onStart()");
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

    public void onStateNotSaved() {
        if (!mIsOverridden_onStateNotSaved) {
            getOriginal().super_onStateNotSaved();
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onStateNotSaved < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onStateNotSaved++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onStateNotSaved()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onStateNotSaved");
                mMethodImplementingPlugins.put("onStateNotSaved()", implementingPlugins);
                mIsOverridden_onStateNotSaved = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid0 superCall = new CallVoid0("onStateNotSaved()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().onStateNotSaved(this);
                } else {
                    getOriginal().super_onStateNotSaved();
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

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onStop < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onStop++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins.get("onStop()");
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

    public void onSupportActionModeFinished(@NonNull final ActionMode mode) {
        if (!mIsOverridden_onSupportActionModeFinishedAe) {
            getOriginal().super_onSupportActionModeFinished(mode);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onSupportActionModeFinishedAe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onSupportActionModeFinishedAe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onSupportActionModeFinished(ActionMode)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onSupportActionModeFinished",
                        ActionMode.class);
                mMethodImplementingPlugins
                        .put("onSupportActionModeFinished(ActionMode)", implementingPlugins);
                mIsOverridden_onSupportActionModeFinishedAe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<ActionMode> superCall = new CallVoid1<ActionMode>(
                "onSupportActionModeFinished(ActionMode)") {

            @Override
            public void call(final ActionMode mode) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onSupportActionModeFinished(this, mode);
                } else {
                    getOriginal().super_onSupportActionModeFinished(mode);
                }
            }
        };
        superCall.call(mode);
    }

    public void onSupportActionModeStarted(@NonNull final ActionMode mode) {
        if (!mIsOverridden_onSupportActionModeStartedAe) {
            getOriginal().super_onSupportActionModeStarted(mode);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onSupportActionModeStartedAe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onSupportActionModeStartedAe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onSupportActionModeStarted(ActionMode)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onSupportActionModeStarted",
                        ActionMode.class);
                mMethodImplementingPlugins
                        .put("onSupportActionModeStarted(ActionMode)", implementingPlugins);
                mIsOverridden_onSupportActionModeStartedAe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<ActionMode> superCall = new CallVoid1<ActionMode>(
                "onSupportActionModeStarted(ActionMode)") {

            @Override
            public void call(final ActionMode mode) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onSupportActionModeStarted(this, mode);
                } else {
                    getOriginal().super_onSupportActionModeStarted(mode);
                }
            }
        };
        superCall.call(mode);
    }

    public void onSupportContentChanged() {
        if (!mIsOverridden_onSupportContentChanged) {
            getOriginal().super_onSupportContentChanged();
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onSupportContentChanged < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onSupportContentChanged++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onSupportContentChanged()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onSupportContentChanged");
                mMethodImplementingPlugins.put("onSupportContentChanged()", implementingPlugins);
                mIsOverridden_onSupportContentChanged = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid0 superCall = new CallVoid0("onSupportContentChanged()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().onSupportContentChanged(this);
                } else {
                    getOriginal().super_onSupportContentChanged();
                }
            }
        };
        superCall.call();
    }

    public boolean onSupportNavigateUp() {
        if (!mIsOverridden_onSupportNavigateUp) {
            return getOriginal().super_onSupportNavigateUp();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onSupportNavigateUp < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onSupportNavigateUp++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onSupportNavigateUp()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onSupportNavigateUp");
                mMethodImplementingPlugins.put("onSupportNavigateUp()", implementingPlugins);
                mIsOverridden_onSupportNavigateUp = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<Boolean> superCall = new CallFun0<Boolean>("onSupportNavigateUp()") {

            @Override
            public Boolean call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onSupportNavigateUp(this);
                } else {
                    return getOriginal().super_onSupportNavigateUp();
                }
            }
        };
        return superCall.call();
    }

    public void onTitleChanged(final CharSequence title, final int color) {
        if (!mIsOverridden_onTitleChangedCeIr) {
            getOriginal().super_onTitleChanged(title, color);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onTitleChangedCeIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onTitleChangedCeIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onTitleChanged(CharSequence, Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onTitleChanged", CharSequence.class,
                        Integer.class);
                mMethodImplementingPlugins
                        .put("onTitleChanged(CharSequence, Integer)", implementingPlugins);
                mIsOverridden_onTitleChangedCeIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid2<CharSequence, Integer> superCall = new CallVoid2<CharSequence, Integer>(
                "onTitleChanged(CharSequence, Integer)") {

            @Override
            public void call(final CharSequence title, final Integer color) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onTitleChanged(this, title, color);
                } else {
                    getOriginal().super_onTitleChanged(title, color);
                }
            }
        };
        superCall.call(title, color);
    }

    public boolean onTouchEvent(final MotionEvent event) {
        if (!mIsOverridden_onTouchEventMt) {
            return getOriginal().super_onTouchEvent(event);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onTouchEventMt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onTouchEventMt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onTouchEvent(MotionEvent)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onTouchEvent", MotionEvent.class);
                mMethodImplementingPlugins.put("onTouchEvent(MotionEvent)", implementingPlugins);
                mIsOverridden_onTouchEventMt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<Boolean, MotionEvent> superCall = new CallFun1<Boolean, MotionEvent>(
                "onTouchEvent(MotionEvent)") {

            @Override
            public Boolean call(final MotionEvent event) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onTouchEvent(this, event);
                } else {
                    return getOriginal().super_onTouchEvent(event);
                }
            }
        };
        return superCall.call(event);
    }

    public boolean onTrackballEvent(final MotionEvent event) {
        if (!mIsOverridden_onTrackballEventMt) {
            return getOriginal().super_onTrackballEvent(event);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onTrackballEventMt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onTrackballEventMt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onTrackballEvent(MotionEvent)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onTrackballEvent", MotionEvent.class);
                mMethodImplementingPlugins
                        .put("onTrackballEvent(MotionEvent)", implementingPlugins);
                mIsOverridden_onTrackballEventMt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<Boolean, MotionEvent> superCall = new CallFun1<Boolean, MotionEvent>(
                "onTrackballEvent(MotionEvent)") {

            @Override
            public Boolean call(final MotionEvent event) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onTrackballEvent(this, event);
                } else {
                    return getOriginal().super_onTrackballEvent(event);
                }
            }
        };
        return superCall.call(event);
    }

    public void onTrimMemory(final int level) {
        if (!mIsOverridden_onTrimMemoryIr) {
            getOriginal().super_onTrimMemory(level);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onTrimMemoryIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onTrimMemoryIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onTrimMemory(Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onTrimMemory", Integer.class);
                mMethodImplementingPlugins.put("onTrimMemory(Integer)", implementingPlugins);
                mIsOverridden_onTrimMemoryIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<Integer> superCall = new CallVoid1<Integer>("onTrimMemory(Integer)") {

            @Override
            public void call(final Integer level) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onTrimMemory(this, level);
                } else {
                    getOriginal().super_onTrimMemory(level);
                }
            }
        };
        superCall.call(level);
    }

    public void onUserInteraction() {
        if (!mIsOverridden_onUserInteraction) {
            getOriginal().super_onUserInteraction();
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onUserInteraction < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onUserInteraction++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onUserInteraction()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onUserInteraction");
                mMethodImplementingPlugins.put("onUserInteraction()", implementingPlugins);
                mIsOverridden_onUserInteraction = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid0 superCall = new CallVoid0("onUserInteraction()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().onUserInteraction(this);
                } else {
                    getOriginal().super_onUserInteraction();
                }
            }
        };
        superCall.call();
    }

    public void onUserLeaveHint() {
        if (!mIsOverridden_onUserLeaveHint) {
            getOriginal().super_onUserLeaveHint();
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onUserLeaveHint < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onUserLeaveHint++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onUserLeaveHint()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onUserLeaveHint");
                mMethodImplementingPlugins.put("onUserLeaveHint()", implementingPlugins);
                mIsOverridden_onUserLeaveHint = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid0 superCall = new CallVoid0("onUserLeaveHint()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().onUserLeaveHint(this);
                } else {
                    getOriginal().super_onUserLeaveHint();
                }
            }
        };
        superCall.call();
    }

    public void onVisibleBehindCanceled() {
        if (!mIsOverridden_onVisibleBehindCanceled) {
            getOriginal().super_onVisibleBehindCanceled();
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onVisibleBehindCanceled < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onVisibleBehindCanceled++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onVisibleBehindCanceled()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onVisibleBehindCanceled");
                mMethodImplementingPlugins.put("onVisibleBehindCanceled()", implementingPlugins);
                mIsOverridden_onVisibleBehindCanceled = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid0 superCall = new CallVoid0("onVisibleBehindCanceled()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().onVisibleBehindCanceled(this);
                } else {
                    getOriginal().super_onVisibleBehindCanceled();
                }
            }
        };
        superCall.call();
    }

    public void onWindowAttributesChanged(final WindowManager.LayoutParams params) {
        if (!mIsOverridden_onWindowAttributesChangedWs) {
            getOriginal().super_onWindowAttributesChanged(params);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onWindowAttributesChangedWs < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onWindowAttributesChangedWs++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onWindowAttributesChanged(WindowManager.LayoutParams)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onWindowAttributesChanged",
                        WindowManager.LayoutParams.class);
                mMethodImplementingPlugins
                        .put("onWindowAttributesChanged(WindowManager.LayoutParams)",
                                implementingPlugins);
                mIsOverridden_onWindowAttributesChangedWs = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<WindowManager.LayoutParams> superCall
                = new CallVoid1<WindowManager.LayoutParams>(
                "onWindowAttributesChanged(WindowManager.LayoutParams)") {

            @Override
            public void call(final WindowManager.LayoutParams params) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onWindowAttributesChanged(this, params);
                } else {
                    getOriginal().super_onWindowAttributesChanged(params);
                }
            }
        };
        superCall.call(params);
    }

    public void onWindowFocusChanged(final boolean hasFocus) {
        if (!mIsOverridden_onWindowFocusChangedBn) {
            getOriginal().super_onWindowFocusChanged(hasFocus);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onWindowFocusChangedBn < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onWindowFocusChangedBn++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onWindowFocusChanged(Boolean)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onWindowFocusChanged", Boolean.class);
                mMethodImplementingPlugins
                        .put("onWindowFocusChanged(Boolean)", implementingPlugins);
                mIsOverridden_onWindowFocusChangedBn = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<Boolean> superCall = new CallVoid1<Boolean>(
                "onWindowFocusChanged(Boolean)") {

            @Override
            public void call(final Boolean hasFocus) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onWindowFocusChanged(this, hasFocus);
                } else {
                    getOriginal().super_onWindowFocusChanged(hasFocus);
                }
            }
        };
        superCall.call(hasFocus);
    }

    public android.view.ActionMode onWindowStartingActionMode(
            final android.view.ActionMode.Callback callback) {
        if (!mIsOverridden_onWindowStartingActionModeak) {
            return getOriginal().super_onWindowStartingActionMode(callback);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onWindowStartingActionModeak < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onWindowStartingActionModeak++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onWindowStartingActionMode(android.view.ActionMode.Callback)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onWindowStartingActionMode",
                        android.view.ActionMode.Callback.class);
                mMethodImplementingPlugins
                        .put("onWindowStartingActionMode(android.view.ActionMode.Callback)",
                                implementingPlugins);
                mIsOverridden_onWindowStartingActionModeak = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<android.view.ActionMode, android.view.ActionMode.Callback> superCall
                = new CallFun1<android.view.ActionMode, android.view.ActionMode.Callback>(
                "onWindowStartingActionMode(android.view.ActionMode.Callback)") {

            @Override
            public android.view.ActionMode call(final android.view.ActionMode.Callback callback) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onWindowStartingActionMode(this, callback);
                } else {
                    return getOriginal().super_onWindowStartingActionMode(callback);
                }
            }
        };
        return superCall.call(callback);
    }

    public android.view.ActionMode onWindowStartingActionMode(
            final android.view.ActionMode.Callback callback, final int type) {
        if (!mIsOverridden_onWindowStartingActionModeakIr) {
            return getOriginal().super_onWindowStartingActionMode(callback, type);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onWindowStartingActionModeakIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onWindowStartingActionModeakIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onWindowStartingActionMode(android.view.ActionMode.Callback, Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onWindowStartingActionMode",
                        android.view.ActionMode.Callback.class, Integer.class);
                mMethodImplementingPlugins
                        .put("onWindowStartingActionMode(android.view.ActionMode.Callback, Integer)",
                                implementingPlugins);
                mIsOverridden_onWindowStartingActionModeakIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun2<android.view.ActionMode, android.view.ActionMode.Callback, Integer> superCall
                = new CallFun2<android.view.ActionMode, android.view.ActionMode.Callback, Integer>(
                "onWindowStartingActionMode(android.view.ActionMode.Callback, Integer)") {

            @Override
            public android.view.ActionMode call(final android.view.ActionMode.Callback callback,
                    final Integer type) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onWindowStartingActionMode(this, callback, type);
                } else {
                    return getOriginal().super_onWindowStartingActionMode(callback, type);
                }
            }
        };
        return superCall.call(callback, type);
    }

    public ActionMode onWindowStartingSupportActionMode(
            @NonNull final ActionMode.Callback callback) {
        if (!mIsOverridden_onWindowStartingSupportActionModeAk) {
            return getOriginal().super_onWindowStartingSupportActionMode(callback);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_onWindowStartingSupportActionModeAk < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_onWindowStartingSupportActionModeAk++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("onWindowStartingSupportActionMode(ActionMode.Callback)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("onWindowStartingSupportActionMode",
                        ActionMode.Callback.class);
                mMethodImplementingPlugins
                        .put("onWindowStartingSupportActionMode(ActionMode.Callback)",
                                implementingPlugins);
                mIsOverridden_onWindowStartingSupportActionModeAk = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<ActionMode, ActionMode.Callback> superCall
                = new CallFun1<ActionMode, ActionMode.Callback>(
                "onWindowStartingSupportActionMode(ActionMode.Callback)") {

            @Override
            public ActionMode call(final ActionMode.Callback callback) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onWindowStartingSupportActionMode(this, callback);
                } else {
                    return getOriginal().super_onWindowStartingSupportActionMode(callback);
                }
            }
        };
        return superCall.call(callback);
    }

    public void openContextMenu(final View view) {
        if (!mIsOverridden_openContextMenuVw) {
            getOriginal().super_openContextMenu(view);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_openContextMenuVw < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_openContextMenuVw++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("openContextMenu(View)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("openContextMenu", View.class);
                mMethodImplementingPlugins.put("openContextMenu(View)", implementingPlugins);
                mIsOverridden_openContextMenuVw = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<View> superCall = new CallVoid1<View>("openContextMenu(View)") {

            @Override
            public void call(final View view) {
                if (iterator.hasPrevious()) {
                    iterator.previous().openContextMenu(this, view);
                } else {
                    getOriginal().super_openContextMenu(view);
                }
            }
        };
        superCall.call(view);
    }

    public FileInputStream openFileInput(final String name) throws FileNotFoundException {
        if (!mIsOverridden_openFileInputSg) {
            return getOriginal().super_openFileInput(name);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_openFileInputSg < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_openFileInputSg++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("openFileInput(String)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("openFileInput", String.class);
                mMethodImplementingPlugins.put("openFileInput(String)", implementingPlugins);
                mIsOverridden_openFileInputSg = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<FileInputStream, String> superCall = new CallFun1<FileInputStream, String>(
                "openFileInput(String)") {

            @Override
            public FileInputStream call(final String name) {
                if (iterator.hasPrevious()) {
                    try {
                        return iterator.previous().openFileInput(this, name);
                    } catch (FileNotFoundException e) {
                        throw new SuppressedException(e);
                    }
                } else {
                    try {
                        return getOriginal().super_openFileInput(name);
                    } catch (FileNotFoundException e) {
                        throw new SuppressedException(e);
                    }
                }
            }
        };
        return superCall.call(name);
    }

    public FileOutputStream openFileOutput(final String name, final int mode)
            throws FileNotFoundException {
        if (!mIsOverridden_openFileOutputSgIr) {
            return getOriginal().super_openFileOutput(name, mode);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_openFileOutputSgIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_openFileOutputSgIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("openFileOutput(String, Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("openFileOutput", String.class,
                        Integer.class);
                mMethodImplementingPlugins
                        .put("openFileOutput(String, Integer)", implementingPlugins);
                mIsOverridden_openFileOutputSgIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun2<FileOutputStream, String, Integer> superCall
                = new CallFun2<FileOutputStream, String, Integer>(
                "openFileOutput(String, Integer)") {

            @Override
            public FileOutputStream call(final String name, final Integer mode) {
                if (iterator.hasPrevious()) {
                    try {
                        return iterator.previous().openFileOutput(this, name, mode);
                    } catch (FileNotFoundException e) {
                        throw new SuppressedException(e);
                    }
                } else {
                    try {
                        return getOriginal().super_openFileOutput(name, mode);
                    } catch (FileNotFoundException e) {
                        throw new SuppressedException(e);
                    }
                }
            }
        };
        return superCall.call(name, mode);
    }

    public void openOptionsMenu() {
        if (!mIsOverridden_openOptionsMenu) {
            getOriginal().super_openOptionsMenu();
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_openOptionsMenu < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_openOptionsMenu++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("openOptionsMenu()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("openOptionsMenu");
                mMethodImplementingPlugins.put("openOptionsMenu()", implementingPlugins);
                mIsOverridden_openOptionsMenu = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid0 superCall = new CallVoid0("openOptionsMenu()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().openOptionsMenu(this);
                } else {
                    getOriginal().super_openOptionsMenu();
                }
            }
        };
        superCall.call();
    }

    public SQLiteDatabase openOrCreateDatabase(final String name, final int mode,
            final SQLiteDatabase.CursorFactory factory) {
        if (!mIsOverridden_openOrCreateDatabaseSgIrSy) {
            return getOriginal().super_openOrCreateDatabase(name, mode, factory);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_openOrCreateDatabaseSgIrSy < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_openOrCreateDatabaseSgIrSy++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("openOrCreateDatabase(String, Integer, SQLiteDatabase.CursorFactory)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("openOrCreateDatabase", String.class,
                        Integer.class, SQLiteDatabase.CursorFactory.class);
                mMethodImplementingPlugins
                        .put("openOrCreateDatabase(String, Integer, SQLiteDatabase.CursorFactory)",
                                implementingPlugins);
                mIsOverridden_openOrCreateDatabaseSgIrSy = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun3<SQLiteDatabase, String, Integer, SQLiteDatabase.CursorFactory> superCall
                = new CallFun3<SQLiteDatabase, String, Integer, SQLiteDatabase.CursorFactory>(
                "openOrCreateDatabase(String, Integer, SQLiteDatabase.CursorFactory)") {

            @Override
            public SQLiteDatabase call(final String name, final Integer mode,
                    final SQLiteDatabase.CursorFactory factory) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().openOrCreateDatabase(this, name, mode, factory);
                } else {
                    return getOriginal().super_openOrCreateDatabase(name, mode, factory);
                }
            }
        };
        return superCall.call(name, mode, factory);
    }

    public SQLiteDatabase openOrCreateDatabase(final String name, final int mode,
            final SQLiteDatabase.CursorFactory factory, final DatabaseErrorHandler errorHandler) {
        if (!mIsOverridden_openOrCreateDatabaseSgIrSyDr) {
            return getOriginal().super_openOrCreateDatabase(name, mode, factory, errorHandler);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_openOrCreateDatabaseSgIrSyDr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_openOrCreateDatabaseSgIrSyDr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("openOrCreateDatabase(String, Integer, SQLiteDatabase.CursorFactory, DatabaseErrorHandler)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("openOrCreateDatabase", String.class,
                        Integer.class, SQLiteDatabase.CursorFactory.class,
                        DatabaseErrorHandler.class);
                mMethodImplementingPlugins
                        .put("openOrCreateDatabase(String, Integer, SQLiteDatabase.CursorFactory, DatabaseErrorHandler)",
                                implementingPlugins);
                mIsOverridden_openOrCreateDatabaseSgIrSyDr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun4<SQLiteDatabase, String, Integer, SQLiteDatabase.CursorFactory, DatabaseErrorHandler>
                superCall
                = new CallFun4<SQLiteDatabase, String, Integer, SQLiteDatabase.CursorFactory, DatabaseErrorHandler>(
                "openOrCreateDatabase(String, Integer, SQLiteDatabase.CursorFactory, DatabaseErrorHandler)") {

            @Override
            public SQLiteDatabase call(final String name, final Integer mode,
                    final SQLiteDatabase.CursorFactory factory,
                    final DatabaseErrorHandler errorHandler) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .openOrCreateDatabase(this, name, mode, factory, errorHandler);
                } else {
                    return getOriginal()
                            .super_openOrCreateDatabase(name, mode, factory, errorHandler);
                }
            }
        };
        return superCall.call(name, mode, factory, errorHandler);
    }

    public void overridePendingTransition(final int enterAnim, final int exitAnim) {
        if (!mIsOverridden_overridePendingTransitionIrIr) {
            getOriginal().super_overridePendingTransition(enterAnim, exitAnim);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_overridePendingTransitionIrIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_overridePendingTransitionIrIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("overridePendingTransition(Integer, Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("overridePendingTransition",
                        Integer.class, Integer.class);
                mMethodImplementingPlugins
                        .put("overridePendingTransition(Integer, Integer)", implementingPlugins);
                mIsOverridden_overridePendingTransitionIrIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid2<Integer, Integer> superCall = new CallVoid2<Integer, Integer>(
                "overridePendingTransition(Integer, Integer)") {

            @Override
            public void call(final Integer enterAnim, final Integer exitAnim) {
                if (iterator.hasPrevious()) {
                    iterator.previous().overridePendingTransition(this, enterAnim, exitAnim);
                } else {
                    getOriginal().super_overridePendingTransition(enterAnim, exitAnim);
                }
            }
        };
        superCall.call(enterAnim, exitAnim);
    }

    public Drawable peekWallpaper() {
        if (!mIsOverridden_peekWallpaper) {
            return getOriginal().super_peekWallpaper();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_peekWallpaper < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_peekWallpaper++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("peekWallpaper()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("peekWallpaper");
                mMethodImplementingPlugins.put("peekWallpaper()", implementingPlugins);
                mIsOverridden_peekWallpaper = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<Drawable> superCall = new CallFun0<Drawable>("peekWallpaper()") {

            @Override
            public Drawable call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().peekWallpaper(this);
                } else {
                    return getOriginal().super_peekWallpaper();
                }
            }
        };
        return superCall.call();
    }

    public void postponeEnterTransition() {
        if (!mIsOverridden_postponeEnterTransition) {
            getOriginal().super_postponeEnterTransition();
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_postponeEnterTransition < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_postponeEnterTransition++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("postponeEnterTransition()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("postponeEnterTransition");
                mMethodImplementingPlugins.put("postponeEnterTransition()", implementingPlugins);
                mIsOverridden_postponeEnterTransition = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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

    public void recreate() {
        if (!mIsOverridden_recreate) {
            getOriginal().super_recreate();
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_recreate < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_recreate++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins.get("recreate()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("recreate");
                mMethodImplementingPlugins.put("recreate()", implementingPlugins);
                mIsOverridden_recreate = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid0 superCall = new CallVoid0("recreate()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().recreate(this);
                } else {
                    getOriginal().super_recreate();
                }
            }
        };
        superCall.call();
    }

    public void registerComponentCallbacks(final ComponentCallbacks callback) {
        if (!mIsOverridden_registerComponentCallbacksCs) {
            getOriginal().super_registerComponentCallbacks(callback);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_registerComponentCallbacksCs < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_registerComponentCallbacksCs++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("registerComponentCallbacks(ComponentCallbacks)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("registerComponentCallbacks",
                        ComponentCallbacks.class);
                mMethodImplementingPlugins
                        .put("registerComponentCallbacks(ComponentCallbacks)", implementingPlugins);
                mIsOverridden_registerComponentCallbacksCs = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<ComponentCallbacks> superCall = new CallVoid1<ComponentCallbacks>(
                "registerComponentCallbacks(ComponentCallbacks)") {

            @Override
            public void call(final ComponentCallbacks callback) {
                if (iterator.hasPrevious()) {
                    iterator.previous().registerComponentCallbacks(this, callback);
                } else {
                    getOriginal().super_registerComponentCallbacks(callback);
                }
            }
        };
        superCall.call(callback);
    }

    public void registerForContextMenu(final View view) {
        if (!mIsOverridden_registerForContextMenuVw) {
            getOriginal().super_registerForContextMenu(view);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_registerForContextMenuVw < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_registerForContextMenuVw++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
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

    public Intent registerReceiver(final BroadcastReceiver receiver, final IntentFilter filter) {
        if (!mIsOverridden_registerReceiverBrIr) {
            return getOriginal().super_registerReceiver(receiver, filter);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_registerReceiverBrIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_registerReceiverBrIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("registerReceiver(BroadcastReceiver, IntentFilter)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("registerReceiver",
                        BroadcastReceiver.class, IntentFilter.class);
                mMethodImplementingPlugins.put("registerReceiver(BroadcastReceiver, IntentFilter)",
                        implementingPlugins);
                mIsOverridden_registerReceiverBrIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun2<Intent, BroadcastReceiver, IntentFilter> superCall
                = new CallFun2<Intent, BroadcastReceiver, IntentFilter>(
                "registerReceiver(BroadcastReceiver, IntentFilter)") {

            @Override
            public Intent call(final BroadcastReceiver receiver, final IntentFilter filter) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().registerReceiver(this, receiver, filter);
                } else {
                    return getOriginal().super_registerReceiver(receiver, filter);
                }
            }
        };
        return superCall.call(receiver, filter);
    }

    public Intent registerReceiver(final BroadcastReceiver receiver, final IntentFilter filter,
            final String broadcastPermission, final Handler scheduler) {
        if (!mIsOverridden_registerReceiverBrIrSgHr) {
            return getOriginal()
                    .super_registerReceiver(receiver, filter, broadcastPermission, scheduler);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_registerReceiverBrIrSgHr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_registerReceiverBrIrSgHr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("registerReceiver(BroadcastReceiver, IntentFilter, String, Handler)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("registerReceiver",
                        BroadcastReceiver.class, IntentFilter.class, String.class, Handler.class);
                mMethodImplementingPlugins
                        .put("registerReceiver(BroadcastReceiver, IntentFilter, String, Handler)",
                                implementingPlugins);
                mIsOverridden_registerReceiverBrIrSgHr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun4<Intent, BroadcastReceiver, IntentFilter, String, Handler> superCall
                = new CallFun4<Intent, BroadcastReceiver, IntentFilter, String, Handler>(
                "registerReceiver(BroadcastReceiver, IntentFilter, String, Handler)") {

            @Override
            public Intent call(final BroadcastReceiver receiver, final IntentFilter filter,
                    final String broadcastPermission, final Handler scheduler) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .registerReceiver(this, receiver, filter, broadcastPermission,
                                    scheduler);
                } else {
                    return getOriginal()
                            .super_registerReceiver(receiver, filter, broadcastPermission,
                                    scheduler);
                }
            }
        };
        return superCall.call(receiver, filter, broadcastPermission, scheduler);
    }

    public boolean releaseInstance() {
        if (!mIsOverridden_releaseInstance) {
            return getOriginal().super_releaseInstance();
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_releaseInstance < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_releaseInstance++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("releaseInstance()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("releaseInstance");
                mMethodImplementingPlugins.put("releaseInstance()", implementingPlugins);
                mIsOverridden_releaseInstance = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun0<Boolean> superCall = new CallFun0<Boolean>("releaseInstance()") {

            @Override
            public Boolean call() {
                if (iterator.hasPrevious()) {
                    return iterator.previous().releaseInstance(this);
                } else {
                    return getOriginal().super_releaseInstance();
                }
            }
        };
        return superCall.call();
    }

    public void removeStickyBroadcast(final Intent intent) {
        if (!mIsOverridden_removeStickyBroadcastIt) {
            getOriginal().super_removeStickyBroadcast(intent);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_removeStickyBroadcastIt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_removeStickyBroadcastIt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("removeStickyBroadcast(Intent)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("removeStickyBroadcast", Intent.class);
                mMethodImplementingPlugins
                        .put("removeStickyBroadcast(Intent)", implementingPlugins);
                mIsOverridden_removeStickyBroadcastIt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<Intent> superCall = new CallVoid1<Intent>("removeStickyBroadcast(Intent)") {

            @Override
            public void call(final Intent intent) {
                if (iterator.hasPrevious()) {
                    iterator.previous().removeStickyBroadcast(this, intent);
                } else {
                    getOriginal().super_removeStickyBroadcast(intent);
                }
            }
        };
        superCall.call(intent);
    }

    public void removeStickyBroadcastAsUser(final Intent intent, final UserHandle user) {
        if (!mIsOverridden_removeStickyBroadcastAsUserItUe) {
            getOriginal().super_removeStickyBroadcastAsUser(intent, user);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_removeStickyBroadcastAsUserItUe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_removeStickyBroadcastAsUserItUe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("removeStickyBroadcastAsUser(Intent, UserHandle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("removeStickyBroadcastAsUser",
                        Intent.class, UserHandle.class);
                mMethodImplementingPlugins.put("removeStickyBroadcastAsUser(Intent, UserHandle)",
                        implementingPlugins);
                mIsOverridden_removeStickyBroadcastAsUserItUe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid2<Intent, UserHandle> superCall = new CallVoid2<Intent, UserHandle>(
                "removeStickyBroadcastAsUser(Intent, UserHandle)") {

            @Override
            public void call(final Intent intent, final UserHandle user) {
                if (iterator.hasPrevious()) {
                    iterator.previous().removeStickyBroadcastAsUser(this, intent, user);
                } else {
                    getOriginal().super_removeStickyBroadcastAsUser(intent, user);
                }
            }
        };
        superCall.call(intent, user);
    }

    public void reportFullyDrawn() {
        if (!mIsOverridden_reportFullyDrawn) {
            getOriginal().super_reportFullyDrawn();
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_reportFullyDrawn < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_reportFullyDrawn++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("reportFullyDrawn()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("reportFullyDrawn");
                mMethodImplementingPlugins.put("reportFullyDrawn()", implementingPlugins);
                mIsOverridden_reportFullyDrawn = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid0 superCall = new CallVoid0("reportFullyDrawn()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().reportFullyDrawn(this);
                } else {
                    getOriginal().super_reportFullyDrawn();
                }
            }
        };
        superCall.call();
    }

    public boolean requestVisibleBehind(final boolean visible) {
        if (!mIsOverridden_requestVisibleBehindBn) {
            return getOriginal().super_requestVisibleBehind(visible);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_requestVisibleBehindBn < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_requestVisibleBehindBn++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("requestVisibleBehind(Boolean)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("requestVisibleBehind", Boolean.class);
                mMethodImplementingPlugins
                        .put("requestVisibleBehind(Boolean)", implementingPlugins);
                mIsOverridden_requestVisibleBehindBn = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<Boolean, Boolean> superCall = new CallFun1<Boolean, Boolean>(
                "requestVisibleBehind(Boolean)") {

            @Override
            public Boolean call(final Boolean visible) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().requestVisibleBehind(this, visible);
                } else {
                    return getOriginal().super_requestVisibleBehind(visible);
                }
            }
        };
        return superCall.call(visible);
    }

    public void revokeUriPermission(final Uri uri, final int modeFlags) {
        if (!mIsOverridden_revokeUriPermissionUiIr) {
            getOriginal().super_revokeUriPermission(uri, modeFlags);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_revokeUriPermissionUiIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_revokeUriPermissionUiIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("revokeUriPermission(Uri, Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("revokeUriPermission", Uri.class,
                        Integer.class);
                mMethodImplementingPlugins
                        .put("revokeUriPermission(Uri, Integer)", implementingPlugins);
                mIsOverridden_revokeUriPermissionUiIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid2<Uri, Integer> superCall = new CallVoid2<Uri, Integer>(
                "revokeUriPermission(Uri, Integer)") {

            @Override
            public void call(final Uri uri, final Integer modeFlags) {
                if (iterator.hasPrevious()) {
                    iterator.previous().revokeUriPermission(this, uri, modeFlags);
                } else {
                    getOriginal().super_revokeUriPermission(uri, modeFlags);
                }
            }
        };
        superCall.call(uri, modeFlags);
    }

    public void sendBroadcast(final Intent intent) {
        if (!mIsOverridden_sendBroadcastIt) {
            getOriginal().super_sendBroadcast(intent);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_sendBroadcastIt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_sendBroadcastIt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("sendBroadcast(Intent)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("sendBroadcast", Intent.class);
                mMethodImplementingPlugins.put("sendBroadcast(Intent)", implementingPlugins);
                mIsOverridden_sendBroadcastIt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<Intent> superCall = new CallVoid1<Intent>("sendBroadcast(Intent)") {

            @Override
            public void call(final Intent intent) {
                if (iterator.hasPrevious()) {
                    iterator.previous().sendBroadcast(this, intent);
                } else {
                    getOriginal().super_sendBroadcast(intent);
                }
            }
        };
        superCall.call(intent);
    }

    public void sendBroadcast(final Intent intent, final String receiverPermission) {
        if (!mIsOverridden_sendBroadcastItSg) {
            getOriginal().super_sendBroadcast(intent, receiverPermission);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_sendBroadcastItSg < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_sendBroadcastItSg++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("sendBroadcast(Intent, String)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("sendBroadcast", Intent.class,
                        String.class);
                mMethodImplementingPlugins
                        .put("sendBroadcast(Intent, String)", implementingPlugins);
                mIsOverridden_sendBroadcastItSg = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid2<Intent, String> superCall = new CallVoid2<Intent, String>(
                "sendBroadcast(Intent, String)") {

            @Override
            public void call(final Intent intent, final String receiverPermission) {
                if (iterator.hasPrevious()) {
                    iterator.previous().sendBroadcast(this, intent, receiverPermission);
                } else {
                    getOriginal().super_sendBroadcast(intent, receiverPermission);
                }
            }
        };
        superCall.call(intent, receiverPermission);
    }

    public void sendBroadcastAsUser(final Intent intent, final UserHandle user) {
        if (!mIsOverridden_sendBroadcastAsUserItUe) {
            getOriginal().super_sendBroadcastAsUser(intent, user);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_sendBroadcastAsUserItUe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_sendBroadcastAsUserItUe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("sendBroadcastAsUser(Intent, UserHandle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("sendBroadcastAsUser", Intent.class,
                        UserHandle.class);
                mMethodImplementingPlugins
                        .put("sendBroadcastAsUser(Intent, UserHandle)", implementingPlugins);
                mIsOverridden_sendBroadcastAsUserItUe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid2<Intent, UserHandle> superCall = new CallVoid2<Intent, UserHandle>(
                "sendBroadcastAsUser(Intent, UserHandle)") {

            @Override
            public void call(final Intent intent, final UserHandle user) {
                if (iterator.hasPrevious()) {
                    iterator.previous().sendBroadcastAsUser(this, intent, user);
                } else {
                    getOriginal().super_sendBroadcastAsUser(intent, user);
                }
            }
        };
        superCall.call(intent, user);
    }

    public void sendBroadcastAsUser(final Intent intent, final UserHandle user,
            final String receiverPermission) {
        if (!mIsOverridden_sendBroadcastAsUserItUeSg) {
            getOriginal().super_sendBroadcastAsUser(intent, user, receiverPermission);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_sendBroadcastAsUserItUeSg < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_sendBroadcastAsUserItUeSg++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("sendBroadcastAsUser(Intent, UserHandle, String)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("sendBroadcastAsUser", Intent.class,
                        UserHandle.class, String.class);
                mMethodImplementingPlugins.put("sendBroadcastAsUser(Intent, UserHandle, String)",
                        implementingPlugins);
                mIsOverridden_sendBroadcastAsUserItUeSg = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid3<Intent, UserHandle, String> superCall
                = new CallVoid3<Intent, UserHandle, String>(
                "sendBroadcastAsUser(Intent, UserHandle, String)") {

            @Override
            public void call(final Intent intent, final UserHandle user,
                    final String receiverPermission) {
                if (iterator.hasPrevious()) {
                    iterator.previous().sendBroadcastAsUser(this, intent, user, receiverPermission);
                } else {
                    getOriginal().super_sendBroadcastAsUser(intent, user, receiverPermission);
                }
            }
        };
        superCall.call(intent, user, receiverPermission);
    }

    public void sendOrderedBroadcast(final Intent intent, final String receiverPermission) {
        if (!mIsOverridden_sendOrderedBroadcastItSg) {
            getOriginal().super_sendOrderedBroadcast(intent, receiverPermission);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_sendOrderedBroadcastItSg < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_sendOrderedBroadcastItSg++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("sendOrderedBroadcast(Intent, String)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("sendOrderedBroadcast", Intent.class,
                        String.class);
                mMethodImplementingPlugins
                        .put("sendOrderedBroadcast(Intent, String)", implementingPlugins);
                mIsOverridden_sendOrderedBroadcastItSg = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid2<Intent, String> superCall = new CallVoid2<Intent, String>(
                "sendOrderedBroadcast(Intent, String)") {

            @Override
            public void call(final Intent intent, final String receiverPermission) {
                if (iterator.hasPrevious()) {
                    iterator.previous().sendOrderedBroadcast(this, intent, receiverPermission);
                } else {
                    getOriginal().super_sendOrderedBroadcast(intent, receiverPermission);
                }
            }
        };
        superCall.call(intent, receiverPermission);
    }

    public void sendOrderedBroadcast(final Intent intent, final String receiverPermission,
            final BroadcastReceiver resultReceiver, final Handler scheduler, final int initialCode,
            final String initialData, final Bundle initialExtras) {
        if (!mIsOverridden_sendOrderedBroadcastItSgBrHrIrSgBe) {
            getOriginal().super_sendOrderedBroadcast(intent, receiverPermission, resultReceiver,
                    scheduler, initialCode, initialData, initialExtras);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_sendOrderedBroadcastItSgBrHrIrSgBe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_sendOrderedBroadcastItSgBrHrIrSgBe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("sendOrderedBroadcast(Intent, String, BroadcastReceiver, Handler, Integer, String, Bundle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("sendOrderedBroadcast", Intent.class,
                        String.class, BroadcastReceiver.class, Handler.class, Integer.class,
                        String.class, Bundle.class);
                mMethodImplementingPlugins
                        .put("sendOrderedBroadcast(Intent, String, BroadcastReceiver, Handler, Integer, String, Bundle)",
                                implementingPlugins);
                mIsOverridden_sendOrderedBroadcastItSgBrHrIrSgBe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid7<Intent, String, BroadcastReceiver, Handler, Integer, String, Bundle>
                superCall
                = new CallVoid7<Intent, String, BroadcastReceiver, Handler, Integer, String, Bundle>(
                "sendOrderedBroadcast(Intent, String, BroadcastReceiver, Handler, Integer, String, Bundle)") {

            @Override
            public void call(final Intent intent, final String receiverPermission,
                    final BroadcastReceiver resultReceiver, final Handler scheduler,
                    final Integer initialCode, final String initialData,
                    final Bundle initialExtras) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .sendOrderedBroadcast(this, intent, receiverPermission, resultReceiver,
                                    scheduler, initialCode, initialData, initialExtras);
                } else {
                    getOriginal()
                            .super_sendOrderedBroadcast(intent, receiverPermission, resultReceiver,
                                    scheduler, initialCode, initialData, initialExtras);
                }
            }
        };
        superCall.call(intent, receiverPermission, resultReceiver, scheduler, initialCode,
                initialData, initialExtras);
    }

    public void sendOrderedBroadcastAsUser(final Intent intent, final UserHandle user,
            final String receiverPermission, final BroadcastReceiver resultReceiver,
            final Handler scheduler, final int initialCode, final String initialData,
            final Bundle initialExtras) {
        if (!mIsOverridden_sendOrderedBroadcastAsUserItUeSgBrHrIrSgBe) {
            getOriginal().super_sendOrderedBroadcastAsUser(intent, user, receiverPermission,
                    resultReceiver, scheduler, initialCode, initialData, initialExtras);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_sendOrderedBroadcastAsUserItUeSgBrHrIrSgBe
                < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_sendOrderedBroadcastAsUserItUeSgBrHrIrSgBe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("sendOrderedBroadcastAsUser(Intent, UserHandle, String, BroadcastReceiver, Handler, Integer, String, Bundle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("sendOrderedBroadcastAsUser",
                        Intent.class, UserHandle.class, String.class, BroadcastReceiver.class,
                        Handler.class, Integer.class, String.class, Bundle.class);
                mMethodImplementingPlugins
                        .put("sendOrderedBroadcastAsUser(Intent, UserHandle, String, BroadcastReceiver, Handler, Integer, String, Bundle)",
                                implementingPlugins);
                mIsOverridden_sendOrderedBroadcastAsUserItUeSgBrHrIrSgBe =
                        implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid8<Intent, UserHandle, String, BroadcastReceiver, Handler, Integer, String, Bundle>
                superCall
                = new CallVoid8<Intent, UserHandle, String, BroadcastReceiver, Handler, Integer, String, Bundle>(
                "sendOrderedBroadcastAsUser(Intent, UserHandle, String, BroadcastReceiver, Handler, Integer, String, Bundle)") {

            @Override
            public void call(final Intent intent, final UserHandle user,
                    final String receiverPermission, final BroadcastReceiver resultReceiver,
                    final Handler scheduler, final Integer initialCode, final String initialData,
                    final Bundle initialExtras) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .sendOrderedBroadcastAsUser(this, intent, user, receiverPermission,
                                    resultReceiver, scheduler, initialCode, initialData,
                                    initialExtras);
                } else {
                    getOriginal().super_sendOrderedBroadcastAsUser(intent, user, receiverPermission,
                            resultReceiver, scheduler, initialCode, initialData, initialExtras);
                }
            }
        };
        superCall.call(intent, user, receiverPermission, resultReceiver, scheduler, initialCode,
                initialData, initialExtras);
    }

    public void sendStickyBroadcast(final Intent intent) {
        if (!mIsOverridden_sendStickyBroadcastIt) {
            getOriginal().super_sendStickyBroadcast(intent);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_sendStickyBroadcastIt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_sendStickyBroadcastIt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("sendStickyBroadcast(Intent)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("sendStickyBroadcast", Intent.class);
                mMethodImplementingPlugins.put("sendStickyBroadcast(Intent)", implementingPlugins);
                mIsOverridden_sendStickyBroadcastIt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<Intent> superCall = new CallVoid1<Intent>("sendStickyBroadcast(Intent)") {

            @Override
            public void call(final Intent intent) {
                if (iterator.hasPrevious()) {
                    iterator.previous().sendStickyBroadcast(this, intent);
                } else {
                    getOriginal().super_sendStickyBroadcast(intent);
                }
            }
        };
        superCall.call(intent);
    }

    public void sendStickyBroadcastAsUser(final Intent intent, final UserHandle user) {
        if (!mIsOverridden_sendStickyBroadcastAsUserItUe) {
            getOriginal().super_sendStickyBroadcastAsUser(intent, user);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_sendStickyBroadcastAsUserItUe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_sendStickyBroadcastAsUserItUe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("sendStickyBroadcastAsUser(Intent, UserHandle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("sendStickyBroadcastAsUser",
                        Intent.class, UserHandle.class);
                mMethodImplementingPlugins
                        .put("sendStickyBroadcastAsUser(Intent, UserHandle)", implementingPlugins);
                mIsOverridden_sendStickyBroadcastAsUserItUe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid2<Intent, UserHandle> superCall = new CallVoid2<Intent, UserHandle>(
                "sendStickyBroadcastAsUser(Intent, UserHandle)") {

            @Override
            public void call(final Intent intent, final UserHandle user) {
                if (iterator.hasPrevious()) {
                    iterator.previous().sendStickyBroadcastAsUser(this, intent, user);
                } else {
                    getOriginal().super_sendStickyBroadcastAsUser(intent, user);
                }
            }
        };
        superCall.call(intent, user);
    }

    public void sendStickyOrderedBroadcast(final Intent intent,
            final BroadcastReceiver resultReceiver, final Handler scheduler, final int initialCode,
            final String initialData, final Bundle initialExtras) {
        if (!mIsOverridden_sendStickyOrderedBroadcastItBrHrIrSgBe) {
            getOriginal().super_sendStickyOrderedBroadcast(intent, resultReceiver, scheduler,
                    initialCode, initialData, initialExtras);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_sendStickyOrderedBroadcastItBrHrIrSgBe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_sendStickyOrderedBroadcastItBrHrIrSgBe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("sendStickyOrderedBroadcast(Intent, BroadcastReceiver, Handler, Integer, String, Bundle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("sendStickyOrderedBroadcast",
                        Intent.class, BroadcastReceiver.class, Handler.class, Integer.class,
                        String.class, Bundle.class);
                mMethodImplementingPlugins
                        .put("sendStickyOrderedBroadcast(Intent, BroadcastReceiver, Handler, Integer, String, Bundle)",
                                implementingPlugins);
                mIsOverridden_sendStickyOrderedBroadcastItBrHrIrSgBe = implementingPlugins.size()
                        > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid6<Intent, BroadcastReceiver, Handler, Integer, String, Bundle> superCall
                = new CallVoid6<Intent, BroadcastReceiver, Handler, Integer, String, Bundle>(
                "sendStickyOrderedBroadcast(Intent, BroadcastReceiver, Handler, Integer, String, Bundle)") {

            @Override
            public void call(final Intent intent, final BroadcastReceiver resultReceiver,
                    final Handler scheduler, final Integer initialCode, final String initialData,
                    final Bundle initialExtras) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .sendStickyOrderedBroadcast(this, intent, resultReceiver, scheduler,
                                    initialCode, initialData, initialExtras);
                } else {
                    getOriginal()
                            .super_sendStickyOrderedBroadcast(intent, resultReceiver, scheduler,
                                    initialCode, initialData, initialExtras);
                }
            }
        };
        superCall.call(intent, resultReceiver, scheduler, initialCode, initialData, initialExtras);
    }

    public void sendStickyOrderedBroadcastAsUser(final Intent intent, final UserHandle user,
            final BroadcastReceiver resultReceiver, final Handler scheduler, final int initialCode,
            final String initialData, final Bundle initialExtras) {
        if (!mIsOverridden_sendStickyOrderedBroadcastAsUserItUeBrHrIrSgBe) {
            getOriginal()
                    .super_sendStickyOrderedBroadcastAsUser(intent, user, resultReceiver, scheduler,
                            initialCode, initialData, initialExtras);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_sendStickyOrderedBroadcastAsUserItUeBrHrIrSgBe
                < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_sendStickyOrderedBroadcastAsUserItUeBrHrIrSgBe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("sendStickyOrderedBroadcastAsUser(Intent, UserHandle, BroadcastReceiver, Handler, Integer, String, Bundle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("sendStickyOrderedBroadcastAsUser",
                        Intent.class, UserHandle.class, BroadcastReceiver.class, Handler.class,
                        Integer.class, String.class, Bundle.class);
                mMethodImplementingPlugins
                        .put("sendStickyOrderedBroadcastAsUser(Intent, UserHandle, BroadcastReceiver, Handler, Integer, String, Bundle)",
                                implementingPlugins);
                mIsOverridden_sendStickyOrderedBroadcastAsUserItUeBrHrIrSgBe =
                        implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid7<Intent, UserHandle, BroadcastReceiver, Handler, Integer, String, Bundle>
                superCall
                = new CallVoid7<Intent, UserHandle, BroadcastReceiver, Handler, Integer, String, Bundle>(
                "sendStickyOrderedBroadcastAsUser(Intent, UserHandle, BroadcastReceiver, Handler, Integer, String, Bundle)") {

            @Override
            public void call(final Intent intent, final UserHandle user,
                    final BroadcastReceiver resultReceiver, final Handler scheduler,
                    final Integer initialCode, final String initialData,
                    final Bundle initialExtras) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .sendStickyOrderedBroadcastAsUser(this, intent, user, resultReceiver,
                                    scheduler, initialCode, initialData, initialExtras);
                } else {
                    getOriginal()
                            .super_sendStickyOrderedBroadcastAsUser(intent, user, resultReceiver,
                                    scheduler, initialCode, initialData, initialExtras);
                }
            }
        };
        superCall.call(intent, user, resultReceiver, scheduler, initialCode, initialData,
                initialExtras);
    }

    public void setActionBar(final Toolbar toolbar) {
        if (!mIsOverridden_setActionBarTr) {
            getOriginal().super_setActionBar(toolbar);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_setActionBarTr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setActionBarTr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setActionBar(Toolbar)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setActionBar", Toolbar.class);
                mMethodImplementingPlugins.put("setActionBar(Toolbar)", implementingPlugins);
                mIsOverridden_setActionBarTr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<Toolbar> superCall = new CallVoid1<Toolbar>("setActionBar(Toolbar)") {

            @Override
            public void call(final Toolbar toolbar) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setActionBar(this, toolbar);
                } else {
                    getOriginal().super_setActionBar(toolbar);
                }
            }
        };
        superCall.call(toolbar);
    }

    public void setContentTransitionManager(final TransitionManager tm) {
        if (!mIsOverridden_setContentTransitionManagerTr) {
            getOriginal().super_setContentTransitionManager(tm);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_setContentTransitionManagerTr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setContentTransitionManagerTr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setContentTransitionManager(TransitionManager)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setContentTransitionManager",
                        TransitionManager.class);
                mMethodImplementingPlugins
                        .put("setContentTransitionManager(TransitionManager)", implementingPlugins);
                mIsOverridden_setContentTransitionManagerTr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<TransitionManager> superCall = new CallVoid1<TransitionManager>(
                "setContentTransitionManager(TransitionManager)") {

            @Override
            public void call(final TransitionManager tm) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setContentTransitionManager(this, tm);
                } else {
                    getOriginal().super_setContentTransitionManager(tm);
                }
            }
        };
        superCall.call(tm);
    }

    public void setContentView(@LayoutRes final int layoutResID) {
        if (!mIsOverridden_setContentViewIr) {
            getOriginal().super_setContentView(layoutResID);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_setContentViewIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setContentViewIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setContentView(Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setContentView", Integer.class);
                mMethodImplementingPlugins.put("setContentView(Integer)", implementingPlugins);
                mIsOverridden_setContentViewIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<Integer> superCall = new CallVoid1<Integer>("setContentView(Integer)") {

            @Override
            public void call(final Integer layoutResID) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setContentView(this, layoutResID);
                } else {
                    getOriginal().super_setContentView(layoutResID);
                }
            }
        };
        superCall.call(layoutResID);
    }

    public void setContentView(final View view) {
        if (!mIsOverridden_setContentViewVw) {
            getOriginal().super_setContentView(view);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_setContentViewVw < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setContentViewVw++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setContentView(View)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setContentView", View.class);
                mMethodImplementingPlugins.put("setContentView(View)", implementingPlugins);
                mIsOverridden_setContentViewVw = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<View> superCall = new CallVoid1<View>("setContentView(View)") {

            @Override
            public void call(final View view) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setContentView(this, view);
                } else {
                    getOriginal().super_setContentView(view);
                }
            }
        };
        superCall.call(view);
    }

    public void setContentView(final View view, final ViewGroup.LayoutParams params) {
        if (!mIsOverridden_setContentViewVwVs) {
            getOriginal().super_setContentView(view, params);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_setContentViewVwVs < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setContentViewVwVs++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setContentView(View, ViewGroup.LayoutParams)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setContentView", View.class,
                        ViewGroup.LayoutParams.class);
                mMethodImplementingPlugins
                        .put("setContentView(View, ViewGroup.LayoutParams)", implementingPlugins);
                mIsOverridden_setContentViewVwVs = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid2<View, ViewGroup.LayoutParams> superCall
                = new CallVoid2<View, ViewGroup.LayoutParams>(
                "setContentView(View, ViewGroup.LayoutParams)") {

            @Override
            public void call(final View view, final ViewGroup.LayoutParams params) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setContentView(this, view, params);
                } else {
                    getOriginal().super_setContentView(view, params);
                }
            }
        };
        superCall.call(view, params);
    }

    public void setEnterSharedElementCallback(final SharedElementCallback callback) {
        if (!mIsOverridden_setEnterSharedElementCallbackSk) {
            getOriginal().super_setEnterSharedElementCallback(callback);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_setEnterSharedElementCallbackSk < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setEnterSharedElementCallbackSk++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
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

    public void setEnterSharedElementCallback(final android.app.SharedElementCallback callback) {
        if (!mIsOverridden_setEnterSharedElementCallbackak) {
            getOriginal().super_setEnterSharedElementCallback(callback);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_setEnterSharedElementCallbackak < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setEnterSharedElementCallbackak++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setEnterSharedElementCallback(android.app.SharedElementCallback)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setEnterSharedElementCallback",
                        android.app.SharedElementCallback.class);
                mMethodImplementingPlugins
                        .put("setEnterSharedElementCallback(android.app.SharedElementCallback)",
                                implementingPlugins);
                mIsOverridden_setEnterSharedElementCallbackak = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<android.app.SharedElementCallback> superCall
                = new CallVoid1<android.app.SharedElementCallback>(
                "setEnterSharedElementCallback(android.app.SharedElementCallback)") {

            @Override
            public void call(final android.app.SharedElementCallback callback) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setEnterSharedElementCallback(this, callback);
                } else {
                    getOriginal().super_setEnterSharedElementCallback(callback);
                }
            }
        };
        superCall.call(callback);
    }

    public void setExitSharedElementCallback(final SharedElementCallback listener) {
        if (!mIsOverridden_setExitSharedElementCallbackSk) {
            getOriginal().super_setExitSharedElementCallback(listener);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_setExitSharedElementCallbackSk < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setExitSharedElementCallbackSk++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
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
            public void call(final SharedElementCallback listener) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setExitSharedElementCallback(this, listener);
                } else {
                    getOriginal().super_setExitSharedElementCallback(listener);
                }
            }
        };
        superCall.call(listener);
    }

    public void setExitSharedElementCallback(final android.app.SharedElementCallback callback) {
        if (!mIsOverridden_setExitSharedElementCallbackak) {
            getOriginal().super_setExitSharedElementCallback(callback);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_setExitSharedElementCallbackak < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setExitSharedElementCallbackak++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setExitSharedElementCallback(android.app.SharedElementCallback)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setExitSharedElementCallback",
                        android.app.SharedElementCallback.class);
                mMethodImplementingPlugins
                        .put("setExitSharedElementCallback(android.app.SharedElementCallback)",
                                implementingPlugins);
                mIsOverridden_setExitSharedElementCallbackak = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<android.app.SharedElementCallback> superCall
                = new CallVoid1<android.app.SharedElementCallback>(
                "setExitSharedElementCallback(android.app.SharedElementCallback)") {

            @Override
            public void call(final android.app.SharedElementCallback callback) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setExitSharedElementCallback(this, callback);
                } else {
                    getOriginal().super_setExitSharedElementCallback(callback);
                }
            }
        };
        superCall.call(callback);
    }

    public void setFinishOnTouchOutside(final boolean finish) {
        if (!mIsOverridden_setFinishOnTouchOutsideBn) {
            getOriginal().super_setFinishOnTouchOutside(finish);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_setFinishOnTouchOutsideBn < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setFinishOnTouchOutsideBn++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setFinishOnTouchOutside(Boolean)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setFinishOnTouchOutside",
                        Boolean.class);
                mMethodImplementingPlugins
                        .put("setFinishOnTouchOutside(Boolean)", implementingPlugins);
                mIsOverridden_setFinishOnTouchOutsideBn = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<Boolean> superCall = new CallVoid1<Boolean>(
                "setFinishOnTouchOutside(Boolean)") {

            @Override
            public void call(final Boolean finish) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setFinishOnTouchOutside(this, finish);
                } else {
                    getOriginal().super_setFinishOnTouchOutside(finish);
                }
            }
        };
        superCall.call(finish);
    }

    public void setImmersive(final boolean i) {
        if (!mIsOverridden_setImmersiveBn) {
            getOriginal().super_setImmersive(i);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_setImmersiveBn < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setImmersiveBn++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setImmersive(Boolean)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setImmersive", Boolean.class);
                mMethodImplementingPlugins.put("setImmersive(Boolean)", implementingPlugins);
                mIsOverridden_setImmersiveBn = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<Boolean> superCall = new CallVoid1<Boolean>("setImmersive(Boolean)") {

            @Override
            public void call(final Boolean i) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setImmersive(this, i);
                } else {
                    getOriginal().super_setImmersive(i);
                }
            }
        };
        superCall.call(i);
    }

    public void setIntent(final Intent newIntent) {
        if (!mIsOverridden_setIntentIt) {
            getOriginal().super_setIntent(newIntent);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_setIntentIt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setIntentIt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setIntent(Intent)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setIntent", Intent.class);
                mMethodImplementingPlugins.put("setIntent(Intent)", implementingPlugins);
                mIsOverridden_setIntentIt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<Intent> superCall = new CallVoid1<Intent>("setIntent(Intent)") {

            @Override
            public void call(final Intent newIntent) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setIntent(this, newIntent);
                } else {
                    getOriginal().super_setIntent(newIntent);
                }
            }
        };
        superCall.call(newIntent);
    }

    public void setRequestedOrientation(final int requestedOrientation) {
        if (!mIsOverridden_setRequestedOrientationIr) {
            getOriginal().super_setRequestedOrientation(requestedOrientation);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_setRequestedOrientationIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setRequestedOrientationIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setRequestedOrientation(Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setRequestedOrientation",
                        Integer.class);
                mMethodImplementingPlugins
                        .put("setRequestedOrientation(Integer)", implementingPlugins);
                mIsOverridden_setRequestedOrientationIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<Integer> superCall = new CallVoid1<Integer>(
                "setRequestedOrientation(Integer)") {

            @Override
            public void call(final Integer requestedOrientation) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setRequestedOrientation(this, requestedOrientation);
                } else {
                    getOriginal().super_setRequestedOrientation(requestedOrientation);
                }
            }
        };
        superCall.call(requestedOrientation);
    }

    public void setSupportActionBar(@Nullable final android.support.v7.widget.Toolbar toolbar) {
        if (!mIsOverridden_setSupportActionBarar) {
            getOriginal().super_setSupportActionBar(toolbar);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_setSupportActionBarar < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setSupportActionBarar++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setSupportActionBar(android.support.v7.widget.Toolbar)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setSupportActionBar",
                        android.support.v7.widget.Toolbar.class);
                mMethodImplementingPlugins
                        .put("setSupportActionBar(android.support.v7.widget.Toolbar)",
                                implementingPlugins);
                mIsOverridden_setSupportActionBarar = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<android.support.v7.widget.Toolbar> superCall
                = new CallVoid1<android.support.v7.widget.Toolbar>(
                "setSupportActionBar(android.support.v7.widget.Toolbar)") {

            @Override
            public void call(final android.support.v7.widget.Toolbar toolbar) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setSupportActionBar(this, toolbar);
                } else {
                    getOriginal().super_setSupportActionBar(toolbar);
                }
            }
        };
        superCall.call(toolbar);
    }

    public void setSupportProgress(final int progress) {
        if (!mIsOverridden_setSupportProgressIr) {
            getOriginal().super_setSupportProgress(progress);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_setSupportProgressIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setSupportProgressIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setSupportProgress(Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setSupportProgress", Integer.class);
                mMethodImplementingPlugins.put("setSupportProgress(Integer)", implementingPlugins);
                mIsOverridden_setSupportProgressIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<Integer> superCall = new CallVoid1<Integer>("setSupportProgress(Integer)") {

            @Override
            public void call(final Integer progress) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setSupportProgress(this, progress);
                } else {
                    getOriginal().super_setSupportProgress(progress);
                }
            }
        };
        superCall.call(progress);
    }

    public void setSupportProgressBarIndeterminate(final boolean indeterminate) {
        if (!mIsOverridden_setSupportProgressBarIndeterminateBn) {
            getOriginal().super_setSupportProgressBarIndeterminate(indeterminate);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_setSupportProgressBarIndeterminateBn < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setSupportProgressBarIndeterminateBn++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setSupportProgressBarIndeterminate(Boolean)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setSupportProgressBarIndeterminate",
                        Boolean.class);
                mMethodImplementingPlugins
                        .put("setSupportProgressBarIndeterminate(Boolean)", implementingPlugins);
                mIsOverridden_setSupportProgressBarIndeterminateBn = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<Boolean> superCall = new CallVoid1<Boolean>(
                "setSupportProgressBarIndeterminate(Boolean)") {

            @Override
            public void call(final Boolean indeterminate) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setSupportProgressBarIndeterminate(this, indeterminate);
                } else {
                    getOriginal().super_setSupportProgressBarIndeterminate(indeterminate);
                }
            }
        };
        superCall.call(indeterminate);
    }

    public void setSupportProgressBarIndeterminateVisibility(final boolean visible) {
        if (!mIsOverridden_setSupportProgressBarIndeterminateVisibilityBn) {
            getOriginal().super_setSupportProgressBarIndeterminateVisibility(visible);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_setSupportProgressBarIndeterminateVisibilityBn
                < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setSupportProgressBarIndeterminateVisibilityBn++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setSupportProgressBarIndeterminateVisibility(Boolean)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins(
                        "setSupportProgressBarIndeterminateVisibility", Boolean.class);
                mMethodImplementingPlugins
                        .put("setSupportProgressBarIndeterminateVisibility(Boolean)",
                                implementingPlugins);
                mIsOverridden_setSupportProgressBarIndeterminateVisibilityBn =
                        implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<Boolean> superCall = new CallVoid1<Boolean>(
                "setSupportProgressBarIndeterminateVisibility(Boolean)") {

            @Override
            public void call(final Boolean visible) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setSupportProgressBarIndeterminateVisibility(this, visible);
                } else {
                    getOriginal().super_setSupportProgressBarIndeterminateVisibility(visible);
                }
            }
        };
        superCall.call(visible);
    }

    public void setSupportProgressBarVisibility(final boolean visible) {
        if (!mIsOverridden_setSupportProgressBarVisibilityBn) {
            getOriginal().super_setSupportProgressBarVisibility(visible);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_setSupportProgressBarVisibilityBn < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setSupportProgressBarVisibilityBn++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setSupportProgressBarVisibility(Boolean)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setSupportProgressBarVisibility",
                        Boolean.class);
                mMethodImplementingPlugins
                        .put("setSupportProgressBarVisibility(Boolean)", implementingPlugins);
                mIsOverridden_setSupportProgressBarVisibilityBn = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<Boolean> superCall = new CallVoid1<Boolean>(
                "setSupportProgressBarVisibility(Boolean)") {

            @Override
            public void call(final Boolean visible) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setSupportProgressBarVisibility(this, visible);
                } else {
                    getOriginal().super_setSupportProgressBarVisibility(visible);
                }
            }
        };
        superCall.call(visible);
    }

    public void setTaskDescription(final ActivityManager.TaskDescription taskDescription) {
        if (!mIsOverridden_setTaskDescriptionAn) {
            getOriginal().super_setTaskDescription(taskDescription);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_setTaskDescriptionAn < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setTaskDescriptionAn++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setTaskDescription(ActivityManager.TaskDescription)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setTaskDescription",
                        ActivityManager.TaskDescription.class);
                mMethodImplementingPlugins
                        .put("setTaskDescription(ActivityManager.TaskDescription)",
                                implementingPlugins);
                mIsOverridden_setTaskDescriptionAn = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<ActivityManager.TaskDescription> superCall
                = new CallVoid1<ActivityManager.TaskDescription>(
                "setTaskDescription(ActivityManager.TaskDescription)") {

            @Override
            public void call(final ActivityManager.TaskDescription taskDescription) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setTaskDescription(this, taskDescription);
                } else {
                    getOriginal().super_setTaskDescription(taskDescription);
                }
            }
        };
        superCall.call(taskDescription);
    }

    public void setTheme(@StyleRes final int resid) {
        if (!mIsOverridden_setThemeIr) {
            getOriginal().super_setTheme(resid);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_setThemeIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setThemeIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setTheme(Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setTheme", Integer.class);
                mMethodImplementingPlugins.put("setTheme(Integer)", implementingPlugins);
                mIsOverridden_setThemeIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<Integer> superCall = new CallVoid1<Integer>("setTheme(Integer)") {

            @Override
            public void call(final Integer resid) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setTheme(this, resid);
                } else {
                    getOriginal().super_setTheme(resid);
                }
            }
        };
        superCall.call(resid);
    }

    public void setTitle(final CharSequence title) {
        if (!mIsOverridden_setTitleCe) {
            getOriginal().super_setTitle(title);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_setTitleCe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setTitleCe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setTitle(CharSequence)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setTitle", CharSequence.class);
                mMethodImplementingPlugins.put("setTitle(CharSequence)", implementingPlugins);
                mIsOverridden_setTitleCe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<CharSequence> superCall = new CallVoid1<CharSequence>(
                "setTitle(CharSequence)") {

            @Override
            public void call(final CharSequence title) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setTitle(this, title);
                } else {
                    getOriginal().super_setTitle(title);
                }
            }
        };
        superCall.call(title);
    }

    public void setTitle(final int titleId) {
        if (!mIsOverridden_setTitleIr) {
            getOriginal().super_setTitle(titleId);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_setTitleIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setTitleIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setTitle(Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setTitle", Integer.class);
                mMethodImplementingPlugins.put("setTitle(Integer)", implementingPlugins);
                mIsOverridden_setTitleIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<Integer> superCall = new CallVoid1<Integer>("setTitle(Integer)") {

            @Override
            public void call(final Integer titleId) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setTitle(this, titleId);
                } else {
                    getOriginal().super_setTitle(titleId);
                }
            }
        };
        superCall.call(titleId);
    }

    public void setTitleColor(final int textColor) {
        if (!mIsOverridden_setTitleColorIr) {
            getOriginal().super_setTitleColor(textColor);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_setTitleColorIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setTitleColorIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setTitleColor(Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setTitleColor", Integer.class);
                mMethodImplementingPlugins.put("setTitleColor(Integer)", implementingPlugins);
                mIsOverridden_setTitleColorIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<Integer> superCall = new CallVoid1<Integer>("setTitleColor(Integer)") {

            @Override
            public void call(final Integer textColor) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setTitleColor(this, textColor);
                } else {
                    getOriginal().super_setTitleColor(textColor);
                }
            }
        };
        superCall.call(textColor);
    }

    public void setVisible(final boolean visible) {
        if (!mIsOverridden_setVisibleBn) {
            getOriginal().super_setVisible(visible);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_setVisibleBn < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setVisibleBn++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setVisible(Boolean)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setVisible", Boolean.class);
                mMethodImplementingPlugins.put("setVisible(Boolean)", implementingPlugins);
                mIsOverridden_setVisibleBn = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<Boolean> superCall = new CallVoid1<Boolean>("setVisible(Boolean)") {

            @Override
            public void call(final Boolean visible) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setVisible(this, visible);
                } else {
                    getOriginal().super_setVisible(visible);
                }
            }
        };
        superCall.call(visible);
    }

    public void setWallpaper(final Bitmap bitmap) throws IOException {
        if (!mIsOverridden_setWallpaperBp) {
            getOriginal().super_setWallpaper(bitmap);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_setWallpaperBp < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setWallpaperBp++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setWallpaper(Bitmap)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setWallpaper", Bitmap.class);
                mMethodImplementingPlugins.put("setWallpaper(Bitmap)", implementingPlugins);
                mIsOverridden_setWallpaperBp = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<Bitmap> superCall = new CallVoid1<Bitmap>("setWallpaper(Bitmap)") {

            @Override
            public void call(final Bitmap bitmap) {
                if (iterator.hasPrevious()) {
                    try {
                        iterator.previous().setWallpaper(this, bitmap);
                    } catch (IOException e) {
                        throw new SuppressedException(e);
                    }
                } else {
                    try {
                        getOriginal().super_setWallpaper(bitmap);
                    } catch (IOException e) {
                        throw new SuppressedException(e);
                    }
                }
            }
        };
        superCall.call(bitmap);
    }

    public void setWallpaper(final InputStream data) throws IOException {
        if (!mIsOverridden_setWallpaperIm) {
            getOriginal().super_setWallpaper(data);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_setWallpaperIm < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_setWallpaperIm++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("setWallpaper(InputStream)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("setWallpaper", InputStream.class);
                mMethodImplementingPlugins.put("setWallpaper(InputStream)", implementingPlugins);
                mIsOverridden_setWallpaperIm = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<InputStream> superCall = new CallVoid1<InputStream>(
                "setWallpaper(InputStream)") {

            @Override
            public void call(final InputStream data) {
                if (iterator.hasPrevious()) {
                    try {
                        iterator.previous().setWallpaper(this, data);
                    } catch (IOException e) {
                        throw new SuppressedException(e);
                    }
                } else {
                    try {
                        getOriginal().super_setWallpaper(data);
                    } catch (IOException e) {
                        throw new SuppressedException(e);
                    }
                }
            }
        };
        superCall.call(data);
    }

    public boolean shouldShowRequestPermissionRationale(final String permission) {
        if (!mIsOverridden_shouldShowRequestPermissionRationaleSg) {
            return getOriginal().super_shouldShowRequestPermissionRationale(permission);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_shouldShowRequestPermissionRationaleSg < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_shouldShowRequestPermissionRationaleSg++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
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

    public boolean shouldUpRecreateTask(final Intent targetIntent) {
        if (!mIsOverridden_shouldUpRecreateTaskIt) {
            return getOriginal().super_shouldUpRecreateTask(targetIntent);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_shouldUpRecreateTaskIt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_shouldUpRecreateTaskIt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("shouldUpRecreateTask(Intent)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("shouldUpRecreateTask", Intent.class);
                mMethodImplementingPlugins.put("shouldUpRecreateTask(Intent)", implementingPlugins);
                mIsOverridden_shouldUpRecreateTaskIt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<Boolean, Intent> superCall = new CallFun1<Boolean, Intent>(
                "shouldUpRecreateTask(Intent)") {

            @Override
            public Boolean call(final Intent targetIntent) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().shouldUpRecreateTask(this, targetIntent);
                } else {
                    return getOriginal().super_shouldUpRecreateTask(targetIntent);
                }
            }
        };
        return superCall.call(targetIntent);
    }

    public boolean showAssist(final Bundle args) {
        if (!mIsOverridden_showAssistBe) {
            return getOriginal().super_showAssist(args);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_showAssistBe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_showAssistBe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("showAssist(Bundle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("showAssist", Bundle.class);
                mMethodImplementingPlugins.put("showAssist(Bundle)", implementingPlugins);
                mIsOverridden_showAssistBe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<Boolean, Bundle> superCall = new CallFun1<Boolean, Bundle>(
                "showAssist(Bundle)") {

            @Override
            public Boolean call(final Bundle args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().showAssist(this, args);
                } else {
                    return getOriginal().super_showAssist(args);
                }
            }
        };
        return superCall.call(args);
    }

    public void showLockTaskEscapeMessage() {
        if (!mIsOverridden_showLockTaskEscapeMessage) {
            getOriginal().super_showLockTaskEscapeMessage();
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_showLockTaskEscapeMessage < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_showLockTaskEscapeMessage++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("showLockTaskEscapeMessage()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("showLockTaskEscapeMessage");
                mMethodImplementingPlugins.put("showLockTaskEscapeMessage()", implementingPlugins);
                mIsOverridden_showLockTaskEscapeMessage = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid0 superCall = new CallVoid0("showLockTaskEscapeMessage()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().showLockTaskEscapeMessage(this);
                } else {
                    getOriginal().super_showLockTaskEscapeMessage();
                }
            }
        };
        superCall.call();
    }

    public android.view.ActionMode startActionMode(
            final android.view.ActionMode.Callback callback) {
        if (!mIsOverridden_startActionModeak) {
            return getOriginal().super_startActionMode(callback);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_startActionModeak < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_startActionModeak++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("startActionMode(android.view.ActionMode.Callback)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("startActionMode",
                        android.view.ActionMode.Callback.class);
                mMethodImplementingPlugins.put("startActionMode(android.view.ActionMode.Callback)",
                        implementingPlugins);
                mIsOverridden_startActionModeak = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<android.view.ActionMode, android.view.ActionMode.Callback> superCall
                = new CallFun1<android.view.ActionMode, android.view.ActionMode.Callback>(
                "startActionMode(android.view.ActionMode.Callback)") {

            @Override
            public android.view.ActionMode call(final android.view.ActionMode.Callback callback) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().startActionMode(this, callback);
                } else {
                    return getOriginal().super_startActionMode(callback);
                }
            }
        };
        return superCall.call(callback);
    }

    public android.view.ActionMode startActionMode(final android.view.ActionMode.Callback callback,
            final int type) {
        if (!mIsOverridden_startActionModeakIr) {
            return getOriginal().super_startActionMode(callback, type);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_startActionModeakIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_startActionModeakIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("startActionMode(android.view.ActionMode.Callback, Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("startActionMode",
                        android.view.ActionMode.Callback.class, Integer.class);
                mMethodImplementingPlugins
                        .put("startActionMode(android.view.ActionMode.Callback, Integer)",
                                implementingPlugins);
                mIsOverridden_startActionModeakIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun2<android.view.ActionMode, android.view.ActionMode.Callback, Integer> superCall
                = new CallFun2<android.view.ActionMode, android.view.ActionMode.Callback, Integer>(
                "startActionMode(android.view.ActionMode.Callback, Integer)") {

            @Override
            public android.view.ActionMode call(final android.view.ActionMode.Callback callback,
                    final Integer type) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().startActionMode(this, callback, type);
                } else {
                    return getOriginal().super_startActionMode(callback, type);
                }
            }
        };
        return superCall.call(callback, type);
    }

    public void startActivities(final Intent[] intents) {
        if (!mIsOverridden_startActivitiesIt) {
            getOriginal().super_startActivities(intents);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_startActivitiesIt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_startActivitiesIt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("startActivities(Intent[])");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("startActivities", Intent[].class);
                mMethodImplementingPlugins.put("startActivities(Intent[])", implementingPlugins);
                mIsOverridden_startActivitiesIt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<Intent[]> superCall = new CallVoid1<Intent[]>("startActivities(Intent[])") {

            @Override
            public void call(final Intent[] intents) {
                if (iterator.hasPrevious()) {
                    iterator.previous().startActivities(this, intents);
                } else {
                    getOriginal().super_startActivities(intents);
                }
            }
        };
        superCall.call(intents);
    }

    public void startActivities(final Intent[] intents, final Bundle options) {
        if (!mIsOverridden_startActivitiesItBe) {
            getOriginal().super_startActivities(intents, options);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_startActivitiesItBe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_startActivitiesItBe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("startActivities(Intent[], Bundle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("startActivities", Intent[].class,
                        Bundle.class);
                mMethodImplementingPlugins
                        .put("startActivities(Intent[], Bundle)", implementingPlugins);
                mIsOverridden_startActivitiesItBe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid2<Intent[], Bundle> superCall = new CallVoid2<Intent[], Bundle>(
                "startActivities(Intent[], Bundle)") {

            @Override
            public void call(final Intent[] intents, final Bundle options) {
                if (iterator.hasPrevious()) {
                    iterator.previous().startActivities(this, intents, options);
                } else {
                    getOriginal().super_startActivities(intents, options);
                }
            }
        };
        superCall.call(intents, options);
    }

    public void startActivity(final Intent intent) {
        if (!mIsOverridden_startActivityIt) {
            getOriginal().super_startActivity(intent);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_startActivityIt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_startActivityIt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
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

    public void startActivity(final Intent intent, final Bundle options) {
        if (!mIsOverridden_startActivityItBe) {
            getOriginal().super_startActivity(intent, options);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_startActivityItBe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_startActivityItBe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
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

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_startActivityForResultItIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_startActivityForResultItIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
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

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_startActivityForResultItIrBe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_startActivityForResultItIrBe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
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

    public void startActivityFromChild(final Activity child, final Intent intent,
            final int requestCode) {
        if (!mIsOverridden_startActivityFromChildAyItIr) {
            getOriginal().super_startActivityFromChild(child, intent, requestCode);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_startActivityFromChildAyItIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_startActivityFromChildAyItIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("startActivityFromChild(Activity, Intent, Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("startActivityFromChild",
                        Activity.class, Intent.class, Integer.class);
                mMethodImplementingPlugins.put("startActivityFromChild(Activity, Intent, Integer)",
                        implementingPlugins);
                mIsOverridden_startActivityFromChildAyItIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid3<Activity, Intent, Integer> superCall
                = new CallVoid3<Activity, Intent, Integer>(
                "startActivityFromChild(Activity, Intent, Integer)") {

            @Override
            public void call(final Activity child, final Intent intent, final Integer requestCode) {
                if (iterator.hasPrevious()) {
                    iterator.previous().startActivityFromChild(this, child, intent, requestCode);
                } else {
                    getOriginal().super_startActivityFromChild(child, intent, requestCode);
                }
            }
        };
        superCall.call(child, intent, requestCode);
    }

    public void startActivityFromChild(final Activity child, final Intent intent,
            final int requestCode, final Bundle options) {
        if (!mIsOverridden_startActivityFromChildAyItIrBe) {
            getOriginal().super_startActivityFromChild(child, intent, requestCode, options);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_startActivityFromChildAyItIrBe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_startActivityFromChildAyItIrBe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("startActivityFromChild(Activity, Intent, Integer, Bundle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("startActivityFromChild",
                        Activity.class, Intent.class, Integer.class, Bundle.class);
                mMethodImplementingPlugins
                        .put("startActivityFromChild(Activity, Intent, Integer, Bundle)",
                                implementingPlugins);
                mIsOverridden_startActivityFromChildAyItIrBe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid4<Activity, Intent, Integer, Bundle> superCall
                = new CallVoid4<Activity, Intent, Integer, Bundle>(
                "startActivityFromChild(Activity, Intent, Integer, Bundle)") {

            @Override
            public void call(final Activity child, final Intent intent, final Integer requestCode,
                    final Bundle options) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .startActivityFromChild(this, child, intent, requestCode, options);
                } else {
                    getOriginal().super_startActivityFromChild(child, intent, requestCode, options);
                }
            }
        };
        superCall.call(child, intent, requestCode, options);
    }

    public void startActivityFromFragment(final Fragment fragment, final Intent intent,
            final int requestCode) {
        if (!mIsOverridden_startActivityFromFragmentFtItIr) {
            getOriginal().super_startActivityFromFragment(fragment, intent, requestCode);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_startActivityFromFragmentFtItIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_startActivityFromFragmentFtItIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("startActivityFromFragment(Fragment, Intent, Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("startActivityFromFragment",
                        Fragment.class, Intent.class, Integer.class);
                mMethodImplementingPlugins
                        .put("startActivityFromFragment(Fragment, Intent, Integer)",
                                implementingPlugins);
                mIsOverridden_startActivityFromFragmentFtItIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid3<Fragment, Intent, Integer> superCall
                = new CallVoid3<Fragment, Intent, Integer>(
                "startActivityFromFragment(Fragment, Intent, Integer)") {

            @Override
            public void call(final Fragment fragment, final Intent intent,
                    final Integer requestCode) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .startActivityFromFragment(this, fragment, intent, requestCode);
                } else {
                    getOriginal().super_startActivityFromFragment(fragment, intent, requestCode);
                }
            }
        };
        superCall.call(fragment, intent, requestCode);
    }

    public void startActivityFromFragment(final Fragment fragment, final Intent intent,
            final int requestCode, @Nullable final Bundle options) {
        if (!mIsOverridden_startActivityFromFragmentFtItIrBe) {
            getOriginal().super_startActivityFromFragment(fragment, intent, requestCode, options);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_startActivityFromFragmentFtItIrBe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_startActivityFromFragmentFtItIrBe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("startActivityFromFragment(Fragment, Intent, Integer, Bundle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("startActivityFromFragment",
                        Fragment.class, Intent.class, Integer.class, Bundle.class);
                mMethodImplementingPlugins
                        .put("startActivityFromFragment(Fragment, Intent, Integer, Bundle)",
                                implementingPlugins);
                mIsOverridden_startActivityFromFragmentFtItIrBe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid4<Fragment, Intent, Integer, Bundle> superCall
                = new CallVoid4<Fragment, Intent, Integer, Bundle>(
                "startActivityFromFragment(Fragment, Intent, Integer, Bundle)") {

            @Override
            public void call(final Fragment fragment, final Intent intent,
                    final Integer requestCode, final Bundle options) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .startActivityFromFragment(this, fragment, intent, requestCode,
                                    options);
                } else {
                    getOriginal().super_startActivityFromFragment(fragment, intent, requestCode,
                            options);
                }
            }
        };
        superCall.call(fragment, intent, requestCode, options);
    }

    public void startActivityFromFragment(final android.app.Fragment fragment, final Intent intent,
            final int requestCode) {
        if (!mIsOverridden_startActivityFromFragmentatItIr) {
            getOriginal().super_startActivityFromFragment(fragment, intent, requestCode);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_startActivityFromFragmentatItIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_startActivityFromFragmentatItIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("startActivityFromFragment(android.app.Fragment, Intent, Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("startActivityFromFragment",
                        android.app.Fragment.class, Intent.class, Integer.class);
                mMethodImplementingPlugins
                        .put("startActivityFromFragment(android.app.Fragment, Intent, Integer)",
                                implementingPlugins);
                mIsOverridden_startActivityFromFragmentatItIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid3<android.app.Fragment, Intent, Integer> superCall
                = new CallVoid3<android.app.Fragment, Intent, Integer>(
                "startActivityFromFragment(android.app.Fragment, Intent, Integer)") {

            @Override
            public void call(final android.app.Fragment fragment, final Intent intent,
                    final Integer requestCode) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .startActivityFromFragment(this, fragment, intent, requestCode);
                } else {
                    getOriginal().super_startActivityFromFragment(fragment, intent, requestCode);
                }
            }
        };
        superCall.call(fragment, intent, requestCode);
    }

    public void startActivityFromFragment(final android.app.Fragment fragment, final Intent intent,
            final int requestCode, final Bundle options) {
        if (!mIsOverridden_startActivityFromFragmentatItIrBe) {
            getOriginal().super_startActivityFromFragment(fragment, intent, requestCode, options);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_startActivityFromFragmentatItIrBe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_startActivityFromFragmentatItIrBe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("startActivityFromFragment(android.app.Fragment, Intent, Integer, Bundle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("startActivityFromFragment",
                        android.app.Fragment.class, Intent.class, Integer.class, Bundle.class);
                mMethodImplementingPlugins
                        .put("startActivityFromFragment(android.app.Fragment, Intent, Integer, Bundle)",
                                implementingPlugins);
                mIsOverridden_startActivityFromFragmentatItIrBe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid4<android.app.Fragment, Intent, Integer, Bundle> superCall
                = new CallVoid4<android.app.Fragment, Intent, Integer, Bundle>(
                "startActivityFromFragment(android.app.Fragment, Intent, Integer, Bundle)") {

            @Override
            public void call(final android.app.Fragment fragment, final Intent intent,
                    final Integer requestCode, final Bundle options) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .startActivityFromFragment(this, fragment, intent, requestCode,
                                    options);
                } else {
                    getOriginal().super_startActivityFromFragment(fragment, intent, requestCode,
                            options);
                }
            }
        };
        superCall.call(fragment, intent, requestCode, options);
    }

    public boolean startActivityIfNeeded(final Intent intent, final int requestCode) {
        if (!mIsOverridden_startActivityIfNeededItIr) {
            return getOriginal().super_startActivityIfNeeded(intent, requestCode);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_startActivityIfNeededItIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_startActivityIfNeededItIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("startActivityIfNeeded(Intent, Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("startActivityIfNeeded", Intent.class,
                        Integer.class);
                mMethodImplementingPlugins
                        .put("startActivityIfNeeded(Intent, Integer)", implementingPlugins);
                mIsOverridden_startActivityIfNeededItIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun2<Boolean, Intent, Integer> superCall = new CallFun2<Boolean, Intent, Integer>(
                "startActivityIfNeeded(Intent, Integer)") {

            @Override
            public Boolean call(final Intent intent, final Integer requestCode) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().startActivityIfNeeded(this, intent, requestCode);
                } else {
                    return getOriginal().super_startActivityIfNeeded(intent, requestCode);
                }
            }
        };
        return superCall.call(intent, requestCode);
    }

    public boolean startActivityIfNeeded(final Intent intent, final int requestCode,
            final Bundle options) {
        if (!mIsOverridden_startActivityIfNeededItIrBe) {
            return getOriginal().super_startActivityIfNeeded(intent, requestCode, options);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_startActivityIfNeededItIrBe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_startActivityIfNeededItIrBe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("startActivityIfNeeded(Intent, Integer, Bundle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("startActivityIfNeeded", Intent.class,
                        Integer.class, Bundle.class);
                mMethodImplementingPlugins
                        .put("startActivityIfNeeded(Intent, Integer, Bundle)", implementingPlugins);
                mIsOverridden_startActivityIfNeededItIrBe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun3<Boolean, Intent, Integer, Bundle> superCall
                = new CallFun3<Boolean, Intent, Integer, Bundle>(
                "startActivityIfNeeded(Intent, Integer, Bundle)") {

            @Override
            public Boolean call(final Intent intent, final Integer requestCode,
                    final Bundle options) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .startActivityIfNeeded(this, intent, requestCode, options);
                } else {
                    return getOriginal().super_startActivityIfNeeded(intent, requestCode, options);
                }
            }
        };
        return superCall.call(intent, requestCode, options);
    }

    public boolean startInstrumentation(final ComponentName className, final String profileFile,
            final Bundle arguments) {
        if (!mIsOverridden_startInstrumentationCeSgBe) {
            return getOriginal().super_startInstrumentation(className, profileFile, arguments);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_startInstrumentationCeSgBe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_startInstrumentationCeSgBe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("startInstrumentation(ComponentName, String, Bundle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("startInstrumentation",
                        ComponentName.class, String.class, Bundle.class);
                mMethodImplementingPlugins
                        .put("startInstrumentation(ComponentName, String, Bundle)",
                                implementingPlugins);
                mIsOverridden_startInstrumentationCeSgBe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun3<Boolean, ComponentName, String, Bundle> superCall
                = new CallFun3<Boolean, ComponentName, String, Bundle>(
                "startInstrumentation(ComponentName, String, Bundle)") {

            @Override
            public Boolean call(final ComponentName className, final String profileFile,
                    final Bundle arguments) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .startInstrumentation(this, className, profileFile, arguments);
                } else {
                    return getOriginal()
                            .super_startInstrumentation(className, profileFile, arguments);
                }
            }
        };
        return superCall.call(className, profileFile, arguments);
    }

    public void startIntentSender(final IntentSender intent, final Intent fillInIntent,
            final int flagsMask, final int flagsValues, final int extraFlags)
            throws IntentSender.SendIntentException {
        if (!mIsOverridden_startIntentSenderIrItIrIrIr) {
            getOriginal().super_startIntentSender(intent, fillInIntent, flagsMask, flagsValues,
                    extraFlags);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_startIntentSenderIrItIrIrIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_startIntentSenderIrItIrIrIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("startIntentSender(IntentSender, Intent, Integer, Integer, Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("startIntentSender",
                        IntentSender.class, Intent.class, Integer.class, Integer.class,
                        Integer.class);
                mMethodImplementingPlugins
                        .put("startIntentSender(IntentSender, Intent, Integer, Integer, Integer)",
                                implementingPlugins);
                mIsOverridden_startIntentSenderIrItIrIrIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid5<IntentSender, Intent, Integer, Integer, Integer> superCall
                = new CallVoid5<IntentSender, Intent, Integer, Integer, Integer>(
                "startIntentSender(IntentSender, Intent, Integer, Integer, Integer)") {

            @Override
            public void call(final IntentSender intent, final Intent fillInIntent,
                    final Integer flagsMask, final Integer flagsValues, final Integer extraFlags) {
                if (iterator.hasPrevious()) {
                    try {
                        iterator.previous().startIntentSender(this, intent, fillInIntent, flagsMask,
                                flagsValues, extraFlags);
                    } catch (IntentSender.SendIntentException e) {
                        throw new SuppressedException(e);
                    }
                } else {
                    try {
                        getOriginal().super_startIntentSender(intent, fillInIntent, flagsMask,
                                flagsValues, extraFlags);
                    } catch (IntentSender.SendIntentException e) {
                        throw new SuppressedException(e);
                    }
                }
            }
        };
        superCall.call(intent, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    public void startIntentSender(final IntentSender intent, final Intent fillInIntent,
            final int flagsMask, final int flagsValues, final int extraFlags, final Bundle options)
            throws IntentSender.SendIntentException {
        if (!mIsOverridden_startIntentSenderIrItIrIrIrBe) {
            getOriginal().super_startIntentSender(intent, fillInIntent, flagsMask, flagsValues,
                    extraFlags, options);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_startIntentSenderIrItIrIrIrBe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_startIntentSenderIrItIrIrIrBe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("startIntentSender(IntentSender, Intent, Integer, Integer, Integer, Bundle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("startIntentSender",
                        IntentSender.class, Intent.class, Integer.class, Integer.class,
                        Integer.class, Bundle.class);
                mMethodImplementingPlugins
                        .put("startIntentSender(IntentSender, Intent, Integer, Integer, Integer, Bundle)",
                                implementingPlugins);
                mIsOverridden_startIntentSenderIrItIrIrIrBe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid6<IntentSender, Intent, Integer, Integer, Integer, Bundle> superCall
                = new CallVoid6<IntentSender, Intent, Integer, Integer, Integer, Bundle>(
                "startIntentSender(IntentSender, Intent, Integer, Integer, Integer, Bundle)") {

            @Override
            public void call(final IntentSender intent, final Intent fillInIntent,
                    final Integer flagsMask, final Integer flagsValues, final Integer extraFlags,
                    final Bundle options) {
                if (iterator.hasPrevious()) {
                    try {
                        iterator.previous().startIntentSender(this, intent, fillInIntent, flagsMask,
                                flagsValues, extraFlags, options);
                    } catch (IntentSender.SendIntentException e) {
                        throw new SuppressedException(e);
                    }
                } else {
                    try {
                        getOriginal().super_startIntentSender(intent, fillInIntent, flagsMask,
                                flagsValues, extraFlags, options);
                    } catch (IntentSender.SendIntentException e) {
                        throw new SuppressedException(e);
                    }
                }
            }
        };
        superCall.call(intent, fillInIntent, flagsMask, flagsValues, extraFlags, options);
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

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_startIntentSenderForResultIrIrItIrIrIrBe
                < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_startIntentSenderForResultIrIrItIrIrIrBe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
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

    public void startIntentSenderForResult(final IntentSender intent, final int requestCode,
            @Nullable final Intent fillInIntent, final int flagsMask, final int flagsValues,
            final int extraFlags) throws IntentSender.SendIntentException {
        if (!mIsOverridden_startIntentSenderForResultIrIrItIrIrIr) {
            getOriginal()
                    .super_startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask,
                            flagsValues, extraFlags);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_startIntentSenderForResultIrIrItIrIrIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_startIntentSenderForResultIrIrItIrIrIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("startIntentSenderForResult(IntentSender, Integer, Intent, Integer, Integer, Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("startIntentSenderForResult",
                        IntentSender.class, Integer.class, Intent.class, Integer.class,
                        Integer.class, Integer.class);
                mMethodImplementingPlugins
                        .put("startIntentSenderForResult(IntentSender, Integer, Intent, Integer, Integer, Integer)",
                                implementingPlugins);
                mIsOverridden_startIntentSenderForResultIrIrItIrIrIr = implementingPlugins.size()
                        > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid6<IntentSender, Integer, Intent, Integer, Integer, Integer> superCall
                = new CallVoid6<IntentSender, Integer, Intent, Integer, Integer, Integer>(
                "startIntentSenderForResult(IntentSender, Integer, Intent, Integer, Integer, Integer)") {

            @Override
            public void call(final IntentSender intent, final Integer requestCode,
                    final Intent fillInIntent, final Integer flagsMask, final Integer flagsValues,
                    final Integer extraFlags) {
                if (iterator.hasPrevious()) {
                    try {
                        iterator.previous()
                                .startIntentSenderForResult(this, intent, requestCode, fillInIntent,
                                        flagsMask, flagsValues, extraFlags);
                    } catch (IntentSender.SendIntentException e) {
                        throw new SuppressedException(e);
                    }
                } else {
                    try {
                        getOriginal()
                                .super_startIntentSenderForResult(intent, requestCode, fillInIntent,
                                        flagsMask, flagsValues, extraFlags);
                    } catch (IntentSender.SendIntentException e) {
                        throw new SuppressedException(e);
                    }
                }
            }
        };
        superCall.call(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    public void startIntentSenderFromChild(final Activity child, final IntentSender intent,
            final int requestCode, final Intent fillInIntent, final int flagsMask,
            final int flagsValues, final int extraFlags) throws IntentSender.SendIntentException {
        if (!mIsOverridden_startIntentSenderFromChildAyIrIrItIrIrIr) {
            getOriginal().super_startIntentSenderFromChild(child, intent, requestCode, fillInIntent,
                    flagsMask, flagsValues, extraFlags);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_startIntentSenderFromChildAyIrIrItIrIrIr
                < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_startIntentSenderFromChildAyIrIrItIrIrIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("startIntentSenderFromChild(Activity, IntentSender, Integer, Intent, Integer, Integer, Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("startIntentSenderFromChild",
                        Activity.class, IntentSender.class, Integer.class, Intent.class,
                        Integer.class, Integer.class, Integer.class);
                mMethodImplementingPlugins
                        .put("startIntentSenderFromChild(Activity, IntentSender, Integer, Intent, Integer, Integer, Integer)",
                                implementingPlugins);
                mIsOverridden_startIntentSenderFromChildAyIrIrItIrIrIr = implementingPlugins.size()
                        > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid7<Activity, IntentSender, Integer, Intent, Integer, Integer, Integer>
                superCall
                = new CallVoid7<Activity, IntentSender, Integer, Intent, Integer, Integer, Integer>(
                "startIntentSenderFromChild(Activity, IntentSender, Integer, Intent, Integer, Integer, Integer)") {

            @Override
            public void call(final Activity child, final IntentSender intent,
                    final Integer requestCode, final Intent fillInIntent, final Integer flagsMask,
                    final Integer flagsValues, final Integer extraFlags) {
                if (iterator.hasPrevious()) {
                    try {
                        iterator.previous()
                                .startIntentSenderFromChild(this, child, intent, requestCode,
                                        fillInIntent, flagsMask, flagsValues, extraFlags);
                    } catch (IntentSender.SendIntentException e) {
                        throw new SuppressedException(e);
                    }
                } else {
                    try {
                        getOriginal().super_startIntentSenderFromChild(child, intent, requestCode,
                                fillInIntent, flagsMask, flagsValues, extraFlags);
                    } catch (IntentSender.SendIntentException e) {
                        throw new SuppressedException(e);
                    }
                }
            }
        };
        superCall
                .call(child, intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    public void startIntentSenderFromChild(final Activity child, final IntentSender intent,
            final int requestCode, final Intent fillInIntent, final int flagsMask,
            final int flagsValues, final int extraFlags, final Bundle options)
            throws IntentSender.SendIntentException {
        if (!mIsOverridden_startIntentSenderFromChildAyIrIrItIrIrIrBe) {
            getOriginal().super_startIntentSenderFromChild(child, intent, requestCode, fillInIntent,
                    flagsMask, flagsValues, extraFlags, options);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_startIntentSenderFromChildAyIrIrItIrIrIrBe
                < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_startIntentSenderFromChildAyIrIrItIrIrIrBe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("startIntentSenderFromChild(Activity, IntentSender, Integer, Intent, Integer, Integer, Integer, Bundle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("startIntentSenderFromChild",
                        Activity.class, IntentSender.class, Integer.class, Intent.class,
                        Integer.class, Integer.class, Integer.class, Bundle.class);
                mMethodImplementingPlugins
                        .put("startIntentSenderFromChild(Activity, IntentSender, Integer, Intent, Integer, Integer, Integer, Bundle)",
                                implementingPlugins);
                mIsOverridden_startIntentSenderFromChildAyIrIrItIrIrIrBe =
                        implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid8<Activity, IntentSender, Integer, Intent, Integer, Integer, Integer, Bundle>
                superCall
                = new CallVoid8<Activity, IntentSender, Integer, Intent, Integer, Integer, Integer, Bundle>(
                "startIntentSenderFromChild(Activity, IntentSender, Integer, Intent, Integer, Integer, Integer, Bundle)") {

            @Override
            public void call(final Activity child, final IntentSender intent,
                    final Integer requestCode, final Intent fillInIntent, final Integer flagsMask,
                    final Integer flagsValues, final Integer extraFlags, final Bundle options) {
                if (iterator.hasPrevious()) {
                    try {
                        iterator.previous()
                                .startIntentSenderFromChild(this, child, intent, requestCode,
                                        fillInIntent, flagsMask, flagsValues, extraFlags, options);
                    } catch (IntentSender.SendIntentException e) {
                        throw new SuppressedException(e);
                    }
                } else {
                    try {
                        getOriginal().super_startIntentSenderFromChild(child, intent, requestCode,
                                fillInIntent, flagsMask, flagsValues, extraFlags, options);
                    } catch (IntentSender.SendIntentException e) {
                        throw new SuppressedException(e);
                    }
                }
            }
        };
        superCall.call(child, intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags,
                options);
    }

    public void startIntentSenderFromFragment(final Fragment fragment, final IntentSender intent,
            final int requestCode, @Nullable final Intent fillInIntent, final int flagsMask,
            final int flagsValues, final int extraFlags, final Bundle options)
            throws IntentSender.SendIntentException {
        if (!mIsOverridden_startIntentSenderFromFragmentFtIrIrItIrIrIrBe) {
            getOriginal().super_startIntentSenderFromFragment(fragment, intent, requestCode,
                    fillInIntent, flagsMask, flagsValues, extraFlags, options);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_startIntentSenderFromFragmentFtIrIrItIrIrIrBe
                < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_startIntentSenderFromFragmentFtIrIrItIrIrIrBe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("startIntentSenderFromFragment(Fragment, IntentSender, Integer, Intent, Integer, Integer, Integer, Bundle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("startIntentSenderFromFragment",
                        Fragment.class, IntentSender.class, Integer.class, Intent.class,
                        Integer.class, Integer.class, Integer.class, Bundle.class);
                mMethodImplementingPlugins
                        .put("startIntentSenderFromFragment(Fragment, IntentSender, Integer, Intent, Integer, Integer, Integer, Bundle)",
                                implementingPlugins);
                mIsOverridden_startIntentSenderFromFragmentFtIrIrItIrIrIrBe =
                        implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid8<Fragment, IntentSender, Integer, Intent, Integer, Integer, Integer, Bundle>
                superCall
                = new CallVoid8<Fragment, IntentSender, Integer, Intent, Integer, Integer, Integer, Bundle>(
                "startIntentSenderFromFragment(Fragment, IntentSender, Integer, Intent, Integer, Integer, Integer, Bundle)") {

            @Override
            public void call(final Fragment fragment, final IntentSender intent,
                    final Integer requestCode, final Intent fillInIntent, final Integer flagsMask,
                    final Integer flagsValues, final Integer extraFlags, final Bundle options) {
                if (iterator.hasPrevious()) {
                    try {
                        iterator.previous()
                                .startIntentSenderFromFragment(this, fragment, intent, requestCode,
                                        fillInIntent, flagsMask, flagsValues, extraFlags, options);
                    } catch (IntentSender.SendIntentException e) {
                        throw new SuppressedException(e);
                    }
                } else {
                    try {
                        getOriginal()
                                .super_startIntentSenderFromFragment(fragment, intent, requestCode,
                                        fillInIntent, flagsMask, flagsValues, extraFlags, options);
                    } catch (IntentSender.SendIntentException e) {
                        throw new SuppressedException(e);
                    }
                }
            }
        };
        superCall.call(fragment, intent, requestCode, fillInIntent, flagsMask, flagsValues,
                extraFlags, options);
    }

    public void startLockTask() {
        if (!mIsOverridden_startLockTask) {
            getOriginal().super_startLockTask();
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_startLockTask < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_startLockTask++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("startLockTask()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("startLockTask");
                mMethodImplementingPlugins.put("startLockTask()", implementingPlugins);
                mIsOverridden_startLockTask = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid0 superCall = new CallVoid0("startLockTask()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().startLockTask(this);
                } else {
                    getOriginal().super_startLockTask();
                }
            }
        };
        superCall.call();
    }

    public void startManagingCursor(final Cursor c) {
        if (!mIsOverridden_startManagingCursorCr) {
            getOriginal().super_startManagingCursor(c);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_startManagingCursorCr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_startManagingCursorCr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("startManagingCursor(Cursor)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("startManagingCursor", Cursor.class);
                mMethodImplementingPlugins.put("startManagingCursor(Cursor)", implementingPlugins);
                mIsOverridden_startManagingCursorCr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<Cursor> superCall = new CallVoid1<Cursor>("startManagingCursor(Cursor)") {

            @Override
            public void call(final Cursor c) {
                if (iterator.hasPrevious()) {
                    iterator.previous().startManagingCursor(this, c);
                } else {
                    getOriginal().super_startManagingCursor(c);
                }
            }
        };
        superCall.call(c);
    }

    public boolean startNextMatchingActivity(final Intent intent) {
        if (!mIsOverridden_startNextMatchingActivityIt) {
            return getOriginal().super_startNextMatchingActivity(intent);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_startNextMatchingActivityIt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_startNextMatchingActivityIt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("startNextMatchingActivity(Intent)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("startNextMatchingActivity",
                        Intent.class);
                mMethodImplementingPlugins
                        .put("startNextMatchingActivity(Intent)", implementingPlugins);
                mIsOverridden_startNextMatchingActivityIt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<Boolean, Intent> superCall = new CallFun1<Boolean, Intent>(
                "startNextMatchingActivity(Intent)") {

            @Override
            public Boolean call(final Intent intent) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().startNextMatchingActivity(this, intent);
                } else {
                    return getOriginal().super_startNextMatchingActivity(intent);
                }
            }
        };
        return superCall.call(intent);
    }

    public boolean startNextMatchingActivity(final Intent intent, final Bundle options) {
        if (!mIsOverridden_startNextMatchingActivityItBe) {
            return getOriginal().super_startNextMatchingActivity(intent, options);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_startNextMatchingActivityItBe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_startNextMatchingActivityItBe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("startNextMatchingActivity(Intent, Bundle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("startNextMatchingActivity",
                        Intent.class, Bundle.class);
                mMethodImplementingPlugins
                        .put("startNextMatchingActivity(Intent, Bundle)", implementingPlugins);
                mIsOverridden_startNextMatchingActivityItBe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun2<Boolean, Intent, Bundle> superCall = new CallFun2<Boolean, Intent, Bundle>(
                "startNextMatchingActivity(Intent, Bundle)") {

            @Override
            public Boolean call(final Intent intent, final Bundle options) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().startNextMatchingActivity(this, intent, options);
                } else {
                    return getOriginal().super_startNextMatchingActivity(intent, options);
                }
            }
        };
        return superCall.call(intent, options);
    }

    public void startPostponedEnterTransition() {
        if (!mIsOverridden_startPostponedEnterTransition) {
            getOriginal().super_startPostponedEnterTransition();
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_startPostponedEnterTransition < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_startPostponedEnterTransition++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("startPostponedEnterTransition()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("startPostponedEnterTransition");
                mMethodImplementingPlugins
                        .put("startPostponedEnterTransition()", implementingPlugins);
                mIsOverridden_startPostponedEnterTransition = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

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

    public void startSearch(final String initialQuery, final boolean selectInitialQuery,
            final Bundle appSearchData, final boolean globalSearch) {
        if (!mIsOverridden_startSearchSgBnBeBn) {
            getOriginal().super_startSearch(initialQuery, selectInitialQuery, appSearchData,
                    globalSearch);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_startSearchSgBnBeBn < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_startSearchSgBnBeBn++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("startSearch(String, Boolean, Bundle, Boolean)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("startSearch", String.class,
                        Boolean.class, Bundle.class, Boolean.class);
                mMethodImplementingPlugins
                        .put("startSearch(String, Boolean, Bundle, Boolean)", implementingPlugins);
                mIsOverridden_startSearchSgBnBeBn = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid4<String, Boolean, Bundle, Boolean> superCall
                = new CallVoid4<String, Boolean, Bundle, Boolean>(
                "startSearch(String, Boolean, Bundle, Boolean)") {

            @Override
            public void call(final String initialQuery, final Boolean selectInitialQuery,
                    final Bundle appSearchData, final Boolean globalSearch) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .startSearch(this, initialQuery, selectInitialQuery, appSearchData,
                                    globalSearch);
                } else {
                    getOriginal().super_startSearch(initialQuery, selectInitialQuery, appSearchData,
                            globalSearch);
                }
            }
        };
        superCall.call(initialQuery, selectInitialQuery, appSearchData, globalSearch);
    }

    public ComponentName startService(final Intent service) {
        if (!mIsOverridden_startServiceIt) {
            return getOriginal().super_startService(service);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_startServiceIt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_startServiceIt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("startService(Intent)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("startService", Intent.class);
                mMethodImplementingPlugins.put("startService(Intent)", implementingPlugins);
                mIsOverridden_startServiceIt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<ComponentName, Intent> superCall = new CallFun1<ComponentName, Intent>(
                "startService(Intent)") {

            @Override
            public ComponentName call(final Intent service) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().startService(this, service);
                } else {
                    return getOriginal().super_startService(service);
                }
            }
        };
        return superCall.call(service);
    }

    public ActionMode startSupportActionMode(@NonNull final ActionMode.Callback callback) {
        if (!mIsOverridden_startSupportActionModeAk) {
            return getOriginal().super_startSupportActionMode(callback);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_startSupportActionModeAk < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_startSupportActionModeAk++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("startSupportActionMode(ActionMode.Callback)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("startSupportActionMode",
                        ActionMode.Callback.class);
                mMethodImplementingPlugins
                        .put("startSupportActionMode(ActionMode.Callback)", implementingPlugins);
                mIsOverridden_startSupportActionModeAk = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<ActionMode, ActionMode.Callback> superCall
                = new CallFun1<ActionMode, ActionMode.Callback>(
                "startSupportActionMode(ActionMode.Callback)") {

            @Override
            public ActionMode call(final ActionMode.Callback callback) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().startSupportActionMode(this, callback);
                } else {
                    return getOriginal().super_startSupportActionMode(callback);
                }
            }
        };
        return superCall.call(callback);
    }

    public void stopLockTask() {
        if (!mIsOverridden_stopLockTask) {
            getOriginal().super_stopLockTask();
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_stopLockTask < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_stopLockTask++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("stopLockTask()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("stopLockTask");
                mMethodImplementingPlugins.put("stopLockTask()", implementingPlugins);
                mIsOverridden_stopLockTask = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid0 superCall = new CallVoid0("stopLockTask()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().stopLockTask(this);
                } else {
                    getOriginal().super_stopLockTask();
                }
            }
        };
        superCall.call();
    }

    public void stopManagingCursor(final Cursor c) {
        if (!mIsOverridden_stopManagingCursorCr) {
            getOriginal().super_stopManagingCursor(c);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_stopManagingCursorCr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_stopManagingCursorCr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("stopManagingCursor(Cursor)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("stopManagingCursor", Cursor.class);
                mMethodImplementingPlugins.put("stopManagingCursor(Cursor)", implementingPlugins);
                mIsOverridden_stopManagingCursorCr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<Cursor> superCall = new CallVoid1<Cursor>("stopManagingCursor(Cursor)") {

            @Override
            public void call(final Cursor c) {
                if (iterator.hasPrevious()) {
                    iterator.previous().stopManagingCursor(this, c);
                } else {
                    getOriginal().super_stopManagingCursor(c);
                }
            }
        };
        superCall.call(c);
    }

    public boolean stopService(final Intent name) {
        if (!mIsOverridden_stopServiceIt) {
            return getOriginal().super_stopService(name);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_stopServiceIt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_stopServiceIt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("stopService(Intent)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("stopService", Intent.class);
                mMethodImplementingPlugins.put("stopService(Intent)", implementingPlugins);
                mIsOverridden_stopServiceIt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<Boolean, Intent> superCall = new CallFun1<Boolean, Intent>(
                "stopService(Intent)") {

            @Override
            public Boolean call(final Intent name) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().stopService(this, name);
                } else {
                    return getOriginal().super_stopService(name);
                }
            }
        };
        return superCall.call(name);
    }

    public void supportFinishAfterTransition() {
        if (!mIsOverridden_supportFinishAfterTransition) {
            getOriginal().super_supportFinishAfterTransition();
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_supportFinishAfterTransition < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_supportFinishAfterTransition++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("supportFinishAfterTransition()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("supportFinishAfterTransition");
                mMethodImplementingPlugins
                        .put("supportFinishAfterTransition()", implementingPlugins);
                mIsOverridden_supportFinishAfterTransition = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid0 superCall = new CallVoid0("supportFinishAfterTransition()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().supportFinishAfterTransition(this);
                } else {
                    getOriginal().super_supportFinishAfterTransition();
                }
            }
        };
        superCall.call();
    }

    public void supportInvalidateOptionsMenu() {
        if (!mIsOverridden_supportInvalidateOptionsMenu) {
            getOriginal().super_supportInvalidateOptionsMenu();
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_supportInvalidateOptionsMenu < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_supportInvalidateOptionsMenu++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("supportInvalidateOptionsMenu()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("supportInvalidateOptionsMenu");
                mMethodImplementingPlugins
                        .put("supportInvalidateOptionsMenu()", implementingPlugins);
                mIsOverridden_supportInvalidateOptionsMenu = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid0 superCall = new CallVoid0("supportInvalidateOptionsMenu()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().supportInvalidateOptionsMenu(this);
                } else {
                    getOriginal().super_supportInvalidateOptionsMenu();
                }
            }
        };
        superCall.call();
    }

    public void supportNavigateUpTo(@NonNull final Intent upIntent) {
        if (!mIsOverridden_supportNavigateUpToIt) {
            getOriginal().super_supportNavigateUpTo(upIntent);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_supportNavigateUpToIt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_supportNavigateUpToIt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("supportNavigateUpTo(Intent)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("supportNavigateUpTo", Intent.class);
                mMethodImplementingPlugins.put("supportNavigateUpTo(Intent)", implementingPlugins);
                mIsOverridden_supportNavigateUpToIt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<Intent> superCall = new CallVoid1<Intent>("supportNavigateUpTo(Intent)") {

            @Override
            public void call(final Intent upIntent) {
                if (iterator.hasPrevious()) {
                    iterator.previous().supportNavigateUpTo(this, upIntent);
                } else {
                    getOriginal().super_supportNavigateUpTo(upIntent);
                }
            }
        };
        superCall.call(upIntent);
    }

    public void supportPostponeEnterTransition() {
        if (!mIsOverridden_supportPostponeEnterTransition) {
            getOriginal().super_supportPostponeEnterTransition();
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_supportPostponeEnterTransition < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_supportPostponeEnterTransition++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("supportPostponeEnterTransition()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("supportPostponeEnterTransition");
                mMethodImplementingPlugins
                        .put("supportPostponeEnterTransition()", implementingPlugins);
                mIsOverridden_supportPostponeEnterTransition = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid0 superCall = new CallVoid0("supportPostponeEnterTransition()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().supportPostponeEnterTransition(this);
                } else {
                    getOriginal().super_supportPostponeEnterTransition();
                }
            }
        };
        superCall.call();
    }

    public boolean supportRequestWindowFeature(final int featureId) {
        if (!mIsOverridden_supportRequestWindowFeatureIr) {
            return getOriginal().super_supportRequestWindowFeature(featureId);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_supportRequestWindowFeatureIr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_supportRequestWindowFeatureIr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("supportRequestWindowFeature(Integer)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("supportRequestWindowFeature",
                        Integer.class);
                mMethodImplementingPlugins
                        .put("supportRequestWindowFeature(Integer)", implementingPlugins);
                mIsOverridden_supportRequestWindowFeatureIr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<Boolean, Integer> superCall = new CallFun1<Boolean, Integer>(
                "supportRequestWindowFeature(Integer)") {

            @Override
            public Boolean call(final Integer featureId) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().supportRequestWindowFeature(this, featureId);
                } else {
                    return getOriginal().super_supportRequestWindowFeature(featureId);
                }
            }
        };
        return superCall.call(featureId);
    }

    public boolean supportShouldUpRecreateTask(@NonNull final Intent targetIntent) {
        if (!mIsOverridden_supportShouldUpRecreateTaskIt) {
            return getOriginal().super_supportShouldUpRecreateTask(targetIntent);
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_supportShouldUpRecreateTaskIt < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_supportShouldUpRecreateTaskIt++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("supportShouldUpRecreateTask(Intent)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("supportShouldUpRecreateTask",
                        Intent.class);
                mMethodImplementingPlugins
                        .put("supportShouldUpRecreateTask(Intent)", implementingPlugins);
                mIsOverridden_supportShouldUpRecreateTaskIt = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallFun1<Boolean, Intent> superCall = new CallFun1<Boolean, Intent>(
                "supportShouldUpRecreateTask(Intent)") {

            @Override
            public Boolean call(final Intent targetIntent) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().supportShouldUpRecreateTask(this, targetIntent);
                } else {
                    return getOriginal().super_supportShouldUpRecreateTask(targetIntent);
                }
            }
        };
        return superCall.call(targetIntent);
    }

    public void supportStartPostponedEnterTransition() {
        if (!mIsOverridden_supportStartPostponedEnterTransition) {
            getOriginal().super_supportStartPostponedEnterTransition();
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_supportStartPostponedEnterTransition < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_supportStartPostponedEnterTransition++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("supportStartPostponedEnterTransition()");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins(
                        "supportStartPostponedEnterTransition");
                mMethodImplementingPlugins
                        .put("supportStartPostponedEnterTransition()", implementingPlugins);
                mIsOverridden_supportStartPostponedEnterTransition = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid0 superCall = new CallVoid0("supportStartPostponedEnterTransition()") {

            @Override
            public void call() {
                if (iterator.hasPrevious()) {
                    iterator.previous().supportStartPostponedEnterTransition(this);
                } else {
                    getOriginal().super_supportStartPostponedEnterTransition();
                }
            }
        };
        superCall.call();
    }

    public void takeKeyEvents(final boolean get) {
        if (!mIsOverridden_takeKeyEventsBn) {
            getOriginal().super_takeKeyEvents(get);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_takeKeyEventsBn < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_takeKeyEventsBn++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("takeKeyEvents(Boolean)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("takeKeyEvents", Boolean.class);
                mMethodImplementingPlugins.put("takeKeyEvents(Boolean)", implementingPlugins);
                mIsOverridden_takeKeyEventsBn = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<Boolean> superCall = new CallVoid1<Boolean>("takeKeyEvents(Boolean)") {

            @Override
            public void call(final Boolean get) {
                if (iterator.hasPrevious()) {
                    iterator.previous().takeKeyEvents(this, get);
                } else {
                    getOriginal().super_takeKeyEvents(get);
                }
            }
        };
        superCall.call(get);
    }

    public void triggerSearch(final String query, final Bundle appSearchData) {
        if (!mIsOverridden_triggerSearchSgBe) {
            getOriginal().super_triggerSearch(query, appSearchData);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_triggerSearchSgBe < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_triggerSearchSgBe++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("triggerSearch(String, Bundle)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("triggerSearch", String.class,
                        Bundle.class);
                mMethodImplementingPlugins
                        .put("triggerSearch(String, Bundle)", implementingPlugins);
                mIsOverridden_triggerSearchSgBe = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid2<String, Bundle> superCall = new CallVoid2<String, Bundle>(
                "triggerSearch(String, Bundle)") {

            @Override
            public void call(final String query, final Bundle appSearchData) {
                if (iterator.hasPrevious()) {
                    iterator.previous().triggerSearch(this, query, appSearchData);
                } else {
                    getOriginal().super_triggerSearch(query, appSearchData);
                }
            }
        };
        superCall.call(query, appSearchData);
    }

    public void unbindService(final ServiceConnection conn) {
        if (!mIsOverridden_unbindServiceSn) {
            getOriginal().super_unbindService(conn);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_unbindServiceSn < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_unbindServiceSn++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("unbindService(ServiceConnection)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("unbindService",
                        ServiceConnection.class);
                mMethodImplementingPlugins
                        .put("unbindService(ServiceConnection)", implementingPlugins);
                mIsOverridden_unbindServiceSn = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<ServiceConnection> superCall = new CallVoid1<ServiceConnection>(
                "unbindService(ServiceConnection)") {

            @Override
            public void call(final ServiceConnection conn) {
                if (iterator.hasPrevious()) {
                    iterator.previous().unbindService(this, conn);
                } else {
                    getOriginal().super_unbindService(conn);
                }
            }
        };
        superCall.call(conn);
    }

    public void unregisterComponentCallbacks(final ComponentCallbacks callback) {
        if (!mIsOverridden_unregisterComponentCallbacksCs) {
            getOriginal().super_unregisterComponentCallbacks(callback);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_unregisterComponentCallbacksCs < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_unregisterComponentCallbacksCs++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("unregisterComponentCallbacks(ComponentCallbacks)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("unregisterComponentCallbacks",
                        ComponentCallbacks.class);
                mMethodImplementingPlugins.put("unregisterComponentCallbacks(ComponentCallbacks)",
                        implementingPlugins);
                mIsOverridden_unregisterComponentCallbacksCs = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<ComponentCallbacks> superCall = new CallVoid1<ComponentCallbacks>(
                "unregisterComponentCallbacks(ComponentCallbacks)") {

            @Override
            public void call(final ComponentCallbacks callback) {
                if (iterator.hasPrevious()) {
                    iterator.previous().unregisterComponentCallbacks(this, callback);
                } else {
                    getOriginal().super_unregisterComponentCallbacks(callback);
                }
            }
        };
        superCall.call(callback);
    }

    public void unregisterForContextMenu(final View view) {
        if (!mIsOverridden_unregisterForContextMenuVw) {
            getOriginal().super_unregisterForContextMenu(view);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_unregisterForContextMenuVw < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_unregisterForContextMenuVw++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
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

    public void unregisterReceiver(final BroadcastReceiver receiver) {
        if (!mIsOverridden_unregisterReceiverBr) {
            getOriginal().super_unregisterReceiver(receiver);
            return;
        }

        final ListIterator<ActivityPlugin> iterator;
        if (mCallCount_unregisterReceiverBr < CALL_COUNT_OPTIMIZATION_THRESHOLD) {
            mCallCount_unregisterReceiverBr++;
            iterator = mPlugins.listIterator(mPlugins.size());
        } else {
            List<ActivityPlugin> implementingPlugins = mMethodImplementingPlugins
                    .get("unregisterReceiver(BroadcastReceiver)");
            if (implementingPlugins == null) {
                implementingPlugins = getImplementingPlugins("unregisterReceiver",
                        BroadcastReceiver.class);
                mMethodImplementingPlugins
                        .put("unregisterReceiver(BroadcastReceiver)", implementingPlugins);
                mIsOverridden_unregisterReceiverBr = implementingPlugins.size() > 0;
            }

            iterator = implementingPlugins.listIterator(implementingPlugins.size());
        }

        final CallVoid1<BroadcastReceiver> superCall = new CallVoid1<BroadcastReceiver>(
                "unregisterReceiver(BroadcastReceiver)") {

            @Override
            public void call(final BroadcastReceiver receiver) {
                if (iterator.hasPrevious()) {
                    iterator.previous().unregisterReceiver(this, receiver);
                } else {
                    getOriginal().super_unregisterReceiver(receiver);
                }
            }
        };
        superCall.call(receiver);
    }

    private List<ActivityPlugin> getImplementingPlugins(final String methodName,
            final Class<?>... parameterTypes) {
        synchronized (mPlugins) {
            final ArrayList<ActivityPlugin> implementingPlugins = new ArrayList<>();
            for (int i = 0; i < mPlugins.size(); i++) {
                final ActivityPlugin plugin = mPlugins.get(i);
                if (plugin.isMethodOverridden(methodName, parameterTypes)) {
                    implementingPlugins.add(plugin);
                }
            }
            return implementingPlugins;
        }
    }

}