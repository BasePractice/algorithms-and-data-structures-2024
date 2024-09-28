package ru.mirea.practice.s23k0143;

import java.util.Scanner;

public abstract class Practice1 {
    public static void main(String[] args) {
        // 3
        int[] arr = new int[5];
        int sm = 0;
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < 5; i++) {
                arr[i] = sc.nextInt();
                sm += arr[i];
            }
            System.out.printf("Сумма значений массива: %d \n", sm);
            System.out.printf("Среднее значение массива: %.3f \n", (float) sm / 5);

            //4
            int i1 = 0;
            int mn1 = 999999;
            int mx1 = -1;
            int sm1 = 0;
            do {
                arr[i1] = sc.nextInt();
                sm1 += arr[i1];
                if (arr[i1] < mn1) {
                    mn1 = arr[i1];
                }
                if (arr[i1] > mx1) {
                    mx1 = arr[i1];
                }
                i1 += 1;
            } while (i1 != 5);
            System.out.printf("Сумма значений массива: %d \n", sm1);
            System.out.printf("Среднее значение массива: %.3f \n", (float) sm1 / 5);
            System.out.printf("Минимум массива: %d \n", mn1);
            System.out.printf("Максимум массива: %d \n", mx1);

            int i2 = 0;
            int mn2 = 999999;
            int mx2 = -1;
            int sm2 = 0;
            while (i2 != 5) {
                arr[i2] = sc.nextInt();
                sm2 += arr[i2];
                if (arr[i2] < mn2) {
                    mn2 = arr[i2];
                }
                if (arr[i2] > mx2) {
                    mx2 = arr[i2];
                }
                i2 += 1;
            }
            System.out.printf("Сумма значений массива: %d \n", sm2);
            System.out.printf("Среднее значение массива: %.3f \n", (float) sm2 / 5);
            System.out.printf("Минимум массива: %d \n", mn2);
            System.out.printf("Максимум массива: %d \n", mx2);

            //5
            int elem = 0;
            for (int i = 0; i < 5; i++) {
                elem = sc.nextInt();
                System.out.println(elem);
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
        //6
        for (int i = 1; i < 11; i++) {
            System.out.printf("Number %d: %.3f\n", i, 1 / (float) i);
        }
    }

    //7
    public static int fact(int n) {
        int f = 1;
        while (n <= 1) {
            f *= n;
            n -= 1;
        }
        return f;
    }

}