package com.sunday.HomeWorkday13.GQ2.HomeWork01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class test {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings, "a","f","b","c","a","d");
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(strings);
        strings.clear();
        strings.addAll(hashSet);

//        int count=0;
//        for (String s : hashSet) {
//            strings.set(count,s);
//        }
        System.out.println(strings);
    }
}
