package com.sunday.demo03;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class test02 {
    public static void main(String[] args) {
        File f1 = new File("d:/JavaSE");

//        printFile(f1);
        printFilter2(f1);
    }
    //error
    private static void printFilter2(File f1) {
        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (dir.isDirectory()){
                    System.out.println(dir);
                    if (name.startsWith("Student")){
                    return true;
                    }
                }
                return false;
            }
        };
        File[] files=f1.listFiles(filter);
        for (File file : files) {
            if (file.isFile()){
                System.out.println("Java文件为："+file.getAbsoluteFile());
            }else{
                printFilter(file);
            }
        }
    }
    //error
    private static void printFilter(File f1) {
        File[] files = f1.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
//                System.out.println(dir+name);
                return name.startsWith("Student") || dir.isDirectory();
            }
        });

        for (File file : files) {
            if (file.isFile()){
                System.out.println("Java文件为："+file.getAbsoluteFile());
            }else{
                printFilter(file);
            }
        }
    }

    private static void printFile(File f1) {
        File[] files = f1.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().startsWith("Student") || pathname.isDirectory();
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
