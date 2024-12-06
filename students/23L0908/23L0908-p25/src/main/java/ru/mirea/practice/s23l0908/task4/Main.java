package ru.mirea.practice.s23l0908.task4;

import java.util.regex.Pattern;

public final class Main {

    private Main() {
    }

    public static void main(String[] args) {
        String[] emails = {
            "user@example.com", "root@localhost", "myhost@@@com.ru",
            "@my.ru", "Julia String", "test.email+alex@leetcode.com", "user.name@sub.domain.com"
        };

        String regex = "^(?!\\.)([a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]"
            + "+(?:\\.[a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]+)*)@([a-zA-Z0-9](?:[a-zA-Z0-9-]*[a-zA-Z0-9])?\\.)"
            + "+[a-zA-Z]{2,}$";

        for (String email : emails) {
            if (Pattern.matches(regex, email)) {
                System.out.println(email + " -> корректный email.");
            } else {
                System.out.println(email + " -> некорректный email.");
            }
        }
    }
}
