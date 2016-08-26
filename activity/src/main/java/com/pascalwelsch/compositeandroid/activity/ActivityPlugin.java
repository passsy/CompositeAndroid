package com.pascalwelsch.compositeandroid.activity;

import com.pascalwelsch.compositeandroid.core.AbstractPlugin;
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
public class ActivityPlugin extends AbstractPlugin<CompositeActivity, ActivityDelegate> {

    public void addContentView(final View view, final ViewGroup.LayoutParams params) {
        verifyMethodCalledFromDelegate("addContentView(View, ViewGroup.LayoutParams)");
        ((CallVoid2<View, ViewGroup.LayoutParams>) mSuperListeners.pop()).call(view, params);
    }

    public void applyOverrideConfiguration(final Configuration overrideConfiguration) {
        verifyMethodCalledFromDelegate("applyOverrideConfiguration(Configuration)");
        ((CallVoid1<Configuration>) mSuperListeners.pop()).call(overrideConfiguration);
    }

    public void attachBaseContext(final Context newBase) {
        verifyMethodCalledFromDelegate("attachBaseContext(Context)");
        ((CallVoid1<Context>) mSuperListeners.pop()).call(newBase);
    }

    public boolean bindService(final Intent service, final ServiceConnection conn,
            final int flags) {
        verifyMethodCalledFromDelegate("bindService(Intent, ServiceConnection, Integer)");
        return ((CallFun3<Boolean, Intent, ServiceConnection, Integer>) mSuperListeners.pop())
                .call(service, conn, flags);
    }

    public int checkCallingOrSelfPermission(final String permission) {
        verifyMethodCalledFromDelegate("checkCallingOrSelfPermission(String)");
        return ((CallFun1<Integer, String>) mSuperListeners.pop()).call(permission);
    }

    public int checkCallingOrSelfUriPermission(final Uri uri, final int modeFlags) {
        verifyMethodCalledFromDelegate("checkCallingOrSelfUriPermission(Uri, Integer)");
        return ((CallFun2<Integer, Uri, Integer>) mSuperListeners.pop()).call(uri, modeFlags);
    }

    public int checkCallingPermission(final String permission) {
        verifyMethodCalledFromDelegate("checkCallingPermission(String)");
        return ((CallFun1<Integer, String>) mSuperListeners.pop()).call(permission);
    }

    public int checkCallingUriPermission(final Uri uri, final int modeFlags) {
        verifyMethodCalledFromDelegate("checkCallingUriPermission(Uri, Integer)");
        return ((CallFun2<Integer, Uri, Integer>) mSuperListeners.pop()).call(uri, modeFlags);
    }

    public int checkPermission(final String permission, final int pid, final int uid) {
        verifyMethodCalledFromDelegate("checkPermission(String, Integer, Integer)");
        return ((CallFun3<Integer, String, Integer, Integer>) mSuperListeners.pop())
                .call(permission, pid, uid);
    }

    public int checkSelfPermission(final String permission) {
        verifyMethodCalledFromDelegate("checkSelfPermission(String)");
        return ((CallFun1<Integer, String>) mSuperListeners.pop()).call(permission);
    }

    public int checkUriPermission(final Uri uri, final int pid, final int uid,
            final int modeFlags) {
        verifyMethodCalledFromDelegate("checkUriPermission(Uri, Integer, Integer, Integer)");
        return ((CallFun4<Integer, Uri, Integer, Integer, Integer>) mSuperListeners.pop())
                .call(uri, pid, uid, modeFlags);
    }

    public int checkUriPermission(final Uri uri, final String readPermission,
            final String writePermission, final int pid, final int uid, final int modeFlags) {
        verifyMethodCalledFromDelegate(
                "checkUriPermission(Uri, String, String, Integer, Integer, Integer)");
        return ((CallFun6<Integer, Uri, String, String, Integer, Integer, Integer>) mSuperListeners
                .pop()).call(uri, readPermission, writePermission, pid, uid, modeFlags);
    }

