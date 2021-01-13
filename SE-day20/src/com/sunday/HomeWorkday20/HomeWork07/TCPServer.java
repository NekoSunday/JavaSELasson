package com.sunday.HomeWorkday20.HomeWork07;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        Socket socket = ss.accept();
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:/aaa/" + System.currentTimeMillis() + ".jpg"));

            byte[] bytes = new byte[1024];
            int len;
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
                bos.flush();
            }

            OutputStream os = socket.getOutputStream();
            os.write("上传完毕".getBytes());
            os.flush();
        os.close();
        bis.close();
        bos.close();
    }
}
