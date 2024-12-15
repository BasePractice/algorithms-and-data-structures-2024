package ru.mirea.practice.s23k0089.task1;

import java.util.ArrayList;
import java.util.List;

public abstract class Main {
    public static <T> List<T>  arrToList(T[] array) {
        List<T> list = new ArrayList<>(array.length);
        for (T element : array) {
            list.add(element);
        }
        return list;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        List<Integer> list = arrToList(arr);
        System.out.println(list);

        String[] arr1 = {"one", "two", "three", "banana"};
        List<String> list1 = arrToList(arr1);
        System.out.println(list1);
    }
}

