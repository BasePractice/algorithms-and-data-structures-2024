package ru.mirea.practice.s230k754.lab11.task1;

import java.util.Stack;

public final class Task1 {
    private Task1() {}

    public static int[] reverse(int[] arr) {
        Stack stack = new Stack();
        for (int j : arr) {
            stack.push(j);
        }

        int k = 0;
        while (!stack.isEmpty()) {
            arr[k++] = (int) stack.pop();
        }

        return arr;
    }

}
