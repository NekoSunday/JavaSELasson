package com.sunday.demo04;

import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodPratice {

    public static Class<Student> studentClass;

    @BeforeClass
    public static void beforeClass(){
        studentClass=Student.class;
    }
    @Test
    public void test01(){
        Method[] methods = studentClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
    @Test
    public void test02(){
//        Constructor<?>[] constructors = studentClass.getConstructors();
        Method[] dm = studentClass.getDeclaredMethods();
        for (Method method : dm) {
            System.out.println(method);
        }
    }
    @Test
    public void test03() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Student student = studentClass.newInstance();
        Method method = studentClass.getMethod("eat");
        Object invoke = method.invoke(student);
        System.out.println(invoke);
    }

    @Test
    public void test04(){

    }
}
