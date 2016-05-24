package com.pascalwelsch.compositeandroid.fragment;

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


public class DialogFragmentDelegate extends DialogFragmentDelegateBase {

    private final FragmentDelegate mFragmentDelegate;

    public DialogFragmentDelegate(final CompositeDialogFragment fragment) {
        super(fragment);
        mFragmentDelegate = new FragmentDelegate(fragment);
    }

    public Removable addPlugin(final FragmentPlugin plugin) {
        return mFragmentDelegate.addPlugin(plugin);
    }

    @Override
    public Removable addPlugin(final DialogFragmentPlugin plugin) {
        final Removable dialogRemovable = super.addPlugin(plugin);
        final Removable baseRemovable = mFragmentDelegate.addPlugin(plugin);
        return new Removable() {
            @Override
            public void remove() {
                dialogRemovable.remove();
                baseRemovable.remove();
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
                getOriginal().dismiss__super();
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
                getOriginal().dismissAllowingStateLoss__super();
            }
        });
    }

    public void dump(final String prefix, final FileDescriptor fd, final PrintWriter writer,
            final String[] args) {
        callHook("dump(String, FileDescriptor, PrintWriter, String[])",
                new PluginCallVoid<DialogFragmentPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final DialogFragmentPlugin plugin, final Object... args) {
                        plugin.dump(superCall, (String) args[0], (FileDescriptor) args[1],
                                (PrintWriter) args[2], (String[]) args[3]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().dump__super((String) args[0], (FileDescriptor) args[1],
                                (PrintWriter) args[2], (String[]) args[3]);
                    }
                }, prefix, fd, writer, args);
    }

    public boolean getAllowEnterTransitionOverlap() {
        return callFunction("getAllowEnterTransitionOverlap()",
                new PluginCall<DialogFragmentPlugin, Boolean>() {
                    @Override
                    public Boolean call(final NamedSuperCall<Boolean> superCall,
                            final DialogFragmentPlugin plugin, final Object... args) {

                        return plugin.getAllowEnterTransitionOverlap(superCall);

                    }
                }, new SuperCall<Boolean>() {
                    @Override
                    public Boolean call(final Object... args) {
                        return getOriginal().getAllowEnterTransitionOverlap__super();
                    }
                });
    }


    public boolean getAllowReturnTransitionOverlap() {
        return callFunction("getAllowReturnTransitionOverlap()",
                new PluginCall<DialogFragmentPlugin, Boolean>() {
                    @Override
                    public Boolean call(final NamedSuperCall<Boolean> superCall,
                            final DialogFragmentPlugin plugin, final Object... args) {

                        return plugin.getAllowReturnTransitionOverlap(superCall);

                    }
                }, new SuperCall<Boolean>() {
                    @Override
                    public Boolean call(final Object... args) {
                        return getOriginal().getAllowReturnTransitionOverlap__super();
                    }
                });
    }


    public Context getContext() {
        return callFunction("getContext()", new PluginCall<DialogFragmentPlugin, Context>() {
            @Override
            public Context call(final NamedSuperCall<Context> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {

                return plugin.getContext(superCall);

            }
        }, new SuperCall<Context>() {
            @Override
            public Context call(final Object... args) {
                return getOriginal().getContext__super();
            }
        });
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
                return getOriginal().getDialog__super();
            }
        });
    }


    public Object getEnterTransition() {
        return callFunction("getEnterTransition()", new PluginCall<DialogFragmentPlugin, Object>() {
            @Override
            public Object call(final NamedSuperCall<Object> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {

                return plugin.getEnterTransition(superCall);

            }
        }, new SuperCall<Object>() {
            @Override
            public Object call(final Object... args) {
                return getOriginal().getEnterTransition__super();
            }
        });
    }


    public Object getExitTransition() {
        return callFunction("getExitTransition()", new PluginCall<DialogFragmentPlugin, Object>() {
            @Override
            public Object call(final NamedSuperCall<Object> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {

                return plugin.getExitTransition(superCall);

            }
        }, new SuperCall<Object>() {
            @Override
            public Object call(final Object... args) {
                return getOriginal().getExitTransition__super();
            }
        });
    }


    public LayoutInflater getLayoutInflater(final Bundle savedInstanceState) {
        return callFunction("getLayoutInflater(Bundle)",
                new PluginCall<DialogFragmentPlugin, LayoutInflater>() {
                    @Override
                    public LayoutInflater call(final NamedSuperCall<LayoutInflater> superCall,
                            final DialogFragmentPlugin plugin, final Object... args) {

                        return plugin.getLayoutInflater(superCall, (Bundle) args[0]);

                    }
                }, new SuperCall<LayoutInflater>() {
                    @Override
                    public LayoutInflater call(final Object... args) {
                        return getOriginal().getLayoutInflater__super((Bundle) args[0]);
                    }
                }, savedInstanceState);
    }


    public LoaderManager getLoaderManager() {
        return callFunction("getLoaderManager()",
                new PluginCall<DialogFragmentPlugin, LoaderManager>() {
                    @Override
                    public LoaderManager call(final NamedSuperCall<LoaderManager> superCall,
                            final DialogFragmentPlugin plugin, final Object... args) {

                        return plugin.getLoaderManager(superCall);

                    }
                }, new SuperCall<LoaderManager>() {
                    @Override
                    public LoaderManager call(final Object... args) {
                        return getOriginal().getLoaderManager__super();
                    }
                });
    }


    public Object getReenterTransition() {
        return callFunction("getReenterTransition()",
                new PluginCall<DialogFragmentPlugin, Object>() {
                    @Override
                    public Object call(final NamedSuperCall<Object> superCall,
                            final DialogFragmentPlugin plugin, final Object... args) {

                        return plugin.getReenterTransition(superCall);

                    }
                }, new SuperCall<Object>() {
                    @Override
                    public Object call(final Object... args) {
                        return getOriginal().getReenterTransition__super();
                    }
                });
    }


    public Object getReturnTransition() {
        return callFunction("getReturnTransition()",
                new PluginCall<DialogFragmentPlugin, Object>() {
                    @Override
                    public Object call(final NamedSuperCall<Object> superCall,
                            final DialogFragmentPlugin plugin, final Object... args) {

                        return plugin.getReturnTransition(superCall);

                    }
                }, new SuperCall<Object>() {
                    @Override
                    public Object call(final Object... args) {
                        return getOriginal().getReturnTransition__super();
                    }
                });
    }


    public Object getSharedElementEnterTransition() {
        return callFunction("getSharedElementEnterTransition()",
                new PluginCall<DialogFragmentPlugin, Object>() {
                    @Override
                    public Object call(final NamedSuperCall<Object> superCall,
                            final DialogFragmentPlugin plugin, final Object... args) {

                        return plugin.getSharedElementEnterTransition(superCall);

                    }
                }, new SuperCall<Object>() {
                    @Override
                    public Object call(final Object... args) {
                        return getOriginal().getSharedElementEnterTransition__super();
                    }
                });
    }


    public Object getSharedElementReturnTransition() {
        return callFunction("getSharedElementReturnTransition()",
                new PluginCall<DialogFragmentPlugin, Object>() {
                    @Override
                    public Object call(final NamedSuperCall<Object> superCall,
                            final DialogFragmentPlugin plugin, final Object... args) {

                        return plugin.getSharedElementReturnTransition(superCall);

                    }
                }, new SuperCall<Object>() {
                    @Override
                    public Object call(final Object... args) {
                        return getOriginal().getSharedElementReturnTransition__super();
                    }
                });
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
                return getOriginal().getShowsDialog__super();
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
                return getOriginal().getTheme__super();
            }
        });
    }


    public boolean getUserVisibleHint() {
        return callFunction("getUserVisibleHint()",
                new PluginCall<DialogFragmentPlugin, Boolean>() {
                    @Override
                    public Boolean call(final NamedSuperCall<Boolean> superCall,
                            final DialogFragmentPlugin plugin, final Object... args) {

                        return plugin.getUserVisibleHint(superCall);

                    }
                }, new SuperCall<Boolean>() {
                    @Override
                    public Boolean call(final Object... args) {
                        return getOriginal().getUserVisibleHint__super();
                    }
                });
    }


    public View getView() {
        return callFunction("getView()", new PluginCall<DialogFragmentPlugin, View>() {
            @Override
            public View call(final NamedSuperCall<View> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {

                return plugin.getView(superCall);

            }
        }, new SuperCall<View>() {
            @Override
            public View call(final Object... args) {
                return getOriginal().getView__super();
            }
        });
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
                return getOriginal().isCancelable__super();
            }
        });
    }

    public void onActivityCreated(final Bundle savedInstanceState) {
        callHook("onActivityCreated(Bundle)", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.onActivityCreated(superCall, (Bundle) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().onActivityCreated__super((Bundle) args[0]);
            }
        }, savedInstanceState);
    }

    public void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        callHook("onActivityResult(int, int, Intent)", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.onActivityResult(superCall, (int) args[0], (int) args[1], (Intent) args[2]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal()
                        .onActivityResult__super((int) args[0], (int) args[1], (Intent) args[2]);
            }
        }, requestCode, resultCode, data);
    }

    public void onAttach(final Activity activity) {
        callHook("onAttach(Activity)", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.onAttach(superCall, (Activity) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().onAttach__super((Activity) args[0]);
            }
        }, activity);
    }

    public void onAttach(final Context context) {
        callHook("onAttach(Context)", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.onAttach(superCall, (Context) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().onAttach__super((Context) args[0]);
            }
        }, context);
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
                getOriginal().onCancel__super((DialogInterface) args[0]);
            }
        }, dialog);
    }

    public void onConfigurationChanged(final Configuration newConfig) {
        callHook("onConfigurationChanged(Configuration)",
                new PluginCallVoid<DialogFragmentPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final DialogFragmentPlugin plugin, final Object... args) {
                        plugin.onConfigurationChanged(superCall, (Configuration) args[0]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().onConfigurationChanged__super((Configuration) args[0]);
                    }
                }, newConfig);
    }


    public boolean onContextItemSelected(final MenuItem item) {
        return callFunction("onContextItemSelected(MenuItem)",
                new PluginCall<DialogFragmentPlugin, Boolean>() {
                    @Override
                    public Boolean call(final NamedSuperCall<Boolean> superCall,
                            final DialogFragmentPlugin plugin, final Object... args) {

                        return plugin.onContextItemSelected(superCall, (MenuItem) args[0]);

                    }
                }, new SuperCall<Boolean>() {
                    @Override
                    public Boolean call(final Object... args) {
                        return getOriginal().onContextItemSelected__super((MenuItem) args[0]);
                    }
                }, item);
    }

    public void onCreate(@Nullable final Bundle savedInstanceState) {
        mFragmentDelegate.onCreate(savedInstanceState);
    }

    public Animation onCreateAnimation(final int transit, final boolean enter, final int nextAnim) {
        return callFunction("onCreateAnimation(int, boolean, int)",
                new PluginCall<DialogFragmentPlugin, Animation>() {
                    @Override
                    public Animation call(final NamedSuperCall<Animation> superCall,
                            final DialogFragmentPlugin plugin, final Object... args) {

                        return plugin.onCreateAnimation(superCall, (int) args[0], (boolean) args[1],
                                (int) args[2]);

                    }
                }, new SuperCall<Animation>() {
                    @Override
                    public Animation call(final Object... args) {
                        return getOriginal()
                                .onCreateAnimation__super((int) args[0], (boolean) args[1],
                                        (int) args[2]);
                    }
                }, transit, enter, nextAnim);
    }

    public void onCreateContextMenu(final ContextMenu menu, final View v,
            final ContextMenu.ContextMenuInfo menuInfo) {
        callHook("onCreateContextMenu(ContextMenu, View, ContextMenu.ContextMenuInfo)",
                new PluginCallVoid<DialogFragmentPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final DialogFragmentPlugin plugin, final Object... args) {
                        plugin.onCreateContextMenu(superCall, (ContextMenu) args[0], (View) args[1],
                                (ContextMenu.ContextMenuInfo) args[2]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal()
                                .onCreateContextMenu__super((ContextMenu) args[0], (View) args[1],
                                        (ContextMenu.ContextMenuInfo) args[2]);
                    }
                }, menu, v, menuInfo);
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
                        return getOriginal().onCreateDialog__super((Bundle) args[0]);
                    }
                }, savedInstanceState);
    }

    public void onCreateOptionsMenu(final Menu menu, final MenuInflater inflater) {
        callHook("onCreateOptionsMenu(Menu, MenuInflater)",
                new PluginCallVoid<DialogFragmentPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final DialogFragmentPlugin plugin, final Object... args) {
                        plugin.onCreateOptionsMenu(superCall, (Menu) args[0],
                                (MenuInflater) args[1]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal()
                                .onCreateOptionsMenu__super((Menu) args[0], (MenuInflater) args[1]);
                    }
                }, menu, inflater);
    }


    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container,
            @Nullable final Bundle savedInstanceState) {
        return callFunction("onCreateView(LayoutInflater, ViewGroup, Bundle)",
                new PluginCall<DialogFragmentPlugin, View>() {
                    @Override
                    public View call(final NamedSuperCall<View> superCall,
                            final DialogFragmentPlugin plugin, final Object... args) {

                        return plugin.onCreateView(superCall, (LayoutInflater) args[0],
                                (ViewGroup) args[1], (Bundle) args[2]);

                    }
                }, new SuperCall<View>() {
                    @Override
                    public View call(final Object... args) {
                        return getOriginal()
                                .onCreateView__super((LayoutInflater) args[0], (ViewGroup) args[1],
                                        (Bundle) args[2]);
                    }
                }, inflater, container, savedInstanceState);
    }

    public void onDestroy() {
        callHook("onDestroy()", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.onDestroy(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().onDestroy__super();
            }
        });
    }

    public void onDestroyOptionsMenu() {
        callHook("onDestroyOptionsMenu()", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.onDestroyOptionsMenu(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().onDestroyOptionsMenu__super();
            }
        });
    }

    public void onDestroyView() {
        callHook("onDestroyView()", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.onDestroyView(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().onDestroyView__super();
            }
        });
    }

    public void onDetach() {
        callHook("onDetach()", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.onDetach(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().onDetach__super();
            }
        });
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
                getOriginal().onDismiss__super((DialogInterface) args[0]);
            }
        }, dialog);
    }

    public void onHiddenChanged(final boolean hidden) {
        callHook("onHiddenChanged(boolean)", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.onHiddenChanged(superCall, (boolean) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().onHiddenChanged__super((boolean) args[0]);
            }
        }, hidden);
    }

    public void onInflate(final Context context, final AttributeSet attrs,
            final Bundle savedInstanceState) {
        callHook("onInflate(Context, AttributeSet, Bundle)",
                new PluginCallVoid<DialogFragmentPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final DialogFragmentPlugin plugin, final Object... args) {
                        plugin.onInflate(superCall, (Context) args[0], (AttributeSet) args[1],
                                (Bundle) args[2]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().onInflate__super((Context) args[0], (AttributeSet) args[1],
                                (Bundle) args[2]);
                    }
                }, context, attrs, savedInstanceState);
    }

    public void onInflate(final Activity activity, final AttributeSet attrs,
            final Bundle savedInstanceState) {
        callHook("onInflate(Activity, AttributeSet, Bundle)",
                new PluginCallVoid<DialogFragmentPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final DialogFragmentPlugin plugin, final Object... args) {
                        plugin.onInflate(superCall, (Activity) args[0], (AttributeSet) args[1],
                                (Bundle) args[2]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().onInflate__super((Activity) args[0], (AttributeSet) args[1],
                                (Bundle) args[2]);
                    }
                }, activity, attrs, savedInstanceState);
    }

    public void onLowMemory() {
        callHook("onLowMemory()", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.onLowMemory(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().onLowMemory__super();
            }
        });
    }


    public boolean onOptionsItemSelected(final MenuItem item) {
        return callFunction("onOptionsItemSelected(MenuItem)",
                new PluginCall<DialogFragmentPlugin, Boolean>() {
                    @Override
                    public Boolean call(final NamedSuperCall<Boolean> superCall,
                            final DialogFragmentPlugin plugin, final Object... args) {

                        return plugin.onOptionsItemSelected(superCall, (MenuItem) args[0]);

                    }
                }, new SuperCall<Boolean>() {
                    @Override
                    public Boolean call(final Object... args) {
                        return getOriginal().onOptionsItemSelected__super((MenuItem) args[0]);
                    }
                }, item);
    }

    public void onOptionsMenuClosed(final Menu menu) {
        callHook("onOptionsMenuClosed(Menu)", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.onOptionsMenuClosed(superCall, (Menu) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().onOptionsMenuClosed__super((Menu) args[0]);
            }
        }, menu);
    }

    public void onPause() {
        callHook("onPause()", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.onPause(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().onPause__super();
            }
        });
    }

    public void onPrepareOptionsMenu(final Menu menu) {
        callHook("onPrepareOptionsMenu(Menu)", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.onPrepareOptionsMenu(superCall, (Menu) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().onPrepareOptionsMenu__super((Menu) args[0]);
            }
        }, menu);
    }

    public void onRequestPermissionsResult(final int requestCode,
            @NonNull final String[] permissions, @NonNull final int[] grantResults) {
        callHook("onRequestPermissionsResult(int, String[], int[])",
                new PluginCallVoid<DialogFragmentPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final DialogFragmentPlugin plugin, final Object... args) {
                        plugin.onRequestPermissionsResult(superCall, (int) args[0],
                                (String[]) args[1], (int[]) args[2]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().onRequestPermissionsResult__super((int) args[0],
                                (String[]) args[1], (int[]) args[2]);
                    }
                }, requestCode, permissions, grantResults);
    }

    public void onResume() {
        callHook("onResume()", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.onResume(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().onResume__super();
            }
        });
    }

    public void onSaveInstanceState(final Bundle outState) {
        callHook("onSaveInstanceState(Bundle)", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.onSaveInstanceState(superCall, (Bundle) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().onSaveInstanceState__super((Bundle) args[0]);
            }
        }, outState);
    }

    public void onStart() {
        callHook("onStart()", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.onStart(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().onStart__super();
            }
        });
    }

    public void onStop() {
        callHook("onStop()", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.onStop(superCall);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().onStop__super();
            }
        });
    }

    public void onViewCreated(final View view, @Nullable final Bundle savedInstanceState) {
        callHook("onViewCreated(View, Bundle)", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.onViewCreated(superCall, (View) args[0], (Bundle) args[1]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().onViewCreated__super((View) args[0], (Bundle) args[1]);
            }
        }, view, savedInstanceState);
    }

    public void onViewStateRestored(@Nullable final Bundle savedInstanceState) {
        callHook("onViewStateRestored(Bundle)", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.onViewStateRestored(superCall, (Bundle) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().onViewStateRestored__super((Bundle) args[0]);
            }
        }, savedInstanceState);
    }

    public void registerForContextMenu(final View view) {
        callHook("registerForContextMenu(View)", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.registerForContextMenu(superCall, (View) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().registerForContextMenu__super((View) args[0]);
            }
        }, view);
    }

    public void setAllowEnterTransitionOverlap(final boolean allow) {
        callHook("setAllowEnterTransitionOverlap(boolean)",
                new PluginCallVoid<DialogFragmentPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final DialogFragmentPlugin plugin, final Object... args) {
                        plugin.setAllowEnterTransitionOverlap(superCall, (boolean) args[0]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().setAllowEnterTransitionOverlap__super((boolean) args[0]);
                    }
                }, allow);
    }

    public void setAllowReturnTransitionOverlap(final boolean allow) {
        callHook("setAllowReturnTransitionOverlap(boolean)",
                new PluginCallVoid<DialogFragmentPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final DialogFragmentPlugin plugin, final Object... args) {
                        plugin.setAllowReturnTransitionOverlap(superCall, (boolean) args[0]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().setAllowReturnTransitionOverlap__super((boolean) args[0]);
                    }
                }, allow);
    }

    public void setArguments(final Bundle args) {
        callHook("setArguments(Bundle)", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.setArguments(superCall, (Bundle) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().setArguments__super((Bundle) args[0]);
            }
        }, args);
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
                getOriginal().setCancelable__super((boolean) args[0]);
            }
        }, cancelable);
    }

    public void setEnterSharedElementCallback(final SharedElementCallback callback) {
        callHook("setEnterSharedElementCallback(SharedElementCallback)",
                new PluginCallVoid<DialogFragmentPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final DialogFragmentPlugin plugin, final Object... args) {
                        plugin.setEnterSharedElementCallback(superCall,
                                (SharedElementCallback) args[0]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().setEnterSharedElementCallback__super(
                                (SharedElementCallback) args[0]);
                    }
                }, callback);
    }

    public void setEnterTransition(final Object transition) {
        callHook("setEnterTransition(Object)", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.setEnterTransition(superCall, (Object) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().setEnterTransition__super((Object) args[0]);
            }
        }, transition);
    }

    public void setExitSharedElementCallback(final SharedElementCallback callback) {
        callHook("setExitSharedElementCallback(SharedElementCallback)",
                new PluginCallVoid<DialogFragmentPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final DialogFragmentPlugin plugin, final Object... args) {
                        plugin.setExitSharedElementCallback(superCall,
                                (SharedElementCallback) args[0]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().setExitSharedElementCallback__super(
                                (SharedElementCallback) args[0]);
                    }
                }, callback);
    }

    public void setExitTransition(final Object transition) {
        callHook("setExitTransition(Object)", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.setExitTransition(superCall, (Object) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().setExitTransition__super((Object) args[0]);
            }
        }, transition);
    }

    public void setHasOptionsMenu(final boolean hasMenu) {
        callHook("setHasOptionsMenu(boolean)", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.setHasOptionsMenu(superCall, (boolean) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().setHasOptionsMenu__super((boolean) args[0]);
            }
        }, hasMenu);
    }

    public void setInitialSavedState(final Fragment.SavedState state) {
        callHook("setInitialSavedState(Fragment.SavedState)",
                new PluginCallVoid<DialogFragmentPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final DialogFragmentPlugin plugin, final Object... args) {
                        plugin.setInitialSavedState(superCall, (Fragment.SavedState) args[0]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().setInitialSavedState__super((Fragment.SavedState) args[0]);
                    }
                }, state);
    }

    public void setMenuVisibility(final boolean menuVisible) {
        callHook("setMenuVisibility(boolean)", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.setMenuVisibility(superCall, (boolean) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().setMenuVisibility__super((boolean) args[0]);
            }
        }, menuVisible);
    }

    public void setReenterTransition(final Object transition) {
        callHook("setReenterTransition(Object)", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.setReenterTransition(superCall, (Object) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().setReenterTransition__super((Object) args[0]);
            }
        }, transition);
    }

    public void setRetainInstance(final boolean retain) {
        callHook("setRetainInstance(boolean)", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.setRetainInstance(superCall, (boolean) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().setRetainInstance__super((boolean) args[0]);
            }
        }, retain);
    }

    public void setReturnTransition(final Object transition) {
        callHook("setReturnTransition(Object)", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.setReturnTransition(superCall, (Object) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().setReturnTransition__super((Object) args[0]);
            }
        }, transition);
    }

    public void setSharedElementEnterTransition(final Object transition) {
        callHook("setSharedElementEnterTransition(Object)",
                new PluginCallVoid<DialogFragmentPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final DialogFragmentPlugin plugin, final Object... args) {
                        plugin.setSharedElementEnterTransition(superCall, (Object) args[0]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().setSharedElementEnterTransition__super((Object) args[0]);
                    }
                }, transition);
    }

    public void setSharedElementReturnTransition(final Object transition) {
        callHook("setSharedElementReturnTransition(Object)",
                new PluginCallVoid<DialogFragmentPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final DialogFragmentPlugin plugin, final Object... args) {
                        plugin.setSharedElementReturnTransition(superCall, (Object) args[0]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().setSharedElementReturnTransition__super((Object) args[0]);
                    }
                }, transition);
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
                getOriginal().setShowsDialog__super((boolean) args[0]);
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
                getOriginal().setStyle__super((int) args[0], (int) args[1]);
            }
        }, style, theme);
    }

    public void setTargetFragment(final Fragment fragment, final int requestCode) {
        callHook("setTargetOriginal(Fragment, int)", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.setTargetFragment(superCall, (Fragment) args[0], (int) args[1]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().setTargetFragment__super((Fragment) args[0], (int) args[1]);
            }
        }, fragment, requestCode);
    }

    public void setUserVisibleHint(final boolean isVisibleToUser) {
        callHook("setUserVisibleHint(boolean)", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.setUserVisibleHint(superCall, (boolean) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().setUserVisibleHint__super((boolean) args[0]);
            }
        }, isVisibleToUser);
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
                getOriginal().setupDialog__super((Dialog) args[0], (int) args[1]);
            }
        }, dialog, style);
    }


    public boolean shouldShowRequestPermissionRationale(@NonNull final String permission) {
        return callFunction("shouldShowRequestPermissionRationale(String)",
                new PluginCall<DialogFragmentPlugin, Boolean>() {
                    @Override
                    public Boolean call(final NamedSuperCall<Boolean> superCall,
                            final DialogFragmentPlugin plugin, final Object... args) {

                        return plugin
                                .shouldShowRequestPermissionRationale(superCall, (String) args[0]);

                    }
                }, new SuperCall<Boolean>() {
                    @Override
                    public Boolean call(final Object... args) {
                        return getOriginal()
                                .shouldShowRequestPermissionRationale__super((String) args[0]);
                    }
                }, permission);
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
                getOriginal().show__super((FragmentManager) args[0], (String) args[1]);
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
                                .show__super((FragmentTransaction) args[0], (String) args[1]);
                    }
                }, transaction, tag);
    }

    public void startActivity(final Intent intent) {
        callHook("startActivity(Intent)", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.startActivity(superCall, (Intent) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().startActivity__super((Intent) args[0]);
            }
        }, intent);
    }

    public void startActivity(final Intent intent, @Nullable final Bundle options) {
        callHook("startActivity(Intent, Bundle)", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.startActivity(superCall, (Intent) args[0], (Bundle) args[1]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().startActivity__super((Intent) args[0], (Bundle) args[1]);
            }
        }, intent, options);
    }

    public void startActivityForResult(final Intent intent, final int requestCode) {
        callHook("startActivityForResult(Intent, int)", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.startActivityForResult(superCall, (Intent) args[0], (int) args[1]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().startActivityForResult__super((Intent) args[0], (int) args[1]);
            }
        }, intent, requestCode);
    }

    public void startActivityForResult(final Intent intent, final int requestCode,
            @Nullable final Bundle options) {
        callHook("startActivityForResult(Intent, int, Bundle)",
                new PluginCallVoid<DialogFragmentPlugin>() {
                    @Override
                    public void call(final NamedSuperCall<Void> superCall,
                            final DialogFragmentPlugin plugin, final Object... args) {
                        plugin.startActivityForResult(superCall, (Intent) args[0], (int) args[1],
                                (Bundle) args[2]);
                    }
                }, new SuperCallVoid() {
                    @Override
                    public void call(final Object... args) {
                        getOriginal().startActivityForResult__super((Intent) args[0], (int) args[1],
                                (Bundle) args[2]);
                    }
                }, intent, requestCode, options);
    }


    public String toString() {
        return callFunction("toString()", new PluginCall<DialogFragmentPlugin, String>() {
            @Override
            public String call(final NamedSuperCall<String> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {

                return plugin.toString(superCall);

            }
        }, new SuperCall<String>() {
            @Override
            public String call(final Object... args) {
                return getOriginal().toString__super();
            }
        });
    }

    public void unregisterForContextMenu(final View view) {
        callHook("unregisterForContextMenu(View)", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.unregisterForContextMenu(superCall, (View) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().unregisterForContextMenu__super((View) args[0]);
            }
        }, view);
    }


}
