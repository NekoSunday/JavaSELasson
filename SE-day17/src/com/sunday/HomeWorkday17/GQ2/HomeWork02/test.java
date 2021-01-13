package com.sunday.HomeWorkday17.GQ2.HomeWork02;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws IOException {
        String str = new Scanner(System.in).next();
        File file = new File(str);
        if (file.isFile()){
            file.createNewFile();
            System.out.println(file.length());
        }else {
            System.out.println(file.mkdirs());
            printDir(file);
        }
    }

    private static void printDir(File file) {
        int sum=0;
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()){
                System.out.println(f.getAbsoluteFile());
                printDir(f);
            }else{
                System.out.println(f.getAbsoluteFile());
                sum+=f.getAbsoluteFile().length();
            }
        }
    }
}
