package ru.mirea.practice.s23k0164.t1;

import java.util.ArrayList;
import java.util.List;

public final class First {
    private First() {
    }

    public static <T> List<T> convertArrayToList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }

    public static void main(String[] args) {
        String[] stringArray = {"A", "B", "C"};
        List<String> stringList = convertArrayToList(stringArray);
        System.out.println(stringList);

        Integer[] intArray = {1, 2, 3};
        List<Integer> intList = convertArrayToList(intArray);
        System.out.println(intList);
    }
}

