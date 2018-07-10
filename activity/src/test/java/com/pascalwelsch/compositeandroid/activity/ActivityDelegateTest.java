package com.pascalwelsch.compositeandroid.activity;

import static junit.framework.Assert.fail;
import static org.assertj.core.api.Java6Assertions.*;
import static org.mockito.Mockito.*;

import android.support.annotation.LayoutRes;
import android.view.KeyEvent;
import android.view.MenuItem;
import org.junit.*;
import org.mockito.*;

public class ActivityDelegateTest {

    private interface Call {

        void call();
    }

    @Test
    public void testCallEarlySuper() throws Exception {

        final ActivityPlugin a = spy(new ActivityPlugin());
        final ActivityPlugin b = spy(new ActivityPlugin() {
            @Override
            public boolean onKeyDown(final int keyCode, final KeyEvent event) {
                return true;
            }
        });
        final ActivityPlugin c = spy(new ActivityPlugin());

        final CompositeActivity activity = mock(CompositeActivity.class);
        final ActivityDelegate delegate = new ActivityDelegate(activity);

        delegate.addPlugin(a);
        delegate.addPlugin(b);
        delegate.addPlugin(c);

        final KeyEvent event = mock(KeyEvent.class);
        delegate.onKeyDown(1, event);

        verify(a, never()).onKeyDown(1, event);
        verify(b).onKeyDown(1, event);
        verify(c).onKeyDown(1, event);
        verify(activity, never()).super_onKeyDown(1, event);
    }

    @Test
    public void testCallHook() throws Exception {

        final ActivityPlugin a = spy(new ActivityPlugin());
        final ActivityPlugin b = spy(new ActivityPlugin());
        final ActivityPlugin c = spy(new ActivityPlugin());

        final CompositeActivity activity = mock(CompositeActivity.class);
        final ActivityDelegate delegate = new ActivityDelegate(activity);

        delegate.addPlugin(a);
        delegate.addPlugin(b);
        delegate.addPlugin(c);

        final KeyEvent event = mock(KeyEvent.class);
        delegate.onKeyDown(1, event);

        verify(a).onKeyDown(1, event);
        verify(b).onKeyDown(1, event);
        verify(c).onKeyDown(1, event);
        verify(activity).super_onKeyDown(1, event);
    }

    @Test
    public void testCallMethodFromPlugin() throws Exception {

        final ActivityPlugin a = spy(new ActivityPlugin());
        final ActivityPlugin b = spy(new ActivityPlugin());
        final ActivityPlugin c = spy(new ActivityPlugin());

        final CompositeActivity activity = mock(CompositeActivity.class);
        final ActivityDelegate delegate = new ActivityDelegate(activity);

        delegate.addPlugin(a);
        delegate.addPlugin(b);
        delegate.addPlugin(c);

        final int layoutResID = android.R.layout.simple_list_item_1;
        try {
            b.setContentView(layoutResID);
            fail("no exception thrown");
        } catch (IllegalStateException e) {
            assertThat(e).hasMessageContaining("setContentView")
                    .hasMessageContaining("Delegate");
        }
    }

    @Test
    public void testCallMethodFromPluginOverrideMethodNotCallingSuper() throws Exception {

        final ActivityPlugin a = spy(new ActivityPlugin() {
            @Override
            public void setContentView(@LayoutRes final int layoutResID) {
                // doing my on thing here, not calling super.setContentView(int)
            }
        });
        final ActivityPlugin b = spy(new ActivityPlugin());
        final ActivityPlugin c = spy(new ActivityPlugin());

        final CompositeActivity activity = mock(CompositeActivity.class);
        final ActivityDelegate delegate = new ActivityDelegate(activity);

        delegate.addPlugin(a);
        delegate.addPlugin(b);
        delegate.addPlugin(c);

        final int layoutResID = android.R.layout.simple_list_item_1;
        try {
            b.setContentView(layoutResID);
            fail("no exception thrown");
        } catch (IllegalStateException e) {
            assertThat(e).hasMessageContaining("setContentView")
                    .hasMessageContaining("Delegate");
        }

        delegate.setContentView(layoutResID);

        verify(a).setContentView(layoutResID);
        // twice because of the error above
        verify(b, times(2)).setContentView(layoutResID);
        verify(c).setContentView(layoutResID);
        verify(activity, never()).super_setContentView(layoutResID);
        verify(activity, never()).setContentView(layoutResID);
    }

