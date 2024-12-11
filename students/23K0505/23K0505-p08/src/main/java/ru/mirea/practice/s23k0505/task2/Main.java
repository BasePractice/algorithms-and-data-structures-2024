package ru.mirea.practice.s23k0505.task2;

public abstract class Main {
    public static void nums(int n, int curr) {
        if (curr >= n) {
            System.out.printf("%d\n", n);
            return;
        }
        System.out.printf("%d, ", curr);
        nums(n, curr + 1);
    }

    public static void main(String[] args) {
        nums(5, 1);
    }
}
