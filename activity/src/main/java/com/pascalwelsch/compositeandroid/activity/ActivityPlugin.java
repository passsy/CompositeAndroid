
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
    
    public void onCreate(@Nullable final Bundle savedInstanceState)  {
        verifyMethodCalledFromDelegate("onCreate(Bundle)");
        mSuperListeners.peek().call(savedInstanceState);
    }
    
    public void setTheme(@StyleRes final int resid)  {
        verifyMethodCalledFromDelegate("setTheme(int)");
        mSuperListeners.peek().call(resid);
    }
    
    public void onPostCreate(@Nullable final Bundle savedInstanceState)  {
        verifyMethodCalledFromDelegate("onPostCreate(Bundle)");
        mSuperListeners.peek().call(savedInstanceState);
    }
    
    public ActionBar getSupportActionBar() {
        verifyMethodCalledFromDelegate("getSupportActionBar()");
        return (ActionBar) mSuperListeners.peek().call();
    }
    
    public void setSupportActionBar(@Nullable final android.support.v7.widget.Toolbar toolbar)  {
        verifyMethodCalledFromDelegate("setSupportActionBar(android.support.v7.widget.Toolbar)");
        mSuperListeners.peek().call(toolbar);
    }
    
    public MenuInflater getMenuInflater() {
        verifyMethodCalledFromDelegate("getMenuInflater()");
        return (MenuInflater) mSuperListeners.peek().call();
    }
    
    public void setContentView(@LayoutRes final int layoutResID)  {
        verifyMethodCalledFromDelegate("setContentView(int)");
        mSuperListeners.peek().call(layoutResID);
    }
    
    public void setContentView(final View view)  {
        verifyMethodCalledFromDelegate("setContentView(View)");
        mSuperListeners.peek().call(view);
    }
    
    public void setContentView(final View view, final ViewGroup.LayoutParams params)  {
        verifyMethodCalledFromDelegate("setContentView(View, ViewGroup.LayoutParams)");
        mSuperListeners.peek().call(view, params);
    }
    
    public void addContentView(final View view, final ViewGroup.LayoutParams params)  {
        verifyMethodCalledFromDelegate("addContentView(View, ViewGroup.LayoutParams)");
        mSuperListeners.peek().call(view, params);
    }
    
    public void onConfigurationChanged(final Configuration newConfig)  {
        verifyMethodCalledFromDelegate("onConfigurationChanged(Configuration)");
        mSuperListeners.peek().call(newConfig);
    }
    
    public void onStop()  {
        verifyMethodCalledFromDelegate("onStop()");
        mSuperListeners.peek().call();
    }
    
    public void onPostResume()  {
        verifyMethodCalledFromDelegate("onPostResume()");
        mSuperListeners.peek().call();
    }
    
    public View findViewById(@IdRes final int id) {
        verifyMethodCalledFromDelegate("findViewById(int)");
        return (View) mSuperListeners.peek().call(id);
    }
    
    public void onDestroy()  {
        verifyMethodCalledFromDelegate("onDestroy()");
        mSuperListeners.peek().call();
    }
    
    public void onTitleChanged(final CharSequence title, final int color)  {
        verifyMethodCalledFromDelegate("onTitleChanged(CharSequence, int)");
        mSuperListeners.peek().call(title, color);
    }
    
    public boolean supportRequestWindowFeature(final int featureId) {
        verifyMethodCalledFromDelegate("supportRequestWindowFeature(int)");
        return (Boolean) mSuperListeners.peek().call(featureId);
    }
    
    public void supportInvalidateOptionsMenu()  {
        verifyMethodCalledFromDelegate("supportInvalidateOptionsMenu()");
        mSuperListeners.peek().call();
    }
    
    public void invalidateOptionsMenu()  {
        verifyMethodCalledFromDelegate("invalidateOptionsMenu()");
        mSuperListeners.peek().call();
    }
    
    public void onSupportActionModeStarted(@NonNull final ActionMode mode)  {
        verifyMethodCalledFromDelegate("onSupportActionModeStarted(ActionMode)");
        mSuperListeners.peek().call(mode);
    }
    
    public void onSupportActionModeFinished(@NonNull final ActionMode mode)  {
        verifyMethodCalledFromDelegate("onSupportActionModeFinished(ActionMode)");
        mSuperListeners.peek().call(mode);
    }
    
    public ActionMode onWindowStartingSupportActionMode(             @NonNull final ActionMode.Callback callback) {
        verifyMethodCalledFromDelegate("onWindowStartingSupportActionMode(ActionMode.Callback)");
        return (ActionMode) mSuperListeners.peek().call(callback);
    }
    
    public ActionMode startSupportActionMode(@NonNull final ActionMode.Callback callback) {
        verifyMethodCalledFromDelegate("startSupportActionMode(ActionMode.Callback)");
        return (ActionMode) mSuperListeners.peek().call(callback);
    }
    
    public void setSupportProgressBarVisibility(final boolean visible)  {
        verifyMethodCalledFromDelegate("setSupportProgressBarVisibility(boolean)");
        mSuperListeners.peek().call(visible);
    }
    
    public void setSupportProgressBarIndeterminateVisibility(final boolean visible)  {
        verifyMethodCalledFromDelegate("setSupportProgressBarIndeterminateVisibility(boolean)");
        mSuperListeners.peek().call(visible);
    }
    
    public void setSupportProgressBarIndeterminate(final boolean indeterminate)  {
        verifyMethodCalledFromDelegate("setSupportProgressBarIndeterminate(boolean)");
        mSuperListeners.peek().call(indeterminate);
    }
    
    public void setSupportProgress(final int progress)  {
        verifyMethodCalledFromDelegate("setSupportProgress(int)");
        mSuperListeners.peek().call(progress);
    }
    
    public void onCreateSupportNavigateUpTaskStack(             @NonNull final android.support.v4.app.TaskStackBuilder builder)  {
        verifyMethodCalledFromDelegate("onCreateSupportNavigateUpTaskStack(android.support.v4.app.TaskStackBuilder)");
        mSuperListeners.peek().call(builder);
    }
    
    public void onPrepareSupportNavigateUpTaskStack(             @NonNull final android.support.v4.app.TaskStackBuilder builder)  {
        verifyMethodCalledFromDelegate("onPrepareSupportNavigateUpTaskStack(android.support.v4.app.TaskStackBuilder)");
        mSuperListeners.peek().call(builder);
    }
    
    public boolean onSupportNavigateUp() {
        verifyMethodCalledFromDelegate("onSupportNavigateUp()");
        return (Boolean) mSuperListeners.peek().call();
    }
    
    public Intent getSupportParentActivityIntent() {
        verifyMethodCalledFromDelegate("getSupportParentActivityIntent()");
        return (Intent) mSuperListeners.peek().call();
    }
    
    public boolean supportShouldUpRecreateTask(@NonNull final Intent targetIntent) {
        verifyMethodCalledFromDelegate("supportShouldUpRecreateTask(Intent)");
        return (Boolean) mSuperListeners.peek().call(targetIntent);
    }
    
    public void supportNavigateUpTo(@NonNull final Intent upIntent)  {
        verifyMethodCalledFromDelegate("supportNavigateUpTo(Intent)");
        mSuperListeners.peek().call(upIntent);
    }
    
    public void onContentChanged()  {
        verifyMethodCalledFromDelegate("onContentChanged()");
        mSuperListeners.peek().call();
    }
    
    public void onSupportContentChanged()  {
        verifyMethodCalledFromDelegate("onSupportContentChanged()");
        mSuperListeners.peek().call();
    }
    
    public ActionBarDrawerToggle.Delegate getDrawerToggleDelegate() {
        verifyMethodCalledFromDelegate("getDrawerToggleDelegate()");
        return (ActionBarDrawerToggle.Delegate) mSuperListeners.peek().call();
    }
    
    public boolean onMenuOpened(final int featureId, final Menu menu) {
        verifyMethodCalledFromDelegate("onMenuOpened(int, Menu)");
        return (Boolean) mSuperListeners.peek().call(featureId, menu);
    }
    
    public void onPanelClosed(final int featureId, final Menu menu)  {
        verifyMethodCalledFromDelegate("onPanelClosed(int, Menu)");
        mSuperListeners.peek().call(featureId, menu);
    }
    
    public void onSaveInstanceState(final Bundle outState)  {
        verifyMethodCalledFromDelegate("onSaveInstanceState(Bundle)");
        mSuperListeners.peek().call(outState);
    }
    
    public AppCompatDelegate getDelegate() {
        verifyMethodCalledFromDelegate("getDelegate()");
        return (AppCompatDelegate) mSuperListeners.peek().call();
    }
    
    public boolean dispatchKeyEvent(final KeyEvent event) {
        verifyMethodCalledFromDelegate("dispatchKeyEvent(KeyEvent)");
        return (Boolean) mSuperListeners.peek().call(event);
    }
    
    public void onActivityResult(final int requestCode, final int resultCode,             final Intent data)  {
        verifyMethodCalledFromDelegate("onActivityResult(int, int, Intent)");
        mSuperListeners.peek().call(requestCode, resultCode, data);
    }
    
    public void onBackPressed()  {
        verifyMethodCalledFromDelegate("onBackPressed()");
        mSuperListeners.peek().call();
    }
    
    public void supportFinishAfterTransition()  {
        verifyMethodCalledFromDelegate("supportFinishAfterTransition()");
        mSuperListeners.peek().call();
    }
    
    public void setEnterSharedElementCallback(final SharedElementCallback callback)  {
        verifyMethodCalledFromDelegate("setEnterSharedElementCallback(SharedElementCallback)");
        mSuperListeners.peek().call(callback);
    }
    
    public void setExitSharedElementCallback(final SharedElementCallback listener)  {
        verifyMethodCalledFromDelegate("setExitSharedElementCallback(SharedElementCallback)");
        mSuperListeners.peek().call(listener);
    }
    
    public void supportPostponeEnterTransition()  {
        verifyMethodCalledFromDelegate("supportPostponeEnterTransition()");
        mSuperListeners.peek().call();
    }
    
    public void supportStartPostponedEnterTransition()  {
        verifyMethodCalledFromDelegate("supportStartPostponedEnterTransition()");
        mSuperListeners.peek().call();
    }
    
    public boolean onCreatePanelMenu(final int featureId, final Menu menu) {
        verifyMethodCalledFromDelegate("onCreatePanelMenu(int, Menu)");
        return (Boolean) mSuperListeners.peek().call(featureId, menu);
    }
    
    public boolean onKeyDown(final int keyCode, final KeyEvent event) {
        verifyMethodCalledFromDelegate("onKeyDown(int, KeyEvent)");
        return (Boolean) mSuperListeners.peek().call(keyCode, event);
    }
    
    public void onLowMemory()  {
        verifyMethodCalledFromDelegate("onLowMemory()");
        mSuperListeners.peek().call();
    }
    
    public void onPause()  {
        verifyMethodCalledFromDelegate("onPause()");
        mSuperListeners.peek().call();
    }
    
    public void onNewIntent(final Intent intent)  {
        verifyMethodCalledFromDelegate("onNewIntent(Intent)");
        mSuperListeners.peek().call(intent);
    }
    
    public void onStateNotSaved()  {
        verifyMethodCalledFromDelegate("onStateNotSaved()");
        mSuperListeners.peek().call();
    }
    
    public void onResume()  {
        verifyMethodCalledFromDelegate("onResume()");
        mSuperListeners.peek().call();
    }
    
    public void onResumeFragments()  {
        verifyMethodCalledFromDelegate("onResumeFragments()");
        mSuperListeners.peek().call();
    }
    
    public boolean onPreparePanel(final int featureId, final View view, final Menu menu) {
        verifyMethodCalledFromDelegate("onPreparePanel(int, View, Menu)");
        return (Boolean) mSuperListeners.peek().call(featureId, view, menu);
    }
    
    public boolean onPrepareOptionsPanel(final View view, final Menu menu) {
        verifyMethodCalledFromDelegate("onPrepareOptionsPanel(View, Menu)");
        return (Boolean) mSuperListeners.peek().call(view, menu);
    }
    
    public void onStart()  {
        verifyMethodCalledFromDelegate("onStart()");
        mSuperListeners.peek().call();
    }
    
    public void dump(final String prefix, final FileDescriptor fd, final PrintWriter writer,             final String[] args)  {
        verifyMethodCalledFromDelegate("dump(String, FileDescriptor, PrintWriter, String[])");
        mSuperListeners.peek().call(prefix, fd, writer, args);
    }
    
    public void onAttachFragment(final Fragment fragment)  {
        verifyMethodCalledFromDelegate("onAttachFragment(Fragment)");
        mSuperListeners.peek().call(fragment);
    }
    
    public FragmentManager getSupportFragmentManager() {
        verifyMethodCalledFromDelegate("getSupportFragmentManager()");
        return (FragmentManager) mSuperListeners.peek().call();
    }
    
    public LoaderManager getSupportLoaderManager() {
        verifyMethodCalledFromDelegate("getSupportLoaderManager()");
        return (LoaderManager) mSuperListeners.peek().call();
    }
    
    public void startActivityForResult(final Intent intent, final int requestCode)  {
        verifyMethodCalledFromDelegate("startActivityForResult(Intent, int)");
        mSuperListeners.peek().call(intent, requestCode);
    }
    
    public void onRequestPermissionsResult(final int requestCode,             @NonNull final String[] permissions,             @NonNull final int[] grantResults)  {
        verifyMethodCalledFromDelegate("onRequestPermissionsResult(int, String[], int[])");
        mSuperListeners.peek().call(requestCode, permissions, grantResults);
    }
    
    public void startActivityFromFragment(final Fragment fragment, final Intent intent,             final int requestCode)  {
        verifyMethodCalledFromDelegate("startActivityFromFragment(Fragment, Intent, int)");
        mSuperListeners.peek().call(fragment, intent, requestCode);
    }
    
    public void startActivityFromFragment(final Fragment fragment, final Intent intent,             final int requestCode,             @Nullable final Bundle options)  {
        verifyMethodCalledFromDelegate("startActivityFromFragment(Fragment, Intent, int, Bundle)");
        mSuperListeners.peek().call(fragment, intent, requestCode, options);
    }
    
    public View onCreateView(final View parent, final String name, final Context context,             final AttributeSet attrs) {
        verifyMethodCalledFromDelegate("onCreateView(View, String, Context, AttributeSet)");
        return (View) mSuperListeners.peek().call(parent, name, context, attrs);
    }
    
    public View onCreateView(final String name, final Context context, final AttributeSet attrs) {
        verifyMethodCalledFromDelegate("onCreateView(String, Context, AttributeSet)");
        return (View) mSuperListeners.peek().call(name, context, attrs);
    }
    
    public Intent getIntent() {
        verifyMethodCalledFromDelegate("getIntent()");
        return (Intent) mSuperListeners.peek().call();
    }
    
    public void setIntent(final Intent newIntent)  {
        verifyMethodCalledFromDelegate("setIntent(Intent)");
        mSuperListeners.peek().call(newIntent);
    }
    
    public WindowManager getWindowManager() {
        verifyMethodCalledFromDelegate("getWindowManager()");
        return (WindowManager) mSuperListeners.peek().call();
    }
    
    public Window getWindow() {
        verifyMethodCalledFromDelegate("getWindow()");
        return (Window) mSuperListeners.peek().call();
    }
    
    public android.app.LoaderManager getLoaderManager() {
        verifyMethodCalledFromDelegate("getLoaderManager()");
        return (android.app.LoaderManager) mSuperListeners.peek().call();
    }
    
    public View getCurrentFocus() {
        verifyMethodCalledFromDelegate("getCurrentFocus()");
        return (View) mSuperListeners.peek().call();
    }
    
    public void onCreate(final Bundle savedInstanceState, final PersistableBundle persistentState)  {
        verifyMethodCalledFromDelegate("onCreate(Bundle, PersistableBundle)");
        mSuperListeners.peek().call(savedInstanceState, persistentState);
    }
    
    public void onRestoreInstanceState(final Bundle savedInstanceState)  {
        verifyMethodCalledFromDelegate("onRestoreInstanceState(Bundle)");
        mSuperListeners.peek().call(savedInstanceState);
    }
    
    public void onRestoreInstanceState(final Bundle savedInstanceState,             final PersistableBundle persistentState)  {
        verifyMethodCalledFromDelegate("onRestoreInstanceState(Bundle, PersistableBundle)");
        mSuperListeners.peek().call(savedInstanceState, persistentState);
    }
    
    public void onPostCreate(final Bundle savedInstanceState,             final PersistableBundle persistentState)  {
        verifyMethodCalledFromDelegate("onPostCreate(Bundle, PersistableBundle)");
        mSuperListeners.peek().call(savedInstanceState, persistentState);
    }
    
    public void onRestart()  {
        verifyMethodCalledFromDelegate("onRestart()");
        mSuperListeners.peek().call();
    }
    
    public boolean isVoiceInteraction() {
        verifyMethodCalledFromDelegate("isVoiceInteraction()");
        return (Boolean) mSuperListeners.peek().call();
    }
    
    public boolean isVoiceInteractionRoot() {
        verifyMethodCalledFromDelegate("isVoiceInteractionRoot()");
        return (Boolean) mSuperListeners.peek().call();
    }
    
    public VoiceInteractor getVoiceInteractor() {
        verifyMethodCalledFromDelegate("getVoiceInteractor()");
        return (VoiceInteractor) mSuperListeners.peek().call();
    }
    
    public void onSaveInstanceState(final Bundle outState,             final PersistableBundle outPersistentState)  {
        verifyMethodCalledFromDelegate("onSaveInstanceState(Bundle, PersistableBundle)");
        mSuperListeners.peek().call(outState, outPersistentState);
    }
    
    public void onUserLeaveHint()  {
        verifyMethodCalledFromDelegate("onUserLeaveHint()");
        mSuperListeners.peek().call();
    }
    
    public boolean onCreateThumbnail(final Bitmap outBitmap, final Canvas canvas) {
        verifyMethodCalledFromDelegate("onCreateThumbnail(Bitmap, Canvas)");
        return (Boolean) mSuperListeners.peek().call(outBitmap, canvas);
    }
    
    public CharSequence onCreateDescription() {
        verifyMethodCalledFromDelegate("onCreateDescription()");
        return (CharSequence) mSuperListeners.peek().call();
    }
    
    public void onProvideAssistData(final Bundle data)  {
        verifyMethodCalledFromDelegate("onProvideAssistData(Bundle)");
        mSuperListeners.peek().call(data);
    }
    
    public void onProvideAssistContent(final AssistContent outContent)  {
        verifyMethodCalledFromDelegate("onProvideAssistContent(AssistContent)");
        mSuperListeners.peek().call(outContent);
    }
    
    public boolean showAssist(final Bundle args) {
        verifyMethodCalledFromDelegate("showAssist(Bundle)");
        return (Boolean) mSuperListeners.peek().call(args);
    }
    
    public void reportFullyDrawn()  {
        verifyMethodCalledFromDelegate("reportFullyDrawn()");
        mSuperListeners.peek().call();
    }
    
    public int getChangingConfigurations() {
        verifyMethodCalledFromDelegate("getChangingConfigurations()");
        return (Integer) mSuperListeners.peek().call();
    }
    
    public void onTrimMemory(final int level)  {
        verifyMethodCalledFromDelegate("onTrimMemory(int)");
        mSuperListeners.peek().call(level);
    }
    
    public android.app.FragmentManager getFragmentManager() {
        verifyMethodCalledFromDelegate("getFragmentManager()");
        return (android.app.FragmentManager) mSuperListeners.peek().call();
    }
    
    public void onAttachFragment(final android.app.Fragment fragment)  {
        verifyMethodCalledFromDelegate("onAttachFragment(android.app.Fragment)");
        mSuperListeners.peek().call(fragment);
    }
    
    public void startManagingCursor(final Cursor c)  {
        verifyMethodCalledFromDelegate("startManagingCursor(Cursor)");
        mSuperListeners.peek().call(c);
    }
    
    public void stopManagingCursor(final Cursor c)  {
        verifyMethodCalledFromDelegate("stopManagingCursor(Cursor)");
        mSuperListeners.peek().call(c);
    }
    
    public android.app.ActionBar getActionBar() {
        verifyMethodCalledFromDelegate("getActionBar()");
        return (android.app.ActionBar) mSuperListeners.peek().call();
    }
    
    public void setActionBar(final Toolbar toolbar)  {
        verifyMethodCalledFromDelegate("setActionBar(Toolbar)");
        mSuperListeners.peek().call(toolbar);
    }
    
    public TransitionManager getContentTransitionManager() {
        verifyMethodCalledFromDelegate("getContentTransitionManager()");
        return (TransitionManager) mSuperListeners.peek().call();
    }
    
    public void setContentTransitionManager(final TransitionManager tm)  {
        verifyMethodCalledFromDelegate("setContentTransitionManager(TransitionManager)");
        mSuperListeners.peek().call(tm);
    }
    
    public Scene getContentScene() {
        verifyMethodCalledFromDelegate("getContentScene()");
        return (Scene) mSuperListeners.peek().call();
    }
    
    public void setFinishOnTouchOutside(final boolean finish)  {
        verifyMethodCalledFromDelegate("setFinishOnTouchOutside(boolean)");
        mSuperListeners.peek().call(finish);
    }
    
    public boolean onKeyLongPress(final int keyCode, final KeyEvent event) {
        verifyMethodCalledFromDelegate("onKeyLongPress(int, KeyEvent)");
        return (Boolean) mSuperListeners.peek().call(keyCode, event);
    }
    
    public boolean onKeyUp(final int keyCode, final KeyEvent event) {
        verifyMethodCalledFromDelegate("onKeyUp(int, KeyEvent)");
        return (Boolean) mSuperListeners.peek().call(keyCode, event);
    }
    
    public boolean onKeyMultiple(final int keyCode, final int repeatCount, final KeyEvent event) {
        verifyMethodCalledFromDelegate("onKeyMultiple(int, int, KeyEvent)");
        return (Boolean) mSuperListeners.peek().call(keyCode, repeatCount, event);
    }
    
    public boolean onKeyShortcut(final int keyCode, final KeyEvent event) {
        verifyMethodCalledFromDelegate("onKeyShortcut(int, KeyEvent)");
        return (Boolean) mSuperListeners.peek().call(keyCode, event);
    }
    
    public boolean onTouchEvent(final MotionEvent event) {
        verifyMethodCalledFromDelegate("onTouchEvent(MotionEvent)");
        return (Boolean) mSuperListeners.peek().call(event);
    }
    
    public boolean onTrackballEvent(final MotionEvent event) {
        verifyMethodCalledFromDelegate("onTrackballEvent(MotionEvent)");
        return (Boolean) mSuperListeners.peek().call(event);
    }
    
    public boolean onGenericMotionEvent(final MotionEvent event) {
        verifyMethodCalledFromDelegate("onGenericMotionEvent(MotionEvent)");
        return (Boolean) mSuperListeners.peek().call(event);
    }
    
    public void onUserInteraction()  {
        verifyMethodCalledFromDelegate("onUserInteraction()");
        mSuperListeners.peek().call();
    }
    
    public void onWindowAttributesChanged(final WindowManager.LayoutParams params)  {
        verifyMethodCalledFromDelegate("onWindowAttributesChanged(WindowManager.LayoutParams)");
        mSuperListeners.peek().call(params);
    }
    
    public void onWindowFocusChanged(final boolean hasFocus)  {
        verifyMethodCalledFromDelegate("onWindowFocusChanged(boolean)");
        mSuperListeners.peek().call(hasFocus);
    }
    
    public void onAttachedToWindow()  {
        verifyMethodCalledFromDelegate("onAttachedToWindow()");
        mSuperListeners.peek().call();
    }
    
    public void onDetachedFromWindow()  {
        verifyMethodCalledFromDelegate("onDetachedFromWindow()");
        mSuperListeners.peek().call();
    }
    
    public boolean hasWindowFocus() {
        verifyMethodCalledFromDelegate("hasWindowFocus()");
        return (Boolean) mSuperListeners.peek().call();
    }
    
    public boolean dispatchKeyShortcutEvent(final KeyEvent event) {
        verifyMethodCalledFromDelegate("dispatchKeyShortcutEvent(KeyEvent)");
        return (Boolean) mSuperListeners.peek().call(event);
    }
    
    public boolean dispatchTouchEvent(final MotionEvent ev) {
        verifyMethodCalledFromDelegate("dispatchTouchEvent(MotionEvent)");
        return (Boolean) mSuperListeners.peek().call(ev);
    }
    
    public boolean dispatchTrackballEvent(final MotionEvent ev) {
        verifyMethodCalledFromDelegate("dispatchTrackballEvent(MotionEvent)");
        return (Boolean) mSuperListeners.peek().call(ev);
    }
    
    public boolean dispatchGenericMotionEvent(final MotionEvent ev) {
        verifyMethodCalledFromDelegate("dispatchGenericMotionEvent(MotionEvent)");
        return (Boolean) mSuperListeners.peek().call(ev);
    }
    
    public boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent event) {
        verifyMethodCalledFromDelegate("dispatchPopulateAccessibilityEvent(AccessibilityEvent)");
        return (Boolean) mSuperListeners.peek().call(event);
    }
    
    public View onCreatePanelView(final int featureId) {
        verifyMethodCalledFromDelegate("onCreatePanelView(int)");
        return (View) mSuperListeners.peek().call(featureId);
    }
    
    public boolean onCreateOptionsMenu(final Menu menu) {
        verifyMethodCalledFromDelegate("onCreateOptionsMenu(Menu)");
        return (Boolean) mSuperListeners.peek().call(menu);
    }
    
    public boolean onPrepareOptionsMenu(final Menu menu) {
        verifyMethodCalledFromDelegate("onPrepareOptionsMenu(Menu)");
        return (Boolean) mSuperListeners.peek().call(menu);
    }
    
    public boolean onOptionsItemSelected(final MenuItem item) {
        verifyMethodCalledFromDelegate("onOptionsItemSelected(MenuItem)");
        return (Boolean) mSuperListeners.peek().call(item);
    }
    
    public boolean onNavigateUp() {
        verifyMethodCalledFromDelegate("onNavigateUp()");
        return (Boolean) mSuperListeners.peek().call();
    }
    
    public boolean onNavigateUpFromChild(final Activity child) {
        verifyMethodCalledFromDelegate("onNavigateUpFromChild(Activity)");
        return (Boolean) mSuperListeners.peek().call(child);
    }
    
    public void onCreateNavigateUpTaskStack(final TaskStackBuilder builder)  {
        verifyMethodCalledFromDelegate("onCreateNavigateUpTaskStack(TaskStackBuilder)");
        mSuperListeners.peek().call(builder);
    }
    
    public void onPrepareNavigateUpTaskStack(final TaskStackBuilder builder)  {
        verifyMethodCalledFromDelegate("onPrepareNavigateUpTaskStack(TaskStackBuilder)");
        mSuperListeners.peek().call(builder);
    }
    
    public void onOptionsMenuClosed(final Menu menu)  {
        verifyMethodCalledFromDelegate("onOptionsMenuClosed(Menu)");
        mSuperListeners.peek().call(menu);
    }
    
    public void openOptionsMenu()  {
        verifyMethodCalledFromDelegate("openOptionsMenu()");
        mSuperListeners.peek().call();
    }
    
    public void closeOptionsMenu()  {
        verifyMethodCalledFromDelegate("closeOptionsMenu()");
        mSuperListeners.peek().call();
    }
    
    public void onCreateContextMenu(final ContextMenu menu, final View v,             final ContextMenu.ContextMenuInfo menuInfo)  {
        verifyMethodCalledFromDelegate("onCreateContextMenu(ContextMenu, View, ContextMenu.ContextMenuInfo)");
        mSuperListeners.peek().call(menu, v, menuInfo);
    }
    
    public void registerForContextMenu(final View view)  {
        verifyMethodCalledFromDelegate("registerForContextMenu(View)");
        mSuperListeners.peek().call(view);
    }
    
    public void unregisterForContextMenu(final View view)  {
        verifyMethodCalledFromDelegate("unregisterForContextMenu(View)");
        mSuperListeners.peek().call(view);
    }
    
    public void openContextMenu(final View view)  {
        verifyMethodCalledFromDelegate("openContextMenu(View)");
        mSuperListeners.peek().call(view);
    }
    
    public void closeContextMenu()  {
        verifyMethodCalledFromDelegate("closeContextMenu()");
        mSuperListeners.peek().call();
    }
    
    public boolean onContextItemSelected(final MenuItem item) {
        verifyMethodCalledFromDelegate("onContextItemSelected(MenuItem)");
        return (Boolean) mSuperListeners.peek().call(item);
    }
    
    public void onContextMenuClosed(final Menu menu)  {
        verifyMethodCalledFromDelegate("onContextMenuClosed(Menu)");
        mSuperListeners.peek().call(menu);
    }
    
    public Dialog onCreateDialog(final int id) {
        verifyMethodCalledFromDelegate("onCreateDialog(int)");
        return (Dialog) mSuperListeners.peek().call(id);
    }
    
    public Dialog onCreateDialog(final int id, final Bundle args) {
        verifyMethodCalledFromDelegate("onCreateDialog(int, Bundle)");
        return (Dialog) mSuperListeners.peek().call(id, args);
    }
    
    public void onPrepareDialog(final int id, final Dialog dialog)  {
        verifyMethodCalledFromDelegate("onPrepareDialog(int, Dialog)");
        mSuperListeners.peek().call(id, dialog);
    }
    
    public void onPrepareDialog(final int id, final Dialog dialog, final Bundle args)  {
        verifyMethodCalledFromDelegate("onPrepareDialog(int, Dialog, Bundle)");
        mSuperListeners.peek().call(id, dialog, args);
    }
    
    public boolean onSearchRequested(final SearchEvent searchEvent) {
        verifyMethodCalledFromDelegate("onSearchRequested(SearchEvent)");
        return (Boolean) mSuperListeners.peek().call(searchEvent);
    }
    
    public boolean onSearchRequested() {
        verifyMethodCalledFromDelegate("onSearchRequested()");
        return (Boolean) mSuperListeners.peek().call();
    }
    
    public void startSearch(final String initialQuery, final boolean selectInitialQuery,             final Bundle appSearchData,             final boolean globalSearch)  {
        verifyMethodCalledFromDelegate("startSearch(String, boolean, Bundle, boolean)");
        mSuperListeners.peek().call(initialQuery, selectInitialQuery, appSearchData, globalSearch);
    }
    
    public void triggerSearch(final String query, final Bundle appSearchData)  {
        verifyMethodCalledFromDelegate("triggerSearch(String, Bundle)");
        mSuperListeners.peek().call(query, appSearchData);
    }
    
    public void takeKeyEvents(final boolean get)  {
        verifyMethodCalledFromDelegate("takeKeyEvents(boolean)");
        mSuperListeners.peek().call(get);
    }
    
    public LayoutInflater getLayoutInflater() {
        verifyMethodCalledFromDelegate("getLayoutInflater()");
        return (LayoutInflater) mSuperListeners.peek().call();
    }
    
    public void onApplyThemeResource(final Resources.Theme theme, final int resid,             final boolean first)  {
        verifyMethodCalledFromDelegate("onApplyThemeResource(Resources.Theme, int, boolean)");
        mSuperListeners.peek().call(theme, resid, first);
    }
    
    public boolean shouldShowRequestPermissionRationale(@NonNull final String permission) {
        verifyMethodCalledFromDelegate("shouldShowRequestPermissionRationale(String)");
        return (Boolean) mSuperListeners.peek().call(permission);
    }
    
    public void startActivityForResult(final Intent intent, final int requestCode,             final Bundle options)  {
        verifyMethodCalledFromDelegate("startActivityForResult(Intent, int, Bundle)");
        mSuperListeners.peek().call(intent, requestCode, options);
    }
    
    public void startIntentSenderForResult(final IntentSender intent, final int requestCode,             final Intent fillInIntent, final int flagsMask, final int flagsValues,             final int extraFlags)              throws IntentSender.SendIntentException {
        verifyMethodCalledFromDelegate("startIntentSenderForResult(IntentSender, int, Intent, int, int, int)");
        mSuperListeners.peek().call(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }
    
    public void startIntentSenderForResult(final IntentSender intent, final int requestCode,             final Intent fillInIntent, final int flagsMask, final int flagsValues,             final int extraFlags, final Bundle options)              throws IntentSender.SendIntentException {
        verifyMethodCalledFromDelegate("startIntentSenderForResult(IntentSender, int, Intent, int, int, int, Bundle)");
        mSuperListeners.peek().call(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }
    
    public void startActivity(final Intent intent)  {
        verifyMethodCalledFromDelegate("startActivity(Intent)");
        mSuperListeners.peek().call(intent);
    }
    
    public void startActivity(final Intent intent, final Bundle options)  {
        verifyMethodCalledFromDelegate("startActivity(Intent, Bundle)");
        mSuperListeners.peek().call(intent, options);
    }
    
    public void startActivities(final Intent[] intents)  {
        verifyMethodCalledFromDelegate("startActivities(Intent[])");
        mSuperListeners.peek().call(intents);
    }
    
    public void startActivities(final Intent[] intents, final Bundle options)  {
        verifyMethodCalledFromDelegate("startActivities(Intent[], Bundle)");
        mSuperListeners.peek().call(intents, options);
    }
    
    public void startIntentSender(final IntentSender intent, final Intent fillInIntent,             final int flagsMask,             final int flagsValues, final int extraFlags)  throws IntentSender.SendIntentException {
        verifyMethodCalledFromDelegate("startIntentSender(IntentSender, Intent, int, int, int)");
        mSuperListeners.peek().call(intent, fillInIntent, flagsMask, flagsValues, extraFlags);
    }
    
    public void startIntentSender(final IntentSender intent, final Intent fillInIntent,             final int flagsMask,             final int flagsValues, final int extraFlags, final Bundle options)              throws IntentSender.SendIntentException {
        verifyMethodCalledFromDelegate("startIntentSender(IntentSender, Intent, int, int, int, Bundle)");
        mSuperListeners.peek().call(intent, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }
    
    public boolean startActivityIfNeeded(@NonNull final Intent intent, final int requestCode) {
        verifyMethodCalledFromDelegate("startActivityIfNeeded(Intent, int)");
        return (Boolean) mSuperListeners.peek().call(intent, requestCode);
    }
    
    public boolean startActivityIfNeeded(@NonNull final Intent intent, final int requestCode,             final Bundle options) {
        verifyMethodCalledFromDelegate("startActivityIfNeeded(Intent, int, Bundle)");
        return (Boolean) mSuperListeners.peek().call(intent, requestCode, options);
    }
    
    public boolean startNextMatchingActivity(@NonNull final Intent intent) {
        verifyMethodCalledFromDelegate("startNextMatchingActivity(Intent)");
        return (Boolean) mSuperListeners.peek().call(intent);
    }
    
    public boolean startNextMatchingActivity(@NonNull final Intent intent, final Bundle options) {
        verifyMethodCalledFromDelegate("startNextMatchingActivity(Intent, Bundle)");
        return (Boolean) mSuperListeners.peek().call(intent, options);
    }
    
    public void startActivityFromChild(@NonNull final Activity child, final Intent intent,             final int requestCode)  {
        verifyMethodCalledFromDelegate("startActivityFromChild(Activity, Intent, int)");
        mSuperListeners.peek().call(child, intent, requestCode);
    }
    
    public void startActivityFromChild(@NonNull final Activity child, final Intent intent,             final int requestCode,             final Bundle options)  {
        verifyMethodCalledFromDelegate("startActivityFromChild(Activity, Intent, int, Bundle)");
        mSuperListeners.peek().call(child, intent, requestCode, options);
    }
    
    public void startActivityFromFragment(@NonNull final android.app.Fragment fragment, final Intent intent,             final int requestCode)  {
        verifyMethodCalledFromDelegate("startActivityFromFragment(android.app.Fragment, Intent, int)");
        mSuperListeners.peek().call(fragment, intent, requestCode);
    }
    
    public void startActivityFromFragment(@NonNull final android.app.Fragment fragment, final Intent intent,             final int requestCode,             final Bundle options)  {
        verifyMethodCalledFromDelegate("startActivityFromFragment(android.app.Fragment, Intent, int, Bundle)");
        mSuperListeners.peek().call(fragment, intent, requestCode, options);
    }
    
    public void startIntentSenderFromChild(final Activity child, final IntentSender intent,             final int requestCode,             final Intent fillInIntent, final int flagsMask, final int flagsValues,             final int extraFlags)              throws IntentSender.SendIntentException {
        verifyMethodCalledFromDelegate("startIntentSenderFromChild(Activity, IntentSender, int, Intent, int, int, int)");
        mSuperListeners.peek().call(child, intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }
    
    public void startIntentSenderFromChild(final Activity child, final IntentSender intent,             final int requestCode,             final Intent fillInIntent, final int flagsMask, final int flagsValues,             final int extraFlags, final Bundle options)              throws IntentSender.SendIntentException {
        verifyMethodCalledFromDelegate("startIntentSenderFromChild(Activity, IntentSender, int, Intent, int, int, int, Bundle)");
        mSuperListeners.peek().call(child, intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }
    
    public void overridePendingTransition(final int enterAnim, final int exitAnim)  {
        verifyMethodCalledFromDelegate("overridePendingTransition(int, int)");
        mSuperListeners.peek().call(enterAnim, exitAnim);
    }
    
    public Uri getReferrer() {
        verifyMethodCalledFromDelegate("getReferrer()");
        return (Uri) mSuperListeners.peek().call();
    }
    
    public Uri onProvideReferrer() {
        verifyMethodCalledFromDelegate("onProvideReferrer()");
        return (Uri) mSuperListeners.peek().call();
    }
    
    public String getCallingPackage() {
        verifyMethodCalledFromDelegate("getCallingPackage()");
        return (String) mSuperListeners.peek().call();
    }
    
    public ComponentName getCallingActivity() {
        verifyMethodCalledFromDelegate("getCallingActivity()");
        return (ComponentName) mSuperListeners.peek().call();
    }
    
    public void setVisible(final boolean visible)  {
        verifyMethodCalledFromDelegate("setVisible(boolean)");
        mSuperListeners.peek().call(visible);
    }
    
    public boolean isFinishing() {
        verifyMethodCalledFromDelegate("isFinishing()");
        return (Boolean) mSuperListeners.peek().call();
    }
    
    public boolean isDestroyed() {
        verifyMethodCalledFromDelegate("isDestroyed()");
        return (Boolean) mSuperListeners.peek().call();
    }
    
    public boolean isChangingConfigurations() {
        verifyMethodCalledFromDelegate("isChangingConfigurations()");
        return (Boolean) mSuperListeners.peek().call();
    }
    
    public void recreate()  {
        verifyMethodCalledFromDelegate("recreate()");
        mSuperListeners.peek().call();
    }
    
    public void finish()  {
        verifyMethodCalledFromDelegate("finish()");
        mSuperListeners.peek().call();
    }
    
    public void finishAffinity()  {
        verifyMethodCalledFromDelegate("finishAffinity()");
        mSuperListeners.peek().call();
    }
    
    public void finishFromChild(final Activity child)  {
        verifyMethodCalledFromDelegate("finishFromChild(Activity)");
        mSuperListeners.peek().call(child);
    }
    
    public void finishAfterTransition()  {
        verifyMethodCalledFromDelegate("finishAfterTransition()");
        mSuperListeners.peek().call();
    }
    
    public void finishActivity(final int requestCode)  {
        verifyMethodCalledFromDelegate("finishActivity(int)");
        mSuperListeners.peek().call(requestCode);
    }
    
    public void finishActivityFromChild(@NonNull final Activity child, final int requestCode)  {
        verifyMethodCalledFromDelegate("finishActivityFromChild(Activity, int)");
        mSuperListeners.peek().call(child, requestCode);
    }
    
    public void finishAndRemoveTask()  {
        verifyMethodCalledFromDelegate("finishAndRemoveTask()");
        mSuperListeners.peek().call();
    }
    
    public boolean releaseInstance() {
        verifyMethodCalledFromDelegate("releaseInstance()");
        return (Boolean) mSuperListeners.peek().call();
    }
    
    public void onActivityReenter(final int resultCode, final Intent data)  {
        verifyMethodCalledFromDelegate("onActivityReenter(int, Intent)");
        mSuperListeners.peek().call(resultCode, data);
    }
    
    public PendingIntent createPendingResult(final int requestCode, @NonNull final Intent data,             final int flags) {
        verifyMethodCalledFromDelegate("createPendingResult(int, Intent, int)");
        return (PendingIntent) mSuperListeners.peek().call(requestCode, data, flags);
    }
    
    public void setRequestedOrientation(final int requestedOrientation)  {
        verifyMethodCalledFromDelegate("setRequestedOrientation(int)");
        mSuperListeners.peek().call(requestedOrientation);
    }
    
    public int getRequestedOrientation() {
        verifyMethodCalledFromDelegate("getRequestedOrientation()");
        return (Integer) mSuperListeners.peek().call();
    }
    
    public int getTaskId() {
        verifyMethodCalledFromDelegate("getTaskId()");
        return (Integer) mSuperListeners.peek().call();
    }
    
    public boolean isTaskRoot() {
        verifyMethodCalledFromDelegate("isTaskRoot()");
        return (Boolean) mSuperListeners.peek().call();
    }
    
    public boolean moveTaskToBack(final boolean nonRoot) {
        verifyMethodCalledFromDelegate("moveTaskToBack(boolean)");
        return (Boolean) mSuperListeners.peek().call(nonRoot);
    }
    
    public String getLocalClassName() {
        verifyMethodCalledFromDelegate("getLocalClassName()");
        return (String) mSuperListeners.peek().call();
    }
    
    public ComponentName getComponentName() {
        verifyMethodCalledFromDelegate("getComponentName()");
        return (ComponentName) mSuperListeners.peek().call();
    }
    
    public SharedPreferences getPreferences(final int mode) {
        verifyMethodCalledFromDelegate("getPreferences(int)");
        return (SharedPreferences) mSuperListeners.peek().call(mode);
    }
    
    public Object getSystemService(@NonNull final String name) {
        verifyMethodCalledFromDelegate("getSystemService(String)");
        return (Object) mSuperListeners.peek().call(name);
    }
    
    public void setTitle(final CharSequence title)  {
        verifyMethodCalledFromDelegate("setTitle(CharSequence)");
        mSuperListeners.peek().call(title);
    }
    
    public void setTitle(final int titleId)  {
        verifyMethodCalledFromDelegate("setTitle(int)");
        mSuperListeners.peek().call(titleId);
    }
    
    public void setTitleColor(final int textColor)  {
        verifyMethodCalledFromDelegate("setTitleColor(int)");
        mSuperListeners.peek().call(textColor);
    }
    
    public void onChildTitleChanged(final Activity childActivity, final CharSequence title)  {
        verifyMethodCalledFromDelegate("onChildTitleChanged(Activity, CharSequence)");
        mSuperListeners.peek().call(childActivity, title);
    }
    
    public void setTaskDescription(final ActivityManager.TaskDescription taskDescription)  {
        verifyMethodCalledFromDelegate("setTaskDescription(ActivityManager.TaskDescription)");
        mSuperListeners.peek().call(taskDescription);
    }
    
    public boolean isImmersive() {
        verifyMethodCalledFromDelegate("isImmersive()");
        return (Boolean) mSuperListeners.peek().call();
    }
    
    public boolean requestVisibleBehind(final boolean visible) {
        verifyMethodCalledFromDelegate("requestVisibleBehind(boolean)");
        return (Boolean) mSuperListeners.peek().call(visible);
    }
    
    public void onVisibleBehindCanceled()  {
        verifyMethodCalledFromDelegate("onVisibleBehindCanceled()");
        mSuperListeners.peek().call();
    }
    
    public void onEnterAnimationComplete()  {
        verifyMethodCalledFromDelegate("onEnterAnimationComplete()");
        mSuperListeners.peek().call();
    }
    
    public void setImmersive(final boolean i)  {
        verifyMethodCalledFromDelegate("setImmersive(boolean)");
        mSuperListeners.peek().call(i);
    }
    
    public android.view.ActionMode startActionMode(             final android.view.ActionMode.Callback callback) {
        verifyMethodCalledFromDelegate("startActionMode(android.view.ActionMode.Callback)");
        return (android.view.ActionMode) mSuperListeners.peek().call(callback);
    }
    
    public android.view.ActionMode startActionMode(final android.view.ActionMode.Callback callback,             final int type) {
        verifyMethodCalledFromDelegate("startActionMode(android.view.ActionMode.Callback, int)");
        return (android.view.ActionMode) mSuperListeners.peek().call(callback, type);
    }
    
    public android.view.ActionMode onWindowStartingActionMode(             final android.view.ActionMode.Callback callback) {
        verifyMethodCalledFromDelegate("onWindowStartingActionMode(android.view.ActionMode.Callback)");
        return (android.view.ActionMode) mSuperListeners.peek().call(callback);
    }
    
    public android.view.ActionMode onWindowStartingActionMode(             final android.view.ActionMode.Callback callback, final int type) {
        verifyMethodCalledFromDelegate("onWindowStartingActionMode(android.view.ActionMode.Callback, int)");
        return (android.view.ActionMode) mSuperListeners.peek().call(callback, type);
    }
    
    public void onActionModeStarted(final android.view.ActionMode mode)  {
        verifyMethodCalledFromDelegate("onActionModeStarted(android.view.ActionMode)");
        mSuperListeners.peek().call(mode);
    }
    
    public void onActionModeFinished(final android.view.ActionMode mode)  {
        verifyMethodCalledFromDelegate("onActionModeFinished(android.view.ActionMode)");
        mSuperListeners.peek().call(mode);
    }
    
    public boolean shouldUpRecreateTask(final Intent targetIntent) {
        verifyMethodCalledFromDelegate("shouldUpRecreateTask(Intent)");
        return (Boolean) mSuperListeners.peek().call(targetIntent);
    }
    
    public boolean navigateUpTo(final Intent upIntent) {
        verifyMethodCalledFromDelegate("navigateUpTo(Intent)");
        return (Boolean) mSuperListeners.peek().call(upIntent);
    }
    
    public boolean navigateUpToFromChild(final Activity child, final Intent upIntent) {
        verifyMethodCalledFromDelegate("navigateUpToFromChild(Activity, Intent)");
        return (Boolean) mSuperListeners.peek().call(child, upIntent);
    }
    
    public Intent getParentActivityIntent() {
        verifyMethodCalledFromDelegate("getParentActivityIntent()");
        return (Intent) mSuperListeners.peek().call();
    }
    
    public void setEnterSharedElementCallback(final android.app.SharedElementCallback callback)  {
        verifyMethodCalledFromDelegate("setEnterSharedElementCallback(android.app.SharedElementCallback)");
        mSuperListeners.peek().call(callback);
    }
    
    public void setExitSharedElementCallback(final android.app.SharedElementCallback callback)  {
        verifyMethodCalledFromDelegate("setExitSharedElementCallback(android.app.SharedElementCallback)");
        mSuperListeners.peek().call(callback);
    }
    
    public void postponeEnterTransition()  {
        verifyMethodCalledFromDelegate("postponeEnterTransition()");
        mSuperListeners.peek().call();
    }
    
    public void startPostponedEnterTransition()  {
        verifyMethodCalledFromDelegate("startPostponedEnterTransition()");
        mSuperListeners.peek().call();
    }
    
    public void startLockTask()  {
        verifyMethodCalledFromDelegate("startLockTask()");
        mSuperListeners.peek().call();
    }
    
    public void stopLockTask()  {
        verifyMethodCalledFromDelegate("stopLockTask()");
        mSuperListeners.peek().call();
    }
    
    public void showLockTaskEscapeMessage()  {
        verifyMethodCalledFromDelegate("showLockTaskEscapeMessage()");
        mSuperListeners.peek().call();
    }
    
    public void attachBaseContext(final Context newBase)  {
        verifyMethodCalledFromDelegate("attachBaseContext(Context)");
        mSuperListeners.peek().call(newBase);
    }
    
    public void applyOverrideConfiguration(final Configuration overrideConfiguration)  {
        verifyMethodCalledFromDelegate("applyOverrideConfiguration(Configuration)");
        mSuperListeners.peek().call(overrideConfiguration);
    }
    
    public Resources getResources() {
        verifyMethodCalledFromDelegate("getResources()");
        return (Resources) mSuperListeners.peek().call();
    }
    
    public Resources.Theme getTheme() {
        verifyMethodCalledFromDelegate("getTheme()");
        return (Resources.Theme) mSuperListeners.peek().call();
    }
    
    public Context getBaseContext() {
        verifyMethodCalledFromDelegate("getBaseContext()");
        return (Context) mSuperListeners.peek().call();
    }
    
    public AssetManager getAssets() {
        verifyMethodCalledFromDelegate("getAssets()");
        return (AssetManager) mSuperListeners.peek().call();
    }
    
    public PackageManager getPackageManager() {
        verifyMethodCalledFromDelegate("getPackageManager()");
        return (PackageManager) mSuperListeners.peek().call();
    }
    
    public ContentResolver getContentResolver() {
        verifyMethodCalledFromDelegate("getContentResolver()");
        return (ContentResolver) mSuperListeners.peek().call();
    }
    
    public Looper getMainLooper() {
        verifyMethodCalledFromDelegate("getMainLooper()");
        return (Looper) mSuperListeners.peek().call();
    }
    
    public Context getApplicationContext() {
        verifyMethodCalledFromDelegate("getApplicationContext()");
        return (Context) mSuperListeners.peek().call();
    }
    
    public ClassLoader getClassLoader() {
        verifyMethodCalledFromDelegate("getClassLoader()");
        return (ClassLoader) mSuperListeners.peek().call();
    }
    
    public String getPackageName() {
        verifyMethodCalledFromDelegate("getPackageName()");
        return (String) mSuperListeners.peek().call();
    }
    
    public ApplicationInfo getApplicationInfo() {
        verifyMethodCalledFromDelegate("getApplicationInfo()");
        return (ApplicationInfo) mSuperListeners.peek().call();
    }
    
    public String getPackageResourcePath() {
        verifyMethodCalledFromDelegate("getPackageResourcePath()");
        return (String) mSuperListeners.peek().call();
    }
    
    public String getPackageCodePath() {
        verifyMethodCalledFromDelegate("getPackageCodePath()");
        return (String) mSuperListeners.peek().call();
    }
    
    public SharedPreferences getSharedPreferences(final String name, final int mode) {
        verifyMethodCalledFromDelegate("getSharedPreferences(String, int)");
        return (SharedPreferences) mSuperListeners.peek().call(name, mode);
    }
    
    public FileInputStream openFileInput(final String name) {
        verifyMethodCalledFromDelegate("openFileInput(String)");
        return (FileInputStream) mSuperListeners.peek().call(name);
    }
    
    public FileOutputStream openFileOutput(final String name, final int mode) {
        verifyMethodCalledFromDelegate("openFileOutput(String, int)");
        return (FileOutputStream) mSuperListeners.peek().call(name, mode);
    }
    
    public boolean deleteFile(final String name) {
        verifyMethodCalledFromDelegate("deleteFile(String)");
        return (Boolean) mSuperListeners.peek().call(name);
    }
    
    public File getFileStreamPath(final String name) {
        verifyMethodCalledFromDelegate("getFileStreamPath(String)");
        return (File) mSuperListeners.peek().call(name);
    }
    
    public String[] fileList() {
        verifyMethodCalledFromDelegate("fileList()");
        return (String[]) mSuperListeners.peek().call();
    }
    
    public File getFilesDir() {
        verifyMethodCalledFromDelegate("getFilesDir()");
        return (File) mSuperListeners.peek().call();
    }
    
    public File getNoBackupFilesDir() {
        verifyMethodCalledFromDelegate("getNoBackupFilesDir()");
        return (File) mSuperListeners.peek().call();
    }
    
    public File getExternalFilesDir(final String type) {
        verifyMethodCalledFromDelegate("getExternalFilesDir(String)");
        return (File) mSuperListeners.peek().call(type);
    }
    
    public File[] getExternalFilesDirs(final String type) {
        verifyMethodCalledFromDelegate("getExternalFilesDirs(String)");
        return (File[]) mSuperListeners.peek().call(type);
    }
    
    public File getObbDir() {
        verifyMethodCalledFromDelegate("getObbDir()");
        return (File) mSuperListeners.peek().call();
    }
    
    public File[] getObbDirs() {
        verifyMethodCalledFromDelegate("getObbDirs()");
        return (File[]) mSuperListeners.peek().call();
    }
    
    public File getCacheDir() {
        verifyMethodCalledFromDelegate("getCacheDir()");
        return (File) mSuperListeners.peek().call();
    }
    
    public File getCodeCacheDir() {
        verifyMethodCalledFromDelegate("getCodeCacheDir()");
        return (File) mSuperListeners.peek().call();
    }
    
    public File getExternalCacheDir() {
        verifyMethodCalledFromDelegate("getExternalCacheDir()");
        return (File) mSuperListeners.peek().call();
    }
    
    public File[] getExternalCacheDirs() {
        verifyMethodCalledFromDelegate("getExternalCacheDirs()");
        return (File[]) mSuperListeners.peek().call();
    }
    
    public File[] getExternalMediaDirs() {
        verifyMethodCalledFromDelegate("getExternalMediaDirs()");
        return (File[]) mSuperListeners.peek().call();
    }
    
    public File getDir(final String name, final int mode) {
        verifyMethodCalledFromDelegate("getDir(String, int)");
        return (File) mSuperListeners.peek().call(name, mode);
    }
    
    public SQLiteDatabase openOrCreateDatabase(final String name, final int mode,             final SQLiteDatabase.CursorFactory factory) {
        verifyMethodCalledFromDelegate("openOrCreateDatabase(String, int, SQLiteDatabase.CursorFactory)");
        return (SQLiteDatabase) mSuperListeners.peek().call(name, mode, factory);
    }
    
    public SQLiteDatabase openOrCreateDatabase(final String name, final int mode,             final SQLiteDatabase.CursorFactory factory, final DatabaseErrorHandler errorHandler) {
        verifyMethodCalledFromDelegate("openOrCreateDatabase(String, int, SQLiteDatabase.CursorFactory, DatabaseErrorHandler)");
        return (SQLiteDatabase) mSuperListeners.peek().call(name, mode, factory, errorHandler);
    }
    
    public boolean deleteDatabase(final String name) {
        verifyMethodCalledFromDelegate("deleteDatabase(String)");
        return (Boolean) mSuperListeners.peek().call(name);
    }
    
    public File getDatabasePath(final String name) {
        verifyMethodCalledFromDelegate("getDatabasePath(String)");
        return (File) mSuperListeners.peek().call(name);
    }
    
    public String[] databaseList() {
        verifyMethodCalledFromDelegate("databaseList()");
        return (String[]) mSuperListeners.peek().call();
    }
    
    public Drawable getWallpaper() {
        verifyMethodCalledFromDelegate("getWallpaper()");
        return (Drawable) mSuperListeners.peek().call();
    }
    
    public Drawable peekWallpaper() {
        verifyMethodCalledFromDelegate("peekWallpaper()");
        return (Drawable) mSuperListeners.peek().call();
    }
    
    public int getWallpaperDesiredMinimumWidth() {
        verifyMethodCalledFromDelegate("getWallpaperDesiredMinimumWidth()");
        return (Integer) mSuperListeners.peek().call();
    }
    
    public int getWallpaperDesiredMinimumHeight() {
        verifyMethodCalledFromDelegate("getWallpaperDesiredMinimumHeight()");
        return (Integer) mSuperListeners.peek().call();
    }
    
    public void setWallpaper(final Bitmap bitmap)  throws IOException {
        verifyMethodCalledFromDelegate("setWallpaper(Bitmap)");
        mSuperListeners.peek().call(bitmap);
    }
    
    public void setWallpaper(final InputStream data)  throws IOException {
        verifyMethodCalledFromDelegate("setWallpaper(InputStream)");
        mSuperListeners.peek().call(data);
    }
    
    public void clearWallpaper()  throws IOException {
        verifyMethodCalledFromDelegate("clearWallpaper()");
        mSuperListeners.peek().call();
    }
    
    public void sendBroadcast(final Intent intent)  {
        verifyMethodCalledFromDelegate("sendBroadcast(Intent)");
        mSuperListeners.peek().call(intent);
    }
    
    public void sendBroadcast(final Intent intent, final String receiverPermission)  {
        verifyMethodCalledFromDelegate("sendBroadcast(Intent, String)");
        mSuperListeners.peek().call(intent, receiverPermission);
    }
    
    public void sendOrderedBroadcast(final Intent intent, final String receiverPermission)  {
        verifyMethodCalledFromDelegate("sendOrderedBroadcast(Intent, String)");
        mSuperListeners.peek().call(intent, receiverPermission);
    }
    
    public void sendOrderedBroadcast(final Intent intent, final String receiverPermission,             final BroadcastReceiver resultReceiver, final Handler scheduler, final int initialCode,             final String initialData, final Bundle initialExtras)  {
        verifyMethodCalledFromDelegate("sendOrderedBroadcast(Intent, String, BroadcastReceiver, Handler, int, String, Bundle)");
        mSuperListeners.peek().call(intent, receiverPermission, resultReceiver, scheduler, initialCode, initialData, initialExtras);
    }
    
    public void sendBroadcastAsUser(final Intent intent, final UserHandle user)  {
        verifyMethodCalledFromDelegate("sendBroadcastAsUser(Intent, UserHandle)");
        mSuperListeners.peek().call(intent, user);
    }
    
    public void sendBroadcastAsUser(final Intent intent, final UserHandle user,             final String receiverPermission)  {
        verifyMethodCalledFromDelegate("sendBroadcastAsUser(Intent, UserHandle, String)");
        mSuperListeners.peek().call(intent, user, receiverPermission);
    }
    
    public void sendOrderedBroadcastAsUser(final Intent intent, final UserHandle user,             final String receiverPermission, final BroadcastReceiver resultReceiver,             final Handler scheduler,             final int initialCode, final String initialData, final Bundle initialExtras)  {
        verifyMethodCalledFromDelegate("sendOrderedBroadcastAsUser(Intent, UserHandle, String, BroadcastReceiver, Handler, int, String, Bundle)");
        mSuperListeners.peek().call(intent, user, receiverPermission, resultReceiver, scheduler, initialCode, initialData, initialExtras);
    }
    
    public void sendStickyBroadcast(final Intent intent)  {
        verifyMethodCalledFromDelegate("sendStickyBroadcast(Intent)");
        mSuperListeners.peek().call(intent);
    }
    
    public void sendStickyOrderedBroadcast(final Intent intent,             final BroadcastReceiver resultReceiver,             final Handler scheduler, final int initialCode, final String initialData,             final Bundle initialExtras)  {
        verifyMethodCalledFromDelegate("sendStickyOrderedBroadcast(Intent, BroadcastReceiver, Handler, int, String, Bundle)");
        mSuperListeners.peek().call(intent, resultReceiver, scheduler, initialCode, initialData, initialExtras);
    }
    
    public void removeStickyBroadcast(final Intent intent)  {
        verifyMethodCalledFromDelegate("removeStickyBroadcast(Intent)");
        mSuperListeners.peek().call(intent);
    }
    
    public void sendStickyBroadcastAsUser(final Intent intent, final UserHandle user)  {
        verifyMethodCalledFromDelegate("sendStickyBroadcastAsUser(Intent, UserHandle)");
        mSuperListeners.peek().call(intent, user);
    }
    
    public void sendStickyOrderedBroadcastAsUser(final Intent intent, final UserHandle user,             final BroadcastReceiver resultReceiver, final Handler scheduler, final int initialCode,             final String initialData, final Bundle initialExtras)  {
        verifyMethodCalledFromDelegate("sendStickyOrderedBroadcastAsUser(Intent, UserHandle, BroadcastReceiver, Handler, int, String, Bundle)");
        mSuperListeners.peek().call(intent, user, resultReceiver, scheduler, initialCode, initialData, initialExtras);
    }
    
    public void removeStickyBroadcastAsUser(final Intent intent, final UserHandle user)  {
        verifyMethodCalledFromDelegate("removeStickyBroadcastAsUser(Intent, UserHandle)");
        mSuperListeners.peek().call(intent, user);
    }
    
    public Intent registerReceiver(final BroadcastReceiver receiver, final IntentFilter filter) {
        verifyMethodCalledFromDelegate("registerReceiver(BroadcastReceiver, IntentFilter)");
        return (Intent) mSuperListeners.peek().call(receiver, filter);
    }
    
    public Intent registerReceiver(final BroadcastReceiver receiver, final IntentFilter filter,             final String broadcastPermission, final Handler scheduler) {
        verifyMethodCalledFromDelegate("registerReceiver(BroadcastReceiver, IntentFilter, String, Handler)");
        return (Intent) mSuperListeners.peek().call(receiver, filter, broadcastPermission, scheduler);
    }
    
    public void unregisterReceiver(final BroadcastReceiver receiver)  {
        verifyMethodCalledFromDelegate("unregisterReceiver(BroadcastReceiver)");
        mSuperListeners.peek().call(receiver);
    }
    
    public ComponentName startService(final Intent service) {
        verifyMethodCalledFromDelegate("startService(Intent)");
        return (ComponentName) mSuperListeners.peek().call(service);
    }
    
    public boolean stopService(final Intent name) {
        verifyMethodCalledFromDelegate("stopService(Intent)");
        return (Boolean) mSuperListeners.peek().call(name);
    }
    
    public boolean bindService(final Intent service, final ServiceConnection conn,             final int flags) {
        verifyMethodCalledFromDelegate("bindService(Intent, ServiceConnection, int)");
        return (Boolean) mSuperListeners.peek().call(service, conn, flags);
    }
    
    public void unbindService(final ServiceConnection conn)  {
        verifyMethodCalledFromDelegate("unbindService(ServiceConnection)");
        mSuperListeners.peek().call(conn);
    }
    
    public boolean startInstrumentation(final ComponentName className, final String profileFile,             final Bundle arguments) {
        verifyMethodCalledFromDelegate("startInstrumentation(ComponentName, String, Bundle)");
        return (Boolean) mSuperListeners.peek().call(className, profileFile, arguments);
    }
    
    public String getSystemServiceName(final Class<?> serviceClass) {
        verifyMethodCalledFromDelegate("getSystemServiceName(Class<?>)");
        return (String) mSuperListeners.peek().call(serviceClass);
    }
    
    public int checkPermission(final String permission, final int pid, final int uid) {
        verifyMethodCalledFromDelegate("checkPermission(String, int, int)");
        return (Integer) mSuperListeners.peek().call(permission, pid, uid);
    }
    
    public int checkCallingPermission(final String permission) {
        verifyMethodCalledFromDelegate("checkCallingPermission(String)");
        return (Integer) mSuperListeners.peek().call(permission);
    }
    
    public int checkCallingOrSelfPermission(final String permission) {
        verifyMethodCalledFromDelegate("checkCallingOrSelfPermission(String)");
        return (Integer) mSuperListeners.peek().call(permission);
    }
    
    public int checkSelfPermission(final String permission) {
        verifyMethodCalledFromDelegate("checkSelfPermission(String)");
        return (Integer) mSuperListeners.peek().call(permission);
    }
    
    public void enforcePermission(final String permission, final int pid, final int uid,             final String message)  {
        verifyMethodCalledFromDelegate("enforcePermission(String, int, int, String)");
        mSuperListeners.peek().call(permission, pid, uid, message);
    }
    
    public void enforceCallingPermission(final String permission, final String message)  {
        verifyMethodCalledFromDelegate("enforceCallingPermission(String, String)");
        mSuperListeners.peek().call(permission, message);
    }
    
    public void enforceCallingOrSelfPermission(final String permission, final String message)  {
        verifyMethodCalledFromDelegate("enforceCallingOrSelfPermission(String, String)");
        mSuperListeners.peek().call(permission, message);
    }
    
    public void grantUriPermission(final String toPackage, final Uri uri, final int modeFlags)  {
        verifyMethodCalledFromDelegate("grantUriPermission(String, Uri, int)");
        mSuperListeners.peek().call(toPackage, uri, modeFlags);
    }
    
    public void revokeUriPermission(final Uri uri, final int modeFlags)  {
        verifyMethodCalledFromDelegate("revokeUriPermission(Uri, int)");
        mSuperListeners.peek().call(uri, modeFlags);
    }
    
    public int checkUriPermission(final Uri uri, final int pid, final int uid,             final int modeFlags) {
        verifyMethodCalledFromDelegate("checkUriPermission(Uri, int, int, int)");
        return (Integer) mSuperListeners.peek().call(uri, pid, uid, modeFlags);
    }
    
    public int checkCallingUriPermission(final Uri uri, final int modeFlags) {
        verifyMethodCalledFromDelegate("checkCallingUriPermission(Uri, int)");
        return (Integer) mSuperListeners.peek().call(uri, modeFlags);
    }
    
    public int checkCallingOrSelfUriPermission(final Uri uri, final int modeFlags) {
        verifyMethodCalledFromDelegate("checkCallingOrSelfUriPermission(Uri, int)");
        return (Integer) mSuperListeners.peek().call(uri, modeFlags);
    }
    
    public int checkUriPermission(final Uri uri, final String readPermission,             final String writePermission, final int pid,             final int uid, final int modeFlags) {
        verifyMethodCalledFromDelegate("checkUriPermission(Uri, String, String, int, int, int)");
        return (Integer) mSuperListeners.peek().call(uri, readPermission, writePermission, pid, uid, modeFlags);
    }
    
    public void enforceUriPermission(final Uri uri, final int pid, final int uid,             final int modeFlags, final String message)  {
        verifyMethodCalledFromDelegate("enforceUriPermission(Uri, int, int, int, String)");
        mSuperListeners.peek().call(uri, pid, uid, modeFlags, message);
    }
    
    public void enforceCallingUriPermission(final Uri uri, final int modeFlags,             final String message)  {
        verifyMethodCalledFromDelegate("enforceCallingUriPermission(Uri, int, String)");
        mSuperListeners.peek().call(uri, modeFlags, message);
    }
    
    public void enforceCallingOrSelfUriPermission(final Uri uri, final int modeFlags,             final String message)  {
        verifyMethodCalledFromDelegate("enforceCallingOrSelfUriPermission(Uri, int, String)");
        mSuperListeners.peek().call(uri, modeFlags, message);
    }
    
    public void enforceUriPermission(final Uri uri, final String readPermission,             final String writePermission,             final int pid, final int uid, final int modeFlags, final String message)  {
        verifyMethodCalledFromDelegate("enforceUriPermission(Uri, String, String, int, int, int, String)");
        mSuperListeners.peek().call(uri, readPermission, writePermission, pid, uid, modeFlags, message);
    }
    
    public Context createPackageContext(final String packageName, final int flags) {
        verifyMethodCalledFromDelegate("createPackageContext(String, int)");
        return (Context) mSuperListeners.peek().call(packageName, flags);
    }
    
    public Context createConfigurationContext(final Configuration overrideConfiguration) {
        verifyMethodCalledFromDelegate("createConfigurationContext(Configuration)");
        return (Context) mSuperListeners.peek().call(overrideConfiguration);
    }
    
    public Context createDisplayContext(final Display display) {
        verifyMethodCalledFromDelegate("createDisplayContext(Display)");
        return (Context) mSuperListeners.peek().call(display);
    }
    
    public boolean isRestricted() {
        verifyMethodCalledFromDelegate("isRestricted()");
        return (Boolean) mSuperListeners.peek().call();
    }
    
    public void registerComponentCallbacks(final ComponentCallbacks callback)  {
        verifyMethodCalledFromDelegate("registerComponentCallbacks(ComponentCallbacks)");
        mSuperListeners.peek().call(callback);
    }
    
    public void unregisterComponentCallbacks(final ComponentCallbacks callback)  {
        verifyMethodCalledFromDelegate("unregisterComponentCallbacks(ComponentCallbacks)");
        mSuperListeners.peek().call(callback);
    }
    
    }
    