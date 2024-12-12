package ru.mirea.practice.s0000001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Ex1 {

    private Ex1() {
        // 123
    }

    public static <T> List<T> convertArrayToList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    public static void main(String[] args) {

        String[] stringArray = {"Один", "Два", "Три"};
        Integer[] intArray = {1, 2, 3};

        List<String> stringList = convertArrayToList(stringArray);
        List<Integer> intList = convertArrayToList(intArray);

        System.out.println("String List: " + stringList);
        System.out.println("Integer List: " + intList);
    }
}
