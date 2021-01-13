package com.sunday.BrowserServerPratice;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        Socket socket = serverSocket.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = br.readLine();
        String path = s.split(" ")[1].substring(1);
//        System.out.println(path);
        FileInputStream fis = new FileInputStream("D:\\JavaSE\\SE-day20\\"+path);
        byte[] bytes = new byte[8192];
        int len;
        //打印流
        PrintStream ps = new PrintStream(socket.getOutputStream());
        //遵守HTTP协议
        ps.println("HTTP/1.1 200 OK");
        ps.println();
        while ((len=fis.read(bytes))!=-1){
            ps.write(bytes,0,len);
        }
        System.out.println(new String(bytes,0,len));
        socket.close();
        serverSocket.close();
    }
}
