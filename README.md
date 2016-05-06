# CompositeAndroid

![License](https://img.shields.io/badge/license-Apache%202-green.svg?style=flat)

*Composition over inheritance*

Allows to add functionality into an Android `Activity`. Just because we all have a `BaseActivity` in our projects containing too much unused stuff. When it grows, it get unmaintainable.


## Project stage

*Early alpha*. Nothing breaks when you extend `CompositeActivity`. Getting simple callbacks is safe. Overriding methods and changing parameters is tested. Sound good?
Well, I already found an edgecases (`getLastNonConfigurationInstance()` and `onRetainCustomNonConfigurationInstance()`) and I'm sure there are more. And I ran into the first threading problems and solved them but there could be more, too.

I successfully replaced a `BaseActivity` in a big grown project with a `CompositeActivity`. It works without problems, so far. This means it's kind of stable if you don't try to break it.

## Inspiration

- [Navi](https://github.com/trello/navi) of cause, but
    - it doesn't support all methods (only methods without return value)
    - it doesn't only support code execution before or after calling `super`, not very flexible
- [Lightcycle](https://github.com/soundcloud/lightcycle) which only supports basic lifecycle methods.

## Possible Usecases

- Plugin for the GooglePlayApiClient handling all the edgecases
- Wrap your layout in a predefined container by overriding `setContentView()`
- a Plugin showing a loadingspinner
- a Plugin for requesting permissions automatically handling all response codes
- granually add libraries like [Mosby](https://github.com/sockeqwe/mosby) or [Flow](https://github.com/square/flow) without extending from a `MvpActivity`
- and **so much more...**

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
+        addPlugin(base);
+        // and everything else
+        addPlugin(new ViewTracking("Main"));
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

## Get it [![Download](https://api.bintray.com/packages/passsy/maven/CompositeActivity/images/download.svg) ](https://bintray.com/passsy/maven/CompositeActivity/_latestVersion)

CompositeAndroid is available via [jcenter](http://blog.bintray.com/2015/02/09/android-studio-migration-from-maven-central-to-jcenter/)

```gradle
dependencies {
    compile 'com.pascalwelsch.compositeandroid:activity:0.1'
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
