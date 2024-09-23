package ru.mirea.practice.s23k0164.t8;

import java.util.Scanner;

public final class Ten {
    private Ten(){

    }
    public static int reverseNumber(int n, int n2) {
        if (n <= 0) {
            return n2;
        }
        n2 = n2*10+ n%10;
        n=n/10;
        return reverseNumber(n, n2);
    }

    public static void main(String[] args) {
        int n2 = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите число N:");
            int n = scanner.nextInt();
            n2 = reverseNumber(n, 0);
            System.out.println("Перевёернутое число " + n + " = " + n2);
        }
    }
}
