package ru.mirea.practice.s23k0755;

import java.util.regex.Pattern;

public abstract class EmailChecker {
    private static final String EMAIL_REGEX =
        "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    public static boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }
        return EMAIL_PATTERN.matcher(email).matches();
    }

    public static void main(String[] args) {
        String[] testEmails = {
            "test@mail.ru",
            "name.test@gmail.com",
            "invalid-email@"
        };

        for (String email : testEmails) {
            System.out.printf("Email: %s подходит ли: %b%n", email, isValidEmail(email));
        }
    }
}
