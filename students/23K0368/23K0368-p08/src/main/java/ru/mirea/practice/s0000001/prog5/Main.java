package ru.mirea.practice.s0000001.prog5;

import java.util.Scanner;

public abstract class Main {
    public static int recursion(int n) {
        if (n == 0) {
            return 0;
        }
        int sum = n % 10;
        int ost = n / 10;
        return sum + recursion(ost);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter number of elements: ");
            int n = scanner.nextInt();
            System.out.print(recursion(n));
        }
    }
}
