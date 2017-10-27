package com.pascalwelsch.compositeandroid.blueprints;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Dialog;
import android.app.PendingIntent;
import android.app.PictureInPictureParams;
import android.app.VoiceInteractor;
import android.app.assist.AssistContent;
import android.arch.lifecycle.Lifecycle;
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
import android.support.annotation.RequiresPermission;
import android.support.annotation.StyleRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.LoaderManager;
import android.support.v4.app.SharedElementCallback;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.view.ActionMode;
import android.support.v7.widget.Toolbar;
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

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;

// 27.0.0
@SuppressWarnings("ALL")
public class BlueprintActivity extends AppCompatActivity {

    @Override
    public void addContentView(final View view, final ViewGroup.LayoutParams params) {
        super.addContentView(view, params);
    }

    @Override
    public void applyOverrideConfiguration(final Configuration overrideConfiguration) {
        super.applyOverrideConfiguration(overrideConfiguration);
    }

    @Override
    public boolean bindService(final Intent service, final ServiceConnection conn,
            final int flags) {
        return super.bindService(service, conn, flags);
    }

    @Override
    public int checkCallingOrSelfPermission(final String permission) {
        return super.checkCallingOrSelfPermission(permission);
    }

    @Override
    public int checkCallingOrSelfUriPermission(final Uri uri, final int modeFlags) {
        return super.checkCallingOrSelfUriPermission(uri, modeFlags);
    }

    @Override
    public int checkCallingPermission(final String permission) {
        return super.checkCallingPermission(permission);
    }

    @Override
    public int checkCallingUriPermission(final Uri uri, final int modeFlags) {
        return super.checkCallingUriPermission(uri, modeFlags);
    }

    @Override
    public int checkPermission(final String permission, final int pid, final int uid) {
        return super.checkPermission(permission, pid, uid);
    }

    @Override
    public int checkSelfPermission(final String permission) {
        return super.checkSelfPermission(permission);
    }

    @Override
    public int checkUriPermission(final Uri uri, final int pid, final int uid,
            final int modeFlags) {
        return super.checkUriPermission(uri, pid, uid, modeFlags);
    }

    @Override
    public int checkUriPermission(final Uri uri, final String readPermission,
            final String writePermission, final int pid,
            final int uid, final int modeFlags) {
        return super.checkUriPermission(uri, readPermission, writePermission, pid, uid, modeFlags);
    }

    /**
     * @deprecated
     */
    @Override
    public void clearWallpaper() throws IOException {
        super.clearWallpaper();
    }

    @Override
    public void closeContextMenu() {
        super.closeContextMenu();
    }

    @Override
    public void closeOptionsMenu() {
        super.closeOptionsMenu();
    }

    @Override
    public Context createConfigurationContext(final Configuration overrideConfiguration) {
        return super.createConfigurationContext(overrideConfiguration);
    }

    @Override
    public Context createContextForSplit(final String splitName)
            throws PackageManager.NameNotFoundException {
        return super.createContextForSplit(splitName);
    }

    @Override
    public Context createDeviceProtectedStorageContext() {
        return super.createDeviceProtectedStorageContext();
    }

    @Override
    public Context createDisplayContext(final Display display) {
        return super.createDisplayContext(display);
    }

    @Override
    public Context createPackageContext(final String packageName, final int flags)
            throws PackageManager.NameNotFoundException {
        return super.createPackageContext(packageName, flags);
    }

    @Override
    public PendingIntent createPendingResult(final int requestCode, @NonNull final Intent data,
            final int flags) {
        return super.createPendingResult(requestCode, data, flags);
    }

    @Override
    public String[] databaseList() {
        return super.databaseList();
    }

    @Override
    public boolean deleteDatabase(final String name) {
        return super.deleteDatabase(name);
    }

    @Override
    public boolean deleteFile(final String name) {
        return super.deleteFile(name);
    }

    @Override
    public boolean deleteSharedPreferences(final String name) {
        return super.deleteSharedPreferences(name);
    }

    @Override
    public boolean dispatchGenericMotionEvent(final MotionEvent ev) {
        return super.dispatchGenericMotionEvent(ev);
    }

    @Override
    public boolean dispatchKeyEvent(final KeyEvent event) {
        return super.dispatchKeyEvent(event);
    }

    @Override
    public boolean dispatchKeyShortcutEvent(final KeyEvent event) {
        return super.dispatchKeyShortcutEvent(event);
    }

