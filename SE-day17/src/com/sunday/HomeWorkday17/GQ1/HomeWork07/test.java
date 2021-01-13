package com.sunday.HomeWorkday17.GQ1.HomeWork07;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        File f1 = new File("d:/aaa/b.txt");
        File f2 = new File("d:/aaa");
        if (f1.isFile()){
            FileReader fr=new FileReader(f1);
            int ch=0;
            while ((ch=fr.read())!=-1){
                System.out.print((char)ch);
            }
            System.out.println();
        }else if(f1.isDirectory()){
            System.out.println("d:/aaa/b.txt不是文件夹");
        }
        if (f2.isDirectory()){
            System.out.println("d:/aaa是文件夹");
        }else{
            System.out.println("d:/aaa不是文件夹");
        }
    }
}
