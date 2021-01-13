package com.sunday.HomeWorkday21.HomeWork05;

import java.lang.reflect.Method;
import java.util.Scanner;

public class TestA {
    public static void main(String[] args) throws Exception{
        String s = new Scanner(System.in).nextLine();
        Class<?> c = Class.forName(s);
        Object o = c.newInstance();
        Method showString = c.getMethod("showString");
        Object invoke = showString.invoke(o);
        System.out.println(invoke);
    }
}
