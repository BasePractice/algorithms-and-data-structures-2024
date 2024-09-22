package ru.mirea.practice.s23k0164.t3;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public final class Four {
    private Four(){
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            int n;
            while (true) {
                System.out.print("Введите размер массива (натуральное число больше 0): ");
                try {
                    n = scanner.nextInt();
                    if (n > 0) {
                        break;
                    } else {
                        System.out.println("Ошибка: число должно быть больше 0. Попробуйте снова.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: введено некорректное значение. Пожалуйста, введите натуральное число.");
                    scanner.next(); // Очищаем некорректный ввод
                }
            }
            int[] arr = new int[n];
            Random rand = new Random();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rand.nextInt();
            }
            int count = 0;
            for (int num : arr) {
                if (num % 2 == 0) {
                    count++;
                }
            }
            int i = 0;
            int[] arr2 = new int[count];
            for (int num : arr) {
                if (num % 2 == 0) {
                    arr2[i] = num;
                    i++;
                }
            }
            System.out.println("Сгенерированный массив:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println("\n Массив с чётными элементами:");
            for (int num : arr2) {
                System.out.print(num + " ");
            }
        }

    }
}
