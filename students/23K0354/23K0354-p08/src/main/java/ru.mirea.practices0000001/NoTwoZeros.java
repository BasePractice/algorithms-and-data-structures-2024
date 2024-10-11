package ru.mirea.practices0000001;

import java.util.Scanner;

public abstract class NoTwoZeros {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите количество нулей (a): ");
            int a = scanner.nextInt();
            System.out.print("Введите количество единиц (b): ");
            int b = scanner.nextInt();

            int result = countSequences(a, b);
            System.out.println("Количество последовательностей: " + result);
        }
    }

    public static int countSequences(int a, int b) {
        if (a == 0) {
            return 1;
        }
        if (a > b + 1) {
            return 0;
        }
        if (a == 1) {
            return b + 1;
        }
        return countSequences(a, b - 1) + countSequences(a - 1, b - 1);
    }
}
