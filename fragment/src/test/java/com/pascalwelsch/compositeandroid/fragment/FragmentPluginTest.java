package com.pascalwelsch.compositeandroid.fragment;

import android.os.Bundle;

import org.junit.Test;

import androidx.annotation.Nullable;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class FragmentPluginTest {

    public static class TestFragmentPlugin extends FragmentPlugin {

        private boolean mGotCalled;

        @Override
        public void onCreate(@Nullable final Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            mGotCalled = true;
        }
    }

    public static class TestDialogFragmentPlugin extends DialogFragmentPlugin {

        private boolean mGotCalled;

        private boolean mShowsCalled;

        @Override
        public void onCreate(@Nullable final Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            mGotCalled = true;
        }

        @Override
        public boolean getShowsDialog() {
            final boolean showsDialog = super.getShowsDialog();
            mShowsCalled = true;
            return showsDialog;
        }
    }

    public static class TestDialogFragment extends CompositeDialogFragment {

        private final TestDialogFragmentPlugin mDialogPlugin;

        private final TestFragmentPlugin mPlugin;

        public TestDialogFragment() {
            mPlugin = new TestFragmentPlugin();
            addPlugin(mPlugin);

            mDialogPlugin = new TestDialogFragmentPlugin();
            addPlugin(mDialogPlugin);
        }
    }

    public static class TestFragment extends CompositeFragment {

        private final TestFragmentPlugin mPlugin;

        public TestFragment() {
            mPlugin = new TestFragmentPlugin();
            addPlugin(mPlugin);
        }
    }

    @Test
    public void testCallBaseMethod() throws Exception {
        final TestFragment testFragment = new TestFragment();
        assertThat(testFragment.mPlugin.mGotCalled).isFalse();
        testFragment.onCreate(null);
        assertThat(testFragment.mPlugin.mGotCalled).isTrue();

        final TestDialogFragment testDialogFragment = new TestDialogFragment();
        assertThat(testDialogFragment.mPlugin.mGotCalled).isFalse();
        assertThat(testDialogFragment.mDialogPlugin.mGotCalled).isFalse();
        testDialogFragment.onCreate(null);
        assertThat(testDialogFragment.mPlugin.mGotCalled).isTrue();
        assertThat(testDialogFragment.mDialogPlugin.mGotCalled).isTrue();
    }

    @Test
    public void testCallDialogFragmentMethod() throws Exception {

        final TestDialogFragment testDialogFragment = new TestDialogFragment();
        assertThat(testDialogFragment.mDialogPlugin.mShowsCalled).isFalse();
        testDialogFragment.getShowsDialog();
        assertThat(testDialogFragment.mDialogPlugin.mShowsCalled).isTrue();

    }
}
