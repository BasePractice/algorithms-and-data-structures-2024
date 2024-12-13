package ru.mirea.practice.s23k0350.task2;


import ru.mirea.practice.s23k0350.task1.AnyArray;

public class AnyArrayElecBug<T> extends AnyArray<T> {
    public T returnElement(int index) {
        return array.get(index);
    }
}
