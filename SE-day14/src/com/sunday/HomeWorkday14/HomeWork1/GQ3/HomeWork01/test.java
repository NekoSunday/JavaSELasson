package com.sunday.HomeWorkday14.HomeWork1.GQ3.HomeWork01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        HashMap<String, String> javaBasic = new HashMap<>();
        HashMap<String, String> javaWork = new HashMap<>();
        HashMap<String,HashMap<String, String>> xiaomiTech=new HashMap<>();
        javaBasic.put("001","李晨");
        javaBasic.put("002","范冰冰");
        javaWork.put("001","马云");
        javaWork.put("002","马化腾");
        xiaomiTech.put("java就业班",javaWork);
        xiaomiTech.put("java基础班",javaBasic);

        Set<String> set = xiaomiTech.keySet();
        for (String integer : set) {
            System.out.println(integer+"---"+xiaomiTech.get(integer));
        }

        Set<Map.Entry<String, HashMap<String, String>>> entrySet = xiaomiTech.entrySet();
        Iterator<Map.Entry<String, HashMap<String, String>>> iterator = entrySet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
