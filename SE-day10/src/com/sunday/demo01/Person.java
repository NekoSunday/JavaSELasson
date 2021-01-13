package com.sunday.demo01;

public class Person {
    private String name;
    private String id;
    final double money;

    //final修饰过的money只有获取的方法，没有设置的方法
    public double getMoney() {
        return money;
    }
    //若不初始化修饰的money，则必须在构造方法中进行初始值的赋值。
    //不同构造方法可以将money赋值不同的值
    public Person(String name, String id) {
        this.name = name;
        this.id = id;
        this.money=20;
    }

    public Person() {
        this.money=15;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public final void eat(){
        System.out.println("恰饭ing");
    }

    protected void test01(){
        System.out.println("测试time");
    }
}
