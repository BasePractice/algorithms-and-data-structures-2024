package ru.mirea.practice.s0000008.task1;

public final class TriangularSequence {

    private TriangularSequence() {

    }

    public static void main(String[] args) {
        int n = 10;
        int count = 0;

        for (int i = 1; count < n; i++) {
            for (int j = 0; j < i && count < n; j++) {
                System.out.print(i + " ");
                count++;
            }
        }
    }
}