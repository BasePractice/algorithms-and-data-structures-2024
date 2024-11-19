package ru.mirea.practice.s23k0690;

public class ServiceUser {
    private String user;
    private String pass;

    ServiceUser(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPass() {
        return pass;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }
}
