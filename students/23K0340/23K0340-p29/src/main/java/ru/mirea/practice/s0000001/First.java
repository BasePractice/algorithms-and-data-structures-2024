package ru.mirea.practice.s0000001;

import java.util.Scanner;

public abstract class First {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[][] matrix = new int[n][n];
            int count = 0;
            int ent;
            System.out.println("Enter the higher triangle");
            for (int i = 0;i < n;i++) {
                for (int j = i;j < n;j++) {
                    ent = sc.nextInt();
                    matrix[i][j] = ent;
                    matrix[j][i] = ent;
                    if (ent == 1) {
                        count++;
                    }
                }
            }
            for (int l = 0;l < n; l++) {
                for (int k = 0;k < n;k++) {
                    System.out.print(matrix[l][k]);
                }
                System.out.println();
            }
            System.out.println(count);
        }
    }
}
