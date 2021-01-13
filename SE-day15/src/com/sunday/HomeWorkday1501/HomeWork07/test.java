package com.sunday.HomeWorkday1501.HomeWork07;

public class test {
    public static void main(String[] args) {
        sits sit = new sits();
        Thread t1 = new Thread(sit, "前门上车");
        Thread t2 = new Thread(sit, "中门上车");
        Thread t3 = new Thread(sit, "后门上车");

        t1.start();
        t2.start();
        t3.start();
    }
}
