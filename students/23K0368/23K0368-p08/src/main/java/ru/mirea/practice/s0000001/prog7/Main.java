package ru.mirea.practice.s0000001.prog7;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.pow;

public abstract class Main {
    public static void reqursion(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        if (n % 2 == 0) {
            list.add(2);
        }
        while (n % 2 == 0) {
            n = n / 2;
        }

        int i = 3;
        while (pow(i,2) <= n) {
            if (n % i == 0) {
                list.add(i);
                n /= i;
            } else {
                i += 2;
            }
        }

        if (n > 1) {
            list.add(n);
        }

        System.out.println(list);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.printf("Введите число n ");
            int n = scanner.nextInt();
            scanner.nextLine();
            System.out.println(n);
            reqursion(n);
        }
    }
}
