package ru.mirea.practice.s23k0116.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class ArrayToListConverter {

    // Метод для конвертации массива в список
    public static <T> List<T> convertArrayToList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    public static void main(String[] args) {
        // Пример для строк
        String[] stringArray = {"apple", "banana", "cherry"};
        List<String> stringList = convertArrayToList(stringArray);
        System.out.println("Список строк: " + stringList);

        // Пример для чисел
        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = convertArrayToList(intArray);
        System.out.println("Список чисел: " + intList);
    }
}
