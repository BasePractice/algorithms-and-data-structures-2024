package ru.mirea.practice.s0000001;

import java.util.Stack;

public final class ArrayInvert {
    private ArrayInvert() {

    }

    public static void reverseArray(int[] array) {
        Stack<Integer> stack = new Stack<>();

        for (int num : array) {
            stack.push(num);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }
}
