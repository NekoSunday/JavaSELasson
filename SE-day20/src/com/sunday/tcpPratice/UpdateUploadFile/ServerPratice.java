package com.sunday.tcpPratice.UpdateUploadFile;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerPratice {
    public static void main(String[] args) throws IOException {
        //服务器本身需要持续打开，优化上功能
        ServerSocket ss = new ServerSocket(8800);
        while (true) {
            Socket socket = ss.accept();
            new Thread(() -> {
                try (
                    BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
                    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:/aaa/"+System.currentTimeMillis()+".png"));
                ) {
                    byte[] bytes = new byte[1024];
                    int len;
                    while ((len = bis.read(bytes)) != -1) {
                        bos.write(bytes, 0, len);
                    }

                    OutputStream os = socket.getOutputStream();
                    os.write("上传成功".getBytes());
                    os.close();

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
