package com.sunday.tcpPratice;

import com.sunday.testClass.StringUtil;

import java.util.Arrays;
import java.util.Scanner;

public class praticeString02 {

    public static void main(String[] args) {
        String str="hello world";
        char[] chars=str.toCharArray();
        String str1= Arrays.toString(chars);
        System.out.println(str1);

        byte[] bytes=str.getBytes();
        System.out.println(Arrays.toString(bytes));

        String upperCase = str.toUpperCase();
        System.out.println(upperCase);

        String lowerCase = upperCase.toLowerCase();
        System.out.println(lowerCase);

        String o = str.replace("o", "0");
        System.out.println(o);

        String[] split = o.split("0");
        System.out.println(Arrays.toString(split));
//        test();
        stringTest02();
    }

    public static void test(){
        int smallEng=0;
        int bigEng=0;
        int num=0;
        int stringElse=0;
        System.out.println("输入一串字符：");
        Scanner sc=new Scanner(System.in);
        String nextLine = sc.nextLine();

        char[] chars=nextLine.toCharArray();
//        String str=Arrays.toString(chars);

        for (int i = 0; i < chars.length; i++) {
            if (chars[i]>='a'&&chars[i]<='z'){
                smallEng++;
            }else if (chars[i]>='A'&&chars[i]<='Z'){
                bigEng++;
            }else if (chars[i]>='0'&&chars[i]<='9'){
                num++;
            }else{
                stringElse++;
            }
        }
        System.out.println(smallEng+","+bigEng+","+num+","+stringElse);
        String upperCase = nextLine.toUpperCase();
        byte[] bytes = nextLine.getBytes();
        System.out.println(upperCase);
        System.out.println(Arrays.toString(bytes));
    }

    public static void stringTest02(){
        String str="vsxvxxx";
        char[] chars=str.toCharArray();
        String show = StringUtil.show(chars, 2, 3);
        StringUtil stringUtil1=new StringUtil();
        System.out.println(show);
        System.out.println(StringUtil.id);
        stringUtil1.test01();
        StringUtil.test02();
    }
}
