package com.sunday.HomeWorkday12.GQ2.HomeWork03;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("c");
        strings.add("a");
        strings.add("b");
        strings.add("b");
        strings.add("b");
        strings.add("a");
        System.out.println("出现的次数为"+frequency(strings, "a"));
    }

    public static int frequency(ArrayList<String> arr,String key){
        int count=0;
        for (String s : arr) {
            if (s.equals(key)){
                count++;
            }
        }
        return count;
    }
}
