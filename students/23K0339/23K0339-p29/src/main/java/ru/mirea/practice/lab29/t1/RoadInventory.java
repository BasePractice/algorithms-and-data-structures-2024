package ru.mirea.practice.lab29.t1;

import java.util.Scanner;

public abstract class RoadInventory {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int[][] matrix = new int[n][n];
            int roadCount = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = scanner.nextInt();
                    if (j > i && matrix[i][j] == 1) {
                        roadCount++;
                    }
                }
            }
            System.out.println(roadCount);
        }
    }
}
