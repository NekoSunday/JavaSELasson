package com.sunday.demo5;

public class test02 {
    public static void main(String[] args) {
        person test=getPerson();
        test.eat();

    }

    public static person getPerson(){
        Teacher jame = new Teacher("jame");
        Student amy = new Student("Amy");
        return amy;
    }
}
