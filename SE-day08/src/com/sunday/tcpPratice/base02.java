package com.sunday.tcpPratice;

public class base02 {
    private int age;
    private String name;

    public base02(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public base02() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void test(){
        System.out.println(this.age);
    }
}
