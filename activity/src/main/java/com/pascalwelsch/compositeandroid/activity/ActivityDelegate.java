package com.pascalwelsch.compositeandroid.activity;

import com.pascalwelsch.compositeandroid.core.AbstractDelegate;
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
import java.util.ListIterator;

public class ActivityDelegate extends AbstractDelegate<ICompositeActivity, ActivityPlugin> {


    public ActivityDelegate(final ICompositeActivity icompositeactivity) {
        super(icompositeactivity);

    }


    public void addContentView(final View view, final ViewGroup.LayoutParams params) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_addContentView(view, params);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "addContentView(View, ViewGroup.LayoutParams)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .addContentView(this, (View) args[0], (ViewGroup.LayoutParams) args[1]);
                    return null;
                } else {
                    getOriginal()
                            .super_addContentView((View) args[0], (ViewGroup.LayoutParams) args[1]);
                    return null;
                }
            }
        };
        superCall.call(view, params);
    }

    public void applyOverrideConfiguration(final Configuration overrideConfiguration) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_applyOverrideConfiguration(overrideConfiguration);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "applyOverrideConfiguration(Configuration)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().applyOverrideConfiguration(this, (Configuration) args[0]);
                    return null;
                } else {
                    getOriginal().super_applyOverrideConfiguration((Configuration) args[0]);
                    return null;
                }
            }
        };
        superCall.call(overrideConfiguration);
    }

    public void attachBaseContext(final Context newBase) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_attachBaseContext(newBase);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "attachBaseContext(Context)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().attachBaseContext(this, (Context) args[0]);
                    return null;
                } else {
                    getOriginal().super_attachBaseContext((Context) args[0]);
                    return null;
                }
            }
        };
        superCall.call(newBase);
    }

    public boolean bindService(final Intent service, final ServiceConnection conn,
            final int flags) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_bindService(service, conn, flags);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "bindService(Intent, ServiceConnection, int)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .bindService(this, (Intent) args[0], (ServiceConnection) args[1],
                                    (int) args[2]);
                } else {
                    return getOriginal()
                            .super_bindService((Intent) args[0], (ServiceConnection) args[1],
                                    (int) args[2]);
                }
            }
        };
        return superCall.call(service, conn, flags);
    }

    public int checkCallingOrSelfPermission(final String permission) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_checkCallingOrSelfPermission(permission);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Integer> superCall = new NamedSuperCall<Integer>(
                "checkCallingOrSelfPermission(String)") {

            @Override
            public Integer call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().checkCallingOrSelfPermission(this, (String) args[0]);
                } else {
                    return getOriginal().super_checkCallingOrSelfPermission((String) args[0]);
                }
            }
        };
        return superCall.call(permission);
    }

    public int checkCallingOrSelfUriPermission(final Uri uri, final int modeFlags) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_checkCallingOrSelfUriPermission(uri, modeFlags);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Integer> superCall = new NamedSuperCall<Integer>(
                "checkCallingOrSelfUriPermission(Uri, int)") {

            @Override
            public Integer call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .checkCallingOrSelfUriPermission(this, (Uri) args[0], (int) args[1]);
                } else {
                    return getOriginal()
                            .super_checkCallingOrSelfUriPermission((Uri) args[0], (int) args[1]);
                }
            }
        };
        return superCall.call(uri, modeFlags);
    }

    public int checkCallingPermission(final String permission) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_checkCallingPermission(permission);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Integer> superCall = new NamedSuperCall<Integer>(
                "checkCallingPermission(String)") {

            @Override
            public Integer call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().checkCallingPermission(this, (String) args[0]);
                } else {
                    return getOriginal().super_checkCallingPermission((String) args[0]);
                }
            }
        };
        return superCall.call(permission);
    }

    public int checkCallingUriPermission(final Uri uri, final int modeFlags) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_checkCallingUriPermission(uri, modeFlags);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Integer> superCall = new NamedSuperCall<Integer>(
                "checkCallingUriPermission(Uri, int)") {

            @Override
            public Integer call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .checkCallingUriPermission(this, (Uri) args[0], (int) args[1]);
                } else {
                    return getOriginal()
                            .super_checkCallingUriPermission((Uri) args[0], (int) args[1]);
                }
            }
        };
        return superCall.call(uri, modeFlags);
    }

    public int checkPermission(final String permission, final int pid, final int uid) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_checkPermission(permission, pid, uid);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Integer> superCall = new NamedSuperCall<Integer>(
                "checkPermission(String, int, int)") {

            @Override
            public Integer call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .checkPermission(this, (String) args[0], (int) args[1], (int) args[2]);
                } else {
                    return getOriginal()
                            .super_checkPermission((String) args[0], (int) args[1], (int) args[2]);
                }
            }
        };
        return superCall.call(permission, pid, uid);
    }

    public int checkSelfPermission(final String permission) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_checkSelfPermission(permission);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Integer> superCall = new NamedSuperCall<Integer>(
                "checkSelfPermission(String)") {

            @Override
            public Integer call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().checkSelfPermission(this, (String) args[0]);
                } else {
                    return getOriginal().super_checkSelfPermission((String) args[0]);
                }
            }
        };
        return superCall.call(permission);
    }

    public int checkUriPermission(final Uri uri, final int pid, final int uid,
            final int modeFlags) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_checkUriPermission(uri, pid, uid, modeFlags);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Integer> superCall = new NamedSuperCall<Integer>(
                "checkUriPermission(Uri, int, int, int)") {

            @Override
            public Integer call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .checkUriPermission(this, (Uri) args[0], (int) args[1], (int) args[2],
                                    (int) args[3]);
                } else {
                    return getOriginal()
                            .super_checkUriPermission((Uri) args[0], (int) args[1], (int) args[2],
                                    (int) args[3]);
                }
            }
        };
        return superCall.call(uri, pid, uid, modeFlags);
    }

    public int checkUriPermission(final Uri uri, final String readPermission,
            final String writePermission, final int pid, final int uid, final int modeFlags) {
        if (mPlugins.isEmpty()) {
            return getOriginal()
                    .super_checkUriPermission(uri, readPermission, writePermission, pid, uid,
                            modeFlags);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Integer> superCall = new NamedSuperCall<Integer>(
                "checkUriPermission(Uri, String, String, int, int, int)") {

            @Override
            public Integer call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .checkUriPermission(this, (Uri) args[0], (String) args[1],
                                    (String) args[2], (int) args[3], (int) args[4], (int) args[5]);
                } else {
                    return getOriginal().super_checkUriPermission((Uri) args[0], (String) args[1],
                            (String) args[2], (int) args[3], (int) args[4], (int) args[5]);
                }
            }
        };
        return superCall.call(uri, readPermission, writePermission, pid, uid, modeFlags);
    }

    public void clearWallpaper() throws IOException {
        if (mPlugins.isEmpty()) {
            try {
                getOriginal().super_clearWallpaper();
            } catch (IOException e) {
                throw new SuppressedException(e);
            }
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("clearWallpaper()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    try {
                        iterator.previous().clearWallpaper(this);
                        return null;
                    } catch (IOException e) {
                        throw new SuppressedException(e);
                    }
                } else {
                    try {
                        getOriginal().super_clearWallpaper();
                        return null;
                    } catch (IOException e) {
                        throw new SuppressedException(e);
                    }
                }
            }
        };
        superCall.call();
    }

    public void closeContextMenu() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_closeContextMenu();
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("closeContextMenu()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().closeContextMenu(this);
                    return null;
                } else {
                    getOriginal().super_closeContextMenu();
                    return null;
                }
            }
        };
        superCall.call();
    }

    public void closeOptionsMenu() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_closeOptionsMenu();
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("closeOptionsMenu()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().closeOptionsMenu(this);
                    return null;
                } else {
                    getOriginal().super_closeOptionsMenu();
                    return null;
                }
            }
        };
        superCall.call();
    }

    public Context createConfigurationContext(final Configuration overrideConfiguration) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_createConfigurationContext(overrideConfiguration);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Context> superCall = new NamedSuperCall<Context>(
                "createConfigurationContext(Configuration)") {

            @Override
            public Context call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .createConfigurationContext(this, (Configuration) args[0]);
                } else {
                    return getOriginal().super_createConfigurationContext((Configuration) args[0]);
                }
            }
        };
        return superCall.call(overrideConfiguration);
    }

    public Context createDisplayContext(final Display display) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_createDisplayContext(display);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Context> superCall = new NamedSuperCall<Context>(
                "createDisplayContext(Display)") {

            @Override
            public Context call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().createDisplayContext(this, (Display) args[0]);
                } else {
                    return getOriginal().super_createDisplayContext((Display) args[0]);
                }
            }
        };
        return superCall.call(display);
    }

    public Context createPackageContext(final String packageName, final int flags)
            throws PackageManager.NameNotFoundException {
        if (mPlugins.isEmpty()) {
            try {
                return getOriginal().super_createPackageContext(packageName, flags);
            } catch (PackageManager.NameNotFoundException e) {
                throw new SuppressedException(e);
            }
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Context> superCall = new NamedSuperCall<Context>(
                "createPackageContext(String, int)") {

            @Override
            public Context call(final Object... args) {
                if (iterator.hasPrevious()) {
                    try {
                        return iterator.previous()
                                .createPackageContext(this, (String) args[0], (int) args[1]);
                    } catch (PackageManager.NameNotFoundException e) {
                        throw new SuppressedException(e);
                    }
                } else {
                    try {
                        return getOriginal()
                                .super_createPackageContext((String) args[0], (int) args[1]);
                    } catch (PackageManager.NameNotFoundException e) {
                        throw new SuppressedException(e);
                    }
                }
            }
        };
        return superCall.call(packageName, flags);
    }

    public PendingIntent createPendingResult(final int requestCode, final Intent data,
            final int flags) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_createPendingResult(requestCode, data, flags);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<PendingIntent> superCall = new NamedSuperCall<PendingIntent>(
                "createPendingResult(int, Intent, int)") {

            @Override
            public PendingIntent call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .createPendingResult(this, (int) args[0], (Intent) args[1],
                                    (int) args[2]);
                } else {
                    return getOriginal().super_createPendingResult((int) args[0], (Intent) args[1],
                            (int) args[2]);
                }
            }
        };
        return superCall.call(requestCode, data, flags);
    }

    public String[] databaseList() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_databaseList();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<String[]> superCall = new NamedSuperCall<String[]>("databaseList()") {

            @Override
            public String[] call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().databaseList(this);
                } else {
                    return getOriginal().super_databaseList();
                }
            }
        };
        return superCall.call();
    }

    public boolean deleteDatabase(final String name) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_deleteDatabase(name);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "deleteDatabase(String)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().deleteDatabase(this, (String) args[0]);
                } else {
                    return getOriginal().super_deleteDatabase((String) args[0]);
                }
            }
        };
        return superCall.call(name);
    }

    public boolean deleteFile(final String name) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_deleteFile(name);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "deleteFile(String)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().deleteFile(this, (String) args[0]);
                } else {
                    return getOriginal().super_deleteFile((String) args[0]);
                }
            }
        };
        return superCall.call(name);
    }

    public boolean dispatchGenericMotionEvent(final MotionEvent ev) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_dispatchGenericMotionEvent(ev);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "dispatchGenericMotionEvent(MotionEvent)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .dispatchGenericMotionEvent(this, (MotionEvent) args[0]);
                } else {
                    return getOriginal().super_dispatchGenericMotionEvent((MotionEvent) args[0]);
                }
            }
        };
        return superCall.call(ev);
    }

    public boolean dispatchKeyEvent(final KeyEvent event) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_dispatchKeyEvent(event);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "dispatchKeyEvent(KeyEvent)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().dispatchKeyEvent(this, (KeyEvent) args[0]);
                } else {
                    return getOriginal().super_dispatchKeyEvent((KeyEvent) args[0]);
                }
            }
        };
        return superCall.call(event);
    }

    public boolean dispatchKeyShortcutEvent(final KeyEvent event) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_dispatchKeyShortcutEvent(event);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "dispatchKeyShortcutEvent(KeyEvent)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().dispatchKeyShortcutEvent(this, (KeyEvent) args[0]);
                } else {
                    return getOriginal().super_dispatchKeyShortcutEvent((KeyEvent) args[0]);
                }
            }
        };
        return superCall.call(event);
    }

    public boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent event) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_dispatchPopulateAccessibilityEvent(event);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "dispatchPopulateAccessibilityEvent(AccessibilityEvent)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .dispatchPopulateAccessibilityEvent(this, (AccessibilityEvent) args[0]);
                } else {
                    return getOriginal()
                            .super_dispatchPopulateAccessibilityEvent((AccessibilityEvent) args[0]);
                }
            }
        };
        return superCall.call(event);
    }

    public boolean dispatchTouchEvent(final MotionEvent ev) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_dispatchTouchEvent(ev);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "dispatchTouchEvent(MotionEvent)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().dispatchTouchEvent(this, (MotionEvent) args[0]);
                } else {
                    return getOriginal().super_dispatchTouchEvent((MotionEvent) args[0]);
                }
            }
        };
        return superCall.call(ev);
    }

    public boolean dispatchTrackballEvent(final MotionEvent ev) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_dispatchTrackballEvent(ev);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "dispatchTrackballEvent(MotionEvent)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().dispatchTrackballEvent(this, (MotionEvent) args[0]);
                } else {
                    return getOriginal().super_dispatchTrackballEvent((MotionEvent) args[0]);
                }
            }
        };
        return superCall.call(ev);
    }

    public void dump(final String prefix, final FileDescriptor fd, final PrintWriter writer,
            final String[] args) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_dump(prefix, fd, writer, args);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "dump(String, FileDescriptor, PrintWriter, String[])") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().dump(this, (String) args[0], (FileDescriptor) args[1],
                            (PrintWriter) args[2], (String[]) args[3]);
                    return null;
                } else {
                    getOriginal().super_dump((String) args[0], (FileDescriptor) args[1],
                            (PrintWriter) args[2], (String[]) args[3]);
                    return null;
                }
            }
        };
        superCall.call(prefix, fd, writer, args);
    }

    public void enforceCallingOrSelfPermission(final String permission, final String message) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_enforceCallingOrSelfPermission(permission, message);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "enforceCallingOrSelfPermission(String, String)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().enforceCallingOrSelfPermission(this, (String) args[0],
                            (String) args[1]);
                    return null;
                } else {
                    getOriginal().super_enforceCallingOrSelfPermission((String) args[0],
                            (String) args[1]);
                    return null;
                }
            }
        };
        superCall.call(permission, message);
    }

    public void enforceCallingOrSelfUriPermission(final Uri uri, final int modeFlags,
            final String message) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_enforceCallingOrSelfUriPermission(uri, modeFlags, message);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "enforceCallingOrSelfUriPermission(Uri, int, String)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .enforceCallingOrSelfUriPermission(this, (Uri) args[0], (int) args[1],
                                    (String) args[2]);
                    return null;
                } else {
                    getOriginal()
                            .super_enforceCallingOrSelfUriPermission((Uri) args[0], (int) args[1],
                                    (String) args[2]);
                    return null;
                }
            }
        };
        superCall.call(uri, modeFlags, message);
    }

    public void enforceCallingPermission(final String permission, final String message) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_enforceCallingPermission(permission, message);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "enforceCallingPermission(String, String)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .enforceCallingPermission(this, (String) args[0], (String) args[1]);
                    return null;
                } else {
                    getOriginal()
                            .super_enforceCallingPermission((String) args[0], (String) args[1]);
                    return null;
                }
            }
        };
        superCall.call(permission, message);
    }

    public void enforceCallingUriPermission(final Uri uri, final int modeFlags,
            final String message) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_enforceCallingUriPermission(uri, modeFlags, message);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "enforceCallingUriPermission(Uri, int, String)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .enforceCallingUriPermission(this, (Uri) args[0], (int) args[1],
                                    (String) args[2]);
                    return null;
                } else {
                    getOriginal().super_enforceCallingUriPermission((Uri) args[0], (int) args[1],
                            (String) args[2]);
                    return null;
                }
            }
        };
        superCall.call(uri, modeFlags, message);
    }

    public void enforcePermission(final String permission, final int pid, final int uid,
            final String message) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_enforcePermission(permission, pid, uid, message);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "enforcePermission(String, int, int, String)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .enforcePermission(this, (String) args[0], (int) args[1], (int) args[2],
                                    (String) args[3]);
                    return null;
                } else {
                    getOriginal()
                            .super_enforcePermission((String) args[0], (int) args[1], (int) args[2],
                                    (String) args[3]);
                    return null;
                }
            }
        };
        superCall.call(permission, pid, uid, message);
    }

    public void enforceUriPermission(final Uri uri, final int pid, final int uid,
            final int modeFlags, final String message) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_enforceUriPermission(uri, pid, uid, modeFlags, message);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "enforceUriPermission(Uri, int, int, int, String)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .enforceUriPermission(this, (Uri) args[0], (int) args[1], (int) args[2],
                                    (int) args[3], (String) args[4]);
                    return null;
                } else {
                    getOriginal()
                            .super_enforceUriPermission((Uri) args[0], (int) args[1], (int) args[2],
                                    (int) args[3], (String) args[4]);
                    return null;
                }
            }
        };
        superCall.call(uri, pid, uid, modeFlags, message);
    }

    public void enforceUriPermission(final Uri uri, final String readPermission,
            final String writePermission, final int pid, final int uid, final int modeFlags,
            final String message) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_enforceUriPermission(uri, readPermission, writePermission, pid, uid,
                    modeFlags, message);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "enforceUriPermission(Uri, String, String, int, int, int, String)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().enforceUriPermission(this, (Uri) args[0], (String) args[1],
                            (String) args[2], (int) args[3], (int) args[4], (int) args[5],
                            (String) args[6]);
                    return null;
                } else {
                    getOriginal().super_enforceUriPermission((Uri) args[0], (String) args[1],
                            (String) args[2], (int) args[3], (int) args[4], (int) args[5],
                            (String) args[6]);
                    return null;
                }
            }
        };
        superCall.call(uri, readPermission, writePermission, pid, uid, modeFlags, message);
    }

    public String[] fileList() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_fileList();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<String[]> superCall = new NamedSuperCall<String[]>("fileList()") {

            @Override
            public String[] call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().fileList(this);
                } else {
                    return getOriginal().super_fileList();
                }
            }
        };
        return superCall.call();
    }

    public View findViewById(@IdRes final int id) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_findViewById(id);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<View> superCall = new NamedSuperCall<View>("findViewById(int)") {

            @Override
            public View call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().findViewById(this, (int) args[0]);
                } else {
                    return getOriginal().super_findViewById((int) args[0]);
                }
            }
        };
        return superCall.call(id);
    }

    public void finish() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_finish();
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("finish()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().finish(this);
                    return null;
                } else {
                    getOriginal().super_finish();
                    return null;
                }
            }
        };
        superCall.call();
    }

    public void finishActivity(final int requestCode) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_finishActivity(requestCode);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("finishActivity(int)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().finishActivity(this, (int) args[0]);
                    return null;
                } else {
                    getOriginal().super_finishActivity((int) args[0]);
                    return null;
                }
            }
        };
        superCall.call(requestCode);
    }

    public void finishActivityFromChild(final Activity child, final int requestCode) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_finishActivityFromChild(child, requestCode);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "finishActivityFromChild(Activity, int)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .finishActivityFromChild(this, (Activity) args[0], (int) args[1]);
                    return null;
                } else {
                    getOriginal().super_finishActivityFromChild((Activity) args[0], (int) args[1]);
                    return null;
                }
            }
        };
        superCall.call(child, requestCode);
    }

    public void finishAffinity() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_finishAffinity();
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("finishAffinity()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().finishAffinity(this);
                    return null;
                } else {
                    getOriginal().super_finishAffinity();
                    return null;
                }
            }
        };
        superCall.call();
    }

    public void finishAfterTransition() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_finishAfterTransition();
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("finishAfterTransition()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().finishAfterTransition(this);
                    return null;
                } else {
                    getOriginal().super_finishAfterTransition();
                    return null;
                }
            }
        };
        superCall.call();
    }

    public void finishAndRemoveTask() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_finishAndRemoveTask();
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("finishAndRemoveTask()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().finishAndRemoveTask(this);
                    return null;
                } else {
                    getOriginal().super_finishAndRemoveTask();
                    return null;
                }
            }
        };
        superCall.call();
    }

    public void finishFromChild(final Activity child) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_finishFromChild(child);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "finishFromChild(Activity)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().finishFromChild(this, (Activity) args[0]);
                    return null;
                } else {
                    getOriginal().super_finishFromChild((Activity) args[0]);
                    return null;
                }
            }
        };
        superCall.call(child);
    }

    public android.app.ActionBar getActionBar() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getActionBar();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<android.app.ActionBar> superCall
                = new NamedSuperCall<android.app.ActionBar>("getActionBar()") {

            @Override
            public android.app.ActionBar call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getActionBar(this);
                } else {
                    return getOriginal().super_getActionBar();
                }
            }
        };
        return superCall.call();
    }

    public Context getApplicationContext() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getApplicationContext();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Context> superCall = new NamedSuperCall<Context>(
                "getApplicationContext()") {

            @Override
            public Context call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getApplicationContext(this);
                } else {
                    return getOriginal().super_getApplicationContext();
                }
            }
        };
        return superCall.call();
    }

    public ApplicationInfo getApplicationInfo() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getApplicationInfo();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<ApplicationInfo> superCall = new NamedSuperCall<ApplicationInfo>(
                "getApplicationInfo()") {

            @Override
            public ApplicationInfo call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getApplicationInfo(this);
                } else {
                    return getOriginal().super_getApplicationInfo();
                }
            }
        };
        return superCall.call();
    }

    public AssetManager getAssets() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getAssets();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<AssetManager> superCall = new NamedSuperCall<AssetManager>(
                "getAssets()") {

            @Override
            public AssetManager call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getAssets(this);
                } else {
                    return getOriginal().super_getAssets();
                }
            }
        };
        return superCall.call();
    }

    public Context getBaseContext() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getBaseContext();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Context> superCall = new NamedSuperCall<Context>("getBaseContext()") {

            @Override
            public Context call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getBaseContext(this);
                } else {
                    return getOriginal().super_getBaseContext();
                }
            }
        };
        return superCall.call();
    }

    public File getCacheDir() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getCacheDir();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<File> superCall = new NamedSuperCall<File>("getCacheDir()") {

            @Override
            public File call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getCacheDir(this);
                } else {
                    return getOriginal().super_getCacheDir();
                }
            }
        };
        return superCall.call();
    }

    public ComponentName getCallingActivity() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getCallingActivity();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<ComponentName> superCall = new NamedSuperCall<ComponentName>(
                "getCallingActivity()") {

            @Override
            public ComponentName call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getCallingActivity(this);
                } else {
                    return getOriginal().super_getCallingActivity();
                }
            }
        };
        return superCall.call();
    }

    public String getCallingPackage() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getCallingPackage();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<String> superCall = new NamedSuperCall<String>("getCallingPackage()") {

            @Override
            public String call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getCallingPackage(this);
                } else {
                    return getOriginal().super_getCallingPackage();
                }
            }
        };
        return superCall.call();
    }

    public int getChangingConfigurations() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getChangingConfigurations();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Integer> superCall = new NamedSuperCall<Integer>(
                "getChangingConfigurations()") {

            @Override
            public Integer call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getChangingConfigurations(this);
                } else {
                    return getOriginal().super_getChangingConfigurations();
                }
            }
        };
        return superCall.call();
    }

    public ClassLoader getClassLoader() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getClassLoader();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<ClassLoader> superCall = new NamedSuperCall<ClassLoader>(
                "getClassLoader()") {

            @Override
            public ClassLoader call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getClassLoader(this);
                } else {
                    return getOriginal().super_getClassLoader();
                }
            }
        };
        return superCall.call();
    }

    public File getCodeCacheDir() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getCodeCacheDir();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<File> superCall = new NamedSuperCall<File>("getCodeCacheDir()") {

            @Override
            public File call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getCodeCacheDir(this);
                } else {
                    return getOriginal().super_getCodeCacheDir();
                }
            }
        };
        return superCall.call();
    }

    public ComponentName getComponentName() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getComponentName();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<ComponentName> superCall = new NamedSuperCall<ComponentName>(
                "getComponentName()") {

            @Override
            public ComponentName call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getComponentName(this);
                } else {
                    return getOriginal().super_getComponentName();
                }
            }
        };
        return superCall.call();
    }

    public ContentResolver getContentResolver() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getContentResolver();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<ContentResolver> superCall = new NamedSuperCall<ContentResolver>(
                "getContentResolver()") {

            @Override
            public ContentResolver call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getContentResolver(this);
                } else {
                    return getOriginal().super_getContentResolver();
                }
            }
        };
        return superCall.call();
    }

    public Scene getContentScene() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getContentScene();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Scene> superCall = new NamedSuperCall<Scene>("getContentScene()") {

            @Override
            public Scene call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getContentScene(this);
                } else {
                    return getOriginal().super_getContentScene();
                }
            }
        };
        return superCall.call();
    }

    public TransitionManager getContentTransitionManager() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getContentTransitionManager();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<TransitionManager> superCall = new NamedSuperCall<TransitionManager>(
                "getContentTransitionManager()") {

            @Override
            public TransitionManager call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getContentTransitionManager(this);
                } else {
                    return getOriginal().super_getContentTransitionManager();
                }
            }
        };
        return superCall.call();
    }

    public View getCurrentFocus() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getCurrentFocus();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<View> superCall = new NamedSuperCall<View>("getCurrentFocus()") {

            @Override
            public View call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getCurrentFocus(this);
                } else {
                    return getOriginal().super_getCurrentFocus();
                }
            }
        };
        return superCall.call();
    }

    public File getDatabasePath(final String name) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getDatabasePath(name);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<File> superCall = new NamedSuperCall<File>("getDatabasePath(String)") {

            @Override
            public File call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getDatabasePath(this, (String) args[0]);
                } else {
                    return getOriginal().super_getDatabasePath((String) args[0]);
                }
            }
        };
        return superCall.call(name);
    }

    public AppCompatDelegate getDelegate() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getDelegate();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<AppCompatDelegate> superCall = new NamedSuperCall<AppCompatDelegate>(
                "getDelegate()") {

            @Override
            public AppCompatDelegate call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getDelegate(this);
                } else {
                    return getOriginal().super_getDelegate();
                }
            }
        };
        return superCall.call();
    }

    public File getDir(final String name, final int mode) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getDir(name, mode);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<File> superCall = new NamedSuperCall<File>("getDir(String, int)") {

            @Override
            public File call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getDir(this, (String) args[0], (int) args[1]);
                } else {
                    return getOriginal().super_getDir((String) args[0], (int) args[1]);
                }
            }
        };
        return superCall.call(name, mode);
    }

    public ActionBarDrawerToggle.Delegate getDrawerToggleDelegate() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getDrawerToggleDelegate();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<ActionBarDrawerToggle.Delegate> superCall
                = new NamedSuperCall<ActionBarDrawerToggle.Delegate>("getDrawerToggleDelegate()") {

            @Override
            public ActionBarDrawerToggle.Delegate call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getDrawerToggleDelegate(this);
                } else {
                    return getOriginal().super_getDrawerToggleDelegate();
                }
            }
        };
        return superCall.call();
    }

    public File getExternalCacheDir() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getExternalCacheDir();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<File> superCall = new NamedSuperCall<File>("getExternalCacheDir()") {

            @Override
            public File call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getExternalCacheDir(this);
                } else {
                    return getOriginal().super_getExternalCacheDir();
                }
            }
        };
        return superCall.call();
    }

    public File[] getExternalCacheDirs() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getExternalCacheDirs();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<File[]> superCall = new NamedSuperCall<File[]>(
                "getExternalCacheDirs()") {

            @Override
            public File[] call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getExternalCacheDirs(this);
                } else {
                    return getOriginal().super_getExternalCacheDirs();
                }
            }
        };
        return superCall.call();
    }

    public File getExternalFilesDir(final String type) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getExternalFilesDir(type);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<File> superCall = new NamedSuperCall<File>(
                "getExternalFilesDir(String)") {

            @Override
            public File call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getExternalFilesDir(this, (String) args[0]);
                } else {
                    return getOriginal().super_getExternalFilesDir((String) args[0]);
                }
            }
        };
        return superCall.call(type);
    }

    public File[] getExternalFilesDirs(final String type) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getExternalFilesDirs(type);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<File[]> superCall = new NamedSuperCall<File[]>(
                "getExternalFilesDirs(String)") {

            @Override
            public File[] call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getExternalFilesDirs(this, (String) args[0]);
                } else {
                    return getOriginal().super_getExternalFilesDirs((String) args[0]);
                }
            }
        };
        return superCall.call(type);
    }

    public File[] getExternalMediaDirs() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getExternalMediaDirs();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<File[]> superCall = new NamedSuperCall<File[]>(
                "getExternalMediaDirs()") {

            @Override
            public File[] call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getExternalMediaDirs(this);
                } else {
                    return getOriginal().super_getExternalMediaDirs();
                }
            }
        };
        return superCall.call();
    }

    public File getFileStreamPath(final String name) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getFileStreamPath(name);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<File> superCall = new NamedSuperCall<File>(
                "getFileStreamPath(String)") {

            @Override
            public File call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getFileStreamPath(this, (String) args[0]);
                } else {
                    return getOriginal().super_getFileStreamPath((String) args[0]);
                }
            }
        };
        return superCall.call(name);
    }

    public File getFilesDir() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getFilesDir();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<File> superCall = new NamedSuperCall<File>("getFilesDir()") {

            @Override
            public File call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getFilesDir(this);
                } else {
                    return getOriginal().super_getFilesDir();
                }
            }
        };
        return superCall.call();
    }

    public android.app.FragmentManager getFragmentManager() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getFragmentManager();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<android.app.FragmentManager> superCall
                = new NamedSuperCall<android.app.FragmentManager>("getFragmentManager()") {

            @Override
            public android.app.FragmentManager call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getFragmentManager(this);
                } else {
                    return getOriginal().super_getFragmentManager();
                }
            }
        };
        return superCall.call();
    }

    public Intent getIntent() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getIntent();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Intent> superCall = new NamedSuperCall<Intent>("getIntent()") {

            @Override
            public Intent call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getIntent(this);
                } else {
                    return getOriginal().super_getIntent();
                }
            }
        };
        return superCall.call();
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
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getLayoutInflater();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<LayoutInflater> superCall = new NamedSuperCall<LayoutInflater>(
                "getLayoutInflater()") {

            @Override
            public LayoutInflater call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getLayoutInflater(this);
                } else {
                    return getOriginal().super_getLayoutInflater();
                }
            }
        };
        return superCall.call();
    }

    public android.app.LoaderManager getLoaderManager() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getLoaderManager();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<android.app.LoaderManager> superCall
                = new NamedSuperCall<android.app.LoaderManager>("getLoaderManager()") {

            @Override
            public android.app.LoaderManager call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getLoaderManager(this);
                } else {
                    return getOriginal().super_getLoaderManager();
                }
            }
        };
        return superCall.call();
    }

    public String getLocalClassName() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getLocalClassName();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<String> superCall = new NamedSuperCall<String>("getLocalClassName()") {

            @Override
            public String call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getLocalClassName(this);
                } else {
                    return getOriginal().super_getLocalClassName();
                }
            }
        };
        return superCall.call();
    }

    public Looper getMainLooper() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getMainLooper();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Looper> superCall = new NamedSuperCall<Looper>("getMainLooper()") {

            @Override
            public Looper call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getMainLooper(this);
                } else {
                    return getOriginal().super_getMainLooper();
                }
            }
        };
        return superCall.call();
    }

    public MenuInflater getMenuInflater() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getMenuInflater();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<MenuInflater> superCall = new NamedSuperCall<MenuInflater>(
                "getMenuInflater()") {

            @Override
            public MenuInflater call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getMenuInflater(this);
                } else {
                    return getOriginal().super_getMenuInflater();
                }
            }
        };
        return superCall.call();
    }

    public File getNoBackupFilesDir() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getNoBackupFilesDir();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<File> superCall = new NamedSuperCall<File>("getNoBackupFilesDir()") {

            @Override
            public File call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getNoBackupFilesDir(this);
                } else {
                    return getOriginal().super_getNoBackupFilesDir();
                }
            }
        };
        return superCall.call();
    }

    public File getObbDir() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getObbDir();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<File> superCall = new NamedSuperCall<File>("getObbDir()") {

            @Override
            public File call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getObbDir(this);
                } else {
                    return getOriginal().super_getObbDir();
                }
            }
        };
        return superCall.call();
    }

    public File[] getObbDirs() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getObbDirs();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<File[]> superCall = new NamedSuperCall<File[]>("getObbDirs()") {

            @Override
            public File[] call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getObbDirs(this);
                } else {
                    return getOriginal().super_getObbDirs();
                }
            }
        };
        return superCall.call();
    }

    public String getPackageCodePath() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getPackageCodePath();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<String> superCall = new NamedSuperCall<String>(
                "getPackageCodePath()") {

            @Override
            public String call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getPackageCodePath(this);
                } else {
                    return getOriginal().super_getPackageCodePath();
                }
            }
        };
        return superCall.call();
    }

    public PackageManager getPackageManager() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getPackageManager();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<PackageManager> superCall = new NamedSuperCall<PackageManager>(
                "getPackageManager()") {

            @Override
            public PackageManager call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getPackageManager(this);
                } else {
                    return getOriginal().super_getPackageManager();
                }
            }
        };
        return superCall.call();
    }

    public String getPackageName() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getPackageName();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<String> superCall = new NamedSuperCall<String>("getPackageName()") {

            @Override
            public String call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getPackageName(this);
                } else {
                    return getOriginal().super_getPackageName();
                }
            }
        };
        return superCall.call();
    }

    public String getPackageResourcePath() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getPackageResourcePath();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<String> superCall = new NamedSuperCall<String>(
                "getPackageResourcePath()") {

            @Override
            public String call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getPackageResourcePath(this);
                } else {
                    return getOriginal().super_getPackageResourcePath();
                }
            }
        };
        return superCall.call();
    }

    public Intent getParentActivityIntent() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getParentActivityIntent();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Intent> superCall = new NamedSuperCall<Intent>(
                "getParentActivityIntent()") {

            @Override
            public Intent call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getParentActivityIntent(this);
                } else {
                    return getOriginal().super_getParentActivityIntent();
                }
            }
        };
        return superCall.call();
    }

    public SharedPreferences getPreferences(final int mode) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getPreferences(mode);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<SharedPreferences> superCall = new NamedSuperCall<SharedPreferences>(
                "getPreferences(int)") {

            @Override
            public SharedPreferences call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getPreferences(this, (int) args[0]);
                } else {
                    return getOriginal().super_getPreferences((int) args[0]);
                }
            }
        };
        return superCall.call(mode);
    }

    public Uri getReferrer() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getReferrer();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Uri> superCall = new NamedSuperCall<Uri>("getReferrer()") {

            @Override
            public Uri call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getReferrer(this);
                } else {
                    return getOriginal().super_getReferrer();
                }
            }
        };
        return superCall.call();
    }

    public int getRequestedOrientation() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getRequestedOrientation();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Integer> superCall = new NamedSuperCall<Integer>(
                "getRequestedOrientation()") {

            @Override
            public Integer call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getRequestedOrientation(this);
                } else {
                    return getOriginal().super_getRequestedOrientation();
                }
            }
        };
        return superCall.call();
    }

    public Resources getResources() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getResources();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Resources> superCall = new NamedSuperCall<Resources>(
                "getResources()") {

            @Override
            public Resources call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getResources(this);
                } else {
                    return getOriginal().super_getResources();
                }
            }
        };
        return superCall.call();
    }

    public SharedPreferences getSharedPreferences(final String name, final int mode) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getSharedPreferences(name, mode);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<SharedPreferences> superCall = new NamedSuperCall<SharedPreferences>(
                "getSharedPreferences(String, int)") {

            @Override
            public SharedPreferences call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .getSharedPreferences(this, (String) args[0], (int) args[1]);
                } else {
                    return getOriginal()
                            .super_getSharedPreferences((String) args[0], (int) args[1]);
                }
            }
        };
        return superCall.call(name, mode);
    }

    public ActionBar getSupportActionBar() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getSupportActionBar();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<ActionBar> superCall = new NamedSuperCall<ActionBar>(
                "getSupportActionBar()") {

            @Override
            public ActionBar call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getSupportActionBar(this);
                } else {
                    return getOriginal().super_getSupportActionBar();
                }
            }
        };
        return superCall.call();
    }

    public FragmentManager getSupportFragmentManager() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getSupportFragmentManager();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<FragmentManager> superCall = new NamedSuperCall<FragmentManager>(
                "getSupportFragmentManager()") {

            @Override
            public FragmentManager call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getSupportFragmentManager(this);
                } else {
                    return getOriginal().super_getSupportFragmentManager();
                }
            }
        };
        return superCall.call();
    }

    public LoaderManager getSupportLoaderManager() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getSupportLoaderManager();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<LoaderManager> superCall = new NamedSuperCall<LoaderManager>(
                "getSupportLoaderManager()") {

            @Override
            public LoaderManager call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getSupportLoaderManager(this);
                } else {
                    return getOriginal().super_getSupportLoaderManager();
                }
            }
        };
        return superCall.call();
    }

    public Intent getSupportParentActivityIntent() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getSupportParentActivityIntent();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Intent> superCall = new NamedSuperCall<Intent>(
                "getSupportParentActivityIntent()") {

            @Override
            public Intent call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getSupportParentActivityIntent(this);
                } else {
                    return getOriginal().super_getSupportParentActivityIntent();
                }
            }
        };
        return superCall.call();
    }

    public Object getSystemService(final String name) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getSystemService(name);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Object> superCall = new NamedSuperCall<Object>(
                "getSystemService(String)") {

            @Override
            public Object call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getSystemService(this, (String) args[0]);
                } else {
                    return getOriginal().super_getSystemService((String) args[0]);
                }
            }
        };
        return superCall.call(name);
    }

    public String getSystemServiceName(final Class<?> serviceClass) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getSystemServiceName(serviceClass);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<String> superCall = new NamedSuperCall<String>(
                "getSystemServiceName(Class<?>)") {

            @Override
            public String call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getSystemServiceName(this, (Class<?>) args[0]);
                } else {
                    return getOriginal().super_getSystemServiceName((Class<?>) args[0]);
                }
            }
        };
        return superCall.call(serviceClass);
    }

    public int getTaskId() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getTaskId();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Integer> superCall = new NamedSuperCall<Integer>("getTaskId()") {

            @Override
            public Integer call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getTaskId(this);
                } else {
                    return getOriginal().super_getTaskId();
                }
            }
        };
        return superCall.call();
    }

    public Resources.Theme getTheme() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getTheme();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Resources.Theme> superCall = new NamedSuperCall<Resources.Theme>(
                "getTheme()") {

            @Override
            public Resources.Theme call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getTheme(this);
                } else {
                    return getOriginal().super_getTheme();
                }
            }
        };
        return superCall.call();
    }

    public VoiceInteractor getVoiceInteractor() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getVoiceInteractor();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<VoiceInteractor> superCall = new NamedSuperCall<VoiceInteractor>(
                "getVoiceInteractor()") {

            @Override
            public VoiceInteractor call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getVoiceInteractor(this);
                } else {
                    return getOriginal().super_getVoiceInteractor();
                }
            }
        };
        return superCall.call();
    }

    public Drawable getWallpaper() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getWallpaper();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Drawable> superCall = new NamedSuperCall<Drawable>("getWallpaper()") {

            @Override
            public Drawable call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getWallpaper(this);
                } else {
                    return getOriginal().super_getWallpaper();
                }
            }
        };
        return superCall.call();
    }

    public int getWallpaperDesiredMinimumHeight() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getWallpaperDesiredMinimumHeight();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Integer> superCall = new NamedSuperCall<Integer>(
                "getWallpaperDesiredMinimumHeight()") {

            @Override
            public Integer call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getWallpaperDesiredMinimumHeight(this);
                } else {
                    return getOriginal().super_getWallpaperDesiredMinimumHeight();
                }
            }
        };
        return superCall.call();
    }

    public int getWallpaperDesiredMinimumWidth() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getWallpaperDesiredMinimumWidth();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Integer> superCall = new NamedSuperCall<Integer>(
                "getWallpaperDesiredMinimumWidth()") {

            @Override
            public Integer call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getWallpaperDesiredMinimumWidth(this);
                } else {
                    return getOriginal().super_getWallpaperDesiredMinimumWidth();
                }
            }
        };
        return superCall.call();
    }

    public Window getWindow() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getWindow();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Window> superCall = new NamedSuperCall<Window>("getWindow()") {

            @Override
            public Window call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getWindow(this);
                } else {
                    return getOriginal().super_getWindow();
                }
            }
        };
        return superCall.call();
    }

    public WindowManager getWindowManager() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_getWindowManager();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<WindowManager> superCall = new NamedSuperCall<WindowManager>(
                "getWindowManager()") {

            @Override
            public WindowManager call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().getWindowManager(this);
                } else {
                    return getOriginal().super_getWindowManager();
                }
            }
        };
        return superCall.call();
    }

    public void grantUriPermission(final String toPackage, final Uri uri, final int modeFlags) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_grantUriPermission(toPackage, uri, modeFlags);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "grantUriPermission(String, Uri, int)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().grantUriPermission(this, (String) args[0], (Uri) args[1],
                            (int) args[2]);
                    return null;
                } else {
                    getOriginal().super_grantUriPermission((String) args[0], (Uri) args[1],
                            (int) args[2]);
                    return null;
                }
            }
        };
        superCall.call(toPackage, uri, modeFlags);
    }

    public boolean hasWindowFocus() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_hasWindowFocus();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>("hasWindowFocus()") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().hasWindowFocus(this);
                } else {
                    return getOriginal().super_hasWindowFocus();
                }
            }
        };
        return superCall.call();
    }

    public void invalidateOptionsMenu() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_invalidateOptionsMenu();
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("invalidateOptionsMenu()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().invalidateOptionsMenu(this);
                    return null;
                } else {
                    getOriginal().super_invalidateOptionsMenu();
                    return null;
                }
            }
        };
        superCall.call();
    }

    public boolean isChangingConfigurations() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_isChangingConfigurations();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "isChangingConfigurations()") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().isChangingConfigurations(this);
                } else {
                    return getOriginal().super_isChangingConfigurations();
                }
            }
        };
        return superCall.call();
    }

    public boolean isDestroyed() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_isDestroyed();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>("isDestroyed()") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().isDestroyed(this);
                } else {
                    return getOriginal().super_isDestroyed();
                }
            }
        };
        return superCall.call();
    }

    public boolean isFinishing() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_isFinishing();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>("isFinishing()") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().isFinishing(this);
                } else {
                    return getOriginal().super_isFinishing();
                }
            }
        };
        return superCall.call();
    }

    public boolean isImmersive() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_isImmersive();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>("isImmersive()") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().isImmersive(this);
                } else {
                    return getOriginal().super_isImmersive();
                }
            }
        };
        return superCall.call();
    }

    public boolean isRestricted() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_isRestricted();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>("isRestricted()") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().isRestricted(this);
                } else {
                    return getOriginal().super_isRestricted();
                }
            }
        };
        return superCall.call();
    }

    public boolean isTaskRoot() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_isTaskRoot();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>("isTaskRoot()") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().isTaskRoot(this);
                } else {
                    return getOriginal().super_isTaskRoot();
                }
            }
        };
        return superCall.call();
    }

    public boolean isVoiceInteraction() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_isVoiceInteraction();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "isVoiceInteraction()") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().isVoiceInteraction(this);
                } else {
                    return getOriginal().super_isVoiceInteraction();
                }
            }
        };
        return superCall.call();
    }

    public boolean isVoiceInteractionRoot() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_isVoiceInteractionRoot();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "isVoiceInteractionRoot()") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().isVoiceInteractionRoot(this);
                } else {
                    return getOriginal().super_isVoiceInteractionRoot();
                }
            }
        };
        return superCall.call();
    }

    public boolean moveTaskToBack(final boolean nonRoot) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_moveTaskToBack(nonRoot);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "moveTaskToBack(boolean)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().moveTaskToBack(this, (boolean) args[0]);
                } else {
                    return getOriginal().super_moveTaskToBack((boolean) args[0]);
                }
            }
        };
        return superCall.call(nonRoot);
    }

    public boolean navigateUpTo(final Intent upIntent) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_navigateUpTo(upIntent);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "navigateUpTo(Intent)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().navigateUpTo(this, (Intent) args[0]);
                } else {
                    return getOriginal().super_navigateUpTo((Intent) args[0]);
                }
            }
        };
        return superCall.call(upIntent);
    }

    public boolean navigateUpToFromChild(final Activity child, final Intent upIntent) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_navigateUpToFromChild(child, upIntent);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "navigateUpToFromChild(Activity, Intent)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .navigateUpToFromChild(this, (Activity) args[0], (Intent) args[1]);
                } else {
                    return getOriginal()
                            .super_navigateUpToFromChild((Activity) args[0], (Intent) args[1]);
                }
            }
        };
        return superCall.call(child, upIntent);
    }

    public void onActionModeFinished(final android.view.ActionMode mode) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onActionModeFinished(mode);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onActionModeFinished(android.view.ActionMode)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .onActionModeFinished(this, (android.view.ActionMode) args[0]);
                    return null;
                } else {
                    getOriginal().super_onActionModeFinished((android.view.ActionMode) args[0]);
                    return null;
                }
            }
        };
        superCall.call(mode);
    }

    public void onActionModeStarted(final android.view.ActionMode mode) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onActionModeStarted(mode);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onActionModeStarted(android.view.ActionMode)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .onActionModeStarted(this, (android.view.ActionMode) args[0]);
                    return null;
                } else {
                    getOriginal().super_onActionModeStarted((android.view.ActionMode) args[0]);
                    return null;
                }
            }
        };
        superCall.call(mode);
    }

    public void onActivityReenter(final int resultCode, final Intent data) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onActivityReenter(resultCode, data);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onActivityReenter(int, Intent)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onActivityReenter(this, (int) args[0], (Intent) args[1]);
                    return null;
                } else {
                    getOriginal().super_onActivityReenter((int) args[0], (Intent) args[1]);
                    return null;
                }
            }
        };
        superCall.call(resultCode, data);
    }

    public void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onActivityResult(requestCode, resultCode, data);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onActivityResult(int, int, Intent)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .onActivityResult(this, (int) args[0], (int) args[1], (Intent) args[2]);
                    return null;
                } else {
                    getOriginal()
                            .super_onActivityResult((int) args[0], (int) args[1], (Intent) args[2]);
                    return null;
                }
            }
        };
        superCall.call(requestCode, resultCode, data);
    }

    public void onApplyThemeResource(final Resources.Theme theme, final int resid,
            final boolean first) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onApplyThemeResource(theme, resid, first);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onApplyThemeResource(Resources.Theme, int, boolean)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .onApplyThemeResource(this, (Resources.Theme) args[0], (int) args[1],
                                    (boolean) args[2]);
                    return null;
                } else {
                    getOriginal()
                            .super_onApplyThemeResource((Resources.Theme) args[0], (int) args[1],
                                    (boolean) args[2]);
                    return null;
                }
            }
        };
        superCall.call(theme, resid, first);
    }

    public void onAttachFragment(final Fragment fragment) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onAttachFragment(fragment);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onAttachFragment(Fragment)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onAttachFragment(this, (Fragment) args[0]);
                    return null;
                } else {
                    getOriginal().super_onAttachFragment((Fragment) args[0]);
                    return null;
                }
            }
        };
        superCall.call(fragment);
    }

    public void onAttachFragment(final android.app.Fragment fragment) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onAttachFragment(fragment);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onAttachFragment(android.app.Fragment)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onAttachFragment(this, (android.app.Fragment) args[0]);
                    return null;
                } else {
                    getOriginal().super_onAttachFragment((android.app.Fragment) args[0]);
                    return null;
                }
            }
        };
        superCall.call(fragment);
    }

    public void onAttachedToWindow() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onAttachedToWindow();
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("onAttachedToWindow()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onAttachedToWindow(this);
                    return null;
                } else {
                    getOriginal().super_onAttachedToWindow();
                    return null;
                }
            }
        };
        superCall.call();
    }

    public void onBackPressed() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onBackPressed();
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("onBackPressed()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onBackPressed(this);
                    return null;
                } else {
                    getOriginal().super_onBackPressed();
                    return null;
                }
            }
        };
        superCall.call();
    }

    public void onChildTitleChanged(final Activity childActivity, final CharSequence title) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onChildTitleChanged(childActivity, title);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onChildTitleChanged(Activity, CharSequence)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .onChildTitleChanged(this, (Activity) args[0], (CharSequence) args[1]);
                    return null;
                } else {
                    getOriginal()
                            .super_onChildTitleChanged((Activity) args[0], (CharSequence) args[1]);
                    return null;
                }
            }
        };
        superCall.call(childActivity, title);
    }

    public void onConfigurationChanged(final Configuration newConfig) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onConfigurationChanged(newConfig);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onConfigurationChanged(Configuration)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onConfigurationChanged(this, (Configuration) args[0]);
                    return null;
                } else {
                    getOriginal().super_onConfigurationChanged((Configuration) args[0]);
                    return null;
                }
            }
        };
        superCall.call(newConfig);
    }

    public void onContentChanged() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onContentChanged();
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("onContentChanged()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onContentChanged(this);
                    return null;
                } else {
                    getOriginal().super_onContentChanged();
                    return null;
                }
            }
        };
        superCall.call();
    }

    public boolean onContextItemSelected(final MenuItem item) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_onContextItemSelected(item);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "onContextItemSelected(MenuItem)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onContextItemSelected(this, (MenuItem) args[0]);
                } else {
                    return getOriginal().super_onContextItemSelected((MenuItem) args[0]);
                }
            }
        };
        return superCall.call(item);
    }

    public void onContextMenuClosed(final Menu menu) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onContextMenuClosed(menu);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onContextMenuClosed(Menu)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onContextMenuClosed(this, (Menu) args[0]);
                    return null;
                } else {
                    getOriginal().super_onContextMenuClosed((Menu) args[0]);
                    return null;
                }
            }
        };
        superCall.call(menu);
    }

    public void onCreate(final Bundle savedInstanceState, final PersistableBundle persistentState) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onCreate(savedInstanceState, persistentState);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onCreate(Bundle, PersistableBundle)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .onCreate(this, (Bundle) args[0], (PersistableBundle) args[1]);
                    return null;
                } else {
                    getOriginal().super_onCreate((Bundle) args[0], (PersistableBundle) args[1]);
                    return null;
                }
            }
        };
        superCall.call(savedInstanceState, persistentState);
    }

    public void onCreate(@Nullable final Bundle savedInstanceState) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onCreate(savedInstanceState);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("onCreate(Bundle)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onCreate(this, (Bundle) args[0]);
                    return null;
                } else {
                    getOriginal().super_onCreate((Bundle) args[0]);
                    return null;
                }
            }
        };
        superCall.call(savedInstanceState);
    }

    public void onCreateContextMenu(final ContextMenu menu, final View v,
            final ContextMenu.ContextMenuInfo menuInfo) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onCreateContextMenu(menu, v, menuInfo);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onCreateContextMenu(ContextMenu, View, ContextMenu.ContextMenuInfo)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .onCreateContextMenu(this, (ContextMenu) args[0], (View) args[1],
                                    (ContextMenu.ContextMenuInfo) args[2]);
                    return null;
                } else {
                    getOriginal().super_onCreateContextMenu((ContextMenu) args[0], (View) args[1],
                            (ContextMenu.ContextMenuInfo) args[2]);
                    return null;
                }
            }
        };
        superCall.call(menu, v, menuInfo);
    }

    public CharSequence onCreateDescription() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_onCreateDescription();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<CharSequence> superCall = new NamedSuperCall<CharSequence>(
                "onCreateDescription()") {

            @Override
            public CharSequence call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onCreateDescription(this);
                } else {
                    return getOriginal().super_onCreateDescription();
                }
            }
        };
        return superCall.call();
    }

    public Dialog onCreateDialog(final int id) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_onCreateDialog(id);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Dialog> superCall = new NamedSuperCall<Dialog>("onCreateDialog(int)") {

            @Override
            public Dialog call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onCreateDialog(this, (int) args[0]);
                } else {
                    return getOriginal().super_onCreateDialog((int) args[0]);
                }
            }
        };
        return superCall.call(id);
    }

    public Dialog onCreateDialog(final int id, final Bundle args) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_onCreateDialog(id, args);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Dialog> superCall = new NamedSuperCall<Dialog>(
                "onCreateDialog(int, Bundle)") {

            @Override
            public Dialog call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .onCreateDialog(this, (int) args[0], (Bundle) args[1]);
                } else {
                    return getOriginal().super_onCreateDialog((int) args[0], (Bundle) args[1]);
                }
            }
        };
        return superCall.call(id, args);
    }

    public void onCreateNavigateUpTaskStack(final TaskStackBuilder builder) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onCreateNavigateUpTaskStack(builder);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onCreateNavigateUpTaskStack(TaskStackBuilder)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .onCreateNavigateUpTaskStack(this, (TaskStackBuilder) args[0]);
                    return null;
                } else {
                    getOriginal().super_onCreateNavigateUpTaskStack((TaskStackBuilder) args[0]);
                    return null;
                }
            }
        };
        superCall.call(builder);
    }

    public boolean onCreateOptionsMenu(final Menu menu) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_onCreateOptionsMenu(menu);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "onCreateOptionsMenu(Menu)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onCreateOptionsMenu(this, (Menu) args[0]);
                } else {
                    return getOriginal().super_onCreateOptionsMenu((Menu) args[0]);
                }
            }
        };
        return superCall.call(menu);
    }

    public boolean onCreatePanelMenu(final int featureId, final Menu menu) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_onCreatePanelMenu(featureId, menu);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "onCreatePanelMenu(int, Menu)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .onCreatePanelMenu(this, (int) args[0], (Menu) args[1]);
                } else {
                    return getOriginal().super_onCreatePanelMenu((int) args[0], (Menu) args[1]);
                }
            }
        };
        return superCall.call(featureId, menu);
    }

    public View onCreatePanelView(final int featureId) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_onCreatePanelView(featureId);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<View> superCall = new NamedSuperCall<View>("onCreatePanelView(int)") {

            @Override
            public View call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onCreatePanelView(this, (int) args[0]);
                } else {
                    return getOriginal().super_onCreatePanelView((int) args[0]);
                }
            }
        };
        return superCall.call(featureId);
    }

    public void onCreateSupportNavigateUpTaskStack(
            @NonNull final android.support.v4.app.TaskStackBuilder builder) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onCreateSupportNavigateUpTaskStack(builder);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onCreateSupportNavigateUpTaskStack(android.support.v4.app.TaskStackBuilder)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onCreateSupportNavigateUpTaskStack(this,
                            (android.support.v4.app.TaskStackBuilder) args[0]);
                    return null;
                } else {
                    getOriginal().super_onCreateSupportNavigateUpTaskStack(
                            (android.support.v4.app.TaskStackBuilder) args[0]);
                    return null;
                }
            }
        };
        superCall.call(builder);
    }

    public boolean onCreateThumbnail(final Bitmap outBitmap, final Canvas canvas) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_onCreateThumbnail(outBitmap, canvas);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "onCreateThumbnail(Bitmap, Canvas)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .onCreateThumbnail(this, (Bitmap) args[0], (Canvas) args[1]);
                } else {
                    return getOriginal()
                            .super_onCreateThumbnail((Bitmap) args[0], (Canvas) args[1]);
                }
            }
        };
        return superCall.call(outBitmap, canvas);
    }

    public View onCreateView(final View parent, final String name, final Context context,
            final AttributeSet attrs) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_onCreateView(parent, name, context, attrs);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<View> superCall = new NamedSuperCall<View>(
                "onCreateView(View, String, Context, AttributeSet)") {

            @Override
            public View call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .onCreateView(this, (View) args[0], (String) args[1], (Context) args[2],
                                    (AttributeSet) args[3]);
                } else {
                    return getOriginal()
                            .super_onCreateView((View) args[0], (String) args[1], (Context) args[2],
                                    (AttributeSet) args[3]);
                }
            }
        };
        return superCall.call(parent, name, context, attrs);
    }

    public View onCreateView(final String name, final Context context, final AttributeSet attrs) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_onCreateView(name, context, attrs);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<View> superCall = new NamedSuperCall<View>(
                "onCreateView(String, Context, AttributeSet)") {

            @Override
            public View call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .onCreateView(this, (String) args[0], (Context) args[1],
                                    (AttributeSet) args[2]);
                } else {
                    return getOriginal().super_onCreateView((String) args[0], (Context) args[1],
                            (AttributeSet) args[2]);
                }
            }
        };
        return superCall.call(name, context, attrs);
    }

    public void onDestroy() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onDestroy();
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("onDestroy()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onDestroy(this);
                    return null;
                } else {
                    getOriginal().super_onDestroy();
                    return null;
                }
            }
        };
        superCall.call();
    }

    public void onDetachedFromWindow() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onDetachedFromWindow();
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("onDetachedFromWindow()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onDetachedFromWindow(this);
                    return null;
                } else {
                    getOriginal().super_onDetachedFromWindow();
                    return null;
                }
            }
        };
        superCall.call();
    }

    public void onEnterAnimationComplete() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onEnterAnimationComplete();
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onEnterAnimationComplete()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onEnterAnimationComplete(this);
                    return null;
                } else {
                    getOriginal().super_onEnterAnimationComplete();
                    return null;
                }
            }
        };
        superCall.call();
    }

    public boolean onGenericMotionEvent(final MotionEvent event) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_onGenericMotionEvent(event);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "onGenericMotionEvent(MotionEvent)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onGenericMotionEvent(this, (MotionEvent) args[0]);
                } else {
                    return getOriginal().super_onGenericMotionEvent((MotionEvent) args[0]);
                }
            }
        };
        return superCall.call(event);
    }

    public boolean onKeyDown(final int keyCode, final KeyEvent event) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_onKeyDown(keyCode, event);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "onKeyDown(int, KeyEvent)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onKeyDown(this, (int) args[0], (KeyEvent) args[1]);
                } else {
                    return getOriginal().super_onKeyDown((int) args[0], (KeyEvent) args[1]);
                }
            }
        };
        return superCall.call(keyCode, event);
    }

    public boolean onKeyLongPress(final int keyCode, final KeyEvent event) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_onKeyLongPress(keyCode, event);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "onKeyLongPress(int, KeyEvent)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .onKeyLongPress(this, (int) args[0], (KeyEvent) args[1]);
                } else {
                    return getOriginal().super_onKeyLongPress((int) args[0], (KeyEvent) args[1]);
                }
            }
        };
        return superCall.call(keyCode, event);
    }

    public boolean onKeyMultiple(final int keyCode, final int repeatCount, final KeyEvent event) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_onKeyMultiple(keyCode, repeatCount, event);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "onKeyMultiple(int, int, KeyEvent)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .onKeyMultiple(this, (int) args[0], (int) args[1], (KeyEvent) args[2]);
                } else {
                    return getOriginal()
                            .super_onKeyMultiple((int) args[0], (int) args[1], (KeyEvent) args[2]);
                }
            }
        };
        return superCall.call(keyCode, repeatCount, event);
    }

    public boolean onKeyShortcut(final int keyCode, final KeyEvent event) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_onKeyShortcut(keyCode, event);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "onKeyShortcut(int, KeyEvent)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .onKeyShortcut(this, (int) args[0], (KeyEvent) args[1]);
                } else {
                    return getOriginal().super_onKeyShortcut((int) args[0], (KeyEvent) args[1]);
                }
            }
        };
        return superCall.call(keyCode, event);
    }

    public boolean onKeyUp(final int keyCode, final KeyEvent event) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_onKeyUp(keyCode, event);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "onKeyUp(int, KeyEvent)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onKeyUp(this, (int) args[0], (KeyEvent) args[1]);
                } else {
                    return getOriginal().super_onKeyUp((int) args[0], (KeyEvent) args[1]);
                }
            }
        };
        return superCall.call(keyCode, event);
    }

    public void onLowMemory() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onLowMemory();
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("onLowMemory()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onLowMemory(this);
                    return null;
                } else {
                    getOriginal().super_onLowMemory();
                    return null;
                }
            }
        };
        superCall.call();
    }

    public boolean onMenuOpened(final int featureId, final Menu menu) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_onMenuOpened(featureId, menu);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "onMenuOpened(int, Menu)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onMenuOpened(this, (int) args[0], (Menu) args[1]);
                } else {
                    return getOriginal().super_onMenuOpened((int) args[0], (Menu) args[1]);
                }
            }
        };
        return superCall.call(featureId, menu);
    }

    public boolean onNavigateUp() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_onNavigateUp();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>("onNavigateUp()") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onNavigateUp(this);
                } else {
                    return getOriginal().super_onNavigateUp();
                }
            }
        };
        return superCall.call();
    }

    public boolean onNavigateUpFromChild(final Activity child) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_onNavigateUpFromChild(child);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "onNavigateUpFromChild(Activity)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onNavigateUpFromChild(this, (Activity) args[0]);
                } else {
                    return getOriginal().super_onNavigateUpFromChild((Activity) args[0]);
                }
            }
        };
        return superCall.call(child);
    }

    public void onNewIntent(final Intent intent) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onNewIntent(intent);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("onNewIntent(Intent)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onNewIntent(this, (Intent) args[0]);
                    return null;
                } else {
                    getOriginal().super_onNewIntent((Intent) args[0]);
                    return null;
                }
            }
        };
        superCall.call(intent);
    }

    public boolean onOptionsItemSelected(final MenuItem item) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_onOptionsItemSelected(item);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "onOptionsItemSelected(MenuItem)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onOptionsItemSelected(this, (MenuItem) args[0]);
                } else {
                    return getOriginal().super_onOptionsItemSelected((MenuItem) args[0]);
                }
            }
        };
        return superCall.call(item);
    }

    public void onOptionsMenuClosed(final Menu menu) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onOptionsMenuClosed(menu);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onOptionsMenuClosed(Menu)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onOptionsMenuClosed(this, (Menu) args[0]);
                    return null;
                } else {
                    getOriginal().super_onOptionsMenuClosed((Menu) args[0]);
                    return null;
                }
            }
        };
        superCall.call(menu);
    }

    public void onPanelClosed(final int featureId, final Menu menu) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onPanelClosed(featureId, menu);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onPanelClosed(int, Menu)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onPanelClosed(this, (int) args[0], (Menu) args[1]);
                    return null;
                } else {
                    getOriginal().super_onPanelClosed((int) args[0], (Menu) args[1]);
                    return null;
                }
            }
        };
        superCall.call(featureId, menu);
    }

    public void onPause() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onPause();
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("onPause()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onPause(this);
                    return null;
                } else {
                    getOriginal().super_onPause();
                    return null;
                }
            }
        };
        superCall.call();
    }

    public void onPostCreate(final Bundle savedInstanceState,
            final PersistableBundle persistentState) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onPostCreate(savedInstanceState, persistentState);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onPostCreate(Bundle, PersistableBundle)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .onPostCreate(this, (Bundle) args[0], (PersistableBundle) args[1]);
                    return null;
                } else {
                    getOriginal().super_onPostCreate((Bundle) args[0], (PersistableBundle) args[1]);
                    return null;
                }
            }
        };
        superCall.call(savedInstanceState, persistentState);
    }

    public void onPostCreate(@Nullable final Bundle savedInstanceState) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onPostCreate(savedInstanceState);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("onPostCreate(Bundle)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onPostCreate(this, (Bundle) args[0]);
                    return null;
                } else {
                    getOriginal().super_onPostCreate((Bundle) args[0]);
                    return null;
                }
            }
        };
        superCall.call(savedInstanceState);
    }

    public void onPostResume() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onPostResume();
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("onPostResume()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onPostResume(this);
                    return null;
                } else {
                    getOriginal().super_onPostResume();
                    return null;
                }
            }
        };
        superCall.call();
    }

    public void onPrepareDialog(final int id, final Dialog dialog) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onPrepareDialog(id, dialog);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onPrepareDialog(int, Dialog)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onPrepareDialog(this, (int) args[0], (Dialog) args[1]);
                    return null;
                } else {
                    getOriginal().super_onPrepareDialog((int) args[0], (Dialog) args[1]);
                    return null;
                }
            }
        };
        superCall.call(id, dialog);
    }

    public void onPrepareDialog(final int id, final Dialog dialog, final Bundle args) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onPrepareDialog(id, dialog, args);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onPrepareDialog(int, Dialog, Bundle)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onPrepareDialog(this, (int) args[0], (Dialog) args[1],
                            (Bundle) args[2]);
                    return null;
                } else {
                    getOriginal().super_onPrepareDialog((int) args[0], (Dialog) args[1],
                            (Bundle) args[2]);
                    return null;
                }
            }
        };
        superCall.call(id, dialog, args);
    }

    public void onPrepareNavigateUpTaskStack(final TaskStackBuilder builder) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onPrepareNavigateUpTaskStack(builder);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onPrepareNavigateUpTaskStack(TaskStackBuilder)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .onPrepareNavigateUpTaskStack(this, (TaskStackBuilder) args[0]);
                    return null;
                } else {
                    getOriginal().super_onPrepareNavigateUpTaskStack((TaskStackBuilder) args[0]);
                    return null;
                }
            }
        };
        superCall.call(builder);
    }

    public boolean onPrepareOptionsMenu(final Menu menu) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_onPrepareOptionsMenu(menu);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "onPrepareOptionsMenu(Menu)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onPrepareOptionsMenu(this, (Menu) args[0]);
                } else {
                    return getOriginal().super_onPrepareOptionsMenu((Menu) args[0]);
                }
            }
        };
        return superCall.call(menu);
    }

    public boolean onPrepareOptionsPanel(final View view, final Menu menu) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_onPrepareOptionsPanel(view, menu);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "onPrepareOptionsPanel(View, Menu)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .onPrepareOptionsPanel(this, (View) args[0], (Menu) args[1]);
                } else {
                    return getOriginal()
                            .super_onPrepareOptionsPanel((View) args[0], (Menu) args[1]);
                }
            }
        };
        return superCall.call(view, menu);
    }

    public boolean onPreparePanel(final int featureId, final View view, final Menu menu) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_onPreparePanel(featureId, view, menu);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "onPreparePanel(int, View, Menu)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .onPreparePanel(this, (int) args[0], (View) args[1], (Menu) args[2]);
                } else {
                    return getOriginal()
                            .super_onPreparePanel((int) args[0], (View) args[1], (Menu) args[2]);
                }
            }
        };
        return superCall.call(featureId, view, menu);
    }

    public void onPrepareSupportNavigateUpTaskStack(
            @NonNull final android.support.v4.app.TaskStackBuilder builder) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onPrepareSupportNavigateUpTaskStack(builder);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onPrepareSupportNavigateUpTaskStack(android.support.v4.app.TaskStackBuilder)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onPrepareSupportNavigateUpTaskStack(this,
                            (android.support.v4.app.TaskStackBuilder) args[0]);
                    return null;
                } else {
                    getOriginal().super_onPrepareSupportNavigateUpTaskStack(
                            (android.support.v4.app.TaskStackBuilder) args[0]);
                    return null;
                }
            }
        };
        superCall.call(builder);
    }

    public void onProvideAssistContent(final AssistContent outContent) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onProvideAssistContent(outContent);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onProvideAssistContent(AssistContent)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onProvideAssistContent(this, (AssistContent) args[0]);
                    return null;
                } else {
                    getOriginal().super_onProvideAssistContent((AssistContent) args[0]);
                    return null;
                }
            }
        };
        superCall.call(outContent);
    }

    public void onProvideAssistData(final Bundle data) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onProvideAssistData(data);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onProvideAssistData(Bundle)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onProvideAssistData(this, (Bundle) args[0]);
                    return null;
                } else {
                    getOriginal().super_onProvideAssistData((Bundle) args[0]);
                    return null;
                }
            }
        };
        superCall.call(data);
    }

    public Uri onProvideReferrer() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_onProvideReferrer();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Uri> superCall = new NamedSuperCall<Uri>("onProvideReferrer()") {

            @Override
            public Uri call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onProvideReferrer(this);
                } else {
                    return getOriginal().super_onProvideReferrer();
                }
            }
        };
        return superCall.call();
    }

    public void onRequestPermissionsResult(final int requestCode,
            @NonNull final String[] permissions, @NonNull final int[] grantResults) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onRequestPermissionsResult(requestCode, permissions, grantResults);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onRequestPermissionsResult(int, String[], int[])") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .onRequestPermissionsResult(this, (int) args[0], (String[]) args[1],
                                    (int[]) args[2]);
                    return null;
                } else {
                    getOriginal()
                            .super_onRequestPermissionsResult((int) args[0], (String[]) args[1],
                                    (int[]) args[2]);
                    return null;
                }
            }
        };
        superCall.call(requestCode, permissions, grantResults);
    }

    public void onRestart() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onRestart();
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("onRestart()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onRestart(this);
                    return null;
                } else {
                    getOriginal().super_onRestart();
                    return null;
                }
            }
        };
        superCall.call();
    }

    public void onRestoreInstanceState(final Bundle savedInstanceState,
            final PersistableBundle persistentState) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onRestoreInstanceState(savedInstanceState, persistentState);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onRestoreInstanceState(Bundle, PersistableBundle)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onRestoreInstanceState(this, (Bundle) args[0],
                            (PersistableBundle) args[1]);
                    return null;
                } else {
                    getOriginal().super_onRestoreInstanceState((Bundle) args[0],
                            (PersistableBundle) args[1]);
                    return null;
                }
            }
        };
        superCall.call(savedInstanceState, persistentState);
    }

    public void onRestoreInstanceState(final Bundle savedInstanceState) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onRestoreInstanceState(savedInstanceState);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onRestoreInstanceState(Bundle)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onRestoreInstanceState(this, (Bundle) args[0]);
                    return null;
                } else {
                    getOriginal().super_onRestoreInstanceState((Bundle) args[0]);
                    return null;
                }
            }
        };
        superCall.call(savedInstanceState);
    }

    public void onResume() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onResume();
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("onResume()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onResume(this);
                    return null;
                } else {
                    getOriginal().super_onResume();
                    return null;
                }
            }
        };
        superCall.call();
    }

    public void onResumeFragments() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onResumeFragments();
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("onResumeFragments()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onResumeFragments(this);
                    return null;
                } else {
                    getOriginal().super_onResumeFragments();
                    return null;
                }
            }
        };
        superCall.call();
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
        if (mPlugins.isEmpty()) {
            getOriginal().super_onSaveInstanceState(outState, outPersistentState);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onSaveInstanceState(Bundle, PersistableBundle)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onSaveInstanceState(this, (Bundle) args[0],
                            (PersistableBundle) args[1]);
                    return null;
                } else {
                    getOriginal().super_onSaveInstanceState((Bundle) args[0],
                            (PersistableBundle) args[1]);
                    return null;
                }
            }
        };
        superCall.call(outState, outPersistentState);
    }

    public void onSaveInstanceState(final Bundle outState) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onSaveInstanceState(outState);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onSaveInstanceState(Bundle)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onSaveInstanceState(this, (Bundle) args[0]);
                    return null;
                } else {
                    getOriginal().super_onSaveInstanceState((Bundle) args[0]);
                    return null;
                }
            }
        };
        superCall.call(outState);
    }

    public boolean onSearchRequested(final SearchEvent searchEvent) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_onSearchRequested(searchEvent);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "onSearchRequested(SearchEvent)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onSearchRequested(this, (SearchEvent) args[0]);
                } else {
                    return getOriginal().super_onSearchRequested((SearchEvent) args[0]);
                }
            }
        };
        return superCall.call(searchEvent);
    }

    public boolean onSearchRequested() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_onSearchRequested();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "onSearchRequested()") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onSearchRequested(this);
                } else {
                    return getOriginal().super_onSearchRequested();
                }
            }
        };
        return superCall.call();
    }

    public void onStart() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onStart();
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("onStart()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onStart(this);
                    return null;
                } else {
                    getOriginal().super_onStart();
                    return null;
                }
            }
        };
        superCall.call();
    }

    public void onStateNotSaved() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onStateNotSaved();
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("onStateNotSaved()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onStateNotSaved(this);
                    return null;
                } else {
                    getOriginal().super_onStateNotSaved();
                    return null;
                }
            }
        };
        superCall.call();
    }

    public void onStop() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onStop();
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("onStop()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onStop(this);
                    return null;
                } else {
                    getOriginal().super_onStop();
                    return null;
                }
            }
        };
        superCall.call();
    }

    public void onSupportActionModeFinished(@NonNull final ActionMode mode) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onSupportActionModeFinished(mode);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onSupportActionModeFinished(ActionMode)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onSupportActionModeFinished(this, (ActionMode) args[0]);
                    return null;
                } else {
                    getOriginal().super_onSupportActionModeFinished((ActionMode) args[0]);
                    return null;
                }
            }
        };
        superCall.call(mode);
    }

    public void onSupportActionModeStarted(@NonNull final ActionMode mode) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onSupportActionModeStarted(mode);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onSupportActionModeStarted(ActionMode)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onSupportActionModeStarted(this, (ActionMode) args[0]);
                    return null;
                } else {
                    getOriginal().super_onSupportActionModeStarted((ActionMode) args[0]);
                    return null;
                }
            }
        };
        superCall.call(mode);
    }

    public void onSupportContentChanged() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onSupportContentChanged();
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onSupportContentChanged()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onSupportContentChanged(this);
                    return null;
                } else {
                    getOriginal().super_onSupportContentChanged();
                    return null;
                }
            }
        };
        superCall.call();
    }

    public boolean onSupportNavigateUp() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_onSupportNavigateUp();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "onSupportNavigateUp()") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onSupportNavigateUp(this);
                } else {
                    return getOriginal().super_onSupportNavigateUp();
                }
            }
        };
        return superCall.call();
    }

    public void onTitleChanged(final CharSequence title, final int color) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onTitleChanged(title, color);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onTitleChanged(CharSequence, int)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onTitleChanged(this, (CharSequence) args[0], (int) args[1]);
                    return null;
                } else {
                    getOriginal().super_onTitleChanged((CharSequence) args[0], (int) args[1]);
                    return null;
                }
            }
        };
        superCall.call(title, color);
    }

    public boolean onTouchEvent(final MotionEvent event) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_onTouchEvent(event);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "onTouchEvent(MotionEvent)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onTouchEvent(this, (MotionEvent) args[0]);
                } else {
                    return getOriginal().super_onTouchEvent((MotionEvent) args[0]);
                }
            }
        };
        return superCall.call(event);
    }

    public boolean onTrackballEvent(final MotionEvent event) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_onTrackballEvent(event);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "onTrackballEvent(MotionEvent)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onTrackballEvent(this, (MotionEvent) args[0]);
                } else {
                    return getOriginal().super_onTrackballEvent((MotionEvent) args[0]);
                }
            }
        };
        return superCall.call(event);
    }

    public void onTrimMemory(final int level) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onTrimMemory(level);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("onTrimMemory(int)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onTrimMemory(this, (int) args[0]);
                    return null;
                } else {
                    getOriginal().super_onTrimMemory((int) args[0]);
                    return null;
                }
            }
        };
        superCall.call(level);
    }

    public void onUserInteraction() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onUserInteraction();
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("onUserInteraction()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onUserInteraction(this);
                    return null;
                } else {
                    getOriginal().super_onUserInteraction();
                    return null;
                }
            }
        };
        superCall.call();
    }

    public void onUserLeaveHint() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onUserLeaveHint();
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("onUserLeaveHint()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onUserLeaveHint(this);
                    return null;
                } else {
                    getOriginal().super_onUserLeaveHint();
                    return null;
                }
            }
        };
        superCall.call();
    }

    public void onVisibleBehindCanceled() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onVisibleBehindCanceled();
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onVisibleBehindCanceled()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onVisibleBehindCanceled(this);
                    return null;
                } else {
                    getOriginal().super_onVisibleBehindCanceled();
                    return null;
                }
            }
        };
        superCall.call();
    }

    public void onWindowAttributesChanged(final WindowManager.LayoutParams params) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onWindowAttributesChanged(params);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onWindowAttributesChanged(WindowManager.LayoutParams)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .onWindowAttributesChanged(this, (WindowManager.LayoutParams) args[0]);
                    return null;
                } else {
                    getOriginal()
                            .super_onWindowAttributesChanged((WindowManager.LayoutParams) args[0]);
                    return null;
                }
            }
        };
        superCall.call(params);
    }

    public void onWindowFocusChanged(final boolean hasFocus) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_onWindowFocusChanged(hasFocus);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "onWindowFocusChanged(boolean)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().onWindowFocusChanged(this, (boolean) args[0]);
                    return null;
                } else {
                    getOriginal().super_onWindowFocusChanged((boolean) args[0]);
                    return null;
                }
            }
        };
        superCall.call(hasFocus);
    }

    public android.view.ActionMode onWindowStartingActionMode(
            final android.view.ActionMode.Callback callback) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_onWindowStartingActionMode(callback);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<android.view.ActionMode> superCall
                = new NamedSuperCall<android.view.ActionMode>(
                "onWindowStartingActionMode(android.view.ActionMode.Callback)") {

            @Override
            public android.view.ActionMode call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onWindowStartingActionMode(this,
                            (android.view.ActionMode.Callback) args[0]);
                } else {
                    return getOriginal().super_onWindowStartingActionMode(
                            (android.view.ActionMode.Callback) args[0]);
                }
            }
        };
        return superCall.call(callback);
    }

    public android.view.ActionMode onWindowStartingActionMode(
            final android.view.ActionMode.Callback callback, final int type) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_onWindowStartingActionMode(callback, type);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<android.view.ActionMode> superCall
                = new NamedSuperCall<android.view.ActionMode>(
                "onWindowStartingActionMode(android.view.ActionMode.Callback, int)") {

            @Override
            public android.view.ActionMode call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().onWindowStartingActionMode(this,
                            (android.view.ActionMode.Callback) args[0], (int) args[1]);
                } else {
                    return getOriginal().super_onWindowStartingActionMode(
                            (android.view.ActionMode.Callback) args[0], (int) args[1]);
                }
            }
        };
        return superCall.call(callback, type);
    }

    public ActionMode onWindowStartingSupportActionMode(
            @NonNull final ActionMode.Callback callback) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_onWindowStartingSupportActionMode(callback);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<ActionMode> superCall = new NamedSuperCall<ActionMode>(
                "onWindowStartingSupportActionMode(ActionMode.Callback)") {

            @Override
            public ActionMode call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .onWindowStartingSupportActionMode(this, (ActionMode.Callback) args[0]);
                } else {
                    return getOriginal()
                            .super_onWindowStartingSupportActionMode((ActionMode.Callback) args[0]);
                }
            }
        };
        return superCall.call(callback);
    }

    public void openContextMenu(final View view) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_openContextMenu(view);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("openContextMenu(View)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().openContextMenu(this, (View) args[0]);
                    return null;
                } else {
                    getOriginal().super_openContextMenu((View) args[0]);
                    return null;
                }
            }
        };
        superCall.call(view);
    }

    public FileInputStream openFileInput(final String name) throws FileNotFoundException {
        if (mPlugins.isEmpty()) {
            try {
                return getOriginal().super_openFileInput(name);
            } catch (FileNotFoundException e) {
                throw new SuppressedException(e);
            }
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<FileInputStream> superCall = new NamedSuperCall<FileInputStream>(
                "openFileInput(String)") {

            @Override
            public FileInputStream call(final Object... args) {
                if (iterator.hasPrevious()) {
                    try {
                        return iterator.previous().openFileInput(this, (String) args[0]);
                    } catch (FileNotFoundException e) {
                        throw new SuppressedException(e);
                    }
                } else {
                    try {
                        return getOriginal().super_openFileInput((String) args[0]);
                    } catch (FileNotFoundException e) {
                        throw new SuppressedException(e);
                    }
                }
            }
        };
        return superCall.call(name);
    }

    public FileOutputStream openFileOutput(final String name, final int mode)
            throws FileNotFoundException {
        if (mPlugins.isEmpty()) {
            try {
                return getOriginal().super_openFileOutput(name, mode);
            } catch (FileNotFoundException e) {
                throw new SuppressedException(e);
            }
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<FileOutputStream> superCall = new NamedSuperCall<FileOutputStream>(
                "openFileOutput(String, int)") {

            @Override
            public FileOutputStream call(final Object... args) {
                if (iterator.hasPrevious()) {
                    try {
                        return iterator.previous()
                                .openFileOutput(this, (String) args[0], (int) args[1]);
                    } catch (FileNotFoundException e) {
                        throw new SuppressedException(e);
                    }
                } else {
                    try {
                        return getOriginal().super_openFileOutput((String) args[0], (int) args[1]);
                    } catch (FileNotFoundException e) {
                        throw new SuppressedException(e);
                    }
                }
            }
        };
        return superCall.call(name, mode);
    }

    public void openOptionsMenu() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_openOptionsMenu();
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("openOptionsMenu()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().openOptionsMenu(this);
                    return null;
                } else {
                    getOriginal().super_openOptionsMenu();
                    return null;
                }
            }
        };
        superCall.call();
    }

    public SQLiteDatabase openOrCreateDatabase(final String name, final int mode,
            final SQLiteDatabase.CursorFactory factory) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_openOrCreateDatabase(name, mode, factory);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<SQLiteDatabase> superCall = new NamedSuperCall<SQLiteDatabase>(
                "openOrCreateDatabase(String, int, SQLiteDatabase.CursorFactory)") {

            @Override
            public SQLiteDatabase call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .openOrCreateDatabase(this, (String) args[0], (int) args[1],
                                    (SQLiteDatabase.CursorFactory) args[2]);
                } else {
                    return getOriginal().super_openOrCreateDatabase((String) args[0], (int) args[1],
                            (SQLiteDatabase.CursorFactory) args[2]);
                }
            }
        };
        return superCall.call(name, mode, factory);
    }

    public SQLiteDatabase openOrCreateDatabase(final String name, final int mode,
            final SQLiteDatabase.CursorFactory factory, final DatabaseErrorHandler errorHandler) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_openOrCreateDatabase(name, mode, factory, errorHandler);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<SQLiteDatabase> superCall = new NamedSuperCall<SQLiteDatabase>(
                "openOrCreateDatabase(String, int, SQLiteDatabase.CursorFactory, DatabaseErrorHandler)") {

            @Override
            public SQLiteDatabase call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .openOrCreateDatabase(this, (String) args[0], (int) args[1],
                                    (SQLiteDatabase.CursorFactory) args[2],
                                    (DatabaseErrorHandler) args[3]);
                } else {
                    return getOriginal().super_openOrCreateDatabase((String) args[0], (int) args[1],
                            (SQLiteDatabase.CursorFactory) args[2], (DatabaseErrorHandler) args[3]);
                }
            }
        };
        return superCall.call(name, mode, factory, errorHandler);
    }

    public void overridePendingTransition(final int enterAnim, final int exitAnim) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_overridePendingTransition(enterAnim, exitAnim);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "overridePendingTransition(int, int)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .overridePendingTransition(this, (int) args[0], (int) args[1]);
                    return null;
                } else {
                    getOriginal().super_overridePendingTransition((int) args[0], (int) args[1]);
                    return null;
                }
            }
        };
        superCall.call(enterAnim, exitAnim);
    }

    public Drawable peekWallpaper() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_peekWallpaper();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Drawable> superCall = new NamedSuperCall<Drawable>("peekWallpaper()") {

            @Override
            public Drawable call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().peekWallpaper(this);
                } else {
                    return getOriginal().super_peekWallpaper();
                }
            }
        };
        return superCall.call();
    }

    public void postponeEnterTransition() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_postponeEnterTransition();
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "postponeEnterTransition()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().postponeEnterTransition(this);
                    return null;
                } else {
                    getOriginal().super_postponeEnterTransition();
                    return null;
                }
            }
        };
        superCall.call();
    }

    public void recreate() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_recreate();
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("recreate()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().recreate(this);
                    return null;
                } else {
                    getOriginal().super_recreate();
                    return null;
                }
            }
        };
        superCall.call();
    }

    public void registerComponentCallbacks(final ComponentCallbacks callback) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_registerComponentCallbacks(callback);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "registerComponentCallbacks(ComponentCallbacks)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .registerComponentCallbacks(this, (ComponentCallbacks) args[0]);
                    return null;
                } else {
                    getOriginal().super_registerComponentCallbacks((ComponentCallbacks) args[0]);
                    return null;
                }
            }
        };
        superCall.call(callback);
    }

    public void registerForContextMenu(final View view) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_registerForContextMenu(view);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "registerForContextMenu(View)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().registerForContextMenu(this, (View) args[0]);
                    return null;
                } else {
                    getOriginal().super_registerForContextMenu((View) args[0]);
                    return null;
                }
            }
        };
        superCall.call(view);
    }

    public Intent registerReceiver(final BroadcastReceiver receiver, final IntentFilter filter) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_registerReceiver(receiver, filter);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Intent> superCall = new NamedSuperCall<Intent>(
                "registerReceiver(BroadcastReceiver, IntentFilter)") {

            @Override
            public Intent call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().registerReceiver(this, (BroadcastReceiver) args[0],
                            (IntentFilter) args[1]);
                } else {
                    return getOriginal().super_registerReceiver((BroadcastReceiver) args[0],
                            (IntentFilter) args[1]);
                }
            }
        };
        return superCall.call(receiver, filter);
    }

    public Intent registerReceiver(final BroadcastReceiver receiver, final IntentFilter filter,
            final String broadcastPermission, final Handler scheduler) {
        if (mPlugins.isEmpty()) {
            return getOriginal()
                    .super_registerReceiver(receiver, filter, broadcastPermission, scheduler);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Intent> superCall = new NamedSuperCall<Intent>(
                "registerReceiver(BroadcastReceiver, IntentFilter, String, Handler)") {

            @Override
            public Intent call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().registerReceiver(this, (BroadcastReceiver) args[0],
                            (IntentFilter) args[1], (String) args[2], (Handler) args[3]);
                } else {
                    return getOriginal().super_registerReceiver((BroadcastReceiver) args[0],
                            (IntentFilter) args[1], (String) args[2], (Handler) args[3]);
                }
            }
        };
        return superCall.call(receiver, filter, broadcastPermission, scheduler);
    }

    public boolean releaseInstance() {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_releaseInstance();
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>("releaseInstance()") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().releaseInstance(this);
                } else {
                    return getOriginal().super_releaseInstance();
                }
            }
        };
        return superCall.call();
    }

    public void removeStickyBroadcast(final Intent intent) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_removeStickyBroadcast(intent);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "removeStickyBroadcast(Intent)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().removeStickyBroadcast(this, (Intent) args[0]);
                    return null;
                } else {
                    getOriginal().super_removeStickyBroadcast((Intent) args[0]);
                    return null;
                }
            }
        };
        superCall.call(intent);
    }

    public void removeStickyBroadcastAsUser(final Intent intent, final UserHandle user) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_removeStickyBroadcastAsUser(intent, user);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "removeStickyBroadcastAsUser(Intent, UserHandle)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().removeStickyBroadcastAsUser(this, (Intent) args[0],
                            (UserHandle) args[1]);
                    return null;
                } else {
                    getOriginal().super_removeStickyBroadcastAsUser((Intent) args[0],
                            (UserHandle) args[1]);
                    return null;
                }
            }
        };
        superCall.call(intent, user);
    }

    public void reportFullyDrawn() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_reportFullyDrawn();
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("reportFullyDrawn()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().reportFullyDrawn(this);
                    return null;
                } else {
                    getOriginal().super_reportFullyDrawn();
                    return null;
                }
            }
        };
        superCall.call();
    }

    public boolean requestVisibleBehind(final boolean visible) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_requestVisibleBehind(visible);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "requestVisibleBehind(boolean)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().requestVisibleBehind(this, (boolean) args[0]);
                } else {
                    return getOriginal().super_requestVisibleBehind((boolean) args[0]);
                }
            }
        };
        return superCall.call(visible);
    }

    public void revokeUriPermission(final Uri uri, final int modeFlags) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_revokeUriPermission(uri, modeFlags);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "revokeUriPermission(Uri, int)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().revokeUriPermission(this, (Uri) args[0], (int) args[1]);
                    return null;
                } else {
                    getOriginal().super_revokeUriPermission((Uri) args[0], (int) args[1]);
                    return null;
                }
            }
        };
        superCall.call(uri, modeFlags);
    }

    public void sendBroadcast(final Intent intent) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_sendBroadcast(intent);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("sendBroadcast(Intent)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().sendBroadcast(this, (Intent) args[0]);
                    return null;
                } else {
                    getOriginal().super_sendBroadcast((Intent) args[0]);
                    return null;
                }
            }
        };
        superCall.call(intent);
    }

    public void sendBroadcast(final Intent intent, final String receiverPermission) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_sendBroadcast(intent, receiverPermission);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "sendBroadcast(Intent, String)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().sendBroadcast(this, (Intent) args[0], (String) args[1]);
                    return null;
                } else {
                    getOriginal().super_sendBroadcast((Intent) args[0], (String) args[1]);
                    return null;
                }
            }
        };
        superCall.call(intent, receiverPermission);
    }

    public void sendBroadcastAsUser(final Intent intent, final UserHandle user) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_sendBroadcastAsUser(intent, user);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "sendBroadcastAsUser(Intent, UserHandle)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .sendBroadcastAsUser(this, (Intent) args[0], (UserHandle) args[1]);
                    return null;
                } else {
                    getOriginal().super_sendBroadcastAsUser((Intent) args[0], (UserHandle) args[1]);
                    return null;
                }
            }
        };
        superCall.call(intent, user);
    }

    public void sendBroadcastAsUser(final Intent intent, final UserHandle user,
            final String receiverPermission) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_sendBroadcastAsUser(intent, user, receiverPermission);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "sendBroadcastAsUser(Intent, UserHandle, String)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .sendBroadcastAsUser(this, (Intent) args[0], (UserHandle) args[1],
                                    (String) args[2]);
                    return null;
                } else {
                    getOriginal().super_sendBroadcastAsUser((Intent) args[0], (UserHandle) args[1],
                            (String) args[2]);
                    return null;
                }
            }
        };
        superCall.call(intent, user, receiverPermission);
    }

    public void sendOrderedBroadcast(final Intent intent, final String receiverPermission) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_sendOrderedBroadcast(intent, receiverPermission);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "sendOrderedBroadcast(Intent, String)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .sendOrderedBroadcast(this, (Intent) args[0], (String) args[1]);
                    return null;
                } else {
                    getOriginal().super_sendOrderedBroadcast((Intent) args[0], (String) args[1]);
                    return null;
                }
            }
        };
        superCall.call(intent, receiverPermission);
    }

    public void sendOrderedBroadcast(final Intent intent, final String receiverPermission,
            final BroadcastReceiver resultReceiver, final Handler scheduler, final int initialCode,
            final String initialData, final Bundle initialExtras) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_sendOrderedBroadcast(intent, receiverPermission, resultReceiver,
                    scheduler, initialCode, initialData, initialExtras);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "sendOrderedBroadcast(Intent, String, BroadcastReceiver, Handler, int, String, Bundle)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .sendOrderedBroadcast(this, (Intent) args[0], (String) args[1],
                                    (BroadcastReceiver) args[2], (Handler) args[3], (int) args[4],
                                    (String) args[5], (Bundle) args[6]);
                    return null;
                } else {
                    getOriginal().super_sendOrderedBroadcast((Intent) args[0], (String) args[1],
                            (BroadcastReceiver) args[2], (Handler) args[3], (int) args[4],
                            (String) args[5], (Bundle) args[6]);
                    return null;
                }
            }
        };
        superCall.call(intent, receiverPermission, resultReceiver, scheduler, initialCode,
                initialData, initialExtras);
    }

    public void sendOrderedBroadcastAsUser(final Intent intent, final UserHandle user,
            final String receiverPermission, final BroadcastReceiver resultReceiver,
            final Handler scheduler, final int initialCode, final String initialData,
            final Bundle initialExtras) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_sendOrderedBroadcastAsUser(intent, user, receiverPermission,
                    resultReceiver, scheduler, initialCode, initialData, initialExtras);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "sendOrderedBroadcastAsUser(Intent, UserHandle, String, BroadcastReceiver, Handler, int, String, Bundle)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().sendOrderedBroadcastAsUser(this, (Intent) args[0],
                            (UserHandle) args[1], (String) args[2], (BroadcastReceiver) args[3],
                            (Handler) args[4], (int) args[5], (String) args[6], (Bundle) args[7]);
                    return null;
                } else {
                    getOriginal().super_sendOrderedBroadcastAsUser((Intent) args[0],
                            (UserHandle) args[1], (String) args[2], (BroadcastReceiver) args[3],
                            (Handler) args[4], (int) args[5], (String) args[6], (Bundle) args[7]);
                    return null;
                }
            }
        };
        superCall.call(intent, user, receiverPermission, resultReceiver, scheduler, initialCode,
                initialData, initialExtras);
    }

    public void sendStickyBroadcast(final Intent intent) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_sendStickyBroadcast(intent);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "sendStickyBroadcast(Intent)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().sendStickyBroadcast(this, (Intent) args[0]);
                    return null;
                } else {
                    getOriginal().super_sendStickyBroadcast((Intent) args[0]);
                    return null;
                }
            }
        };
        superCall.call(intent);
    }

    public void sendStickyBroadcastAsUser(final Intent intent, final UserHandle user) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_sendStickyBroadcastAsUser(intent, user);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "sendStickyBroadcastAsUser(Intent, UserHandle)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().sendStickyBroadcastAsUser(this, (Intent) args[0],
                            (UserHandle) args[1]);
                    return null;
                } else {
                    getOriginal().super_sendStickyBroadcastAsUser((Intent) args[0],
                            (UserHandle) args[1]);
                    return null;
                }
            }
        };
        superCall.call(intent, user);
    }

    public void sendStickyOrderedBroadcast(final Intent intent,
            final BroadcastReceiver resultReceiver, final Handler scheduler, final int initialCode,
            final String initialData, final Bundle initialExtras) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_sendStickyOrderedBroadcast(intent, resultReceiver, scheduler,
                    initialCode, initialData, initialExtras);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "sendStickyOrderedBroadcast(Intent, BroadcastReceiver, Handler, int, String, Bundle)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().sendStickyOrderedBroadcast(this, (Intent) args[0],
                            (BroadcastReceiver) args[1], (Handler) args[2], (int) args[3],
                            (String) args[4], (Bundle) args[5]);
                    return null;
                } else {
                    getOriginal().super_sendStickyOrderedBroadcast((Intent) args[0],
                            (BroadcastReceiver) args[1], (Handler) args[2], (int) args[3],
                            (String) args[4], (Bundle) args[5]);
                    return null;
                }
            }
        };
        superCall.call(intent, resultReceiver, scheduler, initialCode, initialData, initialExtras);
    }

    public void sendStickyOrderedBroadcastAsUser(final Intent intent, final UserHandle user,
            final BroadcastReceiver resultReceiver, final Handler scheduler, final int initialCode,
            final String initialData, final Bundle initialExtras) {
        if (mPlugins.isEmpty()) {
            getOriginal()
                    .super_sendStickyOrderedBroadcastAsUser(intent, user, resultReceiver, scheduler,
                            initialCode, initialData, initialExtras);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "sendStickyOrderedBroadcastAsUser(Intent, UserHandle, BroadcastReceiver, Handler, int, String, Bundle)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().sendStickyOrderedBroadcastAsUser(this, (Intent) args[0],
                            (UserHandle) args[1], (BroadcastReceiver) args[2], (Handler) args[3],
                            (int) args[4], (String) args[5], (Bundle) args[6]);
                    return null;
                } else {
                    getOriginal().super_sendStickyOrderedBroadcastAsUser((Intent) args[0],
                            (UserHandle) args[1], (BroadcastReceiver) args[2], (Handler) args[3],
                            (int) args[4], (String) args[5], (Bundle) args[6]);
                    return null;
                }
            }
        };
        superCall.call(intent, user, resultReceiver, scheduler, initialCode, initialData,
                initialExtras);
    }

    public void setActionBar(final Toolbar toolbar) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setActionBar(toolbar);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("setActionBar(Toolbar)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setActionBar(this, (Toolbar) args[0]);
                    return null;
                } else {
                    getOriginal().super_setActionBar((Toolbar) args[0]);
                    return null;
                }
            }
        };
        superCall.call(toolbar);
    }

    public void setContentTransitionManager(final TransitionManager tm) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setContentTransitionManager(tm);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "setContentTransitionManager(TransitionManager)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .setContentTransitionManager(this, (TransitionManager) args[0]);
                    return null;
                } else {
                    getOriginal().super_setContentTransitionManager((TransitionManager) args[0]);
                    return null;
                }
            }
        };
        superCall.call(tm);
    }

    public void setContentView(@LayoutRes final int layoutResID) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setContentView(layoutResID);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("setContentView(int)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setContentView(this, (int) args[0]);
                    return null;
                } else {
                    getOriginal().super_setContentView((int) args[0]);
                    return null;
                }
            }
        };
        superCall.call(layoutResID);
    }

    public void setContentView(final View view) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setContentView(view);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("setContentView(View)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setContentView(this, (View) args[0]);
                    return null;
                } else {
                    getOriginal().super_setContentView((View) args[0]);
                    return null;
                }
            }
        };
        superCall.call(view);
    }

    public void setContentView(final View view, final ViewGroup.LayoutParams params) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setContentView(view, params);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "setContentView(View, ViewGroup.LayoutParams)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .setContentView(this, (View) args[0], (ViewGroup.LayoutParams) args[1]);
                    return null;
                } else {
                    getOriginal()
                            .super_setContentView((View) args[0], (ViewGroup.LayoutParams) args[1]);
                    return null;
                }
            }
        };
        superCall.call(view, params);
    }

    public void setEnterSharedElementCallback(final SharedElementCallback callback) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setEnterSharedElementCallback(callback);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "setEnterSharedElementCallback(SharedElementCallback)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .setEnterSharedElementCallback(this, (SharedElementCallback) args[0]);
                    return null;
                } else {
                    getOriginal()
                            .super_setEnterSharedElementCallback((SharedElementCallback) args[0]);
                    return null;
                }
            }
        };
        superCall.call(callback);
    }

    public void setEnterSharedElementCallback(final android.app.SharedElementCallback callback) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setEnterSharedElementCallback(callback);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "setEnterSharedElementCallback(android.app.SharedElementCallback)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setEnterSharedElementCallback(this,
                            (android.app.SharedElementCallback) args[0]);
                    return null;
                } else {
                    getOriginal().super_setEnterSharedElementCallback(
                            (android.app.SharedElementCallback) args[0]);
                    return null;
                }
            }
        };
        superCall.call(callback);
    }

    public void setExitSharedElementCallback(final SharedElementCallback listener) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setExitSharedElementCallback(listener);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "setExitSharedElementCallback(SharedElementCallback)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .setExitSharedElementCallback(this, (SharedElementCallback) args[0]);
                    return null;
                } else {
                    getOriginal()
                            .super_setExitSharedElementCallback((SharedElementCallback) args[0]);
                    return null;
                }
            }
        };
        superCall.call(listener);
    }

    public void setExitSharedElementCallback(final android.app.SharedElementCallback callback) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setExitSharedElementCallback(callback);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "setExitSharedElementCallback(android.app.SharedElementCallback)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setExitSharedElementCallback(this,
                            (android.app.SharedElementCallback) args[0]);
                    return null;
                } else {
                    getOriginal().super_setExitSharedElementCallback(
                            (android.app.SharedElementCallback) args[0]);
                    return null;
                }
            }
        };
        superCall.call(callback);
    }

    public void setFinishOnTouchOutside(final boolean finish) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setFinishOnTouchOutside(finish);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "setFinishOnTouchOutside(boolean)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setFinishOnTouchOutside(this, (boolean) args[0]);
                    return null;
                } else {
                    getOriginal().super_setFinishOnTouchOutside((boolean) args[0]);
                    return null;
                }
            }
        };
        superCall.call(finish);
    }

    public void setImmersive(final boolean i) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setImmersive(i);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("setImmersive(boolean)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setImmersive(this, (boolean) args[0]);
                    return null;
                } else {
                    getOriginal().super_setImmersive((boolean) args[0]);
                    return null;
                }
            }
        };
        superCall.call(i);
    }

    public void setIntent(final Intent newIntent) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setIntent(newIntent);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("setIntent(Intent)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setIntent(this, (Intent) args[0]);
                    return null;
                } else {
                    getOriginal().super_setIntent((Intent) args[0]);
                    return null;
                }
            }
        };
        superCall.call(newIntent);
    }

    public void setRequestedOrientation(final int requestedOrientation) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setRequestedOrientation(requestedOrientation);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "setRequestedOrientation(int)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setRequestedOrientation(this, (int) args[0]);
                    return null;
                } else {
                    getOriginal().super_setRequestedOrientation((int) args[0]);
                    return null;
                }
            }
        };
        superCall.call(requestedOrientation);
    }

    public void setSupportActionBar(@Nullable final android.support.v7.widget.Toolbar toolbar) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setSupportActionBar(toolbar);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "setSupportActionBar(android.support.v7.widget.Toolbar)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .setSupportActionBar(this, (android.support.v7.widget.Toolbar) args[0]);
                    return null;
                } else {
                    getOriginal()
                            .super_setSupportActionBar((android.support.v7.widget.Toolbar) args[0]);
                    return null;
                }
            }
        };
        superCall.call(toolbar);
    }

    public void setSupportProgress(final int progress) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setSupportProgress(progress);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("setSupportProgress(int)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setSupportProgress(this, (int) args[0]);
                    return null;
                } else {
                    getOriginal().super_setSupportProgress((int) args[0]);
                    return null;
                }
            }
        };
        superCall.call(progress);
    }

    public void setSupportProgressBarIndeterminate(final boolean indeterminate) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setSupportProgressBarIndeterminate(indeterminate);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "setSupportProgressBarIndeterminate(boolean)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setSupportProgressBarIndeterminate(this, (boolean) args[0]);
                    return null;
                } else {
                    getOriginal().super_setSupportProgressBarIndeterminate((boolean) args[0]);
                    return null;
                }
            }
        };
        superCall.call(indeterminate);
    }

    public void setSupportProgressBarIndeterminateVisibility(final boolean visible) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setSupportProgressBarIndeterminateVisibility(visible);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "setSupportProgressBarIndeterminateVisibility(boolean)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .setSupportProgressBarIndeterminateVisibility(this, (boolean) args[0]);
                    return null;
                } else {
                    getOriginal()
                            .super_setSupportProgressBarIndeterminateVisibility((boolean) args[0]);
                    return null;
                }
            }
        };
        superCall.call(visible);
    }

    public void setSupportProgressBarVisibility(final boolean visible) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setSupportProgressBarVisibility(visible);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "setSupportProgressBarVisibility(boolean)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setSupportProgressBarVisibility(this, (boolean) args[0]);
                    return null;
                } else {
                    getOriginal().super_setSupportProgressBarVisibility((boolean) args[0]);
                    return null;
                }
            }
        };
        superCall.call(visible);
    }

    public void setTaskDescription(final ActivityManager.TaskDescription taskDescription) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setTaskDescription(taskDescription);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "setTaskDescription(ActivityManager.TaskDescription)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .setTaskDescription(this, (ActivityManager.TaskDescription) args[0]);
                    return null;
                } else {
                    getOriginal()
                            .super_setTaskDescription((ActivityManager.TaskDescription) args[0]);
                    return null;
                }
            }
        };
        superCall.call(taskDescription);
    }

    public void setTheme(@StyleRes final int resid) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setTheme(resid);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("setTheme(int)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setTheme(this, (int) args[0]);
                    return null;
                } else {
                    getOriginal().super_setTheme((int) args[0]);
                    return null;
                }
            }
        };
        superCall.call(resid);
    }

    public void setTitle(final CharSequence title) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setTitle(title);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("setTitle(CharSequence)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setTitle(this, (CharSequence) args[0]);
                    return null;
                } else {
                    getOriginal().super_setTitle((CharSequence) args[0]);
                    return null;
                }
            }
        };
        superCall.call(title);
    }

    public void setTitle(final int titleId) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setTitle(titleId);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("setTitle(int)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setTitle(this, (int) args[0]);
                    return null;
                } else {
                    getOriginal().super_setTitle((int) args[0]);
                    return null;
                }
            }
        };
        superCall.call(titleId);
    }

    public void setTitleColor(final int textColor) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setTitleColor(textColor);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("setTitleColor(int)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setTitleColor(this, (int) args[0]);
                    return null;
                } else {
                    getOriginal().super_setTitleColor((int) args[0]);
                    return null;
                }
            }
        };
        superCall.call(textColor);
    }

    public void setVisible(final boolean visible) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_setVisible(visible);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("setVisible(boolean)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().setVisible(this, (boolean) args[0]);
                    return null;
                } else {
                    getOriginal().super_setVisible((boolean) args[0]);
                    return null;
                }
            }
        };
        superCall.call(visible);
    }

    public void setWallpaper(final Bitmap bitmap) throws IOException {
        if (mPlugins.isEmpty()) {
            try {
                getOriginal().super_setWallpaper(bitmap);
            } catch (IOException e) {
                throw new SuppressedException(e);
            }
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("setWallpaper(Bitmap)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    try {
                        iterator.previous().setWallpaper(this, (Bitmap) args[0]);
                        return null;
                    } catch (IOException e) {
                        throw new SuppressedException(e);
                    }
                } else {
                    try {
                        getOriginal().super_setWallpaper((Bitmap) args[0]);
                        return null;
                    } catch (IOException e) {
                        throw new SuppressedException(e);
                    }
                }
            }
        };
        superCall.call(bitmap);
    }

    public void setWallpaper(final InputStream data) throws IOException {
        if (mPlugins.isEmpty()) {
            try {
                getOriginal().super_setWallpaper(data);
            } catch (IOException e) {
                throw new SuppressedException(e);
            }
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "setWallpaper(InputStream)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    try {
                        iterator.previous().setWallpaper(this, (InputStream) args[0]);
                        return null;
                    } catch (IOException e) {
                        throw new SuppressedException(e);
                    }
                } else {
                    try {
                        getOriginal().super_setWallpaper((InputStream) args[0]);
                        return null;
                    } catch (IOException e) {
                        throw new SuppressedException(e);
                    }
                }
            }
        };
        superCall.call(data);
    }

    public boolean shouldShowRequestPermissionRationale(final String permission) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_shouldShowRequestPermissionRationale(permission);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "shouldShowRequestPermissionRationale(String)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .shouldShowRequestPermissionRationale(this, (String) args[0]);
                } else {
                    return getOriginal()
                            .super_shouldShowRequestPermissionRationale((String) args[0]);
                }
            }
        };
        return superCall.call(permission);
    }

    public boolean shouldUpRecreateTask(final Intent targetIntent) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_shouldUpRecreateTask(targetIntent);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "shouldUpRecreateTask(Intent)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().shouldUpRecreateTask(this, (Intent) args[0]);
                } else {
                    return getOriginal().super_shouldUpRecreateTask((Intent) args[0]);
                }
            }
        };
        return superCall.call(targetIntent);
    }

    public boolean showAssist(final Bundle args) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_showAssist(args);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "showAssist(Bundle)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().showAssist(this, (Bundle) args[0]);
                } else {
                    return getOriginal().super_showAssist((Bundle) args[0]);
                }
            }
        };
        return superCall.call(args);
    }

    public void showLockTaskEscapeMessage() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_showLockTaskEscapeMessage();
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "showLockTaskEscapeMessage()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().showLockTaskEscapeMessage(this);
                    return null;
                } else {
                    getOriginal().super_showLockTaskEscapeMessage();
                    return null;
                }
            }
        };
        superCall.call();
    }

    public android.view.ActionMode startActionMode(
            final android.view.ActionMode.Callback callback) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_startActionMode(callback);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<android.view.ActionMode> superCall
                = new NamedSuperCall<android.view.ActionMode>(
                "startActionMode(android.view.ActionMode.Callback)") {

            @Override
            public android.view.ActionMode call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .startActionMode(this, (android.view.ActionMode.Callback) args[0]);
                } else {
                    return getOriginal()
                            .super_startActionMode((android.view.ActionMode.Callback) args[0]);
                }
            }
        };
        return superCall.call(callback);
    }

    public android.view.ActionMode startActionMode(final android.view.ActionMode.Callback callback,
            final int type) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_startActionMode(callback, type);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<android.view.ActionMode> superCall
                = new NamedSuperCall<android.view.ActionMode>(
                "startActionMode(android.view.ActionMode.Callback, int)") {

            @Override
            public android.view.ActionMode call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .startActionMode(this, (android.view.ActionMode.Callback) args[0],
                                    (int) args[1]);
                } else {
                    return getOriginal()
                            .super_startActionMode((android.view.ActionMode.Callback) args[0],
                                    (int) args[1]);
                }
            }
        };
        return superCall.call(callback, type);
    }

    public void startActivities(final Intent[] intents) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_startActivities(intents);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "startActivities(Intent[])") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().startActivities(this, (Intent[]) args[0]);
                    return null;
                } else {
                    getOriginal().super_startActivities((Intent[]) args[0]);
                    return null;
                }
            }
        };
        superCall.call(intents);
    }

    public void startActivities(final Intent[] intents, final Bundle options) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_startActivities(intents, options);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "startActivities(Intent[], Bundle)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().startActivities(this, (Intent[]) args[0], (Bundle) args[1]);
                    return null;
                } else {
                    getOriginal().super_startActivities((Intent[]) args[0], (Bundle) args[1]);
                    return null;
                }
            }
        };
        superCall.call(intents, options);
    }

    public void startActivity(final Intent intent) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_startActivity(intent);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("startActivity(Intent)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().startActivity(this, (Intent) args[0]);
                    return null;
                } else {
                    getOriginal().super_startActivity((Intent) args[0]);
                    return null;
                }
            }
        };
        superCall.call(intent);
    }

    public void startActivity(final Intent intent, final Bundle options) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_startActivity(intent, options);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "startActivity(Intent, Bundle)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().startActivity(this, (Intent) args[0], (Bundle) args[1]);
                    return null;
                } else {
                    getOriginal().super_startActivity((Intent) args[0], (Bundle) args[1]);
                    return null;
                }
            }
        };
        superCall.call(intent, options);
    }

    public void startActivityForResult(final Intent intent, final int requestCode) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_startActivityForResult(intent, requestCode);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "startActivityForResult(Intent, int)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .startActivityForResult(this, (Intent) args[0], (int) args[1]);
                    return null;
                } else {
                    getOriginal().super_startActivityForResult((Intent) args[0], (int) args[1]);
                    return null;
                }
            }
        };
        superCall.call(intent, requestCode);
    }

    public void startActivityForResult(final Intent intent, final int requestCode,
            final Bundle options) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_startActivityForResult(intent, requestCode, options);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "startActivityForResult(Intent, int, Bundle)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .startActivityForResult(this, (Intent) args[0], (int) args[1],
                                    (Bundle) args[2]);
                    return null;
                } else {
                    getOriginal().super_startActivityForResult((Intent) args[0], (int) args[1],
                            (Bundle) args[2]);
                    return null;
                }
            }
        };
        superCall.call(intent, requestCode, options);
    }

    public void startActivityFromChild(final Activity child, final Intent intent,
            final int requestCode) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_startActivityFromChild(child, intent, requestCode);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "startActivityFromChild(Activity, Intent, int)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .startActivityFromChild(this, (Activity) args[0], (Intent) args[1],
                                    (int) args[2]);
                    return null;
                } else {
                    getOriginal().super_startActivityFromChild((Activity) args[0], (Intent) args[1],
                            (int) args[2]);
                    return null;
                }
            }
        };
        superCall.call(child, intent, requestCode);
    }

    public void startActivityFromChild(final Activity child, final Intent intent,
            final int requestCode, final Bundle options) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_startActivityFromChild(child, intent, requestCode, options);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "startActivityFromChild(Activity, Intent, int, Bundle)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .startActivityFromChild(this, (Activity) args[0], (Intent) args[1],
                                    (int) args[2], (Bundle) args[3]);
                    return null;
                } else {
                    getOriginal().super_startActivityFromChild((Activity) args[0], (Intent) args[1],
                            (int) args[2], (Bundle) args[3]);
                    return null;
                }
            }
        };
        superCall.call(child, intent, requestCode, options);
    }

    public void startActivityFromFragment(final Fragment fragment, final Intent intent,
            final int requestCode) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_startActivityFromFragment(fragment, intent, requestCode);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "startActivityFromFragment(Fragment, Intent, int)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .startActivityFromFragment(this, (Fragment) args[0], (Intent) args[1],
                                    (int) args[2]);
                    return null;
                } else {
                    getOriginal()
                            .super_startActivityFromFragment((Fragment) args[0], (Intent) args[1],
                                    (int) args[2]);
                    return null;
                }
            }
        };
        superCall.call(fragment, intent, requestCode);
    }

    public void startActivityFromFragment(final Fragment fragment, final Intent intent,
            final int requestCode, @Nullable final Bundle options) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_startActivityFromFragment(fragment, intent, requestCode, options);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "startActivityFromFragment(Fragment, Intent, int, Bundle)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .startActivityFromFragment(this, (Fragment) args[0], (Intent) args[1],
                                    (int) args[2], (Bundle) args[3]);
                    return null;
                } else {
                    getOriginal()
                            .super_startActivityFromFragment((Fragment) args[0], (Intent) args[1],
                                    (int) args[2], (Bundle) args[3]);
                    return null;
                }
            }
        };
        superCall.call(fragment, intent, requestCode, options);
    }

    public void startActivityFromFragment(final android.app.Fragment fragment, final Intent intent,
            final int requestCode) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_startActivityFromFragment(fragment, intent, requestCode);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "startActivityFromFragment(android.app.Fragment, Intent, int)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .startActivityFromFragment(this, (android.app.Fragment) args[0],
                                    (Intent) args[1], (int) args[2]);
                    return null;
                } else {
                    getOriginal().super_startActivityFromFragment((android.app.Fragment) args[0],
                            (Intent) args[1], (int) args[2]);
                    return null;
                }
            }
        };
        superCall.call(fragment, intent, requestCode);
    }

    public void startActivityFromFragment(final android.app.Fragment fragment, final Intent intent,
            final int requestCode, final Bundle options) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_startActivityFromFragment(fragment, intent, requestCode, options);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "startActivityFromFragment(android.app.Fragment, Intent, int, Bundle)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .startActivityFromFragment(this, (android.app.Fragment) args[0],
                                    (Intent) args[1], (int) args[2], (Bundle) args[3]);
                    return null;
                } else {
                    getOriginal().super_startActivityFromFragment((android.app.Fragment) args[0],
                            (Intent) args[1], (int) args[2], (Bundle) args[3]);
                    return null;
                }
            }
        };
        superCall.call(fragment, intent, requestCode, options);
    }

    public boolean startActivityIfNeeded(final Intent intent, final int requestCode) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_startActivityIfNeeded(intent, requestCode);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "startActivityIfNeeded(Intent, int)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .startActivityIfNeeded(this, (Intent) args[0], (int) args[1]);
                } else {
                    return getOriginal()
                            .super_startActivityIfNeeded((Intent) args[0], (int) args[1]);
                }
            }
        };
        return superCall.call(intent, requestCode);
    }

    public boolean startActivityIfNeeded(final Intent intent, final int requestCode,
            final Bundle options) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_startActivityIfNeeded(intent, requestCode, options);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "startActivityIfNeeded(Intent, int, Bundle)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .startActivityIfNeeded(this, (Intent) args[0], (int) args[1],
                                    (Bundle) args[2]);
                } else {
                    return getOriginal()
                            .super_startActivityIfNeeded((Intent) args[0], (int) args[1],
                                    (Bundle) args[2]);
                }
            }
        };
        return superCall.call(intent, requestCode, options);
    }

    public boolean startInstrumentation(final ComponentName className, final String profileFile,
            final Bundle arguments) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_startInstrumentation(className, profileFile, arguments);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "startInstrumentation(ComponentName, String, Bundle)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .startInstrumentation(this, (ComponentName) args[0], (String) args[1],
                                    (Bundle) args[2]);
                } else {
                    return getOriginal()
                            .super_startInstrumentation((ComponentName) args[0], (String) args[1],
                                    (Bundle) args[2]);
                }
            }
        };
        return superCall.call(className, profileFile, arguments);
    }

    public void startIntentSender(final IntentSender intent, final Intent fillInIntent,
            final int flagsMask, final int flagsValues, final int extraFlags)
            throws IntentSender.SendIntentException {
        if (mPlugins.isEmpty()) {
            try {
                getOriginal().super_startIntentSender(intent, fillInIntent, flagsMask, flagsValues,
                        extraFlags);
            } catch (IntentSender.SendIntentException e) {
                throw new SuppressedException(e);
            }
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "startIntentSender(IntentSender, Intent, int, int, int)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    try {
                        iterator.previous()
                                .startIntentSender(this, (IntentSender) args[0], (Intent) args[1],
                                        (int) args[2], (int) args[3], (int) args[4]);
                        return null;
                    } catch (IntentSender.SendIntentException e) {
                        throw new SuppressedException(e);
                    }
                } else {
                    try {
                        getOriginal()
                                .super_startIntentSender((IntentSender) args[0], (Intent) args[1],
                                        (int) args[2], (int) args[3], (int) args[4]);
                        return null;
                    } catch (IntentSender.SendIntentException e) {
                        throw new SuppressedException(e);
                    }
                }
            }
        };
        superCall.call(intent, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    public void startIntentSender(final IntentSender intent, final Intent fillInIntent,
            final int flagsMask, final int flagsValues, final int extraFlags, final Bundle options)
            throws IntentSender.SendIntentException {
        if (mPlugins.isEmpty()) {
            try {
                getOriginal().super_startIntentSender(intent, fillInIntent, flagsMask, flagsValues,
                        extraFlags, options);
            } catch (IntentSender.SendIntentException e) {
                throw new SuppressedException(e);
            }
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "startIntentSender(IntentSender, Intent, int, int, int, Bundle)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    try {
                        iterator.previous()
                                .startIntentSender(this, (IntentSender) args[0], (Intent) args[1],
                                        (int) args[2], (int) args[3], (int) args[4],
                                        (Bundle) args[5]);
                        return null;
                    } catch (IntentSender.SendIntentException e) {
                        throw new SuppressedException(e);
                    }
                } else {
                    try {
                        getOriginal()
                                .super_startIntentSender((IntentSender) args[0], (Intent) args[1],
                                        (int) args[2], (int) args[3], (int) args[4],
                                        (Bundle) args[5]);
                        return null;
                    } catch (IntentSender.SendIntentException e) {
                        throw new SuppressedException(e);
                    }
                }
            }
        };
        superCall.call(intent, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    public void startIntentSenderForResult(final IntentSender intent, final int requestCode,
            final Intent fillInIntent, final int flagsMask, final int flagsValues,
            final int extraFlags) throws IntentSender.SendIntentException {
        if (mPlugins.isEmpty()) {
            try {
                getOriginal().super_startIntentSenderForResult(intent, requestCode, fillInIntent,
                        flagsMask, flagsValues, extraFlags);
            } catch (IntentSender.SendIntentException e) {
                throw new SuppressedException(e);
            }
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "startIntentSenderForResult(IntentSender, int, Intent, int, int, int)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    try {
                        iterator.previous().startIntentSenderForResult(this, (IntentSender) args[0],
                                (int) args[1], (Intent) args[2], (int) args[3], (int) args[4],
                                (int) args[5]);
                        return null;
                    } catch (IntentSender.SendIntentException e) {
                        throw new SuppressedException(e);
                    }
                } else {
                    try {
                        getOriginal().super_startIntentSenderForResult((IntentSender) args[0],
                                (int) args[1], (Intent) args[2], (int) args[3], (int) args[4],
                                (int) args[5]);
                        return null;
                    } catch (IntentSender.SendIntentException e) {
                        throw new SuppressedException(e);
                    }
                }
            }
        };
        superCall.call(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    public void startIntentSenderForResult(final IntentSender intent, final int requestCode,
            final Intent fillInIntent, final int flagsMask, final int flagsValues,
            final int extraFlags, final Bundle options) throws IntentSender.SendIntentException {
        if (mPlugins.isEmpty()) {
            try {
                getOriginal().super_startIntentSenderForResult(intent, requestCode, fillInIntent,
                        flagsMask, flagsValues, extraFlags, options);
            } catch (IntentSender.SendIntentException e) {
                throw new SuppressedException(e);
            }
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "startIntentSenderForResult(IntentSender, int, Intent, int, int, int, Bundle)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    try {
                        iterator.previous().startIntentSenderForResult(this, (IntentSender) args[0],
                                (int) args[1], (Intent) args[2], (int) args[3], (int) args[4],
                                (int) args[5], (Bundle) args[6]);
                        return null;
                    } catch (IntentSender.SendIntentException e) {
                        throw new SuppressedException(e);
                    }
                } else {
                    try {
                        getOriginal().super_startIntentSenderForResult((IntentSender) args[0],
                                (int) args[1], (Intent) args[2], (int) args[3], (int) args[4],
                                (int) args[5], (Bundle) args[6]);
                        return null;
                    } catch (IntentSender.SendIntentException e) {
                        throw new SuppressedException(e);
                    }
                }
            }
        };
        superCall.call(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags,
                options);
    }

    public void startIntentSenderFromChild(final Activity child, final IntentSender intent,
            final int requestCode, final Intent fillInIntent, final int flagsMask,
            final int flagsValues, final int extraFlags) throws IntentSender.SendIntentException {
        if (mPlugins.isEmpty()) {
            try {
                getOriginal()
                        .super_startIntentSenderFromChild(child, intent, requestCode, fillInIntent,
                                flagsMask, flagsValues, extraFlags);
            } catch (IntentSender.SendIntentException e) {
                throw new SuppressedException(e);
            }
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "startIntentSenderFromChild(Activity, IntentSender, int, Intent, int, int, int)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    try {
                        iterator.previous().startIntentSenderFromChild(this, (Activity) args[0],
                                (IntentSender) args[1], (int) args[2], (Intent) args[3],
                                (int) args[4], (int) args[5], (int) args[6]);
                        return null;
                    } catch (IntentSender.SendIntentException e) {
                        throw new SuppressedException(e);
                    }
                } else {
                    try {
                        getOriginal().super_startIntentSenderFromChild((Activity) args[0],
                                (IntentSender) args[1], (int) args[2], (Intent) args[3],
                                (int) args[4], (int) args[5], (int) args[6]);
                        return null;
                    } catch (IntentSender.SendIntentException e) {
                        throw new SuppressedException(e);
                    }
                }
            }
        };
        superCall
                .call(child, intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    public void startIntentSenderFromChild(final Activity child, final IntentSender intent,
            final int requestCode, final Intent fillInIntent, final int flagsMask,
            final int flagsValues, final int extraFlags, final Bundle options)
            throws IntentSender.SendIntentException {
        if (mPlugins.isEmpty()) {
            try {
                getOriginal()
                        .super_startIntentSenderFromChild(child, intent, requestCode, fillInIntent,
                                flagsMask, flagsValues, extraFlags, options);
            } catch (IntentSender.SendIntentException e) {
                throw new SuppressedException(e);
            }
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "startIntentSenderFromChild(Activity, IntentSender, int, Intent, int, int, int, Bundle)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    try {
                        iterator.previous().startIntentSenderFromChild(this, (Activity) args[0],
                                (IntentSender) args[1], (int) args[2], (Intent) args[3],
                                (int) args[4], (int) args[5], (int) args[6], (Bundle) args[7]);
                        return null;
                    } catch (IntentSender.SendIntentException e) {
                        throw new SuppressedException(e);
                    }
                } else {
                    try {
                        getOriginal().super_startIntentSenderFromChild((Activity) args[0],
                                (IntentSender) args[1], (int) args[2], (Intent) args[3],
                                (int) args[4], (int) args[5], (int) args[6], (Bundle) args[7]);
                        return null;
                    } catch (IntentSender.SendIntentException e) {
                        throw new SuppressedException(e);
                    }
                }
            }
        };
        superCall.call(child, intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags,
                options);
    }

    public void startLockTask() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_startLockTask();
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("startLockTask()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().startLockTask(this);
                    return null;
                } else {
                    getOriginal().super_startLockTask();
                    return null;
                }
            }
        };
        superCall.call();
    }

    public void startManagingCursor(final Cursor c) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_startManagingCursor(c);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "startManagingCursor(Cursor)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().startManagingCursor(this, (Cursor) args[0]);
                    return null;
                } else {
                    getOriginal().super_startManagingCursor((Cursor) args[0]);
                    return null;
                }
            }
        };
        superCall.call(c);
    }

    public boolean startNextMatchingActivity(final Intent intent) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_startNextMatchingActivity(intent);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "startNextMatchingActivity(Intent)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().startNextMatchingActivity(this, (Intent) args[0]);
                } else {
                    return getOriginal().super_startNextMatchingActivity((Intent) args[0]);
                }
            }
        };
        return superCall.call(intent);
    }

    public boolean startNextMatchingActivity(final Intent intent, final Bundle options) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_startNextMatchingActivity(intent, options);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "startNextMatchingActivity(Intent, Bundle)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .startNextMatchingActivity(this, (Intent) args[0], (Bundle) args[1]);
                } else {
                    return getOriginal()
                            .super_startNextMatchingActivity((Intent) args[0], (Bundle) args[1]);
                }
            }
        };
        return superCall.call(intent, options);
    }

    public void startPostponedEnterTransition() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_startPostponedEnterTransition();
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "startPostponedEnterTransition()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().startPostponedEnterTransition(this);
                    return null;
                } else {
                    getOriginal().super_startPostponedEnterTransition();
                    return null;
                }
            }
        };
        superCall.call();
    }

    public void startSearch(final String initialQuery, final boolean selectInitialQuery,
            final Bundle appSearchData, final boolean globalSearch) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_startSearch(initialQuery, selectInitialQuery, appSearchData,
                    globalSearch);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "startSearch(String, boolean, Bundle, boolean)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().startSearch(this, (String) args[0], (boolean) args[1],
                            (Bundle) args[2], (boolean) args[3]);
                    return null;
                } else {
                    getOriginal().super_startSearch((String) args[0], (boolean) args[1],
                            (Bundle) args[2], (boolean) args[3]);
                    return null;
                }
            }
        };
        superCall.call(initialQuery, selectInitialQuery, appSearchData, globalSearch);
    }

    public ComponentName startService(final Intent service) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_startService(service);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<ComponentName> superCall = new NamedSuperCall<ComponentName>(
                "startService(Intent)") {

            @Override
            public ComponentName call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().startService(this, (Intent) args[0]);
                } else {
                    return getOriginal().super_startService((Intent) args[0]);
                }
            }
        };
        return superCall.call(service);
    }

    public ActionMode startSupportActionMode(@NonNull final ActionMode.Callback callback) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_startSupportActionMode(callback);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<ActionMode> superCall = new NamedSuperCall<ActionMode>(
                "startSupportActionMode(ActionMode.Callback)") {

            @Override
            public ActionMode call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous()
                            .startSupportActionMode(this, (ActionMode.Callback) args[0]);
                } else {
                    return getOriginal()
                            .super_startSupportActionMode((ActionMode.Callback) args[0]);
                }
            }
        };
        return superCall.call(callback);
    }

    public void stopLockTask() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_stopLockTask();
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("stopLockTask()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().stopLockTask(this);
                    return null;
                } else {
                    getOriginal().super_stopLockTask();
                    return null;
                }
            }
        };
        superCall.call();
    }

    public void stopManagingCursor(final Cursor c) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_stopManagingCursor(c);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "stopManagingCursor(Cursor)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().stopManagingCursor(this, (Cursor) args[0]);
                    return null;
                } else {
                    getOriginal().super_stopManagingCursor((Cursor) args[0]);
                    return null;
                }
            }
        };
        superCall.call(c);
    }

    public boolean stopService(final Intent name) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_stopService(name);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "stopService(Intent)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().stopService(this, (Intent) args[0]);
                } else {
                    return getOriginal().super_stopService((Intent) args[0]);
                }
            }
        };
        return superCall.call(name);
    }

    public void supportFinishAfterTransition() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_supportFinishAfterTransition();
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "supportFinishAfterTransition()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().supportFinishAfterTransition(this);
                    return null;
                } else {
                    getOriginal().super_supportFinishAfterTransition();
                    return null;
                }
            }
        };
        superCall.call();
    }

    public void supportInvalidateOptionsMenu() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_supportInvalidateOptionsMenu();
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "supportInvalidateOptionsMenu()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().supportInvalidateOptionsMenu(this);
                    return null;
                } else {
                    getOriginal().super_supportInvalidateOptionsMenu();
                    return null;
                }
            }
        };
        superCall.call();
    }

    public void supportNavigateUpTo(@NonNull final Intent upIntent) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_supportNavigateUpTo(upIntent);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "supportNavigateUpTo(Intent)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().supportNavigateUpTo(this, (Intent) args[0]);
                    return null;
                } else {
                    getOriginal().super_supportNavigateUpTo((Intent) args[0]);
                    return null;
                }
            }
        };
        superCall.call(upIntent);
    }

    public void supportPostponeEnterTransition() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_supportPostponeEnterTransition();
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "supportPostponeEnterTransition()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().supportPostponeEnterTransition(this);
                    return null;
                } else {
                    getOriginal().super_supportPostponeEnterTransition();
                    return null;
                }
            }
        };
        superCall.call();
    }

    public boolean supportRequestWindowFeature(final int featureId) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_supportRequestWindowFeature(featureId);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "supportRequestWindowFeature(int)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().supportRequestWindowFeature(this, (int) args[0]);
                } else {
                    return getOriginal().super_supportRequestWindowFeature((int) args[0]);
                }
            }
        };
        return superCall.call(featureId);
    }

    public boolean supportShouldUpRecreateTask(@NonNull final Intent targetIntent) {
        if (mPlugins.isEmpty()) {
            return getOriginal().super_supportShouldUpRecreateTask(targetIntent);
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Boolean> superCall = new NamedSuperCall<Boolean>(
                "supportShouldUpRecreateTask(Intent)") {

            @Override
            public Boolean call(final Object... args) {
                if (iterator.hasPrevious()) {
                    return iterator.previous().supportShouldUpRecreateTask(this, (Intent) args[0]);
                } else {
                    return getOriginal().super_supportShouldUpRecreateTask((Intent) args[0]);
                }
            }
        };
        return superCall.call(targetIntent);
    }

    public void supportStartPostponedEnterTransition() {
        if (mPlugins.isEmpty()) {
            getOriginal().super_supportStartPostponedEnterTransition();
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "supportStartPostponedEnterTransition()") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().supportStartPostponedEnterTransition(this);
                    return null;
                } else {
                    getOriginal().super_supportStartPostponedEnterTransition();
                    return null;
                }
            }
        };
        superCall.call();
    }

    public void takeKeyEvents(final boolean get) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_takeKeyEvents(get);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>("takeKeyEvents(boolean)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().takeKeyEvents(this, (boolean) args[0]);
                    return null;
                } else {
                    getOriginal().super_takeKeyEvents((boolean) args[0]);
                    return null;
                }
            }
        };
        superCall.call(get);
    }

    public void triggerSearch(final String query, final Bundle appSearchData) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_triggerSearch(query, appSearchData);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "triggerSearch(String, Bundle)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().triggerSearch(this, (String) args[0], (Bundle) args[1]);
                    return null;
                } else {
                    getOriginal().super_triggerSearch((String) args[0], (Bundle) args[1]);
                    return null;
                }
            }
        };
        superCall.call(query, appSearchData);
    }

    public void unbindService(final ServiceConnection conn) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_unbindService(conn);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "unbindService(ServiceConnection)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().unbindService(this, (ServiceConnection) args[0]);
                    return null;
                } else {
                    getOriginal().super_unbindService((ServiceConnection) args[0]);
                    return null;
                }
            }
        };
        superCall.call(conn);
    }

    public void unregisterComponentCallbacks(final ComponentCallbacks callback) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_unregisterComponentCallbacks(callback);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "unregisterComponentCallbacks(ComponentCallbacks)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                            .unregisterComponentCallbacks(this, (ComponentCallbacks) args[0]);
                    return null;
                } else {
                    getOriginal().super_unregisterComponentCallbacks((ComponentCallbacks) args[0]);
                    return null;
                }
            }
        };
        superCall.call(callback);
    }

    public void unregisterForContextMenu(final View view) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_unregisterForContextMenu(view);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "unregisterForContextMenu(View)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().unregisterForContextMenu(this, (View) args[0]);
                    return null;
                } else {
                    getOriginal().super_unregisterForContextMenu((View) args[0]);
                    return null;
                }
            }
        };
        superCall.call(view);
    }

    public void unregisterReceiver(final BroadcastReceiver receiver) {
        if (mPlugins.isEmpty()) {
            getOriginal().super_unregisterReceiver(receiver);
            return;
        }

        final ListIterator<ActivityPlugin> iterator = mPlugins.listIterator(mPlugins.size());

        final NamedSuperCall<Void> superCall = new NamedSuperCall<Void>(
                "unregisterReceiver(BroadcastReceiver)") {

            @Override
            public Void call(final Object... args) {
                if (iterator.hasPrevious()) {
                    iterator.previous().unregisterReceiver(this, (BroadcastReceiver) args[0]);
                    return null;
                } else {
                    getOriginal().super_unregisterReceiver((BroadcastReceiver) args[0]);
                    return null;
                }
            }
        };
        superCall.call(receiver);
    }

}