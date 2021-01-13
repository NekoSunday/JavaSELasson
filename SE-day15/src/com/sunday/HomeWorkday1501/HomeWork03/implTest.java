package com.sunday.HomeWorkday1501.HomeWork03;

public class implTest implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