    public void clearWallpaper() throws IOException {
        verifyMethodCalledFromDelegate("clearWallpaper()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void closeContextMenu() {
        verifyMethodCalledFromDelegate("closeContextMenu()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void closeOptionsMenu() {
        verifyMethodCalledFromDelegate("closeOptionsMenu()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public Context createConfigurationContext(final Configuration overrideConfiguration) {
        verifyMethodCalledFromDelegate("createConfigurationContext(Configuration)");
        return ((CallFun1<Context, Configuration>) mSuperListeners.pop())
                .call(overrideConfiguration);
    }

    public Context createDisplayContext(final Display display) {
        verifyMethodCalledFromDelegate("createDisplayContext(Display)");
        return ((CallFun1<Context, Display>) mSuperListeners.pop()).call(display);
    }

    public Context createPackageContext(final String packageName, final int flags)
            throws PackageManager.NameNotFoundException {
        verifyMethodCalledFromDelegate("createPackageContext(String, Integer)");
        return ((CallFun2<Context, String, Integer>) mSuperListeners.pop())
                .call(packageName, flags);
    }

    public PendingIntent createPendingResult(final int requestCode, final Intent data,
            final int flags) {
        verifyMethodCalledFromDelegate("createPendingResult(Integer, Intent, Integer)");
        return ((CallFun3<PendingIntent, Integer, Intent, Integer>) mSuperListeners.pop())
                .call(requestCode, data, flags);
    }

    public String[] databaseList() {
        verifyMethodCalledFromDelegate("databaseList()");
        return ((CallFun0<String[]>) mSuperListeners.pop()).call();
    }

    public boolean deleteDatabase(final String name) {
        verifyMethodCalledFromDelegate("deleteDatabase(String)");
        return ((CallFun1<Boolean, String>) mSuperListeners.pop()).call(name);
    }

    public boolean deleteFile(final String name) {
        verifyMethodCalledFromDelegate("deleteFile(String)");
        return ((CallFun1<Boolean, String>) mSuperListeners.pop()).call(name);
    }

    public boolean dispatchGenericMotionEvent(final MotionEvent ev) {
        verifyMethodCalledFromDelegate("dispatchGenericMotionEvent(MotionEvent)");
        return ((CallFun1<Boolean, MotionEvent>) mSuperListeners.pop()).call(ev);
    }

    public boolean dispatchKeyEvent(final KeyEvent event) {
        verifyMethodCalledFromDelegate("dispatchKeyEvent(KeyEvent)");
        return ((CallFun1<Boolean, KeyEvent>) mSuperListeners.pop()).call(event);
    }

    public boolean dispatchKeyShortcutEvent(final KeyEvent event) {
        verifyMethodCalledFromDelegate("dispatchKeyShortcutEvent(KeyEvent)");
        return ((CallFun1<Boolean, KeyEvent>) mSuperListeners.pop()).call(event);
    }

    public boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent event) {
        verifyMethodCalledFromDelegate("dispatchPopulateAccessibilityEvent(AccessibilityEvent)");
        return ((CallFun1<Boolean, AccessibilityEvent>) mSuperListeners.pop()).call(event);
    }

    public boolean dispatchTouchEvent(final MotionEvent ev) {
        verifyMethodCalledFromDelegate("dispatchTouchEvent(MotionEvent)");
        return ((CallFun1<Boolean, MotionEvent>) mSuperListeners.pop()).call(ev);
    }

    public boolean dispatchTrackballEvent(final MotionEvent ev) {
        verifyMethodCalledFromDelegate("dispatchTrackballEvent(MotionEvent)");
        return ((CallFun1<Boolean, MotionEvent>) mSuperListeners.pop()).call(ev);
    }

    public void dump(final String prefix, final FileDescriptor fd, final PrintWriter writer,
            final String[] args) {
        verifyMethodCalledFromDelegate("dump(String, FileDescriptor, PrintWriter, String[])");
        ((CallVoid4<String, FileDescriptor, PrintWriter, String[]>) mSuperListeners.pop())
                .call(prefix, fd, writer, args);
    }

    public void enforceCallingOrSelfPermission(final String permission, final String message) {
        verifyMethodCalledFromDelegate("enforceCallingOrSelfPermission(String, String)");
        ((CallVoid2<String, String>) mSuperListeners.pop()).call(permission, message);
    }

    public void enforceCallingOrSelfUriPermission(final Uri uri, final int modeFlags,
            final String message) {
        verifyMethodCalledFromDelegate("enforceCallingOrSelfUriPermission(Uri, Integer, String)");
        ((CallVoid3<Uri, Integer, String>) mSuperListeners.pop()).call(uri, modeFlags, message);
    }

    public void enforceCallingPermission(final String permission, final String message) {
        verifyMethodCalledFromDelegate("enforceCallingPermission(String, String)");
        ((CallVoid2<String, String>) mSuperListeners.pop()).call(permission, message);
    }

    public void enforceCallingUriPermission(final Uri uri, final int modeFlags,
            final String message) {
        verifyMethodCalledFromDelegate("enforceCallingUriPermission(Uri, Integer, String)");
        ((CallVoid3<Uri, Integer, String>) mSuperListeners.pop()).call(uri, modeFlags, message);
    }

    public void enforcePermission(final String permission, final int pid, final int uid,
            final String message) {
        verifyMethodCalledFromDelegate("enforcePermission(String, Integer, Integer, String)");
        ((CallVoid4<String, Integer, Integer, String>) mSuperListeners.pop())
                .call(permission, pid, uid, message);
    }

    public void enforceUriPermission(final Uri uri, final int pid, final int uid,
            final int modeFlags, final String message) {
        verifyMethodCalledFromDelegate(
                "enforceUriPermission(Uri, Integer, Integer, Integer, String)");
        ((CallVoid5<Uri, Integer, Integer, Integer, String>) mSuperListeners.pop())
                .call(uri, pid, uid, modeFlags, message);
    }

    public void enforceUriPermission(final Uri uri, final String readPermission,
            final String writePermission, final int pid, final int uid, final int modeFlags,
            final String message) {
        verifyMethodCalledFromDelegate(
                "enforceUriPermission(Uri, String, String, Integer, Integer, Integer, String)");
        ((CallVoid7<Uri, String, String, Integer, Integer, Integer, String>) mSuperListeners.pop())
                .call(uri, readPermission, writePermission, pid, uid, modeFlags, message);
    }

    public String[] fileList() {
        verifyMethodCalledFromDelegate("fileList()");
        return ((CallFun0<String[]>) mSuperListeners.pop()).call();
    }

    public View findViewById(@IdRes final int id) {
        verifyMethodCalledFromDelegate("findViewById(Integer)");
        return ((CallFun1<View, Integer>) mSuperListeners.pop()).call(id);
    }

    public void finish() {
        verifyMethodCalledFromDelegate("finish()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void finishActivity(final int requestCode) {
        verifyMethodCalledFromDelegate("finishActivity(Integer)");
        ((CallVoid1<Integer>) mSuperListeners.pop()).call(requestCode);
    }

    public void finishActivityFromChild(final Activity child, final int requestCode) {
        verifyMethodCalledFromDelegate("finishActivityFromChild(Activity, Integer)");
        ((CallVoid2<Activity, Integer>) mSuperListeners.pop()).call(child, requestCode);
    }

    public void finishAffinity() {
        verifyMethodCalledFromDelegate("finishAffinity()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void finishAfterTransition() {
        verifyMethodCalledFromDelegate("finishAfterTransition()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void finishAndRemoveTask() {
        verifyMethodCalledFromDelegate("finishAndRemoveTask()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void finishFromChild(final Activity child) {
        verifyMethodCalledFromDelegate("finishFromChild(Activity)");
        ((CallVoid1<Activity>) mSuperListeners.pop()).call(child);
    }

    public android.app.ActionBar getActionBar() {
        verifyMethodCalledFromDelegate("getActionBar()");
        return ((CallFun0<android.app.ActionBar>) mSuperListeners.pop()).call();
    }

    public Activity getActivity() {
        return (Activity) getOriginal();
    }

    public Context getApplicationContext() {
        verifyMethodCalledFromDelegate("getApplicationContext()");
        return ((CallFun0<Context>) mSuperListeners.pop()).call();
    }

    public ApplicationInfo getApplicationInfo() {
        verifyMethodCalledFromDelegate("getApplicationInfo()");
        return ((CallFun0<ApplicationInfo>) mSuperListeners.pop()).call();
    }

    public AssetManager getAssets() {
        verifyMethodCalledFromDelegate("getAssets()");
        return ((CallFun0<AssetManager>) mSuperListeners.pop()).call();
    }

    public Context getBaseContext() {
        verifyMethodCalledFromDelegate("getBaseContext()");
        return ((CallFun0<Context>) mSuperListeners.pop()).call();
    }

    public File getCacheDir() {
        verifyMethodCalledFromDelegate("getCacheDir()");
        return ((CallFun0<File>) mSuperListeners.pop()).call();
    }

    public ComponentName getCallingActivity() {
        verifyMethodCalledFromDelegate("getCallingActivity()");
        return ((CallFun0<ComponentName>) mSuperListeners.pop()).call();
    }

    public String getCallingPackage() {
        verifyMethodCalledFromDelegate("getCallingPackage()");
        return ((CallFun0<String>) mSuperListeners.pop()).call();
    }

    public int getChangingConfigurations() {
        verifyMethodCalledFromDelegate("getChangingConfigurations()");
        return ((CallFun0<Integer>) mSuperListeners.pop()).call();
    }

    public ClassLoader getClassLoader() {
        verifyMethodCalledFromDelegate("getClassLoader()");
        return ((CallFun0<ClassLoader>) mSuperListeners.pop()).call();
    }

    public File getCodeCacheDir() {
        verifyMethodCalledFromDelegate("getCodeCacheDir()");
        return ((CallFun0<File>) mSuperListeners.pop()).call();
    }

    public ComponentName getComponentName() {
        verifyMethodCalledFromDelegate("getComponentName()");
        return ((CallFun0<ComponentName>) mSuperListeners.pop()).call();
    }

    public ContentResolver getContentResolver() {
        verifyMethodCalledFromDelegate("getContentResolver()");
        return ((CallFun0<ContentResolver>) mSuperListeners.pop()).call();
    }

    public Scene getContentScene() {
        verifyMethodCalledFromDelegate("getContentScene()");
        return ((CallFun0<Scene>) mSuperListeners.pop()).call();
    }

    public TransitionManager getContentTransitionManager() {
        verifyMethodCalledFromDelegate("getContentTransitionManager()");
        return ((CallFun0<TransitionManager>) mSuperListeners.pop()).call();
    }

    public View getCurrentFocus() {
        verifyMethodCalledFromDelegate("getCurrentFocus()");
        return ((CallFun0<View>) mSuperListeners.pop()).call();
    }

    public File getDatabasePath(final String name) {
        verifyMethodCalledFromDelegate("getDatabasePath(String)");
        return ((CallFun1<File, String>) mSuperListeners.pop()).call(name);
    }

    public AppCompatDelegate getDelegate() {
        verifyMethodCalledFromDelegate("getDelegate()");
        return ((CallFun0<AppCompatDelegate>) mSuperListeners.pop()).call();
    }

    public File getDir(final String name, final int mode) {
        verifyMethodCalledFromDelegate("getDir(String, Integer)");
        return ((CallFun2<File, String, Integer>) mSuperListeners.pop()).call(name, mode);
    }

    public ActionBarDrawerToggle.Delegate getDrawerToggleDelegate() {
        verifyMethodCalledFromDelegate("getDrawerToggleDelegate()");
        return ((CallFun0<ActionBarDrawerToggle.Delegate>) mSuperListeners.pop()).call();
    }

    public File getExternalCacheDir() {
        verifyMethodCalledFromDelegate("getExternalCacheDir()");
        return ((CallFun0<File>) mSuperListeners.pop()).call();
    }

    public File[] getExternalCacheDirs() {
        verifyMethodCalledFromDelegate("getExternalCacheDirs()");
        return ((CallFun0<File[]>) mSuperListeners.pop()).call();
    }

    public File getExternalFilesDir(final String type) {
        verifyMethodCalledFromDelegate("getExternalFilesDir(String)");
        return ((CallFun1<File, String>) mSuperListeners.pop()).call(type);
    }

    public File[] getExternalFilesDirs(final String type) {
        verifyMethodCalledFromDelegate("getExternalFilesDirs(String)");
        return ((CallFun1<File[], String>) mSuperListeners.pop()).call(type);
    }

    public File[] getExternalMediaDirs() {
        verifyMethodCalledFromDelegate("getExternalMediaDirs()");
        return ((CallFun0<File[]>) mSuperListeners.pop()).call();
    }

    public File getFileStreamPath(final String name) {
        verifyMethodCalledFromDelegate("getFileStreamPath(String)");
        return ((CallFun1<File, String>) mSuperListeners.pop()).call(name);
    }

    public File getFilesDir() {
        verifyMethodCalledFromDelegate("getFilesDir()");
        return ((CallFun0<File>) mSuperListeners.pop()).call();
    }

    public android.app.FragmentManager getFragmentManager() {
        verifyMethodCalledFromDelegate("getFragmentManager()");
        return ((CallFun0<android.app.FragmentManager>) mSuperListeners.pop()).call();
    }

    public Intent getIntent() {
        verifyMethodCalledFromDelegate("getIntent()");
        return ((CallFun0<Intent>) mSuperListeners.pop()).call();
    }

    public Object getLastNonConfigurationInstance(final String key) {
        return getCompositeDelegate().getLastNonConfigurationInstance(key);
    }

    public LayoutInflater getLayoutInflater() {
        verifyMethodCalledFromDelegate("getLayoutInflater()");
        return ((CallFun0<LayoutInflater>) mSuperListeners.pop()).call();
    }

    public android.app.LoaderManager getLoaderManager() {
        verifyMethodCalledFromDelegate("getLoaderManager()");
        return ((CallFun0<android.app.LoaderManager>) mSuperListeners.pop()).call();
    }

    public String getLocalClassName() {
        verifyMethodCalledFromDelegate("getLocalClassName()");
        return ((CallFun0<String>) mSuperListeners.pop()).call();
    }

    public Looper getMainLooper() {
        verifyMethodCalledFromDelegate("getMainLooper()");
        return ((CallFun0<Looper>) mSuperListeners.pop()).call();
    }

    public MenuInflater getMenuInflater() {
        verifyMethodCalledFromDelegate("getMenuInflater()");
        return ((CallFun0<MenuInflater>) mSuperListeners.pop()).call();
    }

    public File getNoBackupFilesDir() {
        verifyMethodCalledFromDelegate("getNoBackupFilesDir()");
        return ((CallFun0<File>) mSuperListeners.pop()).call();
    }

    public File getObbDir() {
        verifyMethodCalledFromDelegate("getObbDir()");
        return ((CallFun0<File>) mSuperListeners.pop()).call();
    }

    public File[] getObbDirs() {
        verifyMethodCalledFromDelegate("getObbDirs()");
        return ((CallFun0<File[]>) mSuperListeners.pop()).call();
    }

    public String getPackageCodePath() {
        verifyMethodCalledFromDelegate("getPackageCodePath()");
        return ((CallFun0<String>) mSuperListeners.pop()).call();
    }

    public PackageManager getPackageManager() {
        verifyMethodCalledFromDelegate("getPackageManager()");
        return ((CallFun0<PackageManager>) mSuperListeners.pop()).call();
    }

    public String getPackageName() {
        verifyMethodCalledFromDelegate("getPackageName()");
        return ((CallFun0<String>) mSuperListeners.pop()).call();
    }

    public String getPackageResourcePath() {
        verifyMethodCalledFromDelegate("getPackageResourcePath()");
        return ((CallFun0<String>) mSuperListeners.pop()).call();
    }

    public Intent getParentActivityIntent() {
        verifyMethodCalledFromDelegate("getParentActivityIntent()");
        return ((CallFun0<Intent>) mSuperListeners.pop()).call();
    }

    public SharedPreferences getPreferences(final int mode) {
        verifyMethodCalledFromDelegate("getPreferences(Integer)");
        return ((CallFun1<SharedPreferences, Integer>) mSuperListeners.pop()).call(mode);
    }

    public Uri getReferrer() {
        verifyMethodCalledFromDelegate("getReferrer()");
        return ((CallFun0<Uri>) mSuperListeners.pop()).call();
    }

    public int getRequestedOrientation() {
        verifyMethodCalledFromDelegate("getRequestedOrientation()");
        return ((CallFun0<Integer>) mSuperListeners.pop()).call();
    }

    public Resources getResources() {
        verifyMethodCalledFromDelegate("getResources()");
        return ((CallFun0<Resources>) mSuperListeners.pop()).call();
    }

    public SharedPreferences getSharedPreferences(final String name, final int mode) {
        verifyMethodCalledFromDelegate("getSharedPreferences(String, Integer)");
        return ((CallFun2<SharedPreferences, String, Integer>) mSuperListeners.pop())
                .call(name, mode);
    }

    public ActionBar getSupportActionBar() {
        verifyMethodCalledFromDelegate("getSupportActionBar()");
        return ((CallFun0<ActionBar>) mSuperListeners.pop()).call();
    }

    public FragmentManager getSupportFragmentManager() {
        verifyMethodCalledFromDelegate("getSupportFragmentManager()");
        return ((CallFun0<FragmentManager>) mSuperListeners.pop()).call();
    }

    public LoaderManager getSupportLoaderManager() {
        verifyMethodCalledFromDelegate("getSupportLoaderManager()");
        return ((CallFun0<LoaderManager>) mSuperListeners.pop()).call();
    }

    public Intent getSupportParentActivityIntent() {
        verifyMethodCalledFromDelegate("getSupportParentActivityIntent()");
        return ((CallFun0<Intent>) mSuperListeners.pop()).call();
    }

    public Object getSystemService(final String name) {
        verifyMethodCalledFromDelegate("getSystemService(String)");
        return ((CallFun1<Object, String>) mSuperListeners.pop()).call(name);
    }

    public String getSystemServiceName(final Class<?> serviceClass) {
        verifyMethodCalledFromDelegate("getSystemServiceName(Class<?>)");
        return ((CallFun1<String, Class<?>>) mSuperListeners.pop()).call(serviceClass);
    }

    public int getTaskId() {
        verifyMethodCalledFromDelegate("getTaskId()");
        return ((CallFun0<Integer>) mSuperListeners.pop()).call();
    }

    public Resources.Theme getTheme() {
        verifyMethodCalledFromDelegate("getTheme()");
        return ((CallFun0<Resources.Theme>) mSuperListeners.pop()).call();
    }

    public VoiceInteractor getVoiceInteractor() {
        verifyMethodCalledFromDelegate("getVoiceInteractor()");
        return ((CallFun0<VoiceInteractor>) mSuperListeners.pop()).call();
    }

    public Drawable getWallpaper() {
        verifyMethodCalledFromDelegate("getWallpaper()");
        return ((CallFun0<Drawable>) mSuperListeners.pop()).call();
    }

    public int getWallpaperDesiredMinimumHeight() {
        verifyMethodCalledFromDelegate("getWallpaperDesiredMinimumHeight()");
        return ((CallFun0<Integer>) mSuperListeners.pop()).call();
    }

    public int getWallpaperDesiredMinimumWidth() {
        verifyMethodCalledFromDelegate("getWallpaperDesiredMinimumWidth()");
        return ((CallFun0<Integer>) mSuperListeners.pop()).call();
    }

    public Window getWindow() {
        verifyMethodCalledFromDelegate("getWindow()");
        return ((CallFun0<Window>) mSuperListeners.pop()).call();
    }

    public WindowManager getWindowManager() {
        verifyMethodCalledFromDelegate("getWindowManager()");
        return ((CallFun0<WindowManager>) mSuperListeners.pop()).call();
    }

    public void grantUriPermission(final String toPackage, final Uri uri, final int modeFlags) {
        verifyMethodCalledFromDelegate("grantUriPermission(String, Uri, Integer)");
        ((CallVoid3<String, Uri, Integer>) mSuperListeners.pop()).call(toPackage, uri, modeFlags);
    }

    public boolean hasWindowFocus() {
        verifyMethodCalledFromDelegate("hasWindowFocus()");
        return ((CallFun0<Boolean>) mSuperListeners.pop()).call();
    }

    public void invalidateOptionsMenu() {
        verifyMethodCalledFromDelegate("invalidateOptionsMenu()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public boolean isChangingConfigurations() {
        verifyMethodCalledFromDelegate("isChangingConfigurations()");
        return ((CallFun0<Boolean>) mSuperListeners.pop()).call();
    }

    public boolean isDestroyed() {
        verifyMethodCalledFromDelegate("isDestroyed()");
        return ((CallFun0<Boolean>) mSuperListeners.pop()).call();
    }

    public boolean isFinishing() {
        verifyMethodCalledFromDelegate("isFinishing()");
        return ((CallFun0<Boolean>) mSuperListeners.pop()).call();
    }

    public boolean isImmersive() {
        verifyMethodCalledFromDelegate("isImmersive()");
        return ((CallFun0<Boolean>) mSuperListeners.pop()).call();
    }

    public boolean isRestricted() {
        verifyMethodCalledFromDelegate("isRestricted()");
        return ((CallFun0<Boolean>) mSuperListeners.pop()).call();
    }

    public boolean isTaskRoot() {
        verifyMethodCalledFromDelegate("isTaskRoot()");
        return ((CallFun0<Boolean>) mSuperListeners.pop()).call();
    }

    public boolean isVoiceInteraction() {
        verifyMethodCalledFromDelegate("isVoiceInteraction()");
        return ((CallFun0<Boolean>) mSuperListeners.pop()).call();
    }

    public boolean isVoiceInteractionRoot() {
        verifyMethodCalledFromDelegate("isVoiceInteractionRoot()");
        return ((CallFun0<Boolean>) mSuperListeners.pop()).call();
    }

    public boolean moveTaskToBack(final boolean nonRoot) {
        verifyMethodCalledFromDelegate("moveTaskToBack(Boolean)");
        return ((CallFun1<Boolean, Boolean>) mSuperListeners.pop()).call(nonRoot);
    }

    public boolean navigateUpTo(final Intent upIntent) {
        verifyMethodCalledFromDelegate("navigateUpTo(Intent)");
        return ((CallFun1<Boolean, Intent>) mSuperListeners.pop()).call(upIntent);
    }

    public boolean navigateUpToFromChild(final Activity child, final Intent upIntent) {
        verifyMethodCalledFromDelegate("navigateUpToFromChild(Activity, Intent)");
        return ((CallFun2<Boolean, Activity, Intent>) mSuperListeners.pop()).call(child, upIntent);
    }

    public void onActionModeFinished(final android.view.ActionMode mode) {
        verifyMethodCalledFromDelegate("onActionModeFinished(android.view.ActionMode)");
        ((CallVoid1<android.view.ActionMode>) mSuperListeners.pop()).call(mode);
    }

    public void onActionModeStarted(final android.view.ActionMode mode) {
        verifyMethodCalledFromDelegate("onActionModeStarted(android.view.ActionMode)");
        ((CallVoid1<android.view.ActionMode>) mSuperListeners.pop()).call(mode);
    }

    public void onActivityReenter(final int resultCode, final Intent data) {
        verifyMethodCalledFromDelegate("onActivityReenter(Integer, Intent)");
        ((CallVoid2<Integer, Intent>) mSuperListeners.pop()).call(resultCode, data);
    }

    public void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        verifyMethodCalledFromDelegate("onActivityResult(Integer, Integer, Intent)");
        ((CallVoid3<Integer, Integer, Intent>) mSuperListeners.pop())
                .call(requestCode, resultCode, data);
    }

    public void onApplyThemeResource(final Resources.Theme theme, final int resid,
            final boolean first) {
        verifyMethodCalledFromDelegate("onApplyThemeResource(Resources.Theme, Integer, Boolean)");
        ((CallVoid3<Resources.Theme, Integer, Boolean>) mSuperListeners.pop())
                .call(theme, resid, first);
    }

    public void onAttachFragment(final Fragment fragment) {
        verifyMethodCalledFromDelegate("onAttachFragment(Fragment)");
        ((CallVoid1<Fragment>) mSuperListeners.pop()).call(fragment);
    }

    public void onAttachFragment(final android.app.Fragment fragment) {
        verifyMethodCalledFromDelegate("onAttachFragment(android.app.Fragment)");
        ((CallVoid1<android.app.Fragment>) mSuperListeners.pop()).call(fragment);
    }

    public void onAttachedToWindow() {
        verifyMethodCalledFromDelegate("onAttachedToWindow()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void onBackPressed() {
        verifyMethodCalledFromDelegate("onBackPressed()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void onChildTitleChanged(final Activity childActivity, final CharSequence title) {
        verifyMethodCalledFromDelegate("onChildTitleChanged(Activity, CharSequence)");
        ((CallVoid2<Activity, CharSequence>) mSuperListeners.pop()).call(childActivity, title);
    }

    public void onConfigurationChanged(final Configuration newConfig) {
        verifyMethodCalledFromDelegate("onConfigurationChanged(Configuration)");
        ((CallVoid1<Configuration>) mSuperListeners.pop()).call(newConfig);
    }

    public void onContentChanged() {
        verifyMethodCalledFromDelegate("onContentChanged()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public boolean onContextItemSelected(final MenuItem item) {
        verifyMethodCalledFromDelegate("onContextItemSelected(MenuItem)");
        return ((CallFun1<Boolean, MenuItem>) mSuperListeners.pop()).call(item);
    }

    public void onContextMenuClosed(final Menu menu) {
        verifyMethodCalledFromDelegate("onContextMenuClosed(Menu)");
        ((CallVoid1<Menu>) mSuperListeners.pop()).call(menu);
    }

    public void onCreate(final Bundle savedInstanceState, final PersistableBundle persistentState) {
        verifyMethodCalledFromDelegate("onCreate(Bundle, PersistableBundle)");
        ((CallVoid2<Bundle, PersistableBundle>) mSuperListeners.pop())
                .call(savedInstanceState, persistentState);
    }

    public void onCreate(@Nullable final Bundle savedInstanceState) {
        verifyMethodCalledFromDelegate("onCreate(Bundle)");
        ((CallVoid1<Bundle>) mSuperListeners.pop()).call(savedInstanceState);
    }

    public void onCreateContextMenu(final ContextMenu menu, final View v,
            final ContextMenu.ContextMenuInfo menuInfo) {
        verifyMethodCalledFromDelegate(
                "onCreateContextMenu(ContextMenu, View, ContextMenu.ContextMenuInfo)");
        ((CallVoid3<ContextMenu, View, ContextMenu.ContextMenuInfo>) mSuperListeners.pop())
                .call(menu, v, menuInfo);
    }

    public CharSequence onCreateDescription() {
        verifyMethodCalledFromDelegate("onCreateDescription()");
        return ((CallFun0<CharSequence>) mSuperListeners.pop()).call();
    }

    public Dialog onCreateDialog(final int id) {
        verifyMethodCalledFromDelegate("onCreateDialog(Integer)");
        return ((CallFun1<Dialog, Integer>) mSuperListeners.pop()).call(id);
    }

    public Dialog onCreateDialog(final int id, final Bundle args) {
        verifyMethodCalledFromDelegate("onCreateDialog(Integer, Bundle)");
        return ((CallFun2<Dialog, Integer, Bundle>) mSuperListeners.pop()).call(id, args);
    }

    public void onCreateNavigateUpTaskStack(final TaskStackBuilder builder) {
        verifyMethodCalledFromDelegate("onCreateNavigateUpTaskStack(TaskStackBuilder)");
        ((CallVoid1<TaskStackBuilder>) mSuperListeners.pop()).call(builder);
    }

    public boolean onCreateOptionsMenu(final Menu menu) {
        verifyMethodCalledFromDelegate("onCreateOptionsMenu(Menu)");
        return ((CallFun1<Boolean, Menu>) mSuperListeners.pop()).call(menu);
    }

    public boolean onCreatePanelMenu(final int featureId, final Menu menu) {
        verifyMethodCalledFromDelegate("onCreatePanelMenu(Integer, Menu)");
        return ((CallFun2<Boolean, Integer, Menu>) mSuperListeners.pop()).call(featureId, menu);
    }

    public View onCreatePanelView(final int featureId) {
        verifyMethodCalledFromDelegate("onCreatePanelView(Integer)");
        return ((CallFun1<View, Integer>) mSuperListeners.pop()).call(featureId);
    }

    public void onCreateSupportNavigateUpTaskStack(
            @NonNull final android.support.v4.app.TaskStackBuilder builder) {
        verifyMethodCalledFromDelegate(
                "onCreateSupportNavigateUpTaskStack(android.support.v4.app.TaskStackBuilder)");
        ((CallVoid1<android.support.v4.app.TaskStackBuilder>) mSuperListeners.pop()).call(builder);
    }

    public boolean onCreateThumbnail(final Bitmap outBitmap, final Canvas canvas) {
        verifyMethodCalledFromDelegate("onCreateThumbnail(Bitmap, Canvas)");
        return ((CallFun2<Boolean, Bitmap, Canvas>) mSuperListeners.pop()).call(outBitmap, canvas);
    }

    public View onCreateView(final View parent, final String name, final Context context,
            final AttributeSet attrs) {
        verifyMethodCalledFromDelegate("onCreateView(View, String, Context, AttributeSet)");
        return ((CallFun4<View, View, String, Context, AttributeSet>) mSuperListeners.pop())
                .call(parent, name, context, attrs);
    }

    public View onCreateView(final String name, final Context context, final AttributeSet attrs) {
        verifyMethodCalledFromDelegate("onCreateView(String, Context, AttributeSet)");
        return ((CallFun3<View, String, Context, AttributeSet>) mSuperListeners.pop())
                .call(name, context, attrs);
    }

    public void onDestroy() {
        verifyMethodCalledFromDelegate("onDestroy()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void onDetachedFromWindow() {
        verifyMethodCalledFromDelegate("onDetachedFromWindow()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void onEnterAnimationComplete() {
        verifyMethodCalledFromDelegate("onEnterAnimationComplete()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public boolean onGenericMotionEvent(final MotionEvent event) {
        verifyMethodCalledFromDelegate("onGenericMotionEvent(MotionEvent)");
        return ((CallFun1<Boolean, MotionEvent>) mSuperListeners.pop()).call(event);
    }

    public boolean onKeyDown(final int keyCode, final KeyEvent event) {
        verifyMethodCalledFromDelegate("onKeyDown(Integer, KeyEvent)");
        return ((CallFun2<Boolean, Integer, KeyEvent>) mSuperListeners.pop()).call(keyCode, event);
    }

    public boolean onKeyLongPress(final int keyCode, final KeyEvent event) {
        verifyMethodCalledFromDelegate("onKeyLongPress(Integer, KeyEvent)");
        return ((CallFun2<Boolean, Integer, KeyEvent>) mSuperListeners.pop()).call(keyCode, event);
    }

    public boolean onKeyMultiple(final int keyCode, final int repeatCount, final KeyEvent event) {
        verifyMethodCalledFromDelegate("onKeyMultiple(Integer, Integer, KeyEvent)");
        return ((CallFun3<Boolean, Integer, Integer, KeyEvent>) mSuperListeners.pop())
                .call(keyCode, repeatCount, event);
    }

    public boolean onKeyShortcut(final int keyCode, final KeyEvent event) {
        verifyMethodCalledFromDelegate("onKeyShortcut(Integer, KeyEvent)");
        return ((CallFun2<Boolean, Integer, KeyEvent>) mSuperListeners.pop()).call(keyCode, event);
    }

    public boolean onKeyUp(final int keyCode, final KeyEvent event) {
        verifyMethodCalledFromDelegate("onKeyUp(Integer, KeyEvent)");
        return ((CallFun2<Boolean, Integer, KeyEvent>) mSuperListeners.pop()).call(keyCode, event);
    }

    public void onLowMemory() {
        verifyMethodCalledFromDelegate("onLowMemory()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public boolean onMenuOpened(final int featureId, final Menu menu) {
        verifyMethodCalledFromDelegate("onMenuOpened(Integer, Menu)");
        return ((CallFun2<Boolean, Integer, Menu>) mSuperListeners.pop()).call(featureId, menu);
    }

    public void onMultiWindowModeChanged(final boolean isInMultiWindowMode) {
        verifyMethodCalledFromDelegate("onMultiWindowModeChanged(Boolean)");
        ((CallVoid1<Boolean>) mSuperListeners.pop()).call(isInMultiWindowMode);
    }

    public boolean onNavigateUp() {
        verifyMethodCalledFromDelegate("onNavigateUp()");
        return ((CallFun0<Boolean>) mSuperListeners.pop()).call();
    }

    public boolean onNavigateUpFromChild(final Activity child) {
        verifyMethodCalledFromDelegate("onNavigateUpFromChild(Activity)");
        return ((CallFun1<Boolean, Activity>) mSuperListeners.pop()).call(child);
    }

    public void onNewIntent(final Intent intent) {
        verifyMethodCalledFromDelegate("onNewIntent(Intent)");
        ((CallVoid1<Intent>) mSuperListeners.pop()).call(intent);
    }

    public boolean onOptionsItemSelected(final MenuItem item) {
        verifyMethodCalledFromDelegate("onOptionsItemSelected(MenuItem)");
        return ((CallFun1<Boolean, MenuItem>) mSuperListeners.pop()).call(item);
    }

    public void onOptionsMenuClosed(final Menu menu) {
        verifyMethodCalledFromDelegate("onOptionsMenuClosed(Menu)");
        ((CallVoid1<Menu>) mSuperListeners.pop()).call(menu);
    }

    public void onPanelClosed(final int featureId, final Menu menu) {
        verifyMethodCalledFromDelegate("onPanelClosed(Integer, Menu)");
        ((CallVoid2<Integer, Menu>) mSuperListeners.pop()).call(featureId, menu);
    }

    public void onPause() {
        verifyMethodCalledFromDelegate("onPause()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void onPictureInPictureModeChanged(final boolean isInPictureInPictureMode) {
        verifyMethodCalledFromDelegate("onPictureInPictureModeChanged(Boolean)");
        ((CallVoid1<Boolean>) mSuperListeners.pop()).call(isInPictureInPictureMode);
    }

    public void onPostCreate(final Bundle savedInstanceState,
            final PersistableBundle persistentState) {
        verifyMethodCalledFromDelegate("onPostCreate(Bundle, PersistableBundle)");
        ((CallVoid2<Bundle, PersistableBundle>) mSuperListeners.pop())
                .call(savedInstanceState, persistentState);
    }

    public void onPostCreate(@Nullable final Bundle savedInstanceState) {
        verifyMethodCalledFromDelegate("onPostCreate(Bundle)");
        ((CallVoid1<Bundle>) mSuperListeners.pop()).call(savedInstanceState);
    }

    public void onPostResume() {
        verifyMethodCalledFromDelegate("onPostResume()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void onPrepareDialog(final int id, final Dialog dialog) {
        verifyMethodCalledFromDelegate("onPrepareDialog(Integer, Dialog)");
        ((CallVoid2<Integer, Dialog>) mSuperListeners.pop()).call(id, dialog);
    }

    public void onPrepareDialog(final int id, final Dialog dialog, final Bundle args) {
        verifyMethodCalledFromDelegate("onPrepareDialog(Integer, Dialog, Bundle)");
        ((CallVoid3<Integer, Dialog, Bundle>) mSuperListeners.pop()).call(id, dialog, args);
    }

    public void onPrepareNavigateUpTaskStack(final TaskStackBuilder builder) {
        verifyMethodCalledFromDelegate("onPrepareNavigateUpTaskStack(TaskStackBuilder)");
        ((CallVoid1<TaskStackBuilder>) mSuperListeners.pop()).call(builder);
    }

    public boolean onPrepareOptionsMenu(final Menu menu) {
        verifyMethodCalledFromDelegate("onPrepareOptionsMenu(Menu)");
        return ((CallFun1<Boolean, Menu>) mSuperListeners.pop()).call(menu);
    }

    public boolean onPrepareOptionsPanel(final View view, final Menu menu) {
        verifyMethodCalledFromDelegate("onPrepareOptionsPanel(View, Menu)");
        return ((CallFun2<Boolean, View, Menu>) mSuperListeners.pop()).call(view, menu);
    }

    public boolean onPreparePanel(final int featureId, final View view, final Menu menu) {
        verifyMethodCalledFromDelegate("onPreparePanel(Integer, View, Menu)");
        return ((CallFun3<Boolean, Integer, View, Menu>) mSuperListeners.pop())
                .call(featureId, view, menu);
    }

    public void onPrepareSupportNavigateUpTaskStack(
            @NonNull final android.support.v4.app.TaskStackBuilder builder) {
        verifyMethodCalledFromDelegate(
                "onPrepareSupportNavigateUpTaskStack(android.support.v4.app.TaskStackBuilder)");
        ((CallVoid1<android.support.v4.app.TaskStackBuilder>) mSuperListeners.pop()).call(builder);
    }

    public void onProvideAssistContent(final AssistContent outContent) {
        verifyMethodCalledFromDelegate("onProvideAssistContent(AssistContent)");
        ((CallVoid1<AssistContent>) mSuperListeners.pop()).call(outContent);
    }

    public void onProvideAssistData(final Bundle data) {
        verifyMethodCalledFromDelegate("onProvideAssistData(Bundle)");
        ((CallVoid1<Bundle>) mSuperListeners.pop()).call(data);
    }

    public Uri onProvideReferrer() {
        verifyMethodCalledFromDelegate("onProvideReferrer()");
        return ((CallFun0<Uri>) mSuperListeners.pop()).call();
    }

    public void onRequestPermissionsResult(final int requestCode,
            @NonNull final String[] permissions, @NonNull final int[] grantResults) {
        verifyMethodCalledFromDelegate("onRequestPermissionsResult(Integer, String[], int[])");
        ((CallVoid3<Integer, String[], int[]>) mSuperListeners.pop())
                .call(requestCode, permissions, grantResults);
    }

    public void onRestart() {
        verifyMethodCalledFromDelegate("onRestart()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void onRestoreInstanceState(final Bundle savedInstanceState,
            final PersistableBundle persistentState) {
        verifyMethodCalledFromDelegate("onRestoreInstanceState(Bundle, PersistableBundle)");
        ((CallVoid2<Bundle, PersistableBundle>) mSuperListeners.pop())
                .call(savedInstanceState, persistentState);
    }

    public void onRestoreInstanceState(final Bundle savedInstanceState) {
        verifyMethodCalledFromDelegate("onRestoreInstanceState(Bundle)");
        ((CallVoid1<Bundle>) mSuperListeners.pop()).call(savedInstanceState);
    }

    public void onResume() {
        verifyMethodCalledFromDelegate("onResume()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void onResumeFragments() {
        verifyMethodCalledFromDelegate("onResumeFragments()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public CompositeNonConfigurationInstance onRetainNonConfigurationInstance() {
        return null;
    }

    public void onSaveInstanceState(final Bundle outState,
            final PersistableBundle outPersistentState) {
        verifyMethodCalledFromDelegate("onSaveInstanceState(Bundle, PersistableBundle)");
        ((CallVoid2<Bundle, PersistableBundle>) mSuperListeners.pop())
                .call(outState, outPersistentState);
    }

    public void onSaveInstanceState(final Bundle outState) {
        verifyMethodCalledFromDelegate("onSaveInstanceState(Bundle)");
        ((CallVoid1<Bundle>) mSuperListeners.pop()).call(outState);
    }

    public boolean onSearchRequested(final SearchEvent searchEvent) {
        verifyMethodCalledFromDelegate("onSearchRequested(SearchEvent)");
        return ((CallFun1<Boolean, SearchEvent>) mSuperListeners.pop()).call(searchEvent);
    }

    public boolean onSearchRequested() {
        verifyMethodCalledFromDelegate("onSearchRequested()");
        return ((CallFun0<Boolean>) mSuperListeners.pop()).call();
    }

    public void onStart() {
        verifyMethodCalledFromDelegate("onStart()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void onStateNotSaved() {
        verifyMethodCalledFromDelegate("onStateNotSaved()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void onStop() {
        verifyMethodCalledFromDelegate("onStop()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void onSupportActionModeFinished(@NonNull final ActionMode mode) {
        verifyMethodCalledFromDelegate("onSupportActionModeFinished(ActionMode)");
        ((CallVoid1<ActionMode>) mSuperListeners.pop()).call(mode);
    }

    public void onSupportActionModeStarted(@NonNull final ActionMode mode) {
        verifyMethodCalledFromDelegate("onSupportActionModeStarted(ActionMode)");
        ((CallVoid1<ActionMode>) mSuperListeners.pop()).call(mode);
    }

    public void onSupportContentChanged() {
        verifyMethodCalledFromDelegate("onSupportContentChanged()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public boolean onSupportNavigateUp() {
        verifyMethodCalledFromDelegate("onSupportNavigateUp()");
        return ((CallFun0<Boolean>) mSuperListeners.pop()).call();
    }

    public void onTitleChanged(final CharSequence title, final int color) {
        verifyMethodCalledFromDelegate("onTitleChanged(CharSequence, Integer)");
        ((CallVoid2<CharSequence, Integer>) mSuperListeners.pop()).call(title, color);
    }

    public boolean onTouchEvent(final MotionEvent event) {
        verifyMethodCalledFromDelegate("onTouchEvent(MotionEvent)");
        return ((CallFun1<Boolean, MotionEvent>) mSuperListeners.pop()).call(event);
    }

    public boolean onTrackballEvent(final MotionEvent event) {
        verifyMethodCalledFromDelegate("onTrackballEvent(MotionEvent)");
        return ((CallFun1<Boolean, MotionEvent>) mSuperListeners.pop()).call(event);
    }

    public void onTrimMemory(final int level) {
        verifyMethodCalledFromDelegate("onTrimMemory(Integer)");
        ((CallVoid1<Integer>) mSuperListeners.pop()).call(level);
    }

    public void onUserInteraction() {
        verifyMethodCalledFromDelegate("onUserInteraction()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void onUserLeaveHint() {
        verifyMethodCalledFromDelegate("onUserLeaveHint()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void onVisibleBehindCanceled() {
        verifyMethodCalledFromDelegate("onVisibleBehindCanceled()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void onWindowAttributesChanged(final WindowManager.LayoutParams params) {
        verifyMethodCalledFromDelegate("onWindowAttributesChanged(WindowManager.LayoutParams)");
        ((CallVoid1<WindowManager.LayoutParams>) mSuperListeners.pop()).call(params);
    }

    public void onWindowFocusChanged(final boolean hasFocus) {
        verifyMethodCalledFromDelegate("onWindowFocusChanged(Boolean)");
        ((CallVoid1<Boolean>) mSuperListeners.pop()).call(hasFocus);
    }

    public android.view.ActionMode onWindowStartingActionMode(
            final android.view.ActionMode.Callback callback) {
        verifyMethodCalledFromDelegate(
                "onWindowStartingActionMode(android.view.ActionMode.Callback)");
        return ((CallFun1<android.view.ActionMode, android.view.ActionMode.Callback>) mSuperListeners
                .pop()).call(callback);
    }

    public android.view.ActionMode onWindowStartingActionMode(
            final android.view.ActionMode.Callback callback, final int type) {
        verifyMethodCalledFromDelegate(
                "onWindowStartingActionMode(android.view.ActionMode.Callback, Integer)");
        return ((CallFun2<android.view.ActionMode, android.view.ActionMode.Callback, Integer>) mSuperListeners
                .pop()).call(callback, type);
    }

    public ActionMode onWindowStartingSupportActionMode(
            @NonNull final ActionMode.Callback callback) {
        verifyMethodCalledFromDelegate("onWindowStartingSupportActionMode(ActionMode.Callback)");
        return ((CallFun1<ActionMode, ActionMode.Callback>) mSuperListeners.pop()).call(callback);
    }

    public void openContextMenu(final View view) {
        verifyMethodCalledFromDelegate("openContextMenu(View)");
        ((CallVoid1<View>) mSuperListeners.pop()).call(view);
    }

    public FileInputStream openFileInput(final String name) throws FileNotFoundException {
        verifyMethodCalledFromDelegate("openFileInput(String)");
        return ((CallFun1<FileInputStream, String>) mSuperListeners.pop()).call(name);
    }

    public FileOutputStream openFileOutput(final String name, final int mode)
            throws FileNotFoundException {
        verifyMethodCalledFromDelegate("openFileOutput(String, Integer)");
        return ((CallFun2<FileOutputStream, String, Integer>) mSuperListeners.pop())
                .call(name, mode);
    }

    public void openOptionsMenu() {
        verifyMethodCalledFromDelegate("openOptionsMenu()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public SQLiteDatabase openOrCreateDatabase(final String name, final int mode,
            final SQLiteDatabase.CursorFactory factory) {
        verifyMethodCalledFromDelegate(
                "openOrCreateDatabase(String, Integer, SQLiteDatabase.CursorFactory)");
        return ((CallFun3<SQLiteDatabase, String, Integer, SQLiteDatabase.CursorFactory>) mSuperListeners
                .pop()).call(name, mode, factory);
    }

    public SQLiteDatabase openOrCreateDatabase(final String name, final int mode,
            final SQLiteDatabase.CursorFactory factory, final DatabaseErrorHandler errorHandler) {
        verifyMethodCalledFromDelegate(
                "openOrCreateDatabase(String, Integer, SQLiteDatabase.CursorFactory, DatabaseErrorHandler)");
        return ((CallFun4<SQLiteDatabase, String, Integer, SQLiteDatabase.CursorFactory, DatabaseErrorHandler>) mSuperListeners
                .pop()).call(name, mode, factory, errorHandler);
    }

    public void overridePendingTransition(final int enterAnim, final int exitAnim) {
        verifyMethodCalledFromDelegate("overridePendingTransition(Integer, Integer)");
        ((CallVoid2<Integer, Integer>) mSuperListeners.pop()).call(enterAnim, exitAnim);
    }

    public Drawable peekWallpaper() {
        verifyMethodCalledFromDelegate("peekWallpaper()");
        return ((CallFun0<Drawable>) mSuperListeners.pop()).call();
    }

    public void postponeEnterTransition() {
        verifyMethodCalledFromDelegate("postponeEnterTransition()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void recreate() {
        verifyMethodCalledFromDelegate("recreate()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void registerComponentCallbacks(final ComponentCallbacks callback) {
        verifyMethodCalledFromDelegate("registerComponentCallbacks(ComponentCallbacks)");
        ((CallVoid1<ComponentCallbacks>) mSuperListeners.pop()).call(callback);
    }

    public void registerForContextMenu(final View view) {
        verifyMethodCalledFromDelegate("registerForContextMenu(View)");
        ((CallVoid1<View>) mSuperListeners.pop()).call(view);
    }

    public Intent registerReceiver(final BroadcastReceiver receiver, final IntentFilter filter) {
        verifyMethodCalledFromDelegate("registerReceiver(BroadcastReceiver, IntentFilter)");
        return ((CallFun2<Intent, BroadcastReceiver, IntentFilter>) mSuperListeners.pop())
                .call(receiver, filter);
    }

    public Intent registerReceiver(final BroadcastReceiver receiver, final IntentFilter filter,
            final String broadcastPermission, final Handler scheduler) {
        verifyMethodCalledFromDelegate(
                "registerReceiver(BroadcastReceiver, IntentFilter, String, Handler)");
        return ((CallFun4<Intent, BroadcastReceiver, IntentFilter, String, Handler>) mSuperListeners
                .pop()).call(receiver, filter, broadcastPermission, scheduler);
    }

    public boolean releaseInstance() {
        verifyMethodCalledFromDelegate("releaseInstance()");
        return ((CallFun0<Boolean>) mSuperListeners.pop()).call();
    }

    public void removeStickyBroadcast(final Intent intent) {
        verifyMethodCalledFromDelegate("removeStickyBroadcast(Intent)");
        ((CallVoid1<Intent>) mSuperListeners.pop()).call(intent);
    }

    public void removeStickyBroadcastAsUser(final Intent intent, final UserHandle user) {
        verifyMethodCalledFromDelegate("removeStickyBroadcastAsUser(Intent, UserHandle)");
        ((CallVoid2<Intent, UserHandle>) mSuperListeners.pop()).call(intent, user);
    }

    public void reportFullyDrawn() {
        verifyMethodCalledFromDelegate("reportFullyDrawn()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public boolean requestVisibleBehind(final boolean visible) {
        verifyMethodCalledFromDelegate("requestVisibleBehind(Boolean)");
        return ((CallFun1<Boolean, Boolean>) mSuperListeners.pop()).call(visible);
    }

    public void revokeUriPermission(final Uri uri, final int modeFlags) {
        verifyMethodCalledFromDelegate("revokeUriPermission(Uri, Integer)");
        ((CallVoid2<Uri, Integer>) mSuperListeners.pop()).call(uri, modeFlags);
    }

    public void sendBroadcast(final Intent intent) {
        verifyMethodCalledFromDelegate("sendBroadcast(Intent)");
        ((CallVoid1<Intent>) mSuperListeners.pop()).call(intent);
    }

    public void sendBroadcast(final Intent intent, final String receiverPermission) {
        verifyMethodCalledFromDelegate("sendBroadcast(Intent, String)");
        ((CallVoid2<Intent, String>) mSuperListeners.pop()).call(intent, receiverPermission);
    }

    public void sendBroadcastAsUser(final Intent intent, final UserHandle user) {
        verifyMethodCalledFromDelegate("sendBroadcastAsUser(Intent, UserHandle)");
        ((CallVoid2<Intent, UserHandle>) mSuperListeners.pop()).call(intent, user);
    }

    public void sendBroadcastAsUser(final Intent intent, final UserHandle user,
            final String receiverPermission) {
        verifyMethodCalledFromDelegate("sendBroadcastAsUser(Intent, UserHandle, String)");
        ((CallVoid3<Intent, UserHandle, String>) mSuperListeners.pop())
                .call(intent, user, receiverPermission);
    }

    public void sendOrderedBroadcast(final Intent intent, final String receiverPermission) {
        verifyMethodCalledFromDelegate("sendOrderedBroadcast(Intent, String)");
        ((CallVoid2<Intent, String>) mSuperListeners.pop()).call(intent, receiverPermission);
    }

    public void sendOrderedBroadcast(final Intent intent, final String receiverPermission,
            final BroadcastReceiver resultReceiver, final Handler scheduler, final int initialCode,
            final String initialData, final Bundle initialExtras) {
        verifyMethodCalledFromDelegate(
                "sendOrderedBroadcast(Intent, String, BroadcastReceiver, Handler, Integer, String, Bundle)");
        ((CallVoid7<Intent, String, BroadcastReceiver, Handler, Integer, String, Bundle>) mSuperListeners
                .pop()).call(intent, receiverPermission, resultReceiver, scheduler, initialCode,
                initialData, initialExtras);
    }

    public void sendOrderedBroadcastAsUser(final Intent intent, final UserHandle user,
            final String receiverPermission, final BroadcastReceiver resultReceiver,
            final Handler scheduler, final int initialCode, final String initialData,
            final Bundle initialExtras) {
        verifyMethodCalledFromDelegate(
                "sendOrderedBroadcastAsUser(Intent, UserHandle, String, BroadcastReceiver, Handler, Integer, String, Bundle)");
        ((CallVoid8<Intent, UserHandle, String, BroadcastReceiver, Handler, Integer, String, Bundle>) mSuperListeners
                .pop())
                .call(intent, user, receiverPermission, resultReceiver, scheduler, initialCode,
                        initialData, initialExtras);
    }

    public void sendStickyBroadcast(final Intent intent) {
        verifyMethodCalledFromDelegate("sendStickyBroadcast(Intent)");
        ((CallVoid1<Intent>) mSuperListeners.pop()).call(intent);
    }

    public void sendStickyBroadcastAsUser(final Intent intent, final UserHandle user) {
        verifyMethodCalledFromDelegate("sendStickyBroadcastAsUser(Intent, UserHandle)");
        ((CallVoid2<Intent, UserHandle>) mSuperListeners.pop()).call(intent, user);
    }

    public void sendStickyOrderedBroadcast(final Intent intent,
            final BroadcastReceiver resultReceiver, final Handler scheduler, final int initialCode,
            final String initialData, final Bundle initialExtras) {
        verifyMethodCalledFromDelegate(
                "sendStickyOrderedBroadcast(Intent, BroadcastReceiver, Handler, Integer, String, Bundle)");
        ((CallVoid6<Intent, BroadcastReceiver, Handler, Integer, String, Bundle>) mSuperListeners
                .pop())
                .call(intent, resultReceiver, scheduler, initialCode, initialData, initialExtras);
    }

    public void sendStickyOrderedBroadcastAsUser(final Intent intent, final UserHandle user,
            final BroadcastReceiver resultReceiver, final Handler scheduler, final int initialCode,
            final String initialData, final Bundle initialExtras) {
        verifyMethodCalledFromDelegate(
                "sendStickyOrderedBroadcastAsUser(Intent, UserHandle, BroadcastReceiver, Handler, Integer, String, Bundle)");
        ((CallVoid7<Intent, UserHandle, BroadcastReceiver, Handler, Integer, String, Bundle>) mSuperListeners
                .pop()).call(intent, user, resultReceiver, scheduler, initialCode, initialData,
                initialExtras);
    }

    public void setActionBar(final Toolbar toolbar) {
        verifyMethodCalledFromDelegate("setActionBar(Toolbar)");
        ((CallVoid1<Toolbar>) mSuperListeners.pop()).call(toolbar);
    }

    public void setContentTransitionManager(final TransitionManager tm) {
        verifyMethodCalledFromDelegate("setContentTransitionManager(TransitionManager)");
        ((CallVoid1<TransitionManager>) mSuperListeners.pop()).call(tm);
    }

    public void setContentView(@LayoutRes final int layoutResID) {
        verifyMethodCalledFromDelegate("setContentView(Integer)");
        ((CallVoid1<Integer>) mSuperListeners.pop()).call(layoutResID);
    }

    public void setContentView(final View view) {
        verifyMethodCalledFromDelegate("setContentView(View)");
        ((CallVoid1<View>) mSuperListeners.pop()).call(view);
    }

    public void setContentView(final View view, final ViewGroup.LayoutParams params) {
        verifyMethodCalledFromDelegate("setContentView(View, ViewGroup.LayoutParams)");
        ((CallVoid2<View, ViewGroup.LayoutParams>) mSuperListeners.pop()).call(view, params);
    }

    public void setEnterSharedElementCallback(final SharedElementCallback callback) {
        verifyMethodCalledFromDelegate("setEnterSharedElementCallback(SharedElementCallback)");
        ((CallVoid1<SharedElementCallback>) mSuperListeners.pop()).call(callback);
    }

    public void setEnterSharedElementCallback(final android.app.SharedElementCallback callback) {
        verifyMethodCalledFromDelegate(
                "setEnterSharedElementCallback(android.app.SharedElementCallback)");
        ((CallVoid1<android.app.SharedElementCallback>) mSuperListeners.pop()).call(callback);
    }

    public void setExitSharedElementCallback(final SharedElementCallback listener) {
        verifyMethodCalledFromDelegate("setExitSharedElementCallback(SharedElementCallback)");
        ((CallVoid1<SharedElementCallback>) mSuperListeners.pop()).call(listener);
    }

    public void setExitSharedElementCallback(final android.app.SharedElementCallback callback) {
        verifyMethodCalledFromDelegate(
                "setExitSharedElementCallback(android.app.SharedElementCallback)");
        ((CallVoid1<android.app.SharedElementCallback>) mSuperListeners.pop()).call(callback);
    }

    public void setFinishOnTouchOutside(final boolean finish) {
        verifyMethodCalledFromDelegate("setFinishOnTouchOutside(Boolean)");
        ((CallVoid1<Boolean>) mSuperListeners.pop()).call(finish);
    }

    public void setImmersive(final boolean i) {
        verifyMethodCalledFromDelegate("setImmersive(Boolean)");
        ((CallVoid1<Boolean>) mSuperListeners.pop()).call(i);
    }

    public void setIntent(final Intent newIntent) {
        verifyMethodCalledFromDelegate("setIntent(Intent)");
        ((CallVoid1<Intent>) mSuperListeners.pop()).call(newIntent);
    }

    public void setRequestedOrientation(final int requestedOrientation) {
        verifyMethodCalledFromDelegate("setRequestedOrientation(Integer)");
        ((CallVoid1<Integer>) mSuperListeners.pop()).call(requestedOrientation);
    }

    public void setSupportActionBar(@Nullable final android.support.v7.widget.Toolbar toolbar) {
        verifyMethodCalledFromDelegate("setSupportActionBar(android.support.v7.widget.Toolbar)");
        ((CallVoid1<android.support.v7.widget.Toolbar>) mSuperListeners.pop()).call(toolbar);
    }

    public void setSupportProgress(final int progress) {
        verifyMethodCalledFromDelegate("setSupportProgress(Integer)");
        ((CallVoid1<Integer>) mSuperListeners.pop()).call(progress);
    }

    public void setSupportProgressBarIndeterminate(final boolean indeterminate) {
        verifyMethodCalledFromDelegate("setSupportProgressBarIndeterminate(Boolean)");
        ((CallVoid1<Boolean>) mSuperListeners.pop()).call(indeterminate);
    }

    public void setSupportProgressBarIndeterminateVisibility(final boolean visible) {
        verifyMethodCalledFromDelegate("setSupportProgressBarIndeterminateVisibility(Boolean)");
        ((CallVoid1<Boolean>) mSuperListeners.pop()).call(visible);
    }

    public void setSupportProgressBarVisibility(final boolean visible) {
        verifyMethodCalledFromDelegate("setSupportProgressBarVisibility(Boolean)");
        ((CallVoid1<Boolean>) mSuperListeners.pop()).call(visible);
    }

    public void setTaskDescription(final ActivityManager.TaskDescription taskDescription) {
        verifyMethodCalledFromDelegate("setTaskDescription(ActivityManager.TaskDescription)");
        ((CallVoid1<ActivityManager.TaskDescription>) mSuperListeners.pop()).call(taskDescription);
    }

    public void setTheme(@StyleRes final int resid) {
        verifyMethodCalledFromDelegate("setTheme(Integer)");
        ((CallVoid1<Integer>) mSuperListeners.pop()).call(resid);
    }

    public void setTitle(final CharSequence title) {
        verifyMethodCalledFromDelegate("setTitle(CharSequence)");
        ((CallVoid1<CharSequence>) mSuperListeners.pop()).call(title);
    }

    public void setTitle(final int titleId) {
        verifyMethodCalledFromDelegate("setTitle(Integer)");
        ((CallVoid1<Integer>) mSuperListeners.pop()).call(titleId);
    }

    public void setTitleColor(final int textColor) {
        verifyMethodCalledFromDelegate("setTitleColor(Integer)");
        ((CallVoid1<Integer>) mSuperListeners.pop()).call(textColor);
    }

    public void setVisible(final boolean visible) {
        verifyMethodCalledFromDelegate("setVisible(Boolean)");
        ((CallVoid1<Boolean>) mSuperListeners.pop()).call(visible);
    }

    public void setWallpaper(final Bitmap bitmap) throws IOException {
        verifyMethodCalledFromDelegate("setWallpaper(Bitmap)");
        ((CallVoid1<Bitmap>) mSuperListeners.pop()).call(bitmap);
    }

    public void setWallpaper(final InputStream data) throws IOException {
        verifyMethodCalledFromDelegate("setWallpaper(InputStream)");
        ((CallVoid1<InputStream>) mSuperListeners.pop()).call(data);
    }

    public boolean shouldShowRequestPermissionRationale(final String permission) {
        verifyMethodCalledFromDelegate("shouldShowRequestPermissionRationale(String)");
        return ((CallFun1<Boolean, String>) mSuperListeners.pop()).call(permission);
    }

    public boolean shouldUpRecreateTask(final Intent targetIntent) {
        verifyMethodCalledFromDelegate("shouldUpRecreateTask(Intent)");
        return ((CallFun1<Boolean, Intent>) mSuperListeners.pop()).call(targetIntent);
    }

    public boolean showAssist(final Bundle args) {
        verifyMethodCalledFromDelegate("showAssist(Bundle)");
        return ((CallFun1<Boolean, Bundle>) mSuperListeners.pop()).call(args);
    }

    public void showLockTaskEscapeMessage() {
        verifyMethodCalledFromDelegate("showLockTaskEscapeMessage()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public android.view.ActionMode startActionMode(
            final android.view.ActionMode.Callback callback) {
        verifyMethodCalledFromDelegate("startActionMode(android.view.ActionMode.Callback)");
        return ((CallFun1<android.view.ActionMode, android.view.ActionMode.Callback>) mSuperListeners
                .pop()).call(callback);
    }

    public android.view.ActionMode startActionMode(final android.view.ActionMode.Callback callback,
            final int type) {
        verifyMethodCalledFromDelegate(
                "startActionMode(android.view.ActionMode.Callback, Integer)");
        return ((CallFun2<android.view.ActionMode, android.view.ActionMode.Callback, Integer>) mSuperListeners
                .pop()).call(callback, type);
    }

    public void startActivities(final Intent[] intents) {
        verifyMethodCalledFromDelegate("startActivities(Intent[])");
        ((CallVoid1<Intent[]>) mSuperListeners.pop()).call(intents);
    }

    public void startActivities(final Intent[] intents, final Bundle options) {
        verifyMethodCalledFromDelegate("startActivities(Intent[], Bundle)");
        ((CallVoid2<Intent[], Bundle>) mSuperListeners.pop()).call(intents, options);
    }

    public void startActivity(final Intent intent) {
        verifyMethodCalledFromDelegate("startActivity(Intent)");
        ((CallVoid1<Intent>) mSuperListeners.pop()).call(intent);
    }

    public void startActivity(final Intent intent, final Bundle options) {
        verifyMethodCalledFromDelegate("startActivity(Intent, Bundle)");
        ((CallVoid2<Intent, Bundle>) mSuperListeners.pop()).call(intent, options);
    }

    public void startActivityForResult(final Intent intent, final int requestCode) {
        verifyMethodCalledFromDelegate("startActivityForResult(Intent, Integer)");
        ((CallVoid2<Intent, Integer>) mSuperListeners.pop()).call(intent, requestCode);
    }

    public void startActivityForResult(final Intent intent, final int requestCode,
            @Nullable final Bundle options) {
        verifyMethodCalledFromDelegate("startActivityForResult(Intent, Integer, Bundle)");
        ((CallVoid3<Intent, Integer, Bundle>) mSuperListeners.pop())
                .call(intent, requestCode, options);
    }

    public void startActivityFromChild(final Activity child, final Intent intent,
            final int requestCode) {
        verifyMethodCalledFromDelegate("startActivityFromChild(Activity, Intent, Integer)");
        ((CallVoid3<Activity, Intent, Integer>) mSuperListeners.pop())
                .call(child, intent, requestCode);
    }

    public void startActivityFromChild(final Activity child, final Intent intent,
            final int requestCode, final Bundle options) {
        verifyMethodCalledFromDelegate("startActivityFromChild(Activity, Intent, Integer, Bundle)");
        ((CallVoid4<Activity, Intent, Integer, Bundle>) mSuperListeners.pop())
                .call(child, intent, requestCode, options);
    }

    public void startActivityFromFragment(final Fragment fragment, final Intent intent,
            final int requestCode) {
        verifyMethodCalledFromDelegate("startActivityFromFragment(Fragment, Intent, Integer)");
        ((CallVoid3<Fragment, Intent, Integer>) mSuperListeners.pop())
                .call(fragment, intent, requestCode);
    }

    public void startActivityFromFragment(final Fragment fragment, final Intent intent,
            final int requestCode, @Nullable final Bundle options) {
        verifyMethodCalledFromDelegate(
                "startActivityFromFragment(Fragment, Intent, Integer, Bundle)");
        ((CallVoid4<Fragment, Intent, Integer, Bundle>) mSuperListeners.pop())
                .call(fragment, intent, requestCode, options);
    }

    public void startActivityFromFragment(final android.app.Fragment fragment, final Intent intent,
            final int requestCode) {
        verifyMethodCalledFromDelegate(
                "startActivityFromFragment(android.app.Fragment, Intent, Integer)");
        ((CallVoid3<android.app.Fragment, Intent, Integer>) mSuperListeners.pop())
                .call(fragment, intent, requestCode);
    }

    public void startActivityFromFragment(final android.app.Fragment fragment, final Intent intent,
            final int requestCode, final Bundle options) {
        verifyMethodCalledFromDelegate(
                "startActivityFromFragment(android.app.Fragment, Intent, Integer, Bundle)");
        ((CallVoid4<android.app.Fragment, Intent, Integer, Bundle>) mSuperListeners.pop())
                .call(fragment, intent, requestCode, options);
    }

    public boolean startActivityIfNeeded(final Intent intent, final int requestCode) {
        verifyMethodCalledFromDelegate("startActivityIfNeeded(Intent, Integer)");
        return ((CallFun2<Boolean, Intent, Integer>) mSuperListeners.pop())
                .call(intent, requestCode);
    }

    public boolean startActivityIfNeeded(final Intent intent, final int requestCode,
            final Bundle options) {
        verifyMethodCalledFromDelegate("startActivityIfNeeded(Intent, Integer, Bundle)");
        return ((CallFun3<Boolean, Intent, Integer, Bundle>) mSuperListeners.pop())
                .call(intent, requestCode, options);
    }

    public boolean startInstrumentation(final ComponentName className, final String profileFile,
            final Bundle arguments) {
        verifyMethodCalledFromDelegate("startInstrumentation(ComponentName, String, Bundle)");
        return ((CallFun3<Boolean, ComponentName, String, Bundle>) mSuperListeners.pop())
                .call(className, profileFile, arguments);
    }

    public void startIntentSender(final IntentSender intent, final Intent fillInIntent,
            final int flagsMask, final int flagsValues, final int extraFlags)
            throws IntentSender.SendIntentException {
        verifyMethodCalledFromDelegate(
                "startIntentSender(IntentSender, Intent, Integer, Integer, Integer)");
        ((CallVoid5<IntentSender, Intent, Integer, Integer, Integer>) mSuperListeners.pop())
                .call(intent, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    public void startIntentSender(final IntentSender intent, final Intent fillInIntent,
            final int flagsMask, final int flagsValues, final int extraFlags, final Bundle options)
            throws IntentSender.SendIntentException {
        verifyMethodCalledFromDelegate(
                "startIntentSender(IntentSender, Intent, Integer, Integer, Integer, Bundle)");
        ((CallVoid6<IntentSender, Intent, Integer, Integer, Integer, Bundle>) mSuperListeners.pop())
                .call(intent, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    public void startIntentSenderForResult(final IntentSender intent, final int requestCode,
            @Nullable final Intent fillInIntent, final int flagsMask, final int flagsValues,
            final int extraFlags, final Bundle options) throws IntentSender.SendIntentException {
        verifyMethodCalledFromDelegate(
                "startIntentSenderForResult(IntentSender, Integer, Intent, Integer, Integer, Integer, Bundle)");
        ((CallVoid7<IntentSender, Integer, Intent, Integer, Integer, Integer, Bundle>) mSuperListeners
                .pop()).call(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags,
                options);
    }

    public void startIntentSenderForResult(final IntentSender intent, final int requestCode,
            @Nullable final Intent fillInIntent, final int flagsMask, final int flagsValues,
            final int extraFlags) throws IntentSender.SendIntentException {
        verifyMethodCalledFromDelegate(
                "startIntentSenderForResult(IntentSender, Integer, Intent, Integer, Integer, Integer)");
        ((CallVoid6<IntentSender, Integer, Intent, Integer, Integer, Integer>) mSuperListeners
                .pop()).call(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    public void startIntentSenderFromChild(final Activity child, final IntentSender intent,
            final int requestCode, final Intent fillInIntent, final int flagsMask,
            final int flagsValues, final int extraFlags) throws IntentSender.SendIntentException {
        verifyMethodCalledFromDelegate(
                "startIntentSenderFromChild(Activity, IntentSender, Integer, Intent, Integer, Integer, Integer)");
        ((CallVoid7<Activity, IntentSender, Integer, Intent, Integer, Integer, Integer>) mSuperListeners
                .pop())
                .call(child, intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    public void startIntentSenderFromChild(final Activity child, final IntentSender intent,
            final int requestCode, final Intent fillInIntent, final int flagsMask,
            final int flagsValues, final int extraFlags, final Bundle options)
            throws IntentSender.SendIntentException {
        verifyMethodCalledFromDelegate(
                "startIntentSenderFromChild(Activity, IntentSender, Integer, Intent, Integer, Integer, Integer, Bundle)");
        ((CallVoid8<Activity, IntentSender, Integer, Intent, Integer, Integer, Integer, Bundle>) mSuperListeners
                .pop())
                .call(child, intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags,
                        options);
    }

    public void startIntentSenderFromFragment(final Fragment fragment, final IntentSender intent,
            final int requestCode, @Nullable final Intent fillInIntent, final int flagsMask,
            final int flagsValues, final int extraFlags, final Bundle options)
            throws IntentSender.SendIntentException {
        verifyMethodCalledFromDelegate(
                "startIntentSenderFromFragment(Fragment, IntentSender, Integer, Intent, Integer, Integer, Integer, Bundle)");
        ((CallVoid8<Fragment, IntentSender, Integer, Intent, Integer, Integer, Integer, Bundle>) mSuperListeners
                .pop()).call(fragment, intent, requestCode, fillInIntent, flagsMask, flagsValues,
                extraFlags, options);
    }

    public void startLockTask() {
        verifyMethodCalledFromDelegate("startLockTask()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void startManagingCursor(final Cursor c) {
        verifyMethodCalledFromDelegate("startManagingCursor(Cursor)");
        ((CallVoid1<Cursor>) mSuperListeners.pop()).call(c);
    }

    public boolean startNextMatchingActivity(final Intent intent) {
        verifyMethodCalledFromDelegate("startNextMatchingActivity(Intent)");
        return ((CallFun1<Boolean, Intent>) mSuperListeners.pop()).call(intent);
    }

    public boolean startNextMatchingActivity(final Intent intent, final Bundle options) {
        verifyMethodCalledFromDelegate("startNextMatchingActivity(Intent, Bundle)");
        return ((CallFun2<Boolean, Intent, Bundle>) mSuperListeners.pop()).call(intent, options);
    }

    public void startPostponedEnterTransition() {
        verifyMethodCalledFromDelegate("startPostponedEnterTransition()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void startSearch(final String initialQuery, final boolean selectInitialQuery,
            final Bundle appSearchData, final boolean globalSearch) {
        verifyMethodCalledFromDelegate("startSearch(String, Boolean, Bundle, Boolean)");
        ((CallVoid4<String, Boolean, Bundle, Boolean>) mSuperListeners.pop())
                .call(initialQuery, selectInitialQuery, appSearchData, globalSearch);
    }

    public ComponentName startService(final Intent service) {
        verifyMethodCalledFromDelegate("startService(Intent)");
        return ((CallFun1<ComponentName, Intent>) mSuperListeners.pop()).call(service);
    }

    public ActionMode startSupportActionMode(@NonNull final ActionMode.Callback callback) {
        verifyMethodCalledFromDelegate("startSupportActionMode(ActionMode.Callback)");
        return ((CallFun1<ActionMode, ActionMode.Callback>) mSuperListeners.pop()).call(callback);
    }

    public void stopLockTask() {
        verifyMethodCalledFromDelegate("stopLockTask()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void stopManagingCursor(final Cursor c) {
        verifyMethodCalledFromDelegate("stopManagingCursor(Cursor)");
        ((CallVoid1<Cursor>) mSuperListeners.pop()).call(c);
    }

    public boolean stopService(final Intent name) {
        verifyMethodCalledFromDelegate("stopService(Intent)");
        return ((CallFun1<Boolean, Intent>) mSuperListeners.pop()).call(name);
    }

    public void supportFinishAfterTransition() {
        verifyMethodCalledFromDelegate("supportFinishAfterTransition()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void supportInvalidateOptionsMenu() {
        verifyMethodCalledFromDelegate("supportInvalidateOptionsMenu()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void supportNavigateUpTo(@NonNull final Intent upIntent) {
        verifyMethodCalledFromDelegate("supportNavigateUpTo(Intent)");
        ((CallVoid1<Intent>) mSuperListeners.pop()).call(upIntent);
    }

    public void supportPostponeEnterTransition() {
        verifyMethodCalledFromDelegate("supportPostponeEnterTransition()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public boolean supportRequestWindowFeature(final int featureId) {
        verifyMethodCalledFromDelegate("supportRequestWindowFeature(Integer)");
        return ((CallFun1<Boolean, Integer>) mSuperListeners.pop()).call(featureId);
    }

    public boolean supportShouldUpRecreateTask(@NonNull final Intent targetIntent) {
        verifyMethodCalledFromDelegate("supportShouldUpRecreateTask(Intent)");
        return ((CallFun1<Boolean, Intent>) mSuperListeners.pop()).call(targetIntent);
    }

    public void supportStartPostponedEnterTransition() {
        verifyMethodCalledFromDelegate("supportStartPostponedEnterTransition()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void takeKeyEvents(final boolean get) {
        verifyMethodCalledFromDelegate("takeKeyEvents(Boolean)");
        ((CallVoid1<Boolean>) mSuperListeners.pop()).call(get);
    }

    public void triggerSearch(final String query, final Bundle appSearchData) {
        verifyMethodCalledFromDelegate("triggerSearch(String, Bundle)");
        ((CallVoid2<String, Bundle>) mSuperListeners.pop()).call(query, appSearchData);
    }

    public void unbindService(final ServiceConnection conn) {
        verifyMethodCalledFromDelegate("unbindService(ServiceConnection)");
        ((CallVoid1<ServiceConnection>) mSuperListeners.pop()).call(conn);
    }

    public void unregisterComponentCallbacks(final ComponentCallbacks callback) {
        verifyMethodCalledFromDelegate("unregisterComponentCallbacks(ComponentCallbacks)");
        ((CallVoid1<ComponentCallbacks>) mSuperListeners.pop()).call(callback);
    }

    public void unregisterForContextMenu(final View view) {
        verifyMethodCalledFromDelegate("unregisterForContextMenu(View)");
        ((CallVoid1<View>) mSuperListeners.pop()).call(view);
    }

    public void unregisterReceiver(final BroadcastReceiver receiver) {
        verifyMethodCalledFromDelegate("unregisterReceiver(BroadcastReceiver)");
        ((CallVoid1<BroadcastReceiver>) mSuperListeners.pop()).call(receiver);
    }

    void addContentView(final CallVoid2<View, ViewGroup.LayoutParams> superCall, final View view,
            final ViewGroup.LayoutParams params) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            addContentView(view, params);
        }
    }

    void applyOverrideConfiguration(final CallVoid1<Configuration> superCall,
            final Configuration overrideConfiguration) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            applyOverrideConfiguration(overrideConfiguration);
        }
    }

    void attachBaseContext(final CallVoid1<Context> superCall, final Context newBase) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            attachBaseContext(newBase);
        }
    }

    boolean bindService(final CallFun3<Boolean, Intent, ServiceConnection, Integer> superCall,
            final Intent service, final ServiceConnection conn, final int flags) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return bindService(service, conn, flags);
        }
    }

    int checkCallingOrSelfPermission(final CallFun1<Integer, String> superCall,
            final String permission) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return checkCallingOrSelfPermission(permission);
        }
    }

    int checkCallingOrSelfUriPermission(final CallFun2<Integer, Uri, Integer> superCall,
            final Uri uri, final int modeFlags) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return checkCallingOrSelfUriPermission(uri, modeFlags);
        }
    }

    int checkCallingPermission(final CallFun1<Integer, String> superCall, final String permission) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return checkCallingPermission(permission);
        }
    }

    int checkCallingUriPermission(final CallFun2<Integer, Uri, Integer> superCall, final Uri uri,
            final int modeFlags) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return checkCallingUriPermission(uri, modeFlags);
        }
    }

    int checkPermission(final CallFun3<Integer, String, Integer, Integer> superCall,
            final String permission, final int pid, final int uid) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return checkPermission(permission, pid, uid);
        }
    }

    int checkSelfPermission(final CallFun1<Integer, String> superCall, final String permission) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return checkSelfPermission(permission);
        }
    }

    int checkUriPermission(final CallFun4<Integer, Uri, Integer, Integer, Integer> superCall,
            final Uri uri, final int pid, final int uid, final int modeFlags) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return checkUriPermission(uri, pid, uid, modeFlags);
        }
    }

    int checkUriPermission(
            final CallFun6<Integer, Uri, String, String, Integer, Integer, Integer> superCall,
            final Uri uri, final String readPermission, final String writePermission, final int pid,
            final int uid, final int modeFlags) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return checkUriPermission(uri, readPermission, writePermission, pid, uid, modeFlags);
        }
    }

    void clearWallpaper(final CallVoid0 superCall) throws IOException {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            clearWallpaper();
        }
    }

    void closeContextMenu(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            closeContextMenu();
        }
    }

    void closeOptionsMenu(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            closeOptionsMenu();
        }
    }

    Context createConfigurationContext(final CallFun1<Context, Configuration> superCall,
            final Configuration overrideConfiguration) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return createConfigurationContext(overrideConfiguration);
        }
    }

    Context createDisplayContext(final CallFun1<Context, Display> superCall,
            final Display display) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return createDisplayContext(display);
        }
    }

    Context createPackageContext(final CallFun2<Context, String, Integer> superCall,
            final String packageName, final int flags) throws PackageManager.NameNotFoundException {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return createPackageContext(packageName, flags);
        }
    }

    PendingIntent createPendingResult(
            final CallFun3<PendingIntent, Integer, Intent, Integer> superCall,
            final int requestCode, final Intent data, final int flags) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return createPendingResult(requestCode, data, flags);
        }
    }

    String[] databaseList(final CallFun0<String[]> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return databaseList();
        }
    }

    boolean deleteDatabase(final CallFun1<Boolean, String> superCall, final String name) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return deleteDatabase(name);
        }
    }

    boolean deleteFile(final CallFun1<Boolean, String> superCall, final String name) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return deleteFile(name);
        }
    }

    boolean dispatchGenericMotionEvent(final CallFun1<Boolean, MotionEvent> superCall,
            final MotionEvent ev) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return dispatchGenericMotionEvent(ev);
        }
    }

    boolean dispatchKeyEvent(final CallFun1<Boolean, KeyEvent> superCall, final KeyEvent event) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return dispatchKeyEvent(event);
        }
    }

    boolean dispatchKeyShortcutEvent(final CallFun1<Boolean, KeyEvent> superCall,
            final KeyEvent event) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return dispatchKeyShortcutEvent(event);
        }
    }

