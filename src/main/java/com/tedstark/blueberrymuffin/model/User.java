package com.tedstark.blueberrymuffin.model;

import java.time.LocalDate;

public class User {
    private String userName;
    private String userLogin;
    private LocalDate userCreate;

    public User(String userName, String userLogin, LocalDate userCreate) {
        this.userName = userName;
        this.userLogin = userLogin;
        this.userCreate = userCreate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public LocalDate getUserCreate() {
        return userCreate;
    }

    public void setUserCreate(LocalDate userCreate) {
        this.userCreate = userCreate;
    }
}
