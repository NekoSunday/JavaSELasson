package com.sunday.HomeWorkday13.GQ3.HomeWork02;

import java.util.HashSet;
import java.util.Iterator;

public class test {
    public static void main(String[] args) {
        HashSet<HashSet<Student>> xueke=new HashSet<>();
        HashSet<Student> banji1 = new HashSet<>();
        HashSet<Student> banji2 = new HashSet<>();
        Student stu1 = new Student("小明", 18);
        Student stu2 = new Student("小红", 19);
        banji1.add(stu1);
        banji2.add(stu2);
        xueke.add(banji1);
        xueke.add(banji2);

        for (HashSet<Student> students : xueke) {
            for (Student student : students) {
                System.out.println(student);
            }
        }

        Iterator<HashSet<Student>> it=xueke.iterator();
        while (it.hasNext()){
            Iterator<Student> index=it.next().iterator();
            while (index.hasNext()){
                System.out.println(index.next());
            }
        }
    }

}
