package com.pascalwelsch.compositeandroid;

import com.pascalwelsch.compositeandroid.activity.CompositeActivity;
import com.pascalwelsch.compositeandroid.fragment.TestFragment;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends CompositeActivity {

    public MainActivity() {
        addPlugin(new ActivityTracking());
        addPlugin(new ActivityTracking2());
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final View btn = findViewById(R.id.button);
        assert btn != null;
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                new TestFragment().show(getSupportFragmentManager(), "dialog");
            }
        });
    }
}
