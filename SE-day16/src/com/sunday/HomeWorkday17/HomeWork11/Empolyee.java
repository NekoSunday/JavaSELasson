package com.sunday.HomeWorkday17.HomeWork11;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class Empolyee implements Runnable {
    private Integer workerNum = 100;
    private static Integer countBack = 0;
    private static Integer countFront = 0;
    ReentrantLock lock = new ReentrantLock();

    public static Integer getCountBack() {
        return countBack;
    }

    public static Integer getCountFront() {
        return countFront;
    }

    @Override
    public void run() {
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int index = new Random().nextInt(100) + 1;
            lock.lock();
            if (workerNum <= 0) {
                break;
            }
            if (!list.contains(index)) {
                list.add(index);
                System.out.println("编号为：" + index + "的员工从" + Thread.currentThread().getName() + "入场！，拿到的双色球彩票号码是:" + DoubleColorBallUtil.create());
                if (Thread.currentThread().getName().equals("后门")) {
                    countBack++;
                } else {
                    countFront++;
                }
                workerNum--;
            }
            lock.unlock();
        }
        show();
    }


    public void show() {
        System.out.println("从后门入场的员工总共：" + Empolyee.getCountBack());
        System.out.println("从前门入场的员工总共：" + Empolyee.getCountFront());
    }
}
