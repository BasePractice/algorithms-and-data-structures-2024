package ru.mirea.practice.s230k754.lab11.task1;

import java.util.Scanner;

public final class Task1 {
    private Task1() {}

    public static void main(final String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int countN = in.nextInt();

            int[][] maxtrix = new int[countN][countN];
            for (int i = 0; i < countN; i++) {
                for (int j = 0; j < countN; j++) {
                    maxtrix[i][j] = in.nextInt();
                }
            }

            int countRow = 0;
            for (int i = countN - 1; i >= 0; i--) {
                for (int j = i; j >= 0; j--) {
                    countRow += maxtrix[i][j];
                }
            }
            System.out.println(countRow);
        }
    }
}
