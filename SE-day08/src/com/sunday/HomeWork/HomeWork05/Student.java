package com.sunday.HomeWork.HomeWork05;

public class Student extends Person {
    private int score;

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public Student(int score) {
        this.score = score;
    }

    public Student() {
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void Exam(){
        System.out.println(this.getName()+"同学,考试得了："+this.score+"分");
    }
}
