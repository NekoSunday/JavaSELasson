package com.sunday.demo04;

public class test {
    public static void main(String[] args) {
        //第一种创建匿名内部类
        new person() {

            @Override
            public void eat() {
                System.out.println("main吃");
            }

            @Override
            public void sleep() {
                System.out.println("main睡");
            }
        }.sleep();

        //第二种创建匿名内部类
        person person = new person() {
            @Override
            public void eat() {
                System.out.println("main吃");
            }

            @Override
            public void sleep() {
                System.out.println("main睡");
            }
        };

        person.sleep();
        person.eat();

//以下为测试实例，在方法的参数列表中创建一个匿名内部类
        person(new person(){

            @Override
            public void eat() {
                System.out.println("方法参数匿名，吃饭");
            }

            @Override
            public void sleep() {
                System.out.println("方法参数匿名,睡觉");
            }
        });

    }

    private static void person(person person) {
        person.sleep();
        person.eat();
    }
}
