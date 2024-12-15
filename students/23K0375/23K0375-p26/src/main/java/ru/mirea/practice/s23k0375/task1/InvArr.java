package ru.mirea.practice.s23k0375.task1;

import java.util.Stack;

public final class InvArr {

    private InvArr() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void invertArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int num : arr) {
            stack.push(num);
        }

        int i = 0;
        for (; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] array = {11, 23, 36, 42, 58, 68, 75, 87, 99};

        System.out.println("Исходный массив:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        invertArray(array);

        System.out.println("Инвертированный массив:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
