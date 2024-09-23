package ru.mirea.practice.s23k0164.t4;

import java.util.Scanner;

public final class Four {

    private Four() {

    }

    private static int count;

    private static void findKDigitNumbers(int k, int s, boolean isFirst) {
        if (k == 0) {
            if (s == 0) {
                count++;
            }
            return;
        }
        int start = isFirst ? 1 : 0;
        for (int digit = start; digit <= 9; digit++) {
            if (s >= digit) {
                findKDigitNumbers(k - 1, s - digit, false);
            }
        }
    }

    public static void main(String[] args) {
        count = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите число K:");
            int k = scanner.nextInt();
            System.out.println("Введите число S:");
            int s = scanner.nextInt();
            findKDigitNumbers(k, s, true);
            System.out.println("Количество " + k + "-значных чисел с суммой цифр " + s + ": " + count);
        }
    }
}
