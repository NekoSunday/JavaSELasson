package com.sunday.tcpPratice;

public class ThreadPratice {
    public static void main(String[] args) {
//        test01();
        test02();
//        test03();
//        test04();
    }
    //线程礼让(不是交出执行权，像是优先级降级？)
    private static void test04() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {

                    System.out.println("匿名线程1---"+i);
                }
                System.out.println(Thread.currentThread().getName());
            }
        }).start();

        new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                if (i==10){
                    Thread.yield();
                }
                System.out.println("匿名线程2---"+i);
            }
            System.out.println(Thread.currentThread().getName());
        }).start();

    }

    //设置优先级
    private static void test03() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("线程1--"+i);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("线程2--"+i);
                }
            }
        });

        t1.setPriority(1);
        t2.setPriority(10);
        t1.start();
        t2.start();
    }

    //守护进程、线程加入
    private static void test02() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("线程1--"+i);
                }
            }
        });

        System.out.println(Thread.currentThread().getName());
        t1.setDaemon(true);
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 2000; i++) {
                    System.out.println("线程2--"+i);
//                    if (i==10){
//                        try {
//                            t1.join(1500);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                    }
                    if (i==10){
                        Thread.yield();
                    }
                }
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("线程3--"+i);
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }
    //匿名Runnable，匿名Thread创建线程
    public static void test01(){
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    if (i==10){
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(i);
                }
            }
        };
        new Thread(r).start();

        Runnable r2=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(i);
                }
            }
        };
        new Thread(r2).start();
    }
}
