package ru.mirea.practice.s0000001;

import java.util.regex.Pattern;

public abstract class Task6 {
    public static void main(String[] args) {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        String[] emails = {"user@example.com", "root@localhost", "myhost@@@com.ru", "@my.ru", "Julia String"};

        for (String email : emails) {
            System.out.println(email + " is valid: " + Pattern.matches(regex, email));
        }
    }
}

