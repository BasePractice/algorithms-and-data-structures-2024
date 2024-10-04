package ru.mirea.practices0000001;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Factorization {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите натуральное число n (n > 1): ");
            int n = scanner.nextInt();

            List<Integer> factors = factorize(n);
            System.out.println("Простые множители числа " + n + ": " + factors);
        }
    }

    public static List<Integer> factorize(int n) {
        List<Integer> factors = new ArrayList<>();
        int divisor = 2;

        while (n > 1) {
            while (n % divisor == 0) {
                factors.add(divisor);
                n /= divisor;
            }
            divisor++;
        }

        return factors;
    }

}

