package ru.mirea.practice.s23k0087;

public abstract class Task1 {
    public static void printTriangularSequence(int n, int currentNumber, int count) {
        if (n == 0) {
            return;
        }
        System.out.print(currentNumber + " ");
        n--;
        if (count == currentNumber - 1) {
            System.out.println(); // Сделано для удобства отображения
            printTriangularSequence(n, currentNumber + 1, 0);
        } else {
            printTriangularSequence(n, currentNumber, count + 1);
        }
    }

    public static void main(String[] args) {
        int n = 15;
        printTriangularSequence(n, 1, 0);
    }
}
