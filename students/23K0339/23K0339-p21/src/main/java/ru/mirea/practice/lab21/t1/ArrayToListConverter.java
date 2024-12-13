package ru.mirea.practice.lab21.t1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

abstract class ArrayToListConverter {
    public static <T> List<T> arrayToList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}
