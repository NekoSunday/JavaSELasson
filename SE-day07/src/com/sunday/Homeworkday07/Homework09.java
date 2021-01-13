package com.sunday.Homeworkday07;

import java.util.ArrayList;

public class Homework09 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("bca");
        list.add("dadfa");
        list.add("dddaaa");
        list.add("你好啊");
        list.add("我来啦你干嘛呢");
        list.add("别跑啊");
        System.out.println(list);
//        String[] str=new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
//            str[i]=list.get(i);
            if (list.get(i).length()>4){
                list.remove(i);
                --i;
            }
        }
        System.out.println(list);
    }
}
