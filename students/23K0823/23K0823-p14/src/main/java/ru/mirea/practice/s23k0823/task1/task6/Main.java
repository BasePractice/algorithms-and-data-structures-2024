package ru.mirea.practice.s23k0823.task1.task6;

import java.util.regex.Pattern;

public abstract class Main {
    public static void main(String[] args) {
        String[] correctEmails = {"user@example.com", "root@localhost"}; // У ВАС ПРИМЕР НЕКОР. :)
        String[] incorrectEmails = {"myhost@@@com.ru", "@my.ru", "Julia String"};

        String pattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        for (String email : correctEmails) {
            if (Pattern.matches(pattern, email)) {
                System.out.println(email + " - правильный адрес");
            } else {
                System.out.println(email + " - неправильный адрес");
            }
        }

        for (String email : incorrectEmails) {
            if (Pattern.matches(pattern, email)) {
                System.out.println(email + " - правильный адрес");
            } else {
                System.out.println(email + " - неправильный адрес");
            }
        }
    }
}
