package com.pascalwelsch.compositeandroid.fragment;

import com.pascalwelsch.compositeandroid.core.AbstractDelegate;
import com.pascalwelsch.compositeandroid.core.NamedSuperCall;
import com.pascalwelsch.compositeandroid.core.PluginCall;
import com.pascalwelsch.compositeandroid.core.PluginCallVoid;
import com.pascalwelsch.compositeandroid.core.Removable;
import com.pascalwelsch.compositeandroid.core.SuperCall;
import com.pascalwelsch.compositeandroid.core.SuperCallVoid;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.LoaderManager;
import android.support.v4.app.SharedElementCallback;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

import java.io.FileDescriptor;
import java.io.PrintWriter;

public class DialogFragmentDelegate
        extends AbstractDelegate<ICompositeDialogFragment, DialogFragmentPlugin> {

    private final FragmentDelegate mFragmentDelegate;

    public DialogFragmentDelegate(final ICompositeDialogFragment icompositedialogfragment) {
        super(icompositedialogfragment);
        mFragmentDelegate = new FragmentDelegate(icompositedialogfragment);
    }

    public Removable addPlugin(final FragmentPlugin plugin) {
        return mFragmentDelegate.addPlugin(plugin);
    }

    @Override
    public Removable addPlugin(final DialogFragmentPlugin plugin) {
        final Removable removable = super.addPlugin(plugin);
        final Removable superRemovable = mFragmentDelegate.addPlugin(plugin);
        return new Removable() {
            @Override
            public void remove() {
                removable.remove();
                superRemovable.remove();
            }
        };
    }

    public void dismiss() {
        callHook("dismiss()", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.dismiss(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_dismiss();
            }
        });
    }

    public void dismissAllowingStateLoss() {
        callHook("dismissAllowingStateLoss()", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.dismissAllowingStateLoss(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_dismissAllowingStateLoss();
            }
        });
    }

    public void dump(final String prefix, final FileDescriptor fd, final PrintWriter writer,
            final String[] args) {
        mFragmentDelegate.dump(prefix, fd, writer, args);
    }

    public boolean getAllowEnterTransitionOverlap() {
        return mFragmentDelegate.getAllowEnterTransitionOverlap();
    }

    public boolean getAllowReturnTransitionOverlap() {
        return mFragmentDelegate.getAllowReturnTransitionOverlap();
    }

    public Context getContext() {
        return mFragmentDelegate.getContext();
    }

    public Dialog getDialog() {
        return callFunction("getDialog()", new PluginCall<DialogFragmentPlugin, Dialog>() {
            @Override
            public Dialog call(final NamedSuperCall<Dialog> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {

                return plugin.getDialog(superCall);

            }
        }, new SuperCall<Dialog>() {
            @Override
            public Dialog call(final Object... args) {
                return getOriginal().super_getDialog();
            }
        });
    }

    public Object getEnterTransition() {
        return mFragmentDelegate.getEnterTransition();
    }

    public Object getExitTransition() {
        return mFragmentDelegate.getExitTransition();
    }

    public LayoutInflater getLayoutInflater(final Bundle savedInstanceState) {
        return mFragmentDelegate.getLayoutInflater(savedInstanceState);
    }

    public LoaderManager getLoaderManager() {
        return mFragmentDelegate.getLoaderManager();
    }

    public Object getReenterTransition() {
        return mFragmentDelegate.getReenterTransition();
    }

    public Object getReturnTransition() {
        return mFragmentDelegate.getReturnTransition();
    }

    public Object getSharedElementEnterTransition() {
        return mFragmentDelegate.getSharedElementEnterTransition();
    }

    public Object getSharedElementReturnTransition() {
        return mFragmentDelegate.getSharedElementReturnTransition();
    }

    public boolean getShowsDialog() {
        return callFunction("getShowsDialog()", new PluginCall<DialogFragmentPlugin, Boolean>() {
            @Override
            public Boolean call(final NamedSuperCall<Boolean> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {

                return plugin.getShowsDialog(superCall);

            }
        }, new SuperCall<Boolean>() {
            @Override
            public Boolean call(final Object... args) {
                return getOriginal().super_getShowsDialog();
            }
        });
    }

    public int getTheme() {
        return callFunction("getTheme()", new PluginCall<DialogFragmentPlugin, Integer>() {
            @Override
            public Integer call(final NamedSuperCall<Integer> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {

                return plugin.getTheme(superCall);

            }
        }, new SuperCall<Integer>() {
            @Override
            public Integer call(final Object... args) {
                return getOriginal().super_getTheme();
            }
        });
    }

    public boolean getUserVisibleHint() {
        return mFragmentDelegate.getUserVisibleHint();
    }

    public View getView() {
        return mFragmentDelegate.getView();
    }

    public boolean isCancelable() {
        return callFunction("isCancelable()", new PluginCall<DialogFragmentPlugin, Boolean>() {
            @Override
            public Boolean call(final NamedSuperCall<Boolean> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {

                return plugin.isCancelable(superCall);

            }
        }, new SuperCall<Boolean>() {
            @Override
            public Boolean call(final Object... args) {
                return getOriginal().super_isCancelable();
            }
        });
    }

    public void onActivityCreated(@Nullable final Bundle savedInstanceState) {
        mFragmentDelegate.onActivityCreated(savedInstanceState);
    }

    public void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        mFragmentDelegate.onActivityResult(requestCode, resultCode, data);
    }

    public void onAttach(final Context context) {
        mFragmentDelegate.onAttach(context);
    }

    public void onAttach(final Activity activity) {
        mFragmentDelegate.onAttach(activity);
    }

    public void onCancel(final DialogInterface dialog) {
        callHook("onCancel(DialogInterface)", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.onCancel(superCall, (DialogInterface) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onCancel((DialogInterface) args[0]);
            }
        }, dialog);
    }

    public void onConfigurationChanged(final Configuration newConfig) {
        mFragmentDelegate.onConfigurationChanged(newConfig);
    }

    public boolean onContextItemSelected(final MenuItem item) {
        return mFragmentDelegate.onContextItemSelected(item);
    }

    public void onCreate(@Nullable final Bundle savedInstanceState) {
        mFragmentDelegate.onCreate(savedInstanceState);
    }

    public Animation onCreateAnimation(final int transit, final boolean enter, final int nextAnim) {
        return mFragmentDelegate.onCreateAnimation(transit, enter, nextAnim);
    }

    public void onCreateContextMenu(final ContextMenu menu, final View v,
            final ContextMenu.ContextMenuInfo menuInfo) {
        mFragmentDelegate.onCreateContextMenu(menu, v, menuInfo);
    }

    public Dialog onCreateDialog(final Bundle savedInstanceState) {
        return callFunction("onCreateDialog(Bundle)",
                new PluginCall<DialogFragmentPlugin, Dialog>() {
                    @Override
                    public Dialog call(final NamedSuperCall<Dialog> superCall,
                            final DialogFragmentPlugin plugin, final Object... args) {

                        return plugin.onCreateDialog(superCall, (Bundle) args[0]);

                    }
                }, new SuperCall<Dialog>() {
                    @Override
                    public Dialog call(final Object... args) {
                        return getOriginal().super_onCreateDialog((Bundle) args[0]);
                    }
                }, savedInstanceState);
    }

    public void onCreateOptionsMenu(final Menu menu, final MenuInflater inflater) {
        mFragmentDelegate.onCreateOptionsMenu(menu, inflater);
    }

    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container,
            @Nullable final Bundle savedInstanceState) {
        return mFragmentDelegate.onCreateView(inflater, container, savedInstanceState);
    }

    public void onDestroy() {
        mFragmentDelegate.onDestroy();
    }

    public void onDestroyOptionsMenu() {
        mFragmentDelegate.onDestroyOptionsMenu();
    }

    public void onDestroyView() {
        mFragmentDelegate.onDestroyView();
    }

    public void onDetach() {
        mFragmentDelegate.onDetach();
    }

    public void onDismiss(final DialogInterface dialog) {
        callHook("onDismiss(DialogInterface)", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.onDismiss(superCall, (DialogInterface) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_onDismiss((DialogInterface) args[0]);
            }
        }, dialog);
    }

    public void onHiddenChanged(final boolean hidden) {
        mFragmentDelegate.onHiddenChanged(hidden);
    }

    public void onInflate(final Context context, final AttributeSet attrs,
            final Bundle savedInstanceState) {
        mFragmentDelegate.onInflate(context, attrs, savedInstanceState);
    }

    public void onInflate(final Activity activity, final AttributeSet attrs,
            final Bundle savedInstanceState) {
        mFragmentDelegate.onInflate(activity, attrs, savedInstanceState);
    }

    public void onLowMemory() {
        mFragmentDelegate.onLowMemory();
    }

    public boolean onOptionsItemSelected(final MenuItem item) {
        return mFragmentDelegate.onOptionsItemSelected(item);
    }

    public void onOptionsMenuClosed(final Menu menu) {
        mFragmentDelegate.onOptionsMenuClosed(menu);
    }

    public void onPause() {
        mFragmentDelegate.onPause();
    }

    public void onPrepareOptionsMenu(final Menu menu) {
        mFragmentDelegate.onPrepareOptionsMenu(menu);
    }

    public void onRequestPermissionsResult(final int requestCode,
            @NonNull final String[] permissions, @NonNull final int[] grantResults) {
        mFragmentDelegate.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    public void onResume() {
        mFragmentDelegate.onResume();
    }

    public void onSaveInstanceState(final Bundle outState) {
        mFragmentDelegate.onSaveInstanceState(outState);
    }

    public void onStart() {
        mFragmentDelegate.onStart();
    }

    public void onStop() {
        mFragmentDelegate.onStop();
    }

    public void onViewCreated(final View view, @Nullable final Bundle savedInstanceState) {
        mFragmentDelegate.onViewCreated(view, savedInstanceState);
    }

    public void onViewStateRestored(@Nullable final Bundle savedInstanceState) {
        mFragmentDelegate.onViewStateRestored(savedInstanceState);
    }

    public void registerForContextMenu(final View view) {
        mFragmentDelegate.registerForContextMenu(view);
    }

    public void setAllowEnterTransitionOverlap(final boolean allow) {
        mFragmentDelegate.setAllowEnterTransitionOverlap(allow);
    }

    public void setAllowReturnTransitionOverlap(final boolean allow) {
        mFragmentDelegate.setAllowReturnTransitionOverlap(allow);
    }

    public void setArguments(final Bundle args) {
        mFragmentDelegate.setArguments(args);
    }

    public void setCancelable(final boolean cancelable) {
        callHook("setCancelable(boolean)", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.setCancelable(superCall, (boolean) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_setCancelable((boolean) args[0]);
            }
        }, cancelable);
    }

    public void setEnterSharedElementCallback(final SharedElementCallback callback) {
        mFragmentDelegate.setEnterSharedElementCallback(callback);
    }

    public void setEnterTransition(final Object transition) {
        mFragmentDelegate.setEnterTransition(transition);
    }

    public void setExitSharedElementCallback(final SharedElementCallback callback) {
        mFragmentDelegate.setExitSharedElementCallback(callback);
    }

    public void setExitTransition(final Object transition) {
        mFragmentDelegate.setExitTransition(transition);
    }

    public void setHasOptionsMenu(final boolean hasMenu) {
        mFragmentDelegate.setHasOptionsMenu(hasMenu);
    }

    public void setInitialSavedState(final Fragment.SavedState state) {
        mFragmentDelegate.setInitialSavedState(state);
    }

    public void setMenuVisibility(final boolean menuVisible) {
        mFragmentDelegate.setMenuVisibility(menuVisible);
    }

    public void setReenterTransition(final Object transition) {
        mFragmentDelegate.setReenterTransition(transition);
    }

    public void setRetainInstance(final boolean retain) {
        mFragmentDelegate.setRetainInstance(retain);
    }

    public void setReturnTransition(final Object transition) {
        mFragmentDelegate.setReturnTransition(transition);
    }

    public void setSharedElementEnterTransition(final Object transition) {
        mFragmentDelegate.setSharedElementEnterTransition(transition);
    }

    public void setSharedElementReturnTransition(final Object transition) {
        mFragmentDelegate.setSharedElementReturnTransition(transition);
    }

    public void setShowsDialog(final boolean showsDialog) {
        callHook("setShowsDialog(boolean)", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.setShowsDialog(superCall, (boolean) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_setShowsDialog((boolean) args[0]);
            }
        }, showsDialog);
    }

    public void setStyle(final int style, @StyleRes final int theme) {
        callHook("setStyle(int, int)", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.setStyle(superCall, (int) args[0], (int) args[1]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_setStyle((int) args[0], (int) args[1]);
            }
        }, style, theme);
    }

    public void setTargetFragment(final Fragment fragment, final int requestCode) {
        mFragmentDelegate.setTargetFragment(fragment, requestCode);
    }

    public void setUserVisibleHint(final boolean isVisibleToUser) {
        mFragmentDelegate.setUserVisibleHint(isVisibleToUser);
    }

    public void setupDialog(final Dialog dialog, final int style) {
        callHook("setupDialog(Dialog, int)", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.setupDialog(superCall, (Dialog) args[0], (int) args[1]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_setupDialog((Dialog) args[0], (int) args[1]);
            }
        }, dialog, style);
    }

    public boolean shouldShowRequestPermissionRationale(@NonNull final String permission) {
        return mFragmentDelegate.shouldShowRequestPermissionRationale(permission);
    }

    public void show(final FragmentManager manager, final String tag) {
        callHook("show(FragmentManager, String)", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.show(superCall, (FragmentManager) args[0], (String) args[1]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().super_show((FragmentManager) args[0], (String) args[1]);
            }
        }, manager, tag);
    }

    public int show(final FragmentTransaction transaction, final String tag) {
        return callFunction("show(FragmentTransaction, String)",
                new PluginCall<DialogFragmentPlugin, Integer>() {
                    @Override
                    public Integer call(final NamedSuperCall<Integer> superCall,
                            final DialogFragmentPlugin plugin, final Object... args) {

                        return plugin
                                .show(superCall, (FragmentTransaction) args[0], (String) args[1]);

                    }
                }, new SuperCall<Integer>() {
                    @Override
                    public Integer call(final Object... args) {
                        return getOriginal()
                                .super_show((FragmentTransaction) args[0], (String) args[1]);
                    }
                }, transaction, tag);
    }

    public void startActivity(final Intent intent) {
        mFragmentDelegate.startActivity(intent);
    }

    public void startActivity(final Intent intent, @Nullable final Bundle options) {
        mFragmentDelegate.startActivity(intent, options);
    }

    public void startActivityForResult(final Intent intent, final int requestCode) {
        mFragmentDelegate.startActivityForResult(intent, requestCode);
    }

    public void startActivityForResult(final Intent intent, final int requestCode,
            @Nullable final Bundle options) {
        mFragmentDelegate.startActivityForResult(intent, requestCode, options);
    }

    public String toString() {
        return mFragmentDelegate.toString();
    }

    public void unregisterForContextMenu(final View view) {
        mFragmentDelegate.unregisterForContextMenu(view);
    }


}