package com.pascalwelsch.compositeandroid.performance;

import android.content.res.Resources;
import android.os.Bundle;

public class PerformanceTestActivity4 extends PerformanceTestActivity5 {

    private final String mName = "4";

    @Override
    public Resources getResources() {
        return super.getResources();
    }

    @Override
    protected void onSaveInstanceState(final Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(mName, mName);
    }
}
