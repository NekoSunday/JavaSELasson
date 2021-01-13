package com.sunday.HomeWorkday14.HomeWork2.GQ2.HomeWork03;

public class Test {

    public static void main(String[] args) {
        try {
            login("admin","admin");
//            login("123","admin");
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }
    public static void login(String name,String pwd) throws LoginException {
        if (name==null||name==""){
            throw new LoginException("用户名输入有误");
        }else if (!name.equals("admin")){
            throw new LoginException("用户名不存在！");
        }
         if (!pwd.equals("admin")){
            throw new LoginException("密码输入有误");
        }
        System.out.println("欢迎"+name);
    }
}
