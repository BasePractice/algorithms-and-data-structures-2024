package ru.mirea.practice.s23L0908.internetshop;

public class User {
    private final String login;
    private final String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    // Getters
    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
