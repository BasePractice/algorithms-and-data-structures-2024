package ru.mirea.practice.s0000004.task3;

import java.util.Scanner;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public static User authenticate(Scanner scanner) {
        System.out.println("Введите логин:");
        String login = scanner.nextLine();

        System.out.println("Введите пароль:");
        String password = scanner.nextLine();

        return new User(login, password);
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}