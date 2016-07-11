# Changelog

## 0.2.1

- hotfix `OutOfMemoryException` (stackoverflow) when calling  `Activity#getLastCompositeCustomNonConfigurationInstance()` (#21) #22

## 0.2.0

- `FragmentPlugin` can now be added to `CompositeDialogFragment` #16
- Updated to support library version `23.4.0`
- Project got split up into different modules #20

```gradle
dependencies {
    
    // contains CompositeActivity
    compile 'com.pascalwelsch.compositeandroid:activity:0.2.0'
    
    // contains CompositeFragment and CompositeDialogFragment
    compile 'com.pascalwelsch.compositeandroid:fragment:0.2.0'
    
    
    // core module (not required, only abstract classes and utils)
    compile 'com.pascalwelsch.compositeandroid:core:0.2.0'
}
```


## 0.1.2

- Hotfix of crashes caused by type problems #11 #12

```gradle
dependencies {
    compile 'com.pascalwelsch.compositeandroid:activity:0.1.2'
}
```


## 0.1.1 (do not use, major bugs)

- Added support for DialogFragments (`CompositeDialogFragment`) #8
- plugin callbacks `onAddedToDelegate`, `onRemovedFromDelegated` when original is set #9


```gradle
dependencies {
    compile 'com.pascalwelsch.compositeandroid:activity:0.1.1'
}
```


## 0.1

- Added support for Fragments (`CompositeFragment`) #4
- Fixed threading problems #1

```gradle
dependencies {
    compile 'com.pascalwelsch.compositeandroid:activity:0.1'
}
```


## 0.1-alpha (do not use, major bugs)

initial release

- composition for `Activity`

```gradle
dependencies {
    compile 'com.pascalwelsch.compositeandroid:activity:0.1-alpha1'
}
```
