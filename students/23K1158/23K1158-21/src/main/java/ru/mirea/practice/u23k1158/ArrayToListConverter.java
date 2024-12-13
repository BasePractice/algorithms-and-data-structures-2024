package ru.mirea.practice.u23k1158;

import java.util.ArrayList;
import java.util.List;

public abstract class ArrayToListConverter {
    public static <T> List<T> convertArrayToList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }
}
