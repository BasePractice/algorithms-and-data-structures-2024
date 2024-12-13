package ru.mirea.practice.s0000001.num1;

import java.util.Stack;

public final class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        invertArray(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void invertArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int num : arr) {
            stack.push(num);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }

        System.out.println("Массив после инверсии:");
    }

    private Main() {
        throw new UnsupportedOperationException("Этот класс не предназначен для создания экземпляров");
    }
}

