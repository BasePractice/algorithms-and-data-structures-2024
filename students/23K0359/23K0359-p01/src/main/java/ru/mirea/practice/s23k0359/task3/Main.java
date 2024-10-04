package ru.mirea.practice.s23k0359.task3;

public abstract class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += arr[i];
        }
        System.out.printf("Sum: %d, Arithmetic mean: %d", sum, sum / arr.length);
    }
}
