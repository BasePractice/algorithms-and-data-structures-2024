package ru.mirea.practice.s23k0169.t1;

import java.util.Scanner;

public final class Ex5 {

    private Ex5() {

    }

    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)) {
            System.out.printf("%-20s%n", "H(n)");

            for (int n = 1; n <= 10; n++) {
                double harmonicNumber = harmonic(n);
                System.out.printf("%-20.6f%n", harmonicNumber);
            }
        }
    }

    public static double harmonic(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }
}
