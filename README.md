# CompositeAndroid

*Composition over inheritance*

Allows to `mixin` functionality into an Android `Activity`. Just because we all have a `BaseActivity` in our projects containing too much unused stuff. When it grows, it get unmaintainable


## Project stage

**pre-alpha.** Really, *do not use this anywhere*! It compiles and works in the simplest tests. I just posted it to have a discussion about my idea.


## Inspiration

- [Navi](https://github.com/trello/navi) of cause, but CompositeAndroid supports *all* methods.
- [Lightcycle](https://github.com/soundcloud/lightcycle) which supports only basic lifecycle methods.


## How will it work once it's done?

I hope this is the only change you have have to make.
```diff
- public class BaseActivity extends AppCompatActivity {
+ public class BaseFunctionality extends ActivityPlugin {
```

Then you are able to `mixin` the `BaseFunctionality` in your activities when needed.

```diff
- public class MainActivity extends BaseActivity {
+ public class MainActivity extends CompositeActivity {
+
+    private final BaseFunctionality base = new BaseFunctionality();
+ 
+    public MainActivity() {
+        mixin(base);
+        // and everything else
+        mixin(new ViewTracking("Main"));
+    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // do whatever you want
+        base.showLoadingIndicator();
    }
}
```

I recommend not to move all logic of your `BaseActivity` into a single plugin. Split it up and mixin only what you need.  


