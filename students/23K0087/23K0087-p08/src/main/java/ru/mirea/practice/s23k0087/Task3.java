package ru.mirea.practice.s23k0087;

public abstract class Task3 {
    public static void printRange(int a, int b) {
        if (a == b) {
            System.out.print(a + " ");
            return;
        }
        System.out.print(a + " ");
        if (a < b) {
            printRange(a + 1, b);
        } else {
            printRange(a - 1, b);
        }
    }

    public static void main(String[] args) {
        printRange(14, 7);
        System.out.println();
        printRange(1, 10);
    }
}
