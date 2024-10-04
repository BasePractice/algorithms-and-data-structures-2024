package ru.mirea.practice.lab8.task3;

public abstract class FromAToB {

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
        int a = 14;
        int b = 12;
        FromAToB.printRange(a, b);
    }
}

