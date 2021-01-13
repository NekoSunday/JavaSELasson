package com.sunday.HomeWorkday14.HomeWork1.GQ1.HomeWork07;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        Student stu1 = new Student("Amy", 18);
        Student stu2 = new Student("Jame", 23);
        Student stu3 = new Student("James", 23);
        Student stu4 = new Student("jack", 22);
        Student stu5 = new Student("may", 22);
        Student stu6 = new Student("Jame", 23);

        HashMap<String, Student> map = new HashMap<>();
        map.put("天河",stu1);
        map.put("荔湾",stu2);
        map.put("南沙",stu3);
        map.put("白云",stu4);
        map.put("市桥",stu5);
        map.put("市桥",stu6);

        Set<String> strings = map.keySet();
        Set<Map.Entry<String, Student>> set = map.entrySet();

        for (String string : strings) {
            System.out.println(string);
        }

        for (Map.Entry<String, Student> entry : set) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
