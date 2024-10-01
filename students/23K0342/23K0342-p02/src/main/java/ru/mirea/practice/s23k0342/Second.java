package ru.mirea.practice.s23k0342;

import java.util.Scanner;

public abstract class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        String[] array = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Введите элемент " + (i + 1) + ": ");
            array[i] = scanner.nextLine();
        }

        for (int i = 0; i < size / 2; i++) {
            String temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }

        System.out.println("Массив в обратном порядке:");
        for (String element : array) {
            System.out.println(element);
        }

        scanner.close();
    }
}
