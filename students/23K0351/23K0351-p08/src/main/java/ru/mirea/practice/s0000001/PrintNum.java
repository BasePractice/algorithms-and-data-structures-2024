package ru.mirea.practice.s0000001;

public abstract class PrintNum {
    public static void main(String[] args) {
        int n = 10;
        printNumbers(1, n);
    }

    public static void printNumbers(int current, int n) {
        if (current > n) {
            return;
        }
        System.out.print(current + "  ");
        printNumbers(current + 1, n);
    }
}
