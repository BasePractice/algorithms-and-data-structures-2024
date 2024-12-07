package ru.mirea.practice.s23k0169.t3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class PriceExtractor {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите текст для поиска цен: ");
            String inputText = scanner.nextLine();

            String regex = "\\b\\d{1,}\\.\\d{2}\\s(?:USD|RUV|EU)\\b";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(inputText);

            System.out.println("Найденные цены:");
            while (matcher.find()) {
                System.out.println(matcher.group());
            }

        }
    }
}
