package com.sunday.HomeWorkday18.GQ1.HomeWork06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        FileInputStream fis=new FileInputStream("C:\\Users\\Sunday\\Desktop\\面试题截图\\面试4.PNG");
        FileOutputStream fos=new FileOutputStream("d:\\aaa\\1.PNG");
        int len=0;
        while ((len=fis.read())!=-1){
            fos.write(len);
        }
        fos.close();
        fis.close();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
