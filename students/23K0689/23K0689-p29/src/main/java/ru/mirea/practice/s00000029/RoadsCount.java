package ru.mirea.practice.s00000029;

import java.util.Scanner;

public final class RoadsCount {

    private RoadsCount() {
        throw new UnsupportedOperationException("RoadsCount is a utility class and cannot be instantiated.");
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите количество городов (N): ");
            int numberOfCities = scanner.nextInt();

            if (numberOfCities == 0) {
                System.out.println(0);
                return;
            }

            int[][] matrix = MatrixUtils.readMatrix(scanner, numberOfCities);
            int roadsCount = MatrixUtils.countRoads(matrix, numberOfCities);

            System.out.println("Количество дорог: " + roadsCount);
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}
