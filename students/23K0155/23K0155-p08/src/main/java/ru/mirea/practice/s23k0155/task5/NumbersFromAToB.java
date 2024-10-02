package ru.mirea.practice.s23k0155.task5;

import java.util.Scanner;

public abstract class NumbersFromAToB {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Введите число A: ");
            int a = scanner.nextInt();
            System.out.print("Введите число B: ");
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
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}

