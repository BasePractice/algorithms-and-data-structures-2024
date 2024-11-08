package ru.mirea.practice.s0000001.task8;

import java.util.ArrayList;
import java.util.List;

public abstract class MyFilter {
    public static <T> List<T> filter(T[] array, Filter filter) {
        List<T> result = new ArrayList<>();
        for (T element : array) {
            if (filter.apply(element)) {
                result.add(element);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"qwerty", "asd", "zxc", "qwertyuiop", "qazwsxedc"};
        List<String> longWords = filter(words, new Filter() {
            @Override
            public boolean apply(Object o) {
                return ((String) o).length() > 5;
            }
        });
        System.out.println("words more than 5 letters:\t" + longWords);

        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> evenNumbers = filter(numbers, new Filter() {
            @Override
            public boolean apply(Object o) {
                return ((Integer) o) % 2 == 0;
            }
        });
        System.out.println("odd nums:\t" + evenNumbers);
    }
}
