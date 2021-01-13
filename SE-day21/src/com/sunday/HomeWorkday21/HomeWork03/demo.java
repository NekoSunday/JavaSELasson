package com.sunday.HomeWorkday21.HomeWork03;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class demo {

    @Test
    public void test01() throws IllegalAccessException, InstantiationException {
        Class<Student> sc = Student.class;
        Student student = sc.newInstance();
        System.out.println(student);
    }

    @Test
    public void test02() throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        Constructor<Student> constructor = Student.class.getConstructor(String.class, int.class, String.class);
        Student student = constructor.newInstance("ls", 20, "女");
        System.out.println(student);
    }
}
