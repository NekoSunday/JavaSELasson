package com.sunday.demo02;

public class test02 {
    public static void main(String[] args) {
        int num=10;
        int sum=getSum(num);
        System.out.println(sum);
    }

    private static int getSum(int num) {
        if (num==1){
            return 1;
        }
        System.out.println(num);
        return num*getSum(num-1);
    }
}
