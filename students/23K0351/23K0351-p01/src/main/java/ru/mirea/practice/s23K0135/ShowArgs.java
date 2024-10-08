package ru.mirea.practice.s23K0135;

import java.util.Scanner;

public abstract class ShowArgs {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Введите длину массива: ");
            int len = scan.nextInt();
            int[] digits = new int[len];
            System.out.printf("\nВведите %d целых чисел: ", len);

            for (int i = 0; i < len; i++) {
                digits[i] = scan.nextInt();
            }

            int sumFirst = 0;
            int i = 0;
            while (i < len) {
                sumFirst += digits[i];
                i++;
            }
            int sumSecond = 0;
            int j = 0;
            do {
                sumSecond += digits[j];
                j++;
            } while (j < len);
            int min = digits[0];
            int max = digits[0];

            for (int k = 1; k < len; k++) {
                if (digits[k] < min) {
                    min = digits[k];
                }
                if (digits[k] > max) {
                    max = digits[k];
                }
            }
            System.out.printf("sum1 = %d, sum2 = %d, равны = %b\n", sumFirst, sumSecond, sumSecond);
            System.out.printf("min = %d, max = %d", min, max);
        }

    }
}
