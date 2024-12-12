package ru.mirea.practice.s23k0140.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Main {

    public static <T> List<T> arrayToList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    public static void main(String[] args) {
        String[] stringArray = {"Apple", "Banana", "Cherry"};
        List<String> stringList = arrayToList(stringArray);
        System.out.println("String list: " + stringList);

        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = arrayToList(intArray);
        System.out.println("Integer list: " + intList);
    }
}