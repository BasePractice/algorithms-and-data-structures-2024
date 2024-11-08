package ru.mirea.practice.s23k0350;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract class Emailcatcher {
    public static void main(String[] args) {
        String er = "^[a-zA-Z0-9._%+-]+@([a-zA-Z0-9.-]+|\\w+)$";
        Pattern p1 = Pattern.compile(er);
        Matcher m1 = p1.matcher("user@example.com");
        boolean b = m1.matches();
        System.out.println(b);
    }
}