package ru.mirea.practice.s0000001.prog14;

import java.util.Scanner;

public abstract class Main {
    public static void reverseNumber(int n) {
        if (n < 10) {
            System.out.println(n);
        } else {
            reverseNumber(n / 10); // Остальные цифры
            System.out.println(n % 10); // Последняя цифра
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
