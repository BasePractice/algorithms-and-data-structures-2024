package ru.mirea.practice.s0000001;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Third {
    public static void main(String[] args) {
        String regex = "(\\d+)\\.(\\d\\d)\\s(USD|RUB|EU)";
        String s = "23.10 EU 1000.00 RUB 00.0000000 USD 50.00 AD";
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(s);
        while (m1.find()) {
            System.out.println(m1.group());
        }
    }
}
