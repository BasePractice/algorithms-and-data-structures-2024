package ru.mirea.practice.s0000001.task2;

import java.util.ArrayList;
import java.util.List;

// Интерфейс Filter


// Класс с методом filter
public abstract class FilterExample {

    public static Object[] filter(Object[] array, Filter filter) {
        List<Object> resultList = new ArrayList<>();

        for (Object o : array) {
            if (filter.apply(o)) {
                resultList.add(o);
            }
        }

        return resultList.toArray();
    }

    public static void main(String[] args) {
        // Пример: фильтрация строк
        String[] strings = {"apple", "banana", "cherry", "date", "elderberry"};

        // Фильтр для выбора строк, длина которых больше 5
        Filter longStringFilter = new Filter() {
            @Override
            public boolean apply(Object o) {
                if (o instanceof String) {
                    return ((String) o).length() > 5;
                }
                return false;
            }
        };

        Object[] filteredStrings = filter(strings, longStringFilter);
        System.out.println("Отфильтрованные строки: ");
        for (Object s : filteredStrings) {
            System.out.println(s);
        }

        // Пример: фильтрация чисел
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Фильтр для выбора четных чисел
        Filter evenNumberFilter = new Filter() {
            @Override
            public boolean apply(Object o) {
                if (o instanceof Integer) {
                    return ((Integer) o) % 2 == 0;
                }
                return false;
            }
        };

        Object[] filteredNumbers = filter(numbers, evenNumberFilter);
        System.out.println("Отфильтрованные числа: ");
        for (Object n : filteredNumbers) {
            System.out.println(n);
        }
    }
}