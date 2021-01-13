package com.sunday.tcpPratice;

import com.sunday.testClass.ArraysClass;

import java.util.Arrays;

public class ArraysPeatice {
    public static void main(String[] args) {
        ArraysClass test01=new ArraysClass();
        ArraysClass test02=new ArraysClass();
        int arr[]={50,60,8550,804,70,60,40,20};
        int arr2[]={80,52,68,94,0,67,631};
        Arrays.sort(arr);
        Arrays.sort(arr2);
        System.out.println(ArraysClass.arrSoft(arr));
        test01.show();
        System.out.println(ArraysClass.arrSoft(arr2));
        test02.show();
    }
}
