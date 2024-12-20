package ru.mirea.practice.s0000001;

import java.util.Arrays;
import java.util.List;

abstract class Main1 {
    public static <T> List<T> convertArrayToList(T[] array) {
        return Arrays.asList(array);
    }

    public static void main(String[] args) {
        String[] stringArray = {"one", "two", "three"};
        Integer[] intArray = {1, 2, 3};

        List<String> stringList = convertArrayToList(stringArray);
        List<Integer> intList = convertArrayToList(intArray);

        System.out.println(stringList);
        System.out.println(intList);
    }
}
