package com.pascalwelsch.compositeandroid.fragment;

import com.pascalwelsch.compositeandroid.core.Removable;
import com.pascalwelsch.compositeandroid.core.SuppressedException;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
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

@SuppressWarnings({"unused", "deprecation", "JavadocReference", "WrongConstant"})
@SuppressLint({"MissingSuperCall", "NewApi"})

public class CompositeFragment extends Fragment implements ICompositeFragment {

    protected FragmentDelegate delegate = new FragmentDelegate(this);


    public Removable addPlugin(final FragmentPlugin plugin) {
        return delegate.addPlugin(plugin);
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
    public void dump(final String prefix, final FileDescriptor fd, final PrintWriter writer,
            final String[] args) {
        delegate.dump(prefix, fd, writer, args);
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
    public boolean getAllowEnterTransitionOverlap() {
        return delegate.getAllowEnterTransitionOverlap();
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
    public boolean getAllowReturnTransitionOverlap() {
        return delegate.getAllowReturnTransitionOverlap();
    }

    /**
     * Return the {@link Context} this fragment is currently associated with.
     */
    @Override
    public Context getContext() {
        return delegate.getContext();
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
    public Object getEnterTransition() {
        return delegate.getEnterTransition();
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
    public Object getExitTransition() {
        return delegate.getExitTransition();
    }

    /**
     * Hack so that DialogFragment can make its Dialog before creating
     * its views, and the view construction can use the dialog's context for
     * inflation.  Maybe this should become a public API. Note sure.
     *
     * @hide
     */
    @Override
    public LayoutInflater getLayoutInflater(final Bundle savedInstanceState) {
        return delegate.getLayoutInflater(savedInstanceState);
    }

    /**
     * Return the LoaderManager for this fragment, creating it if needed.
     */
    @Override
    public LoaderManager getLoaderManager() {
        return delegate.getLoaderManager();
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
    public Object getReenterTransition() {
        return delegate.getReenterTransition();
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
    public Object getReturnTransition() {
        return delegate.getReturnTransition();
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
    public Object getSharedElementEnterTransition() {
        return delegate.getSharedElementEnterTransition();
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
    public Object getSharedElementReturnTransition() {
        return delegate.getSharedElementReturnTransition();
    }

    /**
     * @return The current value of the user-visible hint on this fragment.
     * @see #setUserVisibleHint(boolean)
     */
    @Override
    public boolean getUserVisibleHint() {
        return delegate.getUserVisibleHint();
    }

    /**
     * Get the root view for the fragment's layout (the one returned by {@link #onCreateView}),
     * if provided.
     *
     * @return The fragment's root view, or null if it has no layout.
     */
    @Nullable
    @Override
    public View getView() {
        return delegate.getView();
    }

    /**
     * Called when the fragment's activity has been created and this
     * fragment's view hierarchy instantiated.  It can be used to do final
     * initialization once these pieces are in place, such as retrieving
     * views or restoring state.  It is also useful for fragments that use
     * {@link #setRetainInstance(boolean)} to retain their instance,
     * as this callback tells the fragment when it is fully associated with
     * the new activity instance.  This is called after {@link #onCreateView}
     * and before {@link #onViewStateRestored(Bundle)}.
     *
     * @param savedInstanceState If the fragment is being re-created from
     *                           a previous saved state, this is the state.
     */
    @Override
    public void onActivityCreated(@Nullable final Bundle savedInstanceState) {
        delegate.onActivityCreated(savedInstanceState);
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
    public void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        delegate.onActivityResult(requestCode, resultCode, data);
    }

    /**
     * Called when a fragment is first attached to its context.
     * {@link #onCreate(Bundle)} will be called after this.
     */
    @Override
    public void onAttach(final Context context) {
        delegate.onAttach(context);
    }

    /**
     * Called when a fragment is first attached to its activity.
     * {@link #onCreate(Bundle)} will be called after this.
     *
     * @deprecated See {@link #onAttach(Context)}.
     */
    @Override
    public void onAttach(final Activity activity) {
        delegate.onAttach(activity);
    }

    /**
     * Called when a fragment is attached as a child of this fragment.
     *
     * <p>This is called after the attached fragment's <code>onAttach</code> and before
     * the attached fragment's <code>onCreate</code> if the fragment has not yet had a previous
     * call to <code>onCreate</code>.</p>
     *
     * @param childFragment child fragment being attached
     */
    @Override
    public void onAttachFragment(final Fragment childFragment) {
        delegate.onAttachFragment(childFragment);
    }

    @Override
    public void onConfigurationChanged(final Configuration newConfig) {
        delegate.onConfigurationChanged(newConfig);
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
    public boolean onContextItemSelected(final MenuItem item) {
        return delegate.onContextItemSelected(item);
    }

    /**
     * Called to do initial creation of a fragment.  This is called after
     * {@link #onAttach(Activity)} and before
     * {@link #onCreateView(LayoutInflater, ViewGroup, Bundle)}.
     *
     * <p>Note that this can be called while the fragment's activity is
     * still in the process of being created.  As such, you can not rely
     * on things like the activity's content view hierarchy being initialized
     * at this point.  If you want to do work once the activity itself is
     * created, see {@link #onActivityCreated(Bundle)}.
     *
     * <p>Any restored child fragments will be created before the base
     * <code>Fragment.onCreate</code> method returns.</p>
     *
     * @param savedInstanceState If the fragment is being re-created from
     *                           a previous saved state, this is the state.
     */
    @Override
    public void onCreate(@Nullable final Bundle savedInstanceState) {
        delegate.onCreate(savedInstanceState);
    }

    /**
     * Called when a fragment loads an animation.
     */
    @Override
    public Animation onCreateAnimation(final int transit, final boolean enter, final int nextAnim) {
        return delegate.onCreateAnimation(transit, enter, nextAnim);
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
    public void onCreateContextMenu(final ContextMenu menu, final View v,
            final ContextMenu.ContextMenuInfo menuInfo) {
        delegate.onCreateContextMenu(menu, v, menuInfo);
    }

    /**
     * Initialize the contents of the Fragment host's standard options menu.  You
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
    public void onCreateOptionsMenu(final Menu menu, final MenuInflater inflater) {
        delegate.onCreateOptionsMenu(menu, inflater);
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
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container,
            @Nullable final Bundle savedInstanceState) {
        return delegate.onCreateView(inflater, container, savedInstanceState);
    }

    /**
     * Called when the fragment is no longer in use.  This is called
     * after {@link #onStop()} and before {@link #onDetach()}.
     */
    @Override
    public void onDestroy() {
        delegate.onDestroy();
    }

    /**
     * Called when this fragment's option menu items are no longer being
     * included in the overall options menu.  Receiving this call means that
     * the menu needed to be rebuilt, but this fragment's items were not
     * included in the newly built menu (its {@link #onCreateOptionsMenu(Menu, MenuInflater)}
     * was not called).
     */
    @Override
    public void onDestroyOptionsMenu() {
        delegate.onDestroyOptionsMenu();
    }

    /**
     * Called when the view previously created by {@link #onCreateView} has
     * been detached from the fragment.  The next time the fragment needs
     * to be displayed, a new view will be created.  This is called
     * after {@link #onStop()} and before {@link #onDestroy()}.  It is called
     * <em>regardless</em> of whether {@link #onCreateView} returned a
     * non-null view.  Internally it is called after the view's state has
     * been saved but before it has been removed from its parent.
     */
    @Override
    public void onDestroyView() {
        delegate.onDestroyView();
    }

    /**
     * Called when the fragment is no longer attached to its activity.  This
     * is called after {@link #onDestroy()}.
     */
    @Override
    public void onDetach() {
        delegate.onDetach();
    }

    /**
     * Called when the hidden state (as returned by {@link #isHidden()} of
     * the fragment has changed.  Fragments start out not hidden; this will
     * be called whenever the fragment changes state from that.
     *
     * @param hidden True if the fragment is now hidden, false otherwise.
     */
    @Override
    public void onHiddenChanged(final boolean hidden) {
        delegate.onHiddenChanged(hidden);
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
     * {@sample frameworks/support/samples/Support4Demos/src/com/example/android/supportv4/app/FragmentArgumentsSupport.java
     * fragment}
     *
     * <p>Note that parsing the XML attributes uses a "styleable" resource.  The
     * declaration for the styleable used here is:</p>
     *
     * {@sample frameworks/support/samples/Support4Demos/res/values/attrs.xml fragment_arguments}
     *
     * <p>The fragment can then be declared within its activity's content layout
     * through a tag like this:</p>
     *
     * {@sample frameworks/support/samples/Support4Demos/res/layout/fragment_arguments_support.xml
     * from_attributes}
     *
     * <p>This fragment can also be created dynamically from arguments given
     * at runtime in the arguments Bundle; here is an example of doing so at
     * creation of the containing activity:</p>
     *
     * {@sample frameworks/support/samples/Support4Demos/src/com/example/android/supportv4/app/FragmentArgumentsSupport.java
     * create}
     *
     * @param context            The Activity that is inflating this fragment.
     * @param attrs              The attributes at the tag where the fragment is
     *                           being created.
     * @param savedInstanceState If the fragment is being re-created from
     */
    @Override
    public void onInflate(final Context context, final AttributeSet attrs,
            final Bundle savedInstanceState) {
        delegate.onInflate(context, attrs, savedInstanceState);
    }

    /**
     * Called when a fragment is being created as part of a view layout
     * inflation, typically from setting the content view of an activity.
     *
     * @deprecated See {@link #onInflate(Context, AttributeSet, Bundle)}.
     */
    @Override
    public void onInflate(final Activity activity, final AttributeSet attrs,
            final Bundle savedInstanceState) {
        delegate.onInflate(activity, attrs, savedInstanceState);
    }

    @Override
    public void onLowMemory() {
        delegate.onLowMemory();
    }

    /**
     * Called when the Fragment's activity changes from fullscreen mode to multi-window mode and
     * visa-versa. This is generally tied to {@link Activity#onMultiWindowModeChanged} of the
     * containing Activity.
     *
     * @param isInMultiWindowMode True if the activity is in multi-window mode.
     */
    @Override
    public void onMultiWindowModeChanged(final boolean isInMultiWindowMode) {
        delegate.onMultiWindowModeChanged(isInMultiWindowMode);
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
    public boolean onOptionsItemSelected(final MenuItem item) {
        return delegate.onOptionsItemSelected(item);
    }

    /**
     * This hook is called whenever the options menu is being closed (either by the user canceling
     * the menu with the back/menu button, or when an item is selected).
     *
     * @param menu The options menu as last shown or first initialized by
     *             onCreateOptionsMenu().
     */
    @Override
    public void onOptionsMenuClosed(final Menu menu) {
        delegate.onOptionsMenuClosed(menu);
    }

    /**
     * Called when the Fragment is no longer resumed.  This is generally
     * tied to {@link Activity#onPause() Activity.onPause} of the containing
     * Activity's lifecycle.
     */
    @Override
    public void onPause() {
        delegate.onPause();
    }

    /**
     * Called by the system when the activity changes to and from picture-in-picture mode. This is
     * generally tied to {@link Activity#onPictureInPictureModeChanged} of the containing Activity.
     *
     * @param isInPictureInPictureMode True if the activity is in picture-in-picture mode.
     */
    @Override
    public void onPictureInPictureModeChanged(final boolean isInPictureInPictureMode) {
        delegate.onPictureInPictureModeChanged(isInPictureInPictureMode);
    }

    /**
     * Prepare the Fragment host's standard options menu to be displayed.  This is
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
    public void onPrepareOptionsMenu(final Menu menu) {
        delegate.onPrepareOptionsMenu(menu);
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
    public void onRequestPermissionsResult(final int requestCode,
            @NonNull final String[] permissions, @NonNull final int[] grantResults) {
        delegate.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    /**
     * Called when the fragment is visible to the user and actively running.
     * This is generally
     * tied to {@link Activity#onResume() Activity.onResume} of the containing
     * Activity's lifecycle.
     */
    @Override
    public void onResume() {
        delegate.onResume();
    }

    /**
     * Called to ask the fragment to save its current dynamic state, so it
     * can later be reconstructed in a new instance of its process is
     * restarted.  If a new instance of the fragment later needs to be
     * created, the data you place in the Bundle here will be available
     * in the Bundle given to {@link #onCreate(Bundle)},
     * {@link #onCreateView(LayoutInflater, ViewGroup, Bundle)}, and
     * {@link #onActivityCreated(Bundle)}.
     *
     * <p>This corresponds to {@link Activity#onSaveInstanceState(Bundle)
     * Activity.onSaveInstanceState(Bundle)} and most of the discussion there
     * applies here as well.  Note however: <em>this method may be called
     * at any time before {@link #onDestroy()}</em>.  There are many situations
     * where a fragment may be mostly torn down (such as when placed on the
     * back stack with no UI showing), but its state will not be saved until
     * its owning activity actually needs to save its state.
     *
     * @param outState Bundle in which to place your saved state.
     */
    @Override
    public void onSaveInstanceState(final Bundle outState) {
        delegate.onSaveInstanceState(outState);
    }

    /**
     * Called when the Fragment is visible to the user.  This is generally
     * tied to {@link Activity#onStart() Activity.onStart} of the containing
     * Activity's lifecycle.
     */
    @Override
    public void onStart() {
        delegate.onStart();
    }

    /**
     * Called when the Fragment is no longer started.  This is generally
     * tied to {@link Activity#onStop() Activity.onStop} of the containing
     * Activity's lifecycle.
     */
    @Override
    public void onStop() {
        delegate.onStop();
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
    public void onViewCreated(final View view, @Nullable final Bundle savedInstanceState) {
        delegate.onViewCreated(view, savedInstanceState);
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
    public void onViewStateRestored(@Nullable final Bundle savedInstanceState) {
        delegate.onViewStateRestored(savedInstanceState);
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
    public void registerForContextMenu(final View view) {
        delegate.registerForContextMenu(view);
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
    public void setAllowEnterTransitionOverlap(final boolean allow) {
        delegate.setAllowEnterTransitionOverlap(allow);
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
    public void setAllowReturnTransitionOverlap(final boolean allow) {
        delegate.setAllowReturnTransitionOverlap(allow);
    }

    /**
     * Supply the construction arguments for this fragment.  This can only
     * be called before the fragment has been attached to its activity; that
     * is, you should call it immediately after constructing the fragment.  The
     * arguments supplied here will be retained across fragment destroy and
     * creation.
     */
    @Override
    public void setArguments(final Bundle args) {
        delegate.setArguments(args);
    }

    /**
     * When custom transitions are used with Fragments, the enter transition callback
     * is called when this Fragment is attached or detached when not popping the back stack.
     *
     * @param callback Used to manipulate the shared element transitions on this Fragment
     *                 when added not as a pop from the back stack.
     */
    @Override
    public void setEnterSharedElementCallback(final SharedElementCallback callback) {
        delegate.setEnterSharedElementCallback(callback);
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
    public void setEnterTransition(final Object transition) {
        delegate.setEnterTransition(transition);
    }

    /**
     * When custom transitions are used with Fragments, the exit transition callback
     * is called when this Fragment is attached or detached when popping the back stack.
     *
     * @param callback Used to manipulate the shared element transitions on this Fragment
     *                 when added as a pop from the back stack.
     */
    @Override
    public void setExitSharedElementCallback(final SharedElementCallback callback) {
        delegate.setExitSharedElementCallback(callback);
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
    public void setExitTransition(final Object transition) {
        delegate.setExitTransition(transition);
    }

    /**
     * Report that this fragment would like to participate in populating
     * the options menu by receiving a call to {@link #onCreateOptionsMenu}
     * and related methods.
     *
     * @param hasMenu If true, the fragment has menu items to contribute.
     */
    @Override
    public void setHasOptionsMenu(final boolean hasMenu) {
        delegate.setHasOptionsMenu(hasMenu);
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
    public void setInitialSavedState(final Fragment.SavedState state) {
        delegate.setInitialSavedState(state);
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
    public void setMenuVisibility(final boolean menuVisible) {
        delegate.setMenuVisibility(menuVisible);
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
    public void setReenterTransition(final Object transition) {
        delegate.setReenterTransition(transition);
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
    public void setRetainInstance(final boolean retain) {
        delegate.setRetainInstance(retain);
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
    public void setReturnTransition(final Object transition) {
        delegate.setReturnTransition(transition);
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
    public void setSharedElementEnterTransition(final Object transition) {
        delegate.setSharedElementEnterTransition(transition);
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
    public void setSharedElementReturnTransition(final Object transition) {
        delegate.setSharedElementReturnTransition(transition);
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
    public void setTargetFragment(final Fragment fragment, final int requestCode) {
        delegate.setTargetFragment(fragment, requestCode);
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
     * <p><strong>Note:</strong> This method may be called outside of the fragment lifecycle.
     * and thus has no ordering guarantees with regard to fragment lifecycle method calls.</p>
     *
     * @param isVisibleToUser true if this fragment's UI is currently visible to the user
     *                        (default),
     *                        false if it is not.
     */
    @Override
    public void setUserVisibleHint(final boolean isVisibleToUser) {
        delegate.setUserVisibleHint(isVisibleToUser);
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
    public boolean shouldShowRequestPermissionRationale(@NonNull final String permission) {
        return delegate.shouldShowRequestPermissionRationale(permission);
    }

    /**
     * Call {@link Activity#startActivity(Intent)} from the fragment's
     * containing Activity.
     */
    @Override
    public void startActivity(final Intent intent) {
        delegate.startActivity(intent);
    }

    /**
     * Call {@link Activity#startActivity(Intent, Bundle)} from the fragment's
     * containing Activity.
     */
    @Override
    public void startActivity(final Intent intent, @Nullable final Bundle options) {
        delegate.startActivity(intent, options);
    }

    /**
     * Call {@link Activity#startActivityForResult(Intent, int)} from the fragment's
     * containing Activity.
     */
    @Override
    public void startActivityForResult(final Intent intent, final int requestCode) {
        delegate.startActivityForResult(intent, requestCode);
    }

    /**
     * Call {@link Activity#startActivityForResult(Intent, int, Bundle)} from the fragment's
     * containing Activity.
     */
    @Override
    public void startActivityForResult(final Intent intent, final int requestCode,
            @Nullable final Bundle options) {
        delegate.startActivityForResult(intent, requestCode, options);
    }

    /**
     * Call {@link Activity#startIntentSenderForResult(IntentSender, int, Intent, int, int, int,
     * Bundle)} from the fragment's containing Activity.
     */
    @Override
    public void startIntentSenderForResult(final IntentSender intent, final int requestCode,
            @Nullable final Intent fillInIntent, final int flagsMask, final int flagsValues,
            final int extraFlags, final Bundle options) throws IntentSender.SendIntentException {
        try {
            delegate.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask,
                    flagsValues, extraFlags, options);
        } catch (SuppressedException e) {
            throw (IntentSender.SendIntentException) e.getCause();
        }
    }

    @Override
    public void super_dump(final String prefix, final FileDescriptor fd, final PrintWriter writer,
            final String[] args) {
        super.dump(prefix, fd, writer, args);
    }

    @Override
    public boolean super_getAllowEnterTransitionOverlap() {
        return super.getAllowEnterTransitionOverlap();
    }

    @Override
    public boolean super_getAllowReturnTransitionOverlap() {
        return super.getAllowReturnTransitionOverlap();
    }

    @Override
    public Context super_getContext() {
        return super.getContext();
    }

    @Override
    public Object super_getEnterTransition() {
        return super.getEnterTransition();
    }

    @Override
    public Object super_getExitTransition() {
        return super.getExitTransition();
    }

    @Override
    public LayoutInflater super_getLayoutInflater(final Bundle savedInstanceState) {
        return super.getLayoutInflater(savedInstanceState);
    }

    @Override
    public LoaderManager super_getLoaderManager() {
        return super.getLoaderManager();
    }

    @Override
    public Object super_getReenterTransition() {
        return super.getReenterTransition();
    }

    @Override
    public Object super_getReturnTransition() {
        return super.getReturnTransition();
    }

    @Override
    public Object super_getSharedElementEnterTransition() {
        return super.getSharedElementEnterTransition();
    }

    @Override
    public Object super_getSharedElementReturnTransition() {
        return super.getSharedElementReturnTransition();
    }

    @Override
    public boolean super_getUserVisibleHint() {
        return super.getUserVisibleHint();
    }

    @Nullable
    @Override
    public View super_getView() {
        return super.getView();
    }

    @Override
    public void super_onActivityCreated(@Nullable final Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void super_onActivityResult(final int requestCode, final int resultCode,
            final Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void super_onAttach(final Context context) {
        super.onAttach(context);
    }

    @Override
    public void super_onAttach(final Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void super_onAttachFragment(final Fragment childFragment) {
        super.onAttachFragment(childFragment);
    }

    @Override
    public void super_onConfigurationChanged(final Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean super_onContextItemSelected(final MenuItem item) {
        return super.onContextItemSelected(item);
    }

    @Override
    public void super_onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public Animation super_onCreateAnimation(final int transit, final boolean enter,
            final int nextAnim) {
        return super.onCreateAnimation(transit, enter, nextAnim);
    }

    @Override
    public void super_onCreateContextMenu(final ContextMenu menu, final View v,
            final ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public void super_onCreateOptionsMenu(final Menu menu, final MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Nullable
    @Override
    public View super_onCreateView(final LayoutInflater inflater,
            @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void super_onDestroy() {
        super.onDestroy();
    }

    @Override
    public void super_onDestroyOptionsMenu() {
        super.onDestroyOptionsMenu();
    }

    @Override
    public void super_onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void super_onDetach() {
        super.onDetach();
    }

    @Override
    public void super_onHiddenChanged(final boolean hidden) {
        super.onHiddenChanged(hidden);
    }

    @Override
    public void super_onInflate(final Context context, final AttributeSet attrs,
            final Bundle savedInstanceState) {
        super.onInflate(context, attrs, savedInstanceState);
    }

    @Override
    public void super_onInflate(final Activity activity, final AttributeSet attrs,
            final Bundle savedInstanceState) {
        super.onInflate(activity, attrs, savedInstanceState);
    }

    @Override
    public void super_onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void super_onMultiWindowModeChanged(final boolean isInMultiWindowMode) {
        super.onMultiWindowModeChanged(isInMultiWindowMode);
    }

    @Override
    public boolean super_onOptionsItemSelected(final MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void super_onOptionsMenuClosed(final Menu menu) {
        super.onOptionsMenuClosed(menu);
    }

    @Override
    public void super_onPause() {
        super.onPause();
    }

    @Override
    public void super_onPictureInPictureModeChanged(final boolean isInPictureInPictureMode) {
        super.onPictureInPictureModeChanged(isInPictureInPictureMode);
    }

    @Override
    public void super_onPrepareOptionsMenu(final Menu menu) {
        super.onPrepareOptionsMenu(menu);
    }

    @Override
    public void super_onRequestPermissionsResult(final int requestCode,
            @NonNull final String[] permissions, @NonNull final int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override
    public void super_onResume() {
        super.onResume();
    }

    @Override
    public void super_onSaveInstanceState(final Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    public void super_onStart() {
        super.onStart();
    }

    @Override
    public void super_onStop() {
        super.onStop();
    }

    @Override
    public void super_onViewCreated(final View view, @Nullable final Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void super_onViewStateRestored(@Nullable final Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
    }

    @Override
    public void super_registerForContextMenu(final View view) {
        super.registerForContextMenu(view);
    }

    @Override
    public void super_setAllowEnterTransitionOverlap(final boolean allow) {
        super.setAllowEnterTransitionOverlap(allow);
    }

    @Override
    public void super_setAllowReturnTransitionOverlap(final boolean allow) {
        super.setAllowReturnTransitionOverlap(allow);
    }

    @Override
    public void super_setArguments(final Bundle args) {
        super.setArguments(args);
    }

    @Override
    public void super_setEnterSharedElementCallback(final SharedElementCallback callback) {
        super.setEnterSharedElementCallback(callback);
    }

    @Override
    public void super_setEnterTransition(final Object transition) {
        super.setEnterTransition(transition);
    }

    @Override
    public void super_setExitSharedElementCallback(final SharedElementCallback callback) {
        super.setExitSharedElementCallback(callback);
    }

    @Override
    public void super_setExitTransition(final Object transition) {
        super.setExitTransition(transition);
    }

    @Override
    public void super_setHasOptionsMenu(final boolean hasMenu) {
        super.setHasOptionsMenu(hasMenu);
    }

    @Override
    public void super_setInitialSavedState(final Fragment.SavedState state) {
        super.setInitialSavedState(state);
    }

    @Override
    public void super_setMenuVisibility(final boolean menuVisible) {
        super.setMenuVisibility(menuVisible);
    }

    @Override
    public void super_setReenterTransition(final Object transition) {
        super.setReenterTransition(transition);
    }

    @Override
    public void super_setRetainInstance(final boolean retain) {
        super.setRetainInstance(retain);
    }

    @Override
    public void super_setReturnTransition(final Object transition) {
        super.setReturnTransition(transition);
    }

    @Override
    public void super_setSharedElementEnterTransition(final Object transition) {
        super.setSharedElementEnterTransition(transition);
    }

    @Override
    public void super_setSharedElementReturnTransition(final Object transition) {
        super.setSharedElementReturnTransition(transition);
    }

    @Override
    public void super_setTargetFragment(final Fragment fragment, final int requestCode) {
        super.setTargetFragment(fragment, requestCode);
    }

    @Override
    public void super_setUserVisibleHint(final boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
    }

    @Override
    public boolean super_shouldShowRequestPermissionRationale(@NonNull final String permission) {
        return super.shouldShowRequestPermissionRationale(permission);
    }

    @Override
    public void super_startActivity(final Intent intent) {
        super.startActivity(intent);
    }

    @Override
    public void super_startActivity(final Intent intent, @Nullable final Bundle options) {
        super.startActivity(intent, options);
    }

    @Override
    public void super_startActivityForResult(final Intent intent, final int requestCode) {
        super.startActivityForResult(intent, requestCode);
    }

    @Override
    public void super_startActivityForResult(final Intent intent, final int requestCode,
            @Nullable final Bundle options) {
        super.startActivityForResult(intent, requestCode, options);
    }

    @Override
    public void super_startIntentSenderForResult(final IntentSender intent, final int requestCode,
            @Nullable final Intent fillInIntent, final int flagsMask, final int flagsValues,
            final int extraFlags, final Bundle options) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues,
                extraFlags, options);
    }

    @Override
    public String super_toString() {
        return super.toString();
    }

    @Override
    public void super_unregisterForContextMenu(final View view) {
        super.unregisterForContextMenu(view);
    }

    @Override
    public String toString() {
        return delegate.toString();
    }

    /**
     * Prevents a context menu to be shown for the given view. This method will
     * remove the {@link OnCreateContextMenuListener} on the view.
     *
     * @param view The view that should stop showing a context menu.
     * @see #registerForContextMenu(View)
     */
    @Override
    public void unregisterForContextMenu(final View view) {
        delegate.unregisterForContextMenu(view);
    }
}
