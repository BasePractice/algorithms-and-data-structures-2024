package ru.mirea.practice.lab3.random4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public abstract class UserInputArray {
    public static void main(String[] args) {
        Random rand = new Random();
        try (Scanner sc = new Scanner(System.in)) {
            int n;
            while (true) {
                System.out.print("Введите размер массива (натуральное число больше 0): ");
                if (sc.hasNextInt()) {
                    n = sc.nextInt();
                    if (n > 0) {
                        break;
                    } else {
                        System.out.println("Число должно быть больше 0.");
                    }
                } else {
                    System.out.println("Это не целое число.");
                    sc.next();
                }
            }
            int[] mas = new int[n];
            int j = 0;
            for (int i = 0; i < n; i++) {
                mas[i] = rand.nextInt(n + 1);
                if (mas[i] % 2 == 0) {
                    j++;
                }
            }
            int[] masSecond = new int[j];
            j = 0;
            for (int i = 0; i < n; i++) {
                if (mas[i] % 2 == 0) {
                    masSecond[j] = mas[i];
                    j++;
                }
            }
            System.out.println(Arrays.toString(mas));
            System.out.println();
            System.out.println(Arrays.toString(masSecond));
        }
    }
}
