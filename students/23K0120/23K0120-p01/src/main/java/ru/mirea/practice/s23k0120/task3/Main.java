package ru.mirea.practice.s23k0120.task3;

public abstract class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;
        for (int i: arr) {
            sum += i;
        }
        System.out.printf("Sum: %d, Arithmetic mean: %.2f", sum, (float)sum / (float)arr.length);
    }
}
