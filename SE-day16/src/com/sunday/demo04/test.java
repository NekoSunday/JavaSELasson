package com.sunday.demo04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class test {
    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(2);
        service.submit(() -> System.out.println("线程启动1  "+Thread.currentThread().getName()));
        service.submit(() -> System.out.println("线程启动2  "+Thread.currentThread().getName()));
        service.submit(() -> System.out.println("线程启动3  "+Thread.currentThread().getName()));

        service.shutdown();
    }
}
