package ru.mirea.practice.s0000001.prog15;

import java.util.Scanner;

public abstract class Main {
    public static int reverseNumber(int n) {
        if (n < 10) {
            System.out.println(n);
            return n; // Базовый случай: однозначное число
        } else {
            int lastDigit = n % 10; // Последняя цифра
            int remainingDigits = n / 10; // Остальные цифры
            System.out.println(lastDigit);
            return reverseNumber(remainingDigits);
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int n = scanner.nextInt();
            reverseNumber(n);
        }
    }
}
