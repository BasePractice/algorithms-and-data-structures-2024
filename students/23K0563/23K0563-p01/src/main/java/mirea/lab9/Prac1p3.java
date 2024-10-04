package mirea.lab1;

import java.util.Scanner;

public abstract class Prac1p3 {
    public static void main(String[] args) {
        int kol = 10;
        int[] a = new int[kol];
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите " + kol + " целых чисел:\n");
            for (int i = 0; i < a.length; i++) {

                if (sc.hasNextInt()) {
                    a[i] = sc.nextInt();
                } else {
                    System.exit(0);
                }
            }
            int sum = 0;
            for (int j : a) {
                sum = sum + j;
            }
            System.out.print("Среднее ариф. массива: " + sum / a.length + "\nСумма массива: " + sum);
        }
    }
}
