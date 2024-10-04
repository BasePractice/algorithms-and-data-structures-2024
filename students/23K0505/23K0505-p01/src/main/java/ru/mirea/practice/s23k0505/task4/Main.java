package ru.mirea.practice.s23k0505.task4;

import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        int[] ar = new int[5];
        int min = 10;
        int max = -10;

        int i = 0;

        try (Scanner sc = new Scanner(System.in)) {
            do {
                if (sc.hasNextInt()) {
                    ar[i] = sc.nextInt();
                    i++;
                } else {
                    System.out.println("Нужно ввести целое число");
                }
            } while (i < 5);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
        i = 0;
        while (i < 5) {
            System.out.print(ar[i] + " ");
            if (ar[i] < min) {
                min = ar[i];
            }
            if (ar[i] > max) {
                max = ar[i];
            }
            i++;
        }
        System.out.printf("\nМаксимальный элемент = %d", max);
        System.out.printf("\nМинимальный элемент = %d", min);
    }
}