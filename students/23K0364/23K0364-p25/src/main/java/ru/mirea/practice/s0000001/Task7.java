package ru.mirea.practice.s0000001;

import java.util.regex.Pattern;

public abstract class Task7 {
    public static void main(String[] args) {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d_]{8,}$";
        String[] passwords = {"F032_Password", "TrySpy1", "smart_pass", "A007"};

        for (String password : passwords) {
            System.out.println(password + " is valid: " + Pattern.matches(regex, password));
        }
    }
}

