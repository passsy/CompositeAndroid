package com.pascalwelsch.compositeandroid.fragment;

import com.pascalwelsch.compositeandroid.core.Removable;

import android.annotation.SuppressLint;
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
import android.support.v4.app.DialogFragment;
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

@SuppressWarnings({"unused", "deprecation", "JavadocReference", "WrongConstant"})
@SuppressLint({"MissingSuperCall", "NewApi"})

public class CompositeDialogFragment extends DialogFragment implements ICompositeDialogFragment {

    protected DialogFragmentDelegate delegate = new DialogFragmentDelegate(this);


    public Removable addPlugin(final DialogFragmentPlugin plugin) {
        return delegate.addPlugin(plugin);
    }

    public Removable addPlugin(final FragmentPlugin plugin) {
        return delegate.addPlugin(plugin);
    }

    /**
     * Dismiss the fragment and its dialog.  If the fragment was added to the
     * back stack, all back stack state up to and including this entry will
     * be popped.  Otherwise, a new transaction will be committed to remove
     * the fragment.
     */
    @Override
    public void dismiss() {
        delegate.dismiss();
    }

    /**
     * Version of {@link #dismiss()} that uses
     * {@link FragmentTransaction#commitAllowingStateLoss()
     * FragmentTransaction.commitAllowingStateLoss()}. See linked
     * documentation for further details.
     */
    @Override
    public void dismissAllowingStateLoss() {
        delegate.dismissAllowingStateLoss();
    }

    public void dismissAllowingStateLoss__super() {
        super.dismissAllowingStateLoss();
    }

    public void dismiss__super() {
        super.dismiss();
    }

    public void dump__super(final String prefix, final FileDescriptor fd, final PrintWriter writer,
            final String[] args) {
        super.dump(prefix, fd, writer, args);
    }

    public boolean getAllowEnterTransitionOverlap__super() {
        return super.getAllowEnterTransitionOverlap();
    }

    public boolean getAllowReturnTransitionOverlap__super() {
        return super.getAllowReturnTransitionOverlap();
    }

    public Context getContext__super() {
        return super.getContext();
    }

    @Override
    public Dialog getDialog() {
        return delegate.getDialog();
    }

    public Dialog getDialog__super() {
        return super.getDialog();
    }

    public Object getEnterTransition__super() {
        return super.getEnterTransition();
    }

    public Object getExitTransition__super() {
        return super.getExitTransition();
    }

    /**
     * @hide
     */
    @Override
    public LayoutInflater getLayoutInflater(final Bundle savedInstanceState) {
        return delegate.getLayoutInflater(savedInstanceState);
    }

    public LayoutInflater getLayoutInflater__super(final Bundle savedInstanceState) {
        return super.getLayoutInflater(savedInstanceState);
    }

    public LoaderManager getLoaderManager__super() {
        return super.getLoaderManager();
    }

    public Object getReenterTransition__super() {
        return super.getReenterTransition();
    }

    public Object getReturnTransition__super() {
        return super.getReturnTransition();
    }

    public Object getSharedElementEnterTransition__super() {
        return super.getSharedElementEnterTransition();
    }

    public Object getSharedElementReturnTransition__super() {
        return super.getSharedElementReturnTransition();
    }

    /**
     * Return the current value of {@link #setShowsDialog(boolean)}.
     */
    @Override
    public boolean getShowsDialog() {
        return delegate.getShowsDialog();
    }

    public boolean getShowsDialog__super() {
        return super.getShowsDialog();
    }

    @Override
    public int getTheme() {
        return delegate.getTheme();
    }

    public int getTheme__super() {
        return super.getTheme();
    }

    public boolean getUserVisibleHint__super() {
        return super.getUserVisibleHint();
    }

    @Nullable
    public View getView__super() {
        return super.getView();
    }

    /**
     * Return the current value of {@link #setCancelable(boolean)}.
     */
    @Override
    public boolean isCancelable() {
        return delegate.isCancelable();
    }

    public boolean isCancelable__super() {
        return super.isCancelable();
    }

