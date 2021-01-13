package com.sunday.HomeWorkday14.HomeWork1.GQ2.HomeWork06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("bcd");
        HashMap<Character, Integer> map = new HashMap<>();
        for (String s : list) {
            System.out.println(s);
            char[] chars = s.toCharArray();
            for (char aChar : chars) {
                if (map.get(aChar)!=null) {
                    map.put(aChar,map.get(aChar)+1);
                }else{
                    map.put(aChar, 1);
                }
            }
        }
        System.out.println(map);
    }
}
