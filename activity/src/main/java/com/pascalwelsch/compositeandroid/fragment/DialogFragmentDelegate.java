package com.pascalwelsch.compositeandroid.fragment;

import com.pascalwelsch.compositeandroid.core.NamedSuperCall;
import com.pascalwelsch.compositeandroid.core.PluginCall;
import com.pascalwelsch.compositeandroid.core.PluginCallVoid;
import com.pascalwelsch.compositeandroid.core.Removable;
import com.pascalwelsch.compositeandroid.core.SuperCall;
import com.pascalwelsch.compositeandroid.core.SuperCallVoid;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;


public class DialogFragmentDelegate extends DialogFragmentDelegateBase {

    private final FragmentDelegate mFragmentDelegate;

    public DialogFragmentDelegate(final CompositeDialogFragment compositedialogfragment) {
        super(compositedialogfragment);
        mFragmentDelegate = new FragmentDelegate(compositedialogfragment);
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

    public void onCreate(@Nullable final Bundle savedInstanceState) {
        callHook("onCreate(Bundle)", new PluginCallVoid<DialogFragmentPlugin>() {
            @Override
            public void call(final NamedSuperCall<Void> superCall,
                    final DialogFragmentPlugin plugin, final Object... args) {
                plugin.onCreate(superCall, (Bundle) args[0]);
            }
        }, new SuperCallVoid() {
            @Override
            public void call(final Object... args) {
                getOriginal().onCreate__super((Bundle) args[0]);
            }
        }, savedInstanceState);
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


}
