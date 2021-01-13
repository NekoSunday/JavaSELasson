package com.sunday.HomeWorkday18.GQ1.HomeWork03;

import java.io.FileOutputStream;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("d:/aaa/test.txt",true);
        for (int i = 0; i < 5; i++) {
            fos.write("i love java".getBytes());
        }
        fos.close();
    }
}
