package com.sunday.HomeWorkday1501.HomeWork06;

import java.util.concurrent.locks.ReentrantLock;

public class saleCups implements Runnable{
    private static Integer releaseCups=100;
    ReentrantLock lock=new ReentrantLock();
    private static Integer countWeb=0;
    private static Integer countShop=0;

    public static Integer getCountWeb() {
        return countWeb;
    }

    public static Integer getCountShop() {
        return countShop;
    }

    @Override
    public void run() {
            while (true) {
                lock.lock();
                if (releaseCups <= 0) {
                    break;
                }
                System.out.println(Thread.currentThread().getName() + "卖出第" + (101 - releaseCups) + "个,剩余" + (releaseCups-1) + "个");
                releaseCups--;
                if (Thread.currentThread().getName().equals("网店")){
                    countWeb++;
                }else{
                    countShop++;
                }
                lock.unlock();
            }
        System.out.println("网店销售为："+ saleCups.getCountWeb());
        System.out.println("实体店销售为："+saleCups.getCountShop());
        }
    }
