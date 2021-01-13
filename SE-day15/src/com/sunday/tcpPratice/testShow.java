package com.sunday.tcpPratice;

public class testShow {


    Object obj=new Object();
    //非静态同步方法
    public synchronized void show1(){
        System.out.print("犯");
        System.out.print("我");
        System.out.print("中");
        System.out.print("华");
        System.out.print("者");
        System.out.println();
    }
    //静态同步方法
    public static void show2(){
        synchronized (testShow.class){
            System.out.print("虽");
            System.out.print("远");
            System.out.print("必");
            System.out.print("诛");
            System.out.println();
        }
    }

    public static synchronized void show3(){
        System.out.print("犯");
        System.out.print("我");
        System.out.print("中");
        System.out.print("华");
        System.out.print("者");
        System.out.println();
    }
}
