package ru.mirea.practice.s23k0087;

import java.util.Scanner;

public abstract class Task4 {
    public static void main(String[] args) {
        int n;
        int[] mas;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите количество элементов массива > ");
            n = sc.nextInt();
            mas = new int[n];
            if (n <= 0) {
                System.out.println("Количество элементов массива не должно быть меньше 1");
                sc.close();
                return;
            }
            for (int i = 0; i < mas.length; i++) {
                System.out.print("Введите " + (i + 1) + " элемент массива > ");
                mas[i] = sc.nextInt();
                System.out.print("\033[H\033[2J");
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
        int j = 0;
        int sum = 0;
        do {
            sum += mas[j];
            j++;
        } while (j < mas.length);
        System.out.println(sum);
        sum = 0;
        j = 0;
        while (j < mas.length) {
            sum += mas[j];
            j++;
        }
        System.out.println(sum);
        int min = mas[0];
        for (int ma : mas) {
            if (min > ma) {
                min = ma;
            }
        }
        System.out.println("Минимальный элемент массива: " + min);
        int max = mas[0];
        for (int ma : mas) {
            if (max < ma) {
                max = ma;
            }
        }
        System.out.println("Максимальный элемент массива: " + max);
    }
}
