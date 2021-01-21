package com.sunday.Jsoup;

import java.util.Arrays;

public class currentTM {
    public static void main(String[] args) {
//testMS();
//arrayCopy();
//        cTM();
//        Stringbuilder();
        ZXCZ();
    }

    private static void ZXCZ() {
        Integer i=4;

        //Integer i=new Integer(4);
        //Integer i = Integer.valueOf(4);

        int i1=i.intValue();
        //自动拆箱，自动装箱的过程
//        i=i.intValue()+1;
        i=i+1;

        //以下为String转基本类型
        int num=Integer.parseInt("100");
        double num2=Double.parseDouble("100.1");
        float num3=Float.parseFloat("100.2");
        byte num4=Byte.parseByte("101");
        short num5=Short.parseShort("200");
        boolean bl=Boolean.parseBoolean("true");
        long num6=Long.parseLong("102");

        System.out.println(num);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(bl);

        //以下为基本类型转String
        int zNum=2;
        String str1=zNum+"a";

        String str2=String.valueOf(zNum);

        Integer test=zNum;
        String str3=test.toString();

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

    }

    private static void Stringbuilder() {
        StringBuilder sb1=new StringBuilder("abcd");
        StringBuilder sb2=new StringBuilder("111");
        sb2.append(sb1);
        System.out.println(sb2);
        sb1.append("efgh");
        System.out.println(sb1);

        String str=sb1.toString();
        System.out.println(str);
    }

    private static void arrayCopy() {
        int[] arr1={1,2,3,4,5};
        int[] arr2={6,7,8,9,10};

        System.out.println(Arrays.toString(arr1));
        System.arraycopy(arr2,0,arr1,2,1);
        System.out.println(Arrays.toString(arr1));
    }

    private static void cTM() {
        System.out.println(System.currentTimeMillis());

        long startTime=System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }

    public static void testMS(){
        long startTime=System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 1000; j++) {
                System.out.println(i+"-"+j);
            }
        }
//        System.out.println();
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
