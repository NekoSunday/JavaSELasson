package com.sunday.HomeWorkday18.GQ1.HomeWork04;

import java.io.FileInputStream;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\aaa\\a.txt");
        int read=0;
        while ((read=fis.read())!=-1){
            System.out.print((char) read);
        }
        fis.close();
    }
}
