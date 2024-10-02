package ru.mirea.practice.s0000001;

import java.util.Scanner;

public abstract class Pract8 {

    //2
    public static void printNum(int n) {
        if (n > 0) {
            printNum(n - 1);
            System.out.println(n);
        }
    }

    //7
    public static void primeFactors(int n, int divisor) {
        if (n <= 1) {
            return;
        }
        if (n % divisor == 0) {
            System.out.println(divisor);
            primeFactors(n / divisor, divisor);
        } else {
            primeFactors(n, divisor + 1);
        }
    }

    //12
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

    //17
    public static int findMax() {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if (n == 0) {
                return 0;
            }
            int maxi = findMax();
            return Math.max(n, maxi);
        }
    }





    public static void main(String[] args) {

        //2
        int n = 10;
        System.out.printf("Задание 2: Выведите все числа от 1 до " + n + "\n\n");
        printNum(n);

        //7
        int m = 152;
        System.out.println("\nЗадание 7: Выведите все простые множители числа " + m + "\n");
        primeFactors(m,2);

        //12
        System.out.println("Введите последовательность чисел (0 для завершения):");
        printNechet();

        //17
        System.out.println("Введите последовательность чисел (0 для завершения):");
        System.out.println("Максимум: " + findMax());

    }
}
