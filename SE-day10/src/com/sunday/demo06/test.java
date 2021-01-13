package com.sunday.demo06;

public class test {
    public static void main(String[] args) {
        //简化匿名内部类
        new Start(new Task() {
            @Override
            public void task() {
                System.out.println("任务开启");
            }
        }).run();
         //           |
         //           |
        //           \|/
        //Lambda表达式？？
        new Start(() -> System.out.println("任务开启")).run();


        Task t=()->{System.out.println("任务开启");};
        t.task();
    }
}
