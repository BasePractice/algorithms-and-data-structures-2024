package ru.mirea.practice.s0000001.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class StrChecker {
    public static void main(String[] args) {
        String str1 = "abcdefghijklmnopqrstuv18340";
        String str2 = "abcdefghijklmnopqrstuv183400";
        String regex = "^abcdefghijklmnopqrstuv18340$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher1 = pattern.matcher(str1);
        Matcher matcher2 = pattern.matcher(str2);
        if (matcher1.matches()) {
            System.out.println("str = regex");
        } else {
            System.out.println("str != regex");
        }
        if (matcher2.matches()) {
            System.out.println("str = regex");
        } else {
            System.out.println("str != regex");
        }
    }
}
