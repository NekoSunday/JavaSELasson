package com.sunday.tcpPratice.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class pratice {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8800/*, 10, InetAddress.getByName("192.168.2.196")*/);
        while (true) {
            Socket socket = ss.accept();
            new Thread(() -> {
                try (
                        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
                        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:/aaa/" + System.currentTimeMillis() + ".png"));
                ) {
                    byte[] bytes = new byte[1024];
                    int len;
                    while ((len = bis.read(bytes)) != -1) {
                        bos.write(bytes, 0, len);
                    }

                    OutputStream os = socket.getOutputStream();
                    os.write("上传成功".getBytes());
                    os.close();
                    System.out.println(socket.getInetAddress().getHostAddress());
                    System.out.println(socket.getPort());
                    bos.close();
                    bis.close();
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();

        }
    }
}
