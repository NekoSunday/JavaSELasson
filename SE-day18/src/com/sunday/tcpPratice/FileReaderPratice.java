package com.sunday.tcpPratice;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderPratice {
    public static void main(String[] args) throws IOException {


        demo02();
    }

    private static void demo02() throws IOException {
        FileReader reader = new FileReader("D:\\aaa\\d.txt");
        char[] ch=new char[1024];
        int len;
        while ((len=reader.read(ch))!=-1){
            System.out.println(new String(ch,0,len));
        }
        reader.close();
    }

    private static void demo01() throws IOException {
        FileReader reader = new FileReader("D:\\aaa\\f.txt");
        int b=0;
        while ((b=reader.read())!=-1){
            System.out.print((char)b);
        }
        reader.close();
    }

}
