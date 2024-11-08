package ru.mirea.practice.s0000008.task3;

import java.util.Scanner;

public final class FromAToB {

    private FromAToB() {

    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (a < b) {
                for (int i = a; i <= b; i++) {
                    System.out.print(i + " ");
                }
            } else {
                for (int i = a; i >= b; i--) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}