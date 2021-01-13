package com.sunday.HomeWorkday17.HomeWork04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class test {
    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(3);

        service.submit(() -> {
            int sum=1;
            for (int i = 1; i <= 10; i++) {
                sum*=i;
            }
            System.out.println("10！为："+sum);
        });

        service.submit(()->{
           int sum=1;
            for (int i = 1; i <= 5; i++) {
                sum*=i;
            }
            System.out.println("5！为："+sum);
        });

        service.submit(()->{
            int sum=1;
            for (int i = 1; i <= 8; i++) {
                sum*=i;
            }
            System.out.println("8！为："+sum);
        });
    }
}
