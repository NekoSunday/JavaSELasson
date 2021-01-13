package com.sunday.HomeWorkday20.HomeWork06;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        //创建一个客户端，输出到IP为127.0.0.1，端口为8888的服务器
        Socket socket = new Socket("127.0.0.1", 8888);
        //创建输出流，往服务器递送数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        //创建输入流，获取服务器返回的数据
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //通过控制台输入，写入数据
        while (true) {
            String nextLine = new Scanner(System.in).nextLine();
            if (nextLine.equals("exit")) {
                socket.close();
                System.out.println("向服务器发送数据结束");
                break;
            }
            bw.write(nextLine);
            bw.newLine();
            bw.flush();

            String s = br.readLine();
            System.out.println(s);
        }
        //关闭流
        br.close();
        bw.close();

    }
}
