package com.sunday.HomeWorkday10.HomeWork02;

public class test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("张老师");
        Student s1 = new Student("小红", "在勤");
        Student s2 = new Student("小亮", "在勤");
        Student s3 = new Student("小明", "未出勤");
        Lesson l = new Lesson();
        t1.setStudent(s1);
        t1.setStudent(s2);
        t1.setStudent(s3);
        l.getsList().add(s1);
        l.getsList().add(s2);
        l.getsList().add(s3);
        l.gettList().add(t1);
        l.setLesson("java");

        l.show();
    }
}
