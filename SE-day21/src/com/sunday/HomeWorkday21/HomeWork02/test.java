package com.sunday.HomeWorkday21.HomeWork02;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) throws Exception{
        ArrayList<Integer> list = new ArrayList<>();
        Method add = ArrayList.class.getMethod("add", Object.class);
        Object invoke = add.invoke(list,"字符");
        System.out.println(list);
    }
}
