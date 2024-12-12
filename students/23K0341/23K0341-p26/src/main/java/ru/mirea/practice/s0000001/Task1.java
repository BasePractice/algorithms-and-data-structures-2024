package ru.mirea.practice.s0000001;

import java.util.Arrays;
import java.util.Stack;

/**
 * Реализуйте метод, следующим образом: исходный массив необходимо инвертировать,
 * последовательно меняя местами 1 и последний элемент, 2 и предпоследний и так далее,
 * для работы необходимо использовать контейнер Stack.
 */

public abstract class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(invert(arr)));
    }

    public static int[] invert(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[arr.length];

        for (int j : arr) {
            stack.push(j);
        }

        for (int i = 0; i < arr.length; i++) {
            res[i] = stack.pop();
        }

        return res;
    }
}
