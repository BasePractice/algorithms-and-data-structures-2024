package ru.mirea.practice.s0000001.task7;

import java.util.regex.Pattern;

public abstract class PasswordCheck {
    public static void main(String[] args) {
        String[] paswords = {
            "A007",
            "F032_Password",
            "TrySpy11",
            "aA9aaaaaaaaa",
            "Bb9BBBBBBB",
            "9CcCCCCCcccc",
            "9dDdddddDDD"
        };
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d).+$";
        for (String x : paswords) {
            if (Pattern.matches(regex, x) && x.length() >= 8) {
                System.out.println(x);
            }
        }
    }
}

