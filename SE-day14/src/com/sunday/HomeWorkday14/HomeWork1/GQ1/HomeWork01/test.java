package com.sunday.HomeWorkday14.HomeWork1.GQ1.HomeWork01;

import java.util.HashMap;

public class test {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"lucy");
        map.put(2,"amy");
        map.put(3,"jame");
        System.out.println(map);
        map.put(2,"james");
        System.out.println(map);
        System.out.println(map.get(1));
        map.remove(2);
        System.out.println(map);
    }
}
