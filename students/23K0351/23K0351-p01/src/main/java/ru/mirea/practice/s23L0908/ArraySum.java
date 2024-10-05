package ru.mirea.practice.s23L0908;

import java.util.Scanner;

public abstract class ArraySum {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Введите длину массива: ");
            int len = scan.nextInt();
            int[] digits = new int[len];
            System.out.printf("\nВведите %d целых чисел: ", len);

            for (int i = 0; i < len; i++) {
                digits[i] = scan.nextInt();
            }

            int sum = 0;

            for (int digit : digits) {
                sum += digit;
            }

            float average = (float) sum / digits.length;
            System.out.printf("sum: %d\n", sum);
            System.out.printf("average: %.2f", average);
        }
    }
}
