package com.api.models.requestModel.responseModel;

import java.util.Arrays;

public class LoginResponseModel {
     private String token;
     private String type;
     private int id;
     private String username;
     private String email;
     private String[] roles;

    public LoginResponseModel() {
    }

    public String gettoken() {
        return token;
    }

    public LoginResponseModel setToken(String token) {
        this.token = token;
        return this;
    }

    public String gettype() {
        return type;
    }

    public LoginResponseModel setType(String type) {
        this.type = type;
        return this;
    }

    public int getid() {
        return id;
    }

    public LoginResponseModel setId(int id) {
        this.id = id;
        return this;
    }

    public String getusername() {
        return username;
    }

    public LoginResponseModel setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getemail() {
        return email;
    }

    public LoginResponseModel setEmail(String email) {
        this.email = email;
        return this;
    }

    public String[] getroles() {
        return roles;
    }

    public LoginResponseModel setRoles(String[] roles) {
        this.roles = roles;
        return this;
    }

    @Override
    public String toString() {
        return "LoginResponseModel{" +
                "token='" + token + '\'' +
                ", type='" + type + '\'' +
                ", id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", roles=" + Arrays.toString(roles) +
                '}';
    }

    public LoginResponseModel(String token, String type, int id, String username, String email, String[] roles) {
        this.token = token;
        this.type = type;
        this.id = id;
        this.username = username;
        this.email = email;
        this.roles = roles;
    }
}
