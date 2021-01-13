package com.sunday.tcpPratice;

public class tongbuPratice {
    public static void main(String[] args) {
        testShow s=new testShow();
        new Thread(){
            @Override
            public void run() {
                while (true){
                    s.show1();
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                while (true){
                    testShow.show2();
                }
            }
        }.start();
    }
}
