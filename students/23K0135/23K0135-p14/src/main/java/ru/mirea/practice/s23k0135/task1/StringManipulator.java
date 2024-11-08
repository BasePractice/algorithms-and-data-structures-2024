package ru.mirea.practice.s23k0135.task1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class StringManipulator { // Added 'final'

    private StringManipulator() {} // Private constructor

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { // Using try-with-resources
            System.out.print("Введите строку: ");
            String inputString = scanner.nextLine();

            while (true) {
                System.out.println("\nВыберите действие:");
                System.out.println("1. Разбить строку по пробелам");
                System.out.println("2. Разбить строку по запятым");
                System.out.println("3. Разбить строку по цифрам");
                System.out.println("4. Выйти");

                System.out.print("Введите номер действия: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline character

                switch (choice) {
                    case 1:
                        splitBySpaces(inputString);
                        break;
                    case 2:
                        splitByCommas(inputString);
                        break;
                    case 3:
                        splitByDigits(inputString);
                        break;
                    case 4:
                        System.out.println("Выход из программы.");
                        return;
                    default:
                        System.out.println("Неверный выбор. Попробуйте снова.");
                        break;
                }
            }
        }
    }

    private static void splitBySpaces(String inputString) {
        String[] elements = inputString.split("\\s+");
        System.out.println("Элементы строки, разделенные пробелами:");
        for (String element : elements) {
            System.out.println(element);
        }
    }

    private static void splitByCommas(String inputString) {
        String[] elements = inputString.split(",");
        System.out.println("Элементы строки, разделенные запятыми:");
        for (String element : elements) {
            System.out.println(element);
        }
    }

    private static void splitByDigits(String inputString) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(inputString);

        System.out.println("Элементы строки, разделенные цифрами:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
