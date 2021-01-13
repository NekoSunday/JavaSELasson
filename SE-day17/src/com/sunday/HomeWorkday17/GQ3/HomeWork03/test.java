package com.sunday.HomeWorkday17.GQ3.HomeWork03;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class test {
    private static HashMap<String,Integer> map=new HashMap<>();

    public static void main(String[] args) {
        String str = new Scanner(System.in).next();
        File path = new File(str);

        printCount(path);

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey()+"的类型的文件有"+entry.getValue()+"个");
        }
    }

    private static void printCount(File path) {
        File[] files = path.listFiles();
        for (File f : files) {
            if (f.isFile()){
                String[] split = f.getName().split("\\.");
                if (map.containsKey(split[1])) {
                    map.put(split[1],map.get(split[1])+1);
                }else{
                    map.put(split[1],1);
                }
            }
            else{
                printCount(f);
            }
        }
    }
}
