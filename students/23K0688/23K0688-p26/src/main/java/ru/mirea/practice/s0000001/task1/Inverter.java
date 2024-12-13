package ru.mirea.practice.s0000001.task1;

import java.util.Stack;

public abstract class Inverter {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Stack<Integer> stack = new Stack<>();
        System.out.println("Start:");
        for (int num : array) {
            stack.push(num);
            System.out.print(num);
        }
        System.out.println("");
        System.out.println("End:");
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
            System.out.print(array[i]);
        }
    }
}
