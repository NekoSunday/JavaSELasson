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
        util.flushBw("请输入用户名");
        String user = util.readClient();
        MainSystem.ps = MainSystem.system.prepareStatement("select username from admininfo where username=?");
        MainSystem.ps.setString(1, user);
        MainSystem.rs = MainSystem.ps.executeQuery();
        if (MainSystem.rs.next()) {
            util.flushBw("用户已存在，请重新输入");
            MainSystem.printAdmin();
        }
        util.flushBw("请输入密码");
        String password = util.readClient();
        util.flushBw("请输入电话号码");
        String phoneNum = util.readClient();
        MainSystem.stmt.executeUpdate(sqlUtils.insertValue("admininfo", 3, user, password, phoneNum));
        util.flushBw("注册管理员成功!");
        MainSystem.printAdmin();
    }

    public static void loginAdmin() throws Exception {
        MainSystem.ps = MainSystem.system.prepareStatement("SELECT `username`,password From admininfo where username=? and password=?");
        util.flushBw("请输入用户名");
        String indexUser = util.readClient();
        util.flushBw("请输入密码");
        String indexPassword = util.readClient();
        MainSystem.ps.setString(1, indexUser);
        MainSystem.ps.setString(2, indexPassword);
        MainSystem.rs = MainSystem.ps.executeQuery();
        if (MainSystem.rs.next()) {
            util.flushBw("登录成功");
            MainSystem.printMainMenu();
        } else {
            util.flushBw("用户名、密码输入错误");
            MainSystem.printAdmin();
        }
    }

}
