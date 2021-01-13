package com.sunday.HomeWorkday13.GQ1.HomeWork08;

import java.util.Collections;
import java.util.LinkedHashSet;

public class test {
    public static void main(String[] args) {
        LinkedHashSet<String> strings = new LinkedHashSet<>();
        Collections.addAll(strings,"王昭君","王昭君","西施","杨玉环","貂蝉");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
