package ru.mirea.practice.s0000003;

import java.util.Scanner;

public abstract class Program6 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int col = 0;

            System.out.println("Введите длину последовательности");
            if (sc.hasNextInt()) {
                col = sc.nextInt();
            }

            float start = 1;
            for (int i = 1; i < col + 1; i++) {
                float x = start / i;
                System.out.printf("Число %f%n", x);
            }
        }
    }
}