package com.sunday.tcpPratice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPratice {
    public static void main(String[] args) throws IOException {

        demo01();
    }

    private static void demo02() throws IOException {
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

    private static void demo01() throws IOException {
        long start = System.currentTimeMillis();
        FileInputStream fis=new FileInputStream("d:\\day74【Lucene】.zip");
        FileOutputStream fos=new FileOutputStream("d:\\aaa\\1.zip");
        byte[] bytes = new byte[1024];
        int len=0;
        while ((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
