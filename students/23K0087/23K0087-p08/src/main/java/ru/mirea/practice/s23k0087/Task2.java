package ru.mirea.practice.s23k0087;

public abstract class Task2 {
    public static void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        printNumbers(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 20;
        printNumbers(n);
    }
}
