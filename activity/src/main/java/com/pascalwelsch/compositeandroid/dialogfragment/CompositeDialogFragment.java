package com.pascalwelsch.compositeandroid.dialogfragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
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
import android.transition.ChangeBounds;
import android.transition.Visibility;
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



            import android.support.v4.app.DialogFragment;
            import android.support.v4.app.FragmentActivity;
            import android.support.v4.app.FragmentHostCallback;
            import android.support.v4.app.SharedElementCallback;
            
@SuppressWarnings({"unused", "deprecation", "JavadocReference", "WrongConstant"})
@SuppressLint({"MissingSuperCall", "NewApi"})
public class CompositeDialogFragment extends CompositeDialogFragmentBase {

    /**
     * Dismiss the fragment and its dialog.  If the fragment was added to the
     * back stack, all back stack state up to and including this entry will
     * be popped.  Otherwise, a new transaction will be committed to remove
     * the fragment.
     */
    @Override
    public void dismiss()  {
        delegate.dismiss();
    }

    
    protected void dismiss__super()  {
        super.dismiss();
    }

    /**
     * Version of {@link #dismiss()} that uses
     * {@link FragmentTransaction#commitAllowingStateLoss()
     * FragmentTransaction.commitAllowingStateLoss()}. See linked
     * documentation for further details.
     */
    @Override
    public void dismissAllowingStateLoss()  {
        delegate.dismissAllowingStateLoss();
    }

    
    protected void dismissAllowingStateLoss__super()  {
        super.dismissAllowingStateLoss();
    }

    /**
     * Print the Fragments's state into the given stream.
     *
     * @param prefix Text to print at the front of each line.
     * @param fd     The raw file descriptor that the dump is being sent to.
     * @param writer The PrintWriter to which you should dump your state.  This will be
     *               closed for you after you return.
     * @param args   additional arguments to the dump request.
     */
    @Override
    public void dump(final String prefix, final FileDescriptor fd, final PrintWriter writer,             final String[] args)  {
        delegate.dump(prefix, fd, writer, args);
    }

    
    protected void dump__super(final String prefix, final FileDescriptor fd, final PrintWriter writer,             final String[] args)  {
        super.dump(prefix, fd, writer, args);
    }

    /**
     * Returns whether the the exit transition and enter transition overlap or not.
     * When true, the enter transition will start as soon as possible. When false, the
     * enter transition will wait until the exit transition completes before starting.
     *
     * @return true when the enter transition should start as soon as possible or false to
     * when it should wait until the exiting transition completes.
     */
    @Override
    public boolean getAllowEnterTransitionOverlap()  {
        return delegate.getAllowEnterTransitionOverlap();
    }

    
    protected boolean getAllowEnterTransitionOverlap__super()  {
        return super.getAllowEnterTransitionOverlap();
    }

    /**
     * Returns whether the the return transition and reenter transition overlap or not.
     * When true, the reenter transition will start as soon as possible. When false, the
     * reenter transition will wait until the return transition completes before starting.
     *
     * @return true to start the reenter transition when possible or false to wait until the
     * return transition completes.
     */
    @Override
    public boolean getAllowReturnTransitionOverlap()  {
        return delegate.getAllowReturnTransitionOverlap();
    }

    
    protected boolean getAllowReturnTransitionOverlap__super()  {
        return super.getAllowReturnTransitionOverlap();
    }

    /**
     * Return the {@link Context} this fragment is currently associated with.
     */
    @Override
    public Context getContext()  {
        return delegate.getContext();
    }

    
    protected Context getContext__super()  {
        return super.getContext();
    }

    @Override
    public Dialog getDialog()  {
        return delegate.getDialog();
    }

    
    protected Dialog getDialog__super()  {
        return super.getDialog();
    }

    /**
     * Returns the Transition that will be used to move Views into the initial scene. The entering
     * Views will be those that are regular Views or ViewGroups that have
     * {@link ViewGroup#isTransitionGroup} return true. Typical Transitions will extend
     * {@link Visibility} as entering is governed by changing visibility from
     * {@link View#INVISIBLE} to {@link View#VISIBLE}.
     *
     * @return the Transition to use to move Views into the initial Scene.
     */
    @Override
    public Object getEnterTransition()  {
        return delegate.getEnterTransition();
    }

    
    protected Object getEnterTransition__super()  {
        return super.getEnterTransition();
    }

    /**
     * Returns the Transition that will be used to move Views out of the scene when the
     * fragment is removed, hidden, or detached when not popping the back stack.
     * The exiting Views will be those that are regular Views or ViewGroups that
     * have {@link ViewGroup#isTransitionGroup} return true. Typical Transitions will extend
     * {@link Visibility} as exiting is governed by changing visibility
     * from {@link View#VISIBLE} to {@link View#INVISIBLE}. If transition is null, the views will
     * remain unaffected.
     *
     * @return the Transition to use to move Views out of the Scene when the Fragment
     * is being closed not due to popping the back stack.
     */
    @Override
    public Object getExitTransition()  {
        return delegate.getExitTransition();
    }

    
    protected Object getExitTransition__super()  {
        return super.getExitTransition();
    }

