package ru.mirea.practice.s23k0215.task1;

import java.util.Scanner;

public abstract class RoadCount {
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
                    if (adjacencyMatrix[i][j] == 1) {
                        roadCount++;
                    }
                }
            }

            System.out.println(roadCount);
        }
    }
}
// Если захотите посмотреть можете мне в
// коментрии к пул-реквесту написать дам вам ссылку на диск
// где лежит
// решение лабораторной по теории графов на Си на 1000+ строк :)
