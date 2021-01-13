package com.sunday.HomeWorkday1501.HomeWork07;

import java.util.concurrent.locks.ReentrantLock;

public class sits implements Runnable{
    private static Integer releaseSits=80;
    ReentrantLock lock=new ReentrantLock();


    @Override
    public void run() {
        while (true) {
            lock.lock();
            if (releaseSits <= 0) {
                break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "----"  + "剩余"+ (releaseSits-1) + "个座");
            releaseSits--;
            lock.unlock();
        }
        System.out.println("车子已满");
    }
}