    @Override
    public boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent event) {
        return super.dispatchPopulateAccessibilityEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(final MotionEvent ev) {
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean dispatchTrackballEvent(final MotionEvent ev) {
        return super.dispatchTrackballEvent(ev);
    }

    @Override
    public void dump(final String prefix, final FileDescriptor fd, final PrintWriter writer,
            final String[] args) {
        super.dump(prefix, fd, writer, args);
    }

    @Override
    public void enforceCallingOrSelfPermission(final String permission, final String message) {
        super.enforceCallingOrSelfPermission(permission, message);
    }

    @Override
    public void enforceCallingOrSelfUriPermission(final Uri uri, final int modeFlags,
            final String message) {
        super.enforceCallingOrSelfUriPermission(uri, modeFlags, message);
    }

    @Override
    public void enforceCallingPermission(final String permission, final String message) {
        super.enforceCallingPermission(permission, message);
    }

    @Override
    public void enforceCallingUriPermission(final Uri uri, final int modeFlags,
            final String message) {
        super.enforceCallingUriPermission(uri, modeFlags, message);
    }

    @Override
    public void enforcePermission(final String permission, final int pid, final int uid,
            final String message) {
        super.enforcePermission(permission, pid, uid, message);
    }

    @Override
    public void enforceUriPermission(final Uri uri, final int pid, final int uid,
            final int modeFlags, final String message) {
        super.enforceUriPermission(uri, pid, uid, modeFlags, message);
    }

    @Override
    public void enforceUriPermission(final Uri uri, final String readPermission,
            final String writePermission,
            final int pid, final int uid, final int modeFlags, final String message) {
        super.enforceUriPermission(uri, readPermission, writePermission, pid, uid, modeFlags,
                message);
    }

    /**
     * @deprecated
     */
    @Override
    public void enterPictureInPictureMode() {
        super.enterPictureInPictureMode();
    }

    @Override
    public boolean enterPictureInPictureMode(final PictureInPictureParams params) {
        return super.enterPictureInPictureMode(params);
    }

    @Override
    public String[] fileList() {
        return super.fileList();
    }

    @Override
    public <T extends View> T findViewById(@IdRes final int id) {
        return super.findViewById(id);
    }

    @Override
    public void finish() {
        super.finish();
    }

    @Override
    public void finishActivity(final int requestCode) {
        super.finishActivity(requestCode);
    }

    @Override
    public void finishActivityFromChild(@NonNull final Activity child, final int requestCode) {
        super.finishActivityFromChild(child, requestCode);
    }

    @Override
    public void finishAffinity() {
        super.finishAffinity();
    }

    @Override
    public void finishAfterTransition() {
        super.finishAfterTransition();
    }

    @Override
    public void finishAndRemoveTask() {
        super.finishAndRemoveTask();
    }

    @Override
    public void finishFromChild(final Activity child) {
        super.finishFromChild(child);
    }

    @Nullable
    @Override
    public android.app.ActionBar getActionBar() {
        return super.getActionBar();
    }

    @Override
    public Context getApplicationContext() {
        return super.getApplicationContext();
    }

    @Override
    public ApplicationInfo getApplicationInfo() {
        return super.getApplicationInfo();
    }

    @Override
    public AssetManager getAssets() {
        return super.getAssets();
    }

    @Override
    public Context getBaseContext() {
        return super.getBaseContext();
    }

    @Override
    public File getCacheDir() {
        return super.getCacheDir();
    }

    @Nullable
    @Override
    public ComponentName getCallingActivity() {
        return super.getCallingActivity();
    }

    @Nullable
    @Override
    public String getCallingPackage() {
        return super.getCallingPackage();
    }

    @Override
    public int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override
    public ClassLoader getClassLoader() {
        return super.getClassLoader();
    }

    @Override
    public File getCodeCacheDir() {
        return super.getCodeCacheDir();
    }

    @Override
    public ComponentName getComponentName() {
        return super.getComponentName();
    }

    @Override
    public ContentResolver getContentResolver() {
        return super.getContentResolver();
    }

    @Override
    public Scene getContentScene() {
        return super.getContentScene();
    }

    @Override
    public TransitionManager getContentTransitionManager() {
        return super.getContentTransitionManager();
    }

    @Nullable
    @Override
    public View getCurrentFocus() {
        return super.getCurrentFocus();
    }

    @Override
    public File getDataDir() {
        return super.getDataDir();
    }

    @Override
    public File getDatabasePath(final String name) {
        return super.getDatabasePath(name);
    }

    @NonNull
    @Override
    public AppCompatDelegate getDelegate() {
        return super.getDelegate();
    }

    @Override
    public File getDir(final String name, final int mode) {
        return super.getDir(name, mode);
    }

    @Nullable
    @Override
    public ActionBarDrawerToggle.Delegate getDrawerToggleDelegate() {
        return super.getDrawerToggleDelegate();
    }

    @Override
    public File getExternalCacheDir() {
        return super.getExternalCacheDir();
    }

    @Override
    public File[] getExternalCacheDirs() {
        return super.getExternalCacheDirs();
    }

    @Override
    public File getExternalFilesDir(final String type) {
        return super.getExternalFilesDir(type);
    }

    @Override
    public File[] getExternalFilesDirs(final String type) {
        return super.getExternalFilesDirs(type);
    }

    @Override
    public File[] getExternalMediaDirs() {
        return super.getExternalMediaDirs();
    }

    @Override
    public <T extends ExtraData> T getExtraData(final Class<T> extraDataClass) {
        return super.getExtraData(extraDataClass);
    }

    @Override
    public File getFileStreamPath(final String name) {
        return super.getFileStreamPath(name);
    }

    @Override
    public File getFilesDir() {
        return super.getFilesDir();
    }

    @Override
    public android.app.FragmentManager getFragmentManager() {
        return super.getFragmentManager();
    }

    @Override
    public Intent getIntent() {
        return super.getIntent();
    }

    @Override
    public Object getLastCustomNonConfigurationInstance() {
        return super.getLastCustomNonConfigurationInstance();
    }

    @Nullable
    @Override
    public Object getLastNonConfigurationInstance() {
        return super.getLastNonConfigurationInstance();
    }

    @NonNull
    @Override
    public LayoutInflater getLayoutInflater() {
        return super.getLayoutInflater();
    }

    @Override
    public Lifecycle getLifecycle() {
        return super.getLifecycle();
    }

    @Override
    public android.app.LoaderManager getLoaderManager() {
        return super.getLoaderManager();
    }

    @NonNull
    @Override
    public String getLocalClassName() {
        return super.getLocalClassName();
    }

    @Override
    public Looper getMainLooper() {
        return super.getMainLooper();
    }

    @Override
    public int getMaxNumPictureInPictureActions() {
        return super.getMaxNumPictureInPictureActions();
    }

    @Override
    public MenuInflater getMenuInflater() {
        return super.getMenuInflater();
    }

    @Override
    public File getNoBackupFilesDir() {
        return super.getNoBackupFilesDir();
    }

    @Override
    public File getObbDir() {
        return super.getObbDir();
    }

    @Override
    public File[] getObbDirs() {
        return super.getObbDirs();
    }

    @Override
    public String getPackageCodePath() {
        return super.getPackageCodePath();
    }

    @Override
    public PackageManager getPackageManager() {
        return super.getPackageManager();
    }

    @Override
    public String getPackageName() {
        return super.getPackageName();
    }

    @Override
    public String getPackageResourcePath() {
        return super.getPackageResourcePath();
    }

    @Nullable
    @Override
    public Intent getParentActivityIntent() {
        return super.getParentActivityIntent();
    }

    @Override
    public SharedPreferences getPreferences(final int mode) {
        return super.getPreferences(mode);
    }

    @Nullable
    @Override
    public Uri getReferrer() {
        return super.getReferrer();
    }

    @Override
    public int getRequestedOrientation() {
        return super.getRequestedOrientation();
    }

    @Override
    public Resources getResources() {
        return super.getResources();
    }

    @Override
    public SharedPreferences getSharedPreferences(final String name, final int mode) {
        return super.getSharedPreferences(name, mode);
    }

    @Nullable
    @Override
    public ActionBar getSupportActionBar() {
        return super.getSupportActionBar();
    }

    @Override
    public FragmentManager getSupportFragmentManager() {
        return super.getSupportFragmentManager();
    }

    @Override
    public LoaderManager getSupportLoaderManager() {
        return super.getSupportLoaderManager();
    }

    @Nullable
    @Override
    public Intent getSupportParentActivityIntent() {
        return super.getSupportParentActivityIntent();
    }

    @Override
    public Object getSystemService(@NonNull final String name) {
        return super.getSystemService(name);
    }

    @Override
    public String getSystemServiceName(final Class<?> serviceClass) {
        return super.getSystemServiceName(serviceClass);
    }

    @Override
    public int getTaskId() {
        return super.getTaskId();
    }

    @Override
    public Resources.Theme getTheme() {
        return super.getTheme();
    }

    @Override
    public VoiceInteractor getVoiceInteractor() {
        return super.getVoiceInteractor();
    }

    /**
     * @deprecated
     */
    @Override
    public Drawable getWallpaper() {
        return super.getWallpaper();
    }

    /**
     * @deprecated
     */
    @Override
    public int getWallpaperDesiredMinimumHeight() {
        return super.getWallpaperDesiredMinimumHeight();
    }

    /**
     * @deprecated
     */
    @Override
    public int getWallpaperDesiredMinimumWidth() {
        return super.getWallpaperDesiredMinimumWidth();
    }

    @Override
    public Window getWindow() {
        return super.getWindow();
    }

    @Override
    public WindowManager getWindowManager() {
        return super.getWindowManager();
    }

    @Override
    public void grantUriPermission(final String toPackage, final Uri uri, final int modeFlags) {
        super.grantUriPermission(toPackage, uri, modeFlags);
    }

    @Override
    public boolean hasWindowFocus() {
        return super.hasWindowFocus();
    }

    @Override
    public void invalidateOptionsMenu() {
        super.invalidateOptionsMenu();
    }

    @Override
    public boolean isActivityTransitionRunning() {
        return super.isActivityTransitionRunning();
    }

    @Override
    public boolean isChangingConfigurations() {
        return super.isChangingConfigurations();
    }

    @Override
    public boolean isDestroyed() {
        return super.isDestroyed();
    }

    @Override
    public boolean isDeviceProtectedStorage() {
        return super.isDeviceProtectedStorage();
    }

    @Override
    public boolean isFinishing() {
        return super.isFinishing();
    }

    @Override
    public boolean isImmersive() {
        return super.isImmersive();
    }

    @Override
    public boolean isInMultiWindowMode() {
        return super.isInMultiWindowMode();
    }

    @Override
    public boolean isInPictureInPictureMode() {
        return super.isInPictureInPictureMode();
    }

    @Override
    public boolean isLocalVoiceInteractionSupported() {
        return super.isLocalVoiceInteractionSupported();
    }

    @Override
    public boolean isRestricted() {
        return super.isRestricted();
    }

    @Override
    public boolean isTaskRoot() {
        return super.isTaskRoot();
    }

    @Override
    public boolean isVoiceInteraction() {
        return super.isVoiceInteraction();
    }

    @Override
    public boolean isVoiceInteractionRoot() {
        return super.isVoiceInteractionRoot();
    }

    @Override
    public boolean moveDatabaseFrom(final Context sourceContext, final String name) {
        return super.moveDatabaseFrom(sourceContext, name);
    }

    @Override
    public boolean moveSharedPreferencesFrom(final Context sourceContext, final String name) {
        return super.moveSharedPreferencesFrom(sourceContext, name);
    }

    @Override
    public boolean moveTaskToBack(final boolean nonRoot) {
        return super.moveTaskToBack(nonRoot);
    }

    @Override
    public boolean navigateUpTo(final Intent upIntent) {
        return super.navigateUpTo(upIntent);
    }

    @Override
    public boolean navigateUpToFromChild(final Activity child, final Intent upIntent) {
        return super.navigateUpToFromChild(child, upIntent);
    }

    @Override
    public void onActionModeFinished(final android.view.ActionMode mode) {
        super.onActionModeFinished(mode);
    }

    @Override
    public void onActionModeStarted(final android.view.ActionMode mode) {
        super.onActionModeStarted(mode);
    }

    @Override
    public void onActivityReenter(final int resultCode, final Intent data) {
        super.onActivityReenter(resultCode, data);
    }

    @Override
    public void onAttachFragment(final Fragment fragment) {
        super.onAttachFragment(fragment);
    }

    @Override
    public void onAttachFragment(final android.app.Fragment fragment) {
        super.onAttachFragment(fragment);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public void onConfigurationChanged(final Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onContentChanged() {
        super.onContentChanged();
    }

    @Override
    public boolean onContextItemSelected(final MenuItem item) {
        return super.onContextItemSelected(item);
    }

    @Override
    public void onContextMenuClosed(final Menu menu) {
        super.onContextMenuClosed(menu);
    }

    @Override
    public void onCreate(@Nullable final Bundle savedInstanceState,
            @Nullable final PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }

    @Override
    public void onCreateContextMenu(final ContextMenu menu, final View v,
            final ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Nullable
    @Override
    public CharSequence onCreateDescription() {
        return super.onCreateDescription();
    }

    @Override
    public void onCreateNavigateUpTaskStack(final android.app.TaskStackBuilder builder) {
        super.onCreateNavigateUpTaskStack(builder);
    }

    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onCreatePanelMenu(final int featureId, final Menu menu) {
        return super.onCreatePanelMenu(featureId, menu);
    }

    @Nullable
    @Override
    public View onCreatePanelView(final int featureId) {
        return super.onCreatePanelView(featureId);
    }

    @Override
    public void onCreateSupportNavigateUpTaskStack(@NonNull final TaskStackBuilder builder) {
        super.onCreateSupportNavigateUpTaskStack(builder);
    }

    @Override
    public boolean onCreateThumbnail(final Bitmap outBitmap, final Canvas canvas) {
        return super.onCreateThumbnail(outBitmap, canvas);
    }

    @Override
    public View onCreateView(final View parent, final String name, final Context context,
            final AttributeSet attrs) {
        return super.onCreateView(parent, name, context, attrs);
    }

    @Override
    public View onCreateView(final String name, final Context context, final AttributeSet attrs) {
        return super.onCreateView(name, context, attrs);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override
    public void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
    }

    @Override
    public boolean onGenericMotionEvent(final MotionEvent event) {
        return super.onGenericMotionEvent(event);
    }

    @Override
    public boolean onKeyDown(final int keyCode, final KeyEvent event) {
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onKeyLongPress(final int keyCode, final KeyEvent event) {
        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public boolean onKeyMultiple(final int keyCode, final int repeatCount, final KeyEvent event) {
        return super.onKeyMultiple(keyCode, repeatCount, event);
    }

    @Override
    public boolean onKeyShortcut(final int keyCode, final KeyEvent event) {
        return super.onKeyShortcut(keyCode, event);
    }

    @Override
    public boolean onKeyUp(final int keyCode, final KeyEvent event) {
        return super.onKeyUp(keyCode, event);
    }

    @Override
    public void onLocalVoiceInteractionStarted() {
        super.onLocalVoiceInteractionStarted();
    }

    @Override
    public void onLocalVoiceInteractionStopped() {
        super.onLocalVoiceInteractionStopped();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public boolean onMenuOpened(final int featureId, final Menu menu) {
        return super.onMenuOpened(featureId, menu);
    }

    @Override
    public void onMultiWindowModeChanged(final boolean isInMultiWindowMode) {
        super.onMultiWindowModeChanged(isInMultiWindowMode);
    }

    @Override
    public void onMultiWindowModeChanged(final boolean isInMultiWindowMode,
            final Configuration newConfig) {
        super.onMultiWindowModeChanged(isInMultiWindowMode, newConfig);
    }

    @Override
    public boolean onNavigateUp() {
        return super.onNavigateUp();
    }

    @Override
    public boolean onNavigateUpFromChild(final Activity child) {
        return super.onNavigateUpFromChild(child);
    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onOptionsMenuClosed(final Menu menu) {
        super.onOptionsMenuClosed(menu);
    }

    @Override
    public void onPanelClosed(final int featureId, final Menu menu) {
        super.onPanelClosed(featureId, menu);
    }

    @Override
    public void onPictureInPictureModeChanged(final boolean isInPictureInPictureMode) {
        super.onPictureInPictureModeChanged(isInPictureInPictureMode);
    }

    @Override
    public void onPictureInPictureModeChanged(final boolean isInPictureInPictureMode,
            final Configuration newConfig) {
        super.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig);
    }

    @Override
    public void onPostCreate(@Nullable final Bundle savedInstanceState,
            @Nullable final PersistableBundle persistentState) {
        super.onPostCreate(savedInstanceState, persistentState);
    }

    @Override
    public void onPrepareNavigateUpTaskStack(final android.app.TaskStackBuilder builder) {
        super.onPrepareNavigateUpTaskStack(builder);
    }

    @Override
    public boolean onPrepareOptionsMenu(final Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onPreparePanel(final int featureId, final View view, final Menu menu) {
        return super.onPreparePanel(featureId, view, menu);
    }

    @Override
    public void onPrepareSupportNavigateUpTaskStack(@NonNull final TaskStackBuilder builder) {
        super.onPrepareSupportNavigateUpTaskStack(builder);
    }

    @Override
    public void onProvideAssistContent(final AssistContent outContent) {
        super.onProvideAssistContent(outContent);
    }

    @Override
    public void onProvideAssistData(final Bundle data) {
        super.onProvideAssistData(data);
    }

    @Override
    public void onProvideKeyboardShortcuts(final List<KeyboardShortcutGroup> data, final Menu menu,
            final int deviceId) {
        super.onProvideKeyboardShortcuts(data, menu, deviceId);
    }

    @Override
    public Uri onProvideReferrer() {
        return super.onProvideReferrer();
    }

    @Override
    public void onRequestPermissionsResult(final int requestCode,
            @NonNull final String[] permissions,
            @NonNull final int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override
    public void onRestoreInstanceState(final Bundle savedInstanceState,
            final PersistableBundle persistentState) {
        super.onRestoreInstanceState(savedInstanceState, persistentState);
    }

    @Override
    public Object onRetainCustomNonConfigurationInstance() {
        return super.onRetainCustomNonConfigurationInstance();
    }

    @Override
    public void onSaveInstanceState(final Bundle outState,
            final PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    public boolean onSearchRequested(@Nullable final SearchEvent searchEvent) {
        return super.onSearchRequested(searchEvent);
    }

    @Override
    public boolean onSearchRequested() {
        return super.onSearchRequested();
    }

    @Override
    public void onStateNotSaved() {
        super.onStateNotSaved();
    }

    @Override
    public void onSupportActionModeFinished(@NonNull final ActionMode mode) {
        super.onSupportActionModeFinished(mode);
    }

    @Override
    public void onSupportActionModeStarted(@NonNull final ActionMode mode) {
        super.onSupportActionModeStarted(mode);
    }

    /**
     * @deprecated
     */
    @Override
    public void onSupportContentChanged() {
        super.onSupportContentChanged();
    }

    @Override
    public boolean onSupportNavigateUp() {
        return super.onSupportNavigateUp();
    }

    @Override
    public boolean onTouchEvent(final MotionEvent event) {
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onTrackballEvent(final MotionEvent event) {
        return super.onTrackballEvent(event);
    }

    @Override
    public void onTrimMemory(final int level) {
        super.onTrimMemory(level);
    }

    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
    }

    /**
     * @deprecated
     */
    @Override
    public void onVisibleBehindCanceled() {
        super.onVisibleBehindCanceled();
    }

    @Override
    public void onWindowAttributesChanged(final WindowManager.LayoutParams params) {
        super.onWindowAttributesChanged(params);
    }

    @Override
    public void onWindowFocusChanged(final boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
    }

    @Nullable
    @Override
    public android.view.ActionMode onWindowStartingActionMode(
            final android.view.ActionMode.Callback callback) {
        return super.onWindowStartingActionMode(callback);
    }

    @Nullable
    @Override
    public android.view.ActionMode onWindowStartingActionMode(
            final android.view.ActionMode.Callback callback, final int type) {
        return super.onWindowStartingActionMode(callback, type);
    }

    @Nullable
    @Override
    public ActionMode onWindowStartingSupportActionMode(
            @NonNull final ActionMode.Callback callback) {
        return super.onWindowStartingSupportActionMode(callback);
    }

    @Override
    public void openContextMenu(final View view) {
        super.openContextMenu(view);
    }

    @Override
    public FileInputStream openFileInput(final String name) throws FileNotFoundException {
        return super.openFileInput(name);
    }

    @Override
    public FileOutputStream openFileOutput(final String name, final int mode)
            throws FileNotFoundException {
        return super.openFileOutput(name, mode);
    }

    @Override
    public void openOptionsMenu() {
        super.openOptionsMenu();
    }

    @Override
    public SQLiteDatabase openOrCreateDatabase(final String name, final int mode,
            final SQLiteDatabase.CursorFactory factory) {
        return super.openOrCreateDatabase(name, mode, factory);
    }

    @Override
    public SQLiteDatabase openOrCreateDatabase(final String name, final int mode,
            final SQLiteDatabase.CursorFactory factory, final DatabaseErrorHandler errorHandler) {
        return super.openOrCreateDatabase(name, mode, factory, errorHandler);
    }

    @Override
    public void overridePendingTransition(final int enterAnim, final int exitAnim) {
        super.overridePendingTransition(enterAnim, exitAnim);
    }

    /**
     * @deprecated
     */
    @Override
    public Drawable peekWallpaper() {
        return super.peekWallpaper();
    }

    @Override
    public void postponeEnterTransition() {
        super.postponeEnterTransition();
    }

    @Override
    public void putExtraData(final ExtraData extraData) {
        super.putExtraData(extraData);
    }

    @Override
    public void recreate() {
        super.recreate();
    }

    @Override
    public void registerComponentCallbacks(final ComponentCallbacks callback) {
        super.registerComponentCallbacks(callback);
    }

    @Override
    public void registerForContextMenu(final View view) {
        super.registerForContextMenu(view);
    }

    @Override
    public Intent registerReceiver(final BroadcastReceiver receiver, final IntentFilter filter) {
        return super.registerReceiver(receiver, filter);
    }

    @Override
    public Intent registerReceiver(final BroadcastReceiver receiver, final IntentFilter filter,
            final int flags) {
        return super.registerReceiver(receiver, filter, flags);
    }

    @Override
    public Intent registerReceiver(final BroadcastReceiver receiver, final IntentFilter filter,
            final String broadcastPermission, final Handler scheduler) {
        return super.registerReceiver(receiver, filter, broadcastPermission, scheduler);
    }

    @Override
    public Intent registerReceiver(final BroadcastReceiver receiver, final IntentFilter filter,
            final String broadcastPermission, final Handler scheduler, final int flags) {
        return super.registerReceiver(receiver, filter, broadcastPermission, scheduler, flags);
    }

    @Override
    public boolean releaseInstance() {
        return super.releaseInstance();
    }

    /**
     * @deprecated
     */
    @Override
    public void removeStickyBroadcast(final Intent intent) {
        super.removeStickyBroadcast(intent);
    }

    /**
     * @deprecated
     */
    @Override
    public void removeStickyBroadcastAsUser(final Intent intent, final UserHandle user) {
        super.removeStickyBroadcastAsUser(intent, user);
    }

    @Override
    public void reportFullyDrawn() {
        super.reportFullyDrawn();
    }

    @Override
    public DragAndDropPermissions requestDragAndDropPermissions(final DragEvent event) {
        return super.requestDragAndDropPermissions(event);
    }

    /**
     * @deprecated
     */
    @Override
    public boolean requestVisibleBehind(final boolean visible) {
        return super.requestVisibleBehind(visible);
    }

    @Override
    public void revokeUriPermission(final Uri uri, final int modeFlags) {
        super.revokeUriPermission(uri, modeFlags);
    }

    @Override
    public void revokeUriPermission(final String targetPackage, final Uri uri,
            final int modeFlags) {
        super.revokeUriPermission(targetPackage, uri, modeFlags);
    }

    @Override
    public void sendBroadcast(final Intent intent) {
        super.sendBroadcast(intent);
    }

    @Override
    public void sendBroadcast(final Intent intent, final String receiverPermission) {
        super.sendBroadcast(intent, receiverPermission);
    }

    @Override
    public void sendBroadcastAsUser(final Intent intent, final UserHandle user) {
        super.sendBroadcastAsUser(intent, user);
    }

    @Override
    public void sendBroadcastAsUser(final Intent intent, final UserHandle user,
            final String receiverPermission) {
        super.sendBroadcastAsUser(intent, user, receiverPermission);
    }

    @Override
    public void sendOrderedBroadcast(final Intent intent, final String receiverPermission) {
        super.sendOrderedBroadcast(intent, receiverPermission);
    }

    @Override
    public void sendOrderedBroadcast(final Intent intent, final String receiverPermission,
            final BroadcastReceiver resultReceiver, final Handler scheduler, final int initialCode,
            final String initialData, final Bundle initialExtras) {
        super.sendOrderedBroadcast(intent, receiverPermission, resultReceiver, scheduler,
                initialCode, initialData, initialExtras);
    }

    @Override
    public void sendOrderedBroadcastAsUser(final Intent intent, final UserHandle user,
            final String receiverPermission, final BroadcastReceiver resultReceiver,
            final Handler scheduler,
            final int initialCode, final String initialData, final Bundle initialExtras) {
        super.sendOrderedBroadcastAsUser(intent, user, receiverPermission, resultReceiver,
                scheduler, initialCode, initialData, initialExtras);
    }

    /**
     * @deprecated
     */
    @Override
    public void sendStickyBroadcast(final Intent intent) {
        super.sendStickyBroadcast(intent);
    }

    /**
     * @deprecated
     */
    @Override
    public void sendStickyBroadcastAsUser(final Intent intent, final UserHandle user) {
        super.sendStickyBroadcastAsUser(intent, user);
    }

    /**
     * @deprecated
     */
    @Override
    public void sendStickyOrderedBroadcast(final Intent intent,
            final BroadcastReceiver resultReceiver,
            final Handler scheduler, final int initialCode, final String initialData,
            final Bundle initialExtras) {
        super.sendStickyOrderedBroadcast(intent, resultReceiver, scheduler, initialCode,
                initialData, initialExtras);
    }

    /**
     * @deprecated
     */
    @Override
    public void sendStickyOrderedBroadcastAsUser(final Intent intent, final UserHandle user,
            final BroadcastReceiver resultReceiver, final Handler scheduler, final int initialCode,
            final String initialData, final Bundle initialExtras) {
        super.sendStickyOrderedBroadcastAsUser(intent, user, resultReceiver, scheduler, initialCode,
                initialData, initialExtras);
    }

    @Override
    public void setActionBar(@Nullable final android.widget.Toolbar toolbar) {
        super.setActionBar(toolbar);
    }

    @Override
    public void setContentTransitionManager(final TransitionManager tm) {
        super.setContentTransitionManager(tm);
    }

    @Override
    public void setContentView(@LayoutRes final int layoutResID) {
        super.setContentView(layoutResID);
    }

    @Override
    public void setContentView(final View view) {
        super.setContentView(view);
    }

    @Override
    public void setContentView(final View view, final ViewGroup.LayoutParams params) {
        super.setContentView(view, params);
    }

    @Override
    public void setEnterSharedElementCallback(final SharedElementCallback callback) {
        super.setEnterSharedElementCallback(callback);
    }

    @Override
    public void setEnterSharedElementCallback(final android.app.SharedElementCallback callback) {
        super.setEnterSharedElementCallback(callback);
    }

    @Override
    public void setExitSharedElementCallback(final SharedElementCallback listener) {
        super.setExitSharedElementCallback(listener);
    }

    @Override
    public void setExitSharedElementCallback(final android.app.SharedElementCallback callback) {
        super.setExitSharedElementCallback(callback);
    }

    @Override
    public void setFinishOnTouchOutside(final boolean finish) {
        super.setFinishOnTouchOutside(finish);
    }

    @Override
    public void setImmersive(final boolean i) {
        super.setImmersive(i);
    }

    @Override
    public void setIntent(final Intent newIntent) {
        super.setIntent(newIntent);
    }

    @Override
    public void setPictureInPictureParams(final PictureInPictureParams params) {
        super.setPictureInPictureParams(params);
    }

    @Override
    public void setRequestedOrientation(final int requestedOrientation) {
        super.setRequestedOrientation(requestedOrientation);
    }

    @Override
    public void setShowWhenLocked(final boolean showWhenLocked) {
        super.setShowWhenLocked(showWhenLocked);
    }

    @Override
    public void setSupportActionBar(@Nullable final Toolbar toolbar) {
        super.setSupportActionBar(toolbar);
    }

    /**
     * @deprecated
     */
    @Override
    public void setSupportProgress(final int progress) {
        super.setSupportProgress(progress);
    }

    /**
     * @deprecated
     */
    @Override
    public void setSupportProgressBarIndeterminate(final boolean indeterminate) {
        super.setSupportProgressBarIndeterminate(indeterminate);
    }

    /**
     * @deprecated
     */
    @Override
    public void setSupportProgressBarIndeterminateVisibility(final boolean visible) {
        super.setSupportProgressBarIndeterminateVisibility(visible);
    }

    /**
     * @deprecated
     */
    @Override
    public void setSupportProgressBarVisibility(final boolean visible) {
        super.setSupportProgressBarVisibility(visible);
    }

    @Override
    public void setTaskDescription(final ActivityManager.TaskDescription taskDescription) {
        super.setTaskDescription(taskDescription);
    }

    @Override
    public void setTheme(@StyleRes final int resid) {
        super.setTheme(resid);
    }

    @Override
    public void setTitle(final CharSequence title) {
        super.setTitle(title);
    }

    @Override
    public void setTitle(final int titleId) {
        super.setTitle(titleId);
    }

    /**
     * @deprecated
     */
    @Override
    public void setTitleColor(final int textColor) {
        super.setTitleColor(textColor);
    }

    @Override
    public void setTurnScreenOn(final boolean turnScreenOn) {
        super.setTurnScreenOn(turnScreenOn);
    }

    @Override
    public void setVisible(final boolean visible) {
        super.setVisible(visible);
    }

    @Override
    public void setVrModeEnabled(final boolean enabled,
            @NonNull final ComponentName requestedComponent)
            throws PackageManager.NameNotFoundException {
        super.setVrModeEnabled(enabled, requestedComponent);
    }

    /**
     * @deprecated
     */
    @Override
    public void setWallpaper(final Bitmap bitmap) throws IOException {
        super.setWallpaper(bitmap);
    }

    /**
     * @deprecated
     */
    @Override
    public void setWallpaper(final InputStream data) throws IOException {
        super.setWallpaper(data);
    }

    @Override
    public boolean shouldShowRequestPermissionRationale(@NonNull final String permission) {
        return super.shouldShowRequestPermissionRationale(permission);
    }

    @Override
    public boolean shouldUpRecreateTask(final Intent targetIntent) {
        return super.shouldUpRecreateTask(targetIntent);
    }

    @Override
    public boolean showAssist(final Bundle args) {
        return super.showAssist(args);
    }

    @Override
    public void showLockTaskEscapeMessage() {
        super.showLockTaskEscapeMessage();
    }

    @Nullable
    @Override
    public android.view.ActionMode startActionMode(
            final android.view.ActionMode.Callback callback) {
        return super.startActionMode(callback);
    }

    @Nullable
    @Override
    public android.view.ActionMode startActionMode(final android.view.ActionMode.Callback callback,
            final int type) {
        return super.startActionMode(callback, type);
    }

    @Override
    public void startActivities(final Intent[] intents) {
        super.startActivities(intents);
    }

    @Override
    public void startActivities(final Intent[] intents, @Nullable final Bundle options) {
        super.startActivities(intents, options);
    }

    @Override
    public void startActivity(final Intent intent) {
        super.startActivity(intent);
    }

    @Override
    public void startActivity(final Intent intent, @Nullable final Bundle options) {
        super.startActivity(intent, options);
    }

    @Override
    public void startActivityForResult(final Intent intent, final int requestCode) {
        super.startActivityForResult(intent, requestCode);
    }

    @Override
    public void startActivityForResult(final Intent intent, final int requestCode,
            @Nullable final Bundle options) {
        super.startActivityForResult(intent, requestCode, options);
    }

    @Override
    public void startActivityFromChild(@NonNull final Activity child,
            @RequiresPermission final Intent intent,
            final int requestCode) {
        super.startActivityFromChild(child, intent, requestCode);
    }

    @Override
    public void startActivityFromChild(@NonNull final Activity child,
            @RequiresPermission final Intent intent,
            final int requestCode, @Nullable final Bundle options) {
        super.startActivityFromChild(child, intent, requestCode, options);
    }

    @Override
    public void startActivityFromFragment(final Fragment fragment, final Intent intent,
            final int requestCode) {
        super.startActivityFromFragment(fragment, intent, requestCode);
    }

    @Override
    public void startActivityFromFragment(final Fragment fragment, final Intent intent,
            final int requestCode,
            @Nullable final Bundle options) {
        super.startActivityFromFragment(fragment, intent, requestCode, options);
    }

    @Override
    public void startActivityFromFragment(@NonNull final android.app.Fragment fragment,
            @RequiresPermission final Intent intent, final int requestCode) {
        super.startActivityFromFragment(fragment, intent, requestCode);
    }

    @Override
    public void startActivityFromFragment(@NonNull final android.app.Fragment fragment,
            @RequiresPermission final Intent intent, final int requestCode,
            @Nullable final Bundle options) {
        super.startActivityFromFragment(fragment, intent, requestCode, options);
    }

    @Override
    public boolean startActivityIfNeeded(@RequiresPermission @NonNull final Intent intent,
            final int requestCode) {
        return super.startActivityIfNeeded(intent, requestCode);
    }

    @Override
    public boolean startActivityIfNeeded(@RequiresPermission @NonNull final Intent intent,
            final int requestCode, @Nullable final Bundle options) {
        return super.startActivityIfNeeded(intent, requestCode, options);
    }

    @Override
    public ComponentName startForegroundService(final Intent service) {
        return super.startForegroundService(service);
    }

    @Override
    public boolean startInstrumentation(final ComponentName className, final String profileFile,
            final Bundle arguments) {
        return super.startInstrumentation(className, profileFile, arguments);
    }

    @Override
    public void startIntentSender(final IntentSender intent, @Nullable final Intent fillInIntent,
            final int flagsMask,
            final int flagsValues, final int extraFlags) throws IntentSender.SendIntentException {
        super.startIntentSender(intent, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    @Override
    public void startIntentSender(final IntentSender intent, @Nullable final Intent fillInIntent,
            final int flagsMask,
            final int flagsValues, final int extraFlags, final Bundle options)
            throws IntentSender.SendIntentException {
        super.startIntentSender(intent, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    @Override
    public void startIntentSenderForResult(final IntentSender intent, final int requestCode,
            @Nullable final Intent fillInIntent, final int flagsMask, final int flagsValues,
            final int extraFlags,
            final Bundle options) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues,
                extraFlags, options);
    }

    @Override
    public void startIntentSenderForResult(final IntentSender intent, final int requestCode,
            @Nullable final Intent fillInIntent, final int flagsMask, final int flagsValues,
            final int extraFlags)
            throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues,
                extraFlags);
    }

    @Override
    public void startIntentSenderFromChild(final Activity child, final IntentSender intent,
            final int requestCode,
            final Intent fillInIntent, final int flagsMask, final int flagsValues,
            final int extraFlags)
            throws IntentSender.SendIntentException {
        super.startIntentSenderFromChild(child, intent, requestCode, fillInIntent, flagsMask,
                flagsValues, extraFlags);
    }

    @Override
    public void startIntentSenderFromChild(final Activity child, final IntentSender intent,
            final int requestCode,
            final Intent fillInIntent, final int flagsMask, final int flagsValues,
            final int extraFlags,
            @Nullable final Bundle options) throws IntentSender.SendIntentException {
        super.startIntentSenderFromChild(child, intent, requestCode, fillInIntent, flagsMask,
                flagsValues, extraFlags, options);
    }

    @Override
    public void startIntentSenderFromFragment(final Fragment fragment, final IntentSender intent,
            final int requestCode, @Nullable final Intent fillInIntent, final int flagsMask,
            final int flagsValues,
            final int extraFlags, final Bundle options) throws IntentSender.SendIntentException {
        super.startIntentSenderFromFragment(fragment, intent, requestCode, fillInIntent, flagsMask,
                flagsValues, extraFlags, options);
    }

    @Override
    public void startLocalVoiceInteraction(final Bundle privateOptions) {
        super.startLocalVoiceInteraction(privateOptions);
    }

    @Override
    public void startLockTask() {
        super.startLockTask();
    }

    /**
     * @deprecated
     */
    @Override
    public void startManagingCursor(final Cursor c) {
        super.startManagingCursor(c);
    }

    @Override
    public boolean startNextMatchingActivity(@RequiresPermission @NonNull final Intent intent) {
        return super.startNextMatchingActivity(intent);
    }

    @Override
    public boolean startNextMatchingActivity(@RequiresPermission @NonNull final Intent intent,
            @Nullable final Bundle options) {
        return super.startNextMatchingActivity(intent, options);
    }

    @Override
    public void startPostponedEnterTransition() {
        super.startPostponedEnterTransition();
    }

    @Override
    public void startSearch(@Nullable final String initialQuery, final boolean selectInitialQuery,
            @Nullable final Bundle appSearchData, final boolean globalSearch) {
        super.startSearch(initialQuery, selectInitialQuery, appSearchData, globalSearch);
    }

    @Override
    public ComponentName startService(final Intent service) {
        return super.startService(service);
    }

    @Nullable
    @Override
    public ActionMode startSupportActionMode(@NonNull final ActionMode.Callback callback) {
        return super.startSupportActionMode(callback);
    }

    @Override
    public void stopLocalVoiceInteraction() {
        super.stopLocalVoiceInteraction();
    }

    @Override
    public void stopLockTask() {
        super.stopLockTask();
    }

    /**
     * @deprecated
     */
    @Override
    public void stopManagingCursor(final Cursor c) {
        super.stopManagingCursor(c);
    }

    @Override
    public boolean stopService(final Intent name) {
        return super.stopService(name);
    }

    @Override
    public void supportFinishAfterTransition() {
        super.supportFinishAfterTransition();
    }

    @Override
    public void supportInvalidateOptionsMenu() {
        super.supportInvalidateOptionsMenu();
    }

    @Override
    public void supportNavigateUpTo(@NonNull final Intent upIntent) {
        super.supportNavigateUpTo(upIntent);
    }

    @Override
    public void supportPostponeEnterTransition() {
        super.supportPostponeEnterTransition();
    }

    @Override
    public boolean supportRequestWindowFeature(final int featureId) {
        return super.supportRequestWindowFeature(featureId);
    }

    @Override
    public boolean supportShouldUpRecreateTask(@NonNull final Intent targetIntent) {
        return super.supportShouldUpRecreateTask(targetIntent);
    }

    @Override
    public void supportStartPostponedEnterTransition() {
        super.supportStartPostponedEnterTransition();
    }

    @Override
    public void takeKeyEvents(final boolean get) {
        super.takeKeyEvents(get);
    }

    @Override
    public void triggerSearch(final String query, @Nullable final Bundle appSearchData) {
        super.triggerSearch(query, appSearchData);
    }

    @Override
    public void unbindService(final ServiceConnection conn) {
        super.unbindService(conn);
    }

    @Override
    public void unregisterComponentCallbacks(final ComponentCallbacks callback) {
        super.unregisterComponentCallbacks(callback);
    }

    @Override
    public void unregisterForContextMenu(final View view) {
        super.unregisterForContextMenu(view);
    }

    @Override
    public void unregisterReceiver(final BroadcastReceiver receiver) {
        super.unregisterReceiver(receiver);
    }

    @Override
    protected void attachBaseContext(final Context newBase) {
        super.attachBaseContext(newBase);
    }

    @Override
    protected void onActivityResult(final int requestCode, final int resultCode,
            final Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    protected void onApplyThemeResource(final Resources.Theme theme, @StyleRes final int resid,
            final boolean first) {
        super.onApplyThemeResource(theme, resid, first);
    }

    @Override
    protected void onChildTitleChanged(final Activity childActivity, final CharSequence title) {
        super.onChildTitleChanged(childActivity, title);
    }

    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     * @deprecated
     */
    @Override
    protected Dialog onCreateDialog(final int id) {
        return super.onCreateDialog(id);
    }

    /**
     * @deprecated
     */
    @Nullable
    @Override
    protected Dialog onCreateDialog(final int id, final Bundle args) {
        return super.onCreateDialog(id, args);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onNewIntent(final Intent intent) {
        super.onNewIntent(intent);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onPostCreate(@Nullable final Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
    }

    /**
     * @deprecated
     */
    @Override
    protected void onPrepareDialog(final int id, final Dialog dialog) {
        super.onPrepareDialog(id, dialog);
    }

    /**
     * @deprecated
     */
    @Override
    protected void onPrepareDialog(final int id, final Dialog dialog, final Bundle args) {
        super.onPrepareDialog(id, dialog, args);
    }

    @Override
    protected boolean onPrepareOptionsPanel(final View view, final Menu menu) {
        return super.onPrepareOptionsPanel(view, menu);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onRestoreInstanceState(final Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onResumeFragments() {
        super.onResumeFragments();
    }

    @Override
    protected void onSaveInstanceState(final Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onTitleChanged(final CharSequence title, final int color) {
        super.onTitleChanged(title, color);
    }

    @Override
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
    }
}
