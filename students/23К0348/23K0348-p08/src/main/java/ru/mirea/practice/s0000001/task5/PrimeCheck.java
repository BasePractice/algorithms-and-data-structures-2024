package ru.mirea.practice.s0000001.task5;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        System.out.println(isPrime(n, 2) ? "YES" : "NO");
    }

    public static boolean isPrime(int n, int divisor) {
        if (n <= 1) return false;
        if (divisor * divisor > n) return true;
        if (n % divisor == 0) return false;
        return isPrime(n, divisor + 1);
    }
}