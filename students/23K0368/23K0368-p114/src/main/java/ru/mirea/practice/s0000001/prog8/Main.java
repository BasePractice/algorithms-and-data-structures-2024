package ru.mirea.practice.s0000001.prog8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Main {

    public static <T> T[] filter(T[] array, Filter<T> filter) {
        List<T> filteredList = new ArrayList<>();
        for (T element : array) {
            if (filter.apply(element)) {
                filteredList.add(element);
            }
        }
        return filteredList.toArray(Arrays.copyOf(array, filteredList.size()));
    }

    public static void main(String[] args) {
        // Проверка на строках
        String[] strings = {"apple", "banana", "cherry", "orange", "apple", "banana"};
        Filter<String> stringFilter = s -> s.startsWith("a");
        String[] filteredStrings = filter(strings, stringFilter);
        System.out.println("Отфильтрованные строки: " + Arrays.toString(filteredStrings));

        // Проверка на целых числах
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Filter<Integer> numberFilter = n -> n % 2 == 0;
        Integer[] filteredNumbers = filter(numbers, numberFilter);
        System.out.println("Отфильтрованные числа: " + Arrays.toString(filteredNumbers));
    }
}
