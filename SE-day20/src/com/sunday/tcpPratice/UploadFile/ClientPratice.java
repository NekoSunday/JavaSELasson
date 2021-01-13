package com.sunday.tcpPratice.UploadFile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientPratice {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\Sunday\\Desktop\\picture\\86825654_p0.png"));
        Socket localhost = new Socket("localhost", 8800);
        BufferedOutputStream bos = new BufferedOutputStream(localhost.getOutputStream());

        byte[] bytes = new byte[1024];
        int len;
        while ((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
            bos.flush();
        }
        bos.close();
        bis.close();
        localhost.close();
    }
}
