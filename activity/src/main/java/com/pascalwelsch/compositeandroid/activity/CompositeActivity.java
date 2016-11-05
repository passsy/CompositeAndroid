package com.pascalwelsch.compositeandroid.activity;

import com.pascalwelsch.compositeandroid.core.Removable;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityOptions;
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
import android.support.v4.app.NavUtils;
import android.support.v4.app.SharedElementCallback;
import android.support.v4.view.WindowCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
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


@SuppressWarnings({"unused", "deprecation", "JavadocReference", "WrongConstant"})
@SuppressLint({"MissingSuperCall", "NewApi"})

public class CompositeActivity extends AppCompatActivity implements ICompositeActivity {

    protected ActivityDelegate delegate = new ActivityDelegate(this);

    @Override
    public void addContentView(View view, ViewGroup.LayoutParams params) {
        delegate.addContentView(view, params);
    }

    public Removable addPlugin(final ActivityPlugin plugin) {
        return delegate.addPlugin(plugin);
    }

    @Override
    public void applyOverrideConfiguration(Configuration overrideConfiguration) {
        delegate.applyOverrideConfiguration(overrideConfiguration);
    }

    @Override
    public void attachBaseContext(Context newBase) {
        delegate.attachBaseContext(newBase);
    }

    @Override
    public boolean bindService(Intent service, ServiceConnection conn, int flags) {
        return delegate.bindService(service, conn, flags);
    }

    @Override
    public int checkCallingOrSelfPermission(String permission) {
        return delegate.checkCallingOrSelfPermission(permission);
    }

    @Override
    public int checkCallingOrSelfUriPermission(Uri uri, int modeFlags) {
        return delegate.checkCallingOrSelfUriPermission(uri, modeFlags);
    }

    @Override
    public int checkCallingPermission(String permission) {
        return delegate.checkCallingPermission(permission);
    }

    @Override
    public int checkCallingUriPermission(Uri uri, int modeFlags) {
        return delegate.checkCallingUriPermission(uri, modeFlags);
    }

    @Override
    public int checkPermission(String permission, int pid, int uid) {
        return delegate.checkPermission(permission, pid, uid);
    }

    @Override
    public int checkSelfPermission(String permission) {
        return delegate.checkSelfPermission(permission);
    }

    @Override
    public int checkUriPermission(Uri uri, int pid, int uid, int modeFlags) {
        return delegate.checkUriPermission(uri, pid, uid, modeFlags);
    }

    @Override
    public int checkUriPermission(Uri uri, String readPermission, String writePermission, int pid,
            int uid, int modeFlags) {
        return delegate
                .checkUriPermission(uri, readPermission, writePermission, pid, uid, modeFlags);
    }

    /**
     * @deprecated
     */
    @Override
    public void clearWallpaper() throws IOException {
        try {
            delegate.clearWallpaper();
        } catch (SuppressedException e) {
            throw (IOException) e.getCause();
        }
    }

    @Override
    public void closeContextMenu() {
        delegate.closeContextMenu();
    }

    @Override
    public void closeOptionsMenu() {
        delegate.closeOptionsMenu();
    }

    @Override
    public Context createConfigurationContext(Configuration overrideConfiguration) {
        return delegate.createConfigurationContext(overrideConfiguration);
    }

    @Override
    public Context createDeviceProtectedStorageContext() {
        return delegate.createDeviceProtectedStorageContext();
    }

    @Override
    public Context createDisplayContext(Display display) {
        return delegate.createDisplayContext(display);
    }

    @Override
    public Context createPackageContext(String packageName, int flags)
            throws PackageManager.NameNotFoundException {
        try {
            return delegate.createPackageContext(packageName, flags);
        } catch (SuppressedException e) {
            throw (PackageManager.NameNotFoundException) e.getCause();
        }
    }

    @Override
    public PendingIntent createPendingResult(int requestCode, Intent data, int flags) {
        return delegate.createPendingResult(requestCode, data, flags);
    }

    @Override
    public String[] databaseList() {
        return delegate.databaseList();
    }

    @Override
    public boolean deleteDatabase(String name) {
        return delegate.deleteDatabase(name);
    }

    @Override
    public boolean deleteFile(String name) {
        return delegate.deleteFile(name);
    }

    @Override
    public boolean deleteSharedPreferences(String name) {
        return delegate.deleteSharedPreferences(name);
    }

    @Override
    public boolean dispatchGenericMotionEvent(MotionEvent ev) {
        return delegate.dispatchGenericMotionEvent(ev);
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        return delegate.dispatchKeyEvent(event);
    }

