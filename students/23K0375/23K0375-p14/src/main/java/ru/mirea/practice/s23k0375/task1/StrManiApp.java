package ru.mirea.practice.s23k0375.task1;

import java.util.Scanner;

public abstract class StrManiApp {

    public static void main(String[] args) {
        // Используем try-with-resources для автоматического закрытия Scanner
        try (Scanner scanner = new Scanner(System.in)) {
            // Ввод строки от пользователя
            System.out.println("Введите строку:");
            String inputString = scanner.nextLine();

            // Ввод регулярного выражения от пользователя
            System.out.println("Введите регулярное выражение для разбиения строки:");
            String regex = scanner.nextLine();

            // Разбиение строки на элементы
            String[] elements = inputString.split(regex);

            // Вывод результатов
            System.out.println("Результат разбиения строки:");
            for (String element : elements) {
                System.out.println(element);
            }
        }
    }
}
