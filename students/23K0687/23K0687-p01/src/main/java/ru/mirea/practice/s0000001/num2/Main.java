package ru.mirea.practice.s0000001.num2;

import java.util.Scanner;

public final class Main {

    private Main() {}

    public static long piz(int n) {
        long res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите число: ");
            int num = sc.nextInt();
            System.out.println("Факториал числа " + num + " равен " + piz(num));
        }
    }
}
