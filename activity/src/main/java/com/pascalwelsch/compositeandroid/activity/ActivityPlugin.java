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
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;


@SuppressWarnings("unused")
public class ActivityPlugin extends ActivityPluginBase {


    public void addContentView(final View view, final ViewGroup.LayoutParams params) {
        if (mSuperListener != null) {
            mSuperListener.call(view, params);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.addContentView(view, params);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void applyOverrideConfiguration(final Configuration overrideConfiguration) {
        if (mSuperListener != null) {
            mSuperListener.call(overrideConfiguration);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.applyOverrideConfiguration(overrideConfiguration);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void attachBaseContext(final Context newBase) {
        if (mSuperListener != null) {
            mSuperListener.call(newBase);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.attachBaseContext(newBase);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public boolean bindService(final Intent service, final ServiceConnection conn,
            final int flags) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(service, conn, flags);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .bindService(service, conn, flags);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public int checkCallingOrSelfPermission(final String permission) {
        if (mSuperListener != null) {
            return (Integer) mSuperListener.call(permission);
        } else {
            mActivityDelegate.callingPlugin(this);
            final int result = mActivityDelegate
                    .checkCallingOrSelfPermission(permission);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public int checkCallingOrSelfUriPermission(final Uri uri, final int modeFlags) {
        if (mSuperListener != null) {
            return (Integer) mSuperListener.call(uri, modeFlags);
        } else {
            mActivityDelegate.callingPlugin(this);
            final int result = mActivityDelegate
                    .checkCallingOrSelfUriPermission(uri, modeFlags);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public int checkCallingPermission(final String permission) {
        if (mSuperListener != null) {
            return (Integer) mSuperListener.call(permission);
        } else {
            mActivityDelegate.callingPlugin(this);
            final int result = mActivityDelegate
                    .checkCallingPermission(permission);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public int checkCallingUriPermission(final Uri uri, final int modeFlags) {
        if (mSuperListener != null) {
            return (Integer) mSuperListener.call(uri, modeFlags);
        } else {
            mActivityDelegate.callingPlugin(this);
            final int result = mActivityDelegate
                    .checkCallingUriPermission(uri, modeFlags);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public int checkPermission(final String permission, final int pid, final int uid) {
        if (mSuperListener != null) {
            return (Integer) mSuperListener.call(permission, pid, uid);
        } else {
            mActivityDelegate.callingPlugin(this);
            final int result = mActivityDelegate
                    .checkPermission(permission, pid, uid);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public int checkSelfPermission(final String permission) {
        if (mSuperListener != null) {
            return (Integer) mSuperListener.call(permission);
        } else {
            mActivityDelegate.callingPlugin(this);
            final int result = mActivityDelegate
                    .checkSelfPermission(permission);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public int checkUriPermission(final Uri uri, final int pid, final int uid,
            final int modeFlags) {
        if (mSuperListener != null) {
            return (Integer) mSuperListener.call(uri, pid, uid, modeFlags);
        } else {
            mActivityDelegate.callingPlugin(this);
            final int result = mActivityDelegate
                    .checkUriPermission(uri, pid, uid, modeFlags);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public int checkUriPermission(final Uri uri, final String readPermission,
            final String writePermission, final int pid, final int uid, final int modeFlags) {
        if (mSuperListener != null) {
            return (Integer) mSuperListener
                    .call(uri, readPermission, writePermission, pid, uid, modeFlags);
        } else {
            mActivityDelegate.callingPlugin(this);
            final int result = mActivityDelegate
                    .checkUriPermission(uri, readPermission, writePermission, pid, uid, modeFlags);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public void clearWallpaper() throws IOException {
        if (mSuperListener != null) {
            mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            try {
                mActivityDelegate.clearWallpaper();
            } catch (SuppressedException e) {
                throw (IOException) e.getCause();
            }
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void closeContextMenu() {
        if (mSuperListener != null) {
            mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.closeContextMenu();
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void closeOptionsMenu() {
        if (mSuperListener != null) {
            mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.closeOptionsMenu();
            mActivityDelegate.callingPlugin(null);
        }
    }

    public Context createConfigurationContext(final Configuration overrideConfiguration) {
        if (mSuperListener != null) {
            return (Context) mSuperListener.call(overrideConfiguration);
        } else {
            mActivityDelegate.callingPlugin(this);
            final Context result = mActivityDelegate
                    .createConfigurationContext(overrideConfiguration);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public Context createDisplayContext(final Display display) {
        if (mSuperListener != null) {
            return (Context) mSuperListener.call(display);
        } else {
            mActivityDelegate.callingPlugin(this);
            final Context result = mActivityDelegate
                    .createDisplayContext(display);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public Context createPackageContext(final String packageName, final int flags) {
        if (mSuperListener != null) {
            return (Context) mSuperListener.call(packageName, flags);
        } else {
            mActivityDelegate.callingPlugin(this);
            final Context result = mActivityDelegate
                    .createPackageContext(packageName, flags);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public PendingIntent createPendingResult(final int requestCode, @NonNull final Intent data,
            final int flags) {
        if (mSuperListener != null) {
            return (PendingIntent) mSuperListener.call(requestCode, data, flags);
        } else {
            mActivityDelegate.callingPlugin(this);
            final PendingIntent result = mActivityDelegate
                    .createPendingResult(requestCode, data, flags);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public String[] databaseList() {
        if (mSuperListener != null) {
            return (String[]) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final String[] result = mActivityDelegate
                    .databaseList();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public boolean deleteDatabase(final String name) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(name);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .deleteDatabase(name);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public boolean deleteFile(final String name) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(name);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .deleteFile(name);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public boolean dispatchGenericMotionEvent(final MotionEvent ev) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(ev);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .dispatchGenericMotionEvent(ev);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public boolean dispatchKeyEvent(final KeyEvent event) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(event);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .dispatchKeyEvent(event);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public boolean dispatchKeyShortcutEvent(final KeyEvent event) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(event);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .dispatchKeyShortcutEvent(event);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent event) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(event);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .dispatchPopulateAccessibilityEvent(event);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public boolean dispatchTouchEvent(final MotionEvent ev) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(ev);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .dispatchTouchEvent(ev);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public boolean dispatchTrackballEvent(final MotionEvent ev) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(ev);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .dispatchTrackballEvent(ev);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public void dump(final String prefix, final FileDescriptor fd, final PrintWriter writer,
            final String[] args) {
        if (mSuperListener != null) {
            mSuperListener.call(prefix, fd, writer, args);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.dump(prefix, fd, writer, args);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void enforceCallingOrSelfPermission(final String permission, final String message) {
        if (mSuperListener != null) {
            mSuperListener.call(permission, message);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.enforceCallingOrSelfPermission(permission, message);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void enforceCallingOrSelfUriPermission(final Uri uri, final int modeFlags,
            final String message) {
        if (mSuperListener != null) {
            mSuperListener.call(uri, modeFlags, message);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.enforceCallingOrSelfUriPermission(uri, modeFlags, message);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void enforceCallingPermission(final String permission, final String message) {
        if (mSuperListener != null) {
            mSuperListener.call(permission, message);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.enforceCallingPermission(permission, message);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void enforceCallingUriPermission(final Uri uri, final int modeFlags,
            final String message) {
        if (mSuperListener != null) {
            mSuperListener.call(uri, modeFlags, message);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.enforceCallingUriPermission(uri, modeFlags, message);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void enforcePermission(final String permission, final int pid, final int uid,
            final String message) {
        if (mSuperListener != null) {
            mSuperListener.call(permission, pid, uid, message);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.enforcePermission(permission, pid, uid, message);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void enforceUriPermission(final Uri uri, final int pid, final int uid,
            final int modeFlags, final String message) {
        if (mSuperListener != null) {
            mSuperListener.call(uri, pid, uid, modeFlags, message);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.enforceUriPermission(uri, pid, uid, modeFlags, message);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void enforceUriPermission(final Uri uri, final String readPermission,
            final String writePermission, final int pid, final int uid, final int modeFlags,
            final String message) {
        if (mSuperListener != null) {
            mSuperListener.call(uri, readPermission, writePermission, pid, uid, modeFlags, message);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate
                    .enforceUriPermission(uri, readPermission, writePermission, pid, uid, modeFlags,
                            message);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public String[] fileList() {
        if (mSuperListener != null) {
            return (String[]) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final String[] result = mActivityDelegate
                    .fileList();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public View findViewById(@IdRes final int id) {
        if (mSuperListener != null) {
            return (View) mSuperListener.call(id);
        } else {
            mActivityDelegate.callingPlugin(this);
            final View result = mActivityDelegate
                    .findViewById(id);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public void finish() {
        if (mSuperListener != null) {
            mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.finish();
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void finishActivity(final int requestCode) {
        if (mSuperListener != null) {
            mSuperListener.call(requestCode);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.finishActivity(requestCode);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void finishActivityFromChild(@NonNull final Activity child, final int requestCode) {
        if (mSuperListener != null) {
            mSuperListener.call(child, requestCode);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.finishActivityFromChild(child, requestCode);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void finishAffinity() {
        if (mSuperListener != null) {
            mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.finishAffinity();
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void finishAfterTransition() {
        if (mSuperListener != null) {
            mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.finishAfterTransition();
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void finishAndRemoveTask() {
        if (mSuperListener != null) {
            mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.finishAndRemoveTask();
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void finishFromChild(final Activity child) {
        if (mSuperListener != null) {
            mSuperListener.call(child);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.finishFromChild(child);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public android.app.ActionBar getActionBar() {
        if (mSuperListener != null) {
            return (android.app.ActionBar) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final android.app.ActionBar result = mActivityDelegate
                    .getActionBar();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public Context getApplicationContext() {
        if (mSuperListener != null) {
            return (Context) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final Context result = mActivityDelegate
                    .getApplicationContext();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public ApplicationInfo getApplicationInfo() {
        if (mSuperListener != null) {
            return (ApplicationInfo) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final ApplicationInfo result = mActivityDelegate
                    .getApplicationInfo();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public AssetManager getAssets() {
        if (mSuperListener != null) {
            return (AssetManager) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final AssetManager result = mActivityDelegate
                    .getAssets();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public Context getBaseContext() {
        if (mSuperListener != null) {
            return (Context) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final Context result = mActivityDelegate
                    .getBaseContext();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public File getCacheDir() {
        if (mSuperListener != null) {
            return (File) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final File result = mActivityDelegate
                    .getCacheDir();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public ComponentName getCallingActivity() {
        if (mSuperListener != null) {
            return (ComponentName) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final ComponentName result = mActivityDelegate
                    .getCallingActivity();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public String getCallingPackage() {
        if (mSuperListener != null) {
            return (String) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final String result = mActivityDelegate
                    .getCallingPackage();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public int getChangingConfigurations() {
        if (mSuperListener != null) {
            return (Integer) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final int result = mActivityDelegate
                    .getChangingConfigurations();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public ClassLoader getClassLoader() {
        if (mSuperListener != null) {
            return (ClassLoader) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final ClassLoader result = mActivityDelegate
                    .getClassLoader();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public File getCodeCacheDir() {
        if (mSuperListener != null) {
            return (File) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final File result = mActivityDelegate
                    .getCodeCacheDir();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public ComponentName getComponentName() {
        if (mSuperListener != null) {
            return (ComponentName) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final ComponentName result = mActivityDelegate
                    .getComponentName();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public ContentResolver getContentResolver() {
        if (mSuperListener != null) {
            return (ContentResolver) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final ContentResolver result = mActivityDelegate
                    .getContentResolver();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public Scene getContentScene() {
        if (mSuperListener != null) {
            return (Scene) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final Scene result = mActivityDelegate
                    .getContentScene();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public TransitionManager getContentTransitionManager() {
        if (mSuperListener != null) {
            return (TransitionManager) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final TransitionManager result = mActivityDelegate
                    .getContentTransitionManager();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public View getCurrentFocus() {
        if (mSuperListener != null) {
            return (View) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final View result = mActivityDelegate
                    .getCurrentFocus();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public File getDatabasePath(final String name) {
        if (mSuperListener != null) {
            return (File) mSuperListener.call(name);
        } else {
            mActivityDelegate.callingPlugin(this);
            final File result = mActivityDelegate
                    .getDatabasePath(name);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public AppCompatDelegate getDelegate() {
        if (mSuperListener != null) {
            return (AppCompatDelegate) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final AppCompatDelegate result = mActivityDelegate
                    .getDelegate();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public File getDir(final String name, final int mode) {
        if (mSuperListener != null) {
            return (File) mSuperListener.call(name, mode);
        } else {
            mActivityDelegate.callingPlugin(this);
            final File result = mActivityDelegate
                    .getDir(name, mode);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public ActionBarDrawerToggle.Delegate getDrawerToggleDelegate() {
        if (mSuperListener != null) {
            return (ActionBarDrawerToggle.Delegate) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final ActionBarDrawerToggle.Delegate result = mActivityDelegate
                    .getDrawerToggleDelegate();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public File getExternalCacheDir() {
        if (mSuperListener != null) {
            return (File) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final File result = mActivityDelegate
                    .getExternalCacheDir();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public File[] getExternalCacheDirs() {
        if (mSuperListener != null) {
            return (File[]) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final File[] result = mActivityDelegate
                    .getExternalCacheDirs();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public File getExternalFilesDir(final String type) {
        if (mSuperListener != null) {
            return (File) mSuperListener.call(type);
        } else {
            mActivityDelegate.callingPlugin(this);
            final File result = mActivityDelegate
                    .getExternalFilesDir(type);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public File[] getExternalFilesDirs(final String type) {
        if (mSuperListener != null) {
            return (File[]) mSuperListener.call(type);
        } else {
            mActivityDelegate.callingPlugin(this);
            final File[] result = mActivityDelegate
                    .getExternalFilesDirs(type);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public File[] getExternalMediaDirs() {
        if (mSuperListener != null) {
            return (File[]) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final File[] result = mActivityDelegate
                    .getExternalMediaDirs();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public File getFileStreamPath(final String name) {
        if (mSuperListener != null) {
            return (File) mSuperListener.call(name);
        } else {
            mActivityDelegate.callingPlugin(this);
            final File result = mActivityDelegate
                    .getFileStreamPath(name);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public File getFilesDir() {
        if (mSuperListener != null) {
            return (File) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final File result = mActivityDelegate
                    .getFilesDir();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public android.app.FragmentManager getFragmentManager() {
        if (mSuperListener != null) {
            return (android.app.FragmentManager) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final android.app.FragmentManager result = mActivityDelegate
                    .getFragmentManager();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public Intent getIntent() {
        if (mSuperListener != null) {
            return (Intent) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final Intent result = mActivityDelegate
                    .getIntent();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public LayoutInflater getLayoutInflater() {
        if (mSuperListener != null) {
            return (LayoutInflater) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final LayoutInflater result = mActivityDelegate
                    .getLayoutInflater();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public android.app.LoaderManager getLoaderManager() {
        if (mSuperListener != null) {
            return (android.app.LoaderManager) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final android.app.LoaderManager result = mActivityDelegate
                    .getLoaderManager();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public String getLocalClassName() {
        if (mSuperListener != null) {
            return (String) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final String result = mActivityDelegate
                    .getLocalClassName();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public Looper getMainLooper() {
        if (mSuperListener != null) {
            return (Looper) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final Looper result = mActivityDelegate
                    .getMainLooper();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public MenuInflater getMenuInflater() {
        if (mSuperListener != null) {
            return (MenuInflater) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final MenuInflater result = mActivityDelegate
                    .getMenuInflater();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public File getNoBackupFilesDir() {
        if (mSuperListener != null) {
            return (File) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final File result = mActivityDelegate
                    .getNoBackupFilesDir();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public File getObbDir() {
        if (mSuperListener != null) {
            return (File) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final File result = mActivityDelegate
                    .getObbDir();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public File[] getObbDirs() {
        if (mSuperListener != null) {
            return (File[]) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final File[] result = mActivityDelegate
                    .getObbDirs();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public String getPackageCodePath() {
        if (mSuperListener != null) {
            return (String) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final String result = mActivityDelegate
                    .getPackageCodePath();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public PackageManager getPackageManager() {
        if (mSuperListener != null) {
            return (PackageManager) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final PackageManager result = mActivityDelegate
                    .getPackageManager();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public String getPackageName() {
        if (mSuperListener != null) {
            return (String) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final String result = mActivityDelegate
                    .getPackageName();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public String getPackageResourcePath() {
        if (mSuperListener != null) {
            return (String) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final String result = mActivityDelegate
                    .getPackageResourcePath();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public Intent getParentActivityIntent() {
        if (mSuperListener != null) {
            return (Intent) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final Intent result = mActivityDelegate
                    .getParentActivityIntent();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public SharedPreferences getPreferences(final int mode) {
        if (mSuperListener != null) {
            return (SharedPreferences) mSuperListener.call(mode);
        } else {
            mActivityDelegate.callingPlugin(this);
            final SharedPreferences result = mActivityDelegate
                    .getPreferences(mode);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public Uri getReferrer() {
        if (mSuperListener != null) {
            return (Uri) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final Uri result = mActivityDelegate
                    .getReferrer();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public int getRequestedOrientation() {
        if (mSuperListener != null) {
            return (Integer) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final int result = mActivityDelegate
                    .getRequestedOrientation();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public Resources getResources() {
        if (mSuperListener != null) {
            return (Resources) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final Resources result = mActivityDelegate
                    .getResources();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public SharedPreferences getSharedPreferences(final String name, final int mode) {
        if (mSuperListener != null) {
            return (SharedPreferences) mSuperListener.call(name, mode);
        } else {
            mActivityDelegate.callingPlugin(this);
            final SharedPreferences result = mActivityDelegate
                    .getSharedPreferences(name, mode);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public ActionBar getSupportActionBar() {
        if (mSuperListener != null) {
            return (ActionBar) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final ActionBar result = mActivityDelegate
                    .getSupportActionBar();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public FragmentManager getSupportFragmentManager() {
        if (mSuperListener != null) {
            return (FragmentManager) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final FragmentManager result = mActivityDelegate
                    .getSupportFragmentManager();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public LoaderManager getSupportLoaderManager() {
        if (mSuperListener != null) {
            return (LoaderManager) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final LoaderManager result = mActivityDelegate
                    .getSupportLoaderManager();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public Intent getSupportParentActivityIntent() {
        if (mSuperListener != null) {
            return (Intent) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final Intent result = mActivityDelegate
                    .getSupportParentActivityIntent();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public Object getSystemService(@NonNull final String name) {
        if (mSuperListener != null) {
            return (Object) mSuperListener.call(name);
        } else {
            mActivityDelegate.callingPlugin(this);
            final Object result = mActivityDelegate
                    .getSystemService(name);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public String getSystemServiceName(final Class<?> serviceClass) {
        if (mSuperListener != null) {
            return (String) mSuperListener.call(serviceClass);
        } else {
            mActivityDelegate.callingPlugin(this);
            final String result = mActivityDelegate
                    .getSystemServiceName(serviceClass);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public int getTaskId() {
        if (mSuperListener != null) {
            return (Integer) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final int result = mActivityDelegate
                    .getTaskId();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public Resources.Theme getTheme() {
        if (mSuperListener != null) {
            return (Resources.Theme) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final Resources.Theme result = mActivityDelegate
                    .getTheme();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public VoiceInteractor getVoiceInteractor() {
        if (mSuperListener != null) {
            return (VoiceInteractor) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final VoiceInteractor result = mActivityDelegate
                    .getVoiceInteractor();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public Drawable getWallpaper() {
        if (mSuperListener != null) {
            return (Drawable) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final Drawable result = mActivityDelegate
                    .getWallpaper();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public int getWallpaperDesiredMinimumHeight() {
        if (mSuperListener != null) {
            return (Integer) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final int result = mActivityDelegate
                    .getWallpaperDesiredMinimumHeight();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public int getWallpaperDesiredMinimumWidth() {
        if (mSuperListener != null) {
            return (Integer) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final int result = mActivityDelegate
                    .getWallpaperDesiredMinimumWidth();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public Window getWindow() {
        if (mSuperListener != null) {
            return (Window) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final Window result = mActivityDelegate
                    .getWindow();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public WindowManager getWindowManager() {
        if (mSuperListener != null) {
            return (WindowManager) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final WindowManager result = mActivityDelegate
                    .getWindowManager();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public void grantUriPermission(final String toPackage, final Uri uri, final int modeFlags) {
        if (mSuperListener != null) {
            mSuperListener.call(toPackage, uri, modeFlags);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.grantUriPermission(toPackage, uri, modeFlags);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public boolean hasWindowFocus() {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .hasWindowFocus();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public void invalidateOptionsMenu() {
        if (mSuperListener != null) {
            mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.invalidateOptionsMenu();
            mActivityDelegate.callingPlugin(null);
        }
    }

    public boolean isChangingConfigurations() {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .isChangingConfigurations();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public boolean isDestroyed() {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .isDestroyed();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public boolean isFinishing() {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .isFinishing();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public boolean isImmersive() {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .isImmersive();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public boolean isRestricted() {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .isRestricted();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public boolean isTaskRoot() {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .isTaskRoot();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public boolean isVoiceInteraction() {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .isVoiceInteraction();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public boolean isVoiceInteractionRoot() {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .isVoiceInteractionRoot();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public boolean moveTaskToBack(final boolean nonRoot) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(nonRoot);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .moveTaskToBack(nonRoot);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public boolean navigateUpTo(final Intent upIntent) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(upIntent);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .navigateUpTo(upIntent);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public boolean navigateUpToFromChild(final Activity child, final Intent upIntent) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(child, upIntent);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .navigateUpToFromChild(child, upIntent);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public void onActionModeFinished(final android.view.ActionMode mode) {
        if (mSuperListener != null) {
            mSuperListener.call(mode);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onActionModeFinished(mode);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onActionModeStarted(final android.view.ActionMode mode) {
        if (mSuperListener != null) {
            mSuperListener.call(mode);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onActionModeStarted(mode);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onActivityReenter(final int resultCode, final Intent data) {
        if (mSuperListener != null) {
            mSuperListener.call(resultCode, data);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onActivityReenter(resultCode, data);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        if (mSuperListener != null) {
            mSuperListener.call(requestCode, resultCode, data);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onActivityResult(requestCode, resultCode, data);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onApplyThemeResource(final Resources.Theme theme, final int resid,
            final boolean first) {
        if (mSuperListener != null) {
            mSuperListener.call(theme, resid, first);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onApplyThemeResource(theme, resid, first);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onAttachFragment(final Fragment fragment) {
        if (mSuperListener != null) {
            mSuperListener.call(fragment);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onAttachFragment(fragment);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onAttachFragment(final android.app.Fragment fragment) {
        if (mSuperListener != null) {
            mSuperListener.call(fragment);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onAttachFragment(fragment);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onAttachedToWindow() {
        if (mSuperListener != null) {
            mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onAttachedToWindow();
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onBackPressed() {
        if (mSuperListener != null) {
            mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onBackPressed();
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onChildTitleChanged(final Activity childActivity, final CharSequence title) {
        if (mSuperListener != null) {
            mSuperListener.call(childActivity, title);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onChildTitleChanged(childActivity, title);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onConfigurationChanged(final Configuration newConfig) {
        if (mSuperListener != null) {
            mSuperListener.call(newConfig);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onConfigurationChanged(newConfig);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onContentChanged() {
        if (mSuperListener != null) {
            mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onContentChanged();
            mActivityDelegate.callingPlugin(null);
        }
    }

    public boolean onContextItemSelected(final MenuItem item) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(item);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .onContextItemSelected(item);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public void onContextMenuClosed(final Menu menu) {
        if (mSuperListener != null) {
            mSuperListener.call(menu);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onContextMenuClosed(menu);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onCreate(@Nullable final Bundle savedInstanceState) {
        if (mSuperListener != null) {
            mSuperListener.call(savedInstanceState);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onCreate(savedInstanceState);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onCreate(final Bundle savedInstanceState, final PersistableBundle persistentState) {
        if (mSuperListener != null) {
            mSuperListener.call(savedInstanceState, persistentState);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onCreate(savedInstanceState, persistentState);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onCreateContextMenu(final ContextMenu menu, final View v,
            final ContextMenu.ContextMenuInfo menuInfo) {
        if (mSuperListener != null) {
            mSuperListener.call(menu, v, menuInfo);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onCreateContextMenu(menu, v, menuInfo);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public CharSequence onCreateDescription() {
        if (mSuperListener != null) {
            return (CharSequence) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final CharSequence result = mActivityDelegate
                    .onCreateDescription();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public Dialog onCreateDialog(final int id) {
        if (mSuperListener != null) {
            return (Dialog) mSuperListener.call(id);
        } else {
            mActivityDelegate.callingPlugin(this);
            final Dialog result = mActivityDelegate
                    .onCreateDialog(id);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public Dialog onCreateDialog(final int id, final Bundle args) {
        if (mSuperListener != null) {
            return (Dialog) mSuperListener.call(id, args);
        } else {
            mActivityDelegate.callingPlugin(this);
            final Dialog result = mActivityDelegate
                    .onCreateDialog(id, args);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public void onCreateNavigateUpTaskStack(final TaskStackBuilder builder) {
        if (mSuperListener != null) {
            mSuperListener.call(builder);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onCreateNavigateUpTaskStack(builder);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public boolean onCreateOptionsMenu(final Menu menu) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(menu);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .onCreateOptionsMenu(menu);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public boolean onCreatePanelMenu(final int featureId, final Menu menu) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(featureId, menu);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .onCreatePanelMenu(featureId, menu);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public View onCreatePanelView(final int featureId) {
        if (mSuperListener != null) {
            return (View) mSuperListener.call(featureId);
        } else {
            mActivityDelegate.callingPlugin(this);
            final View result = mActivityDelegate
                    .onCreatePanelView(featureId);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public void onCreateSupportNavigateUpTaskStack(
            @NonNull final android.support.v4.app.TaskStackBuilder builder) {
        if (mSuperListener != null) {
            mSuperListener.call(builder);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onCreateSupportNavigateUpTaskStack(builder);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public boolean onCreateThumbnail(final Bitmap outBitmap, final Canvas canvas) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(outBitmap, canvas);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .onCreateThumbnail(outBitmap, canvas);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public View onCreateView(final View parent, final String name, final Context context,
            final AttributeSet attrs) {
        if (mSuperListener != null) {
            return (View) mSuperListener.call(parent, name, context, attrs);
        } else {
            mActivityDelegate.callingPlugin(this);
            final View result = mActivityDelegate
                    .onCreateView(parent, name, context, attrs);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public View onCreateView(final String name, final Context context, final AttributeSet attrs) {
        if (mSuperListener != null) {
            return (View) mSuperListener.call(name, context, attrs);
        } else {
            mActivityDelegate.callingPlugin(this);
            final View result = mActivityDelegate
                    .onCreateView(name, context, attrs);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public void onDestroy() {
        if (mSuperListener != null) {
            mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onDestroy();
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onDetachedFromWindow() {
        if (mSuperListener != null) {
            mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onDetachedFromWindow();
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onEnterAnimationComplete() {
        if (mSuperListener != null) {
            mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onEnterAnimationComplete();
            mActivityDelegate.callingPlugin(null);
        }
    }

    public boolean onGenericMotionEvent(final MotionEvent event) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(event);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .onGenericMotionEvent(event);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public boolean onKeyDown(final int keyCode, final KeyEvent event) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(keyCode, event);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .onKeyDown(keyCode, event);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public boolean onKeyLongPress(final int keyCode, final KeyEvent event) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(keyCode, event);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .onKeyLongPress(keyCode, event);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public boolean onKeyMultiple(final int keyCode, final int repeatCount, final KeyEvent event) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(keyCode, repeatCount, event);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .onKeyMultiple(keyCode, repeatCount, event);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public boolean onKeyShortcut(final int keyCode, final KeyEvent event) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(keyCode, event);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .onKeyShortcut(keyCode, event);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public boolean onKeyUp(final int keyCode, final KeyEvent event) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(keyCode, event);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .onKeyUp(keyCode, event);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public void onLowMemory() {
        if (mSuperListener != null) {
            mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onLowMemory();
            mActivityDelegate.callingPlugin(null);
        }
    }

    public boolean onMenuOpened(final int featureId, final Menu menu) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(featureId, menu);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .onMenuOpened(featureId, menu);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public boolean onNavigateUp() {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .onNavigateUp();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public boolean onNavigateUpFromChild(final Activity child) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(child);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .onNavigateUpFromChild(child);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public void onNewIntent(final Intent intent) {
        if (mSuperListener != null) {
            mSuperListener.call(intent);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onNewIntent(intent);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public boolean onOptionsItemSelected(final MenuItem item) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(item);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .onOptionsItemSelected(item);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public void onOptionsMenuClosed(final Menu menu) {
        if (mSuperListener != null) {
            mSuperListener.call(menu);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onOptionsMenuClosed(menu);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onPanelClosed(final int featureId, final Menu menu) {
        if (mSuperListener != null) {
            mSuperListener.call(featureId, menu);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onPanelClosed(featureId, menu);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onPause() {
        if (mSuperListener != null) {
            mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onPause();
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onPostCreate(@Nullable final Bundle savedInstanceState) {
        if (mSuperListener != null) {
            mSuperListener.call(savedInstanceState);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onPostCreate(savedInstanceState);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onPostCreate(final Bundle savedInstanceState,
            final PersistableBundle persistentState) {
        if (mSuperListener != null) {
            mSuperListener.call(savedInstanceState, persistentState);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onPostCreate(savedInstanceState, persistentState);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onPostResume() {
        if (mSuperListener != null) {
            mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onPostResume();
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onPrepareDialog(final int id, final Dialog dialog) {
        if (mSuperListener != null) {
            mSuperListener.call(id, dialog);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onPrepareDialog(id, dialog);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onPrepareDialog(final int id, final Dialog dialog, final Bundle args) {
        if (mSuperListener != null) {
            mSuperListener.call(id, dialog, args);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onPrepareDialog(id, dialog, args);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onPrepareNavigateUpTaskStack(final TaskStackBuilder builder) {
        if (mSuperListener != null) {
            mSuperListener.call(builder);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onPrepareNavigateUpTaskStack(builder);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public boolean onPrepareOptionsMenu(final Menu menu) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(menu);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .onPrepareOptionsMenu(menu);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public boolean onPrepareOptionsPanel(final View view, final Menu menu) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(view, menu);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .onPrepareOptionsPanel(view, menu);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public boolean onPreparePanel(final int featureId, final View view, final Menu menu) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(featureId, view, menu);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .onPreparePanel(featureId, view, menu);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public void onPrepareSupportNavigateUpTaskStack(
            @NonNull final android.support.v4.app.TaskStackBuilder builder) {
        if (mSuperListener != null) {
            mSuperListener.call(builder);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onPrepareSupportNavigateUpTaskStack(builder);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onProvideAssistContent(final AssistContent outContent) {
        if (mSuperListener != null) {
            mSuperListener.call(outContent);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onProvideAssistContent(outContent);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onProvideAssistData(final Bundle data) {
        if (mSuperListener != null) {
            mSuperListener.call(data);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onProvideAssistData(data);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public Uri onProvideReferrer() {
        if (mSuperListener != null) {
            return (Uri) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final Uri result = mActivityDelegate
                    .onProvideReferrer();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public void onRequestPermissionsResult(final int requestCode,
            @NonNull final String[] permissions, @NonNull final int[] grantResults) {
        if (mSuperListener != null) {
            mSuperListener.call(requestCode, permissions, grantResults);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onRequestPermissionsResult(requestCode, permissions, grantResults);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onRestart() {
        if (mSuperListener != null) {
            mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onRestart();
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onRestoreInstanceState(final Bundle savedInstanceState) {
        if (mSuperListener != null) {
            mSuperListener.call(savedInstanceState);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onRestoreInstanceState(savedInstanceState);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onRestoreInstanceState(final Bundle savedInstanceState,
            final PersistableBundle persistentState) {
        if (mSuperListener != null) {
            mSuperListener.call(savedInstanceState, persistentState);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onRestoreInstanceState(savedInstanceState, persistentState);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onResume() {
        if (mSuperListener != null) {
            mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onResume();
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onResumeFragments() {
        if (mSuperListener != null) {
            mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onResumeFragments();
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onSaveInstanceState(final Bundle outState) {
        if (mSuperListener != null) {
            mSuperListener.call(outState);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onSaveInstanceState(outState);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onSaveInstanceState(final Bundle outState,
            final PersistableBundle outPersistentState) {
        if (mSuperListener != null) {
            mSuperListener.call(outState, outPersistentState);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onSaveInstanceState(outState, outPersistentState);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public boolean onSearchRequested(final SearchEvent searchEvent) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(searchEvent);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .onSearchRequested(searchEvent);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public boolean onSearchRequested() {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .onSearchRequested();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public void onStart() {
        if (mSuperListener != null) {
            mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onStart();
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onStateNotSaved() {
        if (mSuperListener != null) {
            mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onStateNotSaved();
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onStop() {
        if (mSuperListener != null) {
            mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onStop();
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onSupportActionModeFinished(@NonNull final ActionMode mode) {
        if (mSuperListener != null) {
            mSuperListener.call(mode);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onSupportActionModeFinished(mode);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onSupportActionModeStarted(@NonNull final ActionMode mode) {
        if (mSuperListener != null) {
            mSuperListener.call(mode);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onSupportActionModeStarted(mode);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onSupportContentChanged() {
        if (mSuperListener != null) {
            mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onSupportContentChanged();
            mActivityDelegate.callingPlugin(null);
        }
    }

    public boolean onSupportNavigateUp() {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .onSupportNavigateUp();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public void onTitleChanged(final CharSequence title, final int color) {
        if (mSuperListener != null) {
            mSuperListener.call(title, color);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onTitleChanged(title, color);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public boolean onTouchEvent(final MotionEvent event) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(event);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .onTouchEvent(event);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public boolean onTrackballEvent(final MotionEvent event) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(event);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .onTrackballEvent(event);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public void onTrimMemory(final int level) {
        if (mSuperListener != null) {
            mSuperListener.call(level);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onTrimMemory(level);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onUserInteraction() {
        if (mSuperListener != null) {
            mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onUserInteraction();
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onUserLeaveHint() {
        if (mSuperListener != null) {
            mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onUserLeaveHint();
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onVisibleBehindCanceled() {
        if (mSuperListener != null) {
            mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onVisibleBehindCanceled();
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onWindowAttributesChanged(final WindowManager.LayoutParams params) {
        if (mSuperListener != null) {
            mSuperListener.call(params);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onWindowAttributesChanged(params);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void onWindowFocusChanged(final boolean hasFocus) {
        if (mSuperListener != null) {
            mSuperListener.call(hasFocus);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.onWindowFocusChanged(hasFocus);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public android.view.ActionMode onWindowStartingActionMode(
            final android.view.ActionMode.Callback callback) {
        if (mSuperListener != null) {
            return (android.view.ActionMode) mSuperListener.call(callback);
        } else {
            mActivityDelegate.callingPlugin(this);
            final android.view.ActionMode result = mActivityDelegate
                    .onWindowStartingActionMode(callback);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public android.view.ActionMode onWindowStartingActionMode(
            final android.view.ActionMode.Callback callback, final int type) {
        if (mSuperListener != null) {
            return (android.view.ActionMode) mSuperListener.call(callback, type);
        } else {
            mActivityDelegate.callingPlugin(this);
            final android.view.ActionMode result = mActivityDelegate
                    .onWindowStartingActionMode(callback, type);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public ActionMode onWindowStartingSupportActionMode(
            @NonNull final ActionMode.Callback callback) {
        if (mSuperListener != null) {
            return (ActionMode) mSuperListener.call(callback);
        } else {
            mActivityDelegate.callingPlugin(this);
            final ActionMode result = mActivityDelegate
                    .onWindowStartingSupportActionMode(callback);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public void openContextMenu(final View view) {
        if (mSuperListener != null) {
            mSuperListener.call(view);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.openContextMenu(view);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public FileInputStream openFileInput(final String name) {
        if (mSuperListener != null) {
            return (FileInputStream) mSuperListener.call(name);
        } else {
            mActivityDelegate.callingPlugin(this);
            final FileInputStream result = mActivityDelegate
                    .openFileInput(name);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public FileOutputStream openFileOutput(final String name, final int mode) {
        if (mSuperListener != null) {
            return (FileOutputStream) mSuperListener.call(name, mode);
        } else {
            mActivityDelegate.callingPlugin(this);
            final FileOutputStream result = mActivityDelegate
                    .openFileOutput(name, mode);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public void openOptionsMenu() {
        if (mSuperListener != null) {
            mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.openOptionsMenu();
            mActivityDelegate.callingPlugin(null);
        }
    }

    public SQLiteDatabase openOrCreateDatabase(final String name, final int mode,
            final SQLiteDatabase.CursorFactory factory) {
        if (mSuperListener != null) {
            return (SQLiteDatabase) mSuperListener.call(name, mode, factory);
        } else {
            mActivityDelegate.callingPlugin(this);
            final SQLiteDatabase result = mActivityDelegate
                    .openOrCreateDatabase(name, mode, factory);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public SQLiteDatabase openOrCreateDatabase(final String name, final int mode,
            final SQLiteDatabase.CursorFactory factory, final DatabaseErrorHandler errorHandler) {
        if (mSuperListener != null) {
            return (SQLiteDatabase) mSuperListener.call(name, mode, factory, errorHandler);
        } else {
            mActivityDelegate.callingPlugin(this);
            final SQLiteDatabase result = mActivityDelegate
                    .openOrCreateDatabase(name, mode, factory, errorHandler);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public void overridePendingTransition(final int enterAnim, final int exitAnim) {
        if (mSuperListener != null) {
            mSuperListener.call(enterAnim, exitAnim);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.overridePendingTransition(enterAnim, exitAnim);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public Drawable peekWallpaper() {
        if (mSuperListener != null) {
            return (Drawable) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final Drawable result = mActivityDelegate
                    .peekWallpaper();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public void postponeEnterTransition() {
        if (mSuperListener != null) {
            mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.postponeEnterTransition();
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void recreate() {
        if (mSuperListener != null) {
            mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.recreate();
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void registerComponentCallbacks(final ComponentCallbacks callback) {
        if (mSuperListener != null) {
            mSuperListener.call(callback);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.registerComponentCallbacks(callback);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void registerForContextMenu(final View view) {
        if (mSuperListener != null) {
            mSuperListener.call(view);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.registerForContextMenu(view);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public Intent registerReceiver(final BroadcastReceiver receiver, final IntentFilter filter) {
        if (mSuperListener != null) {
            return (Intent) mSuperListener.call(receiver, filter);
        } else {
            mActivityDelegate.callingPlugin(this);
            final Intent result = mActivityDelegate
                    .registerReceiver(receiver, filter);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public Intent registerReceiver(final BroadcastReceiver receiver, final IntentFilter filter,
            final String broadcastPermission, final Handler scheduler) {
        if (mSuperListener != null) {
            return (Intent) mSuperListener.call(receiver, filter, broadcastPermission, scheduler);
        } else {
            mActivityDelegate.callingPlugin(this);
            final Intent result = mActivityDelegate
                    .registerReceiver(receiver, filter, broadcastPermission, scheduler);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public boolean releaseInstance() {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .releaseInstance();
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public void removeStickyBroadcast(final Intent intent) {
        if (mSuperListener != null) {
            mSuperListener.call(intent);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.removeStickyBroadcast(intent);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void removeStickyBroadcastAsUser(final Intent intent, final UserHandle user) {
        if (mSuperListener != null) {
            mSuperListener.call(intent, user);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.removeStickyBroadcastAsUser(intent, user);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void reportFullyDrawn() {
        if (mSuperListener != null) {
            mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.reportFullyDrawn();
            mActivityDelegate.callingPlugin(null);
        }
    }

    public boolean requestVisibleBehind(final boolean visible) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(visible);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .requestVisibleBehind(visible);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public void revokeUriPermission(final Uri uri, final int modeFlags) {
        if (mSuperListener != null) {
            mSuperListener.call(uri, modeFlags);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.revokeUriPermission(uri, modeFlags);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void sendBroadcast(final Intent intent) {
        if (mSuperListener != null) {
            mSuperListener.call(intent);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.sendBroadcast(intent);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void sendBroadcast(final Intent intent, final String receiverPermission) {
        if (mSuperListener != null) {
            mSuperListener.call(intent, receiverPermission);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.sendBroadcast(intent, receiverPermission);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void sendBroadcastAsUser(final Intent intent, final UserHandle user) {
        if (mSuperListener != null) {
            mSuperListener.call(intent, user);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.sendBroadcastAsUser(intent, user);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void sendBroadcastAsUser(final Intent intent, final UserHandle user,
            final String receiverPermission) {
        if (mSuperListener != null) {
            mSuperListener.call(intent, user, receiverPermission);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.sendBroadcastAsUser(intent, user, receiverPermission);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void sendOrderedBroadcast(final Intent intent, final String receiverPermission) {
        if (mSuperListener != null) {
            mSuperListener.call(intent, receiverPermission);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.sendOrderedBroadcast(intent, receiverPermission);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void sendOrderedBroadcast(final Intent intent, final String receiverPermission,
            final BroadcastReceiver resultReceiver, final Handler scheduler, final int initialCode,
            final String initialData, final Bundle initialExtras) {
        if (mSuperListener != null) {
            mSuperListener.call(intent, receiverPermission, resultReceiver, scheduler, initialCode,
                    initialData, initialExtras);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate
                    .sendOrderedBroadcast(intent, receiverPermission, resultReceiver, scheduler,
                            initialCode, initialData, initialExtras);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void sendOrderedBroadcastAsUser(final Intent intent, final UserHandle user,
            final String receiverPermission, final BroadcastReceiver resultReceiver,
            final Handler scheduler, final int initialCode, final String initialData,
            final Bundle initialExtras) {
        if (mSuperListener != null) {
            mSuperListener
                    .call(intent, user, receiverPermission, resultReceiver, scheduler, initialCode,
                            initialData, initialExtras);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate
                    .sendOrderedBroadcastAsUser(intent, user, receiverPermission, resultReceiver,
                            scheduler, initialCode, initialData, initialExtras);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void sendStickyBroadcast(final Intent intent) {
        if (mSuperListener != null) {
            mSuperListener.call(intent);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.sendStickyBroadcast(intent);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void sendStickyBroadcastAsUser(final Intent intent, final UserHandle user) {
        if (mSuperListener != null) {
            mSuperListener.call(intent, user);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.sendStickyBroadcastAsUser(intent, user);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void sendStickyOrderedBroadcast(final Intent intent,
            final BroadcastReceiver resultReceiver, final Handler scheduler, final int initialCode,
            final String initialData, final Bundle initialExtras) {
        if (mSuperListener != null) {
            mSuperListener.call(intent, resultReceiver, scheduler, initialCode, initialData,
                    initialExtras);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate
                    .sendStickyOrderedBroadcast(intent, resultReceiver, scheduler, initialCode,
                            initialData, initialExtras);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void sendStickyOrderedBroadcastAsUser(final Intent intent, final UserHandle user,
            final BroadcastReceiver resultReceiver, final Handler scheduler, final int initialCode,
            final String initialData, final Bundle initialExtras) {
        if (mSuperListener != null) {
            mSuperListener.call(intent, user, resultReceiver, scheduler, initialCode, initialData,
                    initialExtras);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate
                    .sendStickyOrderedBroadcastAsUser(intent, user, resultReceiver, scheduler,
                            initialCode, initialData, initialExtras);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void setActionBar(final Toolbar toolbar) {
        if (mSuperListener != null) {
            mSuperListener.call(toolbar);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.setActionBar(toolbar);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void setContentTransitionManager(final TransitionManager tm) {
        if (mSuperListener != null) {
            mSuperListener.call(tm);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.setContentTransitionManager(tm);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void setContentView(@LayoutRes final int layoutResID) {
        if (mSuperListener != null) {
            mSuperListener.call(layoutResID);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.setContentView(layoutResID);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void setContentView(final View view) {
        if (mSuperListener != null) {
            mSuperListener.call(view);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.setContentView(view);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void setContentView(final View view, final ViewGroup.LayoutParams params) {
        if (mSuperListener != null) {
            mSuperListener.call(view, params);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.setContentView(view, params);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void setEnterSharedElementCallback(final SharedElementCallback callback) {
        if (mSuperListener != null) {
            mSuperListener.call(callback);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.setEnterSharedElementCallback(callback);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void setEnterSharedElementCallback(final android.app.SharedElementCallback callback) {
        if (mSuperListener != null) {
            mSuperListener.call(callback);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.setEnterSharedElementCallback(callback);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void setExitSharedElementCallback(final SharedElementCallback listener) {
        if (mSuperListener != null) {
            mSuperListener.call(listener);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.setExitSharedElementCallback(listener);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void setExitSharedElementCallback(final android.app.SharedElementCallback callback) {
        if (mSuperListener != null) {
            mSuperListener.call(callback);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.setExitSharedElementCallback(callback);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void setFinishOnTouchOutside(final boolean finish) {
        if (mSuperListener != null) {
            mSuperListener.call(finish);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.setFinishOnTouchOutside(finish);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void setImmersive(final boolean i) {
        if (mSuperListener != null) {
            mSuperListener.call(i);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.setImmersive(i);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void setIntent(final Intent newIntent) {
        if (mSuperListener != null) {
            mSuperListener.call(newIntent);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.setIntent(newIntent);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void setRequestedOrientation(final int requestedOrientation) {
        if (mSuperListener != null) {
            mSuperListener.call(requestedOrientation);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.setRequestedOrientation(requestedOrientation);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void setSupportActionBar(@Nullable final android.support.v7.widget.Toolbar toolbar) {
        if (mSuperListener != null) {
            mSuperListener.call(toolbar);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.setSupportActionBar(toolbar);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void setSupportProgress(final int progress) {
        if (mSuperListener != null) {
            mSuperListener.call(progress);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.setSupportProgress(progress);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void setSupportProgressBarIndeterminate(final boolean indeterminate) {
        if (mSuperListener != null) {
            mSuperListener.call(indeterminate);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.setSupportProgressBarIndeterminate(indeterminate);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void setSupportProgressBarIndeterminateVisibility(final boolean visible) {
        if (mSuperListener != null) {
            mSuperListener.call(visible);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.setSupportProgressBarIndeterminateVisibility(visible);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void setSupportProgressBarVisibility(final boolean visible) {
        if (mSuperListener != null) {
            mSuperListener.call(visible);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.setSupportProgressBarVisibility(visible);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void setTaskDescription(final ActivityManager.TaskDescription taskDescription) {
        if (mSuperListener != null) {
            mSuperListener.call(taskDescription);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.setTaskDescription(taskDescription);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void setTheme(@StyleRes final int resid) {
        if (mSuperListener != null) {
            mSuperListener.call(resid);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.setTheme(resid);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void setTitle(final CharSequence title) {
        if (mSuperListener != null) {
            mSuperListener.call(title);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.setTitle(title);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void setTitle(final int titleId) {
        if (mSuperListener != null) {
            mSuperListener.call(titleId);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.setTitle(titleId);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void setTitleColor(final int textColor) {
        if (mSuperListener != null) {
            mSuperListener.call(textColor);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.setTitleColor(textColor);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void setVisible(final boolean visible) {
        if (mSuperListener != null) {
            mSuperListener.call(visible);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.setVisible(visible);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void setWallpaper(final Bitmap bitmap) throws IOException {
        if (mSuperListener != null) {
            mSuperListener.call(bitmap);
        } else {
            mActivityDelegate.callingPlugin(this);
            try {
                mActivityDelegate.setWallpaper(bitmap);
            } catch (SuppressedException e) {
                throw (IOException) e.getCause();
            }
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void setWallpaper(final InputStream data) throws IOException {
        if (mSuperListener != null) {
            mSuperListener.call(data);
        } else {
            mActivityDelegate.callingPlugin(this);
            try {
                mActivityDelegate.setWallpaper(data);
            } catch (SuppressedException e) {
                throw (IOException) e.getCause();
            }
            mActivityDelegate.callingPlugin(null);
        }
    }

    public boolean shouldShowRequestPermissionRationale(@NonNull final String permission) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(permission);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .shouldShowRequestPermissionRationale(permission);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public boolean shouldUpRecreateTask(final Intent targetIntent) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(targetIntent);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .shouldUpRecreateTask(targetIntent);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public boolean showAssist(final Bundle args) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(args);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .showAssist(args);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public void showLockTaskEscapeMessage() {
        if (mSuperListener != null) {
            mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.showLockTaskEscapeMessage();
            mActivityDelegate.callingPlugin(null);
        }
    }

    public android.view.ActionMode startActionMode(
            final android.view.ActionMode.Callback callback) {
        if (mSuperListener != null) {
            return (android.view.ActionMode) mSuperListener.call(callback);
        } else {
            mActivityDelegate.callingPlugin(this);
            final android.view.ActionMode result = mActivityDelegate
                    .startActionMode(callback);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public android.view.ActionMode startActionMode(final android.view.ActionMode.Callback callback,
            final int type) {
        if (mSuperListener != null) {
            return (android.view.ActionMode) mSuperListener.call(callback, type);
        } else {
            mActivityDelegate.callingPlugin(this);
            final android.view.ActionMode result = mActivityDelegate
                    .startActionMode(callback, type);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public void startActivities(final Intent[] intents) {
        if (mSuperListener != null) {
            mSuperListener.call(intents);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.startActivities(intents);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void startActivities(final Intent[] intents, final Bundle options) {
        if (mSuperListener != null) {
            mSuperListener.call(intents, options);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.startActivities(intents, options);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void startActivity(final Intent intent) {
        if (mSuperListener != null) {
            mSuperListener.call(intent);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.startActivity(intent);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void startActivity(final Intent intent, final Bundle options) {
        if (mSuperListener != null) {
            mSuperListener.call(intent, options);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.startActivity(intent, options);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void startActivityForResult(final Intent intent, final int requestCode) {
        if (mSuperListener != null) {
            mSuperListener.call(intent, requestCode);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.startActivityForResult(intent, requestCode);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void startActivityForResult(final Intent intent, final int requestCode,
            final Bundle options) {
        if (mSuperListener != null) {
            mSuperListener.call(intent, requestCode, options);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.startActivityForResult(intent, requestCode, options);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void startActivityFromChild(@NonNull final Activity child, final Intent intent,
            final int requestCode) {
        if (mSuperListener != null) {
            mSuperListener.call(child, intent, requestCode);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.startActivityFromChild(child, intent, requestCode);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void startActivityFromChild(@NonNull final Activity child, final Intent intent,
            final int requestCode, final Bundle options) {
        if (mSuperListener != null) {
            mSuperListener.call(child, intent, requestCode, options);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.startActivityFromChild(child, intent, requestCode, options);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void startActivityFromFragment(final Fragment fragment, final Intent intent,
            final int requestCode) {
        if (mSuperListener != null) {
            mSuperListener.call(fragment, intent, requestCode);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.startActivityFromFragment(fragment, intent, requestCode);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void startActivityFromFragment(final Fragment fragment, final Intent intent,
            final int requestCode, @Nullable final Bundle options) {
        if (mSuperListener != null) {
            mSuperListener.call(fragment, intent, requestCode, options);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.startActivityFromFragment(fragment, intent, requestCode, options);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void startActivityFromFragment(@NonNull final android.app.Fragment fragment,
            final Intent intent, final int requestCode) {
        if (mSuperListener != null) {
            mSuperListener.call(fragment, intent, requestCode);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.startActivityFromFragment(fragment, intent, requestCode);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void startActivityFromFragment(@NonNull final android.app.Fragment fragment,
            final Intent intent, final int requestCode, final Bundle options) {
        if (mSuperListener != null) {
            mSuperListener.call(fragment, intent, requestCode, options);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.startActivityFromFragment(fragment, intent, requestCode, options);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public boolean startActivityIfNeeded(@NonNull final Intent intent, final int requestCode) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(intent, requestCode);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .startActivityIfNeeded(intent, requestCode);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public boolean startActivityIfNeeded(@NonNull final Intent intent, final int requestCode,
            final Bundle options) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(intent, requestCode, options);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .startActivityIfNeeded(intent, requestCode, options);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public boolean startInstrumentation(final ComponentName className, final String profileFile,
            final Bundle arguments) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(className, profileFile, arguments);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .startInstrumentation(className, profileFile, arguments);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public void startIntentSender(final IntentSender intent, final Intent fillInIntent,
            final int flagsMask, final int flagsValues, final int extraFlags)
            throws IntentSender.SendIntentException {
        if (mSuperListener != null) {
            mSuperListener.call(intent, fillInIntent, flagsMask, flagsValues, extraFlags);
        } else {
            mActivityDelegate.callingPlugin(this);
            try {
                mActivityDelegate.startIntentSender(intent, fillInIntent, flagsMask, flagsValues,
                        extraFlags);
            } catch (SuppressedException e) {
                throw (IntentSender.SendIntentException) e.getCause();
            }
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void startIntentSender(final IntentSender intent, final Intent fillInIntent,
            final int flagsMask, final int flagsValues, final int extraFlags, final Bundle options)
            throws IntentSender.SendIntentException {
        if (mSuperListener != null) {
            mSuperListener.call(intent, fillInIntent, flagsMask, flagsValues, extraFlags, options);
        } else {
            mActivityDelegate.callingPlugin(this);
            try {
                mActivityDelegate
                        .startIntentSender(intent, fillInIntent, flagsMask, flagsValues, extraFlags,
                                options);
            } catch (SuppressedException e) {
                throw (IntentSender.SendIntentException) e.getCause();
            }
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void startIntentSenderForResult(final IntentSender intent, final int requestCode,
            final Intent fillInIntent, final int flagsMask, final int flagsValues,
            final int extraFlags) throws IntentSender.SendIntentException {
        if (mSuperListener != null) {
            mSuperListener
                    .call(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
        } else {
            mActivityDelegate.callingPlugin(this);
            try {
                mActivityDelegate
                        .startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask,
                                flagsValues, extraFlags);
            } catch (SuppressedException e) {
                throw (IntentSender.SendIntentException) e.getCause();
            }
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void startIntentSenderForResult(final IntentSender intent, final int requestCode,
            final Intent fillInIntent, final int flagsMask, final int flagsValues,
            final int extraFlags, final Bundle options) throws IntentSender.SendIntentException {
        if (mSuperListener != null) {
            mSuperListener
                    .call(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags,
                            options);
        } else {
            mActivityDelegate.callingPlugin(this);
            try {
                mActivityDelegate
                        .startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask,
                                flagsValues, extraFlags, options);
            } catch (SuppressedException e) {
                throw (IntentSender.SendIntentException) e.getCause();
            }
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void startIntentSenderFromChild(final Activity child, final IntentSender intent,
            final int requestCode, final Intent fillInIntent, final int flagsMask,
            final int flagsValues, final int extraFlags) throws IntentSender.SendIntentException {
        if (mSuperListener != null) {
            mSuperListener.call(child, intent, requestCode, fillInIntent, flagsMask, flagsValues,
                    extraFlags);
        } else {
            mActivityDelegate.callingPlugin(this);
            try {
                mActivityDelegate
                        .startIntentSenderFromChild(child, intent, requestCode, fillInIntent,
                                flagsMask, flagsValues, extraFlags);
            } catch (SuppressedException e) {
                throw (IntentSender.SendIntentException) e.getCause();
            }
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void startIntentSenderFromChild(final Activity child, final IntentSender intent,
            final int requestCode, final Intent fillInIntent, final int flagsMask,
            final int flagsValues, final int extraFlags, final Bundle options)
            throws IntentSender.SendIntentException {
        if (mSuperListener != null) {
            mSuperListener.call(child, intent, requestCode, fillInIntent, flagsMask, flagsValues,
                    extraFlags, options);
        } else {
            mActivityDelegate.callingPlugin(this);
            try {
                mActivityDelegate
                        .startIntentSenderFromChild(child, intent, requestCode, fillInIntent,
                                flagsMask, flagsValues, extraFlags, options);
            } catch (SuppressedException e) {
                throw (IntentSender.SendIntentException) e.getCause();
            }
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void startLockTask() {
        if (mSuperListener != null) {
            mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.startLockTask();
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void startManagingCursor(final Cursor c) {
        if (mSuperListener != null) {
            mSuperListener.call(c);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.startManagingCursor(c);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public boolean startNextMatchingActivity(@NonNull final Intent intent) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(intent);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .startNextMatchingActivity(intent);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public boolean startNextMatchingActivity(@NonNull final Intent intent, final Bundle options) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(intent, options);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .startNextMatchingActivity(intent, options);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public void startPostponedEnterTransition() {
        if (mSuperListener != null) {
            mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.startPostponedEnterTransition();
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void startSearch(final String initialQuery, final boolean selectInitialQuery,
            final Bundle appSearchData, final boolean globalSearch) {
        if (mSuperListener != null) {
            mSuperListener.call(initialQuery, selectInitialQuery, appSearchData, globalSearch);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate
                    .startSearch(initialQuery, selectInitialQuery, appSearchData, globalSearch);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public ComponentName startService(final Intent service) {
        if (mSuperListener != null) {
            return (ComponentName) mSuperListener.call(service);
        } else {
            mActivityDelegate.callingPlugin(this);
            final ComponentName result = mActivityDelegate
                    .startService(service);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public ActionMode startSupportActionMode(@NonNull final ActionMode.Callback callback) {
        if (mSuperListener != null) {
            return (ActionMode) mSuperListener.call(callback);
        } else {
            mActivityDelegate.callingPlugin(this);
            final ActionMode result = mActivityDelegate
                    .startSupportActionMode(callback);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public void stopLockTask() {
        if (mSuperListener != null) {
            mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.stopLockTask();
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void stopManagingCursor(final Cursor c) {
        if (mSuperListener != null) {
            mSuperListener.call(c);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.stopManagingCursor(c);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public boolean stopService(final Intent name) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(name);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .stopService(name);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public void supportFinishAfterTransition() {
        if (mSuperListener != null) {
            mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.supportFinishAfterTransition();
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void supportInvalidateOptionsMenu() {
        if (mSuperListener != null) {
            mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.supportInvalidateOptionsMenu();
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void supportNavigateUpTo(@NonNull final Intent upIntent) {
        if (mSuperListener != null) {
            mSuperListener.call(upIntent);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.supportNavigateUpTo(upIntent);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void supportPostponeEnterTransition() {
        if (mSuperListener != null) {
            mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.supportPostponeEnterTransition();
            mActivityDelegate.callingPlugin(null);
        }
    }

    public boolean supportRequestWindowFeature(final int featureId) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(featureId);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .supportRequestWindowFeature(featureId);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public boolean supportShouldUpRecreateTask(@NonNull final Intent targetIntent) {
        if (mSuperListener != null) {
            return (Boolean) mSuperListener.call(targetIntent);
        } else {
            mActivityDelegate.callingPlugin(this);
            final boolean result = mActivityDelegate
                    .supportShouldUpRecreateTask(targetIntent);
            mActivityDelegate.callingPlugin(null);
            return result;
        }
    }

    public void supportStartPostponedEnterTransition() {
        if (mSuperListener != null) {
            mSuperListener.call();
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.supportStartPostponedEnterTransition();
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void takeKeyEvents(final boolean get) {
        if (mSuperListener != null) {
            mSuperListener.call(get);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.takeKeyEvents(get);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void triggerSearch(final String query, final Bundle appSearchData) {
        if (mSuperListener != null) {
            mSuperListener.call(query, appSearchData);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.triggerSearch(query, appSearchData);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void unbindService(final ServiceConnection conn) {
        if (mSuperListener != null) {
            mSuperListener.call(conn);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.unbindService(conn);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void unregisterComponentCallbacks(final ComponentCallbacks callback) {
        if (mSuperListener != null) {
            mSuperListener.call(callback);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.unregisterComponentCallbacks(callback);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void unregisterForContextMenu(final View view) {
        if (mSuperListener != null) {
            mSuperListener.call(view);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.unregisterForContextMenu(view);
            mActivityDelegate.callingPlugin(null);
        }
    }

    public void unregisterReceiver(final BroadcastReceiver receiver) {
        if (mSuperListener != null) {
            mSuperListener.call(receiver);
        } else {
            mActivityDelegate.callingPlugin(this);
            mActivityDelegate.unregisterReceiver(receiver);
            mActivityDelegate.callingPlugin(null);
        }
    }
}
