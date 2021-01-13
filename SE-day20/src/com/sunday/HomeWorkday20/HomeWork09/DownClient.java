package com.sunday.HomeWorkday20.HomeWork09;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;

public class DownClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8888);
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:/aaa/"+System.currentTimeMillis()+"down.png"));
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] down = new byte[1024];
        int len;
        while ((len=bis.read(down))!=-1){
            bos.write(down,0,len);
        }
        bos.close();
        bis.close();
        socket.close();
    }
}
