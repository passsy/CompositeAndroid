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
import android.app.ActivityOptions;
import android.app.Dialog;
import android.app.PendingIntent;
import android.app.SearchManager;
import android.app.TaskStackBuilder;
import android.app.VoiceInteractor;
import android.app.assist.AssistContent;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.CursorLoader;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
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
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.provider.Settings;
import android.service.voice.VoiceInteractionService;
import android.service.voice.VoiceInteractionSession;
import android.service.vr.VrListenerService;
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
import android.support.v4.app.SupportActivity;
import android.support.v4.view.WindowCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.view.ActionMode;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.ContextMenu;
import android.view.Display;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import android.view.InputDevice;
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

@SuppressWarnings("unused")
public class ActivityPlugin extends AbstractPlugin<CompositeActivity, ActivityDelegate> {


    public void addContentView(final View view, final ViewGroup.LayoutParams params) {
        verifyMethodCalledFromDelegate("addContentView(View, ViewGroup.LayoutParams)");
        ((CallVoid2<View, ViewGroup.LayoutParams>) mSuperListeners.pop()).call(view, params);
    }

    /**
     * Call to set an "override configuration" on this context -- this is
     * a configuration that replies one or more values of the standard
     * configuration that is applied to the context.  See
     * {@link Context#createConfigurationContext(Configuration)} for more
     * information.
     *
     * <p>This method can only be called once, and must be called before any
     * calls to {@link #getResources()} or {@link #getAssets()} are made.
     */
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

