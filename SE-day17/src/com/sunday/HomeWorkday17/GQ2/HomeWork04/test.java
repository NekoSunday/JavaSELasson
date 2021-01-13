package com.sunday.HomeWorkday17.GQ2.HomeWork04;

import java.io.File;
import java.io.FileFilter;

public class test {
    public static void main(String[] args) {
        File file = new File("d:/JavaSE");
        printFile(file);
    }
    private static void printFile(File f1) {
        File[] files = f1.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java") || pathname.isDirectory();
            }
        });


        for (File file : files) {
            if (file.isFile()){
                System.out.println("Java文件为："+file.getAbsoluteFile());
            }else{
                printFile(file);
            }
        }
    }
}
