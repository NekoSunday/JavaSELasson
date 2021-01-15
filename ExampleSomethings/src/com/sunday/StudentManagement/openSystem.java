package com.sunday.StudentManagement;

import java.util.Scanner;

public class openSystem {
    public static void main(String[] args) {
        System.out.println("------------------欢迎使用学生管理系统-------------------");
        printMenu();
        selectMenu();
    }

    private static void selectMenu() {
        String enterOption = new Scanner(System.in).next();
        if (!(enterOption.equals("1") || enterOption.equals("2") || enterOption.equals("3"))) {
            System.out.println("输入错误请重新输入选项：");
            selectMenu();
        }
        int optionIndex = Integer.parseInt(enterOption);
        switch (optionIndex) {
            case 1:
                enterStudents();
                selectMenu();
                break;
            case 2:
                printStudents();
                selectMenu();
                break;
            case 3:
                closeSystem();
                break;
        }
    }

    private static void closeSystem() {
        System.out.println("学生系统已经退出，再见。");
    }

    private static void printStudents() {
        Management.loadFile();
    }

    public static void enterStudents() {

    }

    private static void printMenu() {
        System.out.println("1、录入学生信息       2、输出学生信息          3、退出系统");
    }


}
