package com.sunday.demo01;

public class StudentStrong implements Coder {
    private Student stu;

    public StudentStrong(Student stu) {
        this.stu = stu;
    }

    @Override
    public void study() {
        stu.study();
        System.out.println("SpringBoot");
    }
}
