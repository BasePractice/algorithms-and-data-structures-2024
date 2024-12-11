package ru.mirea.practice.s23k0169.t7;

import java.util.regex.Pattern;

public final class PasswordValidator {

    private PasswordValidator() {

    }

    private static final String PASSWORD_PATTERN =
            "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)[A-Za-z\\d_]{8,}$";

    private static final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);

    public static boolean isValidPassword(String password) {
        if (password == null) {
            return false;
        }
        return pattern.matcher(password).matches();
    }

    public static void main(String[] args) {
        String[] passwords = {
            "F032_Password",
            "TrySpy1",
            "smart_pass",
            "A007",
            "Valid_Pass1",
            "InvalidPass!",
            "Short1_",
            "ALLUPPERCASE1",
            "alllowercase1",
            "NoNumber_"
        };

        for (String pwd : passwords) {
            System.out.printf("Пароль: %-15s --> %s%n",
                    pwd, isValidPassword(pwd) ? "Надежный" : "Ненадежный");
        }
    }
}

