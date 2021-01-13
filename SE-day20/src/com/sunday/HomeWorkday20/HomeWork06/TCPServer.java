package com.sunday.HomeWorkday20.HomeWork06;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        //创建服务器端
        ServerSocket server = new ServerSocket(8888);
        Socket socket = server.accept();
        //创建输入流作为读取来自客户端的对象
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //创建输出流作为返回客户端对象
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        while (true) {
            //读取从客户端获取的字符串
            String s = br.readLine();
            if (s.equals("exit")){
                System.out.println(socket.getInetAddress().getHostAddress()+"关闭输入");
                socket.close();
                break;
            }
            //输出获取的数据
            System.out.println(s);

            bw.write("输入成功");
            bw.newLine();
            bw.flush();
        }
        //关闭流
        bw.close();
        br.close();
        server.close();

    }
}
