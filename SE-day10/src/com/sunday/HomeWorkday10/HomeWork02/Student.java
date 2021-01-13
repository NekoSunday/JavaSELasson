package com.sunday.HomeWorkday10.HomeWork02;

public class Student {
    private String name;
    private String onStudy;

    public Student(String name, String onStudy) {
        this.name = name;
        this.onStudy = onStudy;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOnStudy() {
        return onStudy;
    }

    public void setOnStudy(String onStudy) {
        this.onStudy = onStudy;
    }
}
