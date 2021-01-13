package com.sunday.tcpPratice.UpdateUploadFile;

import java.io.*;
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
        localhost.shutdownOutput();

        System.out.println("上传完毕");
        InputStream is = localhost.getInputStream();
        byte[] back = new byte[20];
        is.read(back);
        System.out.println(new String(back));
        is.close();
        bos.close();
        bis.close();
        localhost.close();
    }
}
