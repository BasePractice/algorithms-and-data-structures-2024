package ru.mirea.practice.s0000001.prog10;

import java.util.Scanner;

public abstract class Main {
    public static int reverseNumber(int n) {
        if (n < 10) {
            return n; // Базовый случай: однозначное число
        } else {
            int lastDigit = n % 10; // Последняя цифра
            int remainingDigits = n / 10; // Остальные цифры
            return Integer.parseInt(lastDigit + "" + reverseNumber(remainingDigits)); // Рекурсивный вызов и добавление последней цифры
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int n = scanner.nextInt();
            int reversedNumber = reverseNumber(n);
            System.out.println("Развернутое число " + n + ": " + reversedNumber);
        }
    }
}
