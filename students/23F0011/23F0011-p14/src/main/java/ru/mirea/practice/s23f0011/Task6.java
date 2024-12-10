package ru.mirea.practice.s23f0011;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Task6 {

    public static void main(String[] args) {
        String[] emails = {
            "user@example.com",
            "root@localhost",
            "myhost@@@com.ru",
            "@my.ru",
            "Julia String"
        };

        Pattern pattern = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");

        for (String email : emails) {
            Matcher matcher = pattern.matcher(email);
            System.out.println(email + " - " + matcher.matches());
        }
    }
}


