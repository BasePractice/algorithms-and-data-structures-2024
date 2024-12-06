package ru.mirea.practice.s23l0908;

public final class Task6 {

    private Task6() {
        // Private constructor to prevent instantiation
    }

    public static void main(String[] args) {
        int n = 10;
        double sum = 0.0;
        System.out.println("10 number:");
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
            System.out.printf("H%d = %.4f%n", i, sum);
        }
        System.out.println("Result: " + sum);
    }
}

