package ru.mirea.practice.s0000001;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * Преобразовать структуру данных HashSet в структуру TreeSet
 */

public abstract class Task1 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            hashSet.add("Numba " + i);
        }

        System.out.println(hashSet);
        System.out.println(new TreeSet<String>(hashSet));
    }
}
