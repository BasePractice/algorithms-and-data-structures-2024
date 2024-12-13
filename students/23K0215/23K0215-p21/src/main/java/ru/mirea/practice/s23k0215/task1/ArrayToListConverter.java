package ru.mirea.practice.s23k0215.task1;

import java.util.ArrayList;
import java.util.List;

public abstract class ArrayToListConverter {

    // Метод для конвертации массива строк в список
    public static List<String> convertStringArrayToList(String[] array) {
        List<String> list = new ArrayList<>();
        for (String element : array) {
            list.add(element);
        }
        return list;
    }

    // Метод для конвертации массива чисел в список
    public static List<Integer> convertIntegerArrayToList(Integer[] array) {
        List<Integer> list = new ArrayList<>();
        for (Integer element : array) {
            list.add(element);
        }
        return list;
    }

    public static void main(String[] args) {
        // Пример использования метода для строк
        String[] stringArray = {"apple", "banana", "cherry"};
        List<String> stringList = convertStringArrayToList(stringArray);
        System.out.println("Список строк: " + stringList);

        // Пример использования метода для чисел
        Integer[] integerArray = {1, 2, 3, 4, 5};
        List<Integer> integerList = convertIntegerArrayToList(integerArray);
        System.out.println("Список чисел: " + integerList);
    }
}
