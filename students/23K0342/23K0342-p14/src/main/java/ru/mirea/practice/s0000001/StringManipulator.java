package ru.mirea.practice.s0000001;

import java.util.Scanner;

public final class StringManipulator {

    private StringManipulator() {
        throw new UnsupportedOperationException("Utility class should not be instantiated");
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите строку: ");
            String inputString = scanner.nextLine();

            System.out.print("Введите регулярное выражение для разбивки: ");
            String regex = scanner.nextLine();

            String[] elements = splitString(inputString, regex);

            System.out.println("Результат разбивки:");
            for (String element : elements) {
                System.out.println(element.trim());
            }
        }
    }

    public static String[] splitString(String input, String regex) {
        return input.split(regex);
    }
}
