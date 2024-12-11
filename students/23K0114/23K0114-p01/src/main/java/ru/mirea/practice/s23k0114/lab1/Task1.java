package ru.mirea.practice.s23k0114.lab1;

import java.util.Scanner;

public abstract class Task1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Размерность массива -> ");
            int n = in.nextInt();
            int[] massiv = new int[n];
            int s = 0;
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                s = s + num;
                massiv[i] = num;
            }
            System.out.println("Сумма -> " + s);
            System.out.println("Среднее значение" + s / n);
        }
    }
}