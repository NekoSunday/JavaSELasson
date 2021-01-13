package com.sunday.HomeWorkday20.HomeWork08;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class LoginClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.2.160", 8888);
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        System.out.println("请输入用户名-密码");
        String user = new Scanner(System.in).nextLine();
        bw.write(user);
        bw.flush();
        socket.shutdownOutput();

        String s = br.readLine();
        System.out.println(s);

        bw.close();
        br.close();
        socket.close();
    }
}