    @Test
    public void testChangeParamsWithSuperCall() throws Exception {

        final ActivityPlugin a = spy(new ActivityPlugin());
        final ActivityPlugin b = spy(new ActivityPlugin() {
            @Override
            public boolean onKeyDown(final int keyCode, final KeyEvent event) {
                return super.onKeyDown(25, event);
            }
        });
        final ActivityPlugin c = spy(new ActivityPlugin());

        final CompositeActivity activity = mock(CompositeActivity.class);
        final ActivityDelegate delegate = new ActivityDelegate(activity);

        delegate.addPlugin(a);
        delegate.addPlugin(b);
        delegate.addPlugin(c);

        final KeyEvent event = mock(KeyEvent.class);
        delegate.onKeyDown(1, event);

        verify(a).onKeyDown(25, event);
        verify(b).onKeyDown(1, event);
        verify(c).onKeyDown(1, event);
        verify(activity).super_onKeyDown(25, event);
    }

    @Test
    public void testCodeBeforeSuper() throws Exception {

        final Call beforeBSuper = mock(Call.class);
        final Call afterBSuper = mock(Call.class);
        final Call beforeCSuper = mock(Call.class);
        final Call afterCSuper = mock(Call.class);

        final ActivityPlugin a = spy(new ActivityPlugin());
        final ActivityPlugin b = spy(new ActivityPlugin() {
            @Override
            public void onPause() {
                beforeBSuper.call();
                super.onPause();
                afterBSuper.call();
            }
        });
        final ActivityPlugin c = spy(new ActivityPlugin() {
            @Override
            public void onPause() {
                beforeCSuper.call();
                super.onPause();
                afterCSuper.call();
            }
        });

        final CompositeActivity activity = mock(CompositeActivity.class);
        final ActivityDelegate delegate = new ActivityDelegate(activity);

        delegate.addPlugin(a);
        delegate.addPlugin(b);
        delegate.addPlugin(c);

        delegate.onPause();

        final InOrder inOrder = inOrder(a, b, c, activity, beforeBSuper, afterBSuper, beforeCSuper,
                afterCSuper);
        inOrder.verify(c).onPause();
        inOrder.verify(beforeCSuper).call();
        inOrder.verify(b).onPause();
        inOrder.verify(beforeBSuper).call();
        inOrder.verify(a).onPause();
        inOrder.verify(activity).super_onPause();
        inOrder.verify(afterBSuper).call();
        inOrder.verify(afterCSuper).call();


    }

    @Test
    public void testNoPlugins() throws Exception {

        final CompositeActivity activity = mock(CompositeActivity.class);
        final ActivityDelegate delegate = new ActivityDelegate(activity);

        final KeyEvent event = mock(KeyEvent.class);
        delegate.onKeyDown(1, event);
        verify(activity).super_onKeyDown(1, event);
    }

