package com.sunday.HomeWorkday13.GQ2.HomeWork10;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class test {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();
        Student stu1 = new Student("Amy", 18,90);
        Student stu2 = new Student("Jame", 23,85);
        Student stu3 = new Student("James", 24,96);
        Student stu4 = new Student("jack", 22,76);
        Student stu5 = new Student("may", 22,84);

        Collections.addAll(set,stu1,stu2,stu3,stu4,stu5);
        Iterator<Student> it=set.iterator();
        System.out.println(it.next());
        int sumScore=0;
        int maxScore=it.next().getScore();
        int minScore=it.next().getScore();
        for (Student student : set) {
            sumScore+=student.getScore();
            System.out.println(student);
            if (maxScore<student.getScore()){
                maxScore=student.getScore();
            }
            if (minScore>student.getScore()){
                minScore=student.getScore();
            }
        }
        double avg=sumScore/set.size();
        System.out.println(sumScore);
        System.out.println(maxScore);
        System.out.println(minScore);
        System.out.println(avg);
    }
}
