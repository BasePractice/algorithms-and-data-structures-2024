package ru.mirea.practice.s23k0116.task;

import java.util.Scanner;

public abstract class RoadsCounter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            if (n == 0) {
                System.out.println(0);
                return;
            }

            // Считываем количество городов
            int[][] matrix = new int[n][n];

            // Считываем матрицу смежности
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            // Подсчет количества дорог
            int roads = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) { // Считаем только верхнюю часть матрицы
                    if (matrix[i][j] == 1) {
                        roads++;
                    }
                }
            }

            // Вывод результата
            System.out.println(roads);
        }
    }
}
