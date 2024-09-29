package ru.mirea.practice.s23k0143;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public abstract class RandimTask5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = 0;
            while (true) {
                System.out.print("Введите размер массива (натуральное число больше 0): ");
                if (scanner.hasNextInt()) {
                    n = scanner.nextInt();
                    if (n > 0) {
                        break;
                    } else {
                        System.out.println("Число должно быть больше 0. Попробуйте снова.");
                    }
                } else {
                    System.out.println("Ошибка ввода. Пожалуйста, введите целое число.");
                    scanner.next();
                }
            }
            int[] arr = new int[10];
            int cnt = 0;
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                int num = random.nextInt(n + 1);
                arr[i] = num;
                if (num % 2 == 0) {
                    cnt++;
                }
            }
            System.out.println("\nМассив, заполненный с использованием Random:");
            System.out.println(Arrays.toString(arr));
            int[] arrEven = new int[cnt];
            int j = 0;
            for (int i = 0; i < 10; i++) {
                if (arr[i] % 2 == 0) {
                    arrEven[j] = arr[i];
                    j++;
                }
            }
            System.out.println("\nМассив, четных чисел из первого массива:");
            System.out.println(Arrays.toString(arrEven));
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
