package com.sunday.HomeWorkday12.GQ2.HomeWork01;

import java.util.ArrayList;
import java.util.Iterator;

public class HomeWork01 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student(95, "stu1");
        Student stu2 = new Student(90, "stu2");
        Student stu3 = new Student(80, "stu3");
        Student stu4 = new Student(93, "stu4");
        Student stu5 = new Student(96, "stu5");

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        list.add(stu5);

        Iterator<Student> index = list.iterator();
        int maxScore = stu1.getScore();
        int minScore = stu1.getScore();
        int sumScore = 0;
        while (index.hasNext()) {
            int scoreIndex=index.next().getScore();
            sumScore += scoreIndex;
            if (scoreIndex > maxScore) {
                maxScore = scoreIndex;
            }
            if (scoreIndex < minScore) {
                minScore = scoreIndex;
            }
        }
        double avg=sumScore/list.size();
        System.out.println(maxScore);
        System.out.println(minScore);
        System.out.println(sumScore);
        System.out.println(avg);
    }
}
