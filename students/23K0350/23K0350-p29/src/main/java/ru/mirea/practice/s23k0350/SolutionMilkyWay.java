package ru.mirea.practice.s23k0350;

import java.util.Scanner;

class SolutionMilkyWay {
    public void solve() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter n\n");

            int n = scanner.nextInt();
            int[][] matrix = new int[n][n];

            for (int i = 0; i < n; i++) {
                System.out.println("next row");
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
            int res = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    res += matrix[i][j];
                }
                res /= 2;
                System.out.println(res);
            }

        }
    }
}
