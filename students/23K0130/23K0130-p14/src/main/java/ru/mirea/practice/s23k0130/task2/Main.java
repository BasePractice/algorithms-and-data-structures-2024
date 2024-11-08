package ru.mirea.practice.s23k0130.task2;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public final class Main {

    private Main() {

    }

    public static void main(String[] args) {
        String correctString = "abcdefghijklmnopqrstuv18340";
        String incorrectString = "abcdefghijklmnoasdfasdpqrstuv18340";

        String regex = "^abcdefghijklmnopqrstuv18340$";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher1 = pattern.matcher(correctString);
        Matcher matcher2 = pattern.matcher(incorrectString);

        System.out.println(matcher1.matches());
        System.out.println(matcher2.matches());
    }
}
