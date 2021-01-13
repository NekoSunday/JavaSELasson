package com.sunday.demo01;

public class test01 {
    public static void main(String[] args) {
        int num1=20;
        int num2=2;
//        System.out.println(num1+=num2);//22
//        System.out.println(num1-=num2);//20
//        System.out.println(num1*=num2);//40
//        System.out.println(num1/=num2);//20
//        System.out.println(num1%=num2);//0

//        System.out.println(num1==num2);
//        System.out.println(num1>num2);
//        System.out.println(num1>=num2);
//        System.out.println(num1<=num2);
//        System.out.println(num1<num2);
//        System.out.println(num1!=num2);


//        System.out.println(true&false);
//        System.out.println(false&false);
//        System.out.println(true&true);
//        System.out.println(false&false);
//        System.out.println(false&&false);//若第一个成立则第二个不选择计算
//
//        System.out.println("--------------------");
//
//        System.out.println(true|false);
//        System.out.println(false|false);
//        System.out.println(true|true);
//        System.out.println(false|true);
//        System.out.println(false||true);//若第一个成立则第二个不选择计算
//
//
//        System.out.println("--------------------");
//
//        System.out.println(true^false);
//        System.out.println(true^true);
//        System.out.println(false^true);
//        System.out.println(false^false);
//
//        System.out.println("--------------------");
//
//        System.out.println(!true);
//        System.out.println(!!false);
//
//        System.out.println("--------------------");
//
//        int a =50;
//        int b=100;
//        int c = a>b?70:20;
//        System.out.println(c);
//        Sout();
//        change();
//        getNum();
//        Sout(50,60,70);
//        said("hello","world");


    }

    public static void Sout(int i,int j,int k){
        int max=(i>j)?(i>k?i:k):(k>j?k:j);
        System.out.println("最大值为："+max);
        if (i%2==0&j%2==0&k%2==0|i>j|i>k|j>k) {
            k+=i+j;
            System.out.println(k);
        }else{
            System.out.println(i);
        }
    }

    public static void said(String str1,String str2){
        if (str1.length()>str2.length()){
            System.out.println(str1);
        }else{
            System.out.println(str2);
        }
        System.out.println(str1+" "+str2);
    }

//    public static void  enterStr(String str1,String str2){
//        System.out.println("请输入字符串1");
//        str1=System.in.read();
//        if (str1.length()>str2.length()){
//            System.out.println(str1);
//        }else{
//            System.out.println(str2);
//        }
//    }

    public static void change(){
        int i=20;
        int j=40;
        int k=30;
        int temp=i>j?i:j;
        int max=temp>k?temp:k;

        int max1=(i>j)?(i>k?i:k):(k>j?k:j);


        String check=i>j?"正确":"错误";

        System.out.println("最大值为："+max1);
        System.out.println("i>j?"+check);
    }

    public static void getNum(){
        int num=523;

        int b=num/100;
        int s=num/10%10;
        int g=num%10;

        System.out.println("百位为："+b+"\n"+"十位为："+s+"\n"+"个位为："+g);
    }
}
