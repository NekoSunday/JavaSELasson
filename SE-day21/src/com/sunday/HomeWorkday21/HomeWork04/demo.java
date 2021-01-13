package com.sunday.HomeWorkday21.HomeWork04;

import org.junit.Test;

import java.lang.reflect.Method;

public class demo {
    @Test
    public void test() throws Exception {
        Class<newClass> nc = newClass.class;
        newClass aClass = nc.newInstance();
        Method show = nc.getMethod("show");
        Object invoke = show.invoke(aClass);
        System.out.println(invoke);
    }
}
