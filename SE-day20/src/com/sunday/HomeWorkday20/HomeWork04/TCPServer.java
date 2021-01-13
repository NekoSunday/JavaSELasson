package com.sunday.HomeWorkday20.HomeWork04;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        //创建服务器端
        ServerSocket server = new ServerSocket(8888);
        Socket socket = server.accept();
        //创建输入流作为读取来自客户端的对象
        InputStream is = socket.getInputStream();
        //创建数组作为读取数据的缓冲
        byte[] bytes = new byte[1024];
        //读取数据的长度
        int len=is.read(bytes);
        //输出获取的数据
        System.out.println(new String(bytes,0,len));
        //关闭流
        is.close();
        server.close();
        socket.close();
    }
}
