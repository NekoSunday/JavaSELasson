package com.sunday.HomeWorkday17.GQ2.HomeWork06;

import java.io.File;
import java.util.Scanner;

public class test {
    private static Long sum=0L;

    public static void main(String[] args) {
        String str = new Scanner(System.in).next();
        File file = new File(str);
        System.out.println(calculate(file));
    }

    public static long calculate(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                System.out.println("文件为：" + f.getAbsoluteFile());
                sum+=f.length();
            } else {
                calculate(f);
            }
        }
        return sum;
    }
}
