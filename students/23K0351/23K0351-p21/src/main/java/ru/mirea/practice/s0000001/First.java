package ru.mirea.practice.s0000001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class First {
    public static List<Object> convertArrayToList(Object[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    public static void main(String[] args) {
        String[] stringArray = {"one", "two", "three"};
        Integer[] intArray = {1, 2, 3};

        List<Object> stringList = convertArrayToList(stringArray);
        List<Object> intList = convertArrayToList(intArray);

        System.out.println("String List: " + stringList);
        System.out.println("Integer List: " + intList);
    }
}
