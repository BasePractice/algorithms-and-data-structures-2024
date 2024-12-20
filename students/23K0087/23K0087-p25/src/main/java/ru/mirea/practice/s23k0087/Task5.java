package ru.mirea.practice.s23k0087;

import java.util.regex.Pattern;

public abstract class Task5 {

    private static final String password_pattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)[A-Za-z\\d_]{8,}$";

    private static final Pattern pattern = Pattern.compile(password_pattern);

    public static boolean checkPassword(String password) {
        return pattern.matcher(password).matches();
    }

    public static void main(String[] args) {
        String[] passwords = {
            "F032_Password",
            "TrySpy11",
            "smart_pass",
            "A007",
            "Valid_Pass1",
            "InvalidPass!",
            "Short1_",
            "STOOPIDPASS1",
            "stoopidpass2",
            "Nonuminthis_"
        };

        for (String password : passwords) {
            System.out.println("Пароль " + password + " - " + (checkPassword(password) ? "надежный." : "ненадежный!"));
        }
    }
}
