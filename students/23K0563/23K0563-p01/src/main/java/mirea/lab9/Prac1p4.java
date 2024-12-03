package mirea.lab1;

import java.util.Scanner;

public abstract class Prac1p4 {
    public static void main(String[] args) {
        int kol = 10;
        int[] a = new int[10];
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите " + kol + " целых чисел:\n");
            int i = 0;
            while (i < kol) {
                int num = sc.nextInt();
                a[i] = num;
                i++;
            }
            int sum = 0;
            i = 0;
            do {
                sum += a[i];
                i++;
            } while (i < a.length - 1);
            int min = a[0];
            int max = a[0];
            i = 1;
            while (i < a.length) {
                if (a[i] < min) {
                    min = a[i];
                }
                if (a[i] > max) {
                    max = a[i];
                }
                i++;
            }
            System.out.println("Сумма: " + sum);
            System.out.println("Минимальное: " + min);
            System.out.println("Максимальное: " + max);
        }
    }
}
