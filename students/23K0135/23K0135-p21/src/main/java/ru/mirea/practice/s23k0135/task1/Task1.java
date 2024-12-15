package ru.mirea.practice.s23k0135.task1;

import java.util.ArrayList;
import java.util.List;

public abstract class Task1 {
    public static <E> List<E> convertArrayToList(E[] elements) {
        List<E> resultList = new ArrayList<>(elements.length);
        for (E element : elements) {
            resultList.add(element);
        }
        return resultList;
    }
}
