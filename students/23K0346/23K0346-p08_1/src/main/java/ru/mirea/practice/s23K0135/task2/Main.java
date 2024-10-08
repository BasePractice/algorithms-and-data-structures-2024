package ru.mirea.practice.s23K0135.task2;

import java.util.Scanner;

public abstract class Main {

    public static int reverseNumber(int n) {
        if (n < 10) {
            return n;
        }

        int digits = (int) Math.log10(n);

        int lastDigit = n % 10;

        return lastDigit * (int) Math.pow(10, digits) + reverseNumber(n / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите число n (без нулей): ");
            int n = scanner.nextInt();

            int reversed = reverseNumber(n);
            System.out.println("Разворот числа: " + reversed);
        } finally {
            scanner.close();
        }
    }
}

