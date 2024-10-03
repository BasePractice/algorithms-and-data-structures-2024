package ru.mirea.practice.s0000001.n4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public abstract class Arr {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = 0;

            while (true) {
                System.out.print("Введите натуральное число больше 0: ");
                n = sc.nextInt();
                if (n > 0) {
                    break;
                }
                System.out.println("Некорректный ввод:( Пожалуйста, попробуйте снова");
            }

            int[] arr = new int[n];
            Random rnd = new Random();

            for (int i = 0; i < n; i++) {
                arr[i] = rnd.nextInt(n + 1); // Случайные числа от 0 до n
            }

            System.out.println("Массив: " + Arrays.toString(arr));

            int evenCount = 0;
            for (int num : arr) {
                if (num % 2 == 0) {
                    evenCount++;
                }
            }

            int[] evenArr = new int[evenCount];
            int index = 0;

            for (int num : arr) {
                if (num % 2 == 0) {
                    evenArr[index++] = num;
                }
            }

            System.out.println("Четные элементы: " + Arrays.toString(evenArr));
        }
    }
}