package ru.mirea.practice.s23k0087.task1;

import java.util.Arrays;
import java.util.List;

public abstract class ArrayToList {

    public static <E> List<E> convertArrayToList(E[] array) {
        return Arrays.asList(array);
    }

    public static void main(String[] args) {
        String[] arrayStr = {"Прибыл", "Сатору", "Годжо"};
        List<String> listStr = convertArrayToList(arrayStr);
        System.out.println("List String: " + listStr);

        Integer[] arrayInt = {2, 0, 3, 1};
        List<Integer> listInt = convertArrayToList(arrayInt);
        System.out.println("List Integer: " + listInt);
    }
}
