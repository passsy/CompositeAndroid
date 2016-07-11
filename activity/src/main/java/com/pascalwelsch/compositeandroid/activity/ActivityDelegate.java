package com.pascalwelsch.compositeandroid.activity;

import com.pascalwelsch.compositeandroid.core.AbstractDelegate;
import com.pascalwelsch.compositeandroid.core.NamedSuperCall;
import com.pascalwelsch.compositeandroid.core.PluginCall;
import com.pascalwelsch.compositeandroid.core.PluginCallVoid;
import com.pascalwelsch.compositeandroid.core.SuperCall;
import com.pascalwelsch.compositeandroid.core.SuperCallVoid;

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


public class ActivityDelegate extends AbstractDelegate<ICompositeActivity, ActivityPlugin> {


    public ActivityDelegate(final ICompositeActivity icompositeactivity) {
        super(icompositeactivity);

    }


    public void addContentView(final View view, final ViewGroup.LayoutParams params) {
        callHook("addContentView(View, ViewGroup.LayoutParams)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.addContentView(superCall, (View) args[0],
                                (ViewGroup.LayoutParams) args[1]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().super_addContentView((View) args[0],
                                (ViewGroup.LayoutParams) args[1]);
                    }
                }, view, params);
    }

    public void applyOverrideConfiguration(final Configuration overrideConfiguration) {
        callHook("applyOverrideConfiguration(Configuration)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.applyOverrideConfiguration(superCall, (Configuration) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_applyOverrideConfiguration((Configuration) args[0]);
            }
        }, overrideConfiguration);
    }

    public void attachBaseContext(final Context newBase) {
        callHook("attachBaseContext(Context)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.attachBaseContext(superCall, (Context) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_attachBaseContext((Context) args[0]);
            }
        }, newBase);
    }

    public boolean bindService(final Intent service, final ServiceConnection conn,
            final int flags) {
        return callFunction("bindService(Intent, ServiceConnection, int)",
                new PluginCall<ActivityPlugin, Boolean>() {
                    @Override
                    public Boolean call(final NamedSuperCall<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.bindService(superCall, (Intent) args[0],
                                (ServiceConnection) args[1], (int) args[2]);

                    }
                }, new SuperCall<Boolean>() {
                    @Override
                    public Boolean call(final Object... args) {
                        return getOriginal()
                                .super_bindService((Intent) args[0], (ServiceConnection) args[1],
                                        (int) args[2]);
                    }
                }, service, conn, flags);
    }

    public int checkCallingOrSelfPermission(final String permission) {
        return callFunction("checkCallingOrSelfPermission(String)",
                new PluginCall<ActivityPlugin, Integer>() {
                    @Override
                    public Integer call(final NamedSuperCall<Integer> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.checkCallingOrSelfPermission(superCall, (String) args[0]);

                    }
                }, new SuperCall<Integer>() {
                    @Override
                    public Integer call(final Object... args) {
                        return getOriginal().super_checkCallingOrSelfPermission((String) args[0]);
                    }
                }, permission);
    }

    public int checkCallingOrSelfUriPermission(final Uri uri, final int modeFlags) {
        return callFunction("checkCallingOrSelfUriPermission(Uri, int)",
                new PluginCall<ActivityPlugin, Integer>() {
                    @Override
                    public Integer call(final NamedSuperCall<Integer> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.checkCallingOrSelfUriPermission(superCall, (Uri) args[0],
                                (int) args[1]);

                    }
                }, new SuperCall<Integer>() {
                    @Override
                    public Integer call(final Object... args) {
                        return getOriginal().super_checkCallingOrSelfUriPermission((Uri) args[0],
                                (int) args[1]);
                    }
                }, uri, modeFlags);
    }

    public int checkCallingPermission(final String permission) {
        return callFunction("checkCallingPermission(String)",
                new PluginCall<ActivityPlugin, Integer>() {
                    @Override
                    public Integer call(final NamedSuperCall<Integer> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.checkCallingPermission(superCall, (String) args[0]);

                    }
                }, new SuperCall<Integer>() {
                    @Override
                    public Integer call(final Object... args) {
                        return getOriginal().super_checkCallingPermission((String) args[0]);
                    }
                }, permission);
    }

    public int checkCallingUriPermission(final Uri uri, final int modeFlags) {
        return callFunction("checkCallingUriPermission(Uri, int)",
                new PluginCall<ActivityPlugin, Integer>() {
                    @Override
                    public Integer call(final NamedSuperCall<Integer> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin
                                .checkCallingUriPermission(superCall, (Uri) args[0], (int) args[1]);

                    }
                }, new SuperCall<Integer>() {
                    @Override
                    public Integer call(final Object... args) {
                        return getOriginal()
                                .super_checkCallingUriPermission((Uri) args[0], (int) args[1]);
                    }
                }, uri, modeFlags);
    }

    public int checkPermission(final String permission, final int pid, final int uid) {
        return callFunction("checkPermission(String, int, int)",
                new PluginCall<ActivityPlugin, Integer>() {
                    @Override
                    public Integer call(final NamedSuperCall<Integer> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.checkPermission(superCall, (String) args[0], (int) args[1],
                                (int) args[2]);

                    }
                }, new SuperCall<Integer>() {
                    @Override
                    public Integer call(final Object... args) {
                        return getOriginal().super_checkPermission((String) args[0], (int) args[1],
                                (int) args[2]);
                    }
                }, permission, pid, uid);
    }

    public int checkSelfPermission(final String permission) {
        return callFunction("checkSelfPermission(String)",
                new PluginCall<ActivityPlugin, Integer>() {
                    @Override
                    public Integer call(final NamedSuperCall<Integer> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.checkSelfPermission(superCall, (String) args[0]);

                    }
                }, new SuperCall<Integer>() {
                    @Override
                    public Integer call(final Object... args) {
                        return getOriginal().super_checkSelfPermission((String) args[0]);
                    }
                }, permission);
    }

    public int checkUriPermission(final Uri uri, final int pid, final int uid,
            final int modeFlags) {
        return callFunction("checkUriPermission(Uri, int, int, int)",
                new PluginCall<ActivityPlugin, Integer>() {
                    @Override
                    public Integer call(final NamedSuperCall<Integer> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.checkUriPermission(superCall, (Uri) args[0], (int) args[1],
                                (int) args[2], (int) args[3]);

                    }
                }, new SuperCall<Integer>() {
                    @Override
                    public Integer call(final Object... args) {
                        return getOriginal().super_checkUriPermission((Uri) args[0], (int) args[1],
                                (int) args[2], (int) args[3]);
                    }
                }, uri, pid, uid, modeFlags);
    }

    public int checkUriPermission(final Uri uri, final String readPermission,
            final String writePermission, final int pid, final int uid, final int modeFlags) {
        return callFunction("checkUriPermission(Uri, String, String, int, int, int)",
                new PluginCall<ActivityPlugin, Integer>() {
                    @Override
                    public Integer call(final NamedSuperCall<Integer> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.checkUriPermission(superCall, (Uri) args[0], (String) args[1],
                                (String) args[2], (int) args[3], (int) args[4], (int) args[5]);

                    }
                }, new SuperCall<Integer>() {
                    @Override
                    public Integer call(final Object... args) {
                        return getOriginal()
                                .super_checkUriPermission((Uri) args[0], (String) args[1],
                                        (String) args[2], (int) args[3], (int) args[4],
                                        (int) args[5]);
                    }
                }, uri, readPermission, writePermission, pid, uid, modeFlags);
    }

    public void clearWallpaper() throws IOException {
        callHook("clearWallpaper()", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                try {
                    plugin.clearWallpaper(superCall);
                } catch (IOException e) {
                    throw new SuppressedException(e);
                }
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                try {
                    getOriginal().super_clearWallpaper();
                } catch (IOException e) {
                    throw new SuppressedException(e);
                }
            }
        });
    }

    public void closeContextMenu() {
        callHook("closeContextMenu()", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.closeContextMenu(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_closeContextMenu();
            }
        });
    }

    public void closeOptionsMenu() {
        callHook("closeOptionsMenu()", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.closeOptionsMenu(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_closeOptionsMenu();
            }
        });
    }

    public Context createConfigurationContext(final Configuration overrideConfiguration) {
        return callFunction("createConfigurationContext(Configuration)",
                new PluginCall<ActivityPlugin, Context>() {
                    @Override
                    public Context call(final NamedSuperCall<Context> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin
                                .createConfigurationContext(superCall, (Configuration) args[0]);

                    }
                }, new SuperCall<Context>() {
                    @Override
                    public Context call(final Object... args) {
                        return getOriginal()
                                .super_createConfigurationContext((Configuration) args[0]);
                    }
                }, overrideConfiguration);
    }

    public Context createDisplayContext(final Display display) {
        return callFunction("createDisplayContext(Display)",
                new PluginCall<ActivityPlugin, Context>() {
                    @Override
                    public Context call(final NamedSuperCall<Context> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.createDisplayContext(superCall, (Display) args[0]);

                    }
                }, new SuperCall<Context>() {
                    @Override
                    public Context call(final Object... args) {
                        return getOriginal().super_createDisplayContext((Display) args[0]);
                    }
                }, display);
    }

    public Context createPackageContext(final String packageName, final int flags) {
        return callFunction("createPackageContext(String, int)",
                new PluginCall<ActivityPlugin, Context>() {
                    @Override
                    public Context call(final NamedSuperCall<Context> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        try {
                            return plugin.createPackageContext(superCall, (String) args[0],
                                    (int) args[1]);
                        } catch (PackageManager.NameNotFoundException e) {
                            throw new SuppressedException(e);
                        }

                    }
                }, new SuperCall<Context>() {
                    @Override
                    public Context call(final Object... args) {
                        try {
                            return getOriginal()
                                    .super_createPackageContext((String) args[0], (int) args[1]);
                        } catch (PackageManager.NameNotFoundException e) {
                            throw new SuppressedException(e);
                        }
                    }
                }, packageName, flags);
    }

    public PendingIntent createPendingResult(final int requestCode, final Intent data,
            final int flags) {
        return callFunction("createPendingResult(int, Intent, int)",
                new PluginCall<ActivityPlugin, PendingIntent>() {
                    @Override
                    public PendingIntent call(final NamedSuperCall<PendingIntent> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin
                                .createPendingResult(superCall, (int) args[0], (Intent) args[1],
                                        (int) args[2]);

                    }
                }, new SuperCall<PendingIntent>() {
                    @Override
                    public PendingIntent call(final Object... args) {
                        return getOriginal()
                                .super_createPendingResult((int) args[0], (Intent) args[1],
                                        (int) args[2]);
                    }
                }, requestCode, data, flags);
    }

    public String[] databaseList() {
        return callFunction("databaseList()", new PluginCall<ActivityPlugin, String[]>() {
            @Override
            public String[] call(final NamedSuperCall<String[]> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.databaseList(superCall);

            }
        }, new SuperCall<String[]>() {
            @Override
            public String[] call(final Object... args) {
                return getOriginal().super_databaseList();
            }
        });
    }

    public boolean deleteDatabase(final String name) {
        return callFunction("deleteDatabase(String)", new PluginCall<ActivityPlugin, Boolean>() {
            @Override
            public Boolean call(final NamedSuperCall<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.deleteDatabase(superCall, (String) args[0]);

            }
        }, new SuperCall<Boolean>() {
            @Override
            public Boolean call(final Object... args) {
                return getOriginal().super_deleteDatabase((String) args[0]);
            }
        }, name);
    }

    public boolean deleteFile(final String name) {
        return callFunction("deleteFile(String)", new PluginCall<ActivityPlugin, Boolean>() {
            @Override
            public Boolean call(final NamedSuperCall<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.deleteFile(superCall, (String) args[0]);

            }
        }, new SuperCall<Boolean>() {
            @Override
            public Boolean call(final Object... args) {
                return getOriginal().super_deleteFile((String) args[0]);
            }
        }, name);
    }

    public boolean dispatchGenericMotionEvent(final MotionEvent ev) {
        return callFunction("dispatchGenericMotionEvent(MotionEvent)",
                new PluginCall<ActivityPlugin, Boolean>() {
                    @Override
                    public Boolean call(final NamedSuperCall<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.dispatchGenericMotionEvent(superCall, (MotionEvent) args[0]);

                    }
                }, new SuperCall<Boolean>() {
                    @Override
                    public Boolean call(final Object... args) {
                        return getOriginal()
                                .super_dispatchGenericMotionEvent((MotionEvent) args[0]);
                    }
                }, ev);
    }

    public boolean dispatchKeyEvent(final KeyEvent event) {
        return callFunction("dispatchKeyEvent(KeyEvent)",
                new PluginCall<ActivityPlugin, Boolean>() {
                    @Override
                    public Boolean call(final NamedSuperCall<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.dispatchKeyEvent(superCall, (KeyEvent) args[0]);

                    }
                }, new SuperCall<Boolean>() {
                    @Override
                    public Boolean call(final Object... args) {
                        return getOriginal().super_dispatchKeyEvent((KeyEvent) args[0]);
                    }
                }, event);
    }

    public boolean dispatchKeyShortcutEvent(final KeyEvent event) {
        return callFunction("dispatchKeyShortcutEvent(KeyEvent)",
                new PluginCall<ActivityPlugin, Boolean>() {
                    @Override
                    public Boolean call(final NamedSuperCall<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.dispatchKeyShortcutEvent(superCall, (KeyEvent) args[0]);

                    }
                }, new SuperCall<Boolean>() {
                    @Override
                    public Boolean call(final Object... args) {
                        return getOriginal().super_dispatchKeyShortcutEvent((KeyEvent) args[0]);
                    }
                }, event);
    }

    public boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent event) {
        return callFunction("dispatchPopulateAccessibilityEvent(AccessibilityEvent)",
                new PluginCall<ActivityPlugin, Boolean>() {
                    @Override
                    public Boolean call(final NamedSuperCall<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.dispatchPopulateAccessibilityEvent(superCall,
                                (AccessibilityEvent) args[0]);

                    }
                }, new SuperCall<Boolean>() {
                    @Override
                    public Boolean call(final Object... args) {
                        return getOriginal().super_dispatchPopulateAccessibilityEvent(
                                (AccessibilityEvent) args[0]);
                    }
                }, event);
    }

    public boolean dispatchTouchEvent(final MotionEvent ev) {
        return callFunction("dispatchTouchEvent(MotionEvent)",
                new PluginCall<ActivityPlugin, Boolean>() {
                    @Override
                    public Boolean call(final NamedSuperCall<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.dispatchTouchEvent(superCall, (MotionEvent) args[0]);

                    }
                }, new SuperCall<Boolean>() {
                    @Override
                    public Boolean call(final Object... args) {
                        return getOriginal().super_dispatchTouchEvent((MotionEvent) args[0]);
                    }
                }, ev);
    }

    public boolean dispatchTrackballEvent(final MotionEvent ev) {
        return callFunction("dispatchTrackballEvent(MotionEvent)",
                new PluginCall<ActivityPlugin, Boolean>() {
                    @Override
                    public Boolean call(final NamedSuperCall<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.dispatchTrackballEvent(superCall, (MotionEvent) args[0]);

                    }
                }, new SuperCall<Boolean>() {
                    @Override
                    public Boolean call(final Object... args) {
                        return getOriginal().super_dispatchTrackballEvent((MotionEvent) args[0]);
                    }
                }, ev);
    }

    public void dump(final String prefix, final FileDescriptor fd, final PrintWriter writer,
            final String[] args) {
        callHook("dump(String, FileDescriptor, PrintWriter, String[])",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.dump(superCall, (String) args[0], (FileDescriptor) args[1],
                                (PrintWriter) args[2], (String[]) args[3]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().super_dump((String) args[0], (FileDescriptor) args[1],
                                (PrintWriter) args[2], (String[]) args[3]);
                    }
                }, prefix, fd, writer, args);
    }

    public void enforceCallingOrSelfPermission(final String permission, final String message) {
        callHook("enforceCallingOrSelfPermission(String, String)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.enforceCallingOrSelfPermission(superCall, (String) args[0],
                                (String) args[1]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().super_enforceCallingOrSelfPermission((String) args[0],
                                (String) args[1]);
                    }
                }, permission, message);
    }

    public void enforceCallingOrSelfUriPermission(final Uri uri, final int modeFlags,
            final String message) {
        callHook("enforceCallingOrSelfUriPermission(Uri, int, String)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.enforceCallingOrSelfUriPermission(superCall, (Uri) args[0],
                                (int) args[1], (String) args[2]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().super_enforceCallingOrSelfUriPermission((Uri) args[0],
                                (int) args[1], (String) args[2]);
                    }
                }, uri, modeFlags, message);
    }

    public void enforceCallingPermission(final String permission, final String message) {
        callHook("enforceCallingPermission(String, String)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.enforceCallingPermission(superCall, (String) args[0], (String) args[1]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_enforceCallingPermission((String) args[0], (String) args[1]);
            }
        }, permission, message);
    }

    public void enforceCallingUriPermission(final Uri uri, final int modeFlags,
            final String message) {
        callHook("enforceCallingUriPermission(Uri, int, String)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.enforceCallingUriPermission(superCall, (Uri) args[0], (int) args[1],
                                (String) args[2]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal()
                                .super_enforceCallingUriPermission((Uri) args[0], (int) args[1],
                                        (String) args[2]);
                    }
                }, uri, modeFlags, message);
    }

    public void enforcePermission(final String permission, final int pid, final int uid,
            final String message) {
        callHook("enforcePermission(String, int, int, String)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.enforcePermission(superCall, (String) args[0], (int) args[1],
                                (int) args[2], (String) args[3]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().super_enforcePermission((String) args[0], (int) args[1],
                                (int) args[2], (String) args[3]);
                    }
                }, permission, pid, uid, message);
    }

    public void enforceUriPermission(final Uri uri, final int pid, final int uid,
            final int modeFlags, final String message) {
        callHook("enforceUriPermission(Uri, int, int, int, String)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.enforceUriPermission(superCall, (Uri) args[0], (int) args[1],
                                (int) args[2], (int) args[3], (String) args[4]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().super_enforceUriPermission((Uri) args[0], (int) args[1],
                                (int) args[2], (int) args[3], (String) args[4]);
                    }
                }, uri, pid, uid, modeFlags, message);
    }

    public void enforceUriPermission(final Uri uri, final String readPermission,
            final String writePermission, final int pid, final int uid, final int modeFlags,
            final String message) {
        callHook("enforceUriPermission(Uri, String, String, int, int, int, String)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.enforceUriPermission(superCall, (Uri) args[0], (String) args[1],
                                (String) args[2], (int) args[3], (int) args[4], (int) args[5],
                                (String) args[6]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().super_enforceUriPermission((Uri) args[0], (String) args[1],
                                (String) args[2], (int) args[3], (int) args[4], (int) args[5],
                                (String) args[6]);
                    }
                }, uri, readPermission, writePermission, pid, uid, modeFlags, message);
    }

    public String[] fileList() {
        return callFunction("fileList()", new PluginCall<ActivityPlugin, String[]>() {
            @Override
            public String[] call(final NamedSuperCall<String[]> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.fileList(superCall);

            }
        }, new SuperCall<String[]>() {
            @Override
            public String[] call(final Object... args) {
                return getOriginal().super_fileList();
            }
        });
    }

    public View findViewById(@IdRes final int id) {
        return callFunction("findViewById(int)", new PluginCall<ActivityPlugin, View>() {
            @Override
            public View call(final NamedSuperCall<View> superCall, final ActivityPlugin plugin,
                    final Object... args) {

                return plugin.findViewById(superCall, (int) args[0]);

            }
        }, new SuperCall<View>() {
            @Override
            public View call(final Object... args) {
                return getOriginal().super_findViewById((int) args[0]);
            }
        }, id);
    }

    public void finish() {
        callHook("finish()", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.finish(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_finish();
            }
        });
    }

    public void finishActivity(final int requestCode) {
        callHook("finishActivity(int)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.finishActivity(superCall, (int) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_finishActivity((int) args[0]);
            }
        }, requestCode);
    }

    public void finishActivityFromChild(final Activity child, final int requestCode) {
        callHook("finishActivityFromChild(Activity, int)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.finishActivityFromChild(superCall, (Activity) args[0], (int) args[1]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_finishActivityFromChild((Activity) args[0], (int) args[1]);
            }
        }, child, requestCode);
    }

    public void finishAffinity() {
        callHook("finishAffinity()", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.finishAffinity(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_finishAffinity();
            }
        });
    }

    public void finishAfterTransition() {
        callHook("finishAfterTransition()", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.finishAfterTransition(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_finishAfterTransition();
            }
        });
    }

    public void finishAndRemoveTask() {
        callHook("finishAndRemoveTask()", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.finishAndRemoveTask(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_finishAndRemoveTask();
            }
        });
    }

    public void finishFromChild(final Activity child) {
        callHook("finishFromChild(Activity)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.finishFromChild(superCall, (Activity) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_finishFromChild((Activity) args[0]);
            }
        }, child);
    }

    public android.app.ActionBar getActionBar() {
        return callFunction("getActionBar()",
                new PluginCall<ActivityPlugin, android.app.ActionBar>() {
                    @Override
                    public android.app.ActionBar call(
                            final NamedSuperCall<android.app.ActionBar> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.getActionBar(superCall);

                    }
                }, new SuperCall<android.app.ActionBar>() {
                    @Override
                    public android.app.ActionBar call(final Object... args) {
                        return getOriginal().super_getActionBar();
                    }
                });
    }

    public Context getApplicationContext() {
        return callFunction("getApplicationContext()", new PluginCall<ActivityPlugin, Context>() {
            @Override
            public Context call(final NamedSuperCall<Context> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getApplicationContext(superCall);

            }
        }, new SuperCall<Context>() {
            @Override
            public Context call(final Object... args) {
                return getOriginal().super_getApplicationContext();
            }
        });
    }

    public ApplicationInfo getApplicationInfo() {
        return callFunction("getApplicationInfo()",
                new PluginCall<ActivityPlugin, ApplicationInfo>() {
                    @Override
                    public ApplicationInfo call(final NamedSuperCall<ApplicationInfo> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.getApplicationInfo(superCall);

                    }
                }, new SuperCall<ApplicationInfo>() {
                    @Override
                    public ApplicationInfo call(final Object... args) {
                        return getOriginal().super_getApplicationInfo();
                    }
                });
    }

    public AssetManager getAssets() {
        return callFunction("getAssets()", new PluginCall<ActivityPlugin, AssetManager>() {
            @Override
            public AssetManager call(final NamedSuperCall<AssetManager> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getAssets(superCall);

            }
        }, new SuperCall<AssetManager>() {
            @Override
            public AssetManager call(final Object... args) {
                return getOriginal().super_getAssets();
            }
        });
    }

    public Context getBaseContext() {
        return callFunction("getBaseContext()", new PluginCall<ActivityPlugin, Context>() {
            @Override
            public Context call(final NamedSuperCall<Context> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getBaseContext(superCall);

            }
        }, new SuperCall<Context>() {
            @Override
            public Context call(final Object... args) {
                return getOriginal().super_getBaseContext();
            }
        });
    }

    public File getCacheDir() {
        return callFunction("getCacheDir()", new PluginCall<ActivityPlugin, File>() {
            @Override
            public File call(final NamedSuperCall<File> superCall, final ActivityPlugin plugin,
                    final Object... args) {

                return plugin.getCacheDir(superCall);

            }
        }, new SuperCall<File>() {
            @Override
            public File call(final Object... args) {
                return getOriginal().super_getCacheDir();
            }
        });
    }

    public ComponentName getCallingActivity() {
        return callFunction("getCallingActivity()",
                new PluginCall<ActivityPlugin, ComponentName>() {
                    @Override
                    public ComponentName call(final NamedSuperCall<ComponentName> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.getCallingActivity(superCall);

                    }
                }, new SuperCall<ComponentName>() {
                    @Override
                    public ComponentName call(final Object... args) {
                        return getOriginal().super_getCallingActivity();
                    }
                });
    }

    public String getCallingPackage() {
        return callFunction("getCallingPackage()", new PluginCall<ActivityPlugin, String>() {
            @Override
            public String call(final NamedSuperCall<String> superCall, final ActivityPlugin plugin,
                    final Object... args) {

                return plugin.getCallingPackage(superCall);

            }
        }, new SuperCall<String>() {
            @Override
            public String call(final Object... args) {
                return getOriginal().super_getCallingPackage();
            }
        });
    }

    public int getChangingConfigurations() {
        return callFunction("getChangingConfigurations()",
                new PluginCall<ActivityPlugin, Integer>() {
                    @Override
                    public Integer call(final NamedSuperCall<Integer> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.getChangingConfigurations(superCall);

                    }
                }, new SuperCall<Integer>() {
                    @Override
                    public Integer call(final Object... args) {
                        return getOriginal().super_getChangingConfigurations();
                    }
                });
    }

    public ClassLoader getClassLoader() {
        return callFunction("getClassLoader()", new PluginCall<ActivityPlugin, ClassLoader>() {
            @Override
            public ClassLoader call(final NamedSuperCall<ClassLoader> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getClassLoader(superCall);

            }
        }, new SuperCall<ClassLoader>() {
            @Override
            public ClassLoader call(final Object... args) {
                return getOriginal().super_getClassLoader();
            }
        });
    }

    public File getCodeCacheDir() {
        return callFunction("getCodeCacheDir()", new PluginCall<ActivityPlugin, File>() {
            @Override
            public File call(final NamedSuperCall<File> superCall, final ActivityPlugin plugin,
                    final Object... args) {

                return plugin.getCodeCacheDir(superCall);

            }
        }, new SuperCall<File>() {
            @Override
            public File call(final Object... args) {
                return getOriginal().super_getCodeCacheDir();
            }
        });
    }

    public ComponentName getComponentName() {
        return callFunction("getComponentName()", new PluginCall<ActivityPlugin, ComponentName>() {
            @Override
            public ComponentName call(final NamedSuperCall<ComponentName> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getComponentName(superCall);

            }
        }, new SuperCall<ComponentName>() {
            @Override
            public ComponentName call(final Object... args) {
                return getOriginal().super_getComponentName();
            }
        });
    }

    public ContentResolver getContentResolver() {
        return callFunction("getContentResolver()",
                new PluginCall<ActivityPlugin, ContentResolver>() {
                    @Override
                    public ContentResolver call(final NamedSuperCall<ContentResolver> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.getContentResolver(superCall);

                    }
                }, new SuperCall<ContentResolver>() {
                    @Override
                    public ContentResolver call(final Object... args) {
                        return getOriginal().super_getContentResolver();
                    }
                });
    }

    public Scene getContentScene() {
        return callFunction("getContentScene()", new PluginCall<ActivityPlugin, Scene>() {
            @Override
            public Scene call(final NamedSuperCall<Scene> superCall, final ActivityPlugin plugin,
                    final Object... args) {

                return plugin.getContentScene(superCall);

            }
        }, new SuperCall<Scene>() {
            @Override
            public Scene call(final Object... args) {
                return getOriginal().super_getContentScene();
            }
        });
    }

    public TransitionManager getContentTransitionManager() {
        return callFunction("getContentTransitionManager()",
                new PluginCall<ActivityPlugin, TransitionManager>() {
                    @Override
                    public TransitionManager call(final NamedSuperCall<TransitionManager> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.getContentTransitionManager(superCall);

                    }
                }, new SuperCall<TransitionManager>() {
                    @Override
                    public TransitionManager call(final Object... args) {
                        return getOriginal().super_getContentTransitionManager();
                    }
                });
    }

    public View getCurrentFocus() {
        return callFunction("getCurrentFocus()", new PluginCall<ActivityPlugin, View>() {
            @Override
            public View call(final NamedSuperCall<View> superCall, final ActivityPlugin plugin,
                    final Object... args) {

                return plugin.getCurrentFocus(superCall);

            }
        }, new SuperCall<View>() {
            @Override
            public View call(final Object... args) {
                return getOriginal().super_getCurrentFocus();
            }
        });
    }

    public File getDatabasePath(final String name) {
        return callFunction("getDatabasePath(String)", new PluginCall<ActivityPlugin, File>() {
            @Override
            public File call(final NamedSuperCall<File> superCall, final ActivityPlugin plugin,
                    final Object... args) {

                return plugin.getDatabasePath(superCall, (String) args[0]);

            }
        }, new SuperCall<File>() {
            @Override
            public File call(final Object... args) {
                return getOriginal().super_getDatabasePath((String) args[0]);
            }
        }, name);
    }

    public AppCompatDelegate getDelegate() {
        return callFunction("getDelegate()", new PluginCall<ActivityPlugin, AppCompatDelegate>() {
            @Override
            public AppCompatDelegate call(final NamedSuperCall<AppCompatDelegate> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getDelegate(superCall);

            }
        }, new SuperCall<AppCompatDelegate>() {
            @Override
            public AppCompatDelegate call(final Object... args) {
                return getOriginal().super_getDelegate();
            }
        });
    }

    public File getDir(final String name, final int mode) {
        return callFunction("getDir(String, int)", new PluginCall<ActivityPlugin, File>() {
            @Override
            public File call(final NamedSuperCall<File> superCall, final ActivityPlugin plugin,
                    final Object... args) {

                return plugin.getDir(superCall, (String) args[0], (int) args[1]);

            }
        }, new SuperCall<File>() {
            @Override
            public File call(final Object... args) {
                return getOriginal().super_getDir((String) args[0], (int) args[1]);
            }
        }, name, mode);
    }

    public ActionBarDrawerToggle.Delegate getDrawerToggleDelegate() {
        return callFunction("getDrawerToggleDelegate()",
                new PluginCall<ActivityPlugin, ActionBarDrawerToggle.Delegate>() {
                    @Override
                    public ActionBarDrawerToggle.Delegate call(
                            final NamedSuperCall<ActionBarDrawerToggle.Delegate> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.getDrawerToggleDelegate(superCall);

                    }
                }, new SuperCall<ActionBarDrawerToggle.Delegate>() {
                    @Override
                    public ActionBarDrawerToggle.Delegate call(final Object... args) {
                        return getOriginal().super_getDrawerToggleDelegate();
                    }
                });
    }

    public File getExternalCacheDir() {
        return callFunction("getExternalCacheDir()", new PluginCall<ActivityPlugin, File>() {
            @Override
            public File call(final NamedSuperCall<File> superCall, final ActivityPlugin plugin,
                    final Object... args) {

                return plugin.getExternalCacheDir(superCall);

            }
        }, new SuperCall<File>() {
            @Override
            public File call(final Object... args) {
                return getOriginal().super_getExternalCacheDir();
            }
        });
    }

    public File[] getExternalCacheDirs() {
        return callFunction("getExternalCacheDirs()", new PluginCall<ActivityPlugin, File[]>() {
            @Override
            public File[] call(final NamedSuperCall<File[]> superCall, final ActivityPlugin plugin,
                    final Object... args) {

                return plugin.getExternalCacheDirs(superCall);

            }
        }, new SuperCall<File[]>() {
            @Override
            public File[] call(final Object... args) {
                return getOriginal().super_getExternalCacheDirs();
            }
        });
    }

    public File getExternalFilesDir(final String type) {
        return callFunction("getExternalFilesDir(String)", new PluginCall<ActivityPlugin, File>() {
            @Override
            public File call(final NamedSuperCall<File> superCall, final ActivityPlugin plugin,
                    final Object... args) {

                return plugin.getExternalFilesDir(superCall, (String) args[0]);

            }
        }, new SuperCall<File>() {
            @Override
            public File call(final Object... args) {
                return getOriginal().super_getExternalFilesDir((String) args[0]);
            }
        }, type);
    }

    public File[] getExternalFilesDirs(final String type) {
        return callFunction("getExternalFilesDirs(String)",
                new PluginCall<ActivityPlugin, File[]>() {
                    @Override
                    public File[] call(final NamedSuperCall<File[]> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.getExternalFilesDirs(superCall, (String) args[0]);

                    }
                }, new SuperCall<File[]>() {
                    @Override
                    public File[] call(final Object... args) {
                        return getOriginal().super_getExternalFilesDirs((String) args[0]);
                    }
                }, type);
    }

    public File[] getExternalMediaDirs() {
        return callFunction("getExternalMediaDirs()", new PluginCall<ActivityPlugin, File[]>() {
            @Override
            public File[] call(final NamedSuperCall<File[]> superCall, final ActivityPlugin plugin,
                    final Object... args) {

                return plugin.getExternalMediaDirs(superCall);

            }
        }, new SuperCall<File[]>() {
            @Override
            public File[] call(final Object... args) {
                return getOriginal().super_getExternalMediaDirs();
            }
        });
    }

    public File getFileStreamPath(final String name) {
        return callFunction("getFileStreamPath(String)", new PluginCall<ActivityPlugin, File>() {
            @Override
            public File call(final NamedSuperCall<File> superCall, final ActivityPlugin plugin,
                    final Object... args) {

                return plugin.getFileStreamPath(superCall, (String) args[0]);

            }
        }, new SuperCall<File>() {
            @Override
            public File call(final Object... args) {
                return getOriginal().super_getFileStreamPath((String) args[0]);
            }
        }, name);
    }

    public File getFilesDir() {
        return callFunction("getFilesDir()", new PluginCall<ActivityPlugin, File>() {
            @Override
            public File call(final NamedSuperCall<File> superCall, final ActivityPlugin plugin,
                    final Object... args) {

                return plugin.getFilesDir(superCall);

            }
        }, new SuperCall<File>() {
            @Override
            public File call(final Object... args) {
                return getOriginal().super_getFilesDir();
            }
        });
    }

    public android.app.FragmentManager getFragmentManager() {
        return callFunction("getFragmentManager()",
                new PluginCall<ActivityPlugin, android.app.FragmentManager>() {
                    @Override
                    public android.app.FragmentManager call(
                            final NamedSuperCall<android.app.FragmentManager> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.getFragmentManager(superCall);

                    }
                }, new SuperCall<android.app.FragmentManager>() {
                    @Override
                    public android.app.FragmentManager call(final Object... args) {
                        return getOriginal().super_getFragmentManager();
                    }
                });
    }

    public Intent getIntent() {
        return callFunction("getIntent()", new PluginCall<ActivityPlugin, Intent>() {
            @Override
            public Intent call(final NamedSuperCall<Intent> superCall, final ActivityPlugin plugin,
                    final Object... args) {

                return plugin.getIntent(superCall);

            }
        }, new SuperCall<Intent>() {
            @Override
            public Intent call(final Object... args) {
                return getOriginal().super_getIntent();
            }
        });
    }

    public Object getLastCompositeCustomNonConfigurationInstance() {
        final Object nci = getOriginal().getLastCustomNonConfigurationInstance();
        if (nci instanceof NonConfigurationInstanceWrapper) {
            final NonConfigurationInstanceWrapper all = (NonConfigurationInstanceWrapper) nci;
            return all.getSuperNonConfigurationInstance();
        }
        return null;
    }

    public Object getLastNonConfigurationInstance(final String key) {
        final Object nci = getOriginal().getLastCustomNonConfigurationInstance();
        if (nci instanceof NonConfigurationInstanceWrapper) {
            final NonConfigurationInstanceWrapper all = (NonConfigurationInstanceWrapper) nci;
            return all.getPluginNonConfigurationInstance(key);
        }
        return null;
    }

    public LayoutInflater getLayoutInflater() {
        return callFunction("getLayoutInflater()",
                new PluginCall<ActivityPlugin, LayoutInflater>() {
                    @Override
                    public LayoutInflater call(final NamedSuperCall<LayoutInflater> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.getLayoutInflater(superCall);

                    }
                }, new SuperCall<LayoutInflater>() {
                    @Override
                    public LayoutInflater call(final Object... args) {
                        return getOriginal().super_getLayoutInflater();
                    }
                });
    }

    public android.app.LoaderManager getLoaderManager() {
        return callFunction("getLoaderManager()",
                new PluginCall<ActivityPlugin, android.app.LoaderManager>() {
                    @Override
                    public android.app.LoaderManager call(
                            final NamedSuperCall<android.app.LoaderManager> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.getLoaderManager(superCall);

                    }
                }, new SuperCall<android.app.LoaderManager>() {
                    @Override
                    public android.app.LoaderManager call(final Object... args) {
                        return getOriginal().super_getLoaderManager();
                    }
                });
    }

    public String getLocalClassName() {
        return callFunction("getLocalClassName()", new PluginCall<ActivityPlugin, String>() {
            @Override
            public String call(final NamedSuperCall<String> superCall, final ActivityPlugin plugin,
                    final Object... args) {

                return plugin.getLocalClassName(superCall);

            }
        }, new SuperCall<String>() {
            @Override
            public String call(final Object... args) {
                return getOriginal().super_getLocalClassName();
            }
        });
    }

    public Looper getMainLooper() {
        return callFunction("getMainLooper()", new PluginCall<ActivityPlugin, Looper>() {
            @Override
            public Looper call(final NamedSuperCall<Looper> superCall, final ActivityPlugin plugin,
                    final Object... args) {

                return plugin.getMainLooper(superCall);

            }
        }, new SuperCall<Looper>() {
            @Override
            public Looper call(final Object... args) {
                return getOriginal().super_getMainLooper();
            }
        });
    }

    public MenuInflater getMenuInflater() {
        return callFunction("getMenuInflater()", new PluginCall<ActivityPlugin, MenuInflater>() {
            @Override
            public MenuInflater call(final NamedSuperCall<MenuInflater> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getMenuInflater(superCall);

            }
        }, new SuperCall<MenuInflater>() {
            @Override
            public MenuInflater call(final Object... args) {
                return getOriginal().super_getMenuInflater();
            }
        });
    }

    public File getNoBackupFilesDir() {
        return callFunction("getNoBackupFilesDir()", new PluginCall<ActivityPlugin, File>() {
            @Override
            public File call(final NamedSuperCall<File> superCall, final ActivityPlugin plugin,
                    final Object... args) {

                return plugin.getNoBackupFilesDir(superCall);

            }
        }, new SuperCall<File>() {
            @Override
            public File call(final Object... args) {
                return getOriginal().super_getNoBackupFilesDir();
            }
        });
    }

    public File getObbDir() {
        return callFunction("getObbDir()", new PluginCall<ActivityPlugin, File>() {
            @Override
            public File call(final NamedSuperCall<File> superCall, final ActivityPlugin plugin,
                    final Object... args) {

                return plugin.getObbDir(superCall);

            }
        }, new SuperCall<File>() {
            @Override
            public File call(final Object... args) {
                return getOriginal().super_getObbDir();
            }
        });
    }

    public File[] getObbDirs() {
        return callFunction("getObbDirs()", new PluginCall<ActivityPlugin, File[]>() {
            @Override
            public File[] call(final NamedSuperCall<File[]> superCall, final ActivityPlugin plugin,
                    final Object... args) {

                return plugin.getObbDirs(superCall);

            }
        }, new SuperCall<File[]>() {
            @Override
            public File[] call(final Object... args) {
                return getOriginal().super_getObbDirs();
            }
        });
    }

    public String getPackageCodePath() {
        return callFunction("getPackageCodePath()", new PluginCall<ActivityPlugin, String>() {
            @Override
            public String call(final NamedSuperCall<String> superCall, final ActivityPlugin plugin,
                    final Object... args) {

                return plugin.getPackageCodePath(superCall);

            }
        }, new SuperCall<String>() {
            @Override
            public String call(final Object... args) {
                return getOriginal().super_getPackageCodePath();
            }
        });
    }

    public PackageManager getPackageManager() {
        return callFunction("getPackageManager()",
                new PluginCall<ActivityPlugin, PackageManager>() {
                    @Override
                    public PackageManager call(final NamedSuperCall<PackageManager> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.getPackageManager(superCall);

                    }
                }, new SuperCall<PackageManager>() {
                    @Override
                    public PackageManager call(final Object... args) {
                        return getOriginal().super_getPackageManager();
                    }
                });
    }

    public String getPackageName() {
        return callFunction("getPackageName()", new PluginCall<ActivityPlugin, String>() {
            @Override
            public String call(final NamedSuperCall<String> superCall, final ActivityPlugin plugin,
                    final Object... args) {

                return plugin.getPackageName(superCall);

            }
        }, new SuperCall<String>() {
            @Override
            public String call(final Object... args) {
                return getOriginal().super_getPackageName();
            }
        });
    }

    public String getPackageResourcePath() {
        return callFunction("getPackageResourcePath()", new PluginCall<ActivityPlugin, String>() {
            @Override
            public String call(final NamedSuperCall<String> superCall, final ActivityPlugin plugin,
                    final Object... args) {

                return plugin.getPackageResourcePath(superCall);

            }
        }, new SuperCall<String>() {
            @Override
            public String call(final Object... args) {
                return getOriginal().super_getPackageResourcePath();
            }
        });
    }

    public Intent getParentActivityIntent() {
        return callFunction("getParentActivityIntent()", new PluginCall<ActivityPlugin, Intent>() {
            @Override
            public Intent call(final NamedSuperCall<Intent> superCall, final ActivityPlugin plugin,
                    final Object... args) {

                return plugin.getParentActivityIntent(superCall);

            }
        }, new SuperCall<Intent>() {
            @Override
            public Intent call(final Object... args) {
                return getOriginal().super_getParentActivityIntent();
            }
        });
    }

    public SharedPreferences getPreferences(final int mode) {
        return callFunction("getPreferences(int)",
                new PluginCall<ActivityPlugin, SharedPreferences>() {
                    @Override
                    public SharedPreferences call(final NamedSuperCall<SharedPreferences> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.getPreferences(superCall, (int) args[0]);

                    }
                }, new SuperCall<SharedPreferences>() {
                    @Override
                    public SharedPreferences call(final Object... args) {
                        return getOriginal().super_getPreferences((int) args[0]);
                    }
                }, mode);
    }

    public Uri getReferrer() {
        return callFunction("getReferrer()", new PluginCall<ActivityPlugin, Uri>() {
            @Override
            public Uri call(final NamedSuperCall<Uri> superCall, final ActivityPlugin plugin,
                    final Object... args) {

                return plugin.getReferrer(superCall);

            }
        }, new SuperCall<Uri>() {
            @Override
            public Uri call(final Object... args) {
                return getOriginal().super_getReferrer();
            }
        });
    }

    public int getRequestedOrientation() {
        return callFunction("getRequestedOrientation()", new PluginCall<ActivityPlugin, Integer>() {
            @Override
            public Integer call(final NamedSuperCall<Integer> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getRequestedOrientation(superCall);

            }
        }, new SuperCall<Integer>() {
            @Override
            public Integer call(final Object... args) {
                return getOriginal().super_getRequestedOrientation();
            }
        });
    }

    public Resources getResources() {
        return callFunction("getResources()", new PluginCall<ActivityPlugin, Resources>() {
            @Override
            public Resources call(final NamedSuperCall<Resources> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getResources(superCall);

            }
        }, new SuperCall<Resources>() {
            @Override
            public Resources call(final Object... args) {
                return getOriginal().super_getResources();
            }
        });
    }

    public SharedPreferences getSharedPreferences(final String name, final int mode) {
        return callFunction("getSharedPreferences(String, int)",
                new PluginCall<ActivityPlugin, SharedPreferences>() {
                    @Override
                    public SharedPreferences call(final NamedSuperCall<SharedPreferences> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin
                                .getSharedPreferences(superCall, (String) args[0], (int) args[1]);

                    }
                }, new SuperCall<SharedPreferences>() {
                    @Override
                    public SharedPreferences call(final Object... args) {
                        return getOriginal()
                                .super_getSharedPreferences((String) args[0], (int) args[1]);
                    }
                }, name, mode);
    }

    public ActionBar getSupportActionBar() {
        return callFunction("getSupportActionBar()", new PluginCall<ActivityPlugin, ActionBar>() {
            @Override
            public ActionBar call(final NamedSuperCall<ActionBar> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getSupportActionBar(superCall);

            }
        }, new SuperCall<ActionBar>() {
            @Override
            public ActionBar call(final Object... args) {
                return getOriginal().super_getSupportActionBar();
            }
        });
    }

    public FragmentManager getSupportFragmentManager() {
        return callFunction("getSupportFragmentManager()",
                new PluginCall<ActivityPlugin, FragmentManager>() {
                    @Override
                    public FragmentManager call(final NamedSuperCall<FragmentManager> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.getSupportFragmentManager(superCall);

                    }
                }, new SuperCall<FragmentManager>() {
                    @Override
                    public FragmentManager call(final Object... args) {
                        return getOriginal().super_getSupportFragmentManager();
                    }
                });
    }

    public LoaderManager getSupportLoaderManager() {
        return callFunction("getSupportLoaderManager()",
                new PluginCall<ActivityPlugin, LoaderManager>() {
                    @Override
                    public LoaderManager call(final NamedSuperCall<LoaderManager> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.getSupportLoaderManager(superCall);

                    }
                }, new SuperCall<LoaderManager>() {
                    @Override
                    public LoaderManager call(final Object... args) {
                        return getOriginal().super_getSupportLoaderManager();
                    }
                });
    }

    public Intent getSupportParentActivityIntent() {
        return callFunction("getSupportParentActivityIntent()",
                new PluginCall<ActivityPlugin, Intent>() {
                    @Override
                    public Intent call(final NamedSuperCall<Intent> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.getSupportParentActivityIntent(superCall);

                    }
                }, new SuperCall<Intent>() {
                    @Override
                    public Intent call(final Object... args) {
                        return getOriginal().super_getSupportParentActivityIntent();
                    }
                });
    }

    public Object getSystemService(final String name) {
        return callFunction("getSystemService(String)", new PluginCall<ActivityPlugin, Object>() {
            @Override
            public Object call(final NamedSuperCall<Object> superCall, final ActivityPlugin plugin,
                    final Object... args) {

                return plugin.getSystemService(superCall, (String) args[0]);

            }
        }, new SuperCall<Object>() {
            @Override
            public Object call(final Object... args) {
                return getOriginal().super_getSystemService((String) args[0]);
            }
        }, name);
    }

    public String getSystemServiceName(final Class<?> serviceClass) {
        return callFunction("getSystemServiceName(Class<?>)",
                new PluginCall<ActivityPlugin, String>() {
                    @Override
                    public String call(final NamedSuperCall<String> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.getSystemServiceName(superCall, (Class<?>) args[0]);

                    }
                }, new SuperCall<String>() {
                    @Override
                    public String call(final Object... args) {
                        return getOriginal().super_getSystemServiceName((Class<?>) args[0]);
                    }
                }, serviceClass);
    }

    public int getTaskId() {
        return callFunction("getTaskId()", new PluginCall<ActivityPlugin, Integer>() {
            @Override
            public Integer call(final NamedSuperCall<Integer> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getTaskId(superCall);

            }
        }, new SuperCall<Integer>() {
            @Override
            public Integer call(final Object... args) {
                return getOriginal().super_getTaskId();
            }
        });
    }

    public Resources.Theme getTheme() {
        return callFunction("getTheme()", new PluginCall<ActivityPlugin, Resources.Theme>() {
            @Override
            public Resources.Theme call(final NamedSuperCall<Resources.Theme> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getTheme(superCall);

            }
        }, new SuperCall<Resources.Theme>() {
            @Override
            public Resources.Theme call(final Object... args) {
                return getOriginal().super_getTheme();
            }
        });
    }

    public VoiceInteractor getVoiceInteractor() {
        return callFunction("getVoiceInteractor()",
                new PluginCall<ActivityPlugin, VoiceInteractor>() {
                    @Override
                    public VoiceInteractor call(final NamedSuperCall<VoiceInteractor> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.getVoiceInteractor(superCall);

                    }
                }, new SuperCall<VoiceInteractor>() {
                    @Override
                    public VoiceInteractor call(final Object... args) {
                        return getOriginal().super_getVoiceInteractor();
                    }
                });
    }

    public Drawable getWallpaper() {
        return callFunction("getWallpaper()", new PluginCall<ActivityPlugin, Drawable>() {
            @Override
            public Drawable call(final NamedSuperCall<Drawable> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getWallpaper(superCall);

            }
        }, new SuperCall<Drawable>() {
            @Override
            public Drawable call(final Object... args) {
                return getOriginal().super_getWallpaper();
            }
        });
    }

    public int getWallpaperDesiredMinimumHeight() {
        return callFunction("getWallpaperDesiredMinimumHeight()",
                new PluginCall<ActivityPlugin, Integer>() {
                    @Override
                    public Integer call(final NamedSuperCall<Integer> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.getWallpaperDesiredMinimumHeight(superCall);

                    }
                }, new SuperCall<Integer>() {
                    @Override
                    public Integer call(final Object... args) {
                        return getOriginal().super_getWallpaperDesiredMinimumHeight();
                    }
                });
    }

    public int getWallpaperDesiredMinimumWidth() {
        return callFunction("getWallpaperDesiredMinimumWidth()",
                new PluginCall<ActivityPlugin, Integer>() {
                    @Override
                    public Integer call(final NamedSuperCall<Integer> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.getWallpaperDesiredMinimumWidth(superCall);

                    }
                }, new SuperCall<Integer>() {
                    @Override
                    public Integer call(final Object... args) {
                        return getOriginal().super_getWallpaperDesiredMinimumWidth();
                    }
                });
    }

    public Window getWindow() {
        return callFunction("getWindow()", new PluginCall<ActivityPlugin, Window>() {
            @Override
            public Window call(final NamedSuperCall<Window> superCall, final ActivityPlugin plugin,
                    final Object... args) {

                return plugin.getWindow(superCall);

            }
        }, new SuperCall<Window>() {
            @Override
            public Window call(final Object... args) {
                return getOriginal().super_getWindow();
            }
        });
    }

    public WindowManager getWindowManager() {
        return callFunction("getWindowManager()", new PluginCall<ActivityPlugin, WindowManager>() {
            @Override
            public WindowManager call(final NamedSuperCall<WindowManager> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.getWindowManager(superCall);

            }
        }, new SuperCall<WindowManager>() {
            @Override
            public WindowManager call(final Object... args) {
                return getOriginal().super_getWindowManager();
            }
        });
    }

    public void grantUriPermission(final String toPackage, final Uri uri, final int modeFlags) {
        callHook("grantUriPermission(String, Uri, int)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.grantUriPermission(superCall, (String) args[0], (Uri) args[1],
                        (int) args[2]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal()
                        .super_grantUriPermission((String) args[0], (Uri) args[1], (int) args[2]);
            }
        }, toPackage, uri, modeFlags);
    }

    public boolean hasWindowFocus() {
        return callFunction("hasWindowFocus()", new PluginCall<ActivityPlugin, Boolean>() {
            @Override
            public Boolean call(final NamedSuperCall<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.hasWindowFocus(superCall);

            }
        }, new SuperCall<Boolean>() {
            @Override
            public Boolean call(final Object... args) {
                return getOriginal().super_hasWindowFocus();
            }
        });
    }

    public void invalidateOptionsMenu() {
        callHook("invalidateOptionsMenu()", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.invalidateOptionsMenu(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_invalidateOptionsMenu();
            }
        });
    }

    public boolean isChangingConfigurations() {
        return callFunction("isChangingConfigurations()",
                new PluginCall<ActivityPlugin, Boolean>() {
                    @Override
                    public Boolean call(final NamedSuperCall<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.isChangingConfigurations(superCall);

                    }
                }, new SuperCall<Boolean>() {
                    @Override
                    public Boolean call(final Object... args) {
                        return getOriginal().super_isChangingConfigurations();
                    }
                });
    }

    public boolean isDestroyed() {
        return callFunction("isDestroyed()", new PluginCall<ActivityPlugin, Boolean>() {
            @Override
            public Boolean call(final NamedSuperCall<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.isDestroyed(superCall);

            }
        }, new SuperCall<Boolean>() {
            @Override
            public Boolean call(final Object... args) {
                return getOriginal().super_isDestroyed();
            }
        });
    }

    public boolean isFinishing() {
        return callFunction("isFinishing()", new PluginCall<ActivityPlugin, Boolean>() {
            @Override
            public Boolean call(final NamedSuperCall<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.isFinishing(superCall);

            }
        }, new SuperCall<Boolean>() {
            @Override
            public Boolean call(final Object... args) {
                return getOriginal().super_isFinishing();
            }
        });
    }

    public boolean isImmersive() {
        return callFunction("isImmersive()", new PluginCall<ActivityPlugin, Boolean>() {
            @Override
            public Boolean call(final NamedSuperCall<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.isImmersive(superCall);

            }
        }, new SuperCall<Boolean>() {
            @Override
            public Boolean call(final Object... args) {
                return getOriginal().super_isImmersive();
            }
        });
    }

    public boolean isRestricted() {
        return callFunction("isRestricted()", new PluginCall<ActivityPlugin, Boolean>() {
            @Override
            public Boolean call(final NamedSuperCall<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.isRestricted(superCall);

            }
        }, new SuperCall<Boolean>() {
            @Override
            public Boolean call(final Object... args) {
                return getOriginal().super_isRestricted();
            }
        });
    }

    public boolean isTaskRoot() {
        return callFunction("isTaskRoot()", new PluginCall<ActivityPlugin, Boolean>() {
            @Override
            public Boolean call(final NamedSuperCall<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.isTaskRoot(superCall);

            }
        }, new SuperCall<Boolean>() {
            @Override
            public Boolean call(final Object... args) {
                return getOriginal().super_isTaskRoot();
            }
        });
    }

    public boolean isVoiceInteraction() {
        return callFunction("isVoiceInteraction()", new PluginCall<ActivityPlugin, Boolean>() {
            @Override
            public Boolean call(final NamedSuperCall<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.isVoiceInteraction(superCall);

            }
        }, new SuperCall<Boolean>() {
            @Override
            public Boolean call(final Object... args) {
                return getOriginal().super_isVoiceInteraction();
            }
        });
    }

    public boolean isVoiceInteractionRoot() {
        return callFunction("isVoiceInteractionRoot()", new PluginCall<ActivityPlugin, Boolean>() {
            @Override
            public Boolean call(final NamedSuperCall<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.isVoiceInteractionRoot(superCall);

            }
        }, new SuperCall<Boolean>() {
            @Override
            public Boolean call(final Object... args) {
                return getOriginal().super_isVoiceInteractionRoot();
            }
        });
    }

    public boolean moveTaskToBack(final boolean nonRoot) {
        return callFunction("moveTaskToBack(boolean)", new PluginCall<ActivityPlugin, Boolean>() {
            @Override
            public Boolean call(final NamedSuperCall<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.moveTaskToBack(superCall, (boolean) args[0]);

            }
        }, new SuperCall<Boolean>() {
            @Override
            public Boolean call(final Object... args) {
                return getOriginal().super_moveTaskToBack((boolean) args[0]);
            }
        }, nonRoot);
    }

    public boolean navigateUpTo(final Intent upIntent) {
        return callFunction("navigateUpTo(Intent)", new PluginCall<ActivityPlugin, Boolean>() {
            @Override
            public Boolean call(final NamedSuperCall<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.navigateUpTo(superCall, (Intent) args[0]);

            }
        }, new SuperCall<Boolean>() {
            @Override
            public Boolean call(final Object... args) {
                return getOriginal().super_navigateUpTo((Intent) args[0]);
            }
        }, upIntent);
    }

    public boolean navigateUpToFromChild(final Activity child, final Intent upIntent) {
        return callFunction("navigateUpToFromChild(Activity, Intent)",
                new PluginCall<ActivityPlugin, Boolean>() {
                    @Override
                    public Boolean call(final NamedSuperCall<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.navigateUpToFromChild(superCall, (Activity) args[0],
                                (Intent) args[1]);

                    }
                }, new SuperCall<Boolean>() {
                    @Override
                    public Boolean call(final Object... args) {
                        return getOriginal()
                                .super_navigateUpToFromChild((Activity) args[0], (Intent) args[1]);
                    }
                }, child, upIntent);
    }

    public void onActionModeFinished(final android.view.ActionMode mode) {
        callHook("onActionModeFinished(android.view.ActionMode)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.onActionModeFinished(superCall, (android.view.ActionMode) args[0]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().super_onActionModeFinished((android.view.ActionMode) args[0]);
                    }
                }, mode);
    }

    public void onActionModeStarted(final android.view.ActionMode mode) {
        callHook("onActionModeStarted(android.view.ActionMode)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.onActionModeStarted(superCall, (android.view.ActionMode) args[0]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().super_onActionModeStarted((android.view.ActionMode) args[0]);
                    }
                }, mode);
    }

    public void onActivityReenter(final int resultCode, final Intent data) {
        callHook("onActivityReenter(int, Intent)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onActivityReenter(superCall, (int) args[0], (Intent) args[1]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onActivityReenter((int) args[0], (Intent) args[1]);
            }
        }, resultCode, data);
    }

    public void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        callHook("onActivityResult(int, int, Intent)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onActivityResult(superCall, (int) args[0], (int) args[1], (Intent) args[2]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal()
                        .super_onActivityResult((int) args[0], (int) args[1], (Intent) args[2]);
            }
        }, requestCode, resultCode, data);
    }

    public void onApplyThemeResource(final Resources.Theme theme, final int resid,
            final boolean first) {
        callHook("onApplyThemeResource(Resources.Theme, int, boolean)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.onApplyThemeResource(superCall, (Resources.Theme) args[0],
                                (int) args[1], (boolean) args[2]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().super_onApplyThemeResource((Resources.Theme) args[0],
                                (int) args[1], (boolean) args[2]);
                    }
                }, theme, resid, first);
    }

    public void onAttachFragment(final Fragment fragment) {
        callHook("onAttachFragment(Fragment)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onAttachFragment(superCall, (Fragment) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onAttachFragment((Fragment) args[0]);
            }
        }, fragment);
    }

    public void onAttachFragment(final android.app.Fragment fragment) {
        callHook("onAttachFragment(android.app.Fragment)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onAttachFragment(superCall, (android.app.Fragment) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onAttachFragment((android.app.Fragment) args[0]);
            }
        }, fragment);
    }

    public void onAttachedToWindow() {
        callHook("onAttachedToWindow()", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onAttachedToWindow(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onAttachedToWindow();
            }
        });
    }

    public void onBackPressed() {
        callHook("onBackPressed()", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onBackPressed(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onBackPressed();
            }
        });
    }

    public void onChildTitleChanged(final Activity childActivity, final CharSequence title) {
        callHook("onChildTitleChanged(Activity, CharSequence)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.onChildTitleChanged(superCall, (Activity) args[0],
                                (CharSequence) args[1]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().super_onChildTitleChanged((Activity) args[0],
                                (CharSequence) args[1]);
                    }
                }, childActivity, title);
    }

    public void onConfigurationChanged(final Configuration newConfig) {
        callHook("onConfigurationChanged(Configuration)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onConfigurationChanged(superCall, (Configuration) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onConfigurationChanged((Configuration) args[0]);
            }
        }, newConfig);
    }

    public void onContentChanged() {
        callHook("onContentChanged()", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onContentChanged(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onContentChanged();
            }
        });
    }

    public boolean onContextItemSelected(final MenuItem item) {
        return callFunction("onContextItemSelected(MenuItem)",
                new PluginCall<ActivityPlugin, Boolean>() {
                    @Override
                    public Boolean call(final NamedSuperCall<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.onContextItemSelected(superCall, (MenuItem) args[0]);

                    }
                }, new SuperCall<Boolean>() {
                    @Override
                    public Boolean call(final Object... args) {
                        return getOriginal().super_onContextItemSelected((MenuItem) args[0]);
                    }
                }, item);
    }

    public void onContextMenuClosed(final Menu menu) {
        callHook("onContextMenuClosed(Menu)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onContextMenuClosed(superCall, (Menu) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onContextMenuClosed((Menu) args[0]);
            }
        }, menu);
    }

    public void onCreate(final Bundle savedInstanceState, final PersistableBundle persistentState) {
        callHook("onCreate(Bundle, PersistableBundle)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onCreate(superCall, (Bundle) args[0], (PersistableBundle) args[1]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onCreate((Bundle) args[0], (PersistableBundle) args[1]);
            }
        }, savedInstanceState, persistentState);
    }

    public void onCreate(@Nullable final Bundle savedInstanceState) {
        callHook("onCreate(Bundle)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onCreate(superCall, (Bundle) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onCreate((Bundle) args[0]);
            }
        }, savedInstanceState);
    }

    public void onCreateContextMenu(final ContextMenu menu, final View v,
            final ContextMenu.ContextMenuInfo menuInfo) {
        callHook("onCreateContextMenu(ContextMenu, View, ContextMenu.ContextMenuInfo)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.onCreateContextMenu(superCall, (ContextMenu) args[0], (View) args[1],
                                (ContextMenu.ContextMenuInfo) args[2]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal()
                                .super_onCreateContextMenu((ContextMenu) args[0], (View) args[1],
                                        (ContextMenu.ContextMenuInfo) args[2]);
                    }
                }, menu, v, menuInfo);
    }

    public CharSequence onCreateDescription() {
        return callFunction("onCreateDescription()",
                new PluginCall<ActivityPlugin, CharSequence>() {
                    @Override
                    public CharSequence call(final NamedSuperCall<CharSequence> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.onCreateDescription(superCall);

                    }
                }, new SuperCall<CharSequence>() {
                    @Override
                    public CharSequence call(final Object... args) {
                        return getOriginal().super_onCreateDescription();
                    }
                });
    }

    public Dialog onCreateDialog(final int id) {
        return callFunction("onCreateDialog(int)", new PluginCall<ActivityPlugin, Dialog>() {
            @Override
            public Dialog call(final NamedSuperCall<Dialog> superCall, final ActivityPlugin plugin,
                    final Object... args) {

                return plugin.onCreateDialog(superCall, (int) args[0]);

            }
        }, new SuperCall<Dialog>() {
            @Override
            public Dialog call(final Object... args) {
                return getOriginal().super_onCreateDialog((int) args[0]);
            }
        }, id);
    }

    public Dialog onCreateDialog(final int id, final Bundle args) {
        return callFunction("onCreateDialog(int, Bundle)",
                new PluginCall<ActivityPlugin, Dialog>() {
                    @Override
                    public Dialog call(final NamedSuperCall<Dialog> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.onCreateDialog(superCall, (int) args[0], (Bundle) args[1]);

                    }
                }, new SuperCall<Dialog>() {
                    @Override
                    public Dialog call(final Object... args) {
                        return getOriginal().super_onCreateDialog((int) args[0], (Bundle) args[1]);
                    }
                }, id, args);
    }

    public void onCreateNavigateUpTaskStack(final TaskStackBuilder builder) {
        callHook("onCreateNavigateUpTaskStack(TaskStackBuilder)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.onCreateNavigateUpTaskStack(superCall, (TaskStackBuilder) args[0]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().super_onCreateNavigateUpTaskStack((TaskStackBuilder) args[0]);
                    }
                }, builder);
    }

    public boolean onCreateOptionsMenu(final Menu menu) {
        return callFunction("onCreateOptionsMenu(Menu)", new PluginCall<ActivityPlugin, Boolean>() {
            @Override
            public Boolean call(final NamedSuperCall<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.onCreateOptionsMenu(superCall, (Menu) args[0]);

            }
        }, new SuperCall<Boolean>() {
            @Override
            public Boolean call(final Object... args) {
                return getOriginal().super_onCreateOptionsMenu((Menu) args[0]);
            }
        }, menu);
    }

    public boolean onCreatePanelMenu(final int featureId, final Menu menu) {
        return callFunction("onCreatePanelMenu(int, Menu)",
                new PluginCall<ActivityPlugin, Boolean>() {
                    @Override
                    public Boolean call(final NamedSuperCall<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.onCreatePanelMenu(superCall, (int) args[0], (Menu) args[1]);

                    }
                }, new SuperCall<Boolean>() {
                    @Override
                    public Boolean call(final Object... args) {
                        return getOriginal().super_onCreatePanelMenu((int) args[0], (Menu) args[1]);
                    }
                }, featureId, menu);
    }

    public View onCreatePanelView(final int featureId) {
        return callFunction("onCreatePanelView(int)", new PluginCall<ActivityPlugin, View>() {
            @Override
            public View call(final NamedSuperCall<View> superCall, final ActivityPlugin plugin,
                    final Object... args) {

                return plugin.onCreatePanelView(superCall, (int) args[0]);

            }
        }, new SuperCall<View>() {
            @Override
            public View call(final Object... args) {
                return getOriginal().super_onCreatePanelView((int) args[0]);
            }
        }, featureId);
    }

    public void onCreateSupportNavigateUpTaskStack(
            @NonNull final android.support.v4.app.TaskStackBuilder builder) {
        callHook("onCreateSupportNavigateUpTaskStack(android.support.v4.app.TaskStackBuilder)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.onCreateSupportNavigateUpTaskStack(superCall,
                                (android.support.v4.app.TaskStackBuilder) args[0]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().super_onCreateSupportNavigateUpTaskStack(
                                (android.support.v4.app.TaskStackBuilder) args[0]);
                    }
                }, builder);
    }

    public boolean onCreateThumbnail(final Bitmap outBitmap, final Canvas canvas) {
        return callFunction("onCreateThumbnail(Bitmap, Canvas)",
                new PluginCall<ActivityPlugin, Boolean>() {
                    @Override
                    public Boolean call(final NamedSuperCall<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin
                                .onCreateThumbnail(superCall, (Bitmap) args[0], (Canvas) args[1]);

                    }
                }, new SuperCall<Boolean>() {
                    @Override
                    public Boolean call(final Object... args) {
                        return getOriginal()
                                .super_onCreateThumbnail((Bitmap) args[0], (Canvas) args[1]);
                    }
                }, outBitmap, canvas);
    }

    public View onCreateView(final View parent, final String name, final Context context,
            final AttributeSet attrs) {
        return callFunction("onCreateView(View, String, Context, AttributeSet)",
                new PluginCall<ActivityPlugin, View>() {
                    @Override
                    public View call(final NamedSuperCall<View> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.onCreateView(superCall, (View) args[0], (String) args[1],
                                (Context) args[2], (AttributeSet) args[3]);

                    }
                }, new SuperCall<View>() {
                    @Override
                    public View call(final Object... args) {
                        return getOriginal().super_onCreateView((View) args[0], (String) args[1],
                                (Context) args[2], (AttributeSet) args[3]);
                    }
                }, parent, name, context, attrs);
    }

    public View onCreateView(final String name, final Context context, final AttributeSet attrs) {
        return callFunction("onCreateView(String, Context, AttributeSet)",
                new PluginCall<ActivityPlugin, View>() {
                    @Override
                    public View call(final NamedSuperCall<View> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.onCreateView(superCall, (String) args[0], (Context) args[1],
                                (AttributeSet) args[2]);

                    }
                }, new SuperCall<View>() {
                    @Override
                    public View call(final Object... args) {
                        return getOriginal().super_onCreateView((String) args[0], (Context) args[1],
                                (AttributeSet) args[2]);
                    }
                }, name, context, attrs);
    }

    public void onDestroy() {
        callHook("onDestroy()", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onDestroy(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onDestroy();
            }
        });
    }

    public void onDetachedFromWindow() {
        callHook("onDetachedFromWindow()", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onDetachedFromWindow(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onDetachedFromWindow();
            }
        });
    }

    public void onEnterAnimationComplete() {
        callHook("onEnterAnimationComplete()", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onEnterAnimationComplete(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onEnterAnimationComplete();
            }
        });
    }

    public boolean onGenericMotionEvent(final MotionEvent event) {
        return callFunction("onGenericMotionEvent(MotionEvent)",
                new PluginCall<ActivityPlugin, Boolean>() {
                    @Override
                    public Boolean call(final NamedSuperCall<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.onGenericMotionEvent(superCall, (MotionEvent) args[0]);

                    }
                }, new SuperCall<Boolean>() {
                    @Override
                    public Boolean call(final Object... args) {
                        return getOriginal().super_onGenericMotionEvent((MotionEvent) args[0]);
                    }
                }, event);
    }

    public boolean onKeyDown(final int keyCode, final KeyEvent event) {
        return callFunction("onKeyDown(int, KeyEvent)", new PluginCall<ActivityPlugin, Boolean>() {
            @Override
            public Boolean call(final NamedSuperCall<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.onKeyDown(superCall, (int) args[0], (KeyEvent) args[1]);

            }
        }, new SuperCall<Boolean>() {
            @Override
            public Boolean call(final Object... args) {
                return getOriginal().super_onKeyDown((int) args[0], (KeyEvent) args[1]);
            }
        }, keyCode, event);
    }

    public boolean onKeyLongPress(final int keyCode, final KeyEvent event) {
        return callFunction("onKeyLongPress(int, KeyEvent)",
                new PluginCall<ActivityPlugin, Boolean>() {
                    @Override
                    public Boolean call(final NamedSuperCall<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.onKeyLongPress(superCall, (int) args[0], (KeyEvent) args[1]);

                    }
                }, new SuperCall<Boolean>() {
                    @Override
                    public Boolean call(final Object... args) {
                        return getOriginal()
                                .super_onKeyLongPress((int) args[0], (KeyEvent) args[1]);
                    }
                }, keyCode, event);
    }

    public boolean onKeyMultiple(final int keyCode, final int repeatCount, final KeyEvent event) {
        return callFunction("onKeyMultiple(int, int, KeyEvent)",
                new PluginCall<ActivityPlugin, Boolean>() {
                    @Override
                    public Boolean call(final NamedSuperCall<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.onKeyMultiple(superCall, (int) args[0], (int) args[1],
                                (KeyEvent) args[2]);

                    }
                }, new SuperCall<Boolean>() {
                    @Override
                    public Boolean call(final Object... args) {
                        return getOriginal().super_onKeyMultiple((int) args[0], (int) args[1],
                                (KeyEvent) args[2]);
                    }
                }, keyCode, repeatCount, event);
    }

    public boolean onKeyShortcut(final int keyCode, final KeyEvent event) {
        return callFunction("onKeyShortcut(int, KeyEvent)",
                new PluginCall<ActivityPlugin, Boolean>() {
                    @Override
                    public Boolean call(final NamedSuperCall<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.onKeyShortcut(superCall, (int) args[0], (KeyEvent) args[1]);

                    }
                }, new SuperCall<Boolean>() {
                    @Override
                    public Boolean call(final Object... args) {
                        return getOriginal().super_onKeyShortcut((int) args[0], (KeyEvent) args[1]);
                    }
                }, keyCode, event);
    }

    public boolean onKeyUp(final int keyCode, final KeyEvent event) {
        return callFunction("onKeyUp(int, KeyEvent)", new PluginCall<ActivityPlugin, Boolean>() {
            @Override
            public Boolean call(final NamedSuperCall<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.onKeyUp(superCall, (int) args[0], (KeyEvent) args[1]);

            }
        }, new SuperCall<Boolean>() {
            @Override
            public Boolean call(final Object... args) {
                return getOriginal().super_onKeyUp((int) args[0], (KeyEvent) args[1]);
            }
        }, keyCode, event);
    }

    public void onLowMemory() {
        callHook("onLowMemory()", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onLowMemory(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onLowMemory();
            }
        });
    }

    public boolean onMenuOpened(final int featureId, final Menu menu) {
        return callFunction("onMenuOpened(int, Menu)", new PluginCall<ActivityPlugin, Boolean>() {
            @Override
            public Boolean call(final NamedSuperCall<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.onMenuOpened(superCall, (int) args[0], (Menu) args[1]);

            }
        }, new SuperCall<Boolean>() {
            @Override
            public Boolean call(final Object... args) {
                return getOriginal().super_onMenuOpened((int) args[0], (Menu) args[1]);
            }
        }, featureId, menu);
    }

    public boolean onNavigateUp() {
        return callFunction("onNavigateUp()", new PluginCall<ActivityPlugin, Boolean>() {
            @Override
            public Boolean call(final NamedSuperCall<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.onNavigateUp(superCall);

            }
        }, new SuperCall<Boolean>() {
            @Override
            public Boolean call(final Object... args) {
                return getOriginal().super_onNavigateUp();
            }
        });
    }

    public boolean onNavigateUpFromChild(final Activity child) {
        return callFunction("onNavigateUpFromChild(Activity)",
                new PluginCall<ActivityPlugin, Boolean>() {
                    @Override
                    public Boolean call(final NamedSuperCall<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.onNavigateUpFromChild(superCall, (Activity) args[0]);

                    }
                }, new SuperCall<Boolean>() {
                    @Override
                    public Boolean call(final Object... args) {
                        return getOriginal().super_onNavigateUpFromChild((Activity) args[0]);
                    }
                }, child);
    }

    public void onNewIntent(final Intent intent) {
        callHook("onNewIntent(Intent)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onNewIntent(superCall, (Intent) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onNewIntent((Intent) args[0]);
            }
        }, intent);
    }

    public boolean onOptionsItemSelected(final MenuItem item) {
        return callFunction("onOptionsItemSelected(MenuItem)",
                new PluginCall<ActivityPlugin, Boolean>() {
                    @Override
                    public Boolean call(final NamedSuperCall<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.onOptionsItemSelected(superCall, (MenuItem) args[0]);

                    }
                }, new SuperCall<Boolean>() {
                    @Override
                    public Boolean call(final Object... args) {
                        return getOriginal().super_onOptionsItemSelected((MenuItem) args[0]);
                    }
                }, item);
    }

    public void onOptionsMenuClosed(final Menu menu) {
        callHook("onOptionsMenuClosed(Menu)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onOptionsMenuClosed(superCall, (Menu) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onOptionsMenuClosed((Menu) args[0]);
            }
        }, menu);
    }

    public void onPanelClosed(final int featureId, final Menu menu) {
        callHook("onPanelClosed(int, Menu)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onPanelClosed(superCall, (int) args[0], (Menu) args[1]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onPanelClosed((int) args[0], (Menu) args[1]);
            }
        }, featureId, menu);
    }

    public void onPause() {
        callHook("onPause()", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onPause(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onPause();
            }
        });
    }

    public void onPostCreate(final Bundle savedInstanceState,
            final PersistableBundle persistentState) {
        callHook("onPostCreate(Bundle, PersistableBundle)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onPostCreate(superCall, (Bundle) args[0], (PersistableBundle) args[1]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onPostCreate((Bundle) args[0], (PersistableBundle) args[1]);
            }
        }, savedInstanceState, persistentState);
    }

    public void onPostCreate(@Nullable final Bundle savedInstanceState) {
        callHook("onPostCreate(Bundle)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onPostCreate(superCall, (Bundle) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onPostCreate((Bundle) args[0]);
            }
        }, savedInstanceState);
    }

    public void onPostResume() {
        callHook("onPostResume()", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onPostResume(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onPostResume();
            }
        });
    }

    public void onPrepareDialog(final int id, final Dialog dialog) {
        callHook("onPrepareDialog(int, Dialog)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onPrepareDialog(superCall, (int) args[0], (Dialog) args[1]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onPrepareDialog((int) args[0], (Dialog) args[1]);
            }
        }, id, dialog);
    }

    public void onPrepareDialog(final int id, final Dialog dialog, final Bundle args) {
        callHook("onPrepareDialog(int, Dialog, Bundle)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onPrepareDialog(superCall, (int) args[0], (Dialog) args[1],
                        (Bundle) args[2]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal()
                        .super_onPrepareDialog((int) args[0], (Dialog) args[1], (Bundle) args[2]);
            }
        }, id, dialog, args);
    }

    public void onPrepareNavigateUpTaskStack(final TaskStackBuilder builder) {
        callHook("onPrepareNavigateUpTaskStack(TaskStackBuilder)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.onPrepareNavigateUpTaskStack(superCall, (TaskStackBuilder) args[0]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal()
                                .super_onPrepareNavigateUpTaskStack((TaskStackBuilder) args[0]);
                    }
                }, builder);
    }

    public boolean onPrepareOptionsMenu(final Menu menu) {
        return callFunction("onPrepareOptionsMenu(Menu)",
                new PluginCall<ActivityPlugin, Boolean>() {
                    @Override
                    public Boolean call(final NamedSuperCall<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.onPrepareOptionsMenu(superCall, (Menu) args[0]);

                    }
                }, new SuperCall<Boolean>() {
                    @Override
                    public Boolean call(final Object... args) {
                        return getOriginal().super_onPrepareOptionsMenu((Menu) args[0]);
                    }
                }, menu);
    }

    public boolean onPrepareOptionsPanel(final View view, final Menu menu) {
        return callFunction("onPrepareOptionsPanel(View, Menu)",
                new PluginCall<ActivityPlugin, Boolean>() {
                    @Override
                    public Boolean call(final NamedSuperCall<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin
                                .onPrepareOptionsPanel(superCall, (View) args[0], (Menu) args[1]);

                    }
                }, new SuperCall<Boolean>() {
                    @Override
                    public Boolean call(final Object... args) {
                        return getOriginal()
                                .super_onPrepareOptionsPanel((View) args[0], (Menu) args[1]);
                    }
                }, view, menu);
    }

    public boolean onPreparePanel(final int featureId, final View view, final Menu menu) {
        return callFunction("onPreparePanel(int, View, Menu)",
                new PluginCall<ActivityPlugin, Boolean>() {
                    @Override
                    public Boolean call(final NamedSuperCall<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.onPreparePanel(superCall, (int) args[0], (View) args[1],
                                (Menu) args[2]);

                    }
                }, new SuperCall<Boolean>() {
                    @Override
                    public Boolean call(final Object... args) {
                        return getOriginal().super_onPreparePanel((int) args[0], (View) args[1],
                                (Menu) args[2]);
                    }
                }, featureId, view, menu);
    }

    public void onPrepareSupportNavigateUpTaskStack(
            @NonNull final android.support.v4.app.TaskStackBuilder builder) {
        callHook("onPrepareSupportNavigateUpTaskStack(android.support.v4.app.TaskStackBuilder)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.onPrepareSupportNavigateUpTaskStack(superCall,
                                (android.support.v4.app.TaskStackBuilder) args[0]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().super_onPrepareSupportNavigateUpTaskStack(
                                (android.support.v4.app.TaskStackBuilder) args[0]);
                    }
                }, builder);
    }

    public void onProvideAssistContent(final AssistContent outContent) {
        callHook("onProvideAssistContent(AssistContent)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onProvideAssistContent(superCall, (AssistContent) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onProvideAssistContent((AssistContent) args[0]);
            }
        }, outContent);
    }

    public void onProvideAssistData(final Bundle data) {
        callHook("onProvideAssistData(Bundle)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onProvideAssistData(superCall, (Bundle) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onProvideAssistData((Bundle) args[0]);
            }
        }, data);
    }

    public Uri onProvideReferrer() {
        return callFunction("onProvideReferrer()", new PluginCall<ActivityPlugin, Uri>() {
            @Override
            public Uri call(final NamedSuperCall<Uri> superCall, final ActivityPlugin plugin,
                    final Object... args) {

                return plugin.onProvideReferrer(superCall);

            }
        }, new SuperCall<Uri>() {
            @Override
            public Uri call(final Object... args) {
                return getOriginal().super_onProvideReferrer();
            }
        });
    }

    public void onRequestPermissionsResult(final int requestCode,
            @NonNull final String[] permissions, @NonNull final int[] grantResults) {
        callHook("onRequestPermissionsResult(int, String[], int[])",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.onRequestPermissionsResult(superCall, (int) args[0],
                                (String[]) args[1], (int[]) args[2]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal()
                                .super_onRequestPermissionsResult((int) args[0], (String[]) args[1],
                                        (int[]) args[2]);
                    }
                }, requestCode, permissions, grantResults);
    }

    public void onRestart() {
        callHook("onRestart()", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onRestart(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onRestart();
            }
        });
    }

    public void onRestoreInstanceState(final Bundle savedInstanceState,
            final PersistableBundle persistentState) {
        callHook("onRestoreInstanceState(Bundle, PersistableBundle)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.onRestoreInstanceState(superCall, (Bundle) args[0],
                                (PersistableBundle) args[1]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().super_onRestoreInstanceState((Bundle) args[0],
                                (PersistableBundle) args[1]);
                    }
                }, savedInstanceState, persistentState);
    }

    public void onRestoreInstanceState(final Bundle savedInstanceState) {
        callHook("onRestoreInstanceState(Bundle)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onRestoreInstanceState(superCall, (Bundle) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onRestoreInstanceState((Bundle) args[0]);
            }
        }, savedInstanceState);
    }

    public void onResume() {
        callHook("onResume()", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onResume(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onResume();
            }
        });
    }

    public void onResumeFragments() {
        callHook("onResumeFragments()", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onResumeFragments(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onResumeFragments();
            }
        });
    }

    public Object onRetainNonConfigurationInstance() {
        final NonConfigurationInstanceWrapper all = new NonConfigurationInstanceWrapper(
                getOriginal().onRetainCompositeCustomNonConfigurationInstance());
        for (final ActivityPlugin plugin : mPlugins) {
            final CompositeNonConfigurationInstance pluginNci = plugin
                    .onRetainNonConfigurationInstance();
            if (pluginNci != null) {
                all.putPluginNonConfigurationInstance(pluginNci);
            }
        }
        return all;
    }

    public void onSaveInstanceState(final Bundle outState,
            final PersistableBundle outPersistentState) {
        callHook("onSaveInstanceState(Bundle, PersistableBundle)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.onSaveInstanceState(superCall, (Bundle) args[0],
                                (PersistableBundle) args[1]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().super_onSaveInstanceState((Bundle) args[0],
                                (PersistableBundle) args[1]);
                    }
                }, outState, outPersistentState);
    }

    public void onSaveInstanceState(final Bundle outState) {
        callHook("onSaveInstanceState(Bundle)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onSaveInstanceState(superCall, (Bundle) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onSaveInstanceState((Bundle) args[0]);
            }
        }, outState);
    }

    public boolean onSearchRequested(final SearchEvent searchEvent) {
        return callFunction("onSearchRequested(SearchEvent)",
                new PluginCall<ActivityPlugin, Boolean>() {
                    @Override
                    public Boolean call(final NamedSuperCall<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.onSearchRequested(superCall, (SearchEvent) args[0]);

                    }
                }, new SuperCall<Boolean>() {
                    @Override
                    public Boolean call(final Object... args) {
                        return getOriginal().super_onSearchRequested((SearchEvent) args[0]);
                    }
                }, searchEvent);
    }

    public boolean onSearchRequested() {
        return callFunction("onSearchRequested()", new PluginCall<ActivityPlugin, Boolean>() {
            @Override
            public Boolean call(final NamedSuperCall<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.onSearchRequested(superCall);

            }
        }, new SuperCall<Boolean>() {
            @Override
            public Boolean call(final Object... args) {
                return getOriginal().super_onSearchRequested();
            }
        });
    }

    public void onStart() {
        callHook("onStart()", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onStart(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onStart();
            }
        });
    }

    public void onStateNotSaved() {
        callHook("onStateNotSaved()", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onStateNotSaved(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onStateNotSaved();
            }
        });
    }

    public void onStop() {
        callHook("onStop()", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onStop(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onStop();
            }
        });
    }

    public void onSupportActionModeFinished(@NonNull final ActionMode mode) {
        callHook("onSupportActionModeFinished(ActionMode)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onSupportActionModeFinished(superCall, (ActionMode) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onSupportActionModeFinished((ActionMode) args[0]);
            }
        }, mode);
    }

    public void onSupportActionModeStarted(@NonNull final ActionMode mode) {
        callHook("onSupportActionModeStarted(ActionMode)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onSupportActionModeStarted(superCall, (ActionMode) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onSupportActionModeStarted((ActionMode) args[0]);
            }
        }, mode);
    }

    public void onSupportContentChanged() {
        callHook("onSupportContentChanged()", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onSupportContentChanged(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onSupportContentChanged();
            }
        });
    }

    public boolean onSupportNavigateUp() {
        return callFunction("onSupportNavigateUp()", new PluginCall<ActivityPlugin, Boolean>() {
            @Override
            public Boolean call(final NamedSuperCall<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.onSupportNavigateUp(superCall);

            }
        }, new SuperCall<Boolean>() {
            @Override
            public Boolean call(final Object... args) {
                return getOriginal().super_onSupportNavigateUp();
            }
        });
    }

    public void onTitleChanged(final CharSequence title, final int color) {
        callHook("onTitleChanged(CharSequence, int)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onTitleChanged(superCall, (CharSequence) args[0], (int) args[1]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onTitleChanged((CharSequence) args[0], (int) args[1]);
            }
        }, title, color);
    }

    public boolean onTouchEvent(final MotionEvent event) {
        return callFunction("onTouchEvent(MotionEvent)", new PluginCall<ActivityPlugin, Boolean>() {
            @Override
            public Boolean call(final NamedSuperCall<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.onTouchEvent(superCall, (MotionEvent) args[0]);

            }
        }, new SuperCall<Boolean>() {
            @Override
            public Boolean call(final Object... args) {
                return getOriginal().super_onTouchEvent((MotionEvent) args[0]);
            }
        }, event);
    }

    public boolean onTrackballEvent(final MotionEvent event) {
        return callFunction("onTrackballEvent(MotionEvent)",
                new PluginCall<ActivityPlugin, Boolean>() {
                    @Override
                    public Boolean call(final NamedSuperCall<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.onTrackballEvent(superCall, (MotionEvent) args[0]);

                    }
                }, new SuperCall<Boolean>() {
                    @Override
                    public Boolean call(final Object... args) {
                        return getOriginal().super_onTrackballEvent((MotionEvent) args[0]);
                    }
                }, event);
    }

    public void onTrimMemory(final int level) {
        callHook("onTrimMemory(int)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onTrimMemory(superCall, (int) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onTrimMemory((int) args[0]);
            }
        }, level);
    }

    public void onUserInteraction() {
        callHook("onUserInteraction()", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onUserInteraction(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onUserInteraction();
            }
        });
    }

    public void onUserLeaveHint() {
        callHook("onUserLeaveHint()", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onUserLeaveHint(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onUserLeaveHint();
            }
        });
    }

    public void onVisibleBehindCanceled() {
        callHook("onVisibleBehindCanceled()", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onVisibleBehindCanceled(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onVisibleBehindCanceled();
            }
        });
    }

    public void onWindowAttributesChanged(final WindowManager.LayoutParams params) {
        callHook("onWindowAttributesChanged(WindowManager.LayoutParams)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.onWindowAttributesChanged(superCall,
                                (WindowManager.LayoutParams) args[0]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().super_onWindowAttributesChanged(
                                (WindowManager.LayoutParams) args[0]);
                    }
                }, params);
    }

    public void onWindowFocusChanged(final boolean hasFocus) {
        callHook("onWindowFocusChanged(boolean)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.onWindowFocusChanged(superCall, (boolean) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onWindowFocusChanged((boolean) args[0]);
            }
        }, hasFocus);
    }

    public android.view.ActionMode onWindowStartingActionMode(
            final android.view.ActionMode.Callback callback) {
        return callFunction("onWindowStartingActionMode(android.view.ActionMode.Callback)",
                new PluginCall<ActivityPlugin, android.view.ActionMode>() {
                    @Override
                    public android.view.ActionMode call(
                            final NamedSuperCall<android.view.ActionMode> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.onWindowStartingActionMode(superCall,
                                (android.view.ActionMode.Callback) args[0]);

                    }
                }, new SuperCall<android.view.ActionMode>() {
                    @Override
                    public android.view.ActionMode call(final Object... args) {
                        return getOriginal().super_onWindowStartingActionMode(
                                (android.view.ActionMode.Callback) args[0]);
                    }
                }, callback);
    }

    public android.view.ActionMode onWindowStartingActionMode(
            final android.view.ActionMode.Callback callback, final int type) {
        return callFunction("onWindowStartingActionMode(android.view.ActionMode.Callback, int)",
                new PluginCall<ActivityPlugin, android.view.ActionMode>() {
                    @Override
                    public android.view.ActionMode call(
                            final NamedSuperCall<android.view.ActionMode> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.onWindowStartingActionMode(superCall,
                                (android.view.ActionMode.Callback) args[0], (int) args[1]);

                    }
                }, new SuperCall<android.view.ActionMode>() {
                    @Override
                    public android.view.ActionMode call(final Object... args) {
                        return getOriginal().super_onWindowStartingActionMode(
                                (android.view.ActionMode.Callback) args[0], (int) args[1]);
                    }
                }, callback, type);
    }

    public ActionMode onWindowStartingSupportActionMode(
            @NonNull final ActionMode.Callback callback) {
        return callFunction("onWindowStartingSupportActionMode(ActionMode.Callback)",
                new PluginCall<ActivityPlugin, ActionMode>() {
                    @Override
                    public ActionMode call(final NamedSuperCall<ActionMode> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.onWindowStartingSupportActionMode(superCall,
                                (ActionMode.Callback) args[0]);

                    }
                }, new SuperCall<ActionMode>() {
                    @Override
                    public ActionMode call(final Object... args) {
                        return getOriginal().super_onWindowStartingSupportActionMode(
                                (ActionMode.Callback) args[0]);
                    }
                }, callback);
    }

    public void openContextMenu(final View view) {
        callHook("openContextMenu(View)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.openContextMenu(superCall, (View) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_openContextMenu((View) args[0]);
            }
        }, view);
    }

    public FileInputStream openFileInput(final String name) {
        return callFunction("openFileInput(String)",
                new PluginCall<ActivityPlugin, FileInputStream>() {
                    @Override
                    public FileInputStream call(final NamedSuperCall<FileInputStream> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        try {
                            return plugin.openFileInput(superCall, (String) args[0]);
                        } catch (FileNotFoundException e) {
                            throw new SuppressedException(e);
                        }

                    }
                }, new SuperCall<FileInputStream>() {
                    @Override
                    public FileInputStream call(final Object... args) {
                        try {
                            return getOriginal().super_openFileInput((String) args[0]);
                        } catch (FileNotFoundException e) {
                            throw new SuppressedException(e);
                        }
                    }
                }, name);
    }

    public FileOutputStream openFileOutput(final String name, final int mode) {
        return callFunction("openFileOutput(String, int)",
                new PluginCall<ActivityPlugin, FileOutputStream>() {
                    @Override
                    public FileOutputStream call(final NamedSuperCall<FileOutputStream> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        try {
                            return plugin
                                    .openFileOutput(superCall, (String) args[0], (int) args[1]);
                        } catch (FileNotFoundException e) {
                            throw new SuppressedException(e);
                        }

                    }
                }, new SuperCall<FileOutputStream>() {
                    @Override
                    public FileOutputStream call(final Object... args) {
                        try {
                            return getOriginal()
                                    .super_openFileOutput((String) args[0], (int) args[1]);
                        } catch (FileNotFoundException e) {
                            throw new SuppressedException(e);
                        }
                    }
                }, name, mode);
    }

    public void openOptionsMenu() {
        callHook("openOptionsMenu()", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.openOptionsMenu(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_openOptionsMenu();
            }
        });
    }

    public SQLiteDatabase openOrCreateDatabase(final String name, final int mode,
            final SQLiteDatabase.CursorFactory factory) {
        return callFunction("openOrCreateDatabase(String, int, SQLiteDatabase.CursorFactory)",
                new PluginCall<ActivityPlugin, SQLiteDatabase>() {
                    @Override
                    public SQLiteDatabase call(final NamedSuperCall<SQLiteDatabase> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin
                                .openOrCreateDatabase(superCall, (String) args[0], (int) args[1],
                                        (SQLiteDatabase.CursorFactory) args[2]);

                    }
                }, new SuperCall<SQLiteDatabase>() {
                    @Override
                    public SQLiteDatabase call(final Object... args) {
                        return getOriginal()
                                .super_openOrCreateDatabase((String) args[0], (int) args[1],
                                        (SQLiteDatabase.CursorFactory) args[2]);
                    }
                }, name, mode, factory);
    }

    public SQLiteDatabase openOrCreateDatabase(final String name, final int mode,
            final SQLiteDatabase.CursorFactory factory, final DatabaseErrorHandler errorHandler) {
        return callFunction(
                "openOrCreateDatabase(String, int, SQLiteDatabase.CursorFactory, DatabaseErrorHandler)",
                new PluginCall<ActivityPlugin, SQLiteDatabase>() {
                    @Override
                    public SQLiteDatabase call(final NamedSuperCall<SQLiteDatabase> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin
                                .openOrCreateDatabase(superCall, (String) args[0], (int) args[1],
                                        (SQLiteDatabase.CursorFactory) args[2],
                                        (DatabaseErrorHandler) args[3]);

                    }
                }, new SuperCall<SQLiteDatabase>() {
                    @Override
                    public SQLiteDatabase call(final Object... args) {
                        return getOriginal()
                                .super_openOrCreateDatabase((String) args[0], (int) args[1],
                                        (SQLiteDatabase.CursorFactory) args[2],
                                        (DatabaseErrorHandler) args[3]);
                    }
                }, name, mode, factory, errorHandler);
    }

    public void overridePendingTransition(final int enterAnim, final int exitAnim) {
        callHook("overridePendingTransition(int, int)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.overridePendingTransition(superCall, (int) args[0], (int) args[1]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_overridePendingTransition((int) args[0], (int) args[1]);
            }
        }, enterAnim, exitAnim);
    }

    public Drawable peekWallpaper() {
        return callFunction("peekWallpaper()", new PluginCall<ActivityPlugin, Drawable>() {
            @Override
            public Drawable call(final NamedSuperCall<Drawable> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.peekWallpaper(superCall);

            }
        }, new SuperCall<Drawable>() {
            @Override
            public Drawable call(final Object... args) {
                return getOriginal().super_peekWallpaper();
            }
        });
    }

    public void postponeEnterTransition() {
        callHook("postponeEnterTransition()", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.postponeEnterTransition(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_postponeEnterTransition();
            }
        });
    }

    public void recreate() {
        callHook("recreate()", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.recreate(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_recreate();
            }
        });
    }

    public void registerComponentCallbacks(final ComponentCallbacks callback) {
        callHook("registerComponentCallbacks(ComponentCallbacks)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.registerComponentCallbacks(superCall, (ComponentCallbacks) args[0]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal()
                                .super_registerComponentCallbacks((ComponentCallbacks) args[0]);
                    }
                }, callback);
    }

    public void registerForContextMenu(final View view) {
        callHook("registerForContextMenu(View)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.registerForContextMenu(superCall, (View) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_registerForContextMenu((View) args[0]);
            }
        }, view);
    }

    public Intent registerReceiver(final BroadcastReceiver receiver, final IntentFilter filter) {
        return callFunction("registerReceiver(BroadcastReceiver, IntentFilter)",
                new PluginCall<ActivityPlugin, Intent>() {
                    @Override
                    public Intent call(final NamedSuperCall<Intent> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.registerReceiver(superCall, (BroadcastReceiver) args[0],
                                (IntentFilter) args[1]);

                    }
                }, new SuperCall<Intent>() {
                    @Override
                    public Intent call(final Object... args) {
                        return getOriginal().super_registerReceiver((BroadcastReceiver) args[0],
                                (IntentFilter) args[1]);
                    }
                }, receiver, filter);
    }

    public Intent registerReceiver(final BroadcastReceiver receiver, final IntentFilter filter,
            final String broadcastPermission, final Handler scheduler) {
        return callFunction("registerReceiver(BroadcastReceiver, IntentFilter, String, Handler)",
                new PluginCall<ActivityPlugin, Intent>() {
                    @Override
                    public Intent call(final NamedSuperCall<Intent> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.registerReceiver(superCall, (BroadcastReceiver) args[0],
                                (IntentFilter) args[1], (String) args[2], (Handler) args[3]);

                    }
                }, new SuperCall<Intent>() {
                    @Override
                    public Intent call(final Object... args) {
                        return getOriginal().super_registerReceiver((BroadcastReceiver) args[0],
                                (IntentFilter) args[1], (String) args[2], (Handler) args[3]);
                    }
                }, receiver, filter, broadcastPermission, scheduler);
    }

    public boolean releaseInstance() {
        return callFunction("releaseInstance()", new PluginCall<ActivityPlugin, Boolean>() {
            @Override
            public Boolean call(final NamedSuperCall<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.releaseInstance(superCall);

            }
        }, new SuperCall<Boolean>() {
            @Override
            public Boolean call(final Object... args) {
                return getOriginal().super_releaseInstance();
            }
        });
    }

    public void removeStickyBroadcast(final Intent intent) {
        callHook("removeStickyBroadcast(Intent)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.removeStickyBroadcast(superCall, (Intent) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_removeStickyBroadcast((Intent) args[0]);
            }
        }, intent);
    }

    public void removeStickyBroadcastAsUser(final Intent intent, final UserHandle user) {
        callHook("removeStickyBroadcastAsUser(Intent, UserHandle)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.removeStickyBroadcastAsUser(superCall, (Intent) args[0],
                                (UserHandle) args[1]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().super_removeStickyBroadcastAsUser((Intent) args[0],
                                (UserHandle) args[1]);
                    }
                }, intent, user);
    }

    public void reportFullyDrawn() {
        callHook("reportFullyDrawn()", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.reportFullyDrawn(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_reportFullyDrawn();
            }
        });
    }

    public boolean requestVisibleBehind(final boolean visible) {
        return callFunction("requestVisibleBehind(boolean)",
                new PluginCall<ActivityPlugin, Boolean>() {
                    @Override
                    public Boolean call(final NamedSuperCall<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.requestVisibleBehind(superCall, (boolean) args[0]);

                    }
                }, new SuperCall<Boolean>() {
                    @Override
                    public Boolean call(final Object... args) {
                        return getOriginal().super_requestVisibleBehind((boolean) args[0]);
                    }
                }, visible);
    }

    public void revokeUriPermission(final Uri uri, final int modeFlags) {
        callHook("revokeUriPermission(Uri, int)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.revokeUriPermission(superCall, (Uri) args[0], (int) args[1]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_revokeUriPermission((Uri) args[0], (int) args[1]);
            }
        }, uri, modeFlags);
    }

    public void sendBroadcast(final Intent intent) {
        callHook("sendBroadcast(Intent)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.sendBroadcast(superCall, (Intent) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_sendBroadcast((Intent) args[0]);
            }
        }, intent);
    }

    public void sendBroadcast(final Intent intent, final String receiverPermission) {
        callHook("sendBroadcast(Intent, String)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.sendBroadcast(superCall, (Intent) args[0], (String) args[1]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_sendBroadcast((Intent) args[0], (String) args[1]);
            }
        }, intent, receiverPermission);
    }

    public void sendBroadcastAsUser(final Intent intent, final UserHandle user) {
        callHook("sendBroadcastAsUser(Intent, UserHandle)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.sendBroadcastAsUser(superCall, (Intent) args[0], (UserHandle) args[1]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_sendBroadcastAsUser((Intent) args[0], (UserHandle) args[1]);
            }
        }, intent, user);
    }

    public void sendBroadcastAsUser(final Intent intent, final UserHandle user,
            final String receiverPermission) {
        callHook("sendBroadcastAsUser(Intent, UserHandle, String)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.sendBroadcastAsUser(superCall, (Intent) args[0],
                                (UserHandle) args[1], (String) args[2]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal()
                                .super_sendBroadcastAsUser((Intent) args[0], (UserHandle) args[1],
                                        (String) args[2]);
                    }
                }, intent, user, receiverPermission);
    }

    public void sendOrderedBroadcast(final Intent intent, final String receiverPermission) {
        callHook("sendOrderedBroadcast(Intent, String)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.sendOrderedBroadcast(superCall, (Intent) args[0], (String) args[1]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_sendOrderedBroadcast((Intent) args[0], (String) args[1]);
            }
        }, intent, receiverPermission);
    }

    public void sendOrderedBroadcast(final Intent intent, final String receiverPermission,
            final BroadcastReceiver resultReceiver, final Handler scheduler, final int initialCode,
            final String initialData, final Bundle initialExtras) {
        callHook(
                "sendOrderedBroadcast(Intent, String, BroadcastReceiver, Handler, int, String, Bundle)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.sendOrderedBroadcast(superCall, (Intent) args[0], (String) args[1],
                                (BroadcastReceiver) args[2], (Handler) args[3], (int) args[4],
                                (String) args[5], (Bundle) args[6]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().super_sendOrderedBroadcast((Intent) args[0], (String) args[1],
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
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.sendOrderedBroadcastAsUser(superCall, (Intent) args[0],
                                (UserHandle) args[1], (String) args[2], (BroadcastReceiver) args[3],
                                (Handler) args[4], (int) args[5], (String) args[6],
                                (Bundle) args[7]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().super_sendOrderedBroadcastAsUser((Intent) args[0],
                                (UserHandle) args[1], (String) args[2], (BroadcastReceiver) args[3],
                                (Handler) args[4], (int) args[5], (String) args[6],
                                (Bundle) args[7]);
                    }
                }, intent, user, receiverPermission, resultReceiver, scheduler, initialCode,
                initialData, initialExtras);
    }

    public void sendStickyBroadcast(final Intent intent) {
        callHook("sendStickyBroadcast(Intent)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.sendStickyBroadcast(superCall, (Intent) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_sendStickyBroadcast((Intent) args[0]);
            }
        }, intent);
    }

    public void sendStickyBroadcastAsUser(final Intent intent, final UserHandle user) {
        callHook("sendStickyBroadcastAsUser(Intent, UserHandle)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.sendStickyBroadcastAsUser(superCall, (Intent) args[0],
                                (UserHandle) args[1]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().super_sendStickyBroadcastAsUser((Intent) args[0],
                                (UserHandle) args[1]);
                    }
                }, intent, user);
    }

    public void sendStickyOrderedBroadcast(final Intent intent,
            final BroadcastReceiver resultReceiver, final Handler scheduler, final int initialCode,
            final String initialData, final Bundle initialExtras) {
        callHook(
                "sendStickyOrderedBroadcast(Intent, BroadcastReceiver, Handler, int, String, Bundle)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.sendStickyOrderedBroadcast(superCall, (Intent) args[0],
                                (BroadcastReceiver) args[1], (Handler) args[2], (int) args[3],
                                (String) args[4], (Bundle) args[5]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().super_sendStickyOrderedBroadcast((Intent) args[0],
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
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.sendStickyOrderedBroadcastAsUser(superCall, (Intent) args[0],
                                (UserHandle) args[1], (BroadcastReceiver) args[2],
                                (Handler) args[3], (int) args[4], (String) args[5],
                                (Bundle) args[6]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().super_sendStickyOrderedBroadcastAsUser((Intent) args[0],
                                (UserHandle) args[1], (BroadcastReceiver) args[2],
                                (Handler) args[3], (int) args[4], (String) args[5],
                                (Bundle) args[6]);
                    }
                }, intent, user, resultReceiver, scheduler, initialCode, initialData,
                initialExtras);
    }

    public void setActionBar(final Toolbar toolbar) {
        callHook("setActionBar(Toolbar)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.setActionBar(superCall, (Toolbar) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_setActionBar((Toolbar) args[0]);
            }
        }, toolbar);
    }

    public void setContentTransitionManager(final TransitionManager tm) {
        callHook("setContentTransitionManager(TransitionManager)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.setContentTransitionManager(superCall, (TransitionManager) args[0]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal()
                                .super_setContentTransitionManager((TransitionManager) args[0]);
                    }
                }, tm);
    }

    public void setContentView(@LayoutRes final int layoutResID) {
        callHook("setContentView(int)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.setContentView(superCall, (int) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_setContentView((int) args[0]);
            }
        }, layoutResID);
    }

    public void setContentView(final View view) {
        callHook("setContentView(View)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.setContentView(superCall, (View) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_setContentView((View) args[0]);
            }
        }, view);
    }

    public void setContentView(final View view, final ViewGroup.LayoutParams params) {
        callHook("setContentView(View, ViewGroup.LayoutParams)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.setContentView(superCall, (View) args[0],
                                (ViewGroup.LayoutParams) args[1]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().super_setContentView((View) args[0],
                                (ViewGroup.LayoutParams) args[1]);
                    }
                }, view, params);
    }

    public void setEnterSharedElementCallback(final SharedElementCallback callback) {
        callHook("setEnterSharedElementCallback(SharedElementCallback)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.setEnterSharedElementCallback(superCall,
                                (SharedElementCallback) args[0]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().super_setEnterSharedElementCallback(
                                (SharedElementCallback) args[0]);
                    }
                }, callback);
    }

    public void setEnterSharedElementCallback(final android.app.SharedElementCallback callback) {
        callHook("setEnterSharedElementCallback(android.app.SharedElementCallback)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.setEnterSharedElementCallback(superCall,
                                (android.app.SharedElementCallback) args[0]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().super_setEnterSharedElementCallback(
                                (android.app.SharedElementCallback) args[0]);
                    }
                }, callback);
    }

    public void setExitSharedElementCallback(final SharedElementCallback listener) {
        callHook("setExitSharedElementCallback(SharedElementCallback)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.setExitSharedElementCallback(superCall,
                                (SharedElementCallback) args[0]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().super_setExitSharedElementCallback(
                                (SharedElementCallback) args[0]);
                    }
                }, listener);
    }

    public void setExitSharedElementCallback(final android.app.SharedElementCallback callback) {
        callHook("setExitSharedElementCallback(android.app.SharedElementCallback)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.setExitSharedElementCallback(superCall,
                                (android.app.SharedElementCallback) args[0]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().super_setExitSharedElementCallback(
                                (android.app.SharedElementCallback) args[0]);
                    }
                }, callback);
    }

    public void setFinishOnTouchOutside(final boolean finish) {
        callHook("setFinishOnTouchOutside(boolean)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.setFinishOnTouchOutside(superCall, (boolean) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_setFinishOnTouchOutside((boolean) args[0]);
            }
        }, finish);
    }

    public void setImmersive(final boolean i) {
        callHook("setImmersive(boolean)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.setImmersive(superCall, (boolean) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_setImmersive((boolean) args[0]);
            }
        }, i);
    }

    public void setIntent(final Intent newIntent) {
        callHook("setIntent(Intent)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.setIntent(superCall, (Intent) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_setIntent((Intent) args[0]);
            }
        }, newIntent);
    }

    public void setRequestedOrientation(final int requestedOrientation) {
        callHook("setRequestedOrientation(int)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.setRequestedOrientation(superCall, (int) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_setRequestedOrientation((int) args[0]);
            }
        }, requestedOrientation);
    }

    public void setSupportActionBar(@Nullable final android.support.v7.widget.Toolbar toolbar) {
        callHook("setSupportActionBar(android.support.v7.widget.Toolbar)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.setSupportActionBar(superCall,
                                (android.support.v7.widget.Toolbar) args[0]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().super_setSupportActionBar(
                                (android.support.v7.widget.Toolbar) args[0]);
                    }
                }, toolbar);
    }

    public void setSupportProgress(final int progress) {
        callHook("setSupportProgress(int)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.setSupportProgress(superCall, (int) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_setSupportProgress((int) args[0]);
            }
        }, progress);
    }

    public void setSupportProgressBarIndeterminate(final boolean indeterminate) {
        callHook("setSupportProgressBarIndeterminate(boolean)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.setSupportProgressBarIndeterminate(superCall, (boolean) args[0]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().super_setSupportProgressBarIndeterminate((boolean) args[0]);
                    }
                }, indeterminate);
    }

    public void setSupportProgressBarIndeterminateVisibility(final boolean visible) {
        callHook("setSupportProgressBarIndeterminateVisibility(boolean)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.setSupportProgressBarIndeterminateVisibility(superCall,
                                (boolean) args[0]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().super_setSupportProgressBarIndeterminateVisibility(
                                (boolean) args[0]);
                    }
                }, visible);
    }

    public void setSupportProgressBarVisibility(final boolean visible) {
        callHook("setSupportProgressBarVisibility(boolean)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.setSupportProgressBarVisibility(superCall, (boolean) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_setSupportProgressBarVisibility((boolean) args[0]);
            }
        }, visible);
    }

    public void setTaskDescription(final ActivityManager.TaskDescription taskDescription) {
        callHook("setTaskDescription(ActivityManager.TaskDescription)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.setTaskDescription(superCall,
                                (ActivityManager.TaskDescription) args[0]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().super_setTaskDescription(
                                (ActivityManager.TaskDescription) args[0]);
                    }
                }, taskDescription);
    }

    public void setTheme(@StyleRes final int resid) {
        callHook("setTheme(int)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.setTheme(superCall, (int) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_setTheme((int) args[0]);
            }
        }, resid);
    }

    public void setTitle(final CharSequence title) {
        callHook("setTitle(CharSequence)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.setTitle(superCall, (CharSequence) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_setTitle((CharSequence) args[0]);
            }
        }, title);
    }

    public void setTitle(final int titleId) {
        callHook("setTitle(int)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.setTitle(superCall, (int) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_setTitle((int) args[0]);
            }
        }, titleId);
    }

    public void setTitleColor(final int textColor) {
        callHook("setTitleColor(int)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.setTitleColor(superCall, (int) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_setTitleColor((int) args[0]);
            }
        }, textColor);
    }

    public void setVisible(final boolean visible) {
        callHook("setVisible(boolean)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.setVisible(superCall, (boolean) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_setVisible((boolean) args[0]);
            }
        }, visible);
    }

    public void setWallpaper(final Bitmap bitmap) throws IOException {
        callHook("setWallpaper(Bitmap)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                try {
                    plugin.setWallpaper(superCall, (Bitmap) args[0]);
                } catch (IOException e) {
                    throw new SuppressedException(e);
                }
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                try {
                    getOriginal().super_setWallpaper((Bitmap) args[0]);
                } catch (IOException e) {
                    throw new SuppressedException(e);
                }
            }
        }, bitmap);
    }

    public void setWallpaper(final InputStream data) throws IOException {
        callHook("setWallpaper(InputStream)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                try {
                    plugin.setWallpaper(superCall, (InputStream) args[0]);
                } catch (IOException e) {
                    throw new SuppressedException(e);
                }
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                try {
                    getOriginal().super_setWallpaper((InputStream) args[0]);
                } catch (IOException e) {
                    throw new SuppressedException(e);
                }
            }
        }, data);
    }

    public boolean shouldShowRequestPermissionRationale(final String permission) {
        return callFunction("shouldShowRequestPermissionRationale(String)",
                new PluginCall<ActivityPlugin, Boolean>() {
                    @Override
                    public Boolean call(final NamedSuperCall<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin
                                .shouldShowRequestPermissionRationale(superCall, (String) args[0]);

                    }
                }, new SuperCall<Boolean>() {
                    @Override
                    public Boolean call(final Object... args) {
                        return getOriginal()
                                .super_shouldShowRequestPermissionRationale((String) args[0]);
                    }
                }, permission);
    }

    public boolean shouldUpRecreateTask(final Intent targetIntent) {
        return callFunction("shouldUpRecreateTask(Intent)",
                new PluginCall<ActivityPlugin, Boolean>() {
                    @Override
                    public Boolean call(final NamedSuperCall<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.shouldUpRecreateTask(superCall, (Intent) args[0]);

                    }
                }, new SuperCall<Boolean>() {
                    @Override
                    public Boolean call(final Object... args) {
                        return getOriginal().super_shouldUpRecreateTask((Intent) args[0]);
                    }
                }, targetIntent);
    }

    public boolean showAssist(final Bundle args) {
        return callFunction("showAssist(Bundle)", new PluginCall<ActivityPlugin, Boolean>() {
            @Override
            public Boolean call(final NamedSuperCall<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.showAssist(superCall, (Bundle) args[0]);

            }
        }, new SuperCall<Boolean>() {
            @Override
            public Boolean call(final Object... args) {
                return getOriginal().super_showAssist((Bundle) args[0]);
            }
        }, args);
    }

    public void showLockTaskEscapeMessage() {
        callHook("showLockTaskEscapeMessage()", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.showLockTaskEscapeMessage(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_showLockTaskEscapeMessage();
            }
        });
    }

    public android.view.ActionMode startActionMode(
            final android.view.ActionMode.Callback callback) {
        return callFunction("startActionMode(android.view.ActionMode.Callback)",
                new PluginCall<ActivityPlugin, android.view.ActionMode>() {
                    @Override
                    public android.view.ActionMode call(
                            final NamedSuperCall<android.view.ActionMode> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.startActionMode(superCall,
                                (android.view.ActionMode.Callback) args[0]);

                    }
                }, new SuperCall<android.view.ActionMode>() {
                    @Override
                    public android.view.ActionMode call(final Object... args) {
                        return getOriginal()
                                .super_startActionMode((android.view.ActionMode.Callback) args[0]);
                    }
                }, callback);
    }

    public android.view.ActionMode startActionMode(final android.view.ActionMode.Callback callback,
            final int type) {
        return callFunction("startActionMode(android.view.ActionMode.Callback, int)",
                new PluginCall<ActivityPlugin, android.view.ActionMode>() {
                    @Override
                    public android.view.ActionMode call(
                            final NamedSuperCall<android.view.ActionMode> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.startActionMode(superCall,
                                (android.view.ActionMode.Callback) args[0], (int) args[1]);

                    }
                }, new SuperCall<android.view.ActionMode>() {
                    @Override
                    public android.view.ActionMode call(final Object... args) {
                        return getOriginal()
                                .super_startActionMode((android.view.ActionMode.Callback) args[0],
                                        (int) args[1]);
                    }
                }, callback, type);
    }

    public void startActivities(final Intent[] intents) {
        callHook("startActivities(Intent[])", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.startActivities(superCall, (Intent[]) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_startActivities((Intent[]) args[0]);
            }
        }, new Object[]{intents});
    }

    public void startActivities(final Intent[] intents, final Bundle options) {
        callHook("startActivities(Intent[], Bundle)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.startActivities(superCall, (Intent[]) args[0], (Bundle) args[1]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_startActivities((Intent[]) args[0], (Bundle) args[1]);
            }
        }, intents, options);
    }

    public void startActivity(final Intent intent) {
        callHook("startActivity(Intent)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.startActivity(superCall, (Intent) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_startActivity((Intent) args[0]);
            }
        }, intent);
    }

    public void startActivity(final Intent intent, final Bundle options) {
        callHook("startActivity(Intent, Bundle)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.startActivity(superCall, (Intent) args[0], (Bundle) args[1]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_startActivity((Intent) args[0], (Bundle) args[1]);
            }
        }, intent, options);
    }

    public void startActivityForResult(final Intent intent, final int requestCode) {
        callHook("startActivityForResult(Intent, int)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.startActivityForResult(superCall, (Intent) args[0], (int) args[1]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_startActivityForResult((Intent) args[0], (int) args[1]);
            }
        }, intent, requestCode);
    }

    public void startActivityForResult(final Intent intent, final int requestCode,
            final Bundle options) {
        callHook("startActivityForResult(Intent, int, Bundle)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.startActivityForResult(superCall, (Intent) args[0], (int) args[1],
                                (Bundle) args[2]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().super_startActivityForResult((Intent) args[0], (int) args[1],
                                (Bundle) args[2]);
                    }
                }, intent, requestCode, options);
    }

    public void startActivityFromChild(final Activity child, final Intent intent,
            final int requestCode) {
        callHook("startActivityFromChild(Activity, Intent, int)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.startActivityFromChild(superCall, (Activity) args[0],
                                (Intent) args[1], (int) args[2]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal()
                                .super_startActivityFromChild((Activity) args[0], (Intent) args[1],
                                        (int) args[2]);
                    }
                }, child, intent, requestCode);
    }

    public void startActivityFromChild(final Activity child, final Intent intent,
            final int requestCode, final Bundle options) {
        callHook("startActivityFromChild(Activity, Intent, int, Bundle)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.startActivityFromChild(superCall, (Activity) args[0],
                                (Intent) args[1], (int) args[2], (Bundle) args[3]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal()
                                .super_startActivityFromChild((Activity) args[0], (Intent) args[1],
                                        (int) args[2], (Bundle) args[3]);
                    }
                }, child, intent, requestCode, options);
    }

    public void startActivityFromFragment(final Fragment fragment, final Intent intent,
            final int requestCode) {
        callHook("startActivityFromFragment(Fragment, Intent, int)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.startActivityFromFragment(superCall, (Fragment) args[0],
                                (Intent) args[1], (int) args[2]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().super_startActivityFromFragment((Fragment) args[0],
                                (Intent) args[1], (int) args[2]);
                    }
                }, fragment, intent, requestCode);
    }

    public void startActivityFromFragment(final Fragment fragment, final Intent intent,
            final int requestCode, @Nullable final Bundle options) {
        callHook("startActivityFromFragment(Fragment, Intent, int, Bundle)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.startActivityFromFragment(superCall, (Fragment) args[0],
                                (Intent) args[1], (int) args[2], (Bundle) args[3]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().super_startActivityFromFragment((Fragment) args[0],
                                (Intent) args[1], (int) args[2], (Bundle) args[3]);
                    }
                }, fragment, intent, requestCode, options);
    }

    public void startActivityFromFragment(final android.app.Fragment fragment, final Intent intent,
            final int requestCode) {
        callHook("startActivityFromFragment(android.app.Fragment, Intent, int)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.startActivityFromFragment(superCall, (android.app.Fragment) args[0],
                                (Intent) args[1], (int) args[2]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal()
                                .super_startActivityFromFragment((android.app.Fragment) args[0],
                                        (Intent) args[1], (int) args[2]);
                    }
                }, fragment, intent, requestCode);
    }

    public void startActivityFromFragment(final android.app.Fragment fragment, final Intent intent,
            final int requestCode, final Bundle options) {
        callHook("startActivityFromFragment(android.app.Fragment, Intent, int, Bundle)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.startActivityFromFragment(superCall, (android.app.Fragment) args[0],
                                (Intent) args[1], (int) args[2], (Bundle) args[3]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal()
                                .super_startActivityFromFragment((android.app.Fragment) args[0],
                                        (Intent) args[1], (int) args[2], (Bundle) args[3]);
                    }
                }, fragment, intent, requestCode, options);
    }

    public boolean startActivityIfNeeded(final Intent intent, final int requestCode) {
        return callFunction("startActivityIfNeeded(Intent, int)",
                new PluginCall<ActivityPlugin, Boolean>() {
                    @Override
                    public Boolean call(final NamedSuperCall<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin
                                .startActivityIfNeeded(superCall, (Intent) args[0], (int) args[1]);

                    }
                }, new SuperCall<Boolean>() {
                    @Override
                    public Boolean call(final Object... args) {
                        return getOriginal()
                                .super_startActivityIfNeeded((Intent) args[0], (int) args[1]);
                    }
                }, intent, requestCode);
    }

    public boolean startActivityIfNeeded(final Intent intent, final int requestCode,
            final Bundle options) {
        return callFunction("startActivityIfNeeded(Intent, int, Bundle)",
                new PluginCall<ActivityPlugin, Boolean>() {
                    @Override
                    public Boolean call(final NamedSuperCall<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin
                                .startActivityIfNeeded(superCall, (Intent) args[0], (int) args[1],
                                        (Bundle) args[2]);

                    }
                }, new SuperCall<Boolean>() {
                    @Override
                    public Boolean call(final Object... args) {
                        return getOriginal()
                                .super_startActivityIfNeeded((Intent) args[0], (int) args[1],
                                        (Bundle) args[2]);
                    }
                }, intent, requestCode, options);
    }

    public boolean startInstrumentation(final ComponentName className, final String profileFile,
            final Bundle arguments) {
        return callFunction("startInstrumentation(ComponentName, String, Bundle)",
                new PluginCall<ActivityPlugin, Boolean>() {
                    @Override
                    public Boolean call(final NamedSuperCall<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.startInstrumentation(superCall, (ComponentName) args[0],
                                (String) args[1], (Bundle) args[2]);

                    }
                }, new SuperCall<Boolean>() {
                    @Override
                    public Boolean call(final Object... args) {
                        return getOriginal().super_startInstrumentation((ComponentName) args[0],
                                (String) args[1], (Bundle) args[2]);
                    }
                }, className, profileFile, arguments);
    }

    public void startIntentSender(final IntentSender intent, final Intent fillInIntent,
            final int flagsMask, final int flagsValues, final int extraFlags)
            throws IntentSender.SendIntentException {
        callHook("startIntentSender(IntentSender, Intent, int, int, int)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        try {
                            plugin.startIntentSender(superCall, (IntentSender) args[0],
                                    (Intent) args[1], (int) args[2], (int) args[3], (int) args[4]);
                        } catch (IntentSender.SendIntentException e) {
                            throw new SuppressedException(e);
                        }
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        try {
                            getOriginal().super_startIntentSender((IntentSender) args[0],
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
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        try {
                            plugin.startIntentSender(superCall, (IntentSender) args[0],
                                    (Intent) args[1], (int) args[2], (int) args[3], (int) args[4],
                                    (Bundle) args[5]);
                        } catch (IntentSender.SendIntentException e) {
                            throw new SuppressedException(e);
                        }
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        try {
                            getOriginal().super_startIntentSender((IntentSender) args[0],
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
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        try {
                            plugin.startIntentSenderForResult(superCall, (IntentSender) args[0],
                                    (int) args[1], (Intent) args[2], (int) args[3], (int) args[4],
                                    (int) args[5]);
                        } catch (IntentSender.SendIntentException e) {
                            throw new SuppressedException(e);
                        }
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        try {
                            getOriginal().super_startIntentSenderForResult((IntentSender) args[0],
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
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        try {
                            plugin.startIntentSenderForResult(superCall, (IntentSender) args[0],
                                    (int) args[1], (Intent) args[2], (int) args[3], (int) args[4],
                                    (int) args[5], (Bundle) args[6]);
                        } catch (IntentSender.SendIntentException e) {
                            throw new SuppressedException(e);
                        }
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        try {
                            getOriginal().super_startIntentSenderForResult((IntentSender) args[0],
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
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        try {
                            plugin.startIntentSenderFromChild(superCall, (Activity) args[0],
                                    (IntentSender) args[1], (int) args[2], (Intent) args[3],
                                    (int) args[4], (int) args[5], (int) args[6]);
                        } catch (IntentSender.SendIntentException e) {
                            throw new SuppressedException(e);
                        }
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        try {
                            getOriginal().super_startIntentSenderFromChild((Activity) args[0],
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
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        try {
                            plugin.startIntentSenderFromChild(superCall, (Activity) args[0],
                                    (IntentSender) args[1], (int) args[2], (Intent) args[3],
                                    (int) args[4], (int) args[5], (int) args[6], (Bundle) args[7]);
                        } catch (IntentSender.SendIntentException e) {
                            throw new SuppressedException(e);
                        }
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        try {
                            getOriginal().super_startIntentSenderFromChild((Activity) args[0],
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
        callHook("startLockTask()", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.startLockTask(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_startLockTask();
            }
        });
    }

    public void startManagingCursor(final Cursor c) {
        callHook("startManagingCursor(Cursor)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.startManagingCursor(superCall, (Cursor) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_startManagingCursor((Cursor) args[0]);
            }
        }, c);
    }

    public boolean startNextMatchingActivity(final Intent intent) {
        return callFunction("startNextMatchingActivity(Intent)",
                new PluginCall<ActivityPlugin, Boolean>() {
                    @Override
                    public Boolean call(final NamedSuperCall<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.startNextMatchingActivity(superCall, (Intent) args[0]);

                    }
                }, new SuperCall<Boolean>() {
                    @Override
                    public Boolean call(final Object... args) {
                        return getOriginal().super_startNextMatchingActivity((Intent) args[0]);
                    }
                }, intent);
    }

    public boolean startNextMatchingActivity(final Intent intent, final Bundle options) {
        return callFunction("startNextMatchingActivity(Intent, Bundle)",
                new PluginCall<ActivityPlugin, Boolean>() {
                    @Override
                    public Boolean call(final NamedSuperCall<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.startNextMatchingActivity(superCall, (Intent) args[0],
                                (Bundle) args[1]);

                    }
                }, new SuperCall<Boolean>() {
                    @Override
                    public Boolean call(final Object... args) {
                        return getOriginal().super_startNextMatchingActivity((Intent) args[0],
                                (Bundle) args[1]);
                    }
                }, intent, options);
    }

    public void startPostponedEnterTransition() {
        callHook("startPostponedEnterTransition()", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.startPostponedEnterTransition(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_startPostponedEnterTransition();
            }
        });
    }

    public void startSearch(final String initialQuery, final boolean selectInitialQuery,
            final Bundle appSearchData, final boolean globalSearch) {
        callHook("startSearch(String, boolean, Bundle, boolean)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.startSearch(superCall, (String) args[0], (boolean) args[1],
                                (Bundle) args[2], (boolean) args[3]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().super_startSearch((String) args[0], (boolean) args[1],
                                (Bundle) args[2], (boolean) args[3]);
                    }
                }, initialQuery, selectInitialQuery, appSearchData, globalSearch);
    }

    public ComponentName startService(final Intent service) {
        return callFunction("startService(Intent)",
                new PluginCall<ActivityPlugin, ComponentName>() {
                    @Override
                    public ComponentName call(final NamedSuperCall<ComponentName> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.startService(superCall, (Intent) args[0]);

                    }
                }, new SuperCall<ComponentName>() {
                    @Override
                    public ComponentName call(final Object... args) {
                        return getOriginal().super_startService((Intent) args[0]);
                    }
                }, service);
    }

    public ActionMode startSupportActionMode(@NonNull final ActionMode.Callback callback) {
        return callFunction("startSupportActionMode(ActionMode.Callback)",
                new PluginCall<ActivityPlugin, ActionMode>() {
                    @Override
                    public ActionMode call(final NamedSuperCall<ActionMode> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin
                                .startSupportActionMode(superCall, (ActionMode.Callback) args[0]);

                    }
                }, new SuperCall<ActionMode>() {
                    @Override
                    public ActionMode call(final Object... args) {
                        return getOriginal()
                                .super_startSupportActionMode((ActionMode.Callback) args[0]);
                    }
                }, callback);
    }

    public void stopLockTask() {
        callHook("stopLockTask()", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.stopLockTask(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_stopLockTask();
            }
        });
    }

    public void stopManagingCursor(final Cursor c) {
        callHook("stopManagingCursor(Cursor)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.stopManagingCursor(superCall, (Cursor) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_stopManagingCursor((Cursor) args[0]);
            }
        }, c);
    }

    public boolean stopService(final Intent name) {
        return callFunction("stopService(Intent)", new PluginCall<ActivityPlugin, Boolean>() {
            @Override
            public Boolean call(final NamedSuperCall<Boolean> superCall,
                    final ActivityPlugin plugin, final Object... args) {

                return plugin.stopService(superCall, (Intent) args[0]);

            }
        }, new SuperCall<Boolean>() {
            @Override
            public Boolean call(final Object... args) {
                return getOriginal().super_stopService((Intent) args[0]);
            }
        }, name);
    }

    public void supportFinishAfterTransition() {
        callHook("supportFinishAfterTransition()", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.supportFinishAfterTransition(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_supportFinishAfterTransition();
            }
        });
    }

    public void supportInvalidateOptionsMenu() {
        callHook("supportInvalidateOptionsMenu()", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.supportInvalidateOptionsMenu(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_supportInvalidateOptionsMenu();
            }
        });
    }

    public void supportNavigateUpTo(@NonNull final Intent upIntent) {
        callHook("supportNavigateUpTo(Intent)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.supportNavigateUpTo(superCall, (Intent) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_supportNavigateUpTo((Intent) args[0]);
            }
        }, upIntent);
    }

    public void supportPostponeEnterTransition() {
        callHook("supportPostponeEnterTransition()", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.supportPostponeEnterTransition(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_supportPostponeEnterTransition();
            }
        });
    }

    public boolean supportRequestWindowFeature(final int featureId) {
        return callFunction("supportRequestWindowFeature(int)",
                new PluginCall<ActivityPlugin, Boolean>() {
                    @Override
                    public Boolean call(final NamedSuperCall<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.supportRequestWindowFeature(superCall, (int) args[0]);

                    }
                }, new SuperCall<Boolean>() {
                    @Override
                    public Boolean call(final Object... args) {
                        return getOriginal().super_supportRequestWindowFeature((int) args[0]);
                    }
                }, featureId);
    }

    public boolean supportShouldUpRecreateTask(@NonNull final Intent targetIntent) {
        return callFunction("supportShouldUpRecreateTask(Intent)",
                new PluginCall<ActivityPlugin, Boolean>() {
                    @Override
                    public Boolean call(final NamedSuperCall<Boolean> superCall,
                            final ActivityPlugin plugin, final Object... args) {

                        return plugin.supportShouldUpRecreateTask(superCall, (Intent) args[0]);

                    }
                }, new SuperCall<Boolean>() {
                    @Override
                    public Boolean call(final Object... args) {
                        return getOriginal().super_supportShouldUpRecreateTask((Intent) args[0]);
                    }
                }, targetIntent);
    }

    public void supportStartPostponedEnterTransition() {
        callHook("supportStartPostponedEnterTransition()", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.supportStartPostponedEnterTransition(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_supportStartPostponedEnterTransition();
            }
        });
    }

    public void takeKeyEvents(final boolean get) {
        callHook("takeKeyEvents(boolean)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.takeKeyEvents(superCall, (boolean) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_takeKeyEvents((boolean) args[0]);
            }
        }, get);
    }

    public void triggerSearch(final String query, final Bundle appSearchData) {
        callHook("triggerSearch(String, Bundle)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.triggerSearch(superCall, (String) args[0], (Bundle) args[1]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_triggerSearch((String) args[0], (Bundle) args[1]);
            }
        }, query, appSearchData);
    }

    public void unbindService(final ServiceConnection conn) {
        callHook("unbindService(ServiceConnection)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.unbindService(superCall, (ServiceConnection) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_unbindService((ServiceConnection) args[0]);
            }
        }, conn);
    }

    public void unregisterComponentCallbacks(final ComponentCallbacks callback) {
        callHook("unregisterComponentCallbacks(ComponentCallbacks)",
                new PluginCallVoid<ActivityPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final ActivityPlugin plugin, final Object... args) {
                        plugin.unregisterComponentCallbacks(superCall,
                                (ComponentCallbacks) args[0]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal()
                                .super_unregisterComponentCallbacks((ComponentCallbacks) args[0]);
                    }
                }, callback);
    }

    public void unregisterForContextMenu(final View view) {
        callHook("unregisterForContextMenu(View)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.unregisterForContextMenu(superCall, (View) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_unregisterForContextMenu((View) args[0]);
            }
        }, view);
    }

    public void unregisterReceiver(final BroadcastReceiver receiver) {
        callHook("unregisterReceiver(BroadcastReceiver)", new PluginCallVoid<ActivityPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall, final ActivityPlugin plugin,
                    final Object... args) {
                plugin.unregisterReceiver(superCall, (BroadcastReceiver) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_unregisterReceiver((BroadcastReceiver) args[0]);
            }
        }, receiver);
    }

}