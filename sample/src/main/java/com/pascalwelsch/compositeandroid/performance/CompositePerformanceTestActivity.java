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
        public void onSaveInstanceState(final Bundle outState) {
            super.onSaveInstanceState(outState);
            outState.putString(mName, mName);
        }
    }

    private static class PerformanceTestPluginOverridden extends PerformanceTestPlugin {

        public PerformanceTestPluginOverridden(final String name) {
            super(name);
        }

        @Override
        public Resources getResources() {
            return super.getResources();
        }

        @Override
        public File getCacheDir() {
            return super.getCacheDir();
        }
    }

    private static final String TAG = CompositePerformanceTestActivity.class.getSimpleName();

    public static final int ITERATIONS = 50000;

    private final String mName = "0";

    public CompositePerformanceTestActivity() {
        addPlugin(new PerformanceTestPluginOverridden("1"));
        addPlugin(new PerformanceTestPluginOverridden("2"));
        addPlugin(new PerformanceTestPluginOverridden("3"));
        addPlugin(new PerformanceTestPluginOverridden("4"));
        addPlugin(new PerformanceTestPluginOverridden("5"));
        /*addPlugin(new PerformanceTestPlugin("1"));
        addPlugin(new PerformanceTestPlugin("2"));
        addPlugin(new PerformanceTestPlugin("3"));
        addPlugin(new PerformanceTestPlugin("4"));
        addPlugin(new PerformanceTestPlugin("5"));*/
    }


    public File getFastCacheDir() {
        return super_getCacheDir();
    }

    public Resources getFastResources() {
        return super_getResources();
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

        String number = "5 plugins: ";

        System.gc();
        final int iterations = 1;
        float duration = 0;

        duration = 0;
        for (int i = 0; i < iterations; i++) {
            duration += testGetCacheDir();
        }
        duration /= iterations;
        Log.v(TAG, number + "getCacheDir() in " + duration + "ms");

        duration = 0;
        for (int i = 0; i < iterations; i++) {
            duration += testFastGetCacheDir();
        }
        duration /= iterations;
        Log.v(TAG, number + "getCacheDir() in " + duration + "ms  (direct)");

        duration = 0;
        for (int i = 0; i < iterations; i++) {
            duration += testGetResources();
        }
        duration /= iterations;
        Log.v(TAG, number + "getResources() in " + duration + "ms");

        duration = 0;
        for (int i = 0; i < iterations; i++) {
            duration += testFastGetResources();
        }
        duration /= iterations;
        Log.v(TAG, number + "getResources() in " + duration + "ms (direct)");


        duration = 0;
        for (int i = 0; i < iterations; i++) {
            duration += testOnSaveInstanceState();
        }
        duration /= iterations;
        Log.v(TAG, number + "onSaveInstanceState() in " + duration + "ms");


        duration = 0;
        for (int i = 0; i < iterations; i++) {
            duration += testFastOnSaveInstanceState();
        }
        duration /= iterations;
        Log.v(TAG, number + "onSaveInstanceState() in " + duration + "ms (direct)");
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

    private long testFastGetCacheDir() {
        final List<File> results = new ArrayList<>();
        final long start = System.currentTimeMillis();
        for (long i = 0; i < ITERATIONS; i++) {
            final File file = getFastCacheDir();
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

    private long testFastGetResources() {
        final List<Resources> results = new ArrayList<>();
        final long start = System.currentTimeMillis();
        for (long i = 0; i < ITERATIONS; i++) {
            final Resources resources = getFastResources();
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

    @SuppressLint("Assert")
    private long testFastOnSaveInstanceState() {
        final List<Bundle> results = new ArrayList<>();
        final long start = System.currentTimeMillis();
        for (long i = 0; i < ITERATIONS; i++) {
            final Bundle outState = new Bundle();
            super_onSaveInstanceState(outState);
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
