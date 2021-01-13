package com.sunday.HomeWorkday10.HomeWork01;

public class test {
    public static void main(String[] args) {
        String num="23.23456789";
        new HandleAble() {
            @Override
            public void HandleString(String num) {
                System.out.println(num);
                int index = num.indexOf(".");
                System.out.println(num.substring(0,index));
            }
        }.HandleString(num);

        int numIndex=4;
        new HandleAble() {
            @Override
            public void HandleString(String num) {
                int index=num.indexOf(".")+numIndex+1;

                if (num.charAt(index)<'5'){
                    System.out.println(num.substring(0, index));
                }else {
                    char ch = (char)(num.charAt(index - 1) + 1);
                    System.out.println(num.substring(0, index - 1) + ch);
                }
            }
        }.HandleString(num);

    }

}
