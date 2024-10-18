package ru.mirea.practice.s23l0908;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scanner.nextInt();
        long result = giaithua(n);
        System.out.print("Result: " + result);
    }

    public static long giaithua(int n) {
        if (n < 0) {
            System.out.println("Cant caculate!");
            return -1;
        } else {
            long fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            return fact;
        }
    }
}
