package ru.mirea.practice.s23l0908.task2;

import java.util.Scanner;

public final class Main {
    private Main() {
    }

    public static void printRecursively(int n) {
        if (n == 1) {
            return;
        }
        printRecursively(--n);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter value n: ");
            int n = in.nextInt();
            printRecursively(n + 1);  // Start from n+1 to print down to 1
        }
    }
}
