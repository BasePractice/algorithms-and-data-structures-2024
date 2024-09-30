package ru.mirea.practice.s0000001;

import java.util.Scanner;

public abstract class Pr6 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int len = 0;

            System.out.println("Введите длину данной последовательности");
            if (scan.hasNextInt()) {
                len = scan.nextInt();
            }

            float st = 1;
            for (int idx = 1; idx < len + 1; idx++) {
                float res = st / idx;
                System.out.printf("Число %f%n", res);
            }
        }
    }
}