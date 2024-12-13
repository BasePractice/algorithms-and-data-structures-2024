package ru.mirea.practice.s0000001;

import java.util.Stack;

public abstract class First {
    public static int[] reverse(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i : arr) {
            stack.push(i);
        }
        int[] arr1 = new int[arr.length];
        for (int i = 0;i < arr.length; i++) {
            arr1[i] = stack.pop();
        }
        return arr1;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0;i < 10;i++) {
            arr[i] = i;
        }
        int[] arr1 = reverse(arr);
        System.out.println(arr1[0]);
    }
}
