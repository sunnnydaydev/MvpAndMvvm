package com.example.administrator.mvpdemo.model;

/**
 * Create by SunnyDay on 2019/04/24
 */
public class User {
    private String number;
    private String pwd;

    public User(String number, String pwd) {
        this.number = number;
        this.pwd = pwd;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
