package com.sunday.HomeWorkday1501.HomeWork06;

public class test {
    public static void main(String[] args) {
        saleCups cups = new saleCups();
        Thread t1 = new Thread(cups,"实体店");
        Thread t2 = new Thread(cups,"网店");
        t1.start();
        t2.start();
    }
}
