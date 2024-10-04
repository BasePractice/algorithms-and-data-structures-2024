package ru.mirea.practice.s23k0145.lab8;

import java.util.Scanner;

public abstract class ReverseDigits {
    public static void printDigitsReverse(int n) {
        if (n == 0) {
            return;
        }
        // Выводим последнюю цифру числа
        System.out.print(n % 10 + " ");
        // Рекурсивный вызов для числа без последней цифры
        printDigitsReverse(n / 10);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите натуральное число: ");
            int n = scanner.nextInt();
            printDigitsReverse(n);
        }
    }
}

