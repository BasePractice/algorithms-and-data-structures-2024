package ru.mirea.practice.s23k0823.internetshop;


public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;

    }

    public boolean authenticate(String login, String password) {
        return this.login.equals(login) && this.password.equals(password);
    }
}
