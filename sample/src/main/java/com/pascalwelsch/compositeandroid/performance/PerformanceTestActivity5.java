package com.pascalwelsch.compositeandroid.performance;

import android.content.res.Resources;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

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
