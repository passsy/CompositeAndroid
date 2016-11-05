package com.pascalwelsch.compositeandroid.blueprints;

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

// 25.0.0
@SuppressWarnings("ALL")
public class BlueprintActivity extends AppCompatActivity {

    @Override
    public void addContentView(View view, ViewGroup.LayoutParams params) {
        super.addContentView(view, params);
    }

    @Override
    public void applyOverrideConfiguration(Configuration overrideConfiguration) {
        super.applyOverrideConfiguration(overrideConfiguration);
    }

    @Override
    public boolean bindService(Intent service, ServiceConnection conn, int flags) {
        return super.bindService(service, conn, flags);
    }

    @Override
    public int checkCallingOrSelfPermission(String permission) {
        return super.checkCallingOrSelfPermission(permission);
    }

    @Override
    public int checkCallingOrSelfUriPermission(Uri uri, int modeFlags) {
        return super.checkCallingOrSelfUriPermission(uri, modeFlags);
    }

    @Override
    public int checkCallingPermission(String permission) {
        return super.checkCallingPermission(permission);
    }

    @Override
    public int checkCallingUriPermission(Uri uri, int modeFlags) {
        return super.checkCallingUriPermission(uri, modeFlags);
    }

    @Override
    public int checkPermission(String permission, int pid, int uid) {
        return super.checkPermission(permission, pid, uid);
    }

    @Override
    public int checkSelfPermission(String permission) {
        return super.checkSelfPermission(permission);
    }

    @Override
    public int checkUriPermission(Uri uri, int pid, int uid, int modeFlags) {
        return super.checkUriPermission(uri, pid, uid, modeFlags);
    }

    @Override
    public int checkUriPermission(Uri uri, String readPermission, String writePermission, int pid,
            int uid, int modeFlags) {
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
    public Context createConfigurationContext(Configuration overrideConfiguration) {
        return super.createConfigurationContext(overrideConfiguration);
    }

    @Override
    public Context createDeviceProtectedStorageContext() {
        return super.createDeviceProtectedStorageContext();
    }

    @Override
    public Context createDisplayContext(Display display) {
        return super.createDisplayContext(display);
    }

    @Override
    public Context createPackageContext(String packageName, int flags)
            throws PackageManager.NameNotFoundException {
        return super.createPackageContext(packageName, flags);
    }

    @Override
    public PendingIntent createPendingResult(int requestCode, Intent data, int flags) {
        return super.createPendingResult(requestCode, data, flags);
    }

    @Override
    public String[] databaseList() {
        return super.databaseList();
    }

    @Override
    public boolean deleteDatabase(String name) {
        return super.deleteDatabase(name);
    }

    @Override
    public boolean deleteFile(String name) {
        return super.deleteFile(name);
    }

    @Override
    public boolean deleteSharedPreferences(String name) {
        return super.deleteSharedPreferences(name);
    }

    @Override
    public boolean dispatchGenericMotionEvent(MotionEvent ev) {
        return super.dispatchGenericMotionEvent(ev);
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        return super.dispatchKeyEvent(event);
    }

    @Override
    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        return super.dispatchKeyShortcutEvent(event);
    }

    @Override
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        return super.dispatchPopulateAccessibilityEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean dispatchTrackballEvent(MotionEvent ev) {
        return super.dispatchTrackballEvent(ev);
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
        super.dump(prefix, fd, writer, args);
    }

    @Override
    public void enforceCallingOrSelfPermission(String permission, String message) {
        super.enforceCallingOrSelfPermission(permission, message);
    }

    @Override
    public void enforceCallingOrSelfUriPermission(Uri uri, int modeFlags, String message) {
        super.enforceCallingOrSelfUriPermission(uri, modeFlags, message);
    }

    @Override
    public void enforceCallingPermission(String permission, String message) {
        super.enforceCallingPermission(permission, message);
    }

    @Override
    public void enforceCallingUriPermission(Uri uri, int modeFlags, String message) {
        super.enforceCallingUriPermission(uri, modeFlags, message);
    }

