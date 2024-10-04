package ru.mirea.practice.s0000001;

public abstract class PrintRange {
    public static void main(String[] args) {
        int a = 20;
        int b = 5;
        printRange(a, b);
    }

    public static void printRange(int a, int b) {
        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.print(i + "  ");
            }
        } else {
            for (int i = a; i >= b; i--) {
                System.out.print(i + "  ");
            }
        }
    }
}
