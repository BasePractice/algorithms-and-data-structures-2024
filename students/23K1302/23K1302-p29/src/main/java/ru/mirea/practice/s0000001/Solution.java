package ru.mirea.practice.s0000001;

import java.io.PrintWriter;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solve();
    }

    private void solve() {
        try (Scanner scanner = new Scanner(System.in);
             PrintWriter printWriter = new PrintWriter(System.out)) {

            int n = scanner.nextInt();

            int[][] adjacencyMatrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    adjacencyMatrix[i][j] = scanner.nextInt();
                }
            }

            int roadCount = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (adjacencyMatrix[i][j] == 1) {
                        roadCount++;
                    }
                }
            }

            printWriter.println(roadCount);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
