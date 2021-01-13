package com.sunday.HomeWorkday14.HomeWork1.GQ2.HomeWork07;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        System.out.println("请输入语句：");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] splitStr = s.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (String index : splitStr) {
            if (map.get(index)!=null) {
                map.put(index,map.get(index)+1);
            }else{
                map.put(index, 1);
            }
        }
        Set<String> set = map.keySet();
        for (String index : set) {
            System.out.println(index+"="+map.get(index));
        }
    }
}
