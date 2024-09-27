package ru.mirea.practice.s0000001;

import java.util.Scanner;

public abstract class Pract1 {
    public static void main(String[] args) {
        //3
        System.out.println("Задание 3. Введите 5 чисел:");
        int[] array = new int[5];
        int sum = 0;

        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < 5; i++) {
                array[i] = sc.nextInt();
                sum += array[i];
            }

            float middleSum = (float) sum / 5;
            System.out.println("Сумма всех элементов " + sum);
            System.out.println("Среднее арифметическое всех элементов " + middleSum);

            //4
            System.out.println("Задание 4. Введите 5 чисел:");
            int sum1 = 0;
            int j = 0;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            while (j < 5) {
                array[j] = sc.nextInt();
                sum1 += array[j];
                if (array[j] >= max) {
                    max = array[j];
                }
                if (array[j] <= min) {
                    min = array[j];
                }
                j++;
            }

            System.out.println("Сумма всех элементов " + sum1);
            System.out.println("Максимальный элемент массива " + max);
            System.out.println("Минимальный элемент массива " + min);

            //5
            System.out.println("Задание 5. Содержит ли командная строка аргументы? Выведите их.:");
            if (args.length == 0) {
                System.out.println("Нет аргументов командной строки");
            } else {
                System.out.println("Аргументы командной строки:");
                for (int i = 0; i < args.length; i++) {
                    System.out.println("Аргумент " + (i + 1) + ":" + args[i]);
                }
            }

            //6
            System.out.println("Задание 4. Выведите первые 10 чисел гармонического ряда:");
            for (int i = 1; i < 11; i++) {
                float num = (float) 1 / i;
                System.out.printf("%.2f%n", num);
            }

            //7
            System.out.println("Задание 7. Введите число: ");
            int num = sc.nextInt();
            int prod = 1;
            for (int i = 1; i <= num; i++) {
                prod *= i;
            }
            System.out.printf("factorial(%d) = %d%n", num, prod);
        }
    }
}
