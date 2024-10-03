package ru.mirea.practice.s23k0823.task2;

public abstract class Main {
    public static void main(String[] args) {
        int n = 10;
        printNumbers(n);
    }

    public static void printNumbers(int n) {
        if (n > 0) {
            printNumbers(n - 1);
            System.out.print(n + " ");
        }
    }
}