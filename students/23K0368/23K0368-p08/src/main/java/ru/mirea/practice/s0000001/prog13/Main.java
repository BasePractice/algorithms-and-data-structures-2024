package ru.mirea.practice.s0000001.prog13;

import java.util.Scanner;

public abstract class Main {
    public static void nechet() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter a number");
            int number = scanner.nextInt();
            if (number == 0) {
                System.out.println("No number");
            } else {
                System.out.print("Your number is " + number);
                System.out.println();
                int nextNumber = scanner.nextInt();
                if (nextNumber != 0) {
                    nechet();
                }
            }
        }
    }

    public static void main(String[] args) {
        nechet();
    }
}
