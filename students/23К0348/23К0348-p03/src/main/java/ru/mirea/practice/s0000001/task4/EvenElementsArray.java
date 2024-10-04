package ru.mirea.practice.s0000001.task4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class EvenElementsArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        while (n <= 0) {
            System.out.print("Введите размер массива (натуральное число больше 0): ");
            n = scanner.nextInt();
        }

        int[] array = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(n + 1);
        }

        System.out.print("Сгенерированный массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        ArrayList<Integer> evenList = new ArrayList<>();
        for (int num : array) {
            if (num % 2 == 0) {
                evenList.add(num);
            }
        }

        System.out.print("\nМассив четных элементов: ");
        for (int evenNum : evenList) {
            System.out.print(evenNum + " ");
        }
    }
}
