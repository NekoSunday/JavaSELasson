package com.sunday.tcpPratice.ServerToClient;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerPratice {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8800);
        Socket socket = ss.accept();
        //接受客户端传来的数据
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len=is.read(bytes);
        String s = new String(bytes, 0, len);
        System.out.println(s);
        //服务器数据返回
        OutputStream os = socket.getOutputStream();
        os.write("好的".getBytes());

        os.close();
        is.close();
        socket.close();
    }
}
