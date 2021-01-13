package com.sunday.HomeWorkday10.HomeWork03;

public class User {
    private String userType;
    private int id;

    public User(String userType, int id) {
        this.userType = userType;
        this.id = id;
    }

    public User() {
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
