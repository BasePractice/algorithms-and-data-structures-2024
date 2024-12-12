package ru.mirea.practice.s23k0145.lab1;

import java.util.Stack;

public abstract class ArrayReverser {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Исходный массив: ");
        displayArray(numbers);

        reverseArray(numbers);

        System.out.print("Перевернутый массив: ");
        displayArray(numbers);
    }

    public static void reverseArray(int[] numbers) {
        Stack<Integer> stack = new Stack<>();

        for (int num : numbers) {
            stack.push(num);
        }

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = stack.pop();
        }
    }

    public static void displayArray(int[] numbers) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

