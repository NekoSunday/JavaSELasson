package com.sunday.DDZ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ddzClient1 {
    static ReentrantLock lock = new ReentrantLock();
    static Condition c1 = lock.newCondition();
    static Condition c2 = lock.newCondition();
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 8888);
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        while (true) {
            new Thread(() -> {
                try {
//                    lock.lock();
                    String card = br.readLine();
                    System.out.println(card);
//                    lock.unlock();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();

            new Thread(() -> {
                try {
//                    lock.lock();
                    String next = new Scanner(System.in).next();
                    bw.write(next);
                    bw.newLine();
                    bw.flush();
//                    lock.unlock();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
