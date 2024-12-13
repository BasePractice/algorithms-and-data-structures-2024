package ru.mirea.practice.s23k0350.task1;

import java.util.ArrayList;
import java.util.List;

public class AnyArray<T> {
    public List<T> array;

    public AnyArray() {
        this.array = new ArrayList<>();
    }

    public void add(T item) {
        array.add(item);
    }


    public void printElements() {
        for (T item: array) {
            System.out.println(item.toString());
        }
    }

}