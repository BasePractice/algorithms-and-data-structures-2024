package ru.mirea.practice.s23k0623.prog2;

import java.util.Arrays;

public class AllType {
    private final Object[] array;

    public AllType(Object[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
