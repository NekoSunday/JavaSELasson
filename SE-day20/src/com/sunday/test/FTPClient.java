package com.sunday.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/*
文件上传客户端
 */
public class FTPClient {
    public static void main(String[] args) throws IOException {

        // 创建一个客户端(连接服务器)
        Socket socket = new Socket("192.168.2.165", 6666);

        // 往服务器端写数据
        OutputStream os = socket.getOutputStream();

        // 关联本地文件(读取本地文件)
        FileInputStream fis = new FileInputStream("C:\\Users\\Sunday\\Desktop\\picture\\1.jpg");

        byte[] data = new byte[1024];
        int len;

        while ((len = fis.read(data)) != -1) {
            // 写入到服务器
            os.write(data,0,len);
        }

        fis.close();
        socket.close();
    }
}
