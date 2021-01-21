package com.sunday.Jsoup;

import java.io.*;

public class BufferPratice {
    public static void main(String[] args) throws IOException {


        test3();
    }

    private static void test3() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("d:/aaa/i.txt"));
        writer.write("111");
        writer.newLine();
        writer.write("222");
        writer.close();
    }

    private static void test2() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("d:/aaa/e.txt"));
        String Line = null;
        while ((Line = reader.readLine()) != null) {
            System.out.print(Line);
        }
        reader.close();
    }

    //字节缓冲流数组形式复制
    private static void test1() throws IOException {
        long start = System.currentTimeMillis();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("d:/day74【Lucene】.zip"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:/aaa/1.zip"));
        int b;
        byte[] bytes = new byte[1024];
        while ((b = bis.read(bytes)) != -1) {
            bos.write(bytes);
        }
        bis.close();
        bos.close();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }


}
