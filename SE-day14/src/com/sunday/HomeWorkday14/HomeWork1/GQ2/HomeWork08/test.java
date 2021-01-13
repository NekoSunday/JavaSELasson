package com.sunday.HomeWorkday14.HomeWork1.GQ2.HomeWork08;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        System.out.println("请输入学生名：");
        HashMap<String, Integer> map = new HashMap<>();
        while (map.size()<5) {
            Scanner sc = new Scanner(System.in);
            String next = sc.next();
            Random randomScore = new Random();
            int scoreIndex = randomScore.nextInt(100) + 1;
            map.put(next,scoreIndex);
        }
        int maxScore=0;
        int minScore=100;
        int sumScore=0;
        Set<String> set = map.keySet();
        for (String s : set) {
            sumScore+=map.get(s);
            if (map.get(s)<minScore){
                minScore=map.get(s);
            }
            if (map.get(s)>maxScore){
                maxScore=map.get(s);
            }
        }
        double avgScore=sumScore/map.size();
        System.out.println(maxScore);
        System.out.println(minScore);
        System.out.println(sumScore);
        System.out.println(avgScore);
    }
}
