package ru.mirea.practice.s00000029;

import java.util.Scanner;

public final class MatrixUtils {

    private MatrixUtils() {
        throw new UnsupportedOperationException("MatrixUtils is a utility class and cannot be instantiated.");
    }

    public static int[][] readMatrix(Scanner scanner, int numberOfCities) {
        int[][] matrix = new int[numberOfCities][numberOfCities];
        System.out.println("Введите матрицу смежности (0 или 1): ");
        for (int i = 0; i < numberOfCities; i++) {
            for (int j = 0; j < numberOfCities; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static int countRoads(int[][] matrix, int numberOfCities) {
        int roadsCount = 0;
        for (int i = 0; i < numberOfCities; i++) {
            for (int j = i + 1; j < numberOfCities; j++) {
                if (matrix[i][j] == 1) {
                    roadsCount++;
                }
            }
        }
        return roadsCount;
    }
}
