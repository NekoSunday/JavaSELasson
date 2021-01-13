package com.sunday.HomeWorkday1501.HomeWork09;

public class test {
    public static void main(String[] args) {
        new Thread(()->{
            int sum=1;
            for (int i = 1; i <= 10; i++) {
                sum*=i;
            }
            System.out.println("10！为"+sum);
        }).start();

        new Thread(()->{
            int sum=1;
            for (int i = 1; i <= 5; i++) {
                sum*=i;
            }
            System.out.println("5！为"+sum);
        }).start();

        new Thread(()->{
            int sum=1;
            for (int i = 1; i <= 8; i++) {
                sum*=i;
            }
            System.out.println("8！为"+sum);
        }).start();
    }
}
