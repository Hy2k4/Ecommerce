package model;

import java.io.Serializable;

public class User implements Serializable {
    private String username;
    private String password;

    public User(String u, String p) {
        username = u;
        password = p;
    }

    public boolean login(String u, String p) {
        return username.equals(u) && password.equals(p);
    }
}