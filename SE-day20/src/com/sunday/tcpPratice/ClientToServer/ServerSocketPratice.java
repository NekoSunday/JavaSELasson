package com.sunday.tcpPratice.ClientToServer;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ServerSocketPratice {
    public static void main(String[] args) throws IOException {
        test01();
    }


    private static void test01() throws IOException {
        java.net.ServerSocket ss = new java.net.ServerSocket(8800);
        Socket server = ss.accept();
        InputStream is = server.getInputStream();
        byte[] bytes = new byte[1024];
        int len=is.read(bytes);
        String s = new String(bytes, 0, len);
        System.out.println(s);
        is.close();
        server.close();
    }
}
