package com.pascalwelsch.compositeandroid.activity;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;

public class NonConfigurationInstance {

    @Test
    public void testMultiplePlugins() throws Exception {

        final ActivityPlugin a = spy(new ActivityPlugin(){
            @Override
            public CompositeNonConfigurationInstance onRetainNonConfigurationInstance() {
                return new CompositeNonConfigurationInstance("A", "Thing");
            }
        });
        final ActivityPlugin b = spy(new ActivityPlugin(){
            @Override
            public CompositeNonConfigurationInstance onRetainNonConfigurationInstance() {
                return new CompositeNonConfigurationInstance("B", "Something else");
            }
        });
        final ActivityPlugin c = spy(new ActivityPlugin());

        final CompositeActivity activity = mock(CompositeActivity.class);
        final ActivityDelegate delegate = new ActivityDelegate(activity);

        delegate.addPlugin(a);
        delegate.addPlugin(b);
        delegate.addPlugin(c);

        final Object nci = delegate.onRetainNonConfigurationInstance();
        assertThat(nci).isInstanceOf(NonConfigurationInstanceWrapper.class);
        NonConfigurationInstanceWrapper wrapper = (NonConfigurationInstanceWrapper) nci;

        doReturn(nci).when(activity).getLastCustomNonConfigurationInstance();

        assertThat(wrapper.getPluginNonConfigurationInstance("A"))
                .isNotNull()
                .isEqualTo("Thing");

        assertThat(wrapper.getPluginNonConfigurationInstance("B"))
                .isNotNull()
                .isEqualTo("Something else");

        assertThat(b.getLastNonConfigurationInstance("A"))
                .isNotNull()
                .isEqualTo("Thing");

        assertThat(b.getLastNonConfigurationInstance("B"))
                .isNotNull()
                .isEqualTo("Something else");
    }

}
