package ru.mirea.practice.s0000001.prog6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Main {
    public static void main(String[] args) {
        String[] emails = {
            "user@example.com",
            "root@localhost",
            "myhost@@@com.ru",
            "@my.ru",
            "Julia String"
        };

        Pattern pattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");

        for (String email : emails) {
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                System.out.println(email + " - правильный e-mail");
            } else {
                System.out.println(email + " - неправильный e-mail");
            }
        }
    }
}
