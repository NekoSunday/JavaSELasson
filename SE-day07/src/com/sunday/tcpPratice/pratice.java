package com.sunday.tcpPratice;

public class pratice {
    public static void main(String[] args) {
        String str1=new String();
        System.out.println(str1);

        char[] ch1={'a','b','c','d','e'};
        String str2=new String(ch1,2,3);
        System.out.println(str2);

        byte[] bytes={97,98,99,100,101};
        String str3=new String(bytes,2,2);
        System.out.println(str3);

        String str="aaa,bbb,ccc,ddd,eee";
        String[] changeStr=str.split(",");
        for (int i = 0; i < changeStr.length; i++) {
            System.out.print(changeStr[i]+" ");
        }

        String str4="abc";
        String str5="abc";
        String str6=new String("abc");
        String str7=new String(new byte[]{97,98,99});
        String str8=new String(new char[]{'a','b','c'});
        System.out.println(str8);
    }

}
