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
    public static void registerAdmin() {
        util.printEnterUser();
        String user = util.enterStr();
        util.printEnterPassword();
        String password = util.enterStr();
        System.out.println("请输入电话号码");
        String phoneNum = util.enterStr();
        adminInfo.put(id++, new Admin(user, password, phoneNum));
        System.out.println("注册管理员成功！");
        MainSystem.printAdmin();
    }

    //登录管理员
    public static void loginAdmin() {
        util.printEnterUser();
        String indexUser = util.enterStr();
        util.printEnterPassword();
        String indexPassword = util.enterStr();
        if (adminInfo.size() != 0) {
            Set<Integer> adminId = adminInfo.keySet();
            for (Integer integer : adminId) {
                if (adminInfo.get(integer).getUser().equals(indexUser)) {
                    if (adminInfo.get(integer).getPassword().equals(indexPassword)) {
                        System.out.println("登录成功");
                        MainSystem.printMainMenu();
                    }else{
                        util.printEnterError();
                        MainSystem.printAdmin();
                    }
                }else{
                    util.printEnterError();
                    MainSystem.printAdmin();
                }
            }
        } else {
            util.printEnterError();
            MainSystem.printAdmin();
        }
    }
}
