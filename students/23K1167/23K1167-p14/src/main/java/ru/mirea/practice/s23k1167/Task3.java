package ru.mirea.practice.s23k1167;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Дан текст со списками цен. Извлечь из него цены в USD, RUВ, EU.
 * a) пример правильных выражений: 25.98 USD.
 * b) пример неправильных выражений: 44 ERR, 0.004 EU.
 */

public abstract class Task3 {
    public static void main(String[] args) {
        System.out.println("Extracts first match only!");

        final Pattern p = Pattern.compile("(\\d+\\.\\d\\d ((USD)|(RUB)|(EU)))");

        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();

            Matcher m = p.matcher(str);
            if (m.find()) {
                System.out.println(m.group(1));
            } else {
                System.out.println("Nothing was matched.");
            }
        }
    }
}
