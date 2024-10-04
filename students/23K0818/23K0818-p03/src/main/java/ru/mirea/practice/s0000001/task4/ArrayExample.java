package ru.mirea.practice.s0000001.task4;

import java.util.Arrays;
import java.util.Scanner;

public abstract class ArrayExample {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = 0;

            while (true) {
                System.out.print("Введите размер массива (натуральное число больше 0): ");
                if (scanner.hasNextInt()) {
                    n = scanner.nextInt();
                    if (n > 0) {
                        int[] array = new int[n];

                        for (int i = 0; i < n; ++i) {
                            array[i] = (int) (Math.random() * (n + 1));
                        }

                        System.out.println("Первый массив: " + Arrays.toString(array));
                        int[] evenArray = Arrays.stream(array).filter(x -> x % 2 == 0).toArray();
                        if (evenArray.length > 0) {
                            System.out.println("Массив из чётных элементов: " + Arrays.toString(evenArray));
                        } else {
                            System.out.println("В первом массиве нет чётных элементов.");
                        }

                        return;
                    } else {
                        System.out.println("Число должно быть больше 0.");
                    }
                } else {
                    System.out.println("Пожалуйста, введите натуральное число.");
                    scanner.next();
                }
            }
        }
    }
}