    /**
     * @hide
     */
    @Override
    public LayoutInflater getLayoutInflater(final Bundle savedInstanceState)  {
        return delegate.getLayoutInflater(savedInstanceState);
    }

    
    protected LayoutInflater getLayoutInflater__super(final Bundle savedInstanceState)  {
        return super.getLayoutInflater(savedInstanceState);
    }

    /**
     * Return the LoaderManager for this fragment, creating it if needed.
     */
    @Override
    public LoaderManager getLoaderManager()  {
        return delegate.getLoaderManager();
    }

    
    protected LoaderManager getLoaderManager__super()  {
        return super.getLoaderManager();
    }

    /**
     * Returns the Transition that will be used to move Views in to the scene when returning due
     * to popping a back stack. The entering Views will be those that are regular Views
     * or ViewGroups that have {@link ViewGroup#isTransitionGroup} return true. Typical Transitions
     * will extend {@link Visibility} as exiting is governed by changing
     * visibility from {@link View#VISIBLE} to {@link View#INVISIBLE}. If transition is null,
     * the views will remain unaffected. If nothing is set, the default will be to use the same
     * transition as {@link #setExitTransition(Object)}.
     *
     * @return the Transition to use to move Views into the scene when reentering from a
     * previously-started Activity.
     */
    @Override
    public Object getReenterTransition()  {
        return delegate.getReenterTransition();
    }

    
    protected Object getReenterTransition__super()  {
        return super.getReenterTransition();
    }

    /**
     * Returns the Transition that will be used to move Views out of the scene when the Fragment is
     * preparing to be removed, hidden, or detached because of popping the back stack. The exiting
     * Views will be those that are regular Views or ViewGroups that have
     * {@link ViewGroup#isTransitionGroup} return true. Typical Transitions will extend
     * {@link Visibility} as entering is governed by changing visibility from
     * {@link View#VISIBLE} to {@link View#INVISIBLE}. If <code>transition</code> is null,
     * entering Views will remain unaffected.
     *
     * @return the Transition to use to move Views out of the Scene when the Fragment
     * is preparing to close.
     */
    @Override
    public Object getReturnTransition()  {
        return delegate.getReturnTransition();
    }

    
    protected Object getReturnTransition__super()  {
        return super.getReturnTransition();
    }

    /**
     * Returns the Transition that will be used for shared elements transferred into the content
     * Scene. Typical Transitions will affect size and location, such as
     * {@link ChangeBounds}. A null
     * value will cause transferred shared elements to blink to the final position.
     *
     * @return The Transition to use for shared elements transferred into the content
     * Scene.
     */
    @Override
    public Object getSharedElementEnterTransition()  {
        return delegate.getSharedElementEnterTransition();
    }

    
    protected Object getSharedElementEnterTransition__super()  {
        return super.getSharedElementEnterTransition();
    }

    /**
     * Return the Transition that will be used for shared elements transferred back during a
     * pop of the back stack. This Transition acts in the leaving Fragment.
     * Typical Transitions will affect size and location, such as
     * {@link ChangeBounds}. A null
     * value will cause transferred shared elements to blink to the final position.
     * If no value is set, the default will be to use the same value as
     * {@link #setSharedElementEnterTransition(Object)}.
     *
     * @return The Transition to use for shared elements transferred out of the content
     * Scene.
     */
    @Override
    public Object getSharedElementReturnTransition()  {
        return delegate.getSharedElementReturnTransition();
    }

    
    protected Object getSharedElementReturnTransition__super()  {
        return super.getSharedElementReturnTransition();
    }

    /**
     * Return the current value of {@link #setShowsDialog(boolean)}.
     */
    @Override
    public boolean getShowsDialog()  {
        return delegate.getShowsDialog();
    }

    
    protected boolean getShowsDialog__super()  {
        return super.getShowsDialog();
    }

    @Override
    public int getTheme()  {
        return delegate.getTheme();
    }

    
    protected int getTheme__super()  {
        return super.getTheme();
    }

    /**
     * @return The current value of the user-visible hint on this fragment.
     * @see #setUserVisibleHint(boolean)
     */
    @Override
    public boolean getUserVisibleHint()  {
        return delegate.getUserVisibleHint();
    }

    
    protected boolean getUserVisibleHint__super()  {
        return super.getUserVisibleHint();
    }

    /**
     * Get the root view for the fragment's layout (the one returned by {@link #onCreateView}),
     * if provided.
     *
     * @return The fragment's root view, or null if it has no layout.
     */
    @Nullable
@Override
    public View getView()  {
        return delegate.getView();
    }

    @Nullable
    protected View getView__super()  {
        return super.getView();
    }

    /**
     * Return the current value of {@link #setCancelable(boolean)}.
     */
    @Override
    public boolean isCancelable()  {
        return delegate.isCancelable();
    }

    
    protected boolean isCancelable__super()  {
        return super.isCancelable();
    }

    @Override
    public void onActivityCreated(final Bundle savedInstanceState)  {
        delegate.onActivityCreated(savedInstanceState);
    }

    
    protected void onActivityCreated__super(final Bundle savedInstanceState)  {
        super.onActivityCreated(savedInstanceState);
    }

