package ru.mirea.practice.s00000021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ArrayConverter { // final - класс не может быть унаследован

    // Приватный конструктор предотвращает создание экземпляров класса
    private ArrayConverter() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static <T> List<T> convertArrayToList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4};
        String[] strings = {"a", "b", "c"};

        List<Integer> numberList = convertArrayToList(numbers);
        List<String> stringList = convertArrayToList(strings);

        System.out.println("Список чисел: " + numberList);
        System.out.println("Список строк: " + stringList);
    }
}
