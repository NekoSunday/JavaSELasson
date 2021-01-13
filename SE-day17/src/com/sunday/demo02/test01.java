package com.sunday.demo02;

public class test01 {
    public static void main(String[] args) {
        b(1);
    }


    private static void b(int i) {
        System.out.println(i);
        if (i==5000){
            return;
        }
        b(++i);
    }


}
