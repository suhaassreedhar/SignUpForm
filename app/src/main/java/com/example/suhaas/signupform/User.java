package com.example.suhaas.signupform;

import java.io.Serializable;

public class User implements Serializable{
    private String mUsername;
    private String mPassword;

    User(String username, String password){
        mUsername = username;
        mPassword = password;
    }

    public String getUsername(){
        return mUsername;
    }
}
