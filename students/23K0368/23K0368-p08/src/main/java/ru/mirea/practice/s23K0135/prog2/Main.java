package ru.mirea.practice.s23K0135.prog2;

import java.util.Scanner;
import java.util.stream.IntStream;

public abstract class Main {
    //Реализация рекурсивным методом
    public static void printNumbers(int n) {
        if (n > 0) {
            printNumbers(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите натуральное число n: ");
            int n = scanner.nextInt();

            printNumbers(n);
            System.out.println();

            //Реализация с помощью потокового вводва, менее эффективно на малых значениях, но интересно в исполнении
            IntStream.iterate(1, i -> i + 1).limit(n).forEach(i -> System.out.print(i + " "));
        }
    }
}
