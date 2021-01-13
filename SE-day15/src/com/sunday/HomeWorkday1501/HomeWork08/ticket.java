package com.sunday.HomeWorkday1501.HomeWork08;

import java.util.concurrent.locks.ReentrantLock;

public class ticket extends Thread {
    private static Integer tickets=1000;
    ReentrantLock lock=new ReentrantLock();
    @Override
    public void run() {
        while (true) {
            lock.lock();
            if (tickets <= 0) {
                break;
            }
            System.out.println(Thread.currentThread().getName() + "卖了一张票,剩余票数为"+(1001-tickets));
            tickets--;
            lock.unlock();
        }
    }
}
