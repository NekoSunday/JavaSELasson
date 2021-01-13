package com.sunday.HomeWorkday14.HomeWork1.GQ2.HomeWork09;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();
        while (map.size()<5) {
            Scanner sc = new Scanner(System.in);
            String[] split = sc.next().split("=");
            double price = Double.parseDouble(split[1]);
            map.put(split[0], price);
        }
        map.remove("C++");
        map.put("Java",38.5);
        Set<String> set = map.keySet();
        Set<Map.Entry<String, Double>> entrySet = map.entrySet();
        for (String s : set) {
            System.out.println(s);
        }
        for (Map.Entry<String, Double> entry : entrySet) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
