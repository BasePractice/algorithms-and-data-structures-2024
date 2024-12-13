package ru.mirea.practice.s0000001.n1;

import java.util.Stack;

public final class InvertArray {
    private InvertArray() {
    }

    public static int[] invert(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int num : arr) {
            stack.push(num);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        data = invert(data);
        for (int num : data) {
            System.out.print(num + " ");
        }
    }
}
//Upd
