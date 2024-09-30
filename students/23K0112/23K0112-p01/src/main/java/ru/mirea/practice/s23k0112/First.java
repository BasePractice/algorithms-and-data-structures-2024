package ru.mirea.practice.s23k0112;

import java.util.Arrays;
import java.util.Scanner;

public final class First {
    public static int factorial(int num) {
        int product = 1;
        for (int i = 1; i <= num; i++) {
            product *= i;
        }
        return product;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int length = 4;
            int sum = 0;

            int[] array = new int[length];
            for (int i = 0; i < length; i++) {
                System.out.printf("Введите %d элемент массива: ", i);
                int number = scanner.nextInt();
                sum += number;
                array[i] = number;
            }
            float average = (float) sum / array.length;

            System.out.println(Arrays.toString(array));
            System.out.printf("Cумма: %d%n", sum);
            System.out.println("Среднее: " + average);

            System.out.println("\nЗадание 4");
            int[] array2 = new int[length];
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < length; i++) {
                System.out.printf("Введите %d элемент массива: ", i);
                array2[i] = scanner.nextInt();
                if (array2[i] > max) {
                    max = array2[i];
                }
                if (array2[i] < min) {
                    min = array2[i];
                }
            }
            System.out.println(Arrays.toString(array2));
            System.out.printf("Максимальный: %d; Минимальный: %d%n", max, min);

            System.out.println("\nЗадание 5");
            if (args.length == 0) {
                System.out.println("No command-line arguments provided.");
            } else {
                System.out.println("Command-line arguments:");
                for (int j = 0; j < args.length; j++) {
                    System.out.printf("Argument %d: %s%n", j + 1, args[j]);
                }
            }

            System.out.println("\nЗадание 6");
            for (int j = 1; j <= 10; j++) {
                float k = (float) 1 / j;
                System.out.printf("%.2f%n", k);
            }

            System.out.println("\nЗадание 7");
            System.out.print("Введите число: ");
            int num = scanner.nextInt();
            System.out.printf("factorial(%d) = %d%n", num, factorial(num));
        }
    }

    private First() {
    }
}