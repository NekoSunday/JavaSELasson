package com.sunday;

import com.utilpackage.StartDatabase;
import com.utilpackage.sqlUtils;
import com.utilpackage.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainSystem {
    public static Statement stmt;
    public static PreparedStatement ps;
    public static ResultSet rs;
    public static Connection system;

    static {
        try {
            system = sqlUtils.getConnection();
            stmt = MainSystem.system.createStatement();
            StartDatabase.start();
            util.ss = new ServerSocket(8888);
            /*util.socket = util.ss.accept();
            util.bw = new BufferedWriter(new OutputStreamWriter(util.socket.getOutputStream()));
            util.br = new BufferedReader(new InputStreamReader(util.socket.getInputStream()));*/
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        new Thread(() -> {
            try {
                while (true) {
                    util.socket = util.ss.accept();
                    util.bw = new BufferedWriter(new OutputStreamWriter(util.socket.getOutputStream()));
                    util.br = new BufferedReader(new InputStreamReader(util.socket.getInputStream()));
                    MainSystem.openSystem();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }


    public static void printAdmin() throws Exception {
        util.printBw("|------------����Ա��ã�-----------|");
        util.printBw("�����Խ������²�����(�����ż���)");
        util.printBw("1����¼      2��ע��      0���˳�ϵͳ");
        util.flushBw("��ѡ�����Ĳ�����");
        String indexSelect = util.readClient();
        switch (indexSelect) {
            case "1":
                Admin.loginAdmin();
                break;
            case "2":
                Admin.registerAdmin();
                break;
            case "0":
                util.flushBw("ϵͳ�˳�");
                break;
            default:
                util.flushBw("������������");
                printAdmin();
                break;
        }
    }


    public static void openSystem() throws Exception {
        printAdmin();
    }

    public static void printSalaryMenu() throws Exception {
        util.printBw("|-----------Ա��������Ϣ����-------------|");
        util.printBw("�����Խ������²�����(�����ż���)");
        util.printBw("1�����ӹ�����Ϣ  2��ɾ��������Ϣ  3���޸Ĺ�����Ϣ  4����ѯ������Ϣ  5����ʾ�����б�  0�������ϼ��˵�");
        util.flushBw("��ѡ�����Ĳ�����");
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
                util.flushBw("������������");
                printSalaryMenu();
                break;
        }
    }

    public static void printIdentityMenu() throws Exception {
        util.printBw("|-----------Ա�������Ϣ����-------------|");
        util.printBw("�����Խ������²�����(�����ż���)");
        util.printBw("1������Ա����Ϣ  2��ɾ��Ա����Ϣ  3���޸�Ա����Ϣ  4����ѯԱ����Ϣ  5����ʾԱ���б�  0�������ϼ��˵�");
        util.flushBw("��ѡ�����Ĳ�����");
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
                util.flushBw("������������");
                printIdentityMenu();
                break;
        }
    }

    public static void printMainMenu() throws Exception {
        util.printBw("|-----------------��ӭ����Ա������ϵͳ----------------|");
        util.printBw("�����Խ������²�����(�����ż���)");
        util.printBw("1��Ա�������Ϣ����          2��Ա��������Ϣ����             0���˳�ϵͳ");
        util.flushBw("��ѡ�����Ĳ�����");
        String indexSelect = util.readClient();
        switch (indexSelect) {
            case "1":
                printIdentityMenu();
                break;
            case "2":
                printSalaryMenu();
                break;
            case "0":
                util.flushBw("ϵͳ�˳�");
                break;
            default:
                util.flushBw("������������");
                printMainMenu();
                break;
        }
    }
}
