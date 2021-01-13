package com.sunday.demo02;

public class ShowClass {
    public static <T> void show(T t){
        System.out.println(t.toString());
    }

    public <T> T show2(T t){
        return t;
    }
}
