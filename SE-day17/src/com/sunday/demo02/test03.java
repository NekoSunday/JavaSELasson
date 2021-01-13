package com.sunday.demo02;

import java.io.File;

public class test03 {
    public static void main(String[] args) {
        File file = new File("d:/jdk1.9");

        printDir(file);
    }

    private static void printDir(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()){
                System.out.println(f.getAbsoluteFile());
                printDir(f);
            }else{
                System.out.println(f.getAbsoluteFile());
            }
        }
    }
}
