package com.sunday.tcpPratice;

public class praticeString {

    public static void main(String[] args) {
        String str="hello world";
        System.out.println(str.length());
        String concatStr=str.concat("!");
        System.out.println(concatStr);

        char ch=str.charAt(2);
        System.out.println(ch);

        int index1=str.indexOf("l");
        int index2=str.indexOf("l",5);
        System.out.println(index1);
        System.out.println(index2);

        String sub1=str.substring(5);
        System.out.println(sub1);

        String sub2=str.substring(4,7);
        System.out.println(sub2);

        String rep1=str.replace('l','e');
        System.out.println(rep1);

        boolean checkL = str.contains("ld");
        System.out.println(checkL);

        String repF = str.replaceFirst("world", "Google");
        System.out.println(repF);

    }
}