    @Override
    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        return delegate.dispatchKeyShortcutEvent(event);
    }

    @Override
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        return delegate.dispatchPopulateAccessibilityEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return delegate.dispatchTouchEvent(ev);
    }

    @Override
    public boolean dispatchTrackballEvent(MotionEvent ev) {
        return delegate.dispatchTrackballEvent(ev);
    }

    /**
     * Print the Activity's state into the given stream.  This gets invoked if
     * you run "adb shell dumpsys activity <activity_component_name>".
     *
     * @param prefix Desired prefix to prepend at each line of output.
     * @param fd     The raw file descriptor that the dump is being sent to.
     * @param writer The PrintWriter to which you should dump your state.  This will be
     *               closed for you after you return.
     * @param args   additional arguments to the dump request.
     */
    @Override
    public void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        delegate.dump(prefix, fd, writer, args);
    }

    @Override
    public void enforceCallingOrSelfPermission(String permission, String message) {
        delegate.enforceCallingOrSelfPermission(permission, message);
    }

    @Override
    public void enforceCallingOrSelfUriPermission(Uri uri, int modeFlags, String message) {
        delegate.enforceCallingOrSelfUriPermission(uri, modeFlags, message);
    }

    @Override
    public void enforceCallingPermission(String permission, String message) {
        delegate.enforceCallingPermission(permission, message);
    }

    @Override
    public void enforceCallingUriPermission(Uri uri, int modeFlags, String message) {
        delegate.enforceCallingUriPermission(uri, modeFlags, message);
    }

    @Override
    public void enforcePermission(String permission, int pid, int uid, String message) {
        delegate.enforcePermission(permission, pid, uid, message);
    }

    @Override
    public void enforceUriPermission(Uri uri, int pid, int uid, int modeFlags, String message) {
        delegate.enforceUriPermission(uri, pid, uid, modeFlags, message);
    }

    @Override
    public void enforceUriPermission(Uri uri, String readPermission, String writePermission,
            int pid, int uid, int modeFlags, String message) {
        delegate.enforceUriPermission(uri, readPermission, writePermission, pid, uid, modeFlags,
                message);
    }

    @Override
    public void enterPictureInPictureMode() {
        delegate.enterPictureInPictureMode();
    }

    @Override
    public String[] fileList() {
        return delegate.fileList();
    }

    @Override
    public View findViewById(@IdRes int id) {
        return delegate.findViewById(id);
    }

    @Override
    public void finish() {
        delegate.finish();
    }

    @Override
    public void finishActivity(int requestCode) {
        delegate.finishActivity(requestCode);
    }

    @Override
    public void finishActivityFromChild(Activity child, int requestCode) {
        delegate.finishActivityFromChild(child, requestCode);
    }

    @Override
    public void finishAffinity() {
        delegate.finishAffinity();
    }

    @Override
    public void finishAfterTransition() {
        delegate.finishAfterTransition();
    }

    @Override
    public void finishAndRemoveTask() {
        delegate.finishAndRemoveTask();
    }

    @Override
    public void finishFromChild(Activity child) {
        delegate.finishFromChild(child);
    }

    @Nullable
    @Override
    public android.app.ActionBar getActionBar() {
        return delegate.getActionBar();
    }

    @Override
    public Context getApplicationContext() {
        return delegate.getApplicationContext();
    }

    @Override
    public ApplicationInfo getApplicationInfo() {
        return delegate.getApplicationInfo();
    }

    @Override
    public AssetManager getAssets() {
        return delegate.getAssets();
    }

    @Override
    public Context getBaseContext() {
        return delegate.getBaseContext();
    }

    @Override
    public File getCacheDir() {
        return delegate.getCacheDir();
    }

    @Nullable
    @Override
    public ComponentName getCallingActivity() {
        return delegate.getCallingActivity();
    }

    @Nullable
    @Override
    public String getCallingPackage() {
        return delegate.getCallingPackage();
    }

    @Override
    public int getChangingConfigurations() {
        return delegate.getChangingConfigurations();
    }

    @Override
    public ClassLoader getClassLoader() {
        return delegate.getClassLoader();
    }

    @Override
    public File getCodeCacheDir() {
        return delegate.getCodeCacheDir();
    }

    @Override
    public ComponentName getComponentName() {
        return delegate.getComponentName();
    }

    @Override
    public ContentResolver getContentResolver() {
        return delegate.getContentResolver();
    }

    @Override
    public Scene getContentScene() {
        return delegate.getContentScene();
    }

    @Override
    public TransitionManager getContentTransitionManager() {
        return delegate.getContentTransitionManager();
    }

    @Nullable
    @Override
    public View getCurrentFocus() {
        return delegate.getCurrentFocus();
    }

    @Override
    public File getDataDir() {
        return delegate.getDataDir();
    }

    @Override
    public File getDatabasePath(String name) {
        return delegate.getDatabasePath(name);
    }

    /**
     * @return The {@link AppCompatDelegate} being used by this Activity.
     */
    @NonNull
    @Override
    public AppCompatDelegate getDelegate() {
        return delegate.getDelegate();
    }

    @Override
    public File getDir(String name, int mode) {
        return delegate.getDir(name, mode);
    }

    @Nullable
    @Override
    public ActionBarDrawerToggle.Delegate getDrawerToggleDelegate() {
        return delegate.getDrawerToggleDelegate();
    }

    @Override
    public File getExternalCacheDir() {
        return delegate.getExternalCacheDir();
    }

    @Override
    public File[] getExternalCacheDirs() {
        return delegate.getExternalCacheDirs();
    }

    @Override
    public File getExternalFilesDir(String type) {
        return delegate.getExternalFilesDir(type);
    }

    @Override
    public File[] getExternalFilesDirs(String type) {
        return delegate.getExternalFilesDirs(type);
    }

    @Override
    public File[] getExternalMediaDirs() {
        return delegate.getExternalMediaDirs();
    }

    @Override
    public File getFileStreamPath(String name) {
        return delegate.getFileStreamPath(name);
    }

    @Override
    public File getFilesDir() {
        return delegate.getFilesDir();
    }

    @Override
    public android.app.FragmentManager getFragmentManager() {
        return delegate.getFragmentManager();
    }

    @Override
    public Intent getIntent() {
        return delegate.getIntent();
    }

    /**
     * @return see {@link #AppCompatActivity#getLastCustomNonConfigurationInstance()}
     */
    public Object getLastCompositeCustomNonConfigurationInstance() {
        return delegate.getLastCompositeCustomNonConfigurationInstance();
    }

    /**
     * Use {@link #getLastCompositeCustomNonConfigurationInstance()} instead. This is used
     * internally
     *
     * @see AppCompatActivity#getLastCustomNonConfigurationInstance()
     */
    @Override
    final public Object getLastCustomNonConfigurationInstance() {
        return super.getLastCustomNonConfigurationInstance();
    }

    /**
     * Use {@link #getLastCompositeCustomNonConfigurationInstance()} instead. This is used
     * internally
     *
     * @see AppCompatActivity#getLastNonConfigurationInstance()
     */
    @Nullable
    @Override
    final public Object getLastNonConfigurationInstance() {
        return super.getLastNonConfigurationInstance();
    }

    @NonNull
    @Override
    public LayoutInflater getLayoutInflater() {
        return delegate.getLayoutInflater();
    }

    @Override
    public android.app.LoaderManager getLoaderManager() {
        return delegate.getLoaderManager();
    }

    @NonNull
    @Override
    public String getLocalClassName() {
        return delegate.getLocalClassName();
    }

    @Override
    public Looper getMainLooper() {
        return delegate.getMainLooper();
    }

    @Override
    public MenuInflater getMenuInflater() {
        return delegate.getMenuInflater();
    }

    @Override
    public File getNoBackupFilesDir() {
        return delegate.getNoBackupFilesDir();
    }

    @Override
    public File getObbDir() {
        return delegate.getObbDir();
    }

    @Override
    public File[] getObbDirs() {
        return delegate.getObbDirs();
    }

    @Override
    public String getPackageCodePath() {
        return delegate.getPackageCodePath();
    }

    @Override
    public PackageManager getPackageManager() {
        return delegate.getPackageManager();
    }

    @Override
    public String getPackageName() {
        return delegate.getPackageName();
    }

    @Override
    public String getPackageResourcePath() {
        return delegate.getPackageResourcePath();
    }

    @Nullable
    @Override
    public Intent getParentActivityIntent() {
        return delegate.getParentActivityIntent();
    }

    @Override
    public SharedPreferences getPreferences(int mode) {
        return delegate.getPreferences(mode);
    }

    @Nullable
    @Override
    public Uri getReferrer() {
        return delegate.getReferrer();
    }

    @Override
    public int getRequestedOrientation() {
        return delegate.getRequestedOrientation();
    }

    @Override
    public Resources getResources() {
        return delegate.getResources();
    }

    @Override
    public SharedPreferences getSharedPreferences(String name, int mode) {
        return delegate.getSharedPreferences(name, mode);
    }

    /**
     * Support library version of {@link Activity#getActionBar}.
     * <p>
     * <p>Retrieve a reference to this activity's ActionBar.
     *
     * @return The Activity's ActionBar, or null if it does not have one.
     */
    @Nullable
    @Override
    public ActionBar getSupportActionBar() {
        return delegate.getSupportActionBar();
    }

    /**
     * Return the FragmentManager for interacting with fragments associated
     * with this activity.
     */
    @Override
    public FragmentManager getSupportFragmentManager() {
        return delegate.getSupportFragmentManager();
    }

    @Override
    public LoaderManager getSupportLoaderManager() {
        return delegate.getSupportLoaderManager();
    }

    /**
     * Obtain an {@link Intent} that will launch an explicit target activity
     * specified by sourceActivity's {@link NavUtils#PARENT_ACTIVITY} &lt;meta-data&gt;
     * element in the application's manifest. If the device is running
     * Jellybean or newer, the android:parentActivityName attribute will be preferred
     * if it is present.
     *
     * @return a new Intent targeting the defined parent activity of sourceActivity
     */
    @Nullable
    @Override
    public Intent getSupportParentActivityIntent() {
        return delegate.getSupportParentActivityIntent();
    }

    @Override
    public Object getSystemService(String name) {
        return delegate.getSystemService(name);
    }

    @Override
    public String getSystemServiceName(Class<?> serviceClass) {
        return delegate.getSystemServiceName(serviceClass);
    }

    @Override
    public int getTaskId() {
        return delegate.getTaskId();
    }

    @Override
    public Resources.Theme getTheme() {
        return delegate.getTheme();
    }

    @Override
    public VoiceInteractor getVoiceInteractor() {
        return delegate.getVoiceInteractor();
    }

    /**
     * @deprecated
     */
    @Override
    public Drawable getWallpaper() {
        return delegate.getWallpaper();
    }

    /**
     * @deprecated
     */
    @Override
    public int getWallpaperDesiredMinimumHeight() {
        return delegate.getWallpaperDesiredMinimumHeight();
    }

    /**
     * @deprecated
     */
    @Override
    public int getWallpaperDesiredMinimumWidth() {
        return delegate.getWallpaperDesiredMinimumWidth();
    }

    @Override
    public Window getWindow() {
        return delegate.getWindow();
    }

    @Override
    public WindowManager getWindowManager() {
        return delegate.getWindowManager();
    }

    @Override
    public void grantUriPermission(String toPackage, Uri uri, int modeFlags) {
        delegate.grantUriPermission(toPackage, uri, modeFlags);
    }

    @Override
    public boolean hasWindowFocus() {
        return delegate.hasWindowFocus();
    }

    /**
     * @hide
     */
    @Override
    public void invalidateOptionsMenu() {
        delegate.invalidateOptionsMenu();
    }

    @Override
    public boolean isChangingConfigurations() {
        return delegate.isChangingConfigurations();
    }

    @Override
    public boolean isDestroyed() {
        return delegate.isDestroyed();
    }

    @Override
    public boolean isDeviceProtectedStorage() {
        return delegate.isDeviceProtectedStorage();
    }

    @Override
    public boolean isFinishing() {
        return delegate.isFinishing();
    }

    @Override
    public boolean isImmersive() {
        return delegate.isImmersive();
    }

    @Override
    public boolean isInMultiWindowMode() {
        return delegate.isInMultiWindowMode();
    }

    @Override
    public boolean isInPictureInPictureMode() {
        return delegate.isInPictureInPictureMode();
    }

    @Override
    public boolean isLocalVoiceInteractionSupported() {
        return delegate.isLocalVoiceInteractionSupported();
    }

    @Override
    public boolean isRestricted() {
        return delegate.isRestricted();
    }

    @Override
    public boolean isTaskRoot() {
        return delegate.isTaskRoot();
    }

    @Override
    public boolean isVoiceInteraction() {
        return delegate.isVoiceInteraction();
    }

    @Override
    public boolean isVoiceInteractionRoot() {
        return delegate.isVoiceInteractionRoot();
    }

    @Override
    public boolean moveDatabaseFrom(Context sourceContext, String name) {
        return delegate.moveDatabaseFrom(sourceContext, name);
    }

    @Override
    public boolean moveSharedPreferencesFrom(Context sourceContext, String name) {
        return delegate.moveSharedPreferencesFrom(sourceContext, name);
    }

    @Override
    public boolean moveTaskToBack(boolean nonRoot) {
        return delegate.moveTaskToBack(nonRoot);
    }

    @Override
    public boolean navigateUpTo(Intent upIntent) {
        return delegate.navigateUpTo(upIntent);
    }

    @Override
    public boolean navigateUpToFromChild(Activity child, Intent upIntent) {
        return delegate.navigateUpToFromChild(child, upIntent);
    }

    @Override
    public void onActionModeFinished(android.view.ActionMode mode) {
        delegate.onActionModeFinished(mode);
    }

    @Override
    public void onActionModeStarted(android.view.ActionMode mode) {
        delegate.onActionModeStarted(mode);
    }

    @Override
    public void onActivityReenter(int resultCode, Intent data) {
        delegate.onActivityReenter(resultCode, data);
    }

    /**
     * Dispatch incoming result to the correct fragment.
     */
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        delegate.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onApplyThemeResource(Resources.Theme theme, int resid, boolean first) {
        delegate.onApplyThemeResource(theme, resid, first);
    }

    /**
     * Called when a fragment is attached to the activity.
     * <p>
     * <p>This is called after the attached fragment's <code>onAttach</code> and before
     * the attached fragment's <code>onCreate</code> if the fragment has not yet had a previous
     * call to <code>onCreate</code>.</p>
     */
    @Override
    public void onAttachFragment(Fragment fragment) {
        delegate.onAttachFragment(fragment);
    }

    @Override
    public void onAttachFragment(android.app.Fragment fragment) {
        delegate.onAttachFragment(fragment);
    }

    @Override
    public void onAttachedToWindow() {
        delegate.onAttachedToWindow();
    }

    /**
     * Take care of popping the fragment back stack or finishing the activity
     * as appropriate.
     */
    @Override
    public void onBackPressed() {
        delegate.onBackPressed();
    }

    @Override
    public void onChildTitleChanged(Activity childActivity, CharSequence title) {
        delegate.onChildTitleChanged(childActivity, title);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        delegate.onConfigurationChanged(newConfig);
    }

    @Override
    public void onContentChanged() {
        delegate.onContentChanged();
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        return delegate.onContextItemSelected(item);
    }

    @Override
    public void onContextMenuClosed(Menu menu) {
        delegate.onContextMenuClosed(menu);
    }

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        delegate.onCreate(savedInstanceState, persistentState);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        delegate.onCreate(savedInstanceState);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
            ContextMenu.ContextMenuInfo menuInfo) {
        delegate.onCreateContextMenu(menu, v, menuInfo);
    }

    @Nullable
    @Override
    public CharSequence onCreateDescription() {
        return delegate.onCreateDescription();
    }

    /**
     * @deprecated
     */
    @Override
    public Dialog onCreateDialog(int id) {
        return delegate.onCreateDialog(id);
    }

    /**
     * @deprecated
     */
    @Nullable
    @Override
    public Dialog onCreateDialog(int id, Bundle args) {
        return delegate.onCreateDialog(id, args);
    }

    @Override
    public void onCreateNavigateUpTaskStack(TaskStackBuilder builder) {
        delegate.onCreateNavigateUpTaskStack(builder);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return delegate.onCreateOptionsMenu(menu);
    }

    /**
     * Dispatch to Fragment.onCreateOptionsMenu().
     */
    @Override
    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        return delegate.onCreatePanelMenu(featureId, menu);
    }

    @Nullable
    @Override
    public View onCreatePanelView(int featureId) {
        return delegate.onCreatePanelView(featureId);
    }

    /**
     * Support version of {@link #onCreateNavigateUpTaskStack(TaskStackBuilder)}.
     * This method will be called on all platform versions.
     * <p>
     * Define the synthetic task stack that will be generated during Up navigation from
     * a different task.
     * <p>
     * <p>The default implementation of this method adds the parent chain of this activity
     * as specified in the manifest to the supplied {@link android.support.v4.app.TaskStackBuilder}.
     * Applications
     * may choose to override this method to construct the desired task stack in a different
     * way.</p>
     * <p>
     * <p>This method will be invoked by the default implementation of {@link #onNavigateUp()}
     * if {@link #shouldUpRecreateTask(Intent)} returns true when supplied with the intent
     * returned by {@link #getParentActivityIntent()}.</p>
     * <p>
     * <p>Applications that wish to supply extra Intent parameters to the parent stack defined
     * by the manifest should override
     * {@link #onPrepareSupportNavigateUpTaskStack(android.support.v4.app.TaskStackBuilder)}.</p>
     *
     * @param builder An empty TaskStackBuilder - the application should add intents representing
     *                the desired task stack
     */
    @Override
    public void onCreateSupportNavigateUpTaskStack(
            @NonNull android.support.v4.app.TaskStackBuilder builder) {
        delegate.onCreateSupportNavigateUpTaskStack(builder);
    }

    @Override
    public boolean onCreateThumbnail(Bitmap outBitmap, Canvas canvas) {
        return delegate.onCreateThumbnail(outBitmap, canvas);
    }

    @Override
    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        return delegate.onCreateView(parent, name, context, attrs);
    }

    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        return delegate.onCreateView(name, context, attrs);
    }

    @Override
    public void onDestroy() {
        delegate.onDestroy();
    }

    @Override
    public void onDetachedFromWindow() {
        delegate.onDetachedFromWindow();
    }

    @Override
    public void onEnterAnimationComplete() {
        delegate.onEnterAnimationComplete();
    }

    @Override
    public boolean onGenericMotionEvent(MotionEvent event) {
        return delegate.onGenericMotionEvent(event);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return delegate.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        return delegate.onKeyLongPress(keyCode, event);
    }

    @Override
    public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) {
        return delegate.onKeyMultiple(keyCode, repeatCount, event);
    }

    @Override
    public boolean onKeyShortcut(int keyCode, KeyEvent event) {
        return delegate.onKeyShortcut(keyCode, event);
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        return delegate.onKeyUp(keyCode, event);
    }

    @Override
    public void onLocalVoiceInteractionStarted() {
        delegate.onLocalVoiceInteractionStarted();
    }

    @Override
    public void onLocalVoiceInteractionStopped() {
        delegate.onLocalVoiceInteractionStopped();
    }

    /**
     * Dispatch onLowMemory() to all fragments.
     */
    @Override
    public void onLowMemory() {
        delegate.onLowMemory();
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>Please note: AppCompat uses it's own feature id for the action bar:
     * {@link AppCompatDelegate#FEATURE_SUPPORT_ACTION_BAR FEATURE_SUPPORT_ACTION_BAR}.</p>
     */
    @Override
    public boolean onMenuOpened(int featureId, Menu menu) {
        return delegate.onMenuOpened(featureId, menu);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p><strong>Note:</strong> If you override this method you must call
     * <code>super.onMultiWindowModeChanged</code> to correctly dispatch the event
     * to support fragments attached to this activity.</p>
     *
     * @param isInMultiWindowMode True if the activity is in multi-window mode.
     */
    @Override
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        delegate.onMultiWindowModeChanged(isInMultiWindowMode);
    }

    @Override
    public boolean onNavigateUp() {
        return delegate.onNavigateUp();
    }

    @Override
    public boolean onNavigateUpFromChild(Activity child) {
        return delegate.onNavigateUpFromChild(child);
    }

    /**
     * Handle onNewIntent() to inform the fragment manager that the
     * state is not saved.  If you are handling new intents and may be
     * making changes to the fragment state, you want to be sure to call
     * through to the super-class here first.  Otherwise, if your state
     * is saved but the activity is not stopped, you could get an
     * onNewIntent() call which happens before onResume() and trying to
     * perform fragment operations at that point will throw IllegalStateException
     * because the fragment manager thinks the state is still saved.
     */
    @Override
    public void onNewIntent(Intent intent) {
        delegate.onNewIntent(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return delegate.onOptionsItemSelected(item);
    }

    @Override
    public void onOptionsMenuClosed(Menu menu) {
        delegate.onOptionsMenuClosed(menu);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>Please note: AppCompat uses it's own feature id for the action bar:
     * {@link AppCompatDelegate#FEATURE_SUPPORT_ACTION_BAR FEATURE_SUPPORT_ACTION_BAR}.</p>
     */
    @Override
    public void onPanelClosed(int featureId, Menu menu) {
        delegate.onPanelClosed(featureId, menu);
    }

    /**
     * Dispatch onPause() to fragments.
     */
    @Override
    public void onPause() {
        delegate.onPause();
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p><strong>Note:</strong> If you override this method you must call
     * <code>super.onPictureInPictureModeChanged</code> to correctly dispatch the event
     * to support fragments attached to this activity.</p>
     *
     * @param isInPictureInPictureMode True if the activity is in picture-in-picture mode.
     */
    @Override
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        delegate.onPictureInPictureModeChanged(isInPictureInPictureMode);
    }

    @Override
    public void onPostCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        delegate.onPostCreate(savedInstanceState, persistentState);
    }

    @Override
    public void onPostCreate(@Nullable Bundle savedInstanceState) {
        delegate.onPostCreate(savedInstanceState);
    }

    @Override
    public void onPostResume() {
        delegate.onPostResume();
    }

    /**
     * @deprecated
     */
    @Override
    public void onPrepareDialog(int id, Dialog dialog) {
        delegate.onPrepareDialog(id, dialog);
    }

    /**
     * @deprecated
     */
    @Override
    public void onPrepareDialog(int id, Dialog dialog, Bundle args) {
        delegate.onPrepareDialog(id, dialog, args);
    }

    @Override
    public void onPrepareNavigateUpTaskStack(TaskStackBuilder builder) {
        delegate.onPrepareNavigateUpTaskStack(builder);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        return delegate.onPrepareOptionsMenu(menu);
    }

    /**
     * @hide
     */
    @Override
    public boolean onPrepareOptionsPanel(View view, Menu menu) {
        return delegate.onPrepareOptionsPanel(view, menu);
    }

    /**
     * Dispatch onPrepareOptionsMenu() to fragments.
     */
    @Override
    public boolean onPreparePanel(int featureId, View view, Menu menu) {
        return delegate.onPreparePanel(featureId, view, menu);
    }

    /**
     * Support version of {@link #onPrepareNavigateUpTaskStack(TaskStackBuilder)}.
     * This method will be called on all platform versions.
     * <p>
     * Prepare the synthetic task stack that will be generated during Up navigation
     * from a different task.
     * <p>
     * <p>This method receives the {@link android.support.v4.app.TaskStackBuilder} with the
     * constructed series of
     * Intents as generated by {@link #onCreateSupportNavigateUpTaskStack(android.support.v4.app.TaskStackBuilder)}.
     * If any extra data should be added to these intents before launching the new task,
     * the application should override this method and add that data here.</p>
     *
     * @param builder A TaskStackBuilder that has been populated with Intents by
     *                onCreateNavigateUpTaskStack.
     */
    @Override
    public void onPrepareSupportNavigateUpTaskStack(
            @NonNull android.support.v4.app.TaskStackBuilder builder) {
        delegate.onPrepareSupportNavigateUpTaskStack(builder);
    }

    @Override
    public void onProvideAssistContent(AssistContent outContent) {
        delegate.onProvideAssistContent(outContent);
    }

    @Override
    public void onProvideAssistData(Bundle data) {
        delegate.onProvideAssistData(data);
    }

    @Override
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> data, Menu menu,
            int deviceId) {
        delegate.onProvideKeyboardShortcuts(data, menu, deviceId);
    }

    @Override
    public Uri onProvideReferrer() {
        return delegate.onProvideReferrer();
    }

    /**
     * Callback for the result from requesting permissions. This method
     * is invoked for every call on {@link #requestPermissions(String[], int)}.
     * <p>
     * <strong>Note:</strong> It is possible that the permissions request interaction
     * with the user is interrupted. In this case you will receive empty permissions
     * and results arrays which should be treated as a cancellation.
     * </p>
     *
     * @param requestCode  The request code passed in {@link #requestPermissions(String[], int)}.
     * @param permissions  The requested permissions. Never null.
     * @param grantResults The grant results for the corresponding permissions
     *                     which is either {@link PackageManager#PERMISSION_GRANTED}
     *                     or {@link PackageManager#PERMISSION_DENIED}. Never null.
     * @see #requestPermissions(String[], int)
     */
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
            @NonNull int[] grantResults) {
        delegate.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override
    public void onRestart() {
        delegate.onRestart();
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState,
            PersistableBundle persistentState) {
        delegate.onRestoreInstanceState(savedInstanceState, persistentState);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        delegate.onRestoreInstanceState(savedInstanceState);
    }

    /**
     * Dispatch onResume() to fragments.  Note that for better inter-operation
     * with older versions of the platform, at the point of this call the
     * fragments attached to the activity are <em>not</em> resumed.  This means
     * that in some cases the previous state may still be saved, not allowing
     * fragment transactions that modify the state.  To correctly interact
     * with fragments in their proper state, you should instead override
     * {@link #onResumeFragments()}.
     */
    @Override
    public void onResume() {
        delegate.onResume();
    }

    /**
     * This is the fragment-orientated version of {@link #onResume()} that you
     * can override to perform operations in the Activity at the same point
     * where its fragments are resumed.  Be sure to always call through to
     * the super-class.
     */
    @Override
    public void onResumeFragments() {
        delegate.onResumeFragments();
    }

    /**
     * save any object over configuration changes, get it with {@link #getLastCompositeCustomNonConfigurationInstance()}
     *
     * @return see {@link #AppCompatActivity#onRetainCustomNonConfigurationInstance()}
     */
    public Object onRetainCompositeCustomNonConfigurationInstance() {
        return null;
    }

    /**
     * use {@link #onRetainCompositeCustomNonConfigurationInstance()} instead. This is used
     * integrally
     */
    @Override
    final public Object onRetainCustomNonConfigurationInstance() {
        return delegate.onRetainNonConfigurationInstance();
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        delegate.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        delegate.onSaveInstanceState(outState);
    }

    @Override
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return delegate.onSearchRequested(searchEvent);
    }

    @Override
    public boolean onSearchRequested() {
        return delegate.onSearchRequested();
    }

    @Override
    public void onStart() {
        delegate.onStart();
    }

    /**
     * Hook in to note that fragment state is no longer saved.
     */
    @Override
    public void onStateNotSaved() {
        delegate.onStateNotSaved();
    }

    @Override
    public void onStop() {
        delegate.onStop();
    }

    /**
     * Notifies the activity that a support action mode has finished.
     * Activity subclasses overriding this method should call the superclass implementation.
     *
     * @param mode The action mode that just finished.
     */
    @Override
    public void onSupportActionModeFinished(@NonNull ActionMode mode) {
        delegate.onSupportActionModeFinished(mode);
    }

    /**
     * Notifies the Activity that a support action mode has been started.
     * Activity subclasses overriding this method should call the superclass implementation.
     *
     * @param mode The new action mode.
     */
    @Override
    public void onSupportActionModeStarted(@NonNull ActionMode mode) {
        delegate.onSupportActionModeStarted(mode);
    }

    /**
     * @deprecated Use {@link #onContentChanged()} instead.
     */
    @Override
    public void onSupportContentChanged() {
        delegate.onSupportContentChanged();
    }

    /**
     * This method is called whenever the user chooses to navigate Up within your application's
     * activity hierarchy from the action bar.
     * <p>
     * <p>If a parent was specified in the manifest for this activity or an activity-alias to it,
     * default Up navigation will be handled automatically. See
     * {@link #getSupportParentActivityIntent()} for how to specify the parent. If any activity
     * along the parent chain requires extra Intent arguments, the Activity subclass
     * should override the method {@link #onPrepareSupportNavigateUpTaskStack(android.support.v4.app.TaskStackBuilder)}
     * to supply those arguments.</p>
     * <p>
     * <p>See <a href="{@docRoot}guide/topics/fundamentals/tasks-and-back-stack.html">Tasks and
     * Back Stack</a> from the developer guide and
     * <a href="{@docRoot}design/patterns/navigation.html">Navigation</a> from the design guide
     * for more information about navigating within your app.</p>
     * <p>
     * <p>See the {@link android.support.v4.app.TaskStackBuilder} class and the Activity methods
     * {@link #getSupportParentActivityIntent()}, {@link #supportShouldUpRecreateTask(Intent)}, and
     * {@link #supportNavigateUpTo(Intent)} for help implementing custom Up navigation.</p>
     *
     * @return true if Up navigation completed successfully and this Activity was finished,
     * false otherwise.
     */
    @Override
    public boolean onSupportNavigateUp() {
        return delegate.onSupportNavigateUp();
    }

    @Override
    public void onTitleChanged(CharSequence title, int color) {
        delegate.onTitleChanged(title, color);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return delegate.onTouchEvent(event);
    }

    @Override
    public boolean onTrackballEvent(MotionEvent event) {
        return delegate.onTrackballEvent(event);
    }

    @Override
    public void onTrimMemory(int level) {
        delegate.onTrimMemory(level);
    }

    @Override
    public void onUserInteraction() {
        delegate.onUserInteraction();
    }

    @Override
    public void onUserLeaveHint() {
        delegate.onUserLeaveHint();
    }

    @Override
    public void onVisibleBehindCanceled() {
        delegate.onVisibleBehindCanceled();
    }

    @Override
    public void onWindowAttributesChanged(WindowManager.LayoutParams params) {
        delegate.onWindowAttributesChanged(params);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        delegate.onWindowFocusChanged(hasFocus);
    }

    @Nullable
    @Override
    public android.view.ActionMode onWindowStartingActionMode(
            android.view.ActionMode.Callback callback) {
        return delegate.onWindowStartingActionMode(callback);
    }

    @Nullable
    @Override
    public android.view.ActionMode onWindowStartingActionMode(
            android.view.ActionMode.Callback callback, int type) {
        return delegate.onWindowStartingActionMode(callback, type);
    }

    /**
     * Called when a support action mode is being started for this window. Gives the
     * callback an opportunity to handle the action mode in its own unique and
     * beautiful way. If this method returns null the system can choose a way
     * to present the mode or choose not to start the mode at all.
     *
     * @param callback Callback to control the lifecycle of this action mode
     * @return The ActionMode that was started, or null if the system should present it
     */
    @Nullable
    @Override
    public ActionMode onWindowStartingSupportActionMode(@NonNull ActionMode.Callback callback) {
        return delegate.onWindowStartingSupportActionMode(callback);
    }

    @Override
    public void openContextMenu(View view) {
        delegate.openContextMenu(view);
    }

    @Override
    public FileInputStream openFileInput(String name) throws FileNotFoundException {
        try {
            return delegate.openFileInput(name);
        } catch (SuppressedException e) {
            throw (FileNotFoundException) e.getCause();
        }
    }

    @Override
    public FileOutputStream openFileOutput(String name, int mode) throws FileNotFoundException {
        try {
            return delegate.openFileOutput(name, mode);
        } catch (SuppressedException e) {
            throw (FileNotFoundException) e.getCause();
        }
    }

    @Override
    public void openOptionsMenu() {
        delegate.openOptionsMenu();
    }

    @Override
    public SQLiteDatabase openOrCreateDatabase(String name, int mode,
            SQLiteDatabase.CursorFactory factory) {
        return delegate.openOrCreateDatabase(name, mode, factory);
    }

    @Override
    public SQLiteDatabase openOrCreateDatabase(String name, int mode,
            SQLiteDatabase.CursorFactory factory, DatabaseErrorHandler errorHandler) {
        return delegate.openOrCreateDatabase(name, mode, factory, errorHandler);
    }

    @Override
    public void overridePendingTransition(int enterAnim, int exitAnim) {
        delegate.overridePendingTransition(enterAnim, exitAnim);
    }

    /**
     * @deprecated
     */
    @Override
    public Drawable peekWallpaper() {
        return delegate.peekWallpaper();
    }

    @Override
    public void postponeEnterTransition() {
        delegate.postponeEnterTransition();
    }

    @Override
    public void recreate() {
        delegate.recreate();
    }

    @Override
    public void registerComponentCallbacks(ComponentCallbacks callback) {
        delegate.registerComponentCallbacks(callback);
    }

    @Override
    public void registerForContextMenu(View view) {
        delegate.registerForContextMenu(view);
    }

    @Override
    public Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter) {
        return delegate.registerReceiver(receiver, filter);
    }

    @Override
    public Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter,
            String broadcastPermission, Handler scheduler) {
        return delegate.registerReceiver(receiver, filter, broadcastPermission, scheduler);
    }

    @Override
    public boolean releaseInstance() {
        return delegate.releaseInstance();
    }

    /**
     * @deprecated
     */
    @Override
    public void removeStickyBroadcast(Intent intent) {
        delegate.removeStickyBroadcast(intent);
    }

    /**
     * @deprecated
     */
    @Override
    public void removeStickyBroadcastAsUser(Intent intent, UserHandle user) {
        delegate.removeStickyBroadcastAsUser(intent, user);
    }

    @Override
    public void reportFullyDrawn() {
        delegate.reportFullyDrawn();
    }

    @Override
    public DragAndDropPermissions requestDragAndDropPermissions(DragEvent event) {
        return delegate.requestDragAndDropPermissions(event);
    }

    @Override
    public boolean requestVisibleBehind(boolean visible) {
        return delegate.requestVisibleBehind(visible);
    }

    @Override
    public void revokeUriPermission(Uri uri, int modeFlags) {
        delegate.revokeUriPermission(uri, modeFlags);
    }

    @Override
    public void sendBroadcast(Intent intent) {
        delegate.sendBroadcast(intent);
    }

    @Override
    public void sendBroadcast(Intent intent, String receiverPermission) {
        delegate.sendBroadcast(intent, receiverPermission);
    }

    @Override
    public void sendBroadcastAsUser(Intent intent, UserHandle user) {
        delegate.sendBroadcastAsUser(intent, user);
    }

    @Override
    public void sendBroadcastAsUser(Intent intent, UserHandle user, String receiverPermission) {
        delegate.sendBroadcastAsUser(intent, user, receiverPermission);
    }

    @Override
    public void sendOrderedBroadcast(Intent intent, String receiverPermission) {
        delegate.sendOrderedBroadcast(intent, receiverPermission);
    }

    @Override
    public void sendOrderedBroadcast(Intent intent, String receiverPermission,
            BroadcastReceiver resultReceiver, Handler scheduler, int initialCode,
            String initialData, Bundle initialExtras) {
        delegate.sendOrderedBroadcast(intent, receiverPermission, resultReceiver, scheduler,
                initialCode, initialData, initialExtras);
    }

    @Override
    public void sendOrderedBroadcastAsUser(Intent intent, UserHandle user,
            String receiverPermission, BroadcastReceiver resultReceiver, Handler scheduler,
            int initialCode, String initialData, Bundle initialExtras) {
        delegate.sendOrderedBroadcastAsUser(intent, user, receiverPermission, resultReceiver,
                scheduler, initialCode, initialData, initialExtras);
    }

    /**
     * @deprecated
     */
    @Override
    public void sendStickyBroadcast(Intent intent) {
        delegate.sendStickyBroadcast(intent);
    }

    /**
     * @deprecated
     */
    @Override
    public void sendStickyBroadcastAsUser(Intent intent, UserHandle user) {
        delegate.sendStickyBroadcastAsUser(intent, user);
    }

    /**
     * @deprecated
     */
    @Override
    public void sendStickyOrderedBroadcast(Intent intent, BroadcastReceiver resultReceiver,
            Handler scheduler, int initialCode, String initialData, Bundle initialExtras) {
        delegate.sendStickyOrderedBroadcast(intent, resultReceiver, scheduler, initialCode,
                initialData, initialExtras);
    }

    /**
     * @deprecated
     */
    @Override
    public void sendStickyOrderedBroadcastAsUser(Intent intent, UserHandle user,
            BroadcastReceiver resultReceiver, Handler scheduler, int initialCode,
            String initialData, Bundle initialExtras) {
        delegate.sendStickyOrderedBroadcastAsUser(intent, user, resultReceiver, scheduler,
                initialCode, initialData, initialExtras);
    }

    @Override
    public void setActionBar(Toolbar toolbar) {
        delegate.setActionBar(toolbar);
    }

    @Override
    public void setContentTransitionManager(TransitionManager tm) {
        delegate.setContentTransitionManager(tm);
    }

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        delegate.setContentView(layoutResID);
    }

    @Override
    public void setContentView(View view) {
        delegate.setContentView(view);
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        delegate.setContentView(view, params);
    }

    /**
     * When {@link ActivityOptions#makeSceneTransitionAnimation(Activity,
     * View, String)} was used to start an Activity, <var>callback</var>
     * will be called to handle shared elements on the <i>launched</i> Activity. This requires
     * {@link Window#FEATURE_CONTENT_TRANSITIONS}.
     *
     * @param callback Used to manipulate shared element transitions on the launched Activity.
     */
    @Override
    public void setEnterSharedElementCallback(SharedElementCallback callback) {
        delegate.setEnterSharedElementCallback(callback);
    }

    @Override
    public void setEnterSharedElementCallback(android.app.SharedElementCallback callback) {
        delegate.setEnterSharedElementCallback(callback);
    }

    /**
     * When {@link ActivityOptions#makeSceneTransitionAnimation(Activity,
     * View, String)} was used to start an Activity, <var>listener</var>
     * will be called to handle shared elements on the <i>launching</i> Activity. Most
     * calls will only come when returning from the started Activity.
     * This requires {@link Window#FEATURE_CONTENT_TRANSITIONS}.
     *
     * @param listener Used to manipulate shared element transitions on the launching Activity.
     */
    @Override
    public void setExitSharedElementCallback(SharedElementCallback listener) {
        delegate.setExitSharedElementCallback(listener);
    }

    @Override
    public void setExitSharedElementCallback(android.app.SharedElementCallback callback) {
        delegate.setExitSharedElementCallback(callback);
    }

    @Override
    public void setFinishOnTouchOutside(boolean finish) {
        delegate.setFinishOnTouchOutside(finish);
    }

    @Override
    public void setImmersive(boolean i) {
        delegate.setImmersive(i);
    }

    @Override
    public void setIntent(Intent newIntent) {
        delegate.setIntent(newIntent);
    }

    @Override
    public void setRequestedOrientation(int requestedOrientation) {
        delegate.setRequestedOrientation(requestedOrientation);
    }

    /**
     * Set a {@link Toolbar Toolbar} to act as the
     * {@link ActionBar} for this Activity window.
     * <p>
     * <p>When set to a non-null value the {@link #getActionBar()} method will return
     * an {@link ActionBar} object that can be used to control the given
     * toolbar as if it were a traditional window decor action bar. The toolbar's menu will be
     * populated with the Activity's options menu and the navigation button will be wired through
     * the standard {@link android.R.id#home home} menu select action.</p>
     * <p>
     * <p>In order to use a Toolbar within the Activity's window content the application
     * must not request the window feature
     * {@link Window#FEATURE_ACTION_BAR FEATURE_SUPPORT_ACTION_BAR}.</p>
     *
     * @param toolbar Toolbar to set as the Activity's action bar, or {@code null} to clear it
     */
    @Override
    public void setSupportActionBar(@Nullable android.support.v7.widget.Toolbar toolbar) {
        delegate.setSupportActionBar(toolbar);
    }

    /**
     * @deprecated Progress bars are no longer provided in AppCompat.
     */
    @Override
    public void setSupportProgress(int progress) {
        delegate.setSupportProgress(progress);
    }

    /**
     * @deprecated Progress bars are no longer provided in AppCompat.
     */
    @Override
    public void setSupportProgressBarIndeterminate(boolean indeterminate) {
        delegate.setSupportProgressBarIndeterminate(indeterminate);
    }

    /**
     * @deprecated Progress bars are no longer provided in AppCompat.
     */
    @Override
    public void setSupportProgressBarIndeterminateVisibility(boolean visible) {
        delegate.setSupportProgressBarIndeterminateVisibility(visible);
    }

    /**
     * @deprecated Progress bars are no longer provided in AppCompat.
     */
    @Override
    public void setSupportProgressBarVisibility(boolean visible) {
        delegate.setSupportProgressBarVisibility(visible);
    }

    @Override
    public void setTaskDescription(ActivityManager.TaskDescription taskDescription) {
        delegate.setTaskDescription(taskDescription);
    }

    @Override
    public void setTheme(@StyleRes int resid) {
        delegate.setTheme(resid);
    }

    @Override
    public void setTitle(CharSequence title) {
        delegate.setTitle(title);
    }

    @Override
    public void setTitle(int titleId) {
        delegate.setTitle(titleId);
    }

    /**
     * @deprecated
     */
    @Override
    public void setTitleColor(int textColor) {
        delegate.setTitleColor(textColor);
    }

    @Override
    public void setVisible(boolean visible) {
        delegate.setVisible(visible);
    }

    @Override
    public void setVrModeEnabled(boolean enabled, ComponentName requestedComponent)
            throws PackageManager.NameNotFoundException {
        try {
            delegate.setVrModeEnabled(enabled, requestedComponent);
        } catch (SuppressedException e) {
            throw (PackageManager.NameNotFoundException) e.getCause();
        }
    }

    /**
     * @deprecated
     */
    @Override
    public void setWallpaper(Bitmap bitmap) throws IOException {
        try {
            delegate.setWallpaper(bitmap);
        } catch (SuppressedException e) {
            throw (IOException) e.getCause();
        }
    }

    /**
     * @deprecated
     */
    @Override
    public void setWallpaper(InputStream data) throws IOException {
        try {
            delegate.setWallpaper(data);
        } catch (SuppressedException e) {
            throw (IOException) e.getCause();
        }
    }

    @Override
    public boolean shouldShowRequestPermissionRationale(String permission) {
        return delegate.shouldShowRequestPermissionRationale(permission);
    }

    @Override
    public boolean shouldUpRecreateTask(Intent targetIntent) {
        return delegate.shouldUpRecreateTask(targetIntent);
    }

    @Override
    public boolean showAssist(Bundle args) {
        return delegate.showAssist(args);
    }

    @Override
    public void showLockTaskEscapeMessage() {
        delegate.showLockTaskEscapeMessage();
    }

    @Nullable
    @Override
    public android.view.ActionMode startActionMode(android.view.ActionMode.Callback callback) {
        return delegate.startActionMode(callback);
    }

    @Nullable
    @Override
    public android.view.ActionMode startActionMode(android.view.ActionMode.Callback callback,
            int type) {
        return delegate.startActionMode(callback, type);
    }

    @Override
    public void startActivities(Intent[] intents) {
        delegate.startActivities(intents);
    }

    @Override
    public void startActivities(Intent[] intents, Bundle options) {
        delegate.startActivities(intents, options);
    }

    @Override
    public void startActivity(Intent intent) {
        delegate.startActivity(intent);
    }

    @Override
    public void startActivity(Intent intent, Bundle options) {
        delegate.startActivity(intent, options);
    }

    /**
     * Modifies the standard behavior to allow results to be delivered to fragments.
     * This imposes a restriction that requestCode be <= 0xffff.
     */
    @Override
    public void startActivityForResult(Intent intent, int requestCode) {
        delegate.startActivityForResult(intent, requestCode);
    }

    @Override
    public void startActivityForResult(Intent intent, int requestCode, @Nullable Bundle options) {
        delegate.startActivityForResult(intent, requestCode, options);
    }

    @Override
    public void startActivityFromChild(Activity child, Intent intent, int requestCode) {
        delegate.startActivityFromChild(child, intent, requestCode);
    }

    @Override
    public void startActivityFromChild(Activity child, Intent intent, int requestCode,
            Bundle options) {
        delegate.startActivityFromChild(child, intent, requestCode, options);
    }

    /**
     * Called by Fragment.startActivityForResult() to implement its behavior.
     */
    @Override
    public void startActivityFromFragment(Fragment fragment, Intent intent, int requestCode) {
        delegate.startActivityFromFragment(fragment, intent, requestCode);
    }

    /**
     * Called by Fragment.startActivityForResult() to implement its behavior.
     */
    @Override
    public void startActivityFromFragment(Fragment fragment, Intent intent, int requestCode,
            @Nullable Bundle options) {
        delegate.startActivityFromFragment(fragment, intent, requestCode, options);
    }

    @Override
    public void startActivityFromFragment(android.app.Fragment fragment, Intent intent,
            int requestCode) {
        delegate.startActivityFromFragment(fragment, intent, requestCode);
    }

    @Override
    public void startActivityFromFragment(android.app.Fragment fragment, Intent intent,
            int requestCode, Bundle options) {
        delegate.startActivityFromFragment(fragment, intent, requestCode, options);
    }

    @Override
    public boolean startActivityIfNeeded(Intent intent, int requestCode) {
        return delegate.startActivityIfNeeded(intent, requestCode);
    }

    @Override
    public boolean startActivityIfNeeded(Intent intent, int requestCode, Bundle options) {
        return delegate.startActivityIfNeeded(intent, requestCode, options);
    }

    @Override
    public boolean startInstrumentation(ComponentName className, String profileFile,
            Bundle arguments) {
        return delegate.startInstrumentation(className, profileFile, arguments);
    }

    @Override
    public void startIntentSender(IntentSender intent, Intent fillInIntent, int flagsMask,
            int flagsValues, int extraFlags) throws IntentSender.SendIntentException {
        try {
            delegate.startIntentSender(intent, fillInIntent, flagsMask, flagsValues, extraFlags);
        } catch (SuppressedException e) {
            throw (IntentSender.SendIntentException) e.getCause();
        }
    }

    @Override
    public void startIntentSender(IntentSender intent, Intent fillInIntent, int flagsMask,
            int flagsValues, int extraFlags, Bundle options)
            throws IntentSender.SendIntentException {
        try {
            delegate.startIntentSender(intent, fillInIntent, flagsMask, flagsValues, extraFlags,
                    options);
        } catch (SuppressedException e) {
            throw (IntentSender.SendIntentException) e.getCause();
        }
    }

    @Override
    public void startIntentSenderForResult(IntentSender intent, int requestCode,
            @Nullable Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags,
            Bundle options) throws IntentSender.SendIntentException {
        try {
            delegate.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask,
                    flagsValues, extraFlags, options);
        } catch (SuppressedException e) {
            throw (IntentSender.SendIntentException) e.getCause();
        }
    }

    @Override
    public void startIntentSenderForResult(IntentSender intent, int requestCode,
            @Nullable Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags)
            throws IntentSender.SendIntentException {
        try {
            delegate.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask,
                    flagsValues, extraFlags);
        } catch (SuppressedException e) {
            throw (IntentSender.SendIntentException) e.getCause();
        }
    }

    @Override
    public void startIntentSenderFromChild(Activity child, IntentSender intent, int requestCode,
            Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags)
            throws IntentSender.SendIntentException {
        try {
            delegate.startIntentSenderFromChild(child, intent, requestCode, fillInIntent, flagsMask,
                    flagsValues, extraFlags);
        } catch (SuppressedException e) {
            throw (IntentSender.SendIntentException) e.getCause();
        }
    }

    @Override
    public void startIntentSenderFromChild(Activity child, IntentSender intent, int requestCode,
            Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options)
            throws IntentSender.SendIntentException {
        try {
            delegate.startIntentSenderFromChild(child, intent, requestCode, fillInIntent, flagsMask,
                    flagsValues, extraFlags, options);
        } catch (SuppressedException e) {
            throw (IntentSender.SendIntentException) e.getCause();
        }
    }

    /**
     * Called by Fragment.startIntentSenderForResult() to implement its behavior.
     */
    @Override
    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intent,
            int requestCode, @Nullable Intent fillInIntent, int flagsMask, int flagsValues,
            int extraFlags, Bundle options) throws IntentSender.SendIntentException {
        try {
            delegate.startIntentSenderFromFragment(fragment, intent, requestCode, fillInIntent,
                    flagsMask, flagsValues, extraFlags, options);
        } catch (SuppressedException e) {
            throw (IntentSender.SendIntentException) e.getCause();
        }
    }

    @Override
    public void startLocalVoiceInteraction(Bundle privateOptions) {
        delegate.startLocalVoiceInteraction(privateOptions);
    }

    @Override
    public void startLockTask() {
        delegate.startLockTask();
    }

    /**
     * @deprecated
     */
    @Override
    public void startManagingCursor(Cursor c) {
        delegate.startManagingCursor(c);
    }

    @Override
    public boolean startNextMatchingActivity(Intent intent) {
        return delegate.startNextMatchingActivity(intent);
    }

    @Override
    public boolean startNextMatchingActivity(Intent intent, Bundle options) {
        return delegate.startNextMatchingActivity(intent, options);
    }

    @Override
    public void startPostponedEnterTransition() {
        delegate.startPostponedEnterTransition();
    }

    @Override
    public void startSearch(String initialQuery, boolean selectInitialQuery, Bundle appSearchData,
            boolean globalSearch) {
        delegate.startSearch(initialQuery, selectInitialQuery, appSearchData, globalSearch);
    }

    @Override
    public ComponentName startService(Intent service) {
        return delegate.startService(service);
    }

    /**
     * Start an action mode.
     *
     * @param callback Callback that will manage lifecycle events for this context mode
     * @return The ContextMode that was started, or null if it was canceled
     */
    @Nullable
    @Override
    public ActionMode startSupportActionMode(@NonNull ActionMode.Callback callback) {
        return delegate.startSupportActionMode(callback);
    }

    @Override
    public void stopLocalVoiceInteraction() {
        delegate.stopLocalVoiceInteraction();
    }

    @Override
    public void stopLockTask() {
        delegate.stopLockTask();
    }

    /**
     * @deprecated
     */
    @Override
    public void stopManagingCursor(Cursor c) {
        delegate.stopManagingCursor(c);
    }

    @Override
    public boolean stopService(Intent name) {
        return delegate.stopService(name);
    }

    @Override
    public void super_addContentView(View view, ViewGroup.LayoutParams params) {
        super.addContentView(view, params);
    }

    @Override
    public void super_applyOverrideConfiguration(Configuration overrideConfiguration) {
        super.applyOverrideConfiguration(overrideConfiguration);
    }

    @Override
    public void super_attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
    }

    @Override
    public boolean super_bindService(Intent service, ServiceConnection conn, int flags) {
        return super.bindService(service, conn, flags);
    }

    @Override
    public int super_checkCallingOrSelfPermission(String permission) {
        return super.checkCallingOrSelfPermission(permission);
    }

    @Override
    public int super_checkCallingOrSelfUriPermission(Uri uri, int modeFlags) {
        return super.checkCallingOrSelfUriPermission(uri, modeFlags);
    }

    @Override
    public int super_checkCallingPermission(String permission) {
        return super.checkCallingPermission(permission);
    }

    @Override
    public int super_checkCallingUriPermission(Uri uri, int modeFlags) {
        return super.checkCallingUriPermission(uri, modeFlags);
    }

    @Override
    public int super_checkPermission(String permission, int pid, int uid) {
        return super.checkPermission(permission, pid, uid);
    }

    @Override
    public int super_checkSelfPermission(String permission) {
        return super.checkSelfPermission(permission);
    }

    @Override
    public int super_checkUriPermission(Uri uri, int pid, int uid, int modeFlags) {
        return super.checkUriPermission(uri, pid, uid, modeFlags);
    }

    @Override
    public int super_checkUriPermission(Uri uri, String readPermission, String writePermission,
            int pid, int uid, int modeFlags) {
        return super.checkUriPermission(uri, readPermission, writePermission, pid, uid, modeFlags);
    }

    @Override
    public void super_clearWallpaper() throws IOException {
        super.clearWallpaper();
    }

    @Override
    public void super_closeContextMenu() {
        super.closeContextMenu();
    }

    @Override
    public void super_closeOptionsMenu() {
        super.closeOptionsMenu();
    }

    @Override
    public Context super_createConfigurationContext(Configuration overrideConfiguration) {
        return super.createConfigurationContext(overrideConfiguration);
    }

    @Override
    public Context super_createDeviceProtectedStorageContext() {
        return super.createDeviceProtectedStorageContext();
    }

    @Override
    public Context super_createDisplayContext(Display display) {
        return super.createDisplayContext(display);
    }

    @Override
    public Context super_createPackageContext(String packageName, int flags)
            throws PackageManager.NameNotFoundException {
        return super.createPackageContext(packageName, flags);
    }

    @Override
    public PendingIntent super_createPendingResult(int requestCode, Intent data, int flags) {
        return super.createPendingResult(requestCode, data, flags);
    }

    @Override
    public String[] super_databaseList() {
        return super.databaseList();
    }

    @Override
    public boolean super_deleteDatabase(String name) {
        return super.deleteDatabase(name);
    }

    @Override
    public boolean super_deleteFile(String name) {
        return super.deleteFile(name);
    }

    @Override
    public boolean super_deleteSharedPreferences(String name) {
        return super.deleteSharedPreferences(name);
    }

    @Override
    public boolean super_dispatchGenericMotionEvent(MotionEvent ev) {
        return super.dispatchGenericMotionEvent(ev);
    }

    @Override
    public boolean super_dispatchKeyEvent(KeyEvent event) {
        return super.dispatchKeyEvent(event);
    }

    @Override
    public boolean super_dispatchKeyShortcutEvent(KeyEvent event) {
        return super.dispatchKeyShortcutEvent(event);
    }

    @Override
    public boolean super_dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        return super.dispatchPopulateAccessibilityEvent(event);
    }

    @Override
    public boolean super_dispatchTouchEvent(MotionEvent ev) {
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean super_dispatchTrackballEvent(MotionEvent ev) {
        return super.dispatchTrackballEvent(ev);
    }

    @Override
    public void super_dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        super.dump(prefix, fd, writer, args);
    }

    @Override
    public void super_enforceCallingOrSelfPermission(String permission, String message) {
        super.enforceCallingOrSelfPermission(permission, message);
    }

    @Override
    public void super_enforceCallingOrSelfUriPermission(Uri uri, int modeFlags, String message) {
        super.enforceCallingOrSelfUriPermission(uri, modeFlags, message);
    }

    @Override
    public void super_enforceCallingPermission(String permission, String message) {
        super.enforceCallingPermission(permission, message);
    }

    @Override
    public void super_enforceCallingUriPermission(Uri uri, int modeFlags, String message) {
        super.enforceCallingUriPermission(uri, modeFlags, message);
    }

    @Override
    public void super_enforcePermission(String permission, int pid, int uid, String message) {
        super.enforcePermission(permission, pid, uid, message);
    }

    @Override
    public void super_enforceUriPermission(Uri uri, int pid, int uid, int modeFlags,
            String message) {
        super.enforceUriPermission(uri, pid, uid, modeFlags, message);
    }

    @Override
    public void super_enforceUriPermission(Uri uri, String readPermission, String writePermission,
            int pid, int uid, int modeFlags, String message) {
        super.enforceUriPermission(uri, readPermission, writePermission, pid, uid, modeFlags,
                message);
    }

    @Override
    public void super_enterPictureInPictureMode() {
        super.enterPictureInPictureMode();
    }

    @Override
    public String[] super_fileList() {
        return super.fileList();
    }

    @Override
    public View super_findViewById(@IdRes int id) {
        return super.findViewById(id);
    }

    @Override
    public void super_finish() {
        super.finish();
    }

    @Override
    public void super_finishActivity(int requestCode) {
        super.finishActivity(requestCode);
    }

    @Override
    public void super_finishActivityFromChild(Activity child, int requestCode) {
        super.finishActivityFromChild(child, requestCode);
    }

    @Override
    public void super_finishAffinity() {
        super.finishAffinity();
    }

    @Override
    public void super_finishAfterTransition() {
        super.finishAfterTransition();
    }

    @Override
    public void super_finishAndRemoveTask() {
        super.finishAndRemoveTask();
    }

    @Override
    public void super_finishFromChild(Activity child) {
        super.finishFromChild(child);
    }

    @Nullable
    @Override
    public android.app.ActionBar super_getActionBar() {
        return super.getActionBar();
    }

    @Override
    public Context super_getApplicationContext() {
        return super.getApplicationContext();
    }

    @Override
    public ApplicationInfo super_getApplicationInfo() {
        return super.getApplicationInfo();
    }

    @Override
    public AssetManager super_getAssets() {
        return super.getAssets();
    }

    @Override
    public Context super_getBaseContext() {
        return super.getBaseContext();
    }

    @Override
    public File super_getCacheDir() {
        return super.getCacheDir();
    }

    @Nullable
    @Override
    public ComponentName super_getCallingActivity() {
        return super.getCallingActivity();
    }

    @Nullable
    @Override
    public String super_getCallingPackage() {
        return super.getCallingPackage();
    }

    @Override
    public int super_getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override
    public ClassLoader super_getClassLoader() {
        return super.getClassLoader();
    }

    @Override
    public File super_getCodeCacheDir() {
        return super.getCodeCacheDir();
    }

    @Override
    public ComponentName super_getComponentName() {
        return super.getComponentName();
    }

    @Override
    public ContentResolver super_getContentResolver() {
        return super.getContentResolver();
    }

    @Override
    public Scene super_getContentScene() {
        return super.getContentScene();
    }

    @Override
    public TransitionManager super_getContentTransitionManager() {
        return super.getContentTransitionManager();
    }

    @Nullable
    @Override
    public View super_getCurrentFocus() {
        return super.getCurrentFocus();
    }

    @Override
    public File super_getDataDir() {
        return super.getDataDir();
    }

    @Override
    public File super_getDatabasePath(String name) {
        return super.getDatabasePath(name);
    }

    @NonNull
    @Override
    public AppCompatDelegate super_getDelegate() {
        return super.getDelegate();
    }

    @Override
    public File super_getDir(String name, int mode) {
        return super.getDir(name, mode);
    }

    @Nullable
    @Override
    public ActionBarDrawerToggle.Delegate super_getDrawerToggleDelegate() {
        return super.getDrawerToggleDelegate();
    }

    @Override
    public File super_getExternalCacheDir() {
        return super.getExternalCacheDir();
    }

    @Override
    public File[] super_getExternalCacheDirs() {
        return super.getExternalCacheDirs();
    }

    @Override
    public File super_getExternalFilesDir(String type) {
        return super.getExternalFilesDir(type);
    }

    @Override
    public File[] super_getExternalFilesDirs(String type) {
        return super.getExternalFilesDirs(type);
    }

    @Override
    public File[] super_getExternalMediaDirs() {
        return super.getExternalMediaDirs();
    }

    @Override
    public File super_getFileStreamPath(String name) {
        return super.getFileStreamPath(name);
    }

    @Override
    public File super_getFilesDir() {
        return super.getFilesDir();
    }

    @Override
    public android.app.FragmentManager super_getFragmentManager() {
        return super.getFragmentManager();
    }

    @Override
    public Intent super_getIntent() {
        return super.getIntent();
    }

    @NonNull
    @Override
    public LayoutInflater super_getLayoutInflater() {
        return super.getLayoutInflater();
    }

    @Override
    public android.app.LoaderManager super_getLoaderManager() {
        return super.getLoaderManager();
    }

    @NonNull
    @Override
    public String super_getLocalClassName() {
        return super.getLocalClassName();
    }

    @Override
    public Looper super_getMainLooper() {
        return super.getMainLooper();
    }

    @Override
    public MenuInflater super_getMenuInflater() {
        return super.getMenuInflater();
    }

    @Override
    public File super_getNoBackupFilesDir() {
        return super.getNoBackupFilesDir();
    }

    @Override
    public File super_getObbDir() {
        return super.getObbDir();
    }

    @Override
    public File[] super_getObbDirs() {
        return super.getObbDirs();
    }

    @Override
    public String super_getPackageCodePath() {
        return super.getPackageCodePath();
    }

    @Override
    public PackageManager super_getPackageManager() {
        return super.getPackageManager();
    }

    @Override
    public String super_getPackageName() {
        return super.getPackageName();
    }

    @Override
    public String super_getPackageResourcePath() {
        return super.getPackageResourcePath();
    }

    @Nullable
    @Override
    public Intent super_getParentActivityIntent() {
        return super.getParentActivityIntent();
    }

    @Override
    public SharedPreferences super_getPreferences(int mode) {
        return super.getPreferences(mode);
    }

    @Nullable
    @Override
    public Uri super_getReferrer() {
        return super.getReferrer();
    }

    @Override
    public int super_getRequestedOrientation() {
        return super.getRequestedOrientation();
    }

    @Override
    public Resources super_getResources() {
        return super.getResources();
    }

    @Override
    public SharedPreferences super_getSharedPreferences(String name, int mode) {
        return super.getSharedPreferences(name, mode);
    }

    @Nullable
    @Override
    public ActionBar super_getSupportActionBar() {
        return super.getSupportActionBar();
    }

    @Override
    public FragmentManager super_getSupportFragmentManager() {
        return super.getSupportFragmentManager();
    }

    @Override
    public LoaderManager super_getSupportLoaderManager() {
        return super.getSupportLoaderManager();
    }

    @Nullable
    @Override
    public Intent super_getSupportParentActivityIntent() {
        return super.getSupportParentActivityIntent();
    }

    @Override
    public Object super_getSystemService(String name) {
        return super.getSystemService(name);
    }

    @Override
    public String super_getSystemServiceName(Class<?> serviceClass) {
        return super.getSystemServiceName(serviceClass);
    }

    @Override
    public int super_getTaskId() {
        return super.getTaskId();
    }

    @Override
    public Resources.Theme super_getTheme() {
        return super.getTheme();
    }

    @Override
    public VoiceInteractor super_getVoiceInteractor() {
        return super.getVoiceInteractor();
    }

    @Override
    public Drawable super_getWallpaper() {
        return super.getWallpaper();
    }

    @Override
    public int super_getWallpaperDesiredMinimumHeight() {
        return super.getWallpaperDesiredMinimumHeight();
    }

    @Override
    public int super_getWallpaperDesiredMinimumWidth() {
        return super.getWallpaperDesiredMinimumWidth();
    }

    @Override
    public Window super_getWindow() {
        return super.getWindow();
    }

    @Override
    public WindowManager super_getWindowManager() {
        return super.getWindowManager();
    }

    @Override
    public void super_grantUriPermission(String toPackage, Uri uri, int modeFlags) {
        super.grantUriPermission(toPackage, uri, modeFlags);
    }

    @Override
    public boolean super_hasWindowFocus() {
        return super.hasWindowFocus();
    }

    @Override
    public void super_invalidateOptionsMenu() {
        super.invalidateOptionsMenu();
    }

    @Override
    public boolean super_isChangingConfigurations() {
        return super.isChangingConfigurations();
    }

    @Override
    public boolean super_isDestroyed() {
        return super.isDestroyed();
    }

    @Override
    public boolean super_isDeviceProtectedStorage() {
        return super.isDeviceProtectedStorage();
    }

    @Override
    public boolean super_isFinishing() {
        return super.isFinishing();
    }

    @Override
    public boolean super_isImmersive() {
        return super.isImmersive();
    }

    @Override
    public boolean super_isInMultiWindowMode() {
        return super.isInMultiWindowMode();
    }

    @Override
    public boolean super_isInPictureInPictureMode() {
        return super.isInPictureInPictureMode();
    }

    @Override
    public boolean super_isLocalVoiceInteractionSupported() {
        return super.isLocalVoiceInteractionSupported();
    }

    @Override
    public boolean super_isRestricted() {
        return super.isRestricted();
    }

    @Override
    public boolean super_isTaskRoot() {
        return super.isTaskRoot();
    }

    @Override
    public boolean super_isVoiceInteraction() {
        return super.isVoiceInteraction();
    }

    @Override
    public boolean super_isVoiceInteractionRoot() {
        return super.isVoiceInteractionRoot();
    }

    @Override
    public boolean super_moveDatabaseFrom(Context sourceContext, String name) {
        return super.moveDatabaseFrom(sourceContext, name);
    }

    @Override
    public boolean super_moveSharedPreferencesFrom(Context sourceContext, String name) {
        return super.moveSharedPreferencesFrom(sourceContext, name);
    }

    @Override
    public boolean super_moveTaskToBack(boolean nonRoot) {
        return super.moveTaskToBack(nonRoot);
    }

    @Override
    public boolean super_navigateUpTo(Intent upIntent) {
        return super.navigateUpTo(upIntent);
    }

    @Override
    public boolean super_navigateUpToFromChild(Activity child, Intent upIntent) {
        return super.navigateUpToFromChild(child, upIntent);
    }

    @Override
    public void super_onActionModeFinished(android.view.ActionMode mode) {
        super.onActionModeFinished(mode);
    }

    @Override
    public void super_onActionModeStarted(android.view.ActionMode mode) {
        super.onActionModeStarted(mode);
    }

    @Override
    public void super_onActivityReenter(int resultCode, Intent data) {
        super.onActivityReenter(resultCode, data);
    }

    @Override
    public void super_onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void super_onApplyThemeResource(Resources.Theme theme, int resid, boolean first) {
        super.onApplyThemeResource(theme, resid, first);
    }

    @Override
    public void super_onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
    }

    @Override
    public void super_onAttachFragment(android.app.Fragment fragment) {
        super.onAttachFragment(fragment);
    }

    @Override
    public void super_onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    public void super_onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public void super_onChildTitleChanged(Activity childActivity, CharSequence title) {
        super.onChildTitleChanged(childActivity, title);
    }

    @Override
    public void super_onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void super_onContentChanged() {
        super.onContentChanged();
    }

    @Override
    public boolean super_onContextItemSelected(MenuItem item) {
        return super.onContextItemSelected(item);
    }

    @Override
    public void super_onContextMenuClosed(Menu menu) {
        super.onContextMenuClosed(menu);
    }

    @Override
    public void super_onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }

    @Override
    public void super_onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void super_onCreateContextMenu(ContextMenu menu, View v,
            ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Nullable
    @Override
    public CharSequence super_onCreateDescription() {
        return super.onCreateDescription();
    }

    @Override
    public Dialog super_onCreateDialog(int id) {
        return super.onCreateDialog(id);
    }

    @Nullable
    @Override
    public Dialog super_onCreateDialog(int id, Bundle args) {
        return super.onCreateDialog(id, args);
    }

    @Override
    public void super_onCreateNavigateUpTaskStack(TaskStackBuilder builder) {
        super.onCreateNavigateUpTaskStack(builder);
    }

    @Override
    public boolean super_onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean super_onCreatePanelMenu(int featureId, Menu menu) {
        return super.onCreatePanelMenu(featureId, menu);
    }

    @Nullable
    @Override
    public View super_onCreatePanelView(int featureId) {
        return super.onCreatePanelView(featureId);
    }

    @Override
    public void super_onCreateSupportNavigateUpTaskStack(
            @NonNull android.support.v4.app.TaskStackBuilder builder) {
        super.onCreateSupportNavigateUpTaskStack(builder);
    }

    @Override
    public boolean super_onCreateThumbnail(Bitmap outBitmap, Canvas canvas) {
        return super.onCreateThumbnail(outBitmap, canvas);
    }

    @Override
    public View super_onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        return super.onCreateView(parent, name, context, attrs);
    }

    @Override
    public View super_onCreateView(String name, Context context, AttributeSet attrs) {
        return super.onCreateView(name, context, attrs);
    }

    @Override
    public void super_onDestroy() {
        super.onDestroy();
    }

    @Override
    public void super_onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override
    public void super_onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
    }

    @Override
    public boolean super_onGenericMotionEvent(MotionEvent event) {
        return super.onGenericMotionEvent(event);
    }

    @Override
    public boolean super_onKeyDown(int keyCode, KeyEvent event) {
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean super_onKeyLongPress(int keyCode, KeyEvent event) {
        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public boolean super_onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) {
        return super.onKeyMultiple(keyCode, repeatCount, event);
    }

    @Override
    public boolean super_onKeyShortcut(int keyCode, KeyEvent event) {
        return super.onKeyShortcut(keyCode, event);
    }

    @Override
    public boolean super_onKeyUp(int keyCode, KeyEvent event) {
        return super.onKeyUp(keyCode, event);
    }

    @Override
    public void super_onLocalVoiceInteractionStarted() {
        super.onLocalVoiceInteractionStarted();
    }

    @Override
    public void super_onLocalVoiceInteractionStopped() {
        super.onLocalVoiceInteractionStopped();
    }

    @Override
    public void super_onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public boolean super_onMenuOpened(int featureId, Menu menu) {
        return super.onMenuOpened(featureId, menu);
    }

    @Override
    public void super_onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        super.onMultiWindowModeChanged(isInMultiWindowMode);
    }

    @Override
    public boolean super_onNavigateUp() {
        return super.onNavigateUp();
    }

    @Override
    public boolean super_onNavigateUpFromChild(Activity child) {
        return super.onNavigateUpFromChild(child);
    }

    @Override
    public void super_onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    @Override
    public boolean super_onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void super_onOptionsMenuClosed(Menu menu) {
        super.onOptionsMenuClosed(menu);
    }

    @Override
    public void super_onPanelClosed(int featureId, Menu menu) {
        super.onPanelClosed(featureId, menu);
    }

    @Override
    public void super_onPause() {
        super.onPause();
    }

    @Override
    public void super_onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        super.onPictureInPictureModeChanged(isInPictureInPictureMode);
    }

    @Override
    public void super_onPostCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onPostCreate(savedInstanceState, persistentState);
    }

    @Override
    public void super_onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
    }

    @Override
    public void super_onPostResume() {
        super.onPostResume();
    }

    @Override
    public void super_onPrepareDialog(int id, Dialog dialog) {
        super.onPrepareDialog(id, dialog);
    }

    @Override
    public void super_onPrepareDialog(int id, Dialog dialog, Bundle args) {
        super.onPrepareDialog(id, dialog, args);
    }

    @Override
    public void super_onPrepareNavigateUpTaskStack(TaskStackBuilder builder) {
        super.onPrepareNavigateUpTaskStack(builder);
    }

    @Override
    public boolean super_onPrepareOptionsMenu(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean super_onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPrepareOptionsPanel(view, menu);
    }

    @Override
    public boolean super_onPreparePanel(int featureId, View view, Menu menu) {
        return super.onPreparePanel(featureId, view, menu);
    }

    @Override
    public void super_onPrepareSupportNavigateUpTaskStack(
            @NonNull android.support.v4.app.TaskStackBuilder builder) {
        super.onPrepareSupportNavigateUpTaskStack(builder);
    }

    @Override
    public void super_onProvideAssistContent(AssistContent outContent) {
        super.onProvideAssistContent(outContent);
    }

    @Override
    public void super_onProvideAssistData(Bundle data) {
        super.onProvideAssistData(data);
    }

    @Override
    public void super_onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> data, Menu menu,
            int deviceId) {
        super.onProvideKeyboardShortcuts(data, menu, deviceId);
    }

    @Override
    public Uri super_onProvideReferrer() {
        return super.onProvideReferrer();
    }

    @Override
    public void super_onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
            @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override
    public void super_onRestart() {
        super.onRestart();
    }

    @Override
    public void super_onRestoreInstanceState(Bundle savedInstanceState,
            PersistableBundle persistentState) {
        super.onRestoreInstanceState(savedInstanceState, persistentState);
    }

    @Override
    public void super_onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public void super_onResume() {
        super.onResume();
    }

    @Override
    public void super_onResumeFragments() {
        super.onResumeFragments();
    }

    @Override
    public void super_onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    public void super_onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    public boolean super_onSearchRequested(SearchEvent searchEvent) {
        return super.onSearchRequested(searchEvent);
    }

    @Override
    public boolean super_onSearchRequested() {
        return super.onSearchRequested();
    }

    @Override
    public void super_onStart() {
        super.onStart();
    }

    @Override
    public void super_onStateNotSaved() {
        super.onStateNotSaved();
    }

    @Override
    public void super_onStop() {
        super.onStop();
    }

    @Override
    public void super_onSupportActionModeFinished(@NonNull ActionMode mode) {
        super.onSupportActionModeFinished(mode);
    }

    @Override
    public void super_onSupportActionModeStarted(@NonNull ActionMode mode) {
        super.onSupportActionModeStarted(mode);
    }

    @Override
    public void super_onSupportContentChanged() {
        super.onSupportContentChanged();
    }

    @Override
    public boolean super_onSupportNavigateUp() {
        return super.onSupportNavigateUp();
    }

    @Override
    public void super_onTitleChanged(CharSequence title, int color) {
        super.onTitleChanged(title, color);
    }

    @Override
    public boolean super_onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }

    @Override
    public boolean super_onTrackballEvent(MotionEvent event) {
        return super.onTrackballEvent(event);
    }

    @Override
    public void super_onTrimMemory(int level) {
        super.onTrimMemory(level);
    }

    @Override
    public void super_onUserInteraction() {
        super.onUserInteraction();
    }

    @Override
    public void super_onUserLeaveHint() {
        super.onUserLeaveHint();
    }

    @Override
    public void super_onVisibleBehindCanceled() {
        super.onVisibleBehindCanceled();
    }

    @Override
    public void super_onWindowAttributesChanged(WindowManager.LayoutParams params) {
        super.onWindowAttributesChanged(params);
    }

    @Override
    public void super_onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
    }

    @Nullable
    @Override
    public android.view.ActionMode super_onWindowStartingActionMode(
            android.view.ActionMode.Callback callback) {
        return super.onWindowStartingActionMode(callback);
    }

    @Nullable
    @Override
    public android.view.ActionMode super_onWindowStartingActionMode(
            android.view.ActionMode.Callback callback, int type) {
        return super.onWindowStartingActionMode(callback, type);
    }

    @Nullable
    @Override
    public ActionMode super_onWindowStartingSupportActionMode(
            @NonNull ActionMode.Callback callback) {
        return super.onWindowStartingSupportActionMode(callback);
    }

    @Override
    public void super_openContextMenu(View view) {
        super.openContextMenu(view);
    }

    @Override
    public FileInputStream super_openFileInput(String name) throws FileNotFoundException {
        return super.openFileInput(name);
    }

    @Override
    public FileOutputStream super_openFileOutput(String name, int mode)
            throws FileNotFoundException {
        return super.openFileOutput(name, mode);
    }

    @Override
    public void super_openOptionsMenu() {
        super.openOptionsMenu();
    }

    @Override
    public SQLiteDatabase super_openOrCreateDatabase(String name, int mode,
            SQLiteDatabase.CursorFactory factory) {
        return super.openOrCreateDatabase(name, mode, factory);
    }

    @Override
    public SQLiteDatabase super_openOrCreateDatabase(String name, int mode,
            SQLiteDatabase.CursorFactory factory, DatabaseErrorHandler errorHandler) {
        return super.openOrCreateDatabase(name, mode, factory, errorHandler);
    }

    @Override
    public void super_overridePendingTransition(int enterAnim, int exitAnim) {
        super.overridePendingTransition(enterAnim, exitAnim);
    }

    @Override
    public Drawable super_peekWallpaper() {
        return super.peekWallpaper();
    }

    @Override
    public void super_postponeEnterTransition() {
        super.postponeEnterTransition();
    }

    @Override
    public void super_recreate() {
        super.recreate();
    }

    @Override
    public void super_registerComponentCallbacks(ComponentCallbacks callback) {
        super.registerComponentCallbacks(callback);
    }

    @Override
    public void super_registerForContextMenu(View view) {
        super.registerForContextMenu(view);
    }

    @Override
    public Intent super_registerReceiver(BroadcastReceiver receiver, IntentFilter filter) {
        return super.registerReceiver(receiver, filter);
    }

    @Override
    public Intent super_registerReceiver(BroadcastReceiver receiver, IntentFilter filter,
            String broadcastPermission, Handler scheduler) {
        return super.registerReceiver(receiver, filter, broadcastPermission, scheduler);
    }

    @Override
    public boolean super_releaseInstance() {
        return super.releaseInstance();
    }

    @Override
    public void super_removeStickyBroadcast(Intent intent) {
        super.removeStickyBroadcast(intent);
    }

    @Override
    public void super_removeStickyBroadcastAsUser(Intent intent, UserHandle user) {
        super.removeStickyBroadcastAsUser(intent, user);
    }

    @Override
    public void super_reportFullyDrawn() {
        super.reportFullyDrawn();
    }

    @Override
    public DragAndDropPermissions super_requestDragAndDropPermissions(DragEvent event) {
        return super.requestDragAndDropPermissions(event);
    }

    @Override
    public boolean super_requestVisibleBehind(boolean visible) {
        return super.requestVisibleBehind(visible);
    }

    @Override
    public void super_revokeUriPermission(Uri uri, int modeFlags) {
        super.revokeUriPermission(uri, modeFlags);
    }

    @Override
    public void super_sendBroadcast(Intent intent) {
        super.sendBroadcast(intent);
    }

    @Override
    public void super_sendBroadcast(Intent intent, String receiverPermission) {
        super.sendBroadcast(intent, receiverPermission);
    }

    @Override
    public void super_sendBroadcastAsUser(Intent intent, UserHandle user) {
        super.sendBroadcastAsUser(intent, user);
    }

    @Override
    public void super_sendBroadcastAsUser(Intent intent, UserHandle user,
            String receiverPermission) {
        super.sendBroadcastAsUser(intent, user, receiverPermission);
    }

    @Override
    public void super_sendOrderedBroadcast(Intent intent, String receiverPermission) {
        super.sendOrderedBroadcast(intent, receiverPermission);
    }

    @Override
    public void super_sendOrderedBroadcast(Intent intent, String receiverPermission,
            BroadcastReceiver resultReceiver, Handler scheduler, int initialCode,
            String initialData, Bundle initialExtras) {
        super.sendOrderedBroadcast(intent, receiverPermission, resultReceiver, scheduler,
                initialCode, initialData, initialExtras);
    }

    @Override
    public void super_sendOrderedBroadcastAsUser(Intent intent, UserHandle user,
            String receiverPermission, BroadcastReceiver resultReceiver, Handler scheduler,
            int initialCode, String initialData, Bundle initialExtras) {
        super.sendOrderedBroadcastAsUser(intent, user, receiverPermission, resultReceiver,
                scheduler, initialCode, initialData, initialExtras);
    }

    @Override
    public void super_sendStickyBroadcast(Intent intent) {
        super.sendStickyBroadcast(intent);
    }

    @Override
    public void super_sendStickyBroadcastAsUser(Intent intent, UserHandle user) {
        super.sendStickyBroadcastAsUser(intent, user);
    }

    @Override
    public void super_sendStickyOrderedBroadcast(Intent intent, BroadcastReceiver resultReceiver,
            Handler scheduler, int initialCode, String initialData, Bundle initialExtras) {
        super.sendStickyOrderedBroadcast(intent, resultReceiver, scheduler, initialCode,
                initialData, initialExtras);
    }

    @Override
    public void super_sendStickyOrderedBroadcastAsUser(Intent intent, UserHandle user,
            BroadcastReceiver resultReceiver, Handler scheduler, int initialCode,
            String initialData, Bundle initialExtras) {
        super.sendStickyOrderedBroadcastAsUser(intent, user, resultReceiver, scheduler, initialCode,
                initialData, initialExtras);
    }

    @Override
    public void super_setActionBar(Toolbar toolbar) {
        super.setActionBar(toolbar);
    }

    @Override
    public void super_setContentTransitionManager(TransitionManager tm) {
        super.setContentTransitionManager(tm);
    }

    @Override
    public void super_setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
    }

    @Override
    public void super_setContentView(View view) {
        super.setContentView(view);
    }

    @Override
    public void super_setContentView(View view, ViewGroup.LayoutParams params) {
        super.setContentView(view, params);
    }

    @Override
    public void super_setEnterSharedElementCallback(SharedElementCallback callback) {
        super.setEnterSharedElementCallback(callback);
    }

    @Override
    public void super_setEnterSharedElementCallback(android.app.SharedElementCallback callback) {
        super.setEnterSharedElementCallback(callback);
    }

    @Override
    public void super_setExitSharedElementCallback(SharedElementCallback listener) {
        super.setExitSharedElementCallback(listener);
    }

    @Override
    public void super_setExitSharedElementCallback(android.app.SharedElementCallback callback) {
        super.setExitSharedElementCallback(callback);
    }

    @Override
    public void super_setFinishOnTouchOutside(boolean finish) {
        super.setFinishOnTouchOutside(finish);
    }

    @Override
    public void super_setImmersive(boolean i) {
        super.setImmersive(i);
    }

    @Override
    public void super_setIntent(Intent newIntent) {
        super.setIntent(newIntent);
    }

    @Override
    public void super_setRequestedOrientation(int requestedOrientation) {
        super.setRequestedOrientation(requestedOrientation);
    }

    @Override
    public void super_setSupportActionBar(@Nullable android.support.v7.widget.Toolbar toolbar) {
        super.setSupportActionBar(toolbar);
    }

    @Override
    public void super_setSupportProgress(int progress) {
        super.setSupportProgress(progress);
    }

    @Override
    public void super_setSupportProgressBarIndeterminate(boolean indeterminate) {
        super.setSupportProgressBarIndeterminate(indeterminate);
    }

    @Override
    public void super_setSupportProgressBarIndeterminateVisibility(boolean visible) {
        super.setSupportProgressBarIndeterminateVisibility(visible);
    }

    @Override
    public void super_setSupportProgressBarVisibility(boolean visible) {
        super.setSupportProgressBarVisibility(visible);
    }

    @Override
    public void super_setTaskDescription(ActivityManager.TaskDescription taskDescription) {
        super.setTaskDescription(taskDescription);
    }

    @Override
    public void super_setTheme(@StyleRes int resid) {
        super.setTheme(resid);
    }

    @Override
    public void super_setTitle(CharSequence title) {
        super.setTitle(title);
    }

    @Override
    public void super_setTitle(int titleId) {
        super.setTitle(titleId);
    }

    @Override
    public void super_setTitleColor(int textColor) {
        super.setTitleColor(textColor);
    }

    @Override
    public void super_setVisible(boolean visible) {
        super.setVisible(visible);
    }

    @Override
    public void super_setVrModeEnabled(boolean enabled, ComponentName requestedComponent)
            throws PackageManager.NameNotFoundException {
        super.setVrModeEnabled(enabled, requestedComponent);
    }

    @Override
    public void super_setWallpaper(Bitmap bitmap) throws IOException {
        super.setWallpaper(bitmap);
    }

    @Override
    public void super_setWallpaper(InputStream data) throws IOException {
        super.setWallpaper(data);
    }

    @Override
    public boolean super_shouldShowRequestPermissionRationale(String permission) {
        return super.shouldShowRequestPermissionRationale(permission);
    }

    @Override
    public boolean super_shouldUpRecreateTask(Intent targetIntent) {
        return super.shouldUpRecreateTask(targetIntent);
    }

    @Override
    public boolean super_showAssist(Bundle args) {
        return super.showAssist(args);
    }

    @Override
    public void super_showLockTaskEscapeMessage() {
        super.showLockTaskEscapeMessage();
    }

    @Nullable
    @Override
    public android.view.ActionMode super_startActionMode(
            android.view.ActionMode.Callback callback) {
        return super.startActionMode(callback);
    }

    @Nullable
    @Override
    public android.view.ActionMode super_startActionMode(android.view.ActionMode.Callback callback,
            int type) {
        return super.startActionMode(callback, type);
    }

    @Override
    public void super_startActivities(Intent[] intents) {
        super.startActivities(intents);
    }

    @Override
    public void super_startActivities(Intent[] intents, Bundle options) {
        super.startActivities(intents, options);
    }

    @Override
    public void super_startActivity(Intent intent) {
        super.startActivity(intent);
    }

    @Override
    public void super_startActivity(Intent intent, Bundle options) {
        super.startActivity(intent, options);
    }

    @Override
    public void super_startActivityForResult(Intent intent, int requestCode) {
        super.startActivityForResult(intent, requestCode);
    }

    @Override
    public void super_startActivityForResult(Intent intent, int requestCode,
            @Nullable Bundle options) {
        super.startActivityForResult(intent, requestCode, options);
    }

    @Override
    public void super_startActivityFromChild(Activity child, Intent intent, int requestCode) {
        super.startActivityFromChild(child, intent, requestCode);
    }

    @Override
    public void super_startActivityFromChild(Activity child, Intent intent, int requestCode,
            Bundle options) {
        super.startActivityFromChild(child, intent, requestCode, options);
    }

    @Override
    public void super_startActivityFromFragment(Fragment fragment, Intent intent, int requestCode) {
        super.startActivityFromFragment(fragment, intent, requestCode);
    }

    @Override
    public void super_startActivityFromFragment(Fragment fragment, Intent intent, int requestCode,
            @Nullable Bundle options) {
        super.startActivityFromFragment(fragment, intent, requestCode, options);
    }

    @Override
    public void super_startActivityFromFragment(android.app.Fragment fragment, Intent intent,
            int requestCode) {
        super.startActivityFromFragment(fragment, intent, requestCode);
    }

    @Override
    public void super_startActivityFromFragment(android.app.Fragment fragment, Intent intent,
            int requestCode, Bundle options) {
        super.startActivityFromFragment(fragment, intent, requestCode, options);
    }

    @Override
    public boolean super_startActivityIfNeeded(Intent intent, int requestCode) {
        return super.startActivityIfNeeded(intent, requestCode);
    }

    @Override
    public boolean super_startActivityIfNeeded(Intent intent, int requestCode, Bundle options) {
        return super.startActivityIfNeeded(intent, requestCode, options);
    }

    @Override
    public boolean super_startInstrumentation(ComponentName className, String profileFile,
            Bundle arguments) {
        return super.startInstrumentation(className, profileFile, arguments);
    }

    @Override
    public void super_startIntentSender(IntentSender intent, Intent fillInIntent, int flagsMask,
            int flagsValues, int extraFlags) throws IntentSender.SendIntentException {
        super.startIntentSender(intent, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    @Override
    public void super_startIntentSender(IntentSender intent, Intent fillInIntent, int flagsMask,
            int flagsValues, int extraFlags, Bundle options)
            throws IntentSender.SendIntentException {
        super.startIntentSender(intent, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    @Override
    public void super_startIntentSenderForResult(IntentSender intent, int requestCode,
            @Nullable Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags,
            Bundle options) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues,
                extraFlags, options);
    }

    @Override
    public void super_startIntentSenderForResult(IntentSender intent, int requestCode,
            @Nullable Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags)
            throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues,
                extraFlags);
    }

    @Override
    public void super_startIntentSenderFromChild(Activity child, IntentSender intent,
            int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags)
            throws IntentSender.SendIntentException {
        super.startIntentSenderFromChild(child, intent, requestCode, fillInIntent, flagsMask,
                flagsValues, extraFlags);
    }

    @Override
    public void super_startIntentSenderFromChild(Activity child, IntentSender intent,
            int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags,
            Bundle options) throws IntentSender.SendIntentException {
        super.startIntentSenderFromChild(child, intent, requestCode, fillInIntent, flagsMask,
                flagsValues, extraFlags, options);
    }

    @Override
    public void super_startIntentSenderFromFragment(Fragment fragment, IntentSender intent,
            int requestCode, @Nullable Intent fillInIntent, int flagsMask, int flagsValues,
            int extraFlags, Bundle options) throws IntentSender.SendIntentException {
        super.startIntentSenderFromFragment(fragment, intent, requestCode, fillInIntent, flagsMask,
                flagsValues, extraFlags, options);
    }

    @Override
    public void super_startLocalVoiceInteraction(Bundle privateOptions) {
        super.startLocalVoiceInteraction(privateOptions);
    }

    @Override
    public void super_startLockTask() {
        super.startLockTask();
    }

    @Override
    public void super_startManagingCursor(Cursor c) {
        super.startManagingCursor(c);
    }

    @Override
    public boolean super_startNextMatchingActivity(Intent intent) {
        return super.startNextMatchingActivity(intent);
    }

    @Override
    public boolean super_startNextMatchingActivity(Intent intent, Bundle options) {
        return super.startNextMatchingActivity(intent, options);
    }

    @Override
    public void super_startPostponedEnterTransition() {
        super.startPostponedEnterTransition();
    }

    @Override
    public void super_startSearch(String initialQuery, boolean selectInitialQuery,
            Bundle appSearchData, boolean globalSearch) {
        super.startSearch(initialQuery, selectInitialQuery, appSearchData, globalSearch);
    }

    @Override
    public ComponentName super_startService(Intent service) {
        return super.startService(service);
    }

    @Nullable
    @Override
    public ActionMode super_startSupportActionMode(@NonNull ActionMode.Callback callback) {
        return super.startSupportActionMode(callback);
    }

    @Override
    public void super_stopLocalVoiceInteraction() {
        super.stopLocalVoiceInteraction();
    }

    @Override
    public void super_stopLockTask() {
        super.stopLockTask();
    }

    @Override
    public void super_stopManagingCursor(Cursor c) {
        super.stopManagingCursor(c);
    }

    @Override
    public boolean super_stopService(Intent name) {
        return super.stopService(name);
    }

    @Override
    public void super_supportFinishAfterTransition() {
        super.supportFinishAfterTransition();
    }

    @Override
    public void super_supportInvalidateOptionsMenu() {
        super.supportInvalidateOptionsMenu();
    }

    @Override
    public void super_supportNavigateUpTo(@NonNull Intent upIntent) {
        super.supportNavigateUpTo(upIntent);
    }

    @Override
    public void super_supportPostponeEnterTransition() {
        super.supportPostponeEnterTransition();
    }

    @Override
    public boolean super_supportRequestWindowFeature(int featureId) {
        return super.supportRequestWindowFeature(featureId);
    }

    @Override
    public boolean super_supportShouldUpRecreateTask(@NonNull Intent targetIntent) {
        return super.supportShouldUpRecreateTask(targetIntent);
    }

    @Override
    public void super_supportStartPostponedEnterTransition() {
        super.supportStartPostponedEnterTransition();
    }

    @Override
    public void super_takeKeyEvents(boolean get) {
        super.takeKeyEvents(get);
    }

    @Override
    public void super_triggerSearch(String query, Bundle appSearchData) {
        super.triggerSearch(query, appSearchData);
    }

    @Override
    public void super_unbindService(ServiceConnection conn) {
        super.unbindService(conn);
    }

    @Override
    public void super_unregisterComponentCallbacks(ComponentCallbacks callback) {
        super.unregisterComponentCallbacks(callback);
    }

    @Override
    public void super_unregisterForContextMenu(View view) {
        super.unregisterForContextMenu(view);
    }

    @Override
    public void super_unregisterReceiver(BroadcastReceiver receiver) {
        super.unregisterReceiver(receiver);
    }

    /**
     * Reverses the Activity Scene entry Transition and triggers the calling Activity
     * to reverse its exit Transition. When the exit Transition completes,
     * {@link #finish()} is called. If no entry Transition was used, finish() is called
     * immediately and the Activity exit Transition is run.
     * <p>
     * <p>On Android 4.4 or lower, this method only finishes the Activity with no
     * special exit transition.</p>
     */
    @Override
    public void supportFinishAfterTransition() {
        delegate.supportFinishAfterTransition();
    }

    @Override
    public void supportInvalidateOptionsMenu() {
        delegate.supportInvalidateOptionsMenu();
    }

    /**
     * Navigate from sourceActivity to the activity specified by upIntent, finishing sourceActivity
     * in the process. upIntent will have the flag {@link Intent#FLAG_ACTIVITY_CLEAR_TOP} set
     * by this method, along with any others required for proper up navigation as outlined
     * in the Android Design Guide.
     * <p>
     * <p>This method should be used when performing up navigation from within the same task
     * as the destination. If up navigation should cross tasks in some cases, see
     * {@link #supportShouldUpRecreateTask(Intent)}.</p>
     *
     * @param upIntent An intent representing the target destination for up navigation
     */
    @Override
    public void supportNavigateUpTo(@NonNull Intent upIntent) {
        delegate.supportNavigateUpTo(upIntent);
    }

    /**
     * Support library version of {@link Activity#postponeEnterTransition()} that works
     * only on API 21 and later.
     */
    @Override
    public void supportPostponeEnterTransition() {
        delegate.supportPostponeEnterTransition();
    }

    /**
     * Enable extended support library window features.
     * <p>
     * This is a convenience for calling
     * {@link Window#requestFeature getWindow().requestFeature()}.
     * </p>
     *
     * @param featureId The desired feature as defined in
     *                  {@link Window} or {@link WindowCompat}.
     * @return Returns true if the requested feature is supported and now enabled.
     * @see Activity#requestWindowFeature
     * @see Window#requestFeature
     */
    @Override
    public boolean supportRequestWindowFeature(int featureId) {
        return delegate.supportRequestWindowFeature(featureId);
    }

    /**
     * Returns true if sourceActivity should recreate the task when navigating 'up'
     * by using targetIntent.
     * <p>
     * <p>If this method returns false the app can trivially call
     * {@link #supportNavigateUpTo(Intent)} using the same parameters to correctly perform
     * up navigation. If this method returns false, the app should synthesize a new task stack
     * by using {@link android.support.v4.app.TaskStackBuilder} or another similar mechanism to
     * perform up navigation.</p>
     *
     * @param targetIntent An intent representing the target destination for up navigation
     * @return true if navigating up should recreate a new task stack, false if the same task
     * should be used for the destination
     */
    @Override
    public boolean supportShouldUpRecreateTask(@NonNull Intent targetIntent) {
        return delegate.supportShouldUpRecreateTask(targetIntent);
    }

    /**
     * Support library version of {@link Activity#startPostponedEnterTransition()}
     * that only works with API 21 and later.
     */
    @Override
    public void supportStartPostponedEnterTransition() {
        delegate.supportStartPostponedEnterTransition();
    }

    @Override
    public void takeKeyEvents(boolean get) {
        delegate.takeKeyEvents(get);
    }

    @Override
    public void triggerSearch(String query, Bundle appSearchData) {
        delegate.triggerSearch(query, appSearchData);
    }

    @Override
    public void unbindService(ServiceConnection conn) {
        delegate.unbindService(conn);
    }

    @Override
    public void unregisterComponentCallbacks(ComponentCallbacks callback) {
        delegate.unregisterComponentCallbacks(callback);
    }

    @Override
    public void unregisterForContextMenu(View view) {
        delegate.unregisterForContextMenu(view);
    }

    @Override
    public void unregisterReceiver(BroadcastReceiver receiver) {
        delegate.unregisterReceiver(receiver);
    }
}
