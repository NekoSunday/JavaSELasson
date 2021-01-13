package com.sunday.HomeWorkday21.HomeWork11;

import java.lang.reflect.Method;

public class test {
    public static void main(String[] args) throws Exception{
        Class<testClass> tc = testClass.class;
        testClass newClass = tc.newInstance();
        Method[] methods = tc.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyTest.class)){
                Object invoke = method.invoke(newClass);
                System.out.println(invoke);
            }
        }
    }
}
