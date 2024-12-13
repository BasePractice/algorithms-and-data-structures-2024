package ru.mirea.practice.task1.task1;

import java.util.Scanner;

public final class Main {
    private Main() {
        throw new UnsupportedOperationException("Этот класс не должен быть создан");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();

            if (n == 0) {
                System.out.println(0);
                return;
            }

            int[][] m = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    m[i][j] = sc.nextInt();
                }
            }

            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (m[i][j] == 1) {
                        count++;
                    }
                }
            }

            System.out.println(count);
        } finally {
            sc.close();
        }
    }
}
