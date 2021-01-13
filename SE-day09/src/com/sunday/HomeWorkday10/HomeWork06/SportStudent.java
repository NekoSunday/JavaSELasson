package com.sunday.HomeWorkday10.HomeWork06;

public class SportStudent extends Student implements Sport {
    public SportStudent(String name, int age) {
        super(name, age);
    }

    @Override
    public void playBasketball() {
        System.out.println("的学生在打篮球");
    }
}
