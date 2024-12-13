package ru.mirea.practice.s0000001;

import java.util.Stack;

public abstract class Task1 {
    public static void reverseArray(int[] array) {
        Stack<Integer> stack = new Stack<>();
        for (int num : array) {
            stack.push(num);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        reverseArray(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