    boolean dispatchPopulateAccessibilityEvent(
            final CallFun1<Boolean, AccessibilityEvent> superCall, final AccessibilityEvent event) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return dispatchPopulateAccessibilityEvent(event);
        }
    }

    boolean dispatchTouchEvent(final CallFun1<Boolean, MotionEvent> superCall,
            final MotionEvent ev) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return dispatchTouchEvent(ev);
        }
    }

    boolean dispatchTrackballEvent(final CallFun1<Boolean, MotionEvent> superCall,
            final MotionEvent ev) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return dispatchTrackballEvent(ev);
        }
    }

    void dump(final CallVoid4<String, FileDescriptor, PrintWriter, String[]> superCall,
            final String prefix, final FileDescriptor fd, final PrintWriter writer,
            final String[] args) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            dump(prefix, fd, writer, args);
        }
    }

    void enforceCallingOrSelfPermission(final CallVoid2<String, String> superCall,
            final String permission, final String message) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            enforceCallingOrSelfPermission(permission, message);
        }
    }

    void enforceCallingOrSelfUriPermission(final CallVoid3<Uri, Integer, String> superCall,
            final Uri uri, final int modeFlags, final String message) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            enforceCallingOrSelfUriPermission(uri, modeFlags, message);
        }
    }

    void enforceCallingPermission(final CallVoid2<String, String> superCall,
            final String permission, final String message) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            enforceCallingPermission(permission, message);
        }
    }

    void enforceCallingUriPermission(final CallVoid3<Uri, Integer, String> superCall, final Uri uri,
            final int modeFlags, final String message) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            enforceCallingUriPermission(uri, modeFlags, message);
        }
    }

    void enforcePermission(final CallVoid4<String, Integer, Integer, String> superCall,
            final String permission, final int pid, final int uid, final String message) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            enforcePermission(permission, pid, uid, message);
        }
    }

    void enforceUriPermission(final CallVoid5<Uri, Integer, Integer, Integer, String> superCall,
            final Uri uri, final int pid, final int uid, final int modeFlags,
            final String message) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            enforceUriPermission(uri, pid, uid, modeFlags, message);
        }
    }

    void enforceUriPermission(
            final CallVoid7<Uri, String, String, Integer, Integer, Integer, String> superCall,
            final Uri uri, final String readPermission, final String writePermission, final int pid,
            final int uid, final int modeFlags, final String message) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            enforceUriPermission(uri, readPermission, writePermission, pid, uid, modeFlags,
                    message);
        }
    }

    String[] fileList(final CallFun0<String[]> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return fileList();
        }
    }

    View findViewById(final CallFun1<View, Integer> superCall, @IdRes final int id) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return findViewById(id);
        }
    }

    void finish(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            finish();
        }
    }

    void finishActivity(final CallVoid1<Integer> superCall, final int requestCode) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            finishActivity(requestCode);
        }
    }

    void finishActivityFromChild(final CallVoid2<Activity, Integer> superCall, final Activity child,
            final int requestCode) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            finishActivityFromChild(child, requestCode);
        }
    }

    void finishAffinity(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            finishAffinity();
        }
    }

    void finishAfterTransition(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            finishAfterTransition();
        }
    }

    void finishAndRemoveTask(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            finishAndRemoveTask();
        }
    }

    void finishFromChild(final CallVoid1<Activity> superCall, final Activity child) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            finishFromChild(child);
        }
    }

    android.app.ActionBar getActionBar(final CallFun0<android.app.ActionBar> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getActionBar();
        }
    }

    Context getApplicationContext(final CallFun0<Context> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getApplicationContext();
        }
    }

    ApplicationInfo getApplicationInfo(final CallFun0<ApplicationInfo> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getApplicationInfo();
        }
    }

    AssetManager getAssets(final CallFun0<AssetManager> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getAssets();
        }
    }

    Context getBaseContext(final CallFun0<Context> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getBaseContext();
        }
    }

    File getCacheDir(final CallFun0<File> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getCacheDir();
        }
    }

    ComponentName getCallingActivity(final CallFun0<ComponentName> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getCallingActivity();
        }
    }

    String getCallingPackage(final CallFun0<String> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getCallingPackage();
        }
    }

    int getChangingConfigurations(final CallFun0<Integer> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getChangingConfigurations();
        }
    }

    ClassLoader getClassLoader(final CallFun0<ClassLoader> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getClassLoader();
        }
    }

    File getCodeCacheDir(final CallFun0<File> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getCodeCacheDir();
        }
    }

    ComponentName getComponentName(final CallFun0<ComponentName> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getComponentName();
        }
    }

    ContentResolver getContentResolver(final CallFun0<ContentResolver> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getContentResolver();
        }
    }

    Scene getContentScene(final CallFun0<Scene> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getContentScene();
        }
    }

    TransitionManager getContentTransitionManager(final CallFun0<TransitionManager> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getContentTransitionManager();
        }
    }

    View getCurrentFocus(final CallFun0<View> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getCurrentFocus();
        }
    }

    File getDatabasePath(final CallFun1<File, String> superCall, final String name) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getDatabasePath(name);
        }
    }

    AppCompatDelegate getDelegate(final CallFun0<AppCompatDelegate> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getDelegate();
        }
    }

    File getDir(final CallFun2<File, String, Integer> superCall, final String name,
            final int mode) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getDir(name, mode);
        }
    }

    ActionBarDrawerToggle.Delegate getDrawerToggleDelegate(
            final CallFun0<ActionBarDrawerToggle.Delegate> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getDrawerToggleDelegate();
        }
    }

    File getExternalCacheDir(final CallFun0<File> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getExternalCacheDir();
        }
    }

    File[] getExternalCacheDirs(final CallFun0<File[]> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getExternalCacheDirs();
        }
    }

    File getExternalFilesDir(final CallFun1<File, String> superCall, final String type) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getExternalFilesDir(type);
        }
    }

    File[] getExternalFilesDirs(final CallFun1<File[], String> superCall, final String type) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getExternalFilesDirs(type);
        }
    }

    File[] getExternalMediaDirs(final CallFun0<File[]> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getExternalMediaDirs();
        }
    }

    File getFileStreamPath(final CallFun1<File, String> superCall, final String name) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getFileStreamPath(name);
        }
    }

    File getFilesDir(final CallFun0<File> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getFilesDir();
        }
    }

    android.app.FragmentManager getFragmentManager(
            final CallFun0<android.app.FragmentManager> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getFragmentManager();
        }
    }

    Intent getIntent(final CallFun0<Intent> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getIntent();
        }
    }

    LayoutInflater getLayoutInflater(final CallFun0<LayoutInflater> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getLayoutInflater();
        }
    }

    android.app.LoaderManager getLoaderManager(
            final CallFun0<android.app.LoaderManager> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getLoaderManager();
        }
    }

    String getLocalClassName(final CallFun0<String> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getLocalClassName();
        }
    }

    Looper getMainLooper(final CallFun0<Looper> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getMainLooper();
        }
    }

    MenuInflater getMenuInflater(final CallFun0<MenuInflater> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getMenuInflater();
        }
    }

    File getNoBackupFilesDir(final CallFun0<File> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getNoBackupFilesDir();
        }
    }

    File getObbDir(final CallFun0<File> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getObbDir();
        }
    }

    File[] getObbDirs(final CallFun0<File[]> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getObbDirs();
        }
    }

    String getPackageCodePath(final CallFun0<String> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getPackageCodePath();
        }
    }

    PackageManager getPackageManager(final CallFun0<PackageManager> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getPackageManager();
        }
    }

    String getPackageName(final CallFun0<String> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getPackageName();
        }
    }

    String getPackageResourcePath(final CallFun0<String> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getPackageResourcePath();
        }
    }

    Intent getParentActivityIntent(final CallFun0<Intent> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getParentActivityIntent();
        }
    }

    SharedPreferences getPreferences(final CallFun1<SharedPreferences, Integer> superCall,
            final int mode) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getPreferences(mode);
        }
    }

    Uri getReferrer(final CallFun0<Uri> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getReferrer();
        }
    }

    int getRequestedOrientation(final CallFun0<Integer> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getRequestedOrientation();
        }
    }

    Resources getResources(final CallFun0<Resources> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getResources();
        }
    }

    SharedPreferences getSharedPreferences(
            final CallFun2<SharedPreferences, String, Integer> superCall, final String name,
            final int mode) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getSharedPreferences(name, mode);
        }
    }

    ActionBar getSupportActionBar(final CallFun0<ActionBar> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getSupportActionBar();
        }
    }

    FragmentManager getSupportFragmentManager(final CallFun0<FragmentManager> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getSupportFragmentManager();
        }
    }

    LoaderManager getSupportLoaderManager(final CallFun0<LoaderManager> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getSupportLoaderManager();
        }
    }

    Intent getSupportParentActivityIntent(final CallFun0<Intent> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getSupportParentActivityIntent();
        }
    }

    Object getSystemService(final CallFun1<Object, String> superCall, final String name) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getSystemService(name);
        }
    }

    String getSystemServiceName(final CallFun1<String, Class<?>> superCall,
            final Class<?> serviceClass) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getSystemServiceName(serviceClass);
        }
    }

    int getTaskId(final CallFun0<Integer> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getTaskId();
        }
    }

    Resources.Theme getTheme(final CallFun0<Resources.Theme> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getTheme();
        }
    }

    VoiceInteractor getVoiceInteractor(final CallFun0<VoiceInteractor> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getVoiceInteractor();
        }
    }

    Drawable getWallpaper(final CallFun0<Drawable> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getWallpaper();
        }
    }

    int getWallpaperDesiredMinimumHeight(final CallFun0<Integer> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getWallpaperDesiredMinimumHeight();
        }
    }

    int getWallpaperDesiredMinimumWidth(final CallFun0<Integer> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getWallpaperDesiredMinimumWidth();
        }
    }

    Window getWindow(final CallFun0<Window> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getWindow();
        }
    }

    WindowManager getWindowManager(final CallFun0<WindowManager> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getWindowManager();
        }
    }

    void grantUriPermission(final CallVoid3<String, Uri, Integer> superCall, final String toPackage,
            final Uri uri, final int modeFlags) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            grantUriPermission(toPackage, uri, modeFlags);
        }
    }

    boolean hasWindowFocus(final CallFun0<Boolean> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return hasWindowFocus();
        }
    }

    void invalidateOptionsMenu(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            invalidateOptionsMenu();
        }
    }

    boolean isChangingConfigurations(final CallFun0<Boolean> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return isChangingConfigurations();
        }
    }

    boolean isDestroyed(final CallFun0<Boolean> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return isDestroyed();
        }
    }

    boolean isFinishing(final CallFun0<Boolean> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return isFinishing();
        }
    }

    boolean isImmersive(final CallFun0<Boolean> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return isImmersive();
        }
    }

    boolean isRestricted(final CallFun0<Boolean> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return isRestricted();
        }
    }

    boolean isTaskRoot(final CallFun0<Boolean> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return isTaskRoot();
        }
    }

    boolean isVoiceInteraction(final CallFun0<Boolean> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return isVoiceInteraction();
        }
    }

    boolean isVoiceInteractionRoot(final CallFun0<Boolean> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return isVoiceInteractionRoot();
        }
    }

    boolean moveTaskToBack(final CallFun1<Boolean, Boolean> superCall, final boolean nonRoot) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return moveTaskToBack(nonRoot);
        }
    }

    boolean navigateUpTo(final CallFun1<Boolean, Intent> superCall, final Intent upIntent) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return navigateUpTo(upIntent);
        }
    }

    boolean navigateUpToFromChild(final CallFun2<Boolean, Activity, Intent> superCall,
            final Activity child, final Intent upIntent) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return navigateUpToFromChild(child, upIntent);
        }
    }

    void onActionModeFinished(final CallVoid1<android.view.ActionMode> superCall,
            final android.view.ActionMode mode) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onActionModeFinished(mode);
        }
    }

    void onActionModeStarted(final CallVoid1<android.view.ActionMode> superCall,
            final android.view.ActionMode mode) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onActionModeStarted(mode);
        }
    }

    void onActivityReenter(final CallVoid2<Integer, Intent> superCall, final int resultCode,
            final Intent data) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onActivityReenter(resultCode, data);
        }
    }

    void onActivityResult(final CallVoid3<Integer, Integer, Intent> superCall,
            final int requestCode, final int resultCode, final Intent data) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onActivityResult(requestCode, resultCode, data);
        }
    }

    void onApplyThemeResource(final CallVoid3<Resources.Theme, Integer, Boolean> superCall,
            final Resources.Theme theme, final int resid, final boolean first) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onApplyThemeResource(theme, resid, first);
        }
    }

    void onAttachFragment(final CallVoid1<Fragment> superCall, final Fragment fragment) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onAttachFragment(fragment);
        }
    }

    void onAttachFragment(final CallVoid1<android.app.Fragment> superCall,
            final android.app.Fragment fragment) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onAttachFragment(fragment);
        }
    }

    void onAttachedToWindow(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onAttachedToWindow();
        }
    }

    void onBackPressed(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onBackPressed();
        }
    }

    void onChildTitleChanged(final CallVoid2<Activity, CharSequence> superCall,
            final Activity childActivity, final CharSequence title) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onChildTitleChanged(childActivity, title);
        }
    }

    void onConfigurationChanged(final CallVoid1<Configuration> superCall,
            final Configuration newConfig) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onConfigurationChanged(newConfig);
        }
    }

    void onContentChanged(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onContentChanged();
        }
    }

    boolean onContextItemSelected(final CallFun1<Boolean, MenuItem> superCall,
            final MenuItem item) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onContextItemSelected(item);
        }
    }

    void onContextMenuClosed(final CallVoid1<Menu> superCall, final Menu menu) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onContextMenuClosed(menu);
        }
    }

    void onCreate(final CallVoid2<Bundle, PersistableBundle> superCall,
            final Bundle savedInstanceState, final PersistableBundle persistentState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onCreate(savedInstanceState, persistentState);
        }
    }

    void onCreate(final CallVoid1<Bundle> superCall, @Nullable final Bundle savedInstanceState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onCreate(savedInstanceState);
        }
    }

    void onCreateContextMenu(
            final CallVoid3<ContextMenu, View, ContextMenu.ContextMenuInfo> superCall,
            final ContextMenu menu, final View v, final ContextMenu.ContextMenuInfo menuInfo) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onCreateContextMenu(menu, v, menuInfo);
        }
    }

    CharSequence onCreateDescription(final CallFun0<CharSequence> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onCreateDescription();
        }
    }

    Dialog onCreateDialog(final CallFun1<Dialog, Integer> superCall, final int id) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onCreateDialog(id);
        }
    }

    Dialog onCreateDialog(final CallFun2<Dialog, Integer, Bundle> superCall, final int id,
            final Bundle args) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onCreateDialog(id, args);
        }
    }

    void onCreateNavigateUpTaskStack(final CallVoid1<TaskStackBuilder> superCall,
            final TaskStackBuilder builder) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onCreateNavigateUpTaskStack(builder);
        }
    }

    boolean onCreateOptionsMenu(final CallFun1<Boolean, Menu> superCall, final Menu menu) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onCreateOptionsMenu(menu);
        }
    }

    boolean onCreatePanelMenu(final CallFun2<Boolean, Integer, Menu> superCall, final int featureId,
            final Menu menu) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onCreatePanelMenu(featureId, menu);
        }
    }

    View onCreatePanelView(final CallFun1<View, Integer> superCall, final int featureId) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onCreatePanelView(featureId);
        }
    }

    void onCreateSupportNavigateUpTaskStack(
            final CallVoid1<android.support.v4.app.TaskStackBuilder> superCall,
            @NonNull final android.support.v4.app.TaskStackBuilder builder) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onCreateSupportNavigateUpTaskStack(builder);
        }
    }

    boolean onCreateThumbnail(final CallFun2<Boolean, Bitmap, Canvas> superCall,
            final Bitmap outBitmap, final Canvas canvas) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onCreateThumbnail(outBitmap, canvas);
        }
    }

    View onCreateView(final CallFun4<View, View, String, Context, AttributeSet> superCall,
            final View parent, final String name, final Context context, final AttributeSet attrs) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onCreateView(parent, name, context, attrs);
        }
    }

    View onCreateView(final CallFun3<View, String, Context, AttributeSet> superCall,
            final String name, final Context context, final AttributeSet attrs) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onCreateView(name, context, attrs);
        }
    }

    void onDestroy(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onDestroy();
        }
    }

    void onDetachedFromWindow(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onDetachedFromWindow();
        }
    }

    void onEnterAnimationComplete(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onEnterAnimationComplete();
        }
    }

    boolean onGenericMotionEvent(final CallFun1<Boolean, MotionEvent> superCall,
            final MotionEvent event) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onGenericMotionEvent(event);
        }
    }

    boolean onKeyDown(final CallFun2<Boolean, Integer, KeyEvent> superCall, final int keyCode,
            final KeyEvent event) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onKeyDown(keyCode, event);
        }
    }

    boolean onKeyLongPress(final CallFun2<Boolean, Integer, KeyEvent> superCall, final int keyCode,
            final KeyEvent event) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onKeyLongPress(keyCode, event);
        }
    }

    boolean onKeyMultiple(final CallFun3<Boolean, Integer, Integer, KeyEvent> superCall,
            final int keyCode, final int repeatCount, final KeyEvent event) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onKeyMultiple(keyCode, repeatCount, event);
        }
    }

    boolean onKeyShortcut(final CallFun2<Boolean, Integer, KeyEvent> superCall, final int keyCode,
            final KeyEvent event) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onKeyShortcut(keyCode, event);
        }
    }

    boolean onKeyUp(final CallFun2<Boolean, Integer, KeyEvent> superCall, final int keyCode,
            final KeyEvent event) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onKeyUp(keyCode, event);
        }
    }

    void onLowMemory(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onLowMemory();
        }
    }

    boolean onMenuOpened(final CallFun2<Boolean, Integer, Menu> superCall, final int featureId,
            final Menu menu) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onMenuOpened(featureId, menu);
        }
    }

    void onMultiWindowModeChanged(final CallVoid1<Boolean> superCall,
            final boolean isInMultiWindowMode) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onMultiWindowModeChanged(isInMultiWindowMode);
        }
    }

    boolean onNavigateUp(final CallFun0<Boolean> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onNavigateUp();
        }
    }

    boolean onNavigateUpFromChild(final CallFun1<Boolean, Activity> superCall,
            final Activity child) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onNavigateUpFromChild(child);
        }
    }

    void onNewIntent(final CallVoid1<Intent> superCall, final Intent intent) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onNewIntent(intent);
        }
    }

    boolean onOptionsItemSelected(final CallFun1<Boolean, MenuItem> superCall,
            final MenuItem item) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onOptionsItemSelected(item);
        }
    }

    void onOptionsMenuClosed(final CallVoid1<Menu> superCall, final Menu menu) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onOptionsMenuClosed(menu);
        }
    }

    void onPanelClosed(final CallVoid2<Integer, Menu> superCall, final int featureId,
            final Menu menu) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onPanelClosed(featureId, menu);
        }
    }

    void onPause(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onPause();
        }
    }

    void onPictureInPictureModeChanged(final CallVoid1<Boolean> superCall,
            final boolean isInPictureInPictureMode) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onPictureInPictureModeChanged(isInPictureInPictureMode);
        }
    }

    void onPostCreate(final CallVoid2<Bundle, PersistableBundle> superCall,
            final Bundle savedInstanceState, final PersistableBundle persistentState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onPostCreate(savedInstanceState, persistentState);
        }
    }

    void onPostCreate(final CallVoid1<Bundle> superCall,
            @Nullable final Bundle savedInstanceState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onPostCreate(savedInstanceState);
        }
    }

    void onPostResume(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onPostResume();
        }
    }

    void onPrepareDialog(final CallVoid2<Integer, Dialog> superCall, final int id,
            final Dialog dialog) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onPrepareDialog(id, dialog);
        }
    }

    void onPrepareDialog(final CallVoid3<Integer, Dialog, Bundle> superCall, final int id,
            final Dialog dialog, final Bundle args) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onPrepareDialog(id, dialog, args);
        }
    }

    void onPrepareNavigateUpTaskStack(final CallVoid1<TaskStackBuilder> superCall,
            final TaskStackBuilder builder) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onPrepareNavigateUpTaskStack(builder);
        }
    }

    boolean onPrepareOptionsMenu(final CallFun1<Boolean, Menu> superCall, final Menu menu) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onPrepareOptionsMenu(menu);
        }
    }

    boolean onPrepareOptionsPanel(final CallFun2<Boolean, View, Menu> superCall, final View view,
            final Menu menu) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onPrepareOptionsPanel(view, menu);
        }
    }

    boolean onPreparePanel(final CallFun3<Boolean, Integer, View, Menu> superCall,
            final int featureId, final View view, final Menu menu) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onPreparePanel(featureId, view, menu);
        }
    }

    void onPrepareSupportNavigateUpTaskStack(
            final CallVoid1<android.support.v4.app.TaskStackBuilder> superCall,
            @NonNull final android.support.v4.app.TaskStackBuilder builder) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onPrepareSupportNavigateUpTaskStack(builder);
        }
    }

    void onProvideAssistContent(final CallVoid1<AssistContent> superCall,
            final AssistContent outContent) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onProvideAssistContent(outContent);
        }
    }

    void onProvideAssistData(final CallVoid1<Bundle> superCall, final Bundle data) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onProvideAssistData(data);
        }
    }

    Uri onProvideReferrer(final CallFun0<Uri> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onProvideReferrer();
        }
    }

    void onRequestPermissionsResult(final CallVoid3<Integer, String[], int[]> superCall,
            final int requestCode, @NonNull final String[] permissions,
            @NonNull final int[] grantResults) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }

    void onRestart(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onRestart();
        }
    }

    void onRestoreInstanceState(final CallVoid2<Bundle, PersistableBundle> superCall,
            final Bundle savedInstanceState, final PersistableBundle persistentState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onRestoreInstanceState(savedInstanceState, persistentState);
        }
    }

    void onRestoreInstanceState(final CallVoid1<Bundle> superCall,
            final Bundle savedInstanceState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onRestoreInstanceState(savedInstanceState);
        }
    }

    void onResume(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onResume();
        }
    }

    void onResumeFragments(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onResumeFragments();
        }
    }

    void onSaveInstanceState(final CallVoid2<Bundle, PersistableBundle> superCall,
            final Bundle outState, final PersistableBundle outPersistentState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onSaveInstanceState(outState, outPersistentState);
        }
    }

    void onSaveInstanceState(final CallVoid1<Bundle> superCall, final Bundle outState) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onSaveInstanceState(outState);
        }
    }

    boolean onSearchRequested(final CallFun1<Boolean, SearchEvent> superCall,
            final SearchEvent searchEvent) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onSearchRequested(searchEvent);
        }
    }

    boolean onSearchRequested(final CallFun0<Boolean> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onSearchRequested();
        }
    }

    void onStart(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onStart();
        }
    }

    void onStateNotSaved(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onStateNotSaved();
        }
    }

    void onStop(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onStop();
        }
    }

    void onSupportActionModeFinished(final CallVoid1<ActionMode> superCall,
            @NonNull final ActionMode mode) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onSupportActionModeFinished(mode);
        }
    }

    void onSupportActionModeStarted(final CallVoid1<ActionMode> superCall,
            @NonNull final ActionMode mode) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onSupportActionModeStarted(mode);
        }
    }

    void onSupportContentChanged(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onSupportContentChanged();
        }
    }

    boolean onSupportNavigateUp(final CallFun0<Boolean> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onSupportNavigateUp();
        }
    }

    void onTitleChanged(final CallVoid2<CharSequence, Integer> superCall, final CharSequence title,
            final int color) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onTitleChanged(title, color);
        }
    }

    boolean onTouchEvent(final CallFun1<Boolean, MotionEvent> superCall, final MotionEvent event) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onTouchEvent(event);
        }
    }

    boolean onTrackballEvent(final CallFun1<Boolean, MotionEvent> superCall,
            final MotionEvent event) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onTrackballEvent(event);
        }
    }

    void onTrimMemory(final CallVoid1<Integer> superCall, final int level) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onTrimMemory(level);
        }
    }

    void onUserInteraction(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onUserInteraction();
        }
    }

    void onUserLeaveHint(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onUserLeaveHint();
        }
    }

    void onVisibleBehindCanceled(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onVisibleBehindCanceled();
        }
    }

    void onWindowAttributesChanged(final CallVoid1<WindowManager.LayoutParams> superCall,
            final WindowManager.LayoutParams params) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onWindowAttributesChanged(params);
        }
    }

    void onWindowFocusChanged(final CallVoid1<Boolean> superCall, final boolean hasFocus) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onWindowFocusChanged(hasFocus);
        }
    }

    android.view.ActionMode onWindowStartingActionMode(
            final CallFun1<android.view.ActionMode, android.view.ActionMode.Callback> superCall,
            final android.view.ActionMode.Callback callback) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onWindowStartingActionMode(callback);
        }
    }

    android.view.ActionMode onWindowStartingActionMode(
            final CallFun2<android.view.ActionMode, android.view.ActionMode.Callback, Integer> superCall,
            final android.view.ActionMode.Callback callback, final int type) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onWindowStartingActionMode(callback, type);
        }
    }

    ActionMode onWindowStartingSupportActionMode(
            final CallFun1<ActionMode, ActionMode.Callback> superCall,
            @NonNull final ActionMode.Callback callback) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return onWindowStartingSupportActionMode(callback);
        }
    }

    void openContextMenu(final CallVoid1<View> superCall, final View view) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            openContextMenu(view);
        }
    }

    FileInputStream openFileInput(final CallFun1<FileInputStream, String> superCall,
            final String name) throws FileNotFoundException {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return openFileInput(name);
        }
    }

    FileOutputStream openFileOutput(final CallFun2<FileOutputStream, String, Integer> superCall,
            final String name, final int mode) throws FileNotFoundException {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return openFileOutput(name, mode);
        }
    }

    void openOptionsMenu(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            openOptionsMenu();
        }
    }

    SQLiteDatabase openOrCreateDatabase(
            final CallFun3<SQLiteDatabase, String, Integer, SQLiteDatabase.CursorFactory> superCall,
            final String name, final int mode, final SQLiteDatabase.CursorFactory factory) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return openOrCreateDatabase(name, mode, factory);
        }
    }

    SQLiteDatabase openOrCreateDatabase(
            final CallFun4<SQLiteDatabase, String, Integer, SQLiteDatabase.CursorFactory, DatabaseErrorHandler> superCall,
            final String name, final int mode, final SQLiteDatabase.CursorFactory factory,
            final DatabaseErrorHandler errorHandler) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return openOrCreateDatabase(name, mode, factory, errorHandler);
        }
    }

    void overridePendingTransition(final CallVoid2<Integer, Integer> superCall, final int enterAnim,
            final int exitAnim) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            overridePendingTransition(enterAnim, exitAnim);
        }
    }

    Drawable peekWallpaper(final CallFun0<Drawable> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return peekWallpaper();
        }
    }

    void postponeEnterTransition(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            postponeEnterTransition();
        }
    }

    void recreate(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            recreate();
        }
    }

    void registerComponentCallbacks(final CallVoid1<ComponentCallbacks> superCall,
            final ComponentCallbacks callback) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            registerComponentCallbacks(callback);
        }
    }

    void registerForContextMenu(final CallVoid1<View> superCall, final View view) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            registerForContextMenu(view);
        }
    }

    Intent registerReceiver(final CallFun2<Intent, BroadcastReceiver, IntentFilter> superCall,
            final BroadcastReceiver receiver, final IntentFilter filter) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return registerReceiver(receiver, filter);
        }
    }

    Intent registerReceiver(
            final CallFun4<Intent, BroadcastReceiver, IntentFilter, String, Handler> superCall,
            final BroadcastReceiver receiver, final IntentFilter filter,
            final String broadcastPermission, final Handler scheduler) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return registerReceiver(receiver, filter, broadcastPermission, scheduler);
        }
    }

    boolean releaseInstance(final CallFun0<Boolean> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return releaseInstance();
        }
    }

    void removeStickyBroadcast(final CallVoid1<Intent> superCall, final Intent intent) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            removeStickyBroadcast(intent);
        }
    }

    void removeStickyBroadcastAsUser(final CallVoid2<Intent, UserHandle> superCall,
            final Intent intent, final UserHandle user) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            removeStickyBroadcastAsUser(intent, user);
        }
    }

    void reportFullyDrawn(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            reportFullyDrawn();
        }
    }

    boolean requestVisibleBehind(final CallFun1<Boolean, Boolean> superCall,
            final boolean visible) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return requestVisibleBehind(visible);
        }
    }

    void revokeUriPermission(final CallVoid2<Uri, Integer> superCall, final Uri uri,
            final int modeFlags) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            revokeUriPermission(uri, modeFlags);
        }
    }

    void sendBroadcast(final CallVoid1<Intent> superCall, final Intent intent) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            sendBroadcast(intent);
        }
    }

    void sendBroadcast(final CallVoid2<Intent, String> superCall, final Intent intent,
            final String receiverPermission) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            sendBroadcast(intent, receiverPermission);
        }
    }

    void sendBroadcastAsUser(final CallVoid2<Intent, UserHandle> superCall, final Intent intent,
            final UserHandle user) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            sendBroadcastAsUser(intent, user);
        }
    }

    void sendBroadcastAsUser(final CallVoid3<Intent, UserHandle, String> superCall,
            final Intent intent, final UserHandle user, final String receiverPermission) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            sendBroadcastAsUser(intent, user, receiverPermission);
        }
    }

    void sendOrderedBroadcast(final CallVoid2<Intent, String> superCall, final Intent intent,
            final String receiverPermission) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            sendOrderedBroadcast(intent, receiverPermission);
        }
    }

    void sendOrderedBroadcast(
            final CallVoid7<Intent, String, BroadcastReceiver, Handler, Integer, String, Bundle> superCall,
            final Intent intent, final String receiverPermission,
            final BroadcastReceiver resultReceiver, final Handler scheduler, final int initialCode,
            final String initialData, final Bundle initialExtras) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            sendOrderedBroadcast(intent, receiverPermission, resultReceiver, scheduler, initialCode,
                    initialData, initialExtras);
        }
    }

    void sendOrderedBroadcastAsUser(
            final CallVoid8<Intent, UserHandle, String, BroadcastReceiver, Handler, Integer, String, Bundle> superCall,
            final Intent intent, final UserHandle user, final String receiverPermission,
            final BroadcastReceiver resultReceiver, final Handler scheduler, final int initialCode,
            final String initialData, final Bundle initialExtras) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            sendOrderedBroadcastAsUser(intent, user, receiverPermission, resultReceiver, scheduler,
                    initialCode, initialData, initialExtras);
        }
    }

    void sendStickyBroadcast(final CallVoid1<Intent> superCall, final Intent intent) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            sendStickyBroadcast(intent);
        }
    }

    void sendStickyBroadcastAsUser(final CallVoid2<Intent, UserHandle> superCall,
            final Intent intent, final UserHandle user) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            sendStickyBroadcastAsUser(intent, user);
        }
    }

    void sendStickyOrderedBroadcast(
            final CallVoid6<Intent, BroadcastReceiver, Handler, Integer, String, Bundle> superCall,
            final Intent intent, final BroadcastReceiver resultReceiver, final Handler scheduler,
            final int initialCode, final String initialData, final Bundle initialExtras) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            sendStickyOrderedBroadcast(intent, resultReceiver, scheduler, initialCode, initialData,
                    initialExtras);
        }
    }

    void sendStickyOrderedBroadcastAsUser(
            final CallVoid7<Intent, UserHandle, BroadcastReceiver, Handler, Integer, String, Bundle> superCall,
            final Intent intent, final UserHandle user, final BroadcastReceiver resultReceiver,
            final Handler scheduler, final int initialCode, final String initialData,
            final Bundle initialExtras) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            sendStickyOrderedBroadcastAsUser(intent, user, resultReceiver, scheduler, initialCode,
                    initialData, initialExtras);
        }
    }

    void setActionBar(final CallVoid1<Toolbar> superCall, final Toolbar toolbar) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setActionBar(toolbar);
        }
    }

    void setContentTransitionManager(final CallVoid1<TransitionManager> superCall,
            final TransitionManager tm) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setContentTransitionManager(tm);
        }
    }

    void setContentView(final CallVoid1<Integer> superCall, @LayoutRes final int layoutResID) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setContentView(layoutResID);
        }
    }

    void setContentView(final CallVoid1<View> superCall, final View view) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setContentView(view);
        }
    }

    void setContentView(final CallVoid2<View, ViewGroup.LayoutParams> superCall, final View view,
            final ViewGroup.LayoutParams params) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setContentView(view, params);
        }
    }

    void setEnterSharedElementCallback(final CallVoid1<SharedElementCallback> superCall,
            final SharedElementCallback callback) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setEnterSharedElementCallback(callback);
        }
    }

    void setEnterSharedElementCallback(final CallVoid1<android.app.SharedElementCallback> superCall,
            final android.app.SharedElementCallback callback) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setEnterSharedElementCallback(callback);
        }
    }

    void setExitSharedElementCallback(final CallVoid1<SharedElementCallback> superCall,
            final SharedElementCallback listener) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setExitSharedElementCallback(listener);
        }
    }

    void setExitSharedElementCallback(final CallVoid1<android.app.SharedElementCallback> superCall,
            final android.app.SharedElementCallback callback) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setExitSharedElementCallback(callback);
        }
    }

    void setFinishOnTouchOutside(final CallVoid1<Boolean> superCall, final boolean finish) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setFinishOnTouchOutside(finish);
        }
    }

    void setImmersive(final CallVoid1<Boolean> superCall, final boolean i) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setImmersive(i);
        }
    }

    void setIntent(final CallVoid1<Intent> superCall, final Intent newIntent) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setIntent(newIntent);
        }
    }

    void setRequestedOrientation(final CallVoid1<Integer> superCall,
            final int requestedOrientation) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setRequestedOrientation(requestedOrientation);
        }
    }

    void setSupportActionBar(final CallVoid1<android.support.v7.widget.Toolbar> superCall,
            @Nullable final android.support.v7.widget.Toolbar toolbar) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setSupportActionBar(toolbar);
        }
    }

    void setSupportProgress(final CallVoid1<Integer> superCall, final int progress) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setSupportProgress(progress);
        }
    }

    void setSupportProgressBarIndeterminate(final CallVoid1<Boolean> superCall,
            final boolean indeterminate) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setSupportProgressBarIndeterminate(indeterminate);
        }
    }

    void setSupportProgressBarIndeterminateVisibility(final CallVoid1<Boolean> superCall,
            final boolean visible) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setSupportProgressBarIndeterminateVisibility(visible);
        }
    }

    void setSupportProgressBarVisibility(final CallVoid1<Boolean> superCall,
            final boolean visible) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setSupportProgressBarVisibility(visible);
        }
    }

    void setTaskDescription(final CallVoid1<ActivityManager.TaskDescription> superCall,
            final ActivityManager.TaskDescription taskDescription) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setTaskDescription(taskDescription);
        }
    }

    void setTheme(final CallVoid1<Integer> superCall, @StyleRes final int resid) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setTheme(resid);
        }
    }

    void setTitle(final CallVoid1<CharSequence> superCall, final CharSequence title) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setTitle(title);
        }
    }

    void setTitle(final CallVoid1<Integer> superCall, final int titleId) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setTitle(titleId);
        }
    }

    void setTitleColor(final CallVoid1<Integer> superCall, final int textColor) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setTitleColor(textColor);
        }
    }

    void setVisible(final CallVoid1<Boolean> superCall, final boolean visible) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setVisible(visible);
        }
    }

    void setWallpaper(final CallVoid1<Bitmap> superCall, final Bitmap bitmap) throws IOException {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setWallpaper(bitmap);
        }
    }

    void setWallpaper(final CallVoid1<InputStream> superCall, final InputStream data)
            throws IOException {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setWallpaper(data);
        }
    }

    boolean shouldShowRequestPermissionRationale(final CallFun1<Boolean, String> superCall,
            final String permission) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return shouldShowRequestPermissionRationale(permission);
        }
    }

    boolean shouldUpRecreateTask(final CallFun1<Boolean, Intent> superCall,
            final Intent targetIntent) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return shouldUpRecreateTask(targetIntent);
        }
    }

    boolean showAssist(final CallFun1<Boolean, Bundle> superCall, final Bundle args) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return showAssist(args);
        }
    }

    void showLockTaskEscapeMessage(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            showLockTaskEscapeMessage();
        }
    }

    android.view.ActionMode startActionMode(
            final CallFun1<android.view.ActionMode, android.view.ActionMode.Callback> superCall,
            final android.view.ActionMode.Callback callback) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return startActionMode(callback);
        }
    }

    android.view.ActionMode startActionMode(
            final CallFun2<android.view.ActionMode, android.view.ActionMode.Callback, Integer> superCall,
            final android.view.ActionMode.Callback callback, final int type) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return startActionMode(callback, type);
        }
    }

    void startActivities(final CallVoid1<Intent[]> superCall, final Intent[] intents) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startActivities(intents);
        }
    }

    void startActivities(final CallVoid2<Intent[], Bundle> superCall, final Intent[] intents,
            final Bundle options) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startActivities(intents, options);
        }
    }

    void startActivity(final CallVoid1<Intent> superCall, final Intent intent) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startActivity(intent);
        }
    }

    void startActivity(final CallVoid2<Intent, Bundle> superCall, final Intent intent,
            final Bundle options) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startActivity(intent, options);
        }
    }

    void startActivityForResult(final CallVoid2<Intent, Integer> superCall, final Intent intent,
            final int requestCode) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startActivityForResult(intent, requestCode);
        }
    }

    void startActivityForResult(final CallVoid3<Intent, Integer, Bundle> superCall,
            final Intent intent, final int requestCode, @Nullable final Bundle options) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startActivityForResult(intent, requestCode, options);
        }
    }

    void startActivityFromChild(final CallVoid3<Activity, Intent, Integer> superCall,
            final Activity child, final Intent intent, final int requestCode) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startActivityFromChild(child, intent, requestCode);
        }
    }

    void startActivityFromChild(final CallVoid4<Activity, Intent, Integer, Bundle> superCall,
            final Activity child, final Intent intent, final int requestCode,
            final Bundle options) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startActivityFromChild(child, intent, requestCode, options);
        }
    }

    void startActivityFromFragment(final CallVoid3<Fragment, Intent, Integer> superCall,
            final Fragment fragment, final Intent intent, final int requestCode) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startActivityFromFragment(fragment, intent, requestCode);
        }
    }

    void startActivityFromFragment(final CallVoid4<Fragment, Intent, Integer, Bundle> superCall,
            final Fragment fragment, final Intent intent, final int requestCode,
            @Nullable final Bundle options) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startActivityFromFragment(fragment, intent, requestCode, options);
        }
    }

    void startActivityFromFragment(final CallVoid3<android.app.Fragment, Intent, Integer> superCall,
            final android.app.Fragment fragment, final Intent intent, final int requestCode) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startActivityFromFragment(fragment, intent, requestCode);
        }
    }

    void startActivityFromFragment(
            final CallVoid4<android.app.Fragment, Intent, Integer, Bundle> superCall,
            final android.app.Fragment fragment, final Intent intent, final int requestCode,
            final Bundle options) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startActivityFromFragment(fragment, intent, requestCode, options);
        }
    }

    boolean startActivityIfNeeded(final CallFun2<Boolean, Intent, Integer> superCall,
            final Intent intent, final int requestCode) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return startActivityIfNeeded(intent, requestCode);
        }
    }

    boolean startActivityIfNeeded(final CallFun3<Boolean, Intent, Integer, Bundle> superCall,
            final Intent intent, final int requestCode, final Bundle options) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return startActivityIfNeeded(intent, requestCode, options);
        }
    }

    boolean startInstrumentation(final CallFun3<Boolean, ComponentName, String, Bundle> superCall,
            final ComponentName className, final String profileFile, final Bundle arguments) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return startInstrumentation(className, profileFile, arguments);
        }
    }

    void startIntentSender(
            final CallVoid5<IntentSender, Intent, Integer, Integer, Integer> superCall,
            final IntentSender intent, final Intent fillInIntent, final int flagsMask,
            final int flagsValues, final int extraFlags) throws IntentSender.SendIntentException {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startIntentSender(intent, fillInIntent, flagsMask, flagsValues, extraFlags);
        }
    }

    void startIntentSender(
            final CallVoid6<IntentSender, Intent, Integer, Integer, Integer, Bundle> superCall,
            final IntentSender intent, final Intent fillInIntent, final int flagsMask,
            final int flagsValues, final int extraFlags, final Bundle options)
            throws IntentSender.SendIntentException {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startIntentSender(intent, fillInIntent, flagsMask, flagsValues, extraFlags, options);
        }
    }

    void startIntentSenderForResult(
            final CallVoid7<IntentSender, Integer, Intent, Integer, Integer, Integer, Bundle> superCall,
            final IntentSender intent, final int requestCode, @Nullable final Intent fillInIntent,
            final int flagsMask, final int flagsValues, final int extraFlags, final Bundle options)
            throws IntentSender.SendIntentException {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues,
                    extraFlags, options);
        }
    }

    void startIntentSenderForResult(
            final CallVoid6<IntentSender, Integer, Intent, Integer, Integer, Integer> superCall,
            final IntentSender intent, final int requestCode, @Nullable final Intent fillInIntent,
            final int flagsMask, final int flagsValues, final int extraFlags)
            throws IntentSender.SendIntentException {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues,
                    extraFlags);
        }
    }

    void startIntentSenderFromChild(
            final CallVoid7<Activity, IntentSender, Integer, Intent, Integer, Integer, Integer> superCall,
            final Activity child, final IntentSender intent, final int requestCode,
            final Intent fillInIntent, final int flagsMask, final int flagsValues,
            final int extraFlags) throws IntentSender.SendIntentException {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startIntentSenderFromChild(child, intent, requestCode, fillInIntent, flagsMask,
                    flagsValues, extraFlags);
        }
    }

    void startIntentSenderFromChild(
            final CallVoid8<Activity, IntentSender, Integer, Intent, Integer, Integer, Integer, Bundle> superCall,
            final Activity child, final IntentSender intent, final int requestCode,
            final Intent fillInIntent, final int flagsMask, final int flagsValues,
            final int extraFlags, final Bundle options) throws IntentSender.SendIntentException {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startIntentSenderFromChild(child, intent, requestCode, fillInIntent, flagsMask,
                    flagsValues, extraFlags, options);
        }
    }

    void startIntentSenderFromFragment(
            final CallVoid8<Fragment, IntentSender, Integer, Intent, Integer, Integer, Integer, Bundle> superCall,
            final Fragment fragment, final IntentSender intent, final int requestCode,
            @Nullable final Intent fillInIntent, final int flagsMask, final int flagsValues,
            final int extraFlags, final Bundle options) throws IntentSender.SendIntentException {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startIntentSenderFromFragment(fragment, intent, requestCode, fillInIntent, flagsMask,
                    flagsValues, extraFlags, options);
        }
    }

    void startLockTask(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startLockTask();
        }
    }

    void startManagingCursor(final CallVoid1<Cursor> superCall, final Cursor c) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startManagingCursor(c);
        }
    }

    boolean startNextMatchingActivity(final CallFun1<Boolean, Intent> superCall,
            final Intent intent) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return startNextMatchingActivity(intent);
        }
    }

    boolean startNextMatchingActivity(final CallFun2<Boolean, Intent, Bundle> superCall,
            final Intent intent, final Bundle options) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return startNextMatchingActivity(intent, options);
        }
    }

    void startPostponedEnterTransition(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startPostponedEnterTransition();
        }
    }

    void startSearch(final CallVoid4<String, Boolean, Bundle, Boolean> superCall,
            final String initialQuery, final boolean selectInitialQuery, final Bundle appSearchData,
            final boolean globalSearch) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startSearch(initialQuery, selectInitialQuery, appSearchData, globalSearch);
        }
    }

    ComponentName startService(final CallFun1<ComponentName, Intent> superCall,
            final Intent service) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return startService(service);
        }
    }

    ActionMode startSupportActionMode(final CallFun1<ActionMode, ActionMode.Callback> superCall,
            @NonNull final ActionMode.Callback callback) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return startSupportActionMode(callback);
        }
    }

    void stopLockTask(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            stopLockTask();
        }
    }

    void stopManagingCursor(final CallVoid1<Cursor> superCall, final Cursor c) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            stopManagingCursor(c);
        }
    }

    boolean stopService(final CallFun1<Boolean, Intent> superCall, final Intent name) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return stopService(name);
        }
    }

    void supportFinishAfterTransition(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            supportFinishAfterTransition();
        }
    }

    void supportInvalidateOptionsMenu(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            supportInvalidateOptionsMenu();
        }
    }

    void supportNavigateUpTo(final CallVoid1<Intent> superCall, @NonNull final Intent upIntent) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            supportNavigateUpTo(upIntent);
        }
    }

    void supportPostponeEnterTransition(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            supportPostponeEnterTransition();
        }
    }

    boolean supportRequestWindowFeature(final CallFun1<Boolean, Integer> superCall,
            final int featureId) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return supportRequestWindowFeature(featureId);
        }
    }

    boolean supportShouldUpRecreateTask(final CallFun1<Boolean, Intent> superCall,
            @NonNull final Intent targetIntent) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return supportShouldUpRecreateTask(targetIntent);
        }
    }

    void supportStartPostponedEnterTransition(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            supportStartPostponedEnterTransition();
        }
    }

    void takeKeyEvents(final CallVoid1<Boolean> superCall, final boolean get) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            takeKeyEvents(get);
        }
    }

    void triggerSearch(final CallVoid2<String, Bundle> superCall, final String query,
            final Bundle appSearchData) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            triggerSearch(query, appSearchData);
        }
    }

    void unbindService(final CallVoid1<ServiceConnection> superCall, final ServiceConnection conn) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            unbindService(conn);
        }
    }

    void unregisterComponentCallbacks(final CallVoid1<ComponentCallbacks> superCall,
            final ComponentCallbacks callback) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            unregisterComponentCallbacks(callback);
        }
    }

    void unregisterForContextMenu(final CallVoid1<View> superCall, final View view) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            unregisterForContextMenu(view);
        }
    }

    void unregisterReceiver(final CallVoid1<BroadcastReceiver> superCall,
            final BroadcastReceiver receiver) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            unregisterReceiver(receiver);
        }
    }
}