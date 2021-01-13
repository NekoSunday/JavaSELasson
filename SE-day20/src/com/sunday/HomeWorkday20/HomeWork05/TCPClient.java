package com.sunday.HomeWorkday20.HomeWork05;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        //创建一个客户端，输出到IP为127.0.0.1，端口为8888的服务器
        Socket socket = new Socket("127.0.0.1", 8888);
        //创建输出流，往服务器递送数据
        OutputStream os = socket.getOutputStream();
        //写入数据
        os.write(" hello.服务器,我是客户端。".getBytes());
        //关闭流
        os.close();
        socket.close();
    }
}
