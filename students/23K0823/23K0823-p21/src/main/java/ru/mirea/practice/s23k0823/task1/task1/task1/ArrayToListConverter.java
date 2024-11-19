package ru.mirea.practice.s23k0823.task1.task1.task1;

import java.util.ArrayList;
import java.util.List;

public abstract class ArrayToListConverter {
    public static <E> List<E> convertArrayToList(E[] array) {
        List<E> list = new ArrayList<>();
        for (E element : array) {
            list.add(element);
        }
        return list;
    }

    public static void main(String[] args) {
        String[] stringArray = {"apple", "banana", "cherry"};
        List<String> stringList = convertArrayToList(stringArray);
        System.out.println("Список строк: " + stringList);

        Integer[] integerArray = {1, 2, 3, 4, 5};
        List<Integer> integerList = convertArrayToList(integerArray);
        System.out.println("Список чисел: " + integerList);
    }
}
