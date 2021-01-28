package com.sunday.Class;

import com.sunday.Database.GetData;

import java.util.List;

public class UserService {
    private GetData getData=new GetData();


    public User findByUsername(String username) {
        return getData.findByUsername(username);
    }

    public List<User> findAll() {
        return getData.findAll();
    }
}
