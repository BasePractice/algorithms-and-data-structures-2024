package ru.mirea.practice.s23l0908;

import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            if (n == 0) {
                System.out.println(0);
                return;
            }
            int[][] adjacencyMatrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    adjacencyMatrix[i][j] = scanner.nextInt();
                }
            }
            int roadCount = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    roadCount += adjacencyMatrix[i][j];
                }
            }
            System.out.println(roadCount);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
