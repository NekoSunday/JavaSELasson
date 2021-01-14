package com.sunday.DDZ;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ddzServer {
    static ReentrantLock lock = new ReentrantLock();
    //监视器，分阶段唤醒
    static Condition c1 = lock.newCondition();
    static Condition c2 = lock.newCondition();
    static Condition c3 = lock.newCondition();
    static int playerID = 1;
    static String enterString = null;
    static ArrayList<String> playerCards;

    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(8888);
        Collections.shuffle(Cards.keyList);
        Cards.lastCardNum = new ArrayList<>();
        Collections.addAll(Cards.lastCardNum, Cards.keyList.get(51), Cards.keyList.get(52), Cards.keyList.get(53));
        Cards playerid = new Cards();
        /*new Thread(() -> {
            try {
                lock.lock();
                Cards player = new Cards();
                ArrayList<String> playerCards = player.getPlayerCards(1);
                Socket player1 = server.accept();
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(player1.getOutputStream()));
                //循环开始
                bw.write(playerCards.toString());
                bw.newLine();
                bw.flush();

                lock.wait();
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }).start();

        new Thread(() -> {
            try {
                lock.lock();
                Cards player = new Cards();
                ArrayList<String> playerCards = player.getPlayerCards(2);
                Socket player2 = server.accept();
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(player2.getOutputStream()));
                //循环开始
                bw.write(playerCards.toString());
                bw.newLine();
                bw.flush();

                lock.wait();

            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }).start();

        new Thread(() -> {
            try {
                lock.lock();
                Cards player = new Cards();
                ArrayList<String> playerCards = player.getPlayerCards(3);
                Socket player3 = server.accept();
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(player3.getOutputStream()));
                //循环开始
                bw.write(playerCards.toString());
                bw.newLine();
                bw.flush();

                lock.wait();
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }).start();*/
        while (true) {
            Socket player = server.accept();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(player.getOutputStream()));
            BufferedReader br = new BufferedReader(new InputStreamReader(player.getInputStream()));
            new Thread(() -> {
                try {
//                    lock.lock();
                    playerCards = playerid.getPlayerCards(playerID++);

                    //循环开始
                    bw.write(playerCards.toString());
                    bw.newLine();
                    bw.flush();
//                    lock.unlock();
//                    c2.signal();
//                    c1.await();
//                    lock.wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();


            new Thread(() -> {
                try {
//                    lock.lock();
//                    lock.notify();
                    String str = br.readLine();
                    System.out.println(str);
                    if (str.equals("1")) {
                        playerCards = playerid.getStarCards(str);
                        bw.write(playerCards.toString());
                        bw.newLine();
                        bw.flush();
                    }
//                    lock.unlock();
//                    c1.signal();
//                    c2.await();
//                    lock.wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
