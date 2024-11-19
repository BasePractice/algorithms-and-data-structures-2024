package ru.mirea.practice.s23k0093;

import java.util.Scanner;

public abstract class StringManipulator {

    private static String input;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите строку для разбивки (на англ.):");

            // Разбиваем строку по пробелам и пунктуации
            String regex = "\\W+";  // Регулярное выражение для разделителей (не-символы)

            // Разбиваем строку
            String[] elements = input.split(regex);

            System.out.println("Элементы строки:");
            for (String element : elements) {
                if (!element.isEmpty()) {
                    System.out.println(element);
                }
            }

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
