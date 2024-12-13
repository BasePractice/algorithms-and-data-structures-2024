package ru.mirea.practice.s23k0130.task1;

import java.util.ArrayList;
import java.util.List;

public abstract class Main {
    public static <T> List<T>  arrayToArrayList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }

    public static void main(String[] args) {
        Integer[] arrayInt = {0, 1, 0, 2, 0, 6};
        List<Integer> listInt = arrayToArrayList(arrayInt);
        System.out.println(listInt);

        String[] arrayStr = {"square", "triangle", "rectangle", "circle"};
        List<String> listStr = arrayToArrayList(arrayStr);
        System.out.println(listStr);

    }
}
