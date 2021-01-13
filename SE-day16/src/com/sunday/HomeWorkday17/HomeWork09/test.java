package com.sunday.HomeWorkday17.HomeWork09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        HashMap<String, String> map = new HashMap<>();

        list.add(2);
        list.add(3);

        set.add(2);
        set.add(3);

        map.put("2","2");
        map.put("3","3");

        list.forEach(List-> System.out.println(list));

        set.forEach((Integer)-> System.out.println(Integer));
//        set.forEach(System.out::println);

        map.forEach((k,v)-> System.out.println(k+"--"+v));
    }
}
