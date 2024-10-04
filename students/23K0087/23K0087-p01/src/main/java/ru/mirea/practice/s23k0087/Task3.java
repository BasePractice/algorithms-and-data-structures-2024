package ru.mirea.practice.s23k0087;

import java.util.Arrays;
import java.util.Scanner;


public abstract class Task3 {
    public static void main(String[] args) {
        int n;
        int[] mas;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите количество элементов массива > ");
            n = sc.nextInt();
            mas = new int[n];

            for (int i = 0; i < mas.length; i++) {
                System.out.print("Введите " + (i + 1) + " элемент массива > ");
                mas[i] = sc.nextInt();
                System.out.print("\033[H\033[2J");
            }
        }
        System.out.println(Arrays.toString(mas));
        int sum = 0;

        for (int ma : mas) {
            sum += ma;
        }

        System.out.println("Сумма всех элементов массива: " + sum);
        float mean = (float) sum / mas.length;
        System.out.println("Среднее арифметическое всех чисел массива: " + mean);
    }
}
