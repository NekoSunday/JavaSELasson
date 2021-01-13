package com.sunday.HomeWorkday20.HomeWork09;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class DownServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        while (true) {
            Socket socket = ss.accept();
                new Thread(() -> {
                    try {
                        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
                        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\Sunday\\Desktop\\picture\\86825654_p0.png"));
                        byte[] down = new byte[1024];
                        int len;
                        while ((len = bis.read(down)) != -1) {
                            bos.write(down, 0, len);
                        }
                        bos.close();
                        bis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }).start();
        }
    }
}
