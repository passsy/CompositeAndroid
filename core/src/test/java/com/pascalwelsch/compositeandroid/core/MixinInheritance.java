package com.pascalwelsch.compositeandroid.core;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.assertj.core.api.Java6Assertions.fail;

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

        SuperCall mSuperListener;

        public void say(String s) {
            mDelegate.say(s);
        }

        public void sayHello() {
            if (mSuperListener != null) {
                mSuperListener.call();
            } else {
                throw new IllegalStateException(
                        "Do not call this method on a ActivityPlugin directly. You have to call `mDelegate.sayHello()` or the call order of the plugins would be mixed up.");
            }
        }
    }

    public static class PersonDelegate {

        public PersonPlugin mCallingPlugin;

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
            }, new SuperCallVoid() {
                @Override
                public void call(final Object... args) {
                    mCompositePerson.sayHello_super();
                }
            });
        }

        protected void callHook(
                final PluginMethodAction methodCall,
                final SuperCallVoid activitySuper,
                final Object... args) {

            final ArrayList<PersonPlugin> plugins = new ArrayList<>(mPlugins);
            plugins.remove(mCallingPlugin);

            final ListIterator<PersonPlugin> iterator = plugins.listIterator(plugins.size());
            callHook(iterator, methodCall, activitySuper, args);
        }


        void callHook(final ListIterator<PersonPlugin> iterator,
                final PluginMethodAction methodCall,
                final SuperCallVoid activitySuper,
                final Object... args) {

            if (iterator.hasPrevious()) {
                final PersonPlugin plugin = iterator.previous();
                final SuperCall<Void> listener
                        = new SuperCall<Void>() {
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

    public static class Surprise extends PersonPlugin {

        @Override
        public void sayHello() {
            say("Surprise!");
            super.sayHello();
        }
    }

    public interface PluginMethodAction {

        void call(PersonPlugin plugin, Object... args);
    }

    @Test
    public void testCallMethodFromSuper() throws Exception {

        final CompositePerson bossPerson = new CompositePerson();
        final Boss boss = new Boss();
        bossPerson.addPlugins(boss);
        try {
            boss.sayHello();
            fail("Exception excepted");
        } catch (IllegalStateException e) {
            assertThat(e).hasMessageContaining("order");
        }
        bossPerson.sayHello();
        assertThat(bossPerson.said)
                .isEqualTo(Arrays.asList("Hello, I'm John", "I'm your boss"));

        final CompositePerson paranoidPerson = new CompositePerson();
        final Paranoid paranoid = new Paranoid();
        paranoidPerson.addPlugins(paranoid);
        try {
            paranoid.sayHello();
            fail("Exception excepted");
        } catch (IllegalStateException e) {
            assertThat(e).hasMessageContaining("order");
        }
        paranoidPerson.said.clear();
        paranoidPerson.sayHello();
        assertThat(paranoidPerson.said)
                .isEqualTo(Arrays.asList("Is somebody listening?", "Hello, I'm John"));

        final CompositePerson paranoidBoss = new CompositePerson();
        paranoidBoss.addPlugins(paranoid);
        paranoidBoss.addPlugins(boss);
        try {
            paranoid.sayHello();
            fail("Exception excepted");
        } catch (IllegalStateException e) {
            assertThat(e).hasMessageContaining("order");
        }
        paranoidBoss.said.clear();
        paranoidBoss.sayHello();
        assertThat(paranoidBoss.said)
                .isEqualTo(Arrays.asList("Is somebody listening?", "Hello, I'm John",
                        "I'm your boss"));
        try {
            boss.sayHello();
            fail("Exception excepted");
        } catch (IllegalStateException e) {
            assertThat(e).hasMessageContaining("order");
        }

        final CompositePerson goodBoss = new CompositePerson();
        goodBoss.addPlugins(boss);
        final Good good = new Good();
        goodBoss.addPlugins(good);

        goodBoss.sayHello();
        assertThat(goodBoss.said)
                .isEqualTo(Arrays.asList("Hello, I'm John", "I'm your boss", "How are you?"));
        try {
            good.sayHello();
            fail("Exception excepted");
        } catch (IllegalStateException e) {
            assertThat(e).hasMessageContaining("order");
        }

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

    @Test
    public void testThreePlugins() throws Exception {
        final CompositePerson person = new CompositePerson();
        final Paranoid paranoid = new Paranoid();

        person.addPlugins(new Boss());
        person.addPlugins(paranoid);
        person.addPlugins(new Surprise());
        person.sayHello();
        assertThat(person.said)
                .isEqualTo(Arrays.asList("Surprise!", "Is somebody listening?", "Hello, I'm John",
                        "I'm your boss"));

        // TODO think about how this could be solved
        // this is the fun part. Real inheritance would call "Surprise!" first. this happens when
        // code gets executed before calling super and there is nothing I can do against.
        // at least nothing got called twice
        person.said.clear();

        try {
            paranoid.sayHello();
            fail("Exception excepted");
        } catch (IllegalStateException e) {
            assertThat(e).hasMessageContaining("order");
        }
    }

}
