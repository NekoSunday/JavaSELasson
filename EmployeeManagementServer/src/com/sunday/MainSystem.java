package com.sunday;

import java.io.*;
import java.net.ServerSocket;

public class MainSystem {
    static {
        try {
            util.ss=new ServerSocket(8888);
            util.socket = util.ss.accept();
            util.bw = new BufferedWriter(new OutputStreamWriter(util.socket.getOutputStream()));
            util.br = new BufferedReader(new InputStreamReader(util.socket.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        MainSystem.openSystem();
    }


    public static void printAdmin() throws Exception {
        util.printBw("|------------管理员你好！-----------|");
        util.printBw("您可以进行如下操作：(输入编号即可)");
        util.printBw("1、登录      2、注册      0、退出系统");
        util.flushBw("请选择您的操作：");
        String indexSelect = util.readClient();
        switch (indexSelect) {
            case "1":
                Admin.loginAdmin();
                break;
            case "2":
                Admin.registerAdmin();
                break;
            case "0":
                util.flushBw("系统退出");
                break;
            default:
                util.flushBw("请重新输入编号");
                printAdmin();
                break;
        }
    }


    public static void openSystem() throws Exception {
        printAdmin();
    }

    public static void printSalaryMenu() throws Exception {
        util.printBw("|-----------员工工资信息管理-------------|");
        util.printBw("您可以进行如下操作：(输入编号即可)");
        util.printBw("1、增加工资信息  2、删除工资信息  3、修改工资信息  4、查询工资信息  5、显示工资列表  0、返回上级菜单");
        util.flushBw("请选择您的操作：");
        String indexSelect = util.readClient();
        switch (indexSelect) {
            case "1":
                Employee.setSalary();
                break;
            case "2":
                Employee.deleteSalary();
                break;
            case "3":
                Employee.changeSalary();
                break;
            case "4":
                Employee.showSalary();
                break;
            case "5":
                Employee.showAllSalary();
                break;
            case "0":
                printMainMenu();
                break;
            default:
                util.flushBw("请重新输入编号");
                printSalaryMenu();
                break;
        }
    }

    public static void printIdentityMenu() throws Exception {
        util.printBw("|-----------员工身份信息管理-------------|");
        util.printBw("您可以进行如下操作：(输入编号即可)");
        util.printBw("1、增加员工信息  2、删除员工信息  3、修改员工信息  4、查询员工信息  5、显示员工列表  0、返回上级菜单");
        util.flushBw("请选择您的操作：");
        String indexSelect = util.readClient();
        switch (indexSelect) {
            case "1":
                Employee.setIdentity();
                break;
            case "2":
                Employee.deleteIdentity();
                break;
            case "3":
                Employee.changeIdentity();
                break;
            case "4":
                Employee.showIdentity();
                break;
            case "5":
                Employee.showAllIdentity();
                break;
            case "0":
                printMainMenu();
                break;
            default:
                util.flushBw("请重新输入编号");
                printIdentityMenu();
                break;
        }
    }

    public static void printMainMenu() throws Exception {
        util.printBw("|-----------------欢迎来到员工管理系统----------------|");
        util.printBw("您可以进行如下操作：(输入编号即可)");
        util.printBw("1、员工身份信息管理          2、员工工资信息管理             0、退出系统");
        util.flushBw("请选择您的操作：");
        String indexSelect = util.readClient();
        switch (indexSelect) {
            case "1":
                printIdentityMenu();
                break;
            case "2":
                printSalaryMenu();
                break;
            case "0":
                util.flushBw("系统退出");
                break;
            default:
                util.flushBw("请重新输入编号");
                printMainMenu();
                break;
        }
    }
}
