package ru.mirea.practice.u23k1158.t1;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public final class Two {
    private Two() {

    }

    public static void main(String[] args) {
        String regex = "^abcdefghijklmnopqrstuv18340$";
        String[] testStrings = {
            "abcdujdfnsuhehejd18340",
            "abcdefghijklmnoasdfasdpqrstuv18340",
            "abcdefghijklmnopqrstuv183401",
            "abcdefghijklmnopqrstuv1834"
        };

        for (String test : testStrings) {
            Matcher matcher = Pattern.compile(regex).matcher(test);
            if (matcher.matches()) {
                System.out.println(test + " - совпадает");
            } else {
                System.out.println(test + " - не совпадает");
            }
        }
    }
}