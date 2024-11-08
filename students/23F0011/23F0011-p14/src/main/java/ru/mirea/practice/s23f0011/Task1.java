package ru.mirea.practice.s23f0011;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Task1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Введите строку: ");
            String inputString = scanner.nextLine();

            System.out.print("Введите регулярное выражение для разделения: ");
            String regex = scanner.nextLine();

            // Создание объекта Pattern
            Pattern pattern = Pattern.compile(regex);

            // Создание объекта Matcher
            Matcher matcher = pattern.matcher(inputString);

            System.out.println("Разделенные элементы:");
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
    }
}
