package com.sunday.tcpPratice;

public class studentTest extends base02{
    private int age;
    private String name;

    public studentTest(int age, String name) {
        super(age, name);
        System.out.println("1");
        System.out.println(super.getName());
    }

    public studentTest(int age) {
        this.test();
        System.out.println("22");
    }

    public void test(){
        super.getAge();
        System.out.println(this.name);
    }
}
