package ru.mirea.practice.lab14;

import java.util.Scanner;

public abstract class StringSplitter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите строку для разбивки:");
            String input = scanner.nextLine();
            System.out.println("Результат разбивки строки:");
            String[] parts = input.split("\\W+");
            for (String part : parts) {
                System.out.println(part);
            }
        }
    }
}

