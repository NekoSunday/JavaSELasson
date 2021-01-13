package com.sunday.HomeWorkday17.HomeWork08;

import java.util.*;

public class test {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("张三", 85));
        list.add(new Student("李四", 95));
        list.add(new Student("王五", 90));
        list.add(new Student("刘六", 93));
        Student temp;

//        for (int i = 0; i < list.size(); i++) {
//            for (int j = 0; j < list.size() - 1 - i; j++) {
//                if (list.get(j).getScore()> list.get(j + 1).getScore()){
//                    temp=list.get(j);
//                    list.set(j,list.get(j+1));
//                    list.set(j+1,temp);
//                }
//            }
//        }
//        System.out.println(list.toString());


        list.sort((o1, o2) -> (o1.getScore() - o2.getScore()));
        System.out.println(list.toString());

    }
}
