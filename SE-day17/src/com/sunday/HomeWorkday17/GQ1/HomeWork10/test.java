package com.sunday.HomeWorkday17.GQ1.HomeWork10;

public class test {
    public static void main(String[] args) {
        int n=10;
        int sum = getSum(n);
        System.out.println(sum);
    }

    private static int getSum(int n) {
        if (n==1) {
            return 1;
        }
        return n * (getSum(n - 1));
    }
}
