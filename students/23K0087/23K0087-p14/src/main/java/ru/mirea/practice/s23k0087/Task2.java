package ru.mirea.practice.s23k0087;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public abstract class Task2 {
    public static void main(String[] args) {
        String correctStr = "abcdefghijklmnopqrstuv18340";
        String incorrectStr = "abcdefghijklmnoasdfasdpqrstuv18340";

        Pattern pattern = Pattern.compile("^abcdefghijklmnopqrstuv18340$");
        Matcher matcher = pattern.matcher(correctStr);
        Matcher matcher2 = pattern.matcher(incorrectStr);

        System.out.println(matcher.matches());
        System.out.println(matcher2.matches());
    }
}
