package com.sunday.tcpPratice;

public class testWaitShow {
    private Integer count = 1;

    public void show1() {
        for (int i = 0; i < 20; i++) {
            synchronized (testWaitShow.class) {
                while (count != 1) {
                    try {
                        Thread.sleep(100);
                        testWaitShow.class.wait();
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
                testWaitShow.class.notifyAll();
            }
        }
    }

    public void show2() {
        for (int i = 0; i < 20; i++) {
            synchronized (testWaitShow.class) {
                while (count != 2) {
                    try {
                        Thread.sleep(100);
                        testWaitShow.class.wait();
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
                testWaitShow.class.notifyAll();
            }
        }
    }

    public void show3() {
        for (int i = 0; i < 20; i++) {
            synchronized (testWaitShow.class) {

                while (count != 3) {
                    try {
                        Thread.sleep(100);
                        testWaitShow.class.wait();
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
                testWaitShow.class.notifyAll();
            }
        }
    }
}
