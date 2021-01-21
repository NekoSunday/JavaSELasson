package com.sunday.Jsoup;

public class Extra02 {
    public static void main(String[] args) {
        int[] arr={1,3,5,8,7,15,20};
        bubbleSoft(arr);
    }

    public static void bubbleSoft(int[] arr){
//        int[] newArr=new int[arr.length];
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            System.out.println(arr[i]);
        }
    }
}
