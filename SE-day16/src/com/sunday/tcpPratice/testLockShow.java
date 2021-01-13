package com.sunday.tcpPratice;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class testLockShow {
    private Integer count = 1;
    ReentrantLock lock = new ReentrantLock();

    Condition c1=lock.newCondition();
    Condition c2=lock.newCondition();
    Condition c3=lock.newCondition();



    public void show1() {
        for (int i = 0; i < 20; i++) {
            lock.lock();
            while (count != 1) {
                try {
                    Thread.sleep(100);
                    c1.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.print("我");
            System.out.print("是");
            System.out.print("中");
            System.out.print("国");
            System.out.print("人");
            System.out.println();
            count = 2;
            c2.signal();
            lock.unlock();
        }
    }

    public void show2() {
        for (int i = 0; i < 20; i++) {
            lock.lock();
            while (count != 2) {
                try {
                    Thread.sleep(100);
                    c2.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.print("犯");
            System.out.print("我");
            System.out.print("中");
            System.out.print("华");
            System.out.print("者");
            System.out.println();
            count = 3;
            c3.signal();
            lock.unlock();
        }
    }

    public void show3() {
        for (int i = 0; i < 20; i++) {
            lock.lock();
            while (count != 3) {
                try {
                    Thread.sleep(100);
                    c3.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.print("虽");
            System.out.print("远");
            System.out.print("必");
            System.out.print("诛");
            System.out.println();
            count = 1;
            c1.signal();
            lock.unlock();
        }
    }
}
