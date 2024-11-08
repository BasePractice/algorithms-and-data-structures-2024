package ru.mirea.practice.lab14;

import java.util.regex.Pattern;

public abstract class PasswordValidator {
    public static boolean isStrongPassword(String password) {
        String passwordRegex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)[A-Za-z\\d_]{8,}$";
        return Pattern.matches(passwordRegex, password);
    }

    public static void main(String[] args) {
        System.out.println(isStrongPassword("F032_Password"));
        System.out.println(isStrongPassword("TrySpy1"));       // НЕВЕРНО ВВИДУ МЕНЕЕ 8 СИМВОЛОВ (В отличие от написанного в практикуме)
        System.out.println(isStrongPassword("smart_pass"));
        System.out.println(isStrongPassword("A007"));
    }
}




