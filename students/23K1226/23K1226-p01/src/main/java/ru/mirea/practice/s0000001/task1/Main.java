package ru.mirea.practice.s0000001.task1;

import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        // Задача 3: Массив с инициализацией и расчет суммы и среднего арифметического
        int[] numbers = {7, 3, 9, 4, 2};
        int total = 0;

        for (int num : numbers) {
            total += num;
        }

        double mean = total * 1.0 / numbers.length;

        System.out.println("Сумма: " + total);
        System.out.println("Среднее: " + mean);

        // Задача 4: Массив вводится с клавиатуры, расчет суммы, поиск минимума и максимума
        try (Scanner input = new Scanner(System.in)) {
            int elements = input.nextInt();
            int[] data = new int[elements];
            total = 0;
            int maximum = Integer.MIN_VALUE;
            int minimum = Integer.MAX_VALUE;
            int index = 0;

            do {
                data[index] = input.nextInt();
                total += data[index];
                if (data[index] > maximum) {
                    maximum = data[index];
                }
                if (data[index] < minimum) {
                    minimum = data[index];
                }
                index++;
            } while (index < elements);

            System.out.println("Сумма: " + total);
            System.out.println("Максимум: " + maximum);
            System.out.println("Минимум: " + minimum);

            // Задача 5: Аргументы командной строки
            for (int idx = 0; idx < args.length; idx++) {
                System.out.println("Аргумент " + idx + ": " + args[idx]);
            }

            // Задача 6: Первые 10 чисел гармонического ряда
            for (int x = 1; x <= 10; x++) {
                System.out.printf("%.6f ", 1.0 / x);
            }

            // Задача 7: Вычисление факториала
            int value = input.nextInt();
            System.out.println("Факториал: " + calculateFactorial(value));
        }
    }

    public static int calculateFactorial(int value) {
        int result = 1;
        for (int j = 2; j <= value; j++) {
            result *= j;
        }
        return result;
    }
}
