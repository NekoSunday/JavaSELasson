package com.sunday.HomeWorkday1501.HomeWork03;

public class test {
    public static void main(String[] args) {
//        extendsTest t1 = new extendsTest();
//        t1.start();

        implTest t2 = new implTest();
        Thread thread = new Thread(t2, "线程2");
        thread.start();
    }
}
