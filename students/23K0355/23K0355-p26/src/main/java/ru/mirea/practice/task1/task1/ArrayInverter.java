package ru.mirea.practice.task1.task1;

import java.util.Stack;

public final class ArrayInverter {

    private ArrayInverter() {
        throw new UnsupportedOperationException("Утилитный класс не должен быть создан");
    }

    public static void invertArray(int[] arr) {
        Stack<Integer> st = new Stack<>();

        for (int n : arr) {
            st.push(n);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = st.pop();
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Исходный массив:");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();

        invertArray(arr);

        System.out.println("Инвертированный массив:");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
