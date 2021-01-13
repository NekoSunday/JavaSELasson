package com.sunday.HomeWorkday18.GQ1.HomeWork05;

import java.io.FileInputStream;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\aaa\\a.txt");
        int read=0;
        byte[] bytes = new byte[3];
        while ((read=fis.read(bytes))!=-1){
            System.out.print(new String(bytes));
        }
        fis.close();
    }
}
