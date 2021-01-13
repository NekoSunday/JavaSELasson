package com.sunday.demo03;

import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

public class Constructor {
    static Class<Student> studentClass;

    @BeforeClass
    public static void beforeClass(){
        studentClass=Student.class;
    }

    @Test
    public void test01() {
        java.lang.reflect.Constructor<?>[] constructors = studentClass.getConstructors();
        for (java.lang.reflect.Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

    }

    @Test
    public void test02(){
        java.lang.reflect.Constructor<?>[] constructors = studentClass.getDeclaredConstructors();
        for (java.lang.reflect.Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
    }
    @Test
    public void test03() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        java.lang.reflect.Constructor<Student> dc = studentClass.getDeclaredConstructor(String.class, int.class);
        dc.setAccessible(true);
        Student student=dc.newInstance("ls",23);
        System.out.println(student);
    }
}
