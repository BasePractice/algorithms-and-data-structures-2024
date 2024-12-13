package ru.mirea.practice.s0000001.task3;

import java.util.regex.Pattern;

public abstract class PriceList {
    public static void main(String[] args) {
        String regex = "(\\d*(\\.{1}\\d{0,2}){0,1})\\s(USD|RUВ|EU)";
        String[] prices = {
            "25.98 USD",
            "44 ERR",
            "44345 EU",
            "22.22.22 RUB",
            "34.12 RUВ",
            "25.98 USD",
            "26.98 EU",
            "25.000 USD",
            "25.00 USD"
        };
        for (String x : prices) {
            if (Pattern.matches(regex, x)) {
                System.out.println(x + "\n");
            }
        }
    }
}
