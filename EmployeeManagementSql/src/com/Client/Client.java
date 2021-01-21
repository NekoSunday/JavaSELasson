package com.Client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("192.168.2.196",8888);

            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            new Thread(){
                @Override
                public void run() {
                    while (true){
                        String s = null;
                        try {
                            s = br.readLine();
                            System.out.println(s);
                            if (s.equals("ÏµÍ³ÍË³ö")){
                                br.close();
                                break;
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }.start();

            new Thread(){
                @Override
                public void run() {
                    while (true){
                        try {
                            Scanner scanner = new Scanner(System.in);
                            String i = scanner.next();
                            bw.write(i);
                            bw.write("\n");
                            bw.flush();
                            if (i.equals("0")){
                                if (!br.ready()) {
                                    try {
                                        bw.close();
                                        break;
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
