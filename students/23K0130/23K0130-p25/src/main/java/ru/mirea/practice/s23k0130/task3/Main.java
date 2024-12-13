package ru.mirea.practice.s23k0130.task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите текст для поиска цен: ");
            String text = scanner.nextLine();
            String regex = "\\b\\d{1,3}(\\.\\d{1,2})? (USD|RUB|EU)\\b";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);
            System.out.println("Цены в USD, RUB, EU:");
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
