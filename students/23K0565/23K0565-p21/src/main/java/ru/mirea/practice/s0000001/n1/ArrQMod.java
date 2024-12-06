package ru.mirea.practice.s0000001.n1;

import java.util.ArrayList;
import java.util.List;

public final class ArrQMod {
    private ArrQMod() {
    }

    public static <T> List<T> convertToList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }
}
