package com.sunday.HomeWorkday13.GQ2.HomeWork02;

import java.util.Collections;
import java.util.HashSet;

public class test {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        Collections.addAll(strings,"张三","李四","王五","二丫","钱六","孙七");
        strings.remove("二丫");
        strings.add("王小丫");
    }
}
