package com.pascalwelsch.compositeandroid.activity;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Dialog;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.app.VoiceInteractor;
import android.app.assist.AssistContent;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks;
import android.content.ComponentCallbacks2;
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
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.LoaderManager;
import android.support.v4.app.SharedElementCallback;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatCallback;
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


public interface ICompositeActivity
        extends LayoutInflater.Factory2, Window.Callback, KeyEvent.Callback,
        View.OnCreateContextMenuListener,
        ComponentCallbacks2, ActivityCompat.OnRequestPermissionsResultCallback, AppCompatCallback,
        ActionBarDrawerToggle.DelegateProvider {


    void addContentView(final View view, final ViewGroup.LayoutParams params);

    void addContentView__super(final View view, final ViewGroup.LayoutParams params);

    void applyOverrideConfiguration(final Configuration overrideConfiguration);

    void applyOverrideConfiguration__super(final Configuration overrideConfiguration);

    void attachBaseContext(final Context newBase);

    void attachBaseContext__super(final Context newBase);

    boolean bindService(final Intent service, final ServiceConnection conn, final int flags);

    boolean bindService__super(final Intent service, final ServiceConnection conn, final int flags);

    int checkCallingOrSelfPermission(final String permission);

    int checkCallingOrSelfPermission__super(final String permission);

    int checkCallingOrSelfUriPermission(final Uri uri, final int modeFlags);

    int checkCallingOrSelfUriPermission__super(final Uri uri, final int modeFlags);

    int checkCallingPermission(final String permission);

    int checkCallingPermission__super(final String permission);

    int checkCallingUriPermission(final Uri uri, final int modeFlags);

    int checkCallingUriPermission__super(final Uri uri, final int modeFlags);

    int checkPermission(final String permission, final int pid, final int uid);

    int checkPermission__super(final String permission, final int pid, final int uid);

    int checkSelfPermission(final String permission);

    int checkSelfPermission__super(final String permission);

    int checkUriPermission(final Uri uri, final int pid, final int uid, final int modeFlags);

    int checkUriPermission(final Uri uri, final String readPermission, final String writePermission,
            final int pid, final int uid, final int modeFlags);

    int checkUriPermission__super(final Uri uri, final int pid, final int uid, final int modeFlags);

    int checkUriPermission__super(final Uri uri, final String readPermission,
            final String writePermission, final int pid, final int uid, final int modeFlags);

    void clearWallpaper() throws IOException;

    void clearWallpaper__super() throws IOException;

    void closeContextMenu();

    void closeContextMenu__super();

    void closeOptionsMenu();

    void closeOptionsMenu__super();

    Context createConfigurationContext(final Configuration overrideConfiguration);

    Context createConfigurationContext__super(final Configuration overrideConfiguration);

    Context createDisplayContext(final Display display);

    Context createDisplayContext__super(final Display display);

    Context createPackageContext(final String packageName, final int flags)
            throws PackageManager.NameNotFoundException;

    Context createPackageContext__super(final String packageName, final int flags)
            throws PackageManager.NameNotFoundException;

    PendingIntent createPendingResult(final int requestCode, @NonNull final Intent data,
            final int flags);

    PendingIntent createPendingResult__super(final int requestCode, @NonNull final Intent data,
            final int flags);

    String[] databaseList();

    String[] databaseList__super();

    boolean deleteDatabase(final String name);

    boolean deleteDatabase__super(final String name);

    boolean deleteFile(final String name);

    boolean deleteFile__super(final String name);

    boolean dispatchGenericMotionEvent(final MotionEvent ev);

    boolean dispatchGenericMotionEvent__super(final MotionEvent ev);

    boolean dispatchKeyEvent(final KeyEvent event);

    boolean dispatchKeyEvent__super(final KeyEvent event);

    boolean dispatchKeyShortcutEvent(final KeyEvent event);

    boolean dispatchKeyShortcutEvent__super(final KeyEvent event);

    boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent event);

    boolean dispatchPopulateAccessibilityEvent__super(final AccessibilityEvent event);

    boolean dispatchTouchEvent(final MotionEvent ev);

    boolean dispatchTouchEvent__super(final MotionEvent ev);

    boolean dispatchTrackballEvent(final MotionEvent ev);

    boolean dispatchTrackballEvent__super(final MotionEvent ev);

    void dump(final String prefix, final FileDescriptor fd, final PrintWriter writer,
            final String[] args);

    void dump__super(final String prefix, final FileDescriptor fd, final PrintWriter writer,
            final String[] args);

    void enforceCallingOrSelfPermission(final String permission, final String message);

    void enforceCallingOrSelfPermission__super(final String permission, final String message);

    void enforceCallingOrSelfUriPermission(final Uri uri, final int modeFlags,
            final String message);

    void enforceCallingOrSelfUriPermission__super(final Uri uri, final int modeFlags,
            final String message);

    void enforceCallingPermission(final String permission, final String message);

    void enforceCallingPermission__super(final String permission, final String message);

    void enforceCallingUriPermission(final Uri uri, final int modeFlags, final String message);

    void enforceCallingUriPermission__super(final Uri uri, final int modeFlags,
            final String message);

    void enforcePermission(final String permission, final int pid, final int uid,
            final String message);

    void enforcePermission__super(final String permission, final int pid, final int uid,
            final String message);

    void enforceUriPermission(final Uri uri, final int pid, final int uid, final int modeFlags,
            final String message);

    void enforceUriPermission(final Uri uri, final String readPermission,
            final String writePermission, final int pid, final int uid, final int modeFlags,
            final String message);

    void enforceUriPermission__super(final Uri uri, final int pid, final int uid,
            final int modeFlags, final String message);

    void enforceUriPermission__super(final Uri uri, final String readPermission,
            final String writePermission, final int pid, final int uid, final int modeFlags,
            final String message);

    String[] fileList();

    String[] fileList__super();

    View findViewById(@IdRes final int id);

    View findViewById__super(@IdRes final int id);

    void finish();

    void finishActivity(final int requestCode);

    void finishActivityFromChild(@NonNull final Activity child, final int requestCode);

    void finishActivityFromChild__super(@NonNull final Activity child, final int requestCode);

    void finishActivity__super(final int requestCode);

    void finishAffinity();

    void finishAffinity__super();

    void finishAfterTransition();

    void finishAfterTransition__super();

    void finishAndRemoveTask();

    void finishAndRemoveTask__super();

    void finishFromChild(final Activity child);

    void finishFromChild__super(final Activity child);

    void finish__super();

    android.app.ActionBar getActionBar();

    android.app.ActionBar getActionBar__super();

    Context getApplicationContext();

    Context getApplicationContext__super();

    ApplicationInfo getApplicationInfo();

    ApplicationInfo getApplicationInfo__super();

    AssetManager getAssets();

    AssetManager getAssets__super();

    Context getBaseContext();

    Context getBaseContext__super();

    File getCacheDir();

    File getCacheDir__super();

    ComponentName getCallingActivity();

    ComponentName getCallingActivity__super();

    String getCallingPackage();

    String getCallingPackage__super();

    int getChangingConfigurations();

    int getChangingConfigurations__super();

    ClassLoader getClassLoader();

    ClassLoader getClassLoader__super();

    File getCodeCacheDir();

    File getCodeCacheDir__super();

    ComponentName getComponentName();

    ComponentName getComponentName__super();

    ContentResolver getContentResolver();

    ContentResolver getContentResolver__super();

    Scene getContentScene();

    Scene getContentScene__super();

    TransitionManager getContentTransitionManager();

    TransitionManager getContentTransitionManager__super();

    View getCurrentFocus();

    View getCurrentFocus__super();

    File getDatabasePath(final String name);

    File getDatabasePath__super(final String name);

    AppCompatDelegate getDelegate();

    AppCompatDelegate getDelegate__super();

    File getDir(final String name, final int mode);

    File getDir__super(final String name, final int mode);

    ActionBarDrawerToggle.Delegate getDrawerToggleDelegate();

    ActionBarDrawerToggle.Delegate getDrawerToggleDelegate__super();

    File getExternalCacheDir();

    File getExternalCacheDir__super();

    File[] getExternalCacheDirs();

    File[] getExternalCacheDirs__super();

    File getExternalFilesDir(final String type);

    File getExternalFilesDir__super(final String type);

    File[] getExternalFilesDirs(final String type);

    File[] getExternalFilesDirs__super(final String type);

    File[] getExternalMediaDirs();

    File[] getExternalMediaDirs__super();

    File getFileStreamPath(final String name);

    File getFileStreamPath__super(final String name);

    File getFilesDir();

    File getFilesDir__super();

    android.app.FragmentManager getFragmentManager();

    android.app.FragmentManager getFragmentManager__super();

    Intent getIntent();

    Intent getIntent__super();

    Object getLastCompositeCustomNonConfigurationInstance();

    Object getLastCustomNonConfigurationInstance();

    Object getLastNonConfigurationInstance();

    LayoutInflater getLayoutInflater();

    LayoutInflater getLayoutInflater__super();

    android.app.LoaderManager getLoaderManager();

    android.app.LoaderManager getLoaderManager__super();

    String getLocalClassName();

    String getLocalClassName__super();

    Looper getMainLooper();

    Looper getMainLooper__super();

    MenuInflater getMenuInflater();

    MenuInflater getMenuInflater__super();

    File getNoBackupFilesDir();

    File getNoBackupFilesDir__super();

    File getObbDir();

    File getObbDir__super();

    File[] getObbDirs();

    File[] getObbDirs__super();

    String getPackageCodePath();

    String getPackageCodePath__super();

    PackageManager getPackageManager();

    PackageManager getPackageManager__super();

    String getPackageName();

    String getPackageName__super();

    String getPackageResourcePath();

    String getPackageResourcePath__super();

    Intent getParentActivityIntent();

    Intent getParentActivityIntent__super();

    SharedPreferences getPreferences(final int mode);

    SharedPreferences getPreferences__super(final int mode);

    Uri getReferrer();

    Uri getReferrer__super();

    int getRequestedOrientation();

    int getRequestedOrientation__super();

    Resources getResources();

    Resources getResources__super();

    SharedPreferences getSharedPreferences(final String name, final int mode);

    SharedPreferences getSharedPreferences__super(final String name, final int mode);

    ActionBar getSupportActionBar();

    ActionBar getSupportActionBar__super();

    FragmentManager getSupportFragmentManager();

    FragmentManager getSupportFragmentManager__super();

    LoaderManager getSupportLoaderManager();

    LoaderManager getSupportLoaderManager__super();

    Intent getSupportParentActivityIntent();

    Intent getSupportParentActivityIntent__super();

    Object getSystemService(@NonNull final String name);

    String getSystemServiceName(final Class<?> serviceClass);

    String getSystemServiceName__super(final Class<?> serviceClass);

    Object getSystemService__super(@NonNull final String name);

    int getTaskId();

    int getTaskId__super();

    Resources.Theme getTheme();

    Resources.Theme getTheme__super();

    VoiceInteractor getVoiceInteractor();

    VoiceInteractor getVoiceInteractor__super();

    Drawable getWallpaper();

    int getWallpaperDesiredMinimumHeight();

    int getWallpaperDesiredMinimumHeight__super();

    int getWallpaperDesiredMinimumWidth();

    int getWallpaperDesiredMinimumWidth__super();

    Drawable getWallpaper__super();

    Window getWindow();

    WindowManager getWindowManager();

    WindowManager getWindowManager__super();

    Window getWindow__super();

    void grantUriPermission(final String toPackage, final Uri uri, final int modeFlags);

    void grantUriPermission__super(final String toPackage, final Uri uri, final int modeFlags);

    boolean hasWindowFocus();

    boolean hasWindowFocus__super();

    void invalidateOptionsMenu();

    void invalidateOptionsMenu__super();

    boolean isChangingConfigurations();

    boolean isChangingConfigurations__super();

    boolean isDestroyed();

    boolean isDestroyed__super();

    boolean isFinishing();

    boolean isFinishing__super();

    boolean isImmersive();

    boolean isImmersive__super();

    boolean isRestricted();

    boolean isRestricted__super();

    boolean isTaskRoot();

    boolean isTaskRoot__super();

    boolean isVoiceInteraction();

    boolean isVoiceInteractionRoot();

    boolean isVoiceInteractionRoot__super();

    boolean isVoiceInteraction__super();

    boolean moveTaskToBack(final boolean nonRoot);

    boolean moveTaskToBack__super(final boolean nonRoot);

    boolean navigateUpTo(final Intent upIntent);

    boolean navigateUpToFromChild(final Activity child, final Intent upIntent);

    boolean navigateUpToFromChild__super(final Activity child, final Intent upIntent);

    boolean navigateUpTo__super(final Intent upIntent);

    void onActionModeFinished(final android.view.ActionMode mode);

    void onActionModeFinished__super(final android.view.ActionMode mode);

    void onActionModeStarted(final android.view.ActionMode mode);

    void onActionModeStarted__super(final android.view.ActionMode mode);

    void onActivityReenter(final int resultCode, final Intent data);

    void onActivityReenter__super(final int resultCode, final Intent data);

    void onActivityResult(final int requestCode, final int resultCode, final Intent data);

    void onActivityResult__super(final int requestCode, final int resultCode, final Intent data);

    void onApplyThemeResource(final Resources.Theme theme, final int resid, final boolean first);

    void onApplyThemeResource__super(final Resources.Theme theme, final int resid,
            final boolean first);

    void onAttachFragment(final Fragment fragment);

    void onAttachFragment(final android.app.Fragment fragment);

    void onAttachFragment__super(final Fragment fragment);

    void onAttachFragment__super(final android.app.Fragment fragment);

    void onAttachedToWindow();

    void onAttachedToWindow__super();

    void onBackPressed();

    void onBackPressed__super();

    void onChildTitleChanged(final Activity childActivity, final CharSequence title);

    void onChildTitleChanged__super(final Activity childActivity, final CharSequence title);

    void onConfigurationChanged(final Configuration newConfig);

    void onConfigurationChanged__super(final Configuration newConfig);

    void onContentChanged();

    void onContentChanged__super();

    boolean onContextItemSelected(final MenuItem item);

    boolean onContextItemSelected__super(final MenuItem item);

    void onContextMenuClosed(final Menu menu);

    void onContextMenuClosed__super(final Menu menu);

    void onCreate(@Nullable final Bundle savedInstanceState);

    void onCreate(final Bundle savedInstanceState, final PersistableBundle persistentState);

    void onCreateContextMenu(final ContextMenu menu, final View v,
            final ContextMenu.ContextMenuInfo menuInfo);

    void onCreateContextMenu__super(final ContextMenu menu, final View v,
            final ContextMenu.ContextMenuInfo menuInfo);

    CharSequence onCreateDescription();

    CharSequence onCreateDescription__super();

    Dialog onCreateDialog(final int id);

    Dialog onCreateDialog(final int id, final Bundle args);

    Dialog onCreateDialog__super(final int id);

    Dialog onCreateDialog__super(final int id, final Bundle args);

    void onCreateNavigateUpTaskStack(final TaskStackBuilder builder);

    void onCreateNavigateUpTaskStack__super(final TaskStackBuilder builder);

    boolean onCreateOptionsMenu(final Menu menu);

    boolean onCreateOptionsMenu__super(final Menu menu);

    boolean onCreatePanelMenu(final int featureId, final Menu menu);

    boolean onCreatePanelMenu__super(final int featureId, final Menu menu);

    View onCreatePanelView(final int featureId);

    View onCreatePanelView__super(final int featureId);

    void onCreateSupportNavigateUpTaskStack(
            @NonNull final android.support.v4.app.TaskStackBuilder builder);

    void onCreateSupportNavigateUpTaskStack__super(
            @NonNull final android.support.v4.app.TaskStackBuilder builder);

    boolean onCreateThumbnail(final Bitmap outBitmap, final Canvas canvas);

    boolean onCreateThumbnail__super(final Bitmap outBitmap, final Canvas canvas);

    View onCreateView(final View parent, final String name, final Context context,
            final AttributeSet attrs);

    View onCreateView(final String name, final Context context, final AttributeSet attrs);

    View onCreateView__super(final View parent, final String name, final Context context,
            final AttributeSet attrs);

    View onCreateView__super(final String name, final Context context, final AttributeSet attrs);

    void onCreate__super(@Nullable final Bundle savedInstanceState);

    void onCreate__super(final Bundle savedInstanceState, final PersistableBundle persistentState);

    void onDestroy();

    void onDestroy__super();

    void onDetachedFromWindow();

    void onDetachedFromWindow__super();

    void onEnterAnimationComplete();

    void onEnterAnimationComplete__super();

    boolean onGenericMotionEvent(final MotionEvent event);

    boolean onGenericMotionEvent__super(final MotionEvent event);

    boolean onKeyDown(final int keyCode, final KeyEvent event);

    boolean onKeyDown__super(final int keyCode, final KeyEvent event);

    boolean onKeyLongPress(final int keyCode, final KeyEvent event);

    boolean onKeyLongPress__super(final int keyCode, final KeyEvent event);

    boolean onKeyMultiple(final int keyCode, final int repeatCount, final KeyEvent event);

    boolean onKeyMultiple__super(final int keyCode, final int repeatCount, final KeyEvent event);

    boolean onKeyShortcut(final int keyCode, final KeyEvent event);

    boolean onKeyShortcut__super(final int keyCode, final KeyEvent event);

    boolean onKeyUp(final int keyCode, final KeyEvent event);

    boolean onKeyUp__super(final int keyCode, final KeyEvent event);

    void onLowMemory();

    void onLowMemory__super();

    boolean onMenuOpened(final int featureId, final Menu menu);

    boolean onMenuOpened__super(final int featureId, final Menu menu);

    boolean onNavigateUp();

    boolean onNavigateUpFromChild(final Activity child);

    boolean onNavigateUpFromChild__super(final Activity child);

    boolean onNavigateUp__super();

    void onNewIntent(final Intent intent);

    void onNewIntent__super(final Intent intent);

    boolean onOptionsItemSelected(final MenuItem item);

    boolean onOptionsItemSelected__super(final MenuItem item);

    void onOptionsMenuClosed(final Menu menu);

    void onOptionsMenuClosed__super(final Menu menu);

    void onPanelClosed(final int featureId, final Menu menu);

    void onPanelClosed__super(final int featureId, final Menu menu);

    void onPause();

    void onPause__super();

    void onPostCreate(@Nullable final Bundle savedInstanceState);

    void onPostCreate(final Bundle savedInstanceState, final PersistableBundle persistentState);

    void onPostCreate__super(@Nullable final Bundle savedInstanceState);

    void onPostCreate__super(final Bundle savedInstanceState,
            final PersistableBundle persistentState);

    void onPostResume();

    void onPostResume__super();

    void onPrepareDialog(final int id, final Dialog dialog);

    void onPrepareDialog(final int id, final Dialog dialog, final Bundle args);

    void onPrepareDialog__super(final int id, final Dialog dialog);

    void onPrepareDialog__super(final int id, final Dialog dialog, final Bundle args);

    void onPrepareNavigateUpTaskStack(final TaskStackBuilder builder);

    void onPrepareNavigateUpTaskStack__super(final TaskStackBuilder builder);

    boolean onPrepareOptionsMenu(final Menu menu);

    boolean onPrepareOptionsMenu__super(final Menu menu);

    boolean onPrepareOptionsPanel(final View view, final Menu menu);

    boolean onPrepareOptionsPanel__super(final View view, final Menu menu);

    boolean onPreparePanel(final int featureId, final View view, final Menu menu);

    boolean onPreparePanel__super(final int featureId, final View view, final Menu menu);

    void onPrepareSupportNavigateUpTaskStack(
            @NonNull final android.support.v4.app.TaskStackBuilder builder);

    void onPrepareSupportNavigateUpTaskStack__super(
            @NonNull final android.support.v4.app.TaskStackBuilder builder);

    void onProvideAssistContent(final AssistContent outContent);

    void onProvideAssistContent__super(final AssistContent outContent);

    void onProvideAssistData(final Bundle data);

    void onProvideAssistData__super(final Bundle data);

    Uri onProvideReferrer();

    Uri onProvideReferrer__super();

    void onRequestPermissionsResult(final int requestCode, @NonNull final String[] permissions,
            @NonNull final int[] grantResults);

    void onRequestPermissionsResult__super(final int requestCode,
            @NonNull final String[] permissions, @NonNull final int[] grantResults);

    void onRestart();

    void onRestart__super();

    void onRestoreInstanceState(final Bundle savedInstanceState);

    void onRestoreInstanceState(final Bundle savedInstanceState,
            final PersistableBundle persistentState);

    void onRestoreInstanceState__super(final Bundle savedInstanceState);

    void onRestoreInstanceState__super(final Bundle savedInstanceState,
            final PersistableBundle persistentState);

    void onResume();

    void onResumeFragments();

    void onResumeFragments__super();

    void onResume__super();

    Object onRetainCompositeCustomNonConfigurationInstance();

    Object onRetainCustomNonConfigurationInstance();

    void onSaveInstanceState(final Bundle outState);

    void onSaveInstanceState(final Bundle outState, final PersistableBundle outPersistentState);

    void onSaveInstanceState__super(final Bundle outState);

    void onSaveInstanceState__super(final Bundle outState,
            final PersistableBundle outPersistentState);

    boolean onSearchRequested(final SearchEvent searchEvent);

    boolean onSearchRequested();

    boolean onSearchRequested__super(final SearchEvent searchEvent);

    boolean onSearchRequested__super();

    void onStart();

    void onStart__super();

    void onStateNotSaved();

    void onStateNotSaved__super();

    void onStop();

    void onStop__super();

    void onSupportActionModeFinished(@NonNull final ActionMode mode);

    void onSupportActionModeFinished__super(@NonNull final ActionMode mode);

    void onSupportActionModeStarted(@NonNull final ActionMode mode);

    void onSupportActionModeStarted__super(@NonNull final ActionMode mode);

    void onSupportContentChanged();

    void onSupportContentChanged__super();

    boolean onSupportNavigateUp();

    boolean onSupportNavigateUp__super();

    void onTitleChanged(final CharSequence title, final int color);

    void onTitleChanged__super(final CharSequence title, final int color);

    boolean onTouchEvent(final MotionEvent event);

    boolean onTouchEvent__super(final MotionEvent event);

    boolean onTrackballEvent(final MotionEvent event);

    boolean onTrackballEvent__super(final MotionEvent event);

    void onTrimMemory(final int level);

    void onTrimMemory__super(final int level);

    void onUserInteraction();

    void onUserInteraction__super();

    void onUserLeaveHint();

    void onUserLeaveHint__super();

    void onVisibleBehindCanceled();

    void onVisibleBehindCanceled__super();

    void onWindowAttributesChanged(final WindowManager.LayoutParams params);

    void onWindowAttributesChanged__super(final WindowManager.LayoutParams params);

    void onWindowFocusChanged(final boolean hasFocus);

    void onWindowFocusChanged__super(final boolean hasFocus);

    android.view.ActionMode onWindowStartingActionMode(
            final android.view.ActionMode.Callback callback);

    android.view.ActionMode onWindowStartingActionMode(
            final android.view.ActionMode.Callback callback, final int type);

    android.view.ActionMode onWindowStartingActionMode__super(
            final android.view.ActionMode.Callback callback);

    android.view.ActionMode onWindowStartingActionMode__super(
            final android.view.ActionMode.Callback callback, final int type);

    ActionMode onWindowStartingSupportActionMode(@NonNull final ActionMode.Callback callback);

    ActionMode onWindowStartingSupportActionMode__super(
            @NonNull final ActionMode.Callback callback);

    void openContextMenu(final View view);

    void openContextMenu__super(final View view);

    FileInputStream openFileInput(final String name) throws FileNotFoundException;

    FileInputStream openFileInput__super(final String name) throws FileNotFoundException;

    FileOutputStream openFileOutput(final String name, final int mode) throws FileNotFoundException;

    FileOutputStream openFileOutput__super(final String name, final int mode)
            throws FileNotFoundException;

    void openOptionsMenu();

    void openOptionsMenu__super();

    SQLiteDatabase openOrCreateDatabase(final String name, final int mode,
            final SQLiteDatabase.CursorFactory factory);

    SQLiteDatabase openOrCreateDatabase(final String name, final int mode,
            final SQLiteDatabase.CursorFactory factory, final DatabaseErrorHandler errorHandler);

    SQLiteDatabase openOrCreateDatabase__super(final String name, final int mode,
            final SQLiteDatabase.CursorFactory factory);

    SQLiteDatabase openOrCreateDatabase__super(final String name, final int mode,
            final SQLiteDatabase.CursorFactory factory, final DatabaseErrorHandler errorHandler);

    void overridePendingTransition(final int enterAnim, final int exitAnim);

    void overridePendingTransition__super(final int enterAnim, final int exitAnim);

    Drawable peekWallpaper();

    Drawable peekWallpaper__super();

    void postponeEnterTransition();

    void postponeEnterTransition__super();

    void recreate();

    void recreate__super();

    void registerComponentCallbacks(final ComponentCallbacks callback);

    void registerComponentCallbacks__super(final ComponentCallbacks callback);

    void registerForContextMenu(final View view);

    void registerForContextMenu__super(final View view);

    Intent registerReceiver(final BroadcastReceiver receiver, final IntentFilter filter);

    Intent registerReceiver(final BroadcastReceiver receiver, final IntentFilter filter,
            final String broadcastPermission, final Handler scheduler);

    Intent registerReceiver__super(final BroadcastReceiver receiver, final IntentFilter filter);

    Intent registerReceiver__super(final BroadcastReceiver receiver, final IntentFilter filter,
            final String broadcastPermission, final Handler scheduler);

    boolean releaseInstance();

    boolean releaseInstance__super();

    void removeStickyBroadcast(final Intent intent);

    void removeStickyBroadcastAsUser(final Intent intent, final UserHandle user);

    void removeStickyBroadcastAsUser__super(final Intent intent, final UserHandle user);

    void removeStickyBroadcast__super(final Intent intent);

    void reportFullyDrawn();

    void reportFullyDrawn__super();

    boolean requestVisibleBehind(final boolean visible);

    boolean requestVisibleBehind__super(final boolean visible);

    void revokeUriPermission(final Uri uri, final int modeFlags);

    void revokeUriPermission__super(final Uri uri, final int modeFlags);

    void sendBroadcast(final Intent intent);

    void sendBroadcast(final Intent intent, final String receiverPermission);

    void sendBroadcastAsUser(final Intent intent, final UserHandle user);

    void sendBroadcastAsUser(final Intent intent, final UserHandle user,
            final String receiverPermission);

    void sendBroadcastAsUser__super(final Intent intent, final UserHandle user);

    void sendBroadcastAsUser__super(final Intent intent, final UserHandle user,
            final String receiverPermission);

    void sendBroadcast__super(final Intent intent);

    void sendBroadcast__super(final Intent intent, final String receiverPermission);

    void sendOrderedBroadcast(final Intent intent, final String receiverPermission);

    void sendOrderedBroadcast(final Intent intent, final String receiverPermission,
            final BroadcastReceiver resultReceiver, final Handler scheduler, final int initialCode,
            final String initialData, final Bundle initialExtras);

    void sendOrderedBroadcastAsUser(final Intent intent, final UserHandle user,
            final String receiverPermission, final BroadcastReceiver resultReceiver,
            final Handler scheduler, final int initialCode, final String initialData,
            final Bundle initialExtras);

    void sendOrderedBroadcastAsUser__super(final Intent intent, final UserHandle user,
            final String receiverPermission, final BroadcastReceiver resultReceiver,
            final Handler scheduler, final int initialCode, final String initialData,
            final Bundle initialExtras);

    void sendOrderedBroadcast__super(final Intent intent, final String receiverPermission);

    void sendOrderedBroadcast__super(final Intent intent, final String receiverPermission,
            final BroadcastReceiver resultReceiver, final Handler scheduler, final int initialCode,
            final String initialData, final Bundle initialExtras);

    void sendStickyBroadcast(final Intent intent);

    void sendStickyBroadcastAsUser(final Intent intent, final UserHandle user);

    void sendStickyBroadcastAsUser__super(final Intent intent, final UserHandle user);

    void sendStickyBroadcast__super(final Intent intent);

    void sendStickyOrderedBroadcast(final Intent intent, final BroadcastReceiver resultReceiver,
            final Handler scheduler, final int initialCode, final String initialData,
            final Bundle initialExtras);

    void sendStickyOrderedBroadcastAsUser(final Intent intent, final UserHandle user,
            final BroadcastReceiver resultReceiver, final Handler scheduler, final int initialCode,
            final String initialData, final Bundle initialExtras);

    void sendStickyOrderedBroadcastAsUser__super(final Intent intent, final UserHandle user,
            final BroadcastReceiver resultReceiver, final Handler scheduler, final int initialCode,
            final String initialData, final Bundle initialExtras);

    void sendStickyOrderedBroadcast__super(final Intent intent,
            final BroadcastReceiver resultReceiver, final Handler scheduler, final int initialCode,
            final String initialData, final Bundle initialExtras);

    void setActionBar(final Toolbar toolbar);

    void setActionBar__super(final Toolbar toolbar);

    void setContentTransitionManager(final TransitionManager tm);

    void setContentTransitionManager__super(final TransitionManager tm);

    void setContentView(@LayoutRes final int layoutResID);

    void setContentView(final View view);

    void setContentView(final View view, final ViewGroup.LayoutParams params);

    void setContentView__super(@LayoutRes final int layoutResID);

    void setContentView__super(final View view);

    void setContentView__super(final View view, final ViewGroup.LayoutParams params);

    void setEnterSharedElementCallback(final SharedElementCallback callback);

    void setEnterSharedElementCallback(final android.app.SharedElementCallback callback);

    void setEnterSharedElementCallback__super(final SharedElementCallback callback);

    void setEnterSharedElementCallback__super(final android.app.SharedElementCallback callback);

    void setExitSharedElementCallback(final SharedElementCallback listener);

    void setExitSharedElementCallback(final android.app.SharedElementCallback callback);

    void setExitSharedElementCallback__super(final SharedElementCallback listener);

    void setExitSharedElementCallback__super(final android.app.SharedElementCallback callback);

    void setFinishOnTouchOutside(final boolean finish);

    void setFinishOnTouchOutside__super(final boolean finish);

    void setImmersive(final boolean i);

    void setImmersive__super(final boolean i);

    void setIntent(final Intent newIntent);

    void setIntent__super(final Intent newIntent);

    void setRequestedOrientation(final int requestedOrientation);

    void setRequestedOrientation__super(final int requestedOrientation);

    void setSupportActionBar(@Nullable final android.support.v7.widget.Toolbar toolbar);

    void setSupportActionBar__super(@Nullable final android.support.v7.widget.Toolbar toolbar);

    void setSupportProgress(final int progress);

    void setSupportProgressBarIndeterminate(final boolean indeterminate);

    void setSupportProgressBarIndeterminateVisibility(final boolean visible);

    void setSupportProgressBarIndeterminateVisibility__super(final boolean visible);

    void setSupportProgressBarIndeterminate__super(final boolean indeterminate);

    void setSupportProgressBarVisibility(final boolean visible);

    void setSupportProgressBarVisibility__super(final boolean visible);

    void setSupportProgress__super(final int progress);

    void setTaskDescription(final ActivityManager.TaskDescription taskDescription);

    void setTaskDescription__super(final ActivityManager.TaskDescription taskDescription);

    void setTheme(@StyleRes final int resid);

    void setTheme__super(@StyleRes final int resid);

    void setTitle(final CharSequence title);

    void setTitle(final int titleId);

    void setTitleColor(final int textColor);

    void setTitleColor__super(final int textColor);

    void setTitle__super(final CharSequence title);

    void setTitle__super(final int titleId);

    void setVisible(final boolean visible);

    void setVisible__super(final boolean visible);

    void setWallpaper(final Bitmap bitmap) throws IOException;

    void setWallpaper(final InputStream data) throws IOException;

    void setWallpaper__super(final Bitmap bitmap) throws IOException;

    void setWallpaper__super(final InputStream data) throws IOException;

    boolean shouldShowRequestPermissionRationale(@NonNull final String permission);

    boolean shouldShowRequestPermissionRationale__super(@NonNull final String permission);

    boolean shouldUpRecreateTask(final Intent targetIntent);

    boolean shouldUpRecreateTask__super(final Intent targetIntent);

    boolean showAssist(final Bundle args);

    boolean showAssist__super(final Bundle args);

    void showLockTaskEscapeMessage();

    void showLockTaskEscapeMessage__super();

    android.view.ActionMode startActionMode(final android.view.ActionMode.Callback callback);

    android.view.ActionMode startActionMode(final android.view.ActionMode.Callback callback,
            final int type);

    android.view.ActionMode startActionMode__super(final android.view.ActionMode.Callback callback);

    android.view.ActionMode startActionMode__super(final android.view.ActionMode.Callback callback,
            final int type);

    void startActivities(final Intent[] intents);

    void startActivities(final Intent[] intents, final Bundle options);

    void startActivities__super(final Intent[] intents);

    void startActivities__super(final Intent[] intents, final Bundle options);

    void startActivity(final Intent intent);

    void startActivity(final Intent intent, final Bundle options);

    void startActivityForResult(final Intent intent, final int requestCode);

    void startActivityForResult(final Intent intent, final int requestCode, final Bundle options);

    void startActivityForResult__super(final Intent intent, final int requestCode);

    void startActivityForResult__super(final Intent intent, final int requestCode,
            final Bundle options);

    void startActivityFromChild(@NonNull final Activity child, final Intent intent,
            final int requestCode);

    void startActivityFromChild(@NonNull final Activity child, final Intent intent,
            final int requestCode, final Bundle options);

    void startActivityFromChild__super(@NonNull final Activity child, final Intent intent,
            final int requestCode);

    void startActivityFromChild__super(@NonNull final Activity child, final Intent intent,
            final int requestCode, final Bundle options);

    void startActivityFromFragment(final Fragment fragment, final Intent intent,
            final int requestCode);

    void startActivityFromFragment(final Fragment fragment, final Intent intent,
            final int requestCode, @Nullable final Bundle options);

    void startActivityFromFragment(@NonNull final android.app.Fragment fragment,
            final Intent intent, final int requestCode);

    void startActivityFromFragment(@NonNull final android.app.Fragment fragment,
            final Intent intent, final int requestCode, final Bundle options);

    void startActivityFromFragment__super(final Fragment fragment, final Intent intent,
            final int requestCode);

    void startActivityFromFragment__super(final Fragment fragment, final Intent intent,
            final int requestCode, @Nullable final Bundle options);

    void startActivityFromFragment__super(@NonNull final android.app.Fragment fragment,
            final Intent intent, final int requestCode);

    void startActivityFromFragment__super(@NonNull final android.app.Fragment fragment,
            final Intent intent, final int requestCode, final Bundle options);

    boolean startActivityIfNeeded(@NonNull final Intent intent, final int requestCode);

    boolean startActivityIfNeeded(@NonNull final Intent intent, final int requestCode,
            final Bundle options);

    boolean startActivityIfNeeded__super(@NonNull final Intent intent, final int requestCode);

    boolean startActivityIfNeeded__super(@NonNull final Intent intent, final int requestCode,
            final Bundle options);

    void startActivity__super(final Intent intent);

    void startActivity__super(final Intent intent, final Bundle options);

    boolean startInstrumentation(final ComponentName className, final String profileFile,
            final Bundle arguments);

    boolean startInstrumentation__super(final ComponentName className, final String profileFile,
            final Bundle arguments);

    void startIntentSender(final IntentSender intent, final Intent fillInIntent,
            final int flagsMask, final int flagsValues, final int extraFlags)
            throws IntentSender.SendIntentException;

    void startIntentSender(final IntentSender intent, final Intent fillInIntent,
            final int flagsMask, final int flagsValues, final int extraFlags, final Bundle options)
            throws IntentSender.SendIntentException;

    void startIntentSenderForResult(final IntentSender intent, final int requestCode,
            final Intent fillInIntent, final int flagsMask, final int flagsValues,
            final int extraFlags) throws IntentSender.SendIntentException;

    void startIntentSenderForResult(final IntentSender intent, final int requestCode,
            final Intent fillInIntent, final int flagsMask, final int flagsValues,
            final int extraFlags, final Bundle options) throws IntentSender.SendIntentException;

    void startIntentSenderForResult__super(final IntentSender intent, final int requestCode,
            final Intent fillInIntent, final int flagsMask, final int flagsValues,
            final int extraFlags) throws IntentSender.SendIntentException;

    void startIntentSenderForResult__super(final IntentSender intent, final int requestCode,
            final Intent fillInIntent, final int flagsMask, final int flagsValues,
            final int extraFlags, final Bundle options) throws IntentSender.SendIntentException;

    void startIntentSenderFromChild(final Activity child, final IntentSender intent,
            final int requestCode, final Intent fillInIntent, final int flagsMask,
            final int flagsValues, final int extraFlags) throws IntentSender.SendIntentException;

    void startIntentSenderFromChild(final Activity child, final IntentSender intent,
            final int requestCode, final Intent fillInIntent, final int flagsMask,
            final int flagsValues, final int extraFlags, final Bundle options)
            throws IntentSender.SendIntentException;

    void startIntentSenderFromChild__super(final Activity child, final IntentSender intent,
            final int requestCode, final Intent fillInIntent, final int flagsMask,
            final int flagsValues, final int extraFlags) throws IntentSender.SendIntentException;

    void startIntentSenderFromChild__super(final Activity child, final IntentSender intent,
            final int requestCode, final Intent fillInIntent, final int flagsMask,
            final int flagsValues, final int extraFlags, final Bundle options)
            throws IntentSender.SendIntentException;

    void startIntentSender__super(final IntentSender intent, final Intent fillInIntent,
            final int flagsMask, final int flagsValues, final int extraFlags)
            throws IntentSender.SendIntentException;

    void startIntentSender__super(final IntentSender intent, final Intent fillInIntent,
            final int flagsMask, final int flagsValues, final int extraFlags, final Bundle options)
            throws IntentSender.SendIntentException;

    void startLockTask();

    void startLockTask__super();

    void startManagingCursor(final Cursor c);

    void startManagingCursor__super(final Cursor c);

    boolean startNextMatchingActivity(@NonNull final Intent intent);

    boolean startNextMatchingActivity(@NonNull final Intent intent, final Bundle options);

    boolean startNextMatchingActivity__super(@NonNull final Intent intent);

    boolean startNextMatchingActivity__super(@NonNull final Intent intent, final Bundle options);

    void startPostponedEnterTransition();

    void startPostponedEnterTransition__super();

    void startSearch(final String initialQuery, final boolean selectInitialQuery,
            final Bundle appSearchData, final boolean globalSearch);

    void startSearch__super(final String initialQuery, final boolean selectInitialQuery,
            final Bundle appSearchData, final boolean globalSearch);

    ComponentName startService(final Intent service);

    ComponentName startService__super(final Intent service);

    ActionMode startSupportActionMode(@NonNull final ActionMode.Callback callback);

    ActionMode startSupportActionMode__super(@NonNull final ActionMode.Callback callback);

    void stopLockTask();

    void stopLockTask__super();

    void stopManagingCursor(final Cursor c);

    void stopManagingCursor__super(final Cursor c);

    boolean stopService(final Intent name);

    boolean stopService__super(final Intent name);

    void supportFinishAfterTransition();

    void supportFinishAfterTransition__super();

    void supportInvalidateOptionsMenu();

    void supportInvalidateOptionsMenu__super();

    void supportNavigateUpTo(@NonNull final Intent upIntent);

    void supportNavigateUpTo__super(@NonNull final Intent upIntent);

    void supportPostponeEnterTransition();

    void supportPostponeEnterTransition__super();

    boolean supportRequestWindowFeature(final int featureId);

    boolean supportRequestWindowFeature__super(final int featureId);

    boolean supportShouldUpRecreateTask(@NonNull final Intent targetIntent);

    boolean supportShouldUpRecreateTask__super(@NonNull final Intent targetIntent);

    void supportStartPostponedEnterTransition();

    void supportStartPostponedEnterTransition__super();

    void takeKeyEvents(final boolean get);

    void takeKeyEvents__super(final boolean get);

    void triggerSearch(final String query, final Bundle appSearchData);

    void triggerSearch__super(final String query, final Bundle appSearchData);

    void unbindService(final ServiceConnection conn);

    void unbindService__super(final ServiceConnection conn);

    void unregisterComponentCallbacks(final ComponentCallbacks callback);

    void unregisterComponentCallbacks__super(final ComponentCallbacks callback);

    void unregisterForContextMenu(final View view);

    void unregisterForContextMenu__super(final View view);

    void unregisterReceiver(final BroadcastReceiver receiver);

    void unregisterReceiver__super(final BroadcastReceiver receiver);
}
