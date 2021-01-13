package com.sunday.tcpPratice;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutPutpratice {
    public static void main(String[] args) throws IOException {
        demo05();
    }

    private static void demo05() throws IOException {
        FileOutputStream fos = new FileOutputStream("d://aaa//f.txt", true);
        fos.write("床前明月光".getBytes());
        fos.write("\n\r".getBytes());
        fos.write("疑是地上霜".getBytes());
        fos.write("\n\r".getBytes());
        fos.write("举头望明月".getBytes());
        fos.write("\n\r".getBytes());
        fos.write("低头思故乡".getBytes());
        fos.close();
    }
    private static void demo04() throws IOException {
        FileOutputStream fos = new FileOutputStream("d://aaa//d.txt", true);
        fos.write("床前明月光".getBytes());
        fos.write("\r\n".getBytes());
        fos.write("疑是地上霜".getBytes());
        fos.write("\r\n".getBytes());
        fos.write("举头望明月".getBytes());
        fos.write("\r\n".getBytes());
        fos.write("低头思故乡".getBytes());
        fos.close();
    }

    private static void demo03() throws IOException {
        FileOutputStream fos = new FileOutputStream("d://aaa//c.txt");
        byte[] b={-49,-51,-52,-53};
        fos.write(b);
        fos.close();
    }

    private static void demo02() throws IOException {
        FileOutputStream fos = new FileOutputStream("d://aaa//c.txt", true);
        byte[] b="aabbccddee".getBytes();
        fos.write(b,2,5);
        fos.close();
    }

    public static void demo01() throws IOException {
        //创建输出流，若文件未找到则自动创建
        FileOutputStream fos = new FileOutputStream("d://aaa//c.txt");
        fos.write("七七八八".getBytes());
        //释放资源
        fos.close();
    }
}
