package com.sunday;

import java.util.HashMap;
import java.util.Set;

public class Admin {
    private String user;
    private String password;
    private String phoneNum;
    private static int id = 1;
    public static HashMap<Integer, Admin> adminInfo = new HashMap<>();

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

    //注册管理员
    public static void registerAdmin() throws Exception {
        util.flushBw("请输入用户名");
        String user = util.readClient();
        util.flushBw("请输入密码");
        String password = util.readClient();
        util.flushBw("请输入电话号码");
        String phoneNum = util.readClient();
        adminInfo.put(id++, new Admin(user, password, phoneNum));
        util.flushBw("注册管理员成功!");
        MainSystem.printAdmin();
    }

    //登录管理员
    public static void loginAdmin() throws Exception {
        util.flushBw("请输入用户名");
        String indexUser = util.readClient();
        util.flushBw("请输入密码");
        String indexPassword = util.readClient();
        if (adminInfo.size() != 0) {
            Set<Integer> adminId = adminInfo.keySet();
            for (Integer integer : adminId) {
                if (adminInfo.get(integer).getUser().equals(indexUser)) {
                    if (adminInfo.get(integer).getPassword().equals(indexPassword)) {
                        util.flushBw("登录成功");
                        MainSystem.printMainMenu();
                    }else{
                        util.flushBw("用户名、密码输入错误");
                        MainSystem.printAdmin();
                    }
                }else{
                    util.flushBw("用户名、密码输入错误");
                    MainSystem.printAdmin();
                }
            }
        } else {
            util.flushBw("用户名、密码输入错误");
            MainSystem.printAdmin();
        }
    }
}
