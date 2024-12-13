package ru.mirea.practice.s23k0130.task1;

import java.util.Stack;

public abstract class Main {
    public static void main(String[] args) {
        int[] array = {0, 1, 0, 2, 0, 6};
        System.out.print("Начальный массив: ");
        printArray(array);
        invertArray(array);
        System.out.print("Инвертированный массив: ");
        printArray(array);
    }

    public static void invertArray(int[] array) {
        Stack<Integer> stack = new Stack<>();
        for (int value : array) {
            stack.push(value);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value);
        }
        System.out.println();
    }
}