    /**
     * Receive the result from a previous call to
     * {@link #startActivityForResult(Intent, int)}.  This follows the
     * related Activity API as described there in
     * {@link Activity#onActivityResult(int, int, Intent)}.
     *
     * @param requestCode The integer request code originally supplied to
     *                    startActivityForResult(), allowing you to identify who this
     *                    result came from.
     * @param resultCode  The integer result code returned by the child activity
     *                    through its setResult().
     * @param data        An Intent, which can return result data to the caller
     */
    @Override
    public void onActivityResult(final int requestCode, final int resultCode, final Intent data)  {
        delegate.onActivityResult(requestCode, resultCode, data);
    }

    
    protected void onActivityResult__super(final int requestCode, final int resultCode, final Intent data)  {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onAttach(final Activity activity)  {
        delegate.onAttach(activity);
    }

    
    protected void onAttach__super(final Activity activity)  {
        super.onAttach(activity);
    }

    /**
     * Called when a fragment is first attached to its context.
     * {@link #onCreate(Bundle)} will be called after this.
     */
    @Override
    public void onAttach(final Context context)  {
        delegate.onAttach(context);
    }

    
    protected void onAttach__super(final Context context)  {
        super.onAttach(context);
    }

    @Override
    public void onCancel(final DialogInterface dialog)  {
        delegate.onCancel(dialog);
    }

    
    protected void onCancel__super(final DialogInterface dialog)  {
        super.onCancel(dialog);
    }

    @Override
    public void onConfigurationChanged(final Configuration newConfig)  {
        delegate.onConfigurationChanged(newConfig);
    }

    
    protected void onConfigurationChanged__super(final Configuration newConfig)  {
        super.onConfigurationChanged(newConfig);
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
    @Override
    public boolean onContextItemSelected(final MenuItem item)  {
        return delegate.onContextItemSelected(item);
    }

    
    protected boolean onContextItemSelected__super(final MenuItem item)  {
        return super.onContextItemSelected(item);
    }

    @Override
    public void onCreate(@Nullable final Bundle savedInstanceState)  {
        delegate.onCreate(savedInstanceState);
    }

    
    protected void onCreate__super(@Nullable final Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
    }

    /**
     * Called when a fragment loads an animation.
     */
    @Override
    public Animation onCreateAnimation(final int transit, final boolean enter, final int nextAnim)  {
        return delegate.onCreateAnimation(transit, enter, nextAnim);
    }

    
    protected Animation onCreateAnimation__super(final int transit, final boolean enter, final int nextAnim)  {
        return super.onCreateAnimation(transit, enter, nextAnim);
    }

    /**
     * Called when a context menu for the {@code view} is about to be shown.
     * Unlike {@link #onCreateOptionsMenu}, this will be called every
     * time the context menu is about to be shown and should be populated for
     * the view (or item inside the view for {@link AdapterView} subclasses,
     * this can be found in the {@code menuInfo})).
     * <p>
     * Use {@link #onContextItemSelected(MenuItem)} to know when an
     * item has been selected.
     * <p>
     * The default implementation calls up to
     * {@link Activity#onCreateContextMenu Activity.onCreateContextMenu}, though
     * you can not call this implementation if you don't want that behavior.
     * <p>
     * It is not safe to hold onto the context menu after this method returns.
     * {@inheritDoc}
     */
    @Override
    public void onCreateContextMenu(final ContextMenu menu, final View v,             final ContextMenu.ContextMenuInfo menuInfo)  {
        delegate.onCreateContextMenu(menu, v, menuInfo);
    }

    
    protected void onCreateContextMenu__super(final ContextMenu menu, final View v,             final ContextMenu.ContextMenuInfo menuInfo)  {
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
    public Dialog onCreateDialog(final Bundle savedInstanceState)  {
        return delegate.onCreateDialog(savedInstanceState);
    }

    @NonNull
    protected Dialog onCreateDialog__super(final Bundle savedInstanceState)  {
        return super.onCreateDialog(savedInstanceState);
    }

    /**
     * Initialize the contents of the Activity's standard options menu.  You
     * should place your menu items in to <var>menu</var>.  For this method
     * to be called, you must have first called {@link #setHasOptionsMenu}.  See
     * {@link Activity#onCreateOptionsMenu(Menu) Activity.onCreateOptionsMenu}
     * for more information.
     *
     * @param menu The options menu in which you place your items.
     * @see #setHasOptionsMenu
     * @see #onPrepareOptionsMenu
     * @see #onOptionsItemSelected
     */
    @Override
    public void onCreateOptionsMenu(final Menu menu, final MenuInflater inflater)  {
        delegate.onCreateOptionsMenu(menu, inflater);
    }

    
    protected void onCreateOptionsMenu__super(final Menu menu, final MenuInflater inflater)  {
        super.onCreateOptionsMenu(menu, inflater);
    }

    /**
     * Called to have the fragment instantiate its user interface view.
     * This is optional, and non-graphical fragments can return null (which
     * is the default implementation).  This will be called between
     * {@link #onCreate(Bundle)} and {@link #onActivityCreated(Bundle)}.
     *
     * <p>If you return a View from here, you will later be called in
     * {@link #onDestroyView} when the view is being released.
     *
     * @param inflater           The LayoutInflater object that can be used to inflate
     *                           any views in the fragment,
     * @param container          If non-null, this is the parent view that the fragment's
     *                           UI should be attached to.  The fragment should not add the view
     *                           itself,
     *                           but this can be used to generate the LayoutParams of the view.
     * @param savedInstanceState If non-null, this fragment is being re-constructed
     *                           from a previous saved state as given here.
     * @return Return the View for the fragment's UI, or null.
     */
    @Nullable
@Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container,             @Nullable final Bundle savedInstanceState)  {
        return delegate.onCreateView(inflater, container, savedInstanceState);
    }

    @Nullable
    protected View onCreateView__super(final LayoutInflater inflater, @Nullable final ViewGroup container,             @Nullable final Bundle savedInstanceState)  {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    /**
     * Called when the fragment is no longer in use.  This is called
     * after {@link #onStop()} and before {@link #onDetach()}.
     */
    @Override
    public void onDestroy()  {
        delegate.onDestroy();
    }

    
    protected void onDestroy__super()  {
        super.onDestroy();
    }

    /**
     * Called when this fragment's option menu items are no longer being
     * included in the overall options menu.  Receiving this call means that
     * the menu needed to be rebuilt, but this fragment's items were not
     * included in the newly built menu (its {@link #onCreateOptionsMenu(Menu, MenuInflater)}
     * was not called).
     */
    @Override
    public void onDestroyOptionsMenu()  {
        delegate.onDestroyOptionsMenu();
    }

    
    protected void onDestroyOptionsMenu__super()  {
        super.onDestroyOptionsMenu();
    }

    /**
     * Remove dialog.
     */
    @Override
    public void onDestroyView()  {
        delegate.onDestroyView();
    }

    
    protected void onDestroyView__super()  {
        super.onDestroyView();
    }

    @Override
    public void onDetach()  {
        delegate.onDetach();
    }

    
    protected void onDetach__super()  {
        super.onDetach();
    }

    @Override
    public void onDismiss(final DialogInterface dialog)  {
        delegate.onDismiss(dialog);
    }

    
    protected void onDismiss__super(final DialogInterface dialog)  {
        super.onDismiss(dialog);
    }

    /**
     * Called when the hidden state (as returned by {@link #isHidden()} of
     * the fragment has changed.  Fragments start out not hidden; this will
     * be called whenever the fragment changes state from that.
     *
     * @param hidden True if the fragment is now hidden, false if it is not
     *               visible.
     */
    @Override
    public void onHiddenChanged(final boolean hidden)  {
        delegate.onHiddenChanged(hidden);
    }

    
    protected void onHiddenChanged__super(final boolean hidden)  {
        super.onHiddenChanged(hidden);
    }

    /**
     * Called when a fragment is being created as part of a view layout
     * inflation, typically from setting the content view of an activity.  This
     * may be called immediately after the fragment is created from a <fragment>
     * tag in a layout file.  Note this is <em>before</em> the fragment's
     * {@link #onAttach(Activity)} has been called; all you should do here is
     * parse the attributes and save them away.
     *
     * <p>This is called every time the fragment is inflated, even if it is
     * being inflated into a new instance with saved state.  It typically makes
     * sense to re-parse the parameters each time, to allow them to change with
     * different configurations.</p>
     *
     * <p>Here is a typical implementation of a fragment that can take parameters
     * both through attributes supplied here as well from {@link #getArguments()}:</p>
     *
     * {@sample development/samples/ApiDemos/src/com/example/android/apis/app/FragmentArguments.java
     * fragment}
     *
     * <p>Note that parsing the XML attributes uses a "styleable" resource.  The
     * declaration for the styleable used here is:</p>
     *
     * {@sample development/samples/ApiDemos/res/values/attrs.xml fragment_arguments}
     *
     * <p>The fragment can then be declared within its activity's content layout
     * through a tag like this:</p>
     *
     * {@sample development/samples/ApiDemos/res/layout/fragment_arguments.xml from_attributes}
     *
     * <p>This fragment can also be created dynamically from arguments given
     * at runtime in the arguments Bundle; here is an example of doing so at
     * creation of the containing activity:</p>
     *
     * {@sample development/samples/ApiDemos/src/com/example/android/apis/app/FragmentArguments.java
     * create}
     *
     * @param context            The Activity that is inflating this fragment.
     * @param attrs              The attributes at the tag where the fragment is
     *                           being created.
     * @param savedInstanceState If the fragment is being re-created from
     */
    @Override
    public void onInflate(final Context context, final AttributeSet attrs,             final Bundle savedInstanceState)  {
        delegate.onInflate(context, attrs, savedInstanceState);
    }

    
    protected void onInflate__super(final Context context, final AttributeSet attrs,             final Bundle savedInstanceState)  {
        super.onInflate(context, attrs, savedInstanceState);
    }

    /**
     * Called when a fragment is being created as part of a view layout
     * inflation, typically from setting the content view of an activity.
     * <p>Deprecated. See {@link #onInflate(Context, AttributeSet, Bundle)}.
     */
    @Override
    public void onInflate(final Activity activity, final AttributeSet attrs,             final Bundle savedInstanceState)  {
        delegate.onInflate(activity, attrs, savedInstanceState);
    }

    
    protected void onInflate__super(final Activity activity, final AttributeSet attrs,             final Bundle savedInstanceState)  {
        super.onInflate(activity, attrs, savedInstanceState);
    }

    @Override
    public void onLowMemory()  {
        delegate.onLowMemory();
    }

    
    protected void onLowMemory__super()  {
        super.onLowMemory();
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
     * perform the default menu handling.
     *
     * @param item The menu item that was selected.
     * @return boolean Return false to allow normal menu processing to
     * proceed, true to consume it here.
     * @see #onCreateOptionsMenu
     */
    @Override
    public boolean onOptionsItemSelected(final MenuItem item)  {
        return delegate.onOptionsItemSelected(item);
    }

    
    protected boolean onOptionsItemSelected__super(final MenuItem item)  {
        return super.onOptionsItemSelected(item);
    }

    /**
     * This hook is called whenever the options menu is being closed (either by the user canceling
     * the menu with the back/menu button, or when an item is selected).
     *
     * @param menu The options menu as last shown or first initialized by
     *             onCreateOptionsMenu().
     */
    @Override
    public void onOptionsMenuClosed(final Menu menu)  {
        delegate.onOptionsMenuClosed(menu);
    }

    
    protected void onOptionsMenuClosed__super(final Menu menu)  {
        super.onOptionsMenuClosed(menu);
    }

    /**
     * Called when the Fragment is no longer resumed.  This is generally
     * tied to {@link Activity#onPause() Activity.onPause} of the containing
     * Activity's lifecycle.
     */
    @Override
    public void onPause()  {
        delegate.onPause();
    }

    
    protected void onPause__super()  {
        super.onPause();
    }

    /**
     * Prepare the Screen's standard options menu to be displayed.  This is
     * called right before the menu is shown, every time it is shown.  You can
     * use this method to efficiently enable/disable items or otherwise
     * dynamically modify the contents.  See
     * {@link Activity#onPrepareOptionsMenu(Menu) Activity.onPrepareOptionsMenu}
     * for more information.
     *
     * @param menu The options menu as last shown or first initialized by
     *             onCreateOptionsMenu().
     * @see #setHasOptionsMenu
     * @see #onCreateOptionsMenu
     */
    @Override
    public void onPrepareOptionsMenu(final Menu menu)  {
        delegate.onPrepareOptionsMenu(menu);
    }

    
    protected void onPrepareOptionsMenu__super(final Menu menu)  {
        super.onPrepareOptionsMenu(menu);
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
    public void onRequestPermissionsResult(final int requestCode,             @NonNull final String[] permissions,             @NonNull final int[] grantResults)  {
        delegate.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    
    protected void onRequestPermissionsResult__super(final int requestCode,             @NonNull final String[] permissions,             @NonNull final int[] grantResults)  {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    /**
     * Called when the fragment is visible to the user and actively running.
     * This is generally
     * tied to {@link Activity#onResume() Activity.onResume} of the containing
     * Activity's lifecycle.
     */
    @Override
    public void onResume()  {
        delegate.onResume();
    }

    
    protected void onResume__super()  {
        super.onResume();
    }

    @Override
    public void onSaveInstanceState(final Bundle outState)  {
        delegate.onSaveInstanceState(outState);
    }

    
    protected void onSaveInstanceState__super(final Bundle outState)  {
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onStart()  {
        delegate.onStart();
    }

    
    protected void onStart__super()  {
        super.onStart();
    }

    @Override
    public void onStop()  {
        delegate.onStop();
    }

    
    protected void onStop__super()  {
        super.onStop();
    }

    /**
     * Called immediately after {@link #onCreateView(LayoutInflater, ViewGroup, Bundle)}
     * has returned, but before any saved state has been restored in to the view.
     * This gives subclasses a chance to initialize themselves once
     * they know their view hierarchy has been completely created.  The fragment's
     * view hierarchy is not however attached to its parent at this point.
     *
     * @param view               The View returned by {@link #onCreateView(LayoutInflater,
     *                           ViewGroup, Bundle)}.
     * @param savedInstanceState If non-null, this fragment is being re-constructed
     */
    @Override
    public void onViewCreated(final View view, @Nullable final Bundle savedInstanceState)  {
        delegate.onViewCreated(view, savedInstanceState);
    }

    
    protected void onViewCreated__super(final View view, @Nullable final Bundle savedInstanceState)  {
        super.onViewCreated(view, savedInstanceState);
    }

    /**
     * Called when all saved state has been restored into the view hierarchy
     * of the fragment.  This can be used to do initialization based on saved
     * state that you are letting the view hierarchy track itself, such as
     * whether check box widgets are currently checked.  This is called
     * after {@link #onActivityCreated(Bundle)} and before
     * {@link #onStart()}.
     *
     * @param savedInstanceState If the fragment is being re-created from
     *                           a previous saved state, this is the state.
     */
    @Override
    public void onViewStateRestored(@Nullable final Bundle savedInstanceState)  {
        delegate.onViewStateRestored(savedInstanceState);
    }

    
    protected void onViewStateRestored__super(@Nullable final Bundle savedInstanceState)  {
        super.onViewStateRestored(savedInstanceState);
    }

    /**
     * Registers a context menu to be shown for the given view (multiple views
     * can show the context menu). This method will set the
     * {@link OnCreateContextMenuListener} on the view to this fragment, so
     * {@link #onCreateContextMenu(ContextMenu, View, ContextMenuInfo)} will be
     * called when it is time to show the context menu.
     *
     * @param view The view that should show a context menu.
     * @see #unregisterForContextMenu(View)
     */
    @Override
    public void registerForContextMenu(final View view)  {
        delegate.registerForContextMenu(view);
    }

    
    protected void registerForContextMenu__super(final View view)  {
        super.registerForContextMenu(view);
    }

    /**
     * Sets whether the the exit transition and enter transition overlap or not.
     * When true, the enter transition will start as soon as possible. When false, the
     * enter transition will wait until the exit transition completes before starting.
     *
     * @param allow true to start the enter transition when possible or false to
     *              wait until the exiting transition completes.
     */
    @Override
    public void setAllowEnterTransitionOverlap(final boolean allow)  {
        delegate.setAllowEnterTransitionOverlap(allow);
    }

    
    protected void setAllowEnterTransitionOverlap__super(final boolean allow)  {
        super.setAllowEnterTransitionOverlap(allow);
    }

    /**
     * Sets whether the the return transition and reenter transition overlap or not.
     * When true, the reenter transition will start as soon as possible. When false, the
     * reenter transition will wait until the return transition completes before starting.
     *
     * @param allow true to start the reenter transition when possible or false to wait until the
     *              return transition completes.
     */
    @Override
    public void setAllowReturnTransitionOverlap(final boolean allow)  {
        delegate.setAllowReturnTransitionOverlap(allow);
    }

    
    protected void setAllowReturnTransitionOverlap__super(final boolean allow)  {
        super.setAllowReturnTransitionOverlap(allow);
    }

    /**
     * Supply the construction arguments for this fragment.  This can only
     * be called before the fragment has been attached to its activity; that
     * is, you should call it immediately after constructing the fragment.  The
     * arguments supplied here will be retained across fragment destroy and
     * creation.
     */
    @Override
    public void setArguments(final Bundle args)  {
        delegate.setArguments(args);
    }

    
    protected void setArguments__super(final Bundle args)  {
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
    public void setCancelable(final boolean cancelable)  {
        delegate.setCancelable(cancelable);
    }

    
    protected void setCancelable__super(final boolean cancelable)  {
        super.setCancelable(cancelable);
    }

    /**
     * When custom transitions are used with Fragments, the enter transition callback
     * is called when this Fragment is attached or detached when not popping the back stack.
     *
     * @param callback Used to manipulate the shared element transitions on this Fragment
     *                 when added not as a pop from the back stack.
     */
    @Override
    public void setEnterSharedElementCallback(final SharedElementCallback callback)  {
        delegate.setEnterSharedElementCallback(callback);
    }

    
    protected void setEnterSharedElementCallback__super(final SharedElementCallback callback)  {
        super.setEnterSharedElementCallback(callback);
    }

    /**
     * Sets the Transition that will be used to move Views into the initial scene. The entering
     * Views will be those that are regular Views or ViewGroups that have
     * {@link ViewGroup#isTransitionGroup} return true. Typical Transitions will extend
     * {@link Visibility} as entering is governed by changing visibility from
     * {@link View#INVISIBLE} to {@link View#VISIBLE}. If <code>transition</code> is null,
     * entering Views will remain unaffected.
     *
     * @param transition The Transition to use to move Views into the initial Scene.
     */
    @Override
    public void setEnterTransition(final Object transition)  {
        delegate.setEnterTransition(transition);
    }

    
    protected void setEnterTransition__super(final Object transition)  {
        super.setEnterTransition(transition);
    }

    /**
     * When custom transitions are used with Fragments, the exit transition callback
     * is called when this Fragment is attached or detached when popping the back stack.
     *
     * @param callback Used to manipulate the shared element transitions on this Fragment
     *                 when added as a pop from the back stack.
     */
    @Override
    public void setExitSharedElementCallback(final SharedElementCallback callback)  {
        delegate.setExitSharedElementCallback(callback);
    }

    
    protected void setExitSharedElementCallback__super(final SharedElementCallback callback)  {
        super.setExitSharedElementCallback(callback);
    }

    /**
     * Sets the Transition that will be used to move Views out of the scene when the
     * fragment is removed, hidden, or detached when not popping the back stack.
     * The exiting Views will be those that are regular Views or ViewGroups that
     * have {@link ViewGroup#isTransitionGroup} return true. Typical Transitions will extend
     * {@link Visibility} as exiting is governed by changing visibility
     * from {@link View#VISIBLE} to {@link View#INVISIBLE}. If transition is null, the views will
     * remain unaffected.
     *
     * @param transition The Transition to use to move Views out of the Scene when the Fragment
     *                   is being closed not due to popping the back stack. <code>transition</code>
     *                   must be an android.transition.Transition.
     */
    @Override
    public void setExitTransition(final Object transition)  {
        delegate.setExitTransition(transition);
    }

    
    protected void setExitTransition__super(final Object transition)  {
        super.setExitTransition(transition);
    }

    /**
     * Report that this fragment would like to participate in populating
     * the options menu by receiving a call to {@link #onCreateOptionsMenu}
     * and related methods.
     *
     * @param hasMenu If true, the fragment has menu items to contribute.
     */
    @Override
    public void setHasOptionsMenu(final boolean hasMenu)  {
        delegate.setHasOptionsMenu(hasMenu);
    }

    
    protected void setHasOptionsMenu__super(final boolean hasMenu)  {
        super.setHasOptionsMenu(hasMenu);
    }

    /**
     * Set the initial saved state that this Fragment should restore itself
     * from when first being constructed, as returned by
     * {@link FragmentManager#saveFragmentInstanceState(Fragment)
     * FragmentManager.saveFragmentInstanceState}.
     *
     * @param state The state the fragment should be restored from.
     */
    @Override
    public void setInitialSavedState(final Fragment.SavedState state)  {
        delegate.setInitialSavedState(state);
    }

    
    protected void setInitialSavedState__super(final Fragment.SavedState state)  {
        super.setInitialSavedState(state);
    }

    /**
     * Set a hint for whether this fragment's menu should be visible.  This
     * is useful if you know that a fragment has been placed in your view
     * hierarchy so that the user can not currently seen it, so any menu items
     * it has should also not be shown.
     *
     * @param menuVisible The default is true, meaning the fragment's menu will
     *                    be shown as usual.  If false, the user will not see the menu.
     */
    @Override
    public void setMenuVisibility(final boolean menuVisible)  {
        delegate.setMenuVisibility(menuVisible);
    }

    
    protected void setMenuVisibility__super(final boolean menuVisible)  {
        super.setMenuVisibility(menuVisible);
    }

    /**
     * Sets the Transition that will be used to move Views in to the scene when returning due
     * to popping a back stack. The entering Views will be those that are regular Views
     * or ViewGroups that have {@link ViewGroup#isTransitionGroup} return true. Typical Transitions
     * will extend {@link Visibility} as exiting is governed by changing
     * visibility from {@link View#VISIBLE} to {@link View#INVISIBLE}. If transition is null,
     * the views will remain unaffected. If nothing is set, the default will be to use the same
     * transition as {@link #setExitTransition(Object)}.
     *
     * @param transition The Transition to use to move Views into the scene when reentering from a
     *                   previously-started Activity. <code>transition</code>
     *                   must be an android.transition.Transition.
     */
    @Override
    public void setReenterTransition(final Object transition)  {
        delegate.setReenterTransition(transition);
    }

    
    protected void setReenterTransition__super(final Object transition)  {
        super.setReenterTransition(transition);
    }

    /**
     * Control whether a fragment instance is retained across Activity
     * re-creation (such as from a configuration change).  This can only
     * be used with fragments not in the back stack.  If set, the fragment
     * lifecycle will be slightly different when an activity is recreated:
     * <ul>
     * <li> {@link #onDestroy()} will not be called (but {@link #onDetach()} still
     * will be, because the fragment is being detached from its current activity).
     * <li> {@link #onCreate(Bundle)} will not be called since the fragment
     * is not being re-created.
     * <li> {@link #onAttach(Activity)} and {@link #onActivityCreated(Bundle)} <b>will</b>
     * still be called.
     * </ul>
     */
    @Override
    public void setRetainInstance(final boolean retain)  {
        delegate.setRetainInstance(retain);
    }

    
    protected void setRetainInstance__super(final boolean retain)  {
        super.setRetainInstance(retain);
    }

    /**
     * Sets the Transition that will be used to move Views out of the scene when the Fragment is
     * preparing to be removed, hidden, or detached because of popping the back stack. The exiting
     * Views will be those that are regular Views or ViewGroups that have
     * {@link ViewGroup#isTransitionGroup} return true. Typical Transitions will extend
     * {@link Visibility} as entering is governed by changing visibility from
     * {@link View#VISIBLE} to {@link View#INVISIBLE}. If <code>transition</code> is null,
     * entering Views will remain unaffected. If nothing is set, the default will be to
     * use the same value as set in {@link #setEnterTransition(Object)}.
     *
     * @param transition The Transition to use to move Views out of the Scene when the Fragment
     *                   is preparing to close. <code>transition</code> must be an
     *                   android.transition.Transition.
     */
    @Override
    public void setReturnTransition(final Object transition)  {
        delegate.setReturnTransition(transition);
    }

    
    protected void setReturnTransition__super(final Object transition)  {
        super.setReturnTransition(transition);
    }

    /**
     * Sets the Transition that will be used for shared elements transferred into the content
     * Scene. Typical Transitions will affect size and location, such as
     * {@link ChangeBounds}. A null
     * value will cause transferred shared elements to blink to the final position.
     *
     * @param transition The Transition to use for shared elements transferred into the content
     *                   Scene.  <code>transition</code> must be an android.transition.Transition.
     */
    @Override
    public void setSharedElementEnterTransition(final Object transition)  {
        delegate.setSharedElementEnterTransition(transition);
    }

    
    protected void setSharedElementEnterTransition__super(final Object transition)  {
        super.setSharedElementEnterTransition(transition);
    }

    /**
     * Sets the Transition that will be used for shared elements transferred back during a
     * pop of the back stack. This Transition acts in the leaving Fragment.
     * Typical Transitions will affect size and location, such as
     * {@link ChangeBounds}. A null
     * value will cause transferred shared elements to blink to the final position.
     * If no value is set, the default will be to use the same value as
     * {@link #setSharedElementEnterTransition(Object)}.
     *
     * @param transition The Transition to use for shared elements transferred out of the content
     *                   Scene. <code>transition</code> must be an android.transition.Transition.
     */
    @Override
    public void setSharedElementReturnTransition(final Object transition)  {
        delegate.setSharedElementReturnTransition(transition);
    }

    
    protected void setSharedElementReturnTransition__super(final Object transition)  {
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
    public void setShowsDialog(final boolean showsDialog)  {
        delegate.setShowsDialog(showsDialog);
    }

    
    protected void setShowsDialog__super(final boolean showsDialog)  {
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
    public void setStyle(final int style, @StyleRes final int theme)  {
        delegate.setStyle(style, theme);
    }

    
    protected void setStyle__super(final int style, @StyleRes final int theme)  {
        super.setStyle(style, theme);
    }

    /**
     * Optional target for this fragment.  This may be used, for example,
     * if this fragment is being started by another, and when done wants to
     * give a result back to the first.  The target set here is retained
     * across instances via {@link FragmentManager#putFragment
     * FragmentManager.putFragment()}.
     *
     * @param fragment    The fragment that is the target of this one.
     * @param requestCode Optional request code, for convenience if you
     *                    are going to call back with {@link #onActivityResult(int, int, Intent)}.
     */
    @Override
    public void setTargetFragment(final Fragment fragment, final int requestCode)  {
        delegate.setTargetFragment(fragment, requestCode);
    }

    
    protected void setTargetFragment__super(final Fragment fragment, final int requestCode)  {
        super.setTargetFragment(fragment, requestCode);
    }

    /**
     * Set a hint to the system about whether this fragment's UI is currently visible
     * to the user. This hint defaults to true and is persistent across fragment instance
     * state save and restore.
     *
     * <p>An app may set this to false to indicate that the fragment's UI is
     * scrolled out of visibility or is otherwise not directly visible to the user.
     * This may be used by the system to prioritize operations such as fragment lifecycle updates
     * or loader ordering behavior.</p>
     *
     * @param isVisibleToUser true if this fragment's UI is currently visible to the user
     *                        (default),
     *                        false if it is not.
     */
    @Override
    public void setUserVisibleHint(final boolean isVisibleToUser)  {
        delegate.setUserVisibleHint(isVisibleToUser);
    }

    
    protected void setUserVisibleHint__super(final boolean isVisibleToUser)  {
        super.setUserVisibleHint(isVisibleToUser);
    }

    /**
     * @hide
     */
    @Override
    public void setupDialog(final Dialog dialog, final int style)  {
        delegate.setupDialog(dialog, style);
    }

    
    protected void setupDialog__super(final Dialog dialog, final int style)  {
        super.setupDialog(dialog, style);
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
     * @see Context#checkSelfPermission(String)
     * @see #requestPermissions(String[], int)
     * @see #onRequestPermissionsResult(int, String[], int[])
     */
    @Override
    public boolean shouldShowRequestPermissionRationale(@NonNull final String permission)  {
        return delegate.shouldShowRequestPermissionRationale(permission);
    }

    
    protected boolean shouldShowRequestPermissionRationale__super(@NonNull final String permission)  {
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
    public void show(final FragmentManager manager, final String tag)  {
        delegate.show(manager, tag);
    }

    
    protected void show__super(final FragmentManager manager, final String tag)  {
        super.show(manager, tag);
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
    public int show(final FragmentTransaction transaction, final String tag)  {
        return delegate.show(transaction, tag);
    }

    
    protected int show__super(final FragmentTransaction transaction, final String tag)  {
        return super.show(transaction, tag);
    }

    /**
     * Call {@link Activity#startActivity(Intent)} from the fragment's
     * containing Activity.
     */
    @Override
    public void startActivity(final Intent intent)  {
        delegate.startActivity(intent);
    }

    
    protected void startActivity__super(final Intent intent)  {
        super.startActivity(intent);
    }

    /**
     * Call {@link Activity#startActivity(Intent, Bundle)} from the fragment's
     * containing Activity.
     */
    @Override
    public void startActivity(final Intent intent, @Nullable final Bundle options)  {
        delegate.startActivity(intent, options);
    }

    
    protected void startActivity__super(final Intent intent, @Nullable final Bundle options)  {
        super.startActivity(intent, options);
    }

    /**
     * Call {@link Activity#startActivityForResult(Intent, int)} from the fragment's
     * containing Activity.
     */
    @Override
    public void startActivityForResult(final Intent intent, final int requestCode)  {
        delegate.startActivityForResult(intent, requestCode);
    }

    
    protected void startActivityForResult__super(final Intent intent, final int requestCode)  {
        super.startActivityForResult(intent, requestCode);
    }

    /**
     * Call {@link Activity#startActivityForResult(Intent, int, Bundle)} from the fragment's
     * containing Activity.
     */
    @Override
    public void startActivityForResult(final Intent intent, final int requestCode,             @Nullable final Bundle options)  {
        delegate.startActivityForResult(intent, requestCode, options);
    }

    
    protected void startActivityForResult__super(final Intent intent, final int requestCode,             @Nullable final Bundle options)  {
        super.startActivityForResult(intent, requestCode, options);
    }

    @Override
    public String toString()  {
        return delegate.toString();
    }

    
    protected String toString__super()  {
        return super.toString();
    }

    /**
     * Prevents a context menu to be shown for the given view. This method will
     * remove the {@link OnCreateContextMenuListener} on the view.
     *
     * @param view The view that should stop showing a context menu.
     * @see #registerForContextMenu(View)
     */
    @Override
    public void unregisterForContextMenu(final View view)  {
        delegate.unregisterForContextMenu(view);
    }

    
    protected void unregisterForContextMenu__super(final View view)  {
        super.unregisterForContextMenu(view);
    }

}
