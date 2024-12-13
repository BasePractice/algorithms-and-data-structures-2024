package ru.mirea.practice.s23f0011;

import java.util.Scanner;

public abstract class Tester {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            // Вводим количество городов
            int n = scanner.nextInt();
            int[][] matrix = new int[n][n];

            // Вводим матрицу смежности
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            int roadCount = 0;

            // Подсчитываем количество дорог (единичек в верхней треугольной части)
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (matrix[i][j] == 1) {
                        roadCount++;
                    }
                }
            }

            // Выводим количество дорог
            System.out.println(roadCount);
        }
    }
}
