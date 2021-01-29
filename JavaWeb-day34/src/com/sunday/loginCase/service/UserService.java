package com.sunday.loginCase.service;

import com.sunday.loginCase.Database.SearchUser;
import com.sunday.loginCase.entity.User;

public class UserService {

    private SearchUser searchUser=new SearchUser();

    public User findUser(String username) {
        return searchUser.findUser(username);
    }
}
