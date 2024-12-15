package ru.mirea.practice.s23k0093;

import java.util.Stack;

public final class ArrayInverter {
    private ArrayInverter() {

    }

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

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Исходный массив:");
        printArray(array);
        invertArray(array);
        System.out.println("Инвертированный массив:");
        printArray(array);
    }
}
