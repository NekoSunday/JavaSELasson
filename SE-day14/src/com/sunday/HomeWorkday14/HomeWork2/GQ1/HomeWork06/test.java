package com.sunday.HomeWorkday14.HomeWork2.GQ1.HomeWork06;

public class test {
    public static void main(String[] args) throws Exception {
        String str=null;
//        testThrows(str);
        testTryCatch(str);
    }
    public static char charAt(String str,int index) throws Exception {
        if (str==null){
            throw new Exception("字符串不能为null");
        }else if (str.isEmpty()){
            throw new Exception("字符串不能为空");
        }else if (index<0||index>str.length()-1){
            throw new Exception("索引越界");
        }
        return str.charAt(index);
    }

    public static void testThrows(String str) throws Exception {
        System.out.println(charAt(str, 0));
    }

    public static void testTryCatch(String str){
        try {
            System.out.println(charAt(str, 0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
