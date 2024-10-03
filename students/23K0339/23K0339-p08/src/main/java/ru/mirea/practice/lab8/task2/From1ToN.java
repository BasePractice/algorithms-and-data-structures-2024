package ru.mirea.practice.lab8.task2;

public abstract class From1ToN {

    public static void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        printNumbers(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 10;
        From1ToN.printNumbers(n);
    }
}
