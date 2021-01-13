package com.sunday.Homeworkday07;


public class Homework08 {
    public static void main(String[] args) {
        String str= "javajfiewjavajfiowfjavagkljjava";
        System.out.println(getCount(str, "java"));

    }
    public static int getCount(String str,String ch){
//        int count=0;
//        while (str.indexOf(ch)!=-1){
//            int index=str.indexOf(ch);
//            str=str.substring(index+4);//begin->last
//            count++;
//        }
//        return count;

        int count=0;
        int index=str.indexOf(ch);
        while (index!=-1){
            count++;
            index=str.indexOf(ch,index+4);
        }
        return count;
    }
}
