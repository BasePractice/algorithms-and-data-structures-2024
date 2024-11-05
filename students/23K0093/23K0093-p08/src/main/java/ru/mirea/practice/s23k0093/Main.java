package ru.mirea.practice.s23k0093;

public abstract class Main {

    public static void main(String[] args) {
        int n = 10;
        printNumbers(1, n);
    }

    public static void printNumbers(int start, int n) {
        if (start > n) {
            return;
        }
        System.out.println(start);
        printNumbers(start + 1, n);
    }
}