package com.sunday.demo01;

import java.io.FileNotFoundException;
import java.io.IOException;

public class exceptionPratice {
    public static void main(String[] args)  {
        demo03("a.txt");
    }

    private static void demo03(String s)  {
        if (!s.endsWith("txe")){
            try {
                //getMessage获取抛出Exception的字符串
                throw new FileNotFoundException("文件不存在");
            } catch (FileNotFoundException e) {
                String index = e.getMessage();
                System.out.println(index);
            } finally {
                System.out.println("释放内存");
            }
        }
        System.out.println(s);
    }

    private static void demo02(String s) {
        if (!s.endsWith("ext")){
            try {
                throw new IOException();
            } catch (IOException e) {
//                e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println(e.toString());
            }
        }
        System.out.println(s);
    }

    private static void demo01(String s) throws IOException {
        if (!s.endsWith("txt")){
            throw new IOException("格式不正确");
        }
        System.out.println(s);
    }
}
