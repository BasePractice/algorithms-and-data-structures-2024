package ru.mirea.practice.s23l0908.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Main {

    private Main() {
    }

    public static void main(String[] args) {
        String regex = "(\\d+\\.?\\d*\\s)(RUB|USD|EU)";
        String s = "Цены 30.06 USD 50.30 RUB 60.12 CHF 11,23";
        Pattern p1 = Pattern. compile(regex);
        Matcher m1 = p1.matcher(s);
        while (m1.find()) {
            System.out.println("Список цен: " + m1.group());
        }
    }
}

