package com.shailesh.mak.springmongodbjwt.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "spr_app_user")
public class AppUser {
    @Id
    private String appId;
    private String userName;
    private String password;

    public AppUser() {
    }

    public AppUser(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
