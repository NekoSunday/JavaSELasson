package com.sunday.HomeWorkday17.GQ1.HomeWork01;

import java.io.File;

public class test {
    public static void main(String[] args) {
        File f1 = new File("d:/aaa");
        File f2 = new File("/aaa","/bbb");

        System.out.println(f1.getAbsoluteFile());
        System.out.println(f2.getAbsoluteFile());
    }
}
