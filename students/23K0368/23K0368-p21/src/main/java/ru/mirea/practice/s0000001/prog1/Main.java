package ru.mirea.practice.s0000001.prog1;

import java.util.Arrays;
import java.util.List;

public abstract class Main {
    public static List<String> convertArrayToList(String[] array) {
        return Arrays.asList(array);
    }

    // Метод для конвертации массива чисел в список
    public static List<Integer> convertArrayToList(Integer[] array) {
        return Arrays.asList(array);
    }

    public static void main(String[] args) {
        String[] stringArray = {"apple", "banana", "cherry"};
        Integer[] intArray = {1, 2, 3, 4, 5};

        List<String> stringList = convertArrayToList(stringArray);
        List<Integer> intList = convertArrayToList(intArray);

        System.out.println("Список строк: " + stringList);
        System.out.println("Список чисел: " + intList);
    }
}
