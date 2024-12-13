package ru.mirea.practice.s23k0140.task1;

import java.util.Scanner;

public final class Main {

    private Main() {
        throw new UnsupportedOperationException("Не удается создать экземпляр служебного класса.");
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int[][] matrix = new int[n][n];
            int roadCount = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = scanner.nextInt();
                    if (matrix[i][j] == 1 && i < j) {
                        roadCount++;
                    }
                }
            }

            System.out.println(roadCount);
        }
    }
}