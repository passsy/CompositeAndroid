# CompositeAndroid

![License](https://img.shields.io/badge/license-Apache%202-green.svg?style=flat)

*Composition over inheritance*

Allows to add functionality into an Android `Activity`. Just because we all have a `BaseActivity` in our projects containing too much unused stuff. When it grows, it get unmaintainable.

## Possible Usecases

- Plugin for the GooglePlayApiClient handling all the edgecases
- Wrap your layout in a predefined container by overriding `setContentView()`
- a Plugin showing a loading spinner
- a Plugin for requesting permissions and automatically handling all response codes
- gradually add libraries like [Mosby](https://github.com/sockeqwe/mosby) (without extending from a `MvpActivity`) or [Flow](https://github.com/square/flow) to your Activities when you need it
- and **so much more...**

## State of the Art

Given you have an `Activity` showing a list of tweets (`TweetStreamActivity`) and you want add view tracking. 

### Inheritance 

You could do it with inheritance and use `TrackedTweetStreamActivity` from now on:

```java
public class TrackedTweetStreamActivity extends TweetStreamActivity {

    @Override
    protected void onResume() {
        super.onResume();
        Analytics.trackView("stream");
    }
}
```

more likely you would create a `TrackedActivity` and extend the `TweetStreamActivity` from it:

```java
public abstract class TrackedActivity extends AppCompatActivity {

    public abstract String getTrackingName();

    @Override
    protected void onResume() {
        super.onResume();
        Analytics.trackView(getTrackingName());
    }
}
```

```java
public class TrackedTweetStreamActivity extends TrackedActivity {

    @Override
    public String getTrackingName() {
        return "stream";
    }
}
```

Both solutions work but don't scale well. You'll most likely end up with big inheritance structures:

```java
class MvpActivity extends AppCompatActivity { ... }

class BaseActivity extends AppCompatActivity { ... }

class BaseMvpActivity extends MvpActivity { ... }

class WizardUiActivity extends BaseActivity { ... }

class TrackedWizardUiActivity extends WizardUiActivity { ... }

class TrackedBaseActivity extends BaseActivity { ... }

class TrackedMvpBaseActivity extends BaseMvpActivity { ... }
```

### Delegation

Some libraries out there provide both, a specialized `Activity` extending `AppCompatActivity` and a delegate with a documentation when to call which function of the delegate in your `Activity`.

```java
public class TrackingDelegate {

    /**
     * usage:
     * <pre>{@code
     *
     * @Override
     * protected void onResume() {
     *     super.onResume();
     *     mTrackingDelegate.onResume();
     * }
     * } </pre>
     */
    public void onResume() {
        Analytics.trackView("<viewName>");
    }

}
```

```java
public class TweetStreamActivity extends AppCompatActivity {

    private final TrackingDelegate mTrackingDelegate = new TrackingDelegate();

    @Override
    protected void onResume() {
        super.onResume();
        mTrackingDelegate.onResume();
    }
}
```

This is an elegant solution but breaks when updating such a library and the delegate call position has changed. Or when the delegate added new callbacks which don't get automatically implemented by increasing the version number in the `build.gradle`.

# Composite Android solution

CompositeAndroid let's you add delegates to your Activity without adding calls to the correct location. Such delegates are called `Plugins`. A Plugin is able to inject code at every position in the Activity lifecycle. It is able to override every method.


#### Get Started [![Download](https://api.bintray.com/packages/passsy/maven/CompositeActivity/images/download.svg) ](https://bintray.com/passsy/maven/CompositeActivity/_latestVersion)

CompositeAndroid is available via [jcenter](http://blog.bintray.com/2015/02/09/android-studio-migration-from-maven-central-to-jcenter/)

```gradle
dependencies {
    // it's very important to use the same version as the support library
    def supportLibraryVersion = "25.0.0"
    
    // contains CompositeActivity
    implementation "com.pascalwelsch.compositeandroid:activity:$supportLibraryVersion"

    // contains CompositeFragment and CompositeDialogFragment
    implementation "com.pascalwelsch.compositeandroid:fragment:$supportLibraryVersion"


    // core module (not required, only abstract classes and utils)
    implementation "com.pascalwelsch.compositeandroid:core:$supportLibraryVersion"
}
```

#### Extend from a composite implementation

Extend from one of the composite implementations when you want to add plugins. This is the only inheritance you have to make.

```diff
- public class MyActivity extends AppCompatActivity {
+ public class MyActivity extends CompositeActivity {
```

```diff
- public class MyFragment extends Fragment { // v4 support library
+ public class MyFragment extends CompositeFragment {
```


#### Add a plugins

Use the constructor to add plugins. Do not add plugins in `#onCreate()`. That's too late. Many `Activity` methods are called before `#onCreate()` which could be important for a plugin to work.

```java
public class MainActivity extends CompositeActivity {

    final LoadingIndicatorPlugin loadingPlugin = new LoadingIndicatorPlugin();

    public MainActivity() {
        addPlugin(new ViewTrackingPlugin("Main"));
        addPlugin(loadingPlugin);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // ...

        // example usage of the LoadingIndicatorPlugin
        loadingPlugin.showLoadingIndicator();
    }
}
```

Read more about the ordering of the Plugins [here](https://github.com/passsy/CompositeAndroid/wiki/Ordering-of-plugins-and-the-result-on-the-call-order)

#### Write a plugin


This is the strength of CompositeAndroid. You don't really have to learn something new. It works like you'd extend you `Activity` to add functionality. Let's change the `TrackedActivity` from above and create a `ViewTrackingPlugin`.

Here the original
```java
public abstract class TrackedActivity extends AppCompatActivity {

    public abstract String getTrackingName();

    @Override
    protected void onResume() {
        super.onResume();
        Analytics.trackView(getTrackingName());
    }
}
```

As plugin:
```java
public class ViewTrackingPlugin extends ActivityPlugin {

    private final String mViewName;

    protected TrackedPlugin(final String viewName) {
        mViewName = viewName;
    }

    @Override
    public void onResume() {
        super.onResume();
        Analytics.trackView(mViewName);
    }
}
```

The implementation inside of `onResume()` hasn't changed!

### Plugin features

Here some information about plugins. The Activity example is used but it works the same for other classes, too.

- it's possible to override **every** Activity method from a `Plugin`
- execute code before calling `super` executes code before `super` of Activity
- explicitly not calling `super` is allowed and results in not calling super of the `Activity`. (The activity will tell if the `super` call was required)
- execute code after calling `super` executes code after `super` of Activity

### restrictions

Not everything works exactly like you'd use inheritance. Here is a small list of minor things you have to know:

#### Important for all Plugin authors
- you can't call an `Activity` method of a `Plugin` such as `onResume()` or `getResources()`. Otherwise the call order of the added plugins is not guaranteed. Instead call those methods on the real `Activity` with `getActivity.onResume()` or `getActivity.getResources()`.

#### onRetainNonConfigurationInstace
- `CompositeActivity#onRetainCustomNonConfigurationInstance()` is final and required for internal usage, use `CompositeActivity#onRetainCompositeCustomNonConfigurationInstance()` instead
- `CompositeActivity#getLastCustomNonConfigurationInstance()` is final and required for internal usage, use `CompositeActivity#getLastCompositeCustomNonConfigurationInstance()` instead
- Saving a NonConfigurationInstance inside of a `Plugin` works by overriding `onRetainNonConfigurationInstance()` and returning an instance of `CompositeNonConfigurationInstance(key, object)`. Get the data again with `getLastNonConfigurationInstance(key)` and make sure you use the correct `key`.

## Project stage

`CompositeAndroid` gets used in productions without major problems. There could be more performance related improvements but it works reliably right now.

Minor problems are:
- Support lib updates **sometimes** require and update of `CompositeAndroid`. I didn't expect this because the API should be really stable, but it happened in the past (upgrading from `24.1.0` to `24.2.0`). That's why `CompositeAndroid` has the same version name as the support library. Yes, the support library can be used with and older `CompositeAndroid` version. But it can break, as it happened already. Then again all upgrades from `24.2.1` where 100% backwards compatible. We'll see what the future brings.
- Generating a new release cannot be fully automated right now. It requires some steps in Android Studio to generate overrides and format the generated sources.
- Some methods are edge cases like `getLastNonConfigurationInstance()` and `onRetainCustomNonConfigurationInstance()` did require manual written code.

It was a proof of conecpt and it turned out to work great. So great I haven't touched it a lot after the initial draft. Things like the documentation are still missing.
I'm still keeping this project up to date but I don't invest much time in performance improvements. I don't need it, it works at it is for me.

## Inspiration and other Android Composition Libraries

- [Navi](https://github.com/trello/navi) of course, but
    - it doesn't support all methods (only methods without return value)
    - it does only support code execution before or after calling `super`, not very flexible
    - no plugin API
- [Lightcycle](https://github.com/soundcloud/lightcycle)
    - supports only basic lifecycle methods.
- [Decorator](https://github.com/eyeem/decorator)
    - works only in scope of your own project. It doesn't allow including libraries providing plugins because the is no global Activity implementation.
    - Every "DecoratedActivity" is generated for a specific usecase based on a blueprint you have to create every time

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
