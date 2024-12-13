package ru.mirea.practice.s0000001;

import java.util.Scanner;

public abstract class Task1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите строку:");
            String input = scanner.nextLine();
            System.out.println("Введите регулярное выражение для разбиения:");
            String regex = scanner.nextLine();
            String[] parts = input.split(regex);
            for (String part : parts) {
                System.out.println(part);
            }
        }
    }
}
