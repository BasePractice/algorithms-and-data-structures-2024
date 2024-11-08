package ru.mirea.practice.s23k0505.task3;

import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Main {
    public static void main(String[] args) {
        Pattern currencyPattern = Pattern.compile("\\d+(\\.\\d{2}|) (USD|RUB|EU)");
        Random random = new Random();

        System.out.println(currencyPattern.pattern());
        String[] currs = {"USD", "RUB", "EU"};
        String[] costList = new String[20];

        for (int i = 0; i < costList.length / 2; i++) {
            costList[i] = String.format(Locale.ENGLISH, "%.2f %s", random.nextDouble() * 100, currs[random.nextInt(currs.length)]);
        }

        for (int i = costList.length / 2; i < costList.length; i++) {
            costList[i] = String.format(Locale.ENGLISH, "%d %s", random.nextInt(100), currs[random.nextInt(currs.length)]);
        }

        String costListStr = Arrays.toString(costList);

        System.out.println(costListStr);
        Matcher matcher = currencyPattern.matcher(costListStr);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
