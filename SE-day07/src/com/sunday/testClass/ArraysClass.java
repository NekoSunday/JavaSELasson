package com.sunday.testClass;

import java.util.Arrays;

public class ArraysClass {
    private int id;
    static int index=1;

    public ArraysClass() {
        this.id=index++;
    }

    public void show(){
        System.out.println(this.id);
    }

    static {
        System.out.println("ArraysClass触发了");
    }
    public static String arrSoft(int[] arr){
        return Arrays.toString(arr);
    }
}
