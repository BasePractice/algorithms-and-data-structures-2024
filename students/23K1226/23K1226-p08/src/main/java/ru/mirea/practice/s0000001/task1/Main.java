package ru.mirea.practice.s0000001.task1;

import java.util.Scanner;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите n для треугольной последовательности: ");
            int n = scanner.nextInt();
            printTriangularSequence(n);

            System.out.print("Введите натуральное число n: ");
            n = scanner.nextInt();
            printNaturalNumbers(n);

            System.out.print("Введите a: ");
            int a = scanner.nextInt();
            System.out.print("Введите b: ");
            int b = scanner.nextInt();
            printRange(a, b);

            System.out.print("Введите k: ");
            int k = scanner.nextInt();
            System.out.print("Введите s: ");
            int s = scanner.nextInt();
            int count = countKDigitNumbersWithSum(k, s);
            System.out.println("Количество k-значных чисел с суммой цифр " + s + ": " + count);

            System.out.print("Введите натуральное число n: ");
            int nForSum = scanner.nextInt();
            int sumDigits = sumOfDigits(nForSum);
            System.out.println("Сумма цифр: " + sumDigits);
        }
    }

    private static void printTriangularSequence(int n) {
        for (int i = 1, count = 0; count < n; i++) {
            for (int j = 0; j < i && count < n; j++) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
    }

    private static void printNaturalNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void printRange(int a, int b) {
        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = a; i >= b; i--) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static int countKDigitNumbersWithSum(int k, int s) {
        int count = 0;
        for (int i = (int) Math.pow(10, k - 1); i < Math.pow(10, k); i++) {
            int sum = 0;
            int temp = i;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if (sum == s) {
                count++;
            }
        }
        return count;
    }

    private static int sumOfDigits(int n) {
        int sumDigits = 0;
        while (n > 0) {
            sumDigits += n % 10;
            n /= 10;
        }
        return sumDigits;
    }
}
