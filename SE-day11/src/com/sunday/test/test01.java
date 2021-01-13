package com.sunday.test;

public class test01 {
    public static void main(String[] args) {
//题目要求：使用循环语句将一个字符数组翻转
        String[] arr = {"a", "b", "c", "d", "e"};
        Soft(arr);
    }

    public static void Soft(String[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            String index=arr[i] ;
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=index;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}