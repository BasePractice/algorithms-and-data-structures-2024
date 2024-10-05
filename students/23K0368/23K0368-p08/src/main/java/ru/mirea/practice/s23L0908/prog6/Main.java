package ru.mirea.practice.s23L0908.prog6;

import java.util.Scanner;

public abstract class Main {
    public static boolean isPrime(int n, int i) {
        if (n == 1) {
            return false;
        } else if (i * i > n) {
            return true;
        } else if (n % i == 0) {
            return false;
        }
        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter number of elements: ");
            int n = scanner.nextInt();
            if (isPrime(n, 2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
