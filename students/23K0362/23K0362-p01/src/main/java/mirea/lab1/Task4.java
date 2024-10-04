package mirea.lab9;

import java.util.Scanner;

abstract class Task4 {
    public static int[] specFunc(int[] arr) {
        int[] arrAnsw = new int[2];
        for (int j : arr) {
            if (j > arrAnsw[0]) {
                arrAnsw[0] = j;
            } else {
                if (j < arrAnsw[1]) {
                    arrAnsw[1] = j;
                }
            }
        }
        return arrAnsw;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int numVal = 10;
            int[] arrVal = new int[numVal];
            int kounter = 0;
            System.out.println("Введите массив чисел: ");
            do {
                arrVal[kounter] = sc.nextInt();
                kounter++;
            } while (kounter < numVal);
            int[] answ1 = specFunc(arrVal);
            System.out.println("Максимальный элемент: " + answ1[0]);
            System.out.println("Минимальный элемент: " + answ1[1]);
            kounter = 0;
            System.out.println("Введите массив чисел: ");
            while (kounter < numVal) {
                arrVal[kounter] = sc.nextInt();
                kounter++;
            }
            answ1 = specFunc(arrVal);
            System.out.println("Максимальный элемент: " + answ1[0]);
            System.out.println("Минимальный элемент: " + answ1[1]);
        }
    }
}