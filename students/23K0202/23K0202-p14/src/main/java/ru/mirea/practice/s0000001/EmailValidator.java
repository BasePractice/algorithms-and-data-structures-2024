package ru.mirea.practice.s0000001;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class EmailValidator {
    private EmailValidator() {

    }

    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

    public static void main(String[] args) {
        String[] testEmails = {
            "user@example.com",
            "root@localhost",
            "myhost@@@com.ru",
            "@my.ru",
            "Julia String"
        };

        for (String email : testEmails) {
            System.out.println("Email: " + email + " is valid? " + isValidEmail(email));
        }
    }

    public static boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}