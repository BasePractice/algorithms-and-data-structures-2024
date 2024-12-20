package ru.mirea.practice.s0000001.num1;

import java.util.Scanner;

public final class Main {

    private Main() {
        throw new UnsupportedOperationException("Этот класс нельзя инстанцировать.");
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[][] mat = new int[n][n];
            int roads = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    mat[i][j] = sc.nextInt();
                    if (mat[i][j] == 1 && i < j) {
                        roads++;
                    }
                }
            }
            System.out.println(roads);
        }
    }
}
