package com.pascalwelsch.compositeandroid.performance;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class PerformanceTestActivity5 extends AppCompatActivity {

    private final String mName = "5";

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
