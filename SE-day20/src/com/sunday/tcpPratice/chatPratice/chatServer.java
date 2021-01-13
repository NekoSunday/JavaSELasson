package com.sunday.tcpPratice.chatPratice;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class chatServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8800);
        Socket socket = serverSocket.accept();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));


        new Thread(() -> {
            try {
                while (true){
                    String s = br.readLine();
                    if (s.equals("end")){
                        socket.close();
                        System.out.println(socket.getInetAddress().getHostAddress()+"断开连接");
                        break;
                    }
                    System.out.println(socket.getInetAddress().getHostAddress()+":"+s);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();


        new Thread(() -> {
            try {

                while (true){
                    String s = new Scanner(System.in).nextLine();
                    if (s.equals("end")){
                        socket.close();
                        System.out.println("断开连接");
                        break;
                    }
                    bw.write(s);
                    bw.newLine();
                    bw.flush();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
