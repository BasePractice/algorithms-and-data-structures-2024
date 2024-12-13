package ru.mirea.practice.s23k0155.task1;

import java.util.Arrays;
import java.util.Stack;

abstract class Main {

    public static void reverseArray(int[] array) {
        Stack<Integer> stack = new Stack<>();
        for (int element : array) {
            stack.push(element);
        }
        for (int ind = 0; ind < array.length; ind++) {
            array[ind] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(array));
        reverseArray(array);
        System.out.println(Arrays.toString(array));

    }
}
