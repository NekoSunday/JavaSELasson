package com.sunday.demo01;

import java.util.*;

public class mapPratice {
    public static void main(String[] args) {
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1,"147");
//        map.put(2,"258");
//        map.put(3,"369");
//        demo01(map);
//        demo02();
        demo03();
    }

    private static void demo03() {
        LinkedHashMap<Student, String> stuList = new LinkedHashMap<>();
        Student stu1 = new Student("Amy", 18);
        Student stu2 = new Student("Jame", 23);
        Student stu3 = new Student("James", 23);
        Student stu4 = new Student("jack", 22);
        Student stu5 = new Student("may", 22);
        stuList.put(stu1,"天河");
        stuList.put(stu2,"市桥");
        stuList.put(stu3,"南沙");
        stuList.put(stu4,"荔湾");
        stuList.put(stu5,"白云");
        Set<Map.Entry<Student, String>> entry = stuList.entrySet();
        Iterator<Map.Entry<Student, String>> it = entry.iterator();
        while (it.hasNext()){
            Map.Entry<Student, String> next = it.next();
            System.out.println(next.getKey()+"---"+next.getValue());
        }
    }

    private static void demo02() {
        HashMap<Student, String> stuList = new HashMap<>();
        Student stu1 = new Student("Amy", 18);
        Student stu2 = new Student("Jame", 23);
        Student stu3 = new Student("James", 23);
        Student stu4 = new Student("jack", 22);
        Student stu5 = new Student("may", 22);
        stuList.put(stu1,"天河");
        stuList.put(stu2,"市桥");
        stuList.put(stu3,"南沙");
        stuList.put(stu4,"荔湾");
        stuList.put(stu5,"白云");
        Set<Map.Entry<Student, String>> entry = stuList.entrySet();
        Iterator<Map.Entry<Student, String>> it = entry.iterator();
        while (it.hasNext()){
            Map.Entry<Student, String> next = it.next();
            System.out.println(next.getKey()+"---"+next.getValue());
        }

    }

    private static void demo01(Map<Integer, String> map) {
        //获取map中键值为2的value
        System.out.println(map.get(2));
        //判定map是否存在键值为4的键值对
        System.out.println(map.containsKey(4));
        System.out.println("======================");
        //将键值存入set中
        Set<Integer> set = map.keySet();
        //将键值对存入setAll中，对象为Entry
        Set<Map.Entry<Integer, String>> setAll = map.entrySet();
        System.out.println(setAll);
        System.out.println(set);
        System.out.println("=======================");
        System.out.println(map);
        //删除键值key为3的value
        map.remove(3);
        System.out.println(map);
        //使用Collection进行对map中values的存储
        Collection<String> values = map.values();
        Iterator<String> it=values.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //迭代器获取到存入Entry对象的set集合，并遍历，
        // 这里的iterator获取的是Entry对象，在遍历中还需要获取键值对的键值与数值进行输出
        //这里都有自带重写的toString方法
        Iterator<Map.Entry<Integer, String>> iterator = setAll.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> next = iterator.next();
            System.out.println(next.getKey()+"------"+next.getValue()+"-----"+next.getClass());
        }
    }
}
