package ru.mirea.practice.s0000001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Написать метод для конвертации массива строк/чисел в
 * список.
 */

public abstract class Task1 {
    public static <E> List<E> arrToL(E[] arr) {
        return new ArrayList<E>(Arrays.asList(arr));
    }

    public static void main(String[] args) {
        Integer[] ex = new Integer[]{1, 3, 5, 7, 2, 6, 8, 19};
        System.out.println("Example " + ex.getClass() + ": " + Arrays.toString(ex));
        List<Integer> list = arrToL(ex);
        System.out.println("Example " + list.getClass() + ": " + list);
    }
}
