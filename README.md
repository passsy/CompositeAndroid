# CompositeAndroid

![License](https://img.shields.io/badge/license-Apache%202-green.svg?style=flat)]

*Composition over inheritance*

Allows to `mixin` functionality into an Android `Activity`. Just because we all have a `BaseActivity` in our projects containing too much unused stuff. When it grows, it get unmaintainable


## Project stage

**pre-alpha.** Really, *do not use this anywhere*! It compiles and works in the simplest tests. I just posted it to have a discussion about my idea.


## Inspiration

- [Navi](https://github.com/trello/navi) of cause, but
    - it doesn't support all methods (only methods without return value)
    - it doesn't only support code execution before or after calling `super`, not very flexible
- [Lightcycle](https://github.com/soundcloud/lightcycle) which only supports basic lifecycle methods.


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

## Get it

Tray is available via [jcenter](http://blog.bintray.com/2015/02/09/android-studio-migration-from-maven-central-to-jcenter/)

```java

dependencies {
    // stable
    compile 'com.pascalwelsch.compositeandroid:activity:0.1-alpha1'
}

```

# License

```
Copyright 2016 Pascal Welsch

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
