package com.sunday.HomeWorkday20.HomeWork08;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;
import java.util.Set;

public class LoginServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        Properties userInfo = new Properties();
        userInfo.load(new FileInputStream("d:/aaa/userINFO.txt"));
        Set<String> OrigonUser = userInfo.stringPropertyNames();
        while (true) {
            Socket socket = ss.accept();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            new Thread(() -> {
                try {
                    userInfo.load(new FileInputStream("d:/aaa/userINFO.txt"));
                    String[] split = br.readLine().split("-");
                    String user = split[0];
                    String password = split[1];
                    if (OrigonUser.contains(user)) {
                        if (!userInfo.getProperty(user).equals(password)) {
                            bw.write("输入错误");
                            bw.flush();
                        } else {
                            bw.write("登录成功");
                            bw.flush();
                        }
                    } else {
                        userInfo.setProperty(user, password);
                        userInfo.store(new FileOutputStream("d:/aaa/userINFO.txt", true), "newuser");
                        bw.write("默认注册成功");
                        bw.flush();
                    }

                    bw.close();
                    br.close();
//                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
