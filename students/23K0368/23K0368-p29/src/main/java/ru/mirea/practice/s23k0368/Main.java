package ru.mirea.practice.s23k0368;

import java.util.Scanner;

public abstract class Main {
    public static void solve() {
        int countOfRoad = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            int size = scanner.nextInt();

            int[][] matrix = new int[size][size];

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
            for (int i = 0; i < size; i++) {
                for (int j = i; j < size; j++) {
                    if (matrix[i][j] == 1) {
                        countOfRoad += 1;
                    }
                }
            }
        }
        System.out.println(countOfRoad);
    }

    public static void main(String[] args) {
        solve();
    }
}
