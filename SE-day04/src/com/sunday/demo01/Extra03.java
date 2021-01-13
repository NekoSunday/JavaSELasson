package com.sunday.demo01;

public class Extra03 {
    public static void main(String[] args) {
        int[] arr={1,3,5,8,7,15,20};
        selectionSort(arr);
    }

    private static void selectionSort(int[] arr) {
        int temp=0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                if (j!=arr.length-1&&arr[j]>arr[j+1]){
//                    temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (/*j!=arr.length-1&&*/arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.println(arr[i]);
        }
    }
}
