package com.pascalwelsch.compositeandroid;

import android.os.Bundle;
import android.view.View;

import com.pascalwelsch.compositeandroid.activity.CompositeActivity;
import com.pascalwelsch.compositeandroid.fragment.TestFragment;

public class MainActivity extends CompositeActivity {

    public MainActivity() {
        addPlugin(new ActivityTracking());
        addPlugin(new ActivityTracking2());
        addPlugin(new ActivityTracking3(), new ActivityTracking4());
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
