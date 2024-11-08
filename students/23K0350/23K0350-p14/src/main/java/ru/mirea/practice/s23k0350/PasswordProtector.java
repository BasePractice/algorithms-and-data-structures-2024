package ru.mirea.practice.s23k0350;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract class PasswordProtector {
    public static void main(String[] args) {
        String patt = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d_]{8,}$";
        Pattern p1 = Pattern.compile(patt);
        String pwd = "password";
        Matcher m1 = p1.matcher(pwd);
        boolean b = m1.matches();
        if (b) {
            System.out.println("Пароль надежен.");
        } else {
            System.out.println("Пароль ненадежен.");
        }
    }
}
