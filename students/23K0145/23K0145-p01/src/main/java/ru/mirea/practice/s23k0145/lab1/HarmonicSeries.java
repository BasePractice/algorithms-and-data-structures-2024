package ru.mirea.practice.s23k0145.lab1;

public abstract class HarmonicSeries {
    public static void main(String[] args) {
        // Печать первых 10 чисел гармонического ряда
        for (int i = 1; i <= 10; i++) {
            double harmonicNumber = 1.0 / i;
            System.out.printf("Гармоническое число(%d) = %.3f\n", i, harmonicNumber);
        }
    }
}
