package ru.mirea.practice.s23K0135.pw4.task3;

public class User {
    private int login;
    private int password;

    public User(int login, int password) {
        this.login = login;
        this.password = password;
    }

    public boolean tryEnter(int loginNew, int passwordNew) {
        boolean temp = false;
        if (loginNew == this.login && passwordNew == this.password) {
            temp = true;
        }
        return temp;
    }
}
