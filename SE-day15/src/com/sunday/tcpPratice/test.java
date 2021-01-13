package com.sunday.tcpPratice;

public class test {
    public static void main(String[] args) {
//        testRunThread thread = new testRunThread();
//        Thread t = new Thread(thread);
//        t.start();
        test01();
    }

    private static void test01() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("启动了");
                this.run();
            }
        }).start();
    }
}
