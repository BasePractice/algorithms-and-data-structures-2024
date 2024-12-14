package ru.mirea.practice.s23k0755.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Converter {

    public static <T> List<T> arrayToList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    public static void main(String[] args) {
        String[] stringArray = {"Петя", "Вася", "Федя"};
        List<String> stringList = arrayToList(stringArray);
        System.out.println("String list: " + stringList);

        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = arrayToList(intArray);
        System.out.println("Integer list: " + intList);
    }
}

