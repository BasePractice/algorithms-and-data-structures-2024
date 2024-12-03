package ru.mirea.practice.s23k0215.task1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class StringManipulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите строку для обработки: ");
            String inputString = scanner.nextLine();

            System.out.print("Введите регулярное выражение для разбивки строки: ");
            String regex = scanner.nextLine();

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(inputString);

            System.out.println("Результаты разбиения:");
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


