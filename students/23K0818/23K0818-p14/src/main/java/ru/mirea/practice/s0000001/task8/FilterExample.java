package ru.mirea.practice.s0000001.task8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public abstract class FilterExample {

    // Метод filter, который принимает массив и реализацию интерфейса Filter
    public static <T> T[] filter(T[] array, Filter filter) {
        List<T> resultList = new ArrayList<>();
        for (T item : array) {
            if (filter.apply(item)) {
                resultList.add(item);
            }
        }
        // Преобразуем список обратно в массив правильного типа
        @SuppressWarnings("unchecked")
        T[] resultArray = (T[]) Array.newInstance(array.getClass().getComponentType(), resultList.size());
        resultArray = resultList.toArray(resultArray);
        return resultArray;
    }

    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "cherry", "date", "elderberry"};

        // Фильтр для строк, который оставляет только строки, начинающиеся с буквы 'a'
        Filter stringFilter = new Filter() {
            @Override
            public boolean apply(Object o) {
                if (o instanceof String) {
                    String s = (String) o;
                    return s.startsWith("a");
                }
                return false;
            }
        };

        String[] filteredStrings = filter(strings, stringFilter);
        System.out.println("Filtered strings: " + java.util.Arrays.toString(filteredStrings));

        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Фильтр для чисел, который оставляет только четные числа
        Filter numberFilter = new Filter() {
            @Override
            public boolean apply(Object o) {
                if (o instanceof Integer) {
                    Integer i = (Integer) o;
                    return i % 2 == 0;
                }
                return false;
            }
        };

        Integer[] filteredNumbers = filter(numbers, numberFilter);
        System.out.println("Filtered numbers: " + java.util.Arrays.toString(filteredNumbers));
    }
}
