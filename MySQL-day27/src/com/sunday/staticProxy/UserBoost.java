package com.sunday.staticProxy;

public class UserBoost implements UserServiceImpl{
    private UserService userService;

    public UserBoost(UserService userService) {
        this.userService = userService;
    }

    public void save(){
        System.out.println("日志");
        System.out.println("保存对象");
    }
    public void update(){
        System.out.println("日志");
        System.out.println("更新对象");
    }
    public void delete(){
        System.out.println("日志");
        System.out.println("删除对象");
    }

    @Override
    public void select() {
        System.out.println("日志");
        System.out.println("选择对象");
    }
}
