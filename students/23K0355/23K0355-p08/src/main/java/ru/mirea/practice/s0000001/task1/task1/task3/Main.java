package ru.mirea.practice.s0000001.task1.task1.task3;

import java.util.Scanner;

public final class Main {

    private Main() {}

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите число N: ");
            int n = sc.nextInt();
            System.out.println("Сумма цифр: " + sumDigits(n));
        }
    }

    public static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 10 + sumDigits(n / 10);
        }
    }
}