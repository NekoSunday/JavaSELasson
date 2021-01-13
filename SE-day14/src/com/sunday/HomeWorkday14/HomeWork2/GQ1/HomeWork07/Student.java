package com.sunday.HomeWorkday14.HomeWork2.GQ1.HomeWork07;

public class Student {
    private String name;
    private int score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score<0){
            throw new NoScoreException("分数不能为负数"+this.name);
        }
        this.score = score;
    }

    public Student(String name, int score) {
        this.name = name;
        if (score<0){
            throw new NoScoreException("分数不能为负数"+this.name);
        }
        this.score = score;
    }

    public Student() {
    }
}
