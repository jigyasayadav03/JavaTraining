package com.classss.loginpack;
import java.io.Serializable;

public class Login implements Serializable {
    private static final long serialVersionUID = 1L;
	/**
     * 
     */
    //private static final long serialVersionUID = 1 L;
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}