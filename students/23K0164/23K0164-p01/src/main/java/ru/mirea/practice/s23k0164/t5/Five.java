package ru.mirea.practice.s23k0164.t5;

import java.util.Scanner;

public final class Five {
    private Five(){

    }

    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 10 + sumOfDigits(n / 10);
        }
    }

    public static void main(String[] args) {
        int count = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите число N:");
            int n = scanner.nextInt();
            count = sumOfDigits(n);
            System.out.println("Сумма цифр в числе " + n + " = " + count);
        }
    }

}
