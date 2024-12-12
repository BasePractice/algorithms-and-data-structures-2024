package ru.mirea.practice.s0000001;

import java.util.Stack;

public final class Ex1 {

    private Ex1() {
        // Очень скоро ...
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
