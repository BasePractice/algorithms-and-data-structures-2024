package ru.mirea.practice.s23k0089.task1;

import java.util.Scanner;

abstract class Neptune {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число N: ");
            int n = scanner.nextInt();
            int[][] mas = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    mas[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Схема города:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(mas[i][j] + " ");
                }
                System.out.println();
            }

            int counter = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (mas[i][j] == mas[j][i] && mas[i][j] == 1) {
                        counter++;
                    }
                }
            }

            System.out.println("Количество дорог: " + counter / 2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
