package com.pascalwelsch.compositeandroid.activity;

import com.pascalwelsch.compositeandroid.core.NamedSuperCall;

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


@SuppressWarnings("unused")
public class ActivityPlugin extends ActivityPluginBase {

    public void addContentView(final View view, final ViewGroup.LayoutParams params) {
        verifyMethodCalledFromDelegate("addContentView(View, ViewGroup.LayoutParams)");
        mSuperListeners.pop().call(view, params);
    }

    public void applyOverrideConfiguration(final Configuration overrideConfiguration) {
        verifyMethodCalledFromDelegate("applyOverrideConfiguration(Configuration)");
        mSuperListeners.pop().call(overrideConfiguration);
    }

    public void attachBaseContext(final Context newBase) {
        verifyMethodCalledFromDelegate("attachBaseContext(Context)");
        mSuperListeners.pop().call(newBase);
    }

    public boolean bindService(final Intent service, final ServiceConnection conn,
            final int flags) {
        verifyMethodCalledFromDelegate("bindService(Intent, ServiceConnection, int)");
        return (Boolean) mSuperListeners.pop().call(service, conn, flags);
    }

    public int checkCallingOrSelfPermission(final String permission) {
        verifyMethodCalledFromDelegate("checkCallingOrSelfPermission(String)");
        return (Integer) mSuperListeners.pop().call(permission);
    }

    public int checkCallingOrSelfUriPermission(final Uri uri, final int modeFlags) {
        verifyMethodCalledFromDelegate("checkCallingOrSelfUriPermission(Uri, int)");
        return (Integer) mSuperListeners.pop().call(uri, modeFlags);
    }

    public int checkCallingPermission(final String permission) {
        verifyMethodCalledFromDelegate("checkCallingPermission(String)");
        return (Integer) mSuperListeners.pop().call(permission);
    }

    public int checkCallingUriPermission(final Uri uri, final int modeFlags) {
        verifyMethodCalledFromDelegate("checkCallingUriPermission(Uri, int)");
        return (Integer) mSuperListeners.pop().call(uri, modeFlags);
    }

    public int checkPermission(final String permission, final int pid, final int uid) {
        verifyMethodCalledFromDelegate("checkPermission(String, int, int)");
        return (Integer) mSuperListeners.pop().call(permission, pid, uid);
    }

    public int checkSelfPermission(final String permission) {
        verifyMethodCalledFromDelegate("checkSelfPermission(String)");
        return (Integer) mSuperListeners.pop().call(permission);
    }

    public int checkUriPermission(final Uri uri, final int pid, final int uid,
            final int modeFlags) {
        verifyMethodCalledFromDelegate("checkUriPermission(Uri, int, int, int)");
        return (Integer) mSuperListeners.pop().call(uri, pid, uid, modeFlags);
    }

    public int checkUriPermission(final Uri uri, final String readPermission,
            final String writePermission, final int pid, final int uid, final int modeFlags) {
        verifyMethodCalledFromDelegate("checkUriPermission(Uri, String, String, int, int, int)");
        return (Integer) mSuperListeners.pop()
                .call(uri, readPermission, writePermission, pid, uid, modeFlags);
    }

    public void clearWallpaper() throws IOException {
        verifyMethodCalledFromDelegate("clearWallpaper()");
        mSuperListeners.pop().call();
    }

    public void closeContextMenu() {
        verifyMethodCalledFromDelegate("closeContextMenu()");
        mSuperListeners.pop().call();
    }

    public void closeOptionsMenu() {
        verifyMethodCalledFromDelegate("closeOptionsMenu()");
        mSuperListeners.pop().call();
    }

    public Context createConfigurationContext(final Configuration overrideConfiguration) {
        verifyMethodCalledFromDelegate("createConfigurationContext(Configuration)");
        return (Context) mSuperListeners.pop().call(overrideConfiguration);
    }

    public Context createDisplayContext(final Display display) {
        verifyMethodCalledFromDelegate("createDisplayContext(Display)");
        return (Context) mSuperListeners.pop().call(display);
    }

    public Context createPackageContext(final String packageName, final int flags)
            throws PackageManager.NameNotFoundException {
        verifyMethodCalledFromDelegate("createPackageContext(String, int)");
        return (Context) mSuperListeners.pop().call(packageName, flags);
    }

    public PendingIntent createPendingResult(final int requestCode, @NonNull final Intent data,
            final int flags) {
        verifyMethodCalledFromDelegate("createPendingResult(int, Intent, int)");
        return (PendingIntent) mSuperListeners.pop().call(requestCode, data, flags);
    }

    public String[] databaseList() {
        verifyMethodCalledFromDelegate("databaseList()");
        return (String[]) mSuperListeners.pop().call();
    }

    public boolean deleteDatabase(final String name) {
        verifyMethodCalledFromDelegate("deleteDatabase(String)");
        return (Boolean) mSuperListeners.pop().call(name);
    }

    public boolean deleteFile(final String name) {
        verifyMethodCalledFromDelegate("deleteFile(String)");
        return (Boolean) mSuperListeners.pop().call(name);
    }

    public boolean dispatchGenericMotionEvent(final MotionEvent ev) {
        verifyMethodCalledFromDelegate("dispatchGenericMotionEvent(MotionEvent)");
        return (Boolean) mSuperListeners.pop().call(ev);
    }

    public boolean dispatchKeyEvent(final KeyEvent event) {
        verifyMethodCalledFromDelegate("dispatchKeyEvent(KeyEvent)");
        return (Boolean) mSuperListeners.pop().call(event);
    }

    public boolean dispatchKeyShortcutEvent(final KeyEvent event) {
        verifyMethodCalledFromDelegate("dispatchKeyShortcutEvent(KeyEvent)");
        return (Boolean) mSuperListeners.pop().call(event);
    }

