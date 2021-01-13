package com.sunday.tcpPratice;

public class testRunThread implements Runnable{
    @Override
    public void run() {
        new Thread(()->{
            System.out.println("Run下线程启动");
        }).start();
    }
}
