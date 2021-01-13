package com.sunday.demo01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exceptionPratice02 extends RegisterException {
    private static List<String> list=List.of("amy","lucy","jame","jack");
    private static ArrayList<String> userlist=new ArrayList<>(list);

    public static void main(String[] args) {
        System.out.println("请输入要注册的用户名");
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        try {
            checkUsername(next);
            System.out.println("注册成功");
            userlist.add(next);
        } catch (RegisterException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkUsername(String newName) throws RegisterException {
        if (userlist.contains(newName)){
            throw new RegisterException("用户名被注册！");
        }
    }
}
