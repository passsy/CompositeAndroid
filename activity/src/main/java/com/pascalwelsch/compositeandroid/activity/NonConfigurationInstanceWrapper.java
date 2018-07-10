package com.pascalwelsch.compositeandroid.activity;

import android.support.annotation.Nullable;
import java.util.HashMap;

class NonConfigurationInstanceWrapper {

    private HashMap<String, Object> mPluginNonConfigurationInstances = new HashMap<>();

    private Object mSuperNonConfigurationInstance;

    public NonConfigurationInstanceWrapper(final Object superNonConfigurationInstance) {
        this.mSuperNonConfigurationInstance = superNonConfigurationInstance;
    }

    @Nullable
    public Object getPluginNonConfigurationInstance(final String key) {
        return mPluginNonConfigurationInstances.get(key);
    }

    public Object getSuperNonConfigurationInstance() {
        return mSuperNonConfigurationInstance;
    }

    public void putPluginNonConfigurationInstance(final CompositeNonConfigurationInstance nci) {
        mPluginNonConfigurationInstances.put(nci.getId(), nci.getNonConfigurationInstance());
    }
}
