package ru.mirea.practice.s0000001;

import java.util.Scanner;

public abstract class Seconda {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();
            scanner.nextLine(); // Чистим буфер после nextInt()

            String[] array = new String[size];

            for (int i = 0; i < size; i++) {
                System.out.print("Введите элемент " + (i + 1) + ": ");
                array[i] = scanner.nextLine();
            }

            // Разворачиваем массив
            for (int i = 0; i < size / 2; i++) {
                String temp = array[i];
                array[i] = array[size - 1 - i];
                array[size - 1 - i] = temp;
            }

            // Выводим массив в обратном порядке
            System.out.println("Массив в обратном порядке:");
            for (String element : array) {
                System.out.println(element);
            }
        } catch (Exception e) {
            System.err.println("Произошла ошибка: " + e.getMessage());
        }
    }
}
