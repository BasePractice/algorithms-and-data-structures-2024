package ru.mirea.practice.s23k0505.task6;

public abstract class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.printf("1/%d = %.3f\n", i, 1 / (float) i);
        }
    }
}
