package ru.mirea.practice.s0000001.task1;

import java.util.Scanner;
import java.util.Stack;

public abstract class ArrayInverter {

    public static void invertArray(int[] array) {
        Stack<Integer> stack = new Stack<>();

        for (int element : array) {
            stack.push(element);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();
            int[] array = new int[size];

            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            System.out.println("Исходный массив:");
            for (int element : array) {
                System.out.print(element + " ");
            }

            invertArray(array);

            System.out.println("\nИнвертированный массив:");
            for (int element : array) {
                System.out.print(element + " ");
            }
        }
    }
}