    public boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent event) {
        verifyMethodCalledFromDelegate("dispatchPopulateAccessibilityEvent(AccessibilityEvent)");
        return (Boolean) mSuperListeners.pop().call(event);
    }

    public boolean dispatchTouchEvent(final MotionEvent ev) {
        verifyMethodCalledFromDelegate("dispatchTouchEvent(MotionEvent)");
        return (Boolean) mSuperListeners.pop().call(ev);
    }

    public boolean dispatchTrackballEvent(final MotionEvent ev) {
        verifyMethodCalledFromDelegate("dispatchTrackballEvent(MotionEvent)");
        return (Boolean) mSuperListeners.pop().call(ev);
    }

    public void dump(final String prefix, final FileDescriptor fd, final PrintWriter writer,
            final String[] args) {
        verifyMethodCalledFromDelegate("dump(String, FileDescriptor, PrintWriter, String[])");
        mSuperListeners.pop().call(prefix, fd, writer, args);
    }

    public void enforceCallingOrSelfPermission(final String permission, final String message) {
        verifyMethodCalledFromDelegate("enforceCallingOrSelfPermission(String, String)");
        mSuperListeners.pop().call(permission, message);
    }

    public void enforceCallingOrSelfUriPermission(final Uri uri, final int modeFlags,
            final String message) {
        verifyMethodCalledFromDelegate("enforceCallingOrSelfUriPermission(Uri, int, String)");
        mSuperListeners.pop().call(uri, modeFlags, message);
    }

    public void enforceCallingPermission(final String permission, final String message) {
        verifyMethodCalledFromDelegate("enforceCallingPermission(String, String)");
        mSuperListeners.pop().call(permission, message);
    }

    public void enforceCallingUriPermission(final Uri uri, final int modeFlags,
            final String message) {
        verifyMethodCalledFromDelegate("enforceCallingUriPermission(Uri, int, String)");
        mSuperListeners.pop().call(uri, modeFlags, message);
    }

    public void enforcePermission(final String permission, final int pid, final int uid,
            final String message) {
        verifyMethodCalledFromDelegate("enforcePermission(String, int, int, String)");
        mSuperListeners.pop().call(permission, pid, uid, message);
    }

    public void enforceUriPermission(final Uri uri, final int pid, final int uid,
            final int modeFlags, final String message) {
        verifyMethodCalledFromDelegate("enforceUriPermission(Uri, int, int, int, String)");
        mSuperListeners.pop().call(uri, pid, uid, modeFlags, message);
    }

    public void enforceUriPermission(final Uri uri, final String readPermission,
            final String writePermission, final int pid, final int uid, final int modeFlags,
            final String message) {
        verifyMethodCalledFromDelegate(
                "enforceUriPermission(Uri, String, String, int, int, int, String)");
        mSuperListeners.pop()
                .call(uri, readPermission, writePermission, pid, uid, modeFlags, message);
    }

    public String[] fileList() {
        verifyMethodCalledFromDelegate("fileList()");
        return (String[]) mSuperListeners.pop().call();
    }

    public View findViewById(@IdRes final int id) {
        verifyMethodCalledFromDelegate("findViewById(int)");
        return (View) mSuperListeners.pop().call(id);
    }

    public void finish() {
        verifyMethodCalledFromDelegate("finish()");
        mSuperListeners.pop().call();
    }

    public void finishActivity(final int requestCode) {
        verifyMethodCalledFromDelegate("finishActivity(int)");
        mSuperListeners.pop().call(requestCode);
    }

    public void finishActivityFromChild(@NonNull final Activity child, final int requestCode) {
        verifyMethodCalledFromDelegate("finishActivityFromChild(Activity, int)");
        mSuperListeners.pop().call(child, requestCode);
    }

    public void finishAffinity() {
        verifyMethodCalledFromDelegate("finishAffinity()");
        mSuperListeners.pop().call();
    }

    public void finishAfterTransition() {
        verifyMethodCalledFromDelegate("finishAfterTransition()");
        mSuperListeners.pop().call();
    }

    public void finishAndRemoveTask() {
        verifyMethodCalledFromDelegate("finishAndRemoveTask()");
        mSuperListeners.pop().call();
    }

    public void finishFromChild(final Activity child) {
        verifyMethodCalledFromDelegate("finishFromChild(Activity)");
        mSuperListeners.pop().call(child);
    }

    public android.app.ActionBar getActionBar() {
        verifyMethodCalledFromDelegate("getActionBar()");
        return (android.app.ActionBar) mSuperListeners.pop().call();
    }

    public Context getApplicationContext() {
        verifyMethodCalledFromDelegate("getApplicationContext()");
        return (Context) mSuperListeners.pop().call();
    }

    public ApplicationInfo getApplicationInfo() {
        verifyMethodCalledFromDelegate("getApplicationInfo()");
        return (ApplicationInfo) mSuperListeners.pop().call();
    }

    public AssetManager getAssets() {
        verifyMethodCalledFromDelegate("getAssets()");
        return (AssetManager) mSuperListeners.pop().call();
    }

    public Context getBaseContext() {
        verifyMethodCalledFromDelegate("getBaseContext()");
        return (Context) mSuperListeners.pop().call();
    }

    public File getCacheDir() {
        verifyMethodCalledFromDelegate("getCacheDir()");
        return (File) mSuperListeners.pop().call();
    }

    public ComponentName getCallingActivity() {
        verifyMethodCalledFromDelegate("getCallingActivity()");
        return (ComponentName) mSuperListeners.pop().call();
    }

    public String getCallingPackage() {
        verifyMethodCalledFromDelegate("getCallingPackage()");
        return (String) mSuperListeners.pop().call();
    }

    public int getChangingConfigurations() {
        verifyMethodCalledFromDelegate("getChangingConfigurations()");
        return (Integer) mSuperListeners.pop().call();
    }

    public ClassLoader getClassLoader() {
        verifyMethodCalledFromDelegate("getClassLoader()");
        return (ClassLoader) mSuperListeners.pop().call();
    }

    public File getCodeCacheDir() {
        verifyMethodCalledFromDelegate("getCodeCacheDir()");
        return (File) mSuperListeners.pop().call();
    }

    public ComponentName getComponentName() {
        verifyMethodCalledFromDelegate("getComponentName()");
        return (ComponentName) mSuperListeners.pop().call();
    }

    public ContentResolver getContentResolver() {
        verifyMethodCalledFromDelegate("getContentResolver()");
        return (ContentResolver) mSuperListeners.pop().call();
    }

    public Scene getContentScene() {
        verifyMethodCalledFromDelegate("getContentScene()");
        return (Scene) mSuperListeners.pop().call();
    }

    public TransitionManager getContentTransitionManager() {
        verifyMethodCalledFromDelegate("getContentTransitionManager()");
        return (TransitionManager) mSuperListeners.pop().call();
    }

    public View getCurrentFocus() {
        verifyMethodCalledFromDelegate("getCurrentFocus()");
        return (View) mSuperListeners.pop().call();
    }

    public File getDatabasePath(final String name) {
        verifyMethodCalledFromDelegate("getDatabasePath(String)");
        return (File) mSuperListeners.pop().call(name);
    }

    public AppCompatDelegate getDelegate() {
        verifyMethodCalledFromDelegate("getDelegate()");
        return (AppCompatDelegate) mSuperListeners.pop().call();
    }

    public File getDir(final String name, final int mode) {
        verifyMethodCalledFromDelegate("getDir(String, int)");
        return (File) mSuperListeners.pop().call(name, mode);
    }

    public ActionBarDrawerToggle.Delegate getDrawerToggleDelegate() {
        verifyMethodCalledFromDelegate("getDrawerToggleDelegate()");
        return (ActionBarDrawerToggle.Delegate) mSuperListeners.pop().call();
    }

    public File getExternalCacheDir() {
        verifyMethodCalledFromDelegate("getExternalCacheDir()");
        return (File) mSuperListeners.pop().call();
    }

    public File[] getExternalCacheDirs() {
        verifyMethodCalledFromDelegate("getExternalCacheDirs()");
        return (File[]) mSuperListeners.pop().call();
    }

    public File getExternalFilesDir(final String type) {
        verifyMethodCalledFromDelegate("getExternalFilesDir(String)");
        return (File) mSuperListeners.pop().call(type);
    }

    public File[] getExternalFilesDirs(final String type) {
        verifyMethodCalledFromDelegate("getExternalFilesDirs(String)");
        return (File[]) mSuperListeners.pop().call(type);
    }

    public File[] getExternalMediaDirs() {
        verifyMethodCalledFromDelegate("getExternalMediaDirs()");
        return (File[]) mSuperListeners.pop().call();
    }

    public File getFileStreamPath(final String name) {
        verifyMethodCalledFromDelegate("getFileStreamPath(String)");
        return (File) mSuperListeners.pop().call(name);
    }

    public File getFilesDir() {
        verifyMethodCalledFromDelegate("getFilesDir()");
        return (File) mSuperListeners.pop().call();
    }

    public android.app.FragmentManager getFragmentManager() {
        verifyMethodCalledFromDelegate("getFragmentManager()");
        return (android.app.FragmentManager) mSuperListeners.pop().call();
    }

    public Intent getIntent() {
        verifyMethodCalledFromDelegate("getIntent()");
        return (Intent) mSuperListeners.pop().call();
    }

    public LayoutInflater getLayoutInflater() {
        verifyMethodCalledFromDelegate("getLayoutInflater()");
        return (LayoutInflater) mSuperListeners.pop().call();
    }

    public android.app.LoaderManager getLoaderManager() {
        verifyMethodCalledFromDelegate("getLoaderManager()");
        return (android.app.LoaderManager) mSuperListeners.pop().call();
    }

    public String getLocalClassName() {
        verifyMethodCalledFromDelegate("getLocalClassName()");
        return (String) mSuperListeners.pop().call();
    }

    public Looper getMainLooper() {
        verifyMethodCalledFromDelegate("getMainLooper()");
        return (Looper) mSuperListeners.pop().call();
    }

    public MenuInflater getMenuInflater() {
        verifyMethodCalledFromDelegate("getMenuInflater()");
        return (MenuInflater) mSuperListeners.pop().call();
    }

    public File getNoBackupFilesDir() {
        verifyMethodCalledFromDelegate("getNoBackupFilesDir()");
        return (File) mSuperListeners.pop().call();
    }

    public File getObbDir() {
        verifyMethodCalledFromDelegate("getObbDir()");
        return (File) mSuperListeners.pop().call();
    }

    public File[] getObbDirs() {
        verifyMethodCalledFromDelegate("getObbDirs()");
        return (File[]) mSuperListeners.pop().call();
    }

    public String getPackageCodePath() {
        verifyMethodCalledFromDelegate("getPackageCodePath()");
        return (String) mSuperListeners.pop().call();
    }

    public PackageManager getPackageManager() {
        verifyMethodCalledFromDelegate("getPackageManager()");
        return (PackageManager) mSuperListeners.pop().call();
    }

    public String getPackageName() {
        verifyMethodCalledFromDelegate("getPackageName()");
        return (String) mSuperListeners.pop().call();
    }

    public String getPackageResourcePath() {
        verifyMethodCalledFromDelegate("getPackageResourcePath()");
        return (String) mSuperListeners.pop().call();
    }

    public Intent getParentActivityIntent() {
        verifyMethodCalledFromDelegate("getParentActivityIntent()");
        return (Intent) mSuperListeners.pop().call();
    }

    public SharedPreferences getPreferences(final int mode) {
        verifyMethodCalledFromDelegate("getPreferences(int)");
        return (SharedPreferences) mSuperListeners.pop().call(mode);
    }

    public Uri getReferrer() {
        verifyMethodCalledFromDelegate("getReferrer()");
        return (Uri) mSuperListeners.pop().call();
    }

    public int getRequestedOrientation() {
        verifyMethodCalledFromDelegate("getRequestedOrientation()");
        return (Integer) mSuperListeners.pop().call();
    }

    public Resources getResources() {
        verifyMethodCalledFromDelegate("getResources()");
        return (Resources) mSuperListeners.pop().call();
    }

    public SharedPreferences getSharedPreferences(final String name, final int mode) {
        verifyMethodCalledFromDelegate("getSharedPreferences(String, int)");
        return (SharedPreferences) mSuperListeners.pop().call(name, mode);
    }

    public ActionBar getSupportActionBar() {
        verifyMethodCalledFromDelegate("getSupportActionBar()");
        return (ActionBar) mSuperListeners.pop().call();
    }

    public FragmentManager getSupportFragmentManager() {
        verifyMethodCalledFromDelegate("getSupportFragmentManager()");
        return (FragmentManager) mSuperListeners.pop().call();
    }

    public LoaderManager getSupportLoaderManager() {
        verifyMethodCalledFromDelegate("getSupportLoaderManager()");
        return (LoaderManager) mSuperListeners.pop().call();
    }

    public Intent getSupportParentActivityIntent() {
        verifyMethodCalledFromDelegate("getSupportParentActivityIntent()");
        return (Intent) mSuperListeners.pop().call();
    }

    public Object getSystemService(@NonNull final String name) {
        verifyMethodCalledFromDelegate("getSystemService(String)");
        return (Object) mSuperListeners.pop().call(name);
    }

    public String getSystemServiceName(final Class<?> serviceClass) {
        verifyMethodCalledFromDelegate("getSystemServiceName(Class<?>)");
        return (String) mSuperListeners.pop().call(serviceClass);
    }

    public int getTaskId() {
        verifyMethodCalledFromDelegate("getTaskId()");
        return (Integer) mSuperListeners.pop().call();
    }

    public Resources.Theme getTheme() {
        verifyMethodCalledFromDelegate("getTheme()");
        return (Resources.Theme) mSuperListeners.pop().call();
    }

    public VoiceInteractor getVoiceInteractor() {
        verifyMethodCalledFromDelegate("getVoiceInteractor()");
        return (VoiceInteractor) mSuperListeners.pop().call();
    }

    public Drawable getWallpaper() {
        verifyMethodCalledFromDelegate("getWallpaper()");
        return (Drawable) mSuperListeners.pop().call();
    }

    public int getWallpaperDesiredMinimumHeight() {
        verifyMethodCalledFromDelegate("getWallpaperDesiredMinimumHeight()");
        return (Integer) mSuperListeners.pop().call();
    }

    public int getWallpaperDesiredMinimumWidth() {
        verifyMethodCalledFromDelegate("getWallpaperDesiredMinimumWidth()");
        return (Integer) mSuperListeners.pop().call();
    }

    public Window getWindow() {
        verifyMethodCalledFromDelegate("getWindow()");
        return (Window) mSuperListeners.pop().call();
    }

    public WindowManager getWindowManager() {
        verifyMethodCalledFromDelegate("getWindowManager()");
        return (WindowManager) mSuperListeners.pop().call();
    }

    public void grantUriPermission(final String toPackage, final Uri uri, final int modeFlags) {
        verifyMethodCalledFromDelegate("grantUriPermission(String, Uri, int)");
        mSuperListeners.pop().call(toPackage, uri, modeFlags);
    }

    public boolean hasWindowFocus() {
        verifyMethodCalledFromDelegate("hasWindowFocus()");
        return (Boolean) mSuperListeners.pop().call();
    }

    public void invalidateOptionsMenu() {
        verifyMethodCalledFromDelegate("invalidateOptionsMenu()");
        mSuperListeners.pop().call();
    }

    public boolean isChangingConfigurations() {
        verifyMethodCalledFromDelegate("isChangingConfigurations()");
        return (Boolean) mSuperListeners.pop().call();
    }

    public boolean isDestroyed() {
        verifyMethodCalledFromDelegate("isDestroyed()");
        return (Boolean) mSuperListeners.pop().call();
    }

    public boolean isFinishing() {
        verifyMethodCalledFromDelegate("isFinishing()");
        return (Boolean) mSuperListeners.pop().call();
    }

    public boolean isImmersive() {
        verifyMethodCalledFromDelegate("isImmersive()");
        return (Boolean) mSuperListeners.pop().call();
    }

    public boolean isRestricted() {
        verifyMethodCalledFromDelegate("isRestricted()");
        return (Boolean) mSuperListeners.pop().call();
    }

    public boolean isTaskRoot() {
        verifyMethodCalledFromDelegate("isTaskRoot()");
        return (Boolean) mSuperListeners.pop().call();
    }

    public boolean isVoiceInteraction() {
        verifyMethodCalledFromDelegate("isVoiceInteraction()");
        return (Boolean) mSuperListeners.pop().call();
    }

    public boolean isVoiceInteractionRoot() {
        verifyMethodCalledFromDelegate("isVoiceInteractionRoot()");
        return (Boolean) mSuperListeners.pop().call();
    }

    public boolean moveTaskToBack(final boolean nonRoot) {
        verifyMethodCalledFromDelegate("moveTaskToBack(boolean)");
        return (Boolean) mSuperListeners.pop().call(nonRoot);
    }

    public boolean navigateUpTo(final Intent upIntent) {
        verifyMethodCalledFromDelegate("navigateUpTo(Intent)");
        return (Boolean) mSuperListeners.pop().call(upIntent);
    }

    public boolean navigateUpToFromChild(final Activity child, final Intent upIntent) {
        verifyMethodCalledFromDelegate("navigateUpToFromChild(Activity, Intent)");
        return (Boolean) mSuperListeners.pop().call(child, upIntent);
    }

    public void onActionModeFinished(final android.view.ActionMode mode) {
        verifyMethodCalledFromDelegate("onActionModeFinished(android.view.ActionMode)");
        mSuperListeners.pop().call(mode);
    }

    public void onActionModeStarted(final android.view.ActionMode mode) {
        verifyMethodCalledFromDelegate("onActionModeStarted(android.view.ActionMode)");
        mSuperListeners.pop().call(mode);
    }

    public void onActivityReenter(final int resultCode, final Intent data) {
        verifyMethodCalledFromDelegate("onActivityReenter(int, Intent)");
        mSuperListeners.pop().call(resultCode, data);
    }

    public void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        verifyMethodCalledFromDelegate("onActivityResult(int, int, Intent)");
        mSuperListeners.pop().call(requestCode, resultCode, data);
    }

    public void onApplyThemeResource(final Resources.Theme theme, final int resid,
            final boolean first) {
        verifyMethodCalledFromDelegate("onApplyThemeResource(Resources.Theme, int, boolean)");
        mSuperListeners.pop().call(theme, resid, first);
    }

    public void onAttachFragment(final Fragment fragment) {
        verifyMethodCalledFromDelegate("onAttachFragment(Fragment)");
        mSuperListeners.pop().call(fragment);
    }

    public void onAttachFragment(final android.app.Fragment fragment) {
        verifyMethodCalledFromDelegate("onAttachFragment(android.app.Fragment)");
        mSuperListeners.pop().call(fragment);
    }

    public void onAttachedToWindow() {
        verifyMethodCalledFromDelegate("onAttachedToWindow()");
        mSuperListeners.pop().call();
    }

    public void onBackPressed() {
        verifyMethodCalledFromDelegate("onBackPressed()");
        mSuperListeners.pop().call();
    }

    public void onChildTitleChanged(final Activity childActivity, final CharSequence title) {
        verifyMethodCalledFromDelegate("onChildTitleChanged(Activity, CharSequence)");
        mSuperListeners.pop().call(childActivity, title);
    }

    public void onConfigurationChanged(final Configuration newConfig) {
        verifyMethodCalledFromDelegate("onConfigurationChanged(Configuration)");
        mSuperListeners.pop().call(newConfig);
    }

    public void onContentChanged() {
        verifyMethodCalledFromDelegate("onContentChanged()");
        mSuperListeners.pop().call();
    }

    public boolean onContextItemSelected(final MenuItem item) {
        verifyMethodCalledFromDelegate("onContextItemSelected(MenuItem)");
        return (Boolean) mSuperListeners.pop().call(item);
    }

    public void onContextMenuClosed(final Menu menu) {
        verifyMethodCalledFromDelegate("onContextMenuClosed(Menu)");
        mSuperListeners.pop().call(menu);
    }

    public void onCreate(@Nullable final Bundle savedInstanceState) {
        verifyMethodCalledFromDelegate("onCreate(Bundle)");
        mSuperListeners.pop().call(savedInstanceState);
    }

    public void onCreate(final Bundle savedInstanceState, final PersistableBundle persistentState) {
        verifyMethodCalledFromDelegate("onCreate(Bundle, PersistableBundle)");
        mSuperListeners.pop().call(savedInstanceState, persistentState);
    }

    public void onCreateContextMenu(final ContextMenu menu, final View v,
            final ContextMenu.ContextMenuInfo menuInfo) {
        verifyMethodCalledFromDelegate(
                "onCreateContextMenu(ContextMenu, View, ContextMenu.ContextMenuInfo)");
        mSuperListeners.pop().call(menu, v, menuInfo);
    }

    public CharSequence onCreateDescription() {
        verifyMethodCalledFromDelegate("onCreateDescription()");
        return (CharSequence) mSuperListeners.pop().call();
    }

    public Dialog onCreateDialog(final int id) {
        verifyMethodCalledFromDelegate("onCreateDialog(int)");
        return (Dialog) mSuperListeners.pop().call(id);
    }

    public Dialog onCreateDialog(final int id, final Bundle args) {
        verifyMethodCalledFromDelegate("onCreateDialog(int, Bundle)");
        return (Dialog) mSuperListeners.pop().call(id, args);
    }

    public void onCreateNavigateUpTaskStack(final TaskStackBuilder builder) {
        verifyMethodCalledFromDelegate("onCreateNavigateUpTaskStack(TaskStackBuilder)");
        mSuperListeners.pop().call(builder);
    }

    public boolean onCreateOptionsMenu(final Menu menu) {
        verifyMethodCalledFromDelegate("onCreateOptionsMenu(Menu)");
        return (Boolean) mSuperListeners.pop().call(menu);
    }

    public boolean onCreatePanelMenu(final int featureId, final Menu menu) {
        verifyMethodCalledFromDelegate("onCreatePanelMenu(int, Menu)");
        return (Boolean) mSuperListeners.pop().call(featureId, menu);
    }

    public View onCreatePanelView(final int featureId) {
        verifyMethodCalledFromDelegate("onCreatePanelView(int)");
        return (View) mSuperListeners.pop().call(featureId);
    }

    public void onCreateSupportNavigateUpTaskStack(
            @NonNull final android.support.v4.app.TaskStackBuilder builder) {
        verifyMethodCalledFromDelegate(
                "onCreateSupportNavigateUpTaskStack(android.support.v4.app.TaskStackBuilder)");
        mSuperListeners.pop().call(builder);
    }

    public boolean onCreateThumbnail(final Bitmap outBitmap, final Canvas canvas) {
        verifyMethodCalledFromDelegate("onCreateThumbnail(Bitmap, Canvas)");
        return (Boolean) mSuperListeners.pop().call(outBitmap, canvas);
    }

    public View onCreateView(final View parent, final String name, final Context context,
            final AttributeSet attrs) {
        verifyMethodCalledFromDelegate("onCreateView(View, String, Context, AttributeSet)");
        return (View) mSuperListeners.pop().call(parent, name, context, attrs);
    }

    public View onCreateView(final String name, final Context context, final AttributeSet attrs) {
        verifyMethodCalledFromDelegate("onCreateView(String, Context, AttributeSet)");
        return (View) mSuperListeners.pop().call(name, context, attrs);
    }

    public void onDestroy() {
        verifyMethodCalledFromDelegate("onDestroy()");
        mSuperListeners.pop().call();
    }

    public void onDetachedFromWindow() {
        verifyMethodCalledFromDelegate("onDetachedFromWindow()");
        mSuperListeners.pop().call();
    }

    public void onEnterAnimationComplete() {
        verifyMethodCalledFromDelegate("onEnterAnimationComplete()");
        mSuperListeners.pop().call();
    }

    public boolean onGenericMotionEvent(final MotionEvent event) {
        verifyMethodCalledFromDelegate("onGenericMotionEvent(MotionEvent)");
        return (Boolean) mSuperListeners.pop().call(event);
    }

    public boolean onKeyDown(final int keyCode, final KeyEvent event) {
        verifyMethodCalledFromDelegate("onKeyDown(int, KeyEvent)");
        return (Boolean) mSuperListeners.pop().call(keyCode, event);
    }

    public boolean onKeyLongPress(final int keyCode, final KeyEvent event) {
        verifyMethodCalledFromDelegate("onKeyLongPress(int, KeyEvent)");
        return (Boolean) mSuperListeners.pop().call(keyCode, event);
    }

    public boolean onKeyMultiple(final int keyCode, final int repeatCount, final KeyEvent event) {
        verifyMethodCalledFromDelegate("onKeyMultiple(int, int, KeyEvent)");
        return (Boolean) mSuperListeners.pop().call(keyCode, repeatCount, event);
    }

    public boolean onKeyShortcut(final int keyCode, final KeyEvent event) {
        verifyMethodCalledFromDelegate("onKeyShortcut(int, KeyEvent)");
        return (Boolean) mSuperListeners.pop().call(keyCode, event);
    }

    public boolean onKeyUp(final int keyCode, final KeyEvent event) {
        verifyMethodCalledFromDelegate("onKeyUp(int, KeyEvent)");
        return (Boolean) mSuperListeners.pop().call(keyCode, event);
    }

    public void onLowMemory() {
        verifyMethodCalledFromDelegate("onLowMemory()");
        mSuperListeners.pop().call();
    }

    public boolean onMenuOpened(final int featureId, final Menu menu) {
        verifyMethodCalledFromDelegate("onMenuOpened(int, Menu)");
        return (Boolean) mSuperListeners.pop().call(featureId, menu);
    }

    public boolean onNavigateUp() {
        verifyMethodCalledFromDelegate("onNavigateUp()");
        return (Boolean) mSuperListeners.pop().call();
    }

    public boolean onNavigateUpFromChild(final Activity child) {
        verifyMethodCalledFromDelegate("onNavigateUpFromChild(Activity)");
        return (Boolean) mSuperListeners.pop().call(child);
    }

    public void onNewIntent(final Intent intent) {
        verifyMethodCalledFromDelegate("onNewIntent(Intent)");
        mSuperListeners.pop().call(intent);
    }

    public boolean onOptionsItemSelected(final MenuItem item) {
        verifyMethodCalledFromDelegate("onOptionsItemSelected(MenuItem)");
        return (Boolean) mSuperListeners.pop().call(item);
    }

    public void onOptionsMenuClosed(final Menu menu) {
        verifyMethodCalledFromDelegate("onOptionsMenuClosed(Menu)");
        mSuperListeners.pop().call(menu);
    }

    public void onPanelClosed(final int featureId, final Menu menu) {
        verifyMethodCalledFromDelegate("onPanelClosed(int, Menu)");
        mSuperListeners.pop().call(featureId, menu);
    }

    public void onPause() {
        verifyMethodCalledFromDelegate("onPause()");
        mSuperListeners.pop().call();
    }

    public void onPostCreate(@Nullable final Bundle savedInstanceState) {
        verifyMethodCalledFromDelegate("onPostCreate(Bundle)");
        mSuperListeners.pop().call(savedInstanceState);
    }

    public void onPostCreate(final Bundle savedInstanceState,
            final PersistableBundle persistentState) {
        verifyMethodCalledFromDelegate("onPostCreate(Bundle, PersistableBundle)");
        mSuperListeners.pop().call(savedInstanceState, persistentState);
    }

    public void onPostResume() {
        verifyMethodCalledFromDelegate("onPostResume()");
        mSuperListeners.pop().call();
    }

    public void onPrepareDialog(final int id, final Dialog dialog) {
        verifyMethodCalledFromDelegate("onPrepareDialog(int, Dialog)");
        mSuperListeners.pop().call(id, dialog);
    }

    public void onPrepareDialog(final int id, final Dialog dialog, final Bundle args) {
        verifyMethodCalledFromDelegate("onPrepareDialog(int, Dialog, Bundle)");
        mSuperListeners.pop().call(id, dialog, args);
    }

    public void onPrepareNavigateUpTaskStack(final TaskStackBuilder builder) {
        verifyMethodCalledFromDelegate("onPrepareNavigateUpTaskStack(TaskStackBuilder)");
        mSuperListeners.pop().call(builder);
    }

    public boolean onPrepareOptionsMenu(final Menu menu) {
        verifyMethodCalledFromDelegate("onPrepareOptionsMenu(Menu)");
        return (Boolean) mSuperListeners.pop().call(menu);
    }

    public boolean onPrepareOptionsPanel(final View view, final Menu menu) {
        verifyMethodCalledFromDelegate("onPrepareOptionsPanel(View, Menu)");
        return (Boolean) mSuperListeners.pop().call(view, menu);
    }

    public boolean onPreparePanel(final int featureId, final View view, final Menu menu) {
        verifyMethodCalledFromDelegate("onPreparePanel(int, View, Menu)");
        return (Boolean) mSuperListeners.pop().call(featureId, view, menu);
    }

    public void onPrepareSupportNavigateUpTaskStack(
            @NonNull final android.support.v4.app.TaskStackBuilder builder) {
        verifyMethodCalledFromDelegate(
                "onPrepareSupportNavigateUpTaskStack(android.support.v4.app.TaskStackBuilder)");
        mSuperListeners.pop().call(builder);
    }

    public void onProvideAssistContent(final AssistContent outContent) {
        verifyMethodCalledFromDelegate("onProvideAssistContent(AssistContent)");
        mSuperListeners.pop().call(outContent);
    }

    public void onProvideAssistData(final Bundle data) {
        verifyMethodCalledFromDelegate("onProvideAssistData(Bundle)");
        mSuperListeners.pop().call(data);
    }

    public Uri onProvideReferrer() {
        verifyMethodCalledFromDelegate("onProvideReferrer()");
        return (Uri) mSuperListeners.pop().call();
    }

    public void onRequestPermissionsResult(final int requestCode,
            @NonNull final String[] permissions, @NonNull final int[] grantResults) {
        verifyMethodCalledFromDelegate("onRequestPermissionsResult(int, String[], int[])");
        mSuperListeners.pop().call(requestCode, permissions, grantResults);
    }

    public void onRestart() {
        verifyMethodCalledFromDelegate("onRestart()");
        mSuperListeners.pop().call();
    }

    public void onRestoreInstanceState(final Bundle savedInstanceState) {
        verifyMethodCalledFromDelegate("onRestoreInstanceState(Bundle)");
        mSuperListeners.pop().call(savedInstanceState);
    }

    public void onRestoreInstanceState(final Bundle savedInstanceState,
            final PersistableBundle persistentState) {
        verifyMethodCalledFromDelegate("onRestoreInstanceState(Bundle, PersistableBundle)");
        mSuperListeners.pop().call(savedInstanceState, persistentState);
    }

    public void onResume() {
        verifyMethodCalledFromDelegate("onResume()");
        mSuperListeners.pop().call();
    }

    public void onResumeFragments() {
        verifyMethodCalledFromDelegate("onResumeFragments()");
        mSuperListeners.pop().call();
    }

    public void onSaveInstanceState(final Bundle outState) {
        verifyMethodCalledFromDelegate("onSaveInstanceState(Bundle)");
        mSuperListeners.pop().call(outState);
    }

    public void onSaveInstanceState(final Bundle outState,
            final PersistableBundle outPersistentState) {
        verifyMethodCalledFromDelegate("onSaveInstanceState(Bundle, PersistableBundle)");
        mSuperListeners.pop().call(outState, outPersistentState);
    }

    public boolean onSearchRequested(final SearchEvent searchEvent) {
        verifyMethodCalledFromDelegate("onSearchRequested(SearchEvent)");
        return (Boolean) mSuperListeners.pop().call(searchEvent);
    }

    public boolean onSearchRequested() {
        verifyMethodCalledFromDelegate("onSearchRequested()");
        return (Boolean) mSuperListeners.pop().call();
    }

    public void onStart() {
        verifyMethodCalledFromDelegate("onStart()");
        mSuperListeners.pop().call();
    }

    public void onStateNotSaved() {
        verifyMethodCalledFromDelegate("onStateNotSaved()");
        mSuperListeners.pop().call();
    }

    public void onStop() {
        verifyMethodCalledFromDelegate("onStop()");
        mSuperListeners.pop().call();
    }

    public void onSupportActionModeFinished(@NonNull final ActionMode mode) {
        verifyMethodCalledFromDelegate("onSupportActionModeFinished(ActionMode)");
        mSuperListeners.pop().call(mode);
    }

    public void onSupportActionModeStarted(@NonNull final ActionMode mode) {
        verifyMethodCalledFromDelegate("onSupportActionModeStarted(ActionMode)");
        mSuperListeners.pop().call(mode);
    }

    public void onSupportContentChanged() {
        verifyMethodCalledFromDelegate("onSupportContentChanged()");
        mSuperListeners.pop().call();
    }

    public boolean onSupportNavigateUp() {
        verifyMethodCalledFromDelegate("onSupportNavigateUp()");
        return (Boolean) mSuperListeners.pop().call();
    }

    public void onTitleChanged(final CharSequence title, final int color) {
        verifyMethodCalledFromDelegate("onTitleChanged(CharSequence, int)");
        mSuperListeners.pop().call(title, color);
    }

    public boolean onTouchEvent(final MotionEvent event) {
        verifyMethodCalledFromDelegate("onTouchEvent(MotionEvent)");
        return (Boolean) mSuperListeners.pop().call(event);
    }

    public boolean onTrackballEvent(final MotionEvent event) {
        verifyMethodCalledFromDelegate("onTrackballEvent(MotionEvent)");
        return (Boolean) mSuperListeners.pop().call(event);
    }

    public void onTrimMemory(final int level) {
        verifyMethodCalledFromDelegate("onTrimMemory(int)");
        mSuperListeners.pop().call(level);
    }

    public void onUserInteraction() {
        verifyMethodCalledFromDelegate("onUserInteraction()");
        mSuperListeners.pop().call();
    }

    public void onUserLeaveHint() {
        verifyMethodCalledFromDelegate("onUserLeaveHint()");
        mSuperListeners.pop().call();
    }

    public void onVisibleBehindCanceled() {
        verifyMethodCalledFromDelegate("onVisibleBehindCanceled()");
        mSuperListeners.pop().call();
    }

    public void onWindowAttributesChanged(final WindowManager.LayoutParams params) {
        verifyMethodCalledFromDelegate("onWindowAttributesChanged(WindowManager.LayoutParams)");
        mSuperListeners.pop().call(params);
    }

    public void onWindowFocusChanged(final boolean hasFocus) {
        verifyMethodCalledFromDelegate("onWindowFocusChanged(boolean)");
        mSuperListeners.pop().call(hasFocus);
    }

    public android.view.ActionMode onWindowStartingActionMode(
            final android.view.ActionMode.Callback callback) {
        verifyMethodCalledFromDelegate(
                "onWindowStartingActionMode(android.view.ActionMode.Callback)");
        return (android.view.ActionMode) mSuperListeners.pop().call(callback);
    }

    public android.view.ActionMode onWindowStartingActionMode(
            final android.view.ActionMode.Callback callback, final int type) {
        verifyMethodCalledFromDelegate(
                "onWindowStartingActionMode(android.view.ActionMode.Callback, int)");
        return (android.view.ActionMode) mSuperListeners.pop().call(callback, type);
    }

    public ActionMode onWindowStartingSupportActionMode(
            @NonNull final ActionMode.Callback callback) {
        verifyMethodCalledFromDelegate("onWindowStartingSupportActionMode(ActionMode.Callback)");
        return (ActionMode) mSuperListeners.pop().call(callback);
    }

    public void openContextMenu(final View view) {
        verifyMethodCalledFromDelegate("openContextMenu(View)");
        mSuperListeners.pop().call(view);
    }

    public FileInputStream openFileInput(final String name) throws FileNotFoundException {
        verifyMethodCalledFromDelegate("openFileInput(String)");
        return (FileInputStream) mSuperListeners.pop().call(name);
    }

    public FileOutputStream openFileOutput(final String name, final int mode)
            throws FileNotFoundException {
        verifyMethodCalledFromDelegate("openFileOutput(String, int)");
        return (FileOutputStream) mSuperListeners.pop().call(name, mode);
    }

    public void openOptionsMenu() {
        verifyMethodCalledFromDelegate("openOptionsMenu()");
        mSuperListeners.pop().call();
    }

    public SQLiteDatabase openOrCreateDatabase(final String name, final int mode,
            final SQLiteDatabase.CursorFactory factory) {
        verifyMethodCalledFromDelegate(
                "openOrCreateDatabase(String, int, SQLiteDatabase.CursorFactory)");
        return (SQLiteDatabase) mSuperListeners.pop().call(name, mode, factory);
    }

    public SQLiteDatabase openOrCreateDatabase(final String name, final int mode,
            final SQLiteDatabase.CursorFactory factory, final DatabaseErrorHandler errorHandler) {
        verifyMethodCalledFromDelegate(
                "openOrCreateDatabase(String, int, SQLiteDatabase.CursorFactory, DatabaseErrorHandler)");
        return (SQLiteDatabase) mSuperListeners.pop().call(name, mode, factory, errorHandler);
    }

    public void overridePendingTransition(final int enterAnim, final int exitAnim) {
        verifyMethodCalledFromDelegate("overridePendingTransition(int, int)");
        mSuperListeners.pop().call(enterAnim, exitAnim);
    }

    public Drawable peekWallpaper() {
        verifyMethodCalledFromDelegate("peekWallpaper()");
        return (Drawable) mSuperListeners.pop().call();
    }

    public void postponeEnterTransition() {
        verifyMethodCalledFromDelegate("postponeEnterTransition()");
        mSuperListeners.pop().call();
    }

    public void recreate() {
        verifyMethodCalledFromDelegate("recreate()");
        mSuperListeners.pop().call();
    }

    public void registerComponentCallbacks(final ComponentCallbacks callback) {
        verifyMethodCalledFromDelegate("registerComponentCallbacks(ComponentCallbacks)");
        mSuperListeners.pop().call(callback);
    }

    public void registerForContextMenu(final View view) {
        verifyMethodCalledFromDelegate("registerForContextMenu(View)");
        mSuperListeners.pop().call(view);
    }

    public Intent registerReceiver(final BroadcastReceiver receiver, final IntentFilter filter) {
        verifyMethodCalledFromDelegate("registerReceiver(BroadcastReceiver, IntentFilter)");
        return (Intent) mSuperListeners.pop().call(receiver, filter);
    }

    public Intent registerReceiver(final BroadcastReceiver receiver, final IntentFilter filter,
            final String broadcastPermission, final Handler scheduler) {
        verifyMethodCalledFromDelegate(
                "registerReceiver(BroadcastReceiver, IntentFilter, String, Handler)");
        return (Intent) mSuperListeners.pop()
                .call(receiver, filter, broadcastPermission, scheduler);
    }

    public boolean releaseInstance() {
        verifyMethodCalledFromDelegate("releaseInstance()");
        return (Boolean) mSuperListeners.pop().call();
    }

    public void removeStickyBroadcast(final Intent intent) {
        verifyMethodCalledFromDelegate("removeStickyBroadcast(Intent)");
        mSuperListeners.pop().call(intent);
    }

    public void removeStickyBroadcastAsUser(final Intent intent, final UserHandle user) {
        verifyMethodCalledFromDelegate("removeStickyBroadcastAsUser(Intent, UserHandle)");
        mSuperListeners.pop().call(intent, user);
    }

    public void reportFullyDrawn() {
        verifyMethodCalledFromDelegate("reportFullyDrawn()");
        mSuperListeners.pop().call();
    }

    public boolean requestVisibleBehind(final boolean visible) {
        verifyMethodCalledFromDelegate("requestVisibleBehind(boolean)");
        return (Boolean) mSuperListeners.pop().call(visible);
    }

    public void revokeUriPermission(final Uri uri, final int modeFlags) {
        verifyMethodCalledFromDelegate("revokeUriPermission(Uri, int)");
        mSuperListeners.pop().call(uri, modeFlags);
    }

    public void sendBroadcast(final Intent intent) {
        verifyMethodCalledFromDelegate("sendBroadcast(Intent)");
        mSuperListeners.pop().call(intent);
    }

    public void sendBroadcast(final Intent intent, final String receiverPermission) {
        verifyMethodCalledFromDelegate("sendBroadcast(Intent, String)");
        mSuperListeners.pop().call(intent, receiverPermission);
    }

    public void sendBroadcastAsUser(final Intent intent, final UserHandle user) {
        verifyMethodCalledFromDelegate("sendBroadcastAsUser(Intent, UserHandle)");
        mSuperListeners.pop().call(intent, user);
    }

    public void sendBroadcastAsUser(final Intent intent, final UserHandle user,
            final String receiverPermission) {
        verifyMethodCalledFromDelegate("sendBroadcastAsUser(Intent, UserHandle, String)");
        mSuperListeners.pop().call(intent, user, receiverPermission);
    }

    public void sendOrderedBroadcast(final Intent intent, final String receiverPermission) {
        verifyMethodCalledFromDelegate("sendOrderedBroadcast(Intent, String)");
        mSuperListeners.pop().call(intent, receiverPermission);
    }

    public void sendOrderedBroadcast(final Intent intent, final String receiverPermission,
            final BroadcastReceiver resultReceiver, final Handler scheduler, final int initialCode,
            final String initialData, final Bundle initialExtras) {
        verifyMethodCalledFromDelegate(
                "sendOrderedBroadcast(Intent, String, BroadcastReceiver, Handler, int, String, Bundle)");
        mSuperListeners.pop()
                .call(intent, receiverPermission, resultReceiver, scheduler, initialCode,
                        initialData, initialExtras);
    }

    public void sendOrderedBroadcastAsUser(final Intent intent, final UserHandle user,
            final String receiverPermission, final BroadcastReceiver resultReceiver,
            final Handler scheduler, final int initialCode, final String initialData,
            final Bundle initialExtras) {
        verifyMethodCalledFromDelegate(
                "sendOrderedBroadcastAsUser(Intent, UserHandle, String, BroadcastReceiver, Handler, int, String, Bundle)");
        mSuperListeners.pop()
                .call(intent, user, receiverPermission, resultReceiver, scheduler, initialCode,
                        initialData, initialExtras);
    }

    public void sendStickyBroadcast(final Intent intent) {
        verifyMethodCalledFromDelegate("sendStickyBroadcast(Intent)");
        mSuperListeners.pop().call(intent);
    }

    public void sendStickyBroadcastAsUser(final Intent intent, final UserHandle user) {
        verifyMethodCalledFromDelegate("sendStickyBroadcastAsUser(Intent, UserHandle)");
        mSuperListeners.pop().call(intent, user);
    }

    public void sendStickyOrderedBroadcast(final Intent intent,
            final BroadcastReceiver resultReceiver, final Handler scheduler, final int initialCode,
            final String initialData, final Bundle initialExtras) {
        verifyMethodCalledFromDelegate(
                "sendStickyOrderedBroadcast(Intent, BroadcastReceiver, Handler, int, String, Bundle)");
        mSuperListeners.pop()
                .call(intent, resultReceiver, scheduler, initialCode, initialData, initialExtras);
    }

    public void sendStickyOrderedBroadcastAsUser(final Intent intent, final UserHandle user,
            final BroadcastReceiver resultReceiver, final Handler scheduler, final int initialCode,
            final String initialData, final Bundle initialExtras) {
        verifyMethodCalledFromDelegate(
                "sendStickyOrderedBroadcastAsUser(Intent, UserHandle, BroadcastReceiver, Handler, int, String, Bundle)");
        mSuperListeners.pop()
                .call(intent, user, resultReceiver, scheduler, initialCode, initialData,
                        initialExtras);
    }

    public void setActionBar(final Toolbar toolbar) {
        verifyMethodCalledFromDelegate("setActionBar(Toolbar)");
        mSuperListeners.pop().call(toolbar);
    }

    public void setContentTransitionManager(final TransitionManager tm) {
        verifyMethodCalledFromDelegate("setContentTransitionManager(TransitionManager)");
        mSuperListeners.pop().call(tm);
    }

    public void setContentView(@LayoutRes final int layoutResID) {
        verifyMethodCalledFromDelegate("setContentView(int)");
        mSuperListeners.pop().call(layoutResID);
    }

    public void setContentView(final View view) {
        verifyMethodCalledFromDelegate("setContentView(View)");
        mSuperListeners.pop().call(view);
    }

    public void setContentView(final View view, final ViewGroup.LayoutParams params) {
        verifyMethodCalledFromDelegate("setContentView(View, ViewGroup.LayoutParams)");
        mSuperListeners.pop().call(view, params);
    }

    public void setEnterSharedElementCallback(final SharedElementCallback callback) {
        verifyMethodCalledFromDelegate("setEnterSharedElementCallback(SharedElementCallback)");
        mSuperListeners.pop().call(callback);
    }

    public void setEnterSharedElementCallback(final android.app.SharedElementCallback callback) {
        verifyMethodCalledFromDelegate(
                "setEnterSharedElementCallback(android.app.SharedElementCallback)");
        mSuperListeners.pop().call(callback);
    }

    public void setExitSharedElementCallback(final SharedElementCallback listener) {
        verifyMethodCalledFromDelegate("setExitSharedElementCallback(SharedElementCallback)");
        mSuperListeners.pop().call(listener);
    }

    public void setExitSharedElementCallback(final android.app.SharedElementCallback callback) {
        verifyMethodCalledFromDelegate(
                "setExitSharedElementCallback(android.app.SharedElementCallback)");
        mSuperListeners.pop().call(callback);
    }

    public void setFinishOnTouchOutside(final boolean finish) {
        verifyMethodCalledFromDelegate("setFinishOnTouchOutside(boolean)");
        mSuperListeners.pop().call(finish);
    }

    public void setImmersive(final boolean i) {
        verifyMethodCalledFromDelegate("setImmersive(boolean)");
        mSuperListeners.pop().call(i);
    }

    public void setIntent(final Intent newIntent) {
        verifyMethodCalledFromDelegate("setIntent(Intent)");
        mSuperListeners.pop().call(newIntent);
    }

    public void setRequestedOrientation(final int requestedOrientation) {
        verifyMethodCalledFromDelegate("setRequestedOrientation(int)");
        mSuperListeners.pop().call(requestedOrientation);
    }

    public void setSupportActionBar(@Nullable final android.support.v7.widget.Toolbar toolbar) {
        verifyMethodCalledFromDelegate("setSupportActionBar(android.support.v7.widget.Toolbar)");
        mSuperListeners.pop().call(toolbar);
    }

    public void setSupportProgress(final int progress) {
        verifyMethodCalledFromDelegate("setSupportProgress(int)");
        mSuperListeners.pop().call(progress);
    }

    public void setSupportProgressBarIndeterminate(final boolean indeterminate) {
        verifyMethodCalledFromDelegate("setSupportProgressBarIndeterminate(boolean)");
        mSuperListeners.pop().call(indeterminate);
    }

    public void setSupportProgressBarIndeterminateVisibility(final boolean visible) {
        verifyMethodCalledFromDelegate("setSupportProgressBarIndeterminateVisibility(boolean)");
        mSuperListeners.pop().call(visible);
    }

    public void setSupportProgressBarVisibility(final boolean visible) {
        verifyMethodCalledFromDelegate("setSupportProgressBarVisibility(boolean)");
        mSuperListeners.pop().call(visible);
    }

    public void setTaskDescription(final ActivityManager.TaskDescription taskDescription) {
        verifyMethodCalledFromDelegate("setTaskDescription(ActivityManager.TaskDescription)");
        mSuperListeners.pop().call(taskDescription);
    }

    public void setTheme(@StyleRes final int resid) {
        verifyMethodCalledFromDelegate("setTheme(int)");
        mSuperListeners.pop().call(resid);
    }

    public void setTitle(final CharSequence title) {
        verifyMethodCalledFromDelegate("setTitle(CharSequence)");
        mSuperListeners.pop().call(title);
    }

    public void setTitle(final int titleId) {
        verifyMethodCalledFromDelegate("setTitle(int)");
        mSuperListeners.pop().call(titleId);
    }

    public void setTitleColor(final int textColor) {
        verifyMethodCalledFromDelegate("setTitleColor(int)");
        mSuperListeners.pop().call(textColor);
    }

    public void setVisible(final boolean visible) {
        verifyMethodCalledFromDelegate("setVisible(boolean)");
        mSuperListeners.pop().call(visible);
    }

    public void setWallpaper(final Bitmap bitmap) throws IOException {
        verifyMethodCalledFromDelegate("setWallpaper(Bitmap)");
        mSuperListeners.pop().call(bitmap);
    }

    public void setWallpaper(final InputStream data) throws IOException {
        verifyMethodCalledFromDelegate("setWallpaper(InputStream)");
        mSuperListeners.pop().call(data);
    }

    public boolean shouldShowRequestPermissionRationale(@NonNull final String permission) {
        verifyMethodCalledFromDelegate("shouldShowRequestPermissionRationale(String)");
        return (Boolean) mSuperListeners.pop().call(permission);
    }

    public boolean shouldUpRecreateTask(final Intent targetIntent) {
        verifyMethodCalledFromDelegate("shouldUpRecreateTask(Intent)");
        return (Boolean) mSuperListeners.pop().call(targetIntent);
    }

    public boolean showAssist(final Bundle args) {
        verifyMethodCalledFromDelegate("showAssist(Bundle)");
        return (Boolean) mSuperListeners.pop().call(args);
    }

    public void showLockTaskEscapeMessage() {
        verifyMethodCalledFromDelegate("showLockTaskEscapeMessage()");
        mSuperListeners.pop().call();
    }

    public android.view.ActionMode startActionMode(
            final android.view.ActionMode.Callback callback) {
        verifyMethodCalledFromDelegate("startActionMode(android.view.ActionMode.Callback)");
        return (android.view.ActionMode) mSuperListeners.pop().call(callback);
    }

    public android.view.ActionMode startActionMode(final android.view.ActionMode.Callback callback,
            final int type) {
        verifyMethodCalledFromDelegate("startActionMode(android.view.ActionMode.Callback, int)");
        return (android.view.ActionMode) mSuperListeners.pop().call(callback, type);
    }

    public void startActivities(final Intent[] intents) {
        verifyMethodCalledFromDelegate("startActivities(Intent[])");
        mSuperListeners.pop().call(intents);
    }

    public void startActivities(final Intent[] intents, final Bundle options) {
        verifyMethodCalledFromDelegate("startActivities(Intent[], Bundle)");
        mSuperListeners.pop().call(intents, options);
    }

    public void startActivity(final Intent intent) {
        verifyMethodCalledFromDelegate("startActivity(Intent)");
        mSuperListeners.pop().call(intent);
    }

    public void startActivity(final Intent intent, final Bundle options) {
        verifyMethodCalledFromDelegate("startActivity(Intent, Bundle)");
        mSuperListeners.pop().call(intent, options);
    }

    public void startActivityForResult(final Intent intent, final int requestCode) {
        verifyMethodCalledFromDelegate("startActivityForResult(Intent, int)");
        mSuperListeners.pop().call(intent, requestCode);
    }

    public void startActivityForResult(final Intent intent, final int requestCode,
            final Bundle options) {
        verifyMethodCalledFromDelegate("startActivityForResult(Intent, int, Bundle)");
        mSuperListeners.pop().call(intent, requestCode, options);
    }

    public void startActivityFromChild(@NonNull final Activity child, final Intent intent,
            final int requestCode) {
        verifyMethodCalledFromDelegate("startActivityFromChild(Activity, Intent, int)");
        mSuperListeners.pop().call(child, intent, requestCode);
    }

    public void startActivityFromChild(@NonNull final Activity child, final Intent intent,
            final int requestCode, final Bundle options) {
        verifyMethodCalledFromDelegate("startActivityFromChild(Activity, Intent, int, Bundle)");
        mSuperListeners.pop().call(child, intent, requestCode, options);
    }

    public void startActivityFromFragment(final Fragment fragment, final Intent intent,
            final int requestCode) {
        verifyMethodCalledFromDelegate("startActivityFromFragment(Fragment, Intent, int)");
        mSuperListeners.pop().call(fragment, intent, requestCode);
    }

    public void startActivityFromFragment(final Fragment fragment, final Intent intent,
            final int requestCode, @Nullable final Bundle options) {
        verifyMethodCalledFromDelegate("startActivityFromFragment(Fragment, Intent, int, Bundle)");
        mSuperListeners.pop().call(fragment, intent, requestCode, options);
    }

    public void startActivityFromFragment(@NonNull final android.app.Fragment fragment,
            final Intent intent, final int requestCode) {
        verifyMethodCalledFromDelegate(
                "startActivityFromFragment(android.app.Fragment, Intent, int)");
        mSuperListeners.pop().call(fragment, intent, requestCode);
    }

    public void startActivityFromFragment(@NonNull final android.app.Fragment fragment,
            final Intent intent, final int requestCode, final Bundle options) {
        verifyMethodCalledFromDelegate(
                "startActivityFromFragment(android.app.Fragment, Intent, int, Bundle)");
        mSuperListeners.pop().call(fragment, intent, requestCode, options);
    }

    public boolean startActivityIfNeeded(@NonNull final Intent intent, final int requestCode) {
        verifyMethodCalledFromDelegate("startActivityIfNeeded(Intent, int)");
        return (Boolean) mSuperListeners.pop().call(intent, requestCode);
    }

    public boolean startActivityIfNeeded(@NonNull final Intent intent, final int requestCode,
            final Bundle options) {
        verifyMethodCalledFromDelegate("startActivityIfNeeded(Intent, int, Bundle)");
        return (Boolean) mSuperListeners.pop().call(intent, requestCode, options);
    }

    public boolean startInstrumentation(final ComponentName className, final String profileFile,
            final Bundle arguments) {
        verifyMethodCalledFromDelegate("startInstrumentation(ComponentName, String, Bundle)");
        return (Boolean) mSuperListeners.pop().call(className, profileFile, arguments);
    }

    public void startIntentSender(final IntentSender intent, final Intent fillInIntent,
            final int flagsMask, final int flagsValues, final int extraFlags)
            throws IntentSender.SendIntentException {
        verifyMethodCalledFromDelegate("startIntentSender(IntentSender, Intent, int, int, int)");
        mSuperListeners.pop().call(intent, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    public void startIntentSender(final IntentSender intent, final Intent fillInIntent,
            final int flagsMask, final int flagsValues, final int extraFlags, final Bundle options)
            throws IntentSender.SendIntentException {
        verifyMethodCalledFromDelegate(
                "startIntentSender(IntentSender, Intent, int, int, int, Bundle)");
        mSuperListeners.pop()
                .call(intent, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    public void startIntentSenderForResult(final IntentSender intent, final int requestCode,
            final Intent fillInIntent, final int flagsMask, final int flagsValues,
            final int extraFlags) throws IntentSender.SendIntentException {
        verifyMethodCalledFromDelegate(
                "startIntentSenderForResult(IntentSender, int, Intent, int, int, int)");
        mSuperListeners.pop()
                .call(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    public void startIntentSenderForResult(final IntentSender intent, final int requestCode,
            final Intent fillInIntent, final int flagsMask, final int flagsValues,
            final int extraFlags, final Bundle options) throws IntentSender.SendIntentException {
        verifyMethodCalledFromDelegate(
                "startIntentSenderForResult(IntentSender, int, Intent, int, int, int, Bundle)");
        mSuperListeners.pop()
                .call(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags,
                        options);
    }

    public void startIntentSenderFromChild(final Activity child, final IntentSender intent,
            final int requestCode, final Intent fillInIntent, final int flagsMask,
            final int flagsValues, final int extraFlags) throws IntentSender.SendIntentException {
        verifyMethodCalledFromDelegate(
                "startIntentSenderFromChild(Activity, IntentSender, int, Intent, int, int, int)");
        mSuperListeners.pop()
                .call(child, intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    public void startIntentSenderFromChild(final Activity child, final IntentSender intent,
            final int requestCode, final Intent fillInIntent, final int flagsMask,
            final int flagsValues, final int extraFlags, final Bundle options)
            throws IntentSender.SendIntentException {
        verifyMethodCalledFromDelegate(
                "startIntentSenderFromChild(Activity, IntentSender, int, Intent, int, int, int, Bundle)");
        mSuperListeners.pop()
                .call(child, intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags,
                        options);
    }

    public void startLockTask() {
        verifyMethodCalledFromDelegate("startLockTask()");
        mSuperListeners.pop().call();
    }

    public void startManagingCursor(final Cursor c) {
        verifyMethodCalledFromDelegate("startManagingCursor(Cursor)");
        mSuperListeners.pop().call(c);
    }

    public boolean startNextMatchingActivity(@NonNull final Intent intent) {
        verifyMethodCalledFromDelegate("startNextMatchingActivity(Intent)");
        return (Boolean) mSuperListeners.pop().call(intent);
    }

    public boolean startNextMatchingActivity(@NonNull final Intent intent, final Bundle options) {
        verifyMethodCalledFromDelegate("startNextMatchingActivity(Intent, Bundle)");
        return (Boolean) mSuperListeners.pop().call(intent, options);
    }

    public void startPostponedEnterTransition() {
        verifyMethodCalledFromDelegate("startPostponedEnterTransition()");
        mSuperListeners.pop().call();
    }

    public void startSearch(final String initialQuery, final boolean selectInitialQuery,
            final Bundle appSearchData, final boolean globalSearch) {
        verifyMethodCalledFromDelegate("startSearch(String, boolean, Bundle, boolean)");
        mSuperListeners.pop().call(initialQuery, selectInitialQuery, appSearchData, globalSearch);
    }

    public ComponentName startService(final Intent service) {
        verifyMethodCalledFromDelegate("startService(Intent)");
        return (ComponentName) mSuperListeners.pop().call(service);
    }

    public ActionMode startSupportActionMode(@NonNull final ActionMode.Callback callback) {
        verifyMethodCalledFromDelegate("startSupportActionMode(ActionMode.Callback)");
        return (ActionMode) mSuperListeners.pop().call(callback);
    }

    public void stopLockTask() {
        verifyMethodCalledFromDelegate("stopLockTask()");
        mSuperListeners.pop().call();
    }

    public void stopManagingCursor(final Cursor c) {
        verifyMethodCalledFromDelegate("stopManagingCursor(Cursor)");
        mSuperListeners.pop().call(c);
    }

    public boolean stopService(final Intent name) {
        verifyMethodCalledFromDelegate("stopService(Intent)");
        return (Boolean) mSuperListeners.pop().call(name);
    }

    public void supportFinishAfterTransition() {
        verifyMethodCalledFromDelegate("supportFinishAfterTransition()");
        mSuperListeners.pop().call();
    }

    public void supportInvalidateOptionsMenu() {
        verifyMethodCalledFromDelegate("supportInvalidateOptionsMenu()");
        mSuperListeners.pop().call();
    }

    public void supportNavigateUpTo(@NonNull final Intent upIntent) {
        verifyMethodCalledFromDelegate("supportNavigateUpTo(Intent)");
        mSuperListeners.pop().call(upIntent);
    }

    public void supportPostponeEnterTransition() {
        verifyMethodCalledFromDelegate("supportPostponeEnterTransition()");
        mSuperListeners.pop().call();
    }

    public boolean supportRequestWindowFeature(final int featureId) {
        verifyMethodCalledFromDelegate("supportRequestWindowFeature(int)");
        return (Boolean) mSuperListeners.pop().call(featureId);
    }

    public boolean supportShouldUpRecreateTask(@NonNull final Intent targetIntent) {
        verifyMethodCalledFromDelegate("supportShouldUpRecreateTask(Intent)");
        return (Boolean) mSuperListeners.pop().call(targetIntent);
    }

    public void supportStartPostponedEnterTransition() {
        verifyMethodCalledFromDelegate("supportStartPostponedEnterTransition()");
        mSuperListeners.pop().call();
    }

    public void takeKeyEvents(final boolean get) {
        verifyMethodCalledFromDelegate("takeKeyEvents(boolean)");
        mSuperListeners.pop().call(get);
    }

    public void triggerSearch(final String query, final Bundle appSearchData) {
        verifyMethodCalledFromDelegate("triggerSearch(String, Bundle)");
        mSuperListeners.pop().call(query, appSearchData);
    }

    public void unbindService(final ServiceConnection conn) {
        verifyMethodCalledFromDelegate("unbindService(ServiceConnection)");
        mSuperListeners.pop().call(conn);
    }

    public void unregisterComponentCallbacks(final ComponentCallbacks callback) {
        verifyMethodCalledFromDelegate("unregisterComponentCallbacks(ComponentCallbacks)");
        mSuperListeners.pop().call(callback);
    }

    public void unregisterForContextMenu(final View view) {
        verifyMethodCalledFromDelegate("unregisterForContextMenu(View)");
        mSuperListeners.pop().call(view);
    }

    public void unregisterReceiver(final BroadcastReceiver receiver) {
        verifyMethodCalledFromDelegate("unregisterReceiver(BroadcastReceiver)");
        mSuperListeners.pop().call(receiver);
    }

    void addContentView(final NamedSuperCall<Void> superCall, final View view,
            final ViewGroup.LayoutParams params) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            addContentView(view, params);
        }
    }

    void applyOverrideConfiguration(final NamedSuperCall<Void> superCall,
            final Configuration overrideConfiguration) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            applyOverrideConfiguration(overrideConfiguration);
        }
    }

    void attachBaseContext(final NamedSuperCall<Void> superCall, final Context newBase) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            attachBaseContext(newBase);
        }
    }

    boolean bindService(final NamedSuperCall<Boolean> superCall, final Intent service,
            final ServiceConnection conn, final int flags) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return bindService(service, conn, flags);
        }
    }

    int checkCallingOrSelfPermission(final NamedSuperCall<Integer> superCall,
            final String permission) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return checkCallingOrSelfPermission(permission);
        }
    }

    int checkCallingOrSelfUriPermission(final NamedSuperCall<Integer> superCall, final Uri uri,
            final int modeFlags) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return checkCallingOrSelfUriPermission(uri, modeFlags);
        }
    }

    int checkCallingPermission(final NamedSuperCall<Integer> superCall, final String permission) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return checkCallingPermission(permission);
        }
    }

    int checkCallingUriPermission(final NamedSuperCall<Integer> superCall, final Uri uri,
            final int modeFlags) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return checkCallingUriPermission(uri, modeFlags);
        }
    }

    int checkPermission(final NamedSuperCall<Integer> superCall, final String permission,
            final int pid, final int uid) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return checkPermission(permission, pid, uid);
        }
    }

    int checkSelfPermission(final NamedSuperCall<Integer> superCall, final String permission) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return checkSelfPermission(permission);
        }
    }

    int checkUriPermission(final NamedSuperCall<Integer> superCall, final Uri uri, final int pid,
            final int uid, final int modeFlags) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return checkUriPermission(uri, pid, uid, modeFlags);
        }
    }

    int checkUriPermission(final NamedSuperCall<Integer> superCall, final Uri uri,
            final String readPermission, final String writePermission, final int pid, final int uid,
            final int modeFlags) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return checkUriPermission(uri, readPermission, writePermission, pid, uid, modeFlags);
        }
    }

    void clearWallpaper(final NamedSuperCall<Void> superCall) throws IOException {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            clearWallpaper();
        }
    }

    void closeContextMenu(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            closeContextMenu();
        }
    }

    void closeOptionsMenu(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            closeOptionsMenu();
        }
    }

    Context createConfigurationContext(final NamedSuperCall<Context> superCall,
            final Configuration overrideConfiguration) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return createConfigurationContext(overrideConfiguration);
        }
    }

    Context createDisplayContext(final NamedSuperCall<Context> superCall, final Display display) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return createDisplayContext(display);
        }
    }

    Context createPackageContext(final NamedSuperCall<Context> superCall, final String packageName,
            final int flags) throws PackageManager.NameNotFoundException {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return createPackageContext(packageName, flags);
        }
    }

    PendingIntent createPendingResult(final NamedSuperCall<PendingIntent> superCall,
            final int requestCode, @NonNull final Intent data, final int flags) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return createPendingResult(requestCode, data, flags);
        }
    }

    String[] databaseList(final NamedSuperCall<String[]> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return databaseList();
        }
    }

    boolean deleteDatabase(final NamedSuperCall<Boolean> superCall, final String name) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return deleteDatabase(name);
        }
    }

    boolean deleteFile(final NamedSuperCall<Boolean> superCall, final String name) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return deleteFile(name);
        }
    }

    boolean dispatchGenericMotionEvent(final NamedSuperCall<Boolean> superCall,
            final MotionEvent ev) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return dispatchGenericMotionEvent(ev);
        }
    }

    boolean dispatchKeyEvent(final NamedSuperCall<Boolean> superCall, final KeyEvent event) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return dispatchKeyEvent(event);
        }
    }

    boolean dispatchKeyShortcutEvent(final NamedSuperCall<Boolean> superCall,
            final KeyEvent event) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return dispatchKeyShortcutEvent(event);
        }
    }

    boolean dispatchPopulateAccessibilityEvent(final NamedSuperCall<Boolean> superCall,
            final AccessibilityEvent event) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return dispatchPopulateAccessibilityEvent(event);
        }
    }

    boolean dispatchTouchEvent(final NamedSuperCall<Boolean> superCall, final MotionEvent ev) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return dispatchTouchEvent(ev);
        }
    }

    boolean dispatchTrackballEvent(final NamedSuperCall<Boolean> superCall, final MotionEvent ev) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return dispatchTrackballEvent(ev);
        }
    }

    void dump(final NamedSuperCall<Void> superCall, final String prefix, final FileDescriptor fd,
            final PrintWriter writer, final String[] args) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            dump(prefix, fd, writer, args);
        }
    }

    void enforceCallingOrSelfPermission(final NamedSuperCall<Void> superCall,
            final String permission, final String message) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            enforceCallingOrSelfPermission(permission, message);
        }
    }

    void enforceCallingOrSelfUriPermission(final NamedSuperCall<Void> superCall, final Uri uri,
            final int modeFlags, final String message) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            enforceCallingOrSelfUriPermission(uri, modeFlags, message);
        }
    }

    void enforceCallingPermission(final NamedSuperCall<Void> superCall, final String permission,
            final String message) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            enforceCallingPermission(permission, message);
        }
    }

    void enforceCallingUriPermission(final NamedSuperCall<Void> superCall, final Uri uri,
            final int modeFlags, final String message) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            enforceCallingUriPermission(uri, modeFlags, message);
        }
    }

    void enforcePermission(final NamedSuperCall<Void> superCall, final String permission,
            final int pid, final int uid, final String message) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            enforcePermission(permission, pid, uid, message);
        }
    }

    void enforceUriPermission(final NamedSuperCall<Void> superCall, final Uri uri, final int pid,
            final int uid, final int modeFlags, final String message) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            enforceUriPermission(uri, pid, uid, modeFlags, message);
        }
    }

    void enforceUriPermission(final NamedSuperCall<Void> superCall, final Uri uri,
            final String readPermission, final String writePermission, final int pid, final int uid,
            final int modeFlags, final String message) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            enforceUriPermission(uri, readPermission, writePermission, pid, uid, modeFlags,
                    message);
        }
    }

    String[] fileList(final NamedSuperCall<String[]> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return fileList();
        }
    }

    View findViewById(final NamedSuperCall<View> superCall, @IdRes final int id) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return findViewById(id);
        }
    }

    void finish(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            finish();
        }
    }

    void finishActivity(final NamedSuperCall<Void> superCall, final int requestCode) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            finishActivity(requestCode);
        }
    }

    void finishActivityFromChild(final NamedSuperCall<Void> superCall,
            @NonNull final Activity child, final int requestCode) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            finishActivityFromChild(child, requestCode);
        }
    }

    void finishAffinity(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            finishAffinity();
        }
    }

    void finishAfterTransition(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            finishAfterTransition();
        }
    }

    void finishAndRemoveTask(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            finishAndRemoveTask();
        }
    }

    void finishFromChild(final NamedSuperCall<Void> superCall, final Activity child) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            finishFromChild(child);
        }
    }

    android.app.ActionBar getActionBar(final NamedSuperCall<android.app.ActionBar> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getActionBar();
        }
    }

    Context getApplicationContext(final NamedSuperCall<Context> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getApplicationContext();
        }
    }

    ApplicationInfo getApplicationInfo(final NamedSuperCall<ApplicationInfo> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getApplicationInfo();
        }
    }

    AssetManager getAssets(final NamedSuperCall<AssetManager> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getAssets();
        }
    }

    Context getBaseContext(final NamedSuperCall<Context> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getBaseContext();
        }
    }

    File getCacheDir(final NamedSuperCall<File> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getCacheDir();
        }
    }

    ComponentName getCallingActivity(final NamedSuperCall<ComponentName> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getCallingActivity();
        }
    }

    String getCallingPackage(final NamedSuperCall<String> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getCallingPackage();
        }
    }

    int getChangingConfigurations(final NamedSuperCall<Integer> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getChangingConfigurations();
        }
    }

    ClassLoader getClassLoader(final NamedSuperCall<ClassLoader> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getClassLoader();
        }
    }

    File getCodeCacheDir(final NamedSuperCall<File> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getCodeCacheDir();
        }
    }

    ComponentName getComponentName(final NamedSuperCall<ComponentName> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getComponentName();
        }
    }

    ContentResolver getContentResolver(final NamedSuperCall<ContentResolver> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getContentResolver();
        }
    }

    Scene getContentScene(final NamedSuperCall<Scene> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getContentScene();
        }
    }

    TransitionManager getContentTransitionManager(
            final NamedSuperCall<TransitionManager> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getContentTransitionManager();
        }
    }

    View getCurrentFocus(final NamedSuperCall<View> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getCurrentFocus();
        }
    }

    File getDatabasePath(final NamedSuperCall<File> superCall, final String name) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getDatabasePath(name);
        }
    }

    AppCompatDelegate getDelegate(final NamedSuperCall<AppCompatDelegate> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getDelegate();
        }
    }

    File getDir(final NamedSuperCall<File> superCall, final String name, final int mode) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getDir(name, mode);
        }
    }

    ActionBarDrawerToggle.Delegate getDrawerToggleDelegate(
            final NamedSuperCall<ActionBarDrawerToggle.Delegate> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getDrawerToggleDelegate();
        }
    }

    File getExternalCacheDir(final NamedSuperCall<File> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getExternalCacheDir();
        }
    }

    File[] getExternalCacheDirs(final NamedSuperCall<File[]> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getExternalCacheDirs();
        }
    }

    File getExternalFilesDir(final NamedSuperCall<File> superCall, final String type) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getExternalFilesDir(type);
        }
    }

    File[] getExternalFilesDirs(final NamedSuperCall<File[]> superCall, final String type) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getExternalFilesDirs(type);
        }
    }

    File[] getExternalMediaDirs(final NamedSuperCall<File[]> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getExternalMediaDirs();
        }
    }

    File getFileStreamPath(final NamedSuperCall<File> superCall, final String name) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getFileStreamPath(name);
        }
    }

    File getFilesDir(final NamedSuperCall<File> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getFilesDir();
        }
    }

    android.app.FragmentManager getFragmentManager(
            final NamedSuperCall<android.app.FragmentManager> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getFragmentManager();
        }
    }

    Intent getIntent(final NamedSuperCall<Intent> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getIntent();
        }
    }

    LayoutInflater getLayoutInflater(final NamedSuperCall<LayoutInflater> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getLayoutInflater();
        }
    }

    android.app.LoaderManager getLoaderManager(
            final NamedSuperCall<android.app.LoaderManager> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getLoaderManager();
        }
    }

    String getLocalClassName(final NamedSuperCall<String> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getLocalClassName();
        }
    }

    Looper getMainLooper(final NamedSuperCall<Looper> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getMainLooper();
        }
    }

    MenuInflater getMenuInflater(final NamedSuperCall<MenuInflater> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getMenuInflater();
        }
    }

    File getNoBackupFilesDir(final NamedSuperCall<File> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getNoBackupFilesDir();
        }
    }

    File getObbDir(final NamedSuperCall<File> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getObbDir();
        }
    }

    File[] getObbDirs(final NamedSuperCall<File[]> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getObbDirs();
        }
    }

    String getPackageCodePath(final NamedSuperCall<String> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getPackageCodePath();
        }
    }

    PackageManager getPackageManager(final NamedSuperCall<PackageManager> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getPackageManager();
        }
    }

    String getPackageName(final NamedSuperCall<String> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getPackageName();
        }
    }

    String getPackageResourcePath(final NamedSuperCall<String> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getPackageResourcePath();
        }
    }

    Intent getParentActivityIntent(final NamedSuperCall<Intent> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getParentActivityIntent();
        }
    }

    SharedPreferences getPreferences(final NamedSuperCall<SharedPreferences> superCall,
            final int mode) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getPreferences(mode);
        }
    }

    Uri getReferrer(final NamedSuperCall<Uri> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getReferrer();
        }
    }

    int getRequestedOrientation(final NamedSuperCall<Integer> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getRequestedOrientation();
        }
    }

    Resources getResources(final NamedSuperCall<Resources> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getResources();
        }
    }

    SharedPreferences getSharedPreferences(final NamedSuperCall<SharedPreferences> superCall,
            final String name, final int mode) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getSharedPreferences(name, mode);
        }
    }

    ActionBar getSupportActionBar(final NamedSuperCall<ActionBar> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getSupportActionBar();
        }
    }

    FragmentManager getSupportFragmentManager(final NamedSuperCall<FragmentManager> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getSupportFragmentManager();
        }
    }

    LoaderManager getSupportLoaderManager(final NamedSuperCall<LoaderManager> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getSupportLoaderManager();
        }
    }

    Intent getSupportParentActivityIntent(final NamedSuperCall<Intent> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getSupportParentActivityIntent();
        }
    }

    Object getSystemService(final NamedSuperCall<Object> superCall, @NonNull final String name) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getSystemService(name);
        }
    }

    String getSystemServiceName(final NamedSuperCall<String> superCall,
            final Class<?> serviceClass) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getSystemServiceName(serviceClass);
        }
    }

    int getTaskId(final NamedSuperCall<Integer> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getTaskId();
        }
    }

    Resources.Theme getTheme(final NamedSuperCall<Resources.Theme> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getTheme();
        }
    }

    VoiceInteractor getVoiceInteractor(final NamedSuperCall<VoiceInteractor> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getVoiceInteractor();
        }
    }

    Drawable getWallpaper(final NamedSuperCall<Drawable> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getWallpaper();
        }
    }

    int getWallpaperDesiredMinimumHeight(final NamedSuperCall<Integer> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getWallpaperDesiredMinimumHeight();
        }
    }

    int getWallpaperDesiredMinimumWidth(final NamedSuperCall<Integer> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getWallpaperDesiredMinimumWidth();
        }
    }

    Window getWindow(final NamedSuperCall<Window> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getWindow();
        }
    }

    WindowManager getWindowManager(final NamedSuperCall<WindowManager> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getWindowManager();
        }
    }

    void grantUriPermission(final NamedSuperCall<Void> superCall, final String toPackage,
            final Uri uri, final int modeFlags) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            grantUriPermission(toPackage, uri, modeFlags);
        }
    }

    boolean hasWindowFocus(final NamedSuperCall<Boolean> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return hasWindowFocus();
        }
    }

    void invalidateOptionsMenu(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            invalidateOptionsMenu();
        }
    }

    boolean isChangingConfigurations(final NamedSuperCall<Boolean> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return isChangingConfigurations();
        }
    }

    boolean isDestroyed(final NamedSuperCall<Boolean> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return isDestroyed();
        }
    }

    boolean isFinishing(final NamedSuperCall<Boolean> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return isFinishing();
        }
    }

    boolean isImmersive(final NamedSuperCall<Boolean> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return isImmersive();
        }
    }

    boolean isRestricted(final NamedSuperCall<Boolean> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return isRestricted();
        }
    }

    boolean isTaskRoot(final NamedSuperCall<Boolean> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return isTaskRoot();
        }
    }

    boolean isVoiceInteraction(final NamedSuperCall<Boolean> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return isVoiceInteraction();
        }
    }

    boolean isVoiceInteractionRoot(final NamedSuperCall<Boolean> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return isVoiceInteractionRoot();
        }
    }

    boolean moveTaskToBack(final NamedSuperCall<Boolean> superCall, final boolean nonRoot) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return moveTaskToBack(nonRoot);
        }
    }

    boolean navigateUpTo(final NamedSuperCall<Boolean> superCall, final Intent upIntent) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return navigateUpTo(upIntent);
        }
    }

    boolean navigateUpToFromChild(final NamedSuperCall<Boolean> superCall, final Activity child,
            final Intent upIntent) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return navigateUpToFromChild(child, upIntent);
        }
    }

    void onActionModeFinished(final NamedSuperCall<Void> superCall,
            final android.view.ActionMode mode) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onActionModeFinished(mode);
        }
    }

    void onActionModeStarted(final NamedSuperCall<Void> superCall,
            final android.view.ActionMode mode) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onActionModeStarted(mode);
        }
    }

    void onActivityReenter(final NamedSuperCall<Void> superCall, final int resultCode,
            final Intent data) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onActivityReenter(resultCode, data);
        }
    }

    void onActivityResult(final NamedSuperCall<Void> superCall, final int requestCode,
            final int resultCode, final Intent data) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onActivityResult(requestCode, resultCode, data);
        }
    }

    void onApplyThemeResource(final NamedSuperCall<Void> superCall, final Resources.Theme theme,
            final int resid, final boolean first) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onApplyThemeResource(theme, resid, first);
        }
    }

    void onAttachFragment(final NamedSuperCall<Void> superCall, final Fragment fragment) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onAttachFragment(fragment);
        }
    }

    void onAttachFragment(final NamedSuperCall<Void> superCall,
            final android.app.Fragment fragment) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onAttachFragment(fragment);
        }
    }

    void onAttachedToWindow(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onAttachedToWindow();
        }
    }

    void onBackPressed(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onBackPressed();
        }
    }

    void onChildTitleChanged(final NamedSuperCall<Void> superCall, final Activity childActivity,
            final CharSequence title) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onChildTitleChanged(childActivity, title);
        }
    }

    void onConfigurationChanged(final NamedSuperCall<Void> superCall,
            final Configuration newConfig) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onConfigurationChanged(newConfig);
        }
    }

    void onContentChanged(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onContentChanged();
        }
    }

    boolean onContextItemSelected(final NamedSuperCall<Boolean> superCall, final MenuItem item) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onContextItemSelected(item);
        }
    }

    void onContextMenuClosed(final NamedSuperCall<Void> superCall, final Menu menu) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onContextMenuClosed(menu);
        }
    }

    void onCreate(final NamedSuperCall<Void> superCall, @Nullable final Bundle savedInstanceState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onCreate(savedInstanceState);
        }
    }

    void onCreate(final NamedSuperCall<Void> superCall, final Bundle savedInstanceState,
            final PersistableBundle persistentState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onCreate(savedInstanceState, persistentState);
        }
    }

    void onCreateContextMenu(final NamedSuperCall<Void> superCall, final ContextMenu menu,
            final View v, final ContextMenu.ContextMenuInfo menuInfo) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onCreateContextMenu(menu, v, menuInfo);
        }
    }

    CharSequence onCreateDescription(final NamedSuperCall<CharSequence> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onCreateDescription();
        }
    }

    Dialog onCreateDialog(final NamedSuperCall<Dialog> superCall, final int id) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onCreateDialog(id);
        }
    }

    Dialog onCreateDialog(final NamedSuperCall<Dialog> superCall, final int id, final Bundle args) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onCreateDialog(id, args);
        }
    }

    void onCreateNavigateUpTaskStack(final NamedSuperCall<Void> superCall,
            final TaskStackBuilder builder) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onCreateNavigateUpTaskStack(builder);
        }
    }

    boolean onCreateOptionsMenu(final NamedSuperCall<Boolean> superCall, final Menu menu) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onCreateOptionsMenu(menu);
        }
    }

    boolean onCreatePanelMenu(final NamedSuperCall<Boolean> superCall, final int featureId,
            final Menu menu) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onCreatePanelMenu(featureId, menu);
        }
    }

    View onCreatePanelView(final NamedSuperCall<View> superCall, final int featureId) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onCreatePanelView(featureId);
        }
    }

    void onCreateSupportNavigateUpTaskStack(final NamedSuperCall<Void> superCall,
            @NonNull final android.support.v4.app.TaskStackBuilder builder) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onCreateSupportNavigateUpTaskStack(builder);
        }
    }

    boolean onCreateThumbnail(final NamedSuperCall<Boolean> superCall, final Bitmap outBitmap,
            final Canvas canvas) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onCreateThumbnail(outBitmap, canvas);
        }
    }

    View onCreateView(final NamedSuperCall<View> superCall, final View parent, final String name,
            final Context context, final AttributeSet attrs) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onCreateView(parent, name, context, attrs);
        }
    }

    View onCreateView(final NamedSuperCall<View> superCall, final String name,
            final Context context, final AttributeSet attrs) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onCreateView(name, context, attrs);
        }
    }

    void onDestroy(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onDestroy();
        }
    }

    void onDetachedFromWindow(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onDetachedFromWindow();
        }
    }

    void onEnterAnimationComplete(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onEnterAnimationComplete();
        }
    }

    boolean onGenericMotionEvent(final NamedSuperCall<Boolean> superCall, final MotionEvent event) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onGenericMotionEvent(event);
        }
    }

    boolean onKeyDown(final NamedSuperCall<Boolean> superCall, final int keyCode,
            final KeyEvent event) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onKeyDown(keyCode, event);
        }
    }

    boolean onKeyLongPress(final NamedSuperCall<Boolean> superCall, final int keyCode,
            final KeyEvent event) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onKeyLongPress(keyCode, event);
        }
    }

    boolean onKeyMultiple(final NamedSuperCall<Boolean> superCall, final int keyCode,
            final int repeatCount, final KeyEvent event) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onKeyMultiple(keyCode, repeatCount, event);
        }
    }

    boolean onKeyShortcut(final NamedSuperCall<Boolean> superCall, final int keyCode,
            final KeyEvent event) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onKeyShortcut(keyCode, event);
        }
    }

    boolean onKeyUp(final NamedSuperCall<Boolean> superCall, final int keyCode,
            final KeyEvent event) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onKeyUp(keyCode, event);
        }
    }

    void onLowMemory(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onLowMemory();
        }
    }

    boolean onMenuOpened(final NamedSuperCall<Boolean> superCall, final int featureId,
            final Menu menu) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onMenuOpened(featureId, menu);
        }
    }

    boolean onNavigateUp(final NamedSuperCall<Boolean> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onNavigateUp();
        }
    }

    boolean onNavigateUpFromChild(final NamedSuperCall<Boolean> superCall, final Activity child) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onNavigateUpFromChild(child);
        }
    }

    void onNewIntent(final NamedSuperCall<Void> superCall, final Intent intent) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onNewIntent(intent);
        }
    }

    boolean onOptionsItemSelected(final NamedSuperCall<Boolean> superCall, final MenuItem item) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onOptionsItemSelected(item);
        }
    }

    void onOptionsMenuClosed(final NamedSuperCall<Void> superCall, final Menu menu) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onOptionsMenuClosed(menu);
        }
    }

    void onPanelClosed(final NamedSuperCall<Void> superCall, final int featureId, final Menu menu) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onPanelClosed(featureId, menu);
        }
    }

    void onPause(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onPause();
        }
    }

    void onPostCreate(final NamedSuperCall<Void> superCall,
            @Nullable final Bundle savedInstanceState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onPostCreate(savedInstanceState);
        }
    }

    void onPostCreate(final NamedSuperCall<Void> superCall, final Bundle savedInstanceState,
            final PersistableBundle persistentState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onPostCreate(savedInstanceState, persistentState);
        }
    }

    void onPostResume(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onPostResume();
        }
    }

    void onPrepareDialog(final NamedSuperCall<Void> superCall, final int id, final Dialog dialog) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onPrepareDialog(id, dialog);
        }
    }

    void onPrepareDialog(final NamedSuperCall<Void> superCall, final int id, final Dialog dialog,
            final Bundle args) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onPrepareDialog(id, dialog, args);
        }
    }

    void onPrepareNavigateUpTaskStack(final NamedSuperCall<Void> superCall,
            final TaskStackBuilder builder) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onPrepareNavigateUpTaskStack(builder);
        }
    }

    boolean onPrepareOptionsMenu(final NamedSuperCall<Boolean> superCall, final Menu menu) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onPrepareOptionsMenu(menu);
        }
    }

    boolean onPrepareOptionsPanel(final NamedSuperCall<Boolean> superCall, final View view,
            final Menu menu) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onPrepareOptionsPanel(view, menu);
        }
    }

    boolean onPreparePanel(final NamedSuperCall<Boolean> superCall, final int featureId,
            final View view, final Menu menu) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onPreparePanel(featureId, view, menu);
        }
    }

    void onPrepareSupportNavigateUpTaskStack(final NamedSuperCall<Void> superCall,
            @NonNull final android.support.v4.app.TaskStackBuilder builder) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onPrepareSupportNavigateUpTaskStack(builder);
        }
    }

    void onProvideAssistContent(final NamedSuperCall<Void> superCall,
            final AssistContent outContent) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onProvideAssistContent(outContent);
        }
    }

    void onProvideAssistData(final NamedSuperCall<Void> superCall, final Bundle data) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onProvideAssistData(data);
        }
    }

    Uri onProvideReferrer(final NamedSuperCall<Uri> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onProvideReferrer();
        }
    }

    void onRequestPermissionsResult(final NamedSuperCall<Void> superCall, final int requestCode,
            @NonNull final String[] permissions, @NonNull final int[] grantResults) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }

    void onRestart(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onRestart();
        }
    }

    void onRestoreInstanceState(final NamedSuperCall<Void> superCall,
            final Bundle savedInstanceState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onRestoreInstanceState(savedInstanceState);
        }
    }

    void onRestoreInstanceState(final NamedSuperCall<Void> superCall,
            final Bundle savedInstanceState, final PersistableBundle persistentState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onRestoreInstanceState(savedInstanceState, persistentState);
        }
    }

    void onResume(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onResume();
        }
    }

    void onResumeFragments(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onResumeFragments();
        }
    }

    void onSaveInstanceState(final NamedSuperCall<Void> superCall, final Bundle outState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onSaveInstanceState(outState);
        }
    }

    void onSaveInstanceState(final NamedSuperCall<Void> superCall, final Bundle outState,
            final PersistableBundle outPersistentState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onSaveInstanceState(outState, outPersistentState);
        }
    }

    boolean onSearchRequested(final NamedSuperCall<Boolean> superCall,
            final SearchEvent searchEvent) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onSearchRequested(searchEvent);
        }
    }

    boolean onSearchRequested(final NamedSuperCall<Boolean> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onSearchRequested();
        }
    }

    void onStart(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onStart();
        }
    }

    void onStateNotSaved(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onStateNotSaved();
        }
    }

    void onStop(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onStop();
        }
    }

    void onSupportActionModeFinished(final NamedSuperCall<Void> superCall,
            @NonNull final ActionMode mode) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onSupportActionModeFinished(mode);
        }
    }

    void onSupportActionModeStarted(final NamedSuperCall<Void> superCall,
            @NonNull final ActionMode mode) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onSupportActionModeStarted(mode);
        }
    }

    void onSupportContentChanged(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onSupportContentChanged();
        }
    }

    boolean onSupportNavigateUp(final NamedSuperCall<Boolean> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onSupportNavigateUp();
        }
    }

    void onTitleChanged(final NamedSuperCall<Void> superCall, final CharSequence title,
            final int color) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onTitleChanged(title, color);
        }
    }

    boolean onTouchEvent(final NamedSuperCall<Boolean> superCall, final MotionEvent event) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onTouchEvent(event);
        }
    }

    boolean onTrackballEvent(final NamedSuperCall<Boolean> superCall, final MotionEvent event) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onTrackballEvent(event);
        }
    }

    void onTrimMemory(final NamedSuperCall<Void> superCall, final int level) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onTrimMemory(level);
        }
    }

    void onUserInteraction(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onUserInteraction();
        }
    }

    void onUserLeaveHint(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onUserLeaveHint();
        }
    }

    void onVisibleBehindCanceled(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onVisibleBehindCanceled();
        }
    }

    void onWindowAttributesChanged(final NamedSuperCall<Void> superCall,
            final WindowManager.LayoutParams params) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onWindowAttributesChanged(params);
        }
    }

    void onWindowFocusChanged(final NamedSuperCall<Void> superCall, final boolean hasFocus) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onWindowFocusChanged(hasFocus);
        }
    }

    android.view.ActionMode onWindowStartingActionMode(
            final NamedSuperCall<android.view.ActionMode> superCall,
            final android.view.ActionMode.Callback callback) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onWindowStartingActionMode(callback);
        }
    }

    android.view.ActionMode onWindowStartingActionMode(
            final NamedSuperCall<android.view.ActionMode> superCall,
            final android.view.ActionMode.Callback callback, final int type) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onWindowStartingActionMode(callback, type);
        }
    }

    ActionMode onWindowStartingSupportActionMode(final NamedSuperCall<ActionMode> superCall,
            @NonNull final ActionMode.Callback callback) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onWindowStartingSupportActionMode(callback);
        }
    }

    void openContextMenu(final NamedSuperCall<Void> superCall, final View view) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            openContextMenu(view);
        }
    }

    FileInputStream openFileInput(final NamedSuperCall<FileInputStream> superCall,
            final String name) throws FileNotFoundException {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return openFileInput(name);
        }
    }

    FileOutputStream openFileOutput(final NamedSuperCall<FileOutputStream> superCall,
            final String name, final int mode) throws FileNotFoundException {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return openFileOutput(name, mode);
        }
    }

    void openOptionsMenu(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            openOptionsMenu();
        }
    }

    SQLiteDatabase openOrCreateDatabase(final NamedSuperCall<SQLiteDatabase> superCall,
            final String name, final int mode, final SQLiteDatabase.CursorFactory factory) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return openOrCreateDatabase(name, mode, factory);
        }
    }

    SQLiteDatabase openOrCreateDatabase(final NamedSuperCall<SQLiteDatabase> superCall,
            final String name, final int mode, final SQLiteDatabase.CursorFactory factory,
            final DatabaseErrorHandler errorHandler) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return openOrCreateDatabase(name, mode, factory, errorHandler);
        }
    }

    void overridePendingTransition(final NamedSuperCall<Void> superCall, final int enterAnim,
            final int exitAnim) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            overridePendingTransition(enterAnim, exitAnim);
        }
    }

    Drawable peekWallpaper(final NamedSuperCall<Drawable> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return peekWallpaper();
        }
    }

    void postponeEnterTransition(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            postponeEnterTransition();
        }
    }

    void recreate(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            recreate();
        }
    }

    void registerComponentCallbacks(final NamedSuperCall<Void> superCall,
            final ComponentCallbacks callback) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            registerComponentCallbacks(callback);
        }
    }

    void registerForContextMenu(final NamedSuperCall<Void> superCall, final View view) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            registerForContextMenu(view);
        }
    }

    Intent registerReceiver(final NamedSuperCall<Intent> superCall,
            final BroadcastReceiver receiver, final IntentFilter filter) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return registerReceiver(receiver, filter);
        }
    }

    Intent registerReceiver(final NamedSuperCall<Intent> superCall,
            final BroadcastReceiver receiver, final IntentFilter filter,
            final String broadcastPermission, final Handler scheduler) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return registerReceiver(receiver, filter, broadcastPermission, scheduler);
        }
    }

    boolean releaseInstance(final NamedSuperCall<Boolean> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return releaseInstance();
        }
    }

    void removeStickyBroadcast(final NamedSuperCall<Void> superCall, final Intent intent) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            removeStickyBroadcast(intent);
        }
    }

    void removeStickyBroadcastAsUser(final NamedSuperCall<Void> superCall, final Intent intent,
            final UserHandle user) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            removeStickyBroadcastAsUser(intent, user);
        }
    }

    void reportFullyDrawn(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            reportFullyDrawn();
        }
    }

    boolean requestVisibleBehind(final NamedSuperCall<Boolean> superCall, final boolean visible) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return requestVisibleBehind(visible);
        }
    }

    void revokeUriPermission(final NamedSuperCall<Void> superCall, final Uri uri,
            final int modeFlags) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            revokeUriPermission(uri, modeFlags);
        }
    }

    void sendBroadcast(final NamedSuperCall<Void> superCall, final Intent intent) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            sendBroadcast(intent);
        }
    }

    void sendBroadcast(final NamedSuperCall<Void> superCall, final Intent intent,
            final String receiverPermission) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            sendBroadcast(intent, receiverPermission);
        }
    }

    void sendBroadcastAsUser(final NamedSuperCall<Void> superCall, final Intent intent,
            final UserHandle user) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            sendBroadcastAsUser(intent, user);
        }
    }

    void sendBroadcastAsUser(final NamedSuperCall<Void> superCall, final Intent intent,
            final UserHandle user, final String receiverPermission) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            sendBroadcastAsUser(intent, user, receiverPermission);
        }
    }

    void sendOrderedBroadcast(final NamedSuperCall<Void> superCall, final Intent intent,
            final String receiverPermission) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            sendOrderedBroadcast(intent, receiverPermission);
        }
    }

    void sendOrderedBroadcast(final NamedSuperCall<Void> superCall, final Intent intent,
            final String receiverPermission, final BroadcastReceiver resultReceiver,
            final Handler scheduler, final int initialCode, final String initialData,
            final Bundle initialExtras) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            sendOrderedBroadcast(intent, receiverPermission, resultReceiver, scheduler, initialCode,
                    initialData, initialExtras);
        }
    }

    void sendOrderedBroadcastAsUser(final NamedSuperCall<Void> superCall, final Intent intent,
            final UserHandle user, final String receiverPermission,
            final BroadcastReceiver resultReceiver, final Handler scheduler, final int initialCode,
            final String initialData, final Bundle initialExtras) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            sendOrderedBroadcastAsUser(intent, user, receiverPermission, resultReceiver, scheduler,
                    initialCode, initialData, initialExtras);
        }
    }

    void sendStickyBroadcast(final NamedSuperCall<Void> superCall, final Intent intent) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            sendStickyBroadcast(intent);
        }
    }

    void sendStickyBroadcastAsUser(final NamedSuperCall<Void> superCall, final Intent intent,
            final UserHandle user) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            sendStickyBroadcastAsUser(intent, user);
        }
    }

    void sendStickyOrderedBroadcast(final NamedSuperCall<Void> superCall, final Intent intent,
            final BroadcastReceiver resultReceiver, final Handler scheduler, final int initialCode,
            final String initialData, final Bundle initialExtras) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            sendStickyOrderedBroadcast(intent, resultReceiver, scheduler, initialCode, initialData,
                    initialExtras);
        }
    }

    void sendStickyOrderedBroadcastAsUser(final NamedSuperCall<Void> superCall, final Intent intent,
            final UserHandle user, final BroadcastReceiver resultReceiver, final Handler scheduler,
            final int initialCode, final String initialData, final Bundle initialExtras) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            sendStickyOrderedBroadcastAsUser(intent, user, resultReceiver, scheduler, initialCode,
                    initialData, initialExtras);
        }
    }

    void setActionBar(final NamedSuperCall<Void> superCall, final Toolbar toolbar) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setActionBar(toolbar);
        }
    }

    void setContentTransitionManager(final NamedSuperCall<Void> superCall,
            final TransitionManager tm) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setContentTransitionManager(tm);
        }
    }

    void setContentView(final NamedSuperCall<Void> superCall, @LayoutRes final int layoutResID) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setContentView(layoutResID);
        }
    }

    void setContentView(final NamedSuperCall<Void> superCall, final View view) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setContentView(view);
        }
    }

    void setContentView(final NamedSuperCall<Void> superCall, final View view,
            final ViewGroup.LayoutParams params) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setContentView(view, params);
        }
    }

    void setEnterSharedElementCallback(final NamedSuperCall<Void> superCall,
            final SharedElementCallback callback) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setEnterSharedElementCallback(callback);
        }
    }

    void setEnterSharedElementCallback(final NamedSuperCall<Void> superCall,
            final android.app.SharedElementCallback callback) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setEnterSharedElementCallback(callback);
        }
    }

    void setExitSharedElementCallback(final NamedSuperCall<Void> superCall,
            final SharedElementCallback listener) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setExitSharedElementCallback(listener);
        }
    }

    void setExitSharedElementCallback(final NamedSuperCall<Void> superCall,
            final android.app.SharedElementCallback callback) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setExitSharedElementCallback(callback);
        }
    }

    void setFinishOnTouchOutside(final NamedSuperCall<Void> superCall, final boolean finish) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setFinishOnTouchOutside(finish);
        }
    }

    void setImmersive(final NamedSuperCall<Void> superCall, final boolean i) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setImmersive(i);
        }
    }

    void setIntent(final NamedSuperCall<Void> superCall, final Intent newIntent) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setIntent(newIntent);
        }
    }

    void setRequestedOrientation(final NamedSuperCall<Void> superCall,
            final int requestedOrientation) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setRequestedOrientation(requestedOrientation);
        }
    }

    void setSupportActionBar(final NamedSuperCall<Void> superCall,
            @Nullable final android.support.v7.widget.Toolbar toolbar) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setSupportActionBar(toolbar);
        }
    }

    void setSupportProgress(final NamedSuperCall<Void> superCall, final int progress) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setSupportProgress(progress);
        }
    }

    void setSupportProgressBarIndeterminate(final NamedSuperCall<Void> superCall,
            final boolean indeterminate) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setSupportProgressBarIndeterminate(indeterminate);
        }
    }

    void setSupportProgressBarIndeterminateVisibility(final NamedSuperCall<Void> superCall,
            final boolean visible) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setSupportProgressBarIndeterminateVisibility(visible);
        }
    }

    void setSupportProgressBarVisibility(final NamedSuperCall<Void> superCall,
            final boolean visible) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setSupportProgressBarVisibility(visible);
        }
    }

    void setTaskDescription(final NamedSuperCall<Void> superCall,
            final ActivityManager.TaskDescription taskDescription) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setTaskDescription(taskDescription);
        }
    }

    void setTheme(final NamedSuperCall<Void> superCall, @StyleRes final int resid) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setTheme(resid);
        }
    }

    void setTitle(final NamedSuperCall<Void> superCall, final CharSequence title) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setTitle(title);
        }
    }

    void setTitle(final NamedSuperCall<Void> superCall, final int titleId) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setTitle(titleId);
        }
    }

    void setTitleColor(final NamedSuperCall<Void> superCall, final int textColor) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setTitleColor(textColor);
        }
    }

    void setVisible(final NamedSuperCall<Void> superCall, final boolean visible) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setVisible(visible);
        }
    }

    void setWallpaper(final NamedSuperCall<Void> superCall, final Bitmap bitmap)
            throws IOException {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setWallpaper(bitmap);
        }
    }

    void setWallpaper(final NamedSuperCall<Void> superCall, final InputStream data)
            throws IOException {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setWallpaper(data);
        }
    }

    boolean shouldShowRequestPermissionRationale(final NamedSuperCall<Boolean> superCall,
            @NonNull final String permission) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return shouldShowRequestPermissionRationale(permission);
        }
    }

    boolean shouldUpRecreateTask(final NamedSuperCall<Boolean> superCall,
            final Intent targetIntent) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return shouldUpRecreateTask(targetIntent);
        }
    }

    boolean showAssist(final NamedSuperCall<Boolean> superCall, final Bundle args) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return showAssist(args);
        }
    }

    void showLockTaskEscapeMessage(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            showLockTaskEscapeMessage();
        }
    }

    android.view.ActionMode startActionMode(final NamedSuperCall<android.view.ActionMode> superCall,
            final android.view.ActionMode.Callback callback) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return startActionMode(callback);
        }
    }

    android.view.ActionMode startActionMode(final NamedSuperCall<android.view.ActionMode> superCall,
            final android.view.ActionMode.Callback callback, final int type) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return startActionMode(callback, type);
        }
    }

    void startActivities(final NamedSuperCall<Void> superCall, final Intent[] intents) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startActivities(intents);
        }
    }

    void startActivities(final NamedSuperCall<Void> superCall, final Intent[] intents,
            final Bundle options) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startActivities(intents, options);
        }
    }

    void startActivity(final NamedSuperCall<Void> superCall, final Intent intent) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startActivity(intent);
        }
    }

    void startActivity(final NamedSuperCall<Void> superCall, final Intent intent,
            final Bundle options) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startActivity(intent, options);
        }
    }

    void startActivityForResult(final NamedSuperCall<Void> superCall, final Intent intent,
            final int requestCode) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startActivityForResult(intent, requestCode);
        }
    }

    void startActivityForResult(final NamedSuperCall<Void> superCall, final Intent intent,
            final int requestCode, final Bundle options) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startActivityForResult(intent, requestCode, options);
        }
    }

    void startActivityFromChild(final NamedSuperCall<Void> superCall, @NonNull final Activity child,
            final Intent intent, final int requestCode) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startActivityFromChild(child, intent, requestCode);
        }
    }

    void startActivityFromChild(final NamedSuperCall<Void> superCall, @NonNull final Activity child,
            final Intent intent, final int requestCode, final Bundle options) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startActivityFromChild(child, intent, requestCode, options);
        }
    }

    void startActivityFromFragment(final NamedSuperCall<Void> superCall, final Fragment fragment,
            final Intent intent, final int requestCode) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startActivityFromFragment(fragment, intent, requestCode);
        }
    }

    void startActivityFromFragment(final NamedSuperCall<Void> superCall, final Fragment fragment,
            final Intent intent, final int requestCode, @Nullable final Bundle options) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startActivityFromFragment(fragment, intent, requestCode, options);
        }
    }

    void startActivityFromFragment(final NamedSuperCall<Void> superCall,
            @NonNull final android.app.Fragment fragment, final Intent intent,
            final int requestCode) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startActivityFromFragment(fragment, intent, requestCode);
        }
    }

    void startActivityFromFragment(final NamedSuperCall<Void> superCall,
            @NonNull final android.app.Fragment fragment, final Intent intent,
            final int requestCode, final Bundle options) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startActivityFromFragment(fragment, intent, requestCode, options);
        }
    }

    boolean startActivityIfNeeded(final NamedSuperCall<Boolean> superCall,
            @NonNull final Intent intent, final int requestCode) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return startActivityIfNeeded(intent, requestCode);
        }
    }

    boolean startActivityIfNeeded(final NamedSuperCall<Boolean> superCall,
            @NonNull final Intent intent, final int requestCode, final Bundle options) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return startActivityIfNeeded(intent, requestCode, options);
        }
    }

    boolean startInstrumentation(final NamedSuperCall<Boolean> superCall,
            final ComponentName className, final String profileFile, final Bundle arguments) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return startInstrumentation(className, profileFile, arguments);
        }
    }

    void startIntentSender(final NamedSuperCall<Void> superCall, final IntentSender intent,
            final Intent fillInIntent, final int flagsMask, final int flagsValues,
            final int extraFlags) throws IntentSender.SendIntentException {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startIntentSender(intent, fillInIntent, flagsMask, flagsValues, extraFlags);
        }
    }

    void startIntentSender(final NamedSuperCall<Void> superCall, final IntentSender intent,
            final Intent fillInIntent, final int flagsMask, final int flagsValues,
            final int extraFlags, final Bundle options) throws IntentSender.SendIntentException {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startIntentSender(intent, fillInIntent, flagsMask, flagsValues, extraFlags, options);
        }
    }

    void startIntentSenderForResult(final NamedSuperCall<Void> superCall, final IntentSender intent,
            final int requestCode, final Intent fillInIntent, final int flagsMask,
            final int flagsValues, final int extraFlags) throws IntentSender.SendIntentException {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues,
                    extraFlags);
        }
    }

    void startIntentSenderForResult(final NamedSuperCall<Void> superCall, final IntentSender intent,
            final int requestCode, final Intent fillInIntent, final int flagsMask,
            final int flagsValues, final int extraFlags, final Bundle options)
            throws IntentSender.SendIntentException {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues,
                    extraFlags, options);
        }
    }

    void startIntentSenderFromChild(final NamedSuperCall<Void> superCall, final Activity child,
            final IntentSender intent, final int requestCode, final Intent fillInIntent,
            final int flagsMask, final int flagsValues, final int extraFlags)
            throws IntentSender.SendIntentException {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startIntentSenderFromChild(child, intent, requestCode, fillInIntent, flagsMask,
                    flagsValues, extraFlags);
        }
    }

    void startIntentSenderFromChild(final NamedSuperCall<Void> superCall, final Activity child,
            final IntentSender intent, final int requestCode, final Intent fillInIntent,
            final int flagsMask, final int flagsValues, final int extraFlags, final Bundle options)
            throws IntentSender.SendIntentException {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startIntentSenderFromChild(child, intent, requestCode, fillInIntent, flagsMask,
                    flagsValues, extraFlags, options);
        }
    }

    void startLockTask(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startLockTask();
        }
    }

    void startManagingCursor(final NamedSuperCall<Void> superCall, final Cursor c) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startManagingCursor(c);
        }
    }

    boolean startNextMatchingActivity(final NamedSuperCall<Boolean> superCall,
            @NonNull final Intent intent) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return startNextMatchingActivity(intent);
        }
    }

    boolean startNextMatchingActivity(final NamedSuperCall<Boolean> superCall,
            @NonNull final Intent intent, final Bundle options) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return startNextMatchingActivity(intent, options);
        }
    }

    void startPostponedEnterTransition(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startPostponedEnterTransition();
        }
    }

    void startSearch(final NamedSuperCall<Void> superCall, final String initialQuery,
            final boolean selectInitialQuery, final Bundle appSearchData,
            final boolean globalSearch) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startSearch(initialQuery, selectInitialQuery, appSearchData, globalSearch);
        }
    }

    ComponentName startService(final NamedSuperCall<ComponentName> superCall,
            final Intent service) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return startService(service);
        }
    }

    ActionMode startSupportActionMode(final NamedSuperCall<ActionMode> superCall,
            @NonNull final ActionMode.Callback callback) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return startSupportActionMode(callback);
        }
    }

    void stopLockTask(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            stopLockTask();
        }
    }

    void stopManagingCursor(final NamedSuperCall<Void> superCall, final Cursor c) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            stopManagingCursor(c);
        }
    }

    boolean stopService(final NamedSuperCall<Boolean> superCall, final Intent name) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return stopService(name);
        }
    }

    void supportFinishAfterTransition(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            supportFinishAfterTransition();
        }
    }

    void supportInvalidateOptionsMenu(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            supportInvalidateOptionsMenu();
        }
    }

    void supportNavigateUpTo(final NamedSuperCall<Void> superCall, @NonNull final Intent upIntent) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            supportNavigateUpTo(upIntent);
        }
    }

    void supportPostponeEnterTransition(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            supportPostponeEnterTransition();
        }
    }

    boolean supportRequestWindowFeature(final NamedSuperCall<Boolean> superCall,
            final int featureId) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return supportRequestWindowFeature(featureId);
        }
    }

    boolean supportShouldUpRecreateTask(final NamedSuperCall<Boolean> superCall,
            @NonNull final Intent targetIntent) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return supportShouldUpRecreateTask(targetIntent);
        }
    }

    void supportStartPostponedEnterTransition(final NamedSuperCall<Void> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            supportStartPostponedEnterTransition();
        }
    }

    void takeKeyEvents(final NamedSuperCall<Void> superCall, final boolean get) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            takeKeyEvents(get);
        }
    }

    void triggerSearch(final NamedSuperCall<Void> superCall, final String query,
            final Bundle appSearchData) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            triggerSearch(query, appSearchData);
        }
    }

    void unbindService(final NamedSuperCall<Void> superCall, final ServiceConnection conn) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            unbindService(conn);
        }
    }

    void unregisterComponentCallbacks(final NamedSuperCall<Void> superCall,
            final ComponentCallbacks callback) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            unregisterComponentCallbacks(callback);
        }
    }

    void unregisterForContextMenu(final NamedSuperCall<Void> superCall, final View view) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            unregisterForContextMenu(view);
        }
    }

    void unregisterReceiver(final NamedSuperCall<Void> superCall,
            final BroadcastReceiver receiver) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            unregisterReceiver(receiver);
        }
    }

}