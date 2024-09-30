package ru.mirea.practice.s0000001.pw4.task3;

public class User {
    private int login;
    private int password;

    public User(int login, int password) {
        this.login = login;
        this.password = password;
    }

    public String  tryEnter(int loginNew, int passwordNew) {
        if (loginNew == this.login && passwordNew == this.password) {
            return "true";
        }
        return "false";
    }
}