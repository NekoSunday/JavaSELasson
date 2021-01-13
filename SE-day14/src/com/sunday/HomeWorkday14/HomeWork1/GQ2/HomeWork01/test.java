package com.sunday.HomeWorkday14.HomeWork1.GQ2.HomeWork01;

import java.util.HashMap;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        System.out.println("请输入学生信息： 格式为：名字,年龄");
        while (map.size()<5) {
            Scanner sc = new Scanner(System.in);
            String next = sc.next();
            String[] split = next.split(",");
            int age = Integer.parseInt(split[1]);
            map.put(split[0],age);
        }
        System.out.println(map);

    }
}
