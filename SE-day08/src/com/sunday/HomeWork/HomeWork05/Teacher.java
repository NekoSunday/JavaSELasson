package com.sunday.HomeWork.HomeWork05;

public class Teacher extends Person{
    private String subject;

    public Teacher(String subject) {
        this.subject = subject;
    }

    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void teach(){
        System.out.println(this.getName()+"老师，讲授"+this.subject+"课");
    }
}
