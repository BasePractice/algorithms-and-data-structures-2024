package ru.mirea.practice.s0000001;

import java.util.Scanner;

public abstract class Main {

    public static void printNumbers(int n) {
        if (n < 1) {
            return;
        }
        printNumbers(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите значение n: ");
            int n = scanner.nextInt();
            printNumbers(n);
        } catch (Exception e) { // Обработка исключений
            System.out.println("Ошибка ввода: " + e.getMessage());
        }
    }
}