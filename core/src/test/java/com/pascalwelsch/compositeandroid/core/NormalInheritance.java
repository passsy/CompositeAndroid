package com.pascalwelsch.compositeandroid.core;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class NormalInheritance {

    public static class Person {

        List<String> said = new ArrayList<>();

        public void say(String s) {
            said.add(s);
        }

        public void sayHello() {
            say("Hello, I'm John");
        }
    }

    public static class Boss extends Person {

        public final void callSayHello() {
            sayHello();
        }

        @Override
        public void sayHello() {
            super.sayHello();
            say("I'm your boss");
        }
    }

    public static class ParanoidPerson extends Person {

        public final void callSayHello() {
            sayHello();
        }

        @Override
        public void sayHello() {
            say("Is somebody listening?");
            super.sayHello();
        }
    }

    public static class ParanoidBoss extends ParanoidPerson {

        @Override
        public void sayHello() {
            super.sayHello();
            say("I'm your boss");
        }
    }

    public static class GoodBoss extends Boss {

        @Override
        public void sayHello() {
            super.sayHello();
            say("How are you?");
        }
    }

    @Test
    public void testCallMethodFromSuper() throws Exception {

        final Boss boss = new Boss();
        boss.callSayHello();
        assertThat(boss.said)
                .isEqualTo(Arrays.asList("Hello, I'm John", "I'm your boss"));

        final ParanoidPerson person = new ParanoidPerson();
        person.callSayHello();
        assertThat(person.said)
                .isEqualTo(Arrays.asList("Is somebody listening?", "Hello, I'm John"));

        final ParanoidBoss paranoidBoss = new ParanoidBoss();
        paranoidBoss.callSayHello();
        assertThat(paranoidBoss.said)
                .isEqualTo(Arrays.asList("Is somebody listening?", "Hello, I'm John",
                        "I'm your boss"));

        final GoodBoss goodBoss = new GoodBoss();
        goodBoss.callSayHello();

        assertThat(goodBoss.said)
                .isEqualTo(Arrays.asList("Hello, I'm John", "I'm your boss", "How are you?"));
    }

    @Test
    public void testNormalInheritance() throws Exception {

        final Boss boss = new Boss();
        boss.sayHello();
        assertThat(boss.said)
                .isEqualTo(Arrays.asList("Hello, I'm John", "I'm your boss"));

        final ParanoidPerson person = new ParanoidPerson();
        person.sayHello();
        assertThat(person.said)
                .isEqualTo(Arrays.asList("Is somebody listening?", "Hello, I'm John"));

        final ParanoidBoss paranoidBoss = new ParanoidBoss();
        paranoidBoss.sayHello();
        assertThat(paranoidBoss.said)
                .isEqualTo(Arrays.asList("Is somebody listening?", "Hello, I'm John",
                        "I'm your boss"));

        final GoodBoss goodBoss = new GoodBoss();
        goodBoss.sayHello();

        assertThat(goodBoss.said)
                .isEqualTo(Arrays.asList("Hello, I'm John", "I'm your boss", "How are you?"));
    }
}
