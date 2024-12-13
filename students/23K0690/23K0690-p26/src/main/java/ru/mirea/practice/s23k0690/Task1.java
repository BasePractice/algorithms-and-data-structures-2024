package ru.mirea.practice.s23k0690;

import java.util.Stack;

public final class Task1 {

    private Task1() {}

    public static int[] invertArray(int[] array) {
        Stack<Integer> stack = new Stack<>();

        for (int num : array) {
            stack.push(num);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }

        return array;
    }

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        System.out.println("Исходный массив:");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }

        int[] invertedArray = invertArray(originalArray);
        System.out.println("\nИнвертированный массив:");
        for (int num : invertedArray) {
            System.out.print(num + " ");
        }
    }
}
