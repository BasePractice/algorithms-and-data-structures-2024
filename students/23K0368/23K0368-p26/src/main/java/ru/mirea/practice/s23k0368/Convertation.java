package ru.mirea.practice.s23k0368;

import java.util.Stack;

public abstract class Convertation {
    public static void invertArray(int[] array) {
        Stack<Integer> stack = new Stack<>();

        System.out.println("Исходный массив:");
        for (int num : array) {
            System.out.print(stack.push(num) + " ");
        }

        System.out.println();
        System.out.println("Инвертированный массив:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        invertArray(array);
    }
}
