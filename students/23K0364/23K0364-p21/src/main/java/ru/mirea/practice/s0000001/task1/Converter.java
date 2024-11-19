package ru.mirea.practice.s0000001.task1;

import java.util.Arrays;
import java.util.List;

public abstract class Converter {
    public static <T> List<T> convertArrayToList(T[] array) {
        return Arrays.asList(array);
    }

    public static void main(String[] args) {
        String[] stringArray = {"a", "b", "c"};
        List<String> stringList = convertArrayToList(stringArray);
        System.out.println("Список строк: " + stringList);

        Integer[] intArray = {1, 2, 3};
        List<Integer> intList = convertArrayToList(intArray);
        System.out.println("Список чисел: " + intList);
    }
}
