package com.pascalwelsch.compositeandroid.performance;

import com.pascalwelsch.compositeandroid.R;
import com.pascalwelsch.compositeandroid.activity.ActivityPlugin;
import com.pascalwelsch.compositeandroid.activity.CompositeActivity;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatDelegate;
import android.util.Log;
import android.view.View;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CompositePerformanceTestActivity extends CompositeActivity {

    private static class PerformanceTestPlugin extends ActivityPlugin {

        private final String mName;

        public PerformanceTestPlugin(final String name) {

            mName = name;
        }

        @Override
        public Resources getResources() {
            return super.getResources();
        }

        @Override
        public void onSaveInstanceState(final Bundle outState) {
            super.onSaveInstanceState(outState);
            outState.putString(mName, mName);
        }
    }

    private static final String TAG = CompositePerformanceTestActivity.class.getSimpleName();

    public static final int ITERATIONS = 10000;

    private final String mName = "0";

    public CompositePerformanceTestActivity() {
        addPlugin(new PerformanceTestPlugin("1"));
        addPlugin(new PerformanceTestPlugin("2"));
        addPlugin(new PerformanceTestPlugin("3"));
        addPlugin(new PerformanceTestPlugin("4"));
        addPlugin(new PerformanceTestPlugin("5"));
        /*addPlugin(new PerformanceTestPlugin("6"));
        addPlugin(new PerformanceTestPlugin("7"));
        addPlugin(new PerformanceTestPlugin("8"));
        addPlugin(new PerformanceTestPlugin("9"));
        addPlugin(new PerformanceTestPlugin("10"));
        addPlugin(new PerformanceTestPlugin("12"));
        addPlugin(new PerformanceTestPlugin("13"));
        addPlugin(new PerformanceTestPlugin("14"));
        addPlugin(new PerformanceTestPlugin("15"));
        addPlugin(new PerformanceTestPlugin("16"));
        addPlugin(new PerformanceTestPlugin("17"));
        addPlugin(new PerformanceTestPlugin("18"));
        addPlugin(new PerformanceTestPlugin("19"));
        addPlugin(new PerformanceTestPlugin("20"));*/
    }

    @Override
    public File getCacheDir() {
        return super_getCacheDir();
    }

    @Override
    public void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_performance);
        final View start = findViewById(R.id.start);
        assert start != null;
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                runPerformanceTest();
            }
        });
    }

    @Override
    public void onSaveInstanceState(final Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(mName, mName);
    }

    private void runPerformanceTest() {

        for (int j = 0; j < 10; j++) {

            String number = j + " plugins: ";

            System.gc();
            final int iterations = 2;
            float duration = 0;

            duration = 0;
            for (int i = 0; i < iterations; i++) {
                duration += testGetCacheDir();
            }
            duration /= iterations;
            Log.v(TAG, number + "getCacheDir() in " + duration + "ms");

            duration = 0;
            for (int i = 0; i < iterations; i++) {
                duration += testGetResources();
            }
            duration /= iterations;
            Log.v(TAG, number + "getResources() in " + duration + "ms");

            duration = 0;
            for (int i = 0; i < iterations; i++) {
                duration += testGetDelegate();
            }
            duration /= iterations;
            Log.v(TAG, number + "getDelegate() in " + duration + "ms");

            duration = 0;
            for (int i = 0; i < iterations; i++) {
                duration += testGetFile();
            }
            duration /= iterations;
            Log.v(TAG, number + "getFile() in " + duration + "ms");

            duration = 0;
            for (int i = 0; i < iterations; i++) {
                duration += testOnSaveInstanceState();
            }
            duration /= iterations;
            Log.v(TAG, number + "onSaveInstanceState() in " + duration + "ms");


            addPlugin(new PerformanceTestPlugin(String.valueOf(j)));
        }
    }

    private long testGetCacheDir() {
        final List<File> results = new ArrayList<>();
        final long start = System.currentTimeMillis();
        for (long i = 0; i < ITERATIONS; i++) {
            final File file = getCacheDir();
            results.add(file);
        }
        return System.currentTimeMillis() - start;
    }

    private long testGetDelegate() {
        final List<AppCompatDelegate> results = new ArrayList<>();
        final long start = System.currentTimeMillis();
        for (long i = 0; i < ITERATIONS; i++) {
            final AppCompatDelegate delegate = getDelegate();
            results.add(delegate);
        }
        return System.currentTimeMillis() - start;
    }

    private long testGetFile() {
        final List<File> results = new ArrayList<>();
        final long start = System.currentTimeMillis();
        for (long i = 0; i < ITERATIONS; i++) {
            final File file = getFilesDir();
            results.add(file);
        }
        return System.currentTimeMillis() - start;
    }

    private long testGetResources() {
        final List<Resources> results = new ArrayList<>();
        final long start = System.currentTimeMillis();
        for (long i = 0; i < ITERATIONS; i++) {
            final Resources resources = getResources();
            results.add(resources);
        }
        return System.currentTimeMillis() - start;
    }

    @SuppressLint("Assert")
    private long testOnSaveInstanceState() {
        final List<Bundle> results = new ArrayList<>();
        final long start = System.currentTimeMillis();
        for (long i = 0; i < ITERATIONS; i++) {
            final Bundle outState = new Bundle();
            onSaveInstanceState(outState);
            results.add(outState);
        }
        final long end = System.currentTimeMillis();

        assert results.get(0).getString("1") == "1";
        assert results.get(0).getString("20") == "20";
        assert results.get(results.size()).getString("1") == "1";
        assert results.get(results.size()).getString("20") == "20";

        return end - start;
    }
}
