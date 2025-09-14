package com.api.models.requestModel;

public class LoginRequestModel {
    private String username;
    private String password;

    public String getusername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getpassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LoginRequestModel() {
    }

    public LoginRequestModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginRequestModel{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