    @Test
    public void testSingleEvent() throws Exception {

        final ActivityPlugin a = spy(new ActivityPlugin());

        final CompositeActivity activity = mock(CompositeActivity.class);
        final ActivityDelegate delegate = new ActivityDelegate(activity);

        delegate.addPlugin(a);

        final KeyEvent event = mock(KeyEvent.class);
        delegate.onKeyDown(1, event);

        verify(a).onKeyDown(1, event);
        verify(activity).super_onKeyDown(1, event);
    }
/*
    @Test
    public void testNonConfigurationInstance() throws Exception {

        final ActivityPlugin a = spy(new ActivityPlugin());
        final ActivityPlugin b = spy(new ActivityPlugin() {
            @Override
            public Object onRetainCustomNonConfigurationInstance() {
                final Object superNic = super.onRetainCustomNonConfigurationInstance();
                assertEquals("c", superNic.toString());
                return new NonConfigurationInstanceWrapper(superNic) {
                    @Override
                    public String toString() {
                        return "b";
                    }
                };
            }
        });
        final ActivityPlugin c = spy(new ActivityPlugin() {
            @Override
            public Object onRetainCustomNonConfigurationInstance() {
                return new NonConfigurationInstanceWrapper(
                        super.onRetainCustomNonConfigurationInstance()) {
                    @Override
                    public String toString() {
                        return "c";
                    }
                };
            }
        });

        final CompositeActivity activity = mock(CompositeActivity.class);
        doReturn("SuperObject").when(activity).onRetainCustomNonConfigurationInstance_super();
        final ActivityDelegate delegate = new ActivityDelegate(activity);

        delegate.addPlugin(a);
        delegate.addPlugin(b);
        delegate.addPlugin(c);

        Object o = delegate.onRetainCustomNonConfigurationInstance();
        assertEquals("b", o.toString());


        doReturn(o).when(activity).getLastCustomNonConfigurationInstance_super();

        assertEquals("SuperObject", a.getLastCustomNonConfigurationInstance().toString());
        assertEquals("b", b.getLastCustomNonConfigurationInstance().toString());
        assertEquals("c", c.getLastCustomNonConfigurationInstance().toString());
    }*/

    @Test
    public void testStopPropagatingEvent() throws Exception {

        final ActivityPlugin a = spy(new ActivityPlugin());
        final ActivityPlugin b = spy(new ActivityPlugin() {
            @Override
            public boolean onKeyDown(final int keyCode, final KeyEvent event) {
                if (keyCode == 25) {
                    return true; // stop propagating
                }
                return super.onKeyDown(keyCode, event);
            }
        });
        final ActivityPlugin c = spy(new ActivityPlugin() {
            @Override
            public boolean onKeyDown(final int keyCode, final KeyEvent event) {
                return super.onKeyDown(25, event);
            }
        });

        final ICompositeActivity activity = mock(ICompositeActivity.class);
        final ActivityDelegate delegate = new ActivityDelegate(activity);

        delegate.addPlugin(a);
        delegate.addPlugin(b);
        delegate.addPlugin(c);

        final KeyEvent event = mock(KeyEvent.class);
        delegate.onKeyDown(1, event);

        verify(a, never()).onKeyDown(25, event);
        verify(b).onKeyDown(25, event);
        verify(c).onKeyDown(1, event);
        verify(activity, never()).super_onKeyDown(25, event);
    }

    @Test
    public void testSuperResult() throws Exception {

        final ActivityPlugin a = spy(new ActivityPlugin());
        final ActivityPlugin b = spy(new ActivityPlugin());
        final ActivityPlugin c = spy(new ActivityPlugin());

        final ICompositeActivity activity = mock(ICompositeActivity.class);
        final ActivityDelegate delegate = new ActivityDelegate(activity);

        delegate.addPlugin(a);
        delegate.addPlugin(b);
        delegate.addPlugin(c);

        final MenuItem item = mock(MenuItem.class);
        delegate.onContextItemSelected(item);

        verify(a).onContextItemSelected(item);
        verify(b).onContextItemSelected(item);
        verify(c).onContextItemSelected(item);
        verify(activity).super_onContextItemSelected(item);
    }

    @Test
    public void testSuperResultEarlyReturn() throws Exception {

        final ActivityPlugin a = spy(new ActivityPlugin());
        final ActivityPlugin b = spy(new ActivityPlugin() {
            @Override
            public boolean onContextItemSelected(final MenuItem item) {
                return false;
            }
        });
        final ActivityPlugin c = spy(new ActivityPlugin());

        final ICompositeActivity activity = mock(ICompositeActivity.class);
        final ActivityDelegate delegate = new ActivityDelegate(activity);

        delegate.addPlugin(a);
        delegate.addPlugin(b);
        delegate.addPlugin(c);

        final MenuItem item = mock(MenuItem.class);
        delegate.onContextItemSelected(item);

        verify(a, never()).onContextItemSelected(item);
        verify(b).onContextItemSelected(item);
        verify(c).onContextItemSelected(item);
        verify(activity, never()).super_onContextItemSelected(item);
    }


}