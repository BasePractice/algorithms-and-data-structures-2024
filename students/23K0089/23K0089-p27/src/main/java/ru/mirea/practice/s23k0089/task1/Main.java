package ru.mirea.practice.s23k0089.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public abstract class Main {
    public static <E> List<E> reverse(List<E> list) {
        Stack<E> stack = new Stack<>();

        int i = 0;
        while (i < list.size() / 2) {
            stack.push(list.get(i));
            stack.push(list.get(list.size() - i - 1));
            list.set(i, stack.pop());
            list.set(list.size() - i - 1, stack.pop());
            i++;
        }

        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(List.of(new Integer[]{1, 2, 3, 4, 5}));
        System.out.println(integers);
        reverse(integers);
        System.out.println(integers);
    }
}
