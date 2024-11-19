package ru.mirea.practice.s0000001;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Fifth {
    public static void main(String[] args) {
        String regex = "((0[1-9]|1[0-9]|2[0-9]|3[01])/(0[13-9]|1[0-2])/([1-9]\\d\\d\\d))|((0[1-9]|1[0-9]|2[0-8])/02/([1-9]\\d\\d\\d))";
        Pattern p1 = Pattern.compile(regex);
        String s = "29/02/2001";
        Matcher m1 = p1.matcher(s);
        System.out.println(m1.matches());
    }
}
