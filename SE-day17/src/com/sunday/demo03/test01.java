package com.sunday.demo03;

import java.io.File;

public class test01 {
    public static void main(String[] args) {
        File f1 = new File("d:/jdk1.9");
        File f2 = new File("d:/JavaSE");

        printDir(f2);
    }

    private static void printDir(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()){
                if(f.getName().endsWith(".jar")){
                    System.out.println("jdk1.9下jar包:"+f.getAbsoluteFile());
                }else if (f.getName().endsWith(".java")){
                    System.out.println("JavaSE下的java为:"+f.getAbsoluteFile());
                }
            } else{
                printDir(f);
            }
        }
    }
}
