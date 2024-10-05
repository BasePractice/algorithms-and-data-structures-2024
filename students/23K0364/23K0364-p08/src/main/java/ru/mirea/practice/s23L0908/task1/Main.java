package ru.mirea.practice.s23L0908.task1;

import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число n: ");
            int n = scanner.nextInt();

            printNumbers(1, n);
        } catch (Exception e) {
            System.out.println("Ошибка ввода: " + e.getMessage());
        }
    }

    public static void printNumbers(int current, int n) {
        if (current > n) {
            return;
        }
        System.out.print(current + " ");
        printNumbers(current + 1, n);
    }
}


