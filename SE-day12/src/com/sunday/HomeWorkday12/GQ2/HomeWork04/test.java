package com.sunday.HomeWorkday12.GQ2.HomeWork04;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();

        strings.add("123");
        strings.add("456");
        strings.add("789");

        integers.add(123);
        integers.add(456);
        integers.add(789);

        swap(strings,0,2);
        swap(integers,0,2);
    }
    public static <E> void swap(ArrayList<E> list, int startIndex, int endIndex){
        E index=list.get(startIndex);
        list.set(startIndex,list.get(endIndex));
        list.set(endIndex,index);
        System.out.println(list);
    }
}
