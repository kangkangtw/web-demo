package com.hkk.webdemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class InheritedTest {

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    @Inherited
    public @interface InheritedAnnotation {

    }

    class Parent {

        @InheritedAnnotation
        public void say() {

        }
    }

    class Child extends Parent {

        @Override
        public void say() {
            super.say();
        }
    }

    public static void main(String[] args) throws NoSuchMethodException {
        InheritedAnnotation annotation = Child.class.getMethod("say")
            .getAnnotation(InheritedAnnotation.class);
        System.out.println(annotation); //BB 注解没有 @Inherited 的话，bb 将为 null
    }
}
