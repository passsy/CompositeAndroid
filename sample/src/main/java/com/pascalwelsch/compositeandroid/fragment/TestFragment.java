package com.pascalwelsch.compositeandroid.fragment;

import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class TestFragment extends CompositeDialogFragment {

    private static final String TAG = TestFragment.class.getSimpleName();

    public TestFragment() {
        addPlugin(new FragmentTracking());
        addPlugin(new DialogTracking());
    }

    @Nullable
    @Override
    public View getView() {
        final TextView textView = new TextView(getContext());
        textView.setText("hello world");
        return textView;
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.v(TAG, "fragment onResume()");
    }
}
