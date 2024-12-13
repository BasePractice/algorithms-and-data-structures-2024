package ru.mirea.practice.s0000001.task1;


import java.util.Arrays;
import java.util.Stack;

public abstract class IteratingStack {
    public static void main(String[] args) {
        int[] a = new int[13];
        for (int i = 0; i < 13; i++) {
            a[i] = i;
        }
        System.out.println(Arrays.toString(a));
        Stack<Integer> stk = new Stack<>();
        for (int q = 0; q < a.length / 2; q++) {
            stk.add(a[q]);
            a[q] = a[a.length - (q + 1)];
            a[a.length - (q + 1)] = stk.pop();
        }
        System.out.println(Arrays.toString(a));
    }
}
