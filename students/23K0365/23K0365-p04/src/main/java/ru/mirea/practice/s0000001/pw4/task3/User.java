package ru.mirea.practice.s23k0362.pw4.task3;

import java.util.Scanner;

public class User {
    private int login;
    private int password;
    private Scanner sc = new Scanner(System.in);

    public User(int login, int password) {
        this.login = login;
        this.password = password;
    }

    public boolean tryEnter() {
        System.out.println("Type ur login:");
        int loginNew = sc.nextInt();
        if (loginNew == this.login) {
            System.out.println("Type ur password:");
            int passwordNew = sc.nextInt();
            if (passwordNew == this.password) {
                return true;
            }
        }
        return false;
    }
}