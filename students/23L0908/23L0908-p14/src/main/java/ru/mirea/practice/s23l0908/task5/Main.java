package ru.mirea.practice.s23l0908.task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Main {

    private Main() {
    }

    public static void main(String[] args) {
        String regex = "(([0-2]\\d)|(3[01]))/[01]\\d/[1-9]\\d{3}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("29/02/2000, 30/04/2003, 01/01/2003, 30-04-2003, 1/1/1899");
        System.out.println("String: 29/02/2000, 30/04/2003, 01/01/2003, 30-04-2003, 1/1/1899");
        System.out.println("Regex: (([0-2]\\d)|(3[01]))/[01]\\d/[1-9]\\d{3}");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
