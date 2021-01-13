package com.sunday.HomeWorkday17.HomeWork11;

public class test {
    public static void main(String[] args) {
        Empolyee empolyee = new Empolyee();
        /*Thread t1 = new Thread(empolyee, "前门");
        Thread t2 = new Thread(empolyee, "后门");
        t1.start();
        t2.start();*/

        new Thread(empolyee, "后门").start();
        new Thread(empolyee, "前门").start();
    }
}
