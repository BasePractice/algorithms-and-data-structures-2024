package ru.mirea.practice.s0000001.task3;

public final class Main {

    private Main() {}

    public static void main(String[] args) {
        int n = 10;

        System.out.println("Первые " + n + " чисел гармонического ряда:");
        for (int i = 1; i <= n; i++) {
            double harmonicNumber = 1.0 / i;
            System.out.printf("H%d = %.4f%n", i, harmonicNumber);
        }
    }
}