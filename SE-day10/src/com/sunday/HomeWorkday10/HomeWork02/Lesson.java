package com.sunday.HomeWorkday10.HomeWork02;

import java.util.ArrayList;

public class Lesson {
    private String lesson;
    private ArrayList<Teacher> tList=new ArrayList<>();
    private ArrayList<Student> sList=new ArrayList<>();

    public Lesson() {
    }

    public Lesson(String lesson, ArrayList<Teacher> tList, ArrayList<Student> sList) {
        this.lesson = lesson;
        this.tList = tList;
        this.sList = sList;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public ArrayList<Teacher> gettList() {
        return tList;
    }

    public void settList(ArrayList<Teacher> tList) {
        this.tList = tList;
    }

    public ArrayList<Student> getsList() {
        return sList;
    }

    public void setsList(ArrayList<Student> sList) {
        this.sList = sList;
    }

    public void show(){
        System.out.println("课程名称："+this.getLesson());
        System.out.println("授课老师："+this.gettList().get(0).getName());
        for (int i = 0; i < getsList().size(); i++) {
            this.gettList().get(0).dianMing(getsList().get(i));
            System.out.println(this.getsList().get(i).getName());
        }
    }
}
