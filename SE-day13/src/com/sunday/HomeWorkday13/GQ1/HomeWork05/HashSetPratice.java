package com.sunday.HomeWorkday13.GQ1.HomeWork05;

import java.util.HashSet;

public class HashSetPratice {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("zhangsan");
        strings.add("lisi");
        strings.add("wangwu");
        strings.add("zhangsan");

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
