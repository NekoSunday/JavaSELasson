package com.sunday.HomeWorkday17.GQ1.HomeWork08;

import java.io.File;

public class test {
    public static void main(String[] args) {
        File f1 = new File("d:/aaa");

        printDir(f1);
    }
    private static void printDir(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()){
                System.out.println(f.getName());
                printDir(f);
            }else{
                System.out.println(f.getName());
            }
        }
    }
}

