package ru.mirea.practice.s0000001.task4;

import java.util.Scanner;

public final class Main {

    private Main() {}

    public static long calculateFactorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Введите число для вычисления его факториала: ");
            int number = scanner.nextInt();

            long result = calculateFactorial(number);

            System.out.println("Факториал числа " + number + " равен " + result);
        }
    }
}