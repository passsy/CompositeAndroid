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
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;


public class ActivityDelegate extends ActivityDelegateBase {

    public ActivityDelegate(final CompositeActivity compositeActivity) {
        super(compositeActivity);
    }

    public void addContentView(final View view, final ViewGroup.LayoutParams params) {
        callHook("addContentView(View, ViewGroup.LayoutParams)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.addContentView(superCall, (View) args[0], (ViewGroup.LayoutParams) args[1]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.addContentView_super((View) args[0], (ViewGroup.LayoutParams) args[1]);
            }
        }, view, params);
    }

    public void applyOverrideConfiguration(final Configuration overrideConfiguration) {
        callHook("applyOverrideConfiguration(Configuration)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.applyOverrideConfiguration(superCall, (Configuration) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.applyOverrideConfiguration_super((Configuration) args[0]);
            }
        }, overrideConfiguration);
    }

    public void attachBaseContext(final Context newBase) {
        callHook("attachBaseContext(Context)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.attachBaseContext(superCall, (Context) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.attachBaseContext_super((Context) args[0]);
            }
        }, newBase);
    }

    public boolean bindService(final Intent service, final ServiceConnection conn,
            final int flags) {
        return callFunction("bindService(Intent, ServiceConnection, int)",
                new PluginMethodFunction<Boolean>() {
                    @Override
                    public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.bindService(superCall, (Intent) args[0],
                                (ServiceConnection) args[1], (int) args[2]);

                    }
                },
                new ActivitySuperFunction<Boolean>("bindService(Intent, ServiceConnection, int)") {
                    @Override
                    public Boolean call(final Object... args) {
                        return mActivity
                                .bindService_super((Intent) args[0], (ServiceConnection) args[1],
                                        (int) args[2]);
                    }
                }, service, conn, flags);
    }

    public int checkCallingOrSelfPermission(final String permission) {
        return callFunction("checkCallingOrSelfPermission(String)",
                new PluginMethodFunction<Integer>() {
                    @Override
                    public Integer call(final ActivitySuperFunction<Integer> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.checkCallingOrSelfPermission(superCall, (String) args[0]);

                    }
                }, new ActivitySuperFunction<Integer>("checkCallingOrSelfPermission(String)") {
                    @Override
                    public Integer call(final Object... args) {
                        return mActivity.checkCallingOrSelfPermission_super((String) args[0]);
                    }
                }, permission);
    }

    public int checkCallingOrSelfUriPermission(final Uri uri, final int modeFlags) {
        return callFunction("checkCallingOrSelfUriPermission(Uri, int)",
                new PluginMethodFunction<Integer>() {
                    @Override
                    public Integer call(final ActivitySuperFunction<Integer> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.checkCallingOrSelfUriPermission(superCall, (Uri) args[0],
                                (int) args[1]);

                    }
                }, new ActivitySuperFunction<Integer>("checkCallingOrSelfUriPermission(Uri, int)") {
                    @Override
                    public Integer call(final Object... args) {
                        return mActivity.checkCallingOrSelfUriPermission_super((Uri) args[0],
                                (int) args[1]);
                    }
                }, uri, modeFlags);
    }

    public int checkCallingPermission(final String permission) {
        return callFunction("checkCallingPermission(String)", new PluginMethodFunction<Integer>() {
            @Override
            public Integer call(final ActivitySuperFunction<Integer> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.checkCallingPermission(superCall, (String) args[0]);

            }
        }, new ActivitySuperFunction<Integer>("checkCallingPermission(String)") {
            @Override
            public Integer call(final Object... args) {
                return mActivity.checkCallingPermission_super((String) args[0]);
            }
        }, permission);
    }

    public int checkCallingUriPermission(final Uri uri, final int modeFlags) {
        return callFunction("checkCallingUriPermission(Uri, int)",
                new PluginMethodFunction<Integer>() {
                    @Override
                    public Integer call(final ActivitySuperFunction<Integer> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin
                                .checkCallingUriPermission(superCall, (Uri) args[0], (int) args[1]);

                    }
                }, new ActivitySuperFunction<Integer>("checkCallingUriPermission(Uri, int)") {
                    @Override
                    public Integer call(final Object... args) {
                        return mActivity
                                .checkCallingUriPermission_super((Uri) args[0], (int) args[1]);
                    }
                }, uri, modeFlags);
    }

    public int checkPermission(final String permission, final int pid, final int uid) {
        return callFunction("checkPermission(String, int, int)",
                new PluginMethodFunction<Integer>() {
                    @Override
                    public Integer call(final ActivitySuperFunction<Integer> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.checkPermission(superCall, (String) args[0], (int) args[1],
                                (int) args[2]);

                    }
                }, new ActivitySuperFunction<Integer>("checkPermission(String, int, int)") {
                    @Override
                    public Integer call(final Object... args) {
                        return mActivity.checkPermission_super((String) args[0], (int) args[1],
                                (int) args[2]);
                    }
                }, permission, pid, uid);
    }

    public int checkSelfPermission(final String permission) {
        return callFunction("checkSelfPermission(String)", new PluginMethodFunction<Integer>() {
            @Override
            public Integer call(final ActivitySuperFunction<Integer> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.checkSelfPermission(superCall, (String) args[0]);

            }
        }, new ActivitySuperFunction<Integer>("checkSelfPermission(String)") {
            @Override
            public Integer call(final Object... args) {
                return mActivity.checkSelfPermission_super((String) args[0]);
            }
        }, permission);
    }

    public int checkUriPermission(final Uri uri, final int pid, final int uid,
            final int modeFlags) {
        return callFunction("checkUriPermission(Uri, int, int, int)",
                new PluginMethodFunction<Integer>() {
                    @Override
                    public Integer call(final ActivitySuperFunction<Integer> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.checkUriPermission(superCall, (Uri) args[0], (int) args[1],
                                (int) args[2], (int) args[3]);

                    }
                }, new ActivitySuperFunction<Integer>("checkUriPermission(Uri, int, int, int)") {
                    @Override
                    public Integer call(final Object... args) {
                        return mActivity.checkUriPermission_super((Uri) args[0], (int) args[1],
                                (int) args[2], (int) args[3]);
                    }
                }, uri, pid, uid, modeFlags);
    }

    public int checkUriPermission(final Uri uri, final String readPermission,
            final String writePermission, final int pid, final int uid, final int modeFlags) {
        return callFunction("checkUriPermission(Uri, String, String, int, int, int)",
                new PluginMethodFunction<Integer>() {
                    @Override
                    public Integer call(final ActivitySuperFunction<Integer> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.checkUriPermission(superCall, (Uri) args[0], (String) args[1],
                                (String) args[2], (int) args[3], (int) args[4], (int) args[5]);

                    }
                }, new ActivitySuperFunction<Integer>(
                        "checkUriPermission(Uri, String, String, int, int, int)") {
                    @Override
                    public Integer call(final Object... args) {
                        return mActivity.checkUriPermission_super((Uri) args[0], (String) args[1],
                                (String) args[2], (int) args[3], (int) args[4], (int) args[5]);
                    }
                }, uri, readPermission, writePermission, pid, uid, modeFlags);
    }

    public void clearWallpaper() throws IOException {
        callHook("clearWallpaper()", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                try {
                    plugin.clearWallpaper(superCall);
                } catch (IOException e) {
                    throw new SuppressedException(e);
                }
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                try {
                    mActivity.clearWallpaper_super();
                } catch (IOException e) {
                    throw new SuppressedException(e);
                }
            }
        });
    }

    public void closeContextMenu() {
        callHook("closeContextMenu()", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.closeContextMenu(superCall);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.closeContextMenu_super();
            }
        });
    }

    public void closeOptionsMenu() {
        callHook("closeOptionsMenu()", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.closeOptionsMenu(superCall);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.closeOptionsMenu_super();
            }
        });
    }

    public Context createConfigurationContext(final Configuration overrideConfiguration) {
        return callFunction("createConfigurationContext(Configuration)",
                new PluginMethodFunction<Context>() {
                    @Override
                    public Context call(final ActivitySuperFunction<Context> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin
                                .createConfigurationContext(superCall, (Configuration) args[0]);

                    }
                }, new ActivitySuperFunction<Context>("createConfigurationContext(Configuration)") {
                    @Override
                    public Context call(final Object... args) {
                        return mActivity.createConfigurationContext_super((Configuration) args[0]);
                    }
                }, overrideConfiguration);
    }

    public Context createDisplayContext(final Display display) {
        return callFunction("createDisplayContext(Display)", new PluginMethodFunction<Context>() {
            @Override
            public Context call(final ActivitySuperFunction<Context> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.createDisplayContext(superCall, (Display) args[0]);

            }
        }, new ActivitySuperFunction<Context>("createDisplayContext(Display)") {
            @Override
            public Context call(final Object... args) {
                return mActivity.createDisplayContext_super((Display) args[0]);
            }
        }, display);
    }

    public Context createPackageContext(final String packageName, final int flags) {
        return callFunction("createPackageContext(String, int)",
                new PluginMethodFunction<Context>() {
                    @Override
                    public Context call(final ActivitySuperFunction<Context> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        try {
                            return plugin.createPackageContext(superCall, (String) args[0],
                                    (int) args[1]);
                        } catch (PackageManager.NameNotFoundException e) {
                            throw new SuppressedException(e);
                        }

                    }
                }, new ActivitySuperFunction<Context>("createPackageContext(String, int)") {
                    @Override
                    public Context call(final Object... args) {
                        try {
                            return mActivity
                                    .createPackageContext_super((String) args[0], (int) args[1]);
                        } catch (PackageManager.NameNotFoundException e) {
                            throw new SuppressedException(e);
                        }
                    }
                }, packageName, flags);
    }

    public PendingIntent createPendingResult(final int requestCode, @NonNull final Intent data,
            final int flags) {
        return callFunction("createPendingResult(int, Intent, int)",
                new PluginMethodFunction<PendingIntent>() {
                    @Override
                    public PendingIntent call(final ActivitySuperFunction<PendingIntent> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin
                                .createPendingResult(superCall, (int) args[0], (Intent) args[1],
                                        (int) args[2]);

                    }
                },
                new ActivitySuperFunction<PendingIntent>("createPendingResult(int, Intent, int)") {
                    @Override
                    public PendingIntent call(final Object... args) {
                        return mActivity.createPendingResult_super((int) args[0], (Intent) args[1],
                                (int) args[2]);
                    }
                }, requestCode, data, flags);
    }

    public String[] databaseList() {
        return callFunction("databaseList()", new PluginMethodFunction<String[]>() {
            @Override
            public String[] call(final ActivitySuperFunction<String[]> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.databaseList(superCall);

            }
        }, new ActivitySuperFunction<String[]>("databaseList()") {
            @Override
            public String[] call(final Object... args) {
                return mActivity.databaseList_super();
            }
        });
    }

    public boolean deleteDatabase(final String name) {
        return callFunction("deleteDatabase(String)", new PluginMethodFunction<Boolean>() {
            @Override
            public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.deleteDatabase(superCall, (String) args[0]);

            }
        }, new ActivitySuperFunction<Boolean>("deleteDatabase(String)") {
            @Override
            public Boolean call(final Object... args) {
                return mActivity.deleteDatabase_super((String) args[0]);
            }
        }, name);
    }

    public boolean deleteFile(final String name) {
        return callFunction("deleteFile(String)", new PluginMethodFunction<Boolean>() {
            @Override
            public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.deleteFile(superCall, (String) args[0]);

            }
        }, new ActivitySuperFunction<Boolean>("deleteFile(String)") {
            @Override
            public Boolean call(final Object... args) {
                return mActivity.deleteFile_super((String) args[0]);
            }
        }, name);
    }

    public boolean dispatchGenericMotionEvent(final MotionEvent ev) {
        return callFunction("dispatchGenericMotionEvent(MotionEvent)",
                new PluginMethodFunction<Boolean>() {
                    @Override
                    public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.dispatchGenericMotionEvent(superCall, (MotionEvent) args[0]);

                    }
                }, new ActivitySuperFunction<Boolean>("dispatchGenericMotionEvent(MotionEvent)") {
                    @Override
                    public Boolean call(final Object... args) {
                        return mActivity.dispatchGenericMotionEvent_super((MotionEvent) args[0]);
                    }
                }, ev);
    }

    public boolean dispatchKeyEvent(final KeyEvent event) {
        return callFunction("dispatchKeyEvent(KeyEvent)", new PluginMethodFunction<Boolean>() {
            @Override
            public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.dispatchKeyEvent(superCall, (KeyEvent) args[0]);

            }
        }, new ActivitySuperFunction<Boolean>("dispatchKeyEvent(KeyEvent)") {
            @Override
            public Boolean call(final Object... args) {
                return mActivity.dispatchKeyEvent_super((KeyEvent) args[0]);
            }
        }, event);
    }

    public boolean dispatchKeyShortcutEvent(final KeyEvent event) {
        return callFunction("dispatchKeyShortcutEvent(KeyEvent)",
                new PluginMethodFunction<Boolean>() {
                    @Override
                    public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.dispatchKeyShortcutEvent(superCall, (KeyEvent) args[0]);

                    }
                }, new ActivitySuperFunction<Boolean>("dispatchKeyShortcutEvent(KeyEvent)") {
                    @Override
                    public Boolean call(final Object... args) {
                        return mActivity.dispatchKeyShortcutEvent_super((KeyEvent) args[0]);
                    }
                }, event);
    }

    public boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent event) {
        return callFunction("dispatchPopulateAccessibilityEvent(AccessibilityEvent)",
                new PluginMethodFunction<Boolean>() {
                    @Override
                    public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.dispatchPopulateAccessibilityEvent(superCall,
                                (AccessibilityEvent) args[0]);

                    }
                }, new ActivitySuperFunction<Boolean>(
                        "dispatchPopulateAccessibilityEvent(AccessibilityEvent)") {
                    @Override
                    public Boolean call(final Object... args) {
                        return mActivity.dispatchPopulateAccessibilityEvent_super(
                                (AccessibilityEvent) args[0]);
                    }
                }, event);
    }

    public boolean dispatchTouchEvent(final MotionEvent ev) {
        return callFunction("dispatchTouchEvent(MotionEvent)", new PluginMethodFunction<Boolean>() {
            @Override
            public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.dispatchTouchEvent(superCall, (MotionEvent) args[0]);

            }
        }, new ActivitySuperFunction<Boolean>("dispatchTouchEvent(MotionEvent)") {
            @Override
            public Boolean call(final Object... args) {
                return mActivity.dispatchTouchEvent_super((MotionEvent) args[0]);
            }
        }, ev);
    }

    public boolean dispatchTrackballEvent(final MotionEvent ev) {
        return callFunction("dispatchTrackballEvent(MotionEvent)",
                new PluginMethodFunction<Boolean>() {
                    @Override
                    public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.dispatchTrackballEvent(superCall, (MotionEvent) args[0]);

                    }
                }, new ActivitySuperFunction<Boolean>("dispatchTrackballEvent(MotionEvent)") {
                    @Override
                    public Boolean call(final Object... args) {
                        return mActivity.dispatchTrackballEvent_super((MotionEvent) args[0]);
                    }
                }, ev);
    }

    public void dump(final String prefix, final FileDescriptor fd, final PrintWriter writer,
            final String[] args) {
        callHook("dump(String, FileDescriptor, PrintWriter, String[])", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.dump(superCall, (String) args[0], (FileDescriptor) args[1],
                        (PrintWriter) args[2], (String[]) args[3]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.dump_super((String) args[0], (FileDescriptor) args[1],
                        (PrintWriter) args[2], (String[]) args[3]);
            }
        }, prefix, fd, writer, args);
    }

    public void enforceCallingOrSelfPermission(final String permission, final String message) {
        callHook("enforceCallingOrSelfPermission(String, String)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.enforceCallingOrSelfPermission(superCall, (String) args[0],
                        (String) args[1]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.enforceCallingOrSelfPermission_super((String) args[0], (String) args[1]);
            }
        }, permission, message);
    }

    public void enforceCallingOrSelfUriPermission(final Uri uri, final int modeFlags,
            final String message) {
        callHook("enforceCallingOrSelfUriPermission(Uri, int, String)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.enforceCallingOrSelfUriPermission(superCall, (Uri) args[0], (int) args[1],
                        (String) args[2]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.enforceCallingOrSelfUriPermission_super((Uri) args[0], (int) args[1],
                        (String) args[2]);
            }
        }, uri, modeFlags, message);
    }

    public void enforceCallingPermission(final String permission, final String message) {
        callHook("enforceCallingPermission(String, String)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.enforceCallingPermission(superCall, (String) args[0], (String) args[1]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.enforceCallingPermission_super((String) args[0], (String) args[1]);
            }
        }, permission, message);
    }

    public void enforceCallingUriPermission(final Uri uri, final int modeFlags,
            final String message) {
        callHook("enforceCallingUriPermission(Uri, int, String)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.enforceCallingUriPermission(superCall, (Uri) args[0], (int) args[1],
                        (String) args[2]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.enforceCallingUriPermission_super((Uri) args[0], (int) args[1],
                        (String) args[2]);
            }
        }, uri, modeFlags, message);
    }

    public void enforcePermission(final String permission, final int pid, final int uid,
            final String message) {
        callHook("enforcePermission(String, int, int, String)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.enforcePermission(superCall, (String) args[0], (int) args[1], (int) args[2],
                        (String) args[3]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.enforcePermission_super((String) args[0], (int) args[1], (int) args[2],
                        (String) args[3]);
            }
        }, permission, pid, uid, message);
    }

    public void enforceUriPermission(final Uri uri, final int pid, final int uid,
            final int modeFlags, final String message) {
        callHook("enforceUriPermission(Uri, int, int, int, String)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.enforceUriPermission(superCall, (Uri) args[0], (int) args[1], (int) args[2],
                        (int) args[3], (String) args[4]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.enforceUriPermission_super((Uri) args[0], (int) args[1], (int) args[2],
                        (int) args[3], (String) args[4]);
            }
        }, uri, pid, uid, modeFlags, message);
    }

    public void enforceUriPermission(final Uri uri, final String readPermission,
            final String writePermission, final int pid, final int uid, final int modeFlags,
            final String message) {
        callHook("enforceUriPermission(Uri, String, String, int, int, int, String)",
                new PluginMethodAction() {
                    @Override
                    public void call(final ActivitySuperFunction superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.enforceUriPermission(superCall, (Uri) args[0], (String) args[1],
                                (String) args[2], (int) args[3], (int) args[4], (int) args[5],
                                (String) args[6]);
                    }
                }, new ActivitySuperAction() {
                    @Override
                    public void call(final Object... args) {
                        mActivity.enforceUriPermission_super((Uri) args[0], (String) args[1],
                                (String) args[2], (int) args[3], (int) args[4], (int) args[5],
                                (String) args[6]);
                    }
                }, uri, readPermission, writePermission, pid, uid, modeFlags, message);
    }

    public String[] fileList() {
        return callFunction("fileList()", new PluginMethodFunction<String[]>() {
            @Override
            public String[] call(final ActivitySuperFunction<String[]> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.fileList(superCall);

            }
        }, new ActivitySuperFunction<String[]>("fileList()") {
            @Override
            public String[] call(final Object... args) {
                return mActivity.fileList_super();
            }
        });
    }

    public View findViewById(@IdRes final int id) {
        return callFunction("findViewById(int)", new PluginMethodFunction<View>() {
            @Override
            public View call(final ActivitySuperFunction<View> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.findViewById(superCall, (int) args[0]);

            }
        }, new ActivitySuperFunction<View>("findViewById(int)") {
            @Override
            public View call(final Object... args) {
                return mActivity.findViewById_super((int) args[0]);
            }
        }, id);
    }

    public void finish() {
        callHook("finish()", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.finish(superCall);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.finish_super();
            }
        });
    }

    public void finishActivity(final int requestCode) {
        callHook("finishActivity(int)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.finishActivity(superCall, (int) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.finishActivity_super((int) args[0]);
            }
        }, requestCode);
    }

    public void finishActivityFromChild(@NonNull final Activity child, final int requestCode) {
        callHook("finishActivityFromChild(Activity, int)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.finishActivityFromChild(superCall, (Activity) args[0], (int) args[1]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.finishActivityFromChild_super((Activity) args[0], (int) args[1]);
            }
        }, child, requestCode);
    }

    public void finishAffinity() {
        callHook("finishAffinity()", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.finishAffinity(superCall);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.finishAffinity_super();
            }
        });
    }

    public void finishAfterTransition() {
        callHook("finishAfterTransition()", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.finishAfterTransition(superCall);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.finishAfterTransition_super();
            }
        });
    }

    public void finishAndRemoveTask() {
        callHook("finishAndRemoveTask()", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.finishAndRemoveTask(superCall);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.finishAndRemoveTask_super();
            }
        });
    }

    public void finishFromChild(final Activity child) {
        callHook("finishFromChild(Activity)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.finishFromChild(superCall, (Activity) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.finishFromChild_super((Activity) args[0]);
            }
        }, child);
    }

    public android.app.ActionBar getActionBar() {
        return callFunction("getActionBar()", new PluginMethodFunction<android.app.ActionBar>() {
            @Override
            public android.app.ActionBar call(
                    final ActivitySuperFunction<android.app.ActionBar> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getActionBar(superCall);

            }
        }, new ActivitySuperFunction<android.app.ActionBar>("getActionBar()") {
            @Override
            public android.app.ActionBar call(final Object... args) {
                return mActivity.getActionBar_super();
            }
        });
    }

    public Context getApplicationContext() {
        return callFunction("getApplicationContext()", new PluginMethodFunction<Context>() {
            @Override
            public Context call(final ActivitySuperFunction<Context> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getApplicationContext(superCall);

            }
        }, new ActivitySuperFunction<Context>("getApplicationContext()") {
            @Override
            public Context call(final Object... args) {
                return mActivity.getApplicationContext_super();
            }
        });
    }

    public ApplicationInfo getApplicationInfo() {
        return callFunction("getApplicationInfo()", new PluginMethodFunction<ApplicationInfo>() {
            @Override
            public ApplicationInfo call(final ActivitySuperFunction<ApplicationInfo> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getApplicationInfo(superCall);

            }
        }, new ActivitySuperFunction<ApplicationInfo>("getApplicationInfo()") {
            @Override
            public ApplicationInfo call(final Object... args) {
                return mActivity.getApplicationInfo_super();
            }
        });
    }

    public AssetManager getAssets() {
        return callFunction("getAssets()", new PluginMethodFunction<AssetManager>() {
            @Override
            public AssetManager call(final ActivitySuperFunction<AssetManager> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getAssets(superCall);

            }
        }, new ActivitySuperFunction<AssetManager>("getAssets()") {
            @Override
            public AssetManager call(final Object... args) {
                return mActivity.getAssets_super();
            }
        });
    }

    public Context getBaseContext() {
        return callFunction("getBaseContext()", new PluginMethodFunction<Context>() {
            @Override
            public Context call(final ActivitySuperFunction<Context> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getBaseContext(superCall);

            }
        }, new ActivitySuperFunction<Context>("getBaseContext()") {
            @Override
            public Context call(final Object... args) {
                return mActivity.getBaseContext_super();
            }
        });
    }

    public File getCacheDir() {
        return callFunction("getCacheDir()", new PluginMethodFunction<File>() {
            @Override
            public File call(final ActivitySuperFunction<File> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getCacheDir(superCall);

            }
        }, new ActivitySuperFunction<File>("getCacheDir()") {
            @Override
            public File call(final Object... args) {
                return mActivity.getCacheDir_super();
            }
        });
    }

    public ComponentName getCallingActivity() {
        return callFunction("getCallingActivity()", new PluginMethodFunction<ComponentName>() {
            @Override
            public ComponentName call(final ActivitySuperFunction<ComponentName> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getCallingActivity(superCall);

            }
        }, new ActivitySuperFunction<ComponentName>("getCallingActivity()") {
            @Override
            public ComponentName call(final Object... args) {
                return mActivity.getCallingActivity_super();
            }
        });
    }

    public String getCallingPackage() {
        return callFunction("getCallingPackage()", new PluginMethodFunction<String>() {
            @Override
            public String call(final ActivitySuperFunction<String> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getCallingPackage(superCall);

            }
        }, new ActivitySuperFunction<String>("getCallingPackage()") {
            @Override
            public String call(final Object... args) {
                return mActivity.getCallingPackage_super();
            }
        });
    }

    public int getChangingConfigurations() {
        return callFunction("getChangingConfigurations()", new PluginMethodFunction<Integer>() {
            @Override
            public Integer call(final ActivitySuperFunction<Integer> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getChangingConfigurations(superCall);

            }
        }, new ActivitySuperFunction<Integer>("getChangingConfigurations()") {
            @Override
            public Integer call(final Object... args) {
                return mActivity.getChangingConfigurations_super();
            }
        });
    }

    public ClassLoader getClassLoader() {
        return callFunction("getClassLoader()", new PluginMethodFunction<ClassLoader>() {
            @Override
            public ClassLoader call(final ActivitySuperFunction<ClassLoader> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getClassLoader(superCall);

            }
        }, new ActivitySuperFunction<ClassLoader>("getClassLoader()") {
            @Override
            public ClassLoader call(final Object... args) {
                return mActivity.getClassLoader_super();
            }
        });
    }

    public File getCodeCacheDir() {
        return callFunction("getCodeCacheDir()", new PluginMethodFunction<File>() {
            @Override
            public File call(final ActivitySuperFunction<File> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getCodeCacheDir(superCall);

            }
        }, new ActivitySuperFunction<File>("getCodeCacheDir()") {
            @Override
            public File call(final Object... args) {
                return mActivity.getCodeCacheDir_super();
            }
        });
    }

    public ComponentName getComponentName() {
        return callFunction("getComponentName()", new PluginMethodFunction<ComponentName>() {
            @Override
            public ComponentName call(final ActivitySuperFunction<ComponentName> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getComponentName(superCall);

            }
        }, new ActivitySuperFunction<ComponentName>("getComponentName()") {
            @Override
            public ComponentName call(final Object... args) {
                return mActivity.getComponentName_super();
            }
        });
    }

    public ContentResolver getContentResolver() {
        return callFunction("getContentResolver()", new PluginMethodFunction<ContentResolver>() {
            @Override
            public ContentResolver call(final ActivitySuperFunction<ContentResolver> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getContentResolver(superCall);

            }
        }, new ActivitySuperFunction<ContentResolver>("getContentResolver()") {
            @Override
            public ContentResolver call(final Object... args) {
                return mActivity.getContentResolver_super();
            }
        });
    }

    public Scene getContentScene() {
        return callFunction("getContentScene()", new PluginMethodFunction<Scene>() {
            @Override
            public Scene call(final ActivitySuperFunction<Scene> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getContentScene(superCall);

            }
        }, new ActivitySuperFunction<Scene>("getContentScene()") {
            @Override
            public Scene call(final Object... args) {
                return mActivity.getContentScene_super();
            }
        });
    }

    public TransitionManager getContentTransitionManager() {
        return callFunction("getContentTransitionManager()",
                new PluginMethodFunction<TransitionManager>() {
                    @Override
                    public TransitionManager call(
                            final ActivitySuperFunction<TransitionManager> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.getContentTransitionManager(superCall);

                    }
                }, new ActivitySuperFunction<TransitionManager>("getContentTransitionManager()") {
                    @Override
                    public TransitionManager call(final Object... args) {
                        return mActivity.getContentTransitionManager_super();
                    }
                });
    }

    public View getCurrentFocus() {
        return callFunction("getCurrentFocus()", new PluginMethodFunction<View>() {
            @Override
            public View call(final ActivitySuperFunction<View> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getCurrentFocus(superCall);

            }
        }, new ActivitySuperFunction<View>("getCurrentFocus()") {
            @Override
            public View call(final Object... args) {
                return mActivity.getCurrentFocus_super();
            }
        });
    }

    public File getDatabasePath(final String name) {
        return callFunction("getDatabasePath(String)", new PluginMethodFunction<File>() {
            @Override
            public File call(final ActivitySuperFunction<File> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getDatabasePath(superCall, (String) args[0]);

            }
        }, new ActivitySuperFunction<File>("getDatabasePath(String)") {
            @Override
            public File call(final Object... args) {
                return mActivity.getDatabasePath_super((String) args[0]);
            }
        }, name);
    }

    public AppCompatDelegate getDelegate() {
        return callFunction("getDelegate()", new PluginMethodFunction<AppCompatDelegate>() {
            @Override
            public AppCompatDelegate call(final ActivitySuperFunction<AppCompatDelegate> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getDelegate(superCall);

            }
        }, new ActivitySuperFunction<AppCompatDelegate>("getDelegate()") {
            @Override
            public AppCompatDelegate call(final Object... args) {
                return mActivity.getDelegate_super();
            }
        });
    }

    public File getDir(final String name, final int mode) {
        return callFunction("getDir(String, int)", new PluginMethodFunction<File>() {
            @Override
            public File call(final ActivitySuperFunction<File> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getDir(superCall, (String) args[0], (int) args[1]);

            }
        }, new ActivitySuperFunction<File>("getDir(String, int)") {
            @Override
            public File call(final Object... args) {
                return mActivity.getDir_super((String) args[0], (int) args[1]);
            }
        }, name, mode);
    }

    public ActionBarDrawerToggle.Delegate getDrawerToggleDelegate() {
        return callFunction("getDrawerToggleDelegate()",
                new PluginMethodFunction<ActionBarDrawerToggle.Delegate>() {
                    @Override
                    public ActionBarDrawerToggle.Delegate call(
                            final ActivitySuperFunction<ActionBarDrawerToggle.Delegate> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.getDrawerToggleDelegate(superCall);

                    }
                }, new ActivitySuperFunction<ActionBarDrawerToggle.Delegate>(
                        "getDrawerToggleDelegate()") {
                    @Override
                    public ActionBarDrawerToggle.Delegate call(final Object... args) {
                        return mActivity.getDrawerToggleDelegate_super();
                    }
                });
    }

    public File getExternalCacheDir() {
        return callFunction("getExternalCacheDir()", new PluginMethodFunction<File>() {
            @Override
            public File call(final ActivitySuperFunction<File> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getExternalCacheDir(superCall);

            }
        }, new ActivitySuperFunction<File>("getExternalCacheDir()") {
            @Override
            public File call(final Object... args) {
                return mActivity.getExternalCacheDir_super();
            }
        });
    }

    public File[] getExternalCacheDirs() {
        return callFunction("getExternalCacheDirs()", new PluginMethodFunction<File[]>() {
            @Override
            public File[] call(final ActivitySuperFunction<File[]> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getExternalCacheDirs(superCall);

            }
        }, new ActivitySuperFunction<File[]>("getExternalCacheDirs()") {
            @Override
            public File[] call(final Object... args) {
                return mActivity.getExternalCacheDirs_super();
            }
        });
    }

    public File getExternalFilesDir(final String type) {
        return callFunction("getExternalFilesDir(String)", new PluginMethodFunction<File>() {
            @Override
            public File call(final ActivitySuperFunction<File> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getExternalFilesDir(superCall, (String) args[0]);

            }
        }, new ActivitySuperFunction<File>("getExternalFilesDir(String)") {
            @Override
            public File call(final Object... args) {
                return mActivity.getExternalFilesDir_super((String) args[0]);
            }
        }, type);
    }

    public File[] getExternalFilesDirs(final String type) {
        return callFunction("getExternalFilesDirs(String)", new PluginMethodFunction<File[]>() {
            @Override
            public File[] call(final ActivitySuperFunction<File[]> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getExternalFilesDirs(superCall, (String) args[0]);

            }
        }, new ActivitySuperFunction<File[]>("getExternalFilesDirs(String)") {
            @Override
            public File[] call(final Object... args) {
                return mActivity.getExternalFilesDirs_super((String) args[0]);
            }
        }, type);
    }

    public File[] getExternalMediaDirs() {
        return callFunction("getExternalMediaDirs()", new PluginMethodFunction<File[]>() {
            @Override
            public File[] call(final ActivitySuperFunction<File[]> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getExternalMediaDirs(superCall);

            }
        }, new ActivitySuperFunction<File[]>("getExternalMediaDirs()") {
            @Override
            public File[] call(final Object... args) {
                return mActivity.getExternalMediaDirs_super();
            }
        });
    }

    public File getFileStreamPath(final String name) {
        return callFunction("getFileStreamPath(String)", new PluginMethodFunction<File>() {
            @Override
            public File call(final ActivitySuperFunction<File> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getFileStreamPath(superCall, (String) args[0]);

            }
        }, new ActivitySuperFunction<File>("getFileStreamPath(String)") {
            @Override
            public File call(final Object... args) {
                return mActivity.getFileStreamPath_super((String) args[0]);
            }
        }, name);
    }

    public File getFilesDir() {
        return callFunction("getFilesDir()", new PluginMethodFunction<File>() {
            @Override
            public File call(final ActivitySuperFunction<File> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getFilesDir(superCall);

            }
        }, new ActivitySuperFunction<File>("getFilesDir()") {
            @Override
            public File call(final Object... args) {
                return mActivity.getFilesDir_super();
            }
        });
    }

    public android.app.FragmentManager getFragmentManager() {
        return callFunction("getFragmentManager()",
                new PluginMethodFunction<android.app.FragmentManager>() {
                    @Override
                    public android.app.FragmentManager call(
                            final ActivitySuperFunction<android.app.FragmentManager> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.getFragmentManager(superCall);

                    }
                }, new ActivitySuperFunction<android.app.FragmentManager>("getFragmentManager()") {
                    @Override
                    public android.app.FragmentManager call(final Object... args) {
                        return mActivity.getFragmentManager_super();
                    }
                });
    }

    public Intent getIntent() {
        return callFunction("getIntent()", new PluginMethodFunction<Intent>() {
            @Override
            public Intent call(final ActivitySuperFunction<Intent> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getIntent(superCall);

            }
        }, new ActivitySuperFunction<Intent>("getIntent()") {
            @Override
            public Intent call(final Object... args) {
                return mActivity.getIntent_super();
            }
        });
    }

    public LayoutInflater getLayoutInflater() {
        return callFunction("getLayoutInflater()", new PluginMethodFunction<LayoutInflater>() {
            @Override
            public LayoutInflater call(final ActivitySuperFunction<LayoutInflater> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getLayoutInflater(superCall);

            }
        }, new ActivitySuperFunction<LayoutInflater>("getLayoutInflater()") {
            @Override
            public LayoutInflater call(final Object... args) {
                return mActivity.getLayoutInflater_super();
            }
        });
    }

    public android.app.LoaderManager getLoaderManager() {
        return callFunction("getLoaderManager()",
                new PluginMethodFunction<android.app.LoaderManager>() {
                    @Override
                    public android.app.LoaderManager call(
                            final ActivitySuperFunction<android.app.LoaderManager> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.getLoaderManager(superCall);

                    }
                }, new ActivitySuperFunction<android.app.LoaderManager>("getLoaderManager()") {
                    @Override
                    public android.app.LoaderManager call(final Object... args) {
                        return mActivity.getLoaderManager_super();
                    }
                });
    }

    public String getLocalClassName() {
        return callFunction("getLocalClassName()", new PluginMethodFunction<String>() {
            @Override
            public String call(final ActivitySuperFunction<String> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getLocalClassName(superCall);

            }
        }, new ActivitySuperFunction<String>("getLocalClassName()") {
            @Override
            public String call(final Object... args) {
                return mActivity.getLocalClassName_super();
            }
        });
    }

    public Looper getMainLooper() {
        return callFunction("getMainLooper()", new PluginMethodFunction<Looper>() {
            @Override
            public Looper call(final ActivitySuperFunction<Looper> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getMainLooper(superCall);

            }
        }, new ActivitySuperFunction<Looper>("getMainLooper()") {
            @Override
            public Looper call(final Object... args) {
                return mActivity.getMainLooper_super();
            }
        });
    }

    public MenuInflater getMenuInflater() {
        return callFunction("getMenuInflater()", new PluginMethodFunction<MenuInflater>() {
            @Override
            public MenuInflater call(final ActivitySuperFunction<MenuInflater> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getMenuInflater(superCall);

            }
        }, new ActivitySuperFunction<MenuInflater>("getMenuInflater()") {
            @Override
            public MenuInflater call(final Object... args) {
                return mActivity.getMenuInflater_super();
            }
        });
    }

    public File getNoBackupFilesDir() {
        return callFunction("getNoBackupFilesDir()", new PluginMethodFunction<File>() {
            @Override
            public File call(final ActivitySuperFunction<File> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getNoBackupFilesDir(superCall);

            }
        }, new ActivitySuperFunction<File>("getNoBackupFilesDir()") {
            @Override
            public File call(final Object... args) {
                return mActivity.getNoBackupFilesDir_super();
            }
        });
    }

    public File getObbDir() {
        return callFunction("getObbDir()", new PluginMethodFunction<File>() {
            @Override
            public File call(final ActivitySuperFunction<File> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getObbDir(superCall);

            }
        }, new ActivitySuperFunction<File>("getObbDir()") {
            @Override
            public File call(final Object... args) {
                return mActivity.getObbDir_super();
            }
        });
    }

    public File[] getObbDirs() {
        return callFunction("getObbDirs()", new PluginMethodFunction<File[]>() {
            @Override
            public File[] call(final ActivitySuperFunction<File[]> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getObbDirs(superCall);

            }
        }, new ActivitySuperFunction<File[]>("getObbDirs()") {
            @Override
            public File[] call(final Object... args) {
                return mActivity.getObbDirs_super();
            }
        });
    }

    public String getPackageCodePath() {
        return callFunction("getPackageCodePath()", new PluginMethodFunction<String>() {
            @Override
            public String call(final ActivitySuperFunction<String> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getPackageCodePath(superCall);

            }
        }, new ActivitySuperFunction<String>("getPackageCodePath()") {
            @Override
            public String call(final Object... args) {
                return mActivity.getPackageCodePath_super();
            }
        });
    }

    public PackageManager getPackageManager() {
        return callFunction("getPackageManager()", new PluginMethodFunction<PackageManager>() {
            @Override
            public PackageManager call(final ActivitySuperFunction<PackageManager> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getPackageManager(superCall);

            }
        }, new ActivitySuperFunction<PackageManager>("getPackageManager()") {
            @Override
            public PackageManager call(final Object... args) {
                return mActivity.getPackageManager_super();
            }
        });
    }

    public String getPackageName() {
        return callFunction("getPackageName()", new PluginMethodFunction<String>() {
            @Override
            public String call(final ActivitySuperFunction<String> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getPackageName(superCall);

            }
        }, new ActivitySuperFunction<String>("getPackageName()") {
            @Override
            public String call(final Object... args) {
                return mActivity.getPackageName_super();
            }
        });
    }

    public String getPackageResourcePath() {
        return callFunction("getPackageResourcePath()", new PluginMethodFunction<String>() {
            @Override
            public String call(final ActivitySuperFunction<String> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getPackageResourcePath(superCall);

            }
        }, new ActivitySuperFunction<String>("getPackageResourcePath()") {
            @Override
            public String call(final Object... args) {
                return mActivity.getPackageResourcePath_super();
            }
        });
    }

    public Intent getParentActivityIntent() {
        return callFunction("getParentActivityIntent()", new PluginMethodFunction<Intent>() {
            @Override
            public Intent call(final ActivitySuperFunction<Intent> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getParentActivityIntent(superCall);

            }
        }, new ActivitySuperFunction<Intent>("getParentActivityIntent()") {
            @Override
            public Intent call(final Object... args) {
                return mActivity.getParentActivityIntent_super();
            }
        });
    }

    public SharedPreferences getPreferences(final int mode) {
        return callFunction("getPreferences(int)", new PluginMethodFunction<SharedPreferences>() {
            @Override
            public SharedPreferences call(final ActivitySuperFunction<SharedPreferences> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getPreferences(superCall, (int) args[0]);

            }
        }, new ActivitySuperFunction<SharedPreferences>("getPreferences(int)") {
            @Override
            public SharedPreferences call(final Object... args) {
                return mActivity.getPreferences_super((int) args[0]);
            }
        }, mode);
    }

    public Uri getReferrer() {
        return callFunction("getReferrer()", new PluginMethodFunction<Uri>() {
            @Override
            public Uri call(final ActivitySuperFunction<Uri> superCall, final ActivityPlugin plugin,
                    final Object... args) {

                return plugin.getReferrer(superCall);

            }
        }, new ActivitySuperFunction<Uri>("getReferrer()") {
            @Override
            public Uri call(final Object... args) {
                return mActivity.getReferrer_super();
            }
        });
    }

    public int getRequestedOrientation() {
        return callFunction("getRequestedOrientation()", new PluginMethodFunction<Integer>() {
            @Override
            public Integer call(final ActivitySuperFunction<Integer> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getRequestedOrientation(superCall);

            }
        }, new ActivitySuperFunction<Integer>("getRequestedOrientation()") {
            @Override
            public Integer call(final Object... args) {
                return mActivity.getRequestedOrientation_super();
            }
        });
    }

    public Resources getResources() {
        return callFunction("getResources()", new PluginMethodFunction<Resources>() {
            @Override
            public Resources call(final ActivitySuperFunction<Resources> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getResources(superCall);

            }
        }, new ActivitySuperFunction<Resources>("getResources()") {
            @Override
            public Resources call(final Object... args) {
                return mActivity.getResources_super();
            }
        });
    }

    public SharedPreferences getSharedPreferences(final String name, final int mode) {
        return callFunction("getSharedPreferences(String, int)",
                new PluginMethodFunction<SharedPreferences>() {
                    @Override
                    public SharedPreferences call(
                            final ActivitySuperFunction<SharedPreferences> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin
                                .getSharedPreferences(superCall, (String) args[0], (int) args[1]);

                    }
                },
                new ActivitySuperFunction<SharedPreferences>("getSharedPreferences(String, int)") {
                    @Override
                    public SharedPreferences call(final Object... args) {
                        return mActivity
                                .getSharedPreferences_super((String) args[0], (int) args[1]);
                    }
                }, name, mode);
    }

    public ActionBar getSupportActionBar() {
        return callFunction("getSupportActionBar()", new PluginMethodFunction<ActionBar>() {
            @Override
            public ActionBar call(final ActivitySuperFunction<ActionBar> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getSupportActionBar(superCall);

            }
        }, new ActivitySuperFunction<ActionBar>("getSupportActionBar()") {
            @Override
            public ActionBar call(final Object... args) {
                return mActivity.getSupportActionBar_super();
            }
        });
    }

    public FragmentManager getSupportFragmentManager() {
        return callFunction("getSupportFragmentManager()",
                new PluginMethodFunction<FragmentManager>() {
                    @Override
                    public FragmentManager call(
                            final ActivitySuperFunction<FragmentManager> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.getSupportFragmentManager(superCall);

                    }
                }, new ActivitySuperFunction<FragmentManager>("getSupportFragmentManager()") {
                    @Override
                    public FragmentManager call(final Object... args) {
                        return mActivity.getSupportFragmentManager_super();
                    }
                });
    }

    public LoaderManager getSupportLoaderManager() {
        return callFunction("getSupportLoaderManager()", new PluginMethodFunction<LoaderManager>() {
            @Override
            public LoaderManager call(final ActivitySuperFunction<LoaderManager> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getSupportLoaderManager(superCall);

            }
        }, new ActivitySuperFunction<LoaderManager>("getSupportLoaderManager()") {
            @Override
            public LoaderManager call(final Object... args) {
                return mActivity.getSupportLoaderManager_super();
            }
        });
    }

    public Intent getSupportParentActivityIntent() {
        return callFunction("getSupportParentActivityIntent()", new PluginMethodFunction<Intent>() {
            @Override
            public Intent call(final ActivitySuperFunction<Intent> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getSupportParentActivityIntent(superCall);

            }
        }, new ActivitySuperFunction<Intent>("getSupportParentActivityIntent()") {
            @Override
            public Intent call(final Object... args) {
                return mActivity.getSupportParentActivityIntent_super();
            }
        });
    }

    public Object getSystemService(@NonNull final String name) {
        return callFunction("getSystemService(String)", new PluginMethodFunction<Object>() {
            @Override
            public Object call(final ActivitySuperFunction<Object> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getSystemService(superCall, (String) args[0]);

            }
        }, new ActivitySuperFunction<Object>("getSystemService(String)") {
            @Override
            public Object call(final Object... args) {
                return mActivity.getSystemService_super((String) args[0]);
            }
        }, name);
    }

    public String getSystemServiceName(final Class<?> serviceClass) {
        return callFunction("getSystemServiceName(Class<?>)", new PluginMethodFunction<String>() {
            @Override
            public String call(final ActivitySuperFunction<String> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getSystemServiceName(superCall, (Class<?>) args[0]);

            }
        }, new ActivitySuperFunction<String>("getSystemServiceName(Class<?>)") {
            @Override
            public String call(final Object... args) {
                return mActivity.getSystemServiceName_super((Class<?>) args[0]);
            }
        }, serviceClass);
    }

    public int getTaskId() {
        return callFunction("getTaskId()", new PluginMethodFunction<Integer>() {
            @Override
            public Integer call(final ActivitySuperFunction<Integer> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getTaskId(superCall);

            }
        }, new ActivitySuperFunction<Integer>("getTaskId()") {
            @Override
            public Integer call(final Object... args) {
                return mActivity.getTaskId_super();
            }
        });
    }

    public Resources.Theme getTheme() {
        return callFunction("getTheme()", new PluginMethodFunction<Resources.Theme>() {
            @Override
            public Resources.Theme call(final ActivitySuperFunction<Resources.Theme> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getTheme(superCall);

            }
        }, new ActivitySuperFunction<Resources.Theme>("getTheme()") {
            @Override
            public Resources.Theme call(final Object... args) {
                return mActivity.getTheme_super();
            }
        });
    }

    public VoiceInteractor getVoiceInteractor() {
        return callFunction("getVoiceInteractor()", new PluginMethodFunction<VoiceInteractor>() {
            @Override
            public VoiceInteractor call(final ActivitySuperFunction<VoiceInteractor> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getVoiceInteractor(superCall);

            }
        }, new ActivitySuperFunction<VoiceInteractor>("getVoiceInteractor()") {
            @Override
            public VoiceInteractor call(final Object... args) {
                return mActivity.getVoiceInteractor_super();
            }
        });
    }

    public Drawable getWallpaper() {
        return callFunction("getWallpaper()", new PluginMethodFunction<Drawable>() {
            @Override
            public Drawable call(final ActivitySuperFunction<Drawable> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getWallpaper(superCall);

            }
        }, new ActivitySuperFunction<Drawable>("getWallpaper()") {
            @Override
            public Drawable call(final Object... args) {
                return mActivity.getWallpaper_super();
            }
        });
    }

    public int getWallpaperDesiredMinimumHeight() {
        return callFunction("getWallpaperDesiredMinimumHeight()",
                new PluginMethodFunction<Integer>() {
                    @Override
                    public Integer call(final ActivitySuperFunction<Integer> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.getWallpaperDesiredMinimumHeight(superCall);

                    }
                }, new ActivitySuperFunction<Integer>("getWallpaperDesiredMinimumHeight()") {
                    @Override
                    public Integer call(final Object... args) {
                        return mActivity.getWallpaperDesiredMinimumHeight_super();
                    }
                });
    }

    public int getWallpaperDesiredMinimumWidth() {
        return callFunction("getWallpaperDesiredMinimumWidth()",
                new PluginMethodFunction<Integer>() {
                    @Override
                    public Integer call(final ActivitySuperFunction<Integer> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.getWallpaperDesiredMinimumWidth(superCall);

                    }
                }, new ActivitySuperFunction<Integer>("getWallpaperDesiredMinimumWidth()") {
                    @Override
                    public Integer call(final Object... args) {
                        return mActivity.getWallpaperDesiredMinimumWidth_super();
                    }
                });
    }

    public Window getWindow() {
        return callFunction("getWindow()", new PluginMethodFunction<Window>() {
            @Override
            public Window call(final ActivitySuperFunction<Window> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getWindow(superCall);

            }
        }, new ActivitySuperFunction<Window>("getWindow()") {
            @Override
            public Window call(final Object... args) {
                return mActivity.getWindow_super();
            }
        });
    }

    public WindowManager getWindowManager() {
        return callFunction("getWindowManager()", new PluginMethodFunction<WindowManager>() {
            @Override
            public WindowManager call(final ActivitySuperFunction<WindowManager> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getWindowManager(superCall);

            }
        }, new ActivitySuperFunction<WindowManager>("getWindowManager()") {
            @Override
            public WindowManager call(final Object... args) {
                return mActivity.getWindowManager_super();
            }
        });
    }

    public void grantUriPermission(final String toPackage, final Uri uri, final int modeFlags) {
        callHook("grantUriPermission(String, Uri, int)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.grantUriPermission(superCall, (String) args[0], (Uri) args[1],
                        (int) args[2]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.grantUriPermission_super((String) args[0], (Uri) args[1], (int) args[2]);
            }
        }, toPackage, uri, modeFlags);
    }

    public boolean hasWindowFocus() {
        return callFunction("hasWindowFocus()", new PluginMethodFunction<Boolean>() {
            @Override
            public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.hasWindowFocus(superCall);

            }
        }, new ActivitySuperFunction<Boolean>("hasWindowFocus()") {
            @Override
            public Boolean call(final Object... args) {
                return mActivity.hasWindowFocus_super();
            }
        });
    }

    public void invalidateOptionsMenu() {
        callHook("invalidateOptionsMenu()", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.invalidateOptionsMenu(superCall);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.invalidateOptionsMenu_super();
            }
        });
    }

    public boolean isChangingConfigurations() {
        return callFunction("isChangingConfigurations()", new PluginMethodFunction<Boolean>() {
            @Override
            public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.isChangingConfigurations(superCall);

            }
        }, new ActivitySuperFunction<Boolean>("isChangingConfigurations()") {
            @Override
            public Boolean call(final Object... args) {
                return mActivity.isChangingConfigurations_super();
            }
        });
    }

    public boolean isDestroyed() {
        return callFunction("isDestroyed()", new PluginMethodFunction<Boolean>() {
            @Override
            public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.isDestroyed(superCall);

            }
        }, new ActivitySuperFunction<Boolean>("isDestroyed()") {
            @Override
            public Boolean call(final Object... args) {
                return mActivity.isDestroyed_super();
            }
        });
    }

    public boolean isFinishing() {
        return callFunction("isFinishing()", new PluginMethodFunction<Boolean>() {
            @Override
            public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.isFinishing(superCall);

            }
        }, new ActivitySuperFunction<Boolean>("isFinishing()") {
            @Override
            public Boolean call(final Object... args) {
                return mActivity.isFinishing_super();
            }
        });
    }

    public boolean isImmersive() {
        return callFunction("isImmersive()", new PluginMethodFunction<Boolean>() {
            @Override
            public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.isImmersive(superCall);

            }
        }, new ActivitySuperFunction<Boolean>("isImmersive()") {
            @Override
            public Boolean call(final Object... args) {
                return mActivity.isImmersive_super();
            }
        });
    }

    public boolean isRestricted() {
        return callFunction("isRestricted()", new PluginMethodFunction<Boolean>() {
            @Override
            public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.isRestricted(superCall);

            }
        }, new ActivitySuperFunction<Boolean>("isRestricted()") {
            @Override
            public Boolean call(final Object... args) {
                return mActivity.isRestricted_super();
            }
        });
    }

    public boolean isTaskRoot() {
        return callFunction("isTaskRoot()", new PluginMethodFunction<Boolean>() {
            @Override
            public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.isTaskRoot(superCall);

            }
        }, new ActivitySuperFunction<Boolean>("isTaskRoot()") {
            @Override
            public Boolean call(final Object... args) {
                return mActivity.isTaskRoot_super();
            }
        });
    }

    public boolean isVoiceInteraction() {
        return callFunction("isVoiceInteraction()", new PluginMethodFunction<Boolean>() {
            @Override
            public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.isVoiceInteraction(superCall);

            }
        }, new ActivitySuperFunction<Boolean>("isVoiceInteraction()") {
            @Override
            public Boolean call(final Object... args) {
                return mActivity.isVoiceInteraction_super();
            }
        });
    }

    public boolean isVoiceInteractionRoot() {
        return callFunction("isVoiceInteractionRoot()", new PluginMethodFunction<Boolean>() {
            @Override
            public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.isVoiceInteractionRoot(superCall);

            }
        }, new ActivitySuperFunction<Boolean>("isVoiceInteractionRoot()") {
            @Override
            public Boolean call(final Object... args) {
                return mActivity.isVoiceInteractionRoot_super();
            }
        });
    }

    public boolean moveTaskToBack(final boolean nonRoot) {
        return callFunction("moveTaskToBack(boolean)", new PluginMethodFunction<Boolean>() {
            @Override
            public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.moveTaskToBack(superCall, (boolean) args[0]);

            }
        }, new ActivitySuperFunction<Boolean>("moveTaskToBack(boolean)") {
            @Override
            public Boolean call(final Object... args) {
                return mActivity.moveTaskToBack_super((boolean) args[0]);
            }
        }, nonRoot);
    }

    public boolean navigateUpTo(final Intent upIntent) {
        return callFunction("navigateUpTo(Intent)", new PluginMethodFunction<Boolean>() {
            @Override
            public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.navigateUpTo(superCall, (Intent) args[0]);

            }
        }, new ActivitySuperFunction<Boolean>("navigateUpTo(Intent)") {
            @Override
            public Boolean call(final Object... args) {
                return mActivity.navigateUpTo_super((Intent) args[0]);
            }
        }, upIntent);
    }

    public boolean navigateUpToFromChild(final Activity child, final Intent upIntent) {
        return callFunction("navigateUpToFromChild(Activity, Intent)",
                new PluginMethodFunction<Boolean>() {
                    @Override
                    public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.navigateUpToFromChild(superCall, (Activity) args[0],
                                (Intent) args[1]);

                    }
                }, new ActivitySuperFunction<Boolean>("navigateUpToFromChild(Activity, Intent)") {
                    @Override
                    public Boolean call(final Object... args) {
                        return mActivity
                                .navigateUpToFromChild_super((Activity) args[0], (Intent) args[1]);
                    }
                }, child, upIntent);
    }

    public void onActionModeFinished(final android.view.ActionMode mode) {
        callHook("onActionModeFinished(android.view.ActionMode)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onActionModeFinished(superCall, (android.view.ActionMode) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onActionModeFinished_super((android.view.ActionMode) args[0]);
            }
        }, mode);
    }

    public void onActionModeStarted(final android.view.ActionMode mode) {
        callHook("onActionModeStarted(android.view.ActionMode)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onActionModeStarted(superCall, (android.view.ActionMode) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onActionModeStarted_super((android.view.ActionMode) args[0]);
            }
        }, mode);
    }

    public void onActivityReenter(final int resultCode, final Intent data) {
        callHook("onActivityReenter(int, Intent)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onActivityReenter(superCall, (int) args[0], (Intent) args[1]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onActivityReenter_super((int) args[0], (Intent) args[1]);
            }
        }, resultCode, data);
    }

    public void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        callHook("onActivityResult(int, int, Intent)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onActivityResult(superCall, (int) args[0], (int) args[1], (Intent) args[2]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onActivityResult_super((int) args[0], (int) args[1], (Intent) args[2]);
            }
        }, requestCode, resultCode, data);
    }

    public void onApplyThemeResource(final Resources.Theme theme, final int resid,
            final boolean first) {
        callHook("onApplyThemeResource(Resources.Theme, int, boolean)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onApplyThemeResource(superCall, (Resources.Theme) args[0], (int) args[1],
                        (boolean) args[2]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onApplyThemeResource_super((Resources.Theme) args[0], (int) args[1],
                        (boolean) args[2]);
            }
        }, theme, resid, first);
    }

    public void onAttachFragment(final Fragment fragment) {
        callHook("onAttachFragment(Fragment)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onAttachFragment(superCall, (Fragment) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onAttachFragment_super((Fragment) args[0]);
            }
        }, fragment);
    }

    public void onAttachFragment(final android.app.Fragment fragment) {
        callHook("onAttachFragment(android.app.Fragment)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onAttachFragment(superCall, (android.app.Fragment) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onAttachFragment_super((android.app.Fragment) args[0]);
            }
        }, fragment);
    }

    public void onAttachedToWindow() {
        callHook("onAttachedToWindow()", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onAttachedToWindow(superCall);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onAttachedToWindow_super();
            }
        });
    }

    public void onBackPressed() {
        callHook("onBackPressed()", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onBackPressed(superCall);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onBackPressed_super();
            }
        });
    }

    public void onChildTitleChanged(final Activity childActivity, final CharSequence title) {
        callHook("onChildTitleChanged(Activity, CharSequence)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onChildTitleChanged(superCall, (Activity) args[0], (CharSequence) args[1]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onChildTitleChanged_super((Activity) args[0], (CharSequence) args[1]);
            }
        }, childActivity, title);
    }

    public void onConfigurationChanged(final Configuration newConfig) {
        callHook("onConfigurationChanged(Configuration)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onConfigurationChanged(superCall, (Configuration) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onConfigurationChanged_super((Configuration) args[0]);
            }
        }, newConfig);
    }

    public void onContentChanged() {
        callHook("onContentChanged()", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onContentChanged(superCall);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onContentChanged_super();
            }
        });
    }

    public boolean onContextItemSelected(final MenuItem item) {
        return callFunction("onContextItemSelected(MenuItem)", new PluginMethodFunction<Boolean>() {
            @Override
            public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.onContextItemSelected(superCall, (MenuItem) args[0]);

            }
        }, new ActivitySuperFunction<Boolean>("onContextItemSelected(MenuItem)") {
            @Override
            public Boolean call(final Object... args) {
                return mActivity.onContextItemSelected_super((MenuItem) args[0]);
            }
        }, item);
    }

    public void onContextMenuClosed(final Menu menu) {
        callHook("onContextMenuClosed(Menu)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onContextMenuClosed(superCall, (Menu) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onContextMenuClosed_super((Menu) args[0]);
            }
        }, menu);
    }

    public void onCreate(@Nullable final Bundle savedInstanceState) {
        callHook("onCreate(Bundle)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onCreate(superCall, (Bundle) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onCreate_super((Bundle) args[0]);
            }
        }, savedInstanceState);
    }

    public void onCreate(final Bundle savedInstanceState, final PersistableBundle persistentState) {
        callHook("onCreate(Bundle, PersistableBundle)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onCreate(superCall, (Bundle) args[0], (PersistableBundle) args[1]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onCreate_super((Bundle) args[0], (PersistableBundle) args[1]);
            }
        }, savedInstanceState, persistentState);
    }

    public void onCreateContextMenu(final ContextMenu menu, final View v,
            final ContextMenu.ContextMenuInfo menuInfo) {
        callHook("onCreateContextMenu(ContextMenu, View, ContextMenu.ContextMenuInfo)",
                new PluginMethodAction() {
                    @Override
                    public void call(final ActivitySuperFunction superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.onCreateContextMenu(superCall, (ContextMenu) args[0], (View) args[1],
                                (ContextMenu.ContextMenuInfo) args[2]);
                    }
                }, new ActivitySuperAction() {
                    @Override
                    public void call(final Object... args) {
                        mActivity.onCreateContextMenu_super((ContextMenu) args[0], (View) args[1],
                                (ContextMenu.ContextMenuInfo) args[2]);
                    }
                }, menu, v, menuInfo);
    }

    public CharSequence onCreateDescription() {
        return callFunction("onCreateDescription()", new PluginMethodFunction<CharSequence>() {
            @Override
            public CharSequence call(final ActivitySuperFunction<CharSequence> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.onCreateDescription(superCall);

            }
        }, new ActivitySuperFunction<CharSequence>("onCreateDescription()") {
            @Override
            public CharSequence call(final Object... args) {
                return mActivity.onCreateDescription_super();
            }
        });
    }

    public Dialog onCreateDialog(final int id) {
        return callFunction("onCreateDialog(int)", new PluginMethodFunction<Dialog>() {
            @Override
            public Dialog call(final ActivitySuperFunction<Dialog> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.onCreateDialog(superCall, (int) args[0]);

            }
        }, new ActivitySuperFunction<Dialog>("onCreateDialog(int)") {
            @Override
            public Dialog call(final Object... args) {
                return mActivity.onCreateDialog_super((int) args[0]);
            }
        }, id);
    }

    public Dialog onCreateDialog(final int id, final Bundle args) {
        return callFunction("onCreateDialog(int, Bundle)", new PluginMethodFunction<Dialog>() {
            @Override
            public Dialog call(final ActivitySuperFunction<Dialog> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.onCreateDialog(superCall, (int) args[0], (Bundle) args[1]);

            }
        }, new ActivitySuperFunction<Dialog>("onCreateDialog(int, Bundle)") {
            @Override
            public Dialog call(final Object... args) {
                return mActivity.onCreateDialog_super((int) args[0], (Bundle) args[1]);
            }
        }, id, args);
    }

    public void onCreateNavigateUpTaskStack(final TaskStackBuilder builder) {
        callHook("onCreateNavigateUpTaskStack(TaskStackBuilder)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onCreateNavigateUpTaskStack(superCall, (TaskStackBuilder) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onCreateNavigateUpTaskStack_super((TaskStackBuilder) args[0]);
            }
        }, builder);
    }

    public boolean onCreateOptionsMenu(final Menu menu) {
        return callFunction("onCreateOptionsMenu(Menu)", new PluginMethodFunction<Boolean>() {
            @Override
            public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.onCreateOptionsMenu(superCall, (Menu) args[0]);

            }
        }, new ActivitySuperFunction<Boolean>("onCreateOptionsMenu(Menu)") {
            @Override
            public Boolean call(final Object... args) {
                return mActivity.onCreateOptionsMenu_super((Menu) args[0]);
            }
        }, menu);
    }

    public boolean onCreatePanelMenu(final int featureId, final Menu menu) {
        return callFunction("onCreatePanelMenu(int, Menu)", new PluginMethodFunction<Boolean>() {
            @Override
            public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.onCreatePanelMenu(superCall, (int) args[0], (Menu) args[1]);

            }
        }, new ActivitySuperFunction<Boolean>("onCreatePanelMenu(int, Menu)") {
            @Override
            public Boolean call(final Object... args) {
                return mActivity.onCreatePanelMenu_super((int) args[0], (Menu) args[1]);
            }
        }, featureId, menu);
    }

    public View onCreatePanelView(final int featureId) {
        return callFunction("onCreatePanelView(int)", new PluginMethodFunction<View>() {
            @Override
            public View call(final ActivitySuperFunction<View> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.onCreatePanelView(superCall, (int) args[0]);

            }
        }, new ActivitySuperFunction<View>("onCreatePanelView(int)") {
            @Override
            public View call(final Object... args) {
                return mActivity.onCreatePanelView_super((int) args[0]);
            }
        }, featureId);
    }

    public void onCreateSupportNavigateUpTaskStack(
            @NonNull final android.support.v4.app.TaskStackBuilder builder) {
        callHook("onCreateSupportNavigateUpTaskStack(android.support.v4.app.TaskStackBuilder)",
                new PluginMethodAction() {
                    @Override
                    public void call(final ActivitySuperFunction superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.onCreateSupportNavigateUpTaskStack(superCall,
                                (android.support.v4.app.TaskStackBuilder) args[0]);
                    }
                }, new ActivitySuperAction() {
                    @Override
                    public void call(final Object... args) {
                        mActivity.onCreateSupportNavigateUpTaskStack_super(
                                (android.support.v4.app.TaskStackBuilder) args[0]);
                    }
                }, builder);
    }

    public boolean onCreateThumbnail(final Bitmap outBitmap, final Canvas canvas) {
        return callFunction("onCreateThumbnail(Bitmap, Canvas)",
                new PluginMethodFunction<Boolean>() {
                    @Override
                    public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin
                                .onCreateThumbnail(superCall, (Bitmap) args[0], (Canvas) args[1]);

                    }
                }, new ActivitySuperFunction<Boolean>("onCreateThumbnail(Bitmap, Canvas)") {
                    @Override
                    public Boolean call(final Object... args) {
                        return mActivity
                                .onCreateThumbnail_super((Bitmap) args[0], (Canvas) args[1]);
                    }
                }, outBitmap, canvas);
    }

    public View onCreateView(final View parent, final String name, final Context context,
            final AttributeSet attrs) {
        return callFunction("onCreateView(View, String, Context, AttributeSet)",
                new PluginMethodFunction<View>() {
                    @Override
                    public View call(final ActivitySuperFunction<View> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.onCreateView(superCall, (View) args[0], (String) args[1],
                                (Context) args[2], (AttributeSet) args[3]);

                    }
                }, new ActivitySuperFunction<View>(
                        "onCreateView(View, String, Context, AttributeSet)") {
                    @Override
                    public View call(final Object... args) {
                        return mActivity.onCreateView_super((View) args[0], (String) args[1],
                                (Context) args[2], (AttributeSet) args[3]);
                    }
                }, parent, name, context, attrs);
    }

    public View onCreateView(final String name, final Context context, final AttributeSet attrs) {
        return callFunction("onCreateView(String, Context, AttributeSet)",
                new PluginMethodFunction<View>() {
                    @Override
                    public View call(final ActivitySuperFunction<View> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.onCreateView(superCall, (String) args[0], (Context) args[1],
                                (AttributeSet) args[2]);

                    }
                }, new ActivitySuperFunction<View>("onCreateView(String, Context, AttributeSet)") {
                    @Override
                    public View call(final Object... args) {
                        return mActivity.onCreateView_super((String) args[0], (Context) args[1],
                                (AttributeSet) args[2]);
                    }
                }, name, context, attrs);
    }

    public void onDestroy() {
        callHook("onDestroy()", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onDestroy(superCall);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onDestroy_super();
            }
        });
    }

    public void onDetachedFromWindow() {
        callHook("onDetachedFromWindow()", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onDetachedFromWindow(superCall);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onDetachedFromWindow_super();
            }
        });
    }

    public void onEnterAnimationComplete() {
        callHook("onEnterAnimationComplete()", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onEnterAnimationComplete(superCall);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onEnterAnimationComplete_super();
            }
        });
    }

    public boolean onGenericMotionEvent(final MotionEvent event) {
        return callFunction("onGenericMotionEvent(MotionEvent)",
                new PluginMethodFunction<Boolean>() {
                    @Override
                    public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.onGenericMotionEvent(superCall, (MotionEvent) args[0]);

                    }
                }, new ActivitySuperFunction<Boolean>("onGenericMotionEvent(MotionEvent)") {
                    @Override
                    public Boolean call(final Object... args) {
                        return mActivity.onGenericMotionEvent_super((MotionEvent) args[0]);
                    }
                }, event);
    }

    public boolean onKeyDown(final int keyCode, final KeyEvent event) {
        return callFunction("onKeyDown(int, KeyEvent)", new PluginMethodFunction<Boolean>() {
            @Override
            public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.onKeyDown(superCall, (int) args[0], (KeyEvent) args[1]);

            }
        }, new ActivitySuperFunction<Boolean>("onKeyDown(int, KeyEvent)") {
            @Override
            public Boolean call(final Object... args) {
                return mActivity.onKeyDown_super((int) args[0], (KeyEvent) args[1]);
            }
        }, keyCode, event);
    }

    public boolean onKeyLongPress(final int keyCode, final KeyEvent event) {
        return callFunction("onKeyLongPress(int, KeyEvent)", new PluginMethodFunction<Boolean>() {
            @Override
            public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.onKeyLongPress(superCall, (int) args[0], (KeyEvent) args[1]);

            }
        }, new ActivitySuperFunction<Boolean>("onKeyLongPress(int, KeyEvent)") {
            @Override
            public Boolean call(final Object... args) {
                return mActivity.onKeyLongPress_super((int) args[0], (KeyEvent) args[1]);
            }
        }, keyCode, event);
    }

    public boolean onKeyMultiple(final int keyCode, final int repeatCount, final KeyEvent event) {
        return callFunction("onKeyMultiple(int, int, KeyEvent)",
                new PluginMethodFunction<Boolean>() {
                    @Override
                    public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.onKeyMultiple(superCall, (int) args[0], (int) args[1],
                                (KeyEvent) args[2]);

                    }
                }, new ActivitySuperFunction<Boolean>("onKeyMultiple(int, int, KeyEvent)") {
                    @Override
                    public Boolean call(final Object... args) {
                        return mActivity.onKeyMultiple_super((int) args[0], (int) args[1],
                                (KeyEvent) args[2]);
                    }
                }, keyCode, repeatCount, event);
    }

    public boolean onKeyShortcut(final int keyCode, final KeyEvent event) {
        return callFunction("onKeyShortcut(int, KeyEvent)", new PluginMethodFunction<Boolean>() {
            @Override
            public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.onKeyShortcut(superCall, (int) args[0], (KeyEvent) args[1]);

            }
        }, new ActivitySuperFunction<Boolean>("onKeyShortcut(int, KeyEvent)") {
            @Override
            public Boolean call(final Object... args) {
                return mActivity.onKeyShortcut_super((int) args[0], (KeyEvent) args[1]);
            }
        }, keyCode, event);
    }

    public boolean onKeyUp(final int keyCode, final KeyEvent event) {
        return callFunction("onKeyUp(int, KeyEvent)", new PluginMethodFunction<Boolean>() {
            @Override
            public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.onKeyUp(superCall, (int) args[0], (KeyEvent) args[1]);

            }
        }, new ActivitySuperFunction<Boolean>("onKeyUp(int, KeyEvent)") {
            @Override
            public Boolean call(final Object... args) {
                return mActivity.onKeyUp_super((int) args[0], (KeyEvent) args[1]);
            }
        }, keyCode, event);
    }

    public void onLowMemory() {
        callHook("onLowMemory()", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onLowMemory(superCall);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onLowMemory_super();
            }
        });
    }

    public boolean onMenuOpened(final int featureId, final Menu menu) {
        return callFunction("onMenuOpened(int, Menu)", new PluginMethodFunction<Boolean>() {
            @Override
            public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.onMenuOpened(superCall, (int) args[0], (Menu) args[1]);

            }
        }, new ActivitySuperFunction<Boolean>("onMenuOpened(int, Menu)") {
            @Override
            public Boolean call(final Object... args) {
                return mActivity.onMenuOpened_super((int) args[0], (Menu) args[1]);
            }
        }, featureId, menu);
    }

    public boolean onNavigateUp() {
        return callFunction("onNavigateUp()", new PluginMethodFunction<Boolean>() {
            @Override
            public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.onNavigateUp(superCall);

            }
        }, new ActivitySuperFunction<Boolean>("onNavigateUp()") {
            @Override
            public Boolean call(final Object... args) {
                return mActivity.onNavigateUp_super();
            }
        });
    }

    public boolean onNavigateUpFromChild(final Activity child) {
        return callFunction("onNavigateUpFromChild(Activity)", new PluginMethodFunction<Boolean>() {
            @Override
            public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.onNavigateUpFromChild(superCall, (Activity) args[0]);

            }
        }, new ActivitySuperFunction<Boolean>("onNavigateUpFromChild(Activity)") {
            @Override
            public Boolean call(final Object... args) {
                return mActivity.onNavigateUpFromChild_super((Activity) args[0]);
            }
        }, child);
    }

    public void onNewIntent(final Intent intent) {
        callHook("onNewIntent(Intent)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onNewIntent(superCall, (Intent) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onNewIntent_super((Intent) args[0]);
            }
        }, intent);
    }

    public boolean onOptionsItemSelected(final MenuItem item) {
        return callFunction("onOptionsItemSelected(MenuItem)", new PluginMethodFunction<Boolean>() {
            @Override
            public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.onOptionsItemSelected(superCall, (MenuItem) args[0]);

            }
        }, new ActivitySuperFunction<Boolean>("onOptionsItemSelected(MenuItem)") {
            @Override
            public Boolean call(final Object... args) {
                return mActivity.onOptionsItemSelected_super((MenuItem) args[0]);
            }
        }, item);
    }

    public void onOptionsMenuClosed(final Menu menu) {
        callHook("onOptionsMenuClosed(Menu)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onOptionsMenuClosed(superCall, (Menu) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onOptionsMenuClosed_super((Menu) args[0]);
            }
        }, menu);
    }

    public void onPanelClosed(final int featureId, final Menu menu) {
        callHook("onPanelClosed(int, Menu)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onPanelClosed(superCall, (int) args[0], (Menu) args[1]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onPanelClosed_super((int) args[0], (Menu) args[1]);
            }
        }, featureId, menu);
    }

    public void onPause() {
        callHook("onPause()", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onPause(superCall);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onPause_super();
            }
        });
    }

    public void onPostCreate(@Nullable final Bundle savedInstanceState) {
        callHook("onPostCreate(Bundle)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onPostCreate(superCall, (Bundle) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onPostCreate_super((Bundle) args[0]);
            }
        }, savedInstanceState);
    }

    public void onPostCreate(final Bundle savedInstanceState,
            final PersistableBundle persistentState) {
        callHook("onPostCreate(Bundle, PersistableBundle)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onPostCreate(superCall, (Bundle) args[0], (PersistableBundle) args[1]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onPostCreate_super((Bundle) args[0], (PersistableBundle) args[1]);
            }
        }, savedInstanceState, persistentState);
    }

    public void onPostResume() {
        callHook("onPostResume()", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onPostResume(superCall);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onPostResume_super();
            }
        });
    }

    public void onPrepareDialog(final int id, final Dialog dialog) {
        callHook("onPrepareDialog(int, Dialog)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onPrepareDialog(superCall, (int) args[0], (Dialog) args[1]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onPrepareDialog_super((int) args[0], (Dialog) args[1]);
            }
        }, id, dialog);
    }

    public void onPrepareDialog(final int id, final Dialog dialog, final Bundle args) {
        callHook("onPrepareDialog(int, Dialog, Bundle)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onPrepareDialog(superCall, (int) args[0], (Dialog) args[1],
                        (Bundle) args[2]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onPrepareDialog_super((int) args[0], (Dialog) args[1], (Bundle) args[2]);
            }
        }, id, dialog, args);
    }

    public void onPrepareNavigateUpTaskStack(final TaskStackBuilder builder) {
        callHook("onPrepareNavigateUpTaskStack(TaskStackBuilder)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onPrepareNavigateUpTaskStack(superCall, (TaskStackBuilder) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onPrepareNavigateUpTaskStack_super((TaskStackBuilder) args[0]);
            }
        }, builder);
    }

    public boolean onPrepareOptionsMenu(final Menu menu) {
        return callFunction("onPrepareOptionsMenu(Menu)", new PluginMethodFunction<Boolean>() {
            @Override
            public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.onPrepareOptionsMenu(superCall, (Menu) args[0]);

            }
        }, new ActivitySuperFunction<Boolean>("onPrepareOptionsMenu(Menu)") {
            @Override
            public Boolean call(final Object... args) {
                return mActivity.onPrepareOptionsMenu_super((Menu) args[0]);
            }
        }, menu);
    }

    public boolean onPrepareOptionsPanel(final View view, final Menu menu) {
        return callFunction("onPrepareOptionsPanel(View, Menu)",
                new PluginMethodFunction<Boolean>() {
                    @Override
                    public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin
                                .onPrepareOptionsPanel(superCall, (View) args[0], (Menu) args[1]);

                    }
                }, new ActivitySuperFunction<Boolean>("onPrepareOptionsPanel(View, Menu)") {
                    @Override
                    public Boolean call(final Object... args) {
                        return mActivity
                                .onPrepareOptionsPanel_super((View) args[0], (Menu) args[1]);
                    }
                }, view, menu);
    }

    public boolean onPreparePanel(final int featureId, final View view, final Menu menu) {
        return callFunction("onPreparePanel(int, View, Menu)", new PluginMethodFunction<Boolean>() {
            @Override
            public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin
                        .onPreparePanel(superCall, (int) args[0], (View) args[1], (Menu) args[2]);

            }
        }, new ActivitySuperFunction<Boolean>("onPreparePanel(int, View, Menu)") {
            @Override
            public Boolean call(final Object... args) {
                return mActivity
                        .onPreparePanel_super((int) args[0], (View) args[1], (Menu) args[2]);
            }
        }, featureId, view, menu);
    }

    public void onPrepareSupportNavigateUpTaskStack(
            @NonNull final android.support.v4.app.TaskStackBuilder builder) {
        callHook("onPrepareSupportNavigateUpTaskStack(android.support.v4.app.TaskStackBuilder)",
                new PluginMethodAction() {
                    @Override
                    public void call(final ActivitySuperFunction superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.onPrepareSupportNavigateUpTaskStack(superCall,
                                (android.support.v4.app.TaskStackBuilder) args[0]);
                    }
                }, new ActivitySuperAction() {
                    @Override
                    public void call(final Object... args) {
                        mActivity.onPrepareSupportNavigateUpTaskStack_super(
                                (android.support.v4.app.TaskStackBuilder) args[0]);
                    }
                }, builder);
    }

    public void onProvideAssistContent(final AssistContent outContent) {
        callHook("onProvideAssistContent(AssistContent)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onProvideAssistContent(superCall, (AssistContent) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onProvideAssistContent_super((AssistContent) args[0]);
            }
        }, outContent);
    }

    public void onProvideAssistData(final Bundle data) {
        callHook("onProvideAssistData(Bundle)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onProvideAssistData(superCall, (Bundle) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onProvideAssistData_super((Bundle) args[0]);
            }
        }, data);
    }

    public Uri onProvideReferrer() {
        return callFunction("onProvideReferrer()", new PluginMethodFunction<Uri>() {
            @Override
            public Uri call(final ActivitySuperFunction<Uri> superCall, final ActivityPlugin plugin,
                    final Object... args) {

                return plugin.onProvideReferrer(superCall);

            }
        }, new ActivitySuperFunction<Uri>("onProvideReferrer()") {
            @Override
            public Uri call(final Object... args) {
                return mActivity.onProvideReferrer_super();
            }
        });
    }

    public void onRequestPermissionsResult(final int requestCode,
            @NonNull final String[] permissions, @NonNull final int[] grantResults) {
        callHook("onRequestPermissionsResult(int, String[], int[])", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onRequestPermissionsResult(superCall, (int) args[0], (String[]) args[1],
                        (int[]) args[2]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onRequestPermissionsResult_super((int) args[0], (String[]) args[1],
                        (int[]) args[2]);
            }
        }, requestCode, permissions, grantResults);
    }

    public void onRestart() {
        callHook("onRestart()", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onRestart(superCall);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onRestart_super();
            }
        });
    }

    public void onRestoreInstanceState(final Bundle savedInstanceState) {
        callHook("onRestoreInstanceState(Bundle)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onRestoreInstanceState(superCall, (Bundle) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onRestoreInstanceState_super((Bundle) args[0]);
            }
        }, savedInstanceState);
    }

    public void onRestoreInstanceState(final Bundle savedInstanceState,
            final PersistableBundle persistentState) {
        callHook("onRestoreInstanceState(Bundle, PersistableBundle)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onRestoreInstanceState(superCall, (Bundle) args[0],
                        (PersistableBundle) args[1]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onRestoreInstanceState_super((Bundle) args[0],
                        (PersistableBundle) args[1]);
            }
        }, savedInstanceState, persistentState);
    }

    public void onResume() {
        callHook("onResume()", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onResume(superCall);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onResume_super();
            }
        });
    }

    public void onResumeFragments() {
        callHook("onResumeFragments()", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onResumeFragments(superCall);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onResumeFragments_super();
            }
        });
    }

    public void onSaveInstanceState(final Bundle outState) {
        callHook("onSaveInstanceState(Bundle)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onSaveInstanceState(superCall, (Bundle) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onSaveInstanceState_super((Bundle) args[0]);
            }
        }, outState);
    }

    public void onSaveInstanceState(final Bundle outState,
            final PersistableBundle outPersistentState) {
        callHook("onSaveInstanceState(Bundle, PersistableBundle)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onSaveInstanceState(superCall, (Bundle) args[0],
                        (PersistableBundle) args[1]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onSaveInstanceState_super((Bundle) args[0], (PersistableBundle) args[1]);
            }
        }, outState, outPersistentState);
    }

    public boolean onSearchRequested(final SearchEvent searchEvent) {
        return callFunction("onSearchRequested(SearchEvent)", new PluginMethodFunction<Boolean>() {
            @Override
            public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.onSearchRequested(superCall, (SearchEvent) args[0]);

            }
        }, new ActivitySuperFunction<Boolean>("onSearchRequested(SearchEvent)") {
            @Override
            public Boolean call(final Object... args) {
                return mActivity.onSearchRequested_super((SearchEvent) args[0]);
            }
        }, searchEvent);
    }

    public boolean onSearchRequested() {
        return callFunction("onSearchRequested()", new PluginMethodFunction<Boolean>() {
            @Override
            public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.onSearchRequested(superCall);

            }
        }, new ActivitySuperFunction<Boolean>("onSearchRequested()") {
            @Override
            public Boolean call(final Object... args) {
                return mActivity.onSearchRequested_super();
            }
        });
    }

    public void onStart() {
        callHook("onStart()", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onStart(superCall);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onStart_super();
            }
        });
    }

    public void onStateNotSaved() {
        callHook("onStateNotSaved()", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onStateNotSaved(superCall);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onStateNotSaved_super();
            }
        });
    }

    public void onStop() {
        callHook("onStop()", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onStop(superCall);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onStop_super();
            }
        });
    }

    public void onSupportActionModeFinished(@NonNull final ActionMode mode) {
        callHook("onSupportActionModeFinished(ActionMode)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onSupportActionModeFinished(superCall, (ActionMode) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onSupportActionModeFinished_super((ActionMode) args[0]);
            }
        }, mode);
    }

    public void onSupportActionModeStarted(@NonNull final ActionMode mode) {
        callHook("onSupportActionModeStarted(ActionMode)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onSupportActionModeStarted(superCall, (ActionMode) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onSupportActionModeStarted_super((ActionMode) args[0]);
            }
        }, mode);
    }

    public void onSupportContentChanged() {
        callHook("onSupportContentChanged()", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onSupportContentChanged(superCall);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onSupportContentChanged_super();
            }
        });
    }

    public boolean onSupportNavigateUp() {
        return callFunction("onSupportNavigateUp()", new PluginMethodFunction<Boolean>() {
            @Override
            public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.onSupportNavigateUp(superCall);

            }
        }, new ActivitySuperFunction<Boolean>("onSupportNavigateUp()") {
            @Override
            public Boolean call(final Object... args) {
                return mActivity.onSupportNavigateUp_super();
            }
        });
    }

    public void onTitleChanged(final CharSequence title, final int color) {
        callHook("onTitleChanged(CharSequence, int)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onTitleChanged(superCall, (CharSequence) args[0], (int) args[1]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onTitleChanged_super((CharSequence) args[0], (int) args[1]);
            }
        }, title, color);
    }

    public boolean onTouchEvent(final MotionEvent event) {
        return callFunction("onTouchEvent(MotionEvent)", new PluginMethodFunction<Boolean>() {
            @Override
            public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.onTouchEvent(superCall, (MotionEvent) args[0]);

            }
        }, new ActivitySuperFunction<Boolean>("onTouchEvent(MotionEvent)") {
            @Override
            public Boolean call(final Object... args) {
                return mActivity.onTouchEvent_super((MotionEvent) args[0]);
            }
        }, event);
    }

    public boolean onTrackballEvent(final MotionEvent event) {
        return callFunction("onTrackballEvent(MotionEvent)", new PluginMethodFunction<Boolean>() {
            @Override
            public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.onTrackballEvent(superCall, (MotionEvent) args[0]);

            }
        }, new ActivitySuperFunction<Boolean>("onTrackballEvent(MotionEvent)") {
            @Override
            public Boolean call(final Object... args) {
                return mActivity.onTrackballEvent_super((MotionEvent) args[0]);
            }
        }, event);
    }

    public void onTrimMemory(final int level) {
        callHook("onTrimMemory(int)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onTrimMemory(superCall, (int) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onTrimMemory_super((int) args[0]);
            }
        }, level);
    }

    public void onUserInteraction() {
        callHook("onUserInteraction()", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onUserInteraction(superCall);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onUserInteraction_super();
            }
        });
    }

    public void onUserLeaveHint() {
        callHook("onUserLeaveHint()", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onUserLeaveHint(superCall);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onUserLeaveHint_super();
            }
        });
    }

    public void onVisibleBehindCanceled() {
        callHook("onVisibleBehindCanceled()", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onVisibleBehindCanceled(superCall);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onVisibleBehindCanceled_super();
            }
        });
    }

    public void onWindowAttributesChanged(final WindowManager.LayoutParams params) {
        callHook("onWindowAttributesChanged(WindowManager.LayoutParams)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onWindowAttributesChanged(superCall, (WindowManager.LayoutParams) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onWindowAttributesChanged_super((WindowManager.LayoutParams) args[0]);
            }
        }, params);
    }

    public void onWindowFocusChanged(final boolean hasFocus) {
        callHook("onWindowFocusChanged(boolean)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onWindowFocusChanged(superCall, (boolean) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.onWindowFocusChanged_super((boolean) args[0]);
            }
        }, hasFocus);
    }

    public android.view.ActionMode onWindowStartingActionMode(
            final android.view.ActionMode.Callback callback) {
        return callFunction("onWindowStartingActionMode(android.view.ActionMode.Callback)",
                new PluginMethodFunction<android.view.ActionMode>() {
                    @Override
                    public android.view.ActionMode call(
                            final ActivitySuperFunction<android.view.ActionMode> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.onWindowStartingActionMode(superCall,
                                (android.view.ActionMode.Callback) args[0]);

                    }
                }, new ActivitySuperFunction<android.view.ActionMode>(
                        "onWindowStartingActionMode(android.view.ActionMode.Callback)") {
                    @Override
                    public android.view.ActionMode call(final Object... args) {
                        return mActivity.onWindowStartingActionMode_super(
                                (android.view.ActionMode.Callback) args[0]);
                    }
                }, callback);
    }

    public android.view.ActionMode onWindowStartingActionMode(
            final android.view.ActionMode.Callback callback, final int type) {
        return callFunction("onWindowStartingActionMode(android.view.ActionMode.Callback, int)",
                new PluginMethodFunction<android.view.ActionMode>() {
                    @Override
                    public android.view.ActionMode call(
                            final ActivitySuperFunction<android.view.ActionMode> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.onWindowStartingActionMode(superCall,
                                (android.view.ActionMode.Callback) args[0], (int) args[1]);

                    }
                }, new ActivitySuperFunction<android.view.ActionMode>(
                        "onWindowStartingActionMode(android.view.ActionMode.Callback, int)") {
                    @Override
                    public android.view.ActionMode call(final Object... args) {
                        return mActivity.onWindowStartingActionMode_super(
                                (android.view.ActionMode.Callback) args[0], (int) args[1]);
                    }
                }, callback, type);
    }

    public ActionMode onWindowStartingSupportActionMode(
            @NonNull final ActionMode.Callback callback) {
        return callFunction("onWindowStartingSupportActionMode(ActionMode.Callback)",
                new PluginMethodFunction<ActionMode>() {
                    @Override
                    public ActionMode call(final ActivitySuperFunction<ActionMode> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.onWindowStartingSupportActionMode(superCall,
                                (ActionMode.Callback) args[0]);

                    }
                }, new ActivitySuperFunction<ActionMode>(
                        "onWindowStartingSupportActionMode(ActionMode.Callback)") {
                    @Override
                    public ActionMode call(final Object... args) {
                        return mActivity.onWindowStartingSupportActionMode_super(
                                (ActionMode.Callback) args[0]);
                    }
                }, callback);
    }

    public void openContextMenu(final View view) {
        callHook("openContextMenu(View)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.openContextMenu(superCall, (View) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.openContextMenu_super((View) args[0]);
            }
        }, view);
    }

    public FileInputStream openFileInput(final String name) {
        return callFunction("openFileInput(String)", new PluginMethodFunction<FileInputStream>() {
            @Override
            public FileInputStream call(final ActivitySuperFunction<FileInputStream> superCall,
                    final ActivityPlugin plugin, final Object... args) {
                try {
                    return plugin.openFileInput(superCall, (String) args[0]);
                } catch (FileNotFoundException e) {
                    throw new SuppressedException(e);
                }

            }
        }, new ActivitySuperFunction<FileInputStream>("openFileInput(String)") {
            @Override
            public FileInputStream call(final Object... args) {
                try {
                    return mActivity.openFileInput_super((String) args[0]);
                } catch (FileNotFoundException e) {
                    throw new SuppressedException(e);
                }
            }
        }, name);
    }

    public FileOutputStream openFileOutput(final String name, final int mode) {
        return callFunction("openFileOutput(String, int)",
                new PluginMethodFunction<FileOutputStream>() {
                    @Override
                    public FileOutputStream call(
                            final ActivitySuperFunction<FileOutputStream> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        try {
                            return plugin
                                    .openFileOutput(superCall, (String) args[0], (int) args[1]);
                        } catch (FileNotFoundException e) {
                            throw new SuppressedException(e);
                        }

                    }
                }, new ActivitySuperFunction<FileOutputStream>("openFileOutput(String, int)") {
                    @Override
                    public FileOutputStream call(final Object... args) {
                        try {
                            return mActivity.openFileOutput_super((String) args[0], (int) args[1]);
                        } catch (FileNotFoundException e) {
                            throw new SuppressedException(e);
                        }
                    }
                }, name, mode);
    }

    public void openOptionsMenu() {
        callHook("openOptionsMenu()", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.openOptionsMenu(superCall);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.openOptionsMenu_super();
            }
        });
    }

    public SQLiteDatabase openOrCreateDatabase(final String name, final int mode,
            final SQLiteDatabase.CursorFactory factory) {
        return callFunction("openOrCreateDatabase(String, int, SQLiteDatabase.CursorFactory)",
                new PluginMethodFunction<SQLiteDatabase>() {
                    @Override
                    public SQLiteDatabase call(
                            final ActivitySuperFunction<SQLiteDatabase> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin
                                .openOrCreateDatabase(superCall, (String) args[0], (int) args[1],
                                        (SQLiteDatabase.CursorFactory) args[2]);

                    }
                }, new ActivitySuperFunction<SQLiteDatabase>(
                        "openOrCreateDatabase(String, int, SQLiteDatabase.CursorFactory)") {
                    @Override
                    public SQLiteDatabase call(final Object... args) {
                        return mActivity.openOrCreateDatabase_super((String) args[0], (int) args[1],
                                (SQLiteDatabase.CursorFactory) args[2]);
                    }
                }, name, mode, factory);
    }

    public SQLiteDatabase openOrCreateDatabase(final String name, final int mode,
            final SQLiteDatabase.CursorFactory factory, final DatabaseErrorHandler errorHandler) {
        return callFunction(
                "openOrCreateDatabase(String, int, SQLiteDatabase.CursorFactory, DatabaseErrorHandler)",
                new PluginMethodFunction<SQLiteDatabase>() {
                    @Override
                    public SQLiteDatabase call(
                            final ActivitySuperFunction<SQLiteDatabase> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin
                                .openOrCreateDatabase(superCall, (String) args[0], (int) args[1],
                                        (SQLiteDatabase.CursorFactory) args[2],
                                        (DatabaseErrorHandler) args[3]);

                    }
                }, new ActivitySuperFunction<SQLiteDatabase>(
                        "openOrCreateDatabase(String, int, SQLiteDatabase.CursorFactory, DatabaseErrorHandler)") {
                    @Override
                    public SQLiteDatabase call(final Object... args) {
                        return mActivity.openOrCreateDatabase_super((String) args[0], (int) args[1],
                                (SQLiteDatabase.CursorFactory) args[2],
                                (DatabaseErrorHandler) args[3]);
                    }
                }, name, mode, factory, errorHandler);
    }

    public void overridePendingTransition(final int enterAnim, final int exitAnim) {
        callHook("overridePendingTransition(int, int)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.overridePendingTransition(superCall, (int) args[0], (int) args[1]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.overridePendingTransition_super((int) args[0], (int) args[1]);
            }
        }, enterAnim, exitAnim);
    }

    public Drawable peekWallpaper() {
        return callFunction("peekWallpaper()", new PluginMethodFunction<Drawable>() {
            @Override
            public Drawable call(final ActivitySuperFunction<Drawable> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.peekWallpaper(superCall);

            }
        }, new ActivitySuperFunction<Drawable>("peekWallpaper()") {
            @Override
            public Drawable call(final Object... args) {
                return mActivity.peekWallpaper_super();
            }
        });
    }

    public void postponeEnterTransition() {
        callHook("postponeEnterTransition()", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.postponeEnterTransition(superCall);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.postponeEnterTransition_super();
            }
        });
    }

    public void recreate() {
        callHook("recreate()", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.recreate(superCall);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.recreate_super();
            }
        });
    }

    public void registerComponentCallbacks(final ComponentCallbacks callback) {
        callHook("registerComponentCallbacks(ComponentCallbacks)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.registerComponentCallbacks(superCall, (ComponentCallbacks) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.registerComponentCallbacks_super((ComponentCallbacks) args[0]);
            }
        }, callback);
    }

    public void registerForContextMenu(final View view) {
        callHook("registerForContextMenu(View)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.registerForContextMenu(superCall, (View) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.registerForContextMenu_super((View) args[0]);
            }
        }, view);
    }

    public Intent registerReceiver(final BroadcastReceiver receiver, final IntentFilter filter) {
        return callFunction("registerReceiver(BroadcastReceiver, IntentFilter)",
                new PluginMethodFunction<Intent>() {
                    @Override
                    public Intent call(final ActivitySuperFunction<Intent> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.registerReceiver(superCall, (BroadcastReceiver) args[0],
                                (IntentFilter) args[1]);

                    }
                }, new ActivitySuperFunction<Intent>(
                        "registerReceiver(BroadcastReceiver, IntentFilter)") {
                    @Override
                    public Intent call(final Object... args) {
                        return mActivity.registerReceiver_super((BroadcastReceiver) args[0],
                                (IntentFilter) args[1]);
                    }
                }, receiver, filter);
    }

    public Intent registerReceiver(final BroadcastReceiver receiver, final IntentFilter filter,
            final String broadcastPermission, final Handler scheduler) {
        return callFunction("registerReceiver(BroadcastReceiver, IntentFilter, String, Handler)",
                new PluginMethodFunction<Intent>() {
                    @Override
                    public Intent call(final ActivitySuperFunction<Intent> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.registerReceiver(superCall, (BroadcastReceiver) args[0],
                                (IntentFilter) args[1], (String) args[2], (Handler) args[3]);

                    }
                }, new ActivitySuperFunction<Intent>(
                        "registerReceiver(BroadcastReceiver, IntentFilter, String, Handler)") {
                    @Override
                    public Intent call(final Object... args) {
                        return mActivity.registerReceiver_super((BroadcastReceiver) args[0],
                                (IntentFilter) args[1], (String) args[2], (Handler) args[3]);
                    }
                }, receiver, filter, broadcastPermission, scheduler);
    }

    public boolean releaseInstance() {
        return callFunction("releaseInstance()", new PluginMethodFunction<Boolean>() {
            @Override
            public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.releaseInstance(superCall);

            }
        }, new ActivitySuperFunction<Boolean>("releaseInstance()") {
            @Override
            public Boolean call(final Object... args) {
                return mActivity.releaseInstance_super();
            }
        });
    }

    public void removeStickyBroadcast(final Intent intent) {
        callHook("removeStickyBroadcast(Intent)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.removeStickyBroadcast(superCall, (Intent) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.removeStickyBroadcast_super((Intent) args[0]);
            }
        }, intent);
    }

    public void removeStickyBroadcastAsUser(final Intent intent, final UserHandle user) {
        callHook("removeStickyBroadcastAsUser(Intent, UserHandle)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.removeStickyBroadcastAsUser(superCall, (Intent) args[0],
                        (UserHandle) args[1]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.removeStickyBroadcastAsUser_super((Intent) args[0], (UserHandle) args[1]);
            }
        }, intent, user);
    }

    public void reportFullyDrawn() {
        callHook("reportFullyDrawn()", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.reportFullyDrawn(superCall);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.reportFullyDrawn_super();
            }
        });
    }

    public boolean requestVisibleBehind(final boolean visible) {
        return callFunction("requestVisibleBehind(boolean)", new PluginMethodFunction<Boolean>() {
            @Override
            public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.requestVisibleBehind(superCall, (boolean) args[0]);

            }
        }, new ActivitySuperFunction<Boolean>("requestVisibleBehind(boolean)") {
            @Override
            public Boolean call(final Object... args) {
                return mActivity.requestVisibleBehind_super((boolean) args[0]);
            }
        }, visible);
    }

    public void revokeUriPermission(final Uri uri, final int modeFlags) {
        callHook("revokeUriPermission(Uri, int)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.revokeUriPermission(superCall, (Uri) args[0], (int) args[1]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.revokeUriPermission_super((Uri) args[0], (int) args[1]);
            }
        }, uri, modeFlags);
    }

    public void sendBroadcast(final Intent intent) {
        callHook("sendBroadcast(Intent)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.sendBroadcast(superCall, (Intent) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.sendBroadcast_super((Intent) args[0]);
            }
        }, intent);
    }

    public void sendBroadcast(final Intent intent, final String receiverPermission) {
        callHook("sendBroadcast(Intent, String)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.sendBroadcast(superCall, (Intent) args[0], (String) args[1]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.sendBroadcast_super((Intent) args[0], (String) args[1]);
            }
        }, intent, receiverPermission);
    }

    public void sendBroadcastAsUser(final Intent intent, final UserHandle user) {
        callHook("sendBroadcastAsUser(Intent, UserHandle)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.sendBroadcastAsUser(superCall, (Intent) args[0], (UserHandle) args[1]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.sendBroadcastAsUser_super((Intent) args[0], (UserHandle) args[1]);
            }
        }, intent, user);
    }

    public void sendBroadcastAsUser(final Intent intent, final UserHandle user,
            final String receiverPermission) {
        callHook("sendBroadcastAsUser(Intent, UserHandle, String)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.sendBroadcastAsUser(superCall, (Intent) args[0], (UserHandle) args[1],
                        (String) args[2]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.sendBroadcastAsUser_super((Intent) args[0], (UserHandle) args[1],
                        (String) args[2]);
            }
        }, intent, user, receiverPermission);
    }

    public void sendOrderedBroadcast(final Intent intent, final String receiverPermission) {
        callHook("sendOrderedBroadcast(Intent, String)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.sendOrderedBroadcast(superCall, (Intent) args[0], (String) args[1]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.sendOrderedBroadcast_super((Intent) args[0], (String) args[1]);
            }
        }, intent, receiverPermission);
    }

    public void sendOrderedBroadcast(final Intent intent, final String receiverPermission,
            final BroadcastReceiver resultReceiver, final Handler scheduler, final int initialCode,
            final String initialData, final Bundle initialExtras) {
        callHook(
                "sendOrderedBroadcast(Intent, String, BroadcastReceiver, Handler, int, String, Bundle)",
                new PluginMethodAction() {
                    @Override
                    public void call(final ActivitySuperFunction superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.sendOrderedBroadcast(superCall, (Intent) args[0], (String) args[1],
                                (BroadcastReceiver) args[2], (Handler) args[3], (int) args[4],
                                (String) args[5], (Bundle) args[6]);
                    }
                }, new ActivitySuperAction() {
                    @Override
                    public void call(final Object... args) {
                        mActivity.sendOrderedBroadcast_super((Intent) args[0], (String) args[1],
                                (BroadcastReceiver) args[2], (Handler) args[3], (int) args[4],
                                (String) args[5], (Bundle) args[6]);
                    }
                }, intent, receiverPermission, resultReceiver, scheduler, initialCode, initialData,
                initialExtras);
    }

    public void sendOrderedBroadcastAsUser(final Intent intent, final UserHandle user,
            final String receiverPermission, final BroadcastReceiver resultReceiver,
            final Handler scheduler, final int initialCode, final String initialData,
            final Bundle initialExtras) {
        callHook(
                "sendOrderedBroadcastAsUser(Intent, UserHandle, String, BroadcastReceiver, Handler, int, String, Bundle)",
                new PluginMethodAction() {
                    @Override
                    public void call(final ActivitySuperFunction superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.sendOrderedBroadcastAsUser(superCall, (Intent) args[0],
                                (UserHandle) args[1], (String) args[2], (BroadcastReceiver) args[3],
                                (Handler) args[4], (int) args[5], (String) args[6],
                                (Bundle) args[7]);
                    }
                }, new ActivitySuperAction() {
                    @Override
                    public void call(final Object... args) {
                        mActivity.sendOrderedBroadcastAsUser_super((Intent) args[0],
                                (UserHandle) args[1], (String) args[2], (BroadcastReceiver) args[3],
                                (Handler) args[4], (int) args[5], (String) args[6],
                                (Bundle) args[7]);
                    }
                }, intent, user, receiverPermission, resultReceiver, scheduler, initialCode,
                initialData, initialExtras);
    }

    public void sendStickyBroadcast(final Intent intent) {
        callHook("sendStickyBroadcast(Intent)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.sendStickyBroadcast(superCall, (Intent) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.sendStickyBroadcast_super((Intent) args[0]);
            }
        }, intent);
    }

    public void sendStickyBroadcastAsUser(final Intent intent, final UserHandle user) {
        callHook("sendStickyBroadcastAsUser(Intent, UserHandle)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.sendStickyBroadcastAsUser(superCall, (Intent) args[0], (UserHandle) args[1]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.sendStickyBroadcastAsUser_super((Intent) args[0], (UserHandle) args[1]);
            }
        }, intent, user);
    }

    public void sendStickyOrderedBroadcast(final Intent intent,
            final BroadcastReceiver resultReceiver, final Handler scheduler, final int initialCode,
            final String initialData, final Bundle initialExtras) {
        callHook(
                "sendStickyOrderedBroadcast(Intent, BroadcastReceiver, Handler, int, String, Bundle)",
                new PluginMethodAction() {
                    @Override
                    public void call(final ActivitySuperFunction superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.sendStickyOrderedBroadcast(superCall, (Intent) args[0],
                                (BroadcastReceiver) args[1], (Handler) args[2], (int) args[3],
                                (String) args[4], (Bundle) args[5]);
                    }
                }, new ActivitySuperAction() {
                    @Override
                    public void call(final Object... args) {
                        mActivity.sendStickyOrderedBroadcast_super((Intent) args[0],
                                (BroadcastReceiver) args[1], (Handler) args[2], (int) args[3],
                                (String) args[4], (Bundle) args[5]);
                    }
                }, intent, resultReceiver, scheduler, initialCode, initialData, initialExtras);
    }

    public void sendStickyOrderedBroadcastAsUser(final Intent intent, final UserHandle user,
            final BroadcastReceiver resultReceiver, final Handler scheduler, final int initialCode,
            final String initialData, final Bundle initialExtras) {
        callHook(
                "sendStickyOrderedBroadcastAsUser(Intent, UserHandle, BroadcastReceiver, Handler, int, String, Bundle)",
                new PluginMethodAction() {
                    @Override
                    public void call(final ActivitySuperFunction superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.sendStickyOrderedBroadcastAsUser(superCall, (Intent) args[0],
                                (UserHandle) args[1], (BroadcastReceiver) args[2],
                                (Handler) args[3], (int) args[4], (String) args[5],
                                (Bundle) args[6]);
                    }
                }, new ActivitySuperAction() {
                    @Override
                    public void call(final Object... args) {
                        mActivity.sendStickyOrderedBroadcastAsUser_super((Intent) args[0],
                                (UserHandle) args[1], (BroadcastReceiver) args[2],
                                (Handler) args[3], (int) args[4], (String) args[5],
                                (Bundle) args[6]);
                    }
                }, intent, user, resultReceiver, scheduler, initialCode, initialData,
                initialExtras);
    }

    public void setActionBar(final Toolbar toolbar) {
        callHook("setActionBar(Toolbar)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.setActionBar(superCall, (Toolbar) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.setActionBar_super((Toolbar) args[0]);
            }
        }, toolbar);
    }

    public void setContentTransitionManager(final TransitionManager tm) {
        callHook("setContentTransitionManager(TransitionManager)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.setContentTransitionManager(superCall, (TransitionManager) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.setContentTransitionManager_super((TransitionManager) args[0]);
            }
        }, tm);
    }

    public void setContentView(@LayoutRes final int layoutResID) {
        callHook("setContentView(int)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.setContentView(superCall, (int) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.setContentView_super((int) args[0]);
            }
        }, layoutResID);
    }

    public void setContentView(final View view) {
        callHook("setContentView(View)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.setContentView(superCall, (View) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.setContentView_super((View) args[0]);
            }
        }, view);
    }

    public void setContentView(final View view, final ViewGroup.LayoutParams params) {
        callHook("setContentView(View, ViewGroup.LayoutParams)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.setContentView(superCall, (View) args[0], (ViewGroup.LayoutParams) args[1]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.setContentView_super((View) args[0], (ViewGroup.LayoutParams) args[1]);
            }
        }, view, params);
    }

    public void setEnterSharedElementCallback(final SharedElementCallback callback) {
        callHook("setEnterSharedElementCallback(SharedElementCallback)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.setEnterSharedElementCallback(superCall, (SharedElementCallback) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.setEnterSharedElementCallback_super((SharedElementCallback) args[0]);
            }
        }, callback);
    }

    public void setEnterSharedElementCallback(final android.app.SharedElementCallback callback) {
        callHook("setEnterSharedElementCallback(android.app.SharedElementCallback)",
                new PluginMethodAction() {
                    @Override
                    public void call(final ActivitySuperFunction superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.setEnterSharedElementCallback(superCall,
                                (android.app.SharedElementCallback) args[0]);
                    }
                }, new ActivitySuperAction() {
                    @Override
                    public void call(final Object... args) {
                        mActivity.setEnterSharedElementCallback_super(
                                (android.app.SharedElementCallback) args[0]);
                    }
                }, callback);
    }

    public void setExitSharedElementCallback(final SharedElementCallback listener) {
        callHook("setExitSharedElementCallback(SharedElementCallback)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.setExitSharedElementCallback(superCall, (SharedElementCallback) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.setExitSharedElementCallback_super((SharedElementCallback) args[0]);
            }
        }, listener);
    }

    public void setExitSharedElementCallback(final android.app.SharedElementCallback callback) {
        callHook("setExitSharedElementCallback(android.app.SharedElementCallback)",
                new PluginMethodAction() {
                    @Override
                    public void call(final ActivitySuperFunction superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.setExitSharedElementCallback(superCall,
                                (android.app.SharedElementCallback) args[0]);
                    }
                }, new ActivitySuperAction() {
                    @Override
                    public void call(final Object... args) {
                        mActivity.setExitSharedElementCallback_super(
                                (android.app.SharedElementCallback) args[0]);
                    }
                }, callback);
    }

    public void setFinishOnTouchOutside(final boolean finish) {
        callHook("setFinishOnTouchOutside(boolean)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.setFinishOnTouchOutside(superCall, (boolean) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.setFinishOnTouchOutside_super((boolean) args[0]);
            }
        }, finish);
    }

    public void setImmersive(final boolean i) {
        callHook("setImmersive(boolean)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.setImmersive(superCall, (boolean) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.setImmersive_super((boolean) args[0]);
            }
        }, i);
    }

    public void setIntent(final Intent newIntent) {
        callHook("setIntent(Intent)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.setIntent(superCall, (Intent) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.setIntent_super((Intent) args[0]);
            }
        }, newIntent);
    }

    public void setRequestedOrientation(final int requestedOrientation) {
        callHook("setRequestedOrientation(int)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.setRequestedOrientation(superCall, (int) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.setRequestedOrientation_super((int) args[0]);
            }
        }, requestedOrientation);
    }

    public void setSupportActionBar(@Nullable final android.support.v7.widget.Toolbar toolbar) {
        callHook("setSupportActionBar(android.support.v7.widget.Toolbar)",
                new PluginMethodAction() {
                    @Override
                    public void call(final ActivitySuperFunction superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.setSupportActionBar(superCall,
                                (android.support.v7.widget.Toolbar) args[0]);
                    }
                }, new ActivitySuperAction() {
                    @Override
                    public void call(final Object... args) {
                        mActivity.setSupportActionBar_super(
                                (android.support.v7.widget.Toolbar) args[0]);
                    }
                }, toolbar);
    }

    public void setSupportProgress(final int progress) {
        callHook("setSupportProgress(int)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.setSupportProgress(superCall, (int) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.setSupportProgress_super((int) args[0]);
            }
        }, progress);
    }

    public void setSupportProgressBarIndeterminate(final boolean indeterminate) {
        callHook("setSupportProgressBarIndeterminate(boolean)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.setSupportProgressBarIndeterminate(superCall, (boolean) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.setSupportProgressBarIndeterminate_super((boolean) args[0]);
            }
        }, indeterminate);
    }

    public void setSupportProgressBarIndeterminateVisibility(final boolean visible) {
        callHook("setSupportProgressBarIndeterminateVisibility(boolean)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.setSupportProgressBarIndeterminateVisibility(superCall, (boolean) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.setSupportProgressBarIndeterminateVisibility_super((boolean) args[0]);
            }
        }, visible);
    }

    public void setSupportProgressBarVisibility(final boolean visible) {
        callHook("setSupportProgressBarVisibility(boolean)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.setSupportProgressBarVisibility(superCall, (boolean) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.setSupportProgressBarVisibility_super((boolean) args[0]);
            }
        }, visible);
    }

    public void setTaskDescription(final ActivityManager.TaskDescription taskDescription) {
        callHook("setTaskDescription(ActivityManager.TaskDescription)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.setTaskDescription(superCall, (ActivityManager.TaskDescription) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.setTaskDescription_super((ActivityManager.TaskDescription) args[0]);
            }
        }, taskDescription);
    }

    public void setTheme(@StyleRes final int resid) {
        callHook("setTheme(int)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.setTheme(superCall, (int) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.setTheme_super((int) args[0]);
            }
        }, resid);
    }

    public void setTitle(final CharSequence title) {
        callHook("setTitle(CharSequence)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.setTitle(superCall, (CharSequence) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.setTitle_super((CharSequence) args[0]);
            }
        }, title);
    }

    public void setTitle(final int titleId) {
        callHook("setTitle(int)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.setTitle(superCall, (int) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.setTitle_super((int) args[0]);
            }
        }, titleId);
    }

    public void setTitleColor(final int textColor) {
        callHook("setTitleColor(int)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.setTitleColor(superCall, (int) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.setTitleColor_super((int) args[0]);
            }
        }, textColor);
    }

    public void setVisible(final boolean visible) {
        callHook("setVisible(boolean)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.setVisible(superCall, (boolean) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.setVisible_super((boolean) args[0]);
            }
        }, visible);
    }

    public void setWallpaper(final Bitmap bitmap) throws IOException {
        callHook("setWallpaper(Bitmap)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                try {
                    plugin.setWallpaper(superCall, (Bitmap) args[0]);
                } catch (IOException e) {
                    throw new SuppressedException(e);
                }
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                try {
                    mActivity.setWallpaper_super((Bitmap) args[0]);
                } catch (IOException e) {
                    throw new SuppressedException(e);
                }
            }
        }, bitmap);
    }

    public void setWallpaper(final InputStream data) throws IOException {
        callHook("setWallpaper(InputStream)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                try {
                    plugin.setWallpaper(superCall, (InputStream) args[0]);
                } catch (IOException e) {
                    throw new SuppressedException(e);
                }
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                try {
                    mActivity.setWallpaper_super((InputStream) args[0]);
                } catch (IOException e) {
                    throw new SuppressedException(e);
                }
            }
        }, data);
    }

    public boolean shouldShowRequestPermissionRationale(@NonNull final String permission) {
        return callFunction("shouldShowRequestPermissionRationale(String)",
                new PluginMethodFunction<Boolean>() {
                    @Override
                    public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin
                                .shouldShowRequestPermissionRationale(superCall, (String) args[0]);

                    }
                },
                new ActivitySuperFunction<Boolean>("shouldShowRequestPermissionRationale(String)") {
                    @Override
                    public Boolean call(final Object... args) {
                        return mActivity
                                .shouldShowRequestPermissionRationale_super((String) args[0]);
                    }
                }, permission);
    }

    public boolean shouldUpRecreateTask(final Intent targetIntent) {
        return callFunction("shouldUpRecreateTask(Intent)", new PluginMethodFunction<Boolean>() {
            @Override
            public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.shouldUpRecreateTask(superCall, (Intent) args[0]);

            }
        }, new ActivitySuperFunction<Boolean>("shouldUpRecreateTask(Intent)") {
            @Override
            public Boolean call(final Object... args) {
                return mActivity.shouldUpRecreateTask_super((Intent) args[0]);
            }
        }, targetIntent);
    }

    public boolean showAssist(final Bundle args) {
        return callFunction("showAssist(Bundle)", new PluginMethodFunction<Boolean>() {
            @Override
            public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.showAssist(superCall, (Bundle) args[0]);

            }
        }, new ActivitySuperFunction<Boolean>("showAssist(Bundle)") {
            @Override
            public Boolean call(final Object... args) {
                return mActivity.showAssist_super((Bundle) args[0]);
            }
        }, args);
    }

    public void showLockTaskEscapeMessage() {
        callHook("showLockTaskEscapeMessage()", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.showLockTaskEscapeMessage(superCall);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.showLockTaskEscapeMessage_super();
            }
        });
    }

    public android.view.ActionMode startActionMode(
            final android.view.ActionMode.Callback callback) {
        return callFunction("startActionMode(android.view.ActionMode.Callback)",
                new PluginMethodFunction<android.view.ActionMode>() {
                    @Override
                    public android.view.ActionMode call(
                            final ActivitySuperFunction<android.view.ActionMode> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.startActionMode(superCall,
                                (android.view.ActionMode.Callback) args[0]);

                    }
                }, new ActivitySuperFunction<android.view.ActionMode>(
                        "startActionMode(android.view.ActionMode.Callback)") {
                    @Override
                    public android.view.ActionMode call(final Object... args) {
                        return mActivity
                                .startActionMode_super((android.view.ActionMode.Callback) args[0]);
                    }
                }, callback);
    }

    public android.view.ActionMode startActionMode(final android.view.ActionMode.Callback callback,
            final int type) {
        return callFunction("startActionMode(android.view.ActionMode.Callback, int)",
                new PluginMethodFunction<android.view.ActionMode>() {
                    @Override
                    public android.view.ActionMode call(
                            final ActivitySuperFunction<android.view.ActionMode> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.startActionMode(superCall,
                                (android.view.ActionMode.Callback) args[0], (int) args[1]);

                    }
                }, new ActivitySuperFunction<android.view.ActionMode>(
                        "startActionMode(android.view.ActionMode.Callback, int)") {
                    @Override
                    public android.view.ActionMode call(final Object... args) {
                        return mActivity
                                .startActionMode_super((android.view.ActionMode.Callback) args[0],
                                        (int) args[1]);
                    }
                }, callback, type);
    }

    public void startActivities(final Intent[] intents) {
        callHook("startActivities(Intent[])", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.startActivities(superCall, (Intent[]) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.startActivities_super((Intent[]) args[0]);
            }
        }, new Object[]{intents});
    }

    public void startActivities(final Intent[] intents, final Bundle options) {
        callHook("startActivities(Intent[], Bundle)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.startActivities(superCall, (Intent[]) args[0], (Bundle) args[1]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.startActivities_super((Intent[]) args[0], (Bundle) args[1]);
            }
        }, intents, options);
    }

    public void startActivity(final Intent intent) {
        callHook("startActivity(Intent)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.startActivity(superCall, (Intent) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.startActivity_super((Intent) args[0]);
            }
        }, intent);
    }

    public void startActivity(final Intent intent, final Bundle options) {
        callHook("startActivity(Intent, Bundle)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.startActivity(superCall, (Intent) args[0], (Bundle) args[1]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.startActivity_super((Intent) args[0], (Bundle) args[1]);
            }
        }, intent, options);
    }

    public void startActivityForResult(final Intent intent, final int requestCode) {
        callHook("startActivityForResult(Intent, int)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.startActivityForResult(superCall, (Intent) args[0], (int) args[1]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.startActivityForResult_super((Intent) args[0], (int) args[1]);
            }
        }, intent, requestCode);
    }

    public void startActivityForResult(final Intent intent, final int requestCode,
            final Bundle options) {
        callHook("startActivityForResult(Intent, int, Bundle)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.startActivityForResult(superCall, (Intent) args[0], (int) args[1],
                        (Bundle) args[2]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.startActivityForResult_super((Intent) args[0], (int) args[1],
                        (Bundle) args[2]);
            }
        }, intent, requestCode, options);
    }

    public void startActivityFromChild(@NonNull final Activity child, final Intent intent,
            final int requestCode) {
        callHook("startActivityFromChild(Activity, Intent, int)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.startActivityFromChild(superCall, (Activity) args[0], (Intent) args[1],
                        (int) args[2]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.startActivityFromChild_super((Activity) args[0], (Intent) args[1],
                        (int) args[2]);
            }
        }, child, intent, requestCode);
    }

    public void startActivityFromChild(@NonNull final Activity child, final Intent intent,
            final int requestCode, final Bundle options) {
        callHook("startActivityFromChild(Activity, Intent, int, Bundle)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.startActivityFromChild(superCall, (Activity) args[0], (Intent) args[1],
                        (int) args[2], (Bundle) args[3]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.startActivityFromChild_super((Activity) args[0], (Intent) args[1],
                        (int) args[2], (Bundle) args[3]);
            }
        }, child, intent, requestCode, options);
    }

    public void startActivityFromFragment(final Fragment fragment, final Intent intent,
            final int requestCode) {
        callHook("startActivityFromFragment(Fragment, Intent, int)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.startActivityFromFragment(superCall, (Fragment) args[0], (Intent) args[1],
                        (int) args[2]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.startActivityFromFragment_super((Fragment) args[0], (Intent) args[1],
                        (int) args[2]);
            }
        }, fragment, intent, requestCode);
    }

    public void startActivityFromFragment(final Fragment fragment, final Intent intent,
            final int requestCode, @Nullable final Bundle options) {
        callHook("startActivityFromFragment(Fragment, Intent, int, Bundle)",
                new PluginMethodAction() {
                    @Override
                    public void call(final ActivitySuperFunction superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.startActivityFromFragment(superCall, (Fragment) args[0],
                                (Intent) args[1], (int) args[2], (Bundle) args[3]);
                    }
                }, new ActivitySuperAction() {
                    @Override
                    public void call(final Object... args) {
                        mActivity.startActivityFromFragment_super((Fragment) args[0],
                                (Intent) args[1], (int) args[2], (Bundle) args[3]);
                    }
                }, fragment, intent, requestCode, options);
    }

    public void startActivityFromFragment(@NonNull final android.app.Fragment fragment,
            final Intent intent, final int requestCode) {
        callHook("startActivityFromFragment(android.app.Fragment, Intent, int)",
                new PluginMethodAction() {
                    @Override
                    public void call(final ActivitySuperFunction superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.startActivityFromFragment(superCall, (android.app.Fragment) args[0],
                                (Intent) args[1], (int) args[2]);
                    }
                }, new ActivitySuperAction() {
                    @Override
                    public void call(final Object... args) {
                        mActivity.startActivityFromFragment_super((android.app.Fragment) args[0],
                                (Intent) args[1], (int) args[2]);
                    }
                }, fragment, intent, requestCode);
    }

    public void startActivityFromFragment(@NonNull final android.app.Fragment fragment,
            final Intent intent, final int requestCode, final Bundle options) {
        callHook("startActivityFromFragment(android.app.Fragment, Intent, int, Bundle)",
                new PluginMethodAction() {
                    @Override
                    public void call(final ActivitySuperFunction superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.startActivityFromFragment(superCall, (android.app.Fragment) args[0],
                                (Intent) args[1], (int) args[2], (Bundle) args[3]);
                    }
                }, new ActivitySuperAction() {
                    @Override
                    public void call(final Object... args) {
                        mActivity.startActivityFromFragment_super((android.app.Fragment) args[0],
                                (Intent) args[1], (int) args[2], (Bundle) args[3]);
                    }
                }, fragment, intent, requestCode, options);
    }

    public boolean startActivityIfNeeded(@NonNull final Intent intent, final int requestCode) {
        return callFunction("startActivityIfNeeded(Intent, int)",
                new PluginMethodFunction<Boolean>() {
                    @Override
                    public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin
                                .startActivityIfNeeded(superCall, (Intent) args[0], (int) args[1]);

                    }
                }, new ActivitySuperFunction<Boolean>("startActivityIfNeeded(Intent, int)") {
                    @Override
                    public Boolean call(final Object... args) {
                        return mActivity
                                .startActivityIfNeeded_super((Intent) args[0], (int) args[1]);
                    }
                }, intent, requestCode);
    }

    public boolean startActivityIfNeeded(@NonNull final Intent intent, final int requestCode,
            final Bundle options) {
        return callFunction("startActivityIfNeeded(Intent, int, Bundle)",
                new PluginMethodFunction<Boolean>() {
                    @Override
                    public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin
                                .startActivityIfNeeded(superCall, (Intent) args[0], (int) args[1],
                                        (Bundle) args[2]);

                    }
                },
                new ActivitySuperFunction<Boolean>("startActivityIfNeeded(Intent, int, Bundle)") {
                    @Override
                    public Boolean call(final Object... args) {
                        return mActivity
                                .startActivityIfNeeded_super((Intent) args[0], (int) args[1],
                                        (Bundle) args[2]);
                    }
                }, intent, requestCode, options);
    }

    public boolean startInstrumentation(final ComponentName className, final String profileFile,
            final Bundle arguments) {
        return callFunction("startInstrumentation(ComponentName, String, Bundle)",
                new PluginMethodFunction<Boolean>() {
                    @Override
                    public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.startInstrumentation(superCall, (ComponentName) args[0],
                                (String) args[1], (Bundle) args[2]);

                    }
                }, new ActivitySuperFunction<Boolean>(
                        "startInstrumentation(ComponentName, String, Bundle)") {
                    @Override
                    public Boolean call(final Object... args) {
                        return mActivity.startInstrumentation_super((ComponentName) args[0],
                                (String) args[1], (Bundle) args[2]);
                    }
                }, className, profileFile, arguments);
    }

    public void startIntentSender(final IntentSender intent, final Intent fillInIntent,
            final int flagsMask, final int flagsValues, final int extraFlags)
            throws IntentSender.SendIntentException {
        callHook("startIntentSender(IntentSender, Intent, int, int, int)",
                new PluginMethodAction() {
                    @Override
                    public void call(final ActivitySuperFunction superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        try {
                            plugin.startIntentSender(superCall, (IntentSender) args[0],
                                    (Intent) args[1], (int) args[2], (int) args[3], (int) args[4]);
                        } catch (IntentSender.SendIntentException e) {
                            throw new SuppressedException(e);
                        }
                    }
                }, new ActivitySuperAction() {
                    @Override
                    public void call(final Object... args) {
                        try {
                            mActivity.startIntentSender_super((IntentSender) args[0],
                                    (Intent) args[1], (int) args[2], (int) args[3], (int) args[4]);
                        } catch (IntentSender.SendIntentException e) {
                            throw new SuppressedException(e);
                        }
                    }
                }, intent, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    public void startIntentSender(final IntentSender intent, final Intent fillInIntent,
            final int flagsMask, final int flagsValues, final int extraFlags, final Bundle options)
            throws IntentSender.SendIntentException {
        callHook("startIntentSender(IntentSender, Intent, int, int, int, Bundle)",
                new PluginMethodAction() {
                    @Override
                    public void call(final ActivitySuperFunction superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        try {
                            plugin.startIntentSender(superCall, (IntentSender) args[0],
                                    (Intent) args[1], (int) args[2], (int) args[3], (int) args[4],
                                    (Bundle) args[5]);
                        } catch (IntentSender.SendIntentException e) {
                            throw new SuppressedException(e);
                        }
                    }
                }, new ActivitySuperAction() {
                    @Override
                    public void call(final Object... args) {
                        try {
                            mActivity.startIntentSender_super((IntentSender) args[0],
                                    (Intent) args[1], (int) args[2], (int) args[3], (int) args[4],
                                    (Bundle) args[5]);
                        } catch (IntentSender.SendIntentException e) {
                            throw new SuppressedException(e);
                        }
                    }
                }, intent, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    public void startIntentSenderForResult(final IntentSender intent, final int requestCode,
            final Intent fillInIntent, final int flagsMask, final int flagsValues,
            final int extraFlags) throws IntentSender.SendIntentException {
        callHook("startIntentSenderForResult(IntentSender, int, Intent, int, int, int)",
                new PluginMethodAction() {
                    @Override
                    public void call(final ActivitySuperFunction superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        try {
                            plugin.startIntentSenderForResult(superCall, (IntentSender) args[0],
                                    (int) args[1], (Intent) args[2], (int) args[3], (int) args[4],
                                    (int) args[5]);
                        } catch (IntentSender.SendIntentException e) {
                            throw new SuppressedException(e);
                        }
                    }
                }, new ActivitySuperAction() {
                    @Override
                    public void call(final Object... args) {
                        try {
                            mActivity.startIntentSenderForResult_super((IntentSender) args[0],
                                    (int) args[1], (Intent) args[2], (int) args[3], (int) args[4],
                                    (int) args[5]);
                        } catch (IntentSender.SendIntentException e) {
                            throw new SuppressedException(e);
                        }
                    }
                }, intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    public void startIntentSenderForResult(final IntentSender intent, final int requestCode,
            final Intent fillInIntent, final int flagsMask, final int flagsValues,
            final int extraFlags, final Bundle options) throws IntentSender.SendIntentException {
        callHook("startIntentSenderForResult(IntentSender, int, Intent, int, int, int, Bundle)",
                new PluginMethodAction() {
                    @Override
                    public void call(final ActivitySuperFunction superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        try {
                            plugin.startIntentSenderForResult(superCall, (IntentSender) args[0],
                                    (int) args[1], (Intent) args[2], (int) args[3], (int) args[4],
                                    (int) args[5], (Bundle) args[6]);
                        } catch (IntentSender.SendIntentException e) {
                            throw new SuppressedException(e);
                        }
                    }
                }, new ActivitySuperAction() {
                    @Override
                    public void call(final Object... args) {
                        try {
                            mActivity.startIntentSenderForResult_super((IntentSender) args[0],
                                    (int) args[1], (Intent) args[2], (int) args[3], (int) args[4],
                                    (int) args[5], (Bundle) args[6]);
                        } catch (IntentSender.SendIntentException e) {
                            throw new SuppressedException(e);
                        }
                    }
                }, intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    public void startIntentSenderFromChild(final Activity child, final IntentSender intent,
            final int requestCode, final Intent fillInIntent, final int flagsMask,
            final int flagsValues, final int extraFlags) throws IntentSender.SendIntentException {
        callHook("startIntentSenderFromChild(Activity, IntentSender, int, Intent, int, int, int)",
                new PluginMethodAction() {
                    @Override
                    public void call(final ActivitySuperFunction superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        try {
                            plugin.startIntentSenderFromChild(superCall, (Activity) args[0],
                                    (IntentSender) args[1], (int) args[2], (Intent) args[3],
                                    (int) args[4], (int) args[5], (int) args[6]);
                        } catch (IntentSender.SendIntentException e) {
                            throw new SuppressedException(e);
                        }
                    }
                }, new ActivitySuperAction() {
                    @Override
                    public void call(final Object... args) {
                        try {
                            mActivity.startIntentSenderFromChild_super((Activity) args[0],
                                    (IntentSender) args[1], (int) args[2], (Intent) args[3],
                                    (int) args[4], (int) args[5], (int) args[6]);
                        } catch (IntentSender.SendIntentException e) {
                            throw new SuppressedException(e);
                        }
                    }
                }, child, intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    public void startIntentSenderFromChild(final Activity child, final IntentSender intent,
            final int requestCode, final Intent fillInIntent, final int flagsMask,
            final int flagsValues, final int extraFlags, final Bundle options)
            throws IntentSender.SendIntentException {
        callHook(
                "startIntentSenderFromChild(Activity, IntentSender, int, Intent, int, int, int, Bundle)",
                new PluginMethodAction() {
                    @Override
                    public void call(final ActivitySuperFunction superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        try {
                            plugin.startIntentSenderFromChild(superCall, (Activity) args[0],
                                    (IntentSender) args[1], (int) args[2], (Intent) args[3],
                                    (int) args[4], (int) args[5], (int) args[6], (Bundle) args[7]);
                        } catch (IntentSender.SendIntentException e) {
                            throw new SuppressedException(e);
                        }
                    }
                }, new ActivitySuperAction() {
                    @Override
                    public void call(final Object... args) {
                        try {
                            mActivity.startIntentSenderFromChild_super((Activity) args[0],
                                    (IntentSender) args[1], (int) args[2], (Intent) args[3],
                                    (int) args[4], (int) args[5], (int) args[6], (Bundle) args[7]);
                        } catch (IntentSender.SendIntentException e) {
                            throw new SuppressedException(e);
                        }
                    }
                }, child, intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags,
                options);
    }

    public void startLockTask() {
        callHook("startLockTask()", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.startLockTask(superCall);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.startLockTask_super();
            }
        });
    }

    public void startManagingCursor(final Cursor c) {
        callHook("startManagingCursor(Cursor)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.startManagingCursor(superCall, (Cursor) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.startManagingCursor_super((Cursor) args[0]);
            }
        }, c);
    }

    public boolean startNextMatchingActivity(@NonNull final Intent intent) {
        return callFunction("startNextMatchingActivity(Intent)",
                new PluginMethodFunction<Boolean>() {
                    @Override
                    public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.startNextMatchingActivity(superCall, (Intent) args[0]);

                    }
                }, new ActivitySuperFunction<Boolean>("startNextMatchingActivity(Intent)") {
                    @Override
                    public Boolean call(final Object... args) {
                        return mActivity.startNextMatchingActivity_super((Intent) args[0]);
                    }
                }, intent);
    }

    public boolean startNextMatchingActivity(@NonNull final Intent intent, final Bundle options) {
        return callFunction("startNextMatchingActivity(Intent, Bundle)",
                new PluginMethodFunction<Boolean>() {
                    @Override
                    public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.startNextMatchingActivity(superCall, (Intent) args[0],
                                (Bundle) args[1]);

                    }
                }, new ActivitySuperFunction<Boolean>("startNextMatchingActivity(Intent, Bundle)") {
                    @Override
                    public Boolean call(final Object... args) {
                        return mActivity.startNextMatchingActivity_super((Intent) args[0],
                                (Bundle) args[1]);
                    }
                }, intent, options);
    }

    public void startPostponedEnterTransition() {
        callHook("startPostponedEnterTransition()", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.startPostponedEnterTransition(superCall);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.startPostponedEnterTransition_super();
            }
        });
    }

    public void startSearch(final String initialQuery, final boolean selectInitialQuery,
            final Bundle appSearchData, final boolean globalSearch) {
        callHook("startSearch(String, boolean, Bundle, boolean)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.startSearch(superCall, (String) args[0], (boolean) args[1], (Bundle) args[2],
                        (boolean) args[3]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.startSearch_super((String) args[0], (boolean) args[1], (Bundle) args[2],
                        (boolean) args[3]);
            }
        }, initialQuery, selectInitialQuery, appSearchData, globalSearch);
    }

    public ComponentName startService(final Intent service) {
        return callFunction("startService(Intent)", new PluginMethodFunction<ComponentName>() {
            @Override
            public ComponentName call(final ActivitySuperFunction<ComponentName> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.startService(superCall, (Intent) args[0]);

            }
        }, new ActivitySuperFunction<ComponentName>("startService(Intent)") {
            @Override
            public ComponentName call(final Object... args) {
                return mActivity.startService_super((Intent) args[0]);
            }
        }, service);
    }

    public ActionMode startSupportActionMode(@NonNull final ActionMode.Callback callback) {
        return callFunction("startSupportActionMode(ActionMode.Callback)",
                new PluginMethodFunction<ActionMode>() {
                    @Override
                    public ActionMode call(final ActivitySuperFunction<ActionMode> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin
                                .startSupportActionMode(superCall, (ActionMode.Callback) args[0]);

                    }
                }, new ActivitySuperFunction<ActionMode>(
                        "startSupportActionMode(ActionMode.Callback)") {
                    @Override
                    public ActionMode call(final Object... args) {
                        return mActivity
                                .startSupportActionMode_super((ActionMode.Callback) args[0]);
                    }
                }, callback);
    }

    public void stopLockTask() {
        callHook("stopLockTask()", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.stopLockTask(superCall);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.stopLockTask_super();
            }
        });
    }

    public void stopManagingCursor(final Cursor c) {
        callHook("stopManagingCursor(Cursor)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.stopManagingCursor(superCall, (Cursor) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.stopManagingCursor_super((Cursor) args[0]);
            }
        }, c);
    }

    public boolean stopService(final Intent name) {
        return callFunction("stopService(Intent)", new PluginMethodFunction<Boolean>() {
            @Override
            public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.stopService(superCall, (Intent) args[0]);

            }
        }, new ActivitySuperFunction<Boolean>("stopService(Intent)") {
            @Override
            public Boolean call(final Object... args) {
                return mActivity.stopService_super((Intent) args[0]);
            }
        }, name);
    }

    public void supportFinishAfterTransition() {
        callHook("supportFinishAfterTransition()", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.supportFinishAfterTransition(superCall);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.supportFinishAfterTransition_super();
            }
        });
    }

    public void supportInvalidateOptionsMenu() {
        callHook("supportInvalidateOptionsMenu()", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.supportInvalidateOptionsMenu(superCall);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.supportInvalidateOptionsMenu_super();
            }
        });
    }

    public void supportNavigateUpTo(@NonNull final Intent upIntent) {
        callHook("supportNavigateUpTo(Intent)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.supportNavigateUpTo(superCall, (Intent) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.supportNavigateUpTo_super((Intent) args[0]);
            }
        }, upIntent);
    }

    public void supportPostponeEnterTransition() {
        callHook("supportPostponeEnterTransition()", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.supportPostponeEnterTransition(superCall);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.supportPostponeEnterTransition_super();
            }
        });
    }

    public boolean supportRequestWindowFeature(final int featureId) {
        return callFunction("supportRequestWindowFeature(int)",
                new PluginMethodFunction<Boolean>() {
                    @Override
                    public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.supportRequestWindowFeature(superCall, (int) args[0]);

                    }
                }, new ActivitySuperFunction<Boolean>("supportRequestWindowFeature(int)") {
                    @Override
                    public Boolean call(final Object... args) {
                        return mActivity.supportRequestWindowFeature_super((int) args[0]);
                    }
                }, featureId);
    }

    public boolean supportShouldUpRecreateTask(@NonNull final Intent targetIntent) {
        return callFunction("supportShouldUpRecreateTask(Intent)",
                new PluginMethodFunction<Boolean>() {
                    @Override
                    public Boolean call(final ActivitySuperFunction<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.supportShouldUpRecreateTask(superCall, (Intent) args[0]);

                    }
                }, new ActivitySuperFunction<Boolean>("supportShouldUpRecreateTask(Intent)") {
                    @Override
                    public Boolean call(final Object... args) {
                        return mActivity.supportShouldUpRecreateTask_super((Intent) args[0]);
                    }
                }, targetIntent);
    }

    public void supportStartPostponedEnterTransition() {
        callHook("supportStartPostponedEnterTransition()", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.supportStartPostponedEnterTransition(superCall);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.supportStartPostponedEnterTransition_super();
            }
        });
    }

    public void takeKeyEvents(final boolean get) {
        callHook("takeKeyEvents(boolean)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.takeKeyEvents(superCall, (boolean) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.takeKeyEvents_super((boolean) args[0]);
            }
        }, get);
    }

    public void triggerSearch(final String query, final Bundle appSearchData) {
        callHook("triggerSearch(String, Bundle)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.triggerSearch(superCall, (String) args[0], (Bundle) args[1]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.triggerSearch_super((String) args[0], (Bundle) args[1]);
            }
        }, query, appSearchData);
    }

    public void unbindService(final ServiceConnection conn) {
        callHook("unbindService(ServiceConnection)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.unbindService(superCall, (ServiceConnection) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.unbindService_super((ServiceConnection) args[0]);
            }
        }, conn);
    }

    public void unregisterComponentCallbacks(final ComponentCallbacks callback) {
        callHook("unregisterComponentCallbacks(ComponentCallbacks)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.unregisterComponentCallbacks(superCall, (ComponentCallbacks) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.unregisterComponentCallbacks_super((ComponentCallbacks) args[0]);
            }
        }, callback);
    }

    public void unregisterForContextMenu(final View view) {
        callHook("unregisterForContextMenu(View)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.unregisterForContextMenu(superCall, (View) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.unregisterForContextMenu_super((View) args[0]);
            }
        }, view);
    }

    public void unregisterReceiver(final BroadcastReceiver receiver) {
        callHook("unregisterReceiver(BroadcastReceiver)", new PluginMethodAction() {
            @Override
            public void call(final ActivitySuperFunction superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.unregisterReceiver(superCall, (BroadcastReceiver) args[0]);
            }
        }, new ActivitySuperAction() {
            @Override
            public void call(final Object... args) {
                mActivity.unregisterReceiver_super((BroadcastReceiver) args[0]);
            }
        }, receiver);
    }


}
