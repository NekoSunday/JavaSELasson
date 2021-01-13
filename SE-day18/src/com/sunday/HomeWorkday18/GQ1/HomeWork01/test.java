package com.sunday.HomeWorkday18.GQ1.HomeWork01;

import java.io.FileOutputStream;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("d:/aaa/test.txt");
        fos.write('a');
        fos.close();
    }
}
