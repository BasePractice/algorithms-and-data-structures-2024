package ru.mirea.practice.s23k0505.task3;

public abstract class Main {
    public static void printAtoB(int a, int b, int curr) {
        if (a > b && curr == b || a < b && curr == b) {
            System.out.printf("%d\n", curr);
            return;
        } else if (a > b) {
            System.out.printf("%d, ", curr);
            printAtoB(a, b, curr - 1);
        } else {
            System.out.printf("%d, ", curr);
            printAtoB(a, b, curr + 1);
        }
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 50;
        printAtoB(a, b, a);
    }
}
