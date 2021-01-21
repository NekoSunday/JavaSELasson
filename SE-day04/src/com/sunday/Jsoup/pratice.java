package com.sunday.Jsoup;

public class pratice {
    public static void main(String[] args) {
//        boolean test=Test(50);
//        System.out.println(test);
//        Test01(51,60);
//        Test02(5,6);
//Test03(21);
//        System.out.println(Test04(90));
//        Test05(2, 90, 10);
//        Test06();
//        test('a',1);
//        test('A',23.0f);
//        arrayPratice();
//        maxNum();
        arrSoft();
    }


    public static boolean Test(int num) {
        if (num > 50) {
            return false;
        } else {
            return true;
        }
    }

    public static void Test01(int startNum, int endNum) {
        int oddSum = 0;
        int evenSum = 0;
        for (int i = startNum; i <= endNum; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        System.out.println("奇数和：" + oddSum);
        System.out.println("偶数和：" + evenSum);
    }

    public static void Test02(int col, int row) {
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Test03(int months) {
        int Sum = 1;
        int Small = 1;//小
        int Big = 0;//大
        for (int i = 1; i < months; i++) {
            if (i > 1) {
                Big = Small;
                Small = Sum;
                Sum = Big + Small;
            }
        }
        System.out.println(Sum);
    }

    public static String Test04(int num) {
        String str;
        if (num >= 90 && num <= 100) {
            str = "优秀";
        } else if (num >= 80 && num < 90) {
            str = "好";
        } else if (num >= 70 && num < 80) {
            str = "良";
        } else if (num >= 60 && num < 70) {
            str = "及格";
        } else if (num < 60) {
            str = "不及格";
        } else {
            str = "输入成绩错误";
        }
        return str;
    }

    public static void Test05(int startNum, int endNum, int printlnCount) {
        int count = 0;
        for (int i = startNum; i <= endNum; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                count++;
            }
            if (count % printlnCount == 0) {
                System.out.println();
            }
        }
    }



    public static void test(char a,int b){
        System.out.println(a+b);
    }
    public static void test(long a,int b){
        System.out.println(a+b);
    }
    public static void test(int a,char b){
        System.out.println(a+b);
    }
    public static void test(double a,int b){
        System.out.println(a+b);
    }
    public static void test(char a,float b){
        System.out.println(a+b);
    }
    public static void test(char a,byte b){
        System.out.println(a+b);
    }
    public static void test(byte a,double b){
        System.out.println(a+b);
    }

    public static void arrayPratice(){
        int[] arr1=new int[5];
        int[] arr2=new int[]{1,2,12,456,456789,12};
        int[] arr3= {1,2,12,456,456789,12};

//        System.out.println(arr3.length);
        String[] arr4=null;
        double[] arr5=new double[3];
        boolean[] arr6=new boolean[3];
        char[] arr7=new char[3];
        System.out.println(arr4[8]);
    }

    public static void maxNum(){

        int[] arr={90,60,50,120,40};
        int Max=getMax(arr);
        System.out.println(Max);
    }

    public static int getMax(int[] arr){
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            if (temp<arr[i]){
                temp=arr[i];
            }
        }
        return temp;
    }

    public static void arrSoft(){
        int[] arr={1,2,3,4,5};
        reverseArr(arr);
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.print("]");
    }

    public static int[] reverseArr(int[] arr){
        int temp=0;
        for (int i = 0; i < arr.length/2; i++) {
            temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        return arr;
    }
}