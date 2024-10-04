package ru.mirea.practice.s0000001.task1;

import java.util.Scanner;

class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public boolean authenticate(Scanner scanner) {
        System.out.print("Введите логин: ");
        String inputLogin = scanner.nextLine();
        System.out.print("Введите пароль: ");
        String inputPassword = scanner.nextLine();

        return login.equals(inputLogin) && password.equals(inputPassword);
    }
}
