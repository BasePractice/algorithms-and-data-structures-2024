package ru.mirea.practice.s23f0011;

public abstract class Task2 {
    public static void printNumbers(int n) {
        if (n > 0) {
            printNumbers(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        int n = 25;
        printNumbers(n);
    }
}
