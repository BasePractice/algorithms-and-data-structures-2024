package ru.mirea.practice.s23l0908.Task2;

import java.util.Scanner;

public class Main {
    public static void recursion(int n) {
        if (n == 1) return;
        recursion(--n);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value n: ");
        int n = in.nextInt();
        recursion(n + 1);
    }
}
