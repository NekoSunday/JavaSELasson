package com.sunday.HomeWorkday20.HomeWork07;

import java.io.*;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8888);
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\Sunday\\Desktop\\picture\\1.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        InputStream is = socket.getInputStream();

        byte[] bytes = new byte[1024];
        int len;
        while ((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
            bos.flush();
        }
        socket.shutdownOutput();

        byte[] back = new byte[20];
        is.read(back);
        System.out.println(new String(back));
        is.close();
        bos.close();
        bis.close();
//        socket.close();
    }
}
