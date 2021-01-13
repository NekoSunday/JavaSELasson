package com.sunday.HomeWorkday17.GQ2.HomeWork01;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws IOException {
        String str = new Scanner(System.in).next();
        File file = new File(str);
        if (file.exists()){
            System.out.println("文件长度："+file.length());
            FileReader fw = new FileReader(str);
            int ch=0;
            System.out.print("文件内容：");
            while ((ch=fw.read())!=-1){
                System.out.print((char)ch);
            }
        }else {
//            int i = str.lastIndexOf("/");
//            System.out.println(i);
//            String isFile = str.substring(i+1,str.length());
//            String isPath = str.substring(0,i);
//            System.out.println(isFile);
//            System.out.println(isPath);
//            File f1 = new File(isPath);
//            File f2 = new File(isFile);
//            System.out.println(f1.mkdirs());
//            System.out.println(f2.createNewFile());
            System.out.println(file.createNewFile());
        }
    }
}
