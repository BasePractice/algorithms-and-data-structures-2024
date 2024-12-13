package ru.mirea.practice.s23k0350;

import java.util.Stack;

abstract class ArrayInverter {
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


}
