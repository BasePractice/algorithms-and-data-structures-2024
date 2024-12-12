package ru.mirea.practice.lab21.t1;

import java.util.List;


abstract class ConverterTest {
    public static void main(String[] args) {
        String[] stringArray = {"три", "два", "раз"};
        List<String> stringList = ArrayToListConverter.arrayToList(stringArray);
        System.out.println("Список строк: " + stringList);

        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = ArrayToListConverter.arrayToList(intArray);
        System.out.println("Список чисел: " + intList);
    }
}
