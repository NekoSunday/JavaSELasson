package com.sunday.tcpPratice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class InputPratice {
    public static void main(String[] args) throws IOException {
        demo01();
    }

    private static void demo02() throws IOException {
        File file = new File("D:\\aaa\\d.txt");
        FileInputStream fis = new FileInputStream(file);
        //read()必须赋值，不然输出会错误
        int read=0;
        byte[] b = new byte[(int) file.length()];
        while ((read=fis.read(b))!=-1){
            System.out.println(new String(b));
        }
//        System.out.println(new String(b));
        fis.close();
    }

    private static void demo01() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\aaa\\a.txt");
        //read()必须赋值，不然输出会错误
        int read=0;
        while ((read=fis.read())!=-1){
            System.out.print((char) read);
        }
        fis.close();
    }
}
