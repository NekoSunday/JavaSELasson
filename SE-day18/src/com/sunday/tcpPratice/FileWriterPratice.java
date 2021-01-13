package com.sunday.tcpPratice;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterPratice {
    public static void main(String[] args) throws IOException {
        demo02();
    }

    private static void demo02() throws IOException {
        FileWriter writer = new FileWriter("d:/aaa/e.txt");
        char[] ch="七七八八".toCharArray();
        writer.write(ch);
        writer.write(ch,2,2);

        writer.close();
    }

    private static void demo01() throws IOException {
        FileWriter writer = new FileWriter("d:/aaa/e.txt");
        writer.write(97);
        writer.flush();
        writer.write('a');
        writer.write("123");
        writer.write(30000);

        writer.close();
    }
}
