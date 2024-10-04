package ru.mirea.practice.s23k0565.n4;

import java.util.Scanner;

public final class Sum {

    private Sum() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int k = sc.nextInt();
            int s = sc.nextInt();
            int count = 0;

            for (int i = (int) Math.pow(10, k - 1); i < Math.pow(10, k); i++) {
                if (sumDigits(i) == s) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }

    private static int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}