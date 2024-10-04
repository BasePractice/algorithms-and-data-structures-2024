package ru.mirea.practice.s23k0089.task6;

public abstract class Main {
    public static void main(String[] args) {
        float an = 0;
        for (int i = 1; i < 11; i++) {
            an += 1 / (float) i;
            for (int j = 1; j < i; j++) {
                System.out.printf("1/%d + ", j);
            }
            System.out.printf("1/%d = %f\n", i, an);
        }
    }
}