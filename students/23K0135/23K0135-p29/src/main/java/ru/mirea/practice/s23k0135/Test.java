package ru.mirea.practice.s23k0135;

import java.util.Scanner;

public abstract class Test {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int[][] matrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
            int roadCount = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (matrix[i][j] == 1) {
                        roadCount++;
                    }
                }
            }
            System.out.println(roadCount);
        }
    }
}
