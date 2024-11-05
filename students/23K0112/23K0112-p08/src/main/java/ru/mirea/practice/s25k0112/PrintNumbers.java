package ru.mirea.practice.s25k0112;

public final class PrintNumbers {
    private PrintNumbers() {

    }

    public static void printNumbers(int n, int current) {
        if (current > n) {
            return;
        }
        System.out.print(current + " ");
        printNumbers(n, current + 1);
    }

    public static void main(String[] args) {
        int n = 10;
        printNumbers(n, 1);

    }
}
