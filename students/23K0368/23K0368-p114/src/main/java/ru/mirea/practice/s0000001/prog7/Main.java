package ru.mirea.practice.s0000001.prog7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Main {
    public static void main(String[] args) {
        String[] passwords = {
            "F032_Password",
            "TrySpy1",
            "smart_pass",
            "A007",
            "SuperSecure1_",
        };

        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d_]{8,}$";

        Pattern pattern = Pattern.compile(regex);

        for (String password : passwords) {
            Matcher matcher = pattern.matcher(password);
            if (matcher.matches()) {
                System.out.println(password + " Этот пароль надёжный");
            } else {
                System.out.println(password + " Этот пароль вообще не надежный");
            }
        }
    }
}
