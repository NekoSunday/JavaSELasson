package com.sunday.HomeWorkday17.GQ3.HomeWork01;

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
            if (f.isFile()){
                if(f.length()/1024<200){
                    System.out.println(f.getAbsoluteFile());
                }
            } else{
                printDir(f);
            }
        }
    }
}
