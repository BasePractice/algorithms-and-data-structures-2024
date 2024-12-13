package mirea.lab26.p1;

import java.util.Arrays;
import java.util.Stack;

public abstract class Prac26p1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(invArray(a));
    }

    public static String invArray(int[] a) {
        Stack<Integer> stack = new Stack<Integer>();

        for (int i : a) {
            stack.push(i);
        }

        for (int i = 0; i < a.length; i++) {
            a[i] = stack.pop();
        }
        return Arrays.toString(a);
    }
}
