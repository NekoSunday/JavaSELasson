package com.sunday.HomeWorkday14.HomeWork1.GQ1.HomeWork04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("邓超","孙俪");
        map.put("李晨","范冰冰");
        map.put("刘德华","柳岩");
        map.put("黄晓明","Baby");
        map.put("谢霆锋","张柏芝");

        Set<String> set = map.keySet();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next+"-"+map.get(next));
        }
    }
}
