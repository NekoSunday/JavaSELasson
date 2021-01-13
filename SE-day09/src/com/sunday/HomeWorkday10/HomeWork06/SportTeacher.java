package com.sunday.HomeWorkday10.HomeWork06;

public class SportTeacher extends Teacher implements Sport{
    public SportTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void playBasketball() {
        System.out.println("的老师在打篮球");
    }
}