    @Override
    public void enforcePermission(String permission, int pid, int uid, String message) {
        super.enforcePermission(permission, pid, uid, message);
    }

    @Override
    public void enforceUriPermission(Uri uri, int pid, int uid, int modeFlags, String message) {
        super.enforceUriPermission(uri, pid, uid, modeFlags, message);
    }

    @Override
    public void enforceUriPermission(Uri uri, String readPermission, String writePermission,
            int pid, int uid, int modeFlags, String message) {
        super.enforceUriPermission(uri, readPermission, writePermission, pid, uid, modeFlags,
                message);
    }

    @Override
    public void enterPictureInPictureMode() {
        super.enterPictureInPictureMode();
    }

    @Override
    public String[] fileList() {
        return super.fileList();
    }

    @Override
    public View findViewById(@IdRes int id) {
        return super.findViewById(id);
    }

    @Override
    public void finish() {
        super.finish();
    }

    @Override
    public void finishActivity(int requestCode) {
        super.finishActivity(requestCode);
    }

    @Override
    public void finishActivityFromChild(Activity child, int requestCode) {
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
    public void finishFromChild(Activity child) {
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
    public File getDatabasePath(String name) {
        return super.getDatabasePath(name);
    }

    /**
     * @return The {@link AppCompatDelegate} being used by this Activity.
     */
    @NonNull
    @Override
    public AppCompatDelegate getDelegate() {
        return super.getDelegate();
    }

    @Override
    public File getDir(String name, int mode) {
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
    public File getExternalFilesDir(String type) {
        return super.getExternalFilesDir(type);
    }

    @Override
    public File[] getExternalFilesDirs(String type) {
        return super.getExternalFilesDirs(type);
    }

    @Override
    public File[] getExternalMediaDirs() {
        return super.getExternalMediaDirs();
    }

    @Override
    public File getFileStreamPath(String name) {
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

    /**
     * Return the value previously returned from
     * {@link #onRetainCustomNonConfigurationInstance()}.
     */
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
    public SharedPreferences getPreferences(int mode) {
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
    public SharedPreferences getSharedPreferences(String name, int mode) {
        return super.getSharedPreferences(name, mode);
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
        return super.getSupportActionBar();
    }

    /**
     * Return the FragmentManager for interacting with fragments associated
     * with this activity.
     */
    @Override
    public FragmentManager getSupportFragmentManager() {
        return super.getSupportFragmentManager();
    }

    @Override
    public LoaderManager getSupportLoaderManager() {
        return super.getSupportLoaderManager();
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
        return super.getSupportParentActivityIntent();
    }

    @Override
    public Object getSystemService(String name) {
        return super.getSystemService(name);
    }

    @Override
    public String getSystemServiceName(Class<?> serviceClass) {
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
    public void grantUriPermission(String toPackage, Uri uri, int modeFlags) {
        super.grantUriPermission(toPackage, uri, modeFlags);
    }

    @Override
    public boolean hasWindowFocus() {
        return super.hasWindowFocus();
    }

    /**
     * @hide
     */
    @Override
    public void invalidateOptionsMenu() {
        super.invalidateOptionsMenu();
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
    public boolean moveDatabaseFrom(Context sourceContext, String name) {
        return super.moveDatabaseFrom(sourceContext, name);
    }

    @Override
    public boolean moveSharedPreferencesFrom(Context sourceContext, String name) {
        return super.moveSharedPreferencesFrom(sourceContext, name);
    }

    @Override
    public boolean moveTaskToBack(boolean nonRoot) {
        return super.moveTaskToBack(nonRoot);
    }

    @Override
    public boolean navigateUpTo(Intent upIntent) {
        return super.navigateUpTo(upIntent);
    }

    @Override
    public boolean navigateUpToFromChild(Activity child, Intent upIntent) {
        return super.navigateUpToFromChild(child, upIntent);
    }

    @Override
    public void onActionModeFinished(android.view.ActionMode mode) {
        super.onActionModeFinished(mode);
    }

    @Override
    public void onActionModeStarted(android.view.ActionMode mode) {
        super.onActionModeStarted(mode);
    }

    @Override
    public void onActivityReenter(int resultCode, Intent data) {
        super.onActivityReenter(resultCode, data);
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
        super.onAttachFragment(fragment);
    }

    @Override
    public void onAttachFragment(android.app.Fragment fragment) {
        super.onAttachFragment(fragment);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    /**
     * Take care of popping the fragment back stack or finishing the activity
     * as appropriate.
     */
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onContentChanged() {
        super.onContentChanged();
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        return super.onContextItemSelected(item);
    }

    @Override
    public void onContextMenuClosed(Menu menu) {
        super.onContextMenuClosed(menu);
    }

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
            ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Nullable
    @Override
    public CharSequence onCreateDescription() {
        return super.onCreateDescription();
    }

    @Override
    public void onCreateNavigateUpTaskStack(TaskStackBuilder builder) {
        super.onCreateNavigateUpTaskStack(builder);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    /**
     * Dispatch to Fragment.onCreateOptionsMenu().
     */
    @Override
    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        return super.onCreatePanelMenu(featureId, menu);
    }

    @Nullable
    @Override
    public View onCreatePanelView(int featureId) {
        return super.onCreatePanelView(featureId);
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
        super.onCreateSupportNavigateUpTaskStack(builder);
    }

    @Override
    public boolean onCreateThumbnail(Bitmap outBitmap, Canvas canvas) {
        return super.onCreateThumbnail(outBitmap, canvas);
    }

    @Override
    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        return super.onCreateView(parent, name, context, attrs);
    }

    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
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
    public boolean onGenericMotionEvent(MotionEvent event) {
        return super.onGenericMotionEvent(event);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) {
        return super.onKeyMultiple(keyCode, repeatCount, event);
    }

    @Override
    public boolean onKeyShortcut(int keyCode, KeyEvent event) {
        return super.onKeyShortcut(keyCode, event);
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
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

    /**
     * Dispatch onLowMemory() to all fragments.
     */
    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>Please note: AppCompat uses it's own feature id for the action bar:
     * {@link AppCompatDelegate#FEATURE_SUPPORT_ACTION_BAR FEATURE_SUPPORT_ACTION_BAR}.</p>
     */
    @Override
    public boolean onMenuOpened(int featureId, Menu menu) {
        return super.onMenuOpened(featureId, menu);
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
        super.onMultiWindowModeChanged(isInMultiWindowMode);
    }

    @Override
    public boolean onNavigateUp() {
        return super.onNavigateUp();
    }

    @Override
    public boolean onNavigateUpFromChild(Activity child) {
        return super.onNavigateUpFromChild(child);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onOptionsMenuClosed(Menu menu) {
        super.onOptionsMenuClosed(menu);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>Please note: AppCompat uses it's own feature id for the action bar:
     * {@link AppCompatDelegate#FEATURE_SUPPORT_ACTION_BAR FEATURE_SUPPORT_ACTION_BAR}.</p>
     */
    @Override
    public void onPanelClosed(int featureId, Menu menu) {
        super.onPanelClosed(featureId, menu);
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
        super.onPictureInPictureModeChanged(isInPictureInPictureMode);
    }

    @Override
    public void onPostCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onPostCreate(savedInstanceState, persistentState);
    }

    @Override
    public void onPrepareNavigateUpTaskStack(TaskStackBuilder builder) {
        super.onPrepareNavigateUpTaskStack(builder);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    /**
     * Dispatch onPrepareOptionsMenu() to fragments.
     */
    @Override
    public boolean onPreparePanel(int featureId, View view, Menu menu) {
        return super.onPreparePanel(featureId, view, menu);
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
        super.onPrepareSupportNavigateUpTaskStack(builder);
    }

    @Override
    public void onProvideAssistContent(AssistContent outContent) {
        super.onProvideAssistContent(outContent);
    }

    @Override
    public void onProvideAssistData(Bundle data) {
        super.onProvideAssistData(data);
    }

    @Override
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> data, Menu menu,
            int deviceId) {
        super.onProvideKeyboardShortcuts(data, menu, deviceId);
    }

    @Override
    public Uri onProvideReferrer() {
        return super.onProvideReferrer();
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
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState,
            PersistableBundle persistentState) {
        super.onRestoreInstanceState(savedInstanceState, persistentState);
    }

    /**
     * Use this instead of {@link #onRetainNonConfigurationInstance()}.
     * Retrieve later with {@link #getLastCustomNonConfigurationInstance()}.
     */
    @Override
    public Object onRetainCustomNonConfigurationInstance() {
        return super.onRetainCustomNonConfigurationInstance();
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return super.onSearchRequested(searchEvent);
    }

    @Override
    public boolean onSearchRequested() {
        return super.onSearchRequested();
    }

    /**
     * Hook in to note that fragment state is no longer saved.
     */
    @Override
    public void onStateNotSaved() {
        super.onStateNotSaved();
    }

    /**
     * Notifies the activity that a support action mode has finished.
     * Activity subclasses overriding this method should call the superclass implementation.
     *
     * @param mode The action mode that just finished.
     */
    @Override
    public void onSupportActionModeFinished(@NonNull ActionMode mode) {
        super.onSupportActionModeFinished(mode);
    }

    /**
     * Notifies the Activity that a support action mode has been started.
     * Activity subclasses overriding this method should call the superclass implementation.
     *
     * @param mode The new action mode.
     */
    @Override
    public void onSupportActionModeStarted(@NonNull ActionMode mode) {
        super.onSupportActionModeStarted(mode);
    }

    /**
     * @deprecated Use {@link #onContentChanged()} instead.
     */
    @Override
    public void onSupportContentChanged() {
        super.onSupportContentChanged();
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
        return super.onSupportNavigateUp();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onTrackballEvent(MotionEvent event) {
        return super.onTrackballEvent(event);
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }

    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
    }

    @Override
    public void onVisibleBehindCanceled() {
        super.onVisibleBehindCanceled();
    }

    @Override
    public void onWindowAttributesChanged(WindowManager.LayoutParams params) {
        super.onWindowAttributesChanged(params);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
    }

    @Nullable
    @Override
    public android.view.ActionMode onWindowStartingActionMode(
            android.view.ActionMode.Callback callback) {
        return super.onWindowStartingActionMode(callback);
    }

    @Nullable
    @Override
    public android.view.ActionMode onWindowStartingActionMode(
            android.view.ActionMode.Callback callback, int type) {
        return super.onWindowStartingActionMode(callback, type);
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
        return super.onWindowStartingSupportActionMode(callback);
    }

    @Override
    public void openContextMenu(View view) {
        super.openContextMenu(view);
    }

    @Override
    public FileInputStream openFileInput(String name) throws FileNotFoundException {
        return super.openFileInput(name);
    }

    @Override
    public FileOutputStream openFileOutput(String name, int mode) throws FileNotFoundException {
        return super.openFileOutput(name, mode);
    }

    @Override
    public void openOptionsMenu() {
        super.openOptionsMenu();
    }

    @Override
    public SQLiteDatabase openOrCreateDatabase(String name, int mode,
            SQLiteDatabase.CursorFactory factory) {
        return super.openOrCreateDatabase(name, mode, factory);
    }

    @Override
    public SQLiteDatabase openOrCreateDatabase(String name, int mode,
            SQLiteDatabase.CursorFactory factory, DatabaseErrorHandler errorHandler) {
        return super.openOrCreateDatabase(name, mode, factory, errorHandler);
    }

    @Override
    public void overridePendingTransition(int enterAnim, int exitAnim) {
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
    public void recreate() {
        super.recreate();
    }

    @Override
    public void registerComponentCallbacks(ComponentCallbacks callback) {
        super.registerComponentCallbacks(callback);
    }

    @Override
    public void registerForContextMenu(View view) {
        super.registerForContextMenu(view);
    }

    @Override
    public Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter) {
        return super.registerReceiver(receiver, filter);
    }

    @Override
    public Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter,
            String broadcastPermission, Handler scheduler) {
        return super.registerReceiver(receiver, filter, broadcastPermission, scheduler);
    }

    @Override
    public boolean releaseInstance() {
        return super.releaseInstance();
    }

    /**
     * @deprecated
     */
    @Override
    public void removeStickyBroadcast(Intent intent) {
        super.removeStickyBroadcast(intent);
    }

    /**
     * @deprecated
     */
    @Override
    public void removeStickyBroadcastAsUser(Intent intent, UserHandle user) {
        super.removeStickyBroadcastAsUser(intent, user);
    }

    @Override
    public void reportFullyDrawn() {
        super.reportFullyDrawn();
    }

    @Override
    public DragAndDropPermissions requestDragAndDropPermissions(DragEvent event) {
        return super.requestDragAndDropPermissions(event);
    }

    @Override
    public boolean requestVisibleBehind(boolean visible) {
        return super.requestVisibleBehind(visible);
    }

    @Override
    public void revokeUriPermission(Uri uri, int modeFlags) {
        super.revokeUriPermission(uri, modeFlags);
    }

    @Override
    public void sendBroadcast(Intent intent) {
        super.sendBroadcast(intent);
    }

    @Override
    public void sendBroadcast(Intent intent, String receiverPermission) {
        super.sendBroadcast(intent, receiverPermission);
    }

    @Override
    public void sendBroadcastAsUser(Intent intent, UserHandle user) {
        super.sendBroadcastAsUser(intent, user);
    }

    @Override
    public void sendBroadcastAsUser(Intent intent, UserHandle user, String receiverPermission) {
        super.sendBroadcastAsUser(intent, user, receiverPermission);
    }

    @Override
    public void sendOrderedBroadcast(Intent intent, String receiverPermission) {
        super.sendOrderedBroadcast(intent, receiverPermission);
    }

    @Override
    public void sendOrderedBroadcast(Intent intent, String receiverPermission,
            BroadcastReceiver resultReceiver, Handler scheduler, int initialCode,
            String initialData, Bundle initialExtras) {
        super.sendOrderedBroadcast(intent, receiverPermission, resultReceiver, scheduler,
                initialCode, initialData, initialExtras);
    }

    @Override
    public void sendOrderedBroadcastAsUser(Intent intent, UserHandle user,
            String receiverPermission, BroadcastReceiver resultReceiver, Handler scheduler,
            int initialCode, String initialData, Bundle initialExtras) {
        super.sendOrderedBroadcastAsUser(intent, user, receiverPermission, resultReceiver,
                scheduler, initialCode, initialData, initialExtras);
    }

    /**
     * @deprecated
     */
    @Override
    public void sendStickyBroadcast(Intent intent) {
        super.sendStickyBroadcast(intent);
    }

    /**
     * @deprecated
     */
    @Override
    public void sendStickyBroadcastAsUser(Intent intent, UserHandle user) {
        super.sendStickyBroadcastAsUser(intent, user);
    }

    /**
     * @deprecated
     */
    @Override
    public void sendStickyOrderedBroadcast(Intent intent, BroadcastReceiver resultReceiver,
            Handler scheduler, int initialCode, String initialData, Bundle initialExtras) {
        super.sendStickyOrderedBroadcast(intent, resultReceiver, scheduler, initialCode,
                initialData, initialExtras);
    }

    /**
     * @deprecated
     */
    @Override
    public void sendStickyOrderedBroadcastAsUser(Intent intent, UserHandle user,
            BroadcastReceiver resultReceiver, Handler scheduler, int initialCode,
            String initialData, Bundle initialExtras) {
        super.sendStickyOrderedBroadcastAsUser(intent, user, resultReceiver, scheduler, initialCode,
                initialData, initialExtras);
    }

    @Override
    public void setActionBar(Toolbar toolbar) {
        super.setActionBar(toolbar);
    }

    @Override
    public void setContentTransitionManager(TransitionManager tm) {
        super.setContentTransitionManager(tm);
    }

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        super.setContentView(view, params);
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
        super.setEnterSharedElementCallback(callback);
    }

    @Override
    public void setEnterSharedElementCallback(android.app.SharedElementCallback callback) {
        super.setEnterSharedElementCallback(callback);
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
        super.setExitSharedElementCallback(listener);
    }

    @Override
    public void setExitSharedElementCallback(android.app.SharedElementCallback callback) {
        super.setExitSharedElementCallback(callback);
    }

    @Override
    public void setFinishOnTouchOutside(boolean finish) {
        super.setFinishOnTouchOutside(finish);
    }

    @Override
    public void setImmersive(boolean i) {
        super.setImmersive(i);
    }

    @Override
    public void setIntent(Intent newIntent) {
        super.setIntent(newIntent);
    }

    @Override
    public void setRequestedOrientation(int requestedOrientation) {
        super.setRequestedOrientation(requestedOrientation);
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
        super.setSupportActionBar(toolbar);
    }

    /**
     * @deprecated Progress bars are no longer provided in AppCompat.
     */
    @Override
    public void setSupportProgress(int progress) {
        super.setSupportProgress(progress);
    }

    /**
     * @deprecated Progress bars are no longer provided in AppCompat.
     */
    @Override
    public void setSupportProgressBarIndeterminate(boolean indeterminate) {
        super.setSupportProgressBarIndeterminate(indeterminate);
    }

    /**
     * @deprecated Progress bars are no longer provided in AppCompat.
     */
    @Override
    public void setSupportProgressBarIndeterminateVisibility(boolean visible) {
        super.setSupportProgressBarIndeterminateVisibility(visible);
    }

    /**
     * @deprecated Progress bars are no longer provided in AppCompat.
     */
    @Override
    public void setSupportProgressBarVisibility(boolean visible) {
        super.setSupportProgressBarVisibility(visible);
    }

    @Override
    public void setTaskDescription(ActivityManager.TaskDescription taskDescription) {
        super.setTaskDescription(taskDescription);
    }

    @Override
    public void setTheme(@StyleRes int resid) {
        super.setTheme(resid);
    }

    @Override
    public void setTitle(CharSequence title) {
        super.setTitle(title);
    }

    @Override
    public void setTitle(int titleId) {
        super.setTitle(titleId);
    }

    /**
     * @deprecated
     */
    @Override
    public void setTitleColor(int textColor) {
        super.setTitleColor(textColor);
    }

    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
    }

    @Override
    public void setVrModeEnabled(boolean enabled, ComponentName requestedComponent)
            throws PackageManager.NameNotFoundException {
        super.setVrModeEnabled(enabled, requestedComponent);
    }

    /**
     * @deprecated
     */
    @Override
    public void setWallpaper(Bitmap bitmap) throws IOException {
        super.setWallpaper(bitmap);
    }

    /**
     * @deprecated
     */
    @Override
    public void setWallpaper(InputStream data) throws IOException {
        super.setWallpaper(data);
    }

    @Override
    public boolean shouldShowRequestPermissionRationale(String permission) {
        return super.shouldShowRequestPermissionRationale(permission);
    }

    @Override
    public boolean shouldUpRecreateTask(Intent targetIntent) {
        return super.shouldUpRecreateTask(targetIntent);
    }

    @Override
    public boolean showAssist(Bundle args) {
        return super.showAssist(args);
    }

    @Override
    public void showLockTaskEscapeMessage() {
        super.showLockTaskEscapeMessage();
    }

    @Nullable
    @Override
    public android.view.ActionMode startActionMode(android.view.ActionMode.Callback callback) {
        return super.startActionMode(callback);
    }

    @Nullable
    @Override
    public android.view.ActionMode startActionMode(android.view.ActionMode.Callback callback,
            int type) {
        return super.startActionMode(callback, type);
    }

    @Override
    public void startActivities(Intent[] intents) {
        super.startActivities(intents);
    }

    @Override
    public void startActivities(Intent[] intents, Bundle options) {
        super.startActivities(intents, options);
    }

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
    }

    @Override
    public void startActivity(Intent intent, Bundle options) {
        super.startActivity(intent, options);
    }

    /**
     * Modifies the standard behavior to allow results to be delivered to fragments.
     * This imposes a restriction that requestCode be <= 0xffff.
     */
    @Override
    public void startActivityForResult(Intent intent, int requestCode) {
        super.startActivityForResult(intent, requestCode);
    }

    @Override
    public void startActivityForResult(Intent intent, int requestCode, @Nullable Bundle options) {
        super.startActivityForResult(intent, requestCode, options);
    }

    @Override
    public void startActivityFromChild(Activity child, Intent intent, int requestCode) {
        super.startActivityFromChild(child, intent, requestCode);
    }

    @Override
    public void startActivityFromChild(Activity child, Intent intent, int requestCode,
            Bundle options) {
        super.startActivityFromChild(child, intent, requestCode, options);
    }

    /**
     * Called by Fragment.startActivityForResult() to implement its behavior.
     */
    @Override
    public void startActivityFromFragment(Fragment fragment, Intent intent, int requestCode) {
        super.startActivityFromFragment(fragment, intent, requestCode);
    }

    /**
     * Called by Fragment.startActivityForResult() to implement its behavior.
     */
    @Override
    public void startActivityFromFragment(Fragment fragment, Intent intent, int requestCode,
            @Nullable Bundle options) {
        super.startActivityFromFragment(fragment, intent, requestCode, options);
    }

    @Override
    public void startActivityFromFragment(android.app.Fragment fragment, Intent intent,
            int requestCode) {
        super.startActivityFromFragment(fragment, intent, requestCode);
    }

    @Override
    public void startActivityFromFragment(android.app.Fragment fragment, Intent intent,
            int requestCode, Bundle options) {
        super.startActivityFromFragment(fragment, intent, requestCode, options);
    }

    @Override
    public boolean startActivityIfNeeded(Intent intent, int requestCode) {
        return super.startActivityIfNeeded(intent, requestCode);
    }

    @Override
    public boolean startActivityIfNeeded(Intent intent, int requestCode, Bundle options) {
        return super.startActivityIfNeeded(intent, requestCode, options);
    }

    @Override
    public boolean startInstrumentation(ComponentName className, String profileFile,
            Bundle arguments) {
        return super.startInstrumentation(className, profileFile, arguments);
    }

    @Override
    public void startIntentSender(IntentSender intent, Intent fillInIntent, int flagsMask,
            int flagsValues, int extraFlags) throws IntentSender.SendIntentException {
        super.startIntentSender(intent, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    @Override
    public void startIntentSender(IntentSender intent, Intent fillInIntent, int flagsMask,
            int flagsValues, int extraFlags, Bundle options)
            throws IntentSender.SendIntentException {
        super.startIntentSender(intent, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    @Override
    public void startIntentSenderForResult(IntentSender intent, int requestCode,
            @Nullable Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags,
            Bundle options) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues,
                extraFlags, options);
    }

    @Override
    public void startIntentSenderForResult(IntentSender intent, int requestCode,
            @Nullable Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags)
            throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues,
                extraFlags);
    }

    @Override
    public void startIntentSenderFromChild(Activity child, IntentSender intent, int requestCode,
            Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags)
            throws IntentSender.SendIntentException {
        super.startIntentSenderFromChild(child, intent, requestCode, fillInIntent, flagsMask,
                flagsValues, extraFlags);
    }

    @Override
    public void startIntentSenderFromChild(Activity child, IntentSender intent, int requestCode,
            Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options)
            throws IntentSender.SendIntentException {
        super.startIntentSenderFromChild(child, intent, requestCode, fillInIntent, flagsMask,
                flagsValues, extraFlags, options);
    }

    /**
     * Called by Fragment.startIntentSenderForResult() to implement its behavior.
     */
    @Override
    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intent,
            int requestCode, @Nullable Intent fillInIntent, int flagsMask, int flagsValues,
            int extraFlags, Bundle options) throws IntentSender.SendIntentException {
        super.startIntentSenderFromFragment(fragment, intent, requestCode, fillInIntent, flagsMask,
                flagsValues, extraFlags, options);
    }

    @Override
    public void startLocalVoiceInteraction(Bundle privateOptions) {
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
    public void startManagingCursor(Cursor c) {
        super.startManagingCursor(c);
    }

    @Override
    public boolean startNextMatchingActivity(Intent intent) {
        return super.startNextMatchingActivity(intent);
    }

    @Override
    public boolean startNextMatchingActivity(Intent intent, Bundle options) {
        return super.startNextMatchingActivity(intent, options);
    }

    @Override
    public void startPostponedEnterTransition() {
        super.startPostponedEnterTransition();
    }

    @Override
    public void startSearch(String initialQuery, boolean selectInitialQuery, Bundle appSearchData,
            boolean globalSearch) {
        super.startSearch(initialQuery, selectInitialQuery, appSearchData, globalSearch);
    }

    @Override
    public ComponentName startService(Intent service) {
        return super.startService(service);
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
    public void stopManagingCursor(Cursor c) {
        super.stopManagingCursor(c);
    }

    @Override
    public boolean stopService(Intent name) {
        return super.stopService(name);
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
        super.supportFinishAfterTransition();
    }

    @Override
    public void supportInvalidateOptionsMenu() {
        super.supportInvalidateOptionsMenu();
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
        super.supportNavigateUpTo(upIntent);
    }

    /**
     * Support library version of {@link Activity#postponeEnterTransition()} that works
     * only on API 21 and later.
     */
    @Override
    public void supportPostponeEnterTransition() {
        super.supportPostponeEnterTransition();
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
        return super.supportRequestWindowFeature(featureId);
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
        return super.supportShouldUpRecreateTask(targetIntent);
    }

    /**
     * Support library version of {@link Activity#startPostponedEnterTransition()}
     * that only works with API 21 and later.
     */
    @Override
    public void supportStartPostponedEnterTransition() {
        super.supportStartPostponedEnterTransition();
    }

    @Override
    public void takeKeyEvents(boolean get) {
        super.takeKeyEvents(get);
    }

    @Override
    public void triggerSearch(String query, Bundle appSearchData) {
        super.triggerSearch(query, appSearchData);
    }

    @Override
    public void unbindService(ServiceConnection conn) {
        super.unbindService(conn);
    }

    @Override
    public void unregisterComponentCallbacks(ComponentCallbacks callback) {
        super.unregisterComponentCallbacks(callback);
    }

    @Override
    public void unregisterForContextMenu(View view) {
        super.unregisterForContextMenu(view);
    }

    @Override
    public void unregisterReceiver(BroadcastReceiver receiver) {
        super.unregisterReceiver(receiver);
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
    }

    /**
     * Dispatch incoming result to the correct fragment.
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    protected void onApplyThemeResource(Resources.Theme theme, int resid, boolean first) {
        super.onApplyThemeResource(theme, resid, first);
    }

    @Override
    protected void onChildTitleChanged(Activity childActivity, CharSequence title) {
        super.onChildTitleChanged(childActivity, title);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     * @deprecated
     */
    @Override
    protected Dialog onCreateDialog(int id) {
        return super.onCreateDialog(id);
    }

    /**
     * @deprecated
     */
    @Nullable
    @Override
    protected Dialog onCreateDialog(int id, Bundle args) {
        return super.onCreateDialog(id, args);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
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
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    /**
     * Dispatch onPause() to fragments.
     */
    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
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
    protected void onPrepareDialog(int id, Dialog dialog) {
        super.onPrepareDialog(id, dialog);
    }

    /**
     * @deprecated
     */
    @Override
    protected void onPrepareDialog(int id, Dialog dialog, Bundle args) {
        super.onPrepareDialog(id, dialog, args);
    }

    /**
     * @hide
     */
    @Override
    protected boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPrepareOptionsPanel(view, menu);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
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
    protected void onResume() {
        super.onResume();
    }

    /**
     * This is the fragment-orientated version of {@link #onResume()} that you
     * can override to perform operations in the Activity at the same point
     * where its fragments are resumed.  Be sure to always call through to
     * the super-class.
     */
    @Override
    protected void onResumeFragments() {
        super.onResumeFragments();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
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
    protected void onTitleChanged(CharSequence title, int color) {
        super.onTitleChanged(title, color);
    }

    @Override
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
    }
}