    @Override
    public void onActivityCreated(final Bundle savedInstanceState) {
        delegate.onActivityCreated(savedInstanceState);
    }

    public void onActivityCreated__super(final Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    public void onActivityResult__super(final int requestCode, final int resultCode,
            final Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onAttach(final Activity activity) {
        delegate.onAttach(activity);
    }

    public void onAttach__super(final Activity activity) {
        super.onAttach(activity);
    }

    public void onAttach__super(final Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCancel(final DialogInterface dialog) {
        delegate.onCancel(dialog);
    }

    public void onCancel__super(final DialogInterface dialog) {
        super.onCancel(dialog);
    }

    public void onConfigurationChanged__super(final Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    public boolean onContextItemSelected__super(final MenuItem item) {
        return super.onContextItemSelected(item);
    }

    @Override
    public void onCreate(@Nullable final Bundle savedInstanceState) {
        delegate.onCreate(savedInstanceState);
    }

    public Animation onCreateAnimation__super(final int transit, final boolean enter,
            final int nextAnim) {
        return super.onCreateAnimation(transit, enter, nextAnim);
    }

    public void onCreateContextMenu__super(final ContextMenu menu, final View v,
            final ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    /**
     * Override to build your own custom Dialog container.  This is typically
     * used to show an AlertDialog instead of a generic Dialog; when doing so,
     * {@link #onCreateView(LayoutInflater, ViewGroup, Bundle)} does not need
     * to be implemented since the AlertDialog takes care of its own content.
     *
     * <p>This method will be called after {@link #onCreate(Bundle)} and
     * before {@link #onCreateView(LayoutInflater, ViewGroup, Bundle)}.  The
     * default implementation simply instantiates and returns a {@link Dialog}
     * class.
     *
     * <p><em>Note: DialogFragment own the {@link Dialog#setOnCancelListener
     * Dialog.setOnCancelListener} and {@link Dialog#setOnDismissListener
     * Dialog.setOnDismissListener} callbacks.  You must not set them yourself.</em>
     * To find out about these events, override {@link #onCancel(DialogInterface)}
     * and {@link #onDismiss(DialogInterface)}.</p>
     *
     * @param savedInstanceState The last saved instance state of the Fragment,
     *                           or null if this is a freshly created Fragment.
     * @return Return a new Dialog instance to be displayed by the Fragment.
     */
    @NonNull
    @Override
    public Dialog onCreateDialog(final Bundle savedInstanceState) {
        return delegate.onCreateDialog(savedInstanceState);
    }

    @NonNull
    public Dialog onCreateDialog__super(final Bundle savedInstanceState) {
        return super.onCreateDialog(savedInstanceState);
    }

    public void onCreateOptionsMenu__super(final Menu menu, final MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Nullable
    public View onCreateView__super(final LayoutInflater inflater,
            @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    public void onCreate__super(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void onDestroyOptionsMenu__super() {
        super.onDestroyOptionsMenu();
    }

    /**
     * Remove dialog.
     */
    @Override
    public void onDestroyView() {
        delegate.onDestroyView();
    }

    public void onDestroyView__super() {
        super.onDestroyView();
    }

    public void onDestroy__super() {
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        delegate.onDetach();
    }

    public void onDetach__super() {
        super.onDetach();
    }

    @Override
    public void onDismiss(final DialogInterface dialog) {
        delegate.onDismiss(dialog);
    }

    public void onDismiss__super(final DialogInterface dialog) {
        super.onDismiss(dialog);
    }

    public void onHiddenChanged__super(final boolean hidden) {
        super.onHiddenChanged(hidden);
    }

    public void onInflate__super(final Context context, final AttributeSet attrs,
            final Bundle savedInstanceState) {
        super.onInflate(context, attrs, savedInstanceState);
    }

    public void onInflate__super(final Activity activity, final AttributeSet attrs,
            final Bundle savedInstanceState) {
        super.onInflate(activity, attrs, savedInstanceState);
    }

    public void onLowMemory__super() {
        super.onLowMemory();
    }

    public boolean onOptionsItemSelected__super(final MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    public void onOptionsMenuClosed__super(final Menu menu) {
        super.onOptionsMenuClosed(menu);
    }

    public void onPause__super() {
        super.onPause();
    }

    public void onPrepareOptionsMenu__super(final Menu menu) {
        super.onPrepareOptionsMenu(menu);
    }

    public void onRequestPermissionsResult__super(final int requestCode,
            @NonNull final String[] permissions, @NonNull final int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    public void onResume__super() {
        super.onResume();
    }

    @Override
    public void onSaveInstanceState(final Bundle outState) {
        delegate.onSaveInstanceState(outState);
    }

    public void onSaveInstanceState__super(final Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onStart() {
        delegate.onStart();
    }

    public void onStart__super() {
        super.onStart();
    }

    @Override
    public void onStop() {
        delegate.onStop();
    }

    public void onStop__super() {
        super.onStop();
    }

    public void onViewCreated__super(final View view, @Nullable final Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    public void onViewStateRestored__super(@Nullable final Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
    }

    public void registerForContextMenu__super(final View view) {
        super.registerForContextMenu(view);
    }

    public void setAllowEnterTransitionOverlap__super(final boolean allow) {
        super.setAllowEnterTransitionOverlap(allow);
    }

    public void setAllowReturnTransitionOverlap__super(final boolean allow) {
        super.setAllowReturnTransitionOverlap(allow);
    }

    public void setArguments__super(final Bundle args) {
        super.setArguments(args);
    }

    /**
     * Control whether the shown Dialog is cancelable.  Use this instead of
     * directly calling {@link Dialog#setCancelable(boolean)
     * Dialog.setCancelable(boolean)}, because DialogFragment needs to change
     * its behavior based on this.
     *
     * @param cancelable If true, the dialog is cancelable.  The default
     *                   is true.
     */
    @Override
    public void setCancelable(final boolean cancelable) {
        delegate.setCancelable(cancelable);
    }

    public void setCancelable__super(final boolean cancelable) {
        super.setCancelable(cancelable);
    }

    public void setEnterSharedElementCallback__super(final SharedElementCallback callback) {
        super.setEnterSharedElementCallback(callback);
    }

    public void setEnterTransition__super(final Object transition) {
        super.setEnterTransition(transition);
    }

    public void setExitSharedElementCallback__super(final SharedElementCallback callback) {
        super.setExitSharedElementCallback(callback);
    }

    public void setExitTransition__super(final Object transition) {
        super.setExitTransition(transition);
    }

    public void setHasOptionsMenu__super(final boolean hasMenu) {
        super.setHasOptionsMenu(hasMenu);
    }

    public void setInitialSavedState__super(final Fragment.SavedState state) {
        super.setInitialSavedState(state);
    }

    public void setMenuVisibility__super(final boolean menuVisible) {
        super.setMenuVisibility(menuVisible);
    }

    public void setReenterTransition__super(final Object transition) {
        super.setReenterTransition(transition);
    }

    public void setRetainInstance__super(final boolean retain) {
        super.setRetainInstance(retain);
    }

    public void setReturnTransition__super(final Object transition) {
        super.setReturnTransition(transition);
    }

    public void setSharedElementEnterTransition__super(final Object transition) {
        super.setSharedElementEnterTransition(transition);
    }

    public void setSharedElementReturnTransition__super(final Object transition) {
        super.setSharedElementReturnTransition(transition);
    }

    /**
     * Controls whether this fragment should be shown in a dialog.  If not
     * set, no Dialog will be created in {@link #onActivityCreated(Bundle)},
     * and the fragment's view hierarchy will thus not be added to it.  This
     * allows you to instead use it as a normal fragment (embedded inside of
     * its activity).
     *
     * <p>This is normally set for you based on whether the fragment is
     * associated with a container view ID passed to
     * {@link FragmentTransaction#add(int, Fragment) FragmentTransaction.add(int, Fragment)}.
     * If the fragment was added with a container, setShowsDialog will be
     * initialized to false; otherwise, it will be true.
     *
     * @param showsDialog If true, the fragment will be displayed in a Dialog.
     *                    If false, no Dialog will be created and the fragment's view hierarchly
     *                    left undisturbed.
     */
    @Override
    public void setShowsDialog(final boolean showsDialog) {
        delegate.setShowsDialog(showsDialog);
    }

    public void setShowsDialog__super(final boolean showsDialog) {
        super.setShowsDialog(showsDialog);
    }

    /**
     * Call to customize the basic appearance and behavior of the
     * fragment's dialog.  This can be used for some common dialog behaviors,
     * taking care of selecting flags, theme, and other options for you.  The
     * same effect can be achieve by manually setting Dialog and Window
     * attributes yourself.  Calling this after the fragment's Dialog is
     * created will have no effect.
     *
     * @param style Selects a standard style: may be {@link #STYLE_NORMAL},
     *              {@link #STYLE_NO_TITLE}, {@link #STYLE_NO_FRAME}, or
     *              {@link #STYLE_NO_INPUT}.
     * @param theme Optional custom theme.  If 0, an appropriate theme (based
     */
    @Override
    public void setStyle(final int style, @StyleRes final int theme) {
        delegate.setStyle(style, theme);
    }

    public void setStyle__super(final int style, @StyleRes final int theme) {
        super.setStyle(style, theme);
    }

    public void setTargetFragment__super(final Fragment fragment, final int requestCode) {
        super.setTargetFragment(fragment, requestCode);
    }

    public void setUserVisibleHint__super(final boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
    }

    /**
     * @hide
     */
    @Override
    public void setupDialog(final Dialog dialog, final int style) {
        delegate.setupDialog(dialog, style);
    }

    public void setupDialog__super(final Dialog dialog, final int style) {
        super.setupDialog(dialog, style);
    }

    public boolean shouldShowRequestPermissionRationale__super(@NonNull final String permission) {
        return super.shouldShowRequestPermissionRationale(permission);
    }

    /**
     * Display the dialog, adding the fragment to the given FragmentManager.  This
     * is a convenience for explicitly creating a transaction, adding the
     * fragment to it with the given tag, and committing it.  This does
     * <em>not</em> add the transaction to the back stack.  When the fragment
     * is dismissed, a new transaction will be executed to remove it from
     * the activity.
     *
     * @param manager The FragmentManager this fragment will be added to.
     * @param tag     The tag for this fragment, as per
     *                {@link FragmentTransaction#add(Fragment, String) FragmentTransaction.add}.
     */
    @Override
    public void show(final FragmentManager manager, final String tag) {
        delegate.show(manager, tag);
    }

    /**
     * Display the dialog, adding the fragment using an existing transaction
     * and then committing the transaction.
     *
     * @param transaction An existing transaction in which to add the fragment.
     * @param tag         The tag for this fragment, as per
     *                    {@link FragmentTransaction#add(Fragment, String) FragmentTransaction.add}.
     * @return Returns the identifier of the committed transaction, as per
     * {@link FragmentTransaction#commit() FragmentTransaction.commit()}.
     */
    @Override
    public int show(final FragmentTransaction transaction, final String tag) {
        return delegate.show(transaction, tag);
    }

    public void show__super(final FragmentManager manager, final String tag) {
        super.show(manager, tag);
    }

    public int show__super(final FragmentTransaction transaction, final String tag) {
        return super.show(transaction, tag);
    }

    public void startActivityForResult__super(final Intent intent, final int requestCode) {
        super.startActivityForResult(intent, requestCode);
    }

    public void startActivityForResult__super(final Intent intent, final int requestCode,
            @Nullable final Bundle options) {
        super.startActivityForResult(intent, requestCode, options);
    }

    public void startActivity__super(final Intent intent) {
        super.startActivity(intent);
    }

    public void startActivity__super(final Intent intent, @Nullable final Bundle options) {
        super.startActivity(intent, options);
    }

    public String toString__super() {
        return super.toString();
    }

    public void unregisterForContextMenu__super(final View view) {
        super.unregisterForContextMenu(view);
    }
}
