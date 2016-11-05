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
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
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
import java.util.List;

public interface ICompositeActivity
        extends LayoutInflater.Factory2, Window.Callback, KeyEvent.Callback,
        View.OnCreateContextMenuListener, ComponentCallbacks2,
        ActivityCompat.OnRequestPermissionsResultCallback, AppCompatCallback,
        ActionBarDrawerToggle.DelegateProvider {


    void addContentView(View view, ViewGroup.LayoutParams params);

    void applyOverrideConfiguration(Configuration overrideConfiguration);

    void attachBaseContext(Context newBase);

    boolean bindService(Intent service, ServiceConnection conn, int flags);

    int checkCallingOrSelfPermission(String permission);

    int checkCallingOrSelfUriPermission(Uri uri, int modeFlags);

    int checkCallingPermission(String permission);

    int checkCallingUriPermission(Uri uri, int modeFlags);

    int checkPermission(String permission, int pid, int uid);

    int checkSelfPermission(String permission);

    int checkUriPermission(Uri uri, int pid, int uid, int modeFlags);

    int checkUriPermission(Uri uri, String readPermission, String writePermission, int pid, int uid,
            int modeFlags);

    void clearWallpaper() throws IOException;

    void closeContextMenu();

    void closeOptionsMenu();

    Context createConfigurationContext(Configuration overrideConfiguration);

    Context createDeviceProtectedStorageContext();

    Context createDisplayContext(Display display);

    Context createPackageContext(String packageName, int flags)
            throws PackageManager.NameNotFoundException;

    PendingIntent createPendingResult(int requestCode, Intent data, int flags);

    String[] databaseList();

    boolean deleteDatabase(String name);

    boolean deleteFile(String name);

    boolean deleteSharedPreferences(String name);

    boolean dispatchGenericMotionEvent(MotionEvent ev);

    boolean dispatchKeyEvent(KeyEvent event);

    boolean dispatchKeyShortcutEvent(KeyEvent event);

    boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event);

    boolean dispatchTouchEvent(MotionEvent ev);

    boolean dispatchTrackballEvent(MotionEvent ev);

    void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args);

    void enforceCallingOrSelfPermission(String permission, String message);

    void enforceCallingOrSelfUriPermission(Uri uri, int modeFlags, String message);

    void enforceCallingPermission(String permission, String message);

    void enforceCallingUriPermission(Uri uri, int modeFlags, String message);

    void enforcePermission(String permission, int pid, int uid, String message);

    void enforceUriPermission(Uri uri, int pid, int uid, int modeFlags, String message);

    void enforceUriPermission(Uri uri, String readPermission, String writePermission, int pid,
            int uid, int modeFlags, String message);

    void enterPictureInPictureMode();

    String[] fileList();

    View findViewById(@IdRes int id);

    void finish();

    void finishActivity(int requestCode);

    void finishActivityFromChild(Activity child, int requestCode);

    void finishAffinity();

    void finishAfterTransition();

    void finishAndRemoveTask();

    void finishFromChild(Activity child);

    android.app.ActionBar getActionBar();

    Context getApplicationContext();

    ApplicationInfo getApplicationInfo();

    AssetManager getAssets();

    Context getBaseContext();

    File getCacheDir();

    ComponentName getCallingActivity();

    String getCallingPackage();

    int getChangingConfigurations();

    ClassLoader getClassLoader();

    File getCodeCacheDir();

    ComponentName getComponentName();

    ContentResolver getContentResolver();

    Scene getContentScene();

    TransitionManager getContentTransitionManager();

    View getCurrentFocus();

    File getDataDir();

    File getDatabasePath(String name);

    AppCompatDelegate getDelegate();

    File getDir(String name, int mode);

    ActionBarDrawerToggle.Delegate getDrawerToggleDelegate();

    File getExternalCacheDir();

    File[] getExternalCacheDirs();

    File getExternalFilesDir(String type);

    File[] getExternalFilesDirs(String type);

    File[] getExternalMediaDirs();

    File getFileStreamPath(String name);

    File getFilesDir();

    android.app.FragmentManager getFragmentManager();

    Intent getIntent();

    Object getLastCompositeCustomNonConfigurationInstance();

    Object getLastCustomNonConfigurationInstance();

    Object getLastNonConfigurationInstance();

    LayoutInflater getLayoutInflater();

    android.app.LoaderManager getLoaderManager();

    String getLocalClassName();

    Looper getMainLooper();

    MenuInflater getMenuInflater();

    File getNoBackupFilesDir();

    File getObbDir();

    File[] getObbDirs();

    String getPackageCodePath();

    PackageManager getPackageManager();

    String getPackageName();

    String getPackageResourcePath();

    Intent getParentActivityIntent();

    SharedPreferences getPreferences(int mode);

    Uri getReferrer();

    int getRequestedOrientation();

    Resources getResources();

    SharedPreferences getSharedPreferences(String name, int mode);

    ActionBar getSupportActionBar();

    FragmentManager getSupportFragmentManager();

    LoaderManager getSupportLoaderManager();

    Intent getSupportParentActivityIntent();

    Object getSystemService(String name);

    String getSystemServiceName(Class<?> serviceClass);

    int getTaskId();

    Resources.Theme getTheme();

    VoiceInteractor getVoiceInteractor();

    Drawable getWallpaper();

    int getWallpaperDesiredMinimumHeight();

    int getWallpaperDesiredMinimumWidth();

    Window getWindow();

    WindowManager getWindowManager();

    void grantUriPermission(String toPackage, Uri uri, int modeFlags);

    boolean hasWindowFocus();

    void invalidateOptionsMenu();

    boolean isChangingConfigurations();

    boolean isDestroyed();

    boolean isDeviceProtectedStorage();

    boolean isFinishing();

    boolean isImmersive();

    boolean isInMultiWindowMode();

    boolean isInPictureInPictureMode();

    boolean isLocalVoiceInteractionSupported();

    boolean isRestricted();

    boolean isTaskRoot();

    boolean isVoiceInteraction();

    boolean isVoiceInteractionRoot();

    boolean moveDatabaseFrom(Context sourceContext, String name);

    boolean moveSharedPreferencesFrom(Context sourceContext, String name);

    boolean moveTaskToBack(boolean nonRoot);

    boolean navigateUpTo(Intent upIntent);

    boolean navigateUpToFromChild(Activity child, Intent upIntent);

    void onActionModeFinished(android.view.ActionMode mode);

    void onActionModeStarted(android.view.ActionMode mode);

    void onActivityReenter(int resultCode, Intent data);

    void onActivityResult(int requestCode, int resultCode, Intent data);

    void onApplyThemeResource(Resources.Theme theme, int resid, boolean first);

    void onAttachFragment(Fragment fragment);

    void onAttachFragment(android.app.Fragment fragment);

    void onAttachedToWindow();

    void onBackPressed();

    void onChildTitleChanged(Activity childActivity, CharSequence title);

    void onConfigurationChanged(Configuration newConfig);

    void onContentChanged();

    boolean onContextItemSelected(MenuItem item);

    void onContextMenuClosed(Menu menu);

    void onCreate(Bundle savedInstanceState, PersistableBundle persistentState);

    void onCreate(@Nullable Bundle savedInstanceState);

    void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo);

    CharSequence onCreateDescription();

    Dialog onCreateDialog(int id);

    Dialog onCreateDialog(int id, Bundle args);

    void onCreateNavigateUpTaskStack(TaskStackBuilder builder);

    boolean onCreateOptionsMenu(Menu menu);

    boolean onCreatePanelMenu(int featureId, Menu menu);

    View onCreatePanelView(int featureId);

    void onCreateSupportNavigateUpTaskStack(
            @NonNull android.support.v4.app.TaskStackBuilder builder);

    boolean onCreateThumbnail(Bitmap outBitmap, Canvas canvas);

    View onCreateView(View parent, String name, Context context, AttributeSet attrs);

    View onCreateView(String name, Context context, AttributeSet attrs);

    void onDestroy();

    void onDetachedFromWindow();

    void onEnterAnimationComplete();

    boolean onGenericMotionEvent(MotionEvent event);

    boolean onKeyDown(int keyCode, KeyEvent event);

    boolean onKeyLongPress(int keyCode, KeyEvent event);

    boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event);

    boolean onKeyShortcut(int keyCode, KeyEvent event);

    boolean onKeyUp(int keyCode, KeyEvent event);

    void onLocalVoiceInteractionStarted();

    void onLocalVoiceInteractionStopped();

    void onLowMemory();

    boolean onMenuOpened(int featureId, Menu menu);

    void onMultiWindowModeChanged(boolean isInMultiWindowMode);

    boolean onNavigateUp();

    boolean onNavigateUpFromChild(Activity child);

    void onNewIntent(Intent intent);

    boolean onOptionsItemSelected(MenuItem item);

    void onOptionsMenuClosed(Menu menu);

    void onPanelClosed(int featureId, Menu menu);

    void onPause();

    void onPictureInPictureModeChanged(boolean isInPictureInPictureMode);

    void onPostCreate(Bundle savedInstanceState, PersistableBundle persistentState);

    void onPostCreate(@Nullable Bundle savedInstanceState);

    void onPostResume();

    void onPrepareDialog(int id, Dialog dialog);

    void onPrepareDialog(int id, Dialog dialog, Bundle args);

    void onPrepareNavigateUpTaskStack(TaskStackBuilder builder);

    boolean onPrepareOptionsMenu(Menu menu);

    boolean onPrepareOptionsPanel(View view, Menu menu);

    boolean onPreparePanel(int featureId, View view, Menu menu);

    void onPrepareSupportNavigateUpTaskStack(
            @NonNull android.support.v4.app.TaskStackBuilder builder);

    void onProvideAssistContent(AssistContent outContent);

    void onProvideAssistData(Bundle data);

    void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> data, Menu menu, int deviceId);

    Uri onProvideReferrer();

    void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
            @NonNull int[] grantResults);

    void onRestart();

    void onRestoreInstanceState(Bundle savedInstanceState, PersistableBundle persistentState);

    void onRestoreInstanceState(Bundle savedInstanceState);

    void onResume();

    void onResumeFragments();

    Object onRetainCompositeCustomNonConfigurationInstance();

    Object onRetainCustomNonConfigurationInstance();

    void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState);

    void onSaveInstanceState(Bundle outState);

    boolean onSearchRequested(SearchEvent searchEvent);

    boolean onSearchRequested();

    void onStart();

    void onStateNotSaved();

    void onStop();

    void onSupportActionModeFinished(@NonNull ActionMode mode);

    void onSupportActionModeStarted(@NonNull ActionMode mode);

    void onSupportContentChanged();

    boolean onSupportNavigateUp();

    void onTitleChanged(CharSequence title, int color);

    boolean onTouchEvent(MotionEvent event);

    boolean onTrackballEvent(MotionEvent event);

    void onTrimMemory(int level);

    void onUserInteraction();

    void onUserLeaveHint();

    void onVisibleBehindCanceled();

    void onWindowAttributesChanged(WindowManager.LayoutParams params);

    void onWindowFocusChanged(boolean hasFocus);

    android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback);

    android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback,
            int type);

    ActionMode onWindowStartingSupportActionMode(@NonNull ActionMode.Callback callback);

    void openContextMenu(View view);

    FileInputStream openFileInput(String name) throws FileNotFoundException;

    FileOutputStream openFileOutput(String name, int mode) throws FileNotFoundException;

    void openOptionsMenu();

    SQLiteDatabase openOrCreateDatabase(String name, int mode,
            SQLiteDatabase.CursorFactory factory);

    SQLiteDatabase openOrCreateDatabase(String name, int mode, SQLiteDatabase.CursorFactory factory,
            DatabaseErrorHandler errorHandler);

    void overridePendingTransition(int enterAnim, int exitAnim);

    Drawable peekWallpaper();

    void postponeEnterTransition();

    void recreate();

    void registerComponentCallbacks(ComponentCallbacks callback);

    void registerForContextMenu(View view);

    Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter);

    Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter,
            String broadcastPermission, Handler scheduler);

    boolean releaseInstance();

    void removeStickyBroadcast(Intent intent);

    void removeStickyBroadcastAsUser(Intent intent, UserHandle user);

    void reportFullyDrawn();

    DragAndDropPermissions requestDragAndDropPermissions(DragEvent event);

    boolean requestVisibleBehind(boolean visible);

    void revokeUriPermission(Uri uri, int modeFlags);

    void sendBroadcast(Intent intent);

    void sendBroadcast(Intent intent, String receiverPermission);

    void sendBroadcastAsUser(Intent intent, UserHandle user);

    void sendBroadcastAsUser(Intent intent, UserHandle user, String receiverPermission);

    void sendOrderedBroadcast(Intent intent, String receiverPermission);

    void sendOrderedBroadcast(Intent intent, String receiverPermission,
            BroadcastReceiver resultReceiver, Handler scheduler, int initialCode,
            String initialData, Bundle initialExtras);

    void sendOrderedBroadcastAsUser(Intent intent, UserHandle user, String receiverPermission,
            BroadcastReceiver resultReceiver, Handler scheduler, int initialCode,
            String initialData, Bundle initialExtras);

    void sendStickyBroadcast(Intent intent);

    void sendStickyBroadcastAsUser(Intent intent, UserHandle user);

    void sendStickyOrderedBroadcast(Intent intent, BroadcastReceiver resultReceiver,
            Handler scheduler, int initialCode, String initialData, Bundle initialExtras);

    void sendStickyOrderedBroadcastAsUser(Intent intent, UserHandle user,
            BroadcastReceiver resultReceiver, Handler scheduler, int initialCode,
            String initialData, Bundle initialExtras);

    void setActionBar(Toolbar toolbar);

    void setContentTransitionManager(TransitionManager tm);

    void setContentView(@LayoutRes int layoutResID);

    void setContentView(View view);

    void setContentView(View view, ViewGroup.LayoutParams params);

    void setEnterSharedElementCallback(SharedElementCallback callback);

    void setEnterSharedElementCallback(android.app.SharedElementCallback callback);

    void setExitSharedElementCallback(SharedElementCallback listener);

    void setExitSharedElementCallback(android.app.SharedElementCallback callback);

    void setFinishOnTouchOutside(boolean finish);

    void setImmersive(boolean i);

    void setIntent(Intent newIntent);

    void setRequestedOrientation(int requestedOrientation);

    void setSupportActionBar(@Nullable android.support.v7.widget.Toolbar toolbar);

    void setSupportProgress(int progress);

    void setSupportProgressBarIndeterminate(boolean indeterminate);

    void setSupportProgressBarIndeterminateVisibility(boolean visible);

    void setSupportProgressBarVisibility(boolean visible);

    void setTaskDescription(ActivityManager.TaskDescription taskDescription);

    void setTheme(@StyleRes int resid);

    void setTitle(CharSequence title);

    void setTitle(int titleId);

    void setTitleColor(int textColor);

    void setVisible(boolean visible);

    void setVrModeEnabled(boolean enabled, ComponentName requestedComponent)
            throws PackageManager.NameNotFoundException;

    void setWallpaper(Bitmap bitmap) throws IOException;

    void setWallpaper(InputStream data) throws IOException;

    boolean shouldShowRequestPermissionRationale(String permission);

    boolean shouldUpRecreateTask(Intent targetIntent);

    boolean showAssist(Bundle args);

    void showLockTaskEscapeMessage();

    android.view.ActionMode startActionMode(android.view.ActionMode.Callback callback);

    android.view.ActionMode startActionMode(android.view.ActionMode.Callback callback, int type);

    void startActivities(Intent[] intents);

    void startActivities(Intent[] intents, Bundle options);

    void startActivity(Intent intent);

    void startActivity(Intent intent, Bundle options);

    void startActivityForResult(Intent intent, int requestCode);

    void startActivityForResult(Intent intent, int requestCode, @Nullable Bundle options);

    void startActivityFromChild(Activity child, Intent intent, int requestCode);

    void startActivityFromChild(Activity child, Intent intent, int requestCode, Bundle options);

    void startActivityFromFragment(Fragment fragment, Intent intent, int requestCode);

    void startActivityFromFragment(Fragment fragment, Intent intent, int requestCode,
            @Nullable Bundle options);

    void startActivityFromFragment(android.app.Fragment fragment, Intent intent, int requestCode);

    void startActivityFromFragment(android.app.Fragment fragment, Intent intent, int requestCode,
            Bundle options);

    boolean startActivityIfNeeded(Intent intent, int requestCode);

    boolean startActivityIfNeeded(Intent intent, int requestCode, Bundle options);

    boolean startInstrumentation(ComponentName className, String profileFile, Bundle arguments);

    void startIntentSender(IntentSender intent, Intent fillInIntent, int flagsMask, int flagsValues,
            int extraFlags) throws IntentSender.SendIntentException;

    void startIntentSender(IntentSender intent, Intent fillInIntent, int flagsMask, int flagsValues,
            int extraFlags, Bundle options) throws IntentSender.SendIntentException;

    void startIntentSenderForResult(IntentSender intent, int requestCode,
            @Nullable Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags,
            Bundle options) throws IntentSender.SendIntentException;

    void startIntentSenderForResult(IntentSender intent, int requestCode,
            @Nullable Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags)
            throws IntentSender.SendIntentException;

    void startIntentSenderFromChild(Activity child, IntentSender intent, int requestCode,
            Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags)
            throws IntentSender.SendIntentException;

    void startIntentSenderFromChild(Activity child, IntentSender intent, int requestCode,
            Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options)
            throws IntentSender.SendIntentException;

    void startIntentSenderFromFragment(Fragment fragment, IntentSender intent, int requestCode,
            @Nullable Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags,
            Bundle options) throws IntentSender.SendIntentException;

    void startLocalVoiceInteraction(Bundle privateOptions);

    void startLockTask();

    void startManagingCursor(Cursor c);

    boolean startNextMatchingActivity(Intent intent);

    boolean startNextMatchingActivity(Intent intent, Bundle options);

    void startPostponedEnterTransition();

    void startSearch(String initialQuery, boolean selectInitialQuery, Bundle appSearchData,
            boolean globalSearch);

    ComponentName startService(Intent service);

    ActionMode startSupportActionMode(@NonNull ActionMode.Callback callback);

    void stopLocalVoiceInteraction();

    void stopLockTask();

    void stopManagingCursor(Cursor c);

    boolean stopService(Intent name);

    void super_addContentView(View view, ViewGroup.LayoutParams params);

    void super_applyOverrideConfiguration(Configuration overrideConfiguration);

    void super_attachBaseContext(Context newBase);

    boolean super_bindService(Intent service, ServiceConnection conn, int flags);

    int super_checkCallingOrSelfPermission(String permission);

    int super_checkCallingOrSelfUriPermission(Uri uri, int modeFlags);

    int super_checkCallingPermission(String permission);

    int super_checkCallingUriPermission(Uri uri, int modeFlags);

    int super_checkPermission(String permission, int pid, int uid);

    int super_checkSelfPermission(String permission);

    int super_checkUriPermission(Uri uri, int pid, int uid, int modeFlags);

    int super_checkUriPermission(Uri uri, String readPermission, String writePermission, int pid,
            int uid, int modeFlags);

    void super_clearWallpaper() throws IOException;

    void super_closeContextMenu();

    void super_closeOptionsMenu();

    Context super_createConfigurationContext(Configuration overrideConfiguration);

    Context super_createDeviceProtectedStorageContext();

    Context super_createDisplayContext(Display display);

    Context super_createPackageContext(String packageName, int flags)
            throws PackageManager.NameNotFoundException;

    PendingIntent super_createPendingResult(int requestCode, Intent data, int flags);

    String[] super_databaseList();

    boolean super_deleteDatabase(String name);

    boolean super_deleteFile(String name);

    boolean super_deleteSharedPreferences(String name);

    boolean super_dispatchGenericMotionEvent(MotionEvent ev);

    boolean super_dispatchKeyEvent(KeyEvent event);

    boolean super_dispatchKeyShortcutEvent(KeyEvent event);

    boolean super_dispatchPopulateAccessibilityEvent(AccessibilityEvent event);

    boolean super_dispatchTouchEvent(MotionEvent ev);

    boolean super_dispatchTrackballEvent(MotionEvent ev);

    void super_dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args);

    void super_enforceCallingOrSelfPermission(String permission, String message);

    void super_enforceCallingOrSelfUriPermission(Uri uri, int modeFlags, String message);

    void super_enforceCallingPermission(String permission, String message);

    void super_enforceCallingUriPermission(Uri uri, int modeFlags, String message);

    void super_enforcePermission(String permission, int pid, int uid, String message);

    void super_enforceUriPermission(Uri uri, int pid, int uid, int modeFlags, String message);

    void super_enforceUriPermission(Uri uri, String readPermission, String writePermission, int pid,
            int uid, int modeFlags, String message);

    void super_enterPictureInPictureMode();

    String[] super_fileList();

    View super_findViewById(@IdRes int id);

    void super_finish();

    void super_finishActivity(int requestCode);

    void super_finishActivityFromChild(Activity child, int requestCode);

    void super_finishAffinity();

    void super_finishAfterTransition();

    void super_finishAndRemoveTask();

    void super_finishFromChild(Activity child);

    android.app.ActionBar super_getActionBar();

    Context super_getApplicationContext();

    ApplicationInfo super_getApplicationInfo();

    AssetManager super_getAssets();

    Context super_getBaseContext();

    File super_getCacheDir();

    ComponentName super_getCallingActivity();

    String super_getCallingPackage();

    int super_getChangingConfigurations();

    ClassLoader super_getClassLoader();

    File super_getCodeCacheDir();

    ComponentName super_getComponentName();

    ContentResolver super_getContentResolver();

    Scene super_getContentScene();

    TransitionManager super_getContentTransitionManager();

    View super_getCurrentFocus();

    File super_getDataDir();

    File super_getDatabasePath(String name);

    AppCompatDelegate super_getDelegate();

    File super_getDir(String name, int mode);

    ActionBarDrawerToggle.Delegate super_getDrawerToggleDelegate();

    File super_getExternalCacheDir();

    File[] super_getExternalCacheDirs();

    File super_getExternalFilesDir(String type);

    File[] super_getExternalFilesDirs(String type);

    File[] super_getExternalMediaDirs();

    File super_getFileStreamPath(String name);

    File super_getFilesDir();

    android.app.FragmentManager super_getFragmentManager();

    Intent super_getIntent();

    LayoutInflater super_getLayoutInflater();

    android.app.LoaderManager super_getLoaderManager();

    String super_getLocalClassName();

    Looper super_getMainLooper();

    MenuInflater super_getMenuInflater();

    File super_getNoBackupFilesDir();

    File super_getObbDir();

    File[] super_getObbDirs();

    String super_getPackageCodePath();

    PackageManager super_getPackageManager();

    String super_getPackageName();

    String super_getPackageResourcePath();

    Intent super_getParentActivityIntent();

    SharedPreferences super_getPreferences(int mode);

    Uri super_getReferrer();

    int super_getRequestedOrientation();

    Resources super_getResources();

    SharedPreferences super_getSharedPreferences(String name, int mode);

    ActionBar super_getSupportActionBar();

    FragmentManager super_getSupportFragmentManager();

    LoaderManager super_getSupportLoaderManager();

    Intent super_getSupportParentActivityIntent();

    Object super_getSystemService(String name);

    String super_getSystemServiceName(Class<?> serviceClass);

    int super_getTaskId();

    Resources.Theme super_getTheme();

    VoiceInteractor super_getVoiceInteractor();

    Drawable super_getWallpaper();

    int super_getWallpaperDesiredMinimumHeight();

    int super_getWallpaperDesiredMinimumWidth();

    Window super_getWindow();

    WindowManager super_getWindowManager();

    void super_grantUriPermission(String toPackage, Uri uri, int modeFlags);

    boolean super_hasWindowFocus();

    void super_invalidateOptionsMenu();

    boolean super_isChangingConfigurations();

    boolean super_isDestroyed();

    boolean super_isDeviceProtectedStorage();

    boolean super_isFinishing();

    boolean super_isImmersive();

    boolean super_isInMultiWindowMode();

    boolean super_isInPictureInPictureMode();

    boolean super_isLocalVoiceInteractionSupported();

    boolean super_isRestricted();

    boolean super_isTaskRoot();

    boolean super_isVoiceInteraction();

    boolean super_isVoiceInteractionRoot();

    boolean super_moveDatabaseFrom(Context sourceContext, String name);

    boolean super_moveSharedPreferencesFrom(Context sourceContext, String name);

    boolean super_moveTaskToBack(boolean nonRoot);

    boolean super_navigateUpTo(Intent upIntent);

    boolean super_navigateUpToFromChild(Activity child, Intent upIntent);

    void super_onActionModeFinished(android.view.ActionMode mode);

    void super_onActionModeStarted(android.view.ActionMode mode);

    void super_onActivityReenter(int resultCode, Intent data);

    void super_onActivityResult(int requestCode, int resultCode, Intent data);

    void super_onApplyThemeResource(Resources.Theme theme, int resid, boolean first);

    void super_onAttachFragment(Fragment fragment);

    void super_onAttachFragment(android.app.Fragment fragment);

    void super_onAttachedToWindow();

    void super_onBackPressed();

    void super_onChildTitleChanged(Activity childActivity, CharSequence title);

    void super_onConfigurationChanged(Configuration newConfig);

    void super_onContentChanged();

    boolean super_onContextItemSelected(MenuItem item);

    void super_onContextMenuClosed(Menu menu);

    void super_onCreate(Bundle savedInstanceState, PersistableBundle persistentState);

    void super_onCreate(@Nullable Bundle savedInstanceState);

    void super_onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo);

    CharSequence super_onCreateDescription();

    Dialog super_onCreateDialog(int id);

    Dialog super_onCreateDialog(int id, Bundle args);

    void super_onCreateNavigateUpTaskStack(TaskStackBuilder builder);

    boolean super_onCreateOptionsMenu(Menu menu);

    boolean super_onCreatePanelMenu(int featureId, Menu menu);

    View super_onCreatePanelView(int featureId);

    void super_onCreateSupportNavigateUpTaskStack(
            @NonNull android.support.v4.app.TaskStackBuilder builder);

    boolean super_onCreateThumbnail(Bitmap outBitmap, Canvas canvas);

    View super_onCreateView(View parent, String name, Context context, AttributeSet attrs);

    View super_onCreateView(String name, Context context, AttributeSet attrs);

    void super_onDestroy();

    void super_onDetachedFromWindow();

    void super_onEnterAnimationComplete();

    boolean super_onGenericMotionEvent(MotionEvent event);

    boolean super_onKeyDown(int keyCode, KeyEvent event);

    boolean super_onKeyLongPress(int keyCode, KeyEvent event);

    boolean super_onKeyMultiple(int keyCode, int repeatCount, KeyEvent event);

    boolean super_onKeyShortcut(int keyCode, KeyEvent event);

    boolean super_onKeyUp(int keyCode, KeyEvent event);

    void super_onLocalVoiceInteractionStarted();

    void super_onLocalVoiceInteractionStopped();

    void super_onLowMemory();

    boolean super_onMenuOpened(int featureId, Menu menu);

    void super_onMultiWindowModeChanged(boolean isInMultiWindowMode);

    boolean super_onNavigateUp();

    boolean super_onNavigateUpFromChild(Activity child);

    void super_onNewIntent(Intent intent);

    boolean super_onOptionsItemSelected(MenuItem item);

    void super_onOptionsMenuClosed(Menu menu);

    void super_onPanelClosed(int featureId, Menu menu);

    void super_onPause();

    void super_onPictureInPictureModeChanged(boolean isInPictureInPictureMode);

    void super_onPostCreate(Bundle savedInstanceState, PersistableBundle persistentState);

    void super_onPostCreate(@Nullable Bundle savedInstanceState);

    void super_onPostResume();

    void super_onPrepareDialog(int id, Dialog dialog);

    void super_onPrepareDialog(int id, Dialog dialog, Bundle args);

    void super_onPrepareNavigateUpTaskStack(TaskStackBuilder builder);

    boolean super_onPrepareOptionsMenu(Menu menu);

    boolean super_onPrepareOptionsPanel(View view, Menu menu);

    boolean super_onPreparePanel(int featureId, View view, Menu menu);

    void super_onPrepareSupportNavigateUpTaskStack(
            @NonNull android.support.v4.app.TaskStackBuilder builder);

    void super_onProvideAssistContent(AssistContent outContent);

    void super_onProvideAssistData(Bundle data);

    void super_onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> data, Menu menu,
            int deviceId);

    Uri super_onProvideReferrer();

    void super_onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
            @NonNull int[] grantResults);

    void super_onRestart();

    void super_onRestoreInstanceState(Bundle savedInstanceState, PersistableBundle persistentState);

    void super_onRestoreInstanceState(Bundle savedInstanceState);

    void super_onResume();

    void super_onResumeFragments();

    void super_onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState);

    void super_onSaveInstanceState(Bundle outState);

    boolean super_onSearchRequested(SearchEvent searchEvent);

    boolean super_onSearchRequested();

    void super_onStart();

    void super_onStateNotSaved();

    void super_onStop();

    void super_onSupportActionModeFinished(@NonNull ActionMode mode);

    void super_onSupportActionModeStarted(@NonNull ActionMode mode);

    void super_onSupportContentChanged();

    boolean super_onSupportNavigateUp();

    void super_onTitleChanged(CharSequence title, int color);

    boolean super_onTouchEvent(MotionEvent event);

    boolean super_onTrackballEvent(MotionEvent event);

    void super_onTrimMemory(int level);

    void super_onUserInteraction();

    void super_onUserLeaveHint();

    void super_onVisibleBehindCanceled();

    void super_onWindowAttributesChanged(WindowManager.LayoutParams params);

    void super_onWindowFocusChanged(boolean hasFocus);

    android.view.ActionMode super_onWindowStartingActionMode(
            android.view.ActionMode.Callback callback);

    android.view.ActionMode super_onWindowStartingActionMode(
            android.view.ActionMode.Callback callback, int type);

    ActionMode super_onWindowStartingSupportActionMode(@NonNull ActionMode.Callback callback);

    void super_openContextMenu(View view);

    FileInputStream super_openFileInput(String name) throws FileNotFoundException;

    FileOutputStream super_openFileOutput(String name, int mode) throws FileNotFoundException;

    void super_openOptionsMenu();

    SQLiteDatabase super_openOrCreateDatabase(String name, int mode,
            SQLiteDatabase.CursorFactory factory);

    SQLiteDatabase super_openOrCreateDatabase(String name, int mode,
            SQLiteDatabase.CursorFactory factory, DatabaseErrorHandler errorHandler);

    void super_overridePendingTransition(int enterAnim, int exitAnim);

    Drawable super_peekWallpaper();

    void super_postponeEnterTransition();

    void super_recreate();

    void super_registerComponentCallbacks(ComponentCallbacks callback);

    void super_registerForContextMenu(View view);

    Intent super_registerReceiver(BroadcastReceiver receiver, IntentFilter filter);

    Intent super_registerReceiver(BroadcastReceiver receiver, IntentFilter filter,
            String broadcastPermission, Handler scheduler);

    boolean super_releaseInstance();

    void super_removeStickyBroadcast(Intent intent);

    void super_removeStickyBroadcastAsUser(Intent intent, UserHandle user);

    void super_reportFullyDrawn();

    DragAndDropPermissions super_requestDragAndDropPermissions(DragEvent event);

    boolean super_requestVisibleBehind(boolean visible);

    void super_revokeUriPermission(Uri uri, int modeFlags);

    void super_sendBroadcast(Intent intent);

    void super_sendBroadcast(Intent intent, String receiverPermission);

    void super_sendBroadcastAsUser(Intent intent, UserHandle user);

    void super_sendBroadcastAsUser(Intent intent, UserHandle user, String receiverPermission);

    void super_sendOrderedBroadcast(Intent intent, String receiverPermission);

    void super_sendOrderedBroadcast(Intent intent, String receiverPermission,
            BroadcastReceiver resultReceiver, Handler scheduler, int initialCode,
            String initialData, Bundle initialExtras);

    void super_sendOrderedBroadcastAsUser(Intent intent, UserHandle user, String receiverPermission,
            BroadcastReceiver resultReceiver, Handler scheduler, int initialCode,
            String initialData, Bundle initialExtras);

    void super_sendStickyBroadcast(Intent intent);

    void super_sendStickyBroadcastAsUser(Intent intent, UserHandle user);

    void super_sendStickyOrderedBroadcast(Intent intent, BroadcastReceiver resultReceiver,
            Handler scheduler, int initialCode, String initialData, Bundle initialExtras);

    void super_sendStickyOrderedBroadcastAsUser(Intent intent, UserHandle user,
            BroadcastReceiver resultReceiver, Handler scheduler, int initialCode,
            String initialData, Bundle initialExtras);

    void super_setActionBar(Toolbar toolbar);

    void super_setContentTransitionManager(TransitionManager tm);

    void super_setContentView(@LayoutRes int layoutResID);

    void super_setContentView(View view);

    void super_setContentView(View view, ViewGroup.LayoutParams params);

    void super_setEnterSharedElementCallback(SharedElementCallback callback);

    void super_setEnterSharedElementCallback(android.app.SharedElementCallback callback);

    void super_setExitSharedElementCallback(SharedElementCallback listener);

    void super_setExitSharedElementCallback(android.app.SharedElementCallback callback);

    void super_setFinishOnTouchOutside(boolean finish);

    void super_setImmersive(boolean i);

    void super_setIntent(Intent newIntent);

    void super_setRequestedOrientation(int requestedOrientation);

    void super_setSupportActionBar(@Nullable android.support.v7.widget.Toolbar toolbar);

    void super_setSupportProgress(int progress);

    void super_setSupportProgressBarIndeterminate(boolean indeterminate);

    void super_setSupportProgressBarIndeterminateVisibility(boolean visible);

    void super_setSupportProgressBarVisibility(boolean visible);

    void super_setTaskDescription(ActivityManager.TaskDescription taskDescription);

    void super_setTheme(@StyleRes int resid);

    void super_setTitle(CharSequence title);

    void super_setTitle(int titleId);

    void super_setTitleColor(int textColor);

    void super_setVisible(boolean visible);

    void super_setVrModeEnabled(boolean enabled, ComponentName requestedComponent)
            throws PackageManager.NameNotFoundException;

    void super_setWallpaper(Bitmap bitmap) throws IOException;

    void super_setWallpaper(InputStream data) throws IOException;

    boolean super_shouldShowRequestPermissionRationale(String permission);

    boolean super_shouldUpRecreateTask(Intent targetIntent);

    boolean super_showAssist(Bundle args);

    void super_showLockTaskEscapeMessage();

    android.view.ActionMode super_startActionMode(android.view.ActionMode.Callback callback);

    android.view.ActionMode super_startActionMode(android.view.ActionMode.Callback callback,
            int type);

    void super_startActivities(Intent[] intents);

    void super_startActivities(Intent[] intents, Bundle options);

    void super_startActivity(Intent intent);

    void super_startActivity(Intent intent, Bundle options);

    void super_startActivityForResult(Intent intent, int requestCode);

    void super_startActivityForResult(Intent intent, int requestCode, @Nullable Bundle options);

    void super_startActivityFromChild(Activity child, Intent intent, int requestCode);

    void super_startActivityFromChild(Activity child, Intent intent, int requestCode,
            Bundle options);

    void super_startActivityFromFragment(Fragment fragment, Intent intent, int requestCode);

    void super_startActivityFromFragment(Fragment fragment, Intent intent, int requestCode,
            @Nullable Bundle options);

    void super_startActivityFromFragment(android.app.Fragment fragment, Intent intent,
            int requestCode);

    void super_startActivityFromFragment(android.app.Fragment fragment, Intent intent,
            int requestCode, Bundle options);

    boolean super_startActivityIfNeeded(Intent intent, int requestCode);

    boolean super_startActivityIfNeeded(Intent intent, int requestCode, Bundle options);

    boolean super_startInstrumentation(ComponentName className, String profileFile,
            Bundle arguments);

    void super_startIntentSender(IntentSender intent, Intent fillInIntent, int flagsMask,
            int flagsValues, int extraFlags) throws IntentSender.SendIntentException;

    void super_startIntentSender(IntentSender intent, Intent fillInIntent, int flagsMask,
            int flagsValues, int extraFlags, Bundle options)
            throws IntentSender.SendIntentException;

    void super_startIntentSenderForResult(IntentSender intent, int requestCode,
            @Nullable Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags,
            Bundle options) throws IntentSender.SendIntentException;

    void super_startIntentSenderForResult(IntentSender intent, int requestCode,
            @Nullable Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags)
            throws IntentSender.SendIntentException;

    void super_startIntentSenderFromChild(Activity child, IntentSender intent, int requestCode,
            Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags)
            throws IntentSender.SendIntentException;

    void super_startIntentSenderFromChild(Activity child, IntentSender intent, int requestCode,
            Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options)
            throws IntentSender.SendIntentException;

    void super_startIntentSenderFromFragment(Fragment fragment, IntentSender intent,
            int requestCode, @Nullable Intent fillInIntent, int flagsMask, int flagsValues,
            int extraFlags, Bundle options) throws IntentSender.SendIntentException;

    void super_startLocalVoiceInteraction(Bundle privateOptions);

    void super_startLockTask();

    void super_startManagingCursor(Cursor c);

    boolean super_startNextMatchingActivity(Intent intent);

    boolean super_startNextMatchingActivity(Intent intent, Bundle options);

    void super_startPostponedEnterTransition();

    void super_startSearch(String initialQuery, boolean selectInitialQuery, Bundle appSearchData,
            boolean globalSearch);

    ComponentName super_startService(Intent service);

    ActionMode super_startSupportActionMode(@NonNull ActionMode.Callback callback);

    void super_stopLocalVoiceInteraction();

    void super_stopLockTask();

    void super_stopManagingCursor(Cursor c);

    boolean super_stopService(Intent name);

    void super_supportFinishAfterTransition();

    void super_supportInvalidateOptionsMenu();

    void super_supportNavigateUpTo(@NonNull Intent upIntent);

    void super_supportPostponeEnterTransition();

    boolean super_supportRequestWindowFeature(int featureId);

    boolean super_supportShouldUpRecreateTask(@NonNull Intent targetIntent);

    void super_supportStartPostponedEnterTransition();

    void super_takeKeyEvents(boolean get);

    void super_triggerSearch(String query, Bundle appSearchData);

    void super_unbindService(ServiceConnection conn);

    void super_unregisterComponentCallbacks(ComponentCallbacks callback);

    void super_unregisterForContextMenu(View view);

    void super_unregisterReceiver(BroadcastReceiver receiver);

    void supportFinishAfterTransition();

    void supportInvalidateOptionsMenu();

    void supportNavigateUpTo(@NonNull Intent upIntent);

    void supportPostponeEnterTransition();

    boolean supportRequestWindowFeature(int featureId);

    boolean supportShouldUpRecreateTask(@NonNull Intent targetIntent);

    void supportStartPostponedEnterTransition();

    void takeKeyEvents(boolean get);

    void triggerSearch(String query, Bundle appSearchData);

    void unbindService(ServiceConnection conn);

    void unregisterComponentCallbacks(ComponentCallbacks callback);

    void unregisterForContextMenu(View view);

    void unregisterReceiver(BroadcastReceiver receiver);
}
