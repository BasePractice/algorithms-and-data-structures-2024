package ru.mirea.practice.s23k0116.task3;

public abstract class Main {

    public static void printNumbers(int a, int b) {
        if (a > b) {
            System.out.print(a + " ");
            printNumbers(a - 1, b);
            return;
        }
        if (a == b) {
            System.out.println(a);
            return;
        }
        if (a < b) {
            System.out.print(a + " ");
            printNumbers(a + 1, b);
            return;
        }
    }

    public static void main(String[] args) {
        printNumbers(8, 5);
        printNumbers(1, 5);


    }
}