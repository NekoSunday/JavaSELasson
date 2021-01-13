package com.sunday.HomeWorkday18.GQ2.HomeWork02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        File file = new File("d:\\aaa");
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                FileInputStream fis = new FileInputStream("d:\\aaa\\"+f.getName());
                FileOutputStream fos = new FileOutputStream("d:\\bbb\\"+f.getName());
                int read;
                byte[] bytes = new byte[1024];
                while ((read = fis.read()) != -1) {
                    fos.write(bytes);
                }
                fis.close();
                fos.close();
//                System.out.println(f.getAbsoluteFile());
            }
        }

    }
}
