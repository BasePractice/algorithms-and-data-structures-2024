package ru.mirea.practice.s23k0505.task2;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) throws FileNotFoundException {
        int[][] graph;
        int n;
        try (Scanner scanner = new Scanner(new File("students/23K0120/23K0120-p29/src/main/java/ru/mirea/practice/s23k0120/task2/graph.txt"))) {
            n = scanner.nextInt();
            graph = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    graph[i][j] = scanner.nextInt();
                    if (graph[i][j] == 0 && i != j) {
                        graph[i][j] = Integer.MAX_VALUE / 2;
                    }
                }
            }
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]);
                }
            }
        }

        try (PrintWriter writer = new PrintWriter(new File("students/23K0120/23K0120-p29/src/"
            + "main/java/ru/mirea/practice/s23k0120/task2/graphShortest.txt"))) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (graph[i][j] == Integer.MAX_VALUE / 2) {
                        writer.print(0 + " ");
                    } else {
                        writer.print(graph[i][j] + " ");
                    }
                }
                writer.println();
            }
        }
    }
}
