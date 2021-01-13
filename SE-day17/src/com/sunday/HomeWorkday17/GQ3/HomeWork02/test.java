package com.sunday.HomeWorkday17.GQ3.HomeWork02;

import java.io.File;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        String str = new Scanner(System.in).next();
        File file = new File(str);

        deleteDir(file);

    }
    public static void deleteDir(File file){
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()){
                deleteDir(f);
            }else{
                f.delete();
            }
        }
        file.delete();
    }
}
