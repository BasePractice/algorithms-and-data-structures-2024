package ru.mirea.practice.s230k754.lab4.task3;

public abstract class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    protected String getLogin() {
        return login;
    }

    protected String getPassword() {
        return password;
    }
}
