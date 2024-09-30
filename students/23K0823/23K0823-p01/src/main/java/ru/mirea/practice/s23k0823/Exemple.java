package ru.mirea.practice.s23k0823;

import java.util.Arrays;
import java.util.Scanner;

public abstract class Exemple {
    public static void main(String[] args) {
        // Task 1
        int sum = 0;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < 10; i++) {
            sum += array[i];
        }
        int avg = sum / 10;
        System.out.println("Сумма: " + sum + " Среднее: " + avg);
        // Task 1 final
        // Task 2
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.print("Введите размерность массива: ");
            int sizeArray = scanner.nextInt();
            int[] array2 = new int[sizeArray];
            int i = 0;
            do {
                System.out.print("Введите элемент массива №: " + (i + 1) + " его значение: ");
                array2[i] = scanner.nextInt();
                i++;
            } while (i < sizeArray);
            int max = Arrays.stream(array2).max().getAsInt();
            int min = Arrays.stream(array2).min().getAsInt();
            System.out.println("MAX: " + max + " MIN: " + min);
            System.out.print("Введите размерность массива: ");
            int sizeArray2 = scanner.nextInt();
            int[] array3 = new int[sizeArray2];
            i = 0;
            while (i < sizeArray2) {
                System.out.print("Введите элемент массива №: " + (i + 1) + " его значение: ");
                array3[i] = scanner.nextInt();
                i++;
            }
            int max2 = Arrays.stream(array3).max().getAsInt();
            int min2 = Arrays.stream(array3).min().getAsInt();
            System.out.println("MAX 2: " + max2 + " MIN 2: " + min2);
            // Task 2 final
            // Task 3
            System.out.println("Аргументы:" + Arrays.toString(args));
            // Task 3 final
            // Task 4
            double[] harmonicArray = new double[10];
            for (i = 0; i < 10; i++) {
                harmonicArray[i] = (double) 1 / (i + 1);
            }
            System.out.print("Гармоничесикй массив:");
            for (i = 0; i < 10; i++) {
                String str = String.format(" %1.3f", harmonicArray[i]);
                System.out.print(str);
            }
            // Task 4
            // Task 5
            System.out.print("\nВведите число для вычисления факториала: ");
            int number = scanner.nextInt();

            long factorial = calculateFactorial(number);
            System.out.println("Факториал числа " + number + " равен " + factorial);
        }

    }

    public static long calculateFactorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
    // Task 5 final

}

