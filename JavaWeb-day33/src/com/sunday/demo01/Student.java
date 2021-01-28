package com.sunday.demo01;

public class Student {
    private int id;
    private String name;
    private int gender;
    private int score;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", score=" + score +
                '}';
    }

    public Student() {
    }

    public Student(int id, String name, int gender, int score) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.score = score;
    }
}
