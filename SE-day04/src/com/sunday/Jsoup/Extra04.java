package com.sunday.Jsoup;

public class Extra04 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 4, 5, 9, 9, 41, 10, 60, 60};

        deleteArr(arr);
    }

    private static void deleteArr(int[] arr) {
        int[] newArr = new int[arr.length];
        int[] index = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    index[i] = arr[i];
                    break;
                }
            }
        }
        int count=0;
        for (int i = 0; i < index.length; i++) {
            if(index[i]==0){
                newArr[count++]=arr[i];
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.print(newArr[i]+" ");
        }
    }
}
