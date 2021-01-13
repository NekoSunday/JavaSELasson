package com.sunday.preview;

public class demo01 {
    public static void main(String[] args) {
        MyThread thread = new MyThread("1线程");
        thread.start();
        MyThread2 thread2 = new MyThread2();
        Thread thread1 = new Thread(thread2, "二线程");
        thread1.start();

    }
}
