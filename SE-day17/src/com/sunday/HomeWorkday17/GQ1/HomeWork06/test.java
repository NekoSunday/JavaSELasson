package com.sunday.HomeWorkday17.GQ1.HomeWork06;

import java.io.*;

public class test {
    public static void main(String[] args) throws IOException {
        File f1 = new File("d:\\aaa");
        f1.mkdir();
        File f2 = new File("d:\\aaa\\b.txt");
        f2.createNewFile();

        String str="ababc";
        FileWriter fw=new FileWriter("d:\\aaa\\b.txt");
        fw.write(str);
        fw.flush();

        FileReader fr=new FileReader("d:\\aaa\\b.txt");
        int ch=0;
        while ((ch=fr.read())!=-1){
            System.out.print((char)ch);
        }
    }
}
