package com.sunday.demo05;

import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.Field;

public class fieldPratice {

    static Class<Student> studentClass;
    @BeforeClass
    public static void beforeClass(){
        studentClass=Student.class;
    }

    @Test
    public void test01(){
        Field[] fields = studentClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
    }

    @Test
    public void test02() throws IllegalAccessException, NoSuchFieldException, InstantiationException {
        Student student = studentClass.newInstance();

        Field sex = studentClass.getDeclaredField("sex");

        sex.setAccessible(true);
        sex.set(student,"女");

        Object o = sex.get(student);
        System.out.println(o);
    }
}
