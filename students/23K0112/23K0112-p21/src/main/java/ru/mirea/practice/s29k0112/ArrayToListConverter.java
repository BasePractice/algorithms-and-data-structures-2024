package ru.mirea.practice.s29k0112;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class ArrayToListConverter {
    public static <E> List<E> convertArrayToList(E[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}
