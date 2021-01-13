package com.sunday.tcpPratice.ServerToClient;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientPratice {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8800);
        OutputStream os = socket.getOutputStream();
        //数据传入服务器
        os.write("112233".getBytes());
        //接受服务器传回数据
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len=is.read(bytes);
        System.out.println(new String(bytes, 0, len));

        is.close();
        os.close();
        socket.close();
    }
}
