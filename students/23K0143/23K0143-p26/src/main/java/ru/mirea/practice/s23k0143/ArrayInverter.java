package ru.mirea.practice.s23k0143;

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
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Исходный массив:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        invertArray(array);

        System.out.println("\nИнвертированный массив:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
