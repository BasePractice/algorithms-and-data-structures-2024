package ru.mirea.practice.s23k0120.task1;

import java.util.ArrayList;
import java.util.List;

public abstract class Main {
    public static <T> List<T>  arrToList(T[] array) {
        List<T> list = new ArrayList<>(array.length);
        for (T e : array) {
            list.add(e);
        }
        return list;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        List<Integer> list = arrToList(arr);
        System.out.println(list);

        Integer[] arr1 = new Integer[10];
    }
}
