package ru.mirea.practice.s23f0011;

public abstract class Task3 {
    public static void printNumbers(int a, int b) {
        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = a; i >= b; i--) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        printNumbers(a, b);
    }
}
