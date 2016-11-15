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
    public void addContentView(final View view, final ViewGroup.LayoutParams params) {
        delegate.addContentView(view, params);
    }

    public Removable addPlugin(final ActivityPlugin plugin) {
        return delegate.addPlugin(plugin);
    }

    @Override
    public void applyOverrideConfiguration(final Configuration overrideConfiguration) {
        delegate.applyOverrideConfiguration(overrideConfiguration);
    }

    @Override
    public void attachBaseContext(final Context newBase) {
        delegate.attachBaseContext(newBase);
    }

    @Override
    public boolean bindService(final Intent service, final ServiceConnection conn,
            final int flags) {
        return delegate.bindService(service, conn, flags);
    }

    @Override
    public int checkCallingOrSelfPermission(final String permission) {
        return delegate.checkCallingOrSelfPermission(permission);
    }

    @Override
    public int checkCallingOrSelfUriPermission(final Uri uri, final int modeFlags) {
        return delegate.checkCallingOrSelfUriPermission(uri, modeFlags);
    }

    @Override
    public int checkCallingPermission(final String permission) {
        return delegate.checkCallingPermission(permission);
    }

    @Override
    public int checkCallingUriPermission(final Uri uri, final int modeFlags) {
        return delegate.checkCallingUriPermission(uri, modeFlags);
    }

    @Override
    public int checkPermission(final String permission, final int pid, final int uid) {
        return delegate.checkPermission(permission, pid, uid);
    }

    @Override
    public int checkSelfPermission(final String permission) {
        return delegate.checkSelfPermission(permission);
    }

    @Override
    public int checkUriPermission(final Uri uri, final int pid, final int uid,
            final int modeFlags) {
        return delegate.checkUriPermission(uri, pid, uid, modeFlags);
    }

    @Override
    public int checkUriPermission(final Uri uri, final String readPermission,
            final String writePermission, final int pid, final int uid, final int modeFlags) {
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
    public Context createConfigurationContext(final Configuration overrideConfiguration) {
        return delegate.createConfigurationContext(overrideConfiguration);
    }

    @Override
    public Context createDeviceProtectedStorageContext() {
        return delegate.createDeviceProtectedStorageContext();
    }

    @Override
    public Context createDisplayContext(final Display display) {
        return delegate.createDisplayContext(display);
    }

    @Override
    public Context createPackageContext(final String packageName, final int flags)
            throws PackageManager.NameNotFoundException {
        try {
            return delegate.createPackageContext(packageName, flags);
        } catch (SuppressedException e) {
            throw (PackageManager.NameNotFoundException) e.getCause();
        }
    }

    @Override
    public PendingIntent createPendingResult(final int requestCode, final Intent data,
            final int flags) {
        return delegate.createPendingResult(requestCode, data, flags);
    }

    @Override
    public String[] databaseList() {
        return delegate.databaseList();
    }

    @Override
    public boolean deleteDatabase(final String name) {
        return delegate.deleteDatabase(name);
    }

    @Override
    public boolean deleteFile(final String name) {
        return delegate.deleteFile(name);
    }

    @Override
    public boolean deleteSharedPreferences(final String name) {
        return delegate.deleteSharedPreferences(name);
    }

    @Override
    public boolean dispatchGenericMotionEvent(final MotionEvent ev) {
        return delegate.dispatchGenericMotionEvent(ev);
    }

    @Override
    public boolean dispatchKeyEvent(final KeyEvent event) {
        return delegate.dispatchKeyEvent(event);
    }

    @Override
    public boolean dispatchKeyShortcutEvent(final KeyEvent event) {
        return delegate.dispatchKeyShortcutEvent(event);
    }

    @Override
    public boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent event) {
        return delegate.dispatchPopulateAccessibilityEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(final MotionEvent ev) {
        return delegate.dispatchTouchEvent(ev);
    }

    @Override
    public boolean dispatchTrackballEvent(final MotionEvent ev) {
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
    public void dump(final String prefix, final FileDescriptor fd, final PrintWriter writer,
            final String[] args) {
        delegate.dump(prefix, fd, writer, args);
    }

    @Override
    public void enforceCallingOrSelfPermission(final String permission, final String message) {
        delegate.enforceCallingOrSelfPermission(permission, message);
    }

    @Override
    public void enforceCallingOrSelfUriPermission(final Uri uri, final int modeFlags,
            final String message) {
        delegate.enforceCallingOrSelfUriPermission(uri, modeFlags, message);
    }

    @Override
    public void enforceCallingPermission(final String permission, final String message) {
        delegate.enforceCallingPermission(permission, message);
    }

    @Override
    public void enforceCallingUriPermission(final Uri uri, final int modeFlags,
            final String message) {
        delegate.enforceCallingUriPermission(uri, modeFlags, message);
    }

    @Override
    public void enforcePermission(final String permission, final int pid, final int uid,
            final String message) {
        delegate.enforcePermission(permission, pid, uid, message);
    }

    @Override
    public void enforceUriPermission(final Uri uri, final int pid, final int uid,
            final int modeFlags, final String message) {
        delegate.enforceUriPermission(uri, pid, uid, modeFlags, message);
    }

    @Override
    public void enforceUriPermission(final Uri uri, final String readPermission,
            final String writePermission, final int pid, final int uid, final int modeFlags,
            final String message) {
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
    public View findViewById(@IdRes final int id) {
        return delegate.findViewById(id);
    }

    @Override
    public void finish() {
        delegate.finish();
    }

    @Override
    public void finishActivity(final int requestCode) {
        delegate.finishActivity(requestCode);
    }

    @Override
    public void finishActivityFromChild(final Activity child, final int requestCode) {
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
    public void finishFromChild(final Activity child) {
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
    public File getDatabasePath(final String name) {
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
    public File getDir(final String name, final int mode) {
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
    public File getExternalFilesDir(final String type) {
        return delegate.getExternalFilesDir(type);
    }

    @Override
    public File[] getExternalFilesDirs(final String type) {
        return delegate.getExternalFilesDirs(type);
    }

    @Override
    public File[] getExternalMediaDirs() {
        return delegate.getExternalMediaDirs();
    }

    @Override
    public File getFileStreamPath(final String name) {
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
    public SharedPreferences getPreferences(final int mode) {
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
    public SharedPreferences getSharedPreferences(final String name, final int mode) {
        return delegate.getSharedPreferences(name, mode);
    }

    /**
     * Support library version of {@link Activity#getActionBar}.
     *
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
    public Object getSystemService(final String name) {
        return delegate.getSystemService(name);
    }

    @Override
    public String getSystemServiceName(final Class<?> serviceClass) {
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
    public void grantUriPermission(final String toPackage, final Uri uri, final int modeFlags) {
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
    public boolean moveDatabaseFrom(final Context sourceContext, final String name) {
        return delegate.moveDatabaseFrom(sourceContext, name);
    }

    @Override
    public boolean moveSharedPreferencesFrom(final Context sourceContext, final String name) {
        return delegate.moveSharedPreferencesFrom(sourceContext, name);
    }

    @Override
    public boolean moveTaskToBack(final boolean nonRoot) {
        return delegate.moveTaskToBack(nonRoot);
    }

    @Override
    public boolean navigateUpTo(final Intent upIntent) {
        return delegate.navigateUpTo(upIntent);
    }

    @Override
    public boolean navigateUpToFromChild(final Activity child, final Intent upIntent) {
        return delegate.navigateUpToFromChild(child, upIntent);
    }

    @Override
    public void onActionModeFinished(final android.view.ActionMode mode) {
        delegate.onActionModeFinished(mode);
    }

    @Override
    public void onActionModeStarted(final android.view.ActionMode mode) {
        delegate.onActionModeStarted(mode);
    }

    @Override
    public void onActivityReenter(final int resultCode, final Intent data) {
        delegate.onActivityReenter(resultCode, data);
    }

    /**
     * Dispatch incoming result to the correct fragment.
     */
    @Override
    public void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        delegate.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onApplyThemeResource(final Resources.Theme theme, final int resid,
            final boolean first) {
        delegate.onApplyThemeResource(theme, resid, first);
    }

    /**
     * Called when a fragment is attached to the activity.
     *
     * <p>This is called after the attached fragment's <code>onAttach</code> and before
     * the attached fragment's <code>onCreate</code> if the fragment has not yet had a previous
     * call to <code>onCreate</code>.</p>
     */
    @Override
    public void onAttachFragment(final Fragment fragment) {
        delegate.onAttachFragment(fragment);
    }

    @Override
    public void onAttachFragment(final android.app.Fragment fragment) {
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
    public void onChildTitleChanged(final Activity childActivity, final CharSequence title) {
        delegate.onChildTitleChanged(childActivity, title);
    }

    @Override
    public void onConfigurationChanged(final Configuration newConfig) {
        delegate.onConfigurationChanged(newConfig);
    }

    @Override
    public void onContentChanged() {
        delegate.onContentChanged();
    }

    @Override
    public boolean onContextItemSelected(final MenuItem item) {
        return delegate.onContextItemSelected(item);
    }

    @Override
    public void onContextMenuClosed(final Menu menu) {
        delegate.onContextMenuClosed(menu);
    }

    @Override
    public void onCreate(final Bundle savedInstanceState, final PersistableBundle persistentState) {
        delegate.onCreate(savedInstanceState, persistentState);
    }

    @Override
    public void onCreate(@Nullable final Bundle savedInstanceState) {
        delegate.onCreate(savedInstanceState);
    }

    @Override
    public void onCreateContextMenu(final ContextMenu menu, final View v,
            final ContextMenu.ContextMenuInfo menuInfo) {
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
    public Dialog onCreateDialog(final int id) {
        return delegate.onCreateDialog(id);
    }

    /**
     * @deprecated
     */
    @Nullable
    @Override
    public Dialog onCreateDialog(final int id, final Bundle args) {
        return delegate.onCreateDialog(id, args);
    }

    @Override
    public void onCreateNavigateUpTaskStack(final TaskStackBuilder builder) {
        delegate.onCreateNavigateUpTaskStack(builder);
    }

    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        return delegate.onCreateOptionsMenu(menu);
    }

    /**
     * Dispatch to Fragment.onCreateOptionsMenu().
     */
    @Override
    public boolean onCreatePanelMenu(final int featureId, final Menu menu) {
        return delegate.onCreatePanelMenu(featureId, menu);
    }

    @Nullable
    @Override
    public View onCreatePanelView(final int featureId) {
        return delegate.onCreatePanelView(featureId);
    }

    /**
     * Support version of {@link #onCreateNavigateUpTaskStack(TaskStackBuilder)}.
     * This method will be called on all platform versions.
     *
     * Define the synthetic task stack that will be generated during Up navigation from
     * a different task.
     *
     * <p>The default implementation of this method adds the parent chain of this activity
     * as specified in the manifest to the supplied {@link android.support.v4.app.TaskStackBuilder}.
     * Applications
     * may choose to override this method to construct the desired task stack in a different
     * way.</p>
     *
     * <p>This method will be invoked by the default implementation of {@link #onNavigateUp()}
     * if {@link #shouldUpRecreateTask(Intent)} returns true when supplied with the intent
     * returned by {@link #getParentActivityIntent()}.</p>
     *
     * <p>Applications that wish to supply extra Intent parameters to the parent stack defined
     * by the manifest should override
     * {@link #onPrepareSupportNavigateUpTaskStack(android.support.v4.app.TaskStackBuilder)}.</p>
     *
     * @param builder An empty TaskStackBuilder - the application should add intents representing
     *                the desired task stack
     */
    @Override
    public void onCreateSupportNavigateUpTaskStack(
            @NonNull final android.support.v4.app.TaskStackBuilder builder) {
        delegate.onCreateSupportNavigateUpTaskStack(builder);
    }

    @Override
    public boolean onCreateThumbnail(final Bitmap outBitmap, final Canvas canvas) {
        return delegate.onCreateThumbnail(outBitmap, canvas);
    }

    @Override
    public View onCreateView(final View parent, final String name, final Context context,
            final AttributeSet attrs) {
        return delegate.onCreateView(parent, name, context, attrs);
    }

    @Override
    public View onCreateView(final String name, final Context context, final AttributeSet attrs) {
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
    public boolean onGenericMotionEvent(final MotionEvent event) {
        return delegate.onGenericMotionEvent(event);
    }

    @Override
    public boolean onKeyDown(final int keyCode, final KeyEvent event) {
        return delegate.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onKeyLongPress(final int keyCode, final KeyEvent event) {
        return delegate.onKeyLongPress(keyCode, event);
    }

    @Override
    public boolean onKeyMultiple(final int keyCode, final int repeatCount, final KeyEvent event) {
        return delegate.onKeyMultiple(keyCode, repeatCount, event);
    }

    @Override
    public boolean onKeyShortcut(final int keyCode, final KeyEvent event) {
        return delegate.onKeyShortcut(keyCode, event);
    }

    @Override
    public boolean onKeyUp(final int keyCode, final KeyEvent event) {
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
     *
     * <p>Please note: AppCompat uses it's own feature id for the action bar:
     * {@link AppCompatDelegate#FEATURE_SUPPORT_ACTION_BAR FEATURE_SUPPORT_ACTION_BAR}.</p>
     */
    @Override
    public boolean onMenuOpened(final int featureId, final Menu menu) {
        return delegate.onMenuOpened(featureId, menu);
    }

    /**
     * {@inheritDoc}
     *
     * <p><strong>Note:</strong> If you override this method you must call
     * <code>super.onMultiWindowModeChanged</code> to correctly dispatch the event
     * to support fragments attached to this activity.</p>
     *
     * @param isInMultiWindowMode True if the activity is in multi-window mode.
     */
    @Override
    public void onMultiWindowModeChanged(final boolean isInMultiWindowMode) {
        delegate.onMultiWindowModeChanged(isInMultiWindowMode);
    }

    @Override
    public boolean onNavigateUp() {
        return delegate.onNavigateUp();
    }

    @Override
    public boolean onNavigateUpFromChild(final Activity child) {
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
    public void onNewIntent(final Intent intent) {
        delegate.onNewIntent(intent);
    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {
        return delegate.onOptionsItemSelected(item);
    }

    @Override
    public void onOptionsMenuClosed(final Menu menu) {
        delegate.onOptionsMenuClosed(menu);
    }

    /**
     * {@inheritDoc}
     *
     * <p>Please note: AppCompat uses it's own feature id for the action bar:
     * {@link AppCompatDelegate#FEATURE_SUPPORT_ACTION_BAR FEATURE_SUPPORT_ACTION_BAR}.</p>
     */
    @Override
    public void onPanelClosed(final int featureId, final Menu menu) {
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
     *
     * <p><strong>Note:</strong> If you override this method you must call
     * <code>super.onPictureInPictureModeChanged</code> to correctly dispatch the event
     * to support fragments attached to this activity.</p>
     *
     * @param isInPictureInPictureMode True if the activity is in picture-in-picture mode.
     */
    @Override
    public void onPictureInPictureModeChanged(final boolean isInPictureInPictureMode) {
        delegate.onPictureInPictureModeChanged(isInPictureInPictureMode);
    }

    @Override
    public void onPostCreate(final Bundle savedInstanceState,
            final PersistableBundle persistentState) {
        delegate.onPostCreate(savedInstanceState, persistentState);
    }

    @Override
    public void onPostCreate(@Nullable final Bundle savedInstanceState) {
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
    public void onPrepareDialog(final int id, final Dialog dialog) {
        delegate.onPrepareDialog(id, dialog);
    }

    /**
     * @deprecated
     */
    @Override
    public void onPrepareDialog(final int id, final Dialog dialog, final Bundle args) {
        delegate.onPrepareDialog(id, dialog, args);
    }

    @Override
    public void onPrepareNavigateUpTaskStack(final TaskStackBuilder builder) {
        delegate.onPrepareNavigateUpTaskStack(builder);
    }

    @Override
    public boolean onPrepareOptionsMenu(final Menu menu) {
        return delegate.onPrepareOptionsMenu(menu);
    }

    /**
     * @hide
     */
    @Override
    public boolean onPrepareOptionsPanel(final View view, final Menu menu) {
        return delegate.onPrepareOptionsPanel(view, menu);
    }

    /**
     * Dispatch onPrepareOptionsMenu() to fragments.
     */
    @Override
    public boolean onPreparePanel(final int featureId, final View view, final Menu menu) {
        return delegate.onPreparePanel(featureId, view, menu);
    }

    /**
     * Support version of {@link #onPrepareNavigateUpTaskStack(TaskStackBuilder)}.
     * This method will be called on all platform versions.
     *
     * Prepare the synthetic task stack that will be generated during Up navigation
     * from a different task.
     *
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
            @NonNull final android.support.v4.app.TaskStackBuilder builder) {
        delegate.onPrepareSupportNavigateUpTaskStack(builder);
    }

    @Override
    public void onProvideAssistContent(final AssistContent outContent) {
        delegate.onProvideAssistContent(outContent);
    }

    @Override
    public void onProvideAssistData(final Bundle data) {
        delegate.onProvideAssistData(data);
    }

    @Override
    public void onProvideKeyboardShortcuts(final List<KeyboardShortcutGroup> data, final Menu menu,
            final int deviceId) {
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
    public void onRequestPermissionsResult(final int requestCode,
            @NonNull final String[] permissions, @NonNull final int[] grantResults) {
        delegate.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override
    public void onRestart() {
        delegate.onRestart();
    }

    @Override
    public void onRestoreInstanceState(final Bundle savedInstanceState,
            final PersistableBundle persistentState) {
        delegate.onRestoreInstanceState(savedInstanceState, persistentState);
    }

    @Override
    public void onRestoreInstanceState(final Bundle savedInstanceState) {
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
    public void onSaveInstanceState(final Bundle outState,
            final PersistableBundle outPersistentState) {
        delegate.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    public void onSaveInstanceState(final Bundle outState) {
        delegate.onSaveInstanceState(outState);
    }

    @Override
    public boolean onSearchRequested(final SearchEvent searchEvent) {
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
    public void onSupportActionModeFinished(@NonNull final ActionMode mode) {
        delegate.onSupportActionModeFinished(mode);
    }

    /**
     * Notifies the Activity that a support action mode has been started.
     * Activity subclasses overriding this method should call the superclass implementation.
     *
     * @param mode The new action mode.
     */
    @Override
    public void onSupportActionModeStarted(@NonNull final ActionMode mode) {
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
     *
     * <p>If a parent was specified in the manifest for this activity or an activity-alias to it,
     * default Up navigation will be handled automatically. See
     * {@link #getSupportParentActivityIntent()} for how to specify the parent. If any activity
     * along the parent chain requires extra Intent arguments, the Activity subclass
     * should override the method {@link #onPrepareSupportNavigateUpTaskStack(android.support.v4.app.TaskStackBuilder)}
     * to supply those arguments.</p>
     *
     * <p>See <a href="{@docRoot}guide/topics/fundamentals/tasks-and-back-stack.html">Tasks and
     * Back Stack</a> from the developer guide and
     * <a href="{@docRoot}design/patterns/navigation.html">Navigation</a> from the design guide
     * for more information about navigating within your app.</p>
     *
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
    public void onTitleChanged(final CharSequence title, final int color) {
        delegate.onTitleChanged(title, color);
    }

    @Override
    public boolean onTouchEvent(final MotionEvent event) {
        return delegate.onTouchEvent(event);
    }

    @Override
    public boolean onTrackballEvent(final MotionEvent event) {
        return delegate.onTrackballEvent(event);
    }

    @Override
    public void onTrimMemory(final int level) {
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
    public void onWindowAttributesChanged(final WindowManager.LayoutParams params) {
        delegate.onWindowAttributesChanged(params);
    }

    @Override
    public void onWindowFocusChanged(final boolean hasFocus) {
        delegate.onWindowFocusChanged(hasFocus);
    }

    @Nullable
    @Override
    public android.view.ActionMode onWindowStartingActionMode(
            final android.view.ActionMode.Callback callback) {
        return delegate.onWindowStartingActionMode(callback);
    }

    @Nullable
    @Override
    public android.view.ActionMode onWindowStartingActionMode(
            final android.view.ActionMode.Callback callback, final int type) {
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
    public ActionMode onWindowStartingSupportActionMode(
            @NonNull final ActionMode.Callback callback) {
        return delegate.onWindowStartingSupportActionMode(callback);
    }

    @Override
    public void openContextMenu(final View view) {
        delegate.openContextMenu(view);
    }

    @Override
    public FileInputStream openFileInput(final String name) throws FileNotFoundException {
        try {
            return delegate.openFileInput(name);
        } catch (SuppressedException e) {
            throw (FileNotFoundException) e.getCause();
        }
    }

    @Override
    public FileOutputStream openFileOutput(final String name, final int mode)
            throws FileNotFoundException {
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
    public SQLiteDatabase openOrCreateDatabase(final String name, final int mode,
            final SQLiteDatabase.CursorFactory factory) {
        return delegate.openOrCreateDatabase(name, mode, factory);
    }

    @Override
    public SQLiteDatabase openOrCreateDatabase(final String name, final int mode,
            final SQLiteDatabase.CursorFactory factory, final DatabaseErrorHandler errorHandler) {
        return delegate.openOrCreateDatabase(name, mode, factory, errorHandler);
    }

    @Override
    public void overridePendingTransition(final int enterAnim, final int exitAnim) {
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
    public void registerComponentCallbacks(final ComponentCallbacks callback) {
        delegate.registerComponentCallbacks(callback);
    }

    @Override
    public void registerForContextMenu(final View view) {
        delegate.registerForContextMenu(view);
    }

    @Override
    public Intent registerReceiver(final BroadcastReceiver receiver, final IntentFilter filter) {
        return delegate.registerReceiver(receiver, filter);
    }

    @Override
    public Intent registerReceiver(final BroadcastReceiver receiver, final IntentFilter filter,
            final String broadcastPermission, final Handler scheduler) {
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
    public void removeStickyBroadcast(final Intent intent) {
        delegate.removeStickyBroadcast(intent);
    }

    /**
     * @deprecated
     */
    @Override
    public void removeStickyBroadcastAsUser(final Intent intent, final UserHandle user) {
        delegate.removeStickyBroadcastAsUser(intent, user);
    }

    @Override
    public void reportFullyDrawn() {
        delegate.reportFullyDrawn();
    }

    @Override
    public DragAndDropPermissions requestDragAndDropPermissions(final DragEvent event) {
        return delegate.requestDragAndDropPermissions(event);
    }

    @Override
    public boolean requestVisibleBehind(final boolean visible) {
        return delegate.requestVisibleBehind(visible);
    }

    @Override
    public void revokeUriPermission(final Uri uri, final int modeFlags) {
        delegate.revokeUriPermission(uri, modeFlags);
    }

    @Override
    public void sendBroadcast(final Intent intent) {
        delegate.sendBroadcast(intent);
    }

    @Override
    public void sendBroadcast(final Intent intent, final String receiverPermission) {
        delegate.sendBroadcast(intent, receiverPermission);
    }

    @Override
    public void sendBroadcastAsUser(final Intent intent, final UserHandle user) {
        delegate.sendBroadcastAsUser(intent, user);
    }

    @Override
    public void sendBroadcastAsUser(final Intent intent, final UserHandle user,
            final String receiverPermission) {
        delegate.sendBroadcastAsUser(intent, user, receiverPermission);
    }

    @Override
    public void sendOrderedBroadcast(final Intent intent, final String receiverPermission) {
        delegate.sendOrderedBroadcast(intent, receiverPermission);
    }

    @Override
    public void sendOrderedBroadcast(final Intent intent, final String receiverPermission,
            final BroadcastReceiver resultReceiver, final Handler scheduler, final int initialCode,
            final String initialData, final Bundle initialExtras) {
        delegate.sendOrderedBroadcast(intent, receiverPermission, resultReceiver, scheduler,
                initialCode, initialData, initialExtras);
    }

    @Override
    public void sendOrderedBroadcastAsUser(final Intent intent, final UserHandle user,
            final String receiverPermission, final BroadcastReceiver resultReceiver,
            final Handler scheduler, final int initialCode, final String initialData,
            final Bundle initialExtras) {
        delegate.sendOrderedBroadcastAsUser(intent, user, receiverPermission, resultReceiver,
                scheduler, initialCode, initialData, initialExtras);
    }

    /**
     * @deprecated
     */
    @Override
    public void sendStickyBroadcast(final Intent intent) {
        delegate.sendStickyBroadcast(intent);
    }

    /**
     * @deprecated
     */
    @Override
    public void sendStickyBroadcastAsUser(final Intent intent, final UserHandle user) {
        delegate.sendStickyBroadcastAsUser(intent, user);
    }

    /**
     * @deprecated
     */
    @Override
    public void sendStickyOrderedBroadcast(final Intent intent,
            final BroadcastReceiver resultReceiver, final Handler scheduler, final int initialCode,
            final String initialData, final Bundle initialExtras) {
        delegate.sendStickyOrderedBroadcast(intent, resultReceiver, scheduler, initialCode,
                initialData, initialExtras);
    }

    /**
     * @deprecated
     */
    @Override
    public void sendStickyOrderedBroadcastAsUser(final Intent intent, final UserHandle user,
            final BroadcastReceiver resultReceiver, final Handler scheduler, final int initialCode,
            final String initialData, final Bundle initialExtras) {
        delegate.sendStickyOrderedBroadcastAsUser(intent, user, resultReceiver, scheduler,
                initialCode, initialData, initialExtras);
    }

    @Override
    public void setActionBar(final Toolbar toolbar) {
        delegate.setActionBar(toolbar);
    }

    @Override
    public void setContentTransitionManager(final TransitionManager tm) {
        delegate.setContentTransitionManager(tm);
    }

    @Override
    public void setContentView(@LayoutRes final int layoutResID) {
        delegate.setContentView(layoutResID);
    }

    @Override
    public void setContentView(final View view) {
        delegate.setContentView(view);
    }

    @Override
    public void setContentView(final View view, final ViewGroup.LayoutParams params) {
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
    public void setEnterSharedElementCallback(final SharedElementCallback callback) {
        delegate.setEnterSharedElementCallback(callback);
    }

    @Override
    public void setEnterSharedElementCallback(final android.app.SharedElementCallback callback) {
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
    public void setExitSharedElementCallback(final SharedElementCallback listener) {
        delegate.setExitSharedElementCallback(listener);
    }

    @Override
    public void setExitSharedElementCallback(final android.app.SharedElementCallback callback) {
        delegate.setExitSharedElementCallback(callback);
    }

    @Override
    public void setFinishOnTouchOutside(final boolean finish) {
        delegate.setFinishOnTouchOutside(finish);
    }

    @Override
    public void setImmersive(final boolean i) {
        delegate.setImmersive(i);
    }

    @Override
    public void setIntent(final Intent newIntent) {
        delegate.setIntent(newIntent);
    }

    @Override
    public void setRequestedOrientation(final int requestedOrientation) {
        delegate.setRequestedOrientation(requestedOrientation);
    }

    /**
     * Set a {@link Toolbar Toolbar} to act as the
     * {@link ActionBar} for this Activity window.
     *
     * <p>When set to a non-null value the {@link #getActionBar()} method will return
     * an {@link ActionBar} object that can be used to control the given
     * toolbar as if it were a traditional window decor action bar. The toolbar's menu will be
     * populated with the Activity's options menu and the navigation button will be wired through
     * the standard {@link android.R.id#home home} menu select action.</p>
     *
     * <p>In order to use a Toolbar within the Activity's window content the application
     * must not request the window feature
     * {@link Window#FEATURE_ACTION_BAR FEATURE_SUPPORT_ACTION_BAR}.</p>
     *
     * @param toolbar Toolbar to set as the Activity's action bar, or {@code null} to clear it
     */
    @Override
    public void setSupportActionBar(@Nullable final android.support.v7.widget.Toolbar toolbar) {
        delegate.setSupportActionBar(toolbar);
    }

    /**
     * @deprecated Progress bars are no longer provided in AppCompat.
     */
    @Override
    public void setSupportProgress(final int progress) {
        delegate.setSupportProgress(progress);
    }

    /**
     * @deprecated Progress bars are no longer provided in AppCompat.
     */
    @Override
    public void setSupportProgressBarIndeterminate(final boolean indeterminate) {
        delegate.setSupportProgressBarIndeterminate(indeterminate);
    }

    /**
     * @deprecated Progress bars are no longer provided in AppCompat.
     */
    @Override
    public void setSupportProgressBarIndeterminateVisibility(final boolean visible) {
        delegate.setSupportProgressBarIndeterminateVisibility(visible);
    }

    /**
     * @deprecated Progress bars are no longer provided in AppCompat.
     */
    @Override
    public void setSupportProgressBarVisibility(final boolean visible) {
        delegate.setSupportProgressBarVisibility(visible);
    }

    @Override
    public void setTaskDescription(final ActivityManager.TaskDescription taskDescription) {
        delegate.setTaskDescription(taskDescription);
    }

    @Override
    public void setTheme(@StyleRes final int resid) {
        delegate.setTheme(resid);
    }

    @Override
    public void setTitle(final CharSequence title) {
        delegate.setTitle(title);
    }

    @Override
    public void setTitle(final int titleId) {
        delegate.setTitle(titleId);
    }

    /**
     * @deprecated
     */
    @Override
    public void setTitleColor(final int textColor) {
        delegate.setTitleColor(textColor);
    }

    @Override
    public void setVisible(final boolean visible) {
        delegate.setVisible(visible);
    }

    @Override
    public void setVrModeEnabled(final boolean enabled, final ComponentName requestedComponent)
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
    public void setWallpaper(final Bitmap bitmap) throws IOException {
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
    public void setWallpaper(final InputStream data) throws IOException {
        try {
            delegate.setWallpaper(data);
        } catch (SuppressedException e) {
            throw (IOException) e.getCause();
        }
    }

    @Override
    public boolean shouldShowRequestPermissionRationale(final String permission) {
        return delegate.shouldShowRequestPermissionRationale(permission);
    }

    @Override
    public boolean shouldUpRecreateTask(final Intent targetIntent) {
        return delegate.shouldUpRecreateTask(targetIntent);
    }

    @Override
    public boolean showAssist(final Bundle args) {
        return delegate.showAssist(args);
    }

    @Override
    public void showLockTaskEscapeMessage() {
        delegate.showLockTaskEscapeMessage();
    }

    @Nullable
    @Override
    public android.view.ActionMode startActionMode(
            final android.view.ActionMode.Callback callback) {
        return delegate.startActionMode(callback);
    }

    @Nullable
    @Override
    public android.view.ActionMode startActionMode(final android.view.ActionMode.Callback callback,
            final int type) {
        return delegate.startActionMode(callback, type);
    }

    @Override
    public void startActivities(final Intent[] intents) {
        delegate.startActivities(intents);
    }

    @Override
    public void startActivities(final Intent[] intents, final Bundle options) {
        delegate.startActivities(intents, options);
    }

    @Override
    public void startActivity(final Intent intent) {
        delegate.startActivity(intent);
    }

    @Override
    public void startActivity(final Intent intent, final Bundle options) {
        delegate.startActivity(intent, options);
    }

    /**
     * Modifies the standard behavior to allow results to be delivered to fragments.
     * This imposes a restriction that requestCode be <= 0xffff.
     */
    @Override
    public void startActivityForResult(final Intent intent, final int requestCode) {
        delegate.startActivityForResult(intent, requestCode);
    }

    @Override
    public void startActivityForResult(final Intent intent, final int requestCode,
            @Nullable final Bundle options) {
        delegate.startActivityForResult(intent, requestCode, options);
    }

    @Override
    public void startActivityFromChild(final Activity child, final Intent intent,
            final int requestCode) {
        delegate.startActivityFromChild(child, intent, requestCode);
    }

    @Override
    public void startActivityFromChild(final Activity child, final Intent intent,
            final int requestCode, final Bundle options) {
        delegate.startActivityFromChild(child, intent, requestCode, options);
    }

    /**
     * Called by Fragment.startActivityForResult() to implement its behavior.
     */
    @Override
    public void startActivityFromFragment(final Fragment fragment, final Intent intent,
            final int requestCode) {
        delegate.startActivityFromFragment(fragment, intent, requestCode);
    }

    /**
     * Called by Fragment.startActivityForResult() to implement its behavior.
     */
    @Override
    public void startActivityFromFragment(final Fragment fragment, final Intent intent,
            final int requestCode, @Nullable final Bundle options) {
        delegate.startActivityFromFragment(fragment, intent, requestCode, options);
    }

    @Override
    public void startActivityFromFragment(final android.app.Fragment fragment, final Intent intent,
            final int requestCode) {
        delegate.startActivityFromFragment(fragment, intent, requestCode);
    }

    @Override
    public void startActivityFromFragment(final android.app.Fragment fragment, final Intent intent,
            final int requestCode, final Bundle options) {
        delegate.startActivityFromFragment(fragment, intent, requestCode, options);
    }

    @Override
    public boolean startActivityIfNeeded(final Intent intent, final int requestCode) {
        return delegate.startActivityIfNeeded(intent, requestCode);
    }

    @Override
    public boolean startActivityIfNeeded(final Intent intent, final int requestCode,
            final Bundle options) {
        return delegate.startActivityIfNeeded(intent, requestCode, options);
    }

    @Override
    public boolean startInstrumentation(final ComponentName className, final String profileFile,
            final Bundle arguments) {
        return delegate.startInstrumentation(className, profileFile, arguments);
    }

    @Override
    public void startIntentSender(final IntentSender intent, final Intent fillInIntent,
            final int flagsMask, final int flagsValues, final int extraFlags)
            throws IntentSender.SendIntentException {
        try {
            delegate.startIntentSender(intent, fillInIntent, flagsMask, flagsValues, extraFlags);
        } catch (SuppressedException e) {
            throw (IntentSender.SendIntentException) e.getCause();
        }
    }

    @Override
    public void startIntentSender(final IntentSender intent, final Intent fillInIntent,
            final int flagsMask, final int flagsValues, final int extraFlags, final Bundle options)
            throws IntentSender.SendIntentException {
        try {
            delegate.startIntentSender(intent, fillInIntent, flagsMask, flagsValues, extraFlags,
                    options);
        } catch (SuppressedException e) {
            throw (IntentSender.SendIntentException) e.getCause();
        }
    }

    @Override
    public void startIntentSenderForResult(final IntentSender intent, final int requestCode,
            @Nullable final Intent fillInIntent, final int flagsMask, final int flagsValues,
            final int extraFlags, final Bundle options) throws IntentSender.SendIntentException {
        try {
            delegate.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask,
                    flagsValues, extraFlags, options);
        } catch (SuppressedException e) {
            throw (IntentSender.SendIntentException) e.getCause();
        }
    }

    @Override
    public void startIntentSenderForResult(final IntentSender intent, final int requestCode,
            @Nullable final Intent fillInIntent, final int flagsMask, final int flagsValues,
            final int extraFlags) throws IntentSender.SendIntentException {
        try {
            delegate.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask,
                    flagsValues, extraFlags);
        } catch (SuppressedException e) {
            throw (IntentSender.SendIntentException) e.getCause();
        }
    }

    @Override
    public void startIntentSenderFromChild(final Activity child, final IntentSender intent,
            final int requestCode, final Intent fillInIntent, final int flagsMask,
            final int flagsValues, final int extraFlags) throws IntentSender.SendIntentException {
        try {
            delegate.startIntentSenderFromChild(child, intent, requestCode, fillInIntent, flagsMask,
                    flagsValues, extraFlags);
        } catch (SuppressedException e) {
            throw (IntentSender.SendIntentException) e.getCause();
        }
    }

    @Override
    public void startIntentSenderFromChild(final Activity child, final IntentSender intent,
            final int requestCode, final Intent fillInIntent, final int flagsMask,
            final int flagsValues, final int extraFlags, final Bundle options)
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
    public void startIntentSenderFromFragment(final Fragment fragment, final IntentSender intent,
            final int requestCode, @Nullable final Intent fillInIntent, final int flagsMask,
            final int flagsValues, final int extraFlags, final Bundle options)
            throws IntentSender.SendIntentException {
        try {
            delegate.startIntentSenderFromFragment(fragment, intent, requestCode, fillInIntent,
                    flagsMask, flagsValues, extraFlags, options);
        } catch (SuppressedException e) {
            throw (IntentSender.SendIntentException) e.getCause();
        }
    }

    @Override
    public void startLocalVoiceInteraction(final Bundle privateOptions) {
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
    public void startManagingCursor(final Cursor c) {
        delegate.startManagingCursor(c);
    }

    @Override
    public boolean startNextMatchingActivity(final Intent intent) {
        return delegate.startNextMatchingActivity(intent);
    }

    @Override
    public boolean startNextMatchingActivity(final Intent intent, final Bundle options) {
        return delegate.startNextMatchingActivity(intent, options);
    }

    @Override
    public void startPostponedEnterTransition() {
        delegate.startPostponedEnterTransition();
    }

    @Override
    public void startSearch(final String initialQuery, final boolean selectInitialQuery,
            final Bundle appSearchData, final boolean globalSearch) {
        delegate.startSearch(initialQuery, selectInitialQuery, appSearchData, globalSearch);
    }

    @Override
    public ComponentName startService(final Intent service) {
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
    public ActionMode startSupportActionMode(@NonNull final ActionMode.Callback callback) {
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
    public void stopManagingCursor(final Cursor c) {
        delegate.stopManagingCursor(c);
    }

    @Override
    public boolean stopService(final Intent name) {
        return delegate.stopService(name);
    }

    @Override
    public void super_addContentView(final View view, final ViewGroup.LayoutParams params) {
        super.addContentView(view, params);
    }

    @Override
    public void super_applyOverrideConfiguration(final Configuration overrideConfiguration) {
        super.applyOverrideConfiguration(overrideConfiguration);
    }

    @Override
    public void super_attachBaseContext(final Context newBase) {
        super.attachBaseContext(newBase);
    }

    @Override
    public boolean super_bindService(final Intent service, final ServiceConnection conn,
            final int flags) {
        return super.bindService(service, conn, flags);
    }

    @Override
    public int super_checkCallingOrSelfPermission(final String permission) {
        return super.checkCallingOrSelfPermission(permission);
    }

    @Override
    public int super_checkCallingOrSelfUriPermission(final Uri uri, final int modeFlags) {
        return super.checkCallingOrSelfUriPermission(uri, modeFlags);
    }

    @Override
    public int super_checkCallingPermission(final String permission) {
        return super.checkCallingPermission(permission);
    }

    @Override
    public int super_checkCallingUriPermission(final Uri uri, final int modeFlags) {
        return super.checkCallingUriPermission(uri, modeFlags);
    }

    @Override
    public int super_checkPermission(final String permission, final int pid, final int uid) {
        return super.checkPermission(permission, pid, uid);
    }

    @Override
    public int super_checkSelfPermission(final String permission) {
        return super.checkSelfPermission(permission);
    }

    @Override
    public int super_checkUriPermission(final Uri uri, final int pid, final int uid,
            final int modeFlags) {
        return super.checkUriPermission(uri, pid, uid, modeFlags);
    }

    @Override
    public int super_checkUriPermission(final Uri uri, final String readPermission,
            final String writePermission, final int pid, final int uid, final int modeFlags) {
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
    public Context super_createConfigurationContext(final Configuration overrideConfiguration) {
        return super.createConfigurationContext(overrideConfiguration);
    }

    @Override
    public Context super_createDeviceProtectedStorageContext() {
        return super.createDeviceProtectedStorageContext();
    }

    @Override
    public Context super_createDisplayContext(final Display display) {
        return super.createDisplayContext(display);
    }

    @Override
    public Context super_createPackageContext(final String packageName, final int flags)
            throws PackageManager.NameNotFoundException {
        return super.createPackageContext(packageName, flags);
    }

    @Override
    public PendingIntent super_createPendingResult(final int requestCode, final Intent data,
            final int flags) {
        return super.createPendingResult(requestCode, data, flags);
    }

    @Override
    public String[] super_databaseList() {
        return super.databaseList();
    }

    @Override
    public boolean super_deleteDatabase(final String name) {
        return super.deleteDatabase(name);
    }

    @Override
    public boolean super_deleteFile(final String name) {
        return super.deleteFile(name);
    }

    @Override
    public boolean super_deleteSharedPreferences(final String name) {
        return super.deleteSharedPreferences(name);
    }

    @Override
    public boolean super_dispatchGenericMotionEvent(final MotionEvent ev) {
        return super.dispatchGenericMotionEvent(ev);
    }

    @Override
    public boolean super_dispatchKeyEvent(final KeyEvent event) {
        return super.dispatchKeyEvent(event);
    }

    @Override
    public boolean super_dispatchKeyShortcutEvent(final KeyEvent event) {
        return super.dispatchKeyShortcutEvent(event);
    }

    @Override
    public boolean super_dispatchPopulateAccessibilityEvent(final AccessibilityEvent event) {
        return super.dispatchPopulateAccessibilityEvent(event);
    }

    @Override
    public boolean super_dispatchTouchEvent(final MotionEvent ev) {
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean super_dispatchTrackballEvent(final MotionEvent ev) {
        return super.dispatchTrackballEvent(ev);
    }

    @Override
    public void super_dump(final String prefix, final FileDescriptor fd, final PrintWriter writer,
            final String[] args) {
        super.dump(prefix, fd, writer, args);
    }

    @Override
    public void super_enforceCallingOrSelfPermission(final String permission,
            final String message) {
        super.enforceCallingOrSelfPermission(permission, message);
    }

    @Override
    public void super_enforceCallingOrSelfUriPermission(final Uri uri, final int modeFlags,
            final String message) {
        super.enforceCallingOrSelfUriPermission(uri, modeFlags, message);
    }

    @Override
    public void super_enforceCallingPermission(final String permission, final String message) {
        super.enforceCallingPermission(permission, message);
    }

    @Override
    public void super_enforceCallingUriPermission(final Uri uri, final int modeFlags,
            final String message) {
        super.enforceCallingUriPermission(uri, modeFlags, message);
    }

    @Override
    public void super_enforcePermission(final String permission, final int pid, final int uid,
            final String message) {
        super.enforcePermission(permission, pid, uid, message);
    }

    @Override
    public void super_enforceUriPermission(final Uri uri, final int pid, final int uid,
            final int modeFlags, final String message) {
        super.enforceUriPermission(uri, pid, uid, modeFlags, message);
    }

    @Override
    public void super_enforceUriPermission(final Uri uri, final String readPermission,
            final String writePermission, final int pid, final int uid, final int modeFlags,
            final String message) {
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
    public View super_findViewById(@IdRes final int id) {
        return super.findViewById(id);
    }

    @Override
    public void super_finish() {
        super.finish();
    }

    @Override
    public void super_finishActivity(final int requestCode) {
        super.finishActivity(requestCode);
    }

    @Override
    public void super_finishActivityFromChild(final Activity child, final int requestCode) {
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
    public void super_finishFromChild(final Activity child) {
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
    public File super_getDatabasePath(final String name) {
        return super.getDatabasePath(name);
    }

    @NonNull
    @Override
    public AppCompatDelegate super_getDelegate() {
        return super.getDelegate();
    }

    @Override
    public File super_getDir(final String name, final int mode) {
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
    public File super_getExternalFilesDir(final String type) {
        return super.getExternalFilesDir(type);
    }

    @Override
    public File[] super_getExternalFilesDirs(final String type) {
        return super.getExternalFilesDirs(type);
    }

    @Override
    public File[] super_getExternalMediaDirs() {
        return super.getExternalMediaDirs();
    }

    @Override
    public File super_getFileStreamPath(final String name) {
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
    public SharedPreferences super_getPreferences(final int mode) {
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
    public SharedPreferences super_getSharedPreferences(final String name, final int mode) {
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
    public Object super_getSystemService(final String name) {
        return super.getSystemService(name);
    }

    @Override
    public String super_getSystemServiceName(final Class<?> serviceClass) {
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
    public void super_grantUriPermission(final String toPackage, final Uri uri,
            final int modeFlags) {
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
    public boolean super_moveDatabaseFrom(final Context sourceContext, final String name) {
        return super.moveDatabaseFrom(sourceContext, name);
    }

    @Override
    public boolean super_moveSharedPreferencesFrom(final Context sourceContext, final String name) {
        return super.moveSharedPreferencesFrom(sourceContext, name);
    }

    @Override
    public boolean super_moveTaskToBack(final boolean nonRoot) {
        return super.moveTaskToBack(nonRoot);
    }

    @Override
    public boolean super_navigateUpTo(final Intent upIntent) {
        return super.navigateUpTo(upIntent);
    }

    @Override
    public boolean super_navigateUpToFromChild(final Activity child, final Intent upIntent) {
        return super.navigateUpToFromChild(child, upIntent);
    }

    @Override
    public void super_onActionModeFinished(final android.view.ActionMode mode) {
        super.onActionModeFinished(mode);
    }

    @Override
    public void super_onActionModeStarted(final android.view.ActionMode mode) {
        super.onActionModeStarted(mode);
    }

    @Override
    public void super_onActivityReenter(final int resultCode, final Intent data) {
        super.onActivityReenter(resultCode, data);
    }

    @Override
    public void super_onActivityResult(final int requestCode, final int resultCode,
            final Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void super_onApplyThemeResource(final Resources.Theme theme, final int resid,
            final boolean first) {
        super.onApplyThemeResource(theme, resid, first);
    }

    @Override
    public void super_onAttachFragment(final Fragment fragment) {
        super.onAttachFragment(fragment);
    }

    @Override
    public void super_onAttachFragment(final android.app.Fragment fragment) {
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
    public void super_onChildTitleChanged(final Activity childActivity, final CharSequence title) {
        super.onChildTitleChanged(childActivity, title);
    }

    @Override
    public void super_onConfigurationChanged(final Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void super_onContentChanged() {
        super.onContentChanged();
    }

    @Override
    public boolean super_onContextItemSelected(final MenuItem item) {
        return super.onContextItemSelected(item);
    }

    @Override
    public void super_onContextMenuClosed(final Menu menu) {
        super.onContextMenuClosed(menu);
    }

    @Override
    public void super_onCreate(final Bundle savedInstanceState,
            final PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }

    @Override
    public void super_onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void super_onCreateContextMenu(final ContextMenu menu, final View v,
            final ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Nullable
    @Override
    public CharSequence super_onCreateDescription() {
        return super.onCreateDescription();
    }

    @Override
    public Dialog super_onCreateDialog(final int id) {
        return super.onCreateDialog(id);
    }

    @Nullable
    @Override
    public Dialog super_onCreateDialog(final int id, final Bundle args) {
        return super.onCreateDialog(id, args);
    }

    @Override
    public void super_onCreateNavigateUpTaskStack(final TaskStackBuilder builder) {
        super.onCreateNavigateUpTaskStack(builder);
    }

    @Override
    public boolean super_onCreateOptionsMenu(final Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean super_onCreatePanelMenu(final int featureId, final Menu menu) {
        return super.onCreatePanelMenu(featureId, menu);
    }

    @Nullable
    @Override
    public View super_onCreatePanelView(final int featureId) {
        return super.onCreatePanelView(featureId);
    }

    @Override
    public void super_onCreateSupportNavigateUpTaskStack(
            @NonNull final android.support.v4.app.TaskStackBuilder builder) {
        super.onCreateSupportNavigateUpTaskStack(builder);
    }

    @Override
    public boolean super_onCreateThumbnail(final Bitmap outBitmap, final Canvas canvas) {
        return super.onCreateThumbnail(outBitmap, canvas);
    }

    @Override
    public View super_onCreateView(final View parent, final String name, final Context context,
            final AttributeSet attrs) {
        return super.onCreateView(parent, name, context, attrs);
    }

    @Override
    public View super_onCreateView(final String name, final Context context,
            final AttributeSet attrs) {
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
    public boolean super_onGenericMotionEvent(final MotionEvent event) {
        return super.onGenericMotionEvent(event);
    }

    @Override
    public boolean super_onKeyDown(final int keyCode, final KeyEvent event) {
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean super_onKeyLongPress(final int keyCode, final KeyEvent event) {
        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public boolean super_onKeyMultiple(final int keyCode, final int repeatCount,
            final KeyEvent event) {
        return super.onKeyMultiple(keyCode, repeatCount, event);
    }

    @Override
    public boolean super_onKeyShortcut(final int keyCode, final KeyEvent event) {
        return super.onKeyShortcut(keyCode, event);
    }

    @Override
    public boolean super_onKeyUp(final int keyCode, final KeyEvent event) {
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
    public boolean super_onMenuOpened(final int featureId, final Menu menu) {
        return super.onMenuOpened(featureId, menu);
    }

    @Override
    public void super_onMultiWindowModeChanged(final boolean isInMultiWindowMode) {
        super.onMultiWindowModeChanged(isInMultiWindowMode);
    }

    @Override
    public boolean super_onNavigateUp() {
        return super.onNavigateUp();
    }

    @Override
    public boolean super_onNavigateUpFromChild(final Activity child) {
        return super.onNavigateUpFromChild(child);
    }

    @Override
    public void super_onNewIntent(final Intent intent) {
        super.onNewIntent(intent);
    }

    @Override
    public boolean super_onOptionsItemSelected(final MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void super_onOptionsMenuClosed(final Menu menu) {
        super.onOptionsMenuClosed(menu);
    }

    @Override
    public void super_onPanelClosed(final int featureId, final Menu menu) {
        super.onPanelClosed(featureId, menu);
    }

    @Override
    public void super_onPause() {
        super.onPause();
    }

    @Override
    public void super_onPictureInPictureModeChanged(final boolean isInPictureInPictureMode) {
        super.onPictureInPictureModeChanged(isInPictureInPictureMode);
    }

    @Override
    public void super_onPostCreate(final Bundle savedInstanceState,
            final PersistableBundle persistentState) {
        super.onPostCreate(savedInstanceState, persistentState);
    }

    @Override
    public void super_onPostCreate(@Nullable final Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
    }

    @Override
    public void super_onPostResume() {
        super.onPostResume();
    }

    @Override
    public void super_onPrepareDialog(final int id, final Dialog dialog) {
        super.onPrepareDialog(id, dialog);
    }

    @Override
    public void super_onPrepareDialog(final int id, final Dialog dialog, final Bundle args) {
        super.onPrepareDialog(id, dialog, args);
    }

    @Override
    public void super_onPrepareNavigateUpTaskStack(final TaskStackBuilder builder) {
        super.onPrepareNavigateUpTaskStack(builder);
    }

    @Override
    public boolean super_onPrepareOptionsMenu(final Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean super_onPrepareOptionsPanel(final View view, final Menu menu) {
        return super.onPrepareOptionsPanel(view, menu);
    }

    @Override
    public boolean super_onPreparePanel(final int featureId, final View view, final Menu menu) {
        return super.onPreparePanel(featureId, view, menu);
    }

    @Override
    public void super_onPrepareSupportNavigateUpTaskStack(
            @NonNull final android.support.v4.app.TaskStackBuilder builder) {
        super.onPrepareSupportNavigateUpTaskStack(builder);
    }

    @Override
    public void super_onProvideAssistContent(final AssistContent outContent) {
        super.onProvideAssistContent(outContent);
    }

    @Override
    public void super_onProvideAssistData(final Bundle data) {
        super.onProvideAssistData(data);
    }

    @Override
    public void super_onProvideKeyboardShortcuts(final List<KeyboardShortcutGroup> data,
            final Menu menu, final int deviceId) {
        super.onProvideKeyboardShortcuts(data, menu, deviceId);
    }

    @Override
    public Uri super_onProvideReferrer() {
        return super.onProvideReferrer();
    }

    @Override
    public void super_onRequestPermissionsResult(final int requestCode,
            @NonNull final String[] permissions, @NonNull final int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override
    public void super_onRestart() {
        super.onRestart();
    }

    @Override
    public void super_onRestoreInstanceState(final Bundle savedInstanceState,
            final PersistableBundle persistentState) {
        super.onRestoreInstanceState(savedInstanceState, persistentState);
    }

    @Override
    public void super_onRestoreInstanceState(final Bundle savedInstanceState) {
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
    public void super_onSaveInstanceState(final Bundle outState,
            final PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    public void super_onSaveInstanceState(final Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    public boolean super_onSearchRequested(final SearchEvent searchEvent) {
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
    public void super_onSupportActionModeFinished(@NonNull final ActionMode mode) {
        super.onSupportActionModeFinished(mode);
    }

    @Override
    public void super_onSupportActionModeStarted(@NonNull final ActionMode mode) {
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
    public void super_onTitleChanged(final CharSequence title, final int color) {
        super.onTitleChanged(title, color);
    }

    @Override
    public boolean super_onTouchEvent(final MotionEvent event) {
        return super.onTouchEvent(event);
    }

    @Override
    public boolean super_onTrackballEvent(final MotionEvent event) {
        return super.onTrackballEvent(event);
    }

    @Override
    public void super_onTrimMemory(final int level) {
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
    public void super_onWindowAttributesChanged(final WindowManager.LayoutParams params) {
        super.onWindowAttributesChanged(params);
    }

    @Override
    public void super_onWindowFocusChanged(final boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
    }

    @Nullable
    @Override
    public android.view.ActionMode super_onWindowStartingActionMode(
            final android.view.ActionMode.Callback callback) {
        return super.onWindowStartingActionMode(callback);
    }

    @Nullable
    @Override
    public android.view.ActionMode super_onWindowStartingActionMode(
            final android.view.ActionMode.Callback callback, final int type) {
        return super.onWindowStartingActionMode(callback, type);
    }

    @Nullable
    @Override
    public ActionMode super_onWindowStartingSupportActionMode(
            @NonNull final ActionMode.Callback callback) {
        return super.onWindowStartingSupportActionMode(callback);
    }

    @Override
    public void super_openContextMenu(final View view) {
        super.openContextMenu(view);
    }

    @Override
    public FileInputStream super_openFileInput(final String name) throws FileNotFoundException {
        return super.openFileInput(name);
    }

    @Override
    public FileOutputStream super_openFileOutput(final String name, final int mode)
            throws FileNotFoundException {
        return super.openFileOutput(name, mode);
    }

    @Override
    public void super_openOptionsMenu() {
        super.openOptionsMenu();
    }

    @Override
    public SQLiteDatabase super_openOrCreateDatabase(final String name, final int mode,
            final SQLiteDatabase.CursorFactory factory) {
        return super.openOrCreateDatabase(name, mode, factory);
    }

    @Override
    public SQLiteDatabase super_openOrCreateDatabase(final String name, final int mode,
            final SQLiteDatabase.CursorFactory factory, final DatabaseErrorHandler errorHandler) {
        return super.openOrCreateDatabase(name, mode, factory, errorHandler);
    }

    @Override
    public void super_overridePendingTransition(final int enterAnim, final int exitAnim) {
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
    public void super_registerComponentCallbacks(final ComponentCallbacks callback) {
        super.registerComponentCallbacks(callback);
    }

    @Override
    public void super_registerForContextMenu(final View view) {
        super.registerForContextMenu(view);
    }

    @Override
    public Intent super_registerReceiver(final BroadcastReceiver receiver,
            final IntentFilter filter) {
        return super.registerReceiver(receiver, filter);
    }

    @Override
    public Intent super_registerReceiver(final BroadcastReceiver receiver,
            final IntentFilter filter, final String broadcastPermission, final Handler scheduler) {
        return super.registerReceiver(receiver, filter, broadcastPermission, scheduler);
    }

    @Override
    public boolean super_releaseInstance() {
        return super.releaseInstance();
    }

    @Override
    public void super_removeStickyBroadcast(final Intent intent) {
        super.removeStickyBroadcast(intent);
    }

    @Override
    public void super_removeStickyBroadcastAsUser(final Intent intent, final UserHandle user) {
        super.removeStickyBroadcastAsUser(intent, user);
    }

    @Override
    public void super_reportFullyDrawn() {
        super.reportFullyDrawn();
    }

    @Override
    public DragAndDropPermissions super_requestDragAndDropPermissions(final DragEvent event) {
        return super.requestDragAndDropPermissions(event);
    }

    @Override
    public boolean super_requestVisibleBehind(final boolean visible) {
        return super.requestVisibleBehind(visible);
    }

    @Override
    public void super_revokeUriPermission(final Uri uri, final int modeFlags) {
        super.revokeUriPermission(uri, modeFlags);
    }

    @Override
    public void super_sendBroadcast(final Intent intent) {
        super.sendBroadcast(intent);
    }

    @Override
    public void super_sendBroadcast(final Intent intent, final String receiverPermission) {
        super.sendBroadcast(intent, receiverPermission);
    }

    @Override
    public void super_sendBroadcastAsUser(final Intent intent, final UserHandle user) {
        super.sendBroadcastAsUser(intent, user);
    }

    @Override
    public void super_sendBroadcastAsUser(final Intent intent, final UserHandle user,
            final String receiverPermission) {
        super.sendBroadcastAsUser(intent, user, receiverPermission);
    }

    @Override
    public void super_sendOrderedBroadcast(final Intent intent, final String receiverPermission) {
        super.sendOrderedBroadcast(intent, receiverPermission);
    }

    @Override
    public void super_sendOrderedBroadcast(final Intent intent, final String receiverPermission,
            final BroadcastReceiver resultReceiver, final Handler scheduler, final int initialCode,
            final String initialData, final Bundle initialExtras) {
        super.sendOrderedBroadcast(intent, receiverPermission, resultReceiver, scheduler,
                initialCode, initialData, initialExtras);
    }

    @Override
    public void super_sendOrderedBroadcastAsUser(final Intent intent, final UserHandle user,
            final String receiverPermission, final BroadcastReceiver resultReceiver,
            final Handler scheduler, final int initialCode, final String initialData,
            final Bundle initialExtras) {
        super.sendOrderedBroadcastAsUser(intent, user, receiverPermission, resultReceiver,
                scheduler, initialCode, initialData, initialExtras);
    }

    @Override
    public void super_sendStickyBroadcast(final Intent intent) {
        super.sendStickyBroadcast(intent);
    }

    @Override
    public void super_sendStickyBroadcastAsUser(final Intent intent, final UserHandle user) {
        super.sendStickyBroadcastAsUser(intent, user);
    }

    @Override
    public void super_sendStickyOrderedBroadcast(final Intent intent,
            final BroadcastReceiver resultReceiver, final Handler scheduler, final int initialCode,
            final String initialData, final Bundle initialExtras) {
        super.sendStickyOrderedBroadcast(intent, resultReceiver, scheduler, initialCode,
                initialData, initialExtras);
    }

    @Override
    public void super_sendStickyOrderedBroadcastAsUser(final Intent intent, final UserHandle user,
            final BroadcastReceiver resultReceiver, final Handler scheduler, final int initialCode,
            final String initialData, final Bundle initialExtras) {
        super.sendStickyOrderedBroadcastAsUser(intent, user, resultReceiver, scheduler, initialCode,
                initialData, initialExtras);
    }

    @Override
    public void super_setActionBar(final Toolbar toolbar) {
        super.setActionBar(toolbar);
    }

    @Override
    public void super_setContentTransitionManager(final TransitionManager tm) {
        super.setContentTransitionManager(tm);
    }

    @Override
    public void super_setContentView(@LayoutRes final int layoutResID) {
        super.setContentView(layoutResID);
    }

    @Override
    public void super_setContentView(final View view) {
        super.setContentView(view);
    }

    @Override
    public void super_setContentView(final View view, final ViewGroup.LayoutParams params) {
        super.setContentView(view, params);
    }

    @Override
    public void super_setEnterSharedElementCallback(final SharedElementCallback callback) {
        super.setEnterSharedElementCallback(callback);
    }

    @Override
    public void super_setEnterSharedElementCallback(
            final android.app.SharedElementCallback callback) {
        super.setEnterSharedElementCallback(callback);
    }

    @Override
    public void super_setExitSharedElementCallback(final SharedElementCallback listener) {
        super.setExitSharedElementCallback(listener);
    }

    @Override
    public void super_setExitSharedElementCallback(
            final android.app.SharedElementCallback callback) {
        super.setExitSharedElementCallback(callback);
    }

    @Override
    public void super_setFinishOnTouchOutside(final boolean finish) {
        super.setFinishOnTouchOutside(finish);
    }

    @Override
    public void super_setImmersive(final boolean i) {
        super.setImmersive(i);
    }

    @Override
    public void super_setIntent(final Intent newIntent) {
        super.setIntent(newIntent);
    }

    @Override
    public void super_setRequestedOrientation(final int requestedOrientation) {
        super.setRequestedOrientation(requestedOrientation);
    }

    @Override
    public void super_setSupportActionBar(
            @Nullable final android.support.v7.widget.Toolbar toolbar) {
        super.setSupportActionBar(toolbar);
    }

    @Override
    public void super_setSupportProgress(final int progress) {
        super.setSupportProgress(progress);
    }

    @Override
    public void super_setSupportProgressBarIndeterminate(final boolean indeterminate) {
        super.setSupportProgressBarIndeterminate(indeterminate);
    }

    @Override
    public void super_setSupportProgressBarIndeterminateVisibility(final boolean visible) {
        super.setSupportProgressBarIndeterminateVisibility(visible);
    }

    @Override
    public void super_setSupportProgressBarVisibility(final boolean visible) {
        super.setSupportProgressBarVisibility(visible);
    }

    @Override
    public void super_setTaskDescription(final ActivityManager.TaskDescription taskDescription) {
        super.setTaskDescription(taskDescription);
    }

    @Override
    public void super_setTheme(@StyleRes final int resid) {
        super.setTheme(resid);
    }

    @Override
    public void super_setTitle(final CharSequence title) {
        super.setTitle(title);
    }

    @Override
    public void super_setTitle(final int titleId) {
        super.setTitle(titleId);
    }

    @Override
    public void super_setTitleColor(final int textColor) {
        super.setTitleColor(textColor);
    }

    @Override
    public void super_setVisible(final boolean visible) {
        super.setVisible(visible);
    }

    @Override
    public void super_setVrModeEnabled(final boolean enabled,
            final ComponentName requestedComponent) throws PackageManager.NameNotFoundException {
        super.setVrModeEnabled(enabled, requestedComponent);
    }

    @Override
    public void super_setWallpaper(final Bitmap bitmap) throws IOException {
        super.setWallpaper(bitmap);
    }

    @Override
    public void super_setWallpaper(final InputStream data) throws IOException {
        super.setWallpaper(data);
    }

    @Override
    public boolean super_shouldShowRequestPermissionRationale(final String permission) {
        return super.shouldShowRequestPermissionRationale(permission);
    }

    @Override
    public boolean super_shouldUpRecreateTask(final Intent targetIntent) {
        return super.shouldUpRecreateTask(targetIntent);
    }

    @Override
    public boolean super_showAssist(final Bundle args) {
        return super.showAssist(args);
    }

    @Override
    public void super_showLockTaskEscapeMessage() {
        super.showLockTaskEscapeMessage();
    }

    @Nullable
    @Override
    public android.view.ActionMode super_startActionMode(
            final android.view.ActionMode.Callback callback) {
        return super.startActionMode(callback);
    }

    @Nullable
    @Override
    public android.view.ActionMode super_startActionMode(
            final android.view.ActionMode.Callback callback, final int type) {
        return super.startActionMode(callback, type);
    }

    @Override
    public void super_startActivities(final Intent[] intents) {
        super.startActivities(intents);
    }

    @Override
    public void super_startActivities(final Intent[] intents, final Bundle options) {
        super.startActivities(intents, options);
    }

    @Override
    public void super_startActivity(final Intent intent) {
        super.startActivity(intent);
    }

    @Override
    public void super_startActivity(final Intent intent, final Bundle options) {
        super.startActivity(intent, options);
    }

    @Override
    public void super_startActivityForResult(final Intent intent, final int requestCode) {
        super.startActivityForResult(intent, requestCode);
    }

    @Override
    public void super_startActivityForResult(final Intent intent, final int requestCode,
            @Nullable final Bundle options) {
        super.startActivityForResult(intent, requestCode, options);
    }

    @Override
    public void super_startActivityFromChild(final Activity child, final Intent intent,
            final int requestCode) {
        super.startActivityFromChild(child, intent, requestCode);
    }

    @Override
    public void super_startActivityFromChild(final Activity child, final Intent intent,
            final int requestCode, final Bundle options) {
        super.startActivityFromChild(child, intent, requestCode, options);
    }

    @Override
    public void super_startActivityFromFragment(final Fragment fragment, final Intent intent,
            final int requestCode) {
        super.startActivityFromFragment(fragment, intent, requestCode);
    }

    @Override
    public void super_startActivityFromFragment(final Fragment fragment, final Intent intent,
            final int requestCode, @Nullable final Bundle options) {
        super.startActivityFromFragment(fragment, intent, requestCode, options);
    }

    @Override
    public void super_startActivityFromFragment(final android.app.Fragment fragment,
            final Intent intent, final int requestCode) {
        super.startActivityFromFragment(fragment, intent, requestCode);
    }

    @Override
    public void super_startActivityFromFragment(final android.app.Fragment fragment,
            final Intent intent, final int requestCode, final Bundle options) {
        super.startActivityFromFragment(fragment, intent, requestCode, options);
    }

    @Override
    public boolean super_startActivityIfNeeded(final Intent intent, final int requestCode) {
        return super.startActivityIfNeeded(intent, requestCode);
    }

    @Override
    public boolean super_startActivityIfNeeded(final Intent intent, final int requestCode,
            final Bundle options) {
        return super.startActivityIfNeeded(intent, requestCode, options);
    }

    @Override
    public boolean super_startInstrumentation(final ComponentName className,
            final String profileFile, final Bundle arguments) {
        return super.startInstrumentation(className, profileFile, arguments);
    }

    @Override
    public void super_startIntentSender(final IntentSender intent, final Intent fillInIntent,
            final int flagsMask, final int flagsValues, final int extraFlags)
            throws IntentSender.SendIntentException {
        super.startIntentSender(intent, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    @Override
    public void super_startIntentSender(final IntentSender intent, final Intent fillInIntent,
            final int flagsMask, final int flagsValues, final int extraFlags, final Bundle options)
            throws IntentSender.SendIntentException {
        super.startIntentSender(intent, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    @Override
    public void super_startIntentSenderForResult(final IntentSender intent, final int requestCode,
            @Nullable final Intent fillInIntent, final int flagsMask, final int flagsValues,
            final int extraFlags, final Bundle options) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues,
                extraFlags, options);
    }

    @Override
    public void super_startIntentSenderForResult(final IntentSender intent, final int requestCode,
            @Nullable final Intent fillInIntent, final int flagsMask, final int flagsValues,
            final int extraFlags) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues,
                extraFlags);
    }

    @Override
    public void super_startIntentSenderFromChild(final Activity child, final IntentSender intent,
            final int requestCode, final Intent fillInIntent, final int flagsMask,
            final int flagsValues, final int extraFlags) throws IntentSender.SendIntentException {
        super.startIntentSenderFromChild(child, intent, requestCode, fillInIntent, flagsMask,
                flagsValues, extraFlags);
    }

    @Override
    public void super_startIntentSenderFromChild(final Activity child, final IntentSender intent,
            final int requestCode, final Intent fillInIntent, final int flagsMask,
            final int flagsValues, final int extraFlags, final Bundle options)
            throws IntentSender.SendIntentException {
        super.startIntentSenderFromChild(child, intent, requestCode, fillInIntent, flagsMask,
                flagsValues, extraFlags, options);
    }

    @Override
    public void super_startIntentSenderFromFragment(final Fragment fragment,
            final IntentSender intent, final int requestCode, @Nullable final Intent fillInIntent,
            final int flagsMask, final int flagsValues, final int extraFlags, final Bundle options)
            throws IntentSender.SendIntentException {
        super.startIntentSenderFromFragment(fragment, intent, requestCode, fillInIntent, flagsMask,
                flagsValues, extraFlags, options);
    }

    @Override
    public void super_startLocalVoiceInteraction(final Bundle privateOptions) {
        super.startLocalVoiceInteraction(privateOptions);
    }

    @Override
    public void super_startLockTask() {
        super.startLockTask();
    }

    @Override
    public void super_startManagingCursor(final Cursor c) {
        super.startManagingCursor(c);
    }

    @Override
    public boolean super_startNextMatchingActivity(final Intent intent) {
        return super.startNextMatchingActivity(intent);
    }

    @Override
    public boolean super_startNextMatchingActivity(final Intent intent, final Bundle options) {
        return super.startNextMatchingActivity(intent, options);
    }

    @Override
    public void super_startPostponedEnterTransition() {
        super.startPostponedEnterTransition();
    }

    @Override
    public void super_startSearch(final String initialQuery, final boolean selectInitialQuery,
            final Bundle appSearchData, final boolean globalSearch) {
        super.startSearch(initialQuery, selectInitialQuery, appSearchData, globalSearch);
    }

    @Override
    public ComponentName super_startService(final Intent service) {
        return super.startService(service);
    }

    @Nullable
    @Override
    public ActionMode super_startSupportActionMode(@NonNull final ActionMode.Callback callback) {
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
    public void super_stopManagingCursor(final Cursor c) {
        super.stopManagingCursor(c);
    }

    @Override
    public boolean super_stopService(final Intent name) {
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
    public void super_supportNavigateUpTo(@NonNull final Intent upIntent) {
        super.supportNavigateUpTo(upIntent);
    }

    @Override
    public void super_supportPostponeEnterTransition() {
        super.supportPostponeEnterTransition();
    }

    @Override
    public boolean super_supportRequestWindowFeature(final int featureId) {
        return super.supportRequestWindowFeature(featureId);
    }

    @Override
    public boolean super_supportShouldUpRecreateTask(@NonNull final Intent targetIntent) {
        return super.supportShouldUpRecreateTask(targetIntent);
    }

    @Override
    public void super_supportStartPostponedEnterTransition() {
        super.supportStartPostponedEnterTransition();
    }

    @Override
    public void super_takeKeyEvents(final boolean get) {
        super.takeKeyEvents(get);
    }

    @Override
    public void super_triggerSearch(final String query, final Bundle appSearchData) {
        super.triggerSearch(query, appSearchData);
    }

    @Override
    public void super_unbindService(final ServiceConnection conn) {
        super.unbindService(conn);
    }

    @Override
    public void super_unregisterComponentCallbacks(final ComponentCallbacks callback) {
        super.unregisterComponentCallbacks(callback);
    }

    @Override
    public void super_unregisterForContextMenu(final View view) {
        super.unregisterForContextMenu(view);
    }

    @Override
    public void super_unregisterReceiver(final BroadcastReceiver receiver) {
        super.unregisterReceiver(receiver);
    }

    /**
     * Reverses the Activity Scene entry Transition and triggers the calling Activity
     * to reverse its exit Transition. When the exit Transition completes,
     * {@link #finish()} is called. If no entry Transition was used, finish() is called
     * immediately and the Activity exit Transition is run.
     *
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
     *
     * <p>This method should be used when performing up navigation from within the same task
     * as the destination. If up navigation should cross tasks in some cases, see
     * {@link #supportShouldUpRecreateTask(Intent)}.</p>
     *
     * @param upIntent An intent representing the target destination for up navigation
     */
    @Override
    public void supportNavigateUpTo(@NonNull final Intent upIntent) {
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
    public boolean supportRequestWindowFeature(final int featureId) {
        return delegate.supportRequestWindowFeature(featureId);
    }

    /**
     * Returns true if sourceActivity should recreate the task when navigating 'up'
     * by using targetIntent.
     *
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
    public boolean supportShouldUpRecreateTask(@NonNull final Intent targetIntent) {
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
    public void takeKeyEvents(final boolean get) {
        delegate.takeKeyEvents(get);
    }

    @Override
    public void triggerSearch(final String query, final Bundle appSearchData) {
        delegate.triggerSearch(query, appSearchData);
    }

    @Override
    public void unbindService(final ServiceConnection conn) {
        delegate.unbindService(conn);
    }

    @Override
    public void unregisterComponentCallbacks(final ComponentCallbacks callback) {
        delegate.unregisterComponentCallbacks(callback);
    }

    @Override
    public void unregisterForContextMenu(final View view) {
        delegate.unregisterForContextMenu(view);
    }

    @Override
    public void unregisterReceiver(final BroadcastReceiver receiver) {
        delegate.unregisterReceiver(receiver);
    }
}
