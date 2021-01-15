package com.sunday;

public class MainSystem {


    public static void main(String[] args) {
        openSystem();
    }


    public static void printAdmin() {
        System.out.println("|------------管理员你好！-----------|");
        util.printOutAttention();
        System.out.println("1、登录      2、注册");
        util.printEnterSelect();
        int index = Integer.parseInt(util.enterStr());
        switch (index){
            case 1:
                Admin.loginAdmin();
                break;
            case 2:
                Admin.registerAdmin();
                break;
            default:
                System.out.println("请重新输入编号");
                printAdmin();
        }
    }


    public static void openSystem() {
        printAdmin();
    }

    public static void printSalaryMenu() {
        System.out.println("|-----------员工工资信息管理-------------|");
        util.printOutAttention();
        System.out.println("1、增加工资信息  2、删除工资信息  3、查询工资信息  4、显示工资列表  0、返回上级菜单");
        util.printEnterSelect();
        int index = Integer.parseInt(util.enterStr());
        switch (index){
            case 1:
                Worker.enployeeSalary();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 0:
                printMainMenu();
                break;
            default:
                System.out.println("请重新输入编号");
               printSalaryMenu();
        }
    }

    public static void printIdentityMenu() {
        System.out.println("|-----------员工身份信息管理-------------|");
        util.printOutAttention();
        System.out.println("1、增加员工信息  2、删除员工信息  3、修改员工信息  4、查询员工信息  5、显示员工列表  0、返回上级菜单");
        util.printEnterSelect();
        int index = Integer.parseInt(util.enterStr());
        switch (index){
            case 1:
                Worker.employeeJudge();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 0:
                printMainMenu();
                break;
            default:
                System.out.println("请重新输入编号");
                printIdentityMenu();
        }
    }

    public static void printMainMenu() {
        System.out.println("|-----------------欢迎来到员工管理系统----------------|");
        util.printOutAttention();
        System.out.println("1、员工身份信息管理          2、员工工资信息管理             0、退出系统");
        util.printEnterSelect();
        int index = Integer.parseInt(util.enterStr());
        switch (index){
            case 1:
                printIdentityMenu();
                break;
            case 2:
                printSalaryMenu();
            case 0:
                System.out.println("系统退出");
                break;
            default:
                System.out.println("请重新输入编号");
                printMainMenu();
        }
    }
}
