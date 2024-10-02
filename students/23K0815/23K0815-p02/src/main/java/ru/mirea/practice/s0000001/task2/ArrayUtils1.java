package ru.mirea.practice.s0000001.task2;

import java.util.Scanner;

public final class ArrayUtils1 {

    private ArrayUtils1() {
    }

    public static void reverseArray(String[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            String temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите количество элементов в массиве:");
            int n = scanner.nextInt();
            scanner.nextLine();

            if (n <= 0) {
                System.out.println("Количество элементов может быть только положительным числом.");
                return;
            }

            String[] array = new String[n];
            System.out.println("Введите элементы массива:");

            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextLine();
            }

            reverseArray(array);

            System.out.println("Массив в обратном порядке:");
            for (String str : array) {
                System.out.println(str);
            }
        } catch (Exception e) {
            System.out.println("Ошибка:" + e.getMessage());
        }
    }
}