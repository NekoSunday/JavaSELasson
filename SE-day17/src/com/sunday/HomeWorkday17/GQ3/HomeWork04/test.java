package com.sunday.HomeWorkday17.GQ3.HomeWork04;

import java.io.File;

public class test {
    public static void main(String[] args) {
        File f1 = new File("d:/jdk1.9");
        File f2 = new File("d:/JavaSE");

        printDir(f1);
    }

    private static void printDir(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()){
                System.out.println(f.getAbsoluteFile());
            }
            if (f.isFile()){
                    System.out.println("    "+f.getAbsoluteFile());
            } else{
                printDir(f);
            }
        }
    }
}
