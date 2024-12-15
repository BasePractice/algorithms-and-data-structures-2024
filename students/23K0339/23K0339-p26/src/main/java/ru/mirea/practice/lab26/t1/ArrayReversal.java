package ru.mirea.practice.lab26.t1;

import java.util.Stack;

public abstract class ArrayReversal {

    public static void invertArray(int[] array) {
        Stack<Integer> stack = new Stack<>();

        for (int j : array) {
            stack.push(j);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        invertArray(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

