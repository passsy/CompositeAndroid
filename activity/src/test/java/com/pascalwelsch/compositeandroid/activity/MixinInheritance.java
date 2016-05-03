package com.pascalwelsch.compositeandroid.activity;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class MixinInheritance {


    public static class Person {

        List<String> said = new ArrayList<>();

        public void say(String s) {
            said.add(s);
        }

        public void sayHello() {
            say("Hello, I'm John");
        }
    }

    public static class PersonPlugin {

        public PersonDelegate mDelegate;

        ActivityDelegateBase.ActivitySuperFunction mSuperListener;

        public void say(String s) {
            mDelegate.say(s);
        }

        public void sayHello() {
            if (mSuperListener != null) {
                mSuperListener.call();
            }
        }
    }

    public static class PersonDelegate {

        List<PersonPlugin> mPlugins = new ArrayList<>();

        private CompositePerson mCompositePerson;

        public PersonDelegate(
                final CompositePerson compositePerson) {

            mCompositePerson = compositePerson;
        }

        public void say(String s) {
            mCompositePerson.say(s);
        }

        public void sayHello() {
            callHook(new PluginMethodAction() {
                @Override
                public void call(final PersonPlugin plugin, final Object... args) {
                    plugin.sayHello();
                }
            }, new ActivityDelegateBase.ActivitySuperAction() {
                @Override
                public void call(final Object... args) {
                    mCompositePerson.sayHello_super();
                }
            });
        }

        protected void callHook(
                final PluginMethodAction methodCall,
                final ActivityDelegateBase.ActivitySuperAction activitySuper,
                final Object... args) {

            final ListIterator<PersonPlugin> iterator = mPlugins.listIterator(mPlugins.size());
            callHook(iterator, methodCall, activitySuper, args);
        }


        void callHook(final ListIterator<PersonPlugin> iterator,
                final PluginMethodAction methodCall,
                final ActivityDelegateBase.ActivitySuperAction activitySuper,
                final Object... args) {

            if (iterator.hasPrevious()) {
                final PersonPlugin plugin = iterator.previous();
                final ActivityDelegateBase.ActivitySuperFunction<Void> listener
                        = new ActivityDelegateBase.ActivitySuperFunction<Void>() {
                    @Override
                    public Void call(final Object... args) {
                        callHook(iterator, methodCall, activitySuper, args);
                        return null;
                    }
                };
                plugin.mSuperListener = listener;
                methodCall.call(plugin, args);
                plugin.mSuperListener = null;
            } else {
                activitySuper.call(args);
            }
        }
    }

    public static class CompositePerson extends Person {

        PersonDelegate delegate = new PersonDelegate(this);

        public void addPlugins(PersonPlugin plugin) {
            delegate.mPlugins.add(plugin);
            plugin.mDelegate = delegate;
        }

        @Override
        public void sayHello() {
            delegate.sayHello();
        }

        public void sayHello_super() {
            super.sayHello();
        }
    }

    public static class Boss extends PersonPlugin {

        @Override
        public void sayHello() {
            super.sayHello();
            say("I'm your boss");
        }
    }

    public static class Paranoid extends PersonPlugin {

        @Override
        public void sayHello() {
            say("Is somebody listening?");
            super.sayHello();
        }
    }

    public static class Good extends PersonPlugin {

        @Override
        public void sayHello() {
            super.sayHello();
            say("How are you?");
        }
    }

    public interface PluginMethodAction {

        void call(PersonPlugin plugin, Object... args);
    }

    @Test
    public void testMixinInheritance() throws Exception {

        final CompositePerson boss = new CompositePerson();
        boss.addPlugins(new Boss());
        boss.sayHello();
        assertThat(boss.said)
                .isEqualTo(Arrays.asList("Hello, I'm John", "I'm your boss"));

        final CompositePerson person = new CompositePerson();
        person.addPlugins(new Paranoid());
        person.sayHello();
        assertThat(person.said)
                .isEqualTo(Arrays.asList("Is somebody listening?", "Hello, I'm John"));

        final CompositePerson paranoidBoss = new CompositePerson();
        paranoidBoss.addPlugins(new Paranoid());
        paranoidBoss.addPlugins(new Boss());
        paranoidBoss.sayHello();
        assertThat(paranoidBoss.said)
                .isEqualTo(Arrays.asList("Is somebody listening?", "Hello, I'm John",
                        "I'm your boss"));


        final CompositePerson goodBoss = new CompositePerson();
        goodBoss.addPlugins(new Boss());
        goodBoss.addPlugins(new Good());
        goodBoss.sayHello();

        assertThat(goodBoss.said)
                .isEqualTo(Arrays.asList("Hello, I'm John", "I'm your boss", "How are you?"));
    }

}
