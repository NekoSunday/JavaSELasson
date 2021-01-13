package com.sunday.tcpPratice;

import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable{
    private static Integer ticket=1000;
    private static Object obj=new Object();
    ReentrantLock lock=new ReentrantLock();

    //可以使用this作为对象锁
    @Override
    public void run() {
            while (true) {
                lock.lock();
                if (ticket <= 0) {
                    break;
                }
                System.out.println(Thread.currentThread().getName() + "正在卖第" + (1001 - ticket) + "张票");
                ticket--;
                lock.unlock();
        }
    }
}
