package ru.mirea.practice.lab8.task1;

public abstract class TriangularSequence {
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
        int n = 10;
        TriangularSequence.printTriangularSequence(n, 1, 0);
    }
}

