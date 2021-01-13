package com.sunday.HomeWorkday13.GQ2.HomeWork04;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class test {
    public static void main(String[] args) {
        HashSet<Student> list = new HashSet<>();
        Student stu1 = new Student("Amy", 18);
        Student stu2 = new Student("Jame", 23);
        Student stu3 = new Student("James", 23);
        Student stu4 = new Student("jack", 22);
        Student stu5 = new Student("may", 22);
        Student stu6 = new Student("lucy", 20);
        Student stu7 = new Student("lisa", 20);
        Student stu8 = new Student("ken", 20);
        Student stu9 = new Student("ferry", 20);
        Student stu10 = new Student("paul", 20);

        Collections.addAll(list,stu1,stu2,stu3,stu4,stu5,stu6,stu7,stu8,stu9,stu10);
        System.out.println("增强for");
        for (Student student : list) {
            System.out.println(student);
        }
        System.out.println("迭代器遍历");
        Iterator<Student> it=list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
