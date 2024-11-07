package ru.mirea.practice.s23k1158;

public final class TriangularSequence {

    private TriangularSequence() {

    }

    private static void generateSequence(int currentNumber, int totalCount) {

        if (totalCount <= 0) {
            return;
        }

        for (int count = 0; count < currentNumber && totalCount > 0; count++) {
            System.out.print(currentNumber + " ");
            totalCount--;
        }

        generateSequence(currentNumber + 1, totalCount);
    }

    public static void printTriangularSequence(int n) {
        generateSequence(1, n);
    }

    public static void main(String[] args) {
        int n = 10;
        printTriangularSequence(n);
    }

}
