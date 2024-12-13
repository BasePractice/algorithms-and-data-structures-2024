package ru.mirea.practice.s23k0130.task;

import java.util.Scanner;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int[][] roads = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    roads[i][j] = scanner.nextInt();
                }
            }
            int roadCount = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    roadCount += roads[i][j];
                }
            }
            System.out.println(roadCount);
        }
    }
}
