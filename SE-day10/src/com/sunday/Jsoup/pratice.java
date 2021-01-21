package com.sunday.Jsoup;

public class pratice {
    public static void main(String[] args) {
        Student student = new Student();
        Person stu=new Student("小明","9527");
        Person t=new Teacher("王老","1234");

        student.eat();
        student.study();
        System.out.println(student.getMoney());
        Student index=(Student)stu;
        index.study();
        index.eat();
        System.out.println(index.getMoney());

        t.eat();
        if (t instanceof Teacher){
            Teacher t1=(Teacher)t;
            t1.teach();
        }
        System.out.println(t.getMoney());
    }
}
