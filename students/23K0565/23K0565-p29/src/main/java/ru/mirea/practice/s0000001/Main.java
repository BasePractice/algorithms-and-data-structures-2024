package ru.mirea.practice.s0000001;

import java.util.Scanner;
import java.io.PrintWriter;

public abstract class Main {
    private static final int INF = 1000000000;

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
            int n = in.nextInt();
            int[][] g = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    g[i][j] = in.nextInt();
                    if (g[i][j] == 0 && i != j) {
                        g[i][j] = INF;
                    }
                }
            }

            for (int k = 0; k < n; k++) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        g[i][j] = Math.min(g[i][j], g[i][k] + g[k][j]);
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    out.print((g[i][j] == INF ? 0 : g[i][j]) + " ");
                }
                out.println();
            }
        }
    }
}
//Upd
