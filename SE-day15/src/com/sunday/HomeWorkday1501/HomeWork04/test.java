package com.sunday.HomeWorkday1501.HomeWork04;

public class test {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("播放背景音乐");
                }
            }
        }).start();

        new Thread(()->{
            while (true){
                System.out.println("显示画面");
            }
        }).start();

    }
}
