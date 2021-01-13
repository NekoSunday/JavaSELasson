package com.sunday.tcpPratice;

public class waitThreadPratice {
    public static void main(String[] args) {
//        testWaitShow show = new testWaitShow();
//        new Thread(show::show1).start();
//        new Thread(show::show2).start();
//        new Thread(show::show3).start();

        testLockShow show1=new testLockShow();
        new Thread(show1::show1).start();
        new Thread(show1::show2).start();
        new Thread(show1::show3).start();
    }
}
