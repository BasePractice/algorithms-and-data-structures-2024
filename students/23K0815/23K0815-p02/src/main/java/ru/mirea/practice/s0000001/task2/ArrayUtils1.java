package ru.mirea.practice.s0000001.task2;

import java.util.Scanner;

public abstract class ArrayUtils1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("ВВедите количество чисел в массиве");
            int n = scanner.nextInt();
            scanner.nextLine();

            String[] array = new String[n];
            System.out.println("ВВедите числа в массив");
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextLine();
            }

            for (int i = 0; i < n / 2; i++) {
                String temp = array[i];
                array[i] = array[n - 1 - i];
                array[n - 1 - i] = temp;
            }

            System.out.println("Перевернутый массив");
            for (String element : array) {
                System.out.println(element);
            }
        }
    }
}
