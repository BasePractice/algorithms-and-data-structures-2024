package ru.mirea.practice.s0000001.prog9;

public abstract class Main {
    public static int recursion(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return recursion(a, b - 1) + recursion(a - 1, b - 1);
    }

    public static void main(String[] args) {
        System.out.println(recursion(1, 1));
    }
}
