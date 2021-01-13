package com.sunday.HomeWorkday18.GQ2.HomeWork01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("d://aaa//h.txt");
        FileInputStream fis = new FileInputStream("d://aaa//h.txt");
        while (true) {
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            if (str.equals("end")) {
                break;
            }
            fos.write("\n\r".getBytes());
            fos.write(str.getBytes());
            System.out.println("输入格式错误");
        }
        fos.close();
        fis.close();
    }
}
