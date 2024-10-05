package ru.mirea.practice.s23L0908;

import java.util.Scanner;

public abstract class OptSeven {
    public static long factorial(int n) {
        long res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;

        }
        return  res;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Введите число для вычисления его факториала: ");
            int num = scan.nextInt();
            if (num < 0) {
                System.out.print("Факториал для отрицательного числа неопределён");

            } else {
                long res = factorial(num);
                System.out.printf("Факториал %d равен: %d", num, res);
            }
        }
    }
}
