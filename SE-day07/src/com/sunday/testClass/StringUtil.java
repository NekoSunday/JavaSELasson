package com.sunday.testClass;

public class StringUtil {
    public int age;
    public static String id;

    public static String show(char[] chars,int beginIndex,int endIndex){
        return new String(chars,beginIndex,endIndex);
    }

    public void test01(){
        System.out.println("动态方法");
        test02();
    }
    public static void test02(){
        System.out.println("静态方法");
    }

    static {
        System.out.println("StringUtil触发了");
    }
}
