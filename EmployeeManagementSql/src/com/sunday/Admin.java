package com.sunday;

import com.utilpackage.sqlUtils;
import com.utilpackage.util;

public class Admin {
    private String user;
    private String password;
    private String phoneNum;

    static {
        try {
            MainSystem.stmt = MainSystem.system.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Admin() {
    }

    public Admin(String user, String password, String phoneNum) {
        this.user = user;
        this.password = password;
        this.phoneNum = phoneNum;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public static void registerAdmin() throws Exception {
        util.flushBw("�������û���");
        String user = util.readClient();
        MainSystem.ps = MainSystem.system.prepareStatement("select username from admininfo where username=?");
        MainSystem.ps.setString(1, user);
        MainSystem.rs = MainSystem.ps.executeQuery();
        if (MainSystem.rs.next()) {
            util.flushBw("�û��Ѵ��ڣ�����������");
            MainSystem.printAdmin();
        }
        util.flushBw("����������");
        String password = util.readClient();
        util.flushBw("������绰����");
        String phoneNum = util.readClient();
        MainSystem.stmt.executeUpdate(sqlUtils.insertValue("admininfo", 3, user, password, phoneNum));
        util.flushBw("ע�����Ա�ɹ�!");
        MainSystem.printAdmin();
    }

    public static void loginAdmin() throws Exception {
        MainSystem.ps = MainSystem.system.prepareStatement("SELECT `username`,password From admininfo where username=? and password=?");
        util.flushBw("�������û���");
        String indexUser = util.readClient();
        util.flushBw("����������");
        String indexPassword = util.readClient();
        MainSystem.ps.setString(1, indexUser);
        MainSystem.ps.setString(2, indexPassword);
        MainSystem.rs = MainSystem.ps.executeQuery();
        if (MainSystem.rs.next()) {
            util.flushBw("��¼�ɹ�");
            MainSystem.printMainMenu();
        } else {
            util.flushBw("�û����������������");
            MainSystem.printAdmin();
        }
    }

}
