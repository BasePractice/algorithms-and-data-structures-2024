package ru.mirea.practice.s23k0505.task6;

public abstract class Main {
    public static boolean isPrime(int num, int divider) {
        if (num <= 1) {
            return false;
        } else if (divider >= Math.sqrt(num)) {
            return true;
        } else if (num % divider != 0) {
            return isPrime(num, divider + 1);
        }
        return false;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (isPrime(i, 3)) {
                System.out.printf("%d is prime\n", i);
            }
        }
    }
}
