package ru.mirea.practice.s23k0130.task12;

import java.util.Scanner;

public abstract class Main {

    public static void printNechet() {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if (n == 0) {
                return;
            }
            if (n % 2 != 0) {
                System.out.println(n + " - число нечетное");
            }
            printNechet();
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите последовательность чисел (0 для завершения):");
        printNechet();
    }
}
