package com.sunday.staticProxy;

public class UserService implements UserServiceImpl{

    public void save(){
        System.out.println("保存对象");
    }
    public void update(){
        System.out.println("更新对象");
    }
    public void delete(){
        System.out.println("删除对象");
    }

    @Override
    public void select() {

    }
}
