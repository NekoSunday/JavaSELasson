package com.sunday.HomeWorkday14.HomeWork2.GQ3.HomeWork03;

import java.util.Random;

public class MyThread extends Thread {
    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName());
        int sum=0;
        for (int i = 0; i < 10; i++) {
            int index = new Random().nextInt(900) + 101;
            sum+=index;
        }
        System.out.println(sum);
    }
}
