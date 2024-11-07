package ru.mirea.practice.s23k1158.t1;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public final class T1 {
    private T1() {

    }

    public static void main(String[] args) {
        String regex = "^abcdefghijklmnopqrstuv2340$";
        String[] testStrings = {
            "abcdefghijklmnopqrstuv06780",
            "abcdefghijklmnoasdfasdpqrstuv16790",
            "abcdefghijklmnopqrstuv674581",
            "abcdefghijklmnopqrstuv6754"
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