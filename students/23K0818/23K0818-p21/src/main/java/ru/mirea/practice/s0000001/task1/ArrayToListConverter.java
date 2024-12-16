package ru.mirea.practice.s0000001.task1;

import java.util.Arrays;
import java.util.List;

public abstract class ArrayToListConverter {


    public static List<String> convertStringArrayToList(String[] array) {
        return Arrays.asList(array);
    }


    public static List<Integer> convertIntegerArrayToList(Integer[] array) {
        return Arrays.asList(array);
    }

    public static void main(String[] args) {

        String[] stringArray = {"apple", "banana", "cherry"};
        List<String> stringList = convertStringArrayToList(stringArray);
        System.out.println("Список строк: " + stringList);


        Integer[] integerArray = {1, 2, 3, 4, 5};
        List<Integer> integerList = convertIntegerArrayToList(integerArray);
        System.out.println("Список чисел: " + integerList);
    }
}
