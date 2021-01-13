package com.sunday.tcpPratice;

public abstract class base {
    private String name;
    private int age;

    static {
        System.out.println("父类启动");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public base(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public base() {
    }

    public void eat(){
        System.out.println("父类吃饭");
    }
    public void sleep(){
        System.out.println("父类睡觉");
    }
    public void study(){
        System.out.println("父类学习");
    }
    public void show(){
        System.out.println(this.name+","+this.age);
    }
    public abstract void test();

}