    /**
     * Programmatically closes the most recently opened context menu, if showing.
     */
    public void closeContextMenu() {
        verifyMethodCalledFromDelegate("closeContextMenu()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    /**
     * Progammatically closes the options menu. If the options menu is already
     * closed, this method does nothing.
     */
    public void closeOptionsMenu() {
        verifyMethodCalledFromDelegate("closeOptionsMenu()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public Context createConfigurationContext(final Configuration overrideConfiguration) {
        verifyMethodCalledFromDelegate("createConfigurationContext(Configuration)");
        return ((CallFun1<Context, Configuration>) mSuperListeners.pop())
                .call(overrideConfiguration);
    }

    public Context createDeviceProtectedStorageContext() {
        verifyMethodCalledFromDelegate("createDeviceProtectedStorageContext()");
        return ((CallFun0<Context>) mSuperListeners.pop()).call();
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

    /**
     * Create a new PendingIntent object which you can hand to others
     * for them to use to send result data back to your
     * {@link #onActivityResult} callback.  The created object will be either
     * one-shot (becoming invalid after a result is sent back) or multiple
     * (allowing any number of results to be sent through it).
     *
     * @param requestCode Private request code for the sender that will be
     *                    associated with the result data when it is returned.  The sender can not
     *                    modify this value, allowing you to identify incoming results.
     * @param data        Default data to supply in the result, which may be modified
     *                    by the sender.
     * @param flags       May be {@link PendingIntent#FLAG_ONE_SHOT PendingIntent.FLAG_ONE_SHOT},
     *                    {@link PendingIntent#FLAG_NO_CREATE PendingIntent.FLAG_NO_CREATE},
     *                    {@link PendingIntent#FLAG_CANCEL_CURRENT PendingIntent.FLAG_CANCEL_CURRENT},
     *                    {@link PendingIntent#FLAG_UPDATE_CURRENT PendingIntent.FLAG_UPDATE_CURRENT},
     *                    or any of the flags as supported by
     *                    {@link Intent#fillIn Intent.fillIn()} to control which unspecified parts
     *                    of the intent that can be supplied when the actual send happens.
     * @return Returns an existing or new PendingIntent matching the given
     * parameters.  May return null only if
     * {@link PendingIntent#FLAG_NO_CREATE PendingIntent.FLAG_NO_CREATE} has been
     * supplied.
     * @see PendingIntent
     */
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

    public boolean deleteSharedPreferences(final String name) {
        verifyMethodCalledFromDelegate("deleteSharedPreferences(String)");
        return ((CallFun1<Boolean, String>) mSuperListeners.pop()).call(name);
    }

    /**
     * Called to process generic motion events.  You can override this to
     * intercept all generic motion events before they are dispatched to the
     * window.  Be sure to call this implementation for generic motion events
     * that should be handled normally.
     *
     * @param ev The generic motion event.
     * @return boolean Return true if this event was consumed.
     */
    public boolean dispatchGenericMotionEvent(final MotionEvent ev) {
        verifyMethodCalledFromDelegate("dispatchGenericMotionEvent(MotionEvent)");
        return ((CallFun1<Boolean, MotionEvent>) mSuperListeners.pop()).call(ev);
    }

    public boolean dispatchKeyEvent(final KeyEvent event) {
        verifyMethodCalledFromDelegate("dispatchKeyEvent(KeyEvent)");
        return ((CallFun1<Boolean, KeyEvent>) mSuperListeners.pop()).call(event);
    }

    /**
     * Called to process a key shortcut event.
     * You can override this to intercept all key shortcut events before they are
     * dispatched to the window.  Be sure to call this implementation for key shortcut
     * events that should be handled normally.
     *
     * @param event The key shortcut event.
     * @return True if this event was consumed.
     */
    public boolean dispatchKeyShortcutEvent(final KeyEvent event) {
        verifyMethodCalledFromDelegate("dispatchKeyShortcutEvent(KeyEvent)");
        return ((CallFun1<Boolean, KeyEvent>) mSuperListeners.pop()).call(event);
    }

    public boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent event) {
        verifyMethodCalledFromDelegate("dispatchPopulateAccessibilityEvent(AccessibilityEvent)");
        return ((CallFun1<Boolean, AccessibilityEvent>) mSuperListeners.pop()).call(event);
    }

    /**
     * Called to process touch screen events.  You can override this to
     * intercept all touch screen events before they are dispatched to the
     * window.  Be sure to call this implementation for touch screen events
     * that should be handled normally.
     *
     * @param ev The touch screen event.
     * @return boolean Return true if this event was consumed.
     */
    public boolean dispatchTouchEvent(final MotionEvent ev) {
        verifyMethodCalledFromDelegate("dispatchTouchEvent(MotionEvent)");
        return ((CallFun1<Boolean, MotionEvent>) mSuperListeners.pop()).call(ev);
    }

    /**
     * Called to process trackball events.  You can override this to
     * intercept all trackball events before they are dispatched to the
     * window.  Be sure to call this implementation for trackball events
     * that should be handled normally.
     *
     * @param ev The trackball event.
     * @return boolean Return true if this event was consumed.
     */
    public boolean dispatchTrackballEvent(final MotionEvent ev) {
        verifyMethodCalledFromDelegate("dispatchTrackballEvent(MotionEvent)");
        return ((CallFun1<Boolean, MotionEvent>) mSuperListeners.pop()).call(ev);
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

    /**
     * Puts the activity in picture-in-picture mode.
     *
     * @see android.R.attr#supportsPictureInPicture
     */
    public void enterPictureInPictureMode() {
        verifyMethodCalledFromDelegate("enterPictureInPictureMode()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public String[] fileList() {
        verifyMethodCalledFromDelegate("fileList()");
        return ((CallFun0<String[]>) mSuperListeners.pop()).call();
    }

    public View findViewById(@IdRes final int id) {
        verifyMethodCalledFromDelegate("findViewById(Integer)");
        return ((CallFun1<View, Integer>) mSuperListeners.pop()).call(id);
    }

    /**
     * Call this when your activity is done and should be closed.  The
     * ActivityResult is propagated back to whoever launched you via
     * onActivityResult().
     */
    public void finish() {
        verifyMethodCalledFromDelegate("finish()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    /**
     * Force finish another activity that you had previously started with
     * {@link #startActivityForResult}.
     *
     * @param requestCode The request code of the activity that you had
     *                    given to startActivityForResult().  If there are multiple
     *                    activities started with this request code, they
     *                    will all be finished.
     */
    public void finishActivity(final int requestCode) {
        verifyMethodCalledFromDelegate("finishActivity(Integer)");
        ((CallVoid1<Integer>) mSuperListeners.pop()).call(requestCode);
    }

    /**
     * This is called when a child activity of this one calls its
     * finishActivity().
     *
     * @param child       The activity making the call.
     * @param requestCode Request code that had been used to start the
     */
    public void finishActivityFromChild(final Activity child, final int requestCode) {
        verifyMethodCalledFromDelegate("finishActivityFromChild(Activity, Integer)");
        ((CallVoid2<Activity, Integer>) mSuperListeners.pop()).call(child, requestCode);
    }

    /**
     * Finish this activity as well as all activities immediately below it
     * in the current task that have the same affinity.  This is typically
     * used when an application can be launched on to another task (such as
     * from an ACTION_VIEW of a content type it understands) and the user
     * has used the up navigation to switch out of the current task and in
     * to its own task.  In this case, if the user has navigated down into
     * any other activities of the second application, all of those should
     * be removed from the original task as part of the task switch.
     *
     * <p>Note that this finish does <em>not</em> allow you to deliver results
     * to the previous activity, and an exception will be thrown if you are trying
     * to do so.</p>
     */
    public void finishAffinity() {
        verifyMethodCalledFromDelegate("finishAffinity()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    /**
     * Reverses the Activity Scene entry Transition and triggers the calling Activity
     * to reverse its exit Transition. When the exit Transition completes,
     * {@link #finish()} is called. If no entry Transition was used, finish() is called
     * immediately and the Activity exit Transition is run.
     *
     * @see ActivityOptions#makeSceneTransitionAnimation(Activity, Pair[])
     */
    public void finishAfterTransition() {
        verifyMethodCalledFromDelegate("finishAfterTransition()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    /**
     * Call this when your activity is done and should be closed and the task should be completely
     * removed as a part of finishing the root activity of the task.
     */
    public void finishAndRemoveTask() {
        verifyMethodCalledFromDelegate("finishAndRemoveTask()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    /**
     * This is called when a child activity of this one calls its
     * {@link #finish} method.  The default implementation simply calls
     * finish() on this activity (the parent), finishing the entire group.
     *
     * @param child The activity making the call.
     * @see #finish
     */
    public void finishFromChild(final Activity child) {
        verifyMethodCalledFromDelegate("finishFromChild(Activity)");
        ((CallVoid1<Activity>) mSuperListeners.pop()).call(child);
    }

    /**
     * Retrieve a reference to this activity's ActionBar.
     *
     * @return The Activity's ActionBar, or null if it does not have one.
     */
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

    /**
     * @return the base context as set by the constructor or setBaseContext
     */
    public Context getBaseContext() {
        verifyMethodCalledFromDelegate("getBaseContext()");
        return ((CallFun0<Context>) mSuperListeners.pop()).call();
    }

    public File getCacheDir() {
        verifyMethodCalledFromDelegate("getCacheDir()");
        return ((CallFun0<File>) mSuperListeners.pop()).call();
    }

    /**
     * Return the name of the activity that invoked this activity.  This is
     * who the data in {@link #setResult setResult()} will be sent to.  You
     * can use this information to validate that the recipient is allowed to
     * receive the data.
     *
     * <p class="note">Note: if the calling activity is not expecting a result (that is it
     * did not use the {@link #startActivityForResult}
     * form that includes a request code), then the calling package will be
     * null.
     *
     * @return The ComponentName of the activity that will receive your
     * reply, or null if none.
     */
    public ComponentName getCallingActivity() {
        verifyMethodCalledFromDelegate("getCallingActivity()");
        return ((CallFun0<ComponentName>) mSuperListeners.pop()).call();
    }

    /**
     * Return the name of the package that invoked this activity.  This is who
     * the data in {@link #setResult setResult()} will be sent to.  You can
     * use this information to validate that the recipient is allowed to
     * receive the data.
     *
     * <p class="note">Note: if the calling activity is not expecting a result (that is it
     * did not use the {@link #startActivityForResult}
     * form that includes a request code), then the calling package will be
     * null.</p>
     *
     * <p class="note">Note: prior to {@link Build.VERSION_CODES#JELLY_BEAN_MR2},
     * the result from this method was unstable.  If the process hosting the calling
     * package was no longer running, it would return null instead of the proper package
     * name.  You can use {@link #getCallingActivity()} and retrieve the package name
     * from that instead.</p>
     *
     * @return The package of the activity that will receive your
     * reply, or null if none.
     */
    public String getCallingPackage() {
        verifyMethodCalledFromDelegate("getCallingPackage()");
        return ((CallFun0<String>) mSuperListeners.pop()).call();
    }

    /**
     * If this activity is being destroyed because it can not handle a
     * configuration parameter being changed (and thus its
     * {@link #onConfigurationChanged(Configuration)} method is
     * <em>not</em> being called), then you can use this method to discover
     * the set of changes that have occurred while in the process of being
     * destroyed.  Note that there is no guarantee that these will be
     * accurate (other changes could have happened at any time), so you should
     * only use this as an optimization hint.
     *
     * @return Returns a bit field of the configuration parameters that are
     * changing, as defined by the {@link Configuration}
     * class.
     */
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

    /**
     * Returns complete component name of this activity.
     *
     * @return Returns the complete component name for this activity
     */
    public ComponentName getComponentName() {
        verifyMethodCalledFromDelegate("getComponentName()");
        return ((CallFun0<ComponentName>) mSuperListeners.pop()).call();
    }

    public ContentResolver getContentResolver() {
        verifyMethodCalledFromDelegate("getContentResolver()");
        return ((CallFun0<ContentResolver>) mSuperListeners.pop()).call();
    }

    /**
     * Retrieve the {@link Scene} representing this window's current content.
     * Requires {@link Window#FEATURE_CONTENT_TRANSITIONS}.
     *
     * <p>This method will return null if the current content is not represented by a Scene.</p>
     *
     * @return Current Scene being shown or null
     */
    public Scene getContentScene() {
        verifyMethodCalledFromDelegate("getContentScene()");
        return ((CallFun0<Scene>) mSuperListeners.pop()).call();
    }

    /**
     * Retrieve the {@link TransitionManager} responsible for default transitions in this window.
     * Requires {@link Window#FEATURE_CONTENT_TRANSITIONS}.
     *
     * <p>This method will return non-null after content has been initialized (e.g. by using
     * {@link #setContentView}) if {@link Window#FEATURE_CONTENT_TRANSITIONS} has been granted.</p>
     *
     * @return This window's content TransitionManager or null if none is set.
     */
    public TransitionManager getContentTransitionManager() {
        verifyMethodCalledFromDelegate("getContentTransitionManager()");
        return ((CallFun0<TransitionManager>) mSuperListeners.pop()).call();
    }

    /**
     * Calls {@link Window#getCurrentFocus} on the
     * Window of this Activity to return the currently focused view.
     *
     * @return View The current View with focus or null.
     * @see #getWindow
     * @see Window#getCurrentFocus
     */
    public View getCurrentFocus() {
        verifyMethodCalledFromDelegate("getCurrentFocus()");
        return ((CallFun0<View>) mSuperListeners.pop()).call();
    }

    public File getDataDir() {
        verifyMethodCalledFromDelegate("getDataDir()");
        return ((CallFun0<File>) mSuperListeners.pop()).call();
    }

    public File getDatabasePath(final String name) {
        verifyMethodCalledFromDelegate("getDatabasePath(String)");
        return ((CallFun1<File, String>) mSuperListeners.pop()).call(name);
    }

    /**
     * @return The {@link AppCompatDelegate} being used by this Activity.
     */
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

    /**
     * Retrieves a previously set {@link SupportActivity.ExtraData} by class name.
     *
     * @hide
     * @see #putExtraData
     */
    public <T extends SupportActivity.ExtraData> T getExtraData(final Class<T> extraDataClass) {
        verifyMethodCalledFromDelegate("getExtraData(Class<T>)");
        return ((CallFun1<T, Class<T>>) mSuperListeners.pop()).call(extraDataClass);
    }

    public File getFileStreamPath(final String name) {
        verifyMethodCalledFromDelegate("getFileStreamPath(String)");
        return ((CallFun1<File, String>) mSuperListeners.pop()).call(name);
    }

    public File getFilesDir() {
        verifyMethodCalledFromDelegate("getFilesDir()");
        return ((CallFun0<File>) mSuperListeners.pop()).call();
    }

    /**
     * Return the FragmentManager for interacting with fragments associated
     * with this activity.
     */
    public android.app.FragmentManager getFragmentManager() {
        verifyMethodCalledFromDelegate("getFragmentManager()");
        return ((CallFun0<android.app.FragmentManager>) mSuperListeners.pop()).call();
    }

    /**
     * Return the intent that started this activity.
     */
    public Intent getIntent() {
        verifyMethodCalledFromDelegate("getIntent()");
        return ((CallFun0<Intent>) mSuperListeners.pop()).call();
    }

    public Object getLastNonConfigurationInstance(final String key) {
        return getCompositeDelegate().getLastNonConfigurationInstance(key);
    }

    /**
     * Convenience for calling
     * {@link Window#getLayoutInflater}.
     */
    public LayoutInflater getLayoutInflater() {
        verifyMethodCalledFromDelegate("getLayoutInflater()");
        return ((CallFun0<LayoutInflater>) mSuperListeners.pop()).call();
    }

    /**
     * Return the LoaderManager for this activity, creating it if needed.
     */
    public android.app.LoaderManager getLoaderManager() {
        verifyMethodCalledFromDelegate("getLoaderManager()");
        return ((CallFun0<android.app.LoaderManager>) mSuperListeners.pop()).call();
    }

    /**
     * Returns class name for this activity with the package prefix removed.
     * This is the default name used to read and write settings.
     *
     * @return The local class name.
     */
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

    /**
     * Obtain an {@link Intent} that will launch an explicit target activity specified by
     * this activity's logical parent. The logical parent is named in the application's manifest
     * by the {@link android.R.attr#parentActivityName parentActivityName} attribute.
     * Activity subclasses may override this method to modify the Intent returned by
     * super.getParentActivityIntent() or to implement a different mechanism of retrieving
     * the parent intent entirely.
     *
     * @return a new Intent targeting the defined parent of this activity or null if
     * there is no valid parent.
     */
    public Intent getParentActivityIntent() {
        verifyMethodCalledFromDelegate("getParentActivityIntent()");
        return ((CallFun0<Intent>) mSuperListeners.pop()).call();
    }

    /**
     * Retrieve a {@link SharedPreferences} object for accessing preferences
     * that are private to this activity.  This simply calls the underlying
     * {@link #getSharedPreferences(String, int)} method by passing in this activity's
     * class name as the preferences name.
     *
     * @param mode Operating mode.  Use {@link #MODE_PRIVATE} for the default
     *             operation.
     * @return Returns the single SharedPreferences instance that can be used
     * to retrieve and modify the preference values.
     */
    public SharedPreferences getPreferences(final int mode) {
        verifyMethodCalledFromDelegate("getPreferences(Integer)");
        return ((CallFun1<SharedPreferences, Integer>) mSuperListeners.pop()).call(mode);
    }

    /**
     * Return information about who launched this activity.  If the launching Intent
     * contains an {@link Intent#EXTRA_REFERRER Intent.EXTRA_REFERRER},
     * that will be returned as-is; otherwise, if known, an
     * {@link Intent#URI_ANDROID_APP_SCHEME android-app:} referrer URI containing the
     * package name that started the Intent will be returned.  This may return null if no
     * referrer can be identified -- it is neither explicitly specified, nor is it known which
     * application package was involved.
     *
     * <p>If called while inside the handling of {@link #onNewIntent}, this function will
     * return the referrer that submitted that new intent to the activity.  Otherwise, it
     * always returns the referrer of the original Intent.</p>
     *
     * <p>Note that this is <em>not</em> a security feature -- you can not trust the
     * referrer information, applications can spoof it.</p>
     */
    public Uri getReferrer() {
        verifyMethodCalledFromDelegate("getReferrer()");
        return ((CallFun0<Uri>) mSuperListeners.pop()).call();
    }

    /**
     * Return the current requested orientation of the activity.  This will
     * either be the orientation requested in its component's manifest, or
     * the last requested orientation given to
     * {@link #setRequestedOrientation(int)}.
     *
     * @return Returns an orientation constant as used in
     * {@link ActivityInfo#screenOrientation ActivityInfo.screenOrientation}.
     */
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

    /**
     * Support library version of {@link Activity#getActionBar}.
     *
     * <p>Retrieve a reference to this activity's ActionBar.
     *
     * @return The Activity's ActionBar, or null if it does not have one.
     */
    public ActionBar getSupportActionBar() {
        verifyMethodCalledFromDelegate("getSupportActionBar()");
        return ((CallFun0<ActionBar>) mSuperListeners.pop()).call();
    }

    /**
     * Return the FragmentManager for interacting with fragments associated
     * with this activity.
     */
    public FragmentManager getSupportFragmentManager() {
        verifyMethodCalledFromDelegate("getSupportFragmentManager()");
        return ((CallFun0<FragmentManager>) mSuperListeners.pop()).call();
    }

    public LoaderManager getSupportLoaderManager() {
        verifyMethodCalledFromDelegate("getSupportLoaderManager()");
        return ((CallFun0<LoaderManager>) mSuperListeners.pop()).call();
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

    /**
     * Return the identifier of the task this activity is in.  This identifier
     * will remain the same for the lifetime of the activity.
     *
     * @return Task identifier, an opaque integer.
     */
    public int getTaskId() {
        verifyMethodCalledFromDelegate("getTaskId()");
        return ((CallFun0<Integer>) mSuperListeners.pop()).call();
    }

    public Resources.Theme getTheme() {
        verifyMethodCalledFromDelegate("getTheme()");
        return ((CallFun0<Resources.Theme>) mSuperListeners.pop()).call();
    }

    /**
     * Retrieve the active {@link VoiceInteractor} that the user is going through to
     * interact with this activity.
     */
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

    /**
     * Retrieve the current {@link Window} for the activity.
     * This can be used to directly access parts of the Window API that
     * are not available through Activity/Screen.
     *
     * @return Window The current window, or null if the activity is not
     * visual.
     */
    public Window getWindow() {
        verifyMethodCalledFromDelegate("getWindow()");
        return ((CallFun0<Window>) mSuperListeners.pop()).call();
    }

    /**
     * Retrieve the window manager for showing custom windows.
     */
    public WindowManager getWindowManager() {
        verifyMethodCalledFromDelegate("getWindowManager()");
        return ((CallFun0<WindowManager>) mSuperListeners.pop()).call();
    }

    public void grantUriPermission(final String toPackage, final Uri uri, final int modeFlags) {
        verifyMethodCalledFromDelegate("grantUriPermission(String, Uri, Integer)");
        ((CallVoid3<String, Uri, Integer>) mSuperListeners.pop()).call(toPackage, uri, modeFlags);
    }

    /**
     * Returns true if this activity's <em>main</em> window currently has window focus.
     * Note that this is not the same as the view itself having focus.
     *
     * @return True if this activity's main window currently has window focus.
     * @see #onWindowAttributesChanged(WindowManager.LayoutParams)
     */
    public boolean hasWindowFocus() {
        verifyMethodCalledFromDelegate("hasWindowFocus()");
        return ((CallFun0<Boolean>) mSuperListeners.pop()).call();
    }

    public void invalidateOptionsMenu() {
        verifyMethodCalledFromDelegate("invalidateOptionsMenu()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    /**
     * Check to see whether this activity is in the process of being destroyed in order to be
     * recreated with a new configuration. This is often used in
     * {@link #onStop} to determine whether the state needs to be cleaned up or will be passed
     * on to the next instance of the activity via {@link #onRetainNonConfigurationInstance()}.
     *
     * @return If the activity is being torn down in order to be recreated with a new configuration,
     * returns true; else returns false.
     */
    public boolean isChangingConfigurations() {
        verifyMethodCalledFromDelegate("isChangingConfigurations()");
        return ((CallFun0<Boolean>) mSuperListeners.pop()).call();
    }

    /**
     * Returns true if the final {@link #onDestroy()} call has been made
     * on the Activity, so this instance is now dead.
     */
    public boolean isDestroyed() {
        verifyMethodCalledFromDelegate("isDestroyed()");
        return ((CallFun0<Boolean>) mSuperListeners.pop()).call();
    }

    public boolean isDeviceProtectedStorage() {
        verifyMethodCalledFromDelegate("isDeviceProtectedStorage()");
        return ((CallFun0<Boolean>) mSuperListeners.pop()).call();
    }

    /**
     * Check to see whether this activity is in the process of finishing,
     * either because you called {@link #finish} on it or someone else
     * has requested that it finished.  This is often used in
     * {@link #onPause} to determine whether the activity is simply pausing or
     * completely finishing.
     *
     * @return If the activity is finishing, returns true; else returns false.
     * @see #finish
     */
    public boolean isFinishing() {
        verifyMethodCalledFromDelegate("isFinishing()");
        return ((CallFun0<Boolean>) mSuperListeners.pop()).call();
    }

    /**
     * Bit indicating that this activity is "immersive" and should not be
     * interrupted by notifications if possible.
     *
     * This value is initially set by the manifest property
     * <code>android:immersive</code> but may be changed at runtime by
     * {@link #setImmersive}.
     *
     * @see #setImmersive(boolean)
     * @see ActivityInfo#FLAG_IMMERSIVE
     */
    public boolean isImmersive() {
        verifyMethodCalledFromDelegate("isImmersive()");
        return ((CallFun0<Boolean>) mSuperListeners.pop()).call();
    }

    /**
     * Returns true if the activity is currently in multi-window mode.
     *
     * @return True if the activity is in multi-window mode.
     * @see android.R.attr#resizeableActivity
     */
    public boolean isInMultiWindowMode() {
        verifyMethodCalledFromDelegate("isInMultiWindowMode()");
        return ((CallFun0<Boolean>) mSuperListeners.pop()).call();
    }

    /**
     * Returns true if the activity is currently in picture-in-picture mode.
     *
     * @return True if the activity is in picture-in-picture mode.
     * @see android.R.attr#supportsPictureInPicture
     */
    public boolean isInPictureInPictureMode() {
        verifyMethodCalledFromDelegate("isInPictureInPictureMode()");
        return ((CallFun0<Boolean>) mSuperListeners.pop()).call();
    }

    /**
     * Queries whether the currently enabled voice interaction service supports returning
     * a voice interactor for use by the activity. This is valid only for the duration of the
     * activity.
     *
     * @return whether the current voice interaction service supports local voice interaction
     */
    public boolean isLocalVoiceInteractionSupported() {
        verifyMethodCalledFromDelegate("isLocalVoiceInteractionSupported()");
        return ((CallFun0<Boolean>) mSuperListeners.pop()).call();
    }

    public boolean isRestricted() {
        verifyMethodCalledFromDelegate("isRestricted()");
        return ((CallFun0<Boolean>) mSuperListeners.pop()).call();
    }

    /**
     * Return whether this activity is the root of a task.  The root is the
     * first activity in a task.
     *
     * @return True if this is the root activity, else false.
     */
    public boolean isTaskRoot() {
        verifyMethodCalledFromDelegate("isTaskRoot()");
        return ((CallFun0<Boolean>) mSuperListeners.pop()).call();
    }

    /**
     * Check whether this activity is running as part of a voice interaction with the user.
     * If true, it should perform its interaction with the user through the
     * {@link VoiceInteractor} returned by {@link #getVoiceInteractor}.
     */
    public boolean isVoiceInteraction() {
        verifyMethodCalledFromDelegate("isVoiceInteraction()");
        return ((CallFun0<Boolean>) mSuperListeners.pop()).call();
    }

    /**
     * Like {@link #isVoiceInteraction}, but only returns true if this is also the root
     * of a voice interaction.  That is, returns true if this activity was directly
     * started by the voice interaction service as the initiation of a voice interaction.
     * Otherwise, for example if it was started by another activity while under voice
     * interaction, returns false.
     */
    public boolean isVoiceInteractionRoot() {
        verifyMethodCalledFromDelegate("isVoiceInteractionRoot()");
        return ((CallFun0<Boolean>) mSuperListeners.pop()).call();
    }

    public boolean moveDatabaseFrom(final Context sourceContext, final String name) {
        verifyMethodCalledFromDelegate("moveDatabaseFrom(Context, String)");
        return ((CallFun2<Boolean, Context, String>) mSuperListeners.pop())
                .call(sourceContext, name);
    }

    public boolean moveSharedPreferencesFrom(final Context sourceContext, final String name) {
        verifyMethodCalledFromDelegate("moveSharedPreferencesFrom(Context, String)");
        return ((CallFun2<Boolean, Context, String>) mSuperListeners.pop())
                .call(sourceContext, name);
    }

    /**
     * Move the task containing this activity to the back of the activity
     * stack.  The activity's order within the task is unchanged.
     *
     * @param nonRoot If false then this only works if the activity is the root
     *                of a task; if true it will work for any activity in
     *                a task.
     * @return If the task was moved (or it was already at the
     * back) true is returned, else false.
     */
    public boolean moveTaskToBack(final boolean nonRoot) {
        verifyMethodCalledFromDelegate("moveTaskToBack(Boolean)");
        return ((CallFun1<Boolean, Boolean>) mSuperListeners.pop()).call(nonRoot);
    }

    /**
     * Navigate from this activity to the activity specified by upIntent, finishing this activity
     * in the process. If the activity indicated by upIntent already exists in the task's history,
     * this activity and all others before the indicated activity in the history stack will be
     * finished.
     *
     * <p>If the indicated activity does not appear in the history stack, this will finish
     * each activity in this task until the root activity of the task is reached, resulting in
     * an "in-app home" behavior. This can be useful in apps with a complex navigation hierarchy
     * when an activity may be reached by a path not passing through a canonical parent
     * activity.</p>
     *
     * <p>This method should be used when performing up navigation from within the same task
     * as the destination. If up navigation should cross tasks in some cases, see
     * {@link #shouldUpRecreateTask(Intent)}.</p>
     *
     * @param upIntent An intent representing the target destination for up navigation
     * @return true if up navigation successfully reached the activity indicated by upIntent and
     * upIntent was delivered to it. false if an instance of the indicated activity could
     * not be found and this activity was simply finished normally.
     */
    public boolean navigateUpTo(final Intent upIntent) {
        verifyMethodCalledFromDelegate("navigateUpTo(Intent)");
        return ((CallFun1<Boolean, Intent>) mSuperListeners.pop()).call(upIntent);
    }

    /**
     * This is called when a child activity of this one calls its
     * {@link #navigateUpTo} method.  The default implementation simply calls
     * navigateUpTo(upIntent) on this activity (the parent).
     *
     * @param child    The activity making the call.
     * @param upIntent An intent representing the target destination for up navigation
     * @return true if up navigation successfully reached the activity indicated by upIntent and
     * upIntent was delivered to it. false if an instance of the indicated activity could
     * not be found and this activity was simply finished normally.
     */
    public boolean navigateUpToFromChild(final Activity child, final Intent upIntent) {
        verifyMethodCalledFromDelegate("navigateUpToFromChild(Activity, Intent)");
        return ((CallFun2<Boolean, Activity, Intent>) mSuperListeners.pop()).call(child, upIntent);
    }

    /**
     * Notifies the activity that an action mode has finished.
     * Activity subclasses overriding this method should call the superclass implementation.
     *
     * @param mode The action mode that just finished.
     */
    public void onActionModeFinished(final android.view.ActionMode mode) {
        verifyMethodCalledFromDelegate("onActionModeFinished(android.view.ActionMode)");
        ((CallVoid1<android.view.ActionMode>) mSuperListeners.pop()).call(mode);
    }

    /**
     * Notifies the Activity that an action mode has been started.
     * Activity subclasses overriding this method should call the superclass implementation.
     *
     * @param mode The new action mode.
     */
    public void onActionModeStarted(final android.view.ActionMode mode) {
        verifyMethodCalledFromDelegate("onActionModeStarted(android.view.ActionMode)");
        ((CallVoid1<android.view.ActionMode>) mSuperListeners.pop()).call(mode);
    }

    /**
     * Called when an activity you launched with an activity transition exposes this
     * Activity through a returning activity transition, giving you the resultCode
     * and any additional data from it. This method will only be called if the activity
     * set a result code other than {@link #RESULT_CANCELED} and it supports activity
     * transitions with {@link Window#FEATURE_ACTIVITY_TRANSITIONS}.
     *
     * <p>The purpose of this function is to let the called Activity send a hint about
     * its state so that this underlying Activity can prepare to be exposed. A call to
     * this method does not guarantee that the called Activity has or will be exiting soon.
     * It only indicates that it will expose this Activity's Window and it has
     * some data to pass to prepare it.</p>
     *
     * @param resultCode The integer result code returned by the child activity
     *                   through its setResult().
     * @param data       An Intent, which can return result data to the caller
     */
    public void onActivityReenter(final int resultCode, final Intent data) {
        verifyMethodCalledFromDelegate("onActivityReenter(Integer, Intent)");
        ((CallVoid2<Integer, Intent>) mSuperListeners.pop()).call(resultCode, data);
    }

    /**
     * Dispatch incoming result to the correct fragment.
     */
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

    /**
     * Called when a fragment is attached to the activity.
     *
     * <p>This is called after the attached fragment's <code>onAttach</code> and before
     * the attached fragment's <code>onCreate</code> if the fragment has not yet had a previous
     * call to <code>onCreate</code>.</p>
     */
    public void onAttachFragment(final Fragment fragment) {
        verifyMethodCalledFromDelegate("onAttachFragment(Fragment)");
        ((CallVoid1<Fragment>) mSuperListeners.pop()).call(fragment);
    }

    /**
     * Called when a Fragment is being attached to this activity, immediately
     * after the call to its {@link android.app.Fragment#onAttach Fragment.onAttach()}
     * method and before {@link android.app.Fragment#onCreate Fragment.onCreate()}.
     */
    public void onAttachFragment(final android.app.Fragment fragment) {
        verifyMethodCalledFromDelegate("onAttachFragment(android.app.Fragment)");
        ((CallVoid1<android.app.Fragment>) mSuperListeners.pop()).call(fragment);
    }

    /**
     * Called when the main window associated with the activity has been
     * attached to the window manager.
     * See {@link View#onAttachedToWindow() View.onAttachedToWindow()}
     * for more information.
     *
     * @see View#onAttachedToWindow
     */
    public void onAttachedToWindow() {
        verifyMethodCalledFromDelegate("onAttachedToWindow()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    /**
     * Take care of popping the fragment back stack or finishing the activity
     * as appropriate.
     */
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

    /**
     * This hook is called whenever an item in a context menu is selected. The
     * default implementation simply returns false to have the normal processing
     * happen (calling the item's Runnable or sending a message to its Handler
     * as appropriate). You can use this method for any items for which you
     * would like to do processing without those other facilities.
     * <p>
     * Use {@link MenuItem#getMenuInfo()} to get extra information set by the
     * View that added this menu item.
     * <p>
     * Derived classes should call through to the base class for it to perform
     * the default menu handling.
     *
     * @param item The context menu item that was selected.
     * @return boolean Return false to allow normal context menu processing to
     * proceed, true to consume it here.
     */
    public boolean onContextItemSelected(final MenuItem item) {
        verifyMethodCalledFromDelegate("onContextItemSelected(MenuItem)");
        return ((CallFun1<Boolean, MenuItem>) mSuperListeners.pop()).call(item);
    }

    /**
     * This hook is called whenever the context menu is being closed (either by
     * the user canceling the menu with the back/menu button, or when an item is
     * selected).
     *
     * @param menu The context menu that is being closed.
     */
    public void onContextMenuClosed(final Menu menu) {
        verifyMethodCalledFromDelegate("onContextMenuClosed(Menu)");
        ((CallVoid1<Menu>) mSuperListeners.pop()).call(menu);
    }

    /**
     * Same as {@link #onCreate(Bundle)} but called for those activities created with
     * the attribute {@link android.R.attr#persistableMode} set to
     * <code>persistAcrossReboots</code>.
     *
     * @param savedInstanceState if the activity is being re-initialized after
     *                           previously being shut down then this Bundle contains the data it
     *                           most
     *                           recently supplied in {@link #onSaveInstanceState}.
     *                           <b><i>Note: Otherwise it is null.</i></b>
     * @param persistentState    if the activity is being re-initialized after
     *                           previously being shut down or powered off then this Bundle
     *                           contains
     *                           the data it most
     *                           recently supplied to outPersistentState in {@link
     *                           #onSaveInstanceState}.
     *                           <b><i>Note: Otherwise it is null.</i></b>
     * @see #onCreate(Bundle)
     * @see #onStart
     * @see #onSaveInstanceState
     * @see #onRestoreInstanceState
     * @see #onPostCreate
     */
    public void onCreate(final Bundle savedInstanceState, final PersistableBundle persistentState) {
        verifyMethodCalledFromDelegate("onCreate(Bundle, PersistableBundle)");
        ((CallVoid2<Bundle, PersistableBundle>) mSuperListeners.pop())
                .call(savedInstanceState, persistentState);
    }

    public void onCreate(@Nullable final Bundle savedInstanceState) {
        verifyMethodCalledFromDelegate("onCreate(Bundle)");
        ((CallVoid1<Bundle>) mSuperListeners.pop()).call(savedInstanceState);
    }

    /**
     * Called when a context menu for the {@code view} is about to be shown.
     * Unlike {@link #onCreateOptionsMenu(Menu)}, this will be called every
     * time the context menu is about to be shown and should be populated for
     * the view (or item inside the view for {@link AdapterView} subclasses,
     * this can be found in the {@code menuInfo})).
     * <p>
     * Use {@link #onContextItemSelected(MenuItem)} to know when an
     * item has been selected.
     * <p>
     * It is not safe to hold onto the context menu after this method returns.
     */
    public void onCreateContextMenu(final ContextMenu menu, final View v,
            final ContextMenu.ContextMenuInfo menuInfo) {
        verifyMethodCalledFromDelegate(
                "onCreateContextMenu(ContextMenu, View, ContextMenu.ContextMenuInfo)");
        ((CallVoid3<ContextMenu, View, ContextMenu.ContextMenuInfo>) mSuperListeners.pop())
                .call(menu, v, menuInfo);
    }

    /**
     * Generate a new description for this activity.  This method is called
     * before pausing the activity and can, if desired, return some textual
     * description of its current state to be displayed to the user.
     *
     * <p>The default implementation returns null, which will cause you to
     * inherit the description from the previous activity.  If all activities
     * return null, generally the label of the top activity will be used as the
     * description.
     *
     * @return A description of what the user is doing.  It should be short and
     * sweet (only a few words).
     * @see #onCreateThumbnail
     * @see #onSaveInstanceState
     * @see #onPause
     */
    public CharSequence onCreateDescription() {
        verifyMethodCalledFromDelegate("onCreateDescription()");
        return ((CallFun0<CharSequence>) mSuperListeners.pop()).call();
    }

    /**
     * @deprecated Old no-arguments version of {@link #onCreateDialog(int, Bundle)}.
     */
    public Dialog onCreateDialog(final int id) {
        verifyMethodCalledFromDelegate("onCreateDialog(Integer)");
        return ((CallFun1<Dialog, Integer>) mSuperListeners.pop()).call(id);
    }

    /**
     * Callback for creating dialogs that are managed (saved and restored) for you
     * by the activity.  The default implementation calls through to
     * {@link #onCreateDialog(int)} for compatibility.
     *
     * <em>If you are targeting {@link Build.VERSION_CODES#HONEYCOMB}
     * or later, consider instead using a {@link DialogFragment} instead.</em>
     *
     * <p>If you use {@link #showDialog(int)}, the activity will call through to
     * this method the first time, and hang onto it thereafter.  Any dialog
     * that is created by this method will automatically be saved and restored
     * for you, including whether it is showing.
     *
     * <p>If you would like the activity to manage saving and restoring dialogs
     * for you, you should override this method and handle any ids that are
     * passed to {@link #showDialog}.
     *
     * <p>If you would like an opportunity to prepare your dialog before it is shown,
     * override {@link #onPrepareDialog(int, Dialog, Bundle)}.
     *
     * @param id   The id of the dialog.
     * @param args The dialog arguments provided to {@link #showDialog(int, Bundle)}.
     * @return The dialog.  If you return null, the dialog will not be created.
     * @see #onPrepareDialog(int, Dialog, Bundle)
     * @see #showDialog(int, Bundle)
     * @see #dismissDialog(int)
     * @see #removeDialog(int)
     * @deprecated Use the new {@link DialogFragment} class with
     * {@link FragmentManager} instead; this is also
     * available on older platforms through the Android compatibility package.
     */
    public Dialog onCreateDialog(final int id, final Bundle args) {
        verifyMethodCalledFromDelegate("onCreateDialog(Integer, Bundle)");
        return ((CallFun2<Dialog, Integer, Bundle>) mSuperListeners.pop()).call(id, args);
    }

    /**
     * Define the synthetic task stack that will be generated during Up navigation from
     * a different task.
     *
     * <p>The default implementation of this method adds the parent chain of this activity
     * as specified in the manifest to the supplied {@link TaskStackBuilder}. Applications
     * may choose to override this method to construct the desired task stack in a different
     * way.</p>
     *
     * <p>This method will be invoked by the default implementation of {@link #onNavigateUp()}
     * if {@link #shouldUpRecreateTask(Intent)} returns true when supplied with the intent
     * returned by {@link #getParentActivityIntent()}.</p>
     *
     * <p>Applications that wish to supply extra Intent parameters to the parent stack defined
     * by the manifest should override {@link #onPrepareNavigateUpTaskStack(TaskStackBuilder)}.</p>
     *
     * @param builder An empty TaskStackBuilder - the application should add intents representing
     *                the desired task stack
     */
    public void onCreateNavigateUpTaskStack(final TaskStackBuilder builder) {
        verifyMethodCalledFromDelegate("onCreateNavigateUpTaskStack(TaskStackBuilder)");
        ((CallVoid1<TaskStackBuilder>) mSuperListeners.pop()).call(builder);
    }

    /**
     * Initialize the contents of the Activity's standard options menu.  You
     * should place your menu items in to <var>menu</var>.
     *
     * <p>This is only called once, the first time the options menu is
     * displayed.  To update the menu every time it is displayed, see
     * {@link #onPrepareOptionsMenu}.
     *
     * <p>The default implementation populates the menu with standard system
     * menu items.  These are placed in the {@link Menu#CATEGORY_SYSTEM} group so that
     * they will be correctly ordered with application-defined menu items.
     * Deriving classes should always call through to the base implementation.
     *
     * <p>You can safely hold on to <var>menu</var> (and any items created
     * from it), making modifications to it as desired, until the next
     * time onCreateOptionsMenu() is called.
     *
     * <p>When you add items to the menu, you can implement the Activity's
     * {@link #onOptionsItemSelected} method to handle them there.
     *
     * @param menu The options menu in which you place your items.
     * @return You must return true for the menu to be displayed;
     * if you return false it will not be shown.
     * @see #onPrepareOptionsMenu
     * @see #onOptionsItemSelected
     */
    public boolean onCreateOptionsMenu(final Menu menu) {
        verifyMethodCalledFromDelegate("onCreateOptionsMenu(Menu)");
        return ((CallFun1<Boolean, Menu>) mSuperListeners.pop()).call(menu);
    }

    /**
     * Dispatch to Fragment.onCreateOptionsMenu().
     */
    public boolean onCreatePanelMenu(final int featureId, final Menu menu) {
        verifyMethodCalledFromDelegate("onCreatePanelMenu(Integer, Menu)");
        return ((CallFun2<Boolean, Integer, Menu>) mSuperListeners.pop()).call(featureId, menu);
    }

    /**
     * Default implementation of
     * {@link Window.Callback#onCreatePanelView}
     * for activities. This
     * simply returns null so that all panel sub-windows will have the default
     * menu behavior.
     */
    public View onCreatePanelView(final int featureId) {
        verifyMethodCalledFromDelegate("onCreatePanelView(Integer)");
        return ((CallFun1<View, Integer>) mSuperListeners.pop()).call(featureId);
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
    public void onCreateSupportNavigateUpTaskStack(
            @NonNull final android.support.v4.app.TaskStackBuilder builder) {
        verifyMethodCalledFromDelegate(
                "onCreateSupportNavigateUpTaskStack(android.support.v4.app.TaskStackBuilder)");
        ((CallVoid1<android.support.v4.app.TaskStackBuilder>) mSuperListeners.pop()).call(builder);
    }

    /**
     * Generate a new thumbnail for this activity.  This method is called before
     * pausing the activity, and should draw into <var>outBitmap</var> the
     * imagery for the desired thumbnail in the dimensions of that bitmap.  It
     * can use the given <var>canvas</var>, which is configured to draw into the
     * bitmap, for rendering if desired.
     *
     * <p>The default implementation returns fails and does not draw a thumbnail;
     * this will result in the platform creating its own thumbnail if needed.
     *
     * @param outBitmap The bitmap to contain the thumbnail.
     * @param canvas    Can be used to render into the bitmap.
     * @return Return true if you have drawn into the bitmap; otherwise after
     * you return it will be filled with a default thumbnail.
     * @see #onCreateDescription
     * @see #onSaveInstanceState
     * @see #onPause
     */
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

    /**
     * Called when the main window associated with the activity has been
     * detached from the window manager.
     * See {@link View#onDetachedFromWindow() View.onDetachedFromWindow()}
     * for more information.
     *
     * @see View#onDetachedFromWindow
     */
    public void onDetachedFromWindow() {
        verifyMethodCalledFromDelegate("onDetachedFromWindow()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    /**
     * Activities cannot draw during the period that their windows are animating in. In order
     * to know when it is safe to begin drawing they can override this method which will be
     * called when the entering animation has completed.
     */
    public void onEnterAnimationComplete() {
        verifyMethodCalledFromDelegate("onEnterAnimationComplete()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    /**
     * Called when a generic motion event was not handled by any of the
     * views inside of the activity.
     * <p>
     * Generic motion events describe joystick movements, mouse hovers, track pad
     * touches, scroll wheel movements and other input events.  The
     * {@link MotionEvent#getSource() source} of the motion event specifies
     * the class of input that was received.  Implementations of this method
     * must examine the bits in the source before processing the event.
     * The following code example shows how this is done.
     * </p><p>
     * Generic motion events with source class
     * {@link InputDevice#SOURCE_CLASS_POINTER}
     * are delivered to the view under the pointer.  All other generic motion events are
     * delivered to the focused view.
     * </p><p>
     * See {@link View#onGenericMotionEvent(MotionEvent)} for an example of how to
     * handle this event.
     * </p>
     *
     * @param event The generic motion event being processed.
     * @return Return true if you have consumed the event, false if you haven't.
     * The default implementation always returns false.
     */
    public boolean onGenericMotionEvent(final MotionEvent event) {
        verifyMethodCalledFromDelegate("onGenericMotionEvent(MotionEvent)");
        return ((CallFun1<Boolean, MotionEvent>) mSuperListeners.pop()).call(event);
    }

    /**
     * Called when a key was pressed down and not handled by any of the views
     * inside of the activity. So, for example, key presses while the cursor
     * is inside a TextView will not trigger the event (unless it is a navigation
     * to another object) because TextView handles its own key presses.
     *
     * <p>If the focused view didn't want this event, this method is called.
     *
     * <p>The default implementation takes care of {@link KeyEvent#KEYCODE_BACK}
     * by calling {@link #onBackPressed()}, though the behavior varies based
     * on the application compatibility mode: for
     * {@link Build.VERSION_CODES#ECLAIR} or later applications,
     * it will set up the dispatch to call {@link #onKeyUp} where the action
     * will be performed; for earlier applications, it will perform the
     * action immediately in on-down, as those versions of the platform
     * behaved.
     *
     * <p>Other additional default key handling may be performed
     * if configured with {@link #setDefaultKeyMode}.
     *
     * @return Return <code>true</code> to prevent this event from being propagated
     * further, or <code>false</code> to indicate that you have not handled
     * this event and it should continue to be propagated.
     * @see #onKeyUp
     * @see KeyEvent
     */
    public boolean onKeyDown(final int keyCode, final KeyEvent event) {
        verifyMethodCalledFromDelegate("onKeyDown(Integer, KeyEvent)");
        return ((CallFun2<Boolean, Integer, KeyEvent>) mSuperListeners.pop()).call(keyCode, event);
    }

    /**
     * Default implementation of {@link KeyEvent.Callback#onKeyLongPress(int, KeyEvent)
     * KeyEvent.Callback.onKeyLongPress()}: always returns false (doesn't handle
     * the event).
     */
    public boolean onKeyLongPress(final int keyCode, final KeyEvent event) {
        verifyMethodCalledFromDelegate("onKeyLongPress(Integer, KeyEvent)");
        return ((CallFun2<Boolean, Integer, KeyEvent>) mSuperListeners.pop()).call(keyCode, event);
    }

    /**
     * Default implementation of {@link KeyEvent.Callback#onKeyMultiple(int, int, KeyEvent)
     * KeyEvent.Callback.onKeyMultiple()}: always returns false (doesn't handle
     * the event).
     */
    public boolean onKeyMultiple(final int keyCode, final int repeatCount, final KeyEvent event) {
        verifyMethodCalledFromDelegate("onKeyMultiple(Integer, Integer, KeyEvent)");
        return ((CallFun3<Boolean, Integer, Integer, KeyEvent>) mSuperListeners.pop())
                .call(keyCode, repeatCount, event);
    }

    /**
     * Called when a key shortcut event is not handled by any of the views in the Activity.
     * Override this method to implement global key shortcuts for the Activity.
     * Key shortcuts can also be implemented by setting the
     * {@link MenuItem#setShortcut(char, char) shortcut} property of menu items.
     *
     * @param keyCode The value in event.getKeyCode().
     * @param event   Description of the key event.
     * @return True if the key shortcut was handled.
     */
    public boolean onKeyShortcut(final int keyCode, final KeyEvent event) {
        verifyMethodCalledFromDelegate("onKeyShortcut(Integer, KeyEvent)");
        return ((CallFun2<Boolean, Integer, KeyEvent>) mSuperListeners.pop()).call(keyCode, event);
    }

    /**
     * Called when a key was released and not handled by any of the views
     * inside of the activity. So, for example, key presses while the cursor
     * is inside a TextView will not trigger the event (unless it is a navigation
     * to another object) because TextView handles its own key presses.
     *
     * <p>The default implementation handles KEYCODE_BACK to stop the activity
     * and go back.
     *
     * @return Return <code>true</code> to prevent this event from being propagated
     * further, or <code>false</code> to indicate that you have not handled
     * this event and it should continue to be propagated.
     * @see #onKeyDown
     * @see KeyEvent
     */
    public boolean onKeyUp(final int keyCode, final KeyEvent event) {
        verifyMethodCalledFromDelegate("onKeyUp(Integer, KeyEvent)");
        return ((CallFun2<Boolean, Integer, KeyEvent>) mSuperListeners.pop()).call(keyCode, event);
    }

    /**
     * Callback to indicate that {@link #startLocalVoiceInteraction(Bundle)} has resulted in a
     * voice interaction session being started. You can now retrieve a voice interactor using
     * {@link #getVoiceInteractor()}.
     */
    public void onLocalVoiceInteractionStarted() {
        verifyMethodCalledFromDelegate("onLocalVoiceInteractionStarted()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    /**
     * Callback to indicate that the local voice interaction has stopped either
     * because it was requested through a call to {@link #stopLocalVoiceInteraction()}
     * or because it was canceled by the user. The previously acquired {@link VoiceInteractor}
     * is no longer valid after this.
     */
    public void onLocalVoiceInteractionStopped() {
        verifyMethodCalledFromDelegate("onLocalVoiceInteractionStopped()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    /**
     * Dispatch onLowMemory() to all fragments.
     */
    public void onLowMemory() {
        verifyMethodCalledFromDelegate("onLowMemory()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    /**
     * {@inheritDoc}
     *
     * <p>Please note: AppCompat uses it's own feature id for the action bar:
     * {@link AppCompatDelegate#FEATURE_SUPPORT_ACTION_BAR FEATURE_SUPPORT_ACTION_BAR}.</p>
     */
    public boolean onMenuOpened(final int featureId, final Menu menu) {
        verifyMethodCalledFromDelegate("onMenuOpened(Integer, Menu)");
        return ((CallFun2<Boolean, Integer, Menu>) mSuperListeners.pop()).call(featureId, menu);
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
    public void onMultiWindowModeChanged(final boolean isInMultiWindowMode) {
        verifyMethodCalledFromDelegate("onMultiWindowModeChanged(Boolean)");
        ((CallVoid1<Boolean>) mSuperListeners.pop()).call(isInMultiWindowMode);
    }

    /**
     * This method is called whenever the user chooses to navigate Up within your application's
     * activity hierarchy from the action bar.
     *
     * <p>If the attribute {@link android.R.attr#parentActivityName parentActivityName}
     * was specified in the manifest for this activity or an activity-alias to it,
     * default Up navigation will be handled automatically. If any activity
     * along the parent chain requires extra Intent arguments, the Activity subclass
     * should override the method {@link #onPrepareNavigateUpTaskStack(TaskStackBuilder)}
     * to supply those arguments.</p>
     *
     * <p>See <a href="{@docRoot}guide/components/tasks-and-back-stack.html">Tasks and Back
     * Stack</a>
     * from the developer guide and <a href="{@docRoot}design/patterns/navigation.html">Navigation</a>
     * from the design guide for more information about navigating within your app.</p>
     *
     * <p>See the {@link TaskStackBuilder} class and the Activity methods
     * {@link #getParentActivityIntent()}, {@link #shouldUpRecreateTask(Intent)}, and
     * {@link #navigateUpTo(Intent)} for help implementing custom Up navigation.
     * The AppNavigation sample application in the Android SDK is also available for reference.</p>
     *
     * @return true if Up navigation completed successfully and this Activity was finished,
     * false otherwise.
     */
    public boolean onNavigateUp() {
        verifyMethodCalledFromDelegate("onNavigateUp()");
        return ((CallFun0<Boolean>) mSuperListeners.pop()).call();
    }

    /**
     * This is called when a child activity of this one attempts to navigate up.
     * The default implementation simply calls onNavigateUp() on this activity (the parent).
     *
     * @param child The activity making the call.
     */
    public boolean onNavigateUpFromChild(final Activity child) {
        verifyMethodCalledFromDelegate("onNavigateUpFromChild(Activity)");
        return ((CallFun1<Boolean, Activity>) mSuperListeners.pop()).call(child);
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
    public void onNewIntent(final Intent intent) {
        verifyMethodCalledFromDelegate("onNewIntent(Intent)");
        ((CallVoid1<Intent>) mSuperListeners.pop()).call(intent);
    }

    /**
     * This hook is called whenever an item in your options menu is selected.
     * The default implementation simply returns false to have the normal
     * processing happen (calling the item's Runnable or sending a message to
     * its Handler as appropriate).  You can use this method for any items
     * for which you would like to do processing without those other
     * facilities.
     *
     * <p>Derived classes should call through to the base class for it to
     * perform the default menu handling.</p>
     *
     * @param item The menu item that was selected.
     * @return boolean Return false to allow normal menu processing to
     * proceed, true to consume it here.
     * @see #onCreateOptionsMenu
     */
    public boolean onOptionsItemSelected(final MenuItem item) {
        verifyMethodCalledFromDelegate("onOptionsItemSelected(MenuItem)");
        return ((CallFun1<Boolean, MenuItem>) mSuperListeners.pop()).call(item);
    }

    /**
     * This hook is called whenever the options menu is being closed (either by the user canceling
     * the menu with the back/menu button, or when an item is selected).
     *
     * @param menu The options menu as last shown or first initialized by
     *             onCreateOptionsMenu().
     */
    public void onOptionsMenuClosed(final Menu menu) {
        verifyMethodCalledFromDelegate("onOptionsMenuClosed(Menu)");
        ((CallVoid1<Menu>) mSuperListeners.pop()).call(menu);
    }

    /**
     * {@inheritDoc}
     *
     * <p>Please note: AppCompat uses it's own feature id for the action bar:
     * {@link AppCompatDelegate#FEATURE_SUPPORT_ACTION_BAR FEATURE_SUPPORT_ACTION_BAR}.</p>
     */
    public void onPanelClosed(final int featureId, final Menu menu) {
        verifyMethodCalledFromDelegate("onPanelClosed(Integer, Menu)");
        ((CallVoid2<Integer, Menu>) mSuperListeners.pop()).call(featureId, menu);
    }

    /**
     * Dispatch onPause() to fragments.
     */
    public void onPause() {
        verifyMethodCalledFromDelegate("onPause()");
        ((CallVoid0) mSuperListeners.pop()).call();
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
    public void onPictureInPictureModeChanged(final boolean isInPictureInPictureMode) {
        verifyMethodCalledFromDelegate("onPictureInPictureModeChanged(Boolean)");
        ((CallVoid1<Boolean>) mSuperListeners.pop()).call(isInPictureInPictureMode);
    }

    /**
     * This is the same as {@link #onPostCreate(Bundle)} but is called for activities
     * created with the attribute {@link android.R.attr#persistableMode} set to
     * <code>persistAcrossReboots</code>.
     *
     * @param savedInstanceState The data most recently supplied in {@link #onSaveInstanceState}
     * @param persistentState    The data caming from the PersistableBundle first
     *                           saved in {@link #onSaveInstanceState(Bundle, PersistableBundle)}.
     * @see #onCreate
     */
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

    /**
     * @deprecated Old no-arguments version of
     * {@link #onPrepareDialog(int, Dialog, Bundle)}.
     */
    public void onPrepareDialog(final int id, final Dialog dialog) {
        verifyMethodCalledFromDelegate("onPrepareDialog(Integer, Dialog)");
        ((CallVoid2<Integer, Dialog>) mSuperListeners.pop()).call(id, dialog);
    }

    /**
     * Provides an opportunity to prepare a managed dialog before it is being
     * shown.  The default implementation calls through to
     * {@link #onPrepareDialog(int, Dialog)} for compatibility.
     *
     * <p>
     * Override this if you need to update a managed dialog based on the state
     * of the application each time it is shown. For example, a time picker
     * dialog might want to be updated with the current time. You should call
     * through to the superclass's implementation. The default implementation
     * will set this Activity as the owner activity on the Dialog.
     *
     * @param id     The id of the managed dialog.
     * @param dialog The dialog.
     * @param args   The dialog arguments provided to {@link #showDialog(int, Bundle)}.
     * @see #onCreateDialog(int, Bundle)
     * @see #showDialog(int)
     * @see #dismissDialog(int)
     * @see #removeDialog(int)
     * @deprecated Use the new {@link DialogFragment} class with
     * {@link FragmentManager} instead; this is also
     * available on older platforms through the Android compatibility package.
     */
    public void onPrepareDialog(final int id, final Dialog dialog, final Bundle args) {
        verifyMethodCalledFromDelegate("onPrepareDialog(Integer, Dialog, Bundle)");
        ((CallVoid3<Integer, Dialog, Bundle>) mSuperListeners.pop()).call(id, dialog, args);
    }

    /**
     * Prepare the synthetic task stack that will be generated during Up navigation
     * from a different task.
     *
     * <p>This method receives the {@link TaskStackBuilder} with the constructed series of
     * Intents as generated by {@link #onCreateNavigateUpTaskStack(TaskStackBuilder)}.
     * If any extra data should be added to these intents before launching the new task,
     * the application should override this method and add that data here.</p>
     *
     * @param builder A TaskStackBuilder that has been populated with Intents by
     *                onCreateNavigateUpTaskStack.
     */
    public void onPrepareNavigateUpTaskStack(final TaskStackBuilder builder) {
        verifyMethodCalledFromDelegate("onPrepareNavigateUpTaskStack(TaskStackBuilder)");
        ((CallVoid1<TaskStackBuilder>) mSuperListeners.pop()).call(builder);
    }

    /**
     * Prepare the Screen's standard options menu to be displayed.  This is
     * called right before the menu is shown, every time it is shown.  You can
     * use this method to efficiently enable/disable items or otherwise
     * dynamically modify the contents.
     *
     * <p>The default implementation updates the system menu items based on the
     * activity's state.  Deriving classes should always call through to the
     * base class implementation.
     *
     * @param menu The options menu as last shown or first initialized by
     *             onCreateOptionsMenu().
     * @return You must return true for the menu to be displayed;
     * if you return false it will not be shown.
     * @see #onCreateOptionsMenu
     */
    public boolean onPrepareOptionsMenu(final Menu menu) {
        verifyMethodCalledFromDelegate("onPrepareOptionsMenu(Menu)");
        return ((CallFun1<Boolean, Menu>) mSuperListeners.pop()).call(menu);
    }

    /**
     * @hide
     */
    public boolean onPrepareOptionsPanel(final View view, final Menu menu) {
        verifyMethodCalledFromDelegate("onPrepareOptionsPanel(View, Menu)");
        return ((CallFun2<Boolean, View, Menu>) mSuperListeners.pop()).call(view, menu);
    }

    /**
     * Dispatch onPrepareOptionsMenu() to fragments.
     */
    public boolean onPreparePanel(final int featureId, final View view, final Menu menu) {
        verifyMethodCalledFromDelegate("onPreparePanel(Integer, View, Menu)");
        return ((CallFun3<Boolean, Integer, View, Menu>) mSuperListeners.pop())
                .call(featureId, view, menu);
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
    public void onPrepareSupportNavigateUpTaskStack(
            @NonNull final android.support.v4.app.TaskStackBuilder builder) {
        verifyMethodCalledFromDelegate(
                "onPrepareSupportNavigateUpTaskStack(android.support.v4.app.TaskStackBuilder)");
        ((CallVoid1<android.support.v4.app.TaskStackBuilder>) mSuperListeners.pop()).call(builder);
    }

    /**
     * This is called when the user is requesting an assist, to provide references
     * to content related to the current activity.  Before being called, the
     * {@code outContent} Intent is filled with the base Intent of the activity (the Intent
     * returned by {@link #getIntent()}).  The Intent's extras are stripped of any types
     * that are not valid for {@link PersistableBundle} or non-framework Parcelables, and
     * the flags {@link Intent#FLAG_GRANT_WRITE_URI_PERMISSION} and
     * {@link Intent#FLAG_GRANT_PERSISTABLE_URI_PERMISSION} are cleared from the Intent.
     *
     * <p>Custom implementation may adjust the content intent to better reflect the top-level
     * context of the activity, and fill in its ClipData with additional content of
     * interest that the user is currently viewing.  For example, an image gallery application
     * that has launched in to an activity allowing the user to swipe through pictures should
     * modify the intent to reference the current image they are looking it; such an
     * application when showing a list of pictures should add a ClipData that has
     * references to all of the pictures currently visible on screen.</p>
     *
     * @param outContent The assist content to return.
     */
    public void onProvideAssistContent(final AssistContent outContent) {
        verifyMethodCalledFromDelegate("onProvideAssistContent(AssistContent)");
        ((CallVoid1<AssistContent>) mSuperListeners.pop()).call(outContent);
    }

    /**
     * This is called when the user is requesting an assist, to build a full
     * {@link Intent#ACTION_ASSIST} Intent with all of the context of the current
     * application.  You can override this method to place into the bundle anything
     * you would like to appear in the {@link Intent#EXTRA_ASSIST_CONTEXT} part
     * of the assist Intent.
     *
     * <p>This function will be called after any global assist callbacks that had
     * been registered with {@link Application#registerOnProvideAssistDataListener
     * Application.registerOnProvideAssistDataListener}.
     */
    public void onProvideAssistData(final Bundle data) {
        verifyMethodCalledFromDelegate("onProvideAssistData(Bundle)");
        ((CallVoid1<Bundle>) mSuperListeners.pop()).call(data);
    }

    public void onProvideKeyboardShortcuts(final List<KeyboardShortcutGroup> data, final Menu menu,
            final int deviceId) {
        verifyMethodCalledFromDelegate(
                "onProvideKeyboardShortcuts(List<KeyboardShortcutGroup>, Menu, Integer)");
        ((CallVoid3<List<KeyboardShortcutGroup>, Menu, Integer>) mSuperListeners.pop())
                .call(data, menu, deviceId);
    }

    /**
     * Override to generate the desired referrer for the content currently being shown
     * by the app.  The default implementation returns null, meaning the referrer will simply
     * be the android-app: of the package name of this activity.  Return a non-null Uri to
     * have that supplied as the {@link Intent#EXTRA_REFERRER} of any activities started from it.
     */
    public Uri onProvideReferrer() {
        verifyMethodCalledFromDelegate("onProvideReferrer()");
        return ((CallFun0<Uri>) mSuperListeners.pop()).call();
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
    public void onRequestPermissionsResult(final int requestCode,
            @NonNull final String[] permissions, @NonNull final int[] grantResults) {
        verifyMethodCalledFromDelegate("onRequestPermissionsResult(Integer, String[], int[])");
        ((CallVoid3<Integer, String[], int[]>) mSuperListeners.pop())
                .call(requestCode, permissions, grantResults);
    }

    /**
     * Called after {@link #onStop} when the current activity is being
     * re-displayed to the user (the user has navigated back to it).  It will
     * be followed by {@link #onStart} and then {@link #onResume}.
     *
     * <p>For activities that are using raw {@link Cursor} objects (instead of
     * creating them through
     * {@link #managedQuery(Uri, String[], String, String[], String)},
     * this is usually the place
     * where the cursor should be requeried (because you had deactivated it in
     * {@link #onStop}.
     *
     * <p><em>Derived classes must call through to the super class's
     * implementation of this method.  If they do not, an exception will be
     * thrown.</em></p>
     *
     * @see #onStop
     * @see #onStart
     * @see #onResume
     */
    public void onRestart() {
        verifyMethodCalledFromDelegate("onRestart()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    /**
     * This is the same as {@link #onRestoreInstanceState(Bundle)} but is called for activities
     * created with the attribute {@link android.R.attr#persistableMode} set to
     * <code>persistAcrossReboots</code>. The {@link PersistableBundle} passed
     * came from the restored PersistableBundle first
     * saved in {@link #onSaveInstanceState(Bundle, PersistableBundle)}.
     *
     * <p>This method is called between {@link #onStart} and
     * {@link #onPostCreate}.
     *
     * <p>If this method is called {@link #onRestoreInstanceState(Bundle)} will not be called.
     *
     * @param savedInstanceState the data most recently supplied in {@link #onSaveInstanceState}.
     * @param persistentState    the data most recently supplied in {@link #onSaveInstanceState}.
     * @see #onRestoreInstanceState(Bundle)
     * @see #onCreate
     * @see #onPostCreate
     * @see #onResume
     * @see #onSaveInstanceState
     */
    public void onRestoreInstanceState(final Bundle savedInstanceState,
            final PersistableBundle persistentState) {
        verifyMethodCalledFromDelegate("onRestoreInstanceState(Bundle, PersistableBundle)");
        ((CallVoid2<Bundle, PersistableBundle>) mSuperListeners.pop())
                .call(savedInstanceState, persistentState);
    }

    /**
     * This method is called after {@link #onStart} when the activity is
     * being re-initialized from a previously saved state, given here in
     * <var>savedInstanceState</var>.  Most implementations will simply use {@link #onCreate}
     * to restore their state, but it is sometimes convenient to do it here
     * after all of the initialization has been done or to allow subclasses to
     * decide whether to use your default implementation.  The default
     * implementation of this method performs a restore of any view state that
     * had previously been frozen by {@link #onSaveInstanceState}.
     *
     * <p>This method is called between {@link #onStart} and
     * {@link #onPostCreate}.
     *
     * @param savedInstanceState the data most recently supplied in {@link #onSaveInstanceState}.
     * @see #onCreate
     * @see #onPostCreate
     * @see #onResume
     * @see #onSaveInstanceState
     */
    public void onRestoreInstanceState(final Bundle savedInstanceState) {
        verifyMethodCalledFromDelegate("onRestoreInstanceState(Bundle)");
        ((CallVoid1<Bundle>) mSuperListeners.pop()).call(savedInstanceState);
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
    public void onResume() {
        verifyMethodCalledFromDelegate("onResume()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    /**
     * This is the fragment-orientated version of {@link #onResume()} that you
     * can override to perform operations in the Activity at the same point
     * where its fragments are resumed.  Be sure to always call through to
     * the super-class.
     */
    public void onResumeFragments() {
        verifyMethodCalledFromDelegate("onResumeFragments()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public CompositeNonConfigurationInstance onRetainNonConfigurationInstance() {
        return null;
    }

    /**
     * This is the same as {@link #onSaveInstanceState} but is called for activities
     * created with the attribute {@link android.R.attr#persistableMode} set to
     * <code>persistAcrossReboots</code>. The {@link PersistableBundle} passed
     * in will be saved and presented in {@link #onCreate(Bundle, PersistableBundle)}
     * the first time that this activity is restarted following the next device reboot.
     *
     * @param outState           Bundle in which to place your saved state.
     * @param outPersistentState State which will be saved across reboots.
     * @see #onSaveInstanceState(Bundle)
     * @see #onCreate
     * @see #onRestoreInstanceState(Bundle, PersistableBundle)
     * @see #onPause
     */
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

    /**
     * This hook is called when the user signals the desire to start a search.
     *
     * <p>You can use this function as a simple way to launch the search UI, in response to a
     * menu item, search button, or other widgets within your activity. Unless overidden,
     * calling this function is the same as calling
     * {@link #startSearch startSearch(null, false, null, false)}, which launches
     * search for the current activity as specified in its manifest, see {@link SearchManager}.
     *
     * <p>You can override this function to force global search, e.g. in response to a dedicated
     * search key, or to block search entirely (by simply returning false).
     *
     * <p>Note: when running in a {@link Configuration#UI_MODE_TYPE_TELEVISION}, the default
     * implementation changes to simply return false and you must supply your own custom
     * implementation if you want to support search.</p>
     *
     * @param searchEvent The {@link SearchEvent} that signaled this search.
     * @return Returns {@code true} if search launched, and {@code false} if the activity does
     * not respond to search.  The default implementation always returns {@code true}, except
     * when in {@link Configuration#UI_MODE_TYPE_TELEVISION} mode where it returns false.
     * @see SearchManager
     */
    public boolean onSearchRequested(final SearchEvent searchEvent) {
        verifyMethodCalledFromDelegate("onSearchRequested(SearchEvent)");
        return ((CallFun1<Boolean, SearchEvent>) mSuperListeners.pop()).call(searchEvent);
    }

    /**
     * @see #onSearchRequested(SearchEvent)
     */
    public boolean onSearchRequested() {
        verifyMethodCalledFromDelegate("onSearchRequested()");
        return ((CallFun0<Boolean>) mSuperListeners.pop()).call();
    }

    public void onStart() {
        verifyMethodCalledFromDelegate("onStart()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    /**
     * Hook in to note that fragment state is no longer saved.
     */
    public void onStateNotSaved() {
        verifyMethodCalledFromDelegate("onStateNotSaved()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void onStop() {
        verifyMethodCalledFromDelegate("onStop()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    /**
     * Notifies the activity that a support action mode has finished.
     * Activity subclasses overriding this method should call the superclass implementation.
     *
     * @param mode The action mode that just finished.
     */
    public void onSupportActionModeFinished(@NonNull final ActionMode mode) {
        verifyMethodCalledFromDelegate("onSupportActionModeFinished(ActionMode)");
        ((CallVoid1<ActionMode>) mSuperListeners.pop()).call(mode);
    }

    /**
     * Notifies the Activity that a support action mode has been started.
     * Activity subclasses overriding this method should call the superclass implementation.
     *
     * @param mode The new action mode.
     */
    public void onSupportActionModeStarted(@NonNull final ActionMode mode) {
        verifyMethodCalledFromDelegate("onSupportActionModeStarted(ActionMode)");
        ((CallVoid1<ActionMode>) mSuperListeners.pop()).call(mode);
    }

    /**
     * @deprecated Use {@link #onContentChanged()} instead.
     */
    public void onSupportContentChanged() {
        verifyMethodCalledFromDelegate("onSupportContentChanged()");
        ((CallVoid0) mSuperListeners.pop()).call();
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
    public boolean onSupportNavigateUp() {
        verifyMethodCalledFromDelegate("onSupportNavigateUp()");
        return ((CallFun0<Boolean>) mSuperListeners.pop()).call();
    }

    public void onTitleChanged(final CharSequence title, final int color) {
        verifyMethodCalledFromDelegate("onTitleChanged(CharSequence, Integer)");
        ((CallVoid2<CharSequence, Integer>) mSuperListeners.pop()).call(title, color);
    }

    /**
     * Called when a touch screen event was not handled by any of the views
     * under it.  This is most useful to process touch events that happen
     * outside of your window bounds, where there is no view to receive it.
     *
     * @param event The touch screen event being processed.
     * @return Return true if you have consumed the event, false if you haven't.
     * The default implementation always returns false.
     */
    public boolean onTouchEvent(final MotionEvent event) {
        verifyMethodCalledFromDelegate("onTouchEvent(MotionEvent)");
        return ((CallFun1<Boolean, MotionEvent>) mSuperListeners.pop()).call(event);
    }

    /**
     * Called when the trackball was moved and not handled by any of the
     * views inside of the activity.  So, for example, if the trackball moves
     * while focus is on a button, you will receive a call here because
     * buttons do not normally do anything with trackball events.  The call
     * here happens <em>before</em> trackball movements are converted to
     * DPAD key events, which then get sent back to the view hierarchy, and
     * will be processed at the point for things like focus navigation.
     *
     * @param event The trackball event being processed.
     * @return Return true if you have consumed the event, false if you haven't.
     * The default implementation always returns false.
     */
    public boolean onTrackballEvent(final MotionEvent event) {
        verifyMethodCalledFromDelegate("onTrackballEvent(MotionEvent)");
        return ((CallFun1<Boolean, MotionEvent>) mSuperListeners.pop()).call(event);
    }

    public void onTrimMemory(final int level) {
        verifyMethodCalledFromDelegate("onTrimMemory(Integer)");
        ((CallVoid1<Integer>) mSuperListeners.pop()).call(level);
    }

    /**
     * Called whenever a key, touch, or trackball event is dispatched to the
     * activity.  Implement this method if you wish to know that the user has
     * interacted with the device in some way while your activity is running.
     * This callback and {@link #onUserLeaveHint} are intended to help
     * activities manage status bar notifications intelligently; specifically,
     * for helping activities determine the proper time to cancel a notfication.
     *
     * <p>All calls to your activity's {@link #onUserLeaveHint} callback will
     * be accompanied by calls to {@link #onUserInteraction}.  This
     * ensures that your activity will be told of relevant user activity such
     * as pulling down the notification pane and touching an item there.
     *
     * <p>Note that this callback will be invoked for the touch down action
     * that begins a touch gesture, but may not be invoked for the touch-moved
     * and touch-up actions that follow.
     *
     * @see #onUserLeaveHint()
     */
    public void onUserInteraction() {
        verifyMethodCalledFromDelegate("onUserInteraction()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    /**
     * Called as part of the activity lifecycle when an activity is about to go
     * into the background as the result of user choice.  For example, when the
     * user presses the Home key, {@link #onUserLeaveHint} will be called, but
     * when an incoming phone call causes the in-call Activity to be automatically
     * brought to the foreground, {@link #onUserLeaveHint} will not be called on
     * the activity being interrupted.  In cases when it is invoked, this method
     * is called right before the activity's {@link #onPause} callback.
     *
     * <p>This callback and {@link #onUserInteraction} are intended to help
     * activities manage status bar notifications intelligently; specifically,
     * for helping activities determine the proper time to cancel a notfication.
     *
     * @see #onUserInteraction()
     */
    public void onUserLeaveHint() {
        verifyMethodCalledFromDelegate("onUserLeaveHint()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    /**
     * Called when a translucent activity over this activity is becoming opaque or another
     * activity is being launched. Activities that override this method must call
     * <code>super.onVisibleBehindCanceled()</code> or a SuperNotCalledException will be thrown.
     *
     * <p>When this method is called the activity has 500 msec to release any resources it may be
     * using while visible in the background.
     * If the activity has not returned from this method in 500 msec the system will destroy
     * the activity and kill the process in order to recover the resources for another
     * process. Otherwise {@link #onStop()} will be called following return.
     *
     * @see #requestVisibleBehind(boolean)
     */
    public void onVisibleBehindCanceled() {
        verifyMethodCalledFromDelegate("onVisibleBehindCanceled()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void onWindowAttributesChanged(final WindowManager.LayoutParams params) {
        verifyMethodCalledFromDelegate("onWindowAttributesChanged(WindowManager.LayoutParams)");
        ((CallVoid1<WindowManager.LayoutParams>) mSuperListeners.pop()).call(params);
    }

    /**
     * Called when the current {@link Window} of the activity gains or loses
     * focus.  This is the best indicator of whether this activity is visible
     * to the user.  The default implementation clears the key tracking
     * state, so should always be called.
     *
     * <p>Note that this provides information about global focus state, which
     * is managed independently of activity lifecycles.  As such, while focus
     * changes will generally have some relation to lifecycle changes (an
     * activity that is stopped will not generally get window focus), you
     * should not rely on any particular order between the callbacks here and
     * those in the other lifecycle methods such as {@link #onResume}.
     *
     * <p>As a general rule, however, a resumed activity will have window
     * focus...  unless it has displayed other dialogs or popups that take
     * input focus, in which case the activity itself will not have focus
     * when the other windows have it.  Likewise, the system may display
     * system-level windows (such as the status bar notification panel or
     * a system alert) which will temporarily take window input focus without
     * pausing the foreground activity.
     *
     * @param hasFocus Whether the window of this activity has focus.
     * @see #hasWindowFocus()
     * @see #onResume
     * @see View#onWindowFocusChanged(boolean)
     */
    public void onWindowFocusChanged(final boolean hasFocus) {
        verifyMethodCalledFromDelegate("onWindowFocusChanged(Boolean)");
        ((CallVoid1<Boolean>) mSuperListeners.pop()).call(hasFocus);
    }

    /**
     * Give the Activity a chance to control the UI for an action mode requested
     * by the system.
     *
     * <p>Note: If you are looking for a notification callback that an action mode
     * has been started for this activity, see {@link #onActionModeStarted(android.view.ActionMode)}.</p>
     *
     * @param callback The callback that should control the new action mode
     * @return The new action mode, or <code>null</code> if the activity does not want to
     * provide special handling for this action mode. (It will be handled by the system.)
     */
    public android.view.ActionMode onWindowStartingActionMode(
            final android.view.ActionMode.Callback callback) {
        verifyMethodCalledFromDelegate(
                "onWindowStartingActionMode(android.view.ActionMode.Callback)");
        return ((CallFun1<android.view.ActionMode, android.view.ActionMode.Callback>) mSuperListeners
                .pop()).call(callback);
    }

    /**
     * {@inheritDoc}
     */
    public android.view.ActionMode onWindowStartingActionMode(
            final android.view.ActionMode.Callback callback, final int type) {
        verifyMethodCalledFromDelegate(
                "onWindowStartingActionMode(android.view.ActionMode.Callback, Integer)");
        return ((CallFun2<android.view.ActionMode, android.view.ActionMode.Callback, Integer>) mSuperListeners
                .pop()).call(callback, type);
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
    public ActionMode onWindowStartingSupportActionMode(
            @NonNull final ActionMode.Callback callback) {
        verifyMethodCalledFromDelegate("onWindowStartingSupportActionMode(ActionMode.Callback)");
        return ((CallFun1<ActionMode, ActionMode.Callback>) mSuperListeners.pop()).call(callback);
    }

    /**
     * Programmatically opens the context menu for a particular {@code view}.
     * The {@code view} should have been added via
     * {@link #registerForContextMenu(View)}.
     *
     * @param view The view to show the context menu for.
     */
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

    /**
     * Programmatically opens the options menu. If the options menu is already
     * open, this method does nothing.
     */
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

    /**
     * Call immediately after one of the flavors of {@link #startActivity(Intent)}
     * or {@link #finish} to specify an explicit transition animation to
     * perform next.
     *
     * <p>As of {@link Build.VERSION_CODES#JELLY_BEAN} an alternative
     * to using this with starting activities is to supply the desired animation
     * information through a {@link ActivityOptions} bundle to
     * {@link #startActivity(Intent, Bundle)} or a related function.  This allows
     * you to specify a custom animation even when starting an activity from
     * outside the context of the current top activity.
     *
     * @param enterAnim A resource ID of the animation resource to use for
     *                  the incoming activity.  Use 0 for no animation.
     * @param exitAnim  A resource ID of the animation resource to use for
     */
    public void overridePendingTransition(final int enterAnim, final int exitAnim) {
        verifyMethodCalledFromDelegate("overridePendingTransition(Integer, Integer)");
        ((CallVoid2<Integer, Integer>) mSuperListeners.pop()).call(enterAnim, exitAnim);
    }

    public Drawable peekWallpaper() {
        verifyMethodCalledFromDelegate("peekWallpaper()");
        return ((CallFun0<Drawable>) mSuperListeners.pop()).call();
    }

    /**
     * Postpone the entering activity transition when Activity was started with
     * {@link ActivityOptions#makeSceneTransitionAnimation(Activity,
     * Pair[])}.
     * <p>This method gives the Activity the ability to delay starting the entering and
     * shared element transitions until all data is loaded. Until then, the Activity won't
     * draw into its window, leaving the window transparent. This may also cause the
     * returning animation to be delayed until data is ready. This method should be
     * called in {@link #onCreate(Bundle)} or in
     * {@link #onActivityReenter(int, Intent)}.
     * {@link #startPostponedEnterTransition()} must be called to allow the Activity to
     * start the transitions. If the Activity did not use
     * {@link ActivityOptions#makeSceneTransitionAnimation(Activity,
     * Pair[])}, then this method does nothing.</p>
     */
    public void postponeEnterTransition() {
        verifyMethodCalledFromDelegate("postponeEnterTransition()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    /**
     * Store an instance of {@link SupportActivity.ExtraData} for later retrieval by class name
     * via {@link #getExtraData}.
     *
     * <p>Note that these objects are not retained across configuration changes</p>
     *
     * @hide
     * @see #getExtraData
     */
    public void putExtraData(final SupportActivity.ExtraData extraData) {
        verifyMethodCalledFromDelegate("putExtraData(SupportActivity.ExtraData)");
        ((CallVoid1<SupportActivity.ExtraData>) mSuperListeners.pop()).call(extraData);
    }

    /**
     * Cause this Activity to be recreated with a new instance.  This results
     * in essentially the same flow as when the Activity is created due to
     * a configuration change -- the current instance will go through its
     * lifecycle to {@link #onDestroy} and a new instance then created after it.
     */
    public void recreate() {
        verifyMethodCalledFromDelegate("recreate()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    /**
     * Add a new {@link ComponentCallbacks} to the base application of the
     * Context, which will be called at the same times as the ComponentCallbacks
     * methods of activities and other components are called.  Note that you
     * <em>must</em> be sure to use {@link #unregisterComponentCallbacks} when
     * appropriate in the future; this will not be removed for you.
     *
     * @param callback The interface to call.  This can be either a
     *                 {@link ComponentCallbacks} or {@link ComponentCallbacks2} interface.
     */
    public void registerComponentCallbacks(final ComponentCallbacks callback) {
        verifyMethodCalledFromDelegate("registerComponentCallbacks(ComponentCallbacks)");
        ((CallVoid1<ComponentCallbacks>) mSuperListeners.pop()).call(callback);
    }

    /**
     * Registers a context menu to be shown for the given view (multiple views
     * can show the context menu). This method will set the
     * {@link OnCreateContextMenuListener} on the view to this activity, so
     * {@link #onCreateContextMenu(ContextMenu, View, ContextMenuInfo)} will be
     * called when it is time to show the context menu.
     *
     * @param view The view that should show a context menu.
     * @see #unregisterForContextMenu(View)
     */
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

    /**
     * Ask that the local app instance of this activity be released to free up its memory.
     * This is asking for the activity to be destroyed, but does <b>not</b> finish the activity --
     * a new instance of the activity will later be re-created if needed due to the user
     * navigating back to it.
     *
     * @return Returns true if the activity was in a state that it has started the process
     * of destroying its current instance; returns false if for any reason this could not
     * be done: it is currently visible to the user, it is already being destroyed, it is
     * being finished, it hasn't yet saved its state, etc.
     */
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

    /**
     * Report to the system that your app is now fully drawn, purely for diagnostic
     * purposes (calling it does not impact the visible behavior of the activity).
     * This is only used to help instrument application launch times, so that the
     * app can report when it is fully in a usable state; without this, the only thing
     * the system itself can determine is the point at which the activity's window
     * is <em>first</em> drawn and displayed.  To participate in app launch time
     * measurement, you should always call this method after first launch (when
     * {@link #onCreate(Bundle)} is called), at the point where you have
     * entirely drawn your UI and populated with all of the significant data.  You
     * can safely call this method any time after first launch as well, in which case
     * it will simply be ignored.
     */
    public void reportFullyDrawn() {
        verifyMethodCalledFromDelegate("reportFullyDrawn()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    /**
     * Create {@link DragAndDropPermissions} object bound to this activity and controlling the
     * access permissions for content URIs associated with the {@link DragEvent}.
     *
     * @param event Drag event
     * @return The {@link DragAndDropPermissions} object used to control access to the content URIs.
     * Null if no content URIs are associated with the event or if permissions could not be
     * granted.
     */
    public DragAndDropPermissions requestDragAndDropPermissions(final DragEvent event) {
        verifyMethodCalledFromDelegate("requestDragAndDropPermissions(DragEvent)");
        return ((CallFun1<DragAndDropPermissions, DragEvent>) mSuperListeners.pop()).call(event);
    }

    /**
     * Activities that want to remain visible behind a translucent activity above them must call
     * this method anytime between the start of {@link #onResume()} and the return from
     * {@link #onPause()}. If this call is successful then the activity will remain visible after
     * {@link #onPause()} is called, and is allowed to continue playing media in the background.
     *
     * <p>The actions of this call are reset each time that this activity is brought to the
     * front. That is, every time {@link #onResume()} is called the activity will be assumed
     * to not have requested visible behind. Therefore, if you want this activity to continue to
     * be visible in the background you must call this method again.
     *
     * <p>Only fullscreen opaque activities may make this call. I.e. this call is a nop
     * for dialog and translucent activities.
     *
     * <p>Under all circumstances, the activity must stop playing and release resources prior to or
     * within a call to {@link #onVisibleBehindCanceled()} or if this call returns false.
     *
     * <p>False will be returned any time this method is called between the return of onPause and
     * the next call to onResume.
     *
     * @param visible true to notify the system that the activity wishes to be visible behind other
     *                translucent activities, false to indicate otherwise. Resources must be
     *                released when passing false to this method.
     * @return the resulting visibiity state. If true the activity will remain visible beyond
     * {@link #onPause()} if the next activity is translucent or not fullscreen. If false
     * then the activity may not count on being visible behind other translucent activities,
     * and must stop any media playback and release resources.
     * Returning false may occur in lieu of a call to {@link #onVisibleBehindCanceled()} so
     * the return value must be checked.
     * @see #onVisibleBehindCanceled()
     */
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

    /**
     * Set a {@link Toolbar Toolbar} to act as the {@link ActionBar} for this
     * Activity window.
     *
     * <p>When set to a non-null value the {@link #getActionBar()} method will return
     * an {@link ActionBar} object that can be used to control the given toolbar as if it were
     * a traditional window decor action bar. The toolbar's menu will be populated with the
     * Activity's options menu and the navigation button will be wired through the standard
     * {@link android.R.id#home home} menu select action.</p>
     *
     * <p>In order to use a Toolbar within the Activity's window content the application
     * must not request the window feature {@link Window#FEATURE_ACTION_BAR
     * FEATURE_ACTION_BAR}.</p>
     *
     * @param toolbar Toolbar to set as the Activity's action bar, or {@code null} to clear it
     */
    public void setActionBar(final Toolbar toolbar) {
        verifyMethodCalledFromDelegate("setActionBar(Toolbar)");
        ((CallVoid1<Toolbar>) mSuperListeners.pop()).call(toolbar);
    }

    /**
     * Set the {@link TransitionManager} to use for default transitions in this window.
     * Requires {@link Window#FEATURE_CONTENT_TRANSITIONS}.
     *
     * @param tm The TransitionManager to use for scene changes.
     */
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

    /**
     * When {@link ActivityOptions#makeSceneTransitionAnimation(Activity,
     * View, String)} was used to start an Activity, <var>callback</var>
     * will be called to handle shared elements on the <i>launched</i> Activity. This requires
     * {@link Window#FEATURE_CONTENT_TRANSITIONS}.
     *
     * @param callback Used to manipulate shared element transitions on the launched Activity.
     */
    public void setEnterSharedElementCallback(final SharedElementCallback callback) {
        verifyMethodCalledFromDelegate("setEnterSharedElementCallback(SharedElementCallback)");
        ((CallVoid1<SharedElementCallback>) mSuperListeners.pop()).call(callback);
    }

    /**
     * When {@link ActivityOptions#makeSceneTransitionAnimation(Activity,
     * View, String)} was used to start an Activity, <var>callback</var>
     * will be called to handle shared elements on the <i>launched</i> Activity. This requires
     * {@link Window#FEATURE_ACTIVITY_TRANSITIONS}.
     *
     * @param callback Used to manipulate shared element transitions on the launched Activity.
     */
    public void setEnterSharedElementCallback(final android.app.SharedElementCallback callback) {
        verifyMethodCalledFromDelegate(
                "setEnterSharedElementCallback(android.app.SharedElementCallback)");
        ((CallVoid1<android.app.SharedElementCallback>) mSuperListeners.pop()).call(callback);
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
    public void setExitSharedElementCallback(final SharedElementCallback listener) {
        verifyMethodCalledFromDelegate("setExitSharedElementCallback(SharedElementCallback)");
        ((CallVoid1<SharedElementCallback>) mSuperListeners.pop()).call(listener);
    }

    /**
     * When {@link ActivityOptions#makeSceneTransitionAnimation(Activity,
     * View, String)} was used to start an Activity, <var>callback</var>
     * will be called to handle shared elements on the <i>launching</i> Activity. Most
     * calls will only come when returning from the started Activity.
     * This requires {@link Window#FEATURE_ACTIVITY_TRANSITIONS}.
     *
     * @param callback Used to manipulate shared element transitions on the launching Activity.
     */
    public void setExitSharedElementCallback(final android.app.SharedElementCallback callback) {
        verifyMethodCalledFromDelegate(
                "setExitSharedElementCallback(android.app.SharedElementCallback)");
        ((CallVoid1<android.app.SharedElementCallback>) mSuperListeners.pop()).call(callback);
    }

    /**
     * Sets whether this activity is finished when touched outside its window's
     * bounds.
     */
    public void setFinishOnTouchOutside(final boolean finish) {
        verifyMethodCalledFromDelegate("setFinishOnTouchOutside(Boolean)");
        ((CallVoid1<Boolean>) mSuperListeners.pop()).call(finish);
    }

    /**
     * Adjust the current immersive mode setting.
     *
     * Note that changing this value will have no effect on the activity's
     * {@link ActivityInfo} structure; that is, if
     * <code>android:immersive</code> is set to <code>true</code>
     * in the application's manifest entry for this activity, the {@link
     * ActivityInfo#flags ActivityInfo.flags} member will
     * always have its {@link ActivityInfo#FLAG_IMMERSIVE
     * FLAG_IMMERSIVE} bit set.
     *
     * @see #isImmersive()
     * @see ActivityInfo#FLAG_IMMERSIVE
     */
    public void setImmersive(final boolean i) {
        verifyMethodCalledFromDelegate("setImmersive(Boolean)");
        ((CallVoid1<Boolean>) mSuperListeners.pop()).call(i);
    }

    /**
     * Change the intent returned by {@link #getIntent}.  This holds a
     * reference to the given intent; it does not copy it.  Often used in
     * conjunction with {@link #onNewIntent}.
     *
     * @param newIntent The new Intent object to return from getIntent
     * @see #getIntent
     * @see #onNewIntent
     */
    public void setIntent(final Intent newIntent) {
        verifyMethodCalledFromDelegate("setIntent(Intent)");
        ((CallVoid1<Intent>) mSuperListeners.pop()).call(newIntent);
    }

    /**
     * Change the desired orientation of this activity.  If the activity
     * is currently in the foreground or otherwise impacting the screen
     * orientation, the screen will immediately be changed (possibly causing
     * the activity to be restarted). Otherwise, this will be used the next
     * time the activity is visible.
     *
     * @param requestedOrientation An orientation constant as used in
     *                             {@link ActivityInfo#screenOrientation ActivityInfo.screenOrientation}.
     */
    public void setRequestedOrientation(final int requestedOrientation) {
        verifyMethodCalledFromDelegate("setRequestedOrientation(Integer)");
        ((CallVoid1<Integer>) mSuperListeners.pop()).call(requestedOrientation);
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
    public void setSupportActionBar(@Nullable final android.support.v7.widget.Toolbar toolbar) {
        verifyMethodCalledFromDelegate("setSupportActionBar(android.support.v7.widget.Toolbar)");
        ((CallVoid1<android.support.v7.widget.Toolbar>) mSuperListeners.pop()).call(toolbar);
    }

    /**
     * @deprecated Progress bars are no longer provided in AppCompat.
     */
    public void setSupportProgress(final int progress) {
        verifyMethodCalledFromDelegate("setSupportProgress(Integer)");
        ((CallVoid1<Integer>) mSuperListeners.pop()).call(progress);
    }

    /**
     * @deprecated Progress bars are no longer provided in AppCompat.
     */
    public void setSupportProgressBarIndeterminate(final boolean indeterminate) {
        verifyMethodCalledFromDelegate("setSupportProgressBarIndeterminate(Boolean)");
        ((CallVoid1<Boolean>) mSuperListeners.pop()).call(indeterminate);
    }

    /**
     * @deprecated Progress bars are no longer provided in AppCompat.
     */
    public void setSupportProgressBarIndeterminateVisibility(final boolean visible) {
        verifyMethodCalledFromDelegate("setSupportProgressBarIndeterminateVisibility(Boolean)");
        ((CallVoid1<Boolean>) mSuperListeners.pop()).call(visible);
    }

    /**
     * @deprecated Progress bars are no longer provided in AppCompat.
     */
    public void setSupportProgressBarVisibility(final boolean visible) {
        verifyMethodCalledFromDelegate("setSupportProgressBarVisibility(Boolean)");
        ((CallVoid1<Boolean>) mSuperListeners.pop()).call(visible);
    }

    /**
     * Sets information describing the task with this activity for presentation inside the Recents
     * System UI. When {@link ActivityManager#getRecentTasks} is called, the activities of each
     * task
     * are traversed in order from the topmost activity to the bottommost. The traversal continues
     * for each property until a suitable value is found. For each task the taskDescription will be
     * returned in {@link ActivityManager.TaskDescription}.
     *
     * @param taskDescription The TaskDescription properties that describe the task with this
     *                        activity
     * @see ActivityManager#getRecentTasks
     * @see ActivityManager.TaskDescription
     */
    public void setTaskDescription(final ActivityManager.TaskDescription taskDescription) {
        verifyMethodCalledFromDelegate("setTaskDescription(ActivityManager.TaskDescription)");
        ((CallVoid1<ActivityManager.TaskDescription>) mSuperListeners.pop()).call(taskDescription);
    }

    public void setTheme(@StyleRes final int resid) {
        verifyMethodCalledFromDelegate("setTheme(Integer)");
        ((CallVoid1<Integer>) mSuperListeners.pop()).call(resid);
    }

    /**
     * Change the title associated with this activity.  If this is a
     * top-level activity, the title for its window will change.  If it
     * is an embedded activity, the parent can do whatever it wants
     * with it.
     */
    public void setTitle(final CharSequence title) {
        verifyMethodCalledFromDelegate("setTitle(CharSequence)");
        ((CallVoid1<CharSequence>) mSuperListeners.pop()).call(title);
    }

    /**
     * Change the title associated with this activity.  If this is a
     * top-level activity, the title for its window will change.  If it
     * is an embedded activity, the parent can do whatever it wants
     * with it.
     */
    public void setTitle(final int titleId) {
        verifyMethodCalledFromDelegate("setTitle(Integer)");
        ((CallVoid1<Integer>) mSuperListeners.pop()).call(titleId);
    }

    /**
     * Change the color of the title associated with this activity.
     * <p>
     * This method is deprecated starting in API Level 11 and replaced by action
     * bar styles. For information on styling the Action Bar, read the <a
     * href="{@docRoot} guide/topics/ui/actionbar.html">Action Bar</a> developer
     * guide.
     *
     * @deprecated Use action bar styles instead.
     */
    public void setTitleColor(final int textColor) {
        verifyMethodCalledFromDelegate("setTitleColor(Integer)");
        ((CallVoid1<Integer>) mSuperListeners.pop()).call(textColor);
    }

    /**
     * Control whether this activity's main window is visible.  This is intended
     * only for the special case of an activity that is not going to show a
     * UI itself, but can't just finish prior to onResume() because it needs
     * to wait for a service binding or such.  Setting this to false allows
     * you to prevent your UI from being shown during that time.
     *
     * <p>The default value for this is taken from the
     * {@link android.R.attr#windowNoDisplay} attribute of the activity's theme.
     */
    public void setVisible(final boolean visible) {
        verifyMethodCalledFromDelegate("setVisible(Boolean)");
        ((CallVoid1<Boolean>) mSuperListeners.pop()).call(visible);
    }

    /**
     * Enable or disable virtual reality (VR) mode for this Activity.
     *
     * <p>VR mode is a hint to Android system to switch to a mode optimized for VR applications
     * while this Activity has user focus.</p>
     *
     * <p>It is recommended that applications additionally declare
     * {@link android.R.attr#enableVrMode} in their manifest to allow for smooth activity
     * transitions when switching between VR activities.</p>
     *
     * <p>If the requested {@link VrListenerService} component is not available,
     * VR mode will not be started.  Developers can handle this case as follows:</p>
     *
     * <pre>
     * String servicePackage = "com.whatever.app";
     * String serviceClass = "com.whatever.app.MyVrListenerService";
     *
     * // Name of the component of the VrListenerService to start.
     * ComponentName serviceComponent = new ComponentName(servicePackage, serviceClass);
     *
     * try {
     *    setVrModeEnabled(true, myComponentName);
     * } catch (PackageManager.NameNotFoundException e) {
     *        List&lt;ApplicationInfo> installed = getPackageManager().getInstalledApplications(0);
     *        boolean isInstalled = false;
     *        for (ApplicationInfo app : installed) {
     *            if (app.packageName.equals(servicePackage)) {
     *                isInstalled = true;
     *                break;
     *            }
     *        }
     *        if (isInstalled) {
     *            // Package is installed, but not enabled in Settings.  Let user enable it.
     *            startActivity(new Intent(Settings.ACTION_VR_LISTENER_SETTINGS));
     *        } else {
     *            // Package is not installed.  Send an intent to download this.
     *            sentIntentToLaunchAppStore(servicePackage);
     *        }
     * }
     * </pre>
     *
     * @param enabled            {@code true} to enable this mode.
     * @param requestedComponent the name of the component to use as a
     *                           {@link VrListenerService} while VR mode is enabled.
     * @throws PackageManager.NameNotFoundException if the given component
     *                                              to run as a {@link VrListenerService} is not
     *                                              installed, or has
     *                                              not been enabled in user settings.
     * @see PackageManager#FEATURE_VR_MODE
     * @see PackageManager#FEATURE_VR_MODE_HIGH_PERFORMANCE
     * @see VrListenerService
     * @see Settings#ACTION_VR_LISTENER_SETTINGS
     * @see android.R.attr#enableVrMode
     */
    public void setVrModeEnabled(final boolean enabled, final ComponentName requestedComponent)
            throws PackageManager.NameNotFoundException {
        verifyMethodCalledFromDelegate("setVrModeEnabled(Boolean, ComponentName)");
        ((CallVoid2<Boolean, ComponentName>) mSuperListeners.pop())
                .call(enabled, requestedComponent);
    }

    public void setWallpaper(final Bitmap bitmap) throws IOException {
        verifyMethodCalledFromDelegate("setWallpaper(Bitmap)");
        ((CallVoid1<Bitmap>) mSuperListeners.pop()).call(bitmap);
    }

    public void setWallpaper(final InputStream data) throws IOException {
        verifyMethodCalledFromDelegate("setWallpaper(InputStream)");
        ((CallVoid1<InputStream>) mSuperListeners.pop()).call(data);
    }

    /**
     * Gets whether you should show UI with rationale for requesting a permission.
     * You should do this only if you do not have the permission and the context in
     * which the permission is requested does not clearly communicate to the user
     * what would be the benefit from granting this permission.
     * <p>
     * For example, if you write a camera app, requesting the camera permission
     * would be expected by the user and no rationale for why it is requested is
     * needed. If however, the app needs location for tagging photos then a non-tech
     * savvy user may wonder how location is related to taking photos. In this case
     * you may choose to show UI with rationale of requesting this permission.
     * </p>
     *
     * @param permission A permission your app wants to request.
     * @return Whether you can show permission rationale UI.
     * @see #checkSelfPermission(String)
     * @see #requestPermissions(String[], int)
     * @see #onRequestPermissionsResult(int, String[], int[])
     */
    public boolean shouldShowRequestPermissionRationale(final String permission) {
        verifyMethodCalledFromDelegate("shouldShowRequestPermissionRationale(String)");
        return ((CallFun1<Boolean, String>) mSuperListeners.pop()).call(permission);
    }

    /**
     * Returns true if the app should recreate the task when navigating 'up' from this activity
     * by using targetIntent.
     *
     * <p>If this method returns false the app can trivially call
     * {@link #navigateUpTo(Intent)} using the same parameters to correctly perform
     * up navigation. If this method returns false, the app should synthesize a new task stack
     * by using {@link TaskStackBuilder} or another similar mechanism to perform up navigation.</p>
     *
     * @param targetIntent An intent representing the target destination for up navigation
     * @return true if navigating up should recreate a new task stack, false if the same task
     * should be used for the destination
     */
    public boolean shouldUpRecreateTask(final Intent targetIntent) {
        verifyMethodCalledFromDelegate("shouldUpRecreateTask(Intent)");
        return ((CallFun1<Boolean, Intent>) mSuperListeners.pop()).call(targetIntent);
    }

    /**
     * Ask to have the current assistant shown to the user.  This only works if the calling
     * activity is the current foreground activity.  It is the same as calling
     * {@link VoiceInteractionService#showSession
     * VoiceInteractionService.showSession} and requesting all of the possible context.
     * The receiver will always see
     * {@link VoiceInteractionSession#SHOW_SOURCE_APPLICATION} set.
     *
     * @return Returns true if the assistant was successfully invoked, else false.  For example
     * false will be returned if the caller is not the current top activity.
     */
    public boolean showAssist(final Bundle args) {
        verifyMethodCalledFromDelegate("showAssist(Bundle)");
        return ((CallFun1<Boolean, Bundle>) mSuperListeners.pop()).call(args);
    }

    /**
     * Shows the user the system defined message for telling the user how to exit
     * lock task mode. The task containing this activity must be in lock task mode at the time
     * of this call for the message to be displayed.
     */
    public void showLockTaskEscapeMessage() {
        verifyMethodCalledFromDelegate("showLockTaskEscapeMessage()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    /**
     * Start an action mode of the default type {@link android.view.ActionMode#TYPE_PRIMARY}.
     *
     * @param callback Callback that will manage lifecycle events for this action mode
     * @return The ActionMode that was started, or null if it was canceled
     * @see android.view.ActionMode
     */
    public android.view.ActionMode startActionMode(
            final android.view.ActionMode.Callback callback) {
        verifyMethodCalledFromDelegate("startActionMode(android.view.ActionMode.Callback)");
        return ((CallFun1<android.view.ActionMode, android.view.ActionMode.Callback>) mSuperListeners
                .pop()).call(callback);
    }

    /**
     * Start an action mode of the given type.
     *
     * @param callback Callback that will manage lifecycle events for this action mode
     * @param type     One of {@link android.view.ActionMode#TYPE_PRIMARY} or {@link
     *                 android.view.ActionMode#TYPE_FLOATING}.
     * @return The ActionMode that was started, or null if it was canceled
     * @see android.view.ActionMode
     */
    public android.view.ActionMode startActionMode(final android.view.ActionMode.Callback callback,
            final int type) {
        verifyMethodCalledFromDelegate(
                "startActionMode(android.view.ActionMode.Callback, Integer)");
        return ((CallFun2<android.view.ActionMode, android.view.ActionMode.Callback, Integer>) mSuperListeners
                .pop()).call(callback, type);
    }

    /**
     * Same as {@link #startActivities(Intent[], Bundle)} with no options
     * specified.
     *
     * @param intents The intents to start.
     * @see #startActivities(Intent[], Bundle)
     * @see #startActivityForResult
     */
    public void startActivities(final Intent[] intents) {
        verifyMethodCalledFromDelegate("startActivities(Intent[])");
        ((CallVoid1<Intent[]>) mSuperListeners.pop()).call(intents);
    }

    /**
     * Launch a new activity.  You will not receive any information about when
     * the activity exits.  This implementation overrides the base version,
     * providing information about
     * the activity performing the launch.  Because of this additional
     * information, the {@link Intent#FLAG_ACTIVITY_NEW_TASK} launch flag is not
     * required; if not specified, the new activity will be added to the
     * task of the caller.
     *
     * <p>This method throws {@link ActivityNotFoundException}
     * if there was no Activity found to run the given Intent.
     *
     * @param intents The intents to start.
     * @param options Additional options for how the Activity should be started.
     *                See {@link Context#startActivity(Intent, Bundle)
     *                Context.startActivity(Intent, Bundle)} for more details.
     * @see #startActivities(Intent[])
     * @see #startActivityForResult
     */
    public void startActivities(final Intent[] intents, final Bundle options) {
        verifyMethodCalledFromDelegate("startActivities(Intent[], Bundle)");
        ((CallVoid2<Intent[], Bundle>) mSuperListeners.pop()).call(intents, options);
    }

    /**
     * Same as {@link #startActivity(Intent, Bundle)} with no options
     * specified.
     *
     * @param intent The intent to start.
     * @see #startActivity(Intent, Bundle)
     * @see #startActivityForResult
     */
    public void startActivity(final Intent intent) {
        verifyMethodCalledFromDelegate("startActivity(Intent)");
        ((CallVoid1<Intent>) mSuperListeners.pop()).call(intent);
    }

    /**
     * Launch a new activity.  You will not receive any information about when
     * the activity exits.  This implementation overrides the base version,
     * providing information about
     * the activity performing the launch.  Because of this additional
     * information, the {@link Intent#FLAG_ACTIVITY_NEW_TASK} launch flag is not
     * required; if not specified, the new activity will be added to the
     * task of the caller.
     *
     * <p>This method throws {@link ActivityNotFoundException}
     * if there was no Activity found to run the given Intent.
     *
     * @param intent  The intent to start.
     * @param options Additional options for how the Activity should be started.
     *                See {@link Context#startActivity(Intent, Bundle)
     *                Context.startActivity(Intent, Bundle)} for more details.
     * @see #startActivity(Intent)
     * @see #startActivityForResult
     */
    public void startActivity(final Intent intent, final Bundle options) {
        verifyMethodCalledFromDelegate("startActivity(Intent, Bundle)");
        ((CallVoid2<Intent, Bundle>) mSuperListeners.pop()).call(intent, options);
    }

    /**
     * Modifies the standard behavior to allow results to be delivered to fragments.
     * This imposes a restriction that requestCode be <= 0xffff.
     */
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

    /**
     * Same as calling {@link #startActivityFromChild(Activity, Intent, int, Bundle)}
     * with no options.
     *
     * @param child       The activity making the call.
     * @param intent      The intent to start.
     * @param requestCode Reply request code.  < 0 if reply is not requested.
     * @see #startActivity
     * @see #startActivityForResult
     */
    public void startActivityFromChild(final Activity child, final Intent intent,
            final int requestCode) {
        verifyMethodCalledFromDelegate("startActivityFromChild(Activity, Intent, Integer)");
        ((CallVoid3<Activity, Intent, Integer>) mSuperListeners.pop())
                .call(child, intent, requestCode);
    }

    /**
     * This is called when a child activity of this one calls its
     * {@link #startActivity} or {@link #startActivityForResult} method.
     *
     * <p>This method throws {@link ActivityNotFoundException}
     * if there was no Activity found to run the given Intent.
     *
     * @param child       The activity making the call.
     * @param intent      The intent to start.
     * @param requestCode Reply request code.  < 0 if reply is not requested.
     * @param options     Additional options for how the Activity should be started.
     *                    See {@link Context#startActivity(Intent, Bundle)
     *                    Context.startActivity(Intent, Bundle)} for more details.
     * @see #startActivity
     * @see #startActivityForResult
     */
    public void startActivityFromChild(final Activity child, final Intent intent,
            final int requestCode, final Bundle options) {
        verifyMethodCalledFromDelegate("startActivityFromChild(Activity, Intent, Integer, Bundle)");
        ((CallVoid4<Activity, Intent, Integer, Bundle>) mSuperListeners.pop())
                .call(child, intent, requestCode, options);
    }

    /**
     * Called by Fragment.startActivityForResult() to implement its behavior.
     */
    public void startActivityFromFragment(final Fragment fragment, final Intent intent,
            final int requestCode) {
        verifyMethodCalledFromDelegate("startActivityFromFragment(Fragment, Intent, Integer)");
        ((CallVoid3<Fragment, Intent, Integer>) mSuperListeners.pop())
                .call(fragment, intent, requestCode);
    }

    /**
     * Called by Fragment.startActivityForResult() to implement its behavior.
     */
    public void startActivityFromFragment(final Fragment fragment, final Intent intent,
            final int requestCode, @Nullable final Bundle options) {
        verifyMethodCalledFromDelegate(
                "startActivityFromFragment(Fragment, Intent, Integer, Bundle)");
        ((CallVoid4<Fragment, Intent, Integer, Bundle>) mSuperListeners.pop())
                .call(fragment, intent, requestCode, options);
    }

    /**
     * Same as calling {@link #startActivityFromFragment(android.app.Fragment, Intent, int,
     * Bundle)}
     * with no options.
     *
     * @param fragment    The fragment making the call.
     * @param intent      The intent to start.
     * @param requestCode Reply request code.  < 0 if reply is not requested.
     * @see android.app.Fragment#startActivity
     * @see android.app.Fragment#startActivityForResult
     */
    public void startActivityFromFragment(final android.app.Fragment fragment, final Intent intent,
            final int requestCode) {
        verifyMethodCalledFromDelegate(
                "startActivityFromFragment(android.app.Fragment, Intent, Integer)");
        ((CallVoid3<android.app.Fragment, Intent, Integer>) mSuperListeners.pop())
                .call(fragment, intent, requestCode);
    }

    /**
     * This is called when a Fragment in this activity calls its
     * {@link android.app.Fragment#startActivity} or {@link android.app.Fragment#startActivityForResult}
     * method.
     *
     * <p>This method throws {@link ActivityNotFoundException}
     * if there was no Activity found to run the given Intent.
     *
     * @param fragment    The fragment making the call.
     * @param intent      The intent to start.
     * @param requestCode Reply request code.  < 0 if reply is not requested.
     * @param options     Additional options for how the Activity should be started.
     *                    See {@link Context#startActivity(Intent, Bundle)
     *                    Context.startActivity(Intent, Bundle)} for more details.
     * @see android.app.Fragment#startActivity
     * @see android.app.Fragment#startActivityForResult
     */
    public void startActivityFromFragment(final android.app.Fragment fragment, final Intent intent,
            final int requestCode, final Bundle options) {
        verifyMethodCalledFromDelegate(
                "startActivityFromFragment(android.app.Fragment, Intent, Integer, Bundle)");
        ((CallVoid4<android.app.Fragment, Intent, Integer, Bundle>) mSuperListeners.pop())
                .call(fragment, intent, requestCode, options);
    }

    /**
     * Same as calling {@link #startActivityIfNeeded(Intent, int, Bundle)}
     * with no options.
     *
     * @param intent      The intent to start.
     * @param requestCode If >= 0, this code will be returned in
     *                    onActivityResult() when the activity exits, as described in
     *                    {@link #startActivityForResult}.
     * @return If a new activity was launched then true is returned; otherwise
     * false is returned and you must handle the Intent yourself.
     * @see #startActivity
     * @see #startActivityForResult
     */
    public boolean startActivityIfNeeded(final Intent intent, final int requestCode) {
        verifyMethodCalledFromDelegate("startActivityIfNeeded(Intent, Integer)");
        return ((CallFun2<Boolean, Intent, Integer>) mSuperListeners.pop())
                .call(intent, requestCode);
    }

    /**
     * A special variation to launch an activity only if a new activity
     * instance is needed to handle the given Intent.  In other words, this is
     * just like {@link #startActivityForResult(Intent, int)} except: if you are
     * using the {@link Intent#FLAG_ACTIVITY_SINGLE_TOP} flag, or
     * singleTask or singleTop
     * {@link android.R.styleable#AndroidManifestActivity_launchMode launchMode},
     * and the activity
     * that handles <var>intent</var> is the same as your currently running
     * activity, then a new instance is not needed.  In this case, instead of
     * the normal behavior of calling {@link #onNewIntent} this function will
     * return and you can handle the Intent yourself.
     *
     * <p>This function can only be called from a top-level activity; if it is
     * called from a child activity, a runtime exception will be thrown.
     *
     * @param intent      The intent to start.
     * @param requestCode If >= 0, this code will be returned in
     *                    onActivityResult() when the activity exits, as described in
     *                    {@link #startActivityForResult}.
     * @param options     Additional options for how the Activity should be started.
     *                    See {@link Context#startActivity(Intent, Bundle)
     *                    Context.startActivity(Intent, Bundle)} for more details.
     * @return If a new activity was launched then true is returned; otherwise
     * false is returned and you must handle the Intent yourself.
     * @see #startActivity
     * @see #startActivityForResult
     */
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

    /**
     * Same as calling {@link #startIntentSender(IntentSender, Intent, int, int, int, Bundle)}
     * with no options.
     *
     * @param intent       The IntentSender to launch.
     * @param fillInIntent If non-null, this will be provided as the
     *                     intent parameter to {@link IntentSender#sendIntent}.
     * @param flagsMask    Intent flags in the original IntentSender that you
     *                     would like to change.
     * @param flagsValues  Desired values for any bits set in
     *                     <var>flagsMask</var>
     * @param extraFlags   Always set to 0.
     */
    public void startIntentSender(final IntentSender intent, final Intent fillInIntent,
            final int flagsMask, final int flagsValues, final int extraFlags)
            throws IntentSender.SendIntentException {
        verifyMethodCalledFromDelegate(
                "startIntentSender(IntentSender, Intent, Integer, Integer, Integer)");
        ((CallVoid5<IntentSender, Intent, Integer, Integer, Integer>) mSuperListeners.pop())
                .call(intent, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    /**
     * Like {@link #startActivity(Intent, Bundle)}, but taking a IntentSender
     * to start; see
     * {@link #startIntentSenderForResult(IntentSender, int, Intent, int, int, int, Bundle)}
     * for more information.
     *
     * @param intent       The IntentSender to launch.
     * @param fillInIntent If non-null, this will be provided as the
     *                     intent parameter to {@link IntentSender#sendIntent}.
     * @param flagsMask    Intent flags in the original IntentSender that you
     *                     would like to change.
     * @param flagsValues  Desired values for any bits set in
     *                     <var>flagsMask</var>
     * @param extraFlags   Always set to 0.
     * @param options      Additional options for how the Activity should be started.
     *                     See {@link Context#startActivity(Intent, Bundle)
     *                     Context.startActivity(Intent, Bundle)} for more details.  If options
     *                     have also been supplied by the IntentSender, options given here will
     */
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

    /**
     * Same as calling {@link #startIntentSenderFromChild(Activity, IntentSender,
     * int, Intent, int, int, int, Bundle)} with no options.
     */
    public void startIntentSenderFromChild(final Activity child, final IntentSender intent,
            final int requestCode, final Intent fillInIntent, final int flagsMask,
            final int flagsValues, final int extraFlags) throws IntentSender.SendIntentException {
        verifyMethodCalledFromDelegate(
                "startIntentSenderFromChild(Activity, IntentSender, Integer, Intent, Integer, Integer, Integer)");
        ((CallVoid7<Activity, IntentSender, Integer, Intent, Integer, Integer, Integer>) mSuperListeners
                .pop())
                .call(child, intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    /**
     * Like {@link #startActivityFromChild(Activity, Intent, int)}, but
     * taking a IntentSender; see
     * {@link #startIntentSenderForResult(IntentSender, int, Intent, int, int, int)}
     * for more information.
     */
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

    /**
     * Called by Fragment.startIntentSenderForResult() to implement its behavior.
     */
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

    /**
     * Starts a local voice interaction session. When ready,
     * {@link #onLocalVoiceInteractionStarted()} is called. You can pass a bundle of private
     * options
     * to the registered voice interaction service.
     *
     * @param privateOptions a Bundle of private arguments to the current voice interaction service
     */
    public void startLocalVoiceInteraction(final Bundle privateOptions) {
        verifyMethodCalledFromDelegate("startLocalVoiceInteraction(Bundle)");
        ((CallVoid1<Bundle>) mSuperListeners.pop()).call(privateOptions);
    }

    /**
     * Request to put this Activity in a mode where the user is locked to the
     * current task.
     *
     * This will prevent the user from launching other apps, going to settings, or reaching the
     * home screen. This does not include those apps whose {@link android.R.attr#lockTaskMode}
     * values permit launching while locked.
     *
     * If {@link DevicePolicyManager#isLockTaskPermitted(String)} returns true or
     * lockTaskMode=lockTaskModeAlways for this component then the app will go directly into
     * Lock Task mode. The user will not be able to exit this mode until
     * {@link Activity#stopLockTask()} is called.
     *
     * If {@link DevicePolicyManager#isLockTaskPermitted(String)} returns false
     * then the system will prompt the user with a dialog requesting permission to enter
     * this mode.  When entered through this method the user can exit at any time through
     * an action described by the request dialog.  Calling stopLockTask will also exit the
     * mode.
     *
     * @see android.R.attr#lockTaskMode
     */
    public void startLockTask() {
        verifyMethodCalledFromDelegate("startLockTask()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    /**
     * This method allows the activity to take care of managing the given
     * {@link Cursor}'s lifecycle for you based on the activity's lifecycle.
     * That is, when the activity is stopped it will automatically call
     * {@link Cursor#deactivate} on the given Cursor, and when it is later restarted
     * it will call {@link Cursor#requery} for you.  When the activity is
     * destroyed, all managed Cursors will be closed automatically.
     *
     * <em>If you are targeting {@link Build.VERSION_CODES#HONEYCOMB}
     * or later, consider instead using {@link LoaderManager} instead, available
     * via {@link #getLoaderManager()}.</em>
     *
     * <p><strong>Warning:</strong> Do not call {@link Cursor#close()} on cursor obtained from
     * {@link #managedQuery}, because the activity will do that for you at the appropriate time.
     * However, if you call {@link #stopManagingCursor} on a cursor from a managed query, the
     * system
     * <em>will not</em> automatically close the cursor and, in that case, you must call
     * {@link Cursor#close()}.</p>
     *
     * @param c The Cursor to be managed.
     * @see #managedQuery(Uri, String[], String, String[], String)
     * @see #stopManagingCursor
     * @deprecated Use the new {@link CursorLoader} class with
     * {@link LoaderManager} instead; this is also
     * available on older platforms through the Android compatibility package.
     */
    public void startManagingCursor(final Cursor c) {
        verifyMethodCalledFromDelegate("startManagingCursor(Cursor)");
        ((CallVoid1<Cursor>) mSuperListeners.pop()).call(c);
    }

    /**
     * Same as calling {@link #startNextMatchingActivity(Intent, Bundle)} with
     * no options.
     *
     * @param intent The intent to dispatch to the next activity.  For
     *               correct behavior, this must be the same as the Intent that started
     *               your own activity; the only changes you can make are to the extras
     *               inside of it.
     * @return Returns a boolean indicating whether there was another Activity
     * to start: true if there was a next activity to start, false if there
     * wasn't.  In general, if true is returned you will then want to call
     * finish() on yourself.
     */
    public boolean startNextMatchingActivity(final Intent intent) {
        verifyMethodCalledFromDelegate("startNextMatchingActivity(Intent)");
        return ((CallFun1<Boolean, Intent>) mSuperListeners.pop()).call(intent);
    }

    /**
     * Special version of starting an activity, for use when you are replacing
     * other activity components.  You can use this to hand the Intent off
     * to the next Activity that can handle it.  You typically call this in
     * {@link #onCreate} with the Intent returned by {@link #getIntent}.
     *
     * @param intent  The intent to dispatch to the next activity.  For
     *                correct behavior, this must be the same as the Intent that started
     *                your own activity; the only changes you can make are to the extras
     *                inside of it.
     * @param options Additional options for how the Activity should be started.
     *                See {@link Context#startActivity(Intent, Bundle)
     *                Context.startActivity(Intent, Bundle)} for more details.
     * @return Returns a boolean indicating whether there was another Activity
     * to start: true if there was a next activity to start, false if there
     * wasn't.  In general, if true is returned you will then want to call
     * finish() on yourself.
     */
    public boolean startNextMatchingActivity(final Intent intent, final Bundle options) {
        verifyMethodCalledFromDelegate("startNextMatchingActivity(Intent, Bundle)");
        return ((CallFun2<Boolean, Intent, Bundle>) mSuperListeners.pop()).call(intent, options);
    }

    /**
     * Begin postponed transitions after {@link #postponeEnterTransition()} was called.
     * If postponeEnterTransition() was called, you must call startPostponedEnterTransition()
     * to have your Activity start drawing.
     */
    public void startPostponedEnterTransition() {
        verifyMethodCalledFromDelegate("startPostponedEnterTransition()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    /**
     * This hook is called to launch the search UI.
     *
     * <p>It is typically called from onSearchRequested(), either directly from
     * Activity.onSearchRequested() or from an overridden version in any given
     * Activity.  If your goal is simply to activate search, it is preferred to call
     * onSearchRequested(), which may have been overridden elsewhere in your Activity.  If your
     * goal
     * is to inject specific data such as context data, it is preferred to <i>override</i>
     * onSearchRequested(), so that any callers to it will benefit from the override.
     *
     * @param initialQuery       Any non-null non-empty string will be inserted as
     *                           pre-entered text in the search query box.
     * @param selectInitialQuery If true, the initial query will be preselected, which means that
     *                           any further typing will replace it.  This is useful for cases
     *                           where
     *                           an entire pre-formed
     *                           query is being inserted.  If false, the selection point will be
     *                           placed at the end of the
     *                           inserted query.  This is useful when the inserted query is text
     *                           that the user entered,
     *                           and the user would expect to be able to keep typing.  <i>This
     *                           parameter is only meaningful
     *                           if initialQuery is a non-empty string.</i>
     * @param appSearchData      An application can insert application-specific
     *                           context here, in order to improve quality or specificity of its
     *                           own
     *                           searches.  This data will be returned with SEARCH intent(s).  Null
     *                           if
     *                           no extra data is required.
     * @param globalSearch       If false, this will only launch the search that has been
     *                           specifically
     *                           defined by the application (which is usually defined as a local
     *                           search).  If no default
     *                           search is defined in the current application or activity, global
     *                           search will be launched.
     *                           If true, this will always launch a platform-global (e.g.
     *                           web-based)
     *                           search instead.
     * @see SearchManager
     * @see #onSearchRequested
     */
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

    /**
     * Start an action mode.
     *
     * @param callback Callback that will manage lifecycle events for this context mode
     * @return The ContextMode that was started, or null if it was canceled
     */
    public ActionMode startSupportActionMode(@NonNull final ActionMode.Callback callback) {
        verifyMethodCalledFromDelegate("startSupportActionMode(ActionMode.Callback)");
        return ((CallFun1<ActionMode, ActionMode.Callback>) mSuperListeners.pop()).call(callback);
    }

    /**
     * Request to terminate the current voice interaction that was previously started
     * using {@link #startLocalVoiceInteraction(Bundle)}. When the interaction is
     * terminated, {@link #onLocalVoiceInteractionStopped()} will be called.
     */
    public void stopLocalVoiceInteraction() {
        verifyMethodCalledFromDelegate("stopLocalVoiceInteraction()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    /**
     * Allow the user to switch away from the current task.
     *
     * Called to end the mode started by {@link Activity#startLockTask}. This
     * can only be called by activities that have successfully called
     * startLockTask previously.
     *
     * This will allow the user to exit this app and move onto other activities.
     * <p>Note: This method should only be called when the activity is user-facing. That is,
     * between onResume() and onPause().
     * <p>Note: If there are other tasks below this one that are also locked then calling this
     * method will immediately finish this task and resume the previous locked one, remaining in
     * lockTask mode.
     *
     * @see android.R.attr#lockTaskMode
     * @see ActivityManager#getLockTaskModeState()
     */
    public void stopLockTask() {
        verifyMethodCalledFromDelegate("stopLockTask()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    /**
     * Given a Cursor that was previously given to
     * {@link #startManagingCursor}, stop the activity's management of that
     * cursor.
     *
     * <p><strong>Warning:</strong> After calling this method on a cursor from a managed query,
     * the system <em>will not</em> automatically close the cursor and you must call
     * {@link Cursor#close()}.</p>
     *
     * @param c The Cursor that was being managed.
     * @see #startManagingCursor
     * @deprecated Use the new {@link CursorLoader} class with
     * {@link LoaderManager} instead; this is also
     * available on older platforms through the Android compatibility package.
     */
    public void stopManagingCursor(final Cursor c) {
        verifyMethodCalledFromDelegate("stopManagingCursor(Cursor)");
        ((CallVoid1<Cursor>) mSuperListeners.pop()).call(c);
    }

    public boolean stopService(final Intent name) {
        verifyMethodCalledFromDelegate("stopService(Intent)");
        return ((CallFun1<Boolean, Intent>) mSuperListeners.pop()).call(name);
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
    public void supportFinishAfterTransition() {
        verifyMethodCalledFromDelegate("supportFinishAfterTransition()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    public void supportInvalidateOptionsMenu() {
        verifyMethodCalledFromDelegate("supportInvalidateOptionsMenu()");
        ((CallVoid0) mSuperListeners.pop()).call();
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
    public void supportNavigateUpTo(@NonNull final Intent upIntent) {
        verifyMethodCalledFromDelegate("supportNavigateUpTo(Intent)");
        ((CallVoid1<Intent>) mSuperListeners.pop()).call(upIntent);
    }

    /**
     * Support library version of {@link Activity#postponeEnterTransition()} that works
     * only on API 21 and later.
     */
    public void supportPostponeEnterTransition() {
        verifyMethodCalledFromDelegate("supportPostponeEnterTransition()");
        ((CallVoid0) mSuperListeners.pop()).call();
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
    public boolean supportRequestWindowFeature(final int featureId) {
        verifyMethodCalledFromDelegate("supportRequestWindowFeature(Integer)");
        return ((CallFun1<Boolean, Integer>) mSuperListeners.pop()).call(featureId);
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
    public boolean supportShouldUpRecreateTask(@NonNull final Intent targetIntent) {
        verifyMethodCalledFromDelegate("supportShouldUpRecreateTask(Intent)");
        return ((CallFun1<Boolean, Intent>) mSuperListeners.pop()).call(targetIntent);
    }

    /**
     * Support library version of {@link Activity#startPostponedEnterTransition()}
     * that only works with API 21 and later.
     */
    public void supportStartPostponedEnterTransition() {
        verifyMethodCalledFromDelegate("supportStartPostponedEnterTransition()");
        ((CallVoid0) mSuperListeners.pop()).call();
    }

    /**
     * Request that key events come to this activity. Use this if your
     * activity has no views with focus, but the activity still wants
     * a chance to process key events.
     *
     * @see Window#takeKeyEvents
     */
    public void takeKeyEvents(final boolean get) {
        verifyMethodCalledFromDelegate("takeKeyEvents(Boolean)");
        ((CallVoid1<Boolean>) mSuperListeners.pop()).call(get);
    }

    /**
     * Similar to {@link #startSearch}, but actually fires off the search query after invoking
     * the search dialog.  Made available for testing purposes.
     *
     * @param query         The query to trigger.  If empty, the request will be ignored.
     * @param appSearchData An application can insert application-specific
     *                      context here, in order to improve quality or specificity of its own
     *                      searches.  This data will be returned with SEARCH intent(s).  Null if
     */
    public void triggerSearch(final String query, final Bundle appSearchData) {
        verifyMethodCalledFromDelegate("triggerSearch(String, Bundle)");
        ((CallVoid2<String, Bundle>) mSuperListeners.pop()).call(query, appSearchData);
    }

    public void unbindService(final ServiceConnection conn) {
        verifyMethodCalledFromDelegate("unbindService(ServiceConnection)");
        ((CallVoid1<ServiceConnection>) mSuperListeners.pop()).call(conn);
    }

    /**
     * Remove a {@link ComponentCallbacks} object that was previously registered
     * with {@link #registerComponentCallbacks(ComponentCallbacks)}.
     */
    public void unregisterComponentCallbacks(final ComponentCallbacks callback) {
        verifyMethodCalledFromDelegate("unregisterComponentCallbacks(ComponentCallbacks)");
        ((CallVoid1<ComponentCallbacks>) mSuperListeners.pop()).call(callback);
    }

    /**
     * Prevents a context menu to be shown for the given view. This method will remove the
     * {@link OnCreateContextMenuListener} on the view.
     *
     * @param view The view that should stop showing a context menu.
     * @see #registerForContextMenu(View)
     */
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

    Context createDeviceProtectedStorageContext(final CallFun0<Context> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return createDeviceProtectedStorageContext();
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

    boolean deleteSharedPreferences(final CallFun1<Boolean, String> superCall, final String name) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return deleteSharedPreferences(name);
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

    void enterPictureInPictureMode(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            enterPictureInPictureMode();
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

    File getDataDir(final CallFun0<File> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getDataDir();
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

    <T extends SupportActivity.ExtraData> T getExtraData(final CallFun1<T, Class<T>> superCall,
            final Class<T> extraDataClass) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return getExtraData(extraDataClass);
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

    boolean isDeviceProtectedStorage(final CallFun0<Boolean> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return isDeviceProtectedStorage();
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

    boolean isInMultiWindowMode(final CallFun0<Boolean> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return isInMultiWindowMode();
        }
    }

    boolean isInPictureInPictureMode(final CallFun0<Boolean> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return isInPictureInPictureMode();
        }
    }

    boolean isLocalVoiceInteractionSupported(final CallFun0<Boolean> superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return isLocalVoiceInteractionSupported();
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

    boolean moveDatabaseFrom(final CallFun2<Boolean, Context, String> superCall,
            final Context sourceContext, final String name) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return moveDatabaseFrom(sourceContext, name);
        }
    }

    boolean moveSharedPreferencesFrom(final CallFun2<Boolean, Context, String> superCall,
            final Context sourceContext, final String name) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return moveSharedPreferencesFrom(sourceContext, name);
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

    void onLocalVoiceInteractionStarted(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onLocalVoiceInteractionStarted();
        }
    }

    void onLocalVoiceInteractionStopped(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onLocalVoiceInteractionStopped();
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

    void onProvideKeyboardShortcuts(
            final CallVoid3<List<KeyboardShortcutGroup>, Menu, Integer> superCall,
            final List<KeyboardShortcutGroup> data, final Menu menu, final int deviceId) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            onProvideKeyboardShortcuts(data, menu, deviceId);
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

    void putExtraData(final CallVoid1<SupportActivity.ExtraData> superCall,
            final SupportActivity.ExtraData extraData) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            putExtraData(extraData);
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

    DragAndDropPermissions requestDragAndDropPermissions(
            final CallFun1<DragAndDropPermissions, DragEvent> superCall, final DragEvent event) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            return requestDragAndDropPermissions(event);
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

    void setVrModeEnabled(final CallVoid2<Boolean, ComponentName> superCall, final boolean enabled,
            final ComponentName requestedComponent) throws PackageManager.NameNotFoundException {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            setVrModeEnabled(enabled, requestedComponent);
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

    void startLocalVoiceInteraction(final CallVoid1<Bundle> superCall,
            final Bundle privateOptions) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            startLocalVoiceInteraction(privateOptions);
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

    void stopLocalVoiceInteraction(final CallVoid0 superCall) {
        synchronized (mSuperListeners) {
            mSuperListeners.push(superCall);
            stopLocalVoiceInteraction();
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